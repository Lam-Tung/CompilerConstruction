package antlr;

import antlr.goSubsetBaseVisitor;
import antlr.goSubsetParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class myVisitor extends goSubsetBaseVisitor<Object> {

    HashMap<String,Symbol> symbolTable;
    List<String> llvmIR;
    String fileName;

    myVisitor(String fileName){
        symbolTable = new HashMap<>();
        llvmIR = new LinkedList<>();
        this.fileName = fileName;
        System.out.println("Symbol Table\nName : Type : Scope");
    }
    void addSymbol (Symbol temp_s){
        symbolTable.put(temp_s.getName(),temp_s);
    }
    boolean lookupSymbol(Symbol sym){ // will be modified later on to handle type mismatch
        if(!symbolTable.containsKey(sym.name)) return false; //variable not declared
        if(!symbolTable.get(sym.name).checkType(sym)) return false; //type mismatch
        if(!symbolTable.get(sym.name).checkScope(sym)) return false; //scope mismatch
        return true;
    }
    void printSymbolTable(){
        System.out.println("Symbol Table\nName : Type : Scope");
        for (Symbol s : symbolTable.values()) {
            System.out.println(s.getName()+" : "+s.getType()+" : "+s.getScope());
        }
    }
    @Override public Object visitSourceFile(goSubsetParser.SourceFileContext ctx) {
        /*System.out.println();
        System.out.println("-->Source_File : ");*/
        //System.out.println(ctx.getRuleIndex());
        generateIRSrcFile(ctx);
        return visitChildren(ctx);
    }


    @Override public Object visitPackageDecl(goSubsetParser.PackageDeclContext ctx) {
        /*System.out.println();
        System.out.println("\t-->Package_Dec from "+ctx.start.getLine()+","+ctx.start.getStartIndex()+" to "+ctx.stop.getLine()+","+ctx.stop.getStopIndex()+" :");
        System.out.println("\t\t"+ctx.start+"\n\t\t"+ctx.stop);*/
        return visitChildren(ctx);
    }


    @Override public Object visitMainDecl(goSubsetParser.MainDeclContext ctx) {
        //System.out.println(ctx.parent.invokingState);
        //System.out.println(ctx.invokingState);
        //extracting type ,identifier & scope
        //System.out.println(ctx.getChild(1).getText()+" : "+ctx.getChild(0).getText()+" : "+ctx.parent.invokingState);
        System.out.println(ctx.getChild(1)+" : "+ctx.getChild(0)+" : "+ctx.hashCode() );
        Symbol temp_s = new Symbol(ctx.getChild(1).getText(),ctx.getChild(0).getText(),ctx.parent.hashCode());
        /* useless here since the parser wont accept 2 main token and will treat the second main function as a function declaration
        if(lookupSymbol(temp_s)){
            System.err.println("Declaration Error at line "+ctx.start.getLine()+": main function can't be declared twice !!");
            System.exit(0);
        }*/
        addSymbol(temp_s);
        /*System.out.println();
        System.out.println("\t-->Main_Dec from "+ctx.start.getLine()+","+ctx.start.getStartIndex()+" to "+ctx.stop.getLine()+","+ctx.stop.getStopIndex()+" :");*/
        generateIRMainFunc(ctx);
        return visitChildren(ctx);
    }


    @Override public Object visitFuncDecl(goSubsetParser.FuncDeclContext ctx) {
        //System.out.println(ctx.parent.invokingState);
        //extracting type ,identifier & scope
        //System.out.println(ctx.getChild(1).getText()+" : "+ctx.getChild(0).getText()+" : "+ctx.parent.invokingState);
        System.out.println(ctx.getChild(1)+" : "+ctx.getChild(0)+" : "+ctx.hashCode() );
        Symbol temp_s = new Symbol(ctx.getChild(1).getText(),ctx.getChild(0).getText(),ctx.parent.hashCode());

        if(lookupSymbol(temp_s)){
            System.err.println("Declaration Error at line "+ctx.start.getLine()+": "+ctx.getChild(0)+" \""+ctx.getChild(1)+"\" already declared in this scope !!");
            System.exit(0);
        }

        addSymbol(temp_s);
        /*System.out.println();
        System.out.println("\t-->Function_Dec from "+ctx.start.getLine()+","+ctx.start.getStartIndex()+" to "+ctx.stop.getLine()+","+ctx.stop.getStopIndex()+" :");
        System.out.println("\t\tFunc_Identifier : "+ctx.getChild(1).getText());*/
        generateIRFuncDecl(ctx);
        return visitChildren(ctx);
    }


    @Override public Object visitExpr(goSubsetParser.ExprContext ctx) {

        return visitChildren(ctx);
    }

    @Override public Object visitVarDecl(goSubsetParser.VarDeclContext ctx) {
        //System.out.println(ctx.invokingState);
        System.out.println(ctx.getChild(0).getChild(1)+" : "+ctx.getChild(0).getChild(0)+" : "+ctx.parent.parent.hashCode());

        Symbol temp_s = new Symbol(ctx.getChild(0).getChild(1).getText(),ctx.getChild(0).getChild(0).getText(),ctx.parent.parent.hashCode());
        if(lookupSymbol(temp_s)){
            System.err.println("Declaration Error at line "+ctx.start.getLine()+": "+ctx.getChild(0).getChild(0)+" \""+ctx.getChild(0).getChild(1)+"\" already declared in this scope !!");
            System.exit(0);
        }
        addSymbol(temp_s);
        generateIRVarDeclVar(ctx);
        return visitChildren(ctx);
    }


    @Override public Object visitVarDecl_num(goSubsetParser.VarDecl_numContext ctx) {
        generateIRVarDeclVNum(ctx);
        return visitChildren(ctx);
    }

    @Override public Object visitVarDecl_var(goSubsetParser.VarDecl_varContext ctx) {

        Symbol temp_s = new Symbol(ctx.getChild(3).getText(),"var",ctx.parent.parent.parent.hashCode());
        if(!lookupSymbol(temp_s)){
            System.err.println("Declaration Error at line "+ctx.start.getLine()+": "+ctx.getChild(0)+" \""+ctx.getChild(3)+"\" is undefined in this scope !!");
            System.exit(0);
        }
        return visitChildren(ctx);
    }

    @Override public Object visitVarAssign(goSubsetParser.VarAssignContext ctx) {
        //System.out.println(ctx.invokingState);
        //System.out.println(ctx.getChild(0).getChild(1)+" : "+ctx.getChild(0).getChild(0)+" : "+ctx.parent.parent.hashCode() );

        Symbol temp_s = new Symbol(ctx.getChild(0).getChild(0).getText(),"var",ctx.parent.parent.hashCode());
        if(!lookupSymbol(temp_s)){
            System.err.println("Assignment Error at line "+ctx.start.getLine()+": Trying to assign undefined var \""+ctx.getChild(0).getChild(0)+"\" !!");
            System.exit(0);
        }
        return visitChildren(ctx);
    }

    @Override public Object visitVarAssign_num(goSubsetParser.VarAssign_numContext ctx) {
        //
        return visitChildren(ctx);
    }

    @Override public Object visitVarAssign_var(goSubsetParser.VarAssign_varContext ctx) {

        Symbol temp_s = new Symbol(ctx.getChild(2).getText(),"var",ctx.parent.parent.parent.hashCode());
        if(!lookupSymbol(temp_s)){
            System.err.println("Assignment Error at line "+ctx.start.getLine()+" : var \""+ctx.getChild(2)+"\" is undefined in this scope !!");
            System.exit(0);
        }
        return visitChildren(ctx);
    }

    private void generateIRSrcFile(goSubsetParser.SourceFileContext ctx) {
        llvmIR.add("; ModuleID = '" + fileName + "'");
        llvmIR.add("source_filename = \"" + fileName + "\"");
        llvmIR.add("");
    }

    private void generateIRMainFunc(goSubsetParser.MainDeclContext ctx) {
        llvmIR.add("; Function Attrs: noinline nounwind optnone sspstrong uwtable");
        llvmIR.add("define dso_local void @main() #0 {");
        llvmIR.add("}");
        llvmIR.add("");
    }

    private void generateIRFuncDecl(goSubsetParser.FuncDeclContext ctx) {
        llvmIR.add("; Function Attrs: noinline nounwind optnone sspstrong uwtable");
        llvmIR.add("define dso_local void @" + ctx.getChild(1).getText() + "() #0 {");
        llvmIR.add("}");
        llvmIR.add("");
    }

    private void generateIRVarDeclVar(goSubsetParser.VarDeclContext ctx) {
        llvmIR.add(llvmIR.size()-2, "\t%" + ctx.getChild(0).getChild(1).getText() + " = alloca i32, align 4");
    }

    private void generateIRVarDeclVNum(goSubsetParser.VarDecl_numContext ctx) {
        //llvmIR.add(llvmIR.size()-2, "\t%" + ctx.getChild(0).getChild(1).getText() + " = alloca i32, align 4");
        //llvmIR.add(llvmIR.size()-2, "\tstore i32 " + ctx.getText() + ", i32* %" + ctx.getChild(0).getChild(1).getText() + ", align 4");
    }

    public void printIR() {
        for (int i = 0; i < llvmIR.size(); i++) {
            System.out.println(llvmIR.get(i));
        }
    }
}
