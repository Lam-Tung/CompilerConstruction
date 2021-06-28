// Generated from C:/Users/zgaya/Documents/hda/sem8/Compiler Construction/X-Raster-E/src/main/resources/grammar\goSubset.g4 by ANTLR 4.9.1
package antlr;
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
		EQUALS=13, PLUS=14, MINUS=15, IDENTIFIER=16;
	public static final int
		RULE_sourceFile = 0, RULE_packageDecl = 1, RULE_mainDecl = 2, RULE_funcDecl = 3, 
		RULE_expr = 4, RULE_varDecl = 5, RULE_varDecl_num = 6, RULE_varDecl_var = 7, 
		RULE_varDecl_op = 8, RULE_operation = 9, RULE_varAssign = 10, RULE_varAssign_num = 11, 
		RULE_varAssign_var = 12, RULE_varAssign_op = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "packageDecl", "mainDecl", "funcDecl", "expr", "varDecl", 
			"varDecl_num", "varDecl_var", "varDecl_op", "operation", "varAssign", 
			"varAssign_num", "varAssign_var", "varAssign_op"
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
			setState(28);
			packageDecl();
			setState(29);
			mainDecl();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC) {
				{
				{
				setState(30);
				funcDecl();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(PACKAGE);
				setState(39);
				((PackageDeclContext)_localctx).packageName = match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(PACKAGE);
				setState(41);
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
			setState(44);
			match(FUNC);
			setState(45);
			match(MAIN);
			setState(46);
			match(LEFTPAREN);
			setState(47);
			match(RIGHTPAREN);
			setState(48);
			match(LEFTBRACE);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==IDENTIFIER) {
				{
				{
				setState(49);
				expr();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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
			setState(57);
			match(FUNC);
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(LEFTPAREN);
			setState(60);
			match(RIGHTPAREN);
			setState(61);
			match(LEFTBRACE);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR || _la==IDENTIFIER) {
				{
				{
				setState(62);
				expr();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				varDecl();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
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
		public VarDecl_opContext varDecl_op() {
			return getRuleContext(VarDecl_opContext.class,0);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				varDecl_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				varDecl_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				varDecl_op();
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
			setState(79);
			match(VAR);
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(EQUALS);
			setState(82);
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
			setState(84);
			match(VAR);
			setState(85);
			match(IDENTIFIER);
			setState(86);
			match(EQUALS);
			setState(87);
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

	public static class VarDecl_opContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(goSubsetParser.VAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(goSubsetParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(goSubsetParser.EQUALS, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VarDecl_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarDecl_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarDecl_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarDecl_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecl_opContext varDecl_op() throws RecognitionException {
		VarDecl_opContext _localctx = new VarDecl_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDecl_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(VAR);
			setState(90);
			match(IDENTIFIER);
			setState(91);
			match(EQUALS);
			setState(92);
			operation();
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

	public static class OperationContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(goSubsetParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(goSubsetParser.NUMBER, i);
		}
		public TerminalNode PLUS() { return getToken(goSubsetParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(goSubsetParser.MINUS, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operation);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(NUMBER);
				setState(95);
				match(PLUS);
				setState(96);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(NUMBER);
				setState(98);
				match(MINUS);
				setState(99);
				match(NUMBER);
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

	public static class VarAssignContext extends ParserRuleContext {
		public VarAssign_numContext varAssign_num() {
			return getRuleContext(VarAssign_numContext.class,0);
		}
		public VarAssign_varContext varAssign_var() {
			return getRuleContext(VarAssign_varContext.class,0);
		}
		public VarAssign_opContext varAssign_op() {
			return getRuleContext(VarAssign_opContext.class,0);
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
		enterRule(_localctx, 20, RULE_varAssign);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				varAssign_num();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				varAssign_var();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				varAssign_op();
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
		enterRule(_localctx, 22, RULE_varAssign_num);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDENTIFIER);
			setState(108);
			match(EQUALS);
			setState(109);
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
		enterRule(_localctx, 24, RULE_varAssign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(IDENTIFIER);
			setState(112);
			match(EQUALS);
			setState(113);
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

	public static class VarAssign_opContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(goSubsetParser.IDENTIFIER, 0); }
		public TerminalNode EQUALS() { return getToken(goSubsetParser.EQUALS, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public VarAssign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).enterVarAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof goSubsetListener ) ((goSubsetListener)listener).exitVarAssign_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof goSubsetVisitor ) return ((goSubsetVisitor<? extends T>)visitor).visitVarAssign_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssign_opContext varAssign_op() throws RecognitionException {
		VarAssign_opContext _localctx = new VarAssign_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varAssign_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IDENTIFIER);
			setState(116);
			match(EQUALS);
			setState(117);
			operation();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16\2%\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\65\n\4"+
		"\f\4\16\48\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16\5E\13"+
		"\5\3\5\3\5\3\6\3\6\5\6K\n\6\3\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13g\n\13\3\f\3\f\3\f\5\fl\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2"+
		"u\2\36\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\b;\3\2\2\2\nJ\3\2\2\2\fO\3\2\2\2"+
		"\16Q\3\2\2\2\20V\3\2\2\2\22[\3\2\2\2\24f\3\2\2\2\26k\3\2\2\2\30m\3\2\2"+
		"\2\32q\3\2\2\2\34u\3\2\2\2\36\37\5\4\3\2\37#\5\6\4\2 \"\5\b\5\2! \3\2"+
		"\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'\3"+
		"\3\2\2\2()\7\3\2\2)-\7\22\2\2*+\7\3\2\2+-\7\6\2\2,(\3\2\2\2,*\3\2\2\2"+
		"-\5\3\2\2\2./\7\4\2\2/\60\7\6\2\2\60\61\7\t\2\2\61\62\7\n\2\2\62\66\7"+
		"\13\2\2\63\65\5\n\6\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3"+
		"\2\2\2\679\3\2\2\28\66\3\2\2\29:\7\f\2\2:\7\3\2\2\2;<\7\4\2\2<=\7\22\2"+
		"\2=>\7\t\2\2>?\7\n\2\2?C\7\13\2\2@B\5\n\6\2A@\3\2\2\2BE\3\2\2\2CA\3\2"+
		"\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\f\2\2G\t\3\2\2\2HK\5\f\7\2IK\5"+
		"\26\f\2JH\3\2\2\2JI\3\2\2\2K\13\3\2\2\2LP\5\16\b\2MP\5\20\t\2NP\5\22\n"+
		"\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\r\3\2\2\2QR\7\5\2\2RS\7\22\2\2ST\7\17"+
		"\2\2TU\7\7\2\2U\17\3\2\2\2VW\7\5\2\2WX\7\22\2\2XY\7\17\2\2YZ\7\22\2\2"+
		"Z\21\3\2\2\2[\\\7\5\2\2\\]\7\22\2\2]^\7\17\2\2^_\5\24\13\2_\23\3\2\2\2"+
		"`a\7\7\2\2ab\7\20\2\2bg\7\7\2\2cd\7\7\2\2de\7\21\2\2eg\7\7\2\2f`\3\2\2"+
		"\2fc\3\2\2\2g\25\3\2\2\2hl\5\30\r\2il\5\32\16\2jl\5\34\17\2kh\3\2\2\2"+
		"ki\3\2\2\2kj\3\2\2\2l\27\3\2\2\2mn\7\22\2\2no\7\17\2\2op\7\7\2\2p\31\3"+
		"\2\2\2qr\7\22\2\2rs\7\17\2\2st\7\22\2\2t\33\3\2\2\2uv\7\22\2\2vw\7\17"+
		"\2\2wx\5\24\13\2x\35\3\2\2\2\n#,\66CJOfk";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}