// Generated from calc.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class calcLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, UnaryOp=7, MulOp=8, Decimal_const=9, 
		Octal_const=10, Hexadecimal_const=11, Hexadecimal_prefix=12, Nonzero_digit=13, 
		Octal_digit=14, Digit=15, Hexadecimal_digit=16, WS=17, FuncType=18, Ident=19, 
		LINE_COMMENT=20, COMMENT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "UnaryOp", "MulOp", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", 
			"Octal_digit", "Digit", "Hexadecimal_digit", "WS", "FuncType", "Ident", 
			"LINE_COMMENT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'return'", "';'", null, null, null, 
			null, null, null, null, null, null, null, null, "'int'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "UnaryOp", "MulOp", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", 
			"Octal_digit", "Digit", "Hexadecimal_digit", "WS", "FuncType", "Ident", 
			"LINE_COMMENT", "COMMENT"
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


	public calcLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\7"+
		"\nE\n\n\f\n\16\nH\13\n\3\13\3\13\7\13L\n\13\f\13\16\13O\13\13\3\f\3\f"+
		"\6\fS\n\f\r\f\16\fT\3\r\3\r\3\r\3\r\5\r[\n\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\5\20c\n\20\3\21\3\21\3\22\6\22h\n\22\r\22\16\22i\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25{\n\25"+
		"\f\25\16\25~\13\25\3\25\5\25\u0081\n\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\7\26\u008b\n\26\f\26\16\26\u008e\13\26\3\26\3\26\3\26\3\26"+
		"\3\26\4|\u008c\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\6\4\2--//\5\2\'"+
		"\',,\61\61\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u009c\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3"+
		"\2\2\2\13\65\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2\2\23B\3\2\2\2\25"+
		"I\3\2\2\2\27P\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35^\3\2\2\2\37b\3\2\2\2"+
		"!d\3\2\2\2#g\3\2\2\2%m\3\2\2\2\'q\3\2\2\2)v\3\2\2\2+\u0086\3\2\2\2-.\7"+
		"*\2\2.\4\3\2\2\2/\60\7+\2\2\60\6\3\2\2\2\61\62\7}\2\2\62\b\3\2\2\2\63"+
		"\64\7\177\2\2\64\n\3\2\2\2\65\66\7t\2\2\66\67\7g\2\2\678\7v\2\289\7w\2"+
		"\29:\7t\2\2:;\7p\2\2;\f\3\2\2\2<=\7=\2\2=\16\3\2\2\2>?\t\2\2\2?\20\3\2"+
		"\2\2@A\t\3\2\2A\22\3\2\2\2BF\5\33\16\2CE\5\37\20\2DC\3\2\2\2EH\3\2\2\2"+
		"FD\3\2\2\2FG\3\2\2\2G\24\3\2\2\2HF\3\2\2\2IM\7\62\2\2JL\5\35\17\2KJ\3"+
		"\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\26\3\2\2\2OM\3\2\2\2PR\5\31\r\2"+
		"QS\5!\21\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\30\3\2\2\2VW\7\62"+
		"\2\2W[\7z\2\2XY\7\62\2\2Y[\7Z\2\2ZV\3\2\2\2ZX\3\2\2\2[\32\3\2\2\2\\]\4"+
		"\63;\2]\34\3\2\2\2^_\4\629\2_\36\3\2\2\2`c\7\62\2\2ac\5\33\16\2b`\3\2"+
		"\2\2ba\3\2\2\2c \3\2\2\2de\t\4\2\2e\"\3\2\2\2fh\t\5\2\2gf\3\2\2\2hi\3"+
		"\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\22\2\2l$\3\2\2\2mn\7k\2\2no\7"+
		"p\2\2op\7v\2\2p&\3\2\2\2qr\7o\2\2rs\7c\2\2st\7k\2\2tu\7p\2\2u(\3\2\2\2"+
		"vw\7\61\2\2wx\7\61\2\2x|\3\2\2\2y{\13\2\2\2zy\3\2\2\2{~\3\2\2\2|}\3\2"+
		"\2\2|z\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177\u0081\7\17\2\2\u0080\177\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\f\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\25\3\2\u0085*\3\2\2\2\u0086\u0087\7\61\2"+
		"\2\u0087\u0088\7,\2\2\u0088\u008c\3\2\2\2\u0089\u008b\13\2\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7,\2\2\u0090\u0091\7\61"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\26\3\2\u0093,\3\2\2\2\f\2FMTZb"+
		"i|\u0080\u008c\4\3\22\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}