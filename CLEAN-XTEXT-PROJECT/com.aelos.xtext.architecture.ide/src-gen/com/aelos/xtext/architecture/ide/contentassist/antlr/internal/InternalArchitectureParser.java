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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'import'", "'.*'", "'.'", "'Component:'", "'providedServices'", "'('", "')'", "'requiredService'", "','", "':'", "'def'"
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


    // $ANTLR start "entryRuleCall"
    // InternalArchitecture.g:229:1: entryRuleCall : ruleCall EOF ;
    public final void entryRuleCall() throws RecognitionException {
        try {
            // InternalArchitecture.g:230:1: ( ruleCall EOF )
            // InternalArchitecture.g:231:1: ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallRule()); 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalArchitecture.g:238:1: ruleCall : ( ( rule__Call__Group__0 ) ) ;
    public final void ruleCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:242:2: ( ( ( rule__Call__Group__0 ) ) )
            // InternalArchitecture.g:243:2: ( ( rule__Call__Group__0 ) )
            {
            // InternalArchitecture.g:243:2: ( ( rule__Call__Group__0 ) )
            // InternalArchitecture.g:244:3: ( rule__Call__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getGroup()); 
            }
            // InternalArchitecture.g:245:3: ( rule__Call__Group__0 )
            // InternalArchitecture.g:245:4: rule__Call__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall"


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


    // $ANTLR start "entryRuleOperation"
    // InternalArchitecture.g:279:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalArchitecture.g:280:1: ( ruleOperation EOF )
            // InternalArchitecture.g:281:1: ruleOperation EOF
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
    // InternalArchitecture.g:288:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:292:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalArchitecture.g:293:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalArchitecture.g:293:2: ( ( rule__Operation__Group__0 ) )
            // InternalArchitecture.g:294:3: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // InternalArchitecture.g:295:3: ( rule__Operation__Group__0 )
            // InternalArchitecture.g:295:4: rule__Operation__Group__0
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
    // InternalArchitecture.g:304:1: entryRuleAtomicType : ruleAtomicType EOF ;
    public final void entryRuleAtomicType() throws RecognitionException {
        try {
            // InternalArchitecture.g:305:1: ( ruleAtomicType EOF )
            // InternalArchitecture.g:306:1: ruleAtomicType EOF
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
    // InternalArchitecture.g:313:1: ruleAtomicType : ( ( rule__AtomicType__Alternatives ) ) ;
    public final void ruleAtomicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:317:2: ( ( ( rule__AtomicType__Alternatives ) ) )
            // InternalArchitecture.g:318:2: ( ( rule__AtomicType__Alternatives ) )
            {
            // InternalArchitecture.g:318:2: ( ( rule__AtomicType__Alternatives ) )
            // InternalArchitecture.g:319:3: ( rule__AtomicType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:320:3: ( rule__AtomicType__Alternatives )
            // InternalArchitecture.g:320:4: rule__AtomicType__Alternatives
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
    // InternalArchitecture.g:329:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:333:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalArchitecture.g:334:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalArchitecture.g:334:2: ( ( rule__Type__Alternatives ) )
            // InternalArchitecture.g:335:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalArchitecture.g:336:3: ( rule__Type__Alternatives )
            // InternalArchitecture.g:336:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__AtomicType__Alternatives"
    // InternalArchitecture.g:344:1: rule__AtomicType__Alternatives : ( ( ( rule__AtomicType__AtomTypeAssignment_0 ) ) | ( ( rule__AtomicType__Group_1__0 ) ) );
    public final void rule__AtomicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:348:1: ( ( ( rule__AtomicType__AtomTypeAssignment_0 ) ) | ( ( rule__AtomicType__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=14)) ) {
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
                    // InternalArchitecture.g:349:2: ( ( rule__AtomicType__AtomTypeAssignment_0 ) )
                    {
                    // InternalArchitecture.g:349:2: ( ( rule__AtomicType__AtomTypeAssignment_0 ) )
                    // InternalArchitecture.g:350:3: ( rule__AtomicType__AtomTypeAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicTypeAccess().getAtomTypeAssignment_0()); 
                    }
                    // InternalArchitecture.g:351:3: ( rule__AtomicType__AtomTypeAssignment_0 )
                    // InternalArchitecture.g:351:4: rule__AtomicType__AtomTypeAssignment_0
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
                    // InternalArchitecture.g:355:2: ( ( rule__AtomicType__Group_1__0 ) )
                    {
                    // InternalArchitecture.g:355:2: ( ( rule__AtomicType__Group_1__0 ) )
                    // InternalArchitecture.g:356:3: ( rule__AtomicType__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAtomicTypeAccess().getGroup_1()); 
                    }
                    // InternalArchitecture.g:357:3: ( rule__AtomicType__Group_1__0 )
                    // InternalArchitecture.g:357:4: rule__AtomicType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtomicType__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAtomicTypeAccess().getGroup_1()); 
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
    // InternalArchitecture.g:365:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:369:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
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
                    // InternalArchitecture.g:370:2: ( ( 'INT' ) )
                    {
                    // InternalArchitecture.g:370:2: ( ( 'INT' ) )
                    // InternalArchitecture.g:371:3: ( 'INT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalArchitecture.g:372:3: ( 'INT' )
                    // InternalArchitecture.g:372:4: 'INT'
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
                    // InternalArchitecture.g:376:2: ( ( 'STRING' ) )
                    {
                    // InternalArchitecture.g:376:2: ( ( 'STRING' ) )
                    // InternalArchitecture.g:377:3: ( 'STRING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalArchitecture.g:378:3: ( 'STRING' )
                    // InternalArchitecture.g:378:4: 'STRING'
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
                    // InternalArchitecture.g:382:2: ( ( 'Boolean' ) )
                    {
                    // InternalArchitecture.g:382:2: ( ( 'Boolean' ) )
                    // InternalArchitecture.g:383:3: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // InternalArchitecture.g:384:3: ( 'Boolean' )
                    // InternalArchitecture.g:384:4: 'Boolean'
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
                    // InternalArchitecture.g:388:2: ( ( 'Double' ) )
                    {
                    // InternalArchitecture.g:388:2: ( ( 'Double' ) )
                    // InternalArchitecture.g:389:3: ( 'Double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }
                    // InternalArchitecture.g:390:3: ( 'Double' )
                    // InternalArchitecture.g:390:4: 'Double'
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
    // InternalArchitecture.g:398:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:402:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalArchitecture.g:403:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
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
    // InternalArchitecture.g:410:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:414:1: ( ( 'domain' ) )
            // InternalArchitecture.g:415:1: ( 'domain' )
            {
            // InternalArchitecture.g:415:1: ( 'domain' )
            // InternalArchitecture.g:416:2: 'domain'
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
    // InternalArchitecture.g:425:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:429:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalArchitecture.g:430:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
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
    // InternalArchitecture.g:437:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:441:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalArchitecture.g:442:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:442:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalArchitecture.g:443:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:444:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalArchitecture.g:444:3: rule__DomainDeclaration__NameAssignment_1
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
    // InternalArchitecture.g:452:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:456:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalArchitecture.g:457:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
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
    // InternalArchitecture.g:464:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:468:1: ( ( '{' ) )
            // InternalArchitecture.g:469:1: ( '{' )
            {
            // InternalArchitecture.g:469:1: ( '{' )
            // InternalArchitecture.g:470:2: '{'
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
    // InternalArchitecture.g:479:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:483:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalArchitecture.g:484:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
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
    // InternalArchitecture.g:491:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:495:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalArchitecture.g:496:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalArchitecture.g:496:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalArchitecture.g:497:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            }
            // InternalArchitecture.g:498:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArchitecture.g:498:3: rule__DomainDeclaration__ElementsAssignment_3
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
    // InternalArchitecture.g:506:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:510:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalArchitecture.g:511:2: rule__DomainDeclaration__Group__4__Impl
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
    // InternalArchitecture.g:517:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:521:1: ( ( '}' ) )
            // InternalArchitecture.g:522:1: ( '}' )
            {
            // InternalArchitecture.g:522:1: ( '}' )
            // InternalArchitecture.g:523:2: '}'
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
    // InternalArchitecture.g:533:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:537:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalArchitecture.g:538:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
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
    // InternalArchitecture.g:545:1: rule__AbstractModel__Group__0__Impl : ( ( ruleImport )? ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:549:1: ( ( ( ruleImport )? ) )
            // InternalArchitecture.g:550:1: ( ( ruleImport )? )
            {
            // InternalArchitecture.g:550:1: ( ( ruleImport )? )
            // InternalArchitecture.g:551:2: ( ruleImport )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 
            }
            // InternalArchitecture.g:552:2: ( ruleImport )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:552:3: ruleImport
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
    // InternalArchitecture.g:560:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:564:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalArchitecture.g:565:2: rule__AbstractModel__Group__1__Impl
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
    // InternalArchitecture.g:571:1: rule__AbstractModel__Group__1__Impl : ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:575:1: ( ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) )
            // InternalArchitecture.g:576:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            {
            // InternalArchitecture.g:576:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            // InternalArchitecture.g:577:2: ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* )
            {
            // InternalArchitecture.g:577:2: ( ( rule__AbstractModel__CompAssignment_1 ) )
            // InternalArchitecture.g:578:3: ( rule__AbstractModel__CompAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:579:3: ( rule__AbstractModel__CompAssignment_1 )
            // InternalArchitecture.g:579:4: rule__AbstractModel__CompAssignment_1
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

            // InternalArchitecture.g:582:2: ( ( rule__AbstractModel__CompAssignment_1 )* )
            // InternalArchitecture.g:583:3: ( rule__AbstractModel__CompAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:584:3: ( rule__AbstractModel__CompAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:584:4: rule__AbstractModel__CompAssignment_1
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
    // InternalArchitecture.g:594:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:598:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArchitecture.g:599:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalArchitecture.g:606:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:610:1: ( ( 'import' ) )
            // InternalArchitecture.g:611:1: ( 'import' )
            {
            // InternalArchitecture.g:611:1: ( 'import' )
            // InternalArchitecture.g:612:2: 'import'
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
    // InternalArchitecture.g:621:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:625:1: ( rule__Import__Group__1__Impl )
            // InternalArchitecture.g:626:2: rule__Import__Group__1__Impl
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
    // InternalArchitecture.g:632:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:636:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalArchitecture.g:637:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalArchitecture.g:637:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalArchitecture.g:638:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalArchitecture.g:639:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalArchitecture.g:639:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalArchitecture.g:648:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:652:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalArchitecture.g:653:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalArchitecture.g:660:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:664:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:665:1: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:665:1: ( ruleQualifiedName )
            // InternalArchitecture.g:666:2: ruleQualifiedName
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
    // InternalArchitecture.g:675:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:679:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalArchitecture.g:680:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalArchitecture.g:686:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:690:1: ( ( ( '.*' )? ) )
            // InternalArchitecture.g:691:1: ( ( '.*' )? )
            {
            // InternalArchitecture.g:691:1: ( ( '.*' )? )
            // InternalArchitecture.g:692:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalArchitecture.g:693:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalArchitecture.g:693:3: '.*'
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
    // InternalArchitecture.g:702:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:706:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalArchitecture.g:707:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalArchitecture.g:714:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:718:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:719:1: ( RULE_ID )
            {
            // InternalArchitecture.g:719:1: ( RULE_ID )
            // InternalArchitecture.g:720:2: RULE_ID
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
    // InternalArchitecture.g:729:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:733:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalArchitecture.g:734:2: rule__QualifiedName__Group__1__Impl
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
    // InternalArchitecture.g:740:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:744:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalArchitecture.g:745:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalArchitecture.g:745:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalArchitecture.g:746:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalArchitecture.g:747:2: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArchitecture.g:747:3: rule__QualifiedName__Group_1__0
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
    // InternalArchitecture.g:756:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:760:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalArchitecture.g:761:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalArchitecture.g:768:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:772:1: ( ( '.' ) )
            // InternalArchitecture.g:773:1: ( '.' )
            {
            // InternalArchitecture.g:773:1: ( '.' )
            // InternalArchitecture.g:774:2: '.'
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
    // InternalArchitecture.g:783:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:787:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalArchitecture.g:788:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalArchitecture.g:794:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:798:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:799:1: ( RULE_ID )
            {
            // InternalArchitecture.g:799:1: ( RULE_ID )
            // InternalArchitecture.g:800:2: RULE_ID
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
    // InternalArchitecture.g:810:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:814:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArchitecture.g:815:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalArchitecture.g:822:1: rule__Component__Group__0__Impl : ( 'Component:' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:826:1: ( ( 'Component:' ) )
            // InternalArchitecture.g:827:1: ( 'Component:' )
            {
            // InternalArchitecture.g:827:1: ( 'Component:' )
            // InternalArchitecture.g:828:2: 'Component:'
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
    // InternalArchitecture.g:837:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:841:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArchitecture.g:842:2: rule__Component__Group__1__Impl rule__Component__Group__2
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
    // InternalArchitecture.g:849:1: rule__Component__Group__1__Impl : ( ( rule__Component__NameAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:853:1: ( ( ( rule__Component__NameAssignment_1 ) ) )
            // InternalArchitecture.g:854:1: ( ( rule__Component__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:854:1: ( ( rule__Component__NameAssignment_1 ) )
            // InternalArchitecture.g:855:2: ( rule__Component__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:856:2: ( rule__Component__NameAssignment_1 )
            // InternalArchitecture.g:856:3: rule__Component__NameAssignment_1
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
    // InternalArchitecture.g:864:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:868:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalArchitecture.g:869:2: rule__Component__Group__2__Impl rule__Component__Group__3
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
    // InternalArchitecture.g:876:1: rule__Component__Group__2__Impl : ( '{' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:880:1: ( ( '{' ) )
            // InternalArchitecture.g:881:1: ( '{' )
            {
            // InternalArchitecture.g:881:1: ( '{' )
            // InternalArchitecture.g:882:2: '{'
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
    // InternalArchitecture.g:891:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:895:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalArchitecture.g:896:2: rule__Component__Group__3__Impl rule__Component__Group__4
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
    // InternalArchitecture.g:903:1: rule__Component__Group__3__Impl : ( 'providedServices' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:907:1: ( ( 'providedServices' ) )
            // InternalArchitecture.g:908:1: ( 'providedServices' )
            {
            // InternalArchitecture.g:908:1: ( 'providedServices' )
            // InternalArchitecture.g:909:2: 'providedServices'
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
    // InternalArchitecture.g:918:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:922:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalArchitecture.g:923:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalArchitecture.g:930:1: rule__Component__Group__4__Impl : ( '(' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:934:1: ( ( '(' ) )
            // InternalArchitecture.g:935:1: ( '(' )
            {
            // InternalArchitecture.g:935:1: ( '(' )
            // InternalArchitecture.g:936:2: '('
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
    // InternalArchitecture.g:945:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:949:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalArchitecture.g:950:2: rule__Component__Group__5__Impl rule__Component__Group__6
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
    // InternalArchitecture.g:957:1: rule__Component__Group__5__Impl : ( ( rule__Component__Group_5__0 )* ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:961:1: ( ( ( rule__Component__Group_5__0 )* ) )
            // InternalArchitecture.g:962:1: ( ( rule__Component__Group_5__0 )* )
            {
            // InternalArchitecture.g:962:1: ( ( rule__Component__Group_5__0 )* )
            // InternalArchitecture.g:963:2: ( rule__Component__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5()); 
            }
            // InternalArchitecture.g:964:2: ( rule__Component__Group_5__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArchitecture.g:964:3: rule__Component__Group_5__0
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
    // InternalArchitecture.g:972:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:976:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalArchitecture.g:977:2: rule__Component__Group__6__Impl rule__Component__Group__7
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
    // InternalArchitecture.g:984:1: rule__Component__Group__6__Impl : ( ')' ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:988:1: ( ( ')' ) )
            // InternalArchitecture.g:989:1: ( ')' )
            {
            // InternalArchitecture.g:989:1: ( ')' )
            // InternalArchitecture.g:990:2: ')'
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
    // InternalArchitecture.g:999:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1003:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalArchitecture.g:1004:2: rule__Component__Group__7__Impl rule__Component__Group__8
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
    // InternalArchitecture.g:1011:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1015:1: ( ( ( rule__Component__Group_7__0 )* ) )
            // InternalArchitecture.g:1016:1: ( ( rule__Component__Group_7__0 )* )
            {
            // InternalArchitecture.g:1016:1: ( ( rule__Component__Group_7__0 )* )
            // InternalArchitecture.g:1017:2: ( rule__Component__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_7()); 
            }
            // InternalArchitecture.g:1018:2: ( rule__Component__Group_7__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:1018:3: rule__Component__Group_7__0
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
    // InternalArchitecture.g:1026:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1030:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalArchitecture.g:1031:2: rule__Component__Group__8__Impl rule__Component__Group__9
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
    // InternalArchitecture.g:1038:1: rule__Component__Group__8__Impl : ( ( rule__Component__VarsAssignment_8 )* ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1042:1: ( ( ( rule__Component__VarsAssignment_8 )* ) )
            // InternalArchitecture.g:1043:1: ( ( rule__Component__VarsAssignment_8 )* )
            {
            // InternalArchitecture.g:1043:1: ( ( rule__Component__VarsAssignment_8 )* )
            // InternalArchitecture.g:1044:2: ( rule__Component__VarsAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getVarsAssignment_8()); 
            }
            // InternalArchitecture.g:1045:2: ( rule__Component__VarsAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:1045:3: rule__Component__VarsAssignment_8
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
    // InternalArchitecture.g:1053:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1057:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalArchitecture.g:1058:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_13);
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
    // InternalArchitecture.g:1065:1: rule__Component__Group__9__Impl : ( 'requiredService' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1069:1: ( ( 'requiredService' ) )
            // InternalArchitecture.g:1070:1: ( 'requiredService' )
            {
            // InternalArchitecture.g:1070:1: ( 'requiredService' )
            // InternalArchitecture.g:1071:2: 'requiredService'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRequiredServiceKeyword_9()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRequiredServiceKeyword_9()); 
            }

            }


            }

        }
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
    // InternalArchitecture.g:1080:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1084:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalArchitecture.g:1085:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:1092:1: rule__Component__Group__10__Impl : ( '(' ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1096:1: ( ( '(' ) )
            // InternalArchitecture.g:1097:1: ( '(' )
            {
            // InternalArchitecture.g:1097:1: ( '(' )
            // InternalArchitecture.g:1098:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_10()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_10()); 
            }

            }


            }

        }
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
    // InternalArchitecture.g:1107:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1111:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalArchitecture.g:1112:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:1119:1: rule__Component__Group__11__Impl : ( ( rule__Component__Group_11__0 )* ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1123:1: ( ( ( rule__Component__Group_11__0 )* ) )
            // InternalArchitecture.g:1124:1: ( ( rule__Component__Group_11__0 )* )
            {
            // InternalArchitecture.g:1124:1: ( ( rule__Component__Group_11__0 )* )
            // InternalArchitecture.g:1125:2: ( rule__Component__Group_11__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_11()); 
            }
            // InternalArchitecture.g:1126:2: ( rule__Component__Group_11__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:1126:3: rule__Component__Group_11__0
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalArchitecture.g:1134:1: rule__Component__Group__12 : rule__Component__Group__12__Impl rule__Component__Group__13 ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1138:1: ( rule__Component__Group__12__Impl rule__Component__Group__13 )
            // InternalArchitecture.g:1139:2: rule__Component__Group__12__Impl rule__Component__Group__13
            {
            pushFollow(FOLLOW_18);
            rule__Component__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group__13();

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
    // InternalArchitecture.g:1146:1: rule__Component__Group__12__Impl : ( ')' ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1150:1: ( ( ')' ) )
            // InternalArchitecture.g:1151:1: ( ')' )
            {
            // InternalArchitecture.g:1151:1: ( ')' )
            // InternalArchitecture.g:1152:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_12()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_12()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Component__Group__13"
    // InternalArchitecture.g:1161:1: rule__Component__Group__13 : rule__Component__Group__13__Impl ;
    public final void rule__Component__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1165:1: ( rule__Component__Group__13__Impl )
            // InternalArchitecture.g:1166:2: rule__Component__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__13__Impl();

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
    // $ANTLR end "rule__Component__Group__13"


    // $ANTLR start "rule__Component__Group__13__Impl"
    // InternalArchitecture.g:1172:1: rule__Component__Group__13__Impl : ( '}' ) ;
    public final void rule__Component__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1176:1: ( ( '}' ) )
            // InternalArchitecture.g:1177:1: ( '}' )
            {
            // InternalArchitecture.g:1177:1: ( '}' )
            // InternalArchitecture.g:1178:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__13__Impl"


    // $ANTLR start "rule__Component__Group_5__0"
    // InternalArchitecture.g:1188:1: rule__Component__Group_5__0 : rule__Component__Group_5__0__Impl rule__Component__Group_5__1 ;
    public final void rule__Component__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1192:1: ( rule__Component__Group_5__0__Impl rule__Component__Group_5__1 )
            // InternalArchitecture.g:1193:2: rule__Component__Group_5__0__Impl rule__Component__Group_5__1
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
    // InternalArchitecture.g:1200:1: rule__Component__Group_5__0__Impl : ( ( rule__Component__Group_5_0__0 )* ) ;
    public final void rule__Component__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1204:1: ( ( ( rule__Component__Group_5_0__0 )* ) )
            // InternalArchitecture.g:1205:1: ( ( rule__Component__Group_5_0__0 )* )
            {
            // InternalArchitecture.g:1205:1: ( ( rule__Component__Group_5_0__0 )* )
            // InternalArchitecture.g:1206:2: ( rule__Component__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_5_0()); 
            }
            // InternalArchitecture.g:1207:2: ( rule__Component__Group_5_0__0 )*
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
            	    // InternalArchitecture.g:1207:3: rule__Component__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_15);
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
    // InternalArchitecture.g:1215:1: rule__Component__Group_5__1 : rule__Component__Group_5__1__Impl ;
    public final void rule__Component__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1219:1: ( rule__Component__Group_5__1__Impl )
            // InternalArchitecture.g:1220:2: rule__Component__Group_5__1__Impl
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
    // InternalArchitecture.g:1226:1: rule__Component__Group_5__1__Impl : ( ( rule__Component__OpsAssignment_5_1 ) ) ;
    public final void rule__Component__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1230:1: ( ( ( rule__Component__OpsAssignment_5_1 ) ) )
            // InternalArchitecture.g:1231:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            {
            // InternalArchitecture.g:1231:1: ( ( rule__Component__OpsAssignment_5_1 ) )
            // InternalArchitecture.g:1232:2: ( rule__Component__OpsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_1()); 
            }
            // InternalArchitecture.g:1233:2: ( rule__Component__OpsAssignment_5_1 )
            // InternalArchitecture.g:1233:3: rule__Component__OpsAssignment_5_1
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
    // InternalArchitecture.g:1242:1: rule__Component__Group_5_0__0 : rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 ;
    public final void rule__Component__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1246:1: ( rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1 )
            // InternalArchitecture.g:1247:2: rule__Component__Group_5_0__0__Impl rule__Component__Group_5_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalArchitecture.g:1254:1: rule__Component__Group_5_0__0__Impl : ( ( rule__Component__OpsAssignment_5_0_0 ) ) ;
    public final void rule__Component__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1258:1: ( ( ( rule__Component__OpsAssignment_5_0_0 ) ) )
            // InternalArchitecture.g:1259:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            {
            // InternalArchitecture.g:1259:1: ( ( rule__Component__OpsAssignment_5_0_0 ) )
            // InternalArchitecture.g:1260:2: ( rule__Component__OpsAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsAssignment_5_0_0()); 
            }
            // InternalArchitecture.g:1261:2: ( rule__Component__OpsAssignment_5_0_0 )
            // InternalArchitecture.g:1261:3: rule__Component__OpsAssignment_5_0_0
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
    // InternalArchitecture.g:1269:1: rule__Component__Group_5_0__1 : rule__Component__Group_5_0__1__Impl ;
    public final void rule__Component__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1273:1: ( rule__Component__Group_5_0__1__Impl )
            // InternalArchitecture.g:1274:2: rule__Component__Group_5_0__1__Impl
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
    // InternalArchitecture.g:1280:1: rule__Component__Group_5_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1284:1: ( ( ',' ) )
            // InternalArchitecture.g:1285:1: ( ',' )
            {
            // InternalArchitecture.g:1285:1: ( ',' )
            // InternalArchitecture.g:1286:2: ','
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


    // $ANTLR start "rule__Component__Group_7__0"
    // InternalArchitecture.g:1296:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1300:1: ( rule__Component__Group_7__0__Impl )
            // InternalArchitecture.g:1301:2: rule__Component__Group_7__0__Impl
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
    // InternalArchitecture.g:1307:1: rule__Component__Group_7__0__Impl : ( ( rule__Component__OperationsAssignment_7_0 ) ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1311:1: ( ( ( rule__Component__OperationsAssignment_7_0 ) ) )
            // InternalArchitecture.g:1312:1: ( ( rule__Component__OperationsAssignment_7_0 ) )
            {
            // InternalArchitecture.g:1312:1: ( ( rule__Component__OperationsAssignment_7_0 ) )
            // InternalArchitecture.g:1313:2: ( rule__Component__OperationsAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOperationsAssignment_7_0()); 
            }
            // InternalArchitecture.g:1314:2: ( rule__Component__OperationsAssignment_7_0 )
            // InternalArchitecture.g:1314:3: rule__Component__OperationsAssignment_7_0
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


    // $ANTLR start "rule__Component__Group_11__0"
    // InternalArchitecture.g:1323:1: rule__Component__Group_11__0 : rule__Component__Group_11__0__Impl rule__Component__Group_11__1 ;
    public final void rule__Component__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1327:1: ( rule__Component__Group_11__0__Impl rule__Component__Group_11__1 )
            // InternalArchitecture.g:1328:2: rule__Component__Group_11__0__Impl rule__Component__Group_11__1
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group_11__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_11__1();

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
    // InternalArchitecture.g:1335:1: rule__Component__Group_11__0__Impl : ( ( rule__Component__Group_11_0__0 )* ) ;
    public final void rule__Component__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1339:1: ( ( ( rule__Component__Group_11_0__0 )* ) )
            // InternalArchitecture.g:1340:1: ( ( rule__Component__Group_11_0__0 )* )
            {
            // InternalArchitecture.g:1340:1: ( ( rule__Component__Group_11_0__0 )* )
            // InternalArchitecture.g:1341:2: ( rule__Component__Group_11_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_11_0()); 
            }
            // InternalArchitecture.g:1342:2: ( rule__Component__Group_11_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==20) ) {
                        int LA14_2 = input.LA(3);

                        if ( (LA14_2==RULE_ID) ) {
                            int LA14_3 = input.LA(4);

                            if ( (LA14_3==26) ) {
                                alt14=1;
                            }


                        }


                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalArchitecture.g:1342:3: rule__Component__Group_11_0__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__Group_11_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getGroup_11_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Component__Group_11__1"
    // InternalArchitecture.g:1350:1: rule__Component__Group_11__1 : rule__Component__Group_11__1__Impl ;
    public final void rule__Component__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1354:1: ( rule__Component__Group_11__1__Impl )
            // InternalArchitecture.g:1355:2: rule__Component__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_11__1__Impl();

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
    // $ANTLR end "rule__Component__Group_11__1"


    // $ANTLR start "rule__Component__Group_11__1__Impl"
    // InternalArchitecture.g:1361:1: rule__Component__Group_11__1__Impl : ( ( rule__Component__CallsAssignment_11_1 ) ) ;
    public final void rule__Component__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1365:1: ( ( ( rule__Component__CallsAssignment_11_1 ) ) )
            // InternalArchitecture.g:1366:1: ( ( rule__Component__CallsAssignment_11_1 ) )
            {
            // InternalArchitecture.g:1366:1: ( ( rule__Component__CallsAssignment_11_1 ) )
            // InternalArchitecture.g:1367:2: ( rule__Component__CallsAssignment_11_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCallsAssignment_11_1()); 
            }
            // InternalArchitecture.g:1368:2: ( rule__Component__CallsAssignment_11_1 )
            // InternalArchitecture.g:1368:3: rule__Component__CallsAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__CallsAssignment_11_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCallsAssignment_11_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11__1__Impl"


    // $ANTLR start "rule__Component__Group_11_0__0"
    // InternalArchitecture.g:1377:1: rule__Component__Group_11_0__0 : rule__Component__Group_11_0__0__Impl rule__Component__Group_11_0__1 ;
    public final void rule__Component__Group_11_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1381:1: ( rule__Component__Group_11_0__0__Impl rule__Component__Group_11_0__1 )
            // InternalArchitecture.g:1382:2: rule__Component__Group_11_0__0__Impl rule__Component__Group_11_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group_11_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Component__Group_11_0__1();

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
    // $ANTLR end "rule__Component__Group_11_0__0"


    // $ANTLR start "rule__Component__Group_11_0__0__Impl"
    // InternalArchitecture.g:1389:1: rule__Component__Group_11_0__0__Impl : ( ( rule__Component__CallsAssignment_11_0_0 ) ) ;
    public final void rule__Component__Group_11_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1393:1: ( ( ( rule__Component__CallsAssignment_11_0_0 ) ) )
            // InternalArchitecture.g:1394:1: ( ( rule__Component__CallsAssignment_11_0_0 ) )
            {
            // InternalArchitecture.g:1394:1: ( ( rule__Component__CallsAssignment_11_0_0 ) )
            // InternalArchitecture.g:1395:2: ( rule__Component__CallsAssignment_11_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCallsAssignment_11_0_0()); 
            }
            // InternalArchitecture.g:1396:2: ( rule__Component__CallsAssignment_11_0_0 )
            // InternalArchitecture.g:1396:3: rule__Component__CallsAssignment_11_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__CallsAssignment_11_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCallsAssignment_11_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11_0__0__Impl"


    // $ANTLR start "rule__Component__Group_11_0__1"
    // InternalArchitecture.g:1404:1: rule__Component__Group_11_0__1 : rule__Component__Group_11_0__1__Impl ;
    public final void rule__Component__Group_11_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1408:1: ( rule__Component__Group_11_0__1__Impl )
            // InternalArchitecture.g:1409:2: rule__Component__Group_11_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_11_0__1__Impl();

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
    // $ANTLR end "rule__Component__Group_11_0__1"


    // $ANTLR start "rule__Component__Group_11_0__1__Impl"
    // InternalArchitecture.g:1415:1: rule__Component__Group_11_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_11_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1419:1: ( ( ',' ) )
            // InternalArchitecture.g:1420:1: ( ',' )
            {
            // InternalArchitecture.g:1420:1: ( ',' )
            // InternalArchitecture.g:1421:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_11_0_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCommaKeyword_11_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11_0__1__Impl"


    // $ANTLR start "rule__Call__Group__0"
    // InternalArchitecture.g:1431:1: rule__Call__Group__0 : rule__Call__Group__0__Impl rule__Call__Group__1 ;
    public final void rule__Call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1435:1: ( rule__Call__Group__0__Impl rule__Call__Group__1 )
            // InternalArchitecture.g:1436:2: rule__Call__Group__0__Impl rule__Call__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Call__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Call__Group__1();

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
    // $ANTLR end "rule__Call__Group__0"


    // $ANTLR start "rule__Call__Group__0__Impl"
    // InternalArchitecture.g:1443:1: rule__Call__Group__0__Impl : ( ( rule__Call__ReceiverAssignment_0 ) ) ;
    public final void rule__Call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1447:1: ( ( ( rule__Call__ReceiverAssignment_0 ) ) )
            // InternalArchitecture.g:1448:1: ( ( rule__Call__ReceiverAssignment_0 ) )
            {
            // InternalArchitecture.g:1448:1: ( ( rule__Call__ReceiverAssignment_0 ) )
            // InternalArchitecture.g:1449:2: ( rule__Call__ReceiverAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getReceiverAssignment_0()); 
            }
            // InternalArchitecture.g:1450:2: ( rule__Call__ReceiverAssignment_0 )
            // InternalArchitecture.g:1450:3: rule__Call__ReceiverAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Call__ReceiverAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getReceiverAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__0__Impl"


    // $ANTLR start "rule__Call__Group__1"
    // InternalArchitecture.g:1458:1: rule__Call__Group__1 : rule__Call__Group__1__Impl rule__Call__Group__2 ;
    public final void rule__Call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1462:1: ( rule__Call__Group__1__Impl rule__Call__Group__2 )
            // InternalArchitecture.g:1463:2: rule__Call__Group__1__Impl rule__Call__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Call__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Call__Group__2();

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
    // $ANTLR end "rule__Call__Group__1"


    // $ANTLR start "rule__Call__Group__1__Impl"
    // InternalArchitecture.g:1470:1: rule__Call__Group__1__Impl : ( '.' ) ;
    public final void rule__Call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1474:1: ( ( '.' ) )
            // InternalArchitecture.g:1475:1: ( '.' )
            {
            // InternalArchitecture.g:1475:1: ( '.' )
            // InternalArchitecture.g:1476:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getFullStopKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__1__Impl"


    // $ANTLR start "rule__Call__Group__2"
    // InternalArchitecture.g:1485:1: rule__Call__Group__2 : rule__Call__Group__2__Impl ;
    public final void rule__Call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1489:1: ( rule__Call__Group__2__Impl )
            // InternalArchitecture.g:1490:2: rule__Call__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Call__Group__2__Impl();

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
    // $ANTLR end "rule__Call__Group__2"


    // $ANTLR start "rule__Call__Group__2__Impl"
    // InternalArchitecture.g:1496:1: rule__Call__Group__2__Impl : ( ( rule__Call__MemberAssignment_2 ) ) ;
    public final void rule__Call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1500:1: ( ( ( rule__Call__MemberAssignment_2 ) ) )
            // InternalArchitecture.g:1501:1: ( ( rule__Call__MemberAssignment_2 ) )
            {
            // InternalArchitecture.g:1501:1: ( ( rule__Call__MemberAssignment_2 ) )
            // InternalArchitecture.g:1502:2: ( rule__Call__MemberAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getMemberAssignment_2()); 
            }
            // InternalArchitecture.g:1503:2: ( rule__Call__MemberAssignment_2 )
            // InternalArchitecture.g:1503:3: rule__Call__MemberAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Call__MemberAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getMemberAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalArchitecture.g:1512:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1516:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1517:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalArchitecture.g:1524:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1528:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1529:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1529:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1530:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalArchitecture.g:1531:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1531:3: rule__Variable__NameAssignment_0
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
    // InternalArchitecture.g:1539:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1543:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1544:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalArchitecture.g:1551:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1555:1: ( ( ':' ) )
            // InternalArchitecture.g:1556:1: ( ':' )
            {
            // InternalArchitecture.g:1556:1: ( ':' )
            // InternalArchitecture.g:1557:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1566:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1570:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1571:2: rule__Variable__Group__2__Impl
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
    // InternalArchitecture.g:1577:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1581:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1582:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1582:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1583:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalArchitecture.g:1584:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1584:3: rule__Variable__TypeAssignment_2
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
    // InternalArchitecture.g:1593:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1597:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalArchitecture.g:1598:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:1605:1: rule__Operation__Group__0__Impl : ( 'def' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1609:1: ( ( 'def' ) )
            // InternalArchitecture.g:1610:1: ( 'def' )
            {
            // InternalArchitecture.g:1610:1: ( 'def' )
            // InternalArchitecture.g:1611:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getDefKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1620:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1624:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalArchitecture.g:1625:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalArchitecture.g:1632:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1636:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalArchitecture.g:1637:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalArchitecture.g:1637:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalArchitecture.g:1638:2: ( rule__Operation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }
            // InternalArchitecture.g:1639:2: ( rule__Operation__NameAssignment_1 )
            // InternalArchitecture.g:1639:3: rule__Operation__NameAssignment_1
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
    // InternalArchitecture.g:1647:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1651:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalArchitecture.g:1652:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:1659:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1663:1: ( ( '(' ) )
            // InternalArchitecture.g:1664:1: ( '(' )
            {
            // InternalArchitecture.g:1664:1: ( '(' )
            // InternalArchitecture.g:1665:2: '('
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
    // InternalArchitecture.g:1674:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1678:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalArchitecture.g:1679:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:1686:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )* ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1690:1: ( ( ( rule__Operation__Group_3__0 )* ) )
            // InternalArchitecture.g:1691:1: ( ( rule__Operation__Group_3__0 )* )
            {
            // InternalArchitecture.g:1691:1: ( ( rule__Operation__Group_3__0 )* )
            // InternalArchitecture.g:1692:2: ( rule__Operation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3()); 
            }
            // InternalArchitecture.g:1693:2: ( rule__Operation__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalArchitecture.g:1693:3: rule__Operation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Operation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalArchitecture.g:1701:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1705:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalArchitecture.g:1706:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalArchitecture.g:1713:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1717:1: ( ( ')' ) )
            // InternalArchitecture.g:1718:1: ( ')' )
            {
            // InternalArchitecture.g:1718:1: ( ')' )
            // InternalArchitecture.g:1719:2: ')'
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
    // InternalArchitecture.g:1728:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1732:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalArchitecture.g:1733:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_21);
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
    // InternalArchitecture.g:1740:1: rule__Operation__Group__5__Impl : ( ':' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1744:1: ( ( ':' ) )
            // InternalArchitecture.g:1745:1: ( ':' )
            {
            // InternalArchitecture.g:1745:1: ( ':' )
            // InternalArchitecture.g:1746:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1755:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1759:1: ( rule__Operation__Group__6__Impl )
            // InternalArchitecture.g:1760:2: rule__Operation__Group__6__Impl
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
    // InternalArchitecture.g:1766:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__TypeAssignment_6 ) ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1770:1: ( ( ( rule__Operation__TypeAssignment_6 ) ) )
            // InternalArchitecture.g:1771:1: ( ( rule__Operation__TypeAssignment_6 ) )
            {
            // InternalArchitecture.g:1771:1: ( ( rule__Operation__TypeAssignment_6 ) )
            // InternalArchitecture.g:1772:2: ( rule__Operation__TypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeAssignment_6()); 
            }
            // InternalArchitecture.g:1773:2: ( rule__Operation__TypeAssignment_6 )
            // InternalArchitecture.g:1773:3: rule__Operation__TypeAssignment_6
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
    // InternalArchitecture.g:1782:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1786:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // InternalArchitecture.g:1787:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:1794:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__Group_3_0__0 )* ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1798:1: ( ( ( rule__Operation__Group_3_0__0 )* ) )
            // InternalArchitecture.g:1799:1: ( ( rule__Operation__Group_3_0__0 )* )
            {
            // InternalArchitecture.g:1799:1: ( ( rule__Operation__Group_3_0__0 )* )
            // InternalArchitecture.g:1800:2: ( rule__Operation__Group_3_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3_0()); 
            }
            // InternalArchitecture.g:1801:2: ( rule__Operation__Group_3_0__0 )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalArchitecture.g:1801:3: rule__Operation__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Operation__Group_3_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalArchitecture.g:1809:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1813:1: ( rule__Operation__Group_3__1__Impl )
            // InternalArchitecture.g:1814:2: rule__Operation__Group_3__1__Impl
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
    // InternalArchitecture.g:1820:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__ArgAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1824:1: ( ( ( rule__Operation__ArgAssignment_3_1 ) ) )
            // InternalArchitecture.g:1825:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            {
            // InternalArchitecture.g:1825:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            // InternalArchitecture.g:1826:2: ( rule__Operation__ArgAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_1()); 
            }
            // InternalArchitecture.g:1827:2: ( rule__Operation__ArgAssignment_3_1 )
            // InternalArchitecture.g:1827:3: rule__Operation__ArgAssignment_3_1
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
    // InternalArchitecture.g:1836:1: rule__Operation__Group_3_0__0 : rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 ;
    public final void rule__Operation__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1840:1: ( rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 )
            // InternalArchitecture.g:1841:2: rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalArchitecture.g:1848:1: rule__Operation__Group_3_0__0__Impl : ( ( rule__Operation__ArgAssignment_3_0_0 ) ) ;
    public final void rule__Operation__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1852:1: ( ( ( rule__Operation__ArgAssignment_3_0_0 ) ) )
            // InternalArchitecture.g:1853:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            {
            // InternalArchitecture.g:1853:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            // InternalArchitecture.g:1854:2: ( rule__Operation__ArgAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_0_0()); 
            }
            // InternalArchitecture.g:1855:2: ( rule__Operation__ArgAssignment_3_0_0 )
            // InternalArchitecture.g:1855:3: rule__Operation__ArgAssignment_3_0_0
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
    // InternalArchitecture.g:1863:1: rule__Operation__Group_3_0__1 : rule__Operation__Group_3_0__1__Impl ;
    public final void rule__Operation__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1867:1: ( rule__Operation__Group_3_0__1__Impl )
            // InternalArchitecture.g:1868:2: rule__Operation__Group_3_0__1__Impl
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
    // InternalArchitecture.g:1874:1: rule__Operation__Group_3_0__1__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1878:1: ( ( ',' ) )
            // InternalArchitecture.g:1879:1: ( ',' )
            {
            // InternalArchitecture.g:1879:1: ( ',' )
            // InternalArchitecture.g:1880:2: ','
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


    // $ANTLR start "rule__AtomicType__Group_1__0"
    // InternalArchitecture.g:1890:1: rule__AtomicType__Group_1__0 : rule__AtomicType__Group_1__0__Impl rule__AtomicType__Group_1__1 ;
    public final void rule__AtomicType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1894:1: ( rule__AtomicType__Group_1__0__Impl rule__AtomicType__Group_1__1 )
            // InternalArchitecture.g:1895:2: rule__AtomicType__Group_1__0__Impl rule__AtomicType__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__AtomicType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AtomicType__Group_1__1();

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
    // $ANTLR end "rule__AtomicType__Group_1__0"


    // $ANTLR start "rule__AtomicType__Group_1__0__Impl"
    // InternalArchitecture.g:1902:1: rule__AtomicType__Group_1__0__Impl : ( () ) ;
    public final void rule__AtomicType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1906:1: ( ( () ) )
            // InternalArchitecture.g:1907:1: ( () )
            {
            // InternalArchitecture.g:1907:1: ( () )
            // InternalArchitecture.g:1908:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getVariableRefAction_1_0()); 
            }
            // InternalArchitecture.g:1909:2: ()
            // InternalArchitecture.g:1909:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getVariableRefAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicType__Group_1__0__Impl"


    // $ANTLR start "rule__AtomicType__Group_1__1"
    // InternalArchitecture.g:1917:1: rule__AtomicType__Group_1__1 : rule__AtomicType__Group_1__1__Impl ;
    public final void rule__AtomicType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1921:1: ( rule__AtomicType__Group_1__1__Impl )
            // InternalArchitecture.g:1922:2: rule__AtomicType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomicType__Group_1__1__Impl();

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
    // $ANTLR end "rule__AtomicType__Group_1__1"


    // $ANTLR start "rule__AtomicType__Group_1__1__Impl"
    // InternalArchitecture.g:1928:1: rule__AtomicType__Group_1__1__Impl : ( ( rule__AtomicType__TypeAssignment_1_1 ) ) ;
    public final void rule__AtomicType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1932:1: ( ( ( rule__AtomicType__TypeAssignment_1_1 ) ) )
            // InternalArchitecture.g:1933:1: ( ( rule__AtomicType__TypeAssignment_1_1 ) )
            {
            // InternalArchitecture.g:1933:1: ( ( rule__AtomicType__TypeAssignment_1_1 ) )
            // InternalArchitecture.g:1934:2: ( rule__AtomicType__TypeAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getTypeAssignment_1_1()); 
            }
            // InternalArchitecture.g:1935:2: ( rule__AtomicType__TypeAssignment_1_1 )
            // InternalArchitecture.g:1935:3: rule__AtomicType__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomicType__TypeAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getTypeAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicType__Group_1__1__Impl"


    // $ANTLR start "rule__Model__PackageAssignment"
    // InternalArchitecture.g:1944:1: rule__Model__PackageAssignment : ( ruleDomainDeclaration ) ;
    public final void rule__Model__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1948:1: ( ( ruleDomainDeclaration ) )
            // InternalArchitecture.g:1949:2: ( ruleDomainDeclaration )
            {
            // InternalArchitecture.g:1949:2: ( ruleDomainDeclaration )
            // InternalArchitecture.g:1950:3: ruleDomainDeclaration
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
    // InternalArchitecture.g:1959:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1963:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:1964:2: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:1964:2: ( ruleQualifiedName )
            // InternalArchitecture.g:1965:3: ruleQualifiedName
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
    // InternalArchitecture.g:1974:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractModel ) ;
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1978:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:1979:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:1979:2: ( ruleAbstractModel )
            // InternalArchitecture.g:1980:3: ruleAbstractModel
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
    // InternalArchitecture.g:1989:1: rule__AbstractModel__CompAssignment_1 : ( ruleComponent ) ;
    public final void rule__AbstractModel__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1993:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:1994:2: ( ruleComponent )
            {
            // InternalArchitecture.g:1994:2: ( ruleComponent )
            // InternalArchitecture.g:1995:3: ruleComponent
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
    // InternalArchitecture.g:2004:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2008:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:2009:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:2009:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:2010:3: ruleQualifiedNameWithWildcard
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
    // InternalArchitecture.g:2019:1: rule__Component__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2023:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2024:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2024:2: ( RULE_ID )
            // InternalArchitecture.g:2025:3: RULE_ID
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
    // InternalArchitecture.g:2034:1: rule__Component__OpsAssignment_5_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2038:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2039:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2039:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2040:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_0_0_0()); 
            }
            // InternalArchitecture.g:2041:3: ( RULE_ID )
            // InternalArchitecture.g:2042:4: RULE_ID
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
    // InternalArchitecture.g:2053:1: rule__Component__OpsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Component__OpsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2057:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2058:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2058:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2059:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getOpsOperationCrossReference_5_1_0()); 
            }
            // InternalArchitecture.g:2060:3: ( RULE_ID )
            // InternalArchitecture.g:2061:4: RULE_ID
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
    // InternalArchitecture.g:2072:1: rule__Component__OperationsAssignment_7_0 : ( ruleOperation ) ;
    public final void rule__Component__OperationsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2076:1: ( ( ruleOperation ) )
            // InternalArchitecture.g:2077:2: ( ruleOperation )
            {
            // InternalArchitecture.g:2077:2: ( ruleOperation )
            // InternalArchitecture.g:2078:3: ruleOperation
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
    // InternalArchitecture.g:2087:1: rule__Component__VarsAssignment_8 : ( ruleVariable ) ;
    public final void rule__Component__VarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2091:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2092:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2092:2: ( ruleVariable )
            // InternalArchitecture.g:2093:3: ruleVariable
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


    // $ANTLR start "rule__Component__CallsAssignment_11_0_0"
    // InternalArchitecture.g:2102:1: rule__Component__CallsAssignment_11_0_0 : ( ruleCall ) ;
    public final void rule__Component__CallsAssignment_11_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2106:1: ( ( ruleCall ) )
            // InternalArchitecture.g:2107:2: ( ruleCall )
            {
            // InternalArchitecture.g:2107:2: ( ruleCall )
            // InternalArchitecture.g:2108:3: ruleCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCallsCallParserRuleCall_11_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCallsCallParserRuleCall_11_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__CallsAssignment_11_0_0"


    // $ANTLR start "rule__Component__CallsAssignment_11_1"
    // InternalArchitecture.g:2117:1: rule__Component__CallsAssignment_11_1 : ( ruleCall ) ;
    public final void rule__Component__CallsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2121:1: ( ( ruleCall ) )
            // InternalArchitecture.g:2122:2: ( ruleCall )
            {
            // InternalArchitecture.g:2122:2: ( ruleCall )
            // InternalArchitecture.g:2123:3: ruleCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCallsCallParserRuleCall_11_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComponentAccess().getCallsCallParserRuleCall_11_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__CallsAssignment_11_1"


    // $ANTLR start "rule__Call__ReceiverAssignment_0"
    // InternalArchitecture.g:2132:1: rule__Call__ReceiverAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Call__ReceiverAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2136:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2137:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2137:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2138:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getReceiverComponentCrossReference_0_0()); 
            }
            // InternalArchitecture.g:2139:3: ( RULE_ID )
            // InternalArchitecture.g:2140:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getReceiverComponentIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getReceiverComponentIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getReceiverComponentCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__ReceiverAssignment_0"


    // $ANTLR start "rule__Call__MemberAssignment_2"
    // InternalArchitecture.g:2151:1: rule__Call__MemberAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Call__MemberAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2155:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2156:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2156:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2157:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getMemberOperationCrossReference_2_0()); 
            }
            // InternalArchitecture.g:2158:3: ( RULE_ID )
            // InternalArchitecture.g:2159:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallAccess().getMemberOperationIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getMemberOperationIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallAccess().getMemberOperationCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call__MemberAssignment_2"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalArchitecture.g:2170:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2174:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2175:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2175:2: ( RULE_ID )
            // InternalArchitecture.g:2176:3: RULE_ID
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
    // InternalArchitecture.g:2185:1: rule__Variable__TypeAssignment_2 : ( ruleAtomicType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2189:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2190:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2190:2: ( ruleAtomicType )
            // InternalArchitecture.g:2191:3: ruleAtomicType
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
    // InternalArchitecture.g:2200:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2204:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2205:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2205:2: ( RULE_ID )
            // InternalArchitecture.g:2206:3: RULE_ID
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
    // InternalArchitecture.g:2215:1: rule__Operation__ArgAssignment_3_0_0 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2219:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2220:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2220:2: ( ruleVariable )
            // InternalArchitecture.g:2221:3: ruleVariable
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
    // InternalArchitecture.g:2230:1: rule__Operation__ArgAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2234:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2235:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2235:2: ( ruleVariable )
            // InternalArchitecture.g:2236:3: ruleVariable
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
    // InternalArchitecture.g:2245:1: rule__Operation__TypeAssignment_6 : ( ruleAtomicType ) ;
    public final void rule__Operation__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2249:1: ( ( ruleAtomicType ) )
            // InternalArchitecture.g:2250:2: ( ruleAtomicType )
            {
            // InternalArchitecture.g:2250:2: ( ruleAtomicType )
            // InternalArchitecture.g:2251:3: ruleAtomicType
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
    // InternalArchitecture.g:2260:1: rule__AtomicType__AtomTypeAssignment_0 : ( ruleType ) ;
    public final void rule__AtomicType__AtomTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2264:1: ( ( ruleType ) )
            // InternalArchitecture.g:2265:2: ( ruleType )
            {
            // InternalArchitecture.g:2265:2: ( ruleType )
            // InternalArchitecture.g:2266:3: ruleType
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


    // $ANTLR start "rule__AtomicType__TypeAssignment_1_1"
    // InternalArchitecture.g:2275:1: rule__AtomicType__TypeAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__AtomicType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2279:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2280:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2280:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2281:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getTypeComponentCrossReference_1_1_0()); 
            }
            // InternalArchitecture.g:2282:3: ( RULE_ID )
            // InternalArchitecture.g:2283:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAtomicTypeAccess().getTypeComponentIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getTypeComponentIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAtomicTypeAccess().getTypeComponentCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomicType__TypeAssignment_1_1"

    // $ANTLR start synpred8_InternalArchitecture
    public final void synpred8_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:584:4: ( rule__AbstractModel__CompAssignment_1 )
        // InternalArchitecture.g:584:4: rule__AbstractModel__CompAssignment_1
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
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\54\uffff";
    static final String dfa_2s = "\1\1\53\uffff";
    static final String dfa_3s = "\1\21\1\uffff\1\4\1\20\1\26\1\27\5\4\1\33\2\27\10\4\1\24\1\21\2\33\1\4\1\0\3\4\1\uffff\14\4";
    static final String dfa_4s = "\1\25\1\uffff\1\4\1\20\1\26\1\27\1\30\1\32\1\34\2\4\1\33\2\27\1\16\2\30\5\31\1\24\1\21\2\33\1\4\1\0\2\16\1\32\1\uffff\5\32\5\34\2\4";
    static final String dfa_5s = "\1\uffff\1\2\35\uffff\1\1\14\uffff";
    static final String dfa_6s = "\33\uffff\1\0\20\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\2\uffff\1\2",
            "",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\23\uffff\1\10",
            "\1\7\23\uffff\1\10\1\uffff\1\11",
            "\1\13\24\uffff\1\14\2\uffff\1\12",
            "\1\7",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\25\6\uffff\1\21\1\22\1\23\1\24",
            "\1\26\23\uffff\1\27",
            "\1\30\23\uffff\1\31",
            "\1\13\24\uffff\1\14",
            "\1\13\24\uffff\1\14",
            "\1\13\24\uffff\1\14",
            "\1\13\24\uffff\1\14",
            "\1\13\24\uffff\1\14",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\uffff",
            "\1\44\6\uffff\1\40\1\41\1\42\1\43",
            "\1\51\6\uffff\1\45\1\46\1\47\1\50",
            "\1\26\23\uffff\1\27\1\uffff\1\52",
            "",
            "\1\30\23\uffff\1\31\1\uffff\1\53",
            "\1\30\23\uffff\1\31\1\uffff\1\53",
            "\1\30\23\uffff\1\31\1\uffff\1\53",
            "\1\30\23\uffff\1\31\1\uffff\1\53",
            "\1\30\23\uffff\1\31\1\uffff\1\53",
            "\1\13\24\uffff\1\14\2\uffff\1\12",
            "\1\13\24\uffff\1\14\2\uffff\1\12",
            "\1\13\24\uffff\1\14\2\uffff\1\12",
            "\1\13\24\uffff\1\14\2\uffff\1\12",
            "\1\13\24\uffff\1\14\2\uffff\1\12",
            "\1\26",
            "\1\30"
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
            return "()* loopback of 584:3: ( rule__AbstractModel__CompAssignment_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_27 = input.LA(1);

                         
                        int index6_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalArchitecture()) ) {s = 31;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index6_27);
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
    static final String dfa_8s = "\12\uffff";
    static final String dfa_9s = "\3\uffff\5\10\2\uffff";
    static final String dfa_10s = "\1\4\1\33\6\4\2\uffff";
    static final String dfa_11s = "\1\4\1\33\1\16\5\32\2\uffff";
    static final String dfa_12s = "\10\uffff\1\2\1\1";
    static final String dfa_13s = "\12\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2",
            "\1\7\6\uffff\1\3\1\4\1\5\1\6",
            "\1\10\23\uffff\1\10\1\uffff\1\11",
            "\1\10\23\uffff\1\10\1\uffff\1\11",
            "\1\10\23\uffff\1\10\1\uffff\1\11",
            "\1\10\23\uffff\1\10\1\uffff\1\11",
            "\1\10\23\uffff\1\10\1\uffff\1\11",
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

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 1801:2: ( rule__Operation__Group_3_0__0 )*";
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000012000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000007810L});

}