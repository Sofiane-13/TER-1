package com.aelos.xtext.mappingassistance.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'TestDriver:'", "':='", "'('", "','", "')'", "'observer:'"
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
    // InternalMappingAssistance.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMappingAssistance.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMappingAssistance.g:65:2: iv_ruleModel= ruleModel EOF
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
    // InternalMappingAssistance.g:71:1: ruleModel returns [EObject current=null] : ( (lv_function_0_0= ruleAbstractModel ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:77:2: ( ( (lv_function_0_0= ruleAbstractModel ) )* )
            // InternalMappingAssistance.g:78:2: ( (lv_function_0_0= ruleAbstractModel ) )*
            {
            // InternalMappingAssistance.g:78:2: ( (lv_function_0_0= ruleAbstractModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMappingAssistance.g:79:3: (lv_function_0_0= ruleAbstractModel )
            	    {
            	    // InternalMappingAssistance.g:79:3: (lv_function_0_0= ruleAbstractModel )
            	    // InternalMappingAssistance.g:80:4: lv_function_0_0= ruleAbstractModel
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
    // InternalMappingAssistance.g:100:1: entryRuleAbstractModel returns [EObject current=null] : iv_ruleAbstractModel= ruleAbstractModel EOF ;
    public final EObject entryRuleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractModel = null;


        try {
            // InternalMappingAssistance.g:100:54: (iv_ruleAbstractModel= ruleAbstractModel EOF )
            // InternalMappingAssistance.g:101:2: iv_ruleAbstractModel= ruleAbstractModel EOF
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
    // InternalMappingAssistance.g:107:1: ruleAbstractModel returns [EObject current=null] : ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( (lv_obs_2_0= ruleObserver ) )* ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject lv_im_0_0 = null;

        EObject lv_testDr_1_0 = null;

        EObject lv_obs_2_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:113:2: ( ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( (lv_obs_2_0= ruleObserver ) )* ) )
            // InternalMappingAssistance.g:114:2: ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( (lv_obs_2_0= ruleObserver ) )* )
            {
            // InternalMappingAssistance.g:114:2: ( ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( (lv_obs_2_0= ruleObserver ) )* )
            // InternalMappingAssistance.g:115:3: ( (lv_im_0_0= ruleImport ) )+ ( (lv_testDr_1_0= ruleTestDriver ) ) ( (lv_obs_2_0= ruleObserver ) )*
            {
            // InternalMappingAssistance.g:115:3: ( (lv_im_0_0= ruleImport ) )+
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
            	    // InternalMappingAssistance.g:116:4: (lv_im_0_0= ruleImport )
            	    {
            	    // InternalMappingAssistance.g:116:4: (lv_im_0_0= ruleImport )
            	    // InternalMappingAssistance.g:117:5: lv_im_0_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractModelAccess().getImImportParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_im_0_0=ruleImport();

            	    state._fsp--;


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
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalMappingAssistance.g:134:3: ( (lv_testDr_1_0= ruleTestDriver ) )
            // InternalMappingAssistance.g:135:4: (lv_testDr_1_0= ruleTestDriver )
            {
            // InternalMappingAssistance.g:135:4: (lv_testDr_1_0= ruleTestDriver )
            // InternalMappingAssistance.g:136:5: lv_testDr_1_0= ruleTestDriver
            {

            					newCompositeNode(grammarAccess.getAbstractModelAccess().getTestDrTestDriverParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_testDr_1_0=ruleTestDriver();

            state._fsp--;


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

            // InternalMappingAssistance.g:153:3: ( (lv_obs_2_0= ruleObserver ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMappingAssistance.g:154:4: (lv_obs_2_0= ruleObserver )
            	    {
            	    // InternalMappingAssistance.g:154:4: (lv_obs_2_0= ruleObserver )
            	    // InternalMappingAssistance.g:155:5: lv_obs_2_0= ruleObserver
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractModelAccess().getObsObserverParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_obs_2_0=ruleObserver();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleAbstractModel"


    // $ANTLR start "entryRuleImport"
    // InternalMappingAssistance.g:176:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMappingAssistance.g:176:47: (iv_ruleImport= ruleImport EOF )
            // InternalMappingAssistance.g:177:2: iv_ruleImport= ruleImport EOF
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
    // InternalMappingAssistance.g:183:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:189:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalMappingAssistance.g:190:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalMappingAssistance.g:190:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalMappingAssistance.g:191:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMappingAssistance.g:195:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMappingAssistance.g:196:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMappingAssistance.g:196:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMappingAssistance.g:197:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalMappingAssistance.g:218:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMappingAssistance.g:218:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMappingAssistance.g:219:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalMappingAssistance.g:225:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:231:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMappingAssistance.g:232:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMappingAssistance.g:232:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMappingAssistance.g:233:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMappingAssistance.g:243:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMappingAssistance.g:244:4: kw= '.*'
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
    // InternalMappingAssistance.g:254:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMappingAssistance.g:254:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMappingAssistance.g:255:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalMappingAssistance.g:261:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:267:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMappingAssistance.g:268:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMappingAssistance.g:268:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMappingAssistance.g:269:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMappingAssistance.g:276:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMappingAssistance.g:277:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRuleTestDriver"
    // InternalMappingAssistance.g:294:1: entryRuleTestDriver returns [EObject current=null] : iv_ruleTestDriver= ruleTestDriver EOF ;
    public final EObject entryRuleTestDriver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTestDriver = null;


        try {
            // InternalMappingAssistance.g:294:51: (iv_ruleTestDriver= ruleTestDriver EOF )
            // InternalMappingAssistance.g:295:2: iv_ruleTestDriver= ruleTestDriver EOF
            {
             newCompositeNode(grammarAccess.getTestDriverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTestDriver=ruleTestDriver();

            state._fsp--;

             current =iv_ruleTestDriver; 
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
    // $ANTLR end "entryRuleTestDriver"


    // $ANTLR start "ruleTestDriver"
    // InternalMappingAssistance.g:301:1: ruleTestDriver returns [EObject current=null] : (otherlv_0= 'TestDriver:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )* ) ;
    public final EObject ruleTestDriver() throws RecognitionException {
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
            // InternalMappingAssistance.g:307:2: ( (otherlv_0= 'TestDriver:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )* ) )
            // InternalMappingAssistance.g:308:2: (otherlv_0= 'TestDriver:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )* )
            {
            // InternalMappingAssistance.g:308:2: (otherlv_0= 'TestDriver:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )* )
            // InternalMappingAssistance.g:309:3: otherlv_0= 'TestDriver:' ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getTestDriverAccess().getTestDriverKeyword_0());
            		
            // InternalMappingAssistance.g:313:3: ( ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMappingAssistance.g:314:4: ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (otherlv_3= RULE_ID ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) otherlv_6= '(' ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )* otherlv_10= ')'
            	    {
            	    // InternalMappingAssistance.g:314:4: ( (otherlv_1= RULE_ID ) )
            	    // InternalMappingAssistance.g:315:5: (otherlv_1= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:315:5: (otherlv_1= RULE_ID )
            	    // InternalMappingAssistance.g:316:6: otherlv_1= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTestDriverRule());
            	    						}
            	    					
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    						newLeafNode(otherlv_1, grammarAccess.getTestDriverAccess().getOutVarVariableCrossReference_1_0_0());
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,15,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTestDriverAccess().getColonEqualsSignKeyword_1_1());
            	    			
            	    // InternalMappingAssistance.g:331:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalMappingAssistance.g:332:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:332:5: (otherlv_3= RULE_ID )
            	    // InternalMappingAssistance.g:333:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTestDriverRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_3, grammarAccess.getTestDriverAccess().getReceiverVariableCrossReference_1_2_0());
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTestDriverAccess().getFullStopKeyword_1_3());
            	    			
            	    // InternalMappingAssistance.g:348:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalMappingAssistance.g:349:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalMappingAssistance.g:349:5: (otherlv_5= RULE_ID )
            	    // InternalMappingAssistance.g:350:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getTestDriverRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_12); 

            	    						newLeafNode(otherlv_5, grammarAccess.getTestDriverAccess().getMemberOperationCrossReference_1_4_0());
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getTestDriverAccess().getLeftParenthesisKeyword_1_5());
            	    			
            	    // InternalMappingAssistance.g:365:4: ( ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:366:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )* ( (otherlv_9= RULE_ID ) )
            	    	    {
            	    	    // InternalMappingAssistance.g:366:5: ( ( (otherlv_7= RULE_ID ) ) otherlv_8= ',' )*
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( (LA6_0==RULE_ID) ) {
            	    	            int LA6_1 = input.LA(2);

            	    	            if ( (LA6_1==17) ) {
            	    	                alt6=1;
            	    	            }


            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // InternalMappingAssistance.g:367:6: ( (otherlv_7= RULE_ID ) ) otherlv_8= ','
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:367:6: ( (otherlv_7= RULE_ID ) )
            	    	    	    // InternalMappingAssistance.g:368:7: (otherlv_7= RULE_ID )
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:368:7: (otherlv_7= RULE_ID )
            	    	    	    // InternalMappingAssistance.g:369:8: otherlv_7= RULE_ID
            	    	    	    {

            	    	    	    								if (current==null) {
            	    	    	    									current = createModelElement(grammarAccess.getTestDriverRule());
            	    	    	    								}
            	    	    	    							
            	    	    	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    	    	    								newLeafNode(otherlv_7, grammarAccess.getTestDriverAccess().getArgVariableCrossReference_1_6_0_0_0());
            	    	    	    							

            	    	    	    }


            	    	    	    }

            	    	    	    otherlv_8=(Token)match(input,17,FOLLOW_6); 

            	    	    	    						newLeafNode(otherlv_8, grammarAccess.getTestDriverAccess().getCommaKeyword_1_6_0_1());
            	    	    	    					

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop6;
            	    	        }
            	    	    } while (true);

            	    	    // InternalMappingAssistance.g:385:5: ( (otherlv_9= RULE_ID ) )
            	    	    // InternalMappingAssistance.g:386:6: (otherlv_9= RULE_ID )
            	    	    {
            	    	    // InternalMappingAssistance.g:386:6: (otherlv_9= RULE_ID )
            	    	    // InternalMappingAssistance.g:387:7: otherlv_9= RULE_ID
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getTestDriverRule());
            	    	    							}
            	    	    						
            	    	    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    	    							newLeafNode(otherlv_9, grammarAccess.getTestDriverAccess().getArgVariableCrossReference_1_6_1_0());
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,18,FOLLOW_9); 

            	    				newLeafNode(otherlv_10, grammarAccess.getTestDriverAccess().getRightParenthesisKeyword_1_7());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleTestDriver"


    // $ANTLR start "entryRuleObserver"
    // InternalMappingAssistance.g:408:1: entryRuleObserver returns [EObject current=null] : iv_ruleObserver= ruleObserver EOF ;
    public final EObject entryRuleObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserver = null;


        try {
            // InternalMappingAssistance.g:408:49: (iv_ruleObserver= ruleObserver EOF )
            // InternalMappingAssistance.g:409:2: iv_ruleObserver= ruleObserver EOF
            {
             newCompositeNode(grammarAccess.getObserverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObserver=ruleObserver();

            state._fsp--;

             current =iv_ruleObserver; 
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
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // InternalMappingAssistance.g:415:1: ruleObserver returns [EObject current=null] : (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_serviceName1_3_0= ruleCall ) ) otherlv_4= ',' ( (lv_serviceName2_5_0= ruleCall ) ) otherlv_6= ')' (otherlv_7= '(' ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )* ) ;
    public final EObject ruleObserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_serviceName1_3_0 = null;

        EObject lv_serviceName2_5_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:421:2: ( (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_serviceName1_3_0= ruleCall ) ) otherlv_4= ',' ( (lv_serviceName2_5_0= ruleCall ) ) otherlv_6= ')' (otherlv_7= '(' ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )* ) )
            // InternalMappingAssistance.g:422:2: (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_serviceName1_3_0= ruleCall ) ) otherlv_4= ',' ( (lv_serviceName2_5_0= ruleCall ) ) otherlv_6= ')' (otherlv_7= '(' ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )* )
            {
            // InternalMappingAssistance.g:422:2: (otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_serviceName1_3_0= ruleCall ) ) otherlv_4= ',' ( (lv_serviceName2_5_0= ruleCall ) ) otherlv_6= ')' (otherlv_7= '(' ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )* )
            // InternalMappingAssistance.g:423:3: otherlv_0= 'observer:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_serviceName1_3_0= ruleCall ) ) otherlv_4= ',' ( (lv_serviceName2_5_0= ruleCall ) ) otherlv_6= ')' (otherlv_7= '(' ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getObserverAccess().getObserverKeyword_0());
            		
            // InternalMappingAssistance.g:427:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMappingAssistance.g:428:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMappingAssistance.g:428:4: (lv_name_1_0= RULE_ID )
            // InternalMappingAssistance.g:429:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObserverAccess().getNameIDTerminalRuleCall_1_0());
            				

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

            otherlv_2=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getObserverAccess().getLeftParenthesisKeyword_2());
            		
            // InternalMappingAssistance.g:449:3: ( (lv_serviceName1_3_0= ruleCall ) )
            // InternalMappingAssistance.g:450:4: (lv_serviceName1_3_0= ruleCall )
            {
            // InternalMappingAssistance.g:450:4: (lv_serviceName1_3_0= ruleCall )
            // InternalMappingAssistance.g:451:5: lv_serviceName1_3_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getServiceName1CallParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_serviceName1_3_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					add(
            						current,
            						"serviceName1",
            						lv_serviceName1_3_0,
            						"com.aelos.xtext.mappingassistance.MappingAssistance.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getObserverAccess().getCommaKeyword_4());
            		
            // InternalMappingAssistance.g:472:3: ( (lv_serviceName2_5_0= ruleCall ) )
            // InternalMappingAssistance.g:473:4: (lv_serviceName2_5_0= ruleCall )
            {
            // InternalMappingAssistance.g:473:4: (lv_serviceName2_5_0= ruleCall )
            // InternalMappingAssistance.g:474:5: lv_serviceName2_5_0= ruleCall
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getServiceName2CallParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
            lv_serviceName2_5_0=ruleCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					add(
            						current,
            						"serviceName2",
            						lv_serviceName2_5_0,
            						"com.aelos.xtext.mappingassistance.MappingAssistance.Call");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_16); 

            			newLeafNode(otherlv_6, grammarAccess.getObserverAccess().getRightParenthesisKeyword_6());
            		
            // InternalMappingAssistance.g:495:3: (otherlv_7= '(' ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMappingAssistance.g:496:4: otherlv_7= '(' ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_7, grammarAccess.getObserverAccess().getLeftParenthesisKeyword_7_0());
            	    			
            	    // InternalMappingAssistance.g:500:4: ( ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==RULE_ID) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:501:5: ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )* ( (otherlv_10= RULE_ID ) )
            	    	    {
            	    	    // InternalMappingAssistance.g:501:5: ( ( (otherlv_8= RULE_ID ) ) otherlv_9= ',' )*
            	    	    loop9:
            	    	    do {
            	    	        int alt9=2;
            	    	        int LA9_0 = input.LA(1);

            	    	        if ( (LA9_0==RULE_ID) ) {
            	    	            int LA9_1 = input.LA(2);

            	    	            if ( (LA9_1==17) ) {
            	    	                alt9=1;
            	    	            }


            	    	        }


            	    	        switch (alt9) {
            	    	    	case 1 :
            	    	    	    // InternalMappingAssistance.g:502:6: ( (otherlv_8= RULE_ID ) ) otherlv_9= ','
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:502:6: ( (otherlv_8= RULE_ID ) )
            	    	    	    // InternalMappingAssistance.g:503:7: (otherlv_8= RULE_ID )
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:503:7: (otherlv_8= RULE_ID )
            	    	    	    // InternalMappingAssistance.g:504:8: otherlv_8= RULE_ID
            	    	    	    {

            	    	    	    								if (current==null) {
            	    	    	    									current = createModelElement(grammarAccess.getObserverRule());
            	    	    	    								}
            	    	    	    							
            	    	    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    	    	    								newLeafNode(otherlv_8, grammarAccess.getObserverAccess().getArgVariableCrossReference_7_1_0_0_0());
            	    	    	    							

            	    	    	    }


            	    	    	    }

            	    	    	    otherlv_9=(Token)match(input,17,FOLLOW_6); 

            	    	    	    						newLeafNode(otherlv_9, grammarAccess.getObserverAccess().getCommaKeyword_7_1_0_1());
            	    	    	    					

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop9;
            	    	        }
            	    	    } while (true);

            	    	    // InternalMappingAssistance.g:520:5: ( (otherlv_10= RULE_ID ) )
            	    	    // InternalMappingAssistance.g:521:6: (otherlv_10= RULE_ID )
            	    	    {
            	    	    // InternalMappingAssistance.g:521:6: (otherlv_10= RULE_ID )
            	    	    // InternalMappingAssistance.g:522:7: otherlv_10= RULE_ID
            	    	    {

            	    	    							if (current==null) {
            	    	    								current = createModelElement(grammarAccess.getObserverRule());
            	    	    							}
            	    	    						
            	    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    	    							newLeafNode(otherlv_10, grammarAccess.getObserverAccess().getArgVariableCrossReference_7_1_1_0());
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,18,FOLLOW_16); 

            	    				newLeafNode(otherlv_11, grammarAccess.getObserverAccess().getRightParenthesisKeyword_7_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleCall"
    // InternalMappingAssistance.g:543:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalMappingAssistance.g:543:45: (iv_ruleCall= ruleCall EOF )
            // InternalMappingAssistance.g:544:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalMappingAssistance.g:550:1: ruleCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:556:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMappingAssistance.g:557:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalMappingAssistance.g:557:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalMappingAssistance.g:558:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalMappingAssistance.g:558:3: ( (otherlv_0= RULE_ID ) )
            // InternalMappingAssistance.g:559:4: (otherlv_0= RULE_ID )
            {
            // InternalMappingAssistance.g:559:4: (otherlv_0= RULE_ID )
            // InternalMappingAssistance.g:560:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_0, grammarAccess.getCallAccess().getReceiverVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCallAccess().getFullStopKeyword_1());
            		
            // InternalMappingAssistance.g:575:3: ( (otherlv_2= RULE_ID ) )
            // InternalMappingAssistance.g:576:4: (otherlv_2= RULE_ID )
            {
            // InternalMappingAssistance.g:576:4: (otherlv_2= RULE_ID )
            // InternalMappingAssistance.g:577:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getCallAccess().getMemberOperationCrossReference_2_0());
            				

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
    // $ANTLR end "ruleCall"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010002L});

}