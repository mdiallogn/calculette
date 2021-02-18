// Generated from Calculette.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		RETURN=32, TYPE=33, COMMENTAIRES=34, COMMENTAIRESMULTILIGNE=35, IDENTIFIANT=36, 
		NEWLINE=37, WS=38, ENTIER=39, UNMATCH=40;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_expr = 3, RULE_instruction = 4, 
		RULE_finInstruction = 5, RULE_assignation = 6, RULE_lecture = 7, RULE_ecriture = 8, 
		RULE_boucle = 9, RULE_branchement = 10, RULE_condition = 11, RULE_bloc = 12, 
		RULE_fonction = 13, RULE_params = 14, RULE_args = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "expr", "instruction", "finInstruction", "assignation", 
			"lecture", "ecriture", "boucle", "branchement", "condition", "bloc", 
			"fonction", "params", "args"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'-'", "'*'", "'/'", "'+'", "'('", "')'", "';'", "'read'", 
			"'write'", "'while'", "'for'", "'repeat'", "'until'", "'if'", "'else'", 
			"'true'", "'false'", "'=='", "'!='", "'<>'", "'<'", "'>'", "'<='", "'>='", 
			"'&&'", "'||'", "'!'", "'{'", "'}'", "','", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "RETURN", "TYPE", "COMMENTAIRES", 
			"COMMENTAIRESMULTILIGNE", "IDENTIFIANT", "NEWLINE", "WS", "ENTIER", "UNMATCH"
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
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private TablesSymboles tablesSymboles = new TablesSymboles();
	    private int _cur_label = 0;
	    /** générateur de nom d'étiquettes */
	    private int nextLabel() { return _cur_label++; }
	    private String evalexpr (String x, String op, String y) {
	        if ( op.equals("*")){
	            String ch =  ""+x+ ""+y+"MUL \n";
	            return ch;
	        } else if ( op.equals("+") ){
	          String ch =  ""+x+ ""+y+"ADD \n";
	          return ch;
	        }else if ( op.equals("-") ){
	          String ch =  ""+x+ ""+y+"SUB \n";
	          return ch;
	        }else if ( op.equals("/") ){
	          String ch =  ""+x+ ""+y+"DIV \n";
	          return ch;
	        }
	         else {
	           System.err.println("Opérateur arithmétique incorrect : '"+op+"'");
	           throw new IllegalArgumentException("Opérateur arithmétique incorrect : '"+op+"'");
	        }
	    }

	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			calcul();
			setState(33);
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

	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public FonctionContext fonction;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(35);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43);
					match(NEWLINE);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			 int entry = nextLabel(); _localctx.code += "  JUMP " + entry + "\n"; 
			setState(53);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					match(NEWLINE);
					}
					} 
				}
				setState(55);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(56);
				((CalculContext)_localctx).fonction = fonction();
				 _localctx.code += ((CalculContext)_localctx).fonction.code+"\n"; 
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					match(NEWLINE);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			 _localctx.code += "LABEL " + entry + "\n"; 
			{
			setState(71);
			((CalculContext)_localctx).instruction = instruction();
			 _localctx.code += ((CalculContext)_localctx).instruction.code+"\n"; 
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__28) | (1L << RETURN) | (1L << IDENTIFIANT) | (1L << NEWLINE) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(74);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code+"\n"; 
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "  HALT \n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
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
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExprContext expr;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(85);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(86);
				finInstruction();

				          // a completer
				          tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "int");
				          ((DeclContext)_localctx).code =  "PUSHI 0\n"; //(((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null)+(((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null);
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(TYPE);
				setState(90);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(91);
				match(T__0);
				setState(92);
				((DeclContext)_localctx).expr = expr(0);
				setState(93);
				finInstruction();

				          // a completer
				          tablesSymboles.putVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "int");
				          ((DeclContext)_localctx).code =   ((DeclContext)_localctx).expr.code;
				      
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

	public static class ExprContext extends ParserRuleContext {
		public String code;
		public ExprContext a;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public ArgsContext args;
		public Token op;
		public ExprContext b;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(99);
				match(T__1);
				setState(100);
				((ExprContext)_localctx).a = expr(7);
				((ExprContext)_localctx).code =  "PUSHI 0\n"+((ExprContext)_localctx).a.code+"SUB \n";
				}
				break;
			case 2:
				{
				setState(103);
				match(T__5);
				setState(104);
				((ExprContext)_localctx).a = expr(0);
				setState(105);
				match(T__6);
				((ExprContext)_localctx).code =  ((ExprContext)_localctx).a.code;
				}
				break;
			case 3:
				{
				setState(108);
				((ExprContext)_localctx).ENTIER = match(ENTIER);
				((ExprContext)_localctx).code = " PUSHI "+(((ExprContext)_localctx).ENTIER!=null?((ExprContext)_localctx).ENTIER.getText():null)+"\n";
				}
				break;
			case 4:
				{
				setState(110);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);


				          AdresseType at = tablesSymboles.getAdresseType((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null));
				          if(at.adresse>=0){
				              ((ExprContext)_localctx).code = "PUSHG "+ at.adresse+"\n";
				          }else{
				              ((ExprContext)_localctx).code = "PUSHL "+ at.adresse+"\n";
				          }
				        
				}
				break;
			case 5:
				{
				setState(112);
				((ExprContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(113);
				match(T__5);
				setState(114);
				((ExprContext)_localctx).args = args();
				setState(115);
				match(T__6);

				             ((ExprContext)_localctx).code =  "PUSHI 0 \n"+((ExprContext)_localctx).args.code+" CALL "+tablesSymboles.getFunction((((ExprContext)_localctx).IDENTIFIANT!=null?((ExprContext)_localctx).IDENTIFIANT.getText():null)).adresse+"\n";
				                for(int i = 0; i<((ExprContext)_localctx).args.size; i=i+1)
				                {
				                  _localctx.code+="POP \n";
				                }
				            
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						((ExprContext)_localctx).b = expr(7);
						((ExprContext)_localctx).code = evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(126);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__1 || _la==T__4) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						((ExprContext)_localctx).b = expr(6);
						((ExprContext)_localctx).code = evalexpr(((ExprContext)_localctx).a.code,(((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null),((ExprContext)_localctx).b.code);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExprContext expr;
		public AssignationContext assignation;
		public LectureContext lecture;
		public EcritureContext ecriture;
		public BoucleContext boucle;
		public BranchementContext branchement;
		public BlocContext bloc;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public LectureContext lecture() {
			return getRuleContext(LectureContext.class,0);
		}
		public EcritureContext ecriture() {
			return getRuleContext(EcritureContext.class,0);
		}
		public BoucleContext boucle() {
			return getRuleContext(BoucleContext.class,0);
		}
		public BranchementContext branchement() {
			return getRuleContext(BranchementContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CalculetteParser.RETURN, 0); }
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				((InstructionContext)_localctx).expr = expr(0);
				setState(136);
				finInstruction();

				             ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expr.code;
				         
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((InstructionContext)_localctx).assignation = assignation();
				setState(140);
				finInstruction();


				             ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				         
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				finInstruction();

				             ((InstructionContext)_localctx).code = "";
				         
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				((InstructionContext)_localctx).lecture = lecture();
				setState(147);
				finInstruction();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).lecture.code;
				    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				((InstructionContext)_localctx).ecriture = ecriture();
				setState(151);
				finInstruction();

				       ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).ecriture.code;
				    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				((InstructionContext)_localctx).boucle = boucle();

				      ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).boucle.code;
				    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(157);
				((InstructionContext)_localctx).branchement = branchement();

				      ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).branchement.code;
				    
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(160);
				((InstructionContext)_localctx).bloc = bloc();
				setState(161);
				finInstruction();

				        ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				    
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(164);
				match(RETURN);
				setState(165);
				((InstructionContext)_localctx).expr = expr(0);
				setState(166);
				finInstruction();

				          // ajout
				          AdresseType at = tablesSymboles.getAdresseType("return");
				          ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expr.code + "STOREL " + at.adresse  + "\n   RETURN\n";
				        
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(171);
					_la = _input.LA(1);
					if ( !(_la==T__7 || _la==NEWLINE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(174); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExprContext expr;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(177);
			match(T__0);
			setState(178);
			((AssignationContext)_localctx).expr = expr(0);
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(179);
				finInstruction();
				}
				break;
			}

			           AdresseType at = tablesSymboles.getAdresseType((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
			           if(at.adresse>=0){
			           ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expr.code + "STOREG " + at.adresse  + "\n";
			         }else{
			           ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expr.code + "STOREL " + at.adresse  + "\n";
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

	public static class LectureContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public LectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterLecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitLecture(this);
		}
	}

	public final LectureContext lecture() throws RecognitionException {
		LectureContext _localctx = new LectureContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lecture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__8);
			setState(185);
			match(T__5);
			setState(186);
			((LectureContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(187);
			match(T__6);

			          AdresseType at = tablesSymboles.getAdresseType((((LectureContext)_localctx).IDENTIFIANT!=null?((LectureContext)_localctx).IDENTIFIANT.getText():null));
			          ((LectureContext)_localctx).code =  "READ\n";
			          _localctx.code += "STOREG " + at.adresse  + "\n";

			        
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

	public static class EcritureContext extends ParserRuleContext {
		public String code;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EcritureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ecriture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterEcriture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitEcriture(this);
		}
	}

	public final EcritureContext ecriture() throws RecognitionException {
		EcritureContext _localctx = new EcritureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ecriture);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__9);
			setState(191);
			match(T__5);
			setState(192);
			((EcritureContext)_localctx).expr = expr(0);
			setState(193);
			match(T__6);

			         ((EcritureContext)_localctx).code =  ((EcritureContext)_localctx).expr.code;
			          _localctx.code += "WRITE\n";
			          _localctx.code += "POP\n";
			        
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

	public static class BoucleContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public InstructionContext i;
		public AssignationContext a;
		public ConditionContext c;
		public AssignationContext b;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public BoucleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boucle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBoucle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBoucle(this);
		}
	}

	public final BoucleContext boucle() throws RecognitionException {
		BoucleContext _localctx = new BoucleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boucle);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(T__10);
				setState(197);
				match(T__5);
				setState(198);
				((BoucleContext)_localctx).condition = condition(0);
				setState(199);
				match(T__6);
				setState(200);
				((BoucleContext)_localctx).i = instruction();

				      int outputLabel = nextLabel();
				      int inputLabel = nextLabel();
				      ((BoucleContext)_localctx).code =  "LABEL " + inputLabel +"\n" + ((BoucleContext)_localctx).condition.code + "JUMPF " + outputLabel + "\n" + ((BoucleContext)_localctx).i.code + "JUMP " + inputLabel + "\n LABEL " + outputLabel+"\n";
				    
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__11);
				setState(204);
				match(T__5);
				setState(205);
				((BoucleContext)_localctx).a = assignation();
				setState(206);
				((BoucleContext)_localctx).c = condition(0);
				setState(207);
				match(T__7);
				setState(208);
				((BoucleContext)_localctx).b = assignation();
				setState(209);
				match(T__6);
				setState(210);
				((BoucleContext)_localctx).i = instruction();

				      int outputLabel = nextLabel();
				      int inputLabel = nextLabel();
				      ((BoucleContext)_localctx).code =  ((BoucleContext)_localctx).a.code+"LABEL " + inputLabel +"\n" + ((BoucleContext)_localctx).c.code + "JUMPF " + outputLabel + "\n "+ ((BoucleContext)_localctx).i.code+((BoucleContext)_localctx).b.code  + "JUMP " + inputLabel +
				      "\n LABEL " + outputLabel+"\n";
				    
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(T__12);
				setState(214);
				((BoucleContext)_localctx).i = instruction();
				setState(215);
				match(T__13);
				setState(216);
				match(T__5);
				setState(217);
				((BoucleContext)_localctx).c = condition(0);
				setState(218);
				match(T__6);

				      int outputLabel = nextLabel();
				      int inputLabel = nextLabel();
				      ((BoucleContext)_localctx).code =  "LABEL " + inputLabel +"\n" + ((BoucleContext)_localctx).i.code +((BoucleContext)_localctx).c.code+ "JUMPF " + inputLabel + "\n";
				    
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

	public static class BranchementContext extends ParserRuleContext {
		public String code;
		public ConditionContext c;
		public InstructionContext i;
		public InstructionContext j;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BranchementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBranchement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBranchement(this);
		}
	}

	public final BranchementContext branchement() throws RecognitionException {
		BranchementContext _localctx = new BranchementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_branchement);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__14);
				setState(224);
				match(T__5);
				setState(225);
				((BranchementContext)_localctx).c = condition(0);
				setState(226);
				match(T__6);
				setState(227);
				((BranchementContext)_localctx).i = instruction();

				        int outputLabel = nextLabel();
				          ((BranchementContext)_localctx).code =  ((BranchementContext)_localctx).c.code+ "JUMPF " + outputLabel+ "\n"+((BranchementContext)_localctx).i.code +"\n LABEL "+ outputLabel +"\n";
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(T__14);
				setState(231);
				match(T__5);
				setState(232);
				((BranchementContext)_localctx).c = condition(0);
				setState(233);
				match(T__6);
				setState(234);
				((BranchementContext)_localctx).i = instruction();
				setState(235);
				match(T__15);
				setState(236);
				((BranchementContext)_localctx).j = instruction();

				        int outputLabel = nextLabel();
				        int inputLabel = nextLabel();
				        ((BranchementContext)_localctx).code =  ((BranchementContext)_localctx).c.code+"JUMPF "+outputLabel+"\n"+((BranchementContext)_localctx).i.code+"JUMP "+ inputLabel+"\n LABEL "+outputLabel+"\n "+((BranchementContext)_localctx).j.code+"\n LABEL "+inputLabel+"\n";
				      
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

	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext a;
		public ExprContext e1;
		public ExprContext e2;
		public ConditionContext b;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(242);
				match(T__16);
				 ((ConditionContext)_localctx).code =  "  PUSHI 1\n"; 
				}
				break;
			case 2:
				{
				setState(244);
				match(T__17);
				 ((ConditionContext)_localctx).code =  "  PUSHI 0\n"; 
				}
				break;
			case 3:
				{
				setState(246);
				((ConditionContext)_localctx).e1 = expr(0);
				setState(247);
				match(T__18);
				setState(248);
				((ConditionContext)_localctx).e2 = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e1.code+((ConditionContext)_localctx).e2.code+"EQUAL \n";
				}
				break;
			case 4:
				{
				setState(251);
				((ConditionContext)_localctx).e1 = expr(0);
				setState(252);
				match(T__19);
				setState(253);
				((ConditionContext)_localctx).e2 = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e1.code+((ConditionContext)_localctx).e2.code+"NEQ\n";
				}
				break;
			case 5:
				{
				setState(256);
				((ConditionContext)_localctx).e1 = expr(0);
				setState(257);
				match(T__20);
				setState(258);
				((ConditionContext)_localctx).e2 = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e1.code+((ConditionContext)_localctx).e2.code+"NEQ\n";
				}
				break;
			case 6:
				{
				setState(261);
				((ConditionContext)_localctx).e1 = expr(0);
				setState(262);
				match(T__21);
				setState(263);
				((ConditionContext)_localctx).e2 = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e1.code+((ConditionContext)_localctx).e2.code+"INF\n";
				}
				break;
			case 7:
				{
				setState(266);
				((ConditionContext)_localctx).e1 = expr(0);
				setState(267);
				match(T__22);
				setState(268);
				((ConditionContext)_localctx).e2 = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e1.code+((ConditionContext)_localctx).e2.code+"SUP\n";
				}
				break;
			case 8:
				{
				setState(271);
				((ConditionContext)_localctx).e1 = expr(0);
				setState(272);
				match(T__23);
				setState(273);
				((ConditionContext)_localctx).e2 = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e1.code+((ConditionContext)_localctx).e2.code+"INFEQ\n";
				}
				break;
			case 9:
				{
				setState(276);
				((ConditionContext)_localctx).e1 = expr(0);
				setState(277);
				match(T__24);
				setState(278);
				((ConditionContext)_localctx).e2 = expr(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).e1.code+((ConditionContext)_localctx).e2.code+"SUPEQ\n";
				}
				break;
			case 10:
				{
				setState(281);
				match(T__27);
				setState(282);
				((ConditionContext)_localctx).b = condition(1);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).b.code+"PUSHI 0\n"+"EQUAL\n";
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(287);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(288);
						match(T__25);
						setState(289);
						((ConditionContext)_localctx).b = condition(4);
						((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code+((ConditionContext)_localctx).b.code+"MUL\n";
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(292);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(293);
						match(T__26);
						setState(294);
						((ConditionContext)_localctx).b = condition(3);
						((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).a.code+((ConditionContext)_localctx).b.code+"ADD\n"; 
						}
						break;
					}
					} 
				}
				setState(301);
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

	public static class BlocContext extends ParserRuleContext {
		public String code;
		public InstructionContext instruction;
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__28);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__28) | (1L << RETURN) | (1L << IDENTIFIANT) | (1L << NEWLINE) | (1L << ENTIER))) != 0)) {
				{
				{
				setState(303);
				((BlocContext)_localctx).instruction = instruction();
				 _localctx.code += ((BlocContext)_localctx).instruction.code+"\n"; 
				}
				}
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(311);
			match(T__29);
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(NEWLINE);
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public BlocContext bloc;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fonction);
		tablesSymboles.newTableLocale();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			((FonctionContext)_localctx).TYPE = match(TYPE);
			tablesSymboles.putVar("return", (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			setState(320);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(321);
			match(T__5);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(322);
				params();
				}
			}

			setState(325);
			match(T__6);

			          int labFn = nextLabel();
			          tablesSymboles.newFunction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), labFn , (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			          ((FonctionContext)_localctx).code =  "LABEL "+labFn+"\n";
			        
			setState(327);
			((FonctionContext)_localctx).bloc = bloc();

			          _localctx.code += ((FonctionContext)_localctx).bloc.code+"RETURN\n";
			        
			}
			_ctx.stop = _input.LT(-1);
			tablesSymboles.dropTableLocale();
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

	public static class ParamsContext extends ParserRuleContext {
		public Token TYPE;
		public Token IDENTIFIANT;
		public List<TerminalNode> TYPE() { return getTokens(CalculetteParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CalculetteParser.TYPE, i);
		}
		public List<TerminalNode> IDENTIFIANT() { return getTokens(CalculetteParser.IDENTIFIANT); }
		public TerminalNode IDENTIFIANT(int i) {
			return getToken(CalculetteParser.IDENTIFIANT, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			((ParamsContext)_localctx).TYPE = match(TYPE);
			setState(331);
			((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

			            // code java gérant la déclaration de "la variable" de retour de la fonction
			            tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));

			        
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(333);
				match(T__30);
				setState(334);
				((ParamsContext)_localctx).TYPE = match(TYPE);
				setState(335);
				((ParamsContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				                // code java gérant une variable locale (argi)
				                tablesSymboles.putVar((((ParamsContext)_localctx).IDENTIFIANT!=null?((ParamsContext)_localctx).IDENTIFIANT.getText():null), (((ParamsContext)_localctx).TYPE!=null?((ParamsContext)_localctx).TYPE.getText():null));

				            
				}
				}
				setState(341);
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

	public static class ArgsContext extends ParserRuleContext {
		public String code;
		public int size;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_args);
		 ((ArgsContext)_localctx).code =  new String(); ((ArgsContext)_localctx).size =  0; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << IDENTIFIANT) | (1L << ENTIER))) != 0)) {
				{
				setState(342);
				((ArgsContext)_localctx).expr = expr(0);

				        // code java pour première expression pour arg
				      _localctx.code+= ((ArgsContext)_localctx).expr.code;
				      _localctx.size+=1;
				    
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__30) {
					{
					{
					setState(344);
					match(T__30);
					setState(345);
					((ArgsContext)_localctx).expr = expr(0);

					     _localctx.code+= ((ArgsContext)_localctx).expr.code;
					     _localctx.size+=1;
					        // code java pour expression suivante pour arg
					    
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 11:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3"+
		"\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3"+
		"\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3P\n\3\f\3\16"+
		"\3S\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4c"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0085"+
		"\n\5\f\5\16\5\u0088\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00ac\n\6\3\7\6\7\u00af\n\7\r\7\16\7\u00b0\3"+
		"\b\3\b\3\b\3\b\5\b\u00b7\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00e0\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00f2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0120"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u012c\n\r\f\r\16\r\u012f"+
		"\13\r\3\16\3\16\3\16\3\16\7\16\u0135\n\16\f\16\16\16\u0138\13\16\3\16"+
		"\3\16\7\16\u013c\n\16\f\16\16\16\u013f\13\16\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0146\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u0154\n\20\f\20\16\20\u0157\13\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u015f\n\21\f\21\16\21\u0162\13\21\5\21\u0164\n\21\3\21\2\4"+
		"\b\30\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\5\6\4\2\4\4\7"+
		"\7\4\2\n\n\'\'\2\u0180\2\"\3\2\2\2\4*\3\2\2\2\6b\3\2\2\2\bx\3\2\2\2\n"+
		"\u00ab\3\2\2\2\f\u00ae\3\2\2\2\16\u00b2\3\2\2\2\20\u00ba\3\2\2\2\22\u00c0"+
		"\3\2\2\2\24\u00df\3\2\2\2\26\u00f1\3\2\2\2\30\u011f\3\2\2\2\32\u0130\3"+
		"\2\2\2\34\u0140\3\2\2\2\36\u014c\3\2\2\2 \u0163\3\2\2\2\"#\5\4\3\2#$\7"+
		"\2\2\3$\3\3\2\2\2%&\5\6\4\2&\'\b\3\1\2\')\3\2\2\2(%\3\2\2\2),\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+\60\3\2\2\2,*\3\2\2\2-/\7\'\2\2.-\3\2\2\2/\62\3\2"+
		"\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\67\b\3\1"+
		"\2\64\66\7\'\2\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28"+
		"?\3\2\2\29\67\3\2\2\2:;\5\34\17\2;<\b\3\1\2<>\3\2\2\2=:\3\2\2\2>A\3\2"+
		"\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\7\'\2\2CB\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\b\3\1\2IJ\5\n\6\2JK\b\3"+
		"\1\2KQ\3\2\2\2LM\5\n\6\2MN\b\3\1\2NP\3\2\2\2OL\3\2\2\2PS\3\2\2\2QO\3\2"+
		"\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\b\3\1\2U\5\3\2\2\2VW\7#\2\2WX\7&"+
		"\2\2XY\5\f\7\2YZ\b\4\1\2Zc\3\2\2\2[\\\7#\2\2\\]\7&\2\2]^\7\3\2\2^_\5\b"+
		"\5\2_`\5\f\7\2`a\b\4\1\2ac\3\2\2\2bV\3\2\2\2b[\3\2\2\2c\7\3\2\2\2de\b"+
		"\5\1\2ef\7\4\2\2fg\5\b\5\tgh\b\5\1\2hy\3\2\2\2ij\7\b\2\2jk\5\b\5\2kl\7"+
		"\t\2\2lm\b\5\1\2my\3\2\2\2no\7)\2\2oy\b\5\1\2pq\7&\2\2qy\b\5\1\2rs\7&"+
		"\2\2st\7\b\2\2tu\5 \21\2uv\7\t\2\2vw\b\5\1\2wy\3\2\2\2xd\3\2\2\2xi\3\2"+
		"\2\2xn\3\2\2\2xp\3\2\2\2xr\3\2\2\2y\u0086\3\2\2\2z{\f\b\2\2{|\t\2\2\2"+
		"|}\5\b\5\t}~\b\5\1\2~\u0085\3\2\2\2\177\u0080\f\7\2\2\u0080\u0081\t\3"+
		"\2\2\u0081\u0082\5\b\5\b\u0082\u0083\b\5\1\2\u0083\u0085\3\2\2\2\u0084"+
		"z\3\2\2\2\u0084\177\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\t\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\b\5\2"+
		"\u008a\u008b\5\f\7\2\u008b\u008c\b\6\1\2\u008c\u00ac\3\2\2\2\u008d\u008e"+
		"\5\16\b\2\u008e\u008f\5\f\7\2\u008f\u0090\b\6\1\2\u0090\u00ac\3\2\2\2"+
		"\u0091\u0092\5\f\7\2\u0092\u0093\b\6\1\2\u0093\u00ac\3\2\2\2\u0094\u0095"+
		"\5\20\t\2\u0095\u0096\5\f\7\2\u0096\u0097\b\6\1\2\u0097\u00ac\3\2\2\2"+
		"\u0098\u0099\5\22\n\2\u0099\u009a\5\f\7\2\u009a\u009b\b\6\1\2\u009b\u00ac"+
		"\3\2\2\2\u009c\u009d\5\24\13\2\u009d\u009e\b\6\1\2\u009e\u00ac\3\2\2\2"+
		"\u009f\u00a0\5\26\f\2\u00a0\u00a1\b\6\1\2\u00a1\u00ac\3\2\2\2\u00a2\u00a3"+
		"\5\32\16\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\b\6\1\2\u00a5\u00ac\3\2\2\2"+
		"\u00a6\u00a7\7\"\2\2\u00a7\u00a8\5\b\5\2\u00a8\u00a9\5\f\7\2\u00a9\u00aa"+
		"\b\6\1\2\u00aa\u00ac\3\2\2\2\u00ab\u0089\3\2\2\2\u00ab\u008d\3\2\2\2\u00ab"+
		"\u0091\3\2\2\2\u00ab\u0094\3\2\2\2\u00ab\u0098\3\2\2\2\u00ab\u009c\3\2"+
		"\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac"+
		"\13\3\2\2\2\u00ad\u00af\t\4\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\r\3\2\2\2\u00b2\u00b3"+
		"\7&\2\2\u00b3\u00b4\7\3\2\2\u00b4\u00b6\5\b\5\2\u00b5\u00b7\5\f\7\2\u00b6"+
		"\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\b\b"+
		"\1\2\u00b9\17\3\2\2\2\u00ba\u00bb\7\13\2\2\u00bb\u00bc\7\b\2\2\u00bc\u00bd"+
		"\7&\2\2\u00bd\u00be\7\t\2\2\u00be\u00bf\b\t\1\2\u00bf\21\3\2\2\2\u00c0"+
		"\u00c1\7\f\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5\b\5\2\u00c3\u00c4\7\t"+
		"\2\2\u00c4\u00c5\b\n\1\2\u00c5\23\3\2\2\2\u00c6\u00c7\7\r\2\2\u00c7\u00c8"+
		"\7\b\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7\t\2\2\u00ca\u00cb\5\n\6\2"+
		"\u00cb\u00cc\b\13\1\2\u00cc\u00e0\3\2\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf"+
		"\7\b\2\2\u00cf\u00d0\5\16\b\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\n\2\2"+
		"\u00d2\u00d3\5\16\b\2\u00d3\u00d4\7\t\2\2\u00d4\u00d5\5\n\6\2\u00d5\u00d6"+
		"\b\13\1\2\u00d6\u00e0\3\2\2\2\u00d7\u00d8\7\17\2\2\u00d8\u00d9\5\n\6\2"+
		"\u00d9\u00da\7\20\2\2\u00da\u00db\7\b\2\2\u00db\u00dc\5\30\r\2\u00dc\u00dd"+
		"\7\t\2\2\u00dd\u00de\b\13\1\2\u00de\u00e0\3\2\2\2\u00df\u00c6\3\2\2\2"+
		"\u00df\u00cd\3\2\2\2\u00df\u00d7\3\2\2\2\u00e0\25\3\2\2\2\u00e1\u00e2"+
		"\7\21\2\2\u00e2\u00e3\7\b\2\2\u00e3\u00e4\5\30\r\2\u00e4\u00e5\7\t\2\2"+
		"\u00e5\u00e6\5\n\6\2\u00e6\u00e7\b\f\1\2\u00e7\u00f2\3\2\2\2\u00e8\u00e9"+
		"\7\21\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec\7\t\2\2"+
		"\u00ec\u00ed\5\n\6\2\u00ed\u00ee\7\22\2\2\u00ee\u00ef\5\n\6\2\u00ef\u00f0"+
		"\b\f\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e1\3\2\2\2\u00f1\u00e8\3\2\2\2\u00f2"+
		"\27\3\2\2\2\u00f3\u00f4\b\r\1\2\u00f4\u00f5\7\23\2\2\u00f5\u0120\b\r\1"+
		"\2\u00f6\u00f7\7\24\2\2\u00f7\u0120\b\r\1\2\u00f8\u00f9\5\b\5\2\u00f9"+
		"\u00fa\7\25\2\2\u00fa\u00fb\5\b\5\2\u00fb\u00fc\b\r\1\2\u00fc\u0120\3"+
		"\2\2\2\u00fd\u00fe\5\b\5\2\u00fe\u00ff\7\26\2\2\u00ff\u0100\5\b\5\2\u0100"+
		"\u0101\b\r\1\2\u0101\u0120\3\2\2\2\u0102\u0103\5\b\5\2\u0103\u0104\7\27"+
		"\2\2\u0104\u0105\5\b\5\2\u0105\u0106\b\r\1\2\u0106\u0120\3\2\2\2\u0107"+
		"\u0108\5\b\5\2\u0108\u0109\7\30\2\2\u0109\u010a\5\b\5\2\u010a\u010b\b"+
		"\r\1\2\u010b\u0120\3\2\2\2\u010c\u010d\5\b\5\2\u010d\u010e\7\31\2\2\u010e"+
		"\u010f\5\b\5\2\u010f\u0110\b\r\1\2\u0110\u0120\3\2\2\2\u0111\u0112\5\b"+
		"\5\2\u0112\u0113\7\32\2\2\u0113\u0114\5\b\5\2\u0114\u0115\b\r\1\2\u0115"+
		"\u0120\3\2\2\2\u0116\u0117\5\b\5\2\u0117\u0118\7\33\2\2\u0118\u0119\5"+
		"\b\5\2\u0119\u011a\b\r\1\2\u011a\u0120\3\2\2\2\u011b\u011c\7\36\2\2\u011c"+
		"\u011d\5\30\r\3\u011d\u011e\b\r\1\2\u011e\u0120\3\2\2\2\u011f\u00f3\3"+
		"\2\2\2\u011f\u00f6\3\2\2\2\u011f\u00f8\3\2\2\2\u011f\u00fd\3\2\2\2\u011f"+
		"\u0102\3\2\2\2\u011f\u0107\3\2\2\2\u011f\u010c\3\2\2\2\u011f\u0111\3\2"+
		"\2\2\u011f\u0116\3\2\2\2\u011f\u011b\3\2\2\2\u0120\u012d\3\2\2\2\u0121"+
		"\u0122\f\5\2\2\u0122\u0123\7\34\2\2\u0123\u0124\5\30\r\6\u0124\u0125\b"+
		"\r\1\2\u0125\u012c\3\2\2\2\u0126\u0127\f\4\2\2\u0127\u0128\7\35\2\2\u0128"+
		"\u0129\5\30\r\5\u0129\u012a\b\r\1\2\u012a\u012c\3\2\2\2\u012b\u0121\3"+
		"\2\2\2\u012b\u0126\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\31\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0136\7\37\2"+
		"\2\u0131\u0132\5\n\6\2\u0132\u0133\b\16\1\2\u0133\u0135\3\2\2\2\u0134"+
		"\u0131\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013d\7 \2\2\u013a"+
		"\u013c\7\'\2\2\u013b\u013a\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\33\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141"+
		"\7#\2\2\u0141\u0142\b\17\1\2\u0142\u0143\7&\2\2\u0143\u0145\7\b\2\2\u0144"+
		"\u0146\5\36\20\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3"+
		"\2\2\2\u0147\u0148\7\t\2\2\u0148\u0149\b\17\1\2\u0149\u014a\5\32\16\2"+
		"\u014a\u014b\b\17\1\2\u014b\35\3\2\2\2\u014c\u014d\7#\2\2\u014d\u014e"+
		"\7&\2\2\u014e\u0155\b\20\1\2\u014f\u0150\7!\2\2\u0150\u0151\7#\2\2\u0151"+
		"\u0152\7&\2\2\u0152\u0154\b\20\1\2\u0153\u014f\3\2\2\2\u0154\u0157\3\2"+
		"\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\37\3\2\2\2\u0157\u0155"+
		"\3\2\2\2\u0158\u0159\5\b\5\2\u0159\u0160\b\21\1\2\u015a\u015b\7!\2\2\u015b"+
		"\u015c\5\b\5\2\u015c\u015d\b\21\1\2\u015d\u015f\3\2\2\2\u015e\u015a\3"+
		"\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0158\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164!\3\2\2\2\32*\60\67?EQbx\u0084\u0086\u00ab\u00b0\u00b6\u00df"+
		"\u00f1\u011f\u012b\u012d\u0136\u013d\u0145\u0155\u0160\u0163";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}