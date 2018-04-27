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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'Void'", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "'providedServices'", "'('", "')'", "'requeredServices'", "','", "'ArchitectureDefinition'", "'def'", "'bind'", "'-'", "':'"
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

                if ( (LA1_0==16) ) {
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


    // $ANTLR start "entryRuleOperation"
    // InternalArchitecture.g:304:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalArchitecture.g:305:1: ( ruleOperation EOF )
            // InternalArchitecture.g:306:1: ruleOperation EOF
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
    // InternalArchitecture.g:313:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:317:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalArchitecture.g:318:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalArchitecture.g:318:2: ( ( rule__Operation__Group__0 ) )
            // InternalArchitecture.g:319:3: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // InternalArchitecture.g:320:3: ( rule__Operation__Group__0 )
            // InternalArchitecture.g:320:4: rule__Operation__Group__0
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
    // InternalArchitecture.g:329:1: entryRuleAtomicType : ruleAtomicType EOF ;
    public final void entryRuleAtomicType() throws RecognitionException {
        try {
            // InternalArchitecture.g:330:1: ( ruleAtomicType EOF )
            // InternalArchitecture.g:331:1: ruleAtomicType EOF
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
    // InternalArchitecture.g:338:1: ruleAtomicType : ( ( rule__AtomicType__Alternatives ) ) ;
    public final void ruleAtomicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:342:2: ( ( ( rule__AtomicType__Alternatives ) ) )
            // InternalArchitecture.g:343:2: ( ( rule__AtomicType__Alternatives ) )
            {
            // InternalArchitecture.g:343:2: ( ( rule__AtomicType__Alternatives ) )
            // InternalArchitecture.g:344:3: ( rule__AtomicType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:345:3: ( rule__AtomicType__Alternatives )
            // InternalArchitecture.g:345:4: rule__AtomicType__Alternatives
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
    // InternalArchitecture.g:354:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:358:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalArchitecture.g:359:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalArchitecture.g:359:2: ( ( rule__Type__Alternatives ) )
            // InternalArchitecture.g:360:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:361:3: ( rule__Type__Alternatives )
            // InternalArchitecture.g:361:4: rule__Type__Alternatives
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
    // InternalArchitecture.g:369:1: rule__AbstractModel__Alternatives_1 : ( ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) ) | ( ( rule__AbstractModel__ArchAssignment_1_1 ) ) );
    public final void rule__AbstractModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:373:1: ( ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) ) | ( ( rule__AbstractModel__ArchAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
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
                    // InternalArchitecture.g:374:2: ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) )
                    {
                    // InternalArchitecture.g:374:2: ( ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* ) )
                    // InternalArchitecture.g:375:3: ( ( rule__AbstractModel__CompAssignment_1_0 ) ) ( ( rule__AbstractModel__CompAssignment_1_0 )* )
                    {
                    // InternalArchitecture.g:375:3: ( ( rule__AbstractModel__CompAssignment_1_0 ) )
                    // InternalArchitecture.g:376:4: ( rule__AbstractModel__CompAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getCompAssignment_1_0()); 
                    }
                    // InternalArchitecture.g:377:4: ( rule__AbstractModel__CompAssignment_1_0 )
                    // InternalArchitecture.g:377:5: rule__AbstractModel__CompAssignment_1_0
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

                    // InternalArchitecture.g:380:3: ( ( rule__AbstractModel__CompAssignment_1_0 )* )
                    // InternalArchitecture.g:381:4: ( rule__AbstractModel__CompAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getCompAssignment_1_0()); 
                    }
                    // InternalArchitecture.g:382:4: ( rule__AbstractModel__CompAssignment_1_0 )*
                    loop2:
                    do {
                        int alt2=2;
                        alt2 = dfa2.predict(input);
                        switch (alt2) {
                    	case 1 :
                    	    // InternalArchitecture.g:382:5: rule__AbstractModel__CompAssignment_1_0
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
                    // InternalArchitecture.g:387:2: ( ( rule__AbstractModel__ArchAssignment_1_1 ) )
                    {
                    // InternalArchitecture.g:387:2: ( ( rule__AbstractModel__ArchAssignment_1_1 ) )
                    // InternalArchitecture.g:388:3: ( rule__AbstractModel__ArchAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getArchAssignment_1_1()); 
                    }
                    // InternalArchitecture.g:389:3: ( rule__AbstractModel__ArchAssignment_1_1 )
                    // InternalArchitecture.g:389:4: rule__AbstractModel__ArchAssignment_1_1
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
    // InternalArchitecture.g:397:1: rule__AtomicType__Alternatives : ( ( ( rule__AtomicType__AtomTypeAssignment_0 ) ) | ( ( rule__AtomicType__CompTypeAssignment_1 ) ) );
    public final void rule__AtomicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:401:1: ( ( ( rule__AtomicType__AtomTypeAssignment_0 ) ) | ( ( rule__AtomicType__CompTypeAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=11 && LA4_0<=15)) ) {
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
                    // InternalArchitecture.g:402:2: ( ( rule__AtomicType__AtomTypeAssignment_0 ) )
                    {
                    // InternalArchitecture.g:402:2: ( ( rule__AtomicType__AtomTypeAssignment_0 ) )
                    // InternalArchitecture.g:403:3: ( rule__AtomicType__AtomTypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicTypeAccess().getAtomTypeAssignment_0()); 
                    }
                    // InternalArchitecture.g:404:3: ( rule__AtomicType__AtomTypeAssignment_0 )
                    // InternalArchitecture.g:404:4: rule__AtomicType__AtomTypeAssignment_0
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
                    // InternalArchitecture.g:408:2: ( ( rule__AtomicType__CompTypeAssignment_1 ) )
                    {
                    // InternalArchitecture.g:408:2: ( ( rule__AtomicType__CompTypeAssignment_1 ) )
                    // InternalArchitecture.g:409:3: ( rule__AtomicType__CompTypeAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicTypeAccess().getCompTypeAssignment_1()); 
                    }
                    // InternalArchitecture.g:410:3: ( rule__AtomicType__CompTypeAssignment_1 )
                    // InternalArchitecture.g:410:4: rule__AtomicType__CompTypeAssignment_1
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
    // InternalArchitecture.g:418:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Void' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:422:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) | ( ( 'Void' ) ) )
            int alt5=5;
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
            case 15:
                {
                alt5=5;
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
                    // InternalArchitecture.g:423:2: ( ( 'INT' ) )
                    {
                    // InternalArchitecture.g:423:2: ( ( 'INT' ) )
                    // InternalArchitecture.g:424:3: ( 'INT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalArchitecture.g:425:3: ( 'INT' )
                    // InternalArchitecture.g:425:4: 'INT'
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
                    // InternalArchitecture.g:429:2: ( ( 'STRING' ) )
                    {
                    // InternalArchitecture.g:429:2: ( ( 'STRING' ) )
                    // InternalArchitecture.g:430:3: ( 'STRING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalArchitecture.g:431:3: ( 'STRING' )
                    // InternalArchitecture.g:431:4: 'STRING'
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
                    // InternalArchitecture.g:435:2: ( ( 'Boolean' ) )
                    {
                    // InternalArchitecture.g:435:2: ( ( 'Boolean' ) )
                    // InternalArchitecture.g:436:3: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // InternalArchitecture.g:437:3: ( 'Boolean' )
                    // InternalArchitecture.g:437:4: 'Boolean'
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
                    // InternalArchitecture.g:441:2: ( ( 'Double' ) )
                    {
                    // InternalArchitecture.g:441:2: ( ( 'Double' ) )
                    // InternalArchitecture.g:442:3: ( 'Double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }
                    // InternalArchitecture.g:443:3: ( 'Double' )
                    // InternalArchitecture.g:443:4: 'Double'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalArchitecture.g:447:2: ( ( 'Void' ) )
                    {
                    // InternalArchitecture.g:447:2: ( ( 'Void' ) )
                    // InternalArchitecture.g:448:3: ( 'Void' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getVoidEnumLiteralDeclaration_4()); 
                    }
                    // InternalArchitecture.g:449:3: ( 'Void' )
                    // InternalArchitecture.g:449:4: 'Void'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getVoidEnumLiteralDeclaration_4()); 
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
    // InternalArchitecture.g:457:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:461:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalArchitecture.g:462:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
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
    // InternalArchitecture.g:469:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:473:1: ( ( 'domain' ) )
            // InternalArchitecture.g:474:1: ( 'domain' )
            {
            // InternalArchitecture.g:474:1: ( 'domain' )
            // InternalArchitecture.g:475:2: 'domain'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:484:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:488:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalArchitecture.g:489:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
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
    // InternalArchitecture.g:496:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:500:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalArchitecture.g:501:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:501:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalArchitecture.g:502:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:503:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalArchitecture.g:503:3: rule__DomainDeclaration__NameAssignment_1
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
    // InternalArchitecture.g:511:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:515:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalArchitecture.g:516:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
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
    // InternalArchitecture.g:523:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:527:1: ( ( '{' ) )
            // InternalArchitecture.g:528:1: ( '{' )
            {
            // InternalArchitecture.g:528:1: ( '{' )
            // InternalArchitecture.g:529:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:538:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:542:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalArchitecture.g:543:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
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
    // InternalArchitecture.g:550:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:554:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalArchitecture.g:555:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalArchitecture.g:555:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalArchitecture.g:556:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            }
            // InternalArchitecture.g:557:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19||LA6_0==22||LA6_0==28) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:557:3: rule__DomainDeclaration__ElementsAssignment_3
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
    // InternalArchitecture.g:565:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:569:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalArchitecture.g:570:2: rule__DomainDeclaration__Group__4__Impl
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
    // InternalArchitecture.g:576:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:580:1: ( ( '}' ) )
            // InternalArchitecture.g:581:1: ( '}' )
            {
            // InternalArchitecture.g:581:1: ( '}' )
            // InternalArchitecture.g:582:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:592:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:596:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalArchitecture.g:597:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
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
    // InternalArchitecture.g:604:1: rule__AbstractModel__Group__0__Impl : ( ( rule__AbstractModel__ImpAssignment_0 )* ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:608:1: ( ( ( rule__AbstractModel__ImpAssignment_0 )* ) )
            // InternalArchitecture.g:609:1: ( ( rule__AbstractModel__ImpAssignment_0 )* )
            {
            // InternalArchitecture.g:609:1: ( ( rule__AbstractModel__ImpAssignment_0 )* )
            // InternalArchitecture.g:610:2: ( rule__AbstractModel__ImpAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImpAssignment_0()); 
            }
            // InternalArchitecture.g:611:2: ( rule__AbstractModel__ImpAssignment_0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArchitecture.g:611:3: rule__AbstractModel__ImpAssignment_0
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
    // InternalArchitecture.g:619:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:623:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalArchitecture.g:624:2: rule__AbstractModel__Group__1__Impl
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
    // InternalArchitecture.g:630:1: rule__AbstractModel__Group__1__Impl : ( ( rule__AbstractModel__Alternatives_1 ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:634:1: ( ( ( rule__AbstractModel__Alternatives_1 ) ) )
            // InternalArchitecture.g:635:1: ( ( rule__AbstractModel__Alternatives_1 ) )
            {
            // InternalArchitecture.g:635:1: ( ( rule__AbstractModel__Alternatives_1 ) )
            // InternalArchitecture.g:636:2: ( rule__AbstractModel__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getAlternatives_1()); 
            }
            // InternalArchitecture.g:637:2: ( rule__AbstractModel__Alternatives_1 )
            // InternalArchitecture.g:637:3: rule__AbstractModel__Alternatives_1
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
    // InternalArchitecture.g:646:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:650:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArchitecture.g:651:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalArchitecture.g:658:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:662:1: ( ( 'import' ) )
            // InternalArchitecture.g:663:1: ( 'import' )
            {
            // InternalArchitecture.g:663:1: ( 'import' )
            // InternalArchitecture.g:664:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:673:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:677:1: ( rule__Import__Group__1__Impl )
            // InternalArchitecture.g:678:2: rule__Import__Group__1__Impl
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
    // InternalArchitecture.g:684:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:688:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalArchitecture.g:689:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalArchitecture.g:689:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalArchitecture.g:690:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalArchitecture.g:691:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalArchitecture.g:691:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalArchitecture.g:700:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:704:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalArchitecture.g:705:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalArchitecture.g:712:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:716:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:717:1: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:717:1: ( ruleQualifiedName )
            // InternalArchitecture.g:718:2: ruleQualifiedName
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
    // InternalArchitecture.g:727:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:731:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalArchitecture.g:732:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalArchitecture.g:738:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:742:1: ( ( ( '.*' )? ) )
            // InternalArchitecture.g:743:1: ( ( '.*' )? )
            {
            // InternalArchitecture.g:743:1: ( ( '.*' )? )
            // InternalArchitecture.g:744:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalArchitecture.g:745:2: ( '.*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalArchitecture.g:745:3: '.*'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

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
    // InternalArchitecture.g:754:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:758:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalArchitecture.g:759:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalArchitecture.g:766:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:770:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:771:1: ( RULE_ID )
            {
            // InternalArchitecture.g:771:1: ( RULE_ID )
            // InternalArchitecture.g:772:2: RULE_ID
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
    // InternalArchitecture.g:781:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:785:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalArchitecture.g:786:2: rule__QualifiedName__Group__1__Impl
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
    // InternalArchitecture.g:792:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:796:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalArchitecture.g:797:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalArchitecture.g:797:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalArchitecture.g:798:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalArchitecture.g:799:2: ( rule__QualifiedName__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArchitecture.g:799:3: rule__QualifiedName__Group_1__0
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
    // InternalArchitecture.g:808:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:812:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalArchitecture.g:813:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalArchitecture.g:820:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:824:1: ( ( '.' ) )
            // InternalArchitecture.g:825:1: ( '.' )
            {
            // InternalArchitecture.g:825:1: ( '.' )
            // InternalArchitecture.g:826:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:835:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:839:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalArchitecture.g:840:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalArchitecture.g:846:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:850:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:851:1: ( RULE_ID )
            {
            // InternalArchitecture.g:851:1: ( RULE_ID )
            // InternalArchitecture.g:852:2: RULE_ID
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
    // InternalArchitecture.g:862:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:866:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArchitecture.g:867:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalArchitecture.g:874:1: rule__Component__Group__0__Impl : ( 'Component:' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:878:1: ( ( 'Component:' ) )
            // InternalArchitecture.g:879:1: ( 'Component:' )
            {
            // InternalArchitecture.g:879:1: ( 'Component:' )
            // InternalArchitecture.g:880:2: 'Component:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:889:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:893:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArchitecture.g:894:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalArchitecture.g:901:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:905:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalArchitecture.g:906:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:906:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalArchitecture.g:907:2: ( rule__Component__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:908:2: ( rule__Component__NameAssignment_1 )
            // InternalArchitecture.g:908:3: rule__Component__NameAssignment_1
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
    // InternalArchitecture.g:916:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:920:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalArchitecture.g:921:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalArchitecture.g:928:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:932:1: ( ( '{' ) )
            // InternalArchitecture.g:933:1: ( '{' )
            {
            // InternalArchitecture.g:933:1: ( '{' )
            // InternalArchitecture.g:934:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:943:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:947:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalArchitecture.g:948:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalArchitecture.g:955:1: rule__Component__Group__3__Impl : ( 'providedServices' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:959:1: ( ( 'providedServices' ) )
            // InternalArchitecture.g:960:1: ( 'providedServices' )
            {
            // InternalArchitecture.g:960:1: ( 'providedServices' )
            // InternalArchitecture.g:961:2: 'providedServices'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getProvidedServicesKeyword_3()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:970:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:974:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalArchitecture.g:975:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalArchitecture.g:982:1: rule__Component__Group__4__Impl : ( '(' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:986:1: ( ( '(' ) )
            // InternalArchitecture.g:987:1: ( '(' )
            {
            // InternalArchitecture.g:987:1: ( '(' )
            // InternalArchitecture.g:988:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:997:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1001:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalArchitecture.g:1002:2: rule__Component__Group__5__Impl rule__Component__Group__6
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
    // InternalArchitecture.g:1009:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1013:1: ( ( ( rule__Component__Group_5__0 )* ) )
            // InternalArchitecture.g:1014:1: ( ( rule__Component__Group_5__0 )* )
            {
            // InternalArchitecture.g:1014:1: ( ( rule__Component__Group_5__0 )* )
            // InternalArchitecture.g:1015:2: ( rule__Component__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5()); 
            }
            // InternalArchitecture.g:1016:2: ( rule__Component__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:1016:3: rule__Component__Group_5__0
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
    // InternalArchitecture.g:1024:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1028:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalArchitecture.g:1029:2: rule__Component__Group__6__Impl rule__Component__Group__7
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
    // InternalArchitecture.g:1036:1: rule__Component__Group__6__Impl : ( ')' ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1040:1: ( ( ')' ) )
            // InternalArchitecture.g:1041:1: ( ')' )
            {
            // InternalArchitecture.g:1041:1: ( ')' )
            // InternalArchitecture.g:1042:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1051:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1055:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalArchitecture.g:1056:2: rule__Component__Group__7__Impl rule__Component__Group__8
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
    // InternalArchitecture.g:1063:1: rule__Component__Group__7__Impl : ( 'requeredServices' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1067:1: ( ( 'requeredServices' ) )
            // InternalArchitecture.g:1068:1: ( 'requeredServices' )
            {
            // InternalArchitecture.g:1068:1: ( 'requeredServices' )
            // InternalArchitecture.g:1069:2: 'requeredServices'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRequeredServicesKeyword_7()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1078:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1082:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalArchitecture.g:1083:2: rule__Component__Group__8__Impl rule__Component__Group__9
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
    // InternalArchitecture.g:1090:1: rule__Component__Group__8__Impl : ( '(' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1094:1: ( ( '(' ) )
            // InternalArchitecture.g:1095:1: ( '(' )
            {
            // InternalArchitecture.g:1095:1: ( '(' )
            // InternalArchitecture.g:1096:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_8()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1105:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1109:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalArchitecture.g:1110:2: rule__Component__Group__9__Impl rule__Component__Group__10
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
    // InternalArchitecture.g:1117:1: rule__Component__Group__9__Impl : ( ( rule__Component__Group_9__0 )* ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1121:1: ( ( ( rule__Component__Group_9__0 )* ) )
            // InternalArchitecture.g:1122:1: ( ( rule__Component__Group_9__0 )* )
            {
            // InternalArchitecture.g:1122:1: ( ( rule__Component__Group_9__0 )* )
            // InternalArchitecture.g:1123:2: ( rule__Component__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9()); 
            }
            // InternalArchitecture.g:1124:2: ( rule__Component__Group_9__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:1124:3: rule__Component__Group_9__0
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
    // InternalArchitecture.g:1132:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1136:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalArchitecture.g:1137:2: rule__Component__Group__10__Impl rule__Component__Group__11
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
    // InternalArchitecture.g:1144:1: rule__Component__Group__10__Impl : ( ')' ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1148:1: ( ( ')' ) )
            // InternalArchitecture.g:1149:1: ( ')' )
            {
            // InternalArchitecture.g:1149:1: ( ')' )
            // InternalArchitecture.g:1150:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_10()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1159:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1163:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalArchitecture.g:1164:2: rule__Component__Group__11__Impl rule__Component__Group__12
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
    // InternalArchitecture.g:1171:1: rule__Component__Group__11__Impl : ( ( rule__Component__Group_11__0 )* ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1175:1: ( ( ( rule__Component__Group_11__0 )* ) )
            // InternalArchitecture.g:1176:1: ( ( rule__Component__Group_11__0 )* )
            {
            // InternalArchitecture.g:1176:1: ( ( rule__Component__Group_11__0 )* )
            // InternalArchitecture.g:1177:2: ( rule__Component__Group_11__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_11()); 
            }
            // InternalArchitecture.g:1178:2: ( rule__Component__Group_11__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:1178:3: rule__Component__Group_11__0
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
    // InternalArchitecture.g:1186:1: rule__Component__Group__12 : rule__Component__Group__12__Impl ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1190:1: ( rule__Component__Group__12__Impl )
            // InternalArchitecture.g:1191:2: rule__Component__Group__12__Impl
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
    // InternalArchitecture.g:1197:1: rule__Component__Group__12__Impl : ( '}' ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1201:1: ( ( '}' ) )
            // InternalArchitecture.g:1202:1: ( '}' )
            {
            // InternalArchitecture.g:1202:1: ( '}' )
            // InternalArchitecture.g:1203:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_12()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1213:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1217:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalArchitecture.g:1218:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
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
    // InternalArchitecture.g:1225:1: rule__Component__Group_5__0__Impl : ( ( rule__Component__Group_5_0__0 )* ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1229:1: ( ( ( rule__Component__Group_5_0__0 )* ) )
            // InternalArchitecture.g:1230:1: ( ( rule__Component__Group_5_0__0 )* )
            {
            // InternalArchitecture.g:1230:1: ( ( rule__Component__Group_5_0__0 )* )
            // InternalArchitecture.g:1231:2: ( rule__Component__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5_0()); 
            }
            // InternalArchitecture.g:1232:2: ( rule__Component__Group_5_0__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==27) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalArchitecture.g:1232:3: rule__Component__Group_5_0__0
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
    // InternalArchitecture.g:1240:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1244:1: ( rule__Component__Group_5__1__Impl )
            // InternalArchitecture.g:1245:2: rule__Component__Group_5__1__Impl
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
    // InternalArchitecture.g:1251:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__OpsAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1255:1: ( ( ( rule__Component__OpsAssignment_5_1 ) ) )
            // InternalArchitecture.g:1256:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            {
            // InternalArchitecture.g:1256:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            // InternalArchitecture.g:1257:2: ( rule__Component__OpsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_1()); 
            }
            // InternalArchitecture.g:1258:2: ( rule__Component__OpsAssignment_5_1 )
            // InternalArchitecture.g:1258:3: rule__Component__OpsAssignment_5_1
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
    // InternalArchitecture.g:1267:1: rule__Component__Group_5_0__0 : rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 ;
    public final void rule__Component__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1271:1: ( rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 )
            // InternalArchitecture.g:1272:2: rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1
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
    // InternalArchitecture.g:1279:1: rule__Component__Group_5_0__0__Impl : ( ( rule__Component__OpsAssignment_5_0_0 ) ) ;
    public final void rule__Component__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1283:1: ( ( ( rule__Component__OpsAssignment_5_0_0 ) ) )
            // InternalArchitecture.g:1284:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            {
            // InternalArchitecture.g:1284:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            // InternalArchitecture.g:1285:2: ( rule__Component__OpsAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_0_0()); 
            }
            // InternalArchitecture.g:1286:2: ( rule__Component__OpsAssignment_5_0_0 )
            // InternalArchitecture.g:1286:3: rule__Component__OpsAssignment_5_0_0
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
    // InternalArchitecture.g:1294:1: rule__Component__Group_5_0__1 : rule__Component__Group_5_0__1__Impl ;
    public final void rule__Component__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1298:1: ( rule__Component__Group_5_0__1__Impl )
            // InternalArchitecture.g:1299:2: rule__Component__Group_5_0__1__Impl
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
    // InternalArchitecture.g:1305:1: rule__Component__Group_5_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1309:1: ( ( ',' ) )
            // InternalArchitecture.g:1310:1: ( ',' )
            {
            // InternalArchitecture.g:1310:1: ( ',' )
            // InternalArchitecture.g:1311:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_5_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1321:1: rule__Component__Group_9__0 : rule__Component__Group_9__0__Impl rule__Component__Group_9__1 ;
    public final void rule__Component__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1325:1: ( rule__Component__Group_9__0__Impl rule__Component__Group_9__1 )
            // InternalArchitecture.g:1326:2: rule__Component__Group_9__0__Impl rule__Component__Group_9__1
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
    // InternalArchitecture.g:1333:1: rule__Component__Group_9__0__Impl : ( ( rule__Component__Group_9_0__0 )* ) ;
    public final void rule__Component__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1337:1: ( ( ( rule__Component__Group_9_0__0 )* ) )
            // InternalArchitecture.g:1338:1: ( ( rule__Component__Group_9_0__0 )* )
            {
            // InternalArchitecture.g:1338:1: ( ( rule__Component__Group_9_0__0 )* )
            // InternalArchitecture.g:1339:2: ( rule__Component__Group_9_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_0()); 
            }
            // InternalArchitecture.g:1340:2: ( rule__Component__Group_9_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==27) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalArchitecture.g:1340:3: rule__Component__Group_9_0__0
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
    // InternalArchitecture.g:1348:1: rule__Component__Group_9__1 : rule__Component__Group_9__1__Impl ;
    public final void rule__Component__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1352:1: ( rule__Component__Group_9__1__Impl )
            // InternalArchitecture.g:1353:2: rule__Component__Group_9__1__Impl
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
    // InternalArchitecture.g:1359:1: rule__Component__Group_9__1__Impl : ( ( rule__Component__OpsReqAssignment_9_1 ) ) ;
    public final void rule__Component__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1363:1: ( ( ( rule__Component__OpsReqAssignment_9_1 ) ) )
            // InternalArchitecture.g:1364:1: ( ( rule__Component__OpsReqAssignment_9_1 ) )
            {
            // InternalArchitecture.g:1364:1: ( ( rule__Component__OpsReqAssignment_9_1 ) )
            // InternalArchitecture.g:1365:2: ( rule__Component__OpsReqAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqAssignment_9_1()); 
            }
            // InternalArchitecture.g:1366:2: ( rule__Component__OpsReqAssignment_9_1 )
            // InternalArchitecture.g:1366:3: rule__Component__OpsReqAssignment_9_1
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
    // InternalArchitecture.g:1375:1: rule__Component__Group_9_0__0 : rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1 ;
    public final void rule__Component__Group_9_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1379:1: ( rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1 )
            // InternalArchitecture.g:1380:2: rule__Component__Group_9_0__0__Impl rule__Component__Group_9_0__1
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
    // InternalArchitecture.g:1387:1: rule__Component__Group_9_0__0__Impl : ( ( rule__Component__OpsReqAssignment_9_0_0 ) ) ;
    public final void rule__Component__Group_9_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1391:1: ( ( ( rule__Component__OpsReqAssignment_9_0_0 ) ) )
            // InternalArchitecture.g:1392:1: ( ( rule__Component__OpsReqAssignment_9_0_0 ) )
            {
            // InternalArchitecture.g:1392:1: ( ( rule__Component__OpsReqAssignment_9_0_0 ) )
            // InternalArchitecture.g:1393:2: ( rule__Component__OpsReqAssignment_9_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqAssignment_9_0_0()); 
            }
            // InternalArchitecture.g:1394:2: ( rule__Component__OpsReqAssignment_9_0_0 )
            // InternalArchitecture.g:1394:3: rule__Component__OpsReqAssignment_9_0_0
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
    // InternalArchitecture.g:1402:1: rule__Component__Group_9_0__1 : rule__Component__Group_9_0__1__Impl ;
    public final void rule__Component__Group_9_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1406:1: ( rule__Component__Group_9_0__1__Impl )
            // InternalArchitecture.g:1407:2: rule__Component__Group_9_0__1__Impl
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
    // InternalArchitecture.g:1413:1: rule__Component__Group_9_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_9_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1417:1: ( ( ',' ) )
            // InternalArchitecture.g:1418:1: ( ',' )
            {
            // InternalArchitecture.g:1418:1: ( ',' )
            // InternalArchitecture.g:1419:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_9_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1429:1: rule__Component__Group_11__0 : rule__Component__Group_11__0__Impl ;
    public final void rule__Component__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1433:1: ( rule__Component__Group_11__0__Impl )
            // InternalArchitecture.g:1434:2: rule__Component__Group_11__0__Impl
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
    // InternalArchitecture.g:1440:1: rule__Component__Group_11__0__Impl : ( ( rule__Component__OperationsAssignment_11_0 ) ) ;
    public final void rule__Component__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1444:1: ( ( ( rule__Component__OperationsAssignment_11_0 ) ) )
            // InternalArchitecture.g:1445:1: ( ( rule__Component__OperationsAssignment_11_0 ) )
            {
            // InternalArchitecture.g:1445:1: ( ( rule__Component__OperationsAssignment_11_0 ) )
            // InternalArchitecture.g:1446:2: ( rule__Component__OperationsAssignment_11_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOperationsAssignment_11_0()); 
            }
            // InternalArchitecture.g:1447:2: ( rule__Component__OperationsAssignment_11_0 )
            // InternalArchitecture.g:1447:3: rule__Component__OperationsAssignment_11_0
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
    // InternalArchitecture.g:1456:1: rule__Architecture__Group__0 : rule__Architecture__Group__0__Impl rule__Architecture__Group__1 ;
    public final void rule__Architecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1460:1: ( rule__Architecture__Group__0__Impl rule__Architecture__Group__1 )
            // InternalArchitecture.g:1461:2: rule__Architecture__Group__0__Impl rule__Architecture__Group__1
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
    // InternalArchitecture.g:1468:1: rule__Architecture__Group__0__Impl : ( () ) ;
    public final void rule__Architecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1472:1: ( ( () ) )
            // InternalArchitecture.g:1473:1: ( () )
            {
            // InternalArchitecture.g:1473:1: ( () )
            // InternalArchitecture.g:1474:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getArchitectureAction_0()); 
            }
            // InternalArchitecture.g:1475:2: ()
            // InternalArchitecture.g:1475:3: 
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
    // InternalArchitecture.g:1483:1: rule__Architecture__Group__1 : rule__Architecture__Group__1__Impl rule__Architecture__Group__2 ;
    public final void rule__Architecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1487:1: ( rule__Architecture__Group__1__Impl rule__Architecture__Group__2 )
            // InternalArchitecture.g:1488:2: rule__Architecture__Group__1__Impl rule__Architecture__Group__2
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
    // InternalArchitecture.g:1495:1: rule__Architecture__Group__1__Impl : ( 'ArchitectureDefinition' ) ;
    public final void rule__Architecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1499:1: ( ( 'ArchitectureDefinition' ) )
            // InternalArchitecture.g:1500:1: ( 'ArchitectureDefinition' )
            {
            // InternalArchitecture.g:1500:1: ( 'ArchitectureDefinition' )
            // InternalArchitecture.g:1501:2: 'ArchitectureDefinition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getArchitectureDefinitionKeyword_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1510:1: rule__Architecture__Group__2 : rule__Architecture__Group__2__Impl rule__Architecture__Group__3 ;
    public final void rule__Architecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1514:1: ( rule__Architecture__Group__2__Impl rule__Architecture__Group__3 )
            // InternalArchitecture.g:1515:2: rule__Architecture__Group__2__Impl rule__Architecture__Group__3
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
    // InternalArchitecture.g:1522:1: rule__Architecture__Group__2__Impl : ( ( rule__Architecture__Group_2__0 )* ) ;
    public final void rule__Architecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1526:1: ( ( ( rule__Architecture__Group_2__0 )* ) )
            // InternalArchitecture.g:1527:1: ( ( rule__Architecture__Group_2__0 )* )
            {
            // InternalArchitecture.g:1527:1: ( ( rule__Architecture__Group_2__0 )* )
            // InternalArchitecture.g:1528:2: ( rule__Architecture__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getGroup_2()); 
            }
            // InternalArchitecture.g:1529:2: ( rule__Architecture__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==29) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArchitecture.g:1529:3: rule__Architecture__Group_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Architecture__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getGroup_2()); 
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
    // InternalArchitecture.g:1537:1: rule__Architecture__Group__3 : rule__Architecture__Group__3__Impl ;
    public final void rule__Architecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1541:1: ( rule__Architecture__Group__3__Impl )
            // InternalArchitecture.g:1542:2: rule__Architecture__Group__3__Impl
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
    // InternalArchitecture.g:1548:1: rule__Architecture__Group__3__Impl : ( ( rule__Architecture__BindAssignment_3 )* ) ;
    public final void rule__Architecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1552:1: ( ( ( rule__Architecture__BindAssignment_3 )* ) )
            // InternalArchitecture.g:1553:1: ( ( rule__Architecture__BindAssignment_3 )* )
            {
            // InternalArchitecture.g:1553:1: ( ( rule__Architecture__BindAssignment_3 )* )
            // InternalArchitecture.g:1554:2: ( rule__Architecture__BindAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getBindAssignment_3()); 
            }
            // InternalArchitecture.g:1555:2: ( rule__Architecture__BindAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalArchitecture.g:1555:3: rule__Architecture__BindAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Architecture__BindAssignment_3();

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


    // $ANTLR start "rule__Architecture__Group_2__0"
    // InternalArchitecture.g:1564:1: rule__Architecture__Group_2__0 : rule__Architecture__Group_2__0__Impl rule__Architecture__Group_2__1 ;
    public final void rule__Architecture__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1568:1: ( rule__Architecture__Group_2__0__Impl rule__Architecture__Group_2__1 )
            // InternalArchitecture.g:1569:2: rule__Architecture__Group_2__0__Impl rule__Architecture__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Architecture__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Architecture__Group_2__1();

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
    // $ANTLR end "rule__Architecture__Group_2__0"


    // $ANTLR start "rule__Architecture__Group_2__0__Impl"
    // InternalArchitecture.g:1576:1: rule__Architecture__Group_2__0__Impl : ( 'def' ) ;
    public final void rule__Architecture__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1580:1: ( ( 'def' ) )
            // InternalArchitecture.g:1581:1: ( 'def' )
            {
            // InternalArchitecture.g:1581:1: ( 'def' )
            // InternalArchitecture.g:1582:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getDefKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getDefKeyword_2_0()); 
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
    // $ANTLR end "rule__Architecture__Group_2__0__Impl"


    // $ANTLR start "rule__Architecture__Group_2__1"
    // InternalArchitecture.g:1591:1: rule__Architecture__Group_2__1 : rule__Architecture__Group_2__1__Impl ;
    public final void rule__Architecture__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1595:1: ( rule__Architecture__Group_2__1__Impl )
            // InternalArchitecture.g:1596:2: rule__Architecture__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__Group_2__1__Impl();

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
    // $ANTLR end "rule__Architecture__Group_2__1"


    // $ANTLR start "rule__Architecture__Group_2__1__Impl"
    // InternalArchitecture.g:1602:1: rule__Architecture__Group_2__1__Impl : ( ( rule__Architecture__VarsAssignment_2_1 ) ) ;
    public final void rule__Architecture__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1606:1: ( ( ( rule__Architecture__VarsAssignment_2_1 ) ) )
            // InternalArchitecture.g:1607:1: ( ( rule__Architecture__VarsAssignment_2_1 ) )
            {
            // InternalArchitecture.g:1607:1: ( ( rule__Architecture__VarsAssignment_2_1 ) )
            // InternalArchitecture.g:1608:2: ( rule__Architecture__VarsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getVarsAssignment_2_1()); 
            }
            // InternalArchitecture.g:1609:2: ( rule__Architecture__VarsAssignment_2_1 )
            // InternalArchitecture.g:1609:3: rule__Architecture__VarsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Architecture__VarsAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getVarsAssignment_2_1()); 
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
    // $ANTLR end "rule__Architecture__Group_2__1__Impl"


    // $ANTLR start "rule__Binding__Group__0"
    // InternalArchitecture.g:1618:1: rule__Binding__Group__0 : rule__Binding__Group__0__Impl rule__Binding__Group__1 ;
    public final void rule__Binding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1622:1: ( rule__Binding__Group__0__Impl rule__Binding__Group__1 )
            // InternalArchitecture.g:1623:2: rule__Binding__Group__0__Impl rule__Binding__Group__1
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


    // $ANTLR start "rule__Binding__Group__0__Impl"
    // InternalArchitecture.g:1630:1: rule__Binding__Group__0__Impl : ( 'bind' ) ;
    public final void rule__Binding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1634:1: ( ( 'bind' ) )
            // InternalArchitecture.g:1635:1: ( 'bind' )
            {
            // InternalArchitecture.g:1635:1: ( 'bind' )
            // InternalArchitecture.g:1636:2: 'bind'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getBindKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Binding__Group__1"
    // InternalArchitecture.g:1645:1: rule__Binding__Group__1 : rule__Binding__Group__1__Impl rule__Binding__Group__2 ;
    public final void rule__Binding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1649:1: ( rule__Binding__Group__1__Impl rule__Binding__Group__2 )
            // InternalArchitecture.g:1650:2: rule__Binding__Group__1__Impl rule__Binding__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Binding__Group__1__Impl();

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


    // $ANTLR start "rule__Binding__Group__1__Impl"
    // InternalArchitecture.g:1657:1: rule__Binding__Group__1__Impl : ( ( rule__Binding__ProviderAssignment_1 ) ) ;
    public final void rule__Binding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1661:1: ( ( ( rule__Binding__ProviderAssignment_1 ) ) )
            // InternalArchitecture.g:1662:1: ( ( rule__Binding__ProviderAssignment_1 ) )
            {
            // InternalArchitecture.g:1662:1: ( ( rule__Binding__ProviderAssignment_1 ) )
            // InternalArchitecture.g:1663:2: ( rule__Binding__ProviderAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProviderAssignment_1()); 
            }
            // InternalArchitecture.g:1664:2: ( rule__Binding__ProviderAssignment_1 )
            // InternalArchitecture.g:1664:3: rule__Binding__ProviderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ProviderAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProviderAssignment_1()); 
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


    // $ANTLR start "rule__Binding__Group__2"
    // InternalArchitecture.g:1672:1: rule__Binding__Group__2 : rule__Binding__Group__2__Impl rule__Binding__Group__3 ;
    public final void rule__Binding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1676:1: ( rule__Binding__Group__2__Impl rule__Binding__Group__3 )
            // InternalArchitecture.g:1677:2: rule__Binding__Group__2__Impl rule__Binding__Group__3
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


    // $ANTLR start "rule__Binding__Group__2__Impl"
    // InternalArchitecture.g:1684:1: rule__Binding__Group__2__Impl : ( '.' ) ;
    public final void rule__Binding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1688:1: ( ( '.' ) )
            // InternalArchitecture.g:1689:1: ( '.' )
            {
            // InternalArchitecture.g:1689:1: ( '.' )
            // InternalArchitecture.g:1690:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getFullStopKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Binding__Group__3"
    // InternalArchitecture.g:1699:1: rule__Binding__Group__3 : rule__Binding__Group__3__Impl rule__Binding__Group__4 ;
    public final void rule__Binding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1703:1: ( rule__Binding__Group__3__Impl rule__Binding__Group__4 )
            // InternalArchitecture.g:1704:2: rule__Binding__Group__3__Impl rule__Binding__Group__4
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


    // $ANTLR start "rule__Binding__Group__3__Impl"
    // InternalArchitecture.g:1711:1: rule__Binding__Group__3__Impl : ( ( rule__Binding__ProMemberAssignment_3 ) ) ;
    public final void rule__Binding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1715:1: ( ( ( rule__Binding__ProMemberAssignment_3 ) ) )
            // InternalArchitecture.g:1716:1: ( ( rule__Binding__ProMemberAssignment_3 ) )
            {
            // InternalArchitecture.g:1716:1: ( ( rule__Binding__ProMemberAssignment_3 ) )
            // InternalArchitecture.g:1717:2: ( rule__Binding__ProMemberAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProMemberAssignment_3()); 
            }
            // InternalArchitecture.g:1718:2: ( rule__Binding__ProMemberAssignment_3 )
            // InternalArchitecture.g:1718:3: rule__Binding__ProMemberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ProMemberAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProMemberAssignment_3()); 
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
    // InternalArchitecture.g:1726:1: rule__Binding__Group__4 : rule__Binding__Group__4__Impl rule__Binding__Group__5 ;
    public final void rule__Binding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1730:1: ( rule__Binding__Group__4__Impl rule__Binding__Group__5 )
            // InternalArchitecture.g:1731:2: rule__Binding__Group__4__Impl rule__Binding__Group__5
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
    // InternalArchitecture.g:1738:1: rule__Binding__Group__4__Impl : ( '-' ) ;
    public final void rule__Binding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1742:1: ( ( '-' ) )
            // InternalArchitecture.g:1743:1: ( '-' )
            {
            // InternalArchitecture.g:1743:1: ( '-' )
            // InternalArchitecture.g:1744:2: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getHyphenMinusKeyword_4()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getHyphenMinusKeyword_4()); 
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


    // $ANTLR start "rule__Binding__Group__5"
    // InternalArchitecture.g:1753:1: rule__Binding__Group__5 : rule__Binding__Group__5__Impl rule__Binding__Group__6 ;
    public final void rule__Binding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1757:1: ( rule__Binding__Group__5__Impl rule__Binding__Group__6 )
            // InternalArchitecture.g:1758:2: rule__Binding__Group__5__Impl rule__Binding__Group__6
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


    // $ANTLR start "rule__Binding__Group__5__Impl"
    // InternalArchitecture.g:1765:1: rule__Binding__Group__5__Impl : ( ( rule__Binding__ReceiverAssignment_5 ) ) ;
    public final void rule__Binding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1769:1: ( ( ( rule__Binding__ReceiverAssignment_5 ) ) )
            // InternalArchitecture.g:1770:1: ( ( rule__Binding__ReceiverAssignment_5 ) )
            {
            // InternalArchitecture.g:1770:1: ( ( rule__Binding__ReceiverAssignment_5 ) )
            // InternalArchitecture.g:1771:2: ( rule__Binding__ReceiverAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getReceiverAssignment_5()); 
            }
            // InternalArchitecture.g:1772:2: ( rule__Binding__ReceiverAssignment_5 )
            // InternalArchitecture.g:1772:3: rule__Binding__ReceiverAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Binding__ReceiverAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getReceiverAssignment_5()); 
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


    // $ANTLR start "rule__Binding__Group__6"
    // InternalArchitecture.g:1780:1: rule__Binding__Group__6 : rule__Binding__Group__6__Impl rule__Binding__Group__7 ;
    public final void rule__Binding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1784:1: ( rule__Binding__Group__6__Impl rule__Binding__Group__7 )
            // InternalArchitecture.g:1785:2: rule__Binding__Group__6__Impl rule__Binding__Group__7
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


    // $ANTLR start "rule__Binding__Group__6__Impl"
    // InternalArchitecture.g:1792:1: rule__Binding__Group__6__Impl : ( '.' ) ;
    public final void rule__Binding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1796:1: ( ( '.' ) )
            // InternalArchitecture.g:1797:1: ( '.' )
            {
            // InternalArchitecture.g:1797:1: ( '.' )
            // InternalArchitecture.g:1798:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getFullStopKeyword_6()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Binding__Group__7"
    // InternalArchitecture.g:1807:1: rule__Binding__Group__7 : rule__Binding__Group__7__Impl ;
    public final void rule__Binding__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1811:1: ( rule__Binding__Group__7__Impl )
            // InternalArchitecture.g:1812:2: rule__Binding__Group__7__Impl
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


    // $ANTLR start "rule__Binding__Group__7__Impl"
    // InternalArchitecture.g:1818:1: rule__Binding__Group__7__Impl : ( ( rule__Binding__RecMemberAssignment_7 ) ) ;
    public final void rule__Binding__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1822:1: ( ( ( rule__Binding__RecMemberAssignment_7 ) ) )
            // InternalArchitecture.g:1823:1: ( ( rule__Binding__RecMemberAssignment_7 ) )
            {
            // InternalArchitecture.g:1823:1: ( ( rule__Binding__RecMemberAssignment_7 ) )
            // InternalArchitecture.g:1824:2: ( rule__Binding__RecMemberAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getRecMemberAssignment_7()); 
            }
            // InternalArchitecture.g:1825:2: ( rule__Binding__RecMemberAssignment_7 )
            // InternalArchitecture.g:1825:3: rule__Binding__RecMemberAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Binding__RecMemberAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getRecMemberAssignment_7()); 
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
    // InternalArchitecture.g:1834:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1838:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1839:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalArchitecture.g:1846:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1850:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1851:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1851:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1852:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalArchitecture.g:1853:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1853:3: rule__Variable__NameAssignment_0
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
    // InternalArchitecture.g:1861:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1865:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1866:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalArchitecture.g:1873:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1877:1: ( ( ':' ) )
            // InternalArchitecture.g:1878:1: ( ':' )
            {
            // InternalArchitecture.g:1878:1: ( ':' )
            // InternalArchitecture.g:1879:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1888:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1892:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1893:2: rule__Variable__Group__2__Impl
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
    // InternalArchitecture.g:1899:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1903:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1904:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1904:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1905:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalArchitecture.g:1906:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1906:3: rule__Variable__TypeAssignment_2
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


    // $ANTLR start "rule__Operation__Group__0"
    // InternalArchitecture.g:1915:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1919:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalArchitecture.g:1920:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
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
    // InternalArchitecture.g:1927:1: rule__Operation__Group__0__Impl : ( 'def' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1931:1: ( ( 'def' ) )
            // InternalArchitecture.g:1932:1: ( 'def' )
            {
            // InternalArchitecture.g:1932:1: ( 'def' )
            // InternalArchitecture.g:1933:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getDefKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1942:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1946:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalArchitecture.g:1947:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
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
    // InternalArchitecture.g:1954:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1958:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalArchitecture.g:1959:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:1959:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalArchitecture.g:1960:2: ( rule__Operation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:1961:2: ( rule__Operation__NameAssignment_1 )
            // InternalArchitecture.g:1961:3: rule__Operation__NameAssignment_1
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
    // InternalArchitecture.g:1969:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1973:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalArchitecture.g:1974:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalArchitecture.g:1981:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1985:1: ( ( '(' ) )
            // InternalArchitecture.g:1986:1: ( '(' )
            {
            // InternalArchitecture.g:1986:1: ( '(' )
            // InternalArchitecture.g:1987:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1996:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2000:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalArchitecture.g:2001:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalArchitecture.g:2008:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )* ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2012:1: ( ( ( rule__Operation__Group_3__0 )* ) )
            // InternalArchitecture.g:2013:1: ( ( rule__Operation__Group_3__0 )* )
            {
            // InternalArchitecture.g:2013:1: ( ( rule__Operation__Group_3__0 )* )
            // InternalArchitecture.g:2014:2: ( rule__Operation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3()); 
            }
            // InternalArchitecture.g:2015:2: ( rule__Operation__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalArchitecture.g:2015:3: rule__Operation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalArchitecture.g:2023:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2027:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalArchitecture.g:2028:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalArchitecture.g:2035:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2039:1: ( ( ')' ) )
            // InternalArchitecture.g:2040:1: ( ')' )
            {
            // InternalArchitecture.g:2040:1: ( ')' )
            // InternalArchitecture.g:2041:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:2050:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2054:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalArchitecture.g:2055:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_26);
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
    // InternalArchitecture.g:2062:1: rule__Operation__Group__5__Impl : ( ':' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2066:1: ( ( ':' ) )
            // InternalArchitecture.g:2067:1: ( ':' )
            {
            // InternalArchitecture.g:2067:1: ( ':' )
            // InternalArchitecture.g:2068:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:2077:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2081:1: ( rule__Operation__Group__6__Impl )
            // InternalArchitecture.g:2082:2: rule__Operation__Group__6__Impl
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
    // InternalArchitecture.g:2088:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__TypeAssignment_6 ) ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2092:1: ( ( ( rule__Operation__TypeAssignment_6 ) ) )
            // InternalArchitecture.g:2093:1: ( ( rule__Operation__TypeAssignment_6 ) )
            {
            // InternalArchitecture.g:2093:1: ( ( rule__Operation__TypeAssignment_6 ) )
            // InternalArchitecture.g:2094:2: ( rule__Operation__TypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeAssignment_6()); 
            }
            // InternalArchitecture.g:2095:2: ( rule__Operation__TypeAssignment_6 )
            // InternalArchitecture.g:2095:3: rule__Operation__TypeAssignment_6
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
    // InternalArchitecture.g:2104:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2108:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // InternalArchitecture.g:2109:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:2116:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__Group_3_0__0 )* ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2120:1: ( ( ( rule__Operation__Group_3_0__0 )* ) )
            // InternalArchitecture.g:2121:1: ( ( rule__Operation__Group_3_0__0 )* )
            {
            // InternalArchitecture.g:2121:1: ( ( rule__Operation__Group_3_0__0 )* )
            // InternalArchitecture.g:2122:2: ( rule__Operation__Group_3_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3_0()); 
            }
            // InternalArchitecture.g:2123:2: ( rule__Operation__Group_3_0__0 )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // InternalArchitecture.g:2123:3: rule__Operation__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_17);
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
    // InternalArchitecture.g:2131:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2135:1: ( rule__Operation__Group_3__1__Impl )
            // InternalArchitecture.g:2136:2: rule__Operation__Group_3__1__Impl
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
    // InternalArchitecture.g:2142:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__ArgAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2146:1: ( ( ( rule__Operation__ArgAssignment_3_1 ) ) )
            // InternalArchitecture.g:2147:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            {
            // InternalArchitecture.g:2147:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            // InternalArchitecture.g:2148:2: ( rule__Operation__ArgAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_1()); 
            }
            // InternalArchitecture.g:2149:2: ( rule__Operation__ArgAssignment_3_1 )
            // InternalArchitecture.g:2149:3: rule__Operation__ArgAssignment_3_1
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
    // InternalArchitecture.g:2158:1: rule__Operation__Group_3_0__0 : rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 ;
    public final void rule__Operation__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2162:1: ( rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 )
            // InternalArchitecture.g:2163:2: rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1
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
    // InternalArchitecture.g:2170:1: rule__Operation__Group_3_0__0__Impl : ( ( rule__Operation__ArgAssignment_3_0_0 ) ) ;
    public final void rule__Operation__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2174:1: ( ( ( rule__Operation__ArgAssignment_3_0_0 ) ) )
            // InternalArchitecture.g:2175:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            {
            // InternalArchitecture.g:2175:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            // InternalArchitecture.g:2176:2: ( rule__Operation__ArgAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_0_0()); 
            }
            // InternalArchitecture.g:2177:2: ( rule__Operation__ArgAssignment_3_0_0 )
            // InternalArchitecture.g:2177:3: rule__Operation__ArgAssignment_3_0_0
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
    // InternalArchitecture.g:2185:1: rule__Operation__Group_3_0__1 : rule__Operation__Group_3_0__1__Impl ;
    public final void rule__Operation__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2189:1: ( rule__Operation__Group_3_0__1__Impl )
            // InternalArchitecture.g:2190:2: rule__Operation__Group_3_0__1__Impl
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
    // InternalArchitecture.g:2196:1: rule__Operation__Group_3_0__1__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2200:1: ( ( ',' ) )
            // InternalArchitecture.g:2201:1: ( ',' )
            {
            // InternalArchitecture.g:2201:1: ( ',' )
            // InternalArchitecture.g:2202:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_3_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:2212:1: rule__Model__PackageAssignment : ( ruleDomainDeclaration ) ;
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2216:1: ( ( ruleDomainDeclaration ) )
            // InternalArchitecture.g:2217:2: ( ruleDomainDeclaration )
            {
            // InternalArchitecture.g:2217:2: ( ruleDomainDeclaration )
            // InternalArchitecture.g:2218:3: ruleDomainDeclaration
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
    // InternalArchitecture.g:2227:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2231:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:2232:2: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:2232:2: ( ruleQualifiedName )
            // InternalArchitecture.g:2233:3: ruleQualifiedName
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
    // InternalArchitecture.g:2242:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractModel ) ;
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2246:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:2247:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:2247:2: ( ruleAbstractModel )
            // InternalArchitecture.g:2248:3: ruleAbstractModel
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
    // InternalArchitecture.g:2257:1: rule__AbstractModel__ImpAssignment_0 : ( ruleImport ) ;
    public final void rule__AbstractModel__ImpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2261:1: ( ( ruleImport ) )
            // InternalArchitecture.g:2262:2: ( ruleImport )
            {
            // InternalArchitecture.g:2262:2: ( ruleImport )
            // InternalArchitecture.g:2263:3: ruleImport
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
    // InternalArchitecture.g:2272:1: rule__AbstractModel__CompAssignment_1_0 : ( ruleComponent ) ;
    public final void rule__AbstractModel__CompAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2276:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:2277:2: ( ruleComponent )
            {
            // InternalArchitecture.g:2277:2: ( ruleComponent )
            // InternalArchitecture.g:2278:3: ruleComponent
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
    // InternalArchitecture.g:2287:1: rule__AbstractModel__ArchAssignment_1_1 : ( ruleArchitecture ) ;
    public final void rule__AbstractModel__ArchAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2291:1: ( ( ruleArchitecture ) )
            // InternalArchitecture.g:2292:2: ( ruleArchitecture )
            {
            // InternalArchitecture.g:2292:2: ( ruleArchitecture )
            // InternalArchitecture.g:2293:3: ruleArchitecture
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
    // InternalArchitecture.g:2302:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2306:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:2307:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:2307:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:2308:3: ruleQualifiedNameWithWildcard
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
    // InternalArchitecture.g:2317:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2321:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2322:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2322:2: ( RULE_ID )
            // InternalArchitecture.g:2323:3: RULE_ID
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
    // InternalArchitecture.g:2332:1: rule__Component__OpsAssignment_5_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2336:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2337:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2337:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2338:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_0_0_0()); 
            }
            // InternalArchitecture.g:2339:3: ( RULE_ID )
            // InternalArchitecture.g:2340:4: RULE_ID
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
    // InternalArchitecture.g:2351:1: rule__Component__OpsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2355:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2356:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2356:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2357:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_1_0()); 
            }
            // InternalArchitecture.g:2358:3: ( RULE_ID )
            // InternalArchitecture.g:2359:4: RULE_ID
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
    // InternalArchitecture.g:2370:1: rule__Component__OpsReqAssignment_9_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsReqAssignment_9_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2374:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2375:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2375:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2376:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqOperationCrossReference_9_0_0_0()); 
            }
            // InternalArchitecture.g:2377:3: ( RULE_ID )
            // InternalArchitecture.g:2378:4: RULE_ID
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
    // InternalArchitecture.g:2389:1: rule__Component__OpsReqAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsReqAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2393:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2394:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2394:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2395:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsReqOperationCrossReference_9_1_0()); 
            }
            // InternalArchitecture.g:2396:3: ( RULE_ID )
            // InternalArchitecture.g:2397:4: RULE_ID
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
    // InternalArchitecture.g:2408:1: rule__Component__OperationsAssignment_11_0 : ( ruleOperation ) ;
    public final void rule__Component__OperationsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2412:1: ( ( ruleOperation ) )
            // InternalArchitecture.g:2413:2: ( ruleOperation )
            {
            // InternalArchitecture.g:2413:2: ( ruleOperation )
            // InternalArchitecture.g:2414:3: ruleOperation
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


    // $ANTLR start "rule__Architecture__VarsAssignment_2_1"
    // InternalArchitecture.g:2423:1: rule__Architecture__VarsAssignment_2_1 : ( ruleVariable ) ;
    public final void rule__Architecture__VarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2427:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2428:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2428:2: ( ruleVariable )
            // InternalArchitecture.g:2429:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArchitectureAccess().getVarsVariableParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArchitectureAccess().getVarsVariableParserRuleCall_2_1_0()); 
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
    // $ANTLR end "rule__Architecture__VarsAssignment_2_1"


    // $ANTLR start "rule__Architecture__BindAssignment_3"
    // InternalArchitecture.g:2438:1: rule__Architecture__BindAssignment_3 : ( ruleBinding ) ;
    public final void rule__Architecture__BindAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2442:1: ( ( ruleBinding ) )
            // InternalArchitecture.g:2443:2: ( ruleBinding )
            {
            // InternalArchitecture.g:2443:2: ( ruleBinding )
            // InternalArchitecture.g:2444:3: ruleBinding
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


    // $ANTLR start "rule__Binding__ProviderAssignment_1"
    // InternalArchitecture.g:2453:1: rule__Binding__ProviderAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ProviderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2457:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2458:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2458:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2459:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProviderVariableCrossReference_1_0()); 
            }
            // InternalArchitecture.g:2460:3: ( RULE_ID )
            // InternalArchitecture.g:2461:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProviderVariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProviderVariableIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProviderVariableCrossReference_1_0()); 
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
    // $ANTLR end "rule__Binding__ProviderAssignment_1"


    // $ANTLR start "rule__Binding__ProMemberAssignment_3"
    // InternalArchitecture.g:2472:1: rule__Binding__ProMemberAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ProMemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2476:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2477:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2477:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2478:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProMemberOperationCrossReference_3_0()); 
            }
            // InternalArchitecture.g:2479:3: ( RULE_ID )
            // InternalArchitecture.g:2480:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getProMemberOperationIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProMemberOperationIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getProMemberOperationCrossReference_3_0()); 
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
    // $ANTLR end "rule__Binding__ProMemberAssignment_3"


    // $ANTLR start "rule__Binding__ReceiverAssignment_5"
    // InternalArchitecture.g:2491:1: rule__Binding__ReceiverAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__ReceiverAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2495:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2496:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2496:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2497:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getReceiverVariableCrossReference_5_0()); 
            }
            // InternalArchitecture.g:2498:3: ( RULE_ID )
            // InternalArchitecture.g:2499:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getReceiverVariableIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getReceiverVariableIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getReceiverVariableCrossReference_5_0()); 
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
    // $ANTLR end "rule__Binding__ReceiverAssignment_5"


    // $ANTLR start "rule__Binding__RecMemberAssignment_7"
    // InternalArchitecture.g:2510:1: rule__Binding__RecMemberAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Binding__RecMemberAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2514:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2515:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2515:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2516:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getRecMemberOperationCrossReference_7_0()); 
            }
            // InternalArchitecture.g:2517:3: ( RULE_ID )
            // InternalArchitecture.g:2518:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingAccess().getRecMemberOperationIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getRecMemberOperationIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingAccess().getRecMemberOperationCrossReference_7_0()); 
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
    // $ANTLR end "rule__Binding__RecMemberAssignment_7"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalArchitecture.g:2529:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2533:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2534:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2534:2: ( RULE_ID )
            // InternalArchitecture.g:2535:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // InternalArchitecture.g:2544:1: rule__Variable__TypeAssignment_2 : ( ruleAtomicType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2548:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2549:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2549:2: ( ruleAtomicType )
            // InternalArchitecture.g:2550:3: ruleAtomicType
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
    // InternalArchitecture.g:2559:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2563:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2564:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2564:2: ( RULE_ID )
            // InternalArchitecture.g:2565:3: RULE_ID
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
    // InternalArchitecture.g:2574:1: rule__Operation__ArgAssignment_3_0_0 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2578:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2579:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2579:2: ( ruleVariable )
            // InternalArchitecture.g:2580:3: ruleVariable
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
    // InternalArchitecture.g:2589:1: rule__Operation__ArgAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2593:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2594:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2594:2: ( ruleVariable )
            // InternalArchitecture.g:2595:3: ruleVariable
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
    // InternalArchitecture.g:2604:1: rule__Operation__TypeAssignment_6 : ( ruleAtomicType ) ;
    public final void rule__Operation__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2608:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2609:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2609:2: ( ruleAtomicType )
            // InternalArchitecture.g:2610:3: ruleAtomicType
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
    // InternalArchitecture.g:2619:1: rule__AtomicType__AtomTypeAssignment_0 : ( ruleType ) ;
    public final void rule__AtomicType__AtomTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2623:1: ( ( ruleType ) )
            // InternalArchitecture.g:2624:2: ( ruleType )
            {
            // InternalArchitecture.g:2624:2: ( ruleType )
            // InternalArchitecture.g:2625:3: ruleType
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
    // InternalArchitecture.g:2634:1: rule__AtomicType__CompTypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicType__CompTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2638:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2639:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2639:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2640:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getCompTypeComponentCrossReference_1_0()); 
            }
            // InternalArchitecture.g:2641:3: ( RULE_ID )
            // InternalArchitecture.g:2642:4: RULE_ID
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
        // InternalArchitecture.g:382:5: ( rule__AbstractModel__CompAssignment_1_0 )
        // InternalArchitecture.g:382:5: rule__AbstractModel__CompAssignment_1_0
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
    static final String dfa_1s = "\45\uffff";
    static final String dfa_2s = "\1\1\44\uffff";
    static final String dfa_3s = "\1\22\1\uffff\1\4\1\21\1\27\1\30\2\4\1\32\1\4\1\30\2\4\1\22\2\4\1\0\1\30\1\uffff\1\4\2\40\10\4\6\22\1\4";
    static final String dfa_4s = "\1\34\1\uffff\1\4\1\21\1\27\1\30\1\31\1\33\1\32\1\4\1\30\1\31\1\33\1\35\2\4\1\0\1\30\1\uffff\1\31\2\40\2\17\6\33\6\35\1\4";
    static final String dfa_5s = "\1\uffff\1\2\20\uffff\1\1\22\uffff";
    static final String dfa_6s = "\20\uffff\1\0\24\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\2\uffff\1\2\5\uffff\1\1",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\24\uffff\1\10",
            "\1\7\24\uffff\1\10\1\uffff\1\11",
            "\1\12",
            "\1\7",
            "\1\13",
            "\1\14\24\uffff\1\15",
            "\1\14\24\uffff\1\15\1\uffff\1\16",
            "\1\20\12\uffff\1\17",
            "\1\14",
            "\1\21",
            "\1\uffff",
            "\1\23",
            "",
            "\1\24\24\uffff\1\25",
            "\1\26",
            "\1\27",
            "\1\35\6\uffff\1\30\1\31\1\32\1\33\1\34",
            "\1\43\6\uffff\1\36\1\37\1\40\1\41\1\42",
            "\1\24\24\uffff\1\25\1\uffff\1\44",
            "\1\24\24\uffff\1\25\1\uffff\1\44",
            "\1\24\24\uffff\1\25\1\uffff\1\44",
            "\1\24\24\uffff\1\25\1\uffff\1\44",
            "\1\24\24\uffff\1\25\1\uffff\1\44",
            "\1\24\24\uffff\1\25\1\uffff\1\44",
            "\1\20\12\uffff\1\17",
            "\1\20\12\uffff\1\17",
            "\1\20\12\uffff\1\17",
            "\1\20\12\uffff\1\17",
            "\1\20\12\uffff\1\17",
            "\1\20\12\uffff\1\17",
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
            return "()* loopback of 382:4: ( rule__AbstractModel__CompAssignment_1_0 )*";
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
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\3\uffff\6\12\2\uffff";
    static final String dfa_10s = "\1\4\1\40\7\4\2\uffff";
    static final String dfa_11s = "\1\4\1\40\1\17\6\33\2\uffff";
    static final String dfa_12s = "\11\uffff\1\1\1\2";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2",
            "\1\10\6\uffff\1\3\1\4\1\5\1\6\1\7",
            "\1\12\24\uffff\1\12\1\uffff\1\11",
            "\1\12\24\uffff\1\12\1\uffff\1\11",
            "\1\12\24\uffff\1\12\1\uffff\1\11",
            "\1\12\24\uffff\1\12\1\uffff\1\11",
            "\1\12\24\uffff\1\12\1\uffff\1\11",
            "\1\12\24\uffff\1\12\1\uffff\1\11",
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
            return "()* loopback of 2123:2: ( rule__Operation__Group_3_0__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000104C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010480002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010480000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000F810L});

}