// Generated from C:/Users/zgaya/Documents/hda/sem8/Compiler Construction/X-Raster-E/src/main/resources/grammar\goSubset.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class goSubsetLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=1, FUNC=2, VAR=3, MAIN=4, NUMBER=5, WHITESPACE=6, LEFTPAREN=7, 
		RIGHTPAREN=8, LEFTBRACE=9, RIGHTBRACE=10, LEFTBRACK=11, RIGHTBRACK=12, 
		EQUALS=13, PLUS=14, MINUS=15, IDENTIFIER=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PACKAGE", "FUNC", "VAR", "MAIN", "NUMBER", "WHITESPACE", "LEFTPAREN", 
			"RIGHTPAREN", "LEFTBRACE", "RIGHTBRACE", "LEFTBRACK", "RIGHTBRACK", "EQUALS", 
			"PLUS", "MINUS", "IDENTIFIER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'func'", "'var'", "'main'", null, null, "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'='", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PACKAGE", "FUNC", "VAR", "MAIN", "NUMBER", "WHITESPACE", "LEFTPAREN", 
			"RIGHTPAREN", "LEFTBRACE", "RIGHTBRACE", "LEFTBRACK", "RIGHTBRACK", "EQUALS", 
			"PLUS", "MINUS", "IDENTIFIER"
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


	public goSubsetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "goSubset.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\6\6;\n\6\r\6\16\6<\3\7\6\7@\n\7\r\7\16\7A\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\7\21Z\n\21\f\21\16\21]\13\21\2\2\22\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\6\3\2\62"+
		";\5\2\13\f\17\17\"\"\4\2C\\c|\5\2\62;C\\c|\2`\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5+\3\2\2\2\7\60\3\2"+
		"\2\2\t\64\3\2\2\2\13:\3\2\2\2\r?\3\2\2\2\17E\3\2\2\2\21G\3\2\2\2\23I\3"+
		"\2\2\2\25K\3\2\2\2\27M\3\2\2\2\31O\3\2\2\2\33Q\3\2\2\2\35S\3\2\2\2\37"+
		"U\3\2\2\2!W\3\2\2\2#$\7r\2\2$%\7c\2\2%&\7e\2\2&\'\7m\2\2\'(\7c\2\2()\7"+
		"i\2\2)*\7g\2\2*\4\3\2\2\2+,\7h\2\2,-\7w\2\2-.\7p\2\2./\7e\2\2/\6\3\2\2"+
		"\2\60\61\7x\2\2\61\62\7c\2\2\62\63\7t\2\2\63\b\3\2\2\2\64\65\7o\2\2\65"+
		"\66\7c\2\2\66\67\7k\2\2\678\7p\2\28\n\3\2\2\29;\t\2\2\2:9\3\2\2\2;<\3"+
		"\2\2\2<:\3\2\2\2<=\3\2\2\2=\f\3\2\2\2>@\t\3\2\2?>\3\2\2\2@A\3\2\2\2A?"+
		"\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\7\2\2D\16\3\2\2\2EF\7*\2\2F\20\3\2\2"+
		"\2GH\7+\2\2H\22\3\2\2\2IJ\7}\2\2J\24\3\2\2\2KL\7\177\2\2L\26\3\2\2\2M"+
		"N\7]\2\2N\30\3\2\2\2OP\7_\2\2P\32\3\2\2\2QR\7?\2\2R\34\3\2\2\2ST\7-\2"+
		"\2T\36\3\2\2\2UV\7/\2\2V \3\2\2\2W[\t\4\2\2XZ\t\5\2\2YX\3\2\2\2Z]\3\2"+
		"\2\2[Y\3\2\2\2[\\\3\2\2\2\\\"\3\2\2\2][\3\2\2\2\6\2<A[\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}