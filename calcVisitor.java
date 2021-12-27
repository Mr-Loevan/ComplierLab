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
	 * Visit a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(calcParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp2}
	 * labeled alternative in {@link calcParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp2(calcParser.AddExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp1}
	 * labeled alternative in {@link calcParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp1(calcParser.AddExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExp2}
	 * labeled alternative in {@link calcParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp2(calcParser.MulExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExp1}
	 * labeled alternative in {@link calcParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp1(calcParser.MulExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExp1}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp1(calcParser.UnaryExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExp2}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp2(calcParser.UnaryExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExp1}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp1(calcParser.PrimaryExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExp2}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp2(calcParser.PrimaryExp2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(calcParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#number1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber1(calcParser.Number1Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#number2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber2(calcParser.Number2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#number3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber3(calcParser.Number3Context ctx);
}