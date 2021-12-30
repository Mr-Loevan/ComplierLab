// Generated from calc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, BType=14, UnaryOp=15, MulOp=16, 
		EqOp=17, CmpOp=18, Decimal_const=19, Octal_const=20, Hexadecimal_const=21, 
		Hexadecimal_prefix=22, Nonzero_digit=23, Octal_digit=24, Digit=25, Ident=26, 
		Hexadecimal_digit=27, Nondigit=28, LINE_COMMENT=29, COMMENT=30, WS=31;
	public static final int
		RULE_compUnit = 0, RULE_decl = 1, RULE_constdecl = 2, RULE_constDef = 3, 
		RULE_constInitval = 4, RULE_constExp = 5, RULE_cAddExp = 6, RULE_cMulExp = 7, 
		RULE_cUnaryExp = 8, RULE_cPrimaryExp = 9, RULE_varDecl = 10, RULE_varDef = 11, 
		RULE_initVal = 12, RULE_funcDef = 13, RULE_funcRParams = 14, RULE_block = 15, 
		RULE_blockItem = 16, RULE_stmt = 17, RULE_exp = 18, RULE_cond = 19, RULE_lOrExp = 20, 
		RULE_lAndExp = 21, RULE_eqExp = 22, RULE_relExp = 23, RULE_lVal = 24, 
		RULE_primaryExp = 25, RULE_unaryExp = 26, RULE_mulExp = 27, RULE_addExp = 28, 
		RULE_number = 29, RULE_number1 = 30, RULE_number2 = 31, RULE_number3 = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "decl", "constdecl", "constDef", "constInitval", "constExp", 
			"cAddExp", "cMulExp", "cUnaryExp", "cPrimaryExp", "varDecl", "varDef", 
			"initVal", "funcDef", "funcRParams", "block", "blockItem", "stmt", "exp", 
			"cond", "lOrExp", "lAndExp", "eqExp", "relExp", "lVal", "primaryExp", 
			"unaryExp", "mulExp", "addExp", "number", "number1", "number2", "number3"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "','", "';'", "'='", "'('", "')'", "'{'", "'}'", "'if'", 
			"'else'", "'return'", "'||'", "'&&'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "BType", "UnaryOp", "MulOp", "EqOp", "CmpOp", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", 
			"Octal_digit", "Digit", "Ident", "Hexadecimal_digit", "Nondigit", "LINE_COMMENT", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public calcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompUnitContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCompUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCompUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCompUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(66);
					decl();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(72);
			funcDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Decl1Context extends DeclContext {
		public ConstdeclContext constdecl() {
			return getRuleContext(ConstdeclContext.class,0);
		}
		public Decl1Context(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterDecl1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitDecl1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitDecl1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Decl2Context extends DeclContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public Decl2Context(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterDecl2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitDecl2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitDecl2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new Decl1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				constdecl();
				}
				break;
			case BType:
				_localctx = new Decl2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				varDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstdeclContext extends ParserRuleContext {
		public TerminalNode BType() { return getToken(calcParser.BType, 0); }
		public List<ConstDefContext> constDef() {
			return getRuleContexts(ConstDefContext.class);
		}
		public ConstDefContext constDef(int i) {
			return getRuleContext(ConstDefContext.class,i);
		}
		public ConstdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterConstdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitConstdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConstdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstdeclContext constdecl() throws RecognitionException {
		ConstdeclContext _localctx = new ConstdeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__0);
			setState(79);
			match(BType);
			setState(80);
			constDef();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(81);
				match(T__1);
				setState(82);
				constDef();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDefContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(calcParser.Ident, 0); }
		public ConstInitvalContext constInitval() {
			return getRuleContext(ConstInitvalContext.class,0);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitConstDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConstDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(Ident);
			setState(91);
			match(T__3);
			setState(92);
			constInitval();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstInitvalContext extends ParserRuleContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public ConstInitvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterConstInitval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitConstInitval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConstInitval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstInitvalContext constInitval() throws RecognitionException {
		ConstInitvalContext _localctx = new ConstInitvalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constInitval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			constExp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstExpContext extends ParserRuleContext {
		public CAddExpContext cAddExp() {
			return getRuleContext(CAddExpContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterConstExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitConstExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitConstExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			cAddExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CAddExpContext extends ParserRuleContext {
		public CAddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cAddExp; }
	 
		public CAddExpContext() { }
		public void copyFrom(CAddExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CAddExp1Context extends CAddExpContext {
		public CMulExpContext cMulExp() {
			return getRuleContext(CMulExpContext.class,0);
		}
		public CAddExp1Context(CAddExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCAddExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCAddExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCAddExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CAddExp2Context extends CAddExpContext {
		public CAddExpContext cAddExp() {
			return getRuleContext(CAddExpContext.class,0);
		}
		public TerminalNode UnaryOp() { return getToken(calcParser.UnaryOp, 0); }
		public CMulExpContext cMulExp() {
			return getRuleContext(CMulExpContext.class,0);
		}
		public CAddExp2Context(CAddExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCAddExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCAddExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCAddExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CAddExpContext cAddExp() throws RecognitionException {
		return cAddExp(0);
	}

	private CAddExpContext cAddExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CAddExpContext _localctx = new CAddExpContext(_ctx, _parentState);
		CAddExpContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_cAddExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CAddExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(99);
			cMulExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CAddExp2Context(new CAddExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cAddExp);
					setState(101);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(102);
					match(UnaryOp);
					setState(103);
					cMulExp(0);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CMulExpContext extends ParserRuleContext {
		public CMulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cMulExp; }
	 
		public CMulExpContext() { }
		public void copyFrom(CMulExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CMulExp2Context extends CMulExpContext {
		public CMulExpContext cMulExp() {
			return getRuleContext(CMulExpContext.class,0);
		}
		public TerminalNode MulOp() { return getToken(calcParser.MulOp, 0); }
		public CUnaryExpContext cUnaryExp() {
			return getRuleContext(CUnaryExpContext.class,0);
		}
		public CMulExp2Context(CMulExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCMulExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCMulExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCMulExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CMulExp1Context extends CMulExpContext {
		public CUnaryExpContext cUnaryExp() {
			return getRuleContext(CUnaryExpContext.class,0);
		}
		public CMulExp1Context(CMulExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCMulExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCMulExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCMulExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CMulExpContext cMulExp() throws RecognitionException {
		return cMulExp(0);
	}

	private CMulExpContext cMulExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CMulExpContext _localctx = new CMulExpContext(_ctx, _parentState);
		CMulExpContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_cMulExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new CMulExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(110);
			cUnaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CMulExp2Context(new CMulExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cMulExp);
					setState(112);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(113);
					match(MulOp);
					setState(114);
					cUnaryExp();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CUnaryExpContext extends ParserRuleContext {
		public CUnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cUnaryExp; }
	 
		public CUnaryExpContext() { }
		public void copyFrom(CUnaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CUnaryExp1Context extends CUnaryExpContext {
		public CPrimaryExpContext cPrimaryExp() {
			return getRuleContext(CPrimaryExpContext.class,0);
		}
		public CUnaryExp1Context(CUnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCUnaryExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCUnaryExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCUnaryExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CUnaryExp2Context extends CUnaryExpContext {
		public TerminalNode UnaryOp() { return getToken(calcParser.UnaryOp, 0); }
		public CUnaryExpContext cUnaryExp() {
			return getRuleContext(CUnaryExpContext.class,0);
		}
		public CUnaryExp2Context(CUnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCUnaryExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCUnaryExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCUnaryExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CUnaryExpContext cUnaryExp() throws RecognitionException {
		CUnaryExpContext _localctx = new CUnaryExpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cUnaryExp);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
			case Ident:
				_localctx = new CUnaryExp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				cPrimaryExp();
				}
				break;
			case UnaryOp:
				_localctx = new CUnaryExp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(UnaryOp);
				setState(122);
				cUnaryExp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CPrimaryExpContext extends ParserRuleContext {
		public CPrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cPrimaryExp; }
	 
		public CPrimaryExpContext() { }
		public void copyFrom(CPrimaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CPrimaryExp1Context extends CPrimaryExpContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public CPrimaryExp1Context(CPrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCPrimaryExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCPrimaryExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCPrimaryExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CPrimaryExp2Context extends CPrimaryExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CPrimaryExp2Context(CPrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCPrimaryExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCPrimaryExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCPrimaryExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CPrimaryExp3Context extends CPrimaryExpContext {
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public CPrimaryExp3Context(CPrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCPrimaryExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCPrimaryExp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCPrimaryExp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CPrimaryExpContext cPrimaryExp() throws RecognitionException {
		CPrimaryExpContext _localctx = new CPrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cPrimaryExp);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new CPrimaryExp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__4);
				setState(126);
				constExp();
				setState(127);
				match(T__5);
				}
				break;
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				_localctx = new CPrimaryExp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				number();
				}
				break;
			case Ident:
				_localctx = new CPrimaryExp3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				lVal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode BType() { return getToken(calcParser.BType, 0); }
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(BType);
			setState(134);
			varDef();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(135);
				match(T__1);
				setState(136);
				varDef();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
	 
		public VarDefContext() { }
		public void copyFrom(VarDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDef2Context extends VarDefContext {
		public TerminalNode Ident() { return getToken(calcParser.Ident, 0); }
		public InitValContext initVal() {
			return getRuleContext(InitValContext.class,0);
		}
		public VarDef2Context(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterVarDef2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitVarDef2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitVarDef2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDef1Context extends VarDefContext {
		public TerminalNode Ident() { return getToken(calcParser.Ident, 0); }
		public VarDef1Context(VarDefContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterVarDef1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitVarDef1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitVarDef1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varDef);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new VarDef1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(Ident);
				}
				break;
			case 2:
				_localctx = new VarDef2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(Ident);
				setState(146);
				match(T__3);
				setState(147);
				initVal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitValContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitInitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefContext extends ParserRuleContext {
		public TerminalNode BType() { return getToken(calcParser.BType, 0); }
		public TerminalNode Ident() { return getToken(calcParser.Ident, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(BType);
			setState(153);
			match(Ident);
			setState(154);
			match(T__4);
			setState(155);
			match(T__5);
			setState(156);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncRParamsContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FuncRParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcRParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterFuncRParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitFuncRParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitFuncRParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncRParamsContext funcRParams() throws RecognitionException {
		FuncRParamsContext _localctx = new FuncRParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_funcRParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			exp();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(159);
				match(T__1);
				setState(160);
				exp();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__6);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << BType) | (1L << UnaryOp) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const) | (1L << Ident))) != 0)) {
				{
				{
				setState(167);
				blockItem();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	 
		public BlockItemContext() { }
		public void copyFrom(BlockItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockItem1Context extends BlockItemContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlockItem1Context(BlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterBlockItem1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitBlockItem1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitBlockItem1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockItem2Context extends BlockItemContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockItem2Context(BlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterBlockItem2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitBlockItem2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitBlockItem2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_blockItem);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case BType:
				_localctx = new BlockItem1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				decl();
				}
				break;
			case T__2:
			case T__4:
			case T__6:
			case T__8:
			case T__10:
			case UnaryOp:
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
			case Ident:
				_localctx = new BlockItem2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stmt2Context extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Stmt2Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterStmt2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitStmt2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStmt2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt3Context extends StmtContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt3Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterStmt3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitStmt3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStmt3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt1Context extends StmtContext {
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Stmt1Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterStmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitStmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStmt1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt4Context extends StmtContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Stmt4Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterStmt4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitStmt4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStmt4(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Stmt5Context extends StmtContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Stmt5Context(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterStmt5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitStmt5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitStmt5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_stmt);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new Stmt1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				lVal();
				setState(180);
				match(T__3);
				setState(181);
				exp();
				setState(182);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new Stmt2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << UnaryOp) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const) | (1L << Ident))) != 0)) {
					{
					setState(184);
					exp();
					}
				}

				setState(187);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new Stmt3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				match(T__8);
				setState(189);
				match(T__4);
				setState(190);
				cond();
				setState(191);
				match(T__5);
				setState(192);
				stmt();
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(193);
					match(T__9);
					setState(194);
					stmt();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new Stmt4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				block();
				}
				break;
			case 5:
				_localctx = new Stmt5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(198);
				match(T__10);
				setState(199);
				exp();
				setState(200);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			addExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			lOrExp(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LOrExpContext extends ParserRuleContext {
		public LOrExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lOrExp; }
	 
		public LOrExpContext() { }
		public void copyFrom(LOrExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LOrExp2Context extends LOrExpContext {
		public LOrExpContext lOrExp() {
			return getRuleContext(LOrExpContext.class,0);
		}
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public LOrExp2Context(LOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterLOrExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitLOrExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitLOrExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LOrExp1Context extends LOrExpContext {
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public LOrExp1Context(LOrExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterLOrExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitLOrExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitLOrExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LOrExpContext lOrExp() throws RecognitionException {
		return lOrExp(0);
	}

	private LOrExpContext lOrExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LOrExpContext _localctx = new LOrExpContext(_ctx, _parentState);
		LOrExpContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_lOrExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LOrExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(209);
			lAndExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LOrExp2Context(new LOrExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lOrExp);
					setState(211);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(212);
					match(T__11);
					setState(213);
					lAndExp(0);
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LAndExpContext extends ParserRuleContext {
		public LAndExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lAndExp; }
	 
		public LAndExpContext() { }
		public void copyFrom(LAndExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LAndExp1Context extends LAndExpContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public LAndExp1Context(LAndExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterLAndExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitLAndExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitLAndExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LAndExp2Context extends LAndExpContext {
		public LAndExpContext lAndExp() {
			return getRuleContext(LAndExpContext.class,0);
		}
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public LAndExp2Context(LAndExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterLAndExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitLAndExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitLAndExp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LAndExpContext lAndExp() throws RecognitionException {
		return lAndExp(0);
	}

	private LAndExpContext lAndExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LAndExpContext _localctx = new LAndExpContext(_ctx, _parentState);
		LAndExpContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_lAndExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LAndExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(220);
			eqExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LAndExp2Context(new LAndExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_lAndExp);
					setState(222);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(223);
					match(T__12);
					setState(224);
					eqExp(0);
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqExpContext extends ParserRuleContext {
		public EqExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExp; }
	 
		public EqExpContext() { }
		public void copyFrom(EqExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqExp2Context extends EqExpContext {
		public EqExpContext eqExp() {
			return getRuleContext(EqExpContext.class,0);
		}
		public TerminalNode EqOp() { return getToken(calcParser.EqOp, 0); }
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public EqExp2Context(EqExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterEqExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitEqExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitEqExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExp1Context extends EqExpContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public EqExp1Context(EqExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterEqExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitEqExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitEqExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExpContext eqExp() throws RecognitionException {
		return eqExp(0);
	}

	private EqExpContext eqExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExpContext _localctx = new EqExpContext(_ctx, _parentState);
		EqExpContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_eqExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(231);
			relExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExp2Context(new EqExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_eqExp);
					setState(233);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(234);
					match(EqOp);
					setState(235);
					relExp(0);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelExpContext extends ParserRuleContext {
		public RelExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExp; }
	 
		public RelExpContext() { }
		public void copyFrom(RelExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelExp2Context extends RelExpContext {
		public RelExpContext relExp() {
			return getRuleContext(RelExpContext.class,0);
		}
		public TerminalNode CmpOp() { return getToken(calcParser.CmpOp, 0); }
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public RelExp2Context(RelExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterRelExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitRelExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitRelExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelExp1Context extends RelExpContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public RelExp1Context(RelExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterRelExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitRelExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitRelExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelExpContext relExp() throws RecognitionException {
		return relExp(0);
	}

	private RelExpContext relExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelExpContext _localctx = new RelExpContext(_ctx, _parentState);
		RelExpContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_relExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(242);
			addExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelExp2Context(new RelExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_relExp);
					setState(244);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(245);
					match(CmpOp);
					setState(246);
					addExp(0);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LValContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(calcParser.Ident, 0); }
		public LValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterLVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitLVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitLVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValContext lVal() throws RecognitionException {
		LValContext _localctx = new LValContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Ident);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpContext extends ParserRuleContext {
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
	 
		public PrimaryExpContext() { }
		public void copyFrom(PrimaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrimaryExp2Context extends PrimaryExpContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrimaryExp2Context(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPrimaryExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPrimaryExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitPrimaryExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExp1Context extends PrimaryExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrimaryExp1Context(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPrimaryExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPrimaryExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitPrimaryExp1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimaryExp3Context extends PrimaryExpContext {
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public PrimaryExp3Context(PrimaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterPrimaryExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitPrimaryExp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitPrimaryExp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_primaryExp);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new PrimaryExp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				match(T__4);
				setState(255);
				exp();
				setState(256);
				match(T__5);
				}
				break;
			case Decimal_const:
			case Octal_const:
			case Hexadecimal_const:
				_localctx = new PrimaryExp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				number();
				}
				break;
			case Ident:
				_localctx = new PrimaryExp3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				lVal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryExpContext extends ParserRuleContext {
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
	 
		public UnaryExpContext() { }
		public void copyFrom(UnaryExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryExp3Context extends UnaryExpContext {
		public TerminalNode Ident() { return getToken(calcParser.Ident, 0); }
		public FuncRParamsContext funcRParams() {
			return getRuleContext(FuncRParamsContext.class,0);
		}
		public UnaryExp3Context(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterUnaryExp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitUnaryExp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitUnaryExp3(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExp2Context extends UnaryExpContext {
		public TerminalNode UnaryOp() { return getToken(calcParser.UnaryOp, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public UnaryExp2Context(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterUnaryExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitUnaryExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitUnaryExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExp1Context extends UnaryExpContext {
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public UnaryExp1Context(UnaryExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterUnaryExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitUnaryExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitUnaryExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryExp);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new UnaryExp1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				primaryExp();
				}
				break;
			case 2:
				_localctx = new UnaryExp2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(UnaryOp);
				setState(264);
				unaryExp();
				}
				break;
			case 3:
				_localctx = new UnaryExp3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(Ident);
				setState(266);
				match(T__4);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << UnaryOp) | (1L << Decimal_const) | (1L << Octal_const) | (1L << Hexadecimal_const) | (1L << Ident))) != 0)) {
					{
					setState(267);
					funcRParams();
					}
				}

				setState(270);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MulExpContext extends ParserRuleContext {
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
	 
		public MulExpContext() { }
		public void copyFrom(MulExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulExp2Context extends MulExpContext {
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public TerminalNode MulOp() { return getToken(calcParser.MulOp, 0); }
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExp2Context(MulExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterMulExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitMulExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitMulExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulExp1Context extends MulExpContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExp1Context(MulExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterMulExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitMulExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitMulExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpContext mulExp() throws RecognitionException {
		return mulExp(0);
	}

	private MulExpContext mulExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MulExpContext _localctx = new MulExpContext(_ctx, _parentState);
		MulExpContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_mulExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MulExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(274);
			unaryExp();
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulExp2Context(new MulExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mulExp);
					setState(276);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(277);
					match(MulOp);
					setState(278);
					unaryExp();
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddExpContext extends ParserRuleContext {
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
	 
		public AddExpContext() { }
		public void copyFrom(AddExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddExp2Context extends AddExpContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public TerminalNode UnaryOp() { return getToken(calcParser.UnaryOp, 0); }
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public AddExp2Context(AddExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterAddExp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitAddExp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitAddExp2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExp1Context extends AddExpContext {
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public AddExp1Context(AddExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterAddExp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitAddExp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitAddExp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		return addExp(0);
	}

	private AddExpContext addExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExpContext _localctx = new AddExpContext(_ctx, _parentState);
		AddExpContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_addExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AddExp1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(285);
			mulExp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddExp2Context(new AddExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_addExp);
					setState(287);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(288);
					match(UnaryOp);
					setState(289);
					mulExp(0);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public Number1Context number1() {
			return getRuleContext(Number1Context.class,0);
		}
		public Number2Context number2() {
			return getRuleContext(Number2Context.class,0);
		}
		public Number3Context number3() {
			return getRuleContext(Number3Context.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_number);
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Decimal_const:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				number1();
				}
				break;
			case Octal_const:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				number2();
				}
				break;
			case Hexadecimal_const:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				number3();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number1Context extends ParserRuleContext {
		public TerminalNode Decimal_const() { return getToken(calcParser.Decimal_const, 0); }
		public Number1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterNumber1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitNumber1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitNumber1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number1Context number1() throws RecognitionException {
		Number1Context _localctx = new Number1Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_number1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(Decimal_const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number2Context extends ParserRuleContext {
		public TerminalNode Octal_const() { return getToken(calcParser.Octal_const, 0); }
		public Number2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterNumber2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitNumber2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitNumber2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number2Context number2() throws RecognitionException {
		Number2Context _localctx = new Number2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_number2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(Octal_const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Number3Context extends ParserRuleContext {
		public TerminalNode Hexadecimal_const() { return getToken(calcParser.Hexadecimal_const, 0); }
		public Number3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).enterNumber3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof calcListener ) ((calcListener)listener).exitNumber3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof calcVisitor ) return ((calcVisitor<? extends T>)visitor).visitNumber3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Number3Context number3() throws RecognitionException {
		Number3Context _localctx = new Number3Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_number3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Hexadecimal_const);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return cAddExp_sempred((CAddExpContext)_localctx, predIndex);
		case 7:
			return cMulExp_sempred((CMulExpContext)_localctx, predIndex);
		case 20:
			return lOrExp_sempred((LOrExpContext)_localctx, predIndex);
		case 21:
			return lAndExp_sempred((LAndExpContext)_localctx, predIndex);
		case 22:
			return eqExp_sempred((EqExpContext)_localctx, predIndex);
		case 23:
			return relExp_sempred((RelExpContext)_localctx, predIndex);
		case 27:
			return mulExp_sempred((MulExpContext)_localctx, predIndex);
		case 28:
			return addExp_sempred((AddExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cAddExp_sempred(CAddExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cMulExp_sempred(CMulExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lOrExp_sempred(LOrExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean lAndExp_sempred(LAndExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExp_sempred(EqExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relExp_sempred(RelExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean mulExp_sempred(MulExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExp_sempred(AddExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0135\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\5\3O\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\tv\n\t\f\t\16\ty\13\t\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u0086\n\13\3\f\3\f\3\f\3\f\7\f\u008c\n\f\f\f\16\f"+
		"\u008f\13\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\7\20\u00a4\n\20\f\20\16\20\u00a7\13"+
		"\20\3\21\3\21\7\21\u00ab\n\21\f\21\16\21\u00ae\13\21\3\21\3\21\3\22\3"+
		"\22\5\22\u00b4\n\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bc\n\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c6\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00cd\n\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u00d9\n\26\f\26\16\26\u00dc\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u00e4\n\27\f\27\16\27\u00e7\13\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u00ef\n\30\f\30\16\30\u00f2\13\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u00fa\n\31\f\31\16\31\u00fd\13\31\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0107\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u010f\n"+
		"\34\3\34\5\34\u0112\n\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u011a\n\35"+
		"\f\35\16\35\u011d\13\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0125\n\36"+
		"\f\36\16\36\u0128\13\36\3\37\3\37\3\37\5\37\u012d\n\37\3 \3 \3!\3!\3\""+
		"\3\"\3\"\2\n\16\20*,.\608:#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@B\2\2\2\u0133\2G\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2"+
		"\b\\\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16d\3\2\2\2\20o\3\2\2\2\22}\3\2\2\2"+
		"\24\u0085\3\2\2\2\26\u0087\3\2\2\2\30\u0096\3\2\2\2\32\u0098\3\2\2\2\34"+
		"\u009a\3\2\2\2\36\u00a0\3\2\2\2 \u00a8\3\2\2\2\"\u00b3\3\2\2\2$\u00cc"+
		"\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00d2\3\2\2\2,\u00dd\3\2\2\2."+
		"\u00e8\3\2\2\2\60\u00f3\3\2\2\2\62\u00fe\3\2\2\2\64\u0106\3\2\2\2\66\u0111"+
		"\3\2\2\28\u0113\3\2\2\2:\u011e\3\2\2\2<\u012c\3\2\2\2>\u012e\3\2\2\2@"+
		"\u0130\3\2\2\2B\u0132\3\2\2\2DF\5\4\3\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\5\34\17\2K\3\3\2\2\2LO\5\6\4\2MO\5\26"+
		"\f\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\7\3\2\2QR\7\20\2\2RW\5\b\5\2ST\7"+
		"\4\2\2TV\5\b\5\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3"+
		"\2\2\2Z[\7\5\2\2[\7\3\2\2\2\\]\7\34\2\2]^\7\6\2\2^_\5\n\6\2_\t\3\2\2\2"+
		"`a\5\f\7\2a\13\3\2\2\2bc\5\16\b\2c\r\3\2\2\2de\b\b\1\2ef\5\20\t\2fl\3"+
		"\2\2\2gh\f\3\2\2hi\7\21\2\2ik\5\20\t\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2l"+
		"m\3\2\2\2m\17\3\2\2\2nl\3\2\2\2op\b\t\1\2pq\5\22\n\2qw\3\2\2\2rs\f\3\2"+
		"\2st\7\22\2\2tv\5\22\n\2ur\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3"+
		"\2\2\2yw\3\2\2\2z~\5\24\13\2{|\7\21\2\2|~\5\22\n\2}z\3\2\2\2}{\3\2\2\2"+
		"~\23\3\2\2\2\177\u0080\7\7\2\2\u0080\u0081\5\f\7\2\u0081\u0082\7\b\2\2"+
		"\u0082\u0086\3\2\2\2\u0083\u0086\5<\37\2\u0084\u0086\5\62\32\2\u0085\177"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\25\3\2\2\2\u0087"+
		"\u0088\7\20\2\2\u0088\u008d\5\30\r\2\u0089\u008a\7\4\2\2\u008a\u008c\5"+
		"\30\r\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\5"+
		"\2\2\u0091\27\3\2\2\2\u0092\u0097\7\34\2\2\u0093\u0094\7\34\2\2\u0094"+
		"\u0095\7\6\2\2\u0095\u0097\5\32\16\2\u0096\u0092\3\2\2\2\u0096\u0093\3"+
		"\2\2\2\u0097\31\3\2\2\2\u0098\u0099\5&\24\2\u0099\33\3\2\2\2\u009a\u009b"+
		"\7\20\2\2\u009b\u009c\7\34\2\2\u009c\u009d\7\7\2\2\u009d\u009e\7\b\2\2"+
		"\u009e\u009f\5 \21\2\u009f\35\3\2\2\2\u00a0\u00a5\5&\24\2\u00a1\u00a2"+
		"\7\4\2\2\u00a2\u00a4\5&\24\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\37\3\2\2\2\u00a7\u00a5\3\2\2"+
		"\2\u00a8\u00ac\7\t\2\2\u00a9\u00ab\5\"\22\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2"+
		"\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0!\3\2\2\2\u00b1\u00b4"+
		"\5\4\3\2\u00b2\u00b4\5$\23\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"#\3\2\2\2\u00b5\u00b6\5\62\32\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\5&\24"+
		"\2\u00b8\u00b9\7\5\2\2\u00b9\u00cd\3\2\2\2\u00ba\u00bc\5&\24\2\u00bb\u00ba"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00cd\7\5\2\2\u00be"+
		"\u00bf\7\13\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5(\25\2\u00c1\u00c2\7"+
		"\b\2\2\u00c2\u00c5\5$\23\2\u00c3\u00c4\7\f\2\2\u00c4\u00c6\5$\23\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cd\3\2\2\2\u00c7\u00cd\5 "+
		"\21\2\u00c8\u00c9\7\r\2\2\u00c9\u00ca\5&\24\2\u00ca\u00cb\7\5\2\2\u00cb"+
		"\u00cd\3\2\2\2\u00cc\u00b5\3\2\2\2\u00cc\u00bb\3\2\2\2\u00cc\u00be\3\2"+
		"\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd%\3\2\2\2\u00ce\u00cf"+
		"\5:\36\2\u00cf\'\3\2\2\2\u00d0\u00d1\5*\26\2\u00d1)\3\2\2\2\u00d2\u00d3"+
		"\b\26\1\2\u00d3\u00d4\5,\27\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\f\3\2\2"+
		"\u00d6\u00d7\7\16\2\2\u00d7\u00d9\5,\27\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db+\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\b\27\1\2\u00de\u00df\5.\30\2\u00df\u00e5\3"+
		"\2\2\2\u00e0\u00e1\f\3\2\2\u00e1\u00e2\7\17\2\2\u00e2\u00e4\5.\30\2\u00e3"+
		"\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6-\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\b\30\1\2\u00e9\u00ea"+
		"\5\60\31\2\u00ea\u00f0\3\2\2\2\u00eb\u00ec\f\3\2\2\u00ec\u00ed\7\23\2"+
		"\2\u00ed\u00ef\5\60\31\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1/\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f3\u00f4\b\31\1\2\u00f4\u00f5\5:\36\2\u00f5\u00fb\3\2\2\2\u00f6\u00f7"+
		"\f\3\2\2\u00f7\u00f8\7\24\2\2\u00f8\u00fa\5:\36\2\u00f9\u00f6\3\2\2\2"+
		"\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\61"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u00ff\7\34\2\2\u00ff\63\3\2\2\2\u0100"+
		"\u0101\7\7\2\2\u0101\u0102\5&\24\2\u0102\u0103\7\b\2\2\u0103\u0107\3\2"+
		"\2\2\u0104\u0107\5<\37\2\u0105\u0107\5\62\32\2\u0106\u0100\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\65\3\2\2\2\u0108\u0112\5\64\33"+
		"\2\u0109\u010a\7\21\2\2\u010a\u0112\5\66\34\2\u010b\u010c\7\34\2\2\u010c"+
		"\u010e\7\7\2\2\u010d\u010f\5\36\20\2\u010e\u010d\3\2\2\2\u010e\u010f\3"+
		"\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7\b\2\2\u0111\u0108\3\2\2\2\u0111"+
		"\u0109\3\2\2\2\u0111\u010b\3\2\2\2\u0112\67\3\2\2\2\u0113\u0114\b\35\1"+
		"\2\u0114\u0115\5\66\34\2\u0115\u011b\3\2\2\2\u0116\u0117\f\3\2\2\u0117"+
		"\u0118\7\22\2\2\u0118\u011a\5\66\34\2\u0119\u0116\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c9\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011e\u011f\b\36\1\2\u011f\u0120\58\35\2\u0120\u0126\3"+
		"\2\2\2\u0121\u0122\f\3\2\2\u0122\u0123\7\21\2\2\u0123\u0125\58\35\2\u0124"+
		"\u0121\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127;\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012d\5> \2\u012a\u012d"+
		"\5@!\2\u012b\u012d\5B\"\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d=\3\2\2\2\u012e\u012f\7\25\2\2\u012f?\3\2\2\2\u0130"+
		"\u0131\7\26\2\2\u0131A\3\2\2\2\u0132\u0133\7\27\2\2\u0133C\3\2\2\2\33"+
		"GNWlw}\u0085\u008d\u0096\u00a5\u00ac\u00b3\u00bb\u00c5\u00cc\u00da\u00e5"+
		"\u00f0\u00fb\u0106\u010e\u0111\u011b\u0126\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}