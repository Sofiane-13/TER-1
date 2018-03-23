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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "'providedServices'", "'('", "')'", "','", "':'", "'def'"
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


    // $ANTLR start "entryRuleVariable"
    // InternalArchitecture.g:229:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalArchitecture.g:230:1: ( ruleVariable EOF )
            // InternalArchitecture.g:231:1: ruleVariable EOF
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
    // InternalArchitecture.g:238:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:242:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalArchitecture.g:243:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalArchitecture.g:243:2: ( ( rule__Variable__Group__0 ) )
            // InternalArchitecture.g:244:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalArchitecture.g:245:3: ( rule__Variable__Group__0 )
            // InternalArchitecture.g:245:4: rule__Variable__Group__0
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
    // InternalArchitecture.g:254:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalArchitecture.g:255:1: ( ruleOperation EOF )
            // InternalArchitecture.g:256:1: ruleOperation EOF
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
    // InternalArchitecture.g:263:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:267:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalArchitecture.g:268:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalArchitecture.g:268:2: ( ( rule__Operation__Alternatives ) )
            // InternalArchitecture.g:269:3: ( rule__Operation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:270:3: ( rule__Operation__Alternatives )
            // InternalArchitecture.g:270:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "ruleType"
    // InternalArchitecture.g:279:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:283:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalArchitecture.g:284:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalArchitecture.g:284:2: ( ( rule__Type__Alternatives ) )
            // InternalArchitecture.g:285:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:286:3: ( rule__Type__Alternatives )
            // InternalArchitecture.g:286:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalArchitecture.g:294:1: rule__Operation__Alternatives : ( ( ( rule__Operation__Group_0__0 ) ) | ( ( rule__Operation__TypeCompAssignment_1 ) ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:298:1: ( ( ( rule__Operation__Group_0__0 ) ) | ( ( rule__Operation__TypeCompAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArchitecture.g:299:2: ( ( rule__Operation__Group_0__0 ) )
                    {
                    // InternalArchitecture.g:299:2: ( ( rule__Operation__Group_0__0 ) )
                    // InternalArchitecture.g:300:3: ( rule__Operation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getGroup_0()); 
                    }
                    // InternalArchitecture.g:301:3: ( rule__Operation__Group_0__0 )
                    // InternalArchitecture.g:301:4: rule__Operation__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:305:2: ( ( rule__Operation__TypeCompAssignment_1 ) )
                    {
                    // InternalArchitecture.g:305:2: ( ( rule__Operation__TypeCompAssignment_1 ) )
                    // InternalArchitecture.g:306:3: ( rule__Operation__TypeCompAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationAccess().getTypeCompAssignment_1()); 
                    }
                    // InternalArchitecture.g:307:3: ( rule__Operation__TypeCompAssignment_1 )
                    // InternalArchitecture.g:307:4: rule__Operation__TypeCompAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Operation__TypeCompAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationAccess().getTypeCompAssignment_1()); 
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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalArchitecture.g:315:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:319:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalArchitecture.g:320:2: ( ( 'INT' ) )
                    {
                    // InternalArchitecture.g:320:2: ( ( 'INT' ) )
                    // InternalArchitecture.g:321:3: ( 'INT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalArchitecture.g:322:3: ( 'INT' )
                    // InternalArchitecture.g:322:4: 'INT'
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
                    // InternalArchitecture.g:326:2: ( ( 'STRING' ) )
                    {
                    // InternalArchitecture.g:326:2: ( ( 'STRING' ) )
                    // InternalArchitecture.g:327:3: ( 'STRING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalArchitecture.g:328:3: ( 'STRING' )
                    // InternalArchitecture.g:328:4: 'STRING'
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
                    // InternalArchitecture.g:332:2: ( ( 'Boolean' ) )
                    {
                    // InternalArchitecture.g:332:2: ( ( 'Boolean' ) )
                    // InternalArchitecture.g:333:3: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // InternalArchitecture.g:334:3: ( 'Boolean' )
                    // InternalArchitecture.g:334:4: 'Boolean'
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
                    // InternalArchitecture.g:338:2: ( ( 'Double' ) )
                    {
                    // InternalArchitecture.g:338:2: ( ( 'Double' ) )
                    // InternalArchitecture.g:339:3: ( 'Double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }
                    // InternalArchitecture.g:340:3: ( 'Double' )
                    // InternalArchitecture.g:340:4: 'Double'
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
    // InternalArchitecture.g:348:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:352:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalArchitecture.g:353:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
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
    // InternalArchitecture.g:360:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:364:1: ( ( 'domain' ) )
            // InternalArchitecture.g:365:1: ( 'domain' )
            {
            // InternalArchitecture.g:365:1: ( 'domain' )
            // InternalArchitecture.g:366:2: 'domain'
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
    // InternalArchitecture.g:375:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:379:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalArchitecture.g:380:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
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
    // InternalArchitecture.g:387:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:391:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalArchitecture.g:392:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:392:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalArchitecture.g:393:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:394:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalArchitecture.g:394:3: rule__DomainDeclaration__NameAssignment_1
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
    // InternalArchitecture.g:402:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:406:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalArchitecture.g:407:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
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
    // InternalArchitecture.g:414:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:418:1: ( ( '{' ) )
            // InternalArchitecture.g:419:1: ( '{' )
            {
            // InternalArchitecture.g:419:1: ( '{' )
            // InternalArchitecture.g:420:2: '{'
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
    // InternalArchitecture.g:429:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:433:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalArchitecture.g:434:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
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
    // InternalArchitecture.g:441:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:445:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalArchitecture.g:446:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalArchitecture.g:446:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalArchitecture.g:447:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            }
            // InternalArchitecture.g:448:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArchitecture.g:448:3: rule__DomainDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DomainDeclaration__ElementsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalArchitecture.g:456:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:460:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalArchitecture.g:461:2: rule__DomainDeclaration__Group__4__Impl
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
    // InternalArchitecture.g:467:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:471:1: ( ( '}' ) )
            // InternalArchitecture.g:472:1: ( '}' )
            {
            // InternalArchitecture.g:472:1: ( '}' )
            // InternalArchitecture.g:473:2: '}'
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
    // InternalArchitecture.g:483:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:487:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalArchitecture.g:488:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
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
    // InternalArchitecture.g:495:1: rule__AbstractModel__Group__0__Impl : ( ( ruleImport )? ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:499:1: ( ( ( ruleImport )? ) )
            // InternalArchitecture.g:500:1: ( ( ruleImport )? )
            {
            // InternalArchitecture.g:500:1: ( ( ruleImport )? )
            // InternalArchitecture.g:501:2: ( ruleImport )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 
            }
            // InternalArchitecture.g:502:2: ( ruleImport )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:502:3: ruleImport
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
    // InternalArchitecture.g:510:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:514:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalArchitecture.g:515:2: rule__AbstractModel__Group__1__Impl
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
    // InternalArchitecture.g:521:1: rule__AbstractModel__Group__1__Impl : ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:525:1: ( ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) )
            // InternalArchitecture.g:526:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            {
            // InternalArchitecture.g:526:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            // InternalArchitecture.g:527:2: ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* )
            {
            // InternalArchitecture.g:527:2: ( ( rule__AbstractModel__CompAssignment_1 ) )
            // InternalArchitecture.g:528:3: ( rule__AbstractModel__CompAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:529:3: ( rule__AbstractModel__CompAssignment_1 )
            // InternalArchitecture.g:529:4: rule__AbstractModel__CompAssignment_1
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

            // InternalArchitecture.g:532:2: ( ( rule__AbstractModel__CompAssignment_1 )* )
            // InternalArchitecture.g:533:3: ( rule__AbstractModel__CompAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:534:3: ( rule__AbstractModel__CompAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:534:4: rule__AbstractModel__CompAssignment_1
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AbstractModel__CompAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalArchitecture.g:544:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:548:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArchitecture.g:549:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalArchitecture.g:556:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:560:1: ( ( 'import' ) )
            // InternalArchitecture.g:561:1: ( 'import' )
            {
            // InternalArchitecture.g:561:1: ( 'import' )
            // InternalArchitecture.g:562:2: 'import'
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
    // InternalArchitecture.g:571:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:575:1: ( rule__Import__Group__1__Impl )
            // InternalArchitecture.g:576:2: rule__Import__Group__1__Impl
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
    // InternalArchitecture.g:582:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:586:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalArchitecture.g:587:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalArchitecture.g:587:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalArchitecture.g:588:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalArchitecture.g:589:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalArchitecture.g:589:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalArchitecture.g:598:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:602:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalArchitecture.g:603:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalArchitecture.g:610:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:614:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:615:1: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:615:1: ( ruleQualifiedName )
            // InternalArchitecture.g:616:2: ruleQualifiedName
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
    // InternalArchitecture.g:625:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:629:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalArchitecture.g:630:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalArchitecture.g:636:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:640:1: ( ( ( '.*' )? ) )
            // InternalArchitecture.g:641:1: ( ( '.*' )? )
            {
            // InternalArchitecture.g:641:1: ( ( '.*' )? )
            // InternalArchitecture.g:642:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalArchitecture.g:643:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArchitecture.g:643:3: '.*'
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
    // InternalArchitecture.g:652:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:656:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalArchitecture.g:657:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalArchitecture.g:664:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:668:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:669:1: ( RULE_ID )
            {
            // InternalArchitecture.g:669:1: ( RULE_ID )
            // InternalArchitecture.g:670:2: RULE_ID
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
    // InternalArchitecture.g:679:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:683:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalArchitecture.g:684:2: rule__QualifiedName__Group__1__Impl
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
    // InternalArchitecture.g:690:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:694:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalArchitecture.g:695:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalArchitecture.g:695:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalArchitecture.g:696:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalArchitecture.g:697:2: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArchitecture.g:697:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalArchitecture.g:706:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:710:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalArchitecture.g:711:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalArchitecture.g:718:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:722:1: ( ( '.' ) )
            // InternalArchitecture.g:723:1: ( '.' )
            {
            // InternalArchitecture.g:723:1: ( '.' )
            // InternalArchitecture.g:724:2: '.'
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
    // InternalArchitecture.g:733:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:737:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalArchitecture.g:738:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalArchitecture.g:744:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:748:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:749:1: ( RULE_ID )
            {
            // InternalArchitecture.g:749:1: ( RULE_ID )
            // InternalArchitecture.g:750:2: RULE_ID
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
    // InternalArchitecture.g:760:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:764:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArchitecture.g:765:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalArchitecture.g:772:1: rule__Component__Group__0__Impl : ( 'Component:' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:776:1: ( ( 'Component:' ) )
            // InternalArchitecture.g:777:1: ( 'Component:' )
            {
            // InternalArchitecture.g:777:1: ( 'Component:' )
            // InternalArchitecture.g:778:2: 'Component:'
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
    // InternalArchitecture.g:787:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:791:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArchitecture.g:792:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:799:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:803:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalArchitecture.g:804:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:804:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalArchitecture.g:805:2: ( rule__Component__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:806:2: ( rule__Component__NameAssignment_1 )
            // InternalArchitecture.g:806:3: rule__Component__NameAssignment_1
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
    // InternalArchitecture.g:814:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:818:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalArchitecture.g:819:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalArchitecture.g:826:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:830:1: ( ( '{' ) )
            // InternalArchitecture.g:831:1: ( '{' )
            {
            // InternalArchitecture.g:831:1: ( '{' )
            // InternalArchitecture.g:832:2: '{'
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
    // InternalArchitecture.g:841:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:845:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalArchitecture.g:846:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalArchitecture.g:853:1: rule__Component__Group__3__Impl : ( 'providedServices' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:857:1: ( ( 'providedServices' ) )
            // InternalArchitecture.g:858:1: ( 'providedServices' )
            {
            // InternalArchitecture.g:858:1: ( 'providedServices' )
            // InternalArchitecture.g:859:2: 'providedServices'
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
    // InternalArchitecture.g:868:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:872:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalArchitecture.g:873:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalArchitecture.g:880:1: rule__Component__Group__4__Impl : ( '(' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:884:1: ( ( '(' ) )
            // InternalArchitecture.g:885:1: ( '(' )
            {
            // InternalArchitecture.g:885:1: ( '(' )
            // InternalArchitecture.g:886:2: '('
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
    // InternalArchitecture.g:895:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:899:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalArchitecture.g:900:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:907:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:911:1: ( ( ( rule__Component__Group_5__0 )* ) )
            // InternalArchitecture.g:912:1: ( ( rule__Component__Group_5__0 )* )
            {
            // InternalArchitecture.g:912:1: ( ( rule__Component__Group_5__0 )* )
            // InternalArchitecture.g:913:2: ( rule__Component__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5()); 
            }
            // InternalArchitecture.g:914:2: ( rule__Component__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArchitecture.g:914:3: rule__Component__Group_5__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalArchitecture.g:922:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:926:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalArchitecture.g:927:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_16);
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
    // InternalArchitecture.g:934:1: rule__Component__Group__6__Impl : ( ')' ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:938:1: ( ( ')' ) )
            // InternalArchitecture.g:939:1: ( ')' )
            {
            // InternalArchitecture.g:939:1: ( ')' )
            // InternalArchitecture.g:940:2: ')'
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
    // InternalArchitecture.g:949:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:953:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalArchitecture.g:954:2: rule__Component__Group__7__Impl rule__Component__Group__8
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
    // InternalArchitecture.g:961:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:965:1: ( ( ( rule__Component__Group_7__0 )* ) )
            // InternalArchitecture.g:966:1: ( ( rule__Component__Group_7__0 )* )
            {
            // InternalArchitecture.g:966:1: ( ( rule__Component__Group_7__0 )* )
            // InternalArchitecture.g:967:2: ( rule__Component__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_7()); 
            }
            // InternalArchitecture.g:968:2: ( rule__Component__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID||LA10_1==17||LA10_1==27) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:968:3: rule__Component__Group_7__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__Group_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_7()); 
            }

            }


            }

        }
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
    // InternalArchitecture.g:976:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:980:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalArchitecture.g:981:2: rule__Component__Group__8__Impl rule__Component__Group__9
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
    // InternalArchitecture.g:988:1: rule__Component__Group__8__Impl : ( ( rule__Component__VarsAssignment_8 )* ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:992:1: ( ( ( rule__Component__VarsAssignment_8 )* ) )
            // InternalArchitecture.g:993:1: ( ( rule__Component__VarsAssignment_8 )* )
            {
            // InternalArchitecture.g:993:1: ( ( rule__Component__VarsAssignment_8 )* )
            // InternalArchitecture.g:994:2: ( rule__Component__VarsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getVarsAssignment_8()); 
            }
            // InternalArchitecture.g:995:2: ( rule__Component__VarsAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:995:3: rule__Component__VarsAssignment_8
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__VarsAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getVarsAssignment_8()); 
            }

            }


            }

        }
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
    // InternalArchitecture.g:1003:1: rule__Component__Group__9 : rule__Component__Group__9__Impl ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1007:1: ( rule__Component__Group__9__Impl )
            // InternalArchitecture.g:1008:2: rule__Component__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__9__Impl();

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
    // InternalArchitecture.g:1014:1: rule__Component__Group__9__Impl : ( '}' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1018:1: ( ( '}' ) )
            // InternalArchitecture.g:1019:1: ( '}' )
            {
            // InternalArchitecture.g:1019:1: ( '}' )
            // InternalArchitecture.g:1020:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalArchitecture.g:1030:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1034:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalArchitecture.g:1035:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:1042:1: rule__Component__Group_5__0__Impl : ( ( rule__Component__Group_5_0__0 )* ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1046:1: ( ( ( rule__Component__Group_5_0__0 )* ) )
            // InternalArchitecture.g:1047:1: ( ( rule__Component__Group_5_0__0 )* )
            {
            // InternalArchitecture.g:1047:1: ( ( rule__Component__Group_5_0__0 )* )
            // InternalArchitecture.g:1048:2: ( rule__Component__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5_0()); 
            }
            // InternalArchitecture.g:1049:2: ( rule__Component__Group_5_0__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==25) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:1049:3: rule__Component__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__Group_5_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalArchitecture.g:1057:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1061:1: ( rule__Component__Group_5__1__Impl )
            // InternalArchitecture.g:1062:2: rule__Component__Group_5__1__Impl
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
    // InternalArchitecture.g:1068:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__OpsAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1072:1: ( ( ( rule__Component__OpsAssignment_5_1 ) ) )
            // InternalArchitecture.g:1073:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            {
            // InternalArchitecture.g:1073:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            // InternalArchitecture.g:1074:2: ( rule__Component__OpsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_1()); 
            }
            // InternalArchitecture.g:1075:2: ( rule__Component__OpsAssignment_5_1 )
            // InternalArchitecture.g:1075:3: rule__Component__OpsAssignment_5_1
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
    // InternalArchitecture.g:1084:1: rule__Component__Group_5_0__0 : rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 ;
    public final void rule__Component__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1088:1: ( rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 )
            // InternalArchitecture.g:1089:2: rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalArchitecture.g:1096:1: rule__Component__Group_5_0__0__Impl : ( ( rule__Component__OpsAssignment_5_0_0 ) ) ;
    public final void rule__Component__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1100:1: ( ( ( rule__Component__OpsAssignment_5_0_0 ) ) )
            // InternalArchitecture.g:1101:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            {
            // InternalArchitecture.g:1101:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            // InternalArchitecture.g:1102:2: ( rule__Component__OpsAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_0_0()); 
            }
            // InternalArchitecture.g:1103:2: ( rule__Component__OpsAssignment_5_0_0 )
            // InternalArchitecture.g:1103:3: rule__Component__OpsAssignment_5_0_0
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
    // InternalArchitecture.g:1111:1: rule__Component__Group_5_0__1 : rule__Component__Group_5_0__1__Impl ;
    public final void rule__Component__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1115:1: ( rule__Component__Group_5_0__1__Impl )
            // InternalArchitecture.g:1116:2: rule__Component__Group_5_0__1__Impl
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
    // InternalArchitecture.g:1122:1: rule__Component__Group_5_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1126:1: ( ( ',' ) )
            // InternalArchitecture.g:1127:1: ( ',' )
            {
            // InternalArchitecture.g:1127:1: ( ',' )
            // InternalArchitecture.g:1128:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_5_0_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Component__Group_7__0"
    // InternalArchitecture.g:1138:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1142:1: ( rule__Component__Group_7__0__Impl )
            // InternalArchitecture.g:1143:2: rule__Component__Group_7__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7__0__Impl();

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
    // $ANTLR end "rule__Component__Group_7__0"


    // $ANTLR start "rule__Component__Group_7__0__Impl"
    // InternalArchitecture.g:1149:1: rule__Component__Group_7__0__Impl : ( ( rule__Component__OperationsAssignment_7_0 ) ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1153:1: ( ( ( rule__Component__OperationsAssignment_7_0 ) ) )
            // InternalArchitecture.g:1154:1: ( ( rule__Component__OperationsAssignment_7_0 ) )
            {
            // InternalArchitecture.g:1154:1: ( ( rule__Component__OperationsAssignment_7_0 ) )
            // InternalArchitecture.g:1155:2: ( rule__Component__OperationsAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOperationsAssignment_7_0()); 
            }
            // InternalArchitecture.g:1156:2: ( rule__Component__OperationsAssignment_7_0 )
            // InternalArchitecture.g:1156:3: rule__Component__OperationsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__OperationsAssignment_7_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOperationsAssignment_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__0__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalArchitecture.g:1165:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1169:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1170:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalArchitecture.g:1177:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1181:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1182:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1182:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1183:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalArchitecture.g:1184:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1184:3: rule__Variable__NameAssignment_0
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
    // InternalArchitecture.g:1192:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1196:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1197:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalArchitecture.g:1204:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1208:1: ( ( ':' ) )
            // InternalArchitecture.g:1209:1: ( ':' )
            {
            // InternalArchitecture.g:1209:1: ( ':' )
            // InternalArchitecture.g:1210:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1219:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1223:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1224:2: rule__Variable__Group__2__Impl
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
    // InternalArchitecture.g:1230:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1234:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1235:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1235:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1236:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalArchitecture.g:1237:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1237:3: rule__Variable__TypeAssignment_2
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


    // $ANTLR start "rule__Operation__Group_0__0"
    // InternalArchitecture.g:1246:1: rule__Operation__Group_0__0 : rule__Operation__Group_0__0__Impl rule__Operation__Group_0__1 ;
    public final void rule__Operation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1250:1: ( rule__Operation__Group_0__0__Impl rule__Operation__Group_0__1 )
            // InternalArchitecture.g:1251:2: rule__Operation__Group_0__0__Impl rule__Operation__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__1();

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
    // $ANTLR end "rule__Operation__Group_0__0"


    // $ANTLR start "rule__Operation__Group_0__0__Impl"
    // InternalArchitecture.g:1258:1: rule__Operation__Group_0__0__Impl : ( 'def' ) ;
    public final void rule__Operation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1262:1: ( ( 'def' ) )
            // InternalArchitecture.g:1263:1: ( 'def' )
            {
            // InternalArchitecture.g:1263:1: ( 'def' )
            // InternalArchitecture.g:1264:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getDefKeyword_0_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getDefKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__0__Impl"


    // $ANTLR start "rule__Operation__Group_0__1"
    // InternalArchitecture.g:1273:1: rule__Operation__Group_0__1 : rule__Operation__Group_0__1__Impl rule__Operation__Group_0__2 ;
    public final void rule__Operation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1277:1: ( rule__Operation__Group_0__1__Impl rule__Operation__Group_0__2 )
            // InternalArchitecture.g:1278:2: rule__Operation__Group_0__1__Impl rule__Operation__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Operation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__2();

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
    // $ANTLR end "rule__Operation__Group_0__1"


    // $ANTLR start "rule__Operation__Group_0__1__Impl"
    // InternalArchitecture.g:1285:1: rule__Operation__Group_0__1__Impl : ( ( rule__Operation__NameAssignment_0_1 ) ) ;
    public final void rule__Operation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1289:1: ( ( ( rule__Operation__NameAssignment_0_1 ) ) )
            // InternalArchitecture.g:1290:1: ( ( rule__Operation__NameAssignment_0_1 ) )
            {
            // InternalArchitecture.g:1290:1: ( ( rule__Operation__NameAssignment_0_1 ) )
            // InternalArchitecture.g:1291:2: ( rule__Operation__NameAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_0_1()); 
            }
            // InternalArchitecture.g:1292:2: ( rule__Operation__NameAssignment_0_1 )
            // InternalArchitecture.g:1292:3: rule__Operation__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__NameAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__1__Impl"


    // $ANTLR start "rule__Operation__Group_0__2"
    // InternalArchitecture.g:1300:1: rule__Operation__Group_0__2 : rule__Operation__Group_0__2__Impl rule__Operation__Group_0__3 ;
    public final void rule__Operation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1304:1: ( rule__Operation__Group_0__2__Impl rule__Operation__Group_0__3 )
            // InternalArchitecture.g:1305:2: rule__Operation__Group_0__2__Impl rule__Operation__Group_0__3
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__3();

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
    // $ANTLR end "rule__Operation__Group_0__2"


    // $ANTLR start "rule__Operation__Group_0__2__Impl"
    // InternalArchitecture.g:1312:1: rule__Operation__Group_0__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1316:1: ( ( '(' ) )
            // InternalArchitecture.g:1317:1: ( '(' )
            {
            // InternalArchitecture.g:1317:1: ( '(' )
            // InternalArchitecture.g:1318:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__2__Impl"


    // $ANTLR start "rule__Operation__Group_0__3"
    // InternalArchitecture.g:1327:1: rule__Operation__Group_0__3 : rule__Operation__Group_0__3__Impl rule__Operation__Group_0__4 ;
    public final void rule__Operation__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1331:1: ( rule__Operation__Group_0__3__Impl rule__Operation__Group_0__4 )
            // InternalArchitecture.g:1332:2: rule__Operation__Group_0__3__Impl rule__Operation__Group_0__4
            {
            pushFollow(FOLLOW_14);
            rule__Operation__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__4();

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
    // $ANTLR end "rule__Operation__Group_0__3"


    // $ANTLR start "rule__Operation__Group_0__3__Impl"
    // InternalArchitecture.g:1339:1: rule__Operation__Group_0__3__Impl : ( ( rule__Operation__Group_0_3__0 )* ) ;
    public final void rule__Operation__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1343:1: ( ( ( rule__Operation__Group_0_3__0 )* ) )
            // InternalArchitecture.g:1344:1: ( ( rule__Operation__Group_0_3__0 )* )
            {
            // InternalArchitecture.g:1344:1: ( ( rule__Operation__Group_0_3__0 )* )
            // InternalArchitecture.g:1345:2: ( rule__Operation__Group_0_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_0_3()); 
            }
            // InternalArchitecture.g:1346:2: ( rule__Operation__Group_0_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArchitecture.g:1346:3: rule__Operation__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Operation__Group_0_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__3__Impl"


    // $ANTLR start "rule__Operation__Group_0__4"
    // InternalArchitecture.g:1354:1: rule__Operation__Group_0__4 : rule__Operation__Group_0__4__Impl rule__Operation__Group_0__5 ;
    public final void rule__Operation__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1358:1: ( rule__Operation__Group_0__4__Impl rule__Operation__Group_0__5 )
            // InternalArchitecture.g:1359:2: rule__Operation__Group_0__4__Impl rule__Operation__Group_0__5
            {
            pushFollow(FOLLOW_19);
            rule__Operation__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__5();

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
    // $ANTLR end "rule__Operation__Group_0__4"


    // $ANTLR start "rule__Operation__Group_0__4__Impl"
    // InternalArchitecture.g:1366:1: rule__Operation__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1370:1: ( ( ')' ) )
            // InternalArchitecture.g:1371:1: ( ')' )
            {
            // InternalArchitecture.g:1371:1: ( ')' )
            // InternalArchitecture.g:1372:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__4__Impl"


    // $ANTLR start "rule__Operation__Group_0__5"
    // InternalArchitecture.g:1381:1: rule__Operation__Group_0__5 : rule__Operation__Group_0__5__Impl rule__Operation__Group_0__6 ;
    public final void rule__Operation__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1385:1: ( rule__Operation__Group_0__5__Impl rule__Operation__Group_0__6 )
            // InternalArchitecture.g:1386:2: rule__Operation__Group_0__5__Impl rule__Operation__Group_0__6
            {
            pushFollow(FOLLOW_20);
            rule__Operation__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__6();

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
    // $ANTLR end "rule__Operation__Group_0__5"


    // $ANTLR start "rule__Operation__Group_0__5__Impl"
    // InternalArchitecture.g:1393:1: rule__Operation__Group_0__5__Impl : ( ':' ) ;
    public final void rule__Operation__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1397:1: ( ( ':' ) )
            // InternalArchitecture.g:1398:1: ( ':' )
            {
            // InternalArchitecture.g:1398:1: ( ':' )
            // InternalArchitecture.g:1399:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_0_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getColonKeyword_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__5__Impl"


    // $ANTLR start "rule__Operation__Group_0__6"
    // InternalArchitecture.g:1408:1: rule__Operation__Group_0__6 : rule__Operation__Group_0__6__Impl ;
    public final void rule__Operation__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1412:1: ( rule__Operation__Group_0__6__Impl )
            // InternalArchitecture.g:1413:2: rule__Operation__Group_0__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0__6__Impl();

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
    // $ANTLR end "rule__Operation__Group_0__6"


    // $ANTLR start "rule__Operation__Group_0__6__Impl"
    // InternalArchitecture.g:1419:1: rule__Operation__Group_0__6__Impl : ( ( rule__Operation__TypeAssignment_0_6 ) ) ;
    public final void rule__Operation__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1423:1: ( ( ( rule__Operation__TypeAssignment_0_6 ) ) )
            // InternalArchitecture.g:1424:1: ( ( rule__Operation__TypeAssignment_0_6 ) )
            {
            // InternalArchitecture.g:1424:1: ( ( rule__Operation__TypeAssignment_0_6 ) )
            // InternalArchitecture.g:1425:2: ( rule__Operation__TypeAssignment_0_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeAssignment_0_6()); 
            }
            // InternalArchitecture.g:1426:2: ( rule__Operation__TypeAssignment_0_6 )
            // InternalArchitecture.g:1426:3: rule__Operation__TypeAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__Operation__TypeAssignment_0_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeAssignment_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0__6__Impl"


    // $ANTLR start "rule__Operation__Group_0_3__0"
    // InternalArchitecture.g:1435:1: rule__Operation__Group_0_3__0 : rule__Operation__Group_0_3__0__Impl rule__Operation__Group_0_3__1 ;
    public final void rule__Operation__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1439:1: ( rule__Operation__Group_0_3__0__Impl rule__Operation__Group_0_3__1 )
            // InternalArchitecture.g:1440:2: rule__Operation__Group_0_3__0__Impl rule__Operation__Group_0_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Operation__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0_3__1();

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
    // $ANTLR end "rule__Operation__Group_0_3__0"


    // $ANTLR start "rule__Operation__Group_0_3__0__Impl"
    // InternalArchitecture.g:1447:1: rule__Operation__Group_0_3__0__Impl : ( ( rule__Operation__Group_0_3_0__0 )* ) ;
    public final void rule__Operation__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1451:1: ( ( ( rule__Operation__Group_0_3_0__0 )* ) )
            // InternalArchitecture.g:1452:1: ( ( rule__Operation__Group_0_3_0__0 )* )
            {
            // InternalArchitecture.g:1452:1: ( ( rule__Operation__Group_0_3_0__0 )* )
            // InternalArchitecture.g:1453:2: ( rule__Operation__Group_0_3_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_0_3_0()); 
            }
            // InternalArchitecture.g:1454:2: ( rule__Operation__Group_0_3_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==26) ) {
                        switch ( input.LA(3) ) {
                        case 11:
                            {
                            int LA14_3 = input.LA(4);

                            if ( (LA14_3==25) ) {
                                alt14=1;
                            }


                            }
                            break;
                        case 12:
                            {
                            int LA14_4 = input.LA(4);

                            if ( (LA14_4==25) ) {
                                alt14=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA14_5 = input.LA(4);

                            if ( (LA14_5==25) ) {
                                alt14=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA14_6 = input.LA(4);

                            if ( (LA14_6==25) ) {
                                alt14=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalArchitecture.g:1454:3: rule__Operation__Group_0_3_0__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Operation__Group_0_3_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getGroup_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0_3__0__Impl"


    // $ANTLR start "rule__Operation__Group_0_3__1"
    // InternalArchitecture.g:1462:1: rule__Operation__Group_0_3__1 : rule__Operation__Group_0_3__1__Impl ;
    public final void rule__Operation__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1466:1: ( rule__Operation__Group_0_3__1__Impl )
            // InternalArchitecture.g:1467:2: rule__Operation__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0_3__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_0_3__1"


    // $ANTLR start "rule__Operation__Group_0_3__1__Impl"
    // InternalArchitecture.g:1473:1: rule__Operation__Group_0_3__1__Impl : ( ( rule__Operation__ArgAssignment_0_3_1 ) ) ;
    public final void rule__Operation__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1477:1: ( ( ( rule__Operation__ArgAssignment_0_3_1 ) ) )
            // InternalArchitecture.g:1478:1: ( ( rule__Operation__ArgAssignment_0_3_1 ) )
            {
            // InternalArchitecture.g:1478:1: ( ( rule__Operation__ArgAssignment_0_3_1 ) )
            // InternalArchitecture.g:1479:2: ( rule__Operation__ArgAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_0_3_1()); 
            }
            // InternalArchitecture.g:1480:2: ( rule__Operation__ArgAssignment_0_3_1 )
            // InternalArchitecture.g:1480:3: rule__Operation__ArgAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ArgAssignment_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgAssignment_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0_3__1__Impl"


    // $ANTLR start "rule__Operation__Group_0_3_0__0"
    // InternalArchitecture.g:1489:1: rule__Operation__Group_0_3_0__0 : rule__Operation__Group_0_3_0__0__Impl rule__Operation__Group_0_3_0__1 ;
    public final void rule__Operation__Group_0_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1493:1: ( rule__Operation__Group_0_3_0__0__Impl rule__Operation__Group_0_3_0__1 )
            // InternalArchitecture.g:1494:2: rule__Operation__Group_0_3_0__0__Impl rule__Operation__Group_0_3_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Operation__Group_0_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0_3_0__1();

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
    // $ANTLR end "rule__Operation__Group_0_3_0__0"


    // $ANTLR start "rule__Operation__Group_0_3_0__0__Impl"
    // InternalArchitecture.g:1501:1: rule__Operation__Group_0_3_0__0__Impl : ( ( rule__Operation__ArgAssignment_0_3_0_0 ) ) ;
    public final void rule__Operation__Group_0_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1505:1: ( ( ( rule__Operation__ArgAssignment_0_3_0_0 ) ) )
            // InternalArchitecture.g:1506:1: ( ( rule__Operation__ArgAssignment_0_3_0_0 ) )
            {
            // InternalArchitecture.g:1506:1: ( ( rule__Operation__ArgAssignment_0_3_0_0 ) )
            // InternalArchitecture.g:1507:2: ( rule__Operation__ArgAssignment_0_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_0_3_0_0()); 
            }
            // InternalArchitecture.g:1508:2: ( rule__Operation__ArgAssignment_0_3_0_0 )
            // InternalArchitecture.g:1508:3: rule__Operation__ArgAssignment_0_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__ArgAssignment_0_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgAssignment_0_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0_3_0__0__Impl"


    // $ANTLR start "rule__Operation__Group_0_3_0__1"
    // InternalArchitecture.g:1516:1: rule__Operation__Group_0_3_0__1 : rule__Operation__Group_0_3_0__1__Impl ;
    public final void rule__Operation__Group_0_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1520:1: ( rule__Operation__Group_0_3_0__1__Impl )
            // InternalArchitecture.g:1521:2: rule__Operation__Group_0_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group_0_3_0__1__Impl();

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
    // $ANTLR end "rule__Operation__Group_0_3_0__1"


    // $ANTLR start "rule__Operation__Group_0_3_0__1__Impl"
    // InternalArchitecture.g:1527:1: rule__Operation__Group_0_3_0__1__Impl : ( ',' ) ;
    public final void rule__Operation__Group_0_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1531:1: ( ( ',' ) )
            // InternalArchitecture.g:1532:1: ( ',' )
            {
            // InternalArchitecture.g:1532:1: ( ',' )
            // InternalArchitecture.g:1533:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getCommaKeyword_0_3_0_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getCommaKeyword_0_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group_0_3_0__1__Impl"


    // $ANTLR start "rule__Model__PackageAssignment"
    // InternalArchitecture.g:1543:1: rule__Model__PackageAssignment : ( ruleDomainDeclaration ) ;
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1547:1: ( ( ruleDomainDeclaration ) )
            // InternalArchitecture.g:1548:2: ( ruleDomainDeclaration )
            {
            // InternalArchitecture.g:1548:2: ( ruleDomainDeclaration )
            // InternalArchitecture.g:1549:3: ruleDomainDeclaration
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
    // InternalArchitecture.g:1558:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1562:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:1563:2: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:1563:2: ( ruleQualifiedName )
            // InternalArchitecture.g:1564:3: ruleQualifiedName
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
    // InternalArchitecture.g:1573:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractModel ) ;
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1577:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:1578:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:1578:2: ( ruleAbstractModel )
            // InternalArchitecture.g:1579:3: ruleAbstractModel
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
    // InternalArchitecture.g:1588:1: rule__AbstractModel__CompAssignment_1 : ( ruleComponent ) ;
    public final void rule__AbstractModel__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1592:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:1593:2: ( ruleComponent )
            {
            // InternalArchitecture.g:1593:2: ( ruleComponent )
            // InternalArchitecture.g:1594:3: ruleComponent
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
    // InternalArchitecture.g:1603:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1607:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:1608:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:1608:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:1609:3: ruleQualifiedNameWithWildcard
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
    // InternalArchitecture.g:1618:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1622:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:1623:2: ( RULE_ID )
            {
            // InternalArchitecture.g:1623:2: ( RULE_ID )
            // InternalArchitecture.g:1624:3: RULE_ID
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
    // InternalArchitecture.g:1633:1: rule__Component__OpsAssignment_5_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1637:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:1638:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:1638:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:1639:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_0_0_0()); 
            }
            // InternalArchitecture.g:1640:3: ( RULE_ID )
            // InternalArchitecture.g:1641:4: RULE_ID
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
    // InternalArchitecture.g:1652:1: rule__Component__OpsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1656:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:1657:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:1657:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:1658:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_1_0()); 
            }
            // InternalArchitecture.g:1659:3: ( RULE_ID )
            // InternalArchitecture.g:1660:4: RULE_ID
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


    // $ANTLR start "rule__Component__OperationsAssignment_7_0"
    // InternalArchitecture.g:1671:1: rule__Component__OperationsAssignment_7_0 : ( ruleOperation ) ;
    public final void rule__Component__OperationsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1675:1: ( ( ruleOperation ) )
            // InternalArchitecture.g:1676:2: ( ruleOperation )
            {
            // InternalArchitecture.g:1676:2: ( ruleOperation )
            // InternalArchitecture.g:1677:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOperationsOperationParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getOperationsOperationParserRuleCall_7_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__OperationsAssignment_7_0"


    // $ANTLR start "rule__Component__VarsAssignment_8"
    // InternalArchitecture.g:1686:1: rule__Component__VarsAssignment_8 : ( ruleVariable ) ;
    public final void rule__Component__VarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1690:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1691:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1691:2: ( ruleVariable )
            // InternalArchitecture.g:1692:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getVarsVariableParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getVarsVariableParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__VarsAssignment_8"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalArchitecture.g:1701:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1705:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:1706:2: ( RULE_ID )
            {
            // InternalArchitecture.g:1706:2: ( RULE_ID )
            // InternalArchitecture.g:1707:3: RULE_ID
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
    // InternalArchitecture.g:1716:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1720:1: ( ( ruleType ) )
            // InternalArchitecture.g:1721:2: ( ruleType )
            {
            // InternalArchitecture.g:1721:2: ( ruleType )
            // InternalArchitecture.g:1722:3: ruleType
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


    // $ANTLR start "rule__Operation__NameAssignment_0_1"
    // InternalArchitecture.g:1731:1: rule__Operation__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1735:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:1736:2: ( RULE_ID )
            {
            // InternalArchitecture.g:1736:2: ( RULE_ID )
            // InternalArchitecture.g:1737:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getNameIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__NameAssignment_0_1"


    // $ANTLR start "rule__Operation__ArgAssignment_0_3_0_0"
    // InternalArchitecture.g:1746:1: rule__Operation__ArgAssignment_0_3_0_0 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_0_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1750:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1751:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1751:2: ( ruleVariable )
            // InternalArchitecture.g:1752:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_0_3_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_0_3_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ArgAssignment_0_3_0_0"


    // $ANTLR start "rule__Operation__ArgAssignment_0_3_1"
    // InternalArchitecture.g:1761:1: rule__Operation__ArgAssignment_0_3_1 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1765:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1766:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1766:2: ( ruleVariable )
            // InternalArchitecture.g:1767:3: ruleVariable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_0_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getArgVariableParserRuleCall_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__ArgAssignment_0_3_1"


    // $ANTLR start "rule__Operation__TypeAssignment_0_6"
    // InternalArchitecture.g:1776:1: rule__Operation__TypeAssignment_0_6 : ( ruleType ) ;
    public final void rule__Operation__TypeAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1780:1: ( ( ruleType ) )
            // InternalArchitecture.g:1781:2: ( ruleType )
            {
            // InternalArchitecture.g:1781:2: ( ruleType )
            // InternalArchitecture.g:1782:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeTypeEnumRuleCall_0_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeTypeEnumRuleCall_0_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeAssignment_0_6"


    // $ANTLR start "rule__Operation__TypeCompAssignment_1"
    // InternalArchitecture.g:1791:1: rule__Operation__TypeCompAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Operation__TypeCompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1795:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:1796:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:1796:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:1797:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeCompComponentCrossReference_1_0()); 
            }
            // InternalArchitecture.g:1798:3: ( RULE_ID )
            // InternalArchitecture.g:1799:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeCompComponentIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeCompComponentIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeCompComponentCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__TypeCompAssignment_1"

    // $ANTLR start synpred8_InternalArchitecture
    public final void synpred8_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:534:4: ( rule__AbstractModel__CompAssignment_1 )
        // InternalArchitecture.g:534:4: rule__AbstractModel__CompAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__AbstractModel__CompAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalArchitecture

    // Delegated rules

    public final boolean synpred8_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\43\uffff";
    static final String dfa_2s = "\1\1\42\uffff";
    static final String dfa_3s = "\1\21\1\uffff\1\4\1\20\1\26\1\27\6\4\1\0\1\27\1\13\1\uffff\5\4\3\32\2\13\11\4";
    static final String dfa_4s = "\1\25\1\uffff\1\4\1\20\1\26\1\27\1\30\1\31\1\33\2\4\1\33\1\0\1\27\1\16\1\uffff\1\30\4\21\3\32\2\16\4\31\4\33\1\4";
    static final String dfa_5s = "\1\uffff\1\2\15\uffff\1\1\23\uffff";
    static final String dfa_6s = "\14\uffff\1\0\26\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\2\uffff\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\23\uffff\1\10",
            "\1\7\23\uffff\1\10\1\11",
            "\1\13\14\uffff\1\14\11\uffff\1\12",
            "\1\7",
            "\1\15",
            "\1\13\14\uffff\1\14\10\uffff\1\16\1\12",
            "\1\uffff",
            "\1\20",
            "\1\21\1\22\1\23\1\24",
            "",
            "\1\25\23\uffff\1\26",
            "\1\27\14\uffff\1\14",
            "\1\27\14\uffff\1\14",
            "\1\27\14\uffff\1\14",
            "\1\27\14\uffff\1\14",
            "\1\30",
            "\1\31",
            "\1\16",
            "\1\32\1\33\1\34\1\35",
            "\1\36\1\37\1\40\1\41",
            "\1\25\23\uffff\1\26\1\42",
            "\1\25\23\uffff\1\26\1\42",
            "\1\25\23\uffff\1\26\1\42",
            "\1\25\23\uffff\1\26\1\42",
            "\1\13\14\uffff\1\14\11\uffff\1\12",
            "\1\13\14\uffff\1\14\11\uffff\1\12",
            "\1\13\14\uffff\1\14\11\uffff\1\12",
            "\1\13\14\uffff\1\14\11\uffff\1\12",
            "\1\25"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 534:3: ( rule__AbstractModel__CompAssignment_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalArchitecture()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
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
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008020010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000007800L});

}