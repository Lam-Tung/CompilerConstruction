package antlr;
// Generated from C:/Users/zgaya/Documents/hda/sem8/Compiler Construction/X-Raster-E/src/main/resources/grammar\goSubset.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link goSubsetParser}.
 */
public interface goSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(goSubsetParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(goSubsetParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void enterPackageDecl(goSubsetParser.PackageDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#packageDecl}.
	 * @param ctx the parse tree
	 */
	void exitPackageDecl(goSubsetParser.PackageDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#mainDecl}.
	 * @param ctx the parse tree
	 */
	void enterMainDecl(goSubsetParser.MainDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#mainDecl}.
	 * @param ctx the parse tree
	 */
	void exitMainDecl(goSubsetParser.MainDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(goSubsetParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(goSubsetParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(goSubsetParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(goSubsetParser.ExprContext ctx);
}