package com.aelos.xtext.architecture.parser.antlr.internal;

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
import com.aelos.xtext.architecture.services.ArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArchitectureParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'Component:'", "':'", "'ProvidedServices:'", "'conf('", "','", "')'", "'('", "'RequiredServices:'", "'bind('", "':='", "';'", "'INT'", "'STRING'", "'Boolean'", "'Double'"
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArchitectureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArchitectureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArchitectureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArchitecture.g"; }



     	private ArchitectureGrammarAccess grammarAccess;

        public InternalArchitectureParser(TokenStream input, ArchitectureGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ArchitectureGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalArchitecture.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalArchitecture.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalArchitecture.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalArchitecture.g:72:1: ruleModel returns [EObject current=null] : ( (lv_function_0_0= ruleAbstractModel ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_function_0_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:78:2: ( ( (lv_function_0_0= ruleAbstractModel ) )* )
            // InternalArchitecture.g:79:2: ( (lv_function_0_0= ruleAbstractModel ) )*
            {
            // InternalArchitecture.g:79:2: ( (lv_function_0_0= ruleAbstractModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArchitecture.g:80:3: (lv_function_0_0= ruleAbstractModel )
            	    {
            	    // InternalArchitecture.g:80:3: (lv_function_0_0= ruleAbstractModel )
            	    // InternalArchitecture.g:81:4: lv_function_0_0= ruleAbstractModel
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
            	    					"com.aelos.xtext.architecture.Architecture.AbstractModel");
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
    // InternalArchitecture.g:101:1: entryRuleAbstractModel returns [EObject current=null] : iv_ruleAbstractModel= ruleAbstractModel EOF ;
    public final EObject entryRuleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractModel = null;


        try {
            // InternalArchitecture.g:101:54: (iv_ruleAbstractModel= ruleAbstractModel EOF )
            // InternalArchitecture.g:102:2: iv_ruleAbstractModel= ruleAbstractModel EOF
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
    // InternalArchitecture.g:108:1: ruleAbstractModel returns [EObject current=null] : ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject lv_comp_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:114:2: ( ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ ) )
            // InternalArchitecture.g:115:2: ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ )
            {
            // InternalArchitecture.g:115:2: ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ )
            // InternalArchitecture.g:116:3: (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+
            {
            // InternalArchitecture.g:116:3: (this_Import_0= ruleImport )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalArchitecture.g:117:4: this_Import_0= ruleImport
                    {

                    				newCompositeNode(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    				current = this_Import_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalArchitecture.g:126:3: ( (lv_comp_1_0= ruleComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArchitecture.g:127:4: (lv_comp_1_0= ruleComponent )
            	    {
            	    // InternalArchitecture.g:127:4: (lv_comp_1_0= ruleComponent )
            	    // InternalArchitecture.g:128:5: lv_comp_1_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_comp_1_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAbstractModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comp",
            	    						lv_comp_1_0,
            	    						"com.aelos.xtext.architecture.Architecture.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalArchitecture.g:149:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalArchitecture.g:149:47: (iv_ruleImport= ruleImport EOF )
            // InternalArchitecture.g:150:2: iv_ruleImport= ruleImport EOF
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
    // InternalArchitecture.g:156:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:162:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalArchitecture.g:163:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalArchitecture.g:163:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalArchitecture.g:164:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalArchitecture.g:168:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:169:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:169:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:170:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
            						"com.aelos.xtext.architecture.Architecture.QualifiedNameWithWildcard");
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
    // InternalArchitecture.g:191:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalArchitecture.g:191:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalArchitecture.g:192:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalArchitecture.g:198:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:204:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalArchitecture.g:205:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalArchitecture.g:205:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalArchitecture.g:206:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalArchitecture.g:216:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArchitecture.g:217:4: kw= '.*'
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
    // InternalArchitecture.g:227:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalArchitecture.g:227:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalArchitecture.g:228:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalArchitecture.g:234:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalArchitecture.g:240:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalArchitecture.g:241:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalArchitecture.g:241:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalArchitecture.g:242:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalArchitecture.g:249:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArchitecture.g:250:4: kw= '.' this_ID_2= RULE_ID
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


    // $ANTLR start "entryRuleComponent"
    // InternalArchitecture.g:267:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalArchitecture.g:267:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalArchitecture.g:268:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalArchitecture.g:274:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component:' ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_inst_1_0 = null;

        EObject lv_arg_6_0 = null;

        EObject lv_arg1_8_0 = null;

        EObject lv_methode_10_0 = null;

        EObject lv_arg_12_0 = null;

        EObject lv_arg_14_0 = null;

        EObject lv_arg_17_0 = null;

        EObject lv_req_19_0 = null;

        EObject lv_bind_20_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:280:2: ( (otherlv_0= 'Component:' ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* ) )
            // InternalArchitecture.g:281:2: (otherlv_0= 'Component:' ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* )
            {
            // InternalArchitecture.g:281:2: (otherlv_0= 'Component:' ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* )
            // InternalArchitecture.g:282:3: otherlv_0= 'Component:' ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            // InternalArchitecture.g:286:3: ( (lv_inst_1_0= ruleInstanceComp ) )
            // InternalArchitecture.g:287:4: (lv_inst_1_0= ruleInstanceComp )
            {
            // InternalArchitecture.g:287:4: (lv_inst_1_0= ruleInstanceComp )
            // InternalArchitecture.g:288:5: lv_inst_1_0= ruleInstanceComp
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_inst_1_0=ruleInstanceComp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"inst",
            						lv_inst_1_0,
            						"com.aelos.xtext.architecture.Architecture.InstanceComp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonKeyword_2());
            		
            // InternalArchitecture.g:309:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalArchitecture.g:310:4: (lv_name_3_0= RULE_ID )
            {
            // InternalArchitecture.g:310:4: (lv_name_3_0= RULE_ID )
            // InternalArchitecture.g:311:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_3_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getProvidedServicesKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getConfKeyword_5());
            		
            // InternalArchitecture.g:335:3: ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==15) ) {
                        switch ( input.LA(3) ) {
                        case 25:
                            {
                            int LA6_3 = input.LA(4);

                            if ( (LA6_3==18) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 26:
                            {
                            int LA6_4 = input.LA(4);

                            if ( (LA6_4==18) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 27:
                            {
                            int LA6_5 = input.LA(4);

                            if ( (LA6_5==18) ) {
                                alt6=1;
                            }


                            }
                            break;
                        case 28:
                            {
                            int LA6_6 = input.LA(4);

                            if ( (LA6_6==18) ) {
                                alt6=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:336:4: ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ','
            	    {
            	    // InternalArchitecture.g:336:4: ( (lv_arg_6_0= ruleVariable ) )
            	    // InternalArchitecture.g:337:5: (lv_arg_6_0= ruleVariable )
            	    {
            	    // InternalArchitecture.g:337:5: (lv_arg_6_0= ruleVariable )
            	    // InternalArchitecture.g:338:6: lv_arg_6_0= ruleVariable
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_arg_6_0=ruleVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"arg",
            	    							lv_arg_6_0,
            	    							"com.aelos.xtext.architecture.Architecture.Variable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,18,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_6_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalArchitecture.g:360:3: ( (lv_arg1_8_0= ruleVariable ) )
            // InternalArchitecture.g:361:4: (lv_arg1_8_0= ruleVariable )
            {
            // InternalArchitecture.g:361:4: (lv_arg1_8_0= ruleVariable )
            // InternalArchitecture.g:362:5: lv_arg1_8_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_12);
            lv_arg1_8_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					add(
            						current,
            						"arg1",
            						lv_arg1_8_0,
            						"com.aelos.xtext.architecture.Architecture.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightParenthesisKeyword_8());
            		
            // InternalArchitecture.g:383:3: ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==20) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:384:4: ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )?
            	    {
            	    // InternalArchitecture.g:384:4: ( (lv_methode_10_0= ruleServiceName ) )
            	    // InternalArchitecture.g:385:5: (lv_methode_10_0= ruleServiceName )
            	    {
            	    // InternalArchitecture.g:385:5: (lv_methode_10_0= ruleServiceName )
            	    // InternalArchitecture.g:386:6: lv_methode_10_0= ruleServiceName
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_methode_10_0=ruleServiceName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"methode",
            	    							lv_methode_10_0,
            	    							"com.aelos.xtext.architecture.Architecture.ServiceName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_15); 

            	    				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1());
            	    			
            	    // InternalArchitecture.g:407:4: ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ID) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalArchitecture.g:408:5: ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) )
            	    	    {
            	    	    // InternalArchitecture.g:408:5: ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )*
            	    	    loop7:
            	    	    do {
            	    	        int alt7=2;
            	    	        int LA7_0 = input.LA(1);

            	    	        if ( (LA7_0==RULE_ID) ) {
            	    	            int LA7_1 = input.LA(2);

            	    	            if ( (LA7_1==15) ) {
            	    	                switch ( input.LA(3) ) {
            	    	                case 25:
            	    	                    {
            	    	                    int LA7_3 = input.LA(4);

            	    	                    if ( (LA7_3==18) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 26:
            	    	                    {
            	    	                    int LA7_4 = input.LA(4);

            	    	                    if ( (LA7_4==18) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 27:
            	    	                    {
            	    	                    int LA7_5 = input.LA(4);

            	    	                    if ( (LA7_5==18) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 28:
            	    	                    {
            	    	                    int LA7_6 = input.LA(4);

            	    	                    if ( (LA7_6==18) ) {
            	    	                        alt7=1;
            	    	                    }


            	    	                    }
            	    	                    break;

            	    	                }

            	    	            }


            	    	        }


            	    	        switch (alt7) {
            	    	    	case 1 :
            	    	    	    // InternalArchitecture.g:409:6: ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ','
            	    	    	    {
            	    	    	    // InternalArchitecture.g:409:6: ( (lv_arg_12_0= ruleVariable ) )
            	    	    	    // InternalArchitecture.g:410:7: (lv_arg_12_0= ruleVariable )
            	    	    	    {
            	    	    	    // InternalArchitecture.g:410:7: (lv_arg_12_0= ruleVariable )
            	    	    	    // InternalArchitecture.g:411:8: lv_arg_12_0= ruleVariable
            	    	    	    {

            	    	    	    								newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0());
            	    	    	    							
            	    	    	    pushFollow(FOLLOW_11);
            	    	    	    lv_arg_12_0=ruleVariable();

            	    	    	    state._fsp--;


            	    	    	    								if (current==null) {
            	    	    	    									current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	    	    								}
            	    	    	    								add(
            	    	    	    									current,
            	    	    	    									"arg",
            	    	    	    									lv_arg_12_0,
            	    	    	    									"com.aelos.xtext.architecture.Architecture.Variable");
            	    	    	    								afterParserOrEnumRuleCall();
            	    	    	    							

            	    	    	    }


            	    	    	    }

            	    	    	    otherlv_13=(Token)match(input,18,FOLLOW_5); 

            	    	    	    						newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1());
            	    	    	    					

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop7;
            	    	        }
            	    	    } while (true);

            	    	    // InternalArchitecture.g:433:5: ( (lv_arg_14_0= ruleVariable ) )
            	    	    // InternalArchitecture.g:434:6: (lv_arg_14_0= ruleVariable )
            	    	    {
            	    	    // InternalArchitecture.g:434:6: (lv_arg_14_0= ruleVariable )
            	    	    // InternalArchitecture.g:435:7: lv_arg_14_0= ruleVariable
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_arg_14_0=ruleVariable();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"arg",
            	    	    								lv_arg_14_0,
            	    	    								"com.aelos.xtext.architecture.Architecture.Variable");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,19,FOLLOW_16); 

            	    				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3());
            	    			
            	    // InternalArchitecture.g:457:4: (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==15) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalArchitecture.g:458:5: otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) )
            	            {
            	            otherlv_16=(Token)match(input,15,FOLLOW_5); 

            	            					newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getColonKeyword_9_4_0());
            	            				
            	            // InternalArchitecture.g:462:5: ( (lv_arg_17_0= ruleVariable ) )
            	            // InternalArchitecture.g:463:6: (lv_arg_17_0= ruleVariable )
            	            {
            	            // InternalArchitecture.g:463:6: (lv_arg_17_0= ruleVariable )
            	            // InternalArchitecture.g:464:7: lv_arg_17_0= ruleVariable
            	            {

            	            							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0());
            	            						
            	            pushFollow(FOLLOW_13);
            	            lv_arg_17_0=ruleVariable();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getComponentRule());
            	            							}
            	            							add(
            	            								current,
            	            								"arg",
            	            								lv_arg_17_0,
            	            								"com.aelos.xtext.architecture.Architecture.Variable");
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

            // InternalArchitecture.g:483:3: (otherlv_18= 'RequiredServices:' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArchitecture.g:484:4: otherlv_18= 'RequiredServices:'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRequiredServicesKeyword_10());
                    			

                    }
                    break;

            }

            // InternalArchitecture.g:489:3: ( (lv_req_19_0= ruleRequiredService ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:490:4: (lv_req_19_0= ruleRequiredService )
            	    {
            	    // InternalArchitecture.g:490:4: (lv_req_19_0= ruleRequiredService )
            	    // InternalArchitecture.g:491:5: lv_req_19_0= ruleRequiredService
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_req_19_0=ruleRequiredService();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"req",
            	    						lv_req_19_0,
            	    						"com.aelos.xtext.architecture.Architecture.RequiredService");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalArchitecture.g:508:3: ( (lv_bind_20_0= ruleBindings ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArchitecture.g:509:4: (lv_bind_20_0= ruleBindings )
            	    {
            	    // InternalArchitecture.g:509:4: (lv_bind_20_0= ruleBindings )
            	    // InternalArchitecture.g:510:5: lv_bind_20_0= ruleBindings
            	    {

            	    					newCompositeNode(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_bind_20_0=ruleBindings();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bind",
            	    						lv_bind_20_0,
            	    						"com.aelos.xtext.architecture.Architecture.Bindings");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalArchitecture.g:531:1: entryRuleInstanceComp returns [EObject current=null] : iv_ruleInstanceComp= ruleInstanceComp EOF ;
    public final EObject entryRuleInstanceComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceComp = null;


        try {
            // InternalArchitecture.g:531:53: (iv_ruleInstanceComp= ruleInstanceComp EOF )
            // InternalArchitecture.g:532:2: iv_ruleInstanceComp= ruleInstanceComp EOF
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
    // InternalArchitecture.g:538:1: ruleInstanceComp returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstanceComp() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:544:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArchitecture.g:545:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArchitecture.g:545:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:546:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:546:3: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:547:4: lv_name_0_0= RULE_ID
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
    // InternalArchitecture.g:566:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalArchitecture.g:566:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalArchitecture.g:567:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalArchitecture.g:573:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:579:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalArchitecture.g:580:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalArchitecture.g:580:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalArchitecture.g:581:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalArchitecture.g:581:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:582:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:582:4: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:583:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalArchitecture.g:603:3: ( (lv_type_2_0= ruleType ) )
            // InternalArchitecture.g:604:4: (lv_type_2_0= ruleType )
            {
            // InternalArchitecture.g:604:4: (lv_type_2_0= ruleType )
            // InternalArchitecture.g:605:5: lv_type_2_0= ruleType
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
            						"com.aelos.xtext.architecture.Architecture.Type");
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


    // $ANTLR start "entryRuleBindings"
    // InternalArchitecture.g:626:1: entryRuleBindings returns [EObject current=null] : iv_ruleBindings= ruleBindings EOF ;
    public final EObject entryRuleBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindings = null;


        try {
            // InternalArchitecture.g:626:49: (iv_ruleBindings= ruleBindings EOF )
            // InternalArchitecture.g:627:2: iv_ruleBindings= ruleBindings EOF
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
    // InternalArchitecture.g:633:1: ruleBindings returns [EObject current=null] : (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) ;
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
            // InternalArchitecture.g:639:2: ( (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) )
            // InternalArchitecture.g:640:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            {
            // InternalArchitecture.g:640:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            // InternalArchitecture.g:641:3: otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBindingsAccess().getBindKeyword_0());
            		
            // InternalArchitecture.g:645:3: ( (otherlv_1= RULE_ID ) )
            // InternalArchitecture.g:646:4: (otherlv_1= RULE_ID )
            {
            // InternalArchitecture.g:646:4: (otherlv_1= RULE_ID )
            // InternalArchitecture.g:647:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getBindingsAccess().getFullStopKeyword_2());
            		
            // InternalArchitecture.g:662:3: ( (otherlv_3= RULE_ID ) )
            // InternalArchitecture.g:663:4: (otherlv_3= RULE_ID )
            {
            // InternalArchitecture.g:663:4: (otherlv_3= RULE_ID )
            // InternalArchitecture.g:664:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_3, grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getBindingsAccess().getCommaKeyword_4());
            		
            // InternalArchitecture.g:679:3: ( (otherlv_5= RULE_ID ) )
            // InternalArchitecture.g:680:4: (otherlv_5= RULE_ID )
            {
            // InternalArchitecture.g:680:4: (otherlv_5= RULE_ID )
            // InternalArchitecture.g:681:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_5, grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getBindingsAccess().getFullStopKeyword_6());
            		
            // InternalArchitecture.g:696:3: ( (otherlv_7= RULE_ID ) )
            // InternalArchitecture.g:697:4: (otherlv_7= RULE_ID )
            {
            // InternalArchitecture.g:697:4: (otherlv_7= RULE_ID )
            // InternalArchitecture.g:698:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBindingsRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_7, grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_2); 

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
    // InternalArchitecture.g:717:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalArchitecture.g:717:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalArchitecture.g:718:2: iv_ruleRequiredService= ruleRequiredService EOF
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
    // InternalArchitecture.g:724:1: ruleRequiredService returns [EObject current=null] : ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalArchitecture.g:730:2: ( ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalArchitecture.g:731:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalArchitecture.g:731:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalArchitecture.g:732:3: ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalArchitecture.g:732:3: ( (lv_nameVarMethode_0_0= ruleVariable ) )
            // InternalArchitecture.g:733:4: (lv_nameVarMethode_0_0= ruleVariable )
            {
            // InternalArchitecture.g:733:4: (lv_nameVarMethode_0_0= ruleVariable )
            // InternalArchitecture.g:734:5: lv_nameVarMethode_0_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
            lv_nameVarMethode_0_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequiredServiceRule());
            					}
            					add(
            						current,
            						"nameVarMethode",
            						lv_nameVarMethode_0_0,
            						"com.aelos.xtext.architecture.Architecture.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1());
            		
            // InternalArchitecture.g:755:3: ( (otherlv_2= RULE_ID ) )
            // InternalArchitecture.g:756:4: (otherlv_2= RULE_ID )
            {
            // InternalArchitecture.g:756:4: (otherlv_2= RULE_ID )
            // InternalArchitecture.g:757:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredServiceRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3());
            		
            // InternalArchitecture.g:772:3: ( (otherlv_4= RULE_ID ) )
            // InternalArchitecture.g:773:4: (otherlv_4= RULE_ID )
            {
            // InternalArchitecture.g:773:4: (otherlv_4= RULE_ID )
            // InternalArchitecture.g:774:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredServiceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_4, grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalArchitecture.g:793:1: entryRuleServiceName returns [EObject current=null] : iv_ruleServiceName= ruleServiceName EOF ;
    public final EObject entryRuleServiceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceName = null;


        try {
            // InternalArchitecture.g:793:52: (iv_ruleServiceName= ruleServiceName EOF )
            // InternalArchitecture.g:794:2: iv_ruleServiceName= ruleServiceName EOF
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
    // InternalArchitecture.g:800:1: ruleServiceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleServiceName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:806:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArchitecture.g:807:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArchitecture.g:807:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:808:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:808:3: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:809:4: lv_name_0_0= RULE_ID
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
    // InternalArchitecture.g:828:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalArchitecture.g:834:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalArchitecture.g:835:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalArchitecture.g:835:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt14=1;
                }
                break;
            case 26:
                {
                alt14=2;
                }
                break;
            case 27:
                {
                alt14=3;
                }
                break;
            case 28:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalArchitecture.g:836:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalArchitecture.g:836:3: (enumLiteral_0= 'INT' )
                    // InternalArchitecture.g:837:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:844:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalArchitecture.g:844:3: (enumLiteral_1= 'STRING' )
                    // InternalArchitecture.g:845:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:852:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalArchitecture.g:852:3: (enumLiteral_2= 'Boolean' )
                    // InternalArchitecture.g:853:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalArchitecture.g:860:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalArchitecture.g:860:3: (enumLiteral_3= 'Double' )
                    // InternalArchitecture.g:861:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000608012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});

}