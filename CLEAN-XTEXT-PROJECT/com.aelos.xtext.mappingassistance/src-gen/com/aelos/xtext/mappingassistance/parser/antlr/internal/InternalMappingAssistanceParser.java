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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'Component'", "'Mock'", "'Observator'", "':'", "'ProvidedServices:'", "'conf('", "','", "')'", "'('", "'RequiredServices:'", "'varModel:'", "'ref'", "'varTest:'", "'bind('", "':='", "';'", "'INT'", "'STRING'", "'Boolean'", "'Double'"
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
    // InternalMappingAssistance.g:108:1: ruleAbstractModel returns [EObject current=null] : (this_Import_0= ruleImport ( (lv_comp_1_0= ruleComponent ) )+ ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject lv_comp_1_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:114:2: ( (this_Import_0= ruleImport ( (lv_comp_1_0= ruleComponent ) )+ ) )
            // InternalMappingAssistance.g:115:2: (this_Import_0= ruleImport ( (lv_comp_1_0= ruleComponent ) )+ )
            {
            // InternalMappingAssistance.g:115:2: (this_Import_0= ruleImport ( (lv_comp_1_0= ruleComponent ) )+ )
            // InternalMappingAssistance.g:116:3: this_Import_0= ruleImport ( (lv_comp_1_0= ruleComponent ) )+
            {

            			newCompositeNode(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0());
            		
            pushFollow(FOLLOW_4);
            this_Import_0=ruleImport();

            state._fsp--;


            			current = this_Import_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMappingAssistance.g:124:3: ( (lv_comp_1_0= ruleComponent ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMappingAssistance.g:125:4: (lv_comp_1_0= ruleComponent )
            	    {
            	    // InternalMappingAssistance.g:125:4: (lv_comp_1_0= ruleComponent )
            	    // InternalMappingAssistance.g:126:5: lv_comp_1_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_comp_1_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comp",
            	    						lv_comp_1_0,
            	    						"com.aelos.xtext.mappingassistance.MappingAssistance.Component");
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
    // InternalMappingAssistance.g:147:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMappingAssistance.g:147:47: (iv_ruleImport= ruleImport EOF )
            // InternalMappingAssistance.g:148:2: iv_ruleImport= ruleImport EOF
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
    // InternalMappingAssistance.g:154:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:160:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalMappingAssistance.g:161:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalMappingAssistance.g:161:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalMappingAssistance.g:162:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMappingAssistance.g:166:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMappingAssistance.g:167:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMappingAssistance.g:167:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMappingAssistance.g:168:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalMappingAssistance.g:189:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMappingAssistance.g:189:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMappingAssistance.g:190:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalMappingAssistance.g:196:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:202:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMappingAssistance.g:203:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMappingAssistance.g:203:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMappingAssistance.g:204:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMappingAssistance.g:214:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMappingAssistance.g:215:4: kw= '.*'
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
    // InternalMappingAssistance.g:225:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMappingAssistance.g:225:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMappingAssistance.g:226:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalMappingAssistance.g:232:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:238:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMappingAssistance.g:239:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMappingAssistance.g:239:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMappingAssistance.g:240:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMappingAssistance.g:247:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMappingAssistance.g:248:4: kw= '.' this_ID_2= RULE_ID
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
            	    break loop4;
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


    // $ANTLR start "entryRuleComponent"
    // InternalMappingAssistance.g:265:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalMappingAssistance.g:265:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalMappingAssistance.g:266:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalMappingAssistance.g:272:1: ruleComponent returns [EObject current=null] : ( (otherlv_0= 'Component' | otherlv_1= 'Mock' | otherlv_2= 'Observator' ) otherlv_3= ':' ( (lv_inst_4_0= ruleInstanceComp ) ) otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'ProvidedServices:' otherlv_8= 'conf(' ( ( (lv_arg_9_0= ruleVariable ) ) otherlv_10= ',' )* ( (lv_arg1_11_0= ruleVariable ) ) otherlv_12= ')' ( ( (lv_methode_13_0= ruleServiceName ) ) otherlv_14= '(' ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )* otherlv_18= ')' (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )? )* (otherlv_21= 'RequiredServices:' )? ( (lv_req_22_0= ruleRequiredService ) )* ( (lv_map_23_0= ruleMapping ) )* ( (lv_bind_24_0= ruleBindings ) )* ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_inst_4_0 = null;

        EObject lv_arg_9_0 = null;

        EObject lv_arg1_11_0 = null;

        EObject lv_methode_13_0 = null;

        EObject lv_arg_15_0 = null;

        EObject lv_arg_17_0 = null;

        EObject lv_arg_20_0 = null;

        EObject lv_req_22_0 = null;

        EObject lv_map_23_0 = null;

        EObject lv_bind_24_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:278:2: ( ( (otherlv_0= 'Component' | otherlv_1= 'Mock' | otherlv_2= 'Observator' ) otherlv_3= ':' ( (lv_inst_4_0= ruleInstanceComp ) ) otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'ProvidedServices:' otherlv_8= 'conf(' ( ( (lv_arg_9_0= ruleVariable ) ) otherlv_10= ',' )* ( (lv_arg1_11_0= ruleVariable ) ) otherlv_12= ')' ( ( (lv_methode_13_0= ruleServiceName ) ) otherlv_14= '(' ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )* otherlv_18= ')' (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )? )* (otherlv_21= 'RequiredServices:' )? ( (lv_req_22_0= ruleRequiredService ) )* ( (lv_map_23_0= ruleMapping ) )* ( (lv_bind_24_0= ruleBindings ) )* ) )
            // InternalMappingAssistance.g:279:2: ( (otherlv_0= 'Component' | otherlv_1= 'Mock' | otherlv_2= 'Observator' ) otherlv_3= ':' ( (lv_inst_4_0= ruleInstanceComp ) ) otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'ProvidedServices:' otherlv_8= 'conf(' ( ( (lv_arg_9_0= ruleVariable ) ) otherlv_10= ',' )* ( (lv_arg1_11_0= ruleVariable ) ) otherlv_12= ')' ( ( (lv_methode_13_0= ruleServiceName ) ) otherlv_14= '(' ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )* otherlv_18= ')' (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )? )* (otherlv_21= 'RequiredServices:' )? ( (lv_req_22_0= ruleRequiredService ) )* ( (lv_map_23_0= ruleMapping ) )* ( (lv_bind_24_0= ruleBindings ) )* )
            {
            // InternalMappingAssistance.g:279:2: ( (otherlv_0= 'Component' | otherlv_1= 'Mock' | otherlv_2= 'Observator' ) otherlv_3= ':' ( (lv_inst_4_0= ruleInstanceComp ) ) otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'ProvidedServices:' otherlv_8= 'conf(' ( ( (lv_arg_9_0= ruleVariable ) ) otherlv_10= ',' )* ( (lv_arg1_11_0= ruleVariable ) ) otherlv_12= ')' ( ( (lv_methode_13_0= ruleServiceName ) ) otherlv_14= '(' ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )* otherlv_18= ')' (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )? )* (otherlv_21= 'RequiredServices:' )? ( (lv_req_22_0= ruleRequiredService ) )* ( (lv_map_23_0= ruleMapping ) )* ( (lv_bind_24_0= ruleBindings ) )* )
            // InternalMappingAssistance.g:280:3: (otherlv_0= 'Component' | otherlv_1= 'Mock' | otherlv_2= 'Observator' ) otherlv_3= ':' ( (lv_inst_4_0= ruleInstanceComp ) ) otherlv_5= ':' ( (lv_name_6_0= RULE_ID ) ) otherlv_7= 'ProvidedServices:' otherlv_8= 'conf(' ( ( (lv_arg_9_0= ruleVariable ) ) otherlv_10= ',' )* ( (lv_arg1_11_0= ruleVariable ) ) otherlv_12= ')' ( ( (lv_methode_13_0= ruleServiceName ) ) otherlv_14= '(' ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )* otherlv_18= ')' (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )? )* (otherlv_21= 'RequiredServices:' )? ( (lv_req_22_0= ruleRequiredService ) )* ( (lv_map_23_0= ruleMapping ) )* ( (lv_bind_24_0= ruleBindings ) )*
            {
            // InternalMappingAssistance.g:280:3: (otherlv_0= 'Component' | otherlv_1= 'Mock' | otherlv_2= 'Observator' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 15:
                {
                alt5=2;
                }
                break;
            case 16:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMappingAssistance.g:281:4: otherlv_0= 'Component'
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:286:4: otherlv_1= 'Mock'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getMockKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:291:4: otherlv_2= 'Observator'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getObservatorKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getColonKeyword_1());
            		
            // InternalMappingAssistance.g:300:3: ( (lv_inst_4_0= ruleInstanceComp ) )
            // InternalMappingAssistance.g:301:4: (lv_inst_4_0= ruleInstanceComp )
            {
            // InternalMappingAssistance.g:301:4: (lv_inst_4_0= ruleInstanceComp )
            // InternalMappingAssistance.g:302:5: lv_inst_4_0= ruleInstanceComp
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_inst_4_0=ruleInstanceComp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"inst",
            						lv_inst_4_0,
            						"com.aelos.xtext.mappingassistance.MappingAssistance.InstanceComp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getColonKeyword_3());
            		
            // InternalMappingAssistance.g:323:3: ( (lv_name_6_0= RULE_ID ) )
            // InternalMappingAssistance.g:324:4: (lv_name_6_0= RULE_ID )
            {
            // InternalMappingAssistance.g:324:4: (lv_name_6_0= RULE_ID )
            // InternalMappingAssistance.g:325:5: lv_name_6_0= RULE_ID
            {
            lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_6_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getProvidedServicesKeyword_5());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getConfKeyword_6());
            		
            // InternalMappingAssistance.g:349:3: ( ( (lv_arg_9_0= ruleVariable ) ) otherlv_10= ',' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==17) ) {
                        switch ( input.LA(3) ) {
                        case 30:
                            {
                            int LA6_3 = input.LA(4);

                            if ( (LA6_3==20) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 31:
                            {
                            int LA6_4 = input.LA(4);

                            if ( (LA6_4==20) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 32:
                            {
                            int LA6_5 = input.LA(4);

                            if ( (LA6_5==20) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 33:
                            {
                            int LA6_6 = input.LA(4);

                            if ( (LA6_6==20) ) {
                                alt6=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalMappingAssistance.g:350:4: ( (lv_arg_9_0= ruleVariable ) ) otherlv_10= ','
            	    {
            	    // InternalMappingAssistance.g:350:4: ( (lv_arg_9_0= ruleVariable ) )
            	    // InternalMappingAssistance.g:351:5: (lv_arg_9_0= ruleVariable )
            	    {
            	    // InternalMappingAssistance.g:351:5: (lv_arg_9_0= ruleVariable )
            	    // InternalMappingAssistance.g:352:6: lv_arg_9_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_7_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_arg_9_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arg",
            	    							lv_arg_9_0,
            	    							"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_10=(Token)match(input,20,FOLLOW_6); 

            	    				newLeafNode(otherlv_10, grammarAccess.getComponentAccess().getCommaKeyword_7_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMappingAssistance.g:374:3: ( (lv_arg1_11_0= ruleVariable ) )
            // InternalMappingAssistance.g:375:4: (lv_arg1_11_0= ruleVariable )
            {
            // InternalMappingAssistance.g:375:4: (lv_arg1_11_0= ruleVariable )
            // InternalMappingAssistance.g:376:5: lv_arg1_11_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_arg1_11_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"arg1",
            						lv_arg1_11_0,
            						"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getRightParenthesisKeyword_9());
            		
            // InternalMappingAssistance.g:397:3: ( ( (lv_methode_13_0= ruleServiceName ) ) otherlv_14= '(' ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )* otherlv_18= ')' (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==22) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalMappingAssistance.g:398:4: ( (lv_methode_13_0= ruleServiceName ) ) otherlv_14= '(' ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )* otherlv_18= ')' (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )?
            	    {
            	    // InternalMappingAssistance.g:398:4: ( (lv_methode_13_0= ruleServiceName ) )
            	    // InternalMappingAssistance.g:399:5: (lv_methode_13_0= ruleServiceName )
            	    {
            	    // InternalMappingAssistance.g:399:5: (lv_methode_13_0= ruleServiceName )
            	    // InternalMappingAssistance.g:400:6: lv_methode_13_0= ruleServiceName
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_10_0_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_methode_13_0=ruleServiceName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methode",
            	    							lv_methode_13_0,
            	    							"com.aelos.xtext.mappingassistance.MappingAssistance.ServiceName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_14=(Token)match(input,22,FOLLOW_16); 

            	    				newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_10_1());
            	    			
            	    // InternalMappingAssistance.g:421:4: ( ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ID) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMappingAssistance.g:422:5: ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )* ( (lv_arg_17_0= ruleVariable ) )
            	    	    {
            	    	    // InternalMappingAssistance.g:422:5: ( ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ',' )*
            	    	    loop7:
            	    	    do {
            	    	        int alt7=2;
            	    	        int LA7_0 = input.LA(1);

            	    	        if ( (LA7_0==RULE_ID) ) {
            	    	            int LA7_1 = input.LA(2);

            	    	            if ( (LA7_1==17) ) {
            	    	                switch ( input.LA(3) ) {
            	    	                case 30:
            	    	                    {
            	    	                    int LA7_3 = input.LA(4);

            	    	                    if ( (LA7_3==20) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 31:
            	    	                    {
            	    	                    int LA7_4 = input.LA(4);

            	    	                    if ( (LA7_4==20) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 32:
            	    	                    {
            	    	                    int LA7_5 = input.LA(4);

            	    	                    if ( (LA7_5==20) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 33:
            	    	                    {
            	    	                    int LA7_6 = input.LA(4);

            	    	                    if ( (LA7_6==20) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;

            	    	                }

            	    	            }


            	    	        }


            	    	        switch (alt7) {
            	    	    	case 1 :
            	    	    	    // InternalMappingAssistance.g:423:6: ( (lv_arg_15_0= ruleVariable ) ) otherlv_16= ','
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:423:6: ( (lv_arg_15_0= ruleVariable ) )
            	    	    	    // InternalMappingAssistance.g:424:7: (lv_arg_15_0= ruleVariable )
            	    	    	    {
            	    	    	    // InternalMappingAssistance.g:424:7: (lv_arg_15_0= ruleVariable )
            	    	    	    // InternalMappingAssistance.g:425:8: lv_arg_15_0= ruleVariable
            	    	    	    {

            	    	    	    								newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_2_0_0_0());
            	    	    	    							
            	    	    	    pushFollow(FOLLOW_12);
            	    	    	    lv_arg_15_0=ruleVariable();

            	    	    	    state._fsp--;


            	    	    	    								if (current==null) {
            	    	    	    									current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	    	    								}
            	    	    	    								add(
            	    	    	    									current,
            	    	    	    									"arg",
            	    	    	    									lv_arg_15_0,
            	    	    	    									"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            	    	    	    								afterParserOrEnumRuleCall();
            	    	    	    							

            	    	    	    }


            	    	    	    }

            	    	    	    otherlv_16=(Token)match(input,20,FOLLOW_6); 

            	    	    	    						newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getCommaKeyword_10_2_0_1());
            	    	    	    					

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop7;
            	    	        }
            	    	    } while (true);

            	    	    // InternalMappingAssistance.g:447:5: ( (lv_arg_17_0= ruleVariable ) )
            	    	    // InternalMappingAssistance.g:448:6: (lv_arg_17_0= ruleVariable )
            	    	    {
            	    	    // InternalMappingAssistance.g:448:6: (lv_arg_17_0= ruleVariable )
            	    	    // InternalMappingAssistance.g:449:7: lv_arg_17_0= ruleVariable
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_arg_17_0=ruleVariable();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"arg",
            	    	    								lv_arg_17_0,
            	    	    								"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_18=(Token)match(input,21,FOLLOW_17); 

            	    				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRightParenthesisKeyword_10_3());
            	    			
            	    // InternalMappingAssistance.g:471:4: (otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==17) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMappingAssistance.g:472:5: otherlv_19= ':' ( (lv_arg_20_0= ruleVariable ) )
            	            {
            	            otherlv_19=(Token)match(input,17,FOLLOW_6); 

            	            					newLeafNode(otherlv_19, grammarAccess.getComponentAccess().getColonKeyword_10_4_0());
            	            				
            	            // InternalMappingAssistance.g:476:5: ( (lv_arg_20_0= ruleVariable ) )
            	            // InternalMappingAssistance.g:477:6: (lv_arg_20_0= ruleVariable )
            	            {
            	            // InternalMappingAssistance.g:477:6: (lv_arg_20_0= ruleVariable )
            	            // InternalMappingAssistance.g:478:7: lv_arg_20_0= ruleVariable
            	            {

            	            							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_4_1_0());
            	            						
            	            pushFollow(FOLLOW_14);
            	            lv_arg_20_0=ruleVariable();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getComponentRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arg",
            	            								lv_arg_20_0,
            	            								"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMappingAssistance.g:497:3: (otherlv_21= 'RequiredServices:' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMappingAssistance.g:498:4: otherlv_21= 'RequiredServices:'
                    {
                    otherlv_21=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_21, grammarAccess.getComponentAccess().getRequiredServicesKeyword_11());
                    			

                    }
                    break;

            }

            // InternalMappingAssistance.g:503:3: ( (lv_req_22_0= ruleRequiredService ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMappingAssistance.g:504:4: (lv_req_22_0= ruleRequiredService )
            	    {
            	    // InternalMappingAssistance.g:504:4: (lv_req_22_0= ruleRequiredService )
            	    // InternalMappingAssistance.g:505:5: lv_req_22_0= ruleRequiredService
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_req_22_0=ruleRequiredService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"req",
            	    						lv_req_22_0,
            	    						"com.aelos.xtext.mappingassistance.MappingAssistance.RequiredService");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalMappingAssistance.g:522:3: ( (lv_map_23_0= ruleMapping ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMappingAssistance.g:523:4: (lv_map_23_0= ruleMapping )
            	    {
            	    // InternalMappingAssistance.g:523:4: (lv_map_23_0= ruleMapping )
            	    // InternalMappingAssistance.g:524:5: lv_map_23_0= ruleMapping
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getMapMappingParserRuleCall_13_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_map_23_0=ruleMapping();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"map",
            	    						lv_map_23_0,
            	    						"com.aelos.xtext.mappingassistance.MappingAssistance.Mapping");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalMappingAssistance.g:541:3: ( (lv_bind_24_0= ruleBindings ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMappingAssistance.g:542:4: (lv_bind_24_0= ruleBindings )
            	    {
            	    // InternalMappingAssistance.g:542:4: (lv_bind_24_0= ruleBindings )
            	    // InternalMappingAssistance.g:543:5: lv_bind_24_0= ruleBindings
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_bind_24_0=ruleBindings();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bind",
            	    						lv_bind_24_0,
            	    						"com.aelos.xtext.mappingassistance.MappingAssistance.Bindings");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleInstanceComp"
    // InternalMappingAssistance.g:564:1: entryRuleInstanceComp returns [EObject current=null] : iv_ruleInstanceComp= ruleInstanceComp EOF ;
    public final EObject entryRuleInstanceComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceComp = null;


        try {
            // InternalMappingAssistance.g:564:53: (iv_ruleInstanceComp= ruleInstanceComp EOF )
            // InternalMappingAssistance.g:565:2: iv_ruleInstanceComp= ruleInstanceComp EOF
            {
             newCompositeNode(grammarAccess.getInstanceCompRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstanceComp=ruleInstanceComp();

            state._fsp--;

             current =iv_ruleInstanceComp; 
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
    // $ANTLR end "entryRuleInstanceComp"


    // $ANTLR start "ruleInstanceComp"
    // InternalMappingAssistance.g:571:1: ruleInstanceComp returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstanceComp() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:577:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMappingAssistance.g:578:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMappingAssistance.g:578:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMappingAssistance.g:579:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMappingAssistance.g:579:3: (lv_name_0_0= RULE_ID )
            // InternalMappingAssistance.g:580:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getInstanceCompRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleInstanceComp"


    // $ANTLR start "entryRuleVariable"
    // InternalMappingAssistance.g:599:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMappingAssistance.g:599:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMappingAssistance.g:600:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMappingAssistance.g:606:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:612:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalMappingAssistance.g:613:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalMappingAssistance.g:613:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalMappingAssistance.g:614:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalMappingAssistance.g:614:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMappingAssistance.g:615:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMappingAssistance.g:615:4: (lv_name_0_0= RULE_ID )
            // InternalMappingAssistance.g:616:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0());
            				

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

            otherlv_1=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalMappingAssistance.g:636:3: ( (lv_type_2_0= ruleType ) )
            // InternalMappingAssistance.g:637:4: (lv_type_2_0= ruleType )
            {
            // InternalMappingAssistance.g:637:4: (lv_type_2_0= ruleType )
            // InternalMappingAssistance.g:638:5: lv_type_2_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleType();

            state._fsp--;


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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleMapping"
    // InternalMappingAssistance.g:659:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // InternalMappingAssistance.g:659:48: (iv_ruleMapping= ruleMapping EOF )
            // InternalMappingAssistance.g:660:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMappingAssistance.g:666:1: ruleMapping returns [EObject current=null] : (otherlv_0= 'varModel:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'ref' otherlv_3= 'varTest:' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:672:2: ( (otherlv_0= 'varModel:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'ref' otherlv_3= 'varTest:' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMappingAssistance.g:673:2: (otherlv_0= 'varModel:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'ref' otherlv_3= 'varTest:' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMappingAssistance.g:673:2: (otherlv_0= 'varModel:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'ref' otherlv_3= 'varTest:' ( (otherlv_4= RULE_ID ) ) )
            // InternalMappingAssistance.g:674:3: otherlv_0= 'varModel:' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'ref' otherlv_3= 'varTest:' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMappingAccess().getVarModelKeyword_0());
            		
            // InternalMappingAssistance.g:678:3: ( (otherlv_1= RULE_ID ) )
            // InternalMappingAssistance.g:679:4: (otherlv_1= RULE_ID )
            {
            // InternalMappingAssistance.g:679:4: (otherlv_1= RULE_ID )
            // InternalMappingAssistance.g:680:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getNameVarModeVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMappingAccess().getRefKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getVarTestKeyword_3());
            		
            // InternalMappingAssistance.g:699:3: ( (otherlv_4= RULE_ID ) )
            // InternalMappingAssistance.g:700:4: (otherlv_4= RULE_ID )
            {
            // InternalMappingAssistance.g:700:4: (otherlv_4= RULE_ID )
            // InternalMappingAssistance.g:701:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMappingRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getMappingAccess().getNameVarTestVariableCrossReference_4_0());
            				

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleBindings"
    // InternalMappingAssistance.g:716:1: entryRuleBindings returns [EObject current=null] : iv_ruleBindings= ruleBindings EOF ;
    public final EObject entryRuleBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindings = null;


        try {
            // InternalMappingAssistance.g:716:49: (iv_ruleBindings= ruleBindings EOF )
            // InternalMappingAssistance.g:717:2: iv_ruleBindings= ruleBindings EOF
            {
             newCompositeNode(grammarAccess.getBindingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBindings=ruleBindings();

            state._fsp--;

             current =iv_ruleBindings; 
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
    // $ANTLR end "entryRuleBindings"


    // $ANTLR start "ruleBindings"
    // InternalMappingAssistance.g:723:1: ruleBindings returns [EObject current=null] : (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) ;
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
            // InternalMappingAssistance.g:729:2: ( (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) )
            // InternalMappingAssistance.g:730:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            {
            // InternalMappingAssistance.g:730:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            // InternalMappingAssistance.g:731:3: otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingsAccess().getBindKeyword_0());
            		
            // InternalMappingAssistance.g:735:3: ( (otherlv_1= RULE_ID ) )
            // InternalMappingAssistance.g:736:4: (otherlv_1= RULE_ID )
            {
            // InternalMappingAssistance.g:736:4: (otherlv_1= RULE_ID )
            // InternalMappingAssistance.g:737:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingsAccess().getFullStopKeyword_2());
            		
            // InternalMappingAssistance.g:752:3: ( (otherlv_3= RULE_ID ) )
            // InternalMappingAssistance.g:753:4: (otherlv_3= RULE_ID )
            {
            // InternalMappingAssistance.g:753:4: (otherlv_3= RULE_ID )
            // InternalMappingAssistance.g:754:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_3, grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingsAccess().getCommaKeyword_4());
            		
            // InternalMappingAssistance.g:769:3: ( (otherlv_5= RULE_ID ) )
            // InternalMappingAssistance.g:770:4: (otherlv_5= RULE_ID )
            {
            // InternalMappingAssistance.g:770:4: (otherlv_5= RULE_ID )
            // InternalMappingAssistance.g:771:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_5, grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getBindingsAccess().getFullStopKeyword_6());
            		
            // InternalMappingAssistance.g:786:3: ( (otherlv_7= RULE_ID ) )
            // InternalMappingAssistance.g:787:4: (otherlv_7= RULE_ID )
            {
            // InternalMappingAssistance.g:787:4: (otherlv_7= RULE_ID )
            // InternalMappingAssistance.g:788:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_7, grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8());
            		

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
    // $ANTLR end "ruleBindings"


    // $ANTLR start "entryRuleRequiredService"
    // InternalMappingAssistance.g:807:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalMappingAssistance.g:807:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalMappingAssistance.g:808:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
             newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;

             current =iv_ruleRequiredService; 
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
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalMappingAssistance.g:814:1: ruleRequiredService returns [EObject current=null] : ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
    public final EObject ruleRequiredService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_nameVarMethode_0_0 = null;



        	enterRule();

        try {
            // InternalMappingAssistance.g:820:2: ( ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalMappingAssistance.g:821:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalMappingAssistance.g:821:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalMappingAssistance.g:822:3: ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalMappingAssistance.g:822:3: ( (lv_nameVarMethode_0_0= ruleVariable ) )
            // InternalMappingAssistance.g:823:4: (lv_nameVarMethode_0_0= ruleVariable )
            {
            // InternalMappingAssistance.g:823:4: (lv_nameVarMethode_0_0= ruleVariable )
            // InternalMappingAssistance.g:824:5: lv_nameVarMethode_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_nameVarMethode_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredServiceRule());
            					}
            					add(
            						current,
            						"nameVarMethode",
            						lv_nameVarMethode_0_0,
            						"com.aelos.xtext.mappingassistance.MappingAssistance.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,28,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1());
            		
            // InternalMappingAssistance.g:845:3: ( (otherlv_2= RULE_ID ) )
            // InternalMappingAssistance.g:846:4: (otherlv_2= RULE_ID )
            {
            // InternalMappingAssistance.g:846:4: (otherlv_2= RULE_ID )
            // InternalMappingAssistance.g:847:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredServiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3());
            		
            // InternalMappingAssistance.g:862:3: ( (otherlv_4= RULE_ID ) )
            // InternalMappingAssistance.g:863:4: (otherlv_4= RULE_ID )
            {
            // InternalMappingAssistance.g:863:4: (otherlv_4= RULE_ID )
            // InternalMappingAssistance.g:864:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredServiceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_4, grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleServiceName"
    // InternalMappingAssistance.g:883:1: entryRuleServiceName returns [EObject current=null] : iv_ruleServiceName= ruleServiceName EOF ;
    public final EObject entryRuleServiceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceName = null;


        try {
            // InternalMappingAssistance.g:883:52: (iv_ruleServiceName= ruleServiceName EOF )
            // InternalMappingAssistance.g:884:2: iv_ruleServiceName= ruleServiceName EOF
            {
             newCompositeNode(grammarAccess.getServiceNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceName=ruleServiceName();

            state._fsp--;

             current =iv_ruleServiceName; 
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
    // $ANTLR end "entryRuleServiceName"


    // $ANTLR start "ruleServiceName"
    // InternalMappingAssistance.g:890:1: ruleServiceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleServiceName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:896:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMappingAssistance.g:897:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMappingAssistance.g:897:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMappingAssistance.g:898:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMappingAssistance.g:898:3: (lv_name_0_0= RULE_ID )
            // InternalMappingAssistance.g:899:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getServiceNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleServiceName"


    // $ANTLR start "ruleType"
    // InternalMappingAssistance.g:918:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMappingAssistance.g:924:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalMappingAssistance.g:925:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalMappingAssistance.g:925:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            case 33:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMappingAssistance.g:926:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalMappingAssistance.g:926:3: (enumLiteral_0= 'INT' )
                    // InternalMappingAssistance.g:927:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:934:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalMappingAssistance.g:934:3: (enumLiteral_1= 'STRING' )
                    // InternalMappingAssistance.g:935:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:942:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalMappingAssistance.g:942:3: (enumLiteral_2= 'Boolean' )
                    // InternalMappingAssistance.g:943:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:950:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalMappingAssistance.g:950:3: (enumLiteral_3= 'Double' )
                    // InternalMappingAssistance.g:951:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000009800012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000009820012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000009000012L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000009000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});

}