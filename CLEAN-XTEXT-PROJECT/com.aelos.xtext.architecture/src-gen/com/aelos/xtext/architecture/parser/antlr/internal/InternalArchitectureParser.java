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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "'providedServices'", "'('", "','", "')'", "'requiredService'", "':'", "'def'", "'INT'", "'STRING'", "'Boolean'", "'Double'"
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
    // InternalArchitecture.g:177:1: ruleAbstractModel returns [EObject current=null] : ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ ) ;
    public final EObject ruleAbstractModel() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject lv_comp_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:183:2: ( ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ ) )
            // InternalArchitecture.g:184:2: ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ )
            {
            // InternalArchitecture.g:184:2: ( (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+ )
            // InternalArchitecture.g:185:3: (this_Import_0= ruleImport )? ( (lv_comp_1_0= ruleComponent ) )+
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

            // InternalArchitecture.g:195:3: ( (lv_comp_1_0= ruleComponent ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArchitecture.g:196:4: (lv_comp_1_0= ruleComponent )
            	    {
            	    // InternalArchitecture.g:196:4: (lv_comp_1_0= ruleComponent )
            	    // InternalArchitecture.g:197:5: lv_comp_1_0= ruleComponent
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
    // InternalArchitecture.g:218:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalArchitecture.g:218:47: (iv_ruleImport= ruleImport EOF )
            // InternalArchitecture.g:219:2: iv_ruleImport= ruleImport EOF
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
    // InternalArchitecture.g:225:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:231:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalArchitecture.g:232:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalArchitecture.g:232:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalArchitecture.g:233:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
              		
            }
            // InternalArchitecture.g:237:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:238:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:238:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:239:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalArchitecture.g:260:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalArchitecture.g:260:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalArchitecture.g:261:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalArchitecture.g:267:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:273:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalArchitecture.g:274:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalArchitecture.g:274:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalArchitecture.g:275:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
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
            // InternalArchitecture.g:285:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:286:4: kw= '.*'
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
    // InternalArchitecture.g:296:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalArchitecture.g:296:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalArchitecture.g:297:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalArchitecture.g:303:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalArchitecture.g:309:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalArchitecture.g:310:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalArchitecture.g:310:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalArchitecture.g:311:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalArchitecture.g:318:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:319:4: kw= '.' this_ID_2= RULE_ID
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
    // InternalArchitecture.g:336:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalArchitecture.g:336:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalArchitecture.g:337:2: iv_ruleComponent= ruleComponent EOF
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
    // InternalArchitecture.g:343:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* ( (lv_vars_10_0= ruleVariable ) )* otherlv_11= 'requiredService' otherlv_12= '(' ( ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )* ( (lv_calls_15_0= ruleCall ) ) )* otherlv_16= ')' otherlv_17= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_operations_9_0 = null;

        EObject lv_vars_10_0 = null;

        EObject lv_calls_13_0 = null;

        EObject lv_calls_15_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:349:2: ( (otherlv_0= 'Component:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* ( (lv_vars_10_0= ruleVariable ) )* otherlv_11= 'requiredService' otherlv_12= '(' ( ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )* ( (lv_calls_15_0= ruleCall ) ) )* otherlv_16= ')' otherlv_17= '}' ) )
            // InternalArchitecture.g:350:2: (otherlv_0= 'Component:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* ( (lv_vars_10_0= ruleVariable ) )* otherlv_11= 'requiredService' otherlv_12= '(' ( ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )* ( (lv_calls_15_0= ruleCall ) ) )* otherlv_16= ')' otherlv_17= '}' )
            {
            // InternalArchitecture.g:350:2: (otherlv_0= 'Component:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* ( (lv_vars_10_0= ruleVariable ) )* otherlv_11= 'requiredService' otherlv_12= '(' ( ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )* ( (lv_calls_15_0= ruleCall ) ) )* otherlv_16= ')' otherlv_17= '}' )
            // InternalArchitecture.g:351:3: otherlv_0= 'Component:' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'providedServices' otherlv_4= '(' ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )* otherlv_8= ')' ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )* ( (lv_vars_10_0= ruleVariable ) )* otherlv_11= 'requiredService' otherlv_12= '(' ( ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )* ( (lv_calls_15_0= ruleCall ) ) )* otherlv_16= ')' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
              		
            }
            // InternalArchitecture.g:355:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalArchitecture.g:356:4: (lv_name_1_0= RULE_ID )
            {
            // InternalArchitecture.g:356:4: (lv_name_1_0= RULE_ID )
            // InternalArchitecture.g:357:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getComponentRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getProvidedServicesKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalArchitecture.g:385:3: ( ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArchitecture.g:386:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )* ( (otherlv_7= RULE_ID ) )
            	    {
            	    // InternalArchitecture.g:386:4: ( ( (otherlv_5= RULE_ID ) ) otherlv_6= ',' )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==RULE_ID) ) {
            	            int LA7_1 = input.LA(2);

            	            if ( (LA7_1==20) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalArchitecture.g:387:5: ( (otherlv_5= RULE_ID ) ) otherlv_6= ','
            	    	    {
            	    	    // InternalArchitecture.g:387:5: ( (otherlv_5= RULE_ID ) )
            	    	    // InternalArchitecture.g:388:6: (otherlv_5= RULE_ID )
            	    	    {
            	    	    // InternalArchitecture.g:388:6: (otherlv_5= RULE_ID )
            	    	    // InternalArchitecture.g:389:7: otherlv_5= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElement(grammarAccess.getComponentRule());
            	    	      							}
            	    	      						
            	    	    }
            	    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_0_0_0());
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_6=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getCommaKeyword_5_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    // InternalArchitecture.g:405:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalArchitecture.g:406:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalArchitecture.g:406:5: (otherlv_7= RULE_ID )
            	    // InternalArchitecture.g:407:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getComponentRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getComponentAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalArchitecture.g:423:3: ( ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) && (synpred1_InternalArchitecture())) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArchitecture.g:424:4: ( 'def' )=> ( (lv_operations_9_0= ruleOperation ) )
            	    {
            	    // InternalArchitecture.g:425:4: ( (lv_operations_9_0= ruleOperation ) )
            	    // InternalArchitecture.g:426:5: (lv_operations_9_0= ruleOperation )
            	    {
            	    // InternalArchitecture.g:426:5: (lv_operations_9_0= ruleOperation )
            	    // InternalArchitecture.g:427:6: lv_operations_9_0= ruleOperation
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getOperationsOperationParserRuleCall_7_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_operations_9_0=ruleOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComponentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"operations",
            	      							lv_operations_9_0,
            	      							"com.aelos.xtext.architecture.Architecture.Operation");
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

            // InternalArchitecture.g:445:3: ( (lv_vars_10_0= ruleVariable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:446:4: (lv_vars_10_0= ruleVariable )
            	    {
            	    // InternalArchitecture.g:446:4: (lv_vars_10_0= ruleVariable )
            	    // InternalArchitecture.g:447:5: lv_vars_10_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getComponentAccess().getVarsVariableParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_vars_10_0=ruleVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getComponentRule());
            	      					}
            	      					add(
            	      						current,
            	      						"vars",
            	      						lv_vars_10_0,
            	      						"com.aelos.xtext.architecture.Architecture.Variable");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getComponentAccess().getRequiredServiceKeyword_9());
              		
            }
            otherlv_12=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_10());
              		
            }
            // InternalArchitecture.g:472:3: ( ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )* ( (lv_calls_15_0= ruleCall ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:473:4: ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )* ( (lv_calls_15_0= ruleCall ) )
            	    {
            	    // InternalArchitecture.g:473:4: ( ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ',' )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==RULE_ID) ) {
            	            int LA11_1 = input.LA(2);

            	            if ( (LA11_1==16) ) {
            	                int LA11_2 = input.LA(3);

            	                if ( (LA11_2==RULE_ID) ) {
            	                    int LA11_3 = input.LA(4);

            	                    if ( (LA11_3==20) ) {
            	                        alt11=1;
            	                    }


            	                }


            	            }


            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalArchitecture.g:474:5: ( (lv_calls_13_0= ruleCall ) ) otherlv_14= ','
            	    	    {
            	    	    // InternalArchitecture.g:474:5: ( (lv_calls_13_0= ruleCall ) )
            	    	    // InternalArchitecture.g:475:6: (lv_calls_13_0= ruleCall )
            	    	    {
            	    	    // InternalArchitecture.g:475:6: (lv_calls_13_0= ruleCall )
            	    	    // InternalArchitecture.g:476:7: lv_calls_13_0= ruleCall
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getComponentAccess().getCallsCallParserRuleCall_11_0_0_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_calls_13_0=ruleCall();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getComponentRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"calls",
            	    	      								lv_calls_13_0,
            	    	      								"com.aelos.xtext.architecture.Architecture.Call");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_14=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getCommaKeyword_11_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    // InternalArchitecture.g:498:4: ( (lv_calls_15_0= ruleCall ) )
            	    // InternalArchitecture.g:499:5: (lv_calls_15_0= ruleCall )
            	    {
            	    // InternalArchitecture.g:499:5: (lv_calls_15_0= ruleCall )
            	    // InternalArchitecture.g:500:6: lv_calls_15_0= ruleCall
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComponentAccess().getCallsCallParserRuleCall_11_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_calls_15_0=ruleCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComponentRule());
            	      						}
            	      						add(
            	      							current,
            	      							"calls",
            	      							lv_calls_15_0,
            	      							"com.aelos.xtext.architecture.Architecture.Call");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_16=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_16, grammarAccess.getComponentAccess().getRightParenthesisKeyword_12());
              		
            }
            otherlv_17=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_17, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13());
              		
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleCall"
    // InternalArchitecture.g:530:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalArchitecture.g:530:45: (iv_ruleCall= ruleCall EOF )
            // InternalArchitecture.g:531:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalArchitecture.g:537:1: ruleCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalArchitecture.g:543:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalArchitecture.g:544:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalArchitecture.g:544:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) )
            // InternalArchitecture.g:545:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) )
            {
            // InternalArchitecture.g:545:3: ( (otherlv_0= RULE_ID ) )
            // InternalArchitecture.g:546:4: (otherlv_0= RULE_ID )
            {
            // InternalArchitecture.g:546:4: (otherlv_0= RULE_ID )
            // InternalArchitecture.g:547:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getCallAccess().getReceiverComponentCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCallAccess().getFullStopKeyword_1());
              		
            }
            // InternalArchitecture.g:562:3: ( (otherlv_2= RULE_ID ) )
            // InternalArchitecture.g:563:4: (otherlv_2= RULE_ID )
            {
            // InternalArchitecture.g:563:4: (otherlv_2= RULE_ID )
            // InternalArchitecture.g:564:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getCallRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getCallAccess().getMemberOperationCrossReference_2_0());
              				
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleVariable"
    // InternalArchitecture.g:579:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalArchitecture.g:579:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalArchitecture.g:580:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalArchitecture.g:586:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAtomicType ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:592:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAtomicType ) ) ) )
            // InternalArchitecture.g:593:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAtomicType ) ) )
            {
            // InternalArchitecture.g:593:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAtomicType ) ) )
            // InternalArchitecture.g:594:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleAtomicType ) )
            {
            // InternalArchitecture.g:594:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArchitecture.g:595:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArchitecture.g:595:4: (lv_name_0_0= RULE_ID )
            // InternalArchitecture.g:596:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
              		
            }
            // InternalArchitecture.g:616:3: ( (lv_type_2_0= ruleAtomicType ) )
            // InternalArchitecture.g:617:4: (lv_type_2_0= ruleAtomicType )
            {
            // InternalArchitecture.g:617:4: (lv_type_2_0= ruleAtomicType )
            // InternalArchitecture.g:618:5: lv_type_2_0= ruleAtomicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVariableAccess().getTypeAtomicTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleAtomicType();

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
              						"com.aelos.xtext.architecture.Architecture.AtomicType");
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


    // $ANTLR start "entryRuleOperation"
    // InternalArchitecture.g:639:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalArchitecture.g:639:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalArchitecture.g:640:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalArchitecture.g:646:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleAtomicType ) ) ) ;
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

        EObject lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:652:2: ( (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleAtomicType ) ) ) )
            // InternalArchitecture.g:653:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleAtomicType ) ) )
            {
            // InternalArchitecture.g:653:2: (otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleAtomicType ) ) )
            // InternalArchitecture.g:654:3: otherlv_0= 'def' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_type_8_0= ruleAtomicType ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getDefKeyword_0());
              		
            }
            // InternalArchitecture.g:658:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalArchitecture.g:659:4: (lv_name_1_0= RULE_ID )
            {
            // InternalArchitecture.g:659:4: (lv_name_1_0= RULE_ID )
            // InternalArchitecture.g:660:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalArchitecture.g:680:3: ( ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArchitecture.g:681:4: ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )* ( (lv_arg_5_0= ruleVariable ) )
            	    {
            	    // InternalArchitecture.g:681:4: ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )*
            	    loop13:
            	    do {
            	        int alt13=2;
            	        alt13 = dfa13.predict(input);
            	        switch (alt13) {
            	    	case 1 :
            	    	    // InternalArchitecture.g:682:5: ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ','
            	    	    {
            	    	    // InternalArchitecture.g:682:5: ( (lv_arg_3_0= ruleVariable ) )
            	    	    // InternalArchitecture.g:683:6: (lv_arg_3_0= ruleVariable )
            	    	    {
            	    	    // InternalArchitecture.g:683:6: (lv_arg_3_0= ruleVariable )
            	    	    // InternalArchitecture.g:684:7: lv_arg_3_0= ruleVariable
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_0_0_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_14);
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
            	    	      								"com.aelos.xtext.architecture.Architecture.Variable");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }

            	    	    otherlv_4=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      					newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getCommaKeyword_3_0_1());
            	    	      				
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop13;
            	        }
            	    } while (true);

            	    // InternalArchitecture.g:706:4: ( (lv_arg_5_0= ruleVariable ) )
            	    // InternalArchitecture.g:707:5: (lv_arg_5_0= ruleVariable )
            	    {
            	    // InternalArchitecture.g:707:5: (lv_arg_5_0= ruleVariable )
            	    // InternalArchitecture.g:708:6: lv_arg_5_0= ruleVariable
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
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
            	      							"com.aelos.xtext.architecture.Architecture.Variable");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_6=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_7=(Token)match(input,23,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getOperationAccess().getColonKeyword_5());
              		
            }
            // InternalArchitecture.g:734:3: ( (lv_type_8_0= ruleAtomicType ) )
            // InternalArchitecture.g:735:4: (lv_type_8_0= ruleAtomicType )
            {
            // InternalArchitecture.g:735:4: (lv_type_8_0= ruleAtomicType )
            // InternalArchitecture.g:736:5: lv_type_8_0= ruleAtomicType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOperationAccess().getTypeAtomicTypeParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_8_0=ruleAtomicType();

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
              						"com.aelos.xtext.architecture.Architecture.AtomicType");
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


    // $ANTLR start "entryRuleAtomicType"
    // InternalArchitecture.g:757:1: entryRuleAtomicType returns [EObject current=null] : iv_ruleAtomicType= ruleAtomicType EOF ;
    public final EObject entryRuleAtomicType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicType = null;


        try {
            // InternalArchitecture.g:757:51: (iv_ruleAtomicType= ruleAtomicType EOF )
            // InternalArchitecture.g:758:2: iv_ruleAtomicType= ruleAtomicType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomicType=ruleAtomicType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicType; 
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
    // $ANTLR end "entryRuleAtomicType"


    // $ANTLR start "ruleAtomicType"
    // InternalArchitecture.g:764:1: ruleAtomicType returns [EObject current=null] : ( ( (lv_atomType_0_0= ruleType ) ) | ( () ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomicType() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_atomType_0_0 = null;



        	enterRule();

        try {
            // InternalArchitecture.g:770:2: ( ( ( (lv_atomType_0_0= ruleType ) ) | ( () ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalArchitecture.g:771:2: ( ( (lv_atomType_0_0= ruleType ) ) | ( () ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalArchitecture.g:771:2: ( ( (lv_atomType_0_0= ruleType ) ) | ( () ( (otherlv_2= RULE_ID ) ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=25 && LA15_0<=28)) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalArchitecture.g:772:3: ( (lv_atomType_0_0= ruleType ) )
                    {
                    // InternalArchitecture.g:772:3: ( (lv_atomType_0_0= ruleType ) )
                    // InternalArchitecture.g:773:4: (lv_atomType_0_0= ruleType )
                    {
                    // InternalArchitecture.g:773:4: (lv_atomType_0_0= ruleType )
                    // InternalArchitecture.g:774:5: lv_atomType_0_0= ruleType
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAtomicTypeAccess().getAtomTypeTypeEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_atomType_0_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAtomicTypeRule());
                      					}
                      					set(
                      						current,
                      						"atomType",
                      						lv_atomType_0_0,
                      						"com.aelos.xtext.architecture.Architecture.Type");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:792:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    {
                    // InternalArchitecture.g:792:3: ( () ( (otherlv_2= RULE_ID ) ) )
                    // InternalArchitecture.g:793:4: () ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalArchitecture.g:793:4: ()
                    // InternalArchitecture.g:794:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicTypeAccess().getVariableRefAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalArchitecture.g:800:4: ( (otherlv_2= RULE_ID ) )
                    // InternalArchitecture.g:801:5: (otherlv_2= RULE_ID )
                    {
                    // InternalArchitecture.g:801:5: (otherlv_2= RULE_ID )
                    // InternalArchitecture.g:802:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicTypeRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getAtomicTypeAccess().getTypeComponentCrossReference_1_1_0());
                      					
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
    // $ANTLR end "ruleAtomicType"


    // $ANTLR start "ruleType"
    // InternalArchitecture.g:818:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalArchitecture.g:824:2: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) ) )
            // InternalArchitecture.g:825:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            {
            // InternalArchitecture.g:825:2: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'STRING' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Double' ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt16=1;
                }
                break;
            case 26:
                {
                alt16=2;
                }
                break;
            case 27:
                {
                alt16=3;
                }
                break;
            case 28:
                {
                alt16=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalArchitecture.g:826:3: (enumLiteral_0= 'INT' )
                    {
                    // InternalArchitecture.g:826:3: (enumLiteral_0= 'INT' )
                    // InternalArchitecture.g:827:4: enumLiteral_0= 'INT'
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
                    // InternalArchitecture.g:834:3: (enumLiteral_1= 'STRING' )
                    {
                    // InternalArchitecture.g:834:3: (enumLiteral_1= 'STRING' )
                    // InternalArchitecture.g:835:4: enumLiteral_1= 'STRING'
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
                    // InternalArchitecture.g:842:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalArchitecture.g:842:3: (enumLiteral_2= 'Boolean' )
                    // InternalArchitecture.g:843:4: enumLiteral_2= 'Boolean'
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
                    // InternalArchitecture.g:850:3: (enumLiteral_3= 'Double' )
                    {
                    // InternalArchitecture.g:850:3: (enumLiteral_3= 'Double' )
                    // InternalArchitecture.g:851:4: enumLiteral_3= 'Double'
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
        // InternalArchitecture.g:424:4: ( 'def' )
        // InternalArchitecture.g:424:5: 'def'
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\27\6\4\2\uffff";
    static final String dfa_3s = "\1\4\1\27\1\34\5\25\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\7\24\uffff\1\3\1\4\1\5\1\6",
            "\1\11\17\uffff\1\10\1\11",
            "\1\11\17\uffff\1\10\1\11",
            "\1\11\17\uffff\1\10\1\11",
            "\1\11\17\uffff\1\10\1\11",
            "\1\11\17\uffff\1\10\1\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 681:4: ( ( (lv_arg_3_0= ruleVariable ) ) otherlv_4= ',' )*";
        }
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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001400010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000001E000010L});

}