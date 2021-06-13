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
		RULE_expr = 4, RULE_varDecl = 5, RULE_varDecl_num = 6, RULE_varDecl_var = 7, 
		RULE_varAssign = 8, RULE_varAssign_num = 9, RULE_varAssign_var = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageDecl", "mainDecl", "funcDecl", "expr", "varDecl", 
			"varDecl_num", "varDecl_var", "varAssign", "varAssign_num", "varAssign_var"
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
			setState(22);
			packageDecl();
			setState(23);
			mainDecl();
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(24);
				funcDecl();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
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
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(PACKAGE);
				setState(33);
				((PackageDeclContext)_localctx).packageName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(PACKAGE);
				setState(35);
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
			setState(38);
			match(FUNC);
			setState(39);
			match(MAIN);
			setState(40);
			match(LEFTPAREN);
			setState(41);
			match(RIGHTPAREN);
			setState(42);
			match(LEFTBRACE);
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==IDENTIFIER) {
				{
				{
				setState(43);
				expr();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
			setState(51);
			match(FUNC);
			setState(52);
			match(IDENTIFIER);
			setState(53);
			match(LEFTPAREN);
			setState(54);
			match(RIGHTPAREN);
			setState(55);
			match(LEFTBRACE);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==IDENTIFIER) {
				{
				{
				setState(56);
				expr();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
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
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				varDecl();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				varAssign();
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
		public VarDecl_numContext varDecl_num() {
			return getRuleContext(VarDecl_numContext.class,0);
		}
		public VarDecl_varContext varDecl_var() {
			return getRuleContext(VarDecl_varContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				varDecl_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				varDecl_var();
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

	public static class VarDecl_numContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(goSubsetParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(goSubsetParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(goSubsetParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(goSubsetParser.NUMBER, 0); }
		public VarDecl_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarDecl_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarDecl_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarDecl_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecl_numContext varDecl_num() throws RecognitionException {
		VarDecl_numContext _localctx = new VarDecl_numContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDecl_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(VAR);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(EQUALS);
			setState(75);
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

	public static class VarDecl_varContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(goSubsetParser.VAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(goSubsetParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(goSubsetParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(goSubsetParser.EQUALS, 0); }
		public VarDecl_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarDecl_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarDecl_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarDecl_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecl_varContext varDecl_var() throws RecognitionException {
		VarDecl_varContext _localctx = new VarDecl_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varDecl_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(VAR);
			setState(78);
			match(IDENTIFIER);
			setState(79);
			match(EQUALS);
			setState(80);
			match(IDENTIFIER);
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

	public static class VarAssignContext extends ParserRuleContext {
		public VarAssign_numContext varAssign_num() {
			return getRuleContext(VarAssign_numContext.class,0);
		}
		public VarAssign_varContext varAssign_var() {
			return getRuleContext(VarAssign_varContext.class,0);
		}
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varAssign);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				varAssign_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				varAssign_var();
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

	public static class VarAssign_numContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(goSubsetParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(goSubsetParser.EQUALS, 0); }
		public TerminalNode NUMBER() { return getToken(goSubsetParser.NUMBER, 0); }
		public VarAssign_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarAssign_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarAssign_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarAssign_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssign_numContext varAssign_num() throws RecognitionException {
		VarAssign_numContext _localctx = new VarAssign_numContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varAssign_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(IDENTIFIER);
			setState(87);
			match(EQUALS);
			setState(88);
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

	public static class VarAssign_varContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(goSubsetParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(goSubsetParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(goSubsetParser.EQUALS, 0); }
		public VarAssign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssign_varContext varAssign_var() throws RecognitionException {
		VarAssign_varContext _localctx = new VarAssign_varContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varAssign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(EQUALS);
			setState(92);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\3\5\3\6\3\6\5\6E\n"+
		"\6\3\7\3\7\5\7I\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5"+
		"\nW\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20"+
		"\22\24\26\2\2\2\\\2\30\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b\65\3\2\2\2\nD\3"+
		"\2\2\2\fH\3\2\2\2\16J\3\2\2\2\20O\3\2\2\2\22V\3\2\2\2\24X\3\2\2\2\26\\"+
		"\3\2\2\2\30\31\5\4\3\2\31\35\5\6\4\2\32\34\5\b\5\2\33\32\3\2\2\2\34\37"+
		"\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\7\2\2"+
		"\3!\3\3\2\2\2\"#\7\3\2\2#\'\7\20\2\2$%\7\3\2\2%\'\7\6\2\2&\"\3\2\2\2&"+
		"$\3\2\2\2\'\5\3\2\2\2()\7\4\2\2)*\7\6\2\2*+\7\t\2\2+,\7\n\2\2,\60\7\13"+
		"\2\2-/\5\n\6\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3"+
		"\2\2\2\62\60\3\2\2\2\63\64\7\f\2\2\64\7\3\2\2\2\65\66\7\4\2\2\66\67\7"+
		"\20\2\2\678\7\t\2\289\7\n\2\29=\7\13\2\2:<\5\n\6\2;:\3\2\2\2<?\3\2\2\2"+
		"=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\f\2\2A\t\3\2\2\2BE\5\f\7"+
		"\2CE\5\22\n\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FI\5\16\b\2GI\5\20\t\2HF"+
		"\3\2\2\2HG\3\2\2\2I\r\3\2\2\2JK\7\5\2\2KL\7\20\2\2LM\7\17\2\2MN\7\7\2"+
		"\2N\17\3\2\2\2OP\7\5\2\2PQ\7\20\2\2QR\7\17\2\2RS\7\20\2\2S\21\3\2\2\2"+
		"TW\5\24\13\2UW\5\26\f\2VT\3\2\2\2VU\3\2\2\2W\23\3\2\2\2XY\7\20\2\2YZ\7"+
		"\17\2\2Z[\7\7\2\2[\25\3\2\2\2\\]\7\20\2\2]^\7\17\2\2^_\7\20\2\2_\27\3"+
		"\2\2\2\t\35&\60=DHV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}