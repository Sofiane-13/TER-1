package com.aelos.xtext.mappingassistance.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMappingAssistanceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'TestDriver'", "'{'", "':='", "'('", "','", "')'", "'}'", "'observer:'", "'mock:'", "'replaceConf:'", "'AddComponent:'", "'providedServices'", "'def'", "':'", "'addBind('", "'true'", "'false'", "'INT'", "'STRING'", "'Boolean'", "'Double'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMappingAssistanceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMappingAssistanceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMappingAssistanceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMappingAssistance.g"; }



     	private MappingAssistanceGrammarAccess grammarAccess;

        public InternalMappingAssistanceParser(TokenStream input, MappingAssistanceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MappingAssistanceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMappingAssistance.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMappingAssistance.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMappingAssistance.g:66:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMappingAssistance.g:72:1: ruleModel returns [EObject current=null] : ( (lv_function_0_0= ruleAbstractModel ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:78:2: ( ( (lv_function_0_0= ruleAbstractModel ) )* )
            // InternalMappingAssistance.g:79:2: ( (lv_function_0_0= ruleAbstractModel ) )*
            {
            // InternalMappingAssistance.g:79:2: ( (lv_function_0_0= ruleAbstractModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMappingAssistance.g:80:3: (lv_function_0_0= ruleAbstractModel )
            	    {
            	    // InternalMappingAssistance.g:80:3: (lv_function_0_0= ruleAbstractModel )
            	    // InternalMappingAssistance.g:81:4: lv_function_0_0= ruleAbstractModel
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getFunctionAbstractModelParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_function_0_0=ruleAbstractModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"function",
            	      					lv_function_0_0,
            	      					"com.aelos.xtext.mappingassistance.MappingAssistance.AbstractModel");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractModel"
    // InternalMappingAssistance.g:101:1: entryRuleAbstractModel returns [EObject current=null] : iv_ruleAbstractModel= ruleAbstractModel EOF ;
    public final EObject entryRuleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractModel = null;


        try {
            // InternalMappingAssistance.g:101:54: (iv_ruleAbstractModel= ruleAbstractModel EOF )
            // InternalMappingAssistance.g:102:2: iv_ruleAbstractModel= ruleAbstractModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractModel=ruleAbstractModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractModel"


    // $ANTLR start "ruleAbstractModel"
    // InternalMappingAssistance.g:108:1: ruleAbstractModel returns [EObject current=null] : ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( ( (lv_obs_2_0= ruleObserver ) ) | ( (lv_comp_3_0= ruleComopnent ) ) | ( (lv_mock_4_0= ruleMock ) ) | ( (lv_conf_5_0= ruleConf ) ) | ( (lv_bind_6_0= ruleBindings ) ) | ( (lv_inst_7_0= ruleInstanceComp ) ) )* ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject lv_im_0_0 = null;

        EObject lv_testDr_1_0 = null;

        EObject lv_obs_2_0 = null;

        EObject lv_comp_3_0 = null;

        EObject lv_mock_4_0 = null;

        EObject lv_conf_5_0 = null;

        EObject lv_bind_6_0 = null;

        EObject lv_inst_7_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:114:2: ( ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( ( (lv_obs_2_0= ruleObserver ) ) | ( (lv_comp_3_0= ruleComopnent ) ) | ( (lv_mock_4_0= ruleMock ) ) | ( (lv_conf_5_0= ruleConf ) ) | ( (lv_bind_6_0= ruleBindings ) ) | ( (lv_inst_7_0= ruleInstanceComp ) ) )* ) )
            // InternalMappingAssistance.g:115:2: ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( ( (lv_obs_2_0= ruleObserver ) ) | ( (lv_comp_3_0= ruleComopnent ) ) | ( (lv_mock_4_0= ruleMock ) ) | ( (lv_conf_5_0= ruleConf ) ) | ( (lv_bind_6_0= ruleBindings ) ) | ( (lv_inst_7_0= ruleInstanceComp ) ) )* )
            {
            // InternalMappingAssistance.g:115:2: ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( ( (lv_obs_2_0= ruleObserver ) ) | ( (lv_comp_3_0= ruleComopnent ) ) | ( (lv_mock_4_0= ruleMock ) ) | ( (lv_conf_5_0= ruleConf ) ) | ( (lv_bind_6_0= ruleBindings ) ) | ( (lv_inst_7_0= ruleInstanceComp ) ) )* )
            // InternalMappingAssistance.g:116:3: ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( ( (lv_obs_2_0= ruleObserver ) ) | ( (lv_comp_3_0= ruleComopnent ) ) | ( (lv_mock_4_0= ruleMock ) ) | ( (lv_conf_5_0= ruleConf ) ) | ( (lv_bind_6_0= ruleBindings ) ) | ( (lv_inst_7_0= ruleInstanceComp ) ) )*
            {
            // InternalMappingAssistance.g:116:3: ( (lv_im_0_0= ruleImport ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMappingAssistance.g:117:4: (lv_im_0_0= ruleImport )
            	    {
            	    // InternalMappingAssistance.g:117:4: (lv_im_0_0= ruleImport )
            	    // InternalMappingAssistance.g:118:5: lv_im_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAbstractModelAccess().getImImportParserRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_im_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"im",
            	      						lv_im_0_0,
            	      						"com.aelos.xtext.mappingassistance.MappingAssistance.Import");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalMappingAssistance.g:135:3: ( (lv_testDr_1_0= ruleTestDriver ) )
            // InternalMappingAssistance.g:136:4: (lv_testDr_1_0= ruleTestDriver )
            {
            // InternalMappingAssistance.g:136:4: (lv_testDr_1_0= ruleTestDriver )
            // InternalMappingAssistance.g:137:5: lv_testDr_1_0= ruleTestDriver
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAbstractModelAccess().getTestDrTestDriverParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_testDr_1_0=ruleTestDriver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
              					}
              					add(
              						current,
              						"testDr",
              						lv_testDr_1_0,
              						"com.aelos.xtext.mappingassistance.MappingAssistance.TestDriver");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMappingAssistance.g:154:3: ( ( (lv_obs_2_0= ruleObserver ) ) | ( (lv_comp_3_0= ruleComopnent ) ) | ( (lv_mock_4_0= ruleMock ) ) | ( (lv_conf_5_0= ruleConf ) ) | ( (lv_bind_6_0= ruleBindings ) ) | ( (lv_inst_7_0= ruleInstanceComp ) ) )*
            loop3:
            do {
                int alt3=7;
                switch ( input.LA(1) ) {
                case 21:
                    {
                    alt3=1;
                    }
                    break;
                case 24:
                    {
                    alt3=2;
                    }
                    break;
                case 22:
                    {
                    alt3=3;
                    }
                    break;
                case 23:
                    {
                    alt3=4;
                    }
                    break;
                case 28:
                    {
                    alt3=5;
                    }
                    break;
                case 26:
                    {
                    alt3=6;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalMappingAssistance.g:155:4: ( (lv_obs_2_0= ruleObserver ) )
            	    {
            	    // InternalMappingAssistance.g:155:4: ( (lv_obs_2_0= ruleObserver ) )
            	    // InternalMappingAssistance.g:156:5: (lv_obs_2_0= ruleObserver )
            	    {
            	    // InternalMappingAssistance.g:156:5: (lv_obs_2_0= ruleObserver )
            	    // InternalMappingAssistance.g:157:6: lv_obs_2_0= ruleObserver
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAbstractModelAccess().getObsObserverParserRuleCall_2_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_obs_2_0=ruleObserver();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"obs",
            	      							lv_obs_2_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.Observer");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMappingAssistance.g:175:4: ( (lv_comp_3_0= ruleComopnent ) )
            	    {
            	    // InternalMappingAssistance.g:175:4: ( (lv_comp_3_0= ruleComopnent ) )
            	    // InternalMappingAssistance.g:176:5: (lv_comp_3_0= ruleComopnent )
            	    {
            	    // InternalMappingAssistance.g:176:5: (lv_comp_3_0= ruleComopnent )
            	    // InternalMappingAssistance.g:177:6: lv_comp_3_0= ruleComopnent
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAbstractModelAccess().getCompComopnentParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_comp_3_0=ruleComopnent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"comp",
            	      							lv_comp_3_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.Comopnent");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMappingAssistance.g:195:4: ( (lv_mock_4_0= ruleMock ) )
            	    {
            	    // InternalMappingAssistance.g:195:4: ( (lv_mock_4_0= ruleMock ) )
            	    // InternalMappingAssistance.g:196:5: (lv_mock_4_0= ruleMock )
            	    {
            	    // InternalMappingAssistance.g:196:5: (lv_mock_4_0= ruleMock )
            	    // InternalMappingAssistance.g:197:6: lv_mock_4_0= ruleMock
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAbstractModelAccess().getMockMockParserRuleCall_2_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_mock_4_0=ruleMock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"mock",
            	      							lv_mock_4_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.Mock");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMappingAssistance.g:215:4: ( (lv_conf_5_0= ruleConf ) )
            	    {
            	    // InternalMappingAssistance.g:215:4: ( (lv_conf_5_0= ruleConf ) )
            	    // InternalMappingAssistance.g:216:5: (lv_conf_5_0= ruleConf )
            	    {
            	    // InternalMappingAssistance.g:216:5: (lv_conf_5_0= ruleConf )
            	    // InternalMappingAssistance.g:217:6: lv_conf_5_0= ruleConf
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAbstractModelAccess().getConfConfParserRuleCall_2_3_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_conf_5_0=ruleConf();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"conf",
            	      							lv_conf_5_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.Conf");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMappingAssistance.g:235:4: ( (lv_bind_6_0= ruleBindings ) )
            	    {
            	    // InternalMappingAssistance.g:235:4: ( (lv_bind_6_0= ruleBindings ) )
            	    // InternalMappingAssistance.g:236:5: (lv_bind_6_0= ruleBindings )
            	    {
            	    // InternalMappingAssistance.g:236:5: (lv_bind_6_0= ruleBindings )
            	    // InternalMappingAssistance.g:237:6: lv_bind_6_0= ruleBindings
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAbstractModelAccess().getBindBindingsParserRuleCall_2_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_bind_6_0=ruleBindings();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"bind",
            	      							lv_bind_6_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.Bindings");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMappingAssistance.g:255:4: ( (lv_inst_7_0= ruleInstanceComp ) )
            	    {
            	    // InternalMappingAssistance.g:255:4: ( (lv_inst_7_0= ruleInstanceComp ) )
            	    // InternalMappingAssistance.g:256:5: (lv_inst_7_0= ruleInstanceComp )
            	    {
            	    // InternalMappingAssistance.g:256:5: (lv_inst_7_0= ruleInstanceComp )
            	    // InternalMappingAssistance.g:257:6: lv_inst_7_0= ruleInstanceComp
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAbstractModelAccess().getInstInstanceCompParserRuleCall_2_5_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_inst_7_0=ruleInstanceComp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inst",
            	      							lv_inst_7_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.InstanceComp");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractModel"


    // $ANTLR start "entryRuleImport"
    // InternalMappingAssistance.g:279:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMappingAssistance.g:279:47: (iv_ruleImport= ruleImport EOF )
            // InternalMappingAssistance.g:280:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMappingAssistance.g:286:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:292:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalMappingAssistance.g:293:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalMappingAssistance.g:293:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalMappingAssistance.g:294:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalMappingAssistance.g:298:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMappingAssistance.g:299:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMappingAssistance.g:299:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMappingAssistance.g:300:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"com.aelos.xtext.mappingassistance.MappingAssistance.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMappingAssistance.g:321:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMappingAssistance.g:321:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMappingAssistance.g:322:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMappingAssistance.g:328:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:334:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMappingAssistance.g:335:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMappingAssistance.g:335:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMappingAssistance.g:336:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMappingAssistance.g:346:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMappingAssistance.g:347:4: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMappingAssistance.g:357:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMappingAssistance.g:357:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMappingAssistance.g:358:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMappingAssistance.g:364:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:370:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMappingAssistance.g:371:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMappingAssistance.g:371:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMappingAssistance.g:372:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalMappingAssistance.g:379:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMappingAssistance.g:380:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleTestDriver"
    // InternalMappingAssistance.g:397:1: entryRuleTestDriver returns [EObject current=null] : iv_ruleTestDriver= ruleTestDriver EOF ;
    public final EObject entryRuleTestDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestDriver = null;


        try {
            // InternalMappingAssistance.g:397:51: (iv_ruleTestDriver= ruleTestDriver EOF )
            // InternalMappingAssistance.g:398:2: iv_ruleTestDriver= ruleTestDriver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTestDriverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTestDriver=ruleTestDriver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTestDriver; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTestDriver"


    // $ANTLR start "ruleTestDriver"
    // InternalMappingAssistance.g:404:1: ruleTestDriver returns [EObject current=null] : ( () otherlv_1= 'TestDriver' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )* otherlv_13= '}' ) ;
    public final EObject ruleTestDriver() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:410:2: ( ( () otherlv_1= 'TestDriver' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )* otherlv_13= '}' ) )
            // InternalMappingAssistance.g:411:2: ( () otherlv_1= 'TestDriver' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )* otherlv_13= '}' )
            {
            // InternalMappingAssistance.g:411:2: ( () otherlv_1= 'TestDriver' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )* otherlv_13= '}' )
            // InternalMappingAssistance.g:412:3: () otherlv_1= 'TestDriver' otherlv_2= '{' ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )* otherlv_13= '}'
            {
            // InternalMappingAssistance.g:412:3: ()
            // InternalMappingAssistance.g:413:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTestDriverAccess().getTestDriverAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTestDriverAccess().getTestDriverKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getTestDriverAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMappingAssistance.g:427:3: ( ( (otherlv_3= RULE_ID ) ) otherlv_4= ':=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMappingAssistance.g:428:4: ( (otherlv_3= RULE_ID ) ) otherlv_4= ':=' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= '(' ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )* otherlv_12= ')'
            	    {
            	    // InternalMappingAssistance.g:428:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMappingAssistance.g:429:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:429:5: (otherlv_3= RULE_ID )
            	    // InternalMappingAssistance.g:430:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getTestDriverRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getTestDriverAccess().getOutVarVariableCrossReference_3_0_0());
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getTestDriverAccess().getColonEqualsSignKeyword_3_1());
            	      			
            	    }
            	    // InternalMappingAssistance.g:445:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalMappingAssistance.g:446:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:446:5: (otherlv_5= RULE_ID )
            	    // InternalMappingAssistance.g:447:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getTestDriverRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getTestDriverAccess().getServiceVariableCrossReference_3_2_0());
            	      					
            	    }

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getTestDriverAccess().getFullStopKeyword_3_3());
            	      			
            	    }
            	    // InternalMappingAssistance.g:462:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalMappingAssistance.g:463:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:463:5: (otherlv_7= RULE_ID )
            	    // InternalMappingAssistance.g:464:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getTestDriverRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getTestDriverAccess().getMemberOperationCrossReference_3_4_0());
            	      					
            	    }

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getTestDriverAccess().getLeftParenthesisKeyword_3_5());
            	      			
            	    }
            	    // InternalMappingAssistance.g:479:4: ( ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:480:5: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )* ( (otherlv_11= RULE_ID ) )
            	    	    {
            	    	    // InternalMappingAssistance.g:480:5: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' )*
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( (LA6_0==RULE_ID) ) {
            	    	            int LA6_1 = input.LA(2);

            	    	            if ( (LA6_1==18) ) {
            	    	                alt6=1;
            	    	            }


            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // InternalMappingAssistance.g:481:6: ( (otherlv_9= RULE_ID ) ) otherlv_10= ','
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:481:6: ( (otherlv_9= RULE_ID ) )
            	    	    	    // InternalMappingAssistance.g:482:7: (otherlv_9= RULE_ID )
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:482:7: (otherlv_9= RULE_ID )
            	    	    	    // InternalMappingAssistance.g:483:8: otherlv_9= RULE_ID
            	    	    	    {
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      								if (current==null) {
            	    	    	      									current = createModelElement(grammarAccess.getTestDriverRule());
            	    	    	      								}
            	    	    	      							
            	    	    	    }
            	    	    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      								newLeafNode(otherlv_9, grammarAccess.getTestDriverAccess().getArgVariableCrossReference_3_6_0_0_0());
            	    	    	      							
            	    	    	    }

            	    	    	    }


            	    	    	    }

            	    	    	    otherlv_10=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      						newLeafNode(otherlv_10, grammarAccess.getTestDriverAccess().getCommaKeyword_3_6_0_1());
            	    	    	      					
            	    	    	    }

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop6;
            	    	        }
            	    	    } while (true);

            	    	    // InternalMappingAssistance.g:499:5: ( (otherlv_11= RULE_ID ) )
            	    	    // InternalMappingAssistance.g:500:6: (otherlv_11= RULE_ID )
            	    	    {
            	    	    // InternalMappingAssistance.g:500:6: (otherlv_11= RULE_ID )
            	    	    // InternalMappingAssistance.g:501:7: otherlv_11= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElement(grammarAccess.getTestDriverRule());
            	    	      							}
            	    	      						
            	    	    }
            	    	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							newLeafNode(otherlv_11, grammarAccess.getTestDriverAccess().getArgVariableCrossReference_3_6_1_0());
            	    	      						
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_12=(Token)match(input,19,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_12, grammarAccess.getTestDriverAccess().getRightParenthesisKeyword_3_7());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_13=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_13, grammarAccess.getTestDriverAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestDriver"


    // $ANTLR start "entryRuleObserver"
    // InternalMappingAssistance.g:526:1: entryRuleObserver returns [EObject current=null] : iv_ruleObserver= ruleObserver EOF ;
    public final EObject entryRuleObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserver = null;


        try {
            // InternalMappingAssistance.g:526:49: (iv_ruleObserver= ruleObserver EOF )
            // InternalMappingAssistance.g:527:2: iv_ruleObserver= ruleObserver EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObserverRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleObserver=ruleObserver();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObserver; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // InternalMappingAssistance.g:533:1: ruleObserver returns [EObject current=null] : (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' otherlv_11= '(' ( ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )* ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' ) ;
    public final EObject ruleObserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:539:2: ( (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' otherlv_11= '(' ( ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )* ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' ) )
            // InternalMappingAssistance.g:540:2: (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' otherlv_11= '(' ( ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )* ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )
            {
            // InternalMappingAssistance.g:540:2: (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' otherlv_11= '(' ( ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )* ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')' )
            // InternalMappingAssistance.g:541:3: otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' otherlv_11= '(' ( ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )* ( (otherlv_14= RULE_ID ) ) )* otherlv_15= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getObserverAccess().getObserverKeyword_0());
              		
            }
            // InternalMappingAssistance.g:545:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingAssistance.g:546:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingAssistance.g:546:4: (lv_name_1_0= RULE_ID )
            // InternalMappingAssistance.g:547:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getObserverAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObserverRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getObserverAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMappingAssistance.g:567:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:568:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:568:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:569:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObserverRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getObserverAccess().getService1VariableCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getObserverAccess().getFullStopKeyword_4());
              		
            }
            // InternalMappingAssistance.g:584:3: ( (otherlv_5= RULE_ID ) )
            // InternalMappingAssistance.g:585:4: (otherlv_5= RULE_ID )
            {
            // InternalMappingAssistance.g:585:4: (otherlv_5= RULE_ID )
            // InternalMappingAssistance.g:586:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObserverRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getObserverAccess().getMember1OperationCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getObserverAccess().getCommaKeyword_6());
              		
            }
            // InternalMappingAssistance.g:601:3: ( (otherlv_7= RULE_ID ) )
            // InternalMappingAssistance.g:602:4: (otherlv_7= RULE_ID )
            {
            // InternalMappingAssistance.g:602:4: (otherlv_7= RULE_ID )
            // InternalMappingAssistance.g:603:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObserverRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getObserverAccess().getService2VariableCrossReference_7_0());
              				
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getObserverAccess().getFullStopKeyword_8());
              		
            }
            // InternalMappingAssistance.g:618:3: ( (otherlv_9= RULE_ID ) )
            // InternalMappingAssistance.g:619:4: (otherlv_9= RULE_ID )
            {
            // InternalMappingAssistance.g:619:4: (otherlv_9= RULE_ID )
            // InternalMappingAssistance.g:620:5: otherlv_9= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getObserverRule());
              					}
              				
            }
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_9, grammarAccess.getObserverAccess().getMember2OperationCrossReference_9_0());
              				
            }

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getObserverAccess().getRightParenthesisKeyword_10());
              		
            }
            otherlv_11=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getObserverAccess().getLeftParenthesisKeyword_11());
              		
            }
            // InternalMappingAssistance.g:639:3: ( ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )* ( (otherlv_14= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMappingAssistance.g:640:4: ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )* ( (otherlv_14= RULE_ID ) )
            	    {
            	    // InternalMappingAssistance.g:640:4: ( ( (otherlv_12= RULE_ID ) ) otherlv_13= ',' )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            int LA9_1 = input.LA(2);

            	            if ( (LA9_1==18) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:641:5: ( (otherlv_12= RULE_ID ) ) otherlv_13= ','
            	    	    {
            	    	    // InternalMappingAssistance.g:641:5: ( (otherlv_12= RULE_ID ) )
            	    	    // InternalMappingAssistance.g:642:6: (otherlv_12= RULE_ID )
            	    	    {
            	    	    // InternalMappingAssistance.g:642:6: (otherlv_12= RULE_ID )
            	    	    // InternalMappingAssistance.g:643:7: otherlv_12= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElement(grammarAccess.getObserverRule());
            	    	      							}
            	    	      						
            	    	    }
            	    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							newLeafNode(otherlv_12, grammarAccess.getObserverAccess().getArgVariableCrossReference_12_0_0_0());
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_13=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_13, grammarAccess.getObserverAccess().getCommaKeyword_12_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    // InternalMappingAssistance.g:659:4: ( (otherlv_14= RULE_ID ) )
            	    // InternalMappingAssistance.g:660:5: (otherlv_14= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:660:5: (otherlv_14= RULE_ID )
            	    // InternalMappingAssistance.g:661:6: otherlv_14= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getObserverRule());
            	      						}
            	      					
            	    }
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_14, grammarAccess.getObserverAccess().getArgVariableCrossReference_12_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_15=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_15, grammarAccess.getObserverAccess().getRightParenthesisKeyword_13());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleMock"
    // InternalMappingAssistance.g:681:1: entryRuleMock returns [EObject current=null] : iv_ruleMock= ruleMock EOF ;
    public final EObject entryRuleMock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMock = null;


        try {
            // InternalMappingAssistance.g:681:45: (iv_ruleMock= ruleMock EOF )
            // InternalMappingAssistance.g:682:2: iv_ruleMock= ruleMock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMock=ruleMock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMock"


    // $ANTLR start "ruleMock"
    // InternalMappingAssistance.g:688:1: ruleMock returns [EObject current=null] : (otherlv_0= 'mock:' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) ;
    public final EObject ruleMock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:694:2: ( (otherlv_0= 'mock:' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) ) )
            // InternalMappingAssistance.g:695:2: (otherlv_0= 'mock:' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            {
            // InternalMappingAssistance.g:695:2: (otherlv_0= 'mock:' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) )
            // InternalMappingAssistance.g:696:3: otherlv_0= 'mock:' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMockAccess().getMockKeyword_0());
              		
            }
            // InternalMappingAssistance.g:700:3: ( (otherlv_1= RULE_ID ) )
            // InternalMappingAssistance.g:701:4: (otherlv_1= RULE_ID )
            {
            // InternalMappingAssistance.g:701:4: (otherlv_1= RULE_ID )
            // InternalMappingAssistance.g:702:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMockRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMockAccess().getIntentionVarVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMockAccess().getColonEqualsSignKeyword_2());
              		
            }
            // InternalMappingAssistance.g:717:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:718:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:718:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:719:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMockRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getMockAccess().getServiceVariableCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMockAccess().getFullStopKeyword_4());
              		
            }
            // InternalMappingAssistance.g:734:3: ( (otherlv_5= RULE_ID ) )
            // InternalMappingAssistance.g:735:4: (otherlv_5= RULE_ID )
            {
            // InternalMappingAssistance.g:735:4: (otherlv_5= RULE_ID )
            // InternalMappingAssistance.g:736:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMockRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getMockAccess().getMemberOperationCrossReference_5_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMock"


    // $ANTLR start "entryRuleConf"
    // InternalMappingAssistance.g:751:1: entryRuleConf returns [EObject current=null] : iv_ruleConf= ruleConf EOF ;
    public final EObject entryRuleConf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConf = null;


        try {
            // InternalMappingAssistance.g:751:45: (iv_ruleConf= ruleConf EOF )
            // InternalMappingAssistance.g:752:2: iv_ruleConf= ruleConf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConf=ruleConf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConf"


    // $ANTLR start "ruleConf"
    // InternalMappingAssistance.g:758:1: ruleConf returns [EObject current=null] : (otherlv_0= 'replaceConf:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )* ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) ) )* otherlv_12= ')' ) ;
    public final EObject ruleConf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_instVar_7_0 = null;

        EObject lv_instVar_11_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:764:2: ( (otherlv_0= 'replaceConf:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )* ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) ) )* otherlv_12= ')' ) )
            // InternalMappingAssistance.g:765:2: (otherlv_0= 'replaceConf:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )* ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) ) )* otherlv_12= ')' )
            {
            // InternalMappingAssistance.g:765:2: (otherlv_0= 'replaceConf:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )* ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) ) )* otherlv_12= ')' )
            // InternalMappingAssistance.g:766:3: otherlv_0= 'replaceConf:' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )* ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) ) )* otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConfAccess().getReplaceConfKeyword_0());
              		
            }
            // InternalMappingAssistance.g:770:3: ( (otherlv_1= RULE_ID ) )
            // InternalMappingAssistance.g:771:4: (otherlv_1= RULE_ID )
            {
            // InternalMappingAssistance.g:771:4: (otherlv_1= RULE_ID )
            // InternalMappingAssistance.g:772:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getConfAccess().getServiceVariableCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConfAccess().getFullStopKeyword_2());
              		
            }
            // InternalMappingAssistance.g:787:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:788:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:788:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:789:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConfRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getConfAccess().getMemberOperationCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConfAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalMappingAssistance.g:804:3: ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )* ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMappingAssistance.g:805:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )* ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) )
            	    {
            	    // InternalMappingAssistance.g:805:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        alt11 = dfa11.predict(input);
            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:806:5: ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ','
            	    	    {
            	    	    // InternalMappingAssistance.g:806:5: ( (otherlv_5= RULE_ID ) )
            	    	    // InternalMappingAssistance.g:807:6: (otherlv_5= RULE_ID )
            	    	    {
            	    	    // InternalMappingAssistance.g:807:6: (otherlv_5= RULE_ID )
            	    	    // InternalMappingAssistance.g:808:7: otherlv_5= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElement(grammarAccess.getConfRule());
            	    	      							}
            	    	      						
            	    	    }
            	    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							newLeafNode(otherlv_5, grammarAccess.getConfAccess().getVarConfVariableCrossReference_5_0_0_0());
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_6=(Token)match(input,16,FOLLOW_17); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_6, grammarAccess.getConfAccess().getColonEqualsSignKeyword_5_0_1());
            	    	      				
            	    	    }
            	    	    // InternalMappingAssistance.g:823:5: ( (lv_instVar_7_0= ruleAtomic ) )
            	    	    // InternalMappingAssistance.g:824:6: (lv_instVar_7_0= ruleAtomic )
            	    	    {
            	    	    // InternalMappingAssistance.g:824:6: (lv_instVar_7_0= ruleAtomic )
            	    	    // InternalMappingAssistance.g:825:7: lv_instVar_7_0= ruleAtomic
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getConfAccess().getInstVarAtomicParserRuleCall_5_0_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_instVar_7_0=ruleAtomic();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getConfRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"instVar",
            	    	      								lv_instVar_7_0,
            	    	      								"com.aelos.xtext.mappingassistance.MappingAssistance.Atomic");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_8=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_8, grammarAccess.getConfAccess().getCommaKeyword_5_0_3());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    // InternalMappingAssistance.g:847:4: ( ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) ) )
            	    // InternalMappingAssistance.g:848:5: ( (otherlv_9= RULE_ID ) ) otherlv_10= ':=' ( (lv_instVar_11_0= ruleAtomic ) )
            	    {
            	    // InternalMappingAssistance.g:848:5: ( (otherlv_9= RULE_ID ) )
            	    // InternalMappingAssistance.g:849:6: (otherlv_9= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:849:6: (otherlv_9= RULE_ID )
            	    // InternalMappingAssistance.g:850:7: otherlv_9= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getConfRule());
            	      							}
            	      						
            	    }
            	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(otherlv_9, grammarAccess.getConfAccess().getVarConfVariableCrossReference_5_1_0_0());
            	      						
            	    }

            	    }


            	    }

            	    otherlv_10=(Token)match(input,16,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_10, grammarAccess.getConfAccess().getColonEqualsSignKeyword_5_1_1());
            	      				
            	    }
            	    // InternalMappingAssistance.g:865:5: ( (lv_instVar_11_0= ruleAtomic ) )
            	    // InternalMappingAssistance.g:866:6: (lv_instVar_11_0= ruleAtomic )
            	    {
            	    // InternalMappingAssistance.g:866:6: (lv_instVar_11_0= ruleAtomic )
            	    // InternalMappingAssistance.g:867:7: lv_instVar_11_0= ruleAtomic
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getConfAccess().getInstVarAtomicParserRuleCall_5_1_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_instVar_11_0=ruleAtomic();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getConfRule());
            	      							}
            	      							add(
            	      								current,
            	      								"instVar",
            	      								lv_instVar_11_0,
            	      								"com.aelos.xtext.mappingassistance.MappingAssistance.Atomic");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getConfAccess().getRightParenthesisKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConf"


    // $ANTLR start "entryRuleAtomic"
    // InternalMappingAssistance.g:894:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMappingAssistance.g:894:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMappingAssistance.g:895:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMappingAssistance.g:901:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:907:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) ) )
            // InternalMappingAssistance.g:908:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) )
            {
            // InternalMappingAssistance.g:908:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleBoolean ) ) ) | ( () ( (lv_value_7_0= ruleDouble ) ) ) | ( () ( (otherlv_9= RULE_ID ) ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==13) ) {
                    alt13=4;
                }
                else if ( (LA13_1==EOF||LA13_1==RULE_ID||(LA13_1>=18 && LA13_1<=19)) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case 29:
            case 30:
                {
                alt13=3;
                }
                break;
            case RULE_ID:
                {
                alt13=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMappingAssistance.g:909:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMappingAssistance.g:909:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMappingAssistance.g:910:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMappingAssistance.g:910:4: ()
                    // InternalMappingAssistance.g:911:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getINTAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMappingAssistance.g:917:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMappingAssistance.g:918:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMappingAssistance.g:918:5: (lv_value_1_0= RULE_INT )
                    // InternalMappingAssistance.g:919:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:937:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalMappingAssistance.g:937:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalMappingAssistance.g:938:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalMappingAssistance.g:938:4: ()
                    // InternalMappingAssistance.g:939:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getSTRINGAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMappingAssistance.g:945:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalMappingAssistance.g:946:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalMappingAssistance.g:946:5: (lv_value_3_0= RULE_STRING )
                    // InternalMappingAssistance.g:947:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:965:3: ( () ( (lv_value_5_0= ruleBoolean ) ) )
                    {
                    // InternalMappingAssistance.g:965:3: ( () ( (lv_value_5_0= ruleBoolean ) ) )
                    // InternalMappingAssistance.g:966:4: () ( (lv_value_5_0= ruleBoolean ) )
                    {
                    // InternalMappingAssistance.g:966:4: ()
                    // InternalMappingAssistance.g:967:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBooleanAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMappingAssistance.g:973:4: ( (lv_value_5_0= ruleBoolean ) )
                    // InternalMappingAssistance.g:974:5: (lv_value_5_0= ruleBoolean )
                    {
                    // InternalMappingAssistance.g:974:5: (lv_value_5_0= ruleBoolean )
                    // InternalMappingAssistance.g:975:6: lv_value_5_0= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getValueBooleanParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"com.aelos.xtext.mappingassistance.MappingAssistance.Boolean");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:994:3: ( () ( (lv_value_7_0= ruleDouble ) ) )
                    {
                    // InternalMappingAssistance.g:994:3: ( () ( (lv_value_7_0= ruleDouble ) ) )
                    // InternalMappingAssistance.g:995:4: () ( (lv_value_7_0= ruleDouble ) )
                    {
                    // InternalMappingAssistance.g:995:4: ()
                    // InternalMappingAssistance.g:996:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getDoubleAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMappingAssistance.g:1002:4: ( (lv_value_7_0= ruleDouble ) )
                    // InternalMappingAssistance.g:1003:5: (lv_value_7_0= ruleDouble )
                    {
                    // InternalMappingAssistance.g:1003:5: (lv_value_7_0= ruleDouble )
                    // InternalMappingAssistance.g:1004:6: lv_value_7_0= ruleDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_7_0=ruleDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_7_0,
                      							"com.aelos.xtext.mappingassistance.MappingAssistance.Double");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMappingAssistance.g:1023:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalMappingAssistance.g:1023:3: ( () ( (otherlv_9= RULE_ID ) ) )
                    // InternalMappingAssistance.g:1024:4: () ( (otherlv_9= RULE_ID ) )
                    {
                    // InternalMappingAssistance.g:1024:4: ()
                    // InternalMappingAssistance.g:1025:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVariableRefAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMappingAssistance.g:1031:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMappingAssistance.g:1032:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMappingAssistance.g:1032:5: (otherlv_9= RULE_ID )
                    // InternalMappingAssistance.g:1033:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleComopnent"
    // InternalMappingAssistance.g:1049:1: entryRuleComopnent returns [EObject current=null] : iv_ruleComopnent= ruleComopnent EOF ;
    public final EObject entryRuleComopnent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComopnent = null;


        try {
            // InternalMappingAssistance.g:1049:50: (iv_ruleComopnent= ruleComopnent EOF )
            // InternalMappingAssistance.g:1050:2: iv_ruleComopnent= ruleComopnent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComopnentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComopnent=ruleComopnent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComopnent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComopnent"


    // $ANTLR start "ruleComopnent"
    // InternalMappingAssistance.g:1056:1: ruleComopnent returns [EObject current=null] : (otherlv_0= 'AddComponent:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleComopnent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:1062:2: ( (otherlv_0= 'AddComponent:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' ) )
            // InternalMappingAssistance.g:1063:2: (otherlv_0= 'AddComponent:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )
            {
            // InternalMappingAssistance.g:1063:2: (otherlv_0= 'AddComponent:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )
            // InternalMappingAssistance.g:1064:3: otherlv_0= 'AddComponent:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComopnentAccess().getAddComponentKeyword_0());
              		
            }
            // InternalMappingAssistance.g:1068:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingAssistance.g:1069:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingAssistance.g:1069:4: (lv_name_1_0= RULE_ID )
            // InternalMappingAssistance.g:1070:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getComopnentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComopnentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComopnentAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,25,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getComopnentAccess().getProvidedServicesKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComopnentAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalMappingAssistance.g:1098:3: ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMappingAssistance.g:1099:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) )
            	    {
            	    // InternalMappingAssistance.g:1099:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==RULE_ID) ) {
            	            int LA14_1 = input.LA(2);

            	            if ( (LA14_1==18) ) {
            	                alt14=1;
            	            }


            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:1100:5: ( (otherlv_5= RULE_ID ) ) otherlv_6= ','
            	    	    {
            	    	    // InternalMappingAssistance.g:1100:5: ( (otherlv_5= RULE_ID ) )
            	    	    // InternalMappingAssistance.g:1101:6: (otherlv_5= RULE_ID )
            	    	    {
            	    	    // InternalMappingAssistance.g:1101:6: (otherlv_5= RULE_ID )
            	    	    // InternalMappingAssistance.g:1102:7: otherlv_5= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElement(grammarAccess.getComopnentRule());
            	    	      							}
            	    	      						
            	    	    }
            	    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							newLeafNode(otherlv_5, grammarAccess.getComopnentAccess().getOpsOperationCrossReference_5_0_0_0());
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_6=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_6, grammarAccess.getComopnentAccess().getCommaKeyword_5_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    // InternalMappingAssistance.g:1118:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalMappingAssistance.g:1119:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:1119:5: (otherlv_7= RULE_ID )
            	    // InternalMappingAssistance.g:1120:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getComopnentRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getComopnentAccess().getOpsOperationCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_8=(Token)match(input,19,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getComopnentAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalMappingAssistance.g:1136:3: ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) && (synpred1_InternalMappingAssistance())) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMappingAssistance.g:1137:4: ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) )
            	    {
            	    // InternalMappingAssistance.g:1138:4: ( (lv_operations_9_0= ruleOperation ) )
            	    // InternalMappingAssistance.g:1139:5: (lv_operations_9_0= ruleOperation )
            	    {
            	    // InternalMappingAssistance.g:1139:5: (lv_operations_9_0= ruleOperation )
            	    // InternalMappingAssistance.g:1140:6: lv_operations_9_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComopnentAccess().getOperationsOperationParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_operations_9_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComopnentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operations",
            	      							lv_operations_9_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.Operation");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_10=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getComopnentAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComopnent"


    // $ANTLR start "entryRuleOperation"
    // InternalMappingAssistance.g:1166:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMappingAssistance.g:1166:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMappingAssistance.g:1167:2: iv_ruleOperation= ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMappingAssistance.g:1173:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_arg_3_0 = null;

        EObject lv_arg_5_0 = null;

        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:1179:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) ) )
            // InternalMappingAssistance.g:1180:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) )
            {
            // InternalMappingAssistance.g:1180:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) )
            // InternalMappingAssistance.g:1181:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getDefKeyword_0());
              		
            }
            // InternalMappingAssistance.g:1185:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingAssistance.g:1186:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingAssistance.g:1186:4: (lv_name_1_0= RULE_ID )
            // InternalMappingAssistance.g:1187:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getOperationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalMappingAssistance.g:1207:3: ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMappingAssistance.g:1208:4: ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) )
            	    {
            	    // InternalMappingAssistance.g:1208:4: ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==RULE_ID) ) {
            	            int LA17_1 = input.LA(2);

            	            if ( (LA17_1==27) ) {
            	                switch ( input.LA(3) ) {
            	                case 31:
            	                    {
            	                    int LA17_3 = input.LA(4);

            	                    if ( (LA17_3==18) ) {
            	                        alt17=1;
            	                    }


            	                    }
            	                    break;
            	                case 32:
            	                    {
            	                    int LA17_4 = input.LA(4);

            	                    if ( (LA17_4==18) ) {
            	                        alt17=1;
            	                    }


            	                    }
            	                    break;
            	                case 33:
            	                    {
            	                    int LA17_5 = input.LA(4);

            	                    if ( (LA17_5==18) ) {
            	                        alt17=1;
            	                    }


            	                    }
            	                    break;
            	                case 34:
            	                    {
            	                    int LA17_6 = input.LA(4);

            	                    if ( (LA17_6==18) ) {
            	                        alt17=1;
            	                    }


            	                    }
            	                    break;

            	                }

            	            }


            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:1209:5: ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ','
            	    	    {
            	    	    // InternalMappingAssistance.g:1209:5: ( (lv_arg_3_0= ruleVariable ) )
            	    	    // InternalMappingAssistance.g:1210:6: (lv_arg_3_0= ruleVariable )
            	    	    {
            	    	    // InternalMappingAssistance.g:1210:6: (lv_arg_3_0= ruleVariable )
            	    	    // InternalMappingAssistance.g:1211:7: lv_arg_3_0= ruleVariable
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_0_0_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_arg_3_0=ruleVariable();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getOperationRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"arg",
            	    	      								lv_arg_3_0,
            	    	      								"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_4=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    // InternalMappingAssistance.g:1233:4: ( (lv_arg_5_0= ruleVariable ) )
            	    // InternalMappingAssistance.g:1234:5: (lv_arg_5_0= ruleVariable )
            	    {
            	    // InternalMappingAssistance.g:1234:5: (lv_arg_5_0= ruleVariable )
            	    // InternalMappingAssistance.g:1235:6: lv_arg_5_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_arg_5_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOperationRule());
            	      						}
            	      						add(
            	      							current,
            	      							"arg",
            	      							lv_arg_5_0,
            	      							"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getColonKeyword_5());
              		
            }
            // InternalMappingAssistance.g:1261:3: ( (lv_type_8_0= ruleType ) )
            // InternalMappingAssistance.g:1262:4: (lv_type_8_0= ruleType )
            {
            // InternalMappingAssistance.g:1262:4: (lv_type_8_0= ruleType )
            // InternalMappingAssistance.g:1263:5: lv_type_8_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getTypeTypeEnumRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_8_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOperationRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_8_0,
              						"com.aelos.xtext.mappingassistance.MappingAssistance.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleVariable"
    // InternalMappingAssistance.g:1284:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMappingAssistance.g:1284:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMappingAssistance.g:1285:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMappingAssistance.g:1291:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:1297:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalMappingAssistance.g:1298:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalMappingAssistance.g:1298:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalMappingAssistance.g:1299:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalMappingAssistance.g:1299:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMappingAssistance.g:1300:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMappingAssistance.g:1300:4: (lv_name_0_0= RULE_ID )
            // InternalMappingAssistance.g:1301:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getVariableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
              		
            }
            // InternalMappingAssistance.g:1321:3: ( (lv_type_2_0= ruleType ) )
            // InternalMappingAssistance.g:1322:4: (lv_type_2_0= ruleType )
            {
            // InternalMappingAssistance.g:1322:4: (lv_type_2_0= ruleType )
            // InternalMappingAssistance.g:1323:5: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVariableRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"com.aelos.xtext.mappingassistance.MappingAssistance.Type");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleBindings"
    // InternalMappingAssistance.g:1344:1: entryRuleBindings returns [EObject current=null] : iv_ruleBindings= ruleBindings EOF ;
    public final EObject entryRuleBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindings = null;


        try {
            // InternalMappingAssistance.g:1344:49: (iv_ruleBindings= ruleBindings EOF )
            // InternalMappingAssistance.g:1345:2: iv_ruleBindings= ruleBindings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBindings=ruleBindings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindings; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindings"


    // $ANTLR start "ruleBindings"
    // InternalMappingAssistance.g:1351:1: ruleBindings returns [EObject current=null] : (otherlv_0= 'addBind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) ;
    public final EObject ruleBindings() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:1357:2: ( (otherlv_0= 'addBind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) )
            // InternalMappingAssistance.g:1358:2: (otherlv_0= 'addBind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            {
            // InternalMappingAssistance.g:1358:2: (otherlv_0= 'addBind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            // InternalMappingAssistance.g:1359:3: otherlv_0= 'addBind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBindingsAccess().getAddBindKeyword_0());
              		
            }
            // InternalMappingAssistance.g:1363:3: ( (otherlv_1= RULE_ID ) )
            // InternalMappingAssistance.g:1364:4: (otherlv_1= RULE_ID )
            {
            // InternalMappingAssistance.g:1364:4: (otherlv_1= RULE_ID )
            // InternalMappingAssistance.g:1365:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBindingsAccess().getFullStopKeyword_2());
              		
            }
            // InternalMappingAssistance.g:1380:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:1381:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:1381:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:1382:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getBindingsAccess().getNameServ1OperationCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBindingsAccess().getCommaKeyword_4());
              		
            }
            // InternalMappingAssistance.g:1397:3: ( (otherlv_5= RULE_ID ) )
            // InternalMappingAssistance.g:1398:4: (otherlv_5= RULE_ID )
            {
            // InternalMappingAssistance.g:1398:4: (otherlv_5= RULE_ID )
            // InternalMappingAssistance.g:1399:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getBindingsAccess().getNameComp1VariableCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBindingsAccess().getFullStopKeyword_6());
              		
            }
            // InternalMappingAssistance.g:1414:3: ( (otherlv_7= RULE_ID ) )
            // InternalMappingAssistance.g:1415:4: (otherlv_7= RULE_ID )
            {
            // InternalMappingAssistance.g:1415:4: (otherlv_7= RULE_ID )
            // InternalMappingAssistance.g:1416:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getBindingsAccess().getNameServ2OperationCrossReference_7_0());
              				
            }

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindings"


    // $ANTLR start "entryRuleInstanceComp"
    // InternalMappingAssistance.g:1435:1: entryRuleInstanceComp returns [EObject current=null] : iv_ruleInstanceComp= ruleInstanceComp EOF ;
    public final EObject entryRuleInstanceComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceComp = null;


        try {
            // InternalMappingAssistance.g:1435:53: (iv_ruleInstanceComp= ruleInstanceComp EOF )
            // InternalMappingAssistance.g:1436:2: iv_ruleInstanceComp= ruleInstanceComp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceCompRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstanceComp=ruleInstanceComp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceComp; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceComp"


    // $ANTLR start "ruleInstanceComp"
    // InternalMappingAssistance.g:1442:1: ruleInstanceComp returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleInstanceComp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:1448:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMappingAssistance.g:1449:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMappingAssistance.g:1449:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalMappingAssistance.g:1450:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceCompAccess().getDefKeyword_0());
              		
            }
            // InternalMappingAssistance.g:1454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingAssistance.g:1455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingAssistance.g:1455:4: (lv_name_1_0= RULE_ID )
            // InternalMappingAssistance.g:1456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceCompRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceCompAccess().getColonKeyword_2());
              		
            }
            // InternalMappingAssistance.g:1476:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:1477:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:1477:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:1478:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceCompRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getInstanceCompAccess().getTypeComopnentCrossReference_3_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceComp"


    // $ANTLR start "entryRuleBoolean"
    // InternalMappingAssistance.g:1493:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalMappingAssistance.g:1493:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalMappingAssistance.g:1494:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMappingAssistance.g:1500:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:1506:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMappingAssistance.g:1507:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMappingAssistance.g:1507:2: (kw= 'true' | kw= 'false' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            else if ( (LA19_0==30) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMappingAssistance.g:1508:3: kw= 'true'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:1514:3: kw= 'false'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleDouble"
    // InternalMappingAssistance.g:1523:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalMappingAssistance.g:1523:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalMappingAssistance.g:1524:2: iv_ruleDouble= ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalMappingAssistance.g:1530:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:1536:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalMappingAssistance.g:1537:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalMappingAssistance.g:1537:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalMappingAssistance.g:1538:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0());
              		
            }
            kw=(Token)match(input,13,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getDoubleAccess().getFullStopKeyword_1());
              		
            }
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_2);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_2, grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "ruleType"
    // InternalMappingAssistance.g:1561:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:1567:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalMappingAssistance.g:1568:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalMappingAssistance.g:1568:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt20=1;
                }
                break;
            case 32:
                {
                alt20=2;
                }
                break;
            case 33:
                {
                alt20=3;
                }
                break;
            case 34:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalMappingAssistance.g:1569:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalMappingAssistance.g:1569:3: (enumLiteral_0= 'INT' )
                    // InternalMappingAssistance.g:1570:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:1577:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalMappingAssistance.g:1577:3: (enumLiteral_1= 'STRING' )
                    // InternalMappingAssistance.g:1578:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:1585:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalMappingAssistance.g:1585:3: (enumLiteral_2= 'Boolean' )
                    // InternalMappingAssistance.g:1586:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:1593:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMappingAssistance.g:1593:3: (enumLiteral_3= 'Double' )
                    // InternalMappingAssistance.g:1594:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"

    // $ANTLR start synpred1_InternalMappingAssistance
    public final void synpred1_InternalMappingAssistance_fragment() throws RecognitionException {   
        // InternalMappingAssistance.g:1137:4: ( 'def' )
        // InternalMappingAssistance.g:1137:5: 'def'
        {
        match(input,26,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMappingAssistance

    // Delegated rules

    public final boolean synpred1_InternalMappingAssistance() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMappingAssistance_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\20\6\4\1\uffff\1\5\1\uffff\1\4";
    static final String dfa_3s = "\1\4\1\20\1\36\5\23\1\uffff\1\5\1\uffff\1\23";
    static final String dfa_4s = "\10\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\7\1\3\1\4\26\uffff\1\5\1\6",
            "\1\10\10\uffff\1\11\4\uffff\1\12\1\10",
            "\1\10\15\uffff\1\12\1\10",
            "\1\10\15\uffff\1\12\1\10",
            "\1\10\15\uffff\1\12\1\10",
            "\1\10\15\uffff\1\12\1\10",
            "",
            "\1\13",
            "",
            "\1\10\15\uffff\1\12\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 805:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ':=' ( (lv_instVar_7_0= ruleAtomic ) ) otherlv_8= ',' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000015E00002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000060000070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});

}