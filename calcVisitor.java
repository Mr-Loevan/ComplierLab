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
	 * Visit a parse tree produced by the {@code gdecl1}
	 * labeled alternative in {@link calcParser#gdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdecl1(calcParser.Gdecl1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code gdecl2}
	 * labeled alternative in {@link calcParser#gdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdecl2(calcParser.Gdecl2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#gvarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGvarDecl(calcParser.GvarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gvarDef1}
	 * labeled alternative in {@link calcParser#gvarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGvarDef1(calcParser.GvarDef1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code gvarDef2}
	 * labeled alternative in {@link calcParser#gvarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGvarDef2(calcParser.GvarDef2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code decl1}
	 * labeled alternative in {@link calcParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl1(calcParser.Decl1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code decl2}
	 * labeled alternative in {@link calcParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl2(calcParser.Decl2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#constdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstdecl(calcParser.ConstdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(calcParser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constInitval1}
	 * labeled alternative in {@link calcParser#constInitval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitval1(calcParser.ConstInitval1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code constInitval2}
	 * labeled alternative in {@link calcParser#constInitval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitval2(calcParser.ConstInitval2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(calcParser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cAddExp1}
	 * labeled alternative in {@link calcParser#cAddExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCAddExp1(calcParser.CAddExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cAddExp2}
	 * labeled alternative in {@link calcParser#cAddExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCAddExp2(calcParser.CAddExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cMulExp2}
	 * labeled alternative in {@link calcParser#cMulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCMulExp2(calcParser.CMulExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cMulExp1}
	 * labeled alternative in {@link calcParser#cMulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCMulExp1(calcParser.CMulExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cUnaryExp1}
	 * labeled alternative in {@link calcParser#cUnaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCUnaryExp1(calcParser.CUnaryExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cUnaryExp2}
	 * labeled alternative in {@link calcParser#cUnaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCUnaryExp2(calcParser.CUnaryExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cPrimaryExp1}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCPrimaryExp1(calcParser.CPrimaryExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cPrimaryExp2}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCPrimaryExp2(calcParser.CPrimaryExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code cPrimaryExp3}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCPrimaryExp3(calcParser.CPrimaryExp3Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(calcParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDef1}
	 * labeled alternative in {@link calcParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef1(calcParser.VarDef1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code varDef2}
	 * labeled alternative in {@link calcParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef2(calcParser.VarDef2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code initVal1}
	 * labeled alternative in {@link calcParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal1(calcParser.InitVal1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code initVal2}
	 * labeled alternative in {@link calcParser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal2(calcParser.InitVal2Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(calcParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(calcParser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(calcParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockItem1}
	 * labeled alternative in {@link calcParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem1(calcParser.BlockItem1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code blockItem2}
	 * labeled alternative in {@link calcParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem2(calcParser.BlockItem2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt1}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt1(calcParser.Stmt1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt2}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt2(calcParser.Stmt2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt3}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt3(calcParser.Stmt3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt4}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt4(calcParser.Stmt4Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt5}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt5(calcParser.Stmt5Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt6}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt6(calcParser.Stmt6Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt7}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt7(calcParser.Stmt7Context ctx);
	/**
	 * Visit a parse tree produced by the {@code stmt8}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt8(calcParser.Stmt8Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(calcParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(calcParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lOrExp2}
	 * labeled alternative in {@link calcParser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrExp2(calcParser.LOrExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lOrExp1}
	 * labeled alternative in {@link calcParser#lOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOrExp1(calcParser.LOrExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lAndExp1}
	 * labeled alternative in {@link calcParser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAndExp1(calcParser.LAndExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code lAndExp2}
	 * labeled alternative in {@link calcParser#lAndExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLAndExp2(calcParser.LAndExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp2}
	 * labeled alternative in {@link calcParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp2(calcParser.EqExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExp1}
	 * labeled alternative in {@link calcParser#eqExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExp1(calcParser.EqExp1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relExp2}
	 * labeled alternative in {@link calcParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp2(calcParser.RelExp2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code relExp1}
	 * labeled alternative in {@link calcParser#relExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExp1(calcParser.RelExp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link calcParser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(calcParser.LValContext ctx);
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
	 * Visit a parse tree produced by the {@code primaryExp3}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp3(calcParser.PrimaryExp3Context ctx);
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
	 * Visit a parse tree produced by the {@code unaryExp3}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp3(calcParser.UnaryExp3Context ctx);
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