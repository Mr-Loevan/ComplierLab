// Generated from calc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calcParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calcVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calcParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(calcParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(calcParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(calcParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(calcParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number1}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber1(calcParser.Number1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code number2}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber2(calcParser.Number2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code number3}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber3(calcParser.Number3Context ctx);
}