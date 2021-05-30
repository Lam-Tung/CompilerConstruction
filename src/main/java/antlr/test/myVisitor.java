package antlr.test;

import antlr.goSubsetBaseVisitor;
import antlr.goSubsetParser;

public class myVisitor extends goSubsetBaseVisitor<Object> {


    @Override public Object visitSourceFile(goSubsetParser.SourceFileContext ctx) {
        System.out.println();
        System.out.println("-->Source_File : ");
        return visitChildren(ctx);
    }


    @Override public Object visitPackageDecl(goSubsetParser.PackageDeclContext ctx) {
        System.out.println();
        System.out.println("\t-->Package_Dec from "+ctx.start.getLine()+","+ctx.start.getStartIndex()+" to "+ctx.stop.getLine()+","+ctx.stop.getStopIndex()+" :");
        System.out.println("\t\t"+ctx.start+"\n\t\t"+ctx.stop);
        return visitChildren(ctx);
    }


    @Override public Object visitMainDecl(goSubsetParser.MainDeclContext ctx) {
        System.out.println();
        System.out.println("\t-->Main_Dec from "+ctx.start.getLine()+","+ctx.start.getStartIndex()+" to "+ctx.stop.getLine()+","+ctx.stop.getStopIndex()+" :");
        return visitChildren(ctx);
    }


    @Override public Object visitFuncDecl(goSubsetParser.FuncDeclContext ctx) {
        System.out.println();
        System.out.println("\t-->Function_Dec from "+ctx.start.getLine()+","+ctx.start.getStartIndex()+" to "+ctx.stop.getLine()+","+ctx.stop.getStopIndex()+" :");
        System.out.println("\t\tFunc_Identifier : "+ctx.getChild(1).getText());
        return visitChildren(ctx);
    }


    @Override public Object visitExpr(goSubsetParser.ExprContext ctx) {
        System.out.println();
        System.out.println("\t\tVariable_Dec from "+ctx.start.getLine()+","+ctx.start.getStartIndex()+" to "+ctx.stop.getLine()+","+ctx.stop.getStopIndex()+" :");
        System.out.println("\t\t\tVar_Identifier : "+ctx.getChild(1).getText()+"\n\t\t\tVar_Value : "+ctx.getChild(3).getText());
        return visitChildren(ctx);
    }
    
}
