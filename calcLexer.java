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
		T__9=10, T__10=11, T__11=12, BType=13, UnaryOp=14, MulOp=15, EqOp=16, 
		CmpOp=17, Decimal_const=18, Octal_const=19, Hexadecimal_const=20, Hexadecimal_prefix=21, 
		Nonzero_digit=22, Octal_digit=23, Digit=24, Ident=25, Hexadecimal_digit=26, 
		Nondigit=27, LINE_COMMENT=28, COMMENT=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "BType", "UnaryOp", "MulOp", "EqOp", "CmpOp", 
			"Decimal_const", "Octal_const", "Hexadecimal_const", "Hexadecimal_prefix", 
			"Nonzero_digit", "Octal_digit", "Digit", "Ident", "Hexadecimal_digit", 
			"Nondigit", "LINE_COMMENT", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'const'", "','", "';'", "'='", "'('", "')'", "'{'", "'}'", "'if'", 
			"'return'", "'||'", "'&&'", "'int'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "BType", "UnaryOp", "MulOp", "EqOp", "CmpOp", "Decimal_const", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\5\21p\n"+
		"\21\3\22\3\22\3\22\3\22\3\22\5\22w\n\22\3\23\3\23\7\23{\n\23\f\23\16\23"+
		"~\13\23\3\24\3\24\7\24\u0082\n\24\f\24\16\24\u0085\13\24\3\25\3\25\6\25"+
		"\u0089\n\25\r\25\16\25\u008a\3\26\3\26\3\26\3\26\5\26\u0091\n\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\5\31\u0099\n\31\3\32\3\32\3\32\7\32\u009e\n"+
		"\32\f\32\16\32\u00a1\13\32\3\33\3\33\3\34\5\34\u00a6\n\34\3\35\3\35\3"+
		"\35\3\35\7\35\u00ac\n\35\f\35\16\35\u00af\13\35\3\35\5\35\u00b2\n\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36\u00bc\n\36\f\36\16\36\u00bf"+
		"\13\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\4\u00ad\u00bd\2 \3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" \3\2\b\5\2##--//\5\2\'\',,\61\61\4\2>>@@\5\2\62;CHch\5\2C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3?\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2"+
		"\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3\2\2\2"+
		"\25V\3\2\2\2\27]\3\2\2\2\31`\3\2\2\2\33c\3\2\2\2\35g\3\2\2\2\37i\3\2\2"+
		"\2!o\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'\177\3\2\2\2)\u0086\3\2\2\2+\u0090\3"+
		"\2\2\2-\u0092\3\2\2\2/\u0094\3\2\2\2\61\u0098\3\2\2\2\63\u009a\3\2\2\2"+
		"\65\u00a2\3\2\2\2\67\u00a5\3\2\2\29\u00a7\3\2\2\2;\u00b7\3\2\2\2=\u00c5"+
		"\3\2\2\2?@\7e\2\2@A\7q\2\2AB\7p\2\2BC\7u\2\2CD\7v\2\2D\4\3\2\2\2EF\7."+
		"\2\2F\6\3\2\2\2GH\7=\2\2H\b\3\2\2\2IJ\7?\2\2J\n\3\2\2\2KL\7*\2\2L\f\3"+
		"\2\2\2MN\7+\2\2N\16\3\2\2\2OP\7}\2\2P\20\3\2\2\2QR\7\177\2\2R\22\3\2\2"+
		"\2ST\7k\2\2TU\7h\2\2U\24\3\2\2\2VW\7t\2\2WX\7g\2\2XY\7v\2\2YZ\7w\2\2Z"+
		"[\7t\2\2[\\\7p\2\2\\\26\3\2\2\2]^\7~\2\2^_\7~\2\2_\30\3\2\2\2`a\7(\2\2"+
		"ab\7(\2\2b\32\3\2\2\2cd\7k\2\2de\7p\2\2ef\7v\2\2f\34\3\2\2\2gh\t\2\2\2"+
		"h\36\3\2\2\2ij\t\3\2\2j \3\2\2\2kl\7#\2\2lp\7?\2\2mn\7?\2\2np\7?\2\2o"+
		"k\3\2\2\2om\3\2\2\2p\"\3\2\2\2qw\t\4\2\2rs\7>\2\2sw\7?\2\2tu\7@\2\2uw"+
		"\7?\2\2vq\3\2\2\2vr\3\2\2\2vt\3\2\2\2w$\3\2\2\2x|\5-\27\2y{\5\61\31\2"+
		"zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}&\3\2\2\2~|\3\2\2\2\177\u0083"+
		"\7\62\2\2\u0080\u0082\5/\30\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084(\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0086\u0088\5+\26\2\u0087\u0089\5\65\33\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b*\3\2\2\2"+
		"\u008c\u008d\7\62\2\2\u008d\u0091\7z\2\2\u008e\u008f\7\62\2\2\u008f\u0091"+
		"\7Z\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091,\3\2\2\2\u0092\u0093"+
		"\4\63;\2\u0093.\3\2\2\2\u0094\u0095\4\629\2\u0095\60\3\2\2\2\u0096\u0099"+
		"\7\62\2\2\u0097\u0099\5-\27\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2"+
		"\u0099\62\3\2\2\2\u009a\u009f\5\67\34\2\u009b\u009e\5\61\31\2\u009c\u009e"+
		"\5\67\34\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\64\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\t\5\2\2\u00a3\66\3\2\2\2\u00a4\u00a6\t\6\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a68\3\2\2\2\u00a7\u00a8\7\61\2\2\u00a8\u00a9\7\61\2"+
		"\2\u00a9\u00ad\3\2\2\2\u00aa\u00ac\13\2\2\2\u00ab\u00aa\3\2\2\2\u00ac"+
		"\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b2\7\17\2\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\f\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\b\35\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9"+
		"\7,\2\2\u00b9\u00bd\3\2\2\2\u00ba\u00bc\13\2\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7,\2\2\u00c1\u00c2\7\61\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\36\2\2\u00c4<\3\2\2\2\u00c5\u00c6\t\7\2\2"+
		"\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\37\2\2\u00c8>\3\2\2\2\20\2ov|\u0083"+
		"\u008a\u0090\u0098\u009d\u009f\u00a5\u00ad\u00b1\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}