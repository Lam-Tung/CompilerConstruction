package antlr;
// Generated from C:/Users/zgaya/Documents/hda/sem8/Compiler Construction/X-Raster-E/src/main/resources/grammar\goSubset.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link goSubsetParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface goSubsetVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link goSubsetParser#sourceFile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceFile(goSubsetParser.SourceFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link goSubsetParser#packageDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDecl(goSubsetParser.PackageDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link goSubsetParser#mainDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDecl(goSubsetParser.MainDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link goSubsetParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(goSubsetParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link goSubsetParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(goSubsetParser.ExprContext ctx);
}