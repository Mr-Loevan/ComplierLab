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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, BType=19, UnaryOp=20, MulOp=21, EqOp=22, CmpOp=23, Decimal_const=24, 
		Octal_const=25, Hexadecimal_const=26, Hexadecimal_prefix=27, Nonzero_digit=28, 
		Octal_digit=29, Digit=30, Ident=31, Hexadecimal_digit=32, Nondigit=33, 
		LINE_COMMENT=34, COMMENT=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "BType", "UnaryOp", "MulOp", "EqOp", "CmpOp", "Decimal_const", 
			"Octal_const", "Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", 
			"Octal_digit", "Digit", "Ident", "Hexadecimal_digit", "Nondigit", "LINE_COMMENT", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "';'", "'['", "']'", "'='", "'const'", "'{'", "'}'", "'('", 
			"')'", "'if'", "'else'", "'while'", "'break'", "'continue'", "'return'", 
			"'||'", "'&&'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "BType", "UnaryOp", "MulOp", 
			"EqOp", "CmpOp", "Decimal_const", "Octal_const", "Hexadecimal_const", 
			"Hexadecimal_prefix", "Nonzero_digit", "Octal_digit", "Digit", "Ident", 
			"Hexadecimal_digit", "Nondigit", "LINE_COMMENT", "COMMENT", "WS"
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00f3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u009a\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u00a1\n\30\3\31\3\31\7\31\u00a5\n\31\f\31\16\31\u00a8"+
		"\13\31\3\32\3\32\7\32\u00ac\n\32\f\32\16\32\u00af\13\32\3\33\3\33\6\33"+
		"\u00b3\n\33\r\33\16\33\u00b4\3\34\3\34\3\34\3\34\5\34\u00bb\n\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\5\37\u00c3\n\37\3 \3 \3 \7 \u00c8\n \f \16 "+
		"\u00cb\13 \3!\3!\3\"\5\"\u00d0\n\"\3#\3#\3#\3#\7#\u00d6\n#\f#\16#\u00d9"+
		"\13#\3#\5#\u00dc\n#\3#\3#\3#\3#\3$\3$\3$\3$\7$\u00e6\n$\f$\16$\u00e9\13"+
		"$\3$\3$\3$\3$\3$\3%\3%\3%\3%\4\u00d7\u00e7\2&\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\b\5\2"+
		"##--//\5\2\'\',,\61\61\4\2>>@@\5\2\62;CHch\5\2C\\aac|\5\2\13\f\17\17\""+
		"\"\2\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13"+
		"S\3\2\2\2\rU\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27"+
		"c\3\2\2\2\31f\3\2\2\2\33k\3\2\2\2\35q\3\2\2\2\37w\3\2\2\2!\u0080\3\2\2"+
		"\2#\u0087\3\2\2\2%\u008a\3\2\2\2\'\u008d\3\2\2\2)\u0091\3\2\2\2+\u0093"+
		"\3\2\2\2-\u0099\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2\63\u00a9\3\2\2"+
		"\2\65\u00b0\3\2\2\2\67\u00ba\3\2\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c2"+
		"\3\2\2\2?\u00c4\3\2\2\2A\u00cc\3\2\2\2C\u00cf\3\2\2\2E\u00d1\3\2\2\2G"+
		"\u00e1\3\2\2\2I\u00ef\3\2\2\2KL\7.\2\2L\4\3\2\2\2MN\7=\2\2N\6\3\2\2\2"+
		"OP\7]\2\2P\b\3\2\2\2QR\7_\2\2R\n\3\2\2\2ST\7?\2\2T\f\3\2\2\2UV\7e\2\2"+
		"VW\7q\2\2WX\7p\2\2XY\7u\2\2YZ\7v\2\2Z\16\3\2\2\2[\\\7}\2\2\\\20\3\2\2"+
		"\2]^\7\177\2\2^\22\3\2\2\2_`\7*\2\2`\24\3\2\2\2ab\7+\2\2b\26\3\2\2\2c"+
		"d\7k\2\2de\7h\2\2e\30\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2\2ij\7g\2\2j\32"+
		"\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7n\2\2op\7g\2\2p\34\3\2\2\2qr\7"+
		"d\2\2rs\7t\2\2st\7g\2\2tu\7c\2\2uv\7m\2\2v\36\3\2\2\2wx\7e\2\2xy\7q\2"+
		"\2yz\7p\2\2z{\7v\2\2{|\7k\2\2|}\7p\2\2}~\7w\2\2~\177\7g\2\2\177 \3\2\2"+
		"\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7t\2\2\u0085\u0086\7p\2\2\u0086\"\3\2\2\2\u0087\u0088"+
		"\7~\2\2\u0088\u0089\7~\2\2\u0089$\3\2\2\2\u008a\u008b\7(\2\2\u008b\u008c"+
		"\7(\2\2\u008c&\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7v\2\2\u0090(\3\2\2\2\u0091\u0092\t\2\2\2\u0092*\3\2\2\2\u0093\u0094"+
		"\t\3\2\2\u0094,\3\2\2\2\u0095\u0096\7#\2\2\u0096\u009a\7?\2\2\u0097\u0098"+
		"\7?\2\2\u0098\u009a\7?\2\2\u0099\u0095\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		".\3\2\2\2\u009b\u00a1\t\4\2\2\u009c\u009d\7>\2\2\u009d\u00a1\7?\2\2\u009e"+
		"\u009f\7@\2\2\u009f\u00a1\7?\2\2\u00a0\u009b\3\2\2\2\u00a0\u009c\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a1\60\3\2\2\2\u00a2\u00a6\59\35\2\u00a3\u00a5"+
		"\5=\37\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\62\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ad\7\62\2"+
		"\2\u00aa\u00ac\5;\36\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\64\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b2\5\67\34\2\u00b1\u00b3\5A!\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\66\3\2\2\2\u00b6\u00b7"+
		"\7\62\2\2\u00b7\u00bb\7z\2\2\u00b8\u00b9\7\62\2\2\u00b9\u00bb\7Z\2\2\u00ba"+
		"\u00b6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb8\3\2\2\2\u00bc\u00bd\4\63;\2"+
		"\u00bd:\3\2\2\2\u00be\u00bf\4\629\2\u00bf<\3\2\2\2\u00c0\u00c3\7\62\2"+
		"\2\u00c1\u00c3\59\35\2\u00c2\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3>"+
		"\3\2\2\2\u00c4\u00c9\5C\"\2\u00c5\u00c8\5=\37\2\u00c6\u00c8\5C\"\2\u00c7"+
		"\u00c5\3\2\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca@\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\t\5\2\2\u00cdB\3\2\2\2\u00ce\u00d0\t\6\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"D\3\2\2\2\u00d1\u00d2\7\61\2\2\u00d2\u00d3\7\61\2\2\u00d3\u00d7\3\2\2"+
		"\2\u00d4\u00d6\13\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00da\u00dc\7\17\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\7\f\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b#"+
		"\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3\7,\2\2\u00e3\u00e7"+
		"\3\2\2\2\u00e4\u00e6\13\2\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\b$\2\2\u00eeH\3\2\2\2\u00ef\u00f0\t\7\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b%\2\2\u00f2J\3\2\2\2\20\2\u0099\u00a0\u00a6\u00ad\u00b4\u00ba"+
		"\u00c2\u00c7\u00c9\u00cf\u00d7\u00db\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}