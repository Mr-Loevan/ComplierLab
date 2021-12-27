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
	 * Enter a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(calcParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(calcParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp2}
	 * labeled alternative in {@link calcParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp2(calcParser.AddExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp2}
	 * labeled alternative in {@link calcParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp2(calcParser.AddExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp1}
	 * labeled alternative in {@link calcParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp1(calcParser.AddExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp1}
	 * labeled alternative in {@link calcParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp1(calcParser.AddExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExp2}
	 * labeled alternative in {@link calcParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp2(calcParser.MulExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExp2}
	 * labeled alternative in {@link calcParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp2(calcParser.MulExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExp1}
	 * labeled alternative in {@link calcParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp1(calcParser.MulExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExp1}
	 * labeled alternative in {@link calcParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp1(calcParser.MulExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExp1}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp1(calcParser.UnaryExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExp1}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp1(calcParser.UnaryExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExp2}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp2(calcParser.UnaryExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExp2}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp2(calcParser.UnaryExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExp1}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp1(calcParser.PrimaryExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExp1}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp1(calcParser.PrimaryExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExp2}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp2(calcParser.PrimaryExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExp2}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp2(calcParser.PrimaryExp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(calcParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(calcParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#number1}.
	 * @param ctx the parse tree
	 */
	void enterNumber1(calcParser.Number1Context ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#number1}.
	 * @param ctx the parse tree
	 */
	void exitNumber1(calcParser.Number1Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#number2}.
	 * @param ctx the parse tree
	 */
	void enterNumber2(calcParser.Number2Context ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#number2}.
	 * @param ctx the parse tree
	 */
	void exitNumber2(calcParser.Number2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#number3}.
	 * @param ctx the parse tree
	 */
	void enterNumber3(calcParser.Number3Context ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#number3}.
	 * @param ctx the parse tree
	 */
	void exitNumber3(calcParser.Number3Context ctx);
}