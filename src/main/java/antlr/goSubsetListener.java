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
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(goSubsetParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(goSubsetParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#varDecl_num}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl_num(goSubsetParser.VarDecl_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#varDecl_num}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl_num(goSubsetParser.VarDecl_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#varDecl_var}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl_var(goSubsetParser.VarDecl_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#varDecl_var}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl_var(goSubsetParser.VarDecl_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign(goSubsetParser.VarAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#varAssign}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign(goSubsetParser.VarAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#varAssign_num}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign_num(goSubsetParser.VarAssign_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#varAssign_num}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign_num(goSubsetParser.VarAssign_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link goSubsetParser#varAssign_var}.
	 * @param ctx the parse tree
	 */
	void enterVarAssign_var(goSubsetParser.VarAssign_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link goSubsetParser#varAssign_var}.
	 * @param ctx the parse tree
	 */
	void exitVarAssign_var(goSubsetParser.VarAssign_varContext ctx);
}