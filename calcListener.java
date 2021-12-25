// Generated from calc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calcParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(calcParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(calcParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(calcParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(calcParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(calcParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(calcParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(calcParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(calcParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number1}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber1(calcParser.Number1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code number1}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber1(calcParser.Number1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code number2}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber2(calcParser.Number2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code number2}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber2(calcParser.Number2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code number3}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber3(calcParser.Number3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code number3}
	 * labeled alternative in {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber3(calcParser.Number3Context ctx);
}