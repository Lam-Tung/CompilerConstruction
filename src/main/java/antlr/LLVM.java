package antlr;
/*
###################################################################################################################
This is the LLVM Fibocci Tutorial we followed to learn how to use multiple functions from the API
###################################################################################################################
 */
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.Pointer;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.*;

import static org.bytedeco.llvm.global.LLVM.*;

public class LLVM {
    // a 'char *' used to retrieve error messages from LLVM
    private static final BytePointer error = new BytePointer();

    public static void main(String[] args) {
        // Stage 1: Initialize LLVM components
        LLVMInitializeCore(LLVMGetGlobalPassRegistry());
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeTarget();

        // Stage 2: Build the factorial function.
        LLVMContextRef context = LLVMContextCreate();
        LLVMModuleRef module = LLVMModuleCreateWithNameInContext("factorial", context);
        LLVMBuilderRef builder = LLVMCreateBuilderInContext(context);
        LLVMTypeRef i32Type = LLVMInt32TypeInContext(context);
        LLVMTypeRef factorialType = LLVMFunctionType(i32Type, i32Type, /* argumentCount */ 1, /* isVariadic */ 0);
       // LLVMTypeRef tvoid = LLVMVoidTypeInContext(context);
       // LLVMTypeRef factype = LLVMFunctionType(tvoid,tvoid,0,0);
       // LLVMValueRef factorial = LLVMAddFunction(module, "fac", factype);
        LLVMValueRef factorial = LLVMAddFunction(module, "fac", factorialType);
        LLVMSetFunctionCallConv(factorial, LLVMCCallConv);

        LLVMValueRef n = LLVMGetParam(factorial, /* parameterIndex */0);
        LLVMValueRef zero = LLVMConstInt(i32Type, 0, /* signExtend */ 0);
        LLVMValueRef one = LLVMConstInt(i32Type, 1, /* signExtend */ 0);
        //LLVMValueRef n1 = LLVMGetParam(null, /* parameterIndex */0);
        //LLVMValueRef zero1 = LLVMConstInt(LLVMVoidType(), 0, /* signExtend */ 0);
        //LLVMValueRef nMinusOne = LLVMBuildSub(builder, n1, zero1, "nMinusOne = n - 1"); type mismatch
        LLVMBasicBlockRef entry = LLVMAppendBasicBlockInContext(context, factorial, "entry");
        LLVMBasicBlockRef ifFalse = LLVMAppendBasicBlockInContext(context, factorial, "if_false");
        LLVMBasicBlockRef exit = LLVMAppendBasicBlockInContext(context, factorial, "exit");

        LLVMPositionBuilderAtEnd(builder, entry);
        LLVMValueRef condition = LLVMBuildICmp(builder, LLVMIntEQ, n, zero, "condition = n == 0");
        LLVMBuildCondBr(builder, condition, exit, ifFalse);

        LLVMPositionBuilderAtEnd(builder, ifFalse);
        LLVMValueRef nMinusOne = LLVMBuildSub(builder, n, one, "nMinusOne = n - 1");
        PointerPointer<Pointer> arguments = new PointerPointer<>(1)
                .put(0, nMinusOne);
        LLVMValueRef factorialResult = LLVMBuildCall(builder, factorial, arguments, 1, "factorialResult = factorial(nMinusOne)");
        LLVMValueRef resultIfFalse = LLVMBuildMul(builder, n, factorialResult, "resultIfFalse = n * factorialResult");
        LLVMBuildBr(builder, exit);

        LLVMPositionBuilderAtEnd(builder, exit);
        LLVMValueRef phi = LLVMBuildPhi(builder, i32Type, "result");
        PointerPointer<Pointer> phiValues = new PointerPointer<>(2)
                .put(0, one)
                .put(1, resultIfFalse);
        PointerPointer<Pointer> phiBlocks = new PointerPointer<>(2)
                .put(0, entry)
                .put(1, ifFalse);
        LLVMAddIncoming(phi, phiValues, phiBlocks, /* pairCount */ 2);
        LLVMBuildRet(builder, phi);

        // Stage 3: Verify the module using LLVMVerifier
        if (LLVMVerifyModule(module, LLVMPrintMessageAction, error) != 0) {
            LLVMDisposeMessage(error);
            return;
        }

        // Stage 4: Create a pass pipeline using the legacy pass manager
        LLVMPassManagerRef pm = LLVMCreatePassManager();
        LLVMAddAggressiveInstCombinerPass(pm);
        LLVMAddNewGVNPass(pm);
        LLVMAddCFGSimplificationPass(pm);
        LLVMRunPassManager(pm, module);
        LLVMDumpModule(module);

        // Stage 5: Execute the code using MCJIT
        LLVMExecutionEngineRef engine = new LLVMExecutionEngineRef();
        LLVMMCJITCompilerOptions options = new LLVMMCJITCompilerOptions();
        if (LLVMCreateMCJITCompilerForModule(engine, module, options, 3, error) != 0) {
            System.err.println("Failed to create JIT compiler: " + error.getString());
            LLVMDisposeMessage(error);
            return;
        }

        LLVMGenericValueRef argument = LLVMCreateGenericValueOfInt(i32Type, 10, /* signExtend */ 0);
        LLVMGenericValueRef result = LLVMRunFunction(engine, factorial, /* argumentCount */ 1, argument);
        System.out.println();
        System.out.println("; Running factorial(10) with MCJIT...");
        System.out.println("; Result: " + LLVMGenericValueToInt(result, /* signExtend */ 0));

        // Stage 6: Dispose of the allocated resources
        LLVMDisposeExecutionEngine(engine);
        LLVMDisposePassManager(pm);
        LLVMDisposeBuilder(builder);
        LLVMContextDispose(context);
    }
}
