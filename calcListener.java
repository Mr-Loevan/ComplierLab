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
	 * Enter a parse tree produced by the {@code gdecl1}
	 * labeled alternative in {@link calcParser#gdecl}.
	 * @param ctx the parse tree
	 */
	void enterGdecl1(calcParser.Gdecl1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code gdecl1}
	 * labeled alternative in {@link calcParser#gdecl}.
	 * @param ctx the parse tree
	 */
	void exitGdecl1(calcParser.Gdecl1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code gdecl2}
	 * labeled alternative in {@link calcParser#gdecl}.
	 * @param ctx the parse tree
	 */
	void enterGdecl2(calcParser.Gdecl2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code gdecl2}
	 * labeled alternative in {@link calcParser#gdecl}.
	 * @param ctx the parse tree
	 */
	void exitGdecl2(calcParser.Gdecl2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#gvarDecl}.
	 * @param ctx the parse tree
	 */
	void enterGvarDecl(calcParser.GvarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#gvarDecl}.
	 * @param ctx the parse tree
	 */
	void exitGvarDecl(calcParser.GvarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gvarDef1}
	 * labeled alternative in {@link calcParser#gvarDef}.
	 * @param ctx the parse tree
	 */
	void enterGvarDef1(calcParser.GvarDef1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code gvarDef1}
	 * labeled alternative in {@link calcParser#gvarDef}.
	 * @param ctx the parse tree
	 */
	void exitGvarDef1(calcParser.GvarDef1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code gvarDef2}
	 * labeled alternative in {@link calcParser#gvarDef}.
	 * @param ctx the parse tree
	 */
	void enterGvarDef2(calcParser.GvarDef2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code gvarDef2}
	 * labeled alternative in {@link calcParser#gvarDef}.
	 * @param ctx the parse tree
	 */
	void exitGvarDef2(calcParser.GvarDef2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code decl1}
	 * labeled alternative in {@link calcParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl1(calcParser.Decl1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code decl1}
	 * labeled alternative in {@link calcParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl1(calcParser.Decl1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code decl2}
	 * labeled alternative in {@link calcParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl2(calcParser.Decl2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code decl2}
	 * labeled alternative in {@link calcParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl2(calcParser.Decl2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void enterConstdecl(calcParser.ConstdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#constdecl}.
	 * @param ctx the parse tree
	 */
	void exitConstdecl(calcParser.ConstdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(calcParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(calcParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constInitval1}
	 * labeled alternative in {@link calcParser#constInitval}.
	 * @param ctx the parse tree
	 */
	void enterConstInitval1(calcParser.ConstInitval1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code constInitval1}
	 * labeled alternative in {@link calcParser#constInitval}.
	 * @param ctx the parse tree
	 */
	void exitConstInitval1(calcParser.ConstInitval1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code constInitval2}
	 * labeled alternative in {@link calcParser#constInitval}.
	 * @param ctx the parse tree
	 */
	void enterConstInitval2(calcParser.ConstInitval2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code constInitval2}
	 * labeled alternative in {@link calcParser#constInitval}.
	 * @param ctx the parse tree
	 */
	void exitConstInitval2(calcParser.ConstInitval2Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(calcParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(calcParser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cAddExp1}
	 * labeled alternative in {@link calcParser#cAddExp}.
	 * @param ctx the parse tree
	 */
	void enterCAddExp1(calcParser.CAddExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cAddExp1}
	 * labeled alternative in {@link calcParser#cAddExp}.
	 * @param ctx the parse tree
	 */
	void exitCAddExp1(calcParser.CAddExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cAddExp2}
	 * labeled alternative in {@link calcParser#cAddExp}.
	 * @param ctx the parse tree
	 */
	void enterCAddExp2(calcParser.CAddExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cAddExp2}
	 * labeled alternative in {@link calcParser#cAddExp}.
	 * @param ctx the parse tree
	 */
	void exitCAddExp2(calcParser.CAddExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cMulExp2}
	 * labeled alternative in {@link calcParser#cMulExp}.
	 * @param ctx the parse tree
	 */
	void enterCMulExp2(calcParser.CMulExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cMulExp2}
	 * labeled alternative in {@link calcParser#cMulExp}.
	 * @param ctx the parse tree
	 */
	void exitCMulExp2(calcParser.CMulExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cMulExp1}
	 * labeled alternative in {@link calcParser#cMulExp}.
	 * @param ctx the parse tree
	 */
	void enterCMulExp1(calcParser.CMulExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cMulExp1}
	 * labeled alternative in {@link calcParser#cMulExp}.
	 * @param ctx the parse tree
	 */
	void exitCMulExp1(calcParser.CMulExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cUnaryExp1}
	 * labeled alternative in {@link calcParser#cUnaryExp}.
	 * @param ctx the parse tree
	 */
	void enterCUnaryExp1(calcParser.CUnaryExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cUnaryExp1}
	 * labeled alternative in {@link calcParser#cUnaryExp}.
	 * @param ctx the parse tree
	 */
	void exitCUnaryExp1(calcParser.CUnaryExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cUnaryExp2}
	 * labeled alternative in {@link calcParser#cUnaryExp}.
	 * @param ctx the parse tree
	 */
	void enterCUnaryExp2(calcParser.CUnaryExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cUnaryExp2}
	 * labeled alternative in {@link calcParser#cUnaryExp}.
	 * @param ctx the parse tree
	 */
	void exitCUnaryExp2(calcParser.CUnaryExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cPrimaryExp1}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 */
	void enterCPrimaryExp1(calcParser.CPrimaryExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cPrimaryExp1}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 */
	void exitCPrimaryExp1(calcParser.CPrimaryExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cPrimaryExp2}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 */
	void enterCPrimaryExp2(calcParser.CPrimaryExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cPrimaryExp2}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 */
	void exitCPrimaryExp2(calcParser.CPrimaryExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code cPrimaryExp3}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 */
	void enterCPrimaryExp3(calcParser.CPrimaryExp3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code cPrimaryExp3}
	 * labeled alternative in {@link calcParser#cPrimaryExp}.
	 * @param ctx the parse tree
	 */
	void exitCPrimaryExp3(calcParser.CPrimaryExp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(calcParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(calcParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDef1}
	 * labeled alternative in {@link calcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef1(calcParser.VarDef1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code varDef1}
	 * labeled alternative in {@link calcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef1(calcParser.VarDef1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code varDef2}
	 * labeled alternative in {@link calcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef2(calcParser.VarDef2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code varDef2}
	 * labeled alternative in {@link calcParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef2(calcParser.VarDef2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code initVal1}
	 * labeled alternative in {@link calcParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal1(calcParser.InitVal1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code initVal1}
	 * labeled alternative in {@link calcParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal1(calcParser.InitVal1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code initVal2}
	 * labeled alternative in {@link calcParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal2(calcParser.InitVal2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code initVal2}
	 * labeled alternative in {@link calcParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal2(calcParser.InitVal2Context ctx);
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
	 * Enter a parse tree produced by {@link calcParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(calcParser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(calcParser.FuncRParamsContext ctx);
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
	 * Enter a parse tree produced by the {@code blockItem1}
	 * labeled alternative in {@link calcParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem1(calcParser.BlockItem1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blockItem1}
	 * labeled alternative in {@link calcParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem1(calcParser.BlockItem1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code blockItem2}
	 * labeled alternative in {@link calcParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem2(calcParser.BlockItem2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code blockItem2}
	 * labeled alternative in {@link calcParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem2(calcParser.BlockItem2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt1}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt1(calcParser.Stmt1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt1}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt1(calcParser.Stmt1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt2}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt2(calcParser.Stmt2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt2}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt2(calcParser.Stmt2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt3}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt3(calcParser.Stmt3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt3}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt3(calcParser.Stmt3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt4}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt4(calcParser.Stmt4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt4}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt4(calcParser.Stmt4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt5}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt5(calcParser.Stmt5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt5}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt5(calcParser.Stmt5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt6}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt6(calcParser.Stmt6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt6}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt6(calcParser.Stmt6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt7}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt7(calcParser.Stmt7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt7}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt7(calcParser.Stmt7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt8}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt8(calcParser.Stmt8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt8}
	 * labeled alternative in {@link calcParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt8(calcParser.Stmt8Context ctx);
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
	 * Enter a parse tree produced by {@link calcParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(calcParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(calcParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lOrExp2}
	 * labeled alternative in {@link calcParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExp2(calcParser.LOrExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lOrExp2}
	 * labeled alternative in {@link calcParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExp2(calcParser.LOrExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lOrExp1}
	 * labeled alternative in {@link calcParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExp1(calcParser.LOrExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lOrExp1}
	 * labeled alternative in {@link calcParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExp1(calcParser.LOrExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lAndExp1}
	 * labeled alternative in {@link calcParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExp1(calcParser.LAndExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lAndExp1}
	 * labeled alternative in {@link calcParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExp1(calcParser.LAndExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code lAndExp2}
	 * labeled alternative in {@link calcParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExp2(calcParser.LAndExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code lAndExp2}
	 * labeled alternative in {@link calcParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExp2(calcParser.LAndExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExp2}
	 * labeled alternative in {@link calcParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp2(calcParser.EqExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExp2}
	 * labeled alternative in {@link calcParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp2(calcParser.EqExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExp1}
	 * labeled alternative in {@link calcParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp1(calcParser.EqExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExp1}
	 * labeled alternative in {@link calcParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp1(calcParser.EqExp1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relExp2}
	 * labeled alternative in {@link calcParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp2(calcParser.RelExp2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relExp2}
	 * labeled alternative in {@link calcParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp2(calcParser.RelExp2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code relExp1}
	 * labeled alternative in {@link calcParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp1(calcParser.RelExp1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relExp1}
	 * labeled alternative in {@link calcParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp1(calcParser.RelExp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link calcParser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(calcParser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link calcParser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(calcParser.LValContext ctx);
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
	 * Enter a parse tree produced by the {@code primaryExp3}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp3(calcParser.PrimaryExp3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExp3}
	 * labeled alternative in {@link calcParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp3(calcParser.PrimaryExp3Context ctx);
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
	 * Enter a parse tree produced by the {@code unaryExp3}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp3(calcParser.UnaryExp3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExp3}
	 * labeled alternative in {@link calcParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp3(calcParser.UnaryExp3Context ctx);
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