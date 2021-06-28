package antlr;


import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.llvm.LLVM.*;


import java.io.IOException;

import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.LLVMInt32TypeInContext;

public class Antlr_Parser {
    public static void main(String[] args) throws IOException{
        //test_file("src/main/java/antlr/test/VarDeclaration.go");
        //test_file("src/main/java/antlr/test/fail/duplicate_function.go");
        //test_file("src/main/java/antlr/test/fail/duplicate_var.go");
        //test_file("src/main/java/antlr/test/fail/undeclared_var_1.go");
        //test_file("src/main/java/antlr/test/fail/undeclared_var_2.go");
        test_file("src/main/java/antlr/test/LLVMVarDecl.go");
    }
    public static void test_file(String filepath)throws IOException{
        final BytePointer error = new BytePointer();
        //lexer requires a charstream
        CharStream chars = CharStreams.fromFileName(filepath);
        goSubsetLexer go_lexer = new goSubsetLexer(chars);
        //getting the token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(go_lexer);
        //creating a parser
        goSubsetParser go_parser = new goSubsetParser(tokens);
        //generating the parse tree
        ParseTree tree = go_parser.sourceFile();

        // get filename
        String[] file = filepath.split("/");
        String fileName = file[file.length-1];

        //initialising llvm components

        LLVMInitializeCore(LLVMGetGlobalPassRegistry());
        LLVMLinkInMCJIT();
        LLVMInitializeNativeAsmPrinter();
        LLVMInitializeNativeAsmParser();
        LLVMInitializeNativeTarget();


        LLVMContextRef context = LLVMContextCreate();
        LLVMModuleRef module = LLVMModuleCreateWithNameInContext(fileName, context);
        LLVMBuilderRef builder = LLVMCreateBuilderInContext(context);
        LLVMTypeRef int32 = LLVMInt32TypeInContext(context);

        myVisitor visitor = new myVisitor(fileName,context,module,builder,int32);
        visitor.visit(tree);
        //visitor.printSymbolTable();
        System.out.println("File processing ended successfully !!");
        System.out.println();
        /*System.out.println("LLVM IR: ");
        visitor.printIR();*/

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


        System.out.println();
        System.out.println("; Finished Processing ...");


        // Stage 6: Dispose of the allocated resources
        LLVMDisposeExecutionEngine(engine);
        LLVMDisposePassManager(pm);
        LLVMDisposeBuilder(builder);
        LLVMContextDispose(context);
    }
}