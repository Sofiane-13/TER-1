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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'import'", "'.*'", "'.'", "'Component:'", "':'", "'ProvidedServices:'", "'conf('", "')'", "'RequiredServices:'", "','", "'('", "'bind('", "':='", "';'"
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
    // InternalArchitecture.g:63:1: ruleModel : ( ( rule__Model__FunctionAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:67:2: ( ( ( rule__Model__FunctionAssignment )* ) )
            // InternalArchitecture.g:68:2: ( ( rule__Model__FunctionAssignment )* )
            {
            // InternalArchitecture.g:68:2: ( ( rule__Model__FunctionAssignment )* )
            // InternalArchitecture.g:69:3: ( rule__Model__FunctionAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionAssignment()); 
            }
            // InternalArchitecture.g:70:3: ( rule__Model__FunctionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArchitecture.g:70:4: rule__Model__FunctionAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FunctionAssignment();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFunctionAssignment()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleAbstractModel"
    // InternalArchitecture.g:79:1: entryRuleAbstractModel : ruleAbstractModel EOF ;
    public final void entryRuleAbstractModel() throws RecognitionException {
        try {
            // InternalArchitecture.g:80:1: ( ruleAbstractModel EOF )
            // InternalArchitecture.g:81:1: ruleAbstractModel EOF
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
    // InternalArchitecture.g:88:1: ruleAbstractModel : ( ( rule__AbstractModel__Group__0 ) ) ;
    public final void ruleAbstractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:92:2: ( ( ( rule__AbstractModel__Group__0 ) ) )
            // InternalArchitecture.g:93:2: ( ( rule__AbstractModel__Group__0 ) )
            {
            // InternalArchitecture.g:93:2: ( ( rule__AbstractModel__Group__0 ) )
            // InternalArchitecture.g:94:3: ( rule__AbstractModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getGroup()); 
            }
            // InternalArchitecture.g:95:3: ( rule__AbstractModel__Group__0 )
            // InternalArchitecture.g:95:4: rule__AbstractModel__Group__0
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
    // InternalArchitecture.g:104:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalArchitecture.g:105:1: ( ruleImport EOF )
            // InternalArchitecture.g:106:1: ruleImport EOF
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
    // InternalArchitecture.g:113:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:117:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalArchitecture.g:118:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalArchitecture.g:118:2: ( ( rule__Import__Group__0 ) )
            // InternalArchitecture.g:119:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalArchitecture.g:120:3: ( rule__Import__Group__0 )
            // InternalArchitecture.g:120:4: rule__Import__Group__0
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
    // InternalArchitecture.g:129:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalArchitecture.g:130:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalArchitecture.g:131:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalArchitecture.g:138:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:142:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalArchitecture.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalArchitecture.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalArchitecture.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalArchitecture.g:145:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalArchitecture.g:145:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalArchitecture.g:154:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalArchitecture.g:155:1: ( ruleQualifiedName EOF )
            // InternalArchitecture.g:156:1: ruleQualifiedName EOF
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
    // InternalArchitecture.g:163:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:167:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalArchitecture.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalArchitecture.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalArchitecture.g:169:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalArchitecture.g:170:3: ( rule__QualifiedName__Group__0 )
            // InternalArchitecture.g:170:4: rule__QualifiedName__Group__0
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
    // InternalArchitecture.g:179:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalArchitecture.g:180:1: ( ruleComponent EOF )
            // InternalArchitecture.g:181:1: ruleComponent EOF
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
    // InternalArchitecture.g:188:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:192:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalArchitecture.g:193:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalArchitecture.g:193:2: ( ( rule__Component__Group__0 ) )
            // InternalArchitecture.g:194:3: ( rule__Component__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup()); 
            }
            // InternalArchitecture.g:195:3: ( rule__Component__Group__0 )
            // InternalArchitecture.g:195:4: rule__Component__Group__0
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
    // InternalArchitecture.g:204:1: entryRuleInstanceComp : ruleInstanceComp EOF ;
    public final void entryRuleInstanceComp() throws RecognitionException {
        try {
            // InternalArchitecture.g:205:1: ( ruleInstanceComp EOF )
            // InternalArchitecture.g:206:1: ruleInstanceComp EOF
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
    // InternalArchitecture.g:213:1: ruleInstanceComp : ( ( rule__InstanceComp__NameAssignment ) ) ;
    public final void ruleInstanceComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:217:2: ( ( ( rule__InstanceComp__NameAssignment ) ) )
            // InternalArchitecture.g:218:2: ( ( rule__InstanceComp__NameAssignment ) )
            {
            // InternalArchitecture.g:218:2: ( ( rule__InstanceComp__NameAssignment ) )
            // InternalArchitecture.g:219:3: ( rule__InstanceComp__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getNameAssignment()); 
            }
            // InternalArchitecture.g:220:3: ( rule__InstanceComp__NameAssignment )
            // InternalArchitecture.g:220:4: rule__InstanceComp__NameAssignment
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


    // $ANTLR start "entryRuleBindings"
    // InternalArchitecture.g:254:1: entryRuleBindings : ruleBindings EOF ;
    public final void entryRuleBindings() throws RecognitionException {
        try {
            // InternalArchitecture.g:255:1: ( ruleBindings EOF )
            // InternalArchitecture.g:256:1: ruleBindings EOF
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
    // InternalArchitecture.g:263:1: ruleBindings : ( ( rule__Bindings__Group__0 ) ) ;
    public final void ruleBindings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:267:2: ( ( ( rule__Bindings__Group__0 ) ) )
            // InternalArchitecture.g:268:2: ( ( rule__Bindings__Group__0 ) )
            {
            // InternalArchitecture.g:268:2: ( ( rule__Bindings__Group__0 ) )
            // InternalArchitecture.g:269:3: ( rule__Bindings__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getGroup()); 
            }
            // InternalArchitecture.g:270:3: ( rule__Bindings__Group__0 )
            // InternalArchitecture.g:270:4: rule__Bindings__Group__0
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
    // InternalArchitecture.g:279:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalArchitecture.g:280:1: ( ruleRequiredService EOF )
            // InternalArchitecture.g:281:1: ruleRequiredService EOF
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
    // InternalArchitecture.g:288:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:292:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalArchitecture.g:293:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalArchitecture.g:293:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalArchitecture.g:294:3: ( rule__RequiredService__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            }
            // InternalArchitecture.g:295:3: ( rule__RequiredService__Group__0 )
            // InternalArchitecture.g:295:4: rule__RequiredService__Group__0
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
    // InternalArchitecture.g:304:1: entryRuleServiceName : ruleServiceName EOF ;
    public final void entryRuleServiceName() throws RecognitionException {
        try {
            // InternalArchitecture.g:305:1: ( ruleServiceName EOF )
            // InternalArchitecture.g:306:1: ruleServiceName EOF
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
    // InternalArchitecture.g:313:1: ruleServiceName : ( ( rule__ServiceName__NameAssignment ) ) ;
    public final void ruleServiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:317:2: ( ( ( rule__ServiceName__NameAssignment ) ) )
            // InternalArchitecture.g:318:2: ( ( rule__ServiceName__NameAssignment ) )
            {
            // InternalArchitecture.g:318:2: ( ( rule__ServiceName__NameAssignment ) )
            // InternalArchitecture.g:319:3: ( rule__ServiceName__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getServiceNameAccess().getNameAssignment()); 
            }
            // InternalArchitecture.g:320:3: ( rule__ServiceName__NameAssignment )
            // InternalArchitecture.g:320:4: rule__ServiceName__NameAssignment
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalArchitecture.g:344:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:348:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
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
                    // InternalArchitecture.g:349:2: ( ( 'INT' ) )
                    {
                    // InternalArchitecture.g:349:2: ( ( 'INT' ) )
                    // InternalArchitecture.g:350:3: ( 'INT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalArchitecture.g:351:3: ( 'INT' )
                    // InternalArchitecture.g:351:4: 'INT'
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
                    // InternalArchitecture.g:355:2: ( ( 'STRING' ) )
                    {
                    // InternalArchitecture.g:355:2: ( ( 'STRING' ) )
                    // InternalArchitecture.g:356:3: ( 'STRING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalArchitecture.g:357:3: ( 'STRING' )
                    // InternalArchitecture.g:357:4: 'STRING'
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
                    // InternalArchitecture.g:361:2: ( ( 'Boolean' ) )
                    {
                    // InternalArchitecture.g:361:2: ( ( 'Boolean' ) )
                    // InternalArchitecture.g:362:3: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // InternalArchitecture.g:363:3: ( 'Boolean' )
                    // InternalArchitecture.g:363:4: 'Boolean'
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
                    // InternalArchitecture.g:367:2: ( ( 'Double' ) )
                    {
                    // InternalArchitecture.g:367:2: ( ( 'Double' ) )
                    // InternalArchitecture.g:368:3: ( 'Double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }
                    // InternalArchitecture.g:369:3: ( 'Double' )
                    // InternalArchitecture.g:369:4: 'Double'
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


    // $ANTLR start "rule__AbstractModel__Group__0"
    // InternalArchitecture.g:377:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:381:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalArchitecture.g:382:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalArchitecture.g:389:1: rule__AbstractModel__Group__0__Impl : ( ( ruleImport )? ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:393:1: ( ( ( ruleImport )? ) )
            // InternalArchitecture.g:394:1: ( ( ruleImport )? )
            {
            // InternalArchitecture.g:394:1: ( ( ruleImport )? )
            // InternalArchitecture.g:395:2: ( ruleImport )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 
            }
            // InternalArchitecture.g:396:2: ( ruleImport )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalArchitecture.g:396:3: ruleImport
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
    // InternalArchitecture.g:404:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:408:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalArchitecture.g:409:2: rule__AbstractModel__Group__1__Impl
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
    // InternalArchitecture.g:415:1: rule__AbstractModel__Group__1__Impl : ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:419:1: ( ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) )
            // InternalArchitecture.g:420:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            {
            // InternalArchitecture.g:420:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            // InternalArchitecture.g:421:2: ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* )
            {
            // InternalArchitecture.g:421:2: ( ( rule__AbstractModel__CompAssignment_1 ) )
            // InternalArchitecture.g:422:3: ( rule__AbstractModel__CompAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:423:3: ( rule__AbstractModel__CompAssignment_1 )
            // InternalArchitecture.g:423:4: rule__AbstractModel__CompAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__AbstractModel__CompAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }

            }

            // InternalArchitecture.g:426:2: ( ( rule__AbstractModel__CompAssignment_1 )* )
            // InternalArchitecture.g:427:3: ( rule__AbstractModel__CompAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            }
            // InternalArchitecture.g:428:3: ( rule__AbstractModel__CompAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalArchitecture.g:428:4: rule__AbstractModel__CompAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AbstractModel__CompAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // InternalArchitecture.g:438:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:442:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArchitecture.g:443:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalArchitecture.g:450:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:454:1: ( ( 'import' ) )
            // InternalArchitecture.g:455:1: ( 'import' )
            {
            // InternalArchitecture.g:455:1: ( 'import' )
            // InternalArchitecture.g:456:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:465:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:469:1: ( rule__Import__Group__1__Impl )
            // InternalArchitecture.g:470:2: rule__Import__Group__1__Impl
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
    // InternalArchitecture.g:476:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:480:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalArchitecture.g:481:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalArchitecture.g:481:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalArchitecture.g:482:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalArchitecture.g:483:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalArchitecture.g:483:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalArchitecture.g:492:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:496:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalArchitecture.g:497:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArchitecture.g:504:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:508:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:509:1: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:509:1: ( ruleQualifiedName )
            // InternalArchitecture.g:510:2: ruleQualifiedName
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
    // InternalArchitecture.g:519:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:523:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalArchitecture.g:524:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalArchitecture.g:530:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:534:1: ( ( ( '.*' )? ) )
            // InternalArchitecture.g:535:1: ( ( '.*' )? )
            {
            // InternalArchitecture.g:535:1: ( ( '.*' )? )
            // InternalArchitecture.g:536:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalArchitecture.g:537:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:537:3: '.*'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

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
    // InternalArchitecture.g:546:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:550:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalArchitecture.g:551:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalArchitecture.g:558:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:562:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:563:1: ( RULE_ID )
            {
            // InternalArchitecture.g:563:1: ( RULE_ID )
            // InternalArchitecture.g:564:2: RULE_ID
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
    // InternalArchitecture.g:573:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:577:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalArchitecture.g:578:2: rule__QualifiedName__Group__1__Impl
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
    // InternalArchitecture.g:584:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:588:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalArchitecture.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalArchitecture.g:589:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalArchitecture.g:590:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalArchitecture.g:591:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:591:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalArchitecture.g:600:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:604:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalArchitecture.g:605:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalArchitecture.g:612:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:616:1: ( ( '.' ) )
            // InternalArchitecture.g:617:1: ( '.' )
            {
            // InternalArchitecture.g:617:1: ( '.' )
            // InternalArchitecture.g:618:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:627:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:631:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalArchitecture.g:632:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalArchitecture.g:638:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:642:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:643:1: ( RULE_ID )
            {
            // InternalArchitecture.g:643:1: ( RULE_ID )
            // InternalArchitecture.g:644:2: RULE_ID
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
    // InternalArchitecture.g:654:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:658:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArchitecture.g:659:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalArchitecture.g:666:1: rule__Component__Group__0__Impl : ( ( 'Component:' ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:670:1: ( ( ( 'Component:' ) ) )
            // InternalArchitecture.g:671:1: ( ( 'Component:' ) )
            {
            // InternalArchitecture.g:671:1: ( ( 'Component:' ) )
            // InternalArchitecture.g:672:2: ( 'Component:' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            }
            // InternalArchitecture.g:673:2: ( 'Component:' )
            // InternalArchitecture.g:673:3: 'Component:'
            {
            match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalArchitecture.g:681:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:685:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArchitecture.g:686:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalArchitecture.g:693:1: rule__Component__Group__1__Impl : ( ( rule__Component__InstAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:697:1: ( ( ( rule__Component__InstAssignment_1 ) ) )
            // InternalArchitecture.g:698:1: ( ( rule__Component__InstAssignment_1 ) )
            {
            // InternalArchitecture.g:698:1: ( ( rule__Component__InstAssignment_1 ) )
            // InternalArchitecture.g:699:2: ( rule__Component__InstAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getInstAssignment_1()); 
            }
            // InternalArchitecture.g:700:2: ( rule__Component__InstAssignment_1 )
            // InternalArchitecture.g:700:3: rule__Component__InstAssignment_1
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
    // InternalArchitecture.g:708:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:712:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalArchitecture.g:713:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:720:1: rule__Component__Group__2__Impl : ( ':' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:724:1: ( ( ':' ) )
            // InternalArchitecture.g:725:1: ( ':' )
            {
            // InternalArchitecture.g:725:1: ( ':' )
            // InternalArchitecture.g:726:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getColonKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:735:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:739:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalArchitecture.g:740:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalArchitecture.g:747:1: rule__Component__Group__3__Impl : ( ( rule__Component__NameAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:751:1: ( ( ( rule__Component__NameAssignment_3 ) ) )
            // InternalArchitecture.g:752:1: ( ( rule__Component__NameAssignment_3 ) )
            {
            // InternalArchitecture.g:752:1: ( ( rule__Component__NameAssignment_3 ) )
            // InternalArchitecture.g:753:2: ( rule__Component__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getNameAssignment_3()); 
            }
            // InternalArchitecture.g:754:2: ( rule__Component__NameAssignment_3 )
            // InternalArchitecture.g:754:3: rule__Component__NameAssignment_3
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
    // InternalArchitecture.g:762:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:766:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalArchitecture.g:767:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalArchitecture.g:774:1: rule__Component__Group__4__Impl : ( 'ProvidedServices:' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:778:1: ( ( 'ProvidedServices:' ) )
            // InternalArchitecture.g:779:1: ( 'ProvidedServices:' )
            {
            // InternalArchitecture.g:779:1: ( 'ProvidedServices:' )
            // InternalArchitecture.g:780:2: 'ProvidedServices:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getProvidedServicesKeyword_4()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:789:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:793:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalArchitecture.g:794:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:801:1: rule__Component__Group__5__Impl : ( 'conf(' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:805:1: ( ( 'conf(' ) )
            // InternalArchitecture.g:806:1: ( 'conf(' )
            {
            // InternalArchitecture.g:806:1: ( 'conf(' )
            // InternalArchitecture.g:807:2: 'conf('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getConfKeyword_5()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:816:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:820:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalArchitecture.g:821:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:828:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:832:1: ( ( ( rule__Component__Group_6__0 )* ) )
            // InternalArchitecture.g:833:1: ( ( rule__Component__Group_6__0 )* )
            {
            // InternalArchitecture.g:833:1: ( ( rule__Component__Group_6__0 )* )
            // InternalArchitecture.g:834:2: ( rule__Component__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_6()); 
            }
            // InternalArchitecture.g:835:2: ( rule__Component__Group_6__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==19) ) {
                        switch ( input.LA(3) ) {
                        case 11:
                            {
                            int LA7_3 = input.LA(4);

                            if ( (LA7_3==24) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 12:
                            {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4==24) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA7_5 = input.LA(4);

                            if ( (LA7_5==24) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA7_6 = input.LA(4);

                            if ( (LA7_6==24) ) {
                                alt7=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalArchitecture.g:835:3: rule__Component__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalArchitecture.g:843:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:847:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalArchitecture.g:848:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalArchitecture.g:855:1: rule__Component__Group__7__Impl : ( ( rule__Component__Arg1Assignment_7 ) ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:859:1: ( ( ( rule__Component__Arg1Assignment_7 ) ) )
            // InternalArchitecture.g:860:1: ( ( rule__Component__Arg1Assignment_7 ) )
            {
            // InternalArchitecture.g:860:1: ( ( rule__Component__Arg1Assignment_7 ) )
            // InternalArchitecture.g:861:2: ( rule__Component__Arg1Assignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArg1Assignment_7()); 
            }
            // InternalArchitecture.g:862:2: ( rule__Component__Arg1Assignment_7 )
            // InternalArchitecture.g:862:3: rule__Component__Arg1Assignment_7
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
    // InternalArchitecture.g:870:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:874:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalArchitecture.g:875:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:882:1: rule__Component__Group__8__Impl : ( ')' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:886:1: ( ( ')' ) )
            // InternalArchitecture.g:887:1: ( ')' )
            {
            // InternalArchitecture.g:887:1: ( ')' )
            // InternalArchitecture.g:888:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:897:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:901:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalArchitecture.g:902:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_14);
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
    // InternalArchitecture.g:909:1: rule__Component__Group__9__Impl : ( ( rule__Component__Group_9__0 )* ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:913:1: ( ( ( rule__Component__Group_9__0 )* ) )
            // InternalArchitecture.g:914:1: ( ( rule__Component__Group_9__0 )* )
            {
            // InternalArchitecture.g:914:1: ( ( rule__Component__Group_9__0 )* )
            // InternalArchitecture.g:915:2: ( rule__Component__Group_9__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9()); 
            }
            // InternalArchitecture.g:916:2: ( rule__Component__Group_9__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==25) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalArchitecture.g:916:3: rule__Component__Group_9__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_9__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalArchitecture.g:924:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:928:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalArchitecture.g:929:2: rule__Component__Group__10__Impl rule__Component__Group__11
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
    // InternalArchitecture.g:936:1: rule__Component__Group__10__Impl : ( ( 'RequiredServices:' )? ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:940:1: ( ( ( 'RequiredServices:' )? ) )
            // InternalArchitecture.g:941:1: ( ( 'RequiredServices:' )? )
            {
            // InternalArchitecture.g:941:1: ( ( 'RequiredServices:' )? )
            // InternalArchitecture.g:942:2: ( 'RequiredServices:' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRequiredServicesKeyword_10()); 
            }
            // InternalArchitecture.g:943:2: ( 'RequiredServices:' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArchitecture.g:943:3: 'RequiredServices:'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

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
    // InternalArchitecture.g:951:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:955:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalArchitecture.g:956:2: rule__Component__Group__11__Impl rule__Component__Group__12
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
    // InternalArchitecture.g:963:1: rule__Component__Group__11__Impl : ( ( rule__Component__ReqAssignment_11 )* ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:967:1: ( ( ( rule__Component__ReqAssignment_11 )* ) )
            // InternalArchitecture.g:968:1: ( ( rule__Component__ReqAssignment_11 )* )
            {
            // InternalArchitecture.g:968:1: ( ( rule__Component__ReqAssignment_11 )* )
            // InternalArchitecture.g:969:2: ( rule__Component__ReqAssignment_11 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getReqAssignment_11()); 
            }
            // InternalArchitecture.g:970:2: ( rule__Component__ReqAssignment_11 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:970:3: rule__Component__ReqAssignment_11
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__ReqAssignment_11();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalArchitecture.g:978:1: rule__Component__Group__12 : rule__Component__Group__12__Impl ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:982:1: ( rule__Component__Group__12__Impl )
            // InternalArchitecture.g:983:2: rule__Component__Group__12__Impl
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
    // InternalArchitecture.g:989:1: rule__Component__Group__12__Impl : ( ( rule__Component__BindAssignment_12 )* ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:993:1: ( ( ( rule__Component__BindAssignment_12 )* ) )
            // InternalArchitecture.g:994:1: ( ( rule__Component__BindAssignment_12 )* )
            {
            // InternalArchitecture.g:994:1: ( ( rule__Component__BindAssignment_12 )* )
            // InternalArchitecture.g:995:2: ( rule__Component__BindAssignment_12 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getBindAssignment_12()); 
            }
            // InternalArchitecture.g:996:2: ( rule__Component__BindAssignment_12 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:996:3: rule__Component__BindAssignment_12
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__BindAssignment_12();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalArchitecture.g:1005:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1009:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // InternalArchitecture.g:1010:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalArchitecture.g:1017:1: rule__Component__Group_6__0__Impl : ( ( rule__Component__ArgAssignment_6_0 ) ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1021:1: ( ( ( rule__Component__ArgAssignment_6_0 ) ) )
            // InternalArchitecture.g:1022:1: ( ( rule__Component__ArgAssignment_6_0 ) )
            {
            // InternalArchitecture.g:1022:1: ( ( rule__Component__ArgAssignment_6_0 ) )
            // InternalArchitecture.g:1023:2: ( rule__Component__ArgAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_6_0()); 
            }
            // InternalArchitecture.g:1024:2: ( rule__Component__ArgAssignment_6_0 )
            // InternalArchitecture.g:1024:3: rule__Component__ArgAssignment_6_0
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
    // InternalArchitecture.g:1032:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1036:1: ( rule__Component__Group_6__1__Impl )
            // InternalArchitecture.g:1037:2: rule__Component__Group_6__1__Impl
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
    // InternalArchitecture.g:1043:1: rule__Component__Group_6__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1047:1: ( ( ',' ) )
            // InternalArchitecture.g:1048:1: ( ',' )
            {
            // InternalArchitecture.g:1048:1: ( ',' )
            // InternalArchitecture.g:1049:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_6_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1059:1: rule__Component__Group_9__0 : rule__Component__Group_9__0__Impl rule__Component__Group_9__1 ;
    public final void rule__Component__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1063:1: ( rule__Component__Group_9__0__Impl rule__Component__Group_9__1 )
            // InternalArchitecture.g:1064:2: rule__Component__Group_9__0__Impl rule__Component__Group_9__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalArchitecture.g:1071:1: rule__Component__Group_9__0__Impl : ( ( rule__Component__MethodeAssignment_9_0 ) ) ;
    public final void rule__Component__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1075:1: ( ( ( rule__Component__MethodeAssignment_9_0 ) ) )
            // InternalArchitecture.g:1076:1: ( ( rule__Component__MethodeAssignment_9_0 ) )
            {
            // InternalArchitecture.g:1076:1: ( ( rule__Component__MethodeAssignment_9_0 ) )
            // InternalArchitecture.g:1077:2: ( rule__Component__MethodeAssignment_9_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getMethodeAssignment_9_0()); 
            }
            // InternalArchitecture.g:1078:2: ( rule__Component__MethodeAssignment_9_0 )
            // InternalArchitecture.g:1078:3: rule__Component__MethodeAssignment_9_0
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
    // InternalArchitecture.g:1086:1: rule__Component__Group_9__1 : rule__Component__Group_9__1__Impl rule__Component__Group_9__2 ;
    public final void rule__Component__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1090:1: ( rule__Component__Group_9__1__Impl rule__Component__Group_9__2 )
            // InternalArchitecture.g:1091:2: rule__Component__Group_9__1__Impl rule__Component__Group_9__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalArchitecture.g:1098:1: rule__Component__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1102:1: ( ( '(' ) )
            // InternalArchitecture.g:1103:1: ( '(' )
            {
            // InternalArchitecture.g:1103:1: ( '(' )
            // InternalArchitecture.g:1104:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1113:1: rule__Component__Group_9__2 : rule__Component__Group_9__2__Impl rule__Component__Group_9__3 ;
    public final void rule__Component__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1117:1: ( rule__Component__Group_9__2__Impl rule__Component__Group_9__3 )
            // InternalArchitecture.g:1118:2: rule__Component__Group_9__2__Impl rule__Component__Group_9__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalArchitecture.g:1125:1: rule__Component__Group_9__2__Impl : ( ( rule__Component__Group_9_2__0 )* ) ;
    public final void rule__Component__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1129:1: ( ( ( rule__Component__Group_9_2__0 )* ) )
            // InternalArchitecture.g:1130:1: ( ( rule__Component__Group_9_2__0 )* )
            {
            // InternalArchitecture.g:1130:1: ( ( rule__Component__Group_9_2__0 )* )
            // InternalArchitecture.g:1131:2: ( rule__Component__Group_9_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_2()); 
            }
            // InternalArchitecture.g:1132:2: ( rule__Component__Group_9_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:1132:3: rule__Component__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_9_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalArchitecture.g:1140:1: rule__Component__Group_9__3 : rule__Component__Group_9__3__Impl rule__Component__Group_9__4 ;
    public final void rule__Component__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1144:1: ( rule__Component__Group_9__3__Impl rule__Component__Group_9__4 )
            // InternalArchitecture.g:1145:2: rule__Component__Group_9__3__Impl rule__Component__Group_9__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalArchitecture.g:1152:1: rule__Component__Group_9__3__Impl : ( ')' ) ;
    public final void rule__Component__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1156:1: ( ( ')' ) )
            // InternalArchitecture.g:1157:1: ( ')' )
            {
            // InternalArchitecture.g:1157:1: ( ')' )
            // InternalArchitecture.g:1158:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1167:1: rule__Component__Group_9__4 : rule__Component__Group_9__4__Impl ;
    public final void rule__Component__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1171:1: ( rule__Component__Group_9__4__Impl )
            // InternalArchitecture.g:1172:2: rule__Component__Group_9__4__Impl
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
    // InternalArchitecture.g:1178:1: rule__Component__Group_9__4__Impl : ( ( rule__Component__Group_9_4__0 )? ) ;
    public final void rule__Component__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1182:1: ( ( ( rule__Component__Group_9_4__0 )? ) )
            // InternalArchitecture.g:1183:1: ( ( rule__Component__Group_9_4__0 )? )
            {
            // InternalArchitecture.g:1183:1: ( ( rule__Component__Group_9_4__0 )? )
            // InternalArchitecture.g:1184:2: ( rule__Component__Group_9_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_4()); 
            }
            // InternalArchitecture.g:1185:2: ( rule__Component__Group_9_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArchitecture.g:1185:3: rule__Component__Group_9_4__0
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
    // InternalArchitecture.g:1194:1: rule__Component__Group_9_2__0 : rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1 ;
    public final void rule__Component__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1198:1: ( rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1 )
            // InternalArchitecture.g:1199:2: rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1206:1: rule__Component__Group_9_2__0__Impl : ( ( rule__Component__Group_9_2_0__0 )* ) ;
    public final void rule__Component__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1210:1: ( ( ( rule__Component__Group_9_2_0__0 )* ) )
            // InternalArchitecture.g:1211:1: ( ( rule__Component__Group_9_2_0__0 )* )
            {
            // InternalArchitecture.g:1211:1: ( ( rule__Component__Group_9_2_0__0 )* )
            // InternalArchitecture.g:1212:2: ( rule__Component__Group_9_2_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getGroup_9_2_0()); 
            }
            // InternalArchitecture.g:1213:2: ( rule__Component__Group_9_2_0__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1==19) ) {
                        switch ( input.LA(3) ) {
                        case 11:
                            {
                            int LA14_3 = input.LA(4);

                            if ( (LA14_3==24) ) {
                                alt14=1;
                            }


                            }
                            break;
                        case 12:
                            {
                            int LA14_4 = input.LA(4);

                            if ( (LA14_4==24) ) {
                                alt14=1;
                            }


                            }
                            break;
                        case 13:
                            {
                            int LA14_5 = input.LA(4);

                            if ( (LA14_5==24) ) {
                                alt14=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA14_6 = input.LA(4);

                            if ( (LA14_6==24) ) {
                                alt14=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalArchitecture.g:1213:3: rule__Component__Group_9_2_0__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_9_2_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalArchitecture.g:1221:1: rule__Component__Group_9_2__1 : rule__Component__Group_9_2__1__Impl ;
    public final void rule__Component__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1225:1: ( rule__Component__Group_9_2__1__Impl )
            // InternalArchitecture.g:1226:2: rule__Component__Group_9_2__1__Impl
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
    // InternalArchitecture.g:1232:1: rule__Component__Group_9_2__1__Impl : ( ( rule__Component__ArgAssignment_9_2_1 ) ) ;
    public final void rule__Component__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1236:1: ( ( ( rule__Component__ArgAssignment_9_2_1 ) ) )
            // InternalArchitecture.g:1237:1: ( ( rule__Component__ArgAssignment_9_2_1 ) )
            {
            // InternalArchitecture.g:1237:1: ( ( rule__Component__ArgAssignment_9_2_1 ) )
            // InternalArchitecture.g:1238:2: ( rule__Component__ArgAssignment_9_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_9_2_1()); 
            }
            // InternalArchitecture.g:1239:2: ( rule__Component__ArgAssignment_9_2_1 )
            // InternalArchitecture.g:1239:3: rule__Component__ArgAssignment_9_2_1
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
    // InternalArchitecture.g:1248:1: rule__Component__Group_9_2_0__0 : rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1 ;
    public final void rule__Component__Group_9_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1252:1: ( rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1 )
            // InternalArchitecture.g:1253:2: rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalArchitecture.g:1260:1: rule__Component__Group_9_2_0__0__Impl : ( ( rule__Component__ArgAssignment_9_2_0_0 ) ) ;
    public final void rule__Component__Group_9_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1264:1: ( ( ( rule__Component__ArgAssignment_9_2_0_0 ) ) )
            // InternalArchitecture.g:1265:1: ( ( rule__Component__ArgAssignment_9_2_0_0 ) )
            {
            // InternalArchitecture.g:1265:1: ( ( rule__Component__ArgAssignment_9_2_0_0 ) )
            // InternalArchitecture.g:1266:2: ( rule__Component__ArgAssignment_9_2_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_9_2_0_0()); 
            }
            // InternalArchitecture.g:1267:2: ( rule__Component__ArgAssignment_9_2_0_0 )
            // InternalArchitecture.g:1267:3: rule__Component__ArgAssignment_9_2_0_0
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
    // InternalArchitecture.g:1275:1: rule__Component__Group_9_2_0__1 : rule__Component__Group_9_2_0__1__Impl ;
    public final void rule__Component__Group_9_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1279:1: ( rule__Component__Group_9_2_0__1__Impl )
            // InternalArchitecture.g:1280:2: rule__Component__Group_9_2_0__1__Impl
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
    // InternalArchitecture.g:1286:1: rule__Component__Group_9_2_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_9_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1290:1: ( ( ',' ) )
            // InternalArchitecture.g:1291:1: ( ',' )
            {
            // InternalArchitecture.g:1291:1: ( ',' )
            // InternalArchitecture.g:1292:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1302:1: rule__Component__Group_9_4__0 : rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1 ;
    public final void rule__Component__Group_9_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1306:1: ( rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1 )
            // InternalArchitecture.g:1307:2: rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1314:1: rule__Component__Group_9_4__0__Impl : ( ':' ) ;
    public final void rule__Component__Group_9_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1318:1: ( ( ':' ) )
            // InternalArchitecture.g:1319:1: ( ':' )
            {
            // InternalArchitecture.g:1319:1: ( ':' )
            // InternalArchitecture.g:1320:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getColonKeyword_9_4_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1329:1: rule__Component__Group_9_4__1 : rule__Component__Group_9_4__1__Impl ;
    public final void rule__Component__Group_9_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1333:1: ( rule__Component__Group_9_4__1__Impl )
            // InternalArchitecture.g:1334:2: rule__Component__Group_9_4__1__Impl
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
    // InternalArchitecture.g:1340:1: rule__Component__Group_9_4__1__Impl : ( ( rule__Component__ArgAssignment_9_4_1 ) ) ;
    public final void rule__Component__Group_9_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1344:1: ( ( ( rule__Component__ArgAssignment_9_4_1 ) ) )
            // InternalArchitecture.g:1345:1: ( ( rule__Component__ArgAssignment_9_4_1 ) )
            {
            // InternalArchitecture.g:1345:1: ( ( rule__Component__ArgAssignment_9_4_1 ) )
            // InternalArchitecture.g:1346:2: ( rule__Component__ArgAssignment_9_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComponentAccess().getArgAssignment_9_4_1()); 
            }
            // InternalArchitecture.g:1347:2: ( rule__Component__ArgAssignment_9_4_1 )
            // InternalArchitecture.g:1347:3: rule__Component__ArgAssignment_9_4_1
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
    // InternalArchitecture.g:1356:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1360:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1361:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalArchitecture.g:1368:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1372:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1373:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1373:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1374:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalArchitecture.g:1375:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1375:3: rule__Variable__NameAssignment_0
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
    // InternalArchitecture.g:1383:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1387:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1388:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalArchitecture.g:1395:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1399:1: ( ( ':' ) )
            // InternalArchitecture.g:1400:1: ( ':' )
            {
            // InternalArchitecture.g:1400:1: ( ':' )
            // InternalArchitecture.g:1401:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1410:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1414:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1415:2: rule__Variable__Group__2__Impl
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
    // InternalArchitecture.g:1421:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1425:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1426:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1426:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1427:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalArchitecture.g:1428:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1428:3: rule__Variable__TypeAssignment_2
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
    // InternalArchitecture.g:1437:1: rule__Bindings__Group__0 : rule__Bindings__Group__0__Impl rule__Bindings__Group__1 ;
    public final void rule__Bindings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1441:1: ( rule__Bindings__Group__0__Impl rule__Bindings__Group__1 )
            // InternalArchitecture.g:1442:2: rule__Bindings__Group__0__Impl rule__Bindings__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1449:1: rule__Bindings__Group__0__Impl : ( 'bind(' ) ;
    public final void rule__Bindings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1453:1: ( ( 'bind(' ) )
            // InternalArchitecture.g:1454:1: ( 'bind(' )
            {
            // InternalArchitecture.g:1454:1: ( 'bind(' )
            // InternalArchitecture.g:1455:2: 'bind('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getBindKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1464:1: rule__Bindings__Group__1 : rule__Bindings__Group__1__Impl rule__Bindings__Group__2 ;
    public final void rule__Bindings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1468:1: ( rule__Bindings__Group__1__Impl rule__Bindings__Group__2 )
            // InternalArchitecture.g:1469:2: rule__Bindings__Group__1__Impl rule__Bindings__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalArchitecture.g:1476:1: rule__Bindings__Group__1__Impl : ( ( rule__Bindings__NameComp1Assignment_1 ) ) ;
    public final void rule__Bindings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1480:1: ( ( ( rule__Bindings__NameComp1Assignment_1 ) ) )
            // InternalArchitecture.g:1481:1: ( ( rule__Bindings__NameComp1Assignment_1 ) )
            {
            // InternalArchitecture.g:1481:1: ( ( rule__Bindings__NameComp1Assignment_1 ) )
            // InternalArchitecture.g:1482:2: ( rule__Bindings__NameComp1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1Assignment_1()); 
            }
            // InternalArchitecture.g:1483:2: ( rule__Bindings__NameComp1Assignment_1 )
            // InternalArchitecture.g:1483:3: rule__Bindings__NameComp1Assignment_1
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
    // InternalArchitecture.g:1491:1: rule__Bindings__Group__2 : rule__Bindings__Group__2__Impl rule__Bindings__Group__3 ;
    public final void rule__Bindings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1495:1: ( rule__Bindings__Group__2__Impl rule__Bindings__Group__3 )
            // InternalArchitecture.g:1496:2: rule__Bindings__Group__2__Impl rule__Bindings__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1503:1: rule__Bindings__Group__2__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1507:1: ( ( '.' ) )
            // InternalArchitecture.g:1508:1: ( '.' )
            {
            // InternalArchitecture.g:1508:1: ( '.' )
            // InternalArchitecture.g:1509:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getFullStopKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1518:1: rule__Bindings__Group__3 : rule__Bindings__Group__3__Impl rule__Bindings__Group__4 ;
    public final void rule__Bindings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1522:1: ( rule__Bindings__Group__3__Impl rule__Bindings__Group__4 )
            // InternalArchitecture.g:1523:2: rule__Bindings__Group__3__Impl rule__Bindings__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalArchitecture.g:1530:1: rule__Bindings__Group__3__Impl : ( ( rule__Bindings__NameServ1Assignment_3 ) ) ;
    public final void rule__Bindings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1534:1: ( ( ( rule__Bindings__NameServ1Assignment_3 ) ) )
            // InternalArchitecture.g:1535:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            {
            // InternalArchitecture.g:1535:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            // InternalArchitecture.g:1536:2: ( rule__Bindings__NameServ1Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1Assignment_3()); 
            }
            // InternalArchitecture.g:1537:2: ( rule__Bindings__NameServ1Assignment_3 )
            // InternalArchitecture.g:1537:3: rule__Bindings__NameServ1Assignment_3
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
    // InternalArchitecture.g:1545:1: rule__Bindings__Group__4 : rule__Bindings__Group__4__Impl rule__Bindings__Group__5 ;
    public final void rule__Bindings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1549:1: ( rule__Bindings__Group__4__Impl rule__Bindings__Group__5 )
            // InternalArchitecture.g:1550:2: rule__Bindings__Group__4__Impl rule__Bindings__Group__5
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1557:1: rule__Bindings__Group__4__Impl : ( ',' ) ;
    public final void rule__Bindings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1561:1: ( ( ',' ) )
            // InternalArchitecture.g:1562:1: ( ',' )
            {
            // InternalArchitecture.g:1562:1: ( ',' )
            // InternalArchitecture.g:1563:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getCommaKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1572:1: rule__Bindings__Group__5 : rule__Bindings__Group__5__Impl rule__Bindings__Group__6 ;
    public final void rule__Bindings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1576:1: ( rule__Bindings__Group__5__Impl rule__Bindings__Group__6 )
            // InternalArchitecture.g:1577:2: rule__Bindings__Group__5__Impl rule__Bindings__Group__6
            {
            pushFollow(FOLLOW_7);
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
    // InternalArchitecture.g:1584:1: rule__Bindings__Group__5__Impl : ( ( rule__Bindings__NameComp2Assignment_5 ) ) ;
    public final void rule__Bindings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1588:1: ( ( ( rule__Bindings__NameComp2Assignment_5 ) ) )
            // InternalArchitecture.g:1589:1: ( ( rule__Bindings__NameComp2Assignment_5 ) )
            {
            // InternalArchitecture.g:1589:1: ( ( rule__Bindings__NameComp2Assignment_5 ) )
            // InternalArchitecture.g:1590:2: ( rule__Bindings__NameComp2Assignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp2Assignment_5()); 
            }
            // InternalArchitecture.g:1591:2: ( rule__Bindings__NameComp2Assignment_5 )
            // InternalArchitecture.g:1591:3: rule__Bindings__NameComp2Assignment_5
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
    // InternalArchitecture.g:1599:1: rule__Bindings__Group__6 : rule__Bindings__Group__6__Impl rule__Bindings__Group__7 ;
    public final void rule__Bindings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1603:1: ( rule__Bindings__Group__6__Impl rule__Bindings__Group__7 )
            // InternalArchitecture.g:1604:2: rule__Bindings__Group__6__Impl rule__Bindings__Group__7
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1611:1: rule__Bindings__Group__6__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1615:1: ( ( '.' ) )
            // InternalArchitecture.g:1616:1: ( '.' )
            {
            // InternalArchitecture.g:1616:1: ( '.' )
            // InternalArchitecture.g:1617:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getFullStopKeyword_6()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1626:1: rule__Bindings__Group__7 : rule__Bindings__Group__7__Impl rule__Bindings__Group__8 ;
    public final void rule__Bindings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1630:1: ( rule__Bindings__Group__7__Impl rule__Bindings__Group__8 )
            // InternalArchitecture.g:1631:2: rule__Bindings__Group__7__Impl rule__Bindings__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalArchitecture.g:1638:1: rule__Bindings__Group__7__Impl : ( ( rule__Bindings__NameServ2Assignment_7 ) ) ;
    public final void rule__Bindings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1642:1: ( ( ( rule__Bindings__NameServ2Assignment_7 ) ) )
            // InternalArchitecture.g:1643:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            {
            // InternalArchitecture.g:1643:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            // InternalArchitecture.g:1644:2: ( rule__Bindings__NameServ2Assignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2Assignment_7()); 
            }
            // InternalArchitecture.g:1645:2: ( rule__Bindings__NameServ2Assignment_7 )
            // InternalArchitecture.g:1645:3: rule__Bindings__NameServ2Assignment_7
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
    // InternalArchitecture.g:1653:1: rule__Bindings__Group__8 : rule__Bindings__Group__8__Impl ;
    public final void rule__Bindings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1657:1: ( rule__Bindings__Group__8__Impl )
            // InternalArchitecture.g:1658:2: rule__Bindings__Group__8__Impl
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
    // InternalArchitecture.g:1664:1: rule__Bindings__Group__8__Impl : ( ')' ) ;
    public final void rule__Bindings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1668:1: ( ( ')' ) )
            // InternalArchitecture.g:1669:1: ( ')' )
            {
            // InternalArchitecture.g:1669:1: ( ')' )
            // InternalArchitecture.g:1670:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1680:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1684:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalArchitecture.g:1685:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalArchitecture.g:1692:1: rule__RequiredService__Group__0__Impl : ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1696:1: ( ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) )
            // InternalArchitecture.g:1697:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            {
            // InternalArchitecture.g:1697:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            // InternalArchitecture.g:1698:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameVarMethodeAssignment_0()); 
            }
            // InternalArchitecture.g:1699:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            // InternalArchitecture.g:1699:3: rule__RequiredService__NameVarMethodeAssignment_0
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
    // InternalArchitecture.g:1707:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1711:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalArchitecture.g:1712:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1719:1: rule__RequiredService__Group__1__Impl : ( ':=' ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1723:1: ( ( ':=' ) )
            // InternalArchitecture.g:1724:1: ( ':=' )
            {
            // InternalArchitecture.g:1724:1: ( ':=' )
            // InternalArchitecture.g:1725:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1734:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1738:1: ( rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 )
            // InternalArchitecture.g:1739:2: rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalArchitecture.g:1746:1: rule__RequiredService__Group__2__Impl : ( ( rule__RequiredService__NameCompAssignment_2 ) ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1750:1: ( ( ( rule__RequiredService__NameCompAssignment_2 ) ) )
            // InternalArchitecture.g:1751:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            {
            // InternalArchitecture.g:1751:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            // InternalArchitecture.g:1752:2: ( rule__RequiredService__NameCompAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameCompAssignment_2()); 
            }
            // InternalArchitecture.g:1753:2: ( rule__RequiredService__NameCompAssignment_2 )
            // InternalArchitecture.g:1753:3: rule__RequiredService__NameCompAssignment_2
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
    // InternalArchitecture.g:1761:1: rule__RequiredService__Group__3 : rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 ;
    public final void rule__RequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1765:1: ( rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 )
            // InternalArchitecture.g:1766:2: rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:1773:1: rule__RequiredService__Group__3__Impl : ( '.' ) ;
    public final void rule__RequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1777:1: ( ( '.' ) )
            // InternalArchitecture.g:1778:1: ( '.' )
            {
            // InternalArchitecture.g:1778:1: ( '.' )
            // InternalArchitecture.g:1779:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalArchitecture.g:1788:1: rule__RequiredService__Group__4 : rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 ;
    public final void rule__RequiredService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1792:1: ( rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 )
            // InternalArchitecture.g:1793:2: rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalArchitecture.g:1800:1: rule__RequiredService__Group__4__Impl : ( ( rule__RequiredService__NameServAssignment_4 ) ) ;
    public final void rule__RequiredService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1804:1: ( ( ( rule__RequiredService__NameServAssignment_4 ) ) )
            // InternalArchitecture.g:1805:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            {
            // InternalArchitecture.g:1805:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            // InternalArchitecture.g:1806:2: ( rule__RequiredService__NameServAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameServAssignment_4()); 
            }
            // InternalArchitecture.g:1807:2: ( rule__RequiredService__NameServAssignment_4 )
            // InternalArchitecture.g:1807:3: rule__RequiredService__NameServAssignment_4
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
    // InternalArchitecture.g:1815:1: rule__RequiredService__Group__5 : rule__RequiredService__Group__5__Impl ;
    public final void rule__RequiredService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1819:1: ( rule__RequiredService__Group__5__Impl )
            // InternalArchitecture.g:1820:2: rule__RequiredService__Group__5__Impl
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
    // InternalArchitecture.g:1826:1: rule__RequiredService__Group__5__Impl : ( ';' ) ;
    public final void rule__RequiredService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1830:1: ( ( ';' ) )
            // InternalArchitecture.g:1831:1: ( ';' )
            {
            // InternalArchitecture.g:1831:1: ( ';' )
            // InternalArchitecture.g:1832:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Model__FunctionAssignment"
    // InternalArchitecture.g:1842:1: rule__Model__FunctionAssignment : ( ruleAbstractModel ) ;
    public final void rule__Model__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1846:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:1847:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:1847:2: ( ruleAbstractModel )
            // InternalArchitecture.g:1848:3: ruleAbstractModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionAbstractModelParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAbstractModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFunctionAbstractModelParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FunctionAssignment"


    // $ANTLR start "rule__AbstractModel__CompAssignment_1"
    // InternalArchitecture.g:1857:1: rule__AbstractModel__CompAssignment_1 : ( ruleComponent ) ;
    public final void rule__AbstractModel__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1861:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:1862:2: ( ruleComponent )
            {
            // InternalArchitecture.g:1862:2: ( ruleComponent )
            // InternalArchitecture.g:1863:3: ruleComponent
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
    // InternalArchitecture.g:1872:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1876:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:1877:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:1877:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:1878:3: ruleQualifiedNameWithWildcard
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
    // InternalArchitecture.g:1887:1: rule__Component__InstAssignment_1 : ( ruleInstanceComp ) ;
    public final void rule__Component__InstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1891:1: ( ( ruleInstanceComp ) )
            // InternalArchitecture.g:1892:2: ( ruleInstanceComp )
            {
            // InternalArchitecture.g:1892:2: ( ruleInstanceComp )
            // InternalArchitecture.g:1893:3: ruleInstanceComp
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
    // InternalArchitecture.g:1902:1: rule__Component__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1906:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:1907:2: ( RULE_ID )
            {
            // InternalArchitecture.g:1907:2: ( RULE_ID )
            // InternalArchitecture.g:1908:3: RULE_ID
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
    // InternalArchitecture.g:1917:1: rule__Component__ArgAssignment_6_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1921:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1922:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1922:2: ( ruleVariable )
            // InternalArchitecture.g:1923:3: ruleVariable
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
    // InternalArchitecture.g:1932:1: rule__Component__Arg1Assignment_7 : ( ruleVariable ) ;
    public final void rule__Component__Arg1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1936:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1937:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1937:2: ( ruleVariable )
            // InternalArchitecture.g:1938:3: ruleVariable
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
    // InternalArchitecture.g:1947:1: rule__Component__MethodeAssignment_9_0 : ( ruleServiceName ) ;
    public final void rule__Component__MethodeAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1951:1: ( ( ruleServiceName ) )
            // InternalArchitecture.g:1952:2: ( ruleServiceName )
            {
            // InternalArchitecture.g:1952:2: ( ruleServiceName )
            // InternalArchitecture.g:1953:3: ruleServiceName
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
    // InternalArchitecture.g:1962:1: rule__Component__ArgAssignment_9_2_0_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1966:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1967:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1967:2: ( ruleVariable )
            // InternalArchitecture.g:1968:3: ruleVariable
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
    // InternalArchitecture.g:1977:1: rule__Component__ArgAssignment_9_2_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1981:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1982:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1982:2: ( ruleVariable )
            // InternalArchitecture.g:1983:3: ruleVariable
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
    // InternalArchitecture.g:1992:1: rule__Component__ArgAssignment_9_4_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1996:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1997:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1997:2: ( ruleVariable )
            // InternalArchitecture.g:1998:3: ruleVariable
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
    // InternalArchitecture.g:2007:1: rule__Component__ReqAssignment_11 : ( ruleRequiredService ) ;
    public final void rule__Component__ReqAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2011:1: ( ( ruleRequiredService ) )
            // InternalArchitecture.g:2012:2: ( ruleRequiredService )
            {
            // InternalArchitecture.g:2012:2: ( ruleRequiredService )
            // InternalArchitecture.g:2013:3: ruleRequiredService
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
    // InternalArchitecture.g:2022:1: rule__Component__BindAssignment_12 : ( ruleBindings ) ;
    public final void rule__Component__BindAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2026:1: ( ( ruleBindings ) )
            // InternalArchitecture.g:2027:2: ( ruleBindings )
            {
            // InternalArchitecture.g:2027:2: ( ruleBindings )
            // InternalArchitecture.g:2028:3: ruleBindings
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
    // InternalArchitecture.g:2037:1: rule__InstanceComp__NameAssignment : ( RULE_ID ) ;
    public final void rule__InstanceComp__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2041:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2042:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2042:2: ( RULE_ID )
            // InternalArchitecture.g:2043:3: RULE_ID
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
    // InternalArchitecture.g:2052:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2056:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2057:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2057:2: ( RULE_ID )
            // InternalArchitecture.g:2058:3: RULE_ID
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
    // InternalArchitecture.g:2067:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2071:1: ( ( ruleType ) )
            // InternalArchitecture.g:2072:2: ( ruleType )
            {
            // InternalArchitecture.g:2072:2: ( ruleType )
            // InternalArchitecture.g:2073:3: ruleType
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
    // InternalArchitecture.g:2082:1: rule__Bindings__NameComp1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameComp1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2086:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2087:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2087:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2088:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1InstanceCompCrossReference_1_0()); 
            }
            // InternalArchitecture.g:2089:3: ( RULE_ID )
            // InternalArchitecture.g:2090:4: RULE_ID
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
    // InternalArchitecture.g:2101:1: rule__Bindings__NameServ1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2105:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2106:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2106:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2107:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0()); 
            }
            // InternalArchitecture.g:2108:3: ( RULE_ID )
            // InternalArchitecture.g:2109:4: RULE_ID
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
    // InternalArchitecture.g:2120:1: rule__Bindings__NameComp2Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameComp2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2124:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2125:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2125:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2126:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp2InstanceCompCrossReference_5_0()); 
            }
            // InternalArchitecture.g:2127:3: ( RULE_ID )
            // InternalArchitecture.g:2128:4: RULE_ID
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
    // InternalArchitecture.g:2139:1: rule__Bindings__NameServ2Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ2Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2143:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2144:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2144:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2145:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0()); 
            }
            // InternalArchitecture.g:2146:3: ( RULE_ID )
            // InternalArchitecture.g:2147:4: RULE_ID
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
    // InternalArchitecture.g:2158:1: rule__RequiredService__NameVarMethodeAssignment_0 : ( ruleVariable ) ;
    public final void rule__RequiredService__NameVarMethodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2162:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2163:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2163:2: ( ruleVariable )
            // InternalArchitecture.g:2164:3: ruleVariable
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
    // InternalArchitecture.g:2173:1: rule__RequiredService__NameCompAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2177:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2178:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2178:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2179:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0()); 
            }
            // InternalArchitecture.g:2180:3: ( RULE_ID )
            // InternalArchitecture.g:2181:4: RULE_ID
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
    // InternalArchitecture.g:2192:1: rule__RequiredService__NameServAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameServAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2196:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2197:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2197:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2198:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0()); 
            }
            // InternalArchitecture.g:2199:3: ( RULE_ID )
            // InternalArchitecture.g:2200:4: RULE_ID
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
    // InternalArchitecture.g:2211:1: rule__ServiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ServiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2215:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2216:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2216:2: ( RULE_ID )
            // InternalArchitecture.g:2217:3: RULE_ID
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

    // $ANTLR start synpred6_InternalArchitecture
    public final void synpred6_InternalArchitecture_fragment() throws RecognitionException {   
        // InternalArchitecture.g:428:4: ( rule__AbstractModel__CompAssignment_1 )
        // InternalArchitecture.g:428:4: rule__AbstractModel__CompAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__AbstractModel__CompAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalArchitecture

    // Delegated rules

    public final boolean synpred6_InternalArchitecture() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalArchitecture_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\1\20\uffff";
    static final String dfa_3s = "\1\17\1\uffff\1\4\1\23\1\4\1\24\1\25\1\4\1\23\1\13\4\26\1\4\1\0\1\uffff";
    static final String dfa_4s = "\1\22\1\uffff\1\4\1\23\1\4\1\24\1\25\1\4\1\23\1\16\4\30\1\4\1\0\1\uffff";
    static final String dfa_5s = "\1\uffff\1\2\16\uffff\1\1";
    static final String dfa_6s = "\17\uffff\1\0\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\1\2",
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

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 428:3: ( rule__AbstractModel__CompAssignment_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_15 = input.LA(1);

                         
                        int index4_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred6_InternalArchitecture()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index4_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000048002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004800010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});

}