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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "':'", "'ProvidedServices:'", "'conf('", "')'", "'RequiredServices:'", "','", "'('", "'bind('", "':='", "';'"
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


    // $ANTLR start "entryRuleInstanceComp"
    // InternalArchitecture.g:229:1: entryRuleInstanceComp : ruleInstanceComp EOF ;
    public final void entryRuleInstanceComp() throws RecognitionException {
        try {
            // InternalArchitecture.g:230:1: ( ruleInstanceComp EOF )
            // InternalArchitecture.g:231:1: ruleInstanceComp EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInstanceComp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompRule()); 
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
    // $ANTLR end "entryRuleInstanceComp"


    // $ANTLR start "ruleInstanceComp"
    // InternalArchitecture.g:238:1: ruleInstanceComp : ( ( rule__InstanceComp__NameAssignment ) ) ;
    public final void ruleInstanceComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:242:2: ( ( ( rule__InstanceComp__NameAssignment ) ) )
            // InternalArchitecture.g:243:2: ( ( rule__InstanceComp__NameAssignment ) )
            {
            // InternalArchitecture.g:243:2: ( ( rule__InstanceComp__NameAssignment ) )
            // InternalArchitecture.g:244:3: ( rule__InstanceComp__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getNameAssignment()); 
            }
            // InternalArchitecture.g:245:3: ( rule__InstanceComp__NameAssignment )
            // InternalArchitecture.g:245:4: rule__InstanceComp__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InstanceComp__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleInstanceComp"


    // $ANTLR start "entryRuleVariable"
    // InternalArchitecture.g:254:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalArchitecture.g:255:1: ( ruleVariable EOF )
            // InternalArchitecture.g:256:1: ruleVariable EOF
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
    // InternalArchitecture.g:263:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:267:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalArchitecture.g:268:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalArchitecture.g:268:2: ( ( rule__Variable__Group__0 ) )
            // InternalArchitecture.g:269:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalArchitecture.g:270:3: ( rule__Variable__Group__0 )
            // InternalArchitecture.g:270:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleBindings"
    // InternalArchitecture.g:279:1: entryRuleBindings : ruleBindings EOF ;
    public final void entryRuleBindings() throws RecognitionException {
        try {
            // InternalArchitecture.g:280:1: ( ruleBindings EOF )
            // InternalArchitecture.g:281:1: ruleBindings EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBindings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsRule()); 
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
    // $ANTLR end "entryRuleBindings"


    // $ANTLR start "ruleBindings"
    // InternalArchitecture.g:288:1: ruleBindings : ( ( rule__Bindings__Group__0 ) ) ;
    public final void ruleBindings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:292:2: ( ( ( rule__Bindings__Group__0 ) ) )
            // InternalArchitecture.g:293:2: ( ( rule__Bindings__Group__0 ) )
            {
            // InternalArchitecture.g:293:2: ( ( rule__Bindings__Group__0 ) )
            // InternalArchitecture.g:294:3: ( rule__Bindings__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getGroup()); 
            }
            // InternalArchitecture.g:295:3: ( rule__Bindings__Group__0 )
            // InternalArchitecture.g:295:4: rule__Bindings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getGroup()); 
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
    // $ANTLR end "ruleBindings"


    // $ANTLR start "entryRuleRequiredService"
    // InternalArchitecture.g:304:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalArchitecture.g:305:1: ( ruleRequiredService EOF )
            // InternalArchitecture.g:306:1: ruleRequiredService EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceRule()); 
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
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalArchitecture.g:313:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:317:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalArchitecture.g:318:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalArchitecture.g:318:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalArchitecture.g:319:3: ( rule__RequiredService__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            }
            // InternalArchitecture.g:320:3: ( rule__RequiredService__Group__0 )
            // InternalArchitecture.g:320:4: rule__RequiredService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getGroup()); 
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
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleServiceName"
    // InternalArchitecture.g:329:1: entryRuleServiceName : ruleServiceName EOF ;
    public final void entryRuleServiceName() throws RecognitionException {
        try {
            // InternalArchitecture.g:330:1: ( ruleServiceName EOF )
            // InternalArchitecture.g:331:1: ruleServiceName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleServiceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceNameRule()); 
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
    // $ANTLR end "entryRuleServiceName"


    // $ANTLR start "ruleServiceName"
    // InternalArchitecture.g:338:1: ruleServiceName : ( ( rule__ServiceName__NameAssignment ) ) ;
    public final void ruleServiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:342:2: ( ( ( rule__ServiceName__NameAssignment ) ) )
            // InternalArchitecture.g:343:2: ( ( rule__ServiceName__NameAssignment ) )
            {
            // InternalArchitecture.g:343:2: ( ( rule__ServiceName__NameAssignment ) )
            // InternalArchitecture.g:344:3: ( rule__ServiceName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceNameAccess().getNameAssignment()); 
            }
            // InternalArchitecture.g:345:3: ( rule__ServiceName__NameAssignment )
            // InternalArchitecture.g:345:4: rule__ServiceName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ServiceName__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceNameAccess().getNameAssignment()); 
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
    // $ANTLR end "ruleServiceName"


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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalArchitecture.g:369:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:373:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalArchitecture.g:374:2: ( ( 'INT' ) )
                    {
                    // InternalArchitecture.g:374:2: ( ( 'INT' ) )
                    // InternalArchitecture.g:375:3: ( 'INT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalArchitecture.g:376:3: ( 'INT' )
                    // InternalArchitecture.g:376:4: 'INT'
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
                    // InternalArchitecture.g:380:2: ( ( 'STRING' ) )
                    {
                    // InternalArchitecture.g:380:2: ( ( 'STRING' ) )
                    // InternalArchitecture.g:381:3: ( 'STRING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalArchitecture.g:382:3: ( 'STRING' )
                    // InternalArchitecture.g:382:4: 'STRING'
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
                    // InternalArchitecture.g:386:2: ( ( 'Boolean' ) )
                    {
                    // InternalArchitecture.g:386:2: ( ( 'Boolean' ) )
                    // InternalArchitecture.g:387:3: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // InternalArchitecture.g:388:3: ( 'Boolean' )
                    // InternalArchitecture.g:388:4: 'Boolean'
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
                    // InternalArchitecture.g:392:2: ( ( 'Double' ) )
                    {
                    // InternalArchitecture.g:392:2: ( ( 'Double' ) )
                    // InternalArchitecture.g:393:3: ( 'Double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }
                    // InternalArchitecture.g:394:3: ( 'Double' )
                    // InternalArchitecture.g:394:4: 'Double'
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
    // InternalArchitecture.g:402:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:406:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalArchitecture.g:407:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:414:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:418:1: ( ( 'domain' ) )
            // InternalArchitecture.g:419:1: ( 'domain' )
            {
            // InternalArchitecture.g:419:1: ( 'domain' )
            // InternalArchitecture.g:420:2: 'domain'
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
    // InternalArchitecture.g:429:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:433:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalArchitecture.g:434:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:441:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:445:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalArchitecture.g:446:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:446:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalArchitecture.g:447:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:448:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalArchitecture.g:448:3: rule__DomainDeclaration__NameAssignment_1
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
    // InternalArchitecture.g:456:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:460:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalArchitecture.g:461:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalArchitecture.g:468:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:472:1: ( ( '{' ) )
            // InternalArchitecture.g:473:1: ( '{' )
            {
            // InternalArchitecture.g:473:1: ( '{' )
            // InternalArchitecture.g:474:2: '{'
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
    // InternalArchitecture.g:483:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:487:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalArchitecture.g:488:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalArchitecture.g:495:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:499:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalArchitecture.g:500:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalArchitecture.g:500:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalArchitecture.g:501:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            }
            // InternalArchitecture.g:502:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalArchitecture.g:502:3: rule__DomainDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DomainDeclaration__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // InternalArchitecture.g:510:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:514:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalArchitecture.g:515:2: rule__DomainDeclaration__Group__4__Impl
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
    // InternalArchitecture.g:521:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:525:1: ( ( '}' ) )
            // InternalArchitecture.g:526:1: ( '}' )
            {
            // InternalArchitecture.g:526:1: ( '}' )
            // InternalArchitecture.g:527:2: '}'
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
    // InternalArchitecture.g:537:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:541:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalArchitecture.g:542:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalArchitecture.g:549:1: rule__AbstractModel__Group__0__Impl : ( ( ruleImport )? ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:553:1: ( ( ( ruleImport )? ) )
            // InternalArchitecture.g:554:1: ( ( ruleImport )? )
            {
            // InternalArchitecture.g:554:1: ( ( ruleImport )? )
            // InternalArchitecture.g:555:2: ( ruleImport )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 
            }
            // InternalArchitecture.g:556:2: ( ruleImport )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArchitecture.g:556:3: ruleImport
                    {
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 
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
    // InternalArchitecture.g:564:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:568:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalArchitecture.g:569:2: rule__AbstractModel__Group__1__Impl
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
    // InternalArchitecture.g:575:1: rule__AbstractModel__Group__1__Impl : ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:579:1: ( ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) )
            // InternalArchitecture.g:580:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            {
            // InternalArchitecture.g:580:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            // InternalArchitecture.g:581:2: ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* )
            {
            // InternalArchitecture.g:581:2: ( ( rule__AbstractModel__CompAssignment_1 ) )
            // InternalArchitecture.g:582:3: ( rule__AbstractModel__CompAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:583:3: ( rule__AbstractModel__CompAssignment_1 )
            // InternalArchitecture.g:583:4: rule__AbstractModel__CompAssignment_1
            {
            pushFollow(FOLLOW_7);
            rule__AbstractModel__CompAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }

            }

            // InternalArchitecture.g:586:2: ( ( rule__AbstractModel__CompAssignment_1 )* )
            // InternalArchitecture.g:587:3: ( rule__AbstractModel__CompAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:588:3: ( rule__AbstractModel__CompAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalArchitecture.g:588:4: rule__AbstractModel__CompAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AbstractModel__CompAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }

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
    // InternalArchitecture.g:598:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:602:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArchitecture.g:603:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:610:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:614:1: ( ( 'import' ) )
            // InternalArchitecture.g:615:1: ( 'import' )
            {
            // InternalArchitecture.g:615:1: ( 'import' )
            // InternalArchitecture.g:616:2: 'import'
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
    // InternalArchitecture.g:625:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:629:1: ( rule__Import__Group__1__Impl )
            // InternalArchitecture.g:630:2: rule__Import__Group__1__Impl
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
    // InternalArchitecture.g:636:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:640:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalArchitecture.g:641:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalArchitecture.g:641:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalArchitecture.g:642:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalArchitecture.g:643:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalArchitecture.g:643:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalArchitecture.g:652:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:656:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalArchitecture.g:657:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalArchitecture.g:664:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:668:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:669:1: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:669:1: ( ruleQualifiedName )
            // InternalArchitecture.g:670:2: ruleQualifiedName
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
    // InternalArchitecture.g:679:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:683:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalArchitecture.g:684:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalArchitecture.g:690:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:694:1: ( ( ( '.*' )? ) )
            // InternalArchitecture.g:695:1: ( ( '.*' )? )
            {
            // InternalArchitecture.g:695:1: ( ( '.*' )? )
            // InternalArchitecture.g:696:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalArchitecture.g:697:2: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalArchitecture.g:697:3: '.*'
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
    // InternalArchitecture.g:706:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:710:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalArchitecture.g:711:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalArchitecture.g:718:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:722:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:723:1: ( RULE_ID )
            {
            // InternalArchitecture.g:723:1: ( RULE_ID )
            // InternalArchitecture.g:724:2: RULE_ID
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
    // InternalArchitecture.g:733:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:737:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalArchitecture.g:738:2: rule__QualifiedName__Group__1__Impl
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
    // InternalArchitecture.g:744:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:748:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalArchitecture.g:749:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalArchitecture.g:749:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalArchitecture.g:750:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalArchitecture.g:751:2: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArchitecture.g:751:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalArchitecture.g:760:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:764:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalArchitecture.g:765:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:772:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:776:1: ( ( '.' ) )
            // InternalArchitecture.g:777:1: ( '.' )
            {
            // InternalArchitecture.g:777:1: ( '.' )
            // InternalArchitecture.g:778:2: '.'
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
    // InternalArchitecture.g:787:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:791:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalArchitecture.g:792:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalArchitecture.g:798:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:802:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:803:1: ( RULE_ID )
            {
            // InternalArchitecture.g:803:1: ( RULE_ID )
            // InternalArchitecture.g:804:2: RULE_ID
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
    // InternalArchitecture.g:814:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:818:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArchitecture.g:819:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:826:1: rule__Component__Group__0__Impl : ( ( 'Component:' ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:830:1: ( ( ( 'Component:' ) ) )
            // InternalArchitecture.g:831:1: ( ( 'Component:' ) )
            {
            // InternalArchitecture.g:831:1: ( ( 'Component:' ) )
            // InternalArchitecture.g:832:2: ( 'Component:' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            }
            // InternalArchitecture.g:833:2: ( 'Component:' )
            // InternalArchitecture.g:833:3: 'Component:'
            {
            match(input,21,FOLLOW_2); if (state.failed) return ;

            }

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
    // InternalArchitecture.g:841:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:845:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArchitecture.g:846:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalArchitecture.g:853:1: rule__Component__Group__1__Impl : ( ( rule__Component__InstAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:857:1: ( ( ( rule__Component__InstAssignment_1 ) ) )
            // InternalArchitecture.g:858:1: ( ( rule__Component__InstAssignment_1 ) )
            {
            // InternalArchitecture.g:858:1: ( ( rule__Component__InstAssignment_1 ) )
            // InternalArchitecture.g:859:2: ( rule__Component__InstAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getInstAssignment_1()); 
            }
            // InternalArchitecture.g:860:2: ( rule__Component__InstAssignment_1 )
            // InternalArchitecture.g:860:3: rule__Component__InstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__InstAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getInstAssignment_1()); 
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
    // InternalArchitecture.g:868:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:872:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalArchitecture.g:873:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:880:1: rule__Component__Group__2__Impl : ( ':' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:884:1: ( ( ':' ) )
            // InternalArchitecture.g:885:1: ( ':' )
            {
            // InternalArchitecture.g:885:1: ( ':' )
            // InternalArchitecture.g:886:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getColonKeyword_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getColonKeyword_2()); 
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
    // InternalArchitecture.g:895:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:899:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalArchitecture.g:900:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalArchitecture.g:907:1: rule__Component__Group__3__Impl : ( ( rule__Component__NameAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:911:1: ( ( ( rule__Component__NameAssignment_3 ) ) )
            // InternalArchitecture.g:912:1: ( ( rule__Component__NameAssignment_3 ) )
            {
            // InternalArchitecture.g:912:1: ( ( rule__Component__NameAssignment_3 ) )
            // InternalArchitecture.g:913:2: ( rule__Component__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_3()); 
            }
            // InternalArchitecture.g:914:2: ( rule__Component__NameAssignment_3 )
            // InternalArchitecture.g:914:3: rule__Component__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getNameAssignment_3()); 
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
    // InternalArchitecture.g:922:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:926:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalArchitecture.g:927:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:934:1: rule__Component__Group__4__Impl : ( 'ProvidedServices:' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:938:1: ( ( 'ProvidedServices:' ) )
            // InternalArchitecture.g:939:1: ( 'ProvidedServices:' )
            {
            // InternalArchitecture.g:939:1: ( 'ProvidedServices:' )
            // InternalArchitecture.g:940:2: 'ProvidedServices:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getProvidedServicesKeyword_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getProvidedServicesKeyword_4()); 
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
    // InternalArchitecture.g:949:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:953:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalArchitecture.g:954:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:961:1: rule__Component__Group__5__Impl : ( 'conf(' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:965:1: ( ( 'conf(' ) )
            // InternalArchitecture.g:966:1: ( 'conf(' )
            {
            // InternalArchitecture.g:966:1: ( 'conf(' )
            // InternalArchitecture.g:967:2: 'conf('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getConfKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getConfKeyword_5()); 
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
    // InternalArchitecture.g:976:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:980:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalArchitecture.g:981:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:988:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:992:1: ( ( ( rule__Component__Group_6__0 )* ) )
            // InternalArchitecture.g:993:1: ( ( rule__Component__Group_6__0 )* )
            {
            // InternalArchitecture.g:993:1: ( ( rule__Component__Group_6__0 )* )
            // InternalArchitecture.g:994:2: ( rule__Component__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_6()); 
            }
            // InternalArchitecture.g:995:2: ( rule__Component__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==22) ) {
                        switch ( input.LA(3) ) {
                        case 11:
                            {
                            int LA8_3 = input.LA(4);

                            if ( (LA8_3==27) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 12:
                            {
                            int LA8_4 = input.LA(4);

                            if ( (LA8_4==27) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA8_5 = input.LA(4);

                            if ( (LA8_5==27) ) {
                                alt8=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA8_6 = input.LA(4);

                            if ( (LA8_6==27) ) {
                                alt8=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalArchitecture.g:995:3: rule__Component__Group_6__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_6()); 
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
    // InternalArchitecture.g:1003:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1007:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalArchitecture.g:1008:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_16);
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
    // InternalArchitecture.g:1015:1: rule__Component__Group__7__Impl : ( ( rule__Component__Arg1Assignment_7 ) ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1019:1: ( ( ( rule__Component__Arg1Assignment_7 ) ) )
            // InternalArchitecture.g:1020:1: ( ( rule__Component__Arg1Assignment_7 ) )
            {
            // InternalArchitecture.g:1020:1: ( ( rule__Component__Arg1Assignment_7 ) )
            // InternalArchitecture.g:1021:2: ( rule__Component__Arg1Assignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArg1Assignment_7()); 
            }
            // InternalArchitecture.g:1022:2: ( rule__Component__Arg1Assignment_7 )
            // InternalArchitecture.g:1022:3: rule__Component__Arg1Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Component__Arg1Assignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArg1Assignment_7()); 
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
    // InternalArchitecture.g:1030:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1034:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalArchitecture.g:1035:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_17);
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
    // InternalArchitecture.g:1042:1: rule__Component__Group__8__Impl : ( ')' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1046:1: ( ( ')' ) )
            // InternalArchitecture.g:1047:1: ( ')' )
            {
            // InternalArchitecture.g:1047:1: ( ')' )
            // InternalArchitecture.g:1048:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_8()); 
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
    // InternalArchitecture.g:1057:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1061:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalArchitecture.g:1062:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_17);
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
    // InternalArchitecture.g:1069:1: rule__Component__Group__9__Impl : ( ( rule__Component__Group_9__0 )* ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1073:1: ( ( ( rule__Component__Group_9__0 )* ) )
            // InternalArchitecture.g:1074:1: ( ( rule__Component__Group_9__0 )* )
            {
            // InternalArchitecture.g:1074:1: ( ( rule__Component__Group_9__0 )* )
            // InternalArchitecture.g:1075:2: ( rule__Component__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9()); 
            }
            // InternalArchitecture.g:1076:2: ( rule__Component__Group_9__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_2 = input.LA(2);

                    if ( (LA9_2==28) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalArchitecture.g:1076:3: rule__Component__Group_9__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalArchitecture.g:1084:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1088:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalArchitecture.g:1089:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_17);
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
    // InternalArchitecture.g:1096:1: rule__Component__Group__10__Impl : ( ( 'RequiredServices:' )? ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1100:1: ( ( ( 'RequiredServices:' )? ) )
            // InternalArchitecture.g:1101:1: ( ( 'RequiredServices:' )? )
            {
            // InternalArchitecture.g:1101:1: ( ( 'RequiredServices:' )? )
            // InternalArchitecture.g:1102:2: ( 'RequiredServices:' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRequiredServicesKeyword_10()); 
            }
            // InternalArchitecture.g:1103:2: ( 'RequiredServices:' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArchitecture.g:1103:3: 'RequiredServices:'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRequiredServicesKeyword_10()); 
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
    // InternalArchitecture.g:1111:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1115:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalArchitecture.g:1116:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_17);
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
    // InternalArchitecture.g:1123:1: rule__Component__Group__11__Impl : ( ( rule__Component__ReqAssignment_11 )* ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1127:1: ( ( ( rule__Component__ReqAssignment_11 )* ) )
            // InternalArchitecture.g:1128:1: ( ( rule__Component__ReqAssignment_11 )* )
            {
            // InternalArchitecture.g:1128:1: ( ( rule__Component__ReqAssignment_11 )* )
            // InternalArchitecture.g:1129:2: ( rule__Component__ReqAssignment_11 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getReqAssignment_11()); 
            }
            // InternalArchitecture.g:1130:2: ( rule__Component__ReqAssignment_11 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:1130:3: rule__Component__ReqAssignment_11
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__ReqAssignment_11();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getReqAssignment_11()); 
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
    // InternalArchitecture.g:1138:1: rule__Component__Group__12 : rule__Component__Group__12__Impl ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1142:1: ( rule__Component__Group__12__Impl )
            // InternalArchitecture.g:1143:2: rule__Component__Group__12__Impl
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
    // InternalArchitecture.g:1149:1: rule__Component__Group__12__Impl : ( ( rule__Component__BindAssignment_12 )* ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1153:1: ( ( ( rule__Component__BindAssignment_12 )* ) )
            // InternalArchitecture.g:1154:1: ( ( rule__Component__BindAssignment_12 )* )
            {
            // InternalArchitecture.g:1154:1: ( ( rule__Component__BindAssignment_12 )* )
            // InternalArchitecture.g:1155:2: ( rule__Component__BindAssignment_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getBindAssignment_12()); 
            }
            // InternalArchitecture.g:1156:2: ( rule__Component__BindAssignment_12 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:1156:3: rule__Component__BindAssignment_12
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Component__BindAssignment_12();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getBindAssignment_12()); 
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


    // $ANTLR start "rule__Component__Group_6__0"
    // InternalArchitecture.g:1165:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1169:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // InternalArchitecture.g:1170:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_6__1();

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
    // $ANTLR end "rule__Component__Group_6__0"


    // $ANTLR start "rule__Component__Group_6__0__Impl"
    // InternalArchitecture.g:1177:1: rule__Component__Group_6__0__Impl : ( ( rule__Component__ArgAssignment_6_0 ) ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1181:1: ( ( ( rule__Component__ArgAssignment_6_0 ) ) )
            // InternalArchitecture.g:1182:1: ( ( rule__Component__ArgAssignment_6_0 ) )
            {
            // InternalArchitecture.g:1182:1: ( ( rule__Component__ArgAssignment_6_0 ) )
            // InternalArchitecture.g:1183:2: ( rule__Component__ArgAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_6_0()); 
            }
            // InternalArchitecture.g:1184:2: ( rule__Component__ArgAssignment_6_0 )
            // InternalArchitecture.g:1184:3: rule__Component__ArgAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgAssignment_6_0()); 
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
    // $ANTLR end "rule__Component__Group_6__0__Impl"


    // $ANTLR start "rule__Component__Group_6__1"
    // InternalArchitecture.g:1192:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1196:1: ( rule__Component__Group_6__1__Impl )
            // InternalArchitecture.g:1197:2: rule__Component__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_6__1__Impl();

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
    // $ANTLR end "rule__Component__Group_6__1"


    // $ANTLR start "rule__Component__Group_6__1__Impl"
    // InternalArchitecture.g:1203:1: rule__Component__Group_6__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1207:1: ( ( ',' ) )
            // InternalArchitecture.g:1208:1: ( ',' )
            {
            // InternalArchitecture.g:1208:1: ( ',' )
            // InternalArchitecture.g:1209:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_6_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCommaKeyword_6_1()); 
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
    // $ANTLR end "rule__Component__Group_6__1__Impl"


    // $ANTLR start "rule__Component__Group_9__0"
    // InternalArchitecture.g:1219:1: rule__Component__Group_9__0 : rule__Component__Group_9__0__Impl rule__Component__Group_9__1 ;
    public final void rule__Component__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1223:1: ( rule__Component__Group_9__0__Impl rule__Component__Group_9__1 )
            // InternalArchitecture.g:1224:2: rule__Component__Group_9__0__Impl rule__Component__Group_9__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalArchitecture.g:1231:1: rule__Component__Group_9__0__Impl : ( ( rule__Component__MethodeAssignment_9_0 ) ) ;
    public final void rule__Component__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1235:1: ( ( ( rule__Component__MethodeAssignment_9_0 ) ) )
            // InternalArchitecture.g:1236:1: ( ( rule__Component__MethodeAssignment_9_0 ) )
            {
            // InternalArchitecture.g:1236:1: ( ( rule__Component__MethodeAssignment_9_0 ) )
            // InternalArchitecture.g:1237:2: ( rule__Component__MethodeAssignment_9_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMethodeAssignment_9_0()); 
            }
            // InternalArchitecture.g:1238:2: ( rule__Component__MethodeAssignment_9_0 )
            // InternalArchitecture.g:1238:3: rule__Component__MethodeAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__MethodeAssignment_9_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMethodeAssignment_9_0()); 
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
    // InternalArchitecture.g:1246:1: rule__Component__Group_9__1 : rule__Component__Group_9__1__Impl rule__Component__Group_9__2 ;
    public final void rule__Component__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1250:1: ( rule__Component__Group_9__1__Impl rule__Component__Group_9__2 )
            // InternalArchitecture.g:1251:2: rule__Component__Group_9__1__Impl rule__Component__Group_9__2
            {
            pushFollow(FOLLOW_21);
            rule__Component__Group_9__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__2();

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
    // InternalArchitecture.g:1258:1: rule__Component__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1262:1: ( ( '(' ) )
            // InternalArchitecture.g:1263:1: ( '(' )
            {
            // InternalArchitecture.g:1263:1: ( '(' )
            // InternalArchitecture.g:1264:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1()); 
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


    // $ANTLR start "rule__Component__Group_9__2"
    // InternalArchitecture.g:1273:1: rule__Component__Group_9__2 : rule__Component__Group_9__2__Impl rule__Component__Group_9__3 ;
    public final void rule__Component__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1277:1: ( rule__Component__Group_9__2__Impl rule__Component__Group_9__3 )
            // InternalArchitecture.g:1278:2: rule__Component__Group_9__2__Impl rule__Component__Group_9__3
            {
            pushFollow(FOLLOW_21);
            rule__Component__Group_9__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__3();

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
    // $ANTLR end "rule__Component__Group_9__2"


    // $ANTLR start "rule__Component__Group_9__2__Impl"
    // InternalArchitecture.g:1285:1: rule__Component__Group_9__2__Impl : ( ( rule__Component__Group_9_2__0 )* ) ;
    public final void rule__Component__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1289:1: ( ( ( rule__Component__Group_9_2__0 )* ) )
            // InternalArchitecture.g:1290:1: ( ( rule__Component__Group_9_2__0 )* )
            {
            // InternalArchitecture.g:1290:1: ( ( rule__Component__Group_9_2__0 )* )
            // InternalArchitecture.g:1291:2: ( rule__Component__Group_9_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_2()); 
            }
            // InternalArchitecture.g:1292:2: ( rule__Component__Group_9_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArchitecture.g:1292:3: rule__Component__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__Group_9_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_9_2()); 
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
    // $ANTLR end "rule__Component__Group_9__2__Impl"


    // $ANTLR start "rule__Component__Group_9__3"
    // InternalArchitecture.g:1300:1: rule__Component__Group_9__3 : rule__Component__Group_9__3__Impl rule__Component__Group_9__4 ;
    public final void rule__Component__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1304:1: ( rule__Component__Group_9__3__Impl rule__Component__Group_9__4 )
            // InternalArchitecture.g:1305:2: rule__Component__Group_9__3__Impl rule__Component__Group_9__4
            {
            pushFollow(FOLLOW_12);
            rule__Component__Group_9__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__4();

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
    // $ANTLR end "rule__Component__Group_9__3"


    // $ANTLR start "rule__Component__Group_9__3__Impl"
    // InternalArchitecture.g:1312:1: rule__Component__Group_9__3__Impl : ( ')' ) ;
    public final void rule__Component__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1316:1: ( ( ')' ) )
            // InternalArchitecture.g:1317:1: ( ')' )
            {
            // InternalArchitecture.g:1317:1: ( ')' )
            // InternalArchitecture.g:1318:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3()); 
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
    // $ANTLR end "rule__Component__Group_9__3__Impl"


    // $ANTLR start "rule__Component__Group_9__4"
    // InternalArchitecture.g:1327:1: rule__Component__Group_9__4 : rule__Component__Group_9__4__Impl ;
    public final void rule__Component__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1331:1: ( rule__Component__Group_9__4__Impl )
            // InternalArchitecture.g:1332:2: rule__Component__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__4__Impl();

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
    // $ANTLR end "rule__Component__Group_9__4"


    // $ANTLR start "rule__Component__Group_9__4__Impl"
    // InternalArchitecture.g:1338:1: rule__Component__Group_9__4__Impl : ( ( rule__Component__Group_9_4__0 )? ) ;
    public final void rule__Component__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1342:1: ( ( ( rule__Component__Group_9_4__0 )? ) )
            // InternalArchitecture.g:1343:1: ( ( rule__Component__Group_9_4__0 )? )
            {
            // InternalArchitecture.g:1343:1: ( ( rule__Component__Group_9_4__0 )? )
            // InternalArchitecture.g:1344:2: ( rule__Component__Group_9_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_4()); 
            }
            // InternalArchitecture.g:1345:2: ( rule__Component__Group_9_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArchitecture.g:1345:3: rule__Component__Group_9_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_9_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_9_4()); 
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
    // $ANTLR end "rule__Component__Group_9__4__Impl"


    // $ANTLR start "rule__Component__Group_9_2__0"
    // InternalArchitecture.g:1354:1: rule__Component__Group_9_2__0 : rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1 ;
    public final void rule__Component__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1358:1: ( rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1 )
            // InternalArchitecture.g:1359:2: rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_9_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2__1();

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
    // $ANTLR end "rule__Component__Group_9_2__0"


    // $ANTLR start "rule__Component__Group_9_2__0__Impl"
    // InternalArchitecture.g:1366:1: rule__Component__Group_9_2__0__Impl : ( ( rule__Component__Group_9_2_0__0 )* ) ;
    public final void rule__Component__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1370:1: ( ( ( rule__Component__Group_9_2_0__0 )* ) )
            // InternalArchitecture.g:1371:1: ( ( rule__Component__Group_9_2_0__0 )* )
            {
            // InternalArchitecture.g:1371:1: ( ( rule__Component__Group_9_2_0__0 )* )
            // InternalArchitecture.g:1372:2: ( rule__Component__Group_9_2_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_2_0()); 
            }
            // InternalArchitecture.g:1373:2: ( rule__Component__Group_9_2_0__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==22) ) {
                        switch ( input.LA(3) ) {
                        case 11:
                            {
                            int LA15_3 = input.LA(4);

                            if ( (LA15_3==27) ) {
                                alt15=1;
                            }


                            }
                            break;
                        case 12:
                            {
                            int LA15_4 = input.LA(4);

                            if ( (LA15_4==27) ) {
                                alt15=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==27) ) {
                                alt15=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA15_6 = input.LA(4);

                            if ( (LA15_6==27) ) {
                                alt15=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalArchitecture.g:1373:3: rule__Component__Group_9_2_0__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__Group_9_2_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_9_2_0()); 
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
    // $ANTLR end "rule__Component__Group_9_2__0__Impl"


    // $ANTLR start "rule__Component__Group_9_2__1"
    // InternalArchitecture.g:1381:1: rule__Component__Group_9_2__1 : rule__Component__Group_9_2__1__Impl ;
    public final void rule__Component__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1385:1: ( rule__Component__Group_9_2__1__Impl )
            // InternalArchitecture.g:1386:2: rule__Component__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2__1__Impl();

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
    // $ANTLR end "rule__Component__Group_9_2__1"


    // $ANTLR start "rule__Component__Group_9_2__1__Impl"
    // InternalArchitecture.g:1392:1: rule__Component__Group_9_2__1__Impl : ( ( rule__Component__ArgAssignment_9_2_1 ) ) ;
    public final void rule__Component__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1396:1: ( ( ( rule__Component__ArgAssignment_9_2_1 ) ) )
            // InternalArchitecture.g:1397:1: ( ( rule__Component__ArgAssignment_9_2_1 ) )
            {
            // InternalArchitecture.g:1397:1: ( ( rule__Component__ArgAssignment_9_2_1 ) )
            // InternalArchitecture.g:1398:2: ( rule__Component__ArgAssignment_9_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_9_2_1()); 
            }
            // InternalArchitecture.g:1399:2: ( rule__Component__ArgAssignment_9_2_1 )
            // InternalArchitecture.g:1399:3: rule__Component__ArgAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_9_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgAssignment_9_2_1()); 
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
    // $ANTLR end "rule__Component__Group_9_2__1__Impl"


    // $ANTLR start "rule__Component__Group_9_2_0__0"
    // InternalArchitecture.g:1408:1: rule__Component__Group_9_2_0__0 : rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1 ;
    public final void rule__Component__Group_9_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1412:1: ( rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1 )
            // InternalArchitecture.g:1413:2: rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group_9_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2_0__1();

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
    // $ANTLR end "rule__Component__Group_9_2_0__0"


    // $ANTLR start "rule__Component__Group_9_2_0__0__Impl"
    // InternalArchitecture.g:1420:1: rule__Component__Group_9_2_0__0__Impl : ( ( rule__Component__ArgAssignment_9_2_0_0 ) ) ;
    public final void rule__Component__Group_9_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1424:1: ( ( ( rule__Component__ArgAssignment_9_2_0_0 ) ) )
            // InternalArchitecture.g:1425:1: ( ( rule__Component__ArgAssignment_9_2_0_0 ) )
            {
            // InternalArchitecture.g:1425:1: ( ( rule__Component__ArgAssignment_9_2_0_0 ) )
            // InternalArchitecture.g:1426:2: ( rule__Component__ArgAssignment_9_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_9_2_0_0()); 
            }
            // InternalArchitecture.g:1427:2: ( rule__Component__ArgAssignment_9_2_0_0 )
            // InternalArchitecture.g:1427:3: rule__Component__ArgAssignment_9_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_9_2_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgAssignment_9_2_0_0()); 
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
    // $ANTLR end "rule__Component__Group_9_2_0__0__Impl"


    // $ANTLR start "rule__Component__Group_9_2_0__1"
    // InternalArchitecture.g:1435:1: rule__Component__Group_9_2_0__1 : rule__Component__Group_9_2_0__1__Impl ;
    public final void rule__Component__Group_9_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1439:1: ( rule__Component__Group_9_2_0__1__Impl )
            // InternalArchitecture.g:1440:2: rule__Component__Group_9_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2_0__1__Impl();

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
    // $ANTLR end "rule__Component__Group_9_2_0__1"


    // $ANTLR start "rule__Component__Group_9_2_0__1__Impl"
    // InternalArchitecture.g:1446:1: rule__Component__Group_9_2_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_9_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1450:1: ( ( ',' ) )
            // InternalArchitecture.g:1451:1: ( ',' )
            {
            // InternalArchitecture.g:1451:1: ( ',' )
            // InternalArchitecture.g:1452:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1()); 
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
    // $ANTLR end "rule__Component__Group_9_2_0__1__Impl"


    // $ANTLR start "rule__Component__Group_9_4__0"
    // InternalArchitecture.g:1462:1: rule__Component__Group_9_4__0 : rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1 ;
    public final void rule__Component__Group_9_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1466:1: ( rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1 )
            // InternalArchitecture.g:1467:2: rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_9_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_4__1();

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
    // $ANTLR end "rule__Component__Group_9_4__0"


    // $ANTLR start "rule__Component__Group_9_4__0__Impl"
    // InternalArchitecture.g:1474:1: rule__Component__Group_9_4__0__Impl : ( ':' ) ;
    public final void rule__Component__Group_9_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1478:1: ( ( ':' ) )
            // InternalArchitecture.g:1479:1: ( ':' )
            {
            // InternalArchitecture.g:1479:1: ( ':' )
            // InternalArchitecture.g:1480:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getColonKeyword_9_4_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getColonKeyword_9_4_0()); 
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
    // $ANTLR end "rule__Component__Group_9_4__0__Impl"


    // $ANTLR start "rule__Component__Group_9_4__1"
    // InternalArchitecture.g:1489:1: rule__Component__Group_9_4__1 : rule__Component__Group_9_4__1__Impl ;
    public final void rule__Component__Group_9_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1493:1: ( rule__Component__Group_9_4__1__Impl )
            // InternalArchitecture.g:1494:2: rule__Component__Group_9_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_4__1__Impl();

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
    // $ANTLR end "rule__Component__Group_9_4__1"


    // $ANTLR start "rule__Component__Group_9_4__1__Impl"
    // InternalArchitecture.g:1500:1: rule__Component__Group_9_4__1__Impl : ( ( rule__Component__ArgAssignment_9_4_1 ) ) ;
    public final void rule__Component__Group_9_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1504:1: ( ( ( rule__Component__ArgAssignment_9_4_1 ) ) )
            // InternalArchitecture.g:1505:1: ( ( rule__Component__ArgAssignment_9_4_1 ) )
            {
            // InternalArchitecture.g:1505:1: ( ( rule__Component__ArgAssignment_9_4_1 ) )
            // InternalArchitecture.g:1506:2: ( rule__Component__ArgAssignment_9_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_9_4_1()); 
            }
            // InternalArchitecture.g:1507:2: ( rule__Component__ArgAssignment_9_4_1 )
            // InternalArchitecture.g:1507:3: rule__Component__ArgAssignment_9_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_9_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgAssignment_9_4_1()); 
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
    // $ANTLR end "rule__Component__Group_9_4__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalArchitecture.g:1516:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1520:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1521:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalArchitecture.g:1528:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1532:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1533:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1533:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1534:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalArchitecture.g:1535:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1535:3: rule__Variable__NameAssignment_0
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
    // InternalArchitecture.g:1543:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1547:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1548:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalArchitecture.g:1555:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1559:1: ( ( ':' ) )
            // InternalArchitecture.g:1560:1: ( ':' )
            {
            // InternalArchitecture.g:1560:1: ( ':' )
            // InternalArchitecture.g:1561:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1570:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1574:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1575:2: rule__Variable__Group__2__Impl
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
    // InternalArchitecture.g:1581:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1585:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1586:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1586:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1587:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalArchitecture.g:1588:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1588:3: rule__Variable__TypeAssignment_2
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


    // $ANTLR start "rule__Bindings__Group__0"
    // InternalArchitecture.g:1597:1: rule__Bindings__Group__0 : rule__Bindings__Group__0__Impl rule__Bindings__Group__1 ;
    public final void rule__Bindings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1601:1: ( rule__Bindings__Group__0__Impl rule__Bindings__Group__1 )
            // InternalArchitecture.g:1602:2: rule__Bindings__Group__0__Impl rule__Bindings__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Bindings__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__1();

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
    // $ANTLR end "rule__Bindings__Group__0"


    // $ANTLR start "rule__Bindings__Group__0__Impl"
    // InternalArchitecture.g:1609:1: rule__Bindings__Group__0__Impl : ( 'bind(' ) ;
    public final void rule__Bindings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1613:1: ( ( 'bind(' ) )
            // InternalArchitecture.g:1614:1: ( 'bind(' )
            {
            // InternalArchitecture.g:1614:1: ( 'bind(' )
            // InternalArchitecture.g:1615:2: 'bind('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getBindKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getBindKeyword_0()); 
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
    // $ANTLR end "rule__Bindings__Group__0__Impl"


    // $ANTLR start "rule__Bindings__Group__1"
    // InternalArchitecture.g:1624:1: rule__Bindings__Group__1 : rule__Bindings__Group__1__Impl rule__Bindings__Group__2 ;
    public final void rule__Bindings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1628:1: ( rule__Bindings__Group__1__Impl rule__Bindings__Group__2 )
            // InternalArchitecture.g:1629:2: rule__Bindings__Group__1__Impl rule__Bindings__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Bindings__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__2();

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
    // $ANTLR end "rule__Bindings__Group__1"


    // $ANTLR start "rule__Bindings__Group__1__Impl"
    // InternalArchitecture.g:1636:1: rule__Bindings__Group__1__Impl : ( ( rule__Bindings__NameComp1Assignment_1 ) ) ;
    public final void rule__Bindings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1640:1: ( ( ( rule__Bindings__NameComp1Assignment_1 ) ) )
            // InternalArchitecture.g:1641:1: ( ( rule__Bindings__NameComp1Assignment_1 ) )
            {
            // InternalArchitecture.g:1641:1: ( ( rule__Bindings__NameComp1Assignment_1 ) )
            // InternalArchitecture.g:1642:2: ( rule__Bindings__NameComp1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1Assignment_1()); 
            }
            // InternalArchitecture.g:1643:2: ( rule__Bindings__NameComp1Assignment_1 )
            // InternalArchitecture.g:1643:3: rule__Bindings__NameComp1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameComp1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp1Assignment_1()); 
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
    // $ANTLR end "rule__Bindings__Group__1__Impl"


    // $ANTLR start "rule__Bindings__Group__2"
    // InternalArchitecture.g:1651:1: rule__Bindings__Group__2 : rule__Bindings__Group__2__Impl rule__Bindings__Group__3 ;
    public final void rule__Bindings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1655:1: ( rule__Bindings__Group__2__Impl rule__Bindings__Group__3 )
            // InternalArchitecture.g:1656:2: rule__Bindings__Group__2__Impl rule__Bindings__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Bindings__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__3();

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
    // $ANTLR end "rule__Bindings__Group__2"


    // $ANTLR start "rule__Bindings__Group__2__Impl"
    // InternalArchitecture.g:1663:1: rule__Bindings__Group__2__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1667:1: ( ( '.' ) )
            // InternalArchitecture.g:1668:1: ( '.' )
            {
            // InternalArchitecture.g:1668:1: ( '.' )
            // InternalArchitecture.g:1669:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getFullStopKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getFullStopKeyword_2()); 
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
    // $ANTLR end "rule__Bindings__Group__2__Impl"


    // $ANTLR start "rule__Bindings__Group__3"
    // InternalArchitecture.g:1678:1: rule__Bindings__Group__3 : rule__Bindings__Group__3__Impl rule__Bindings__Group__4 ;
    public final void rule__Bindings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1682:1: ( rule__Bindings__Group__3__Impl rule__Bindings__Group__4 )
            // InternalArchitecture.g:1683:2: rule__Bindings__Group__3__Impl rule__Bindings__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Bindings__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__4();

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
    // $ANTLR end "rule__Bindings__Group__3"


    // $ANTLR start "rule__Bindings__Group__3__Impl"
    // InternalArchitecture.g:1690:1: rule__Bindings__Group__3__Impl : ( ( rule__Bindings__NameServ1Assignment_3 ) ) ;
    public final void rule__Bindings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1694:1: ( ( ( rule__Bindings__NameServ1Assignment_3 ) ) )
            // InternalArchitecture.g:1695:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            {
            // InternalArchitecture.g:1695:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            // InternalArchitecture.g:1696:2: ( rule__Bindings__NameServ1Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1Assignment_3()); 
            }
            // InternalArchitecture.g:1697:2: ( rule__Bindings__NameServ1Assignment_3 )
            // InternalArchitecture.g:1697:3: rule__Bindings__NameServ1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameServ1Assignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ1Assignment_3()); 
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
    // $ANTLR end "rule__Bindings__Group__3__Impl"


    // $ANTLR start "rule__Bindings__Group__4"
    // InternalArchitecture.g:1705:1: rule__Bindings__Group__4 : rule__Bindings__Group__4__Impl rule__Bindings__Group__5 ;
    public final void rule__Bindings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1709:1: ( rule__Bindings__Group__4__Impl rule__Bindings__Group__5 )
            // InternalArchitecture.g:1710:2: rule__Bindings__Group__4__Impl rule__Bindings__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Bindings__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__5();

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
    // $ANTLR end "rule__Bindings__Group__4"


    // $ANTLR start "rule__Bindings__Group__4__Impl"
    // InternalArchitecture.g:1717:1: rule__Bindings__Group__4__Impl : ( ',' ) ;
    public final void rule__Bindings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1721:1: ( ( ',' ) )
            // InternalArchitecture.g:1722:1: ( ',' )
            {
            // InternalArchitecture.g:1722:1: ( ',' )
            // InternalArchitecture.g:1723:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getCommaKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getCommaKeyword_4()); 
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
    // $ANTLR end "rule__Bindings__Group__4__Impl"


    // $ANTLR start "rule__Bindings__Group__5"
    // InternalArchitecture.g:1732:1: rule__Bindings__Group__5 : rule__Bindings__Group__5__Impl rule__Bindings__Group__6 ;
    public final void rule__Bindings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1736:1: ( rule__Bindings__Group__5__Impl rule__Bindings__Group__6 )
            // InternalArchitecture.g:1737:2: rule__Bindings__Group__5__Impl rule__Bindings__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Bindings__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__6();

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
    // $ANTLR end "rule__Bindings__Group__5"


    // $ANTLR start "rule__Bindings__Group__5__Impl"
    // InternalArchitecture.g:1744:1: rule__Bindings__Group__5__Impl : ( ( rule__Bindings__NameComp2Assignment_5 ) ) ;
    public final void rule__Bindings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1748:1: ( ( ( rule__Bindings__NameComp2Assignment_5 ) ) )
            // InternalArchitecture.g:1749:1: ( ( rule__Bindings__NameComp2Assignment_5 ) )
            {
            // InternalArchitecture.g:1749:1: ( ( rule__Bindings__NameComp2Assignment_5 ) )
            // InternalArchitecture.g:1750:2: ( rule__Bindings__NameComp2Assignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp2Assignment_5()); 
            }
            // InternalArchitecture.g:1751:2: ( rule__Bindings__NameComp2Assignment_5 )
            // InternalArchitecture.g:1751:3: rule__Bindings__NameComp2Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameComp2Assignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp2Assignment_5()); 
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
    // $ANTLR end "rule__Bindings__Group__5__Impl"


    // $ANTLR start "rule__Bindings__Group__6"
    // InternalArchitecture.g:1759:1: rule__Bindings__Group__6 : rule__Bindings__Group__6__Impl rule__Bindings__Group__7 ;
    public final void rule__Bindings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1763:1: ( rule__Bindings__Group__6__Impl rule__Bindings__Group__7 )
            // InternalArchitecture.g:1764:2: rule__Bindings__Group__6__Impl rule__Bindings__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Bindings__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__7();

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
    // $ANTLR end "rule__Bindings__Group__6"


    // $ANTLR start "rule__Bindings__Group__6__Impl"
    // InternalArchitecture.g:1771:1: rule__Bindings__Group__6__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1775:1: ( ( '.' ) )
            // InternalArchitecture.g:1776:1: ( '.' )
            {
            // InternalArchitecture.g:1776:1: ( '.' )
            // InternalArchitecture.g:1777:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getFullStopKeyword_6()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getFullStopKeyword_6()); 
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
    // $ANTLR end "rule__Bindings__Group__6__Impl"


    // $ANTLR start "rule__Bindings__Group__7"
    // InternalArchitecture.g:1786:1: rule__Bindings__Group__7 : rule__Bindings__Group__7__Impl rule__Bindings__Group__8 ;
    public final void rule__Bindings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1790:1: ( rule__Bindings__Group__7__Impl rule__Bindings__Group__8 )
            // InternalArchitecture.g:1791:2: rule__Bindings__Group__7__Impl rule__Bindings__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Bindings__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__8();

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
    // $ANTLR end "rule__Bindings__Group__7"


    // $ANTLR start "rule__Bindings__Group__7__Impl"
    // InternalArchitecture.g:1798:1: rule__Bindings__Group__7__Impl : ( ( rule__Bindings__NameServ2Assignment_7 ) ) ;
    public final void rule__Bindings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1802:1: ( ( ( rule__Bindings__NameServ2Assignment_7 ) ) )
            // InternalArchitecture.g:1803:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            {
            // InternalArchitecture.g:1803:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            // InternalArchitecture.g:1804:2: ( rule__Bindings__NameServ2Assignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2Assignment_7()); 
            }
            // InternalArchitecture.g:1805:2: ( rule__Bindings__NameServ2Assignment_7 )
            // InternalArchitecture.g:1805:3: rule__Bindings__NameServ2Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameServ2Assignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ2Assignment_7()); 
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
    // $ANTLR end "rule__Bindings__Group__7__Impl"


    // $ANTLR start "rule__Bindings__Group__8"
    // InternalArchitecture.g:1813:1: rule__Bindings__Group__8 : rule__Bindings__Group__8__Impl ;
    public final void rule__Bindings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1817:1: ( rule__Bindings__Group__8__Impl )
            // InternalArchitecture.g:1818:2: rule__Bindings__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__8__Impl();

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
    // $ANTLR end "rule__Bindings__Group__8"


    // $ANTLR start "rule__Bindings__Group__8__Impl"
    // InternalArchitecture.g:1824:1: rule__Bindings__Group__8__Impl : ( ')' ) ;
    public final void rule__Bindings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1828:1: ( ( ')' ) )
            // InternalArchitecture.g:1829:1: ( ')' )
            {
            // InternalArchitecture.g:1829:1: ( ')' )
            // InternalArchitecture.g:1830:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8()); 
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
    // $ANTLR end "rule__Bindings__Group__8__Impl"


    // $ANTLR start "rule__RequiredService__Group__0"
    // InternalArchitecture.g:1840:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1844:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalArchitecture.g:1845:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__RequiredService__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__1();

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
    // $ANTLR end "rule__RequiredService__Group__0"


    // $ANTLR start "rule__RequiredService__Group__0__Impl"
    // InternalArchitecture.g:1852:1: rule__RequiredService__Group__0__Impl : ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1856:1: ( ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) )
            // InternalArchitecture.g:1857:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            {
            // InternalArchitecture.g:1857:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            // InternalArchitecture.g:1858:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameVarMethodeAssignment_0()); 
            }
            // InternalArchitecture.g:1859:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            // InternalArchitecture.g:1859:3: rule__RequiredService__NameVarMethodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameVarMethodeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameVarMethodeAssignment_0()); 
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
    // $ANTLR end "rule__RequiredService__Group__0__Impl"


    // $ANTLR start "rule__RequiredService__Group__1"
    // InternalArchitecture.g:1867:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1871:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalArchitecture.g:1872:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RequiredService__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__2();

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
    // $ANTLR end "rule__RequiredService__Group__1"


    // $ANTLR start "rule__RequiredService__Group__1__Impl"
    // InternalArchitecture.g:1879:1: rule__RequiredService__Group__1__Impl : ( ':=' ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1883:1: ( ( ':=' ) )
            // InternalArchitecture.g:1884:1: ( ':=' )
            {
            // InternalArchitecture.g:1884:1: ( ':=' )
            // InternalArchitecture.g:1885:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__RequiredService__Group__1__Impl"


    // $ANTLR start "rule__RequiredService__Group__2"
    // InternalArchitecture.g:1894:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1898:1: ( rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 )
            // InternalArchitecture.g:1899:2: rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__RequiredService__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__3();

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
    // $ANTLR end "rule__RequiredService__Group__2"


    // $ANTLR start "rule__RequiredService__Group__2__Impl"
    // InternalArchitecture.g:1906:1: rule__RequiredService__Group__2__Impl : ( ( rule__RequiredService__NameCompAssignment_2 ) ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1910:1: ( ( ( rule__RequiredService__NameCompAssignment_2 ) ) )
            // InternalArchitecture.g:1911:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            {
            // InternalArchitecture.g:1911:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            // InternalArchitecture.g:1912:2: ( rule__RequiredService__NameCompAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameCompAssignment_2()); 
            }
            // InternalArchitecture.g:1913:2: ( rule__RequiredService__NameCompAssignment_2 )
            // InternalArchitecture.g:1913:3: rule__RequiredService__NameCompAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameCompAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameCompAssignment_2()); 
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
    // $ANTLR end "rule__RequiredService__Group__2__Impl"


    // $ANTLR start "rule__RequiredService__Group__3"
    // InternalArchitecture.g:1921:1: rule__RequiredService__Group__3 : rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 ;
    public final void rule__RequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1925:1: ( rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 )
            // InternalArchitecture.g:1926:2: rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RequiredService__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__4();

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
    // $ANTLR end "rule__RequiredService__Group__3"


    // $ANTLR start "rule__RequiredService__Group__3__Impl"
    // InternalArchitecture.g:1933:1: rule__RequiredService__Group__3__Impl : ( '.' ) ;
    public final void rule__RequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1937:1: ( ( '.' ) )
            // InternalArchitecture.g:1938:1: ( '.' )
            {
            // InternalArchitecture.g:1938:1: ( '.' )
            // InternalArchitecture.g:1939:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3()); 
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
    // $ANTLR end "rule__RequiredService__Group__3__Impl"


    // $ANTLR start "rule__RequiredService__Group__4"
    // InternalArchitecture.g:1948:1: rule__RequiredService__Group__4 : rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 ;
    public final void rule__RequiredService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1952:1: ( rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 )
            // InternalArchitecture.g:1953:2: rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__RequiredService__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__5();

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
    // $ANTLR end "rule__RequiredService__Group__4"


    // $ANTLR start "rule__RequiredService__Group__4__Impl"
    // InternalArchitecture.g:1960:1: rule__RequiredService__Group__4__Impl : ( ( rule__RequiredService__NameServAssignment_4 ) ) ;
    public final void rule__RequiredService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1964:1: ( ( ( rule__RequiredService__NameServAssignment_4 ) ) )
            // InternalArchitecture.g:1965:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            {
            // InternalArchitecture.g:1965:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            // InternalArchitecture.g:1966:2: ( rule__RequiredService__NameServAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameServAssignment_4()); 
            }
            // InternalArchitecture.g:1967:2: ( rule__RequiredService__NameServAssignment_4 )
            // InternalArchitecture.g:1967:3: rule__RequiredService__NameServAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameServAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameServAssignment_4()); 
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
    // $ANTLR end "rule__RequiredService__Group__4__Impl"


    // $ANTLR start "rule__RequiredService__Group__5"
    // InternalArchitecture.g:1975:1: rule__RequiredService__Group__5 : rule__RequiredService__Group__5__Impl ;
    public final void rule__RequiredService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1979:1: ( rule__RequiredService__Group__5__Impl )
            // InternalArchitecture.g:1980:2: rule__RequiredService__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__5__Impl();

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
    // $ANTLR end "rule__RequiredService__Group__5"


    // $ANTLR start "rule__RequiredService__Group__5__Impl"
    // InternalArchitecture.g:1986:1: rule__RequiredService__Group__5__Impl : ( ';' ) ;
    public final void rule__RequiredService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1990:1: ( ( ';' ) )
            // InternalArchitecture.g:1991:1: ( ';' )
            {
            // InternalArchitecture.g:1991:1: ( ';' )
            // InternalArchitecture.g:1992:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5()); 
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
    // $ANTLR end "rule__RequiredService__Group__5__Impl"


    // $ANTLR start "rule__Model__PackageAssignment"
    // InternalArchitecture.g:2002:1: rule__Model__PackageAssignment : ( ruleDomainDeclaration ) ;
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2006:1: ( ( ruleDomainDeclaration ) )
            // InternalArchitecture.g:2007:2: ( ruleDomainDeclaration )
            {
            // InternalArchitecture.g:2007:2: ( ruleDomainDeclaration )
            // InternalArchitecture.g:2008:3: ruleDomainDeclaration
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
    // InternalArchitecture.g:2017:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2021:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:2022:2: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:2022:2: ( ruleQualifiedName )
            // InternalArchitecture.g:2023:3: ruleQualifiedName
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
    // InternalArchitecture.g:2032:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractModel ) ;
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2036:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:2037:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:2037:2: ( ruleAbstractModel )
            // InternalArchitecture.g:2038:3: ruleAbstractModel
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


    // $ANTLR start "rule__AbstractModel__CompAssignment_1"
    // InternalArchitecture.g:2047:1: rule__AbstractModel__CompAssignment_1 : ( ruleComponent ) ;
    public final void rule__AbstractModel__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2051:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:2052:2: ( ruleComponent )
            {
            // InternalArchitecture.g:2052:2: ( ruleComponent )
            // InternalArchitecture.g:2053:3: ruleComponent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__AbstractModel__CompAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalArchitecture.g:2062:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2066:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:2067:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:2067:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:2068:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Component__InstAssignment_1"
    // InternalArchitecture.g:2077:1: rule__Component__InstAssignment_1 : ( ruleInstanceComp ) ;
    public final void rule__Component__InstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2081:1: ( ( ruleInstanceComp ) )
            // InternalArchitecture.g:2082:2: ( ruleInstanceComp )
            {
            // InternalArchitecture.g:2082:2: ( ruleInstanceComp )
            // InternalArchitecture.g:2083:3: ruleInstanceComp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInstanceComp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__Component__InstAssignment_1"


    // $ANTLR start "rule__Component__NameAssignment_3"
    // InternalArchitecture.g:2092:1: rule__Component__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2096:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2097:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2097:2: ( RULE_ID )
            // InternalArchitecture.g:2098:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Component__NameAssignment_3"


    // $ANTLR start "rule__Component__ArgAssignment_6_0"
    // InternalArchitecture.g:2107:1: rule__Component__ArgAssignment_6_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2111:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2112:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2112:2: ( ruleVariable )
            // InternalArchitecture.g:2113:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0()); 
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
    // $ANTLR end "rule__Component__ArgAssignment_6_0"


    // $ANTLR start "rule__Component__Arg1Assignment_7"
    // InternalArchitecture.g:2122:1: rule__Component__Arg1Assignment_7 : ( ruleVariable ) ;
    public final void rule__Component__Arg1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2126:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2127:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2127:2: ( ruleVariable )
            // InternalArchitecture.g:2128:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Component__Arg1Assignment_7"


    // $ANTLR start "rule__Component__MethodeAssignment_9_0"
    // InternalArchitecture.g:2137:1: rule__Component__MethodeAssignment_9_0 : ( ruleServiceName ) ;
    public final void rule__Component__MethodeAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2141:1: ( ( ruleServiceName ) )
            // InternalArchitecture.g:2142:2: ( ruleServiceName )
            {
            // InternalArchitecture.g:2142:2: ( ruleServiceName )
            // InternalArchitecture.g:2143:3: ruleServiceName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleServiceName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0()); 
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
    // $ANTLR end "rule__Component__MethodeAssignment_9_0"


    // $ANTLR start "rule__Component__ArgAssignment_9_2_0_0"
    // InternalArchitecture.g:2152:1: rule__Component__ArgAssignment_9_2_0_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2156:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2157:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2157:2: ( ruleVariable )
            // InternalArchitecture.g:2158:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0()); 
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
    // $ANTLR end "rule__Component__ArgAssignment_9_2_0_0"


    // $ANTLR start "rule__Component__ArgAssignment_9_2_1"
    // InternalArchitecture.g:2167:1: rule__Component__ArgAssignment_9_2_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2171:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2172:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2172:2: ( ruleVariable )
            // InternalArchitecture.g:2173:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0()); 
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
    // $ANTLR end "rule__Component__ArgAssignment_9_2_1"


    // $ANTLR start "rule__Component__ArgAssignment_9_4_1"
    // InternalArchitecture.g:2182:1: rule__Component__ArgAssignment_9_4_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2186:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2187:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2187:2: ( ruleVariable )
            // InternalArchitecture.g:2188:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0()); 
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
    // $ANTLR end "rule__Component__ArgAssignment_9_4_1"


    // $ANTLR start "rule__Component__ReqAssignment_11"
    // InternalArchitecture.g:2197:1: rule__Component__ReqAssignment_11 : ( ruleRequiredService ) ;
    public final void rule__Component__ReqAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2201:1: ( ( ruleRequiredService ) )
            // InternalArchitecture.g:2202:2: ( ruleRequiredService )
            {
            // InternalArchitecture.g:2202:2: ( ruleRequiredService )
            // InternalArchitecture.g:2203:3: ruleRequiredService
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRequiredService();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0()); 
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
    // $ANTLR end "rule__Component__ReqAssignment_11"


    // $ANTLR start "rule__Component__BindAssignment_12"
    // InternalArchitecture.g:2212:1: rule__Component__BindAssignment_12 : ( ruleBindings ) ;
    public final void rule__Component__BindAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2216:1: ( ( ruleBindings ) )
            // InternalArchitecture.g:2217:2: ( ruleBindings )
            {
            // InternalArchitecture.g:2217:2: ( ruleBindings )
            // InternalArchitecture.g:2218:3: ruleBindings
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBindings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0()); 
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
    // $ANTLR end "rule__Component__BindAssignment_12"


    // $ANTLR start "rule__InstanceComp__NameAssignment"
    // InternalArchitecture.g:2227:1: rule__InstanceComp__NameAssignment : ( RULE_ID ) ;
    public final void rule__InstanceComp__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2231:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2232:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2232:2: ( RULE_ID )
            // InternalArchitecture.g:2233:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__InstanceComp__NameAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalArchitecture.g:2242:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2246:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2247:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2247:2: ( RULE_ID )
            // InternalArchitecture.g:2248:3: RULE_ID
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
    // InternalArchitecture.g:2257:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2261:1: ( ( ruleType ) )
            // InternalArchitecture.g:2262:2: ( ruleType )
            {
            // InternalArchitecture.g:2262:2: ( ruleType )
            // InternalArchitecture.g:2263:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0()); 
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


    // $ANTLR start "rule__Bindings__NameComp1Assignment_1"
    // InternalArchitecture.g:2272:1: rule__Bindings__NameComp1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameComp1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2276:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2277:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2277:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2278:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1InstanceCompCrossReference_1_0()); 
            }
            // InternalArchitecture.g:2279:3: ( RULE_ID )
            // InternalArchitecture.g:2280:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1InstanceCompIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp1InstanceCompIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp1InstanceCompCrossReference_1_0()); 
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
    // $ANTLR end "rule__Bindings__NameComp1Assignment_1"


    // $ANTLR start "rule__Bindings__NameServ1Assignment_3"
    // InternalArchitecture.g:2291:1: rule__Bindings__NameServ1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2295:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2296:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2296:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2297:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0()); 
            }
            // InternalArchitecture.g:2298:3: ( RULE_ID )
            // InternalArchitecture.g:2299:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1ServiceNameIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ1ServiceNameIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0()); 
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
    // $ANTLR end "rule__Bindings__NameServ1Assignment_3"


    // $ANTLR start "rule__Bindings__NameComp2Assignment_5"
    // InternalArchitecture.g:2310:1: rule__Bindings__NameComp2Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameComp2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2314:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2315:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2315:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2316:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp2InstanceCompCrossReference_5_0()); 
            }
            // InternalArchitecture.g:2317:3: ( RULE_ID )
            // InternalArchitecture.g:2318:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp2InstanceCompIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp2InstanceCompIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp2InstanceCompCrossReference_5_0()); 
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
    // $ANTLR end "rule__Bindings__NameComp2Assignment_5"


    // $ANTLR start "rule__Bindings__NameServ2Assignment_7"
    // InternalArchitecture.g:2329:1: rule__Bindings__NameServ2Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ2Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2333:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2334:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2334:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2335:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0()); 
            }
            // InternalArchitecture.g:2336:3: ( RULE_ID )
            // InternalArchitecture.g:2337:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2ServiceNameIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ2ServiceNameIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0()); 
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
    // $ANTLR end "rule__Bindings__NameServ2Assignment_7"


    // $ANTLR start "rule__RequiredService__NameVarMethodeAssignment_0"
    // InternalArchitecture.g:2348:1: rule__RequiredService__NameVarMethodeAssignment_0 : ( ruleVariable ) ;
    public final void rule__RequiredService__NameVarMethodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2352:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2353:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2353:2: ( ruleVariable )
            // InternalArchitecture.g:2354:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__RequiredService__NameVarMethodeAssignment_0"


    // $ANTLR start "rule__RequiredService__NameCompAssignment_2"
    // InternalArchitecture.g:2363:1: rule__RequiredService__NameCompAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2367:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2368:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2368:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2369:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0()); 
            }
            // InternalArchitecture.g:2370:3: ( RULE_ID )
            // InternalArchitecture.g:2371:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0()); 
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
    // $ANTLR end "rule__RequiredService__NameCompAssignment_2"


    // $ANTLR start "rule__RequiredService__NameServAssignment_4"
    // InternalArchitecture.g:2382:1: rule__RequiredService__NameServAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameServAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2386:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2387:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2387:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2388:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0()); 
            }
            // InternalArchitecture.g:2389:3: ( RULE_ID )
            // InternalArchitecture.g:2390:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameServServiceNameIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameServServiceNameIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0()); 
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
    // $ANTLR end "rule__RequiredService__NameServAssignment_4"


    // $ANTLR start "rule__ServiceName__NameAssignment"
    // InternalArchitecture.g:2401:1: rule__ServiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ServiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2405:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2406:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2406:2: ( RULE_ID )
            // InternalArchitecture.g:2407:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__ServiceName__NameAssignment"

    // $ANTLR start synpred7_InternalArchitecture
    public final void synpred7_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:588:4: ( rule__AbstractModel__CompAssignment_1 )
        // InternalArchitecture.g:588:4: rule__AbstractModel__CompAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__AbstractModel__CompAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalArchitecture

    // Delegated rules

    public final boolean synpred7_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\1\20\uffff";
    static final String dfa_3s = "\1\21\1\uffff\1\4\1\26\1\4\1\27\1\30\1\4\1\26\1\13\4\31\1\4\1\0\1\uffff";
    static final String dfa_4s = "\1\25\1\uffff\1\4\1\26\1\4\1\27\1\30\1\4\1\26\1\16\4\33\1\4\1\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\16\uffff\1\1";
    static final String dfa_6s = "\17\uffff\1\0\1\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\2\uffff\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\10",
            "\1\11",
            "\1\12\1\13\1\14\1\15",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\17\1\uffff\1\16",
            "\1\10",
            "\1\uffff",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 588:3: ( rule__AbstractModel__CompAssignment_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_15 = input.LA(1);

                         
                        int index5_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalArchitecture()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index5_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000260000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000240002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000024000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});

}