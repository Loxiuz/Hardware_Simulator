// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IDENTIFIER=16, 
		CONST=17, HVIDRUM=18, KOMMENTAR=19, MULTILINECOMMENTS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "IDENTIFIER", "CONST", 
			"HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'while'", "'('", "')'", "'{'", "'}'", "'>'", "'<'", 
			"'=='", "'!='", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFIER", "CONST", "HVIDRUM", "KOMMENTAR", 
			"MULTILINECOMMENTS"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\u0004\u0000\u0014\u0083\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0005\u000fP\b\u000f\n\u000f\f\u000fS\t\u000f"+
		"\u0001\u0010\u0004\u0010V\b\u0010\u000b\u0010\f\u0010W\u0001\u0010\u0001"+
		"\u0010\u0004\u0010\\\b\u0010\u000b\u0010\f\u0010]\u0003\u0010`\b\u0010"+
		"\u0001\u0011\u0004\u0011c\b\u0011\u000b\u0011\f\u0011d\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012m\b"+
		"\u0012\n\u0012\f\u0012p\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013z\b"+
		"\u0013\n\u0013\f\u0013}\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014\u0001\u0000\u0007\u0003\u0000AZ__az\u0004\u000009AZ__"+
		"az\u0001\u000009\u0002\u0000\t\n  \u0001\u0000\n\n\u0001\u0000//\u0001"+
		"\u0000**\u008a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001"+
		"\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000"+
		"\u0000\u00073\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b"+
		"7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000"+
		"\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000"+
		"\u0015B\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019G"+
		"\u0001\u0000\u0000\u0000\u001bI\u0001\u0000\u0000\u0000\u001dK\u0001\u0000"+
		"\u0000\u0000\u001fM\u0001\u0000\u0000\u0000!U\u0001\u0000\u0000\u0000"+
		"#b\u0001\u0000\u0000\u0000%h\u0001\u0000\u0000\u0000\'s\u0001\u0000\u0000"+
		"\u0000)*\u0005=\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005;\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005w\u0000\u0000./\u0005h\u0000"+
		"\u0000/0\u0005i\u0000\u000001\u0005l\u0000\u000012\u0005e\u0000\u0000"+
		"2\u0006\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\b\u0001\u0000\u0000"+
		"\u000056\u0005)\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005{\u0000"+
		"\u00008\f\u0001\u0000\u0000\u00009:\u0005}\u0000\u0000:\u000e\u0001\u0000"+
		"\u0000\u0000;<\u0005>\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005"+
		"<\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0005=\u0000\u0000@A\u0005"+
		"=\u0000\u0000A\u0014\u0001\u0000\u0000\u0000BC\u0005!\u0000\u0000CD\u0005"+
		"=\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0005*\u0000\u0000F\u0018"+
		"\u0001\u0000\u0000\u0000GH\u0005/\u0000\u0000H\u001a\u0001\u0000\u0000"+
		"\u0000IJ\u0005+\u0000\u0000J\u001c\u0001\u0000\u0000\u0000KL\u0005-\u0000"+
		"\u0000L\u001e\u0001\u0000\u0000\u0000MQ\u0007\u0000\u0000\u0000NP\u0007"+
		"\u0001\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R \u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TV\u0007\u0002\u0000\u0000UT\u0001\u0000"+
		"\u0000\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000X_\u0001\u0000\u0000\u0000Y[\u0005.\u0000\u0000Z\\\u0007"+
		"\u0002\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000"+
		"\u0000_Y\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\"\u0001\u0000"+
		"\u0000\u0000ac\u0007\u0003\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0006\u0011\u0000\u0000g$\u0001\u0000\u0000"+
		"\u0000hi\u0005/\u0000\u0000ij\u0005/\u0000\u0000jn\u0001\u0000\u0000\u0000"+
		"km\b\u0004\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000"+
		"nl\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000"+
		"\u0000pn\u0001\u0000\u0000\u0000qr\u0006\u0012\u0000\u0000r&\u0001\u0000"+
		"\u0000\u0000st\u0005/\u0000\u0000tu\u0005*\u0000\u0000u{\u0001\u0000\u0000"+
		"\u0000vw\u0005*\u0000\u0000wz\b\u0005\u0000\u0000xz\b\u0006\u0000\u0000"+
		"yv\u0001\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005*\u0000\u0000\u007f"+
		"\u0080\u0005/\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0006\u0013\u0000\u0000\u0082(\u0001\u0000\u0000\u0000\t\u0000QW]_dn"+
		"y{\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}