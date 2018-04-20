package com.aelos.xtext.architecture.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.aelos.xtext.architecture.services.ArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalArchitectureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
<<<<<<< HEAD
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "'providedServices'", "'('", "')'", "'requeredServices'", "','", "'ArchitectureDefinition'", "'bind'", "'-'", "':'", "'_'", "'def'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "'providedServices'", "'('", "')'", "'requeredServices'", "','", "'ArchitectureDefinition'", "'bind'", "':'", "'def'"
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
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
<<<<<<< HEAD
    public static final int T__31=31;
    public static final int T__32=32;
=======
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
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

    	public void setGrammarAccess(ArchitectureGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalArchitecture.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalArchitecture.g:55:1: ( ruleModel EOF )
            // InternalArchitecture.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalArchitecture.g:63:1: ruleModel : ( ( rule__Model__PackageAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:67:2: ( ( ( rule__Model__PackageAssignment )* ) )
            // InternalArchitecture.g:68:2: ( ( rule__Model__PackageAssignment )* )
            {
            // InternalArchitecture.g:68:2: ( ( rule__Model__PackageAssignment )* )
            // InternalArchitecture.g:69:3: ( rule__Model__PackageAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageAssignment()); 
            }
            // InternalArchitecture.g:70:3: ( rule__Model__PackageAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArchitecture.g:70:4: rule__Model__PackageAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__PackageAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDomainDeclaration"
    // InternalArchitecture.g:79:1: entryRuleDomainDeclaration : ruleDomainDeclaration EOF ;
    public final void entryRuleDomainDeclaration() throws RecognitionException {
        try {
            // InternalArchitecture.g:80:1: ( ruleDomainDeclaration EOF )
            // InternalArchitecture.g:81:1: ruleDomainDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDomainDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainDeclaration"


    // $ANTLR start "ruleDomainDeclaration"
    // InternalArchitecture.g:88:1: ruleDomainDeclaration : ( ( rule__DomainDeclaration__Group__0 ) ) ;
    public final void ruleDomainDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:92:2: ( ( ( rule__DomainDeclaration__Group__0 ) ) )
            // InternalArchitecture.g:93:2: ( ( rule__DomainDeclaration__Group__0 ) )
            {
            // InternalArchitecture.g:93:2: ( ( rule__DomainDeclaration__Group__0 ) )
            // InternalArchitecture.g:94:3: ( rule__DomainDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getGroup()); 
            }
            // InternalArchitecture.g:95:3: ( rule__DomainDeclaration__Group__0 )
            // InternalArchitecture.g:95:4: rule__DomainDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainDeclaration"


    // $ANTLR start "entryRuleAbstractModel"
    // InternalArchitecture.g:104:1: entryRuleAbstractModel : ruleAbstractModel EOF ;
    public final void entryRuleAbstractModel() throws RecognitionException {
        try {
            // InternalArchitecture.g:105:1: ( ruleAbstractModel EOF )
            // InternalArchitecture.g:106:1: ruleAbstractModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAbstractModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractModel"


    // $ANTLR start "ruleAbstractModel"
    // InternalArchitecture.g:113:1: ruleAbstractModel : ( ( rule__AbstractModel__Group__0 ) ) ;
    public final void ruleAbstractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:117:2: ( ( ( rule__AbstractModel__Group__0 ) ) )
            // InternalArchitecture.g:118:2: ( ( rule__AbstractModel__Group__0 ) )
            {
            // InternalArchitecture.g:118:2: ( ( rule__AbstractModel__Group__0 ) )
            // InternalArchitecture.g:119:3: ( rule__AbstractModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getGroup()); 
            }
            // InternalArchitecture.g:120:3: ( rule__AbstractModel__Group__0 )
            // InternalArchitecture.g:120:4: rule__AbstractModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractModel"


    // $ANTLR start "entryRuleImport"
    // InternalArchitecture.g:129:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalArchitecture.g:130:1: ( ruleImport EOF )
            // InternalArchitecture.g:131:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalArchitecture.g:138:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:142:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalArchitecture.g:143:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalArchitecture.g:143:2: ( ( rule__Import__Group__0 ) )
            // InternalArchitecture.g:144:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalArchitecture.g:145:3: ( rule__Import__Group__0 )
            // InternalArchitecture.g:145:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalArchitecture.g:154:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalArchitecture.g:155:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalArchitecture.g:156:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalArchitecture.g:163:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:167:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalArchitecture.g:168:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalArchitecture.g:168:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalArchitecture.g:169:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalArchitecture.g:170:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalArchitecture.g:170:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalArchitecture.g:179:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalArchitecture.g:180:1: ( ruleQualifiedName EOF )
            // InternalArchitecture.g:181:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalArchitecture.g:188:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:192:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalArchitecture.g:193:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalArchitecture.g:193:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalArchitecture.g:194:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalArchitecture.g:195:3: ( rule__QualifiedName__Group__0 )
            // InternalArchitecture.g:195:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleComponent"
    // InternalArchitecture.g:204:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalArchitecture.g:205:1: ( ruleComponent EOF )
            // InternalArchitecture.g:206:1: ruleComponent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalArchitecture.g:213:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:217:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalArchitecture.g:218:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalArchitecture.g:218:2: ( ( rule__Component__Group__0 ) )
            // InternalArchitecture.g:219:3: ( rule__Component__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup()); 
            }
            // InternalArchitecture.g:220:3: ( rule__Component__Group__0 )
            // InternalArchitecture.g:220:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleArchitecture"
    // InternalArchitecture.g:229:1: entryRuleArchitecture : ruleArchitecture EOF ;
    public final void entryRuleArchitecture() throws RecognitionException {
        try {
            // InternalArchitecture.g:230:1: ( ruleArchitecture EOF )
            // InternalArchitecture.g:231:1: ruleArchitecture EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArchitecture();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArchitecture"


    // $ANTLR start "ruleArchitecture"
    // InternalArchitecture.g:238:1: ruleArchitecture : ( ( rule__Architecture__Group__0 ) ) ;
    public final void ruleArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:242:2: ( ( ( rule__Architecture__Group__0 ) ) )
            // InternalArchitecture.g:243:2: ( ( rule__Architecture__Group__0 ) )
            {
            // InternalArchitecture.g:243:2: ( ( rule__Architecture__Group__0 ) )
            // InternalArchitecture.g:244:3: ( rule__Architecture__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getGroup()); 
            }
            // InternalArchitecture.g:245:3: ( rule__Architecture__Group__0 )
            // InternalArchitecture.g:245:4: rule__Architecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArchitecture"


    // $ANTLR start "entryRuleBinding"
    // InternalArchitecture.g:254:1: entryRuleBinding : ruleBinding EOF ;
    public final void entryRuleBinding() throws RecognitionException {
        try {
            // InternalArchitecture.g:255:1: ( ruleBinding EOF )
            // InternalArchitecture.g:256:1: ruleBinding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBinding"


    // $ANTLR start "ruleBinding"
    // InternalArchitecture.g:263:1: ruleBinding : ( ( rule__Binding__Group__0 ) ) ;
    public final void ruleBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:267:2: ( ( ( rule__Binding__Group__0 ) ) )
            // InternalArchitecture.g:268:2: ( ( rule__Binding__Group__0 ) )
            {
            // InternalArchitecture.g:268:2: ( ( rule__Binding__Group__0 ) )
            // InternalArchitecture.g:269:3: ( rule__Binding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getGroup()); 
            }
            // InternalArchitecture.g:270:3: ( rule__Binding__Group__0 )
            // InternalArchitecture.g:270:4: rule__Binding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinding"


    // $ANTLR start "entryRuleVariable"
    // InternalArchitecture.g:279:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalArchitecture.g:280:1: ( ruleVariable EOF )
            // InternalArchitecture.g:281:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalArchitecture.g:288:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:292:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalArchitecture.g:293:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalArchitecture.g:293:2: ( ( rule__Variable__Group__0 ) )
            // InternalArchitecture.g:294:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalArchitecture.g:295:3: ( rule__Variable__Group__0 )
            // InternalArchitecture.g:295:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRulePID"
    // InternalArchitecture.g:304:1: entryRulePID : rulePID EOF ;
    public final void entryRulePID() throws RecognitionException {
        try {
            // InternalArchitecture.g:305:1: ( rulePID EOF )
            // InternalArchitecture.g:306:1: rulePID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIDRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePID"


    // $ANTLR start "rulePID"
    // InternalArchitecture.g:313:1: rulePID : ( ( rule__PID__Group__0 ) ) ;
    public final void rulePID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:317:2: ( ( ( rule__PID__Group__0 ) ) )
            // InternalArchitecture.g:318:2: ( ( rule__PID__Group__0 ) )
            {
            // InternalArchitecture.g:318:2: ( ( rule__PID__Group__0 ) )
            // InternalArchitecture.g:319:3: ( rule__PID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIDAccess().getGroup()); 
            }
            // InternalArchitecture.g:320:3: ( rule__PID__Group__0 )
            // InternalArchitecture.g:320:4: rule__PID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PID__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIDAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePID"


    // $ANTLR start "entryRuleOperation"
    // InternalArchitecture.g:329:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalArchitecture.g:330:1: ( ruleOperation EOF )
            // InternalArchitecture.g:331:1: ruleOperation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalArchitecture.g:338:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:342:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalArchitecture.g:343:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalArchitecture.g:343:2: ( ( rule__Operation__Group__0 ) )
            // InternalArchitecture.g:344:3: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // InternalArchitecture.g:345:3: ( rule__Operation__Group__0 )
            // InternalArchitecture.g:345:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAtomicType"
    // InternalArchitecture.g:354:1: entryRuleAtomicType : ruleAtomicType EOF ;
    public final void entryRuleAtomicType() throws RecognitionException {
        try {
            // InternalArchitecture.g:355:1: ( ruleAtomicType EOF )
            // InternalArchitecture.g:356:1: ruleAtomicType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAtomicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomicType"


    // $ANTLR start "ruleAtomicType"
    // InternalArchitecture.g:363:1: ruleAtomicType : ( ( rule__AtomicType__Alternatives ) ) ;
    public final void ruleAtomicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:367:2: ( ( ( rule__AtomicType__Alternatives ) ) )
            // InternalArchitecture.g:368:2: ( ( rule__AtomicType__Alternatives ) )
            {
            // InternalArchitecture.g:368:2: ( ( rule__AtomicType__Alternatives ) )
            // InternalArchitecture.g:369:3: ( rule__AtomicType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:370:3: ( rule__AtomicType__Alternatives )
            // InternalArchitecture.g:370:4: rule__AtomicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AtomicType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomicType"


    // $ANTLR start "ruleType"
    // InternalArchitecture.g:379:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:383:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalArchitecture.g:384:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalArchitecture.g:384:2: ( ( rule__Type__Alternatives ) )
            // InternalArchitecture.g:385:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:386:3: ( rule__Type__Alternatives )
            // InternalArchitecture.g:386:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__AbstractModel__Alternatives_1"
    // InternalArchitecture.g:394:1: rule__AbstractModel__Alternatives_1 : ( ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) ) | ( ( rule__AbstractModel__ArchAssignment_1_1 ) ) );
    public final void rule__AbstractModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:398:1: ( ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) ) | ( ( rule__AbstractModel__ArchAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==21) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArchitecture.g:399:2: ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) )
                    {
                    // InternalArchitecture.g:399:2: ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) )
                    // InternalArchitecture.g:400:3: ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* )
                    {
                    // InternalArchitecture.g:400:3: ( ( rule__AbstractModel__CompAssignment_1_0 ) )
                    // InternalArchitecture.g:401:4: ( rule__AbstractModel__CompAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getCompAssignment_1_0()); 
                    }
                    // InternalArchitecture.g:402:4: ( rule__AbstractModel__CompAssignment_1_0 )
                    // InternalArchitecture.g:402:5: rule__AbstractModel__CompAssignment_1_0
                    {
                    pushFollow(FOLLOW_4);
                    rule__AbstractModel__CompAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getCompAssignment_1_0()); 
                    }

                    }

                    // InternalArchitecture.g:405:3: ( ( rule__AbstractModel__CompAssignment_1_0 )* )
                    // InternalArchitecture.g:406:4: ( rule__AbstractModel__CompAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getCompAssignment_1_0()); 
                    }
                    // InternalArchitecture.g:407:4: ( rule__AbstractModel__CompAssignment_1_0 )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // InternalArchitecture.g:407:5: rule__AbstractModel__CompAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_4);
                    	    rule__AbstractModel__CompAssignment_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getCompAssignment_1_0()); 
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:412:2: ( ( rule__AbstractModel__ArchAssignment_1_1 ) )
                    {
                    // InternalArchitecture.g:412:2: ( ( rule__AbstractModel__ArchAssignment_1_1 ) )
                    // InternalArchitecture.g:413:3: ( rule__AbstractModel__ArchAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getArchAssignment_1_1()); 
                    }
                    // InternalArchitecture.g:414:3: ( rule__AbstractModel__ArchAssignment_1_1 )
                    // InternalArchitecture.g:414:4: rule__AbstractModel__ArchAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModel__ArchAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getArchAssignment_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Alternatives_1"


    // $ANTLR start "rule__AtomicType__Alternatives"
    // InternalArchitecture.g:422:1: rule__AtomicType__Alternatives : ( ( ( rule__AtomicType__AtomTypeAssignment_0 ) ) | ( ( rule__AtomicType__CompTypeAssignment_1 ) ) );
    public final void rule__AtomicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:426:1: ( ( ( rule__AtomicType__AtomTypeAssignment_0 ) ) | ( ( rule__AtomicType__CompTypeAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=14)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArchitecture.g:427:2: ( ( rule__AtomicType__AtomTypeAssignment_0 ) )
                    {
                    // InternalArchitecture.g:427:2: ( ( rule__AtomicType__AtomTypeAssignment_0 ) )
                    // InternalArchitecture.g:428:3: ( rule__AtomicType__AtomTypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicTypeAccess().getAtomTypeAssignment_0()); 
                    }
                    // InternalArchitecture.g:429:3: ( rule__AtomicType__AtomTypeAssignment_0 )
                    // InternalArchitecture.g:429:4: rule__AtomicType__AtomTypeAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicType__AtomTypeAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicTypeAccess().getAtomTypeAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:433:2: ( ( rule__AtomicType__CompTypeAssignment_1 ) )
                    {
                    // InternalArchitecture.g:433:2: ( ( rule__AtomicType__CompTypeAssignment_1 ) )
                    // InternalArchitecture.g:434:3: ( rule__AtomicType__CompTypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicTypeAccess().getCompTypeAssignment_1()); 
                    }
                    // InternalArchitecture.g:435:3: ( rule__AtomicType__CompTypeAssignment_1 )
                    // InternalArchitecture.g:435:4: rule__AtomicType__CompTypeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicType__CompTypeAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicTypeAccess().getCompTypeAssignment_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalArchitecture.g:443:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:447:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:448:2: ( ( 'INT' ) )
                    {
                    // InternalArchitecture.g:448:2: ( ( 'INT' ) )
                    // InternalArchitecture.g:449:3: ( 'INT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalArchitecture.g:450:3: ( 'INT' )
                    // InternalArchitecture.g:450:4: 'INT'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:454:2: ( ( 'STRING' ) )
                    {
                    // InternalArchitecture.g:454:2: ( ( 'STRING' ) )
                    // InternalArchitecture.g:455:3: ( 'STRING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalArchitecture.g:456:3: ( 'STRING' )
                    // InternalArchitecture.g:456:4: 'STRING'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:460:2: ( ( 'Boolean' ) )
                    {
                    // InternalArchitecture.g:460:2: ( ( 'Boolean' ) )
                    // InternalArchitecture.g:461:3: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // InternalArchitecture.g:462:3: ( 'Boolean' )
                    // InternalArchitecture.g:462:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalArchitecture.g:466:2: ( ( 'Double' ) )
                    {
                    // InternalArchitecture.g:466:2: ( ( 'Double' ) )
                    // InternalArchitecture.g:467:3: ( 'Double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }
                    // InternalArchitecture.g:468:3: ( 'Double' )
                    // InternalArchitecture.g:468:4: 'Double'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__DomainDeclaration__Group__0"
    // InternalArchitecture.g:476:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:480:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalArchitecture.g:481:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DomainDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__0"


    // $ANTLR start "rule__DomainDeclaration__Group__0__Impl"
    // InternalArchitecture.g:488:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:492:1: ( ( 'domain' ) )
            // InternalArchitecture.g:493:1: ( 'domain' )
            {
            // InternalArchitecture.g:493:1: ( 'domain' )
            // InternalArchitecture.g:494:2: 'domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__0__Impl"


    // $ANTLR start "rule__DomainDeclaration__Group__1"
    // InternalArchitecture.g:503:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:507:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalArchitecture.g:508:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DomainDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__1"


    // $ANTLR start "rule__DomainDeclaration__Group__1__Impl"
    // InternalArchitecture.g:515:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:519:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalArchitecture.g:520:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:520:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalArchitecture.g:521:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:522:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalArchitecture.g:522:3: rule__DomainDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__1__Impl"


    // $ANTLR start "rule__DomainDeclaration__Group__2"
    // InternalArchitecture.g:530:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:534:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalArchitecture.g:535:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__DomainDeclaration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__2"


    // $ANTLR start "rule__DomainDeclaration__Group__2__Impl"
    // InternalArchitecture.g:542:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:546:1: ( ( '{' ) )
            // InternalArchitecture.g:547:1: ( '{' )
            {
            // InternalArchitecture.g:547:1: ( '{' )
            // InternalArchitecture.g:548:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__2__Impl"


    // $ANTLR start "rule__DomainDeclaration__Group__3"
    // InternalArchitecture.g:557:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:561:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalArchitecture.g:562:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__DomainDeclaration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__3"


    // $ANTLR start "rule__DomainDeclaration__Group__3__Impl"
    // InternalArchitecture.g:569:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:573:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalArchitecture.g:574:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalArchitecture.g:574:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalArchitecture.g:575:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            }
            // InternalArchitecture.g:576:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18||LA6_0==21||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:576:3: rule__DomainDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__DomainDeclaration__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__3__Impl"


    // $ANTLR start "rule__DomainDeclaration__Group__4"
    // InternalArchitecture.g:584:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:588:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalArchitecture.g:589:2: rule__DomainDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__4"


    // $ANTLR start "rule__DomainDeclaration__Group__4__Impl"
    // InternalArchitecture.g:595:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:599:1: ( ( '}' ) )
            // InternalArchitecture.g:600:1: ( '}' )
            {
            // InternalArchitecture.g:600:1: ( '}' )
            // InternalArchitecture.g:601:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__Group__4__Impl"


    // $ANTLR start "rule__AbstractModel__Group__0"
    // InternalArchitecture.g:611:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:615:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalArchitecture.g:616:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__AbstractModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__0"


    // $ANTLR start "rule__AbstractModel__Group__0__Impl"
    // InternalArchitecture.g:623:1: rule__AbstractModel__Group__0__Impl : ( ( rule__AbstractModel__ImpAssignment_0 )* ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:627:1: ( ( ( rule__AbstractModel__ImpAssignment_0 )* ) )
            // InternalArchitecture.g:628:1: ( ( rule__AbstractModel__ImpAssignment_0 )* )
            {
            // InternalArchitecture.g:628:1: ( ( rule__AbstractModel__ImpAssignment_0 )* )
            // InternalArchitecture.g:629:2: ( rule__AbstractModel__ImpAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImpAssignment_0()); 
            }
            // InternalArchitecture.g:630:2: ( rule__AbstractModel__ImpAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArchitecture.g:630:3: rule__AbstractModel__ImpAssignment_0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__AbstractModel__ImpAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getImpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__0__Impl"


    // $ANTLR start "rule__AbstractModel__Group__1"
    // InternalArchitecture.g:638:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:642:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalArchitecture.g:643:2: rule__AbstractModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__1"


    // $ANTLR start "rule__AbstractModel__Group__1__Impl"
    // InternalArchitecture.g:649:1: rule__AbstractModel__Group__1__Impl : ( ( rule__AbstractModel__Alternatives_1 ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:653:1: ( ( ( rule__AbstractModel__Alternatives_1 ) ) )
            // InternalArchitecture.g:654:1: ( ( rule__AbstractModel__Alternatives_1 ) )
            {
            // InternalArchitecture.g:654:1: ( ( rule__AbstractModel__Alternatives_1 ) )
            // InternalArchitecture.g:655:2: ( rule__AbstractModel__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getAlternatives_1()); 
            }
            // InternalArchitecture.g:656:2: ( rule__AbstractModel__Alternatives_1 )
            // InternalArchitecture.g:656:3: rule__AbstractModel__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalArchitecture.g:665:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:669:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArchitecture.g:670:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalArchitecture.g:677:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:681:1: ( ( 'import' ) )
            // InternalArchitecture.g:682:1: ( 'import' )
            {
            // InternalArchitecture.g:682:1: ( 'import' )
            // InternalArchitecture.g:683:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalArchitecture.g:692:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:696:1: ( rule__Import__Group__1__Impl )
            // InternalArchitecture.g:697:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalArchitecture.g:703:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:707:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalArchitecture.g:708:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalArchitecture.g:708:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalArchitecture.g:709:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalArchitecture.g:710:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalArchitecture.g:710:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalArchitecture.g:719:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:723:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalArchitecture.g:724:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalArchitecture.g:731:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:735:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:736:1: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:736:1: ( ruleQualifiedName )
            // InternalArchitecture.g:737:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalArchitecture.g:746:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:750:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalArchitecture.g:751:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalArchitecture.g:757:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:761:1: ( ( ( '.*' )? ) )
            // InternalArchitecture.g:762:1: ( ( '.*' )? )
            {
            // InternalArchitecture.g:762:1: ( ( '.*' )? )
            // InternalArchitecture.g:763:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalArchitecture.g:764:2: ( '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalArchitecture.g:764:3: '.*'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalArchitecture.g:773:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:777:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalArchitecture.g:778:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalArchitecture.g:785:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:789:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:790:1: ( RULE_ID )
            {
            // InternalArchitecture.g:790:1: ( RULE_ID )
            // InternalArchitecture.g:791:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalArchitecture.g:800:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:804:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalArchitecture.g:805:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalArchitecture.g:811:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:815:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalArchitecture.g:816:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalArchitecture.g:816:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalArchitecture.g:817:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalArchitecture.g:818:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArchitecture.g:818:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalArchitecture.g:827:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:831:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalArchitecture.g:832:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalArchitecture.g:839:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:843:1: ( ( '.' ) )
            // InternalArchitecture.g:844:1: ( '.' )
            {
            // InternalArchitecture.g:844:1: ( '.' )
            // InternalArchitecture.g:845:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalArchitecture.g:854:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:858:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalArchitecture.g:859:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalArchitecture.g:865:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:869:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:870:1: ( RULE_ID )
            {
            // InternalArchitecture.g:870:1: ( RULE_ID )
            // InternalArchitecture.g:871:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalArchitecture.g:881:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:885:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArchitecture.g:886:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalArchitecture.g:893:1: rule__Component__Group__0__Impl : ( 'Component:' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:897:1: ( ( 'Component:' ) )
            // InternalArchitecture.g:898:1: ( 'Component:' )
            {
            // InternalArchitecture.g:898:1: ( 'Component:' )
            // InternalArchitecture.g:899:2: 'Component:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalArchitecture.g:908:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:912:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArchitecture.g:913:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalArchitecture.g:920:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:924:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalArchitecture.g:925:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:925:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalArchitecture.g:926:2: ( rule__Component__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:927:2: ( rule__Component__NameAssignment_1 )
            // InternalArchitecture.g:927:3: rule__Component__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalArchitecture.g:935:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:939:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalArchitecture.g:940:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalArchitecture.g:947:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:951:1: ( ( '{' ) )
            // InternalArchitecture.g:952:1: ( '{' )
            {
            // InternalArchitecture.g:952:1: ( '{' )
            // InternalArchitecture.g:953:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalArchitecture.g:962:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:966:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalArchitecture.g:967:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalArchitecture.g:974:1: rule__Component__Group__3__Impl : ( 'providedServices' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:978:1: ( ( 'providedServices' ) )
            // InternalArchitecture.g:979:1: ( 'providedServices' )
            {
            // InternalArchitecture.g:979:1: ( 'providedServices' )
            // InternalArchitecture.g:980:2: 'providedServices'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getProvidedServicesKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getProvidedServicesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalArchitecture.g:989:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:993:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalArchitecture.g:994:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalArchitecture.g:1001:1: rule__Component__Group__4__Impl : ( '(' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1005:1: ( ( '(' ) )
            // InternalArchitecture.g:1006:1: ( '(' )
            {
            // InternalArchitecture.g:1006:1: ( '(' )
            // InternalArchitecture.g:1007:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalArchitecture.g:1016:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1020:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalArchitecture.g:1021:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalArchitecture.g:1028:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1032:1: ( ( ( rule__Component__Group_5__0 )* ) )
            // InternalArchitecture.g:1033:1: ( ( rule__Component__Group_5__0 )* )
            {
            // InternalArchitecture.g:1033:1: ( ( rule__Component__Group_5__0 )* )
            // InternalArchitecture.g:1034:2: ( rule__Component__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5()); 
            }
            // InternalArchitecture.g:1035:2: ( rule__Component__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:1035:3: rule__Component__Group_5__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalArchitecture.g:1043:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1047:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalArchitecture.g:1048:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Component__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalArchitecture.g:1055:1: rule__Component__Group__6__Impl : ( ')' ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1059:1: ( ( ')' ) )
            // InternalArchitecture.g:1060:1: ( ')' )
            {
            // InternalArchitecture.g:1060:1: ( ')' )
            // InternalArchitecture.g:1061:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalArchitecture.g:1070:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1074:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalArchitecture.g:1075:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalArchitecture.g:1082:1: rule__Component__Group__7__Impl : ( 'requeredServices' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1086:1: ( ( 'requeredServices' ) )
            // InternalArchitecture.g:1087:1: ( 'requeredServices' )
            {
            // InternalArchitecture.g:1087:1: ( 'requeredServices' )
            // InternalArchitecture.g:1088:2: 'requeredServices'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRequeredServicesKeyword_7()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRequeredServicesKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // InternalArchitecture.g:1097:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1101:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalArchitecture.g:1102:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // InternalArchitecture.g:1109:1: rule__Component__Group__8__Impl : ( '(' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1113:1: ( ( '(' ) )
            // InternalArchitecture.g:1114:1: ( '(' )
            {
            // InternalArchitecture.g:1114:1: ( '(' )
            // InternalArchitecture.g:1115:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_8()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // InternalArchitecture.g:1124:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1128:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalArchitecture.g:1129:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9"


    // $ANTLR start "rule__Component__Group__9__Impl"
    // InternalArchitecture.g:1136:1: rule__Component__Group__9__Impl : ( ( rule__Component__Group_9__0 )* ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1140:1: ( ( ( rule__Component__Group_9__0 )* ) )
            // InternalArchitecture.g:1141:1: ( ( rule__Component__Group_9__0 )* )
            {
            // InternalArchitecture.g:1141:1: ( ( rule__Component__Group_9__0 )* )
            // InternalArchitecture.g:1142:2: ( rule__Component__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9()); 
            }
            // InternalArchitecture.g:1143:2: ( rule__Component__Group_9__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:1143:3: rule__Component__Group_9__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group__10"
    // InternalArchitecture.g:1151:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1155:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalArchitecture.g:1156:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10"


    // $ANTLR start "rule__Component__Group__10__Impl"
    // InternalArchitecture.g:1163:1: rule__Component__Group__10__Impl : ( ')' ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1167:1: ( ( ')' ) )
            // InternalArchitecture.g:1168:1: ( ')' )
            {
            // InternalArchitecture.g:1168:1: ( ')' )
            // InternalArchitecture.g:1169:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10__Impl"


    // $ANTLR start "rule__Component__Group__11"
    // InternalArchitecture.g:1178:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1182:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalArchitecture.g:1183:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11"


    // $ANTLR start "rule__Component__Group__11__Impl"
    // InternalArchitecture.g:1190:1: rule__Component__Group__11__Impl : ( ( rule__Component__Group_11__0 )* ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1194:1: ( ( ( rule__Component__Group_11__0 )* ) )
            // InternalArchitecture.g:1195:1: ( ( rule__Component__Group_11__0 )* )
            {
            // InternalArchitecture.g:1195:1: ( ( rule__Component__Group_11__0 )* )
            // InternalArchitecture.g:1196:2: ( rule__Component__Group_11__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_11()); 
            }
            // InternalArchitecture.g:1197:2: ( rule__Component__Group_11__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

<<<<<<< HEAD
                if ( (LA12_0==32) ) {
=======
                if ( (LA12_0==30) ) {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:1197:3: rule__Component__Group_11__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Component__Group_11__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11__Impl"


    // $ANTLR start "rule__Component__Group__12"
    // InternalArchitecture.g:1205:1: rule__Component__Group__12 : rule__Component__Group__12__Impl ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1209:1: ( rule__Component__Group__12__Impl )
            // InternalArchitecture.g:1210:2: rule__Component__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12"


    // $ANTLR start "rule__Component__Group__12__Impl"
    // InternalArchitecture.g:1216:1: rule__Component__Group__12__Impl : ( '}' ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1220:1: ( ( '}' ) )
            // InternalArchitecture.g:1221:1: ( '}' )
            {
            // InternalArchitecture.g:1221:1: ( '}' )
            // InternalArchitecture.g:1222:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalArchitecture.g:1232:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1236:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalArchitecture.g:1237:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0"


    // $ANTLR start "rule__Component__Group_5__0__Impl"
    // InternalArchitecture.g:1244:1: rule__Component__Group_5__0__Impl : ( ( rule__Component__Group_5_0__0 )* ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1248:1: ( ( ( rule__Component__Group_5_0__0 )* ) )
            // InternalArchitecture.g:1249:1: ( ( rule__Component__Group_5_0__0 )* )
            {
            // InternalArchitecture.g:1249:1: ( ( rule__Component__Group_5_0__0 )* )
            // InternalArchitecture.g:1250:2: ( rule__Component__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5_0()); 
            }
            // InternalArchitecture.g:1251:2: ( rule__Component__Group_5_0__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==26) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalArchitecture.g:1251:3: rule__Component__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__Group_5_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__0__Impl"


    // $ANTLR start "rule__Component__Group_5__1"
    // InternalArchitecture.g:1259:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1263:1: ( rule__Component__Group_5__1__Impl )
            // InternalArchitecture.g:1264:2: rule__Component__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1"


    // $ANTLR start "rule__Component__Group_5__1__Impl"
    // InternalArchitecture.g:1270:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__OpsAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1274:1: ( ( ( rule__Component__OpsAssignment_5_1 ) ) )
            // InternalArchitecture.g:1275:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            {
            // InternalArchitecture.g:1275:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            // InternalArchitecture.g:1276:2: ( rule__Component__OpsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_1()); 
            }
            // InternalArchitecture.g:1277:2: ( rule__Component__OpsAssignment_5_1 )
            // InternalArchitecture.g:1277:3: rule__Component__OpsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__OpsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5__1__Impl"


    // $ANTLR start "rule__Component__Group_5_0__0"
    // InternalArchitecture.g:1286:1: rule__Component__Group_5_0__0 : rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 ;
    public final void rule__Component__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1290:1: ( rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 )
            // InternalArchitecture.g:1291:2: rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Component__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5_0__0"


    // $ANTLR start "rule__Component__Group_5_0__0__Impl"
    // InternalArchitecture.g:1298:1: rule__Component__Group_5_0__0__Impl : ( ( rule__Component__OpsAssignment_5_0_0 ) ) ;
    public final void rule__Component__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1302:1: ( ( ( rule__Component__OpsAssignment_5_0_0 ) ) )
            // InternalArchitecture.g:1303:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            {
            // InternalArchitecture.g:1303:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            // InternalArchitecture.g:1304:2: ( rule__Component__OpsAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_0_0()); 
            }
            // InternalArchitecture.g:1305:2: ( rule__Component__OpsAssignment_5_0_0 )
            // InternalArchitecture.g:1305:3: rule__Component__OpsAssignment_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__OpsAssignment_5_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsAssignment_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5_0__0__Impl"


    // $ANTLR start "rule__Component__Group_5_0__1"
    // InternalArchitecture.g:1313:1: rule__Component__Group_5_0__1 : rule__Component__Group_5_0__1__Impl ;
    public final void rule__Component__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1317:1: ( rule__Component__Group_5_0__1__Impl )
            // InternalArchitecture.g:1318:2: rule__Component__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5_0__1"


    // $ANTLR start "rule__Component__Group_5_0__1__Impl"
    // InternalArchitecture.g:1324:1: rule__Component__Group_5_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1328:1: ( ( ',' ) )
            // InternalArchitecture.g:1329:1: ( ',' )
            {
            // InternalArchitecture.g:1329:1: ( ',' )
            // InternalArchitecture.g:1330:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_5_0_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCommaKeyword_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_5_0__1__Impl"


    // $ANTLR start "rule__Component__Group_9__0"
    // InternalArchitecture.g:1340:1: rule__Component__Group_9__0 : rule__Component__Group_9__0__Impl rule__Component__Group_9__1 ;
    public final void rule__Component__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1344:1: ( rule__Component__Group_9__0__Impl rule__Component__Group_9__1 )
            // InternalArchitecture.g:1345:2: rule__Component__Group_9__0__Impl rule__Component__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__0"


    // $ANTLR start "rule__Component__Group_9__0__Impl"
    // InternalArchitecture.g:1352:1: rule__Component__Group_9__0__Impl : ( ( rule__Component__Group_9_0__0 )* ) ;
    public final void rule__Component__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1356:1: ( ( ( rule__Component__Group_9_0__0 )* ) )
            // InternalArchitecture.g:1357:1: ( ( rule__Component__Group_9_0__0 )* )
            {
            // InternalArchitecture.g:1357:1: ( ( rule__Component__Group_9_0__0 )* )
            // InternalArchitecture.g:1358:2: ( rule__Component__Group_9_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_0()); 
            }
            // InternalArchitecture.g:1359:2: ( rule__Component__Group_9_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==26) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalArchitecture.g:1359:3: rule__Component__Group_9_0__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__Group_9_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__0__Impl"


    // $ANTLR start "rule__Component__Group_9__1"
    // InternalArchitecture.g:1367:1: rule__Component__Group_9__1 : rule__Component__Group_9__1__Impl ;
    public final void rule__Component__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1371:1: ( rule__Component__Group_9__1__Impl )
            // InternalArchitecture.g:1372:2: rule__Component__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__1"


    // $ANTLR start "rule__Component__Group_9__1__Impl"
    // InternalArchitecture.g:1378:1: rule__Component__Group_9__1__Impl : ( ( rule__Component__OpsReqAssignment_9_1 ) ) ;
    public final void rule__Component__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1382:1: ( ( ( rule__Component__OpsReqAssignment_9_1 ) ) )
            // InternalArchitecture.g:1383:1: ( ( rule__Component__OpsReqAssignment_9_1 ) )
            {
            // InternalArchitecture.g:1383:1: ( ( rule__Component__OpsReqAssignment_9_1 ) )
            // InternalArchitecture.g:1384:2: ( rule__Component__OpsReqAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqAssignment_9_1()); 
            }
            // InternalArchitecture.g:1385:2: ( rule__Component__OpsReqAssignment_9_1 )
            // InternalArchitecture.g:1385:3: rule__Component__OpsReqAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__OpsReqAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsReqAssignment_9_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9__1__Impl"


    // $ANTLR start "rule__Component__Group_9_0__0"
    // InternalArchitecture.g:1394:1: rule__Component__Group_9_0__0 : rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1 ;
    public final void rule__Component__Group_9_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1398:1: ( rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1 )
            // InternalArchitecture.g:1399:2: rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Component__Group_9_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__0"


    // $ANTLR start "rule__Component__Group_9_0__0__Impl"
    // InternalArchitecture.g:1406:1: rule__Component__Group_9_0__0__Impl : ( ( rule__Component__OpsReqAssignment_9_0_0 ) ) ;
    public final void rule__Component__Group_9_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1410:1: ( ( ( rule__Component__OpsReqAssignment_9_0_0 ) ) )
            // InternalArchitecture.g:1411:1: ( ( rule__Component__OpsReqAssignment_9_0_0 ) )
            {
            // InternalArchitecture.g:1411:1: ( ( rule__Component__OpsReqAssignment_9_0_0 ) )
            // InternalArchitecture.g:1412:2: ( rule__Component__OpsReqAssignment_9_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqAssignment_9_0_0()); 
            }
            // InternalArchitecture.g:1413:2: ( rule__Component__OpsReqAssignment_9_0_0 )
            // InternalArchitecture.g:1413:3: rule__Component__OpsReqAssignment_9_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__OpsReqAssignment_9_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsReqAssignment_9_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__0__Impl"


    // $ANTLR start "rule__Component__Group_9_0__1"
    // InternalArchitecture.g:1421:1: rule__Component__Group_9_0__1 : rule__Component__Group_9_0__1__Impl ;
    public final void rule__Component__Group_9_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1425:1: ( rule__Component__Group_9_0__1__Impl )
            // InternalArchitecture.g:1426:2: rule__Component__Group_9_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__1"


    // $ANTLR start "rule__Component__Group_9_0__1__Impl"
    // InternalArchitecture.g:1432:1: rule__Component__Group_9_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_9_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1436:1: ( ( ',' ) )
            // InternalArchitecture.g:1437:1: ( ',' )
            {
            // InternalArchitecture.g:1437:1: ( ',' )
            // InternalArchitecture.g:1438:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_9_0_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCommaKeyword_9_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_9_0__1__Impl"


    // $ANTLR start "rule__Component__Group_11__0"
    // InternalArchitecture.g:1448:1: rule__Component__Group_11__0 : rule__Component__Group_11__0__Impl ;
    public final void rule__Component__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1452:1: ( rule__Component__Group_11__0__Impl )
            // InternalArchitecture.g:1453:2: rule__Component__Group_11__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11__0"


    // $ANTLR start "rule__Component__Group_11__0__Impl"
    // InternalArchitecture.g:1459:1: rule__Component__Group_11__0__Impl : ( ( rule__Component__OperationsAssignment_11_0 ) ) ;
    public final void rule__Component__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1463:1: ( ( ( rule__Component__OperationsAssignment_11_0 ) ) )
            // InternalArchitecture.g:1464:1: ( ( rule__Component__OperationsAssignment_11_0 ) )
            {
            // InternalArchitecture.g:1464:1: ( ( rule__Component__OperationsAssignment_11_0 ) )
            // InternalArchitecture.g:1465:2: ( rule__Component__OperationsAssignment_11_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOperationsAssignment_11_0()); 
            }
            // InternalArchitecture.g:1466:2: ( rule__Component__OperationsAssignment_11_0 )
            // InternalArchitecture.g:1466:3: rule__Component__OperationsAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__OperationsAssignment_11_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOperationsAssignment_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11__0__Impl"


    // $ANTLR start "rule__Architecture__Group__0"
    // InternalArchitecture.g:1475:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1479:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalArchitecture.g:1480:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Architecture__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0"


    // $ANTLR start "rule__Architecture__Group__0__Impl"
    // InternalArchitecture.g:1487:1: rule__Architecture__Group__0__Impl : ( () ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1491:1: ( ( () ) )
            // InternalArchitecture.g:1492:1: ( () )
            {
            // InternalArchitecture.g:1492:1: ( () )
            // InternalArchitecture.g:1493:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getArchitectureAction_0()); 
            }
            // InternalArchitecture.g:1494:2: ()
            // InternalArchitecture.g:1494:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getArchitectureAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__0__Impl"


    // $ANTLR start "rule__Architecture__Group__1"
    // InternalArchitecture.g:1502:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1506:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalArchitecture.g:1507:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Architecture__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1"


    // $ANTLR start "rule__Architecture__Group__1__Impl"
    // InternalArchitecture.g:1514:1: rule__Architecture__Group__1__Impl : ( 'ArchitectureDefinition' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1518:1: ( ( 'ArchitectureDefinition' ) )
            // InternalArchitecture.g:1519:1: ( 'ArchitectureDefinition' )
            {
            // InternalArchitecture.g:1519:1: ( 'ArchitectureDefinition' )
            // InternalArchitecture.g:1520:2: 'ArchitectureDefinition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getArchitectureDefinitionKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getArchitectureDefinitionKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__1__Impl"


    // $ANTLR start "rule__Architecture__Group__2"
    // InternalArchitecture.g:1529:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1533:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalArchitecture.g:1534:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Architecture__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2"


    // $ANTLR start "rule__Architecture__Group__2__Impl"
    // InternalArchitecture.g:1541:1: rule__Architecture__Group__2__Impl : ( ( rule__Architecture__VarsAssignment_2 )* ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1545:1: ( ( ( rule__Architecture__VarsAssignment_2 )* ) )
            // InternalArchitecture.g:1546:1: ( ( rule__Architecture__VarsAssignment_2 )* )
            {
            // InternalArchitecture.g:1546:1: ( ( rule__Architecture__VarsAssignment_2 )* )
            // InternalArchitecture.g:1547:2: ( rule__Architecture__VarsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getVarsAssignment_2()); 
            }
            // InternalArchitecture.g:1548:2: ( rule__Architecture__VarsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArchitecture.g:1548:3: rule__Architecture__VarsAssignment_2
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Architecture__VarsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getVarsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__2__Impl"


    // $ANTLR start "rule__Architecture__Group__3"
    // InternalArchitecture.g:1556:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1560:1: ( rule__Architecture__Group__3__Impl )
            // InternalArchitecture.g:1561:2: rule__Architecture__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3"


    // $ANTLR start "rule__Architecture__Group__3__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:1567:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__Group_3__0 )* ) ;
=======
    // InternalArchitecture.g:1542:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__BindAssignment_3 )* ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1571:1: ( ( ( rule__Architecture__Group_3__0 )* ) )
            // InternalArchitecture.g:1572:1: ( ( rule__Architecture__Group_3__0 )* )
            {
            // InternalArchitecture.g:1572:1: ( ( rule__Architecture__Group_3__0 )* )
            // InternalArchitecture.g:1573:2: ( rule__Architecture__Group_3__0 )*
=======
            // InternalArchitecture.g:1546:1: ( ( ( rule__Architecture__BindAssignment_3 )* ) )
            // InternalArchitecture.g:1547:1: ( ( rule__Architecture__BindAssignment_3 )* )
            {
            // InternalArchitecture.g:1547:1: ( ( rule__Architecture__BindAssignment_3 )* )
            // InternalArchitecture.g:1548:2: ( rule__Architecture__BindAssignment_3 )*
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getBindAssignment_3()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1574:2: ( rule__Architecture__Group_3__0 )*
=======
            // InternalArchitecture.g:1549:2: ( rule__Architecture__BindAssignment_3 )*
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
<<<<<<< HEAD
            	    // InternalArchitecture.g:1574:3: rule__Architecture__Group_3__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Architecture__Group_3__0();
=======
            	    // InternalArchitecture.g:1549:3: rule__Architecture__BindAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Architecture__BindAssignment_3();
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getBindAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__Group__3__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__0"
    // InternalArchitecture.g:1583:1: rule__Architecture__Group_3__0 : rule__Architecture__Group_3__0__Impl rule__Architecture__Group_3__1 ;
    public final void rule__Architecture__Group_3__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__0"
    // InternalArchitecture.g:1558:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1587:1: ( rule__Architecture__Group_3__0__Impl rule__Architecture__Group_3__1 )
            // InternalArchitecture.g:1588:2: rule__Architecture__Group_3__0__Impl rule__Architecture__Group_3__1
=======
            // InternalArchitecture.g:1562:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalArchitecture.g:1563:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__0__Impl"
    // InternalArchitecture.g:1595:1: rule__Architecture__Group_3__0__Impl : ( 'bind' ) ;
    public final void rule__Architecture__Group_3__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalArchitecture.g:1570:1: rule__Binding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1599:1: ( ( 'bind' ) )
            // InternalArchitecture.g:1600:1: ( 'bind' )
            {
            // InternalArchitecture.g:1600:1: ( 'bind' )
            // InternalArchitecture.g:1601:2: 'bind'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getBindKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__0__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__1"
    // InternalArchitecture.g:1610:1: rule__Architecture__Group_3__1 : rule__Architecture__Group_3__1__Impl rule__Architecture__Group_3__2 ;
    public final void rule__Architecture__Group_3__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__1"
    // InternalArchitecture.g:1585:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1614:1: ( rule__Architecture__Group_3__1__Impl rule__Architecture__Group_3__2 )
            // InternalArchitecture.g:1615:2: rule__Architecture__Group_3__1__Impl rule__Architecture__Group_3__2
            {
            pushFollow(FOLLOW_25);
            rule__Architecture__Group_3__1__Impl();
=======
            // InternalArchitecture.g:1589:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalArchitecture.g:1590:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Binding__Group__1__Impl();
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__1__Impl"
    // InternalArchitecture.g:1622:1: rule__Architecture__Group_3__1__Impl : ( ( rule__Architecture__ReceiverAssignment_3_1 ) ) ;
    public final void rule__Architecture__Group_3__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalArchitecture.g:1597:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__ReceiverAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1626:1: ( ( ( rule__Architecture__ReceiverAssignment_3_1 ) ) )
            // InternalArchitecture.g:1627:1: ( ( rule__Architecture__ReceiverAssignment_3_1 ) )
            {
            // InternalArchitecture.g:1627:1: ( ( rule__Architecture__ReceiverAssignment_3_1 ) )
            // InternalArchitecture.g:1628:2: ( rule__Architecture__ReceiverAssignment_3_1 )
=======
            // InternalArchitecture.g:1601:1: ( ( ( rule__Binding__ReceiverAssignment_1 ) ) )
            // InternalArchitecture.g:1602:1: ( ( rule__Binding__ReceiverAssignment_1 ) )
            {
            // InternalArchitecture.g:1602:1: ( ( rule__Binding__ReceiverAssignment_1 ) )
            // InternalArchitecture.g:1603:2: ( rule__Binding__ReceiverAssignment_1 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getReceiverAssignment_1()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1629:2: ( rule__Architecture__ReceiverAssignment_3_1 )
            // InternalArchitecture.g:1629:3: rule__Architecture__ReceiverAssignment_3_1
=======
            // InternalArchitecture.g:1604:2: ( rule__Binding__ReceiverAssignment_1 )
            // InternalArchitecture.g:1604:3: rule__Binding__ReceiverAssignment_1
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ReceiverAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getReceiverAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__1__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__2"
    // InternalArchitecture.g:1637:1: rule__Architecture__Group_3__2 : rule__Architecture__Group_3__2__Impl rule__Architecture__Group_3__3 ;
    public final void rule__Architecture__Group_3__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__2"
    // InternalArchitecture.g:1612:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1641:1: ( rule__Architecture__Group_3__2__Impl rule__Architecture__Group_3__3 )
            // InternalArchitecture.g:1642:2: rule__Architecture__Group_3__2__Impl rule__Architecture__Group_3__3
=======
            // InternalArchitecture.g:1616:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalArchitecture.g:1617:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__2__Impl"
    // InternalArchitecture.g:1649:1: rule__Architecture__Group_3__2__Impl : ( '-' ) ;
    public final void rule__Architecture__Group_3__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalArchitecture.g:1624:1: rule__Binding__Group__2__Impl : ( '.' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1653:1: ( ( '-' ) )
            // InternalArchitecture.g:1654:1: ( '-' )
            {
            // InternalArchitecture.g:1654:1: ( '-' )
            // InternalArchitecture.g:1655:2: '-'
=======
            // InternalArchitecture.g:1628:1: ( ( '.' ) )
            // InternalArchitecture.g:1629:1: ( '.' )
            {
            // InternalArchitecture.g:1629:1: ( '.' )
            // InternalArchitecture.g:1630:2: '.'
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getFullStopKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__2__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__3"
    // InternalArchitecture.g:1664:1: rule__Architecture__Group_3__3 : rule__Architecture__Group_3__3__Impl ;
    public final void rule__Architecture__Group_3__3() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__3"
    // InternalArchitecture.g:1639:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1668:1: ( rule__Architecture__Group_3__3__Impl )
            // InternalArchitecture.g:1669:2: rule__Architecture__Group_3__3__Impl
=======
            // InternalArchitecture.g:1643:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalArchitecture.g:1644:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_24);
            rule__Binding__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__Group_3__3__Impl"
    // InternalArchitecture.g:1675:1: rule__Architecture__Group_3__3__Impl : ( ( rule__Architecture__ProviderAssignment_3_3 ) ) ;
    public final void rule__Architecture__Group_3__3__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalArchitecture.g:1651:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__RecMemberAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1679:1: ( ( ( rule__Architecture__ProviderAssignment_3_3 ) ) )
            // InternalArchitecture.g:1680:1: ( ( rule__Architecture__ProviderAssignment_3_3 ) )
            {
            // InternalArchitecture.g:1680:1: ( ( rule__Architecture__ProviderAssignment_3_3 ) )
            // InternalArchitecture.g:1681:2: ( rule__Architecture__ProviderAssignment_3_3 )
=======
            // InternalArchitecture.g:1655:1: ( ( ( rule__Binding__RecMemberAssignment_3 ) ) )
            // InternalArchitecture.g:1656:1: ( ( rule__Binding__RecMemberAssignment_3 ) )
            {
            // InternalArchitecture.g:1656:1: ( ( rule__Binding__RecMemberAssignment_3 ) )
            // InternalArchitecture.g:1657:2: ( rule__Binding__RecMemberAssignment_3 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getRecMemberAssignment_3()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1682:2: ( rule__Architecture__ProviderAssignment_3_3 )
            // InternalArchitecture.g:1682:3: rule__Architecture__ProviderAssignment_3_3
=======
            // InternalArchitecture.g:1658:2: ( rule__Binding__RecMemberAssignment_3 )
            // InternalArchitecture.g:1658:3: rule__Binding__RecMemberAssignment_3
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Binding__RecMemberAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getRecMemberAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__3__Impl"


    // $ANTLR start "rule__Binding__Group__4"
    // InternalArchitecture.g:1666:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1670:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalArchitecture.g:1671:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4"


    // $ANTLR start "rule__Binding__Group__4__Impl"
    // InternalArchitecture.g:1678:1: rule__Binding__Group__4__Impl : ( ':' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1682:1: ( ( ':' ) )
            // InternalArchitecture.g:1683:1: ( ':' )
            {
            // InternalArchitecture.g:1683:1: ( ':' )
            // InternalArchitecture.g:1684:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getColonKeyword_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getColonKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__4__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__Group__0"
    // InternalArchitecture.g:1691:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__5"
    // InternalArchitecture.g:1693:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl rule__Binding__Group__6 ;
    public final void rule__Binding__Group__5() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1695:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalArchitecture.g:1696:2: rule__Call__Group__0__Impl rule__Call__Group__1
=======
            // InternalArchitecture.g:1697:1: ( rule__Binding__Group__5__Impl rule__Binding__Group__6 )
            // InternalArchitecture.g:1698:2: rule__Binding__Group__5__Impl rule__Binding__Group__6
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_12);
            rule__Binding__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__Group__0__Impl"
    // InternalArchitecture.g:1703:1: rule__Call__Group__0__Impl : ( ( rule__Call__ReceiverAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalArchitecture.g:1705:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__ProviderAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1707:1: ( ( ( rule__Call__ReceiverAssignment_0 ) ) )
            // InternalArchitecture.g:1708:1: ( ( rule__Call__ReceiverAssignment_0 ) )
            {
            // InternalArchitecture.g:1708:1: ( ( rule__Call__ReceiverAssignment_0 ) )
            // InternalArchitecture.g:1709:2: ( rule__Call__ReceiverAssignment_0 )
=======
            // InternalArchitecture.g:1709:1: ( ( ( rule__Binding__ProviderAssignment_5 ) ) )
            // InternalArchitecture.g:1710:1: ( ( rule__Binding__ProviderAssignment_5 ) )
            {
            // InternalArchitecture.g:1710:1: ( ( rule__Binding__ProviderAssignment_5 ) )
            // InternalArchitecture.g:1711:2: ( rule__Binding__ProviderAssignment_5 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProviderAssignment_5()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1710:2: ( rule__Call__ReceiverAssignment_0 )
            // InternalArchitecture.g:1710:3: rule__Call__ReceiverAssignment_0
=======
            // InternalArchitecture.g:1712:2: ( rule__Binding__ProviderAssignment_5 )
            // InternalArchitecture.g:1712:3: rule__Binding__ProviderAssignment_5
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ProviderAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProviderAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__5__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__Group__1"
    // InternalArchitecture.g:1718:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__6"
    // InternalArchitecture.g:1720:1: rule__Binding__Group__6 : rule__Binding__Group__6__Impl rule__Binding__Group__7 ;
    public final void rule__Binding__Group__6() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1722:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // InternalArchitecture.g:1723:2: rule__Call__Group__1__Impl rule__Call__Group__2
=======
            // InternalArchitecture.g:1724:1: ( rule__Binding__Group__6__Impl rule__Binding__Group__7 )
            // InternalArchitecture.g:1725:2: rule__Binding__Group__6__Impl rule__Binding__Group__7
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_5);
            rule__Binding__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Binding__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__6"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__Group__1__Impl"
    // InternalArchitecture.g:1730:1: rule__Call__Group__1__Impl : ( '.' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__6__Impl"
    // InternalArchitecture.g:1732:1: rule__Binding__Group__6__Impl : ( '.' ) ;
    public final void rule__Binding__Group__6__Impl() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1734:1: ( ( '.' ) )
            // InternalArchitecture.g:1735:1: ( '.' )
            {
            // InternalArchitecture.g:1735:1: ( '.' )
            // InternalArchitecture.g:1736:2: '.'
=======
            // InternalArchitecture.g:1736:1: ( ( '.' ) )
            // InternalArchitecture.g:1737:1: ( '.' )
            {
            // InternalArchitecture.g:1737:1: ( '.' )
            // InternalArchitecture.g:1738:2: '.'
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getFullStopKeyword_6()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getFullStopKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__6__Impl"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__Group__2"
    // InternalArchitecture.g:1745:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__7"
    // InternalArchitecture.g:1747:1: rule__Binding__Group__7 : rule__Binding__Group__7__Impl ;
    public final void rule__Binding__Group__7() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1749:1: ( rule__Call__Group__2__Impl )
            // InternalArchitecture.g:1750:2: rule__Call__Group__2__Impl
=======
            // InternalArchitecture.g:1751:1: ( rule__Binding__Group__7__Impl )
            // InternalArchitecture.g:1752:2: rule__Binding__Group__7__Impl
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Binding__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__7"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__Group__2__Impl"
    // InternalArchitecture.g:1756:1: rule__Call__Group__2__Impl : ( ( rule__Call__MemberAssignment_2 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__Group__7__Impl"
    // InternalArchitecture.g:1758:1: rule__Binding__Group__7__Impl : ( ( rule__Binding__ProMemberAssignment_7 ) ) ;
    public final void rule__Binding__Group__7__Impl() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1760:1: ( ( ( rule__Call__MemberAssignment_2 ) ) )
            // InternalArchitecture.g:1761:1: ( ( rule__Call__MemberAssignment_2 ) )
            {
            // InternalArchitecture.g:1761:1: ( ( rule__Call__MemberAssignment_2 ) )
            // InternalArchitecture.g:1762:2: ( rule__Call__MemberAssignment_2 )
=======
            // InternalArchitecture.g:1762:1: ( ( ( rule__Binding__ProMemberAssignment_7 ) ) )
            // InternalArchitecture.g:1763:1: ( ( rule__Binding__ProMemberAssignment_7 ) )
            {
            // InternalArchitecture.g:1763:1: ( ( rule__Binding__ProMemberAssignment_7 ) )
            // InternalArchitecture.g:1764:2: ( rule__Binding__ProMemberAssignment_7 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProMemberAssignment_7()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1763:2: ( rule__Call__MemberAssignment_2 )
            // InternalArchitecture.g:1763:3: rule__Call__MemberAssignment_2
=======
            // InternalArchitecture.g:1765:2: ( rule__Binding__ProMemberAssignment_7 )
            // InternalArchitecture.g:1765:3: rule__Binding__ProMemberAssignment_7
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ProMemberAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProMemberAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__Group__7__Impl"


    // $ANTLR start "rule__Variable__Group__0"
<<<<<<< HEAD
    // InternalArchitecture.g:1772:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
=======
    // InternalArchitecture.g:1774:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1776:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1777:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_26);
=======
            // InternalArchitecture.g:1778:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1779:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_24);
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            rule__Variable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:1784:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
=======
    // InternalArchitecture.g:1786:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1788:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1789:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1789:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1790:2: ( rule__Variable__NameAssignment_0 )
=======
            // InternalArchitecture.g:1790:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1791:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1791:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1792:2: ( rule__Variable__NameAssignment_0 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1791:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1791:3: rule__Variable__NameAssignment_0
=======
            // InternalArchitecture.g:1793:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1793:3: rule__Variable__NameAssignment_0
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
<<<<<<< HEAD
    // InternalArchitecture.g:1799:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
=======
    // InternalArchitecture.g:1801:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1803:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1804:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_27);
=======
            // InternalArchitecture.g:1805:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1806:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_25);
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            rule__Variable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:1811:1: rule__Variable__Group__1__Impl : ( ':' ) ;
=======
    // InternalArchitecture.g:1813:1: rule__Variable__Group__1__Impl : ( ':' ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1815:1: ( ( ':' ) )
            // InternalArchitecture.g:1816:1: ( ':' )
            {
            // InternalArchitecture.g:1816:1: ( ':' )
            // InternalArchitecture.g:1817:2: ':'
=======
            // InternalArchitecture.g:1817:1: ( ( ':' ) )
            // InternalArchitecture.g:1818:1: ( ':' )
            {
            // InternalArchitecture.g:1818:1: ( ':' )
            // InternalArchitecture.g:1819:2: ':'
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
<<<<<<< HEAD
    // InternalArchitecture.g:1826:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
=======
    // InternalArchitecture.g:1828:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1830:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1831:2: rule__Variable__Group__2__Impl
=======
            // InternalArchitecture.g:1832:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1833:2: rule__Variable__Group__2__Impl
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:1837:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
=======
    // InternalArchitecture.g:1839:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1841:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1842:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1842:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1843:2: ( rule__Variable__TypeAssignment_2 )
=======
            // InternalArchitecture.g:1843:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1844:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1844:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1845:2: ( rule__Variable__TypeAssignment_2 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1844:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1844:3: rule__Variable__TypeAssignment_2
=======
            // InternalArchitecture.g:1846:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1846:3: rule__Variable__TypeAssignment_2
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__PID__Group__0"
    // InternalArchitecture.g:1853:1: rule__PID__Group__0 : rule__PID__Group__0__Impl rule__PID__Group__1 ;
    public final void rule__PID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1857:1: ( rule__PID__Group__0__Impl rule__PID__Group__1 )
            // InternalArchitecture.g:1858:2: rule__PID__Group__0__Impl rule__PID__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PID__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PID__Group__0"


    // $ANTLR start "rule__PID__Group__0__Impl"
    // InternalArchitecture.g:1865:1: rule__PID__Group__0__Impl : ( '_' ) ;
    public final void rule__PID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1869:1: ( ( '_' ) )
            // InternalArchitecture.g:1870:1: ( '_' )
            {
            // InternalArchitecture.g:1870:1: ( '_' )
            // InternalArchitecture.g:1871:2: '_'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIDAccess().get_Keyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIDAccess().get_Keyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PID__Group__0__Impl"


    // $ANTLR start "rule__PID__Group__1"
    // InternalArchitecture.g:1880:1: rule__PID__Group__1 : rule__PID__Group__1__Impl ;
    public final void rule__PID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1884:1: ( rule__PID__Group__1__Impl )
            // InternalArchitecture.g:1885:2: rule__PID__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PID__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PID__Group__1"


    // $ANTLR start "rule__PID__Group__1__Impl"
    // InternalArchitecture.g:1891:1: rule__PID__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__PID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1895:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:1896:1: ( RULE_ID )
            {
            // InternalArchitecture.g:1896:1: ( RULE_ID )
            // InternalArchitecture.g:1897:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPIDAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPIDAccess().getIDTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PID__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__0"
<<<<<<< HEAD
    // InternalArchitecture.g:1907:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
=======
    // InternalArchitecture.g:1855:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1911:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalArchitecture.g:1912:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
=======
            // InternalArchitecture.g:1859:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalArchitecture.g:1860:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_5);
            rule__Operation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:1919:1: rule__Operation__Group__0__Impl : ( 'def' ) ;
=======
    // InternalArchitecture.g:1867:1: rule__Operation__Group__0__Impl : ( 'def' ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1923:1: ( ( 'def' ) )
            // InternalArchitecture.g:1924:1: ( 'def' )
            {
            // InternalArchitecture.g:1924:1: ( 'def' )
            // InternalArchitecture.g:1925:2: 'def'
=======
            // InternalArchitecture.g:1871:1: ( ( 'def' ) )
            // InternalArchitecture.g:1872:1: ( 'def' )
            {
            // InternalArchitecture.g:1872:1: ( 'def' )
            // InternalArchitecture.g:1873:2: 'def'
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getDefKeyword_0()); 
            }
<<<<<<< HEAD
            match(input,32,FOLLOW_2); if (state.failed) return ;
=======
            match(input,30,FOLLOW_2); if (state.failed) return ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getDefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
<<<<<<< HEAD
    // InternalArchitecture.g:1934:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
=======
    // InternalArchitecture.g:1882:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1938:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalArchitecture.g:1939:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
=======
            // InternalArchitecture.g:1886:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalArchitecture.g:1887:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_15);
            rule__Operation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:1946:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
=======
    // InternalArchitecture.g:1894:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1950:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalArchitecture.g:1951:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:1951:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalArchitecture.g:1952:2: ( rule__Operation__NameAssignment_1 )
=======
            // InternalArchitecture.g:1898:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalArchitecture.g:1899:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:1899:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalArchitecture.g:1900:2: ( rule__Operation__NameAssignment_1 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:1953:2: ( rule__Operation__NameAssignment_1 )
            // InternalArchitecture.g:1953:3: rule__Operation__NameAssignment_1
=======
            // InternalArchitecture.g:1901:2: ( rule__Operation__NameAssignment_1 )
            // InternalArchitecture.g:1901:3: rule__Operation__NameAssignment_1
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
<<<<<<< HEAD
    // InternalArchitecture.g:1961:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
=======
    // InternalArchitecture.g:1909:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1965:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalArchitecture.g:1966:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
=======
            // InternalArchitecture.g:1913:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalArchitecture.g:1914:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_28);
            rule__Operation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:1973:1: rule__Operation__Group__2__Impl : ( '(' ) ;
=======
    // InternalArchitecture.g:1921:1: rule__Operation__Group__2__Impl : ( '(' ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1977:1: ( ( '(' ) )
            // InternalArchitecture.g:1978:1: ( '(' )
            {
            // InternalArchitecture.g:1978:1: ( '(' )
            // InternalArchitecture.g:1979:2: '('
=======
            // InternalArchitecture.g:1925:1: ( ( '(' ) )
            // InternalArchitecture.g:1926:1: ( '(' )
            {
            // InternalArchitecture.g:1926:1: ( '(' )
            // InternalArchitecture.g:1927:2: '('
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Operation__Group__3"
<<<<<<< HEAD
    // InternalArchitecture.g:1988:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
=======
    // InternalArchitecture.g:1936:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:1992:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalArchitecture.g:1993:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
=======
            // InternalArchitecture.g:1940:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalArchitecture.g:1941:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_28);
            rule__Operation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2000:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )* ) ;
=======
    // InternalArchitecture.g:1948:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )* ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2004:1: ( ( ( rule__Operation__Group_3__0 )* ) )
            // InternalArchitecture.g:2005:1: ( ( rule__Operation__Group_3__0 )* )
            {
            // InternalArchitecture.g:2005:1: ( ( rule__Operation__Group_3__0 )* )
            // InternalArchitecture.g:2006:2: ( rule__Operation__Group_3__0 )*
=======
            // InternalArchitecture.g:1952:1: ( ( ( rule__Operation__Group_3__0 )* ) )
            // InternalArchitecture.g:1953:1: ( ( rule__Operation__Group_3__0 )* )
            {
            // InternalArchitecture.g:1953:1: ( ( rule__Operation__Group_3__0 )* )
            // InternalArchitecture.g:1954:2: ( rule__Operation__Group_3__0 )*
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2007:2: ( rule__Operation__Group_3__0 )*
=======
            // InternalArchitecture.g:1955:2: ( rule__Operation__Group_3__0 )*
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
<<<<<<< HEAD
            	    // InternalArchitecture.g:2007:3: rule__Operation__Group_3__0
=======
            	    // InternalArchitecture.g:1955:3: rule__Operation__Group_3__0
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Operation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
<<<<<<< HEAD
    // InternalArchitecture.g:2015:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
=======
    // InternalArchitecture.g:1963:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2019:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalArchitecture.g:2020:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_26);
=======
            // InternalArchitecture.g:1967:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalArchitecture.g:1968:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_24);
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            rule__Operation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2027:1: rule__Operation__Group__4__Impl : ( ')' ) ;
=======
    // InternalArchitecture.g:1975:1: rule__Operation__Group__4__Impl : ( ')' ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2031:1: ( ( ')' ) )
            // InternalArchitecture.g:2032:1: ( ')' )
            {
            // InternalArchitecture.g:2032:1: ( ')' )
            // InternalArchitecture.g:2033:2: ')'
=======
            // InternalArchitecture.g:1979:1: ( ( ')' ) )
            // InternalArchitecture.g:1980:1: ( ')' )
            {
            // InternalArchitecture.g:1980:1: ( ')' )
            // InternalArchitecture.g:1981:2: ')'
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
<<<<<<< HEAD
    // InternalArchitecture.g:2042:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
=======
    // InternalArchitecture.g:1990:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2046:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalArchitecture.g:2047:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_27);
=======
            // InternalArchitecture.g:1994:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalArchitecture.g:1995:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_25);
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            rule__Operation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2054:1: rule__Operation__Group__5__Impl : ( ':' ) ;
=======
    // InternalArchitecture.g:2002:1: rule__Operation__Group__5__Impl : ( ':' ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2058:1: ( ( ':' ) )
            // InternalArchitecture.g:2059:1: ( ':' )
            {
            // InternalArchitecture.g:2059:1: ( ':' )
            // InternalArchitecture.g:2060:2: ':'
=======
            // InternalArchitecture.g:2006:1: ( ( ':' ) )
            // InternalArchitecture.g:2007:1: ( ':' )
            {
            // InternalArchitecture.g:2007:1: ( ':' )
            // InternalArchitecture.g:2008:2: ':'
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
<<<<<<< HEAD
    // InternalArchitecture.g:2069:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
=======
    // InternalArchitecture.g:2017:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2073:1: ( rule__Operation__Group__6__Impl )
            // InternalArchitecture.g:2074:2: rule__Operation__Group__6__Impl
=======
            // InternalArchitecture.g:2021:1: ( rule__Operation__Group__6__Impl )
            // InternalArchitecture.g:2022:2: rule__Operation__Group__6__Impl
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2080:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__TypeAssignment_6 ) ) ;
=======
    // InternalArchitecture.g:2028:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__TypeAssignment_6 ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2084:1: ( ( ( rule__Operation__TypeAssignment_6 ) ) )
            // InternalArchitecture.g:2085:1: ( ( rule__Operation__TypeAssignment_6 ) )
            {
            // InternalArchitecture.g:2085:1: ( ( rule__Operation__TypeAssignment_6 ) )
            // InternalArchitecture.g:2086:2: ( rule__Operation__TypeAssignment_6 )
=======
            // InternalArchitecture.g:2032:1: ( ( ( rule__Operation__TypeAssignment_6 ) ) )
            // InternalArchitecture.g:2033:1: ( ( rule__Operation__TypeAssignment_6 ) )
            {
            // InternalArchitecture.g:2033:1: ( ( rule__Operation__TypeAssignment_6 ) )
            // InternalArchitecture.g:2034:2: ( rule__Operation__TypeAssignment_6 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeAssignment_6()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2087:2: ( rule__Operation__TypeAssignment_6 )
            // InternalArchitecture.g:2087:3: rule__Operation__TypeAssignment_6
=======
            // InternalArchitecture.g:2035:2: ( rule__Operation__TypeAssignment_6 )
            // InternalArchitecture.g:2035:3: rule__Operation__TypeAssignment_6
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Operation__TypeAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Operation__Group_3__0"
<<<<<<< HEAD
    // InternalArchitecture.g:2096:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
=======
    // InternalArchitecture.g:2044:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2100:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // InternalArchitecture.g:2101:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
=======
            // InternalArchitecture.g:2048:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // InternalArchitecture.g:2049:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_29);
            rule__Operation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0"


    // $ANTLR start "rule__Operation__Group_3__0__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2108:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__Group_3_0__0 )* ) ;
=======
    // InternalArchitecture.g:2056:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__Group_3_0__0 )* ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2112:1: ( ( ( rule__Operation__Group_3_0__0 )* ) )
            // InternalArchitecture.g:2113:1: ( ( rule__Operation__Group_3_0__0 )* )
            {
            // InternalArchitecture.g:2113:1: ( ( rule__Operation__Group_3_0__0 )* )
            // InternalArchitecture.g:2114:2: ( rule__Operation__Group_3_0__0 )*
=======
            // InternalArchitecture.g:2060:1: ( ( ( rule__Operation__Group_3_0__0 )* ) )
            // InternalArchitecture.g:2061:1: ( ( rule__Operation__Group_3_0__0 )* )
            {
            // InternalArchitecture.g:2061:1: ( ( rule__Operation__Group_3_0__0 )* )
            // InternalArchitecture.g:2062:2: ( rule__Operation__Group_3_0__0 )*
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2115:2: ( rule__Operation__Group_3_0__0 )*
=======
            // InternalArchitecture.g:2063:2: ( rule__Operation__Group_3_0__0 )*
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
<<<<<<< HEAD
            	    // InternalArchitecture.g:2115:3: rule__Operation__Group_3_0__0
=======
            	    // InternalArchitecture.g:2063:3: rule__Operation__Group_3_0__0
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Operation__Group_3_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_3__1"
<<<<<<< HEAD
    // InternalArchitecture.g:2123:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
=======
    // InternalArchitecture.g:2071:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2127:1: ( rule__Operation__Group_3__1__Impl )
            // InternalArchitecture.g:2128:2: rule__Operation__Group_3__1__Impl
=======
            // InternalArchitecture.g:2075:1: ( rule__Operation__Group_3__1__Impl )
            // InternalArchitecture.g:2076:2: rule__Operation__Group_3__1__Impl
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1"


    // $ANTLR start "rule__Operation__Group_3__1__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2134:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__ArgAssignment_3_1 ) ) ;
=======
    // InternalArchitecture.g:2082:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__ArgAssignment_3_1 ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2138:1: ( ( ( rule__Operation__ArgAssignment_3_1 ) ) )
            // InternalArchitecture.g:2139:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            {
            // InternalArchitecture.g:2139:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            // InternalArchitecture.g:2140:2: ( rule__Operation__ArgAssignment_3_1 )
=======
            // InternalArchitecture.g:2086:1: ( ( ( rule__Operation__ArgAssignment_3_1 ) ) )
            // InternalArchitecture.g:2087:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            {
            // InternalArchitecture.g:2087:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            // InternalArchitecture.g:2088:2: ( rule__Operation__ArgAssignment_3_1 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_1()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2141:2: ( rule__Operation__ArgAssignment_3_1 )
            // InternalArchitecture.g:2141:3: rule__Operation__ArgAssignment_3_1
=======
            // InternalArchitecture.g:2089:2: ( rule__Operation__ArgAssignment_3_1 )
            // InternalArchitecture.g:2089:3: rule__Operation__ArgAssignment_3_1
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ArgAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_3_0__0"
<<<<<<< HEAD
    // InternalArchitecture.g:2150:1: rule__Operation__Group_3_0__0 : rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 ;
=======
    // InternalArchitecture.g:2098:1: rule__Operation__Group_3_0__0 : rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2154:1: ( rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 )
            // InternalArchitecture.g:2155:2: rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1
=======
            // InternalArchitecture.g:2102:1: ( rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 )
            // InternalArchitecture.g:2103:2: rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_21);
            rule__Operation__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_0__0"


    // $ANTLR start "rule__Operation__Group_3_0__0__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2162:1: rule__Operation__Group_3_0__0__Impl : ( ( rule__Operation__ArgAssignment_3_0_0 ) ) ;
=======
    // InternalArchitecture.g:2110:1: rule__Operation__Group_3_0__0__Impl : ( ( rule__Operation__ArgAssignment_3_0_0 ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2166:1: ( ( ( rule__Operation__ArgAssignment_3_0_0 ) ) )
            // InternalArchitecture.g:2167:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            {
            // InternalArchitecture.g:2167:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            // InternalArchitecture.g:2168:2: ( rule__Operation__ArgAssignment_3_0_0 )
=======
            // InternalArchitecture.g:2114:1: ( ( ( rule__Operation__ArgAssignment_3_0_0 ) ) )
            // InternalArchitecture.g:2115:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            {
            // InternalArchitecture.g:2115:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            // InternalArchitecture.g:2116:2: ( rule__Operation__ArgAssignment_3_0_0 )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_0_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2169:2: ( rule__Operation__ArgAssignment_3_0_0 )
            // InternalArchitecture.g:2169:3: rule__Operation__ArgAssignment_3_0_0
=======
            // InternalArchitecture.g:2117:2: ( rule__Operation__ArgAssignment_3_0_0 )
            // InternalArchitecture.g:2117:3: rule__Operation__ArgAssignment_3_0_0
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ArgAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgAssignment_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_0__0__Impl"


    // $ANTLR start "rule__Operation__Group_3_0__1"
<<<<<<< HEAD
    // InternalArchitecture.g:2177:1: rule__Operation__Group_3_0__1 : rule__Operation__Group_3_0__1__Impl ;
=======
    // InternalArchitecture.g:2125:1: rule__Operation__Group_3_0__1 : rule__Operation__Group_3_0__1__Impl ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2181:1: ( rule__Operation__Group_3_0__1__Impl )
            // InternalArchitecture.g:2182:2: rule__Operation__Group_3_0__1__Impl
=======
            // InternalArchitecture.g:2129:1: ( rule__Operation__Group_3_0__1__Impl )
            // InternalArchitecture.g:2130:2: rule__Operation__Group_3_0__1__Impl
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_0__1"


    // $ANTLR start "rule__Operation__Group_3_0__1__Impl"
<<<<<<< HEAD
    // InternalArchitecture.g:2188:1: rule__Operation__Group_3_0__1__Impl : ( ',' ) ;
=======
    // InternalArchitecture.g:2136:1: rule__Operation__Group_3_0__1__Impl : ( ',' ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2192:1: ( ( ',' ) )
            // InternalArchitecture.g:2193:1: ( ',' )
            {
            // InternalArchitecture.g:2193:1: ( ',' )
            // InternalArchitecture.g:2194:2: ','
=======
            // InternalArchitecture.g:2140:1: ( ( ',' ) )
            // InternalArchitecture.g:2141:1: ( ',' )
            {
            // InternalArchitecture.g:2141:1: ( ',' )
            // InternalArchitecture.g:2142:2: ','
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_3_0_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getCommaKeyword_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_3_0__1__Impl"


    // $ANTLR start "rule__Model__PackageAssignment"
<<<<<<< HEAD
    // InternalArchitecture.g:2204:1: rule__Model__PackageAssignment : ( ruleDomainDeclaration ) ;
=======
    // InternalArchitecture.g:2152:1: rule__Model__PackageAssignment : ( ruleDomainDeclaration ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2208:1: ( ( ruleDomainDeclaration ) )
            // InternalArchitecture.g:2209:2: ( ruleDomainDeclaration )
            {
            // InternalArchitecture.g:2209:2: ( ruleDomainDeclaration )
            // InternalArchitecture.g:2210:3: ruleDomainDeclaration
=======
            // InternalArchitecture.g:2156:1: ( ( ruleDomainDeclaration ) )
            // InternalArchitecture.g:2157:2: ( ruleDomainDeclaration )
            {
            // InternalArchitecture.g:2157:2: ( ruleDomainDeclaration )
            // InternalArchitecture.g:2158:3: ruleDomainDeclaration
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageDomainDeclarationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleDomainDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getPackageDomainDeclarationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PackageAssignment"


    // $ANTLR start "rule__DomainDeclaration__NameAssignment_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2219:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
=======
    // InternalArchitecture.g:2167:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2223:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:2224:2: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:2224:2: ( ruleQualifiedName )
            // InternalArchitecture.g:2225:3: ruleQualifiedName
=======
            // InternalArchitecture.g:2171:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:2172:2: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:2172:2: ( ruleQualifiedName )
            // InternalArchitecture.g:2173:3: ruleQualifiedName
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__NameAssignment_1"


    // $ANTLR start "rule__DomainDeclaration__ElementsAssignment_3"
<<<<<<< HEAD
    // InternalArchitecture.g:2234:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractModel ) ;
=======
    // InternalArchitecture.g:2182:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractModel ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2238:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:2239:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:2239:2: ( ruleAbstractModel )
            // InternalArchitecture.g:2240:3: ruleAbstractModel
=======
            // InternalArchitecture.g:2186:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:2187:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:2187:2: ( ruleAbstractModel )
            // InternalArchitecture.g:2188:3: ruleAbstractModel
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getElementsAbstractModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDomainDeclarationAccess().getElementsAbstractModelParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__AbstractModel__ImpAssignment_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2249:1: rule__AbstractModel__ImpAssignment_0 : ( ruleImport ) ;
=======
    // InternalArchitecture.g:2197:1: rule__AbstractModel__ImpAssignment_0 : ( ruleImport ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__AbstractModel__ImpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2253:1: ( ( ruleImport ) )
            // InternalArchitecture.g:2254:2: ( ruleImport )
            {
            // InternalArchitecture.g:2254:2: ( ruleImport )
            // InternalArchitecture.g:2255:3: ruleImport
=======
            // InternalArchitecture.g:2201:1: ( ( ruleImport ) )
            // InternalArchitecture.g:2202:2: ( ruleImport )
            {
            // InternalArchitecture.g:2202:2: ( ruleImport )
            // InternalArchitecture.g:2203:3: ruleImport
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImpImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getImpImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__ImpAssignment_0"


    // $ANTLR start "rule__AbstractModel__CompAssignment_1_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2264:1: rule__AbstractModel__CompAssignment_1_0 : ( ruleComponent ) ;
=======
    // InternalArchitecture.g:2212:1: rule__AbstractModel__CompAssignment_1_0 : ( ruleComponent ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__AbstractModel__CompAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2268:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:2269:2: ( ruleComponent )
            {
            // InternalArchitecture.g:2269:2: ( ruleComponent )
            // InternalArchitecture.g:2270:3: ruleComponent
=======
            // InternalArchitecture.g:2216:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:2217:2: ( ruleComponent )
            {
            // InternalArchitecture.g:2217:2: ( ruleComponent )
            // InternalArchitecture.g:2218:3: ruleComponent
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__CompAssignment_1_0"


    // $ANTLR start "rule__AbstractModel__ArchAssignment_1_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2279:1: rule__AbstractModel__ArchAssignment_1_1 : ( ruleArchitecture ) ;
=======
    // InternalArchitecture.g:2227:1: rule__AbstractModel__ArchAssignment_1_1 : ( ruleArchitecture ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__AbstractModel__ArchAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2283:1: ( ( ruleArchitecture ) )
            // InternalArchitecture.g:2284:2: ( ruleArchitecture )
            {
            // InternalArchitecture.g:2284:2: ( ruleArchitecture )
            // InternalArchitecture.g:2285:3: ruleArchitecture
=======
            // InternalArchitecture.g:2231:1: ( ( ruleArchitecture ) )
            // InternalArchitecture.g:2232:2: ( ruleArchitecture )
            {
            // InternalArchitecture.g:2232:2: ( ruleArchitecture )
            // InternalArchitecture.g:2233:3: ruleArchitecture
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getArchArchitectureParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArchitecture();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getArchArchitectureParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__ArchAssignment_1_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2294:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
=======
    // InternalArchitecture.g:2242:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2298:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:2299:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:2299:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:2300:3: ruleQualifiedNameWithWildcard
=======
            // InternalArchitecture.g:2246:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:2247:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:2247:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:2248:3: ruleQualifiedNameWithWildcard
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2309:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalArchitecture.g:2257:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2313:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2314:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2314:2: ( RULE_ID )
            // InternalArchitecture.g:2315:3: RULE_ID
=======
            // InternalArchitecture.g:2261:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2262:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2262:2: ( RULE_ID )
            // InternalArchitecture.g:2263:3: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_1"


    // $ANTLR start "rule__Component__OpsAssignment_5_0_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2324:1: rule__Component__OpsAssignment_5_0_0 : ( ( RULE_ID ) ) ;
=======
    // InternalArchitecture.g:2272:1: rule__Component__OpsAssignment_5_0_0 : ( ( RULE_ID ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Component__OpsAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2328:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2329:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2329:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2330:3: ( RULE_ID )
=======
            // InternalArchitecture.g:2276:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2277:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2277:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2278:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_0_0_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2331:3: ( RULE_ID )
            // InternalArchitecture.g:2332:4: RULE_ID
=======
            // InternalArchitecture.g:2279:3: ( RULE_ID )
            // InternalArchitecture.g:2280:4: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationIDTerminalRuleCall_5_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsOperationIDTerminalRuleCall_5_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__OpsAssignment_5_0_0"


    // $ANTLR start "rule__Component__OpsAssignment_5_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2343:1: rule__Component__OpsAssignment_5_1 : ( ( RULE_ID ) ) ;
=======
    // InternalArchitecture.g:2291:1: rule__Component__OpsAssignment_5_1 : ( ( RULE_ID ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Component__OpsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2347:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2348:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2348:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2349:3: ( RULE_ID )
=======
            // InternalArchitecture.g:2295:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2296:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2296:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2297:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_1_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2350:3: ( RULE_ID )
            // InternalArchitecture.g:2351:4: RULE_ID
=======
            // InternalArchitecture.g:2298:3: ( RULE_ID )
            // InternalArchitecture.g:2299:4: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsOperationIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__OpsAssignment_5_1"


    // $ANTLR start "rule__Component__OpsReqAssignment_9_0_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2362:1: rule__Component__OpsReqAssignment_9_0_0 : ( ( RULE_ID ) ) ;
=======
    // InternalArchitecture.g:2310:1: rule__Component__OpsReqAssignment_9_0_0 : ( ( RULE_ID ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Component__OpsReqAssignment_9_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2366:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2367:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2367:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2368:3: ( RULE_ID )
=======
            // InternalArchitecture.g:2314:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2315:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2315:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2316:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqOperationCrossReference_9_0_0_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2369:3: ( RULE_ID )
            // InternalArchitecture.g:2370:4: RULE_ID
=======
            // InternalArchitecture.g:2317:3: ( RULE_ID )
            // InternalArchitecture.g:2318:4: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqOperationIDTerminalRuleCall_9_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsReqOperationIDTerminalRuleCall_9_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsReqOperationCrossReference_9_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__OpsReqAssignment_9_0_0"


    // $ANTLR start "rule__Component__OpsReqAssignment_9_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2381:1: rule__Component__OpsReqAssignment_9_1 : ( ( RULE_ID ) ) ;
=======
    // InternalArchitecture.g:2329:1: rule__Component__OpsReqAssignment_9_1 : ( ( RULE_ID ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Component__OpsReqAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2385:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2386:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2386:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2387:3: ( RULE_ID )
=======
            // InternalArchitecture.g:2333:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2334:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2334:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2335:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqOperationCrossReference_9_1_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2388:3: ( RULE_ID )
            // InternalArchitecture.g:2389:4: RULE_ID
=======
            // InternalArchitecture.g:2336:3: ( RULE_ID )
            // InternalArchitecture.g:2337:4: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqOperationIDTerminalRuleCall_9_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsReqOperationIDTerminalRuleCall_9_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOpsReqOperationCrossReference_9_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__OpsReqAssignment_9_1"


    // $ANTLR start "rule__Component__OperationsAssignment_11_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2400:1: rule__Component__OperationsAssignment_11_0 : ( ruleOperation ) ;
=======
    // InternalArchitecture.g:2348:1: rule__Component__OperationsAssignment_11_0 : ( ruleOperation ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Component__OperationsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2404:1: ( ( ruleOperation ) )
            // InternalArchitecture.g:2405:2: ( ruleOperation )
            {
            // InternalArchitecture.g:2405:2: ( ruleOperation )
            // InternalArchitecture.g:2406:3: ruleOperation
=======
            // InternalArchitecture.g:2352:1: ( ( ruleOperation ) )
            // InternalArchitecture.g:2353:2: ( ruleOperation )
            {
            // InternalArchitecture.g:2353:2: ( ruleOperation )
            // InternalArchitecture.g:2354:3: ruleOperation
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOperationsOperationParserRuleCall_11_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOperationsOperationParserRuleCall_11_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__OperationsAssignment_11_0"


    // $ANTLR start "rule__Architecture__VarsAssignment_2"
<<<<<<< HEAD
    // InternalArchitecture.g:2415:1: rule__Architecture__VarsAssignment_2 : ( ruleVariable ) ;
=======
    // InternalArchitecture.g:2363:1: rule__Architecture__VarsAssignment_2 : ( ruleVariable ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Architecture__VarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2419:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2420:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2420:2: ( ruleVariable )
            // InternalArchitecture.g:2421:3: ruleVariable
=======
            // InternalArchitecture.g:2367:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2368:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2368:2: ( ruleVariable )
            // InternalArchitecture.g:2369:3: ruleVariable
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getVarsVariableParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getVarsVariableParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__VarsAssignment_2"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__ReceiverAssignment_3_1"
    // InternalArchitecture.g:2430:1: rule__Architecture__ReceiverAssignment_3_1 : ( ruleCall ) ;
    public final void rule__Architecture__ReceiverAssignment_3_1() throws RecognitionException {
=======
    // $ANTLR start "rule__Architecture__BindAssignment_3"
    // InternalArchitecture.g:2378:1: rule__Architecture__BindAssignment_3 : ( ruleBinding ) ;
    public final void rule__Architecture__BindAssignment_3() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2434:1: ( ( ruleCall ) )
            // InternalArchitecture.g:2435:2: ( ruleCall )
            {
            // InternalArchitecture.g:2435:2: ( ruleCall )
            // InternalArchitecture.g:2436:3: ruleCall
=======
            // InternalArchitecture.g:2382:1: ( ( ruleBinding ) )
            // InternalArchitecture.g:2383:2: ( ruleBinding )
            {
            // InternalArchitecture.g:2383:2: ( ruleBinding )
            // InternalArchitecture.g:2384:3: ruleBinding
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getBindBindingParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getBindBindingParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Architecture__BindAssignment_3"


<<<<<<< HEAD
    // $ANTLR start "rule__Architecture__ProviderAssignment_3_3"
    // InternalArchitecture.g:2445:1: rule__Architecture__ProviderAssignment_3_3 : ( ruleCall ) ;
    public final void rule__Architecture__ProviderAssignment_3_3() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__ReceiverAssignment_1"
    // InternalArchitecture.g:2393:1: rule__Binding__ReceiverAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ReceiverAssignment_1() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2449:1: ( ( ruleCall ) )
            // InternalArchitecture.g:2450:2: ( ruleCall )
            {
            // InternalArchitecture.g:2450:2: ( ruleCall )
            // InternalArchitecture.g:2451:3: ruleCall
=======
            // InternalArchitecture.g:2397:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2398:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2398:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2399:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getReceiverVariableCrossReference_1_0()); 
            }
            // InternalArchitecture.g:2400:3: ( RULE_ID )
            // InternalArchitecture.g:2401:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getReceiverVariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getReceiverVariableIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getReceiverVariableCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ReceiverAssignment_1"


    // $ANTLR start "rule__Binding__RecMemberAssignment_3"
    // InternalArchitecture.g:2412:1: rule__Binding__RecMemberAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__RecMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2416:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2417:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2417:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2418:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getRecMemberOperationCrossReference_3_0()); 
            }
            // InternalArchitecture.g:2419:3: ( RULE_ID )
            // InternalArchitecture.g:2420:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getRecMemberOperationIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getRecMemberOperationIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getRecMemberOperationCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__RecMemberAssignment_3"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__ReceiverAssignment_0"
    // InternalArchitecture.g:2460:1: rule__Call__ReceiverAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Call__ReceiverAssignment_0() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__ProviderAssignment_5"
    // InternalArchitecture.g:2431:1: rule__Binding__ProviderAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ProviderAssignment_5() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2464:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2465:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2465:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2466:3: ( RULE_ID )
=======
            // InternalArchitecture.g:2435:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2436:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2436:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2437:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProviderVariableCrossReference_5_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2467:3: ( RULE_ID )
            // InternalArchitecture.g:2468:4: RULE_ID
=======
            // InternalArchitecture.g:2438:3: ( RULE_ID )
            // InternalArchitecture.g:2439:4: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProviderVariableIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProviderVariableIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProviderVariableCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ProviderAssignment_5"


<<<<<<< HEAD
    // $ANTLR start "rule__Call__MemberAssignment_2"
    // InternalArchitecture.g:2479:1: rule__Call__MemberAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Call__MemberAssignment_2() throws RecognitionException {
=======
    // $ANTLR start "rule__Binding__ProMemberAssignment_7"
    // InternalArchitecture.g:2450:1: rule__Binding__ProMemberAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ProMemberAssignment_7() throws RecognitionException {
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2483:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2484:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2484:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2485:3: ( RULE_ID )
=======
            // InternalArchitecture.g:2454:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2455:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2455:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2456:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProMemberOperationCrossReference_7_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2486:3: ( RULE_ID )
            // InternalArchitecture.g:2487:4: RULE_ID
=======
            // InternalArchitecture.g:2457:3: ( RULE_ID )
            // InternalArchitecture.g:2458:4: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProMemberOperationIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProMemberOperationIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProMemberOperationCrossReference_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Binding__ProMemberAssignment_7"


    // $ANTLR start "rule__Variable__NameAssignment_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2498:1: rule__Variable__NameAssignment_0 : ( rulePID ) ;
=======
    // InternalArchitecture.g:2469:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2502:1: ( ( rulePID ) )
            // InternalArchitecture.g:2503:2: ( rulePID )
            {
            // InternalArchitecture.g:2503:2: ( rulePID )
            // InternalArchitecture.g:2504:3: rulePID
=======
            // InternalArchitecture.g:2473:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2474:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2474:2: ( RULE_ID )
            // InternalArchitecture.g:2475:3: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNamePIDParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNamePIDParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_0"


    // $ANTLR start "rule__Variable__TypeAssignment_2"
<<<<<<< HEAD
    // InternalArchitecture.g:2513:1: rule__Variable__TypeAssignment_2 : ( ruleAtomicType ) ;
=======
    // InternalArchitecture.g:2484:1: rule__Variable__TypeAssignment_2 : ( ruleAtomicType ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2517:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2518:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2518:2: ( ruleAtomicType )
            // InternalArchitecture.g:2519:3: ruleAtomicType
=======
            // InternalArchitecture.g:2488:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2489:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2489:2: ( ruleAtomicType )
            // InternalArchitecture.g:2490:3: ruleAtomicType
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAtomicTypeParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getTypeAtomicTypeParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_2"


    // $ANTLR start "rule__Operation__NameAssignment_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2528:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
=======
    // InternalArchitecture.g:2499:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2532:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2533:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2533:2: ( RULE_ID )
            // InternalArchitecture.g:2534:3: RULE_ID
=======
            // InternalArchitecture.g:2503:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2504:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2504:2: ( RULE_ID )
            // InternalArchitecture.g:2505:3: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_1"


    // $ANTLR start "rule__Operation__ArgAssignment_3_0_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2543:1: rule__Operation__ArgAssignment_3_0_0 : ( ruleVariable ) ;
=======
    // InternalArchitecture.g:2514:1: rule__Operation__ArgAssignment_3_0_0 : ( ruleVariable ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__ArgAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2547:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2548:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2548:2: ( ruleVariable )
            // InternalArchitecture.g:2549:3: ruleVariable
=======
            // InternalArchitecture.g:2518:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2519:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2519:2: ( ruleVariable )
            // InternalArchitecture.g:2520:3: ruleVariable
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ArgAssignment_3_0_0"


    // $ANTLR start "rule__Operation__ArgAssignment_3_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2558:1: rule__Operation__ArgAssignment_3_1 : ( ruleVariable ) ;
=======
    // InternalArchitecture.g:2529:1: rule__Operation__ArgAssignment_3_1 : ( ruleVariable ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__ArgAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2562:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2563:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2563:2: ( ruleVariable )
            // InternalArchitecture.g:2564:3: ruleVariable
=======
            // InternalArchitecture.g:2533:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2534:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2534:2: ( ruleVariable )
            // InternalArchitecture.g:2535:3: ruleVariable
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ArgAssignment_3_1"


    // $ANTLR start "rule__Operation__TypeAssignment_6"
<<<<<<< HEAD
    // InternalArchitecture.g:2573:1: rule__Operation__TypeAssignment_6 : ( ruleAtomicType ) ;
=======
    // InternalArchitecture.g:2544:1: rule__Operation__TypeAssignment_6 : ( ruleAtomicType ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__Operation__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2577:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2578:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2578:2: ( ruleAtomicType )
            // InternalArchitecture.g:2579:3: ruleAtomicType
=======
            // InternalArchitecture.g:2548:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2549:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2549:2: ( ruleAtomicType )
            // InternalArchitecture.g:2550:3: ruleAtomicType
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeAtomicTypeParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAtomicType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeAtomicTypeParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeAssignment_6"


    // $ANTLR start "rule__AtomicType__AtomTypeAssignment_0"
<<<<<<< HEAD
    // InternalArchitecture.g:2588:1: rule__AtomicType__AtomTypeAssignment_0 : ( ruleType ) ;
=======
    // InternalArchitecture.g:2559:1: rule__AtomicType__AtomTypeAssignment_0 : ( ruleType ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__AtomicType__AtomTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2592:1: ( ( ruleType ) )
            // InternalArchitecture.g:2593:2: ( ruleType )
            {
            // InternalArchitecture.g:2593:2: ( ruleType )
            // InternalArchitecture.g:2594:3: ruleType
=======
            // InternalArchitecture.g:2563:1: ( ( ruleType ) )
            // InternalArchitecture.g:2564:2: ( ruleType )
            {
            // InternalArchitecture.g:2564:2: ( ruleType )
            // InternalArchitecture.g:2565:3: ruleType
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getAtomTypeTypeEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getAtomTypeTypeEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicType__AtomTypeAssignment_0"


    // $ANTLR start "rule__AtomicType__CompTypeAssignment_1"
<<<<<<< HEAD
    // InternalArchitecture.g:2603:1: rule__AtomicType__CompTypeAssignment_1 : ( ( RULE_ID ) ) ;
=======
    // InternalArchitecture.g:2574:1: rule__AtomicType__CompTypeAssignment_1 : ( ( RULE_ID ) ) ;
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    public final void rule__AtomicType__CompTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
<<<<<<< HEAD
            // InternalArchitecture.g:2607:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2608:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2608:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2609:3: ( RULE_ID )
=======
            // InternalArchitecture.g:2578:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2579:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2579:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2580:3: ( RULE_ID )
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getCompTypeComponentCrossReference_1_0()); 
            }
<<<<<<< HEAD
            // InternalArchitecture.g:2610:3: ( RULE_ID )
            // InternalArchitecture.g:2611:4: RULE_ID
=======
            // InternalArchitecture.g:2581:3: ( RULE_ID )
            // InternalArchitecture.g:2582:4: RULE_ID
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getCompTypeComponentIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getCompTypeComponentIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getCompTypeComponentCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicType__CompTypeAssignment_1"

    // $ANTLR start synpred2_InternalArchitecture
    public final void synpred2_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:407:5: ( rule__AbstractModel__CompAssignment_1_0 )
        // InternalArchitecture.g:407:5: rule__AbstractModel__CompAssignment_1_0
        {
        pushFollow(FOLLOW_2);
        rule__AbstractModel__CompAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalArchitecture

    // Delegated rules

    public final boolean synpred2_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA18 dfa18 = new DFA18(this);
<<<<<<< HEAD
    static final String dfa_1s = "\44\uffff";
    static final String dfa_2s = "\1\1\43\uffff";
    static final String dfa_3s = "\1\21\1\uffff\1\4\1\20\1\26\1\27\2\4\1\31\1\4\1\27\2\4\1\21\2\4\1\0\1\27\1\uffff\1\30\1\4\2\36\2\4\5\21\5\30\1\37";
    static final String dfa_4s = "\1\33\1\uffff\1\4\1\20\1\26\1\27\1\30\1\32\1\31\1\4\1\27\1\30\1\32\1\40\2\4\1\0\1\27\1\uffff\1\37\1\4\2\36\2\16\5\40\6\37";
    static final String dfa_5s = "\1\uffff\1\2\20\uffff\1\1\21\uffff";
    static final String dfa_6s = "\20\uffff\1\0\23\uffff}>";
=======
    static final String dfa_1s = "\43\uffff";
    static final String dfa_2s = "\1\1\42\uffff";
    static final String dfa_3s = "\1\21\1\uffff\1\4\1\20\1\26\1\27\2\4\1\31\1\4\1\27\2\4\1\21\2\4\1\0\1\27\1\uffff\1\4\2\35\7\4\5\21\1\4";
    static final String dfa_4s = "\1\33\1\uffff\1\4\1\20\1\26\1\27\1\30\1\32\1\31\1\4\1\27\1\30\1\32\1\36\2\4\1\0\1\27\1\uffff\1\30\2\35\2\16\5\32\5\36\1\4";
    static final String dfa_5s = "\1\uffff\1\2\20\uffff\1\1\20\uffff";
    static final String dfa_6s = "\20\uffff\1\0\22\uffff}>";
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    static final String[] dfa_7s = {
            "\2\1\2\uffff\1\2\5\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\23\uffff\1\10",
            "\1\7\23\uffff\1\10\1\uffff\1\11",
            "\1\12",
            "\1\7",
            "\1\13",
            "\1\14\23\uffff\1\15",
            "\1\14\23\uffff\1\15\1\uffff\1\16",
<<<<<<< HEAD
            "\1\20\16\uffff\1\17",
=======
            "\1\20\14\uffff\1\17",
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            "\1\14",
            "\1\21",
            "\1\uffff",
            "\1\23",
            "",
            "\1\25\6\uffff\1\24",
            "\1\26",
            "\1\27",
<<<<<<< HEAD
            "\1\30",
            "\1\35\6\uffff\1\31\1\32\1\33\1\34",
            "\1\42\6\uffff\1\36\1\37\1\40\1\41",
            "\1\20\16\uffff\1\17",
            "\1\20\16\uffff\1\17",
            "\1\20\16\uffff\1\17",
            "\1\20\16\uffff\1\17",
            "\1\20\16\uffff\1\17",
            "\1\25\1\uffff\1\43\4\uffff\1\24",
            "\1\25\1\uffff\1\43\4\uffff\1\24",
            "\1\25\1\uffff\1\43\4\uffff\1\24",
            "\1\25\1\uffff\1\43\4\uffff\1\24",
            "\1\25\1\uffff\1\43\4\uffff\1\24",
=======
            "\1\34\6\uffff\1\30\1\31\1\32\1\33",
            "\1\41\6\uffff\1\35\1\36\1\37\1\40",
            "\1\24\23\uffff\1\25\1\uffff\1\42",
            "\1\24\23\uffff\1\25\1\uffff\1\42",
            "\1\24\23\uffff\1\25\1\uffff\1\42",
            "\1\24\23\uffff\1\25\1\uffff\1\42",
            "\1\24\23\uffff\1\25\1\uffff\1\42",
            "\1\20\14\uffff\1\17",
            "\1\20\14\uffff\1\17",
            "\1\20\14\uffff\1\17",
            "\1\20\14\uffff\1\17",
            "\1\20\14\uffff\1\17",
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
            "\1\24"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 407:4: ( rule__AbstractModel__CompAssignment_1_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_16 = input.LA(1);

                         
                        int index2_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalArchitecture()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index2_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
<<<<<<< HEAD
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\4\uffff\5\12\2\uffff";
    static final String dfa_10s = "\1\37\1\4\1\36\1\4\5\30\2\uffff";
    static final String dfa_11s = "\1\37\1\4\1\36\1\16\5\37\2\uffff";
    static final String dfa_12s = "\11\uffff\1\1\1\2";
    static final String dfa_13s = "\13\uffff}>";
=======
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\5\11\2\uffff";
    static final String dfa_10s = "\1\4\1\35\6\4\2\uffff";
    static final String dfa_11s = "\1\4\1\35\1\16\5\32\2\uffff";
    static final String dfa_12s = "\10\uffff\1\1\1\2";
    static final String dfa_13s = "\12\uffff}>";
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\10\6\uffff\1\4\1\5\1\6\1\7",
            "\1\12\1\uffff\1\11\4\uffff\1\12",
            "\1\12\1\uffff\1\11\4\uffff\1\12",
            "\1\12\1\uffff\1\11\4\uffff\1\12",
            "\1\12\1\uffff\1\11\4\uffff\1\12",
            "\1\12\1\uffff\1\11\4\uffff\1\12",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
<<<<<<< HEAD
            return "()* loopback of 2115:2: ( rule__Operation__Group_3_0__0 )*";
=======
            return "()* loopback of 2063:2: ( rule__Operation__Group_3_0__0 )*";
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008260000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000008240002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000008240000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
<<<<<<< HEAD
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000007810L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
=======
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000007810L});
>>>>>>> c52701ca9356ad092567bfcbb2bbade96af0a78c

}