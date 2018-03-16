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
import java.util.Map;
import java.util.HashMap;
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
            	      					"com.aelos.xtext.architecture.Architecture.AbstractModel");
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
    // InternalArchitecture.g:101:1: entryRuleAbstractModel returns [EObject current=null] : iv_ruleAbstractModel= ruleAbstractModel EOF ;
    public final EObject entryRuleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractModel = null;


        try {
            // InternalArchitecture.g:101:54: (iv_ruleAbstractModel= ruleAbstractModel EOF )
            // InternalArchitecture.g:102:2: iv_ruleAbstractModel= ruleAbstractModel EOF
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
    // InternalArchitecture.g:108:1: ruleAbstractModel returns [EObject current=null] : ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject lv_comp_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:114:2: ( ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ ) )
            // InternalArchitecture.g:115:2: ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ )
            {
            // InternalArchitecture.g:115:2: ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ )
            // InternalArchitecture.g:116:3: (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+
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
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_4);
                    this_Import_0=ruleImport();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_Import_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;

            }

            // InternalArchitecture.g:126:3: ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred1_InternalArchitecture()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalArchitecture.g:127:4: ( 'Component:' )=> (lv_comp_1_0= ruleComponent )
            	    {
            	    // InternalArchitecture.g:128:4: (lv_comp_1_0= ruleComponent )
            	    // InternalArchitecture.g:129:5: lv_comp_1_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_comp_1_0=ruleComponent();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // InternalArchitecture.g:150:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalArchitecture.g:150:47: (iv_ruleImport= ruleImport EOF )
            // InternalArchitecture.g:151:2: iv_ruleImport= ruleImport EOF
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
    // InternalArchitecture.g:157:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:163:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalArchitecture.g:164:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalArchitecture.g:164:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalArchitecture.g:165:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalArchitecture.g:169:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:170:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:170:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:171:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
              						"com.aelos.xtext.architecture.Architecture.QualifiedNameWithWildcard");
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
    // InternalArchitecture.g:192:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalArchitecture.g:192:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalArchitecture.g:193:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalArchitecture.g:199:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:205:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalArchitecture.g:206:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalArchitecture.g:206:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalArchitecture.g:207:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalArchitecture.g:217:3: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArchitecture.g:218:4: kw= '.*'
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
    // InternalArchitecture.g:228:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalArchitecture.g:228:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalArchitecture.g:229:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalArchitecture.g:235:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalArchitecture.g:241:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalArchitecture.g:242:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalArchitecture.g:242:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalArchitecture.g:243:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalArchitecture.g:250:3: (kw= '.' this_ID_2= RULE_ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArchitecture.g:251:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
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


    // $ANTLR start "entryRuleComponent"
    // InternalArchitecture.g:268:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalArchitecture.g:268:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalArchitecture.g:269:2: iv_ruleComponent= ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalArchitecture.g:275:1: ruleComponent returns [EObject current=null] : ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* ) ;
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
            // InternalArchitecture.g:281:2: ( ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* ) )
            // InternalArchitecture.g:282:2: ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* )
            {
            // InternalArchitecture.g:282:2: ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* )
            // InternalArchitecture.g:283:3: ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )*
            {
            // InternalArchitecture.g:283:3: ( ( 'Component:' )=>otherlv_0= 'Component:' )
            // InternalArchitecture.g:284:4: ( 'Component:' )=>otherlv_0= 'Component:'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
              			
            }

            }

            // InternalArchitecture.g:290:3: ( (lv_inst_1_0= ruleInstanceComp ) )
            // InternalArchitecture.g:291:4: (lv_inst_1_0= ruleInstanceComp )
            {
            // InternalArchitecture.g:291:4: (lv_inst_1_0= ruleInstanceComp )
            // InternalArchitecture.g:292:5: lv_inst_1_0= ruleInstanceComp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_inst_1_0=ruleInstanceComp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonKeyword_2());
              		
            }
            // InternalArchitecture.g:313:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
            // InternalArchitecture.g:314:4: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
            {
            // InternalArchitecture.g:318:4: (lv_name_3_0= RULE_ID )
            // InternalArchitecture.g:319:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getProvidedServicesKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getConfKeyword_5());
              		
            }
            // InternalArchitecture.g:343:3: ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )*
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
            	    // InternalArchitecture.g:344:4: ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ','
            	    {
            	    // InternalArchitecture.g:344:4: ( (lv_arg_6_0= ruleVariable ) )
            	    // InternalArchitecture.g:345:5: (lv_arg_6_0= ruleVariable )
            	    {
            	    // InternalArchitecture.g:345:5: (lv_arg_6_0= ruleVariable )
            	    // InternalArchitecture.g:346:6: lv_arg_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_arg_6_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_7=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_6_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalArchitecture.g:368:3: ( (lv_arg1_8_0= ruleVariable ) )
            // InternalArchitecture.g:369:4: (lv_arg1_8_0= ruleVariable )
            {
            // InternalArchitecture.g:369:4: (lv_arg1_8_0= ruleVariable )
            // InternalArchitecture.g:370:5: lv_arg1_8_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_arg1_8_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_9=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalArchitecture.g:391:3: ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )*
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
            	    // InternalArchitecture.g:392:4: ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )?
            	    {
            	    // InternalArchitecture.g:392:4: ( (lv_methode_10_0= ruleServiceName ) )
            	    // InternalArchitecture.g:393:5: (lv_methode_10_0= ruleServiceName )
            	    {
            	    // InternalArchitecture.g:393:5: (lv_methode_10_0= ruleServiceName )
            	    // InternalArchitecture.g:394:6: lv_methode_10_0= ruleServiceName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_methode_10_0=ruleServiceName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_15); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1());
            	      			
            	    }
            	    // InternalArchitecture.g:415:4: ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==RULE_ID) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalArchitecture.g:416:5: ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) )
            	    	    {
            	    	    // InternalArchitecture.g:416:5: ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )*
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
            	    	    	    // InternalArchitecture.g:417:6: ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ','
            	    	    	    {
            	    	    	    // InternalArchitecture.g:417:6: ( (lv_arg_12_0= ruleVariable ) )
            	    	    	    // InternalArchitecture.g:418:7: (lv_arg_12_0= ruleVariable )
            	    	    	    {
            	    	    	    // InternalArchitecture.g:418:7: (lv_arg_12_0= ruleVariable )
            	    	    	    // InternalArchitecture.g:419:8: lv_arg_12_0= ruleVariable
            	    	    	    {
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      								newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0());
            	    	    	      							
            	    	    	    }
            	    	    	    pushFollow(FOLLOW_11);
            	    	    	    lv_arg_12_0=ruleVariable();

            	    	    	    state._fsp--;
            	    	    	    if (state.failed) return current;
            	    	    	    if ( state.backtracking==0 ) {

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


            	    	    	    }

            	    	    	    otherlv_13=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      						newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1());
            	    	    	      					
            	    	    	    }

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop7;
            	    	        }
            	    	    } while (true);

            	    	    // InternalArchitecture.g:441:5: ( (lv_arg_14_0= ruleVariable ) )
            	    	    // InternalArchitecture.g:442:6: (lv_arg_14_0= ruleVariable )
            	    	    {
            	    	    // InternalArchitecture.g:442:6: (lv_arg_14_0= ruleVariable )
            	    	    // InternalArchitecture.g:443:7: lv_arg_14_0= ruleVariable
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_arg_14_0=ruleVariable();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3());
            	      			
            	    }
            	    // InternalArchitecture.g:465:4: (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==15) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalArchitecture.g:466:5: otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) )
            	            {
            	            otherlv_16=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getColonKeyword_9_4_0());
            	              				
            	            }
            	            // InternalArchitecture.g:470:5: ( (lv_arg_17_0= ruleVariable ) )
            	            // InternalArchitecture.g:471:6: (lv_arg_17_0= ruleVariable )
            	            {
            	            // InternalArchitecture.g:471:6: (lv_arg_17_0= ruleVariable )
            	            // InternalArchitecture.g:472:7: lv_arg_17_0= ruleVariable
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_13);
            	            lv_arg_17_0=ruleVariable();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

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


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalArchitecture.g:491:3: (otherlv_18= 'RequiredServices:' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalArchitecture.g:492:4: otherlv_18= 'RequiredServices:'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRequiredServicesKeyword_10());
                      			
                    }

                    }
                    break;

            }

            // InternalArchitecture.g:497:3: ( (lv_req_19_0= ruleRequiredService ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:498:4: (lv_req_19_0= ruleRequiredService )
            	    {
            	    // InternalArchitecture.g:498:4: (lv_req_19_0= ruleRequiredService )
            	    // InternalArchitecture.g:499:5: lv_req_19_0= ruleRequiredService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_req_19_0=ruleRequiredService();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalArchitecture.g:516:3: ( (lv_bind_20_0= ruleBindings ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArchitecture.g:517:4: (lv_bind_20_0= ruleBindings )
            	    {
            	    // InternalArchitecture.g:517:4: (lv_bind_20_0= ruleBindings )
            	    // InternalArchitecture.g:518:5: lv_bind_20_0= ruleBindings
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_bind_20_0=ruleBindings();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleInstanceComp"
    // InternalArchitecture.g:539:1: entryRuleInstanceComp returns [EObject current=null] : iv_ruleInstanceComp= ruleInstanceComp EOF ;
    public final EObject entryRuleInstanceComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceComp = null;


        try {
            // InternalArchitecture.g:539:53: (iv_ruleInstanceComp= ruleInstanceComp EOF )
            // InternalArchitecture.g:540:2: iv_ruleInstanceComp= ruleInstanceComp EOF
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
    // InternalArchitecture.g:546:1: ruleInstanceComp returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstanceComp() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:552:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArchitecture.g:553:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArchitecture.g:553:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:554:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:554:3: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:555:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


    // $ANTLR start "entryRuleVariable"
    // InternalArchitecture.g:574:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalArchitecture.g:574:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalArchitecture.g:575:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalArchitecture.g:581:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:587:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalArchitecture.g:588:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalArchitecture.g:588:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalArchitecture.g:589:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalArchitecture.g:589:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:590:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:590:4: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:591:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,15,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
              		
            }
            // InternalArchitecture.g:611:3: ( (lv_type_2_0= ruleType ) )
            // InternalArchitecture.g:612:4: (lv_type_2_0= ruleType )
            {
            // InternalArchitecture.g:612:4: (lv_type_2_0= ruleType )
            // InternalArchitecture.g:613:5: lv_type_2_0= ruleType
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
              						"com.aelos.xtext.architecture.Architecture.Type");
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
    // InternalArchitecture.g:634:1: entryRuleBindings returns [EObject current=null] : iv_ruleBindings= ruleBindings EOF ;
    public final EObject entryRuleBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindings = null;


        try {
            // InternalArchitecture.g:634:49: (iv_ruleBindings= ruleBindings EOF )
            // InternalArchitecture.g:635:2: iv_ruleBindings= ruleBindings EOF
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
    // InternalArchitecture.g:641:1: ruleBindings returns [EObject current=null] : (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) ;
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
            // InternalArchitecture.g:647:2: ( (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) )
            // InternalArchitecture.g:648:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            {
            // InternalArchitecture.g:648:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            // InternalArchitecture.g:649:3: otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBindingsAccess().getBindKeyword_0());
              		
            }
            // InternalArchitecture.g:653:3: ( (otherlv_1= RULE_ID ) )
            // InternalArchitecture.g:654:4: (otherlv_1= RULE_ID )
            {
            // InternalArchitecture.g:654:4: (otherlv_1= RULE_ID )
            // InternalArchitecture.g:655:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getBindingsAccess().getNameComp1InstanceCompCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBindingsAccess().getFullStopKeyword_2());
              		
            }
            // InternalArchitecture.g:670:3: ( (otherlv_3= RULE_ID ) )
            // InternalArchitecture.g:671:4: (otherlv_3= RULE_ID )
            {
            // InternalArchitecture.g:671:4: (otherlv_3= RULE_ID )
            // InternalArchitecture.g:672:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBindingsAccess().getCommaKeyword_4());
              		
            }
            // InternalArchitecture.g:687:3: ( (otherlv_5= RULE_ID ) )
            // InternalArchitecture.g:688:4: (otherlv_5= RULE_ID )
            {
            // InternalArchitecture.g:688:4: (otherlv_5= RULE_ID )
            // InternalArchitecture.g:689:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getBindingsAccess().getNameComp2InstanceCompCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBindingsAccess().getFullStopKeyword_6());
              		
            }
            // InternalArchitecture.g:704:3: ( (otherlv_7= RULE_ID ) )
            // InternalArchitecture.g:705:4: (otherlv_7= RULE_ID )
            {
            // InternalArchitecture.g:705:4: (otherlv_7= RULE_ID )
            // InternalArchitecture.g:706:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0());
              				
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


    // $ANTLR start "entryRuleRequiredService"
    // InternalArchitecture.g:725:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalArchitecture.g:725:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalArchitecture.g:726:2: iv_ruleRequiredService= ruleRequiredService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequiredService=ruleRequiredService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredService; 
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
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalArchitecture.g:732:1: ruleRequiredService returns [EObject current=null] : ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalArchitecture.g:738:2: ( ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalArchitecture.g:739:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalArchitecture.g:739:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalArchitecture.g:740:3: ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalArchitecture.g:740:3: ( (lv_nameVarMethode_0_0= ruleVariable ) )
            // InternalArchitecture.g:741:4: (lv_nameVarMethode_0_0= ruleVariable )
            {
            // InternalArchitecture.g:741:4: (lv_nameVarMethode_0_0= ruleVariable )
            // InternalArchitecture.g:742:5: lv_nameVarMethode_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_nameVarMethode_0_0=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_1=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalArchitecture.g:763:3: ( (otherlv_2= RULE_ID ) )
            // InternalArchitecture.g:764:4: (otherlv_2= RULE_ID )
            {
            // InternalArchitecture.g:764:4: (otherlv_2= RULE_ID )
            // InternalArchitecture.g:765:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRequiredServiceRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3());
              		
            }
            // InternalArchitecture.g:780:3: ( (otherlv_4= RULE_ID ) )
            // InternalArchitecture.g:781:4: (otherlv_4= RULE_ID )
            {
            // InternalArchitecture.g:781:4: (otherlv_4= RULE_ID )
            // InternalArchitecture.g:782:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRequiredServiceRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,24,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5());
              		
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
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleServiceName"
    // InternalArchitecture.g:801:1: entryRuleServiceName returns [EObject current=null] : iv_ruleServiceName= ruleServiceName EOF ;
    public final EObject entryRuleServiceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceName = null;


        try {
            // InternalArchitecture.g:801:52: (iv_ruleServiceName= ruleServiceName EOF )
            // InternalArchitecture.g:802:2: iv_ruleServiceName= ruleServiceName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getServiceNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleServiceName=ruleServiceName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleServiceName; 
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
    // $ANTLR end "entryRuleServiceName"


    // $ANTLR start "ruleServiceName"
    // InternalArchitecture.g:808:1: ruleServiceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleServiceName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:814:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArchitecture.g:815:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArchitecture.g:815:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:816:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:816:3: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:817:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleServiceName"


    // $ANTLR start "ruleType"
    // InternalArchitecture.g:836:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalArchitecture.g:842:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalArchitecture.g:843:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalArchitecture.g:843:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
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
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalArchitecture.g:844:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalArchitecture.g:844:3: (enumLiteral_0= 'INT' )
                    // InternalArchitecture.g:845:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:852:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalArchitecture.g:852:3: (enumLiteral_1= 'STRING' )
                    // InternalArchitecture.g:853:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:860:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalArchitecture.g:860:3: (enumLiteral_2= 'Boolean' )
                    // InternalArchitecture.g:861:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalArchitecture.g:868:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalArchitecture.g:868:3: (enumLiteral_3= 'Double' )
                    // InternalArchitecture.g:869:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalArchitecture
    public final void synpred1_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:127:4: ( 'Component:' )
        // InternalArchitecture.g:127:5: 'Component:'
        {
        match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalArchitecture

    // Delegated rules

    public final boolean synpred1_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

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