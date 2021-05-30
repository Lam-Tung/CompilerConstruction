package antlr;
// Generated from C:/Users/zgaya/Documents/hda/sem8/Compiler Construction/X-Raster-E/src/main/resources/grammar\goSubset.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class goSubsetParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PACKAGE=1, FUNC=2, VAR=3, MAIN=4, NUMBER=5, WHITESPACE=6, LEFTPAREN=7, 
		RIGHTPAREN=8, LEFTBRACE=9, RIGHTBRACE=10, LEFTBRACK=11, RIGHTBRACK=12, 
		EQUALS=13, IDENTIFIER=14;
	public static final int
		RULE_sourceFile = 0, RULE_packageDecl = 1, RULE_mainDecl = 2, RULE_funcDecl = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageDecl", "mainDecl", "funcDecl", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'func'", "'var'", "'main'", null, null, "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PACKAGE", "FUNC", "VAR", "MAIN", "NUMBER", "WHITESPACE", "LEFTPAREN", 
			"RIGHTPAREN", "LEFTBRACE", "RIGHTBRACE", "LEFTBRACK", "RIGHTBRACK", "EQUALS", 
			"IDENTIFIER"
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
	public String getGrammarFileName() { return "goSubset.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public goSubsetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceFileContext extends ParserRuleContext {
		public PackageDeclContext packageDecl() {
			return getRuleContext(PackageDeclContext.class,0);
		}
		public MainDeclContext mainDecl() {
			return getRuleContext(MainDeclContext.class,0);
		}
		public TerminalNode EOF() { return getToken(goSubsetParser.EOF, 0); }
		public List<FuncDeclContext> funcDecl() {
			return getRuleContexts(FuncDeclContext.class);
		}
		public FuncDeclContext funcDecl(int i) {
			return getRuleContext(FuncDeclContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitSourceFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitSourceFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			packageDecl();
			setState(11);
			mainDecl();
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(12);
				funcDecl();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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

	public static class PackageDeclContext extends ParserRuleContext {
		public Token packageName;
		public TerminalNode PACKAGE() { return getToken(goSubsetParser.PACKAGE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(goSubsetParser.IDENTIFIER, 0); }
		public TerminalNode MAIN() { return getToken(goSubsetParser.MAIN, 0); }
		public PackageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterPackageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitPackageDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitPackageDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclContext packageDecl() throws RecognitionException {
		PackageDeclContext _localctx = new PackageDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDecl);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(PACKAGE);
				setState(21);
				((PackageDeclContext)_localctx).packageName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(PACKAGE);
				setState(23);
				((PackageDeclContext)_localctx).packageName = match(MAIN);
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

	public static class MainDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(goSubsetParser.FUNC, 0); }
		public TerminalNode MAIN() { return getToken(goSubsetParser.MAIN, 0); }
		public TerminalNode LEFTPAREN() { return getToken(goSubsetParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(goSubsetParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTBRACE() { return getToken(goSubsetParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(goSubsetParser.RIGHTBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MainDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterMainDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitMainDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitMainDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclContext mainDecl() throws RecognitionException {
		MainDeclContext _localctx = new MainDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(FUNC);
			setState(27);
			match(MAIN);
			setState(28);
			match(LEFTPAREN);
			setState(29);
			match(RIGHTPAREN);
			setState(30);
			match(LEFTBRACE);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(31);
				expr();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(RIGHTBRACE);
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

	public static class FuncDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(goSubsetParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(goSubsetParser.IDENTIFIER, 0); }
		public TerminalNode LEFTPAREN() { return getToken(goSubsetParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(goSubsetParser.RIGHTPAREN, 0); }
		public TerminalNode LEFTBRACE() { return getToken(goSubsetParser.LEFTBRACE, 0); }
		public TerminalNode RIGHTBRACE() { return getToken(goSubsetParser.RIGHTBRACE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDeclContext funcDecl() throws RecognitionException {
		FuncDeclContext _localctx = new FuncDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(FUNC);
			setState(40);
			match(IDENTIFIER);
			setState(41);
			match(LEFTPAREN);
			setState(42);
			match(RIGHTPAREN);
			setState(43);
			match(LEFTBRACE);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(44);
				expr();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(RIGHTBRACE);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(goSubsetParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(goSubsetParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(goSubsetParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(goSubsetParser.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(VAR);
			setState(53);
			match(IDENTIFIER);
			setState(54);
			match(EQUALS);
			setState(55);
			match(NUMBER);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4#\n\4\f\4\16"+
		"\4&\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\60\n\5\f\5\16\5\63\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2:\2\f\3\2\2\2\4\32"+
		"\3\2\2\2\6\34\3\2\2\2\b)\3\2\2\2\n\66\3\2\2\2\f\r\5\4\3\2\r\21\5\6\4\2"+
		"\16\20\5\b\5\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2"+
		"\22\24\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26\27\7\3\2\2"+
		"\27\33\7\20\2\2\30\31\7\3\2\2\31\33\7\6\2\2\32\26\3\2\2\2\32\30\3\2\2"+
		"\2\33\5\3\2\2\2\34\35\7\4\2\2\35\36\7\6\2\2\36\37\7\t\2\2\37 \7\n\2\2"+
		" $\7\13\2\2!#\5\n\6\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2"+
		"\2\2&$\3\2\2\2\'(\7\f\2\2(\7\3\2\2\2)*\7\4\2\2*+\7\20\2\2+,\7\t\2\2,-"+
		"\7\n\2\2-\61\7\13\2\2.\60\5\n\6\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2"+
		"\61\62\3\2\2\2\62\64\3\2\2\2\63\61\3\2\2\2\64\65\7\f\2\2\65\t\3\2\2\2"+
		"\66\67\7\5\2\2\678\7\20\2\289\7\17\2\29:\7\7\2\2:\13\3\2\2\2\6\21\32$"+
		"\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}