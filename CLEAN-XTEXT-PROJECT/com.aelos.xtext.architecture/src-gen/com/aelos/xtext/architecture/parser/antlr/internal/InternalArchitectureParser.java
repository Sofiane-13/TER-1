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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "':'", "'ProvidedServices:'", "'conf('", "','", "')'", "'('", "'RequiredServices:'", "'bind('", "':='", "';'", "'INT'", "'STRING'", "'Boolean'", "'Double'"
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
    public static final int T__30=30;
    public static final int T__31=31;
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
    // InternalArchitecture.g:72:1: ruleModel returns [EObject current=null] : ( (lv_package_0_0= ruleDomainDeclaration ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_package_0_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:78:2: ( ( (lv_package_0_0= ruleDomainDeclaration ) )* )
            // InternalArchitecture.g:79:2: ( (lv_package_0_0= ruleDomainDeclaration ) )*
            {
            // InternalArchitecture.g:79:2: ( (lv_package_0_0= ruleDomainDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArchitecture.g:80:3: (lv_package_0_0= ruleDomainDeclaration )
            	    {
            	    // InternalArchitecture.g:80:3: (lv_package_0_0= ruleDomainDeclaration )
            	    // InternalArchitecture.g:81:4: lv_package_0_0= ruleDomainDeclaration
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getModelAccess().getPackageDomainDeclarationParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_package_0_0=ruleDomainDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"package",
            	      					lv_package_0_0,
            	      					"com.aelos.xtext.architecture.Architecture.DomainDeclaration");
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


    // $ANTLR start "entryRuleDomainDeclaration"
    // InternalArchitecture.g:101:1: entryRuleDomainDeclaration returns [EObject current=null] : iv_ruleDomainDeclaration= ruleDomainDeclaration EOF ;
    public final EObject entryRuleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainDeclaration = null;


        try {
            // InternalArchitecture.g:101:58: (iv_ruleDomainDeclaration= ruleDomainDeclaration EOF )
            // InternalArchitecture.g:102:2: iv_ruleDomainDeclaration= ruleDomainDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDomainDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDomainDeclaration=ruleDomainDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDomainDeclaration; 
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
    // $ANTLR end "entryRuleDomainDeclaration"


    // $ANTLR start "ruleDomainDeclaration"
    // InternalArchitecture.g:108:1: ruleDomainDeclaration returns [EObject current=null] : (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractModel ) )* otherlv_4= '}' ) ;
    public final EObject ruleDomainDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:114:2: ( (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractModel ) )* otherlv_4= '}' ) )
            // InternalArchitecture.g:115:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractModel ) )* otherlv_4= '}' )
            {
            // InternalArchitecture.g:115:2: (otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractModel ) )* otherlv_4= '}' )
            // InternalArchitecture.g:116:3: otherlv_0= 'domain' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractModel ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0());
              		
            }
            // InternalArchitecture.g:120:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalArchitecture.g:121:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalArchitecture.g:121:4: (lv_name_1_0= ruleQualifiedName )
            // InternalArchitecture.g:122:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDomainDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDomainDeclarationRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"com.aelos.xtext.architecture.Architecture.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalArchitecture.g:143:3: ( (lv_elements_3_0= ruleAbstractModel ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArchitecture.g:144:4: (lv_elements_3_0= ruleAbstractModel )
            	    {
            	    // InternalArchitecture.g:144:4: (lv_elements_3_0= ruleAbstractModel )
            	    // InternalArchitecture.g:145:5: lv_elements_3_0= ruleAbstractModel
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDomainDeclarationAccess().getElementsAbstractModelParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractModel();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getDomainDeclarationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"elements",
            	      						lv_elements_3_0,
            	      						"com.aelos.xtext.architecture.Architecture.AbstractModel");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4());
              		
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
    // $ANTLR end "ruleDomainDeclaration"


    // $ANTLR start "entryRuleAbstractModel"
    // InternalArchitecture.g:170:1: entryRuleAbstractModel returns [EObject current=null] : iv_ruleAbstractModel= ruleAbstractModel EOF ;
    public final EObject entryRuleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractModel = null;


        try {
            // InternalArchitecture.g:170:54: (iv_ruleAbstractModel= ruleAbstractModel EOF )
            // InternalArchitecture.g:171:2: iv_ruleAbstractModel= ruleAbstractModel EOF
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
    // InternalArchitecture.g:177:1: ruleAbstractModel returns [EObject current=null] : ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject lv_comp_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:183:2: ( ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ ) )
            // InternalArchitecture.g:184:2: ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ )
            {
            // InternalArchitecture.g:184:2: ( (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+ )
            // InternalArchitecture.g:185:3: (this_Import_0= ruleImport )? ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+
            {
            // InternalArchitecture.g:185:3: (this_Import_0= ruleImport )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalArchitecture.g:186:4: this_Import_0= ruleImport
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_7);
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

            // InternalArchitecture.g:195:3: ( ( 'Component:' )=> (lv_comp_1_0= ruleComponent ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred1_InternalArchitecture()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalArchitecture.g:196:4: ( 'Component:' )=> (lv_comp_1_0= ruleComponent )
            	    {
            	    // InternalArchitecture.g:197:4: (lv_comp_1_0= ruleComponent )
            	    // InternalArchitecture.g:198:5: lv_comp_1_0= ruleComponent
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
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
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
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
    // InternalArchitecture.g:219:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalArchitecture.g:219:47: (iv_ruleImport= ruleImport EOF )
            // InternalArchitecture.g:220:2: iv_ruleImport= ruleImport EOF
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
    // InternalArchitecture.g:226:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:232:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalArchitecture.g:233:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalArchitecture.g:233:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalArchitecture.g:234:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalArchitecture.g:238:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:239:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:239:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:240:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalArchitecture.g:261:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalArchitecture.g:261:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalArchitecture.g:262:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalArchitecture.g:268:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:274:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalArchitecture.g:275:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalArchitecture.g:275:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalArchitecture.g:276:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_9);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalArchitecture.g:286:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:287:4: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
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
    // InternalArchitecture.g:297:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalArchitecture.g:297:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalArchitecture.g:298:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalArchitecture.g:304:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalArchitecture.g:310:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalArchitecture.g:311:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalArchitecture.g:311:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalArchitecture.g:312:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalArchitecture.g:319:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:320:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalArchitecture.g:337:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalArchitecture.g:337:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalArchitecture.g:338:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalArchitecture.g:344:1: ruleComponent returns [EObject current=null] : ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* ) ;
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
            // InternalArchitecture.g:350:2: ( ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* ) )
            // InternalArchitecture.g:351:2: ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* )
            {
            // InternalArchitecture.g:351:2: ( ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )* )
            // InternalArchitecture.g:352:3: ( ( 'Component:' )=>otherlv_0= 'Component:' ) ( (lv_inst_1_0= ruleInstanceComp ) ) otherlv_2= ':' ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) ) otherlv_4= 'ProvidedServices:' otherlv_5= 'conf(' ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )* ( (lv_arg1_8_0= ruleVariable ) ) otherlv_9= ')' ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )* (otherlv_18= 'RequiredServices:' )? ( (lv_req_19_0= ruleRequiredService ) )* ( (lv_bind_20_0= ruleBindings ) )*
            {
            // InternalArchitecture.g:352:3: ( ( 'Component:' )=>otherlv_0= 'Component:' )
            // InternalArchitecture.g:353:4: ( 'Component:' )=>otherlv_0= 'Component:'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
              			
            }

            }

            // InternalArchitecture.g:359:3: ( (lv_inst_1_0= ruleInstanceComp ) )
            // InternalArchitecture.g:360:4: (lv_inst_1_0= ruleInstanceComp )
            {
            // InternalArchitecture.g:360:4: (lv_inst_1_0= ruleInstanceComp )
            // InternalArchitecture.g:361:5: lv_inst_1_0= ruleInstanceComp
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getColonKeyword_2());
              		
            }
            // InternalArchitecture.g:382:3: ( ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID ) )
            // InternalArchitecture.g:383:4: ( ( RULE_ID ) )=> (lv_name_3_0= RULE_ID )
            {
            // InternalArchitecture.g:387:4: (lv_name_3_0= RULE_ID )
            // InternalArchitecture.g:388:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getProvidedServicesKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getConfKeyword_5());
              		
            }
            // InternalArchitecture.g:412:3: ( ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ',' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==18) ) {
                        switch ( input.LA(3) ) {
                        case 28:
                            {
                            int LA7_3 = input.LA(4);

                            if ( (LA7_3==21) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 29:
                            {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4==21) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 30:
                            {
                            int LA7_5 = input.LA(4);

                            if ( (LA7_5==21) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 31:
                            {
                            int LA7_6 = input.LA(4);

                            if ( (LA7_6==21) ) {
                                alt7=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalArchitecture.g:413:4: ( (lv_arg_6_0= ruleVariable ) ) otherlv_7= ','
            	    {
            	    // InternalArchitecture.g:413:4: ( (lv_arg_6_0= ruleVariable ) )
            	    // InternalArchitecture.g:414:5: (lv_arg_6_0= ruleVariable )
            	    {
            	    // InternalArchitecture.g:414:5: (lv_arg_6_0= ruleVariable )
            	    // InternalArchitecture.g:415:6: lv_arg_6_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
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

            	    otherlv_7=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getCommaKeyword_6_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalArchitecture.g:437:3: ( (lv_arg1_8_0= ruleVariable ) )
            // InternalArchitecture.g:438:4: (lv_arg1_8_0= ruleVariable )
            {
            // InternalArchitecture.g:438:4: (lv_arg1_8_0= ruleVariable )
            // InternalArchitecture.g:439:5: lv_arg1_8_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            otherlv_9=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalArchitecture.g:460:3: ( ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )? )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==23) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:461:4: ( (lv_methode_10_0= ruleServiceName ) ) otherlv_11= '(' ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )* otherlv_15= ')' (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )?
            	    {
            	    // InternalArchitecture.g:461:4: ( (lv_methode_10_0= ruleServiceName ) )
            	    // InternalArchitecture.g:462:5: (lv_methode_10_0= ruleServiceName )
            	    {
            	    // InternalArchitecture.g:462:5: (lv_methode_10_0= ruleServiceName )
            	    // InternalArchitecture.g:463:6: lv_methode_10_0= ruleServiceName
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_17);
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

            	    otherlv_11=(Token)match(input,23,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1());
            	      			
            	    }
            	    // InternalArchitecture.g:484:4: ( ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==RULE_ID) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalArchitecture.g:485:5: ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )* ( (lv_arg_14_0= ruleVariable ) )
            	    	    {
            	    	    // InternalArchitecture.g:485:5: ( ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ',' )*
            	    	    loop8:
            	    	    do {
            	    	        int alt8=2;
            	    	        int LA8_0 = input.LA(1);

            	    	        if ( (LA8_0==RULE_ID) ) {
            	    	            int LA8_1 = input.LA(2);

            	    	            if ( (LA8_1==18) ) {
            	    	                switch ( input.LA(3) ) {
            	    	                case 28:
            	    	                    {
            	    	                    int LA8_3 = input.LA(4);

            	    	                    if ( (LA8_3==21) ) {
            	    	                        alt8=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 29:
            	    	                    {
            	    	                    int LA8_4 = input.LA(4);

            	    	                    if ( (LA8_4==21) ) {
            	    	                        alt8=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 30:
            	    	                    {
            	    	                    int LA8_5 = input.LA(4);

            	    	                    if ( (LA8_5==21) ) {
            	    	                        alt8=1;
            	    	                    }


            	    	                    }
            	    	                    break;
            	    	                case 31:
            	    	                    {
            	    	                    int LA8_6 = input.LA(4);

            	    	                    if ( (LA8_6==21) ) {
            	    	                        alt8=1;
            	    	                    }


            	    	                    }
            	    	                    break;

            	    	                }

            	    	            }


            	    	        }


            	    	        switch (alt8) {
            	    	    	case 1 :
            	    	    	    // InternalArchitecture.g:486:6: ( (lv_arg_12_0= ruleVariable ) ) otherlv_13= ','
            	    	    	    {
            	    	    	    // InternalArchitecture.g:486:6: ( (lv_arg_12_0= ruleVariable ) )
            	    	    	    // InternalArchitecture.g:487:7: (lv_arg_12_0= ruleVariable )
            	    	    	    {
            	    	    	    // InternalArchitecture.g:487:7: (lv_arg_12_0= ruleVariable )
            	    	    	    // InternalArchitecture.g:488:8: lv_arg_12_0= ruleVariable
            	    	    	    {
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      								newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0());
            	    	    	      							
            	    	    	    }
            	    	    	    pushFollow(FOLLOW_14);
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

            	    	    	    otherlv_13=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    	    	    if ( state.backtracking==0 ) {

            	    	    	      						newLeafNode(otherlv_13, grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1());
            	    	    	      					
            	    	    	    }

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop8;
            	    	        }
            	    	    } while (true);

            	    	    // InternalArchitecture.g:510:5: ( (lv_arg_14_0= ruleVariable ) )
            	    	    // InternalArchitecture.g:511:6: (lv_arg_14_0= ruleVariable )
            	    	    {
            	    	    // InternalArchitecture.g:511:6: (lv_arg_14_0= ruleVariable )
            	    	    // InternalArchitecture.g:512:7: lv_arg_14_0= ruleVariable
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_18);
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
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,22,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_15, grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3());
            	      			
            	    }
            	    // InternalArchitecture.g:534:4: (otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) ) )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==18) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalArchitecture.g:535:5: otherlv_16= ':' ( (lv_arg_17_0= ruleVariable ) )
            	            {
            	            otherlv_16=(Token)match(input,18,FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getColonKeyword_9_4_0());
            	              				
            	            }
            	            // InternalArchitecture.g:539:5: ( (lv_arg_17_0= ruleVariable ) )
            	            // InternalArchitecture.g:540:6: (lv_arg_17_0= ruleVariable )
            	            {
            	            // InternalArchitecture.g:540:6: (lv_arg_17_0= ruleVariable )
            	            // InternalArchitecture.g:541:7: lv_arg_17_0= ruleVariable
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_16);
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
            	    break loop11;
                }
            } while (true);

            // InternalArchitecture.g:560:3: (otherlv_18= 'RequiredServices:' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalArchitecture.g:561:4: otherlv_18= 'RequiredServices:'
                    {
                    otherlv_18=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getComponentAccess().getRequiredServicesKeyword_10());
                      			
                    }

                    }
                    break;

            }

            // InternalArchitecture.g:566:3: ( (lv_req_19_0= ruleRequiredService ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArchitecture.g:567:4: (lv_req_19_0= ruleRequiredService )
            	    {
            	    // InternalArchitecture.g:567:4: (lv_req_19_0= ruleRequiredService )
            	    // InternalArchitecture.g:568:5: lv_req_19_0= ruleRequiredService
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_20);
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
            	    break loop13;
                }
            } while (true);

            // InternalArchitecture.g:585:3: ( (lv_bind_20_0= ruleBindings ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArchitecture.g:586:4: (lv_bind_20_0= ruleBindings )
            	    {
            	    // InternalArchitecture.g:586:4: (lv_bind_20_0= ruleBindings )
            	    // InternalArchitecture.g:587:5: lv_bind_20_0= ruleBindings
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
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
            	    break loop14;
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
    // InternalArchitecture.g:608:1: entryRuleInstanceComp returns [EObject current=null] : iv_ruleInstanceComp= ruleInstanceComp EOF ;
    public final EObject entryRuleInstanceComp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceComp = null;


        try {
            // InternalArchitecture.g:608:53: (iv_ruleInstanceComp= ruleInstanceComp EOF )
            // InternalArchitecture.g:609:2: iv_ruleInstanceComp= ruleInstanceComp EOF
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
    // InternalArchitecture.g:615:1: ruleInstanceComp returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInstanceComp() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:621:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArchitecture.g:622:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArchitecture.g:622:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:623:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:623:3: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:624:4: lv_name_0_0= RULE_ID
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
    // InternalArchitecture.g:643:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalArchitecture.g:643:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalArchitecture.g:644:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalArchitecture.g:650:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:656:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) ) )
            // InternalArchitecture.g:657:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            {
            // InternalArchitecture.g:657:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) )
            // InternalArchitecture.g:658:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) )
            {
            // InternalArchitecture.g:658:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:659:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:659:4: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:660:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
              		
            }
            // InternalArchitecture.g:680:3: ( (lv_type_2_0= ruleType ) )
            // InternalArchitecture.g:681:4: (lv_type_2_0= ruleType )
            {
            // InternalArchitecture.g:681:4: (lv_type_2_0= ruleType )
            // InternalArchitecture.g:682:5: lv_type_2_0= ruleType
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
    // InternalArchitecture.g:703:1: entryRuleBindings returns [EObject current=null] : iv_ruleBindings= ruleBindings EOF ;
    public final EObject entryRuleBindings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindings = null;


        try {
            // InternalArchitecture.g:703:49: (iv_ruleBindings= ruleBindings EOF )
            // InternalArchitecture.g:704:2: iv_ruleBindings= ruleBindings EOF
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
    // InternalArchitecture.g:710:1: ruleBindings returns [EObject current=null] : (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) ;
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
            // InternalArchitecture.g:716:2: ( (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' ) )
            // InternalArchitecture.g:717:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            {
            // InternalArchitecture.g:717:2: (otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')' )
            // InternalArchitecture.g:718:3: otherlv_0= 'bind(' ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) otherlv_6= '.' ( (otherlv_7= RULE_ID ) ) otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBindingsAccess().getBindKeyword_0());
              		
            }
            // InternalArchitecture.g:722:3: ( (otherlv_1= RULE_ID ) )
            // InternalArchitecture.g:723:4: (otherlv_1= RULE_ID )
            {
            // InternalArchitecture.g:723:4: (otherlv_1= RULE_ID )
            // InternalArchitecture.g:724:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getBindingsAccess().getNameComp1InstanceCompCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBindingsAccess().getFullStopKeyword_2());
              		
            }
            // InternalArchitecture.g:739:3: ( (otherlv_3= RULE_ID ) )
            // InternalArchitecture.g:740:4: (otherlv_3= RULE_ID )
            {
            // InternalArchitecture.g:740:4: (otherlv_3= RULE_ID )
            // InternalArchitecture.g:741:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBindingsAccess().getCommaKeyword_4());
              		
            }
            // InternalArchitecture.g:756:3: ( (otherlv_5= RULE_ID ) )
            // InternalArchitecture.g:757:4: (otherlv_5= RULE_ID )
            {
            // InternalArchitecture.g:757:4: (otherlv_5= RULE_ID )
            // InternalArchitecture.g:758:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getBindingsAccess().getNameComp2InstanceCompCrossReference_5_0());
              				
            }

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBindingsAccess().getFullStopKeyword_6());
              		
            }
            // InternalArchitecture.g:773:3: ( (otherlv_7= RULE_ID ) )
            // InternalArchitecture.g:774:4: (otherlv_7= RULE_ID )
            {
            // InternalArchitecture.g:774:4: (otherlv_7= RULE_ID )
            // InternalArchitecture.g:775:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBindingsRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0());
              				
            }

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
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
    // InternalArchitecture.g:794:1: entryRuleRequiredService returns [EObject current=null] : iv_ruleRequiredService= ruleRequiredService EOF ;
    public final EObject entryRuleRequiredService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredService = null;


        try {
            // InternalArchitecture.g:794:56: (iv_ruleRequiredService= ruleRequiredService EOF )
            // InternalArchitecture.g:795:2: iv_ruleRequiredService= ruleRequiredService EOF
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
    // InternalArchitecture.g:801:1: ruleRequiredService returns [EObject current=null] : ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) ;
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
            // InternalArchitecture.g:807:2: ( ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' ) )
            // InternalArchitecture.g:808:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            {
            // InternalArchitecture.g:808:2: ( ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';' )
            // InternalArchitecture.g:809:3: ( (lv_nameVarMethode_0_0= ruleVariable ) ) otherlv_1= ':=' ( (otherlv_2= RULE_ID ) ) otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) otherlv_5= ';'
            {
            // InternalArchitecture.g:809:3: ( (lv_nameVarMethode_0_0= ruleVariable ) )
            // InternalArchitecture.g:810:4: (lv_nameVarMethode_0_0= ruleVariable )
            {
            // InternalArchitecture.g:810:4: (lv_nameVarMethode_0_0= ruleVariable )
            // InternalArchitecture.g:811:5: lv_nameVarMethode_0_0= ruleVariable
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_24);
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

            otherlv_1=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1());
              		
            }
            // InternalArchitecture.g:832:3: ( (otherlv_2= RULE_ID ) )
            // InternalArchitecture.g:833:4: (otherlv_2= RULE_ID )
            {
            // InternalArchitecture.g:833:4: (otherlv_2= RULE_ID )
            // InternalArchitecture.g:834:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRequiredServiceRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0());
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3());
              		
            }
            // InternalArchitecture.g:849:3: ( (otherlv_4= RULE_ID ) )
            // InternalArchitecture.g:850:4: (otherlv_4= RULE_ID )
            {
            // InternalArchitecture.g:850:4: (otherlv_4= RULE_ID )
            // InternalArchitecture.g:851:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRequiredServiceRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0());
              				
            }

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
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
    // InternalArchitecture.g:870:1: entryRuleServiceName returns [EObject current=null] : iv_ruleServiceName= ruleServiceName EOF ;
    public final EObject entryRuleServiceName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceName = null;


        try {
            // InternalArchitecture.g:870:52: (iv_ruleServiceName= ruleServiceName EOF )
            // InternalArchitecture.g:871:2: iv_ruleServiceName= ruleServiceName EOF
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
    // InternalArchitecture.g:877:1: ruleServiceName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleServiceName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalArchitecture.g:883:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalArchitecture.g:884:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalArchitecture.g:884:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:885:3: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:885:3: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:886:4: lv_name_0_0= RULE_ID
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
    // InternalArchitecture.g:905:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalArchitecture.g:911:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalArchitecture.g:912:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalArchitecture.g:912:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalArchitecture.g:913:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalArchitecture.g:913:3: (enumLiteral_0= 'INT' )
                    // InternalArchitecture.g:914:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:921:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalArchitecture.g:921:3: (enumLiteral_1= 'STRING' )
                    // InternalArchitecture.g:922:4: enumLiteral_1= 'STRING'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:929:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalArchitecture.g:929:3: (enumLiteral_2= 'Boolean' )
                    // InternalArchitecture.g:930:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalArchitecture.g:937:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalArchitecture.g:937:3: (enumLiteral_3= 'Double' )
                    // InternalArchitecture.g:938:4: enumLiteral_3= 'Double'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
        // InternalArchitecture.g:196:4: ( 'Component:' )
        // InternalArchitecture.g:196:5: 'Component:'
        {
        match(input,17,FOLLOW_2); if (state.failed) return ;

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003040012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});

}