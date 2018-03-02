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

@SuppressWarnings("all")
public class InternalMappingAssistanceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'addMock('", "','", "')'", "'addObserveur('", "'INT'", "'STRING'", "'Boolean'", "'Double'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
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
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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

            	    				newCompositeNode(grammarAccess.getModelAccess().getFunctionAbstractModelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_function_0_0=ruleAbstractModel();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getAbstractModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractModel=ruleAbstractModel();

            state._fsp--;

             current =iv_ruleAbstractModel; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:108:1: ruleAbstractModel returns [EObject current=null] : (this_Import_0= ruleImport ( (lv_obs_1_0= ruleObserveurs ) )* ( (lv_mock_2_0= ruleMocks ) )* ( (lv_testedserv_3_0= ruleTestedservice ) )+ ( (lv_testedcomp_4_0= ruleTestedcomposant ) ) ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject lv_obs_1_0 = null;

        EObject lv_mock_2_0 = null;

        EObject lv_testedserv_3_0 = null;

        EObject lv_testedcomp_4_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:114:2: ( (this_Import_0= ruleImport ( (lv_obs_1_0= ruleObserveurs ) )* ( (lv_mock_2_0= ruleMocks ) )* ( (lv_testedserv_3_0= ruleTestedservice ) )+ ( (lv_testedcomp_4_0= ruleTestedcomposant ) ) ) )
            // InternalMappingAssistance.g:115:2: (this_Import_0= ruleImport ( (lv_obs_1_0= ruleObserveurs ) )* ( (lv_mock_2_0= ruleMocks ) )* ( (lv_testedserv_3_0= ruleTestedservice ) )+ ( (lv_testedcomp_4_0= ruleTestedcomposant ) ) )
            {
            // InternalMappingAssistance.g:115:2: (this_Import_0= ruleImport ( (lv_obs_1_0= ruleObserveurs ) )* ( (lv_mock_2_0= ruleMocks ) )* ( (lv_testedserv_3_0= ruleTestedservice ) )+ ( (lv_testedcomp_4_0= ruleTestedcomposant ) ) )
            // InternalMappingAssistance.g:116:3: this_Import_0= ruleImport ( (lv_obs_1_0= ruleObserveurs ) )* ( (lv_mock_2_0= ruleMocks ) )* ( (lv_testedserv_3_0= ruleTestedservice ) )+ ( (lv_testedcomp_4_0= ruleTestedcomposant ) )
            {

            			newCompositeNode(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_Import_0=ruleImport();

            state._fsp--;


            			current = this_Import_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMappingAssistance.g:124:3: ( (lv_obs_1_0= ruleObserveurs ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMappingAssistance.g:125:4: (lv_obs_1_0= ruleObserveurs )
            	    {
            	    // InternalMappingAssistance.g:125:4: (lv_obs_1_0= ruleObserveurs )
            	    // InternalMappingAssistance.g:126:5: lv_obs_1_0= ruleObserveurs
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractModelAccess().getObsObserveursParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_obs_1_0=ruleObserveurs();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"obs",
            	    						lv_obs_1_0,
            	    						"com.aelos.xtext.mappingassistance.MappingAssistance.Observeurs");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMappingAssistance.g:143:3: ( (lv_mock_2_0= ruleMocks ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMappingAssistance.g:144:4: (lv_mock_2_0= ruleMocks )
            	    {
            	    // InternalMappingAssistance.g:144:4: (lv_mock_2_0= ruleMocks )
            	    // InternalMappingAssistance.g:145:5: lv_mock_2_0= ruleMocks
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractModelAccess().getMockMocksParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_mock_2_0=ruleMocks();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mock",
            	    						lv_mock_2_0,
            	    						"com.aelos.xtext.mappingassistance.MappingAssistance.Mocks");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMappingAssistance.g:162:3: ( (lv_testedserv_3_0= ruleTestedservice ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    int LA4_1 = input.LA(2);

                    if ( (LA4_1==13) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalMappingAssistance.g:163:4: (lv_testedserv_3_0= ruleTestedservice )
            	    {
            	    // InternalMappingAssistance.g:163:4: (lv_testedserv_3_0= ruleTestedservice )
            	    // InternalMappingAssistance.g:164:5: lv_testedserv_3_0= ruleTestedservice
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractModelAccess().getTestedservTestedserviceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_testedserv_3_0=ruleTestedservice();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"testedserv",
            	    						lv_testedserv_3_0,
            	    						"com.aelos.xtext.mappingassistance.MappingAssistance.Testedservice");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            // InternalMappingAssistance.g:181:3: ( (lv_testedcomp_4_0= ruleTestedcomposant ) )
            // InternalMappingAssistance.g:182:4: (lv_testedcomp_4_0= ruleTestedcomposant )
            {
            // InternalMappingAssistance.g:182:4: (lv_testedcomp_4_0= ruleTestedcomposant )
            // InternalMappingAssistance.g:183:5: lv_testedcomp_4_0= ruleTestedcomposant
            {

            					newCompositeNode(grammarAccess.getAbstractModelAccess().getTestedcompTestedcomposantParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_testedcomp_4_0=ruleTestedcomposant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            					}
            					add(
            						current,
            						"testedcomp",
            						lv_testedcomp_4_0,
            						"com.aelos.xtext.mappingassistance.MappingAssistance.Testedcomposant");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalMappingAssistance.g:204:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMappingAssistance.g:204:47: (iv_ruleImport= ruleImport EOF )
            // InternalMappingAssistance.g:205:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:211:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:217:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalMappingAssistance.g:218:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalMappingAssistance.g:218:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalMappingAssistance.g:219:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMappingAssistance.g:223:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMappingAssistance.g:224:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMappingAssistance.g:224:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMappingAssistance.g:225:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


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


            	leaveRule();

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
    // InternalMappingAssistance.g:246:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMappingAssistance.g:246:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMappingAssistance.g:247:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:253:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:259:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMappingAssistance.g:260:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMappingAssistance.g:260:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMappingAssistance.g:261:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMappingAssistance.g:271:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMappingAssistance.g:272:4: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalMappingAssistance.g:282:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMappingAssistance.g:282:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMappingAssistance.g:283:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:289:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:295:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMappingAssistance.g:296:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMappingAssistance.g:296:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMappingAssistance.g:297:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMappingAssistance.g:304:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==13) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMappingAssistance.g:305:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTestedcomposant"
    // InternalMappingAssistance.g:322:1: entryRuleTestedcomposant returns [EObject current=null] : iv_ruleTestedcomposant= ruleTestedcomposant EOF ;
    public final EObject entryRuleTestedcomposant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestedcomposant = null;


        try {
            // InternalMappingAssistance.g:322:56: (iv_ruleTestedcomposant= ruleTestedcomposant EOF )
            // InternalMappingAssistance.g:323:2: iv_ruleTestedcomposant= ruleTestedcomposant EOF
            {
             newCompositeNode(grammarAccess.getTestedcomposantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestedcomposant=ruleTestedcomposant();

            state._fsp--;

             current =iv_ruleTestedcomposant; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestedcomposant"


    // $ANTLR start "ruleTestedcomposant"
    // InternalMappingAssistance.g:329:1: ruleTestedcomposant returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTestedcomposant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:335:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMappingAssistance.g:336:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMappingAssistance.g:336:2: ( (otherlv_0= RULE_ID ) )
            // InternalMappingAssistance.g:337:3: (otherlv_0= RULE_ID )
            {
            // InternalMappingAssistance.g:337:3: (otherlv_0= RULE_ID )
            // InternalMappingAssistance.g:338:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTestedcomposantRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTestedcomposantAccess().getNameCompInstanceCompCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestedcomposant"


    // $ANTLR start "entryRuleTestedservice"
    // InternalMappingAssistance.g:352:1: entryRuleTestedservice returns [EObject current=null] : iv_ruleTestedservice= ruleTestedservice EOF ;
    public final EObject entryRuleTestedservice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestedservice = null;


        try {
            // InternalMappingAssistance.g:352:54: (iv_ruleTestedservice= ruleTestedservice EOF )
            // InternalMappingAssistance.g:353:2: iv_ruleTestedservice= ruleTestedservice EOF
            {
             newCompositeNode(grammarAccess.getTestedserviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestedservice=ruleTestedservice();

            state._fsp--;

             current =iv_ruleTestedservice; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestedservice"


    // $ANTLR start "ruleTestedservice"
    // InternalMappingAssistance.g:359:1: ruleTestedservice returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTestedservice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:365:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMappingAssistance.g:366:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMappingAssistance.g:366:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMappingAssistance.g:367:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMappingAssistance.g:367:3: ( (otherlv_0= RULE_ID ) )
            // InternalMappingAssistance.g:368:4: (otherlv_0= RULE_ID )
            {
            // InternalMappingAssistance.g:368:4: (otherlv_0= RULE_ID )
            // InternalMappingAssistance.g:369:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestedserviceRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_0, grammarAccess.getTestedserviceAccess().getNameCompInstanceCompCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTestedserviceAccess().getFullStopKeyword_1());
            		
            // InternalMappingAssistance.g:384:3: ( (otherlv_2= RULE_ID ) )
            // InternalMappingAssistance.g:385:4: (otherlv_2= RULE_ID )
            {
            // InternalMappingAssistance.g:385:4: (otherlv_2= RULE_ID )
            // InternalMappingAssistance.g:386:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTestedserviceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getTestedserviceAccess().getNameServ1ServiceNameCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTestedservice"


    // $ANTLR start "entryRuleMocks"
    // InternalMappingAssistance.g:401:1: entryRuleMocks returns [EObject current=null] : iv_ruleMocks= ruleMocks EOF ;
    public final EObject entryRuleMocks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMocks = null;


        try {
            // InternalMappingAssistance.g:401:46: (iv_ruleMocks= ruleMocks EOF )
            // InternalMappingAssistance.g:402:2: iv_ruleMocks= ruleMocks EOF
            {
             newCompositeNode(grammarAccess.getMocksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMocks=ruleMocks();

            state._fsp--;

             current =iv_ruleMocks; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMocks"


    // $ANTLR start "ruleMocks"
    // InternalMappingAssistance.g:408:1: ruleMocks returns [EObject current=null] : (otherlv_0= 'addMock(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) ;
    public final EObject ruleMocks() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:414:2: ( (otherlv_0= 'addMock(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' ) )
            // InternalMappingAssistance.g:415:2: (otherlv_0= 'addMock(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            {
            // InternalMappingAssistance.g:415:2: (otherlv_0= 'addMock(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')' )
            // InternalMappingAssistance.g:416:3: otherlv_0= 'addMock(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMocksAccess().getAddMockKeyword_0());
            		
            // InternalMappingAssistance.g:420:3: ( (otherlv_1= RULE_ID ) )
            // InternalMappingAssistance.g:421:4: (otherlv_1= RULE_ID )
            {
            // InternalMappingAssistance.g:421:4: (otherlv_1= RULE_ID )
            // InternalMappingAssistance.g:422:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMocksRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getMocksAccess().getMocknameMockNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMocksAccess().getCommaKeyword_2());
            		
            // InternalMappingAssistance.g:437:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:438:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:438:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:439:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMocksRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getMocksAccess().getNameCompInstanceCompCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getMocksAccess().getFullStopKeyword_4());
            		
            // InternalMappingAssistance.g:454:3: ( (otherlv_5= RULE_ID ) )
            // InternalMappingAssistance.g:455:4: (otherlv_5= RULE_ID )
            {
            // InternalMappingAssistance.g:455:4: (otherlv_5= RULE_ID )
            // InternalMappingAssistance.g:456:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMocksRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_5, grammarAccess.getMocksAccess().getNameServ1ServiceNameCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMocksAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMocks"


    // $ANTLR start "entryRuleObserveurs"
    // InternalMappingAssistance.g:475:1: entryRuleObserveurs returns [EObject current=null] : iv_ruleObserveurs= ruleObserveurs EOF ;
    public final EObject entryRuleObserveurs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserveurs = null;


        try {
            // InternalMappingAssistance.g:475:51: (iv_ruleObserveurs= ruleObserveurs EOF )
            // InternalMappingAssistance.g:476:2: iv_ruleObserveurs= ruleObserveurs EOF
            {
             newCompositeNode(grammarAccess.getObserveursRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObserveurs=ruleObserveurs();

            state._fsp--;

             current =iv_ruleObserveurs; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObserveurs"


    // $ANTLR start "ruleObserveurs"
    // InternalMappingAssistance.g:482:1: ruleObserveurs returns [EObject current=null] : (otherlv_0= 'addObserveur(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' ) ;
    public final EObject ruleObserveurs() throws RecognitionException {
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
        Token otherlv_9=null;
        Token otherlv_10=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:488:2: ( (otherlv_0= 'addObserveur(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' ) )
            // InternalMappingAssistance.g:489:2: (otherlv_0= 'addObserveur(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )
            {
            // InternalMappingAssistance.g:489:2: (otherlv_0= 'addObserveur(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')' )
            // InternalMappingAssistance.g:490:3: otherlv_0= 'addObserveur(' ( (otherlv_1= RULE_ID ) ) otherlv_2= ',' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' ( (otherlv_7= RULE_ID ) ) otherlv_8= '.' ( (otherlv_9= RULE_ID ) ) otherlv_10= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getObserveursAccess().getAddObserveurKeyword_0());
            		
            // InternalMappingAssistance.g:494:3: ( (otherlv_1= RULE_ID ) )
            // InternalMappingAssistance.g:495:4: (otherlv_1= RULE_ID )
            {
            // InternalMappingAssistance.g:495:4: (otherlv_1= RULE_ID )
            // InternalMappingAssistance.g:496:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserveursRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_1, grammarAccess.getObserveursAccess().getObsnameObserveurNameCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getObserveursAccess().getCommaKeyword_2());
            		
            // InternalMappingAssistance.g:511:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:512:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:512:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:513:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserveursRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getObserveursAccess().getFullStopKeyword_4());
            		
            // InternalMappingAssistance.g:528:3: ( (otherlv_5= RULE_ID ) )
            // InternalMappingAssistance.g:529:4: (otherlv_5= RULE_ID )
            {
            // InternalMappingAssistance.g:529:4: (otherlv_5= RULE_ID )
            // InternalMappingAssistance.g:530:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserveursRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getObserveursAccess().getNameServ1ServiceNameCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getObserveursAccess().getCommaKeyword_6());
            		
            // InternalMappingAssistance.g:545:3: ( (otherlv_7= RULE_ID ) )
            // InternalMappingAssistance.g:546:4: (otherlv_7= RULE_ID )
            {
            // InternalMappingAssistance.g:546:4: (otherlv_7= RULE_ID )
            // InternalMappingAssistance.g:547:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserveursRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_7, grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getObserveursAccess().getFullStopKeyword_8());
            		
            // InternalMappingAssistance.g:562:3: ( (otherlv_9= RULE_ID ) )
            // InternalMappingAssistance.g:563:4: (otherlv_9= RULE_ID )
            {
            // InternalMappingAssistance.g:563:4: (otherlv_9= RULE_ID )
            // InternalMappingAssistance.g:564:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserveursRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_9, grammarAccess.getObserveursAccess().getNameServ2ServiceNameCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getObserveursAccess().getRightParenthesisKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObserveurs"


    // $ANTLR start "ruleType"
    // InternalMappingAssistance.g:583:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:589:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalMappingAssistance.g:590:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalMappingAssistance.g:590:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 19:
                {
                alt7=2;
                }
                break;
            case 20:
                {
                alt7=3;
                }
                break;
            case 21:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMappingAssistance.g:591:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalMappingAssistance.g:591:3: (enumLiteral_0= 'INT' )
                    // InternalMappingAssistance.g:592:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,18,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:599:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalMappingAssistance.g:599:3: (enumLiteral_1= 'STRING' )
                    // InternalMappingAssistance.g:600:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:607:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalMappingAssistance.g:607:3: (enumLiteral_2= 'Boolean' )
                    // InternalMappingAssistance.g:608:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:615:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMappingAssistance.g:615:3: (enumLiteral_3= 'Double' )
                    // InternalMappingAssistance.g:616:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000024010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}