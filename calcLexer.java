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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Decimal_const=7, Octal_const=8, 
		Hexadecimal_const=9, Hexadecimal_prefix=10, Nonzero_digit=11, Octal_digit=12, 
		Digit=13, Hexadecimal_digit=14, WS=15, FuncType=16, Ident=17, LINE_COMMENT=18, 
		COMMENT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "Decimal_const", "Octal_const", 
			"Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", "Octal_digit", 
			"Digit", "Hexadecimal_digit", "WS", "FuncType", "Ident", "LINE_COMMENT", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'return'", "';'", null, null, null, 
			null, null, null, null, null, null, "'int'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "Decimal_const", "Octal_const", 
			"Hexadecimal_const", "Hexadecimal_prefix", "Nonzero_digit", "Octal_digit", 
			"Digit", "Hexadecimal_digit", "WS", "FuncType", "Ident", "LINE_COMMENT", 
			"COMMENT"
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
		case 14:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\3\t\3\t\7\tD"+
		"\n\t\f\t\16\tG\13\t\3\n\3\n\6\nK\n\n\r\n\16\nL\3\13\3\13\3\13\3\13\5\13"+
		"S\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16[\n\16\3\17\3\17\3\20\6\20`\n\20"+
		"\r\20\16\20a\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\7\23s\n\23\f\23\16\23v\13\23\3\23\5\23y\n\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u0083\n\24\f\24\16\24\u0086\13"+
		"\24\3\24\3\24\3\24\3\24\3\24\4t\u0084\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25\3\2\4"+
		"\5\2\62;CHch\5\2\13\f\17\17\"\"\2\u0094\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)"+
		"\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r8\3\2\2\2\17"+
		":\3\2\2\2\21A\3\2\2\2\23H\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2"+
		"\33Z\3\2\2\2\35\\\3\2\2\2\37_\3\2\2\2!e\3\2\2\2#i\3\2\2\2%n\3\2\2\2\'"+
		"~\3\2\2\2)*\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2\2\2-.\7}\2\2.\b\3\2\2\2"+
		"/\60\7\177\2\2\60\n\3\2\2\2\61\62\7t\2\2\62\63\7g\2\2\63\64\7v\2\2\64"+
		"\65\7w\2\2\65\66\7t\2\2\66\67\7p\2\2\67\f\3\2\2\289\7=\2\29\16\3\2\2\2"+
		":>\5\27\f\2;=\5\33\16\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\20\3"+
		"\2\2\2@>\3\2\2\2AE\7\62\2\2BD\5\31\r\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2E"+
		"F\3\2\2\2F\22\3\2\2\2GE\3\2\2\2HJ\5\25\13\2IK\5\35\17\2JI\3\2\2\2KL\3"+
		"\2\2\2LJ\3\2\2\2LM\3\2\2\2M\24\3\2\2\2NO\7\62\2\2OS\7z\2\2PQ\7\62\2\2"+
		"QS\7Z\2\2RN\3\2\2\2RP\3\2\2\2S\26\3\2\2\2TU\4\63;\2U\30\3\2\2\2VW\4\62"+
		"9\2W\32\3\2\2\2X[\7\62\2\2Y[\5\27\f\2ZX\3\2\2\2ZY\3\2\2\2[\34\3\2\2\2"+
		"\\]\t\2\2\2]\36\3\2\2\2^`\t\3\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2"+
		"\2\2bc\3\2\2\2cd\b\20\2\2d \3\2\2\2ef\7k\2\2fg\7p\2\2gh\7v\2\2h\"\3\2"+
		"\2\2ij\7o\2\2jk\7c\2\2kl\7k\2\2lm\7p\2\2m$\3\2\2\2no\7\61\2\2op\7\61\2"+
		"\2pt\3\2\2\2qs\13\2\2\2rq\3\2\2\2sv\3\2\2\2tu\3\2\2\2tr\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2wy\7\17\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\f\2\2{|\3"+
		"\2\2\2|}\b\23\3\2}&\3\2\2\2~\177\7\61\2\2\177\u0080\7,\2\2\u0080\u0084"+
		"\3\2\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\7,\2\2\u0088\u0089\7\61\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\24\3\2\u008b(\3\2\2\2\f\2>ELRZatx\u0084\4\3\20\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}