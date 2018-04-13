package com.aelos.xtext.mappingassistance.ide.contentassist.antlr.internal;

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
import com.aelos.xtext.mappingassistance.services.MappingAssistanceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMappingAssistanceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'import'", "'.*'", "'.'", "'TestDriver'", "'{'", "'}'", "':='", "'observer:'", "'('", "')'", "','", "'mock:'", "'replaceConf:'", "'AddComponent:'", "'providedServices'", "'def'", "':'", "'addBind('"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
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


        public InternalMappingAssistanceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMappingAssistanceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMappingAssistanceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMappingAssistance.g"; }


    	private MappingAssistanceGrammarAccess grammarAccess;

    	public void setGrammarAccess(MappingAssistanceGrammarAccess grammarAccess) {
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
    // InternalMappingAssistance.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:55:1: ( ruleModel EOF )
            // InternalMappingAssistance.g:56:1: ruleModel EOF
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
    // InternalMappingAssistance.g:63:1: ruleModel : ( ( rule__Model__FunctionAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:67:2: ( ( ( rule__Model__FunctionAssignment )* ) )
            // InternalMappingAssistance.g:68:2: ( ( rule__Model__FunctionAssignment )* )
            {
            // InternalMappingAssistance.g:68:2: ( ( rule__Model__FunctionAssignment )* )
            // InternalMappingAssistance.g:69:3: ( rule__Model__FunctionAssignment )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionAssignment()); 
            }
            // InternalMappingAssistance.g:70:3: ( rule__Model__FunctionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMappingAssistance.g:70:4: rule__Model__FunctionAssignment
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
    // InternalMappingAssistance.g:79:1: entryRuleAbstractModel : ruleAbstractModel EOF ;
    public final void entryRuleAbstractModel() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:80:1: ( ruleAbstractModel EOF )
            // InternalMappingAssistance.g:81:1: ruleAbstractModel EOF
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
    // InternalMappingAssistance.g:88:1: ruleAbstractModel : ( ( rule__AbstractModel__Group__0 ) ) ;
    public final void ruleAbstractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:92:2: ( ( ( rule__AbstractModel__Group__0 ) ) )
            // InternalMappingAssistance.g:93:2: ( ( rule__AbstractModel__Group__0 ) )
            {
            // InternalMappingAssistance.g:93:2: ( ( rule__AbstractModel__Group__0 ) )
            // InternalMappingAssistance.g:94:3: ( rule__AbstractModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:95:3: ( rule__AbstractModel__Group__0 )
            // InternalMappingAssistance.g:95:4: rule__AbstractModel__Group__0
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
    // InternalMappingAssistance.g:104:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:105:1: ( ruleImport EOF )
            // InternalMappingAssistance.g:106:1: ruleImport EOF
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
    // InternalMappingAssistance.g:113:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:117:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMappingAssistance.g:118:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMappingAssistance.g:118:2: ( ( rule__Import__Group__0 ) )
            // InternalMappingAssistance.g:119:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:120:3: ( rule__Import__Group__0 )
            // InternalMappingAssistance.g:120:4: rule__Import__Group__0
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
    // InternalMappingAssistance.g:129:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:130:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMappingAssistance.g:131:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalMappingAssistance.g:138:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:142:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMappingAssistance.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMappingAssistance.g:143:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMappingAssistance.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:145:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMappingAssistance.g:145:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalMappingAssistance.g:154:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:155:1: ( ruleQualifiedName EOF )
            // InternalMappingAssistance.g:156:1: ruleQualifiedName EOF
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
    // InternalMappingAssistance.g:163:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:167:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMappingAssistance.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMappingAssistance.g:168:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMappingAssistance.g:169:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:170:3: ( rule__QualifiedName__Group__0 )
            // InternalMappingAssistance.g:170:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleTestDriver"
    // InternalMappingAssistance.g:179:1: entryRuleTestDriver : ruleTestDriver EOF ;
    public final void entryRuleTestDriver() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:180:1: ( ruleTestDriver EOF )
            // InternalMappingAssistance.g:181:1: ruleTestDriver EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTestDriver();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverRule()); 
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
    // $ANTLR end "entryRuleTestDriver"


    // $ANTLR start "ruleTestDriver"
    // InternalMappingAssistance.g:188:1: ruleTestDriver : ( ( rule__TestDriver__Group__0 ) ) ;
    public final void ruleTestDriver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:192:2: ( ( ( rule__TestDriver__Group__0 ) ) )
            // InternalMappingAssistance.g:193:2: ( ( rule__TestDriver__Group__0 ) )
            {
            // InternalMappingAssistance.g:193:2: ( ( rule__TestDriver__Group__0 ) )
            // InternalMappingAssistance.g:194:3: ( rule__TestDriver__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:195:3: ( rule__TestDriver__Group__0 )
            // InternalMappingAssistance.g:195:4: rule__TestDriver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestDriver"


    // $ANTLR start "entryRuleObserver"
    // InternalMappingAssistance.g:204:1: entryRuleObserver : ruleObserver EOF ;
    public final void entryRuleObserver() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:205:1: ( ruleObserver EOF )
            // InternalMappingAssistance.g:206:1: ruleObserver EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleObserver();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverRule()); 
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
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // InternalMappingAssistance.g:213:1: ruleObserver : ( ( rule__Observer__Group__0 ) ) ;
    public final void ruleObserver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:217:2: ( ( ( rule__Observer__Group__0 ) ) )
            // InternalMappingAssistance.g:218:2: ( ( rule__Observer__Group__0 ) )
            {
            // InternalMappingAssistance.g:218:2: ( ( rule__Observer__Group__0 ) )
            // InternalMappingAssistance.g:219:3: ( rule__Observer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:220:3: ( rule__Observer__Group__0 )
            // InternalMappingAssistance.g:220:4: rule__Observer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleMock"
    // InternalMappingAssistance.g:229:1: entryRuleMock : ruleMock EOF ;
    public final void entryRuleMock() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:230:1: ( ruleMock EOF )
            // InternalMappingAssistance.g:231:1: ruleMock EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockRule()); 
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
    // $ANTLR end "entryRuleMock"


    // $ANTLR start "ruleMock"
    // InternalMappingAssistance.g:238:1: ruleMock : ( ( rule__Mock__Group__0 ) ) ;
    public final void ruleMock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:242:2: ( ( ( rule__Mock__Group__0 ) ) )
            // InternalMappingAssistance.g:243:2: ( ( rule__Mock__Group__0 ) )
            {
            // InternalMappingAssistance.g:243:2: ( ( rule__Mock__Group__0 ) )
            // InternalMappingAssistance.g:244:3: ( rule__Mock__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:245:3: ( rule__Mock__Group__0 )
            // InternalMappingAssistance.g:245:4: rule__Mock__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mock__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMock"


    // $ANTLR start "entryRuleConf"
    // InternalMappingAssistance.g:254:1: entryRuleConf : ruleConf EOF ;
    public final void entryRuleConf() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:255:1: ( ruleConf EOF )
            // InternalMappingAssistance.g:256:1: ruleConf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfRule()); 
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
    // $ANTLR end "entryRuleConf"


    // $ANTLR start "ruleConf"
    // InternalMappingAssistance.g:263:1: ruleConf : ( ( rule__Conf__Group__0 ) ) ;
    public final void ruleConf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:267:2: ( ( ( rule__Conf__Group__0 ) ) )
            // InternalMappingAssistance.g:268:2: ( ( rule__Conf__Group__0 ) )
            {
            // InternalMappingAssistance.g:268:2: ( ( rule__Conf__Group__0 ) )
            // InternalMappingAssistance.g:269:3: ( rule__Conf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:270:3: ( rule__Conf__Group__0 )
            // InternalMappingAssistance.g:270:4: rule__Conf__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConf"


    // $ANTLR start "entryRuleComopnent"
    // InternalMappingAssistance.g:279:1: entryRuleComopnent : ruleComopnent EOF ;
    public final void entryRuleComopnent() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:280:1: ( ruleComopnent EOF )
            // InternalMappingAssistance.g:281:1: ruleComopnent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComopnent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentRule()); 
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
    // $ANTLR end "entryRuleComopnent"


    // $ANTLR start "ruleComopnent"
    // InternalMappingAssistance.g:288:1: ruleComopnent : ( ( rule__Comopnent__Group__0 ) ) ;
    public final void ruleComopnent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:292:2: ( ( ( rule__Comopnent__Group__0 ) ) )
            // InternalMappingAssistance.g:293:2: ( ( rule__Comopnent__Group__0 ) )
            {
            // InternalMappingAssistance.g:293:2: ( ( rule__Comopnent__Group__0 ) )
            // InternalMappingAssistance.g:294:3: ( rule__Comopnent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:295:3: ( rule__Comopnent__Group__0 )
            // InternalMappingAssistance.g:295:4: rule__Comopnent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComopnent"


    // $ANTLR start "entryRuleTestOP"
    // InternalMappingAssistance.g:304:1: entryRuleTestOP : ruleTestOP EOF ;
    public final void entryRuleTestOP() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:305:1: ( ruleTestOP EOF )
            // InternalMappingAssistance.g:306:1: ruleTestOP EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTestOP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPRule()); 
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
    // $ANTLR end "entryRuleTestOP"


    // $ANTLR start "ruleTestOP"
    // InternalMappingAssistance.g:313:1: ruleTestOP : ( ( rule__TestOP__Group__0 ) ) ;
    public final void ruleTestOP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:317:2: ( ( ( rule__TestOP__Group__0 ) ) )
            // InternalMappingAssistance.g:318:2: ( ( rule__TestOP__Group__0 ) )
            {
            // InternalMappingAssistance.g:318:2: ( ( rule__TestOP__Group__0 ) )
            // InternalMappingAssistance.g:319:3: ( rule__TestOP__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:320:3: ( rule__TestOP__Group__0 )
            // InternalMappingAssistance.g:320:4: rule__TestOP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestOP"


    // $ANTLR start "entryRuleOperation"
    // InternalMappingAssistance.g:329:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:330:1: ( ruleOperation EOF )
            // InternalMappingAssistance.g:331:1: ruleOperation EOF
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
    // InternalMappingAssistance.g:338:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:342:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalMappingAssistance.g:343:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalMappingAssistance.g:343:2: ( ( rule__Operation__Group__0 ) )
            // InternalMappingAssistance.g:344:3: ( rule__Operation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:345:3: ( rule__Operation__Group__0 )
            // InternalMappingAssistance.g:345:4: rule__Operation__Group__0
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


    // $ANTLR start "entryRuleVariable"
    // InternalMappingAssistance.g:354:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:355:1: ( ruleVariable EOF )
            // InternalMappingAssistance.g:356:1: ruleVariable EOF
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
    // InternalMappingAssistance.g:363:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:367:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMappingAssistance.g:368:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMappingAssistance.g:368:2: ( ( rule__Variable__Group__0 ) )
            // InternalMappingAssistance.g:369:3: ( rule__Variable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:370:3: ( rule__Variable__Group__0 )
            // InternalMappingAssistance.g:370:4: rule__Variable__Group__0
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
    // InternalMappingAssistance.g:379:1: entryRuleBindings : ruleBindings EOF ;
    public final void entryRuleBindings() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:380:1: ( ruleBindings EOF )
            // InternalMappingAssistance.g:381:1: ruleBindings EOF
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
    // InternalMappingAssistance.g:388:1: ruleBindings : ( ( rule__Bindings__Group__0 ) ) ;
    public final void ruleBindings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:392:2: ( ( ( rule__Bindings__Group__0 ) ) )
            // InternalMappingAssistance.g:393:2: ( ( rule__Bindings__Group__0 ) )
            {
            // InternalMappingAssistance.g:393:2: ( ( rule__Bindings__Group__0 ) )
            // InternalMappingAssistance.g:394:3: ( rule__Bindings__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:395:3: ( rule__Bindings__Group__0 )
            // InternalMappingAssistance.g:395:4: rule__Bindings__Group__0
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


    // $ANTLR start "entryRuleInstanceComp"
    // InternalMappingAssistance.g:404:1: entryRuleInstanceComp : ruleInstanceComp EOF ;
    public final void entryRuleInstanceComp() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:405:1: ( ruleInstanceComp EOF )
            // InternalMappingAssistance.g:406:1: ruleInstanceComp EOF
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
    // InternalMappingAssistance.g:413:1: ruleInstanceComp : ( ( rule__InstanceComp__Group__0 ) ) ;
    public final void ruleInstanceComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:417:2: ( ( ( rule__InstanceComp__Group__0 ) ) )
            // InternalMappingAssistance.g:418:2: ( ( rule__InstanceComp__Group__0 ) )
            {
            // InternalMappingAssistance.g:418:2: ( ( rule__InstanceComp__Group__0 ) )
            // InternalMappingAssistance.g:419:3: ( rule__InstanceComp__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:420:3: ( rule__InstanceComp__Group__0 )
            // InternalMappingAssistance.g:420:4: rule__InstanceComp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InstanceComp__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleBoolean"
    // InternalMappingAssistance.g:429:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:430:1: ( ruleBoolean EOF )
            // InternalMappingAssistance.g:431:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalMappingAssistance.g:438:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:442:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalMappingAssistance.g:443:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalMappingAssistance.g:443:2: ( ( rule__Boolean__Alternatives ) )
            // InternalMappingAssistance.g:444:3: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalMappingAssistance.g:445:3: ( rule__Boolean__Alternatives )
            // InternalMappingAssistance.g:445:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleDouble"
    // InternalMappingAssistance.g:454:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:455:1: ( ruleDouble EOF )
            // InternalMappingAssistance.g:456:1: ruleDouble EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleRule()); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalMappingAssistance.g:463:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:467:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalMappingAssistance.g:468:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalMappingAssistance.g:468:2: ( ( rule__Double__Group__0 ) )
            // InternalMappingAssistance.g:469:3: ( rule__Double__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getGroup()); 
            }
            // InternalMappingAssistance.g:470:3: ( rule__Double__Group__0 )
            // InternalMappingAssistance.g:470:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "ruleType"
    // InternalMappingAssistance.g:479:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:483:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMappingAssistance.g:484:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMappingAssistance.g:484:2: ( ( rule__Type__Alternatives ) )
            // InternalMappingAssistance.g:485:3: ( rule__Type__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getAlternatives()); 
            }
            // InternalMappingAssistance.g:486:3: ( rule__Type__Alternatives )
            // InternalMappingAssistance.g:486:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__AbstractModel__Alternatives_2"
    // InternalMappingAssistance.g:494:1: rule__AbstractModel__Alternatives_2 : ( ( ( rule__AbstractModel__ObsAssignment_2_0 ) ) | ( ( rule__AbstractModel__CompAssignment_2_1 ) ) | ( ( rule__AbstractModel__MockAssignment_2_2 ) ) | ( ( rule__AbstractModel__ConfAssignment_2_3 ) ) | ( ( rule__AbstractModel__BindAssignment_2_4 ) ) | ( ( rule__AbstractModel__InstAssignment_2_5 ) ) );
    public final void rule__AbstractModel__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:498:1: ( ( ( rule__AbstractModel__ObsAssignment_2_0 ) ) | ( ( rule__AbstractModel__CompAssignment_2_1 ) ) | ( ( rule__AbstractModel__MockAssignment_2_2 ) ) | ( ( rule__AbstractModel__ConfAssignment_2_3 ) ) | ( ( rule__AbstractModel__BindAssignment_2_4 ) ) | ( ( rule__AbstractModel__InstAssignment_2_5 ) ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 34:
                {
                alt2=5;
                }
                break;
            case 32:
                {
                alt2=6;
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
                    // InternalMappingAssistance.g:499:2: ( ( rule__AbstractModel__ObsAssignment_2_0 ) )
                    {
                    // InternalMappingAssistance.g:499:2: ( ( rule__AbstractModel__ObsAssignment_2_0 ) )
                    // InternalMappingAssistance.g:500:3: ( rule__AbstractModel__ObsAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getObsAssignment_2_0()); 
                    }
                    // InternalMappingAssistance.g:501:3: ( rule__AbstractModel__ObsAssignment_2_0 )
                    // InternalMappingAssistance.g:501:4: rule__AbstractModel__ObsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModel__ObsAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getObsAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:505:2: ( ( rule__AbstractModel__CompAssignment_2_1 ) )
                    {
                    // InternalMappingAssistance.g:505:2: ( ( rule__AbstractModel__CompAssignment_2_1 ) )
                    // InternalMappingAssistance.g:506:3: ( rule__AbstractModel__CompAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getCompAssignment_2_1()); 
                    }
                    // InternalMappingAssistance.g:507:3: ( rule__AbstractModel__CompAssignment_2_1 )
                    // InternalMappingAssistance.g:507:4: rule__AbstractModel__CompAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModel__CompAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getCompAssignment_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:511:2: ( ( rule__AbstractModel__MockAssignment_2_2 ) )
                    {
                    // InternalMappingAssistance.g:511:2: ( ( rule__AbstractModel__MockAssignment_2_2 ) )
                    // InternalMappingAssistance.g:512:3: ( rule__AbstractModel__MockAssignment_2_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getMockAssignment_2_2()); 
                    }
                    // InternalMappingAssistance.g:513:3: ( rule__AbstractModel__MockAssignment_2_2 )
                    // InternalMappingAssistance.g:513:4: rule__AbstractModel__MockAssignment_2_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModel__MockAssignment_2_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getMockAssignment_2_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:517:2: ( ( rule__AbstractModel__ConfAssignment_2_3 ) )
                    {
                    // InternalMappingAssistance.g:517:2: ( ( rule__AbstractModel__ConfAssignment_2_3 ) )
                    // InternalMappingAssistance.g:518:3: ( rule__AbstractModel__ConfAssignment_2_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getConfAssignment_2_3()); 
                    }
                    // InternalMappingAssistance.g:519:3: ( rule__AbstractModel__ConfAssignment_2_3 )
                    // InternalMappingAssistance.g:519:4: rule__AbstractModel__ConfAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModel__ConfAssignment_2_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getConfAssignment_2_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMappingAssistance.g:523:2: ( ( rule__AbstractModel__BindAssignment_2_4 ) )
                    {
                    // InternalMappingAssistance.g:523:2: ( ( rule__AbstractModel__BindAssignment_2_4 ) )
                    // InternalMappingAssistance.g:524:3: ( rule__AbstractModel__BindAssignment_2_4 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getBindAssignment_2_4()); 
                    }
                    // InternalMappingAssistance.g:525:3: ( rule__AbstractModel__BindAssignment_2_4 )
                    // InternalMappingAssistance.g:525:4: rule__AbstractModel__BindAssignment_2_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModel__BindAssignment_2_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getBindAssignment_2_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMappingAssistance.g:529:2: ( ( rule__AbstractModel__InstAssignment_2_5 ) )
                    {
                    // InternalMappingAssistance.g:529:2: ( ( rule__AbstractModel__InstAssignment_2_5 ) )
                    // InternalMappingAssistance.g:530:3: ( rule__AbstractModel__InstAssignment_2_5 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAbstractModelAccess().getInstAssignment_2_5()); 
                    }
                    // InternalMappingAssistance.g:531:3: ( rule__AbstractModel__InstAssignment_2_5 )
                    // InternalMappingAssistance.g:531:4: rule__AbstractModel__InstAssignment_2_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractModel__InstAssignment_2_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAbstractModelAccess().getInstAssignment_2_5()); 
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
    // $ANTLR end "rule__AbstractModel__Alternatives_2"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalMappingAssistance.g:539:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:543:1: ( ( 'true' ) | ( 'false' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
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
                    // InternalMappingAssistance.g:544:2: ( 'true' )
                    {
                    // InternalMappingAssistance.g:544:2: ( 'true' )
                    // InternalMappingAssistance.g:545:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:550:2: ( 'false' )
                    {
                    // InternalMappingAssistance.g:550:2: ( 'false' )
                    // InternalMappingAssistance.g:551:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
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
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMappingAssistance.g:560:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:564:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMappingAssistance.g:565:2: ( ( 'INT' ) )
                    {
                    // InternalMappingAssistance.g:565:2: ( ( 'INT' ) )
                    // InternalMappingAssistance.g:566:3: ( 'INT' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }
                    // InternalMappingAssistance.g:567:3: ( 'INT' )
                    // InternalMappingAssistance.g:567:4: 'INT'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:571:2: ( ( 'STRING' ) )
                    {
                    // InternalMappingAssistance.g:571:2: ( ( 'STRING' ) )
                    // InternalMappingAssistance.g:572:3: ( 'STRING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }
                    // InternalMappingAssistance.g:573:3: ( 'STRING' )
                    // InternalMappingAssistance.g:573:4: 'STRING'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:577:2: ( ( 'Boolean' ) )
                    {
                    // InternalMappingAssistance.g:577:2: ( ( 'Boolean' ) )
                    // InternalMappingAssistance.g:578:3: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }
                    // InternalMappingAssistance.g:579:3: ( 'Boolean' )
                    // InternalMappingAssistance.g:579:4: 'Boolean'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:583:2: ( ( 'Double' ) )
                    {
                    // InternalMappingAssistance.g:583:2: ( ( 'Double' ) )
                    // InternalMappingAssistance.g:584:3: ( 'Double' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    }
                    // InternalMappingAssistance.g:585:3: ( 'Double' )
                    // InternalMappingAssistance.g:585:4: 'Double'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

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
    // InternalMappingAssistance.g:593:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:597:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalMappingAssistance.g:598:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
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
    // InternalMappingAssistance.g:605:1: rule__AbstractModel__Group__0__Impl : ( ( ( rule__AbstractModel__ImAssignment_0 ) ) ( ( rule__AbstractModel__ImAssignment_0 )* ) ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:609:1: ( ( ( ( rule__AbstractModel__ImAssignment_0 ) ) ( ( rule__AbstractModel__ImAssignment_0 )* ) ) )
            // InternalMappingAssistance.g:610:1: ( ( ( rule__AbstractModel__ImAssignment_0 ) ) ( ( rule__AbstractModel__ImAssignment_0 )* ) )
            {
            // InternalMappingAssistance.g:610:1: ( ( ( rule__AbstractModel__ImAssignment_0 ) ) ( ( rule__AbstractModel__ImAssignment_0 )* ) )
            // InternalMappingAssistance.g:611:2: ( ( rule__AbstractModel__ImAssignment_0 ) ) ( ( rule__AbstractModel__ImAssignment_0 )* )
            {
            // InternalMappingAssistance.g:611:2: ( ( rule__AbstractModel__ImAssignment_0 ) )
            // InternalMappingAssistance.g:612:3: ( rule__AbstractModel__ImAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImAssignment_0()); 
            }
            // InternalMappingAssistance.g:613:3: ( rule__AbstractModel__ImAssignment_0 )
            // InternalMappingAssistance.g:613:4: rule__AbstractModel__ImAssignment_0
            {
            pushFollow(FOLLOW_5);
            rule__AbstractModel__ImAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getImAssignment_0()); 
            }

            }

            // InternalMappingAssistance.g:616:2: ( ( rule__AbstractModel__ImAssignment_0 )* )
            // InternalMappingAssistance.g:617:3: ( rule__AbstractModel__ImAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImAssignment_0()); 
            }
            // InternalMappingAssistance.g:618:3: ( rule__AbstractModel__ImAssignment_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMappingAssistance.g:618:4: rule__AbstractModel__ImAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AbstractModel__ImAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getImAssignment_0()); 
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
    // $ANTLR end "rule__AbstractModel__Group__0__Impl"


    // $ANTLR start "rule__AbstractModel__Group__1"
    // InternalMappingAssistance.g:627:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl rule__AbstractModel__Group__2 ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:631:1: ( rule__AbstractModel__Group__1__Impl rule__AbstractModel__Group__2 )
            // InternalMappingAssistance.g:632:2: rule__AbstractModel__Group__1__Impl rule__AbstractModel__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AbstractModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMappingAssistance.g:639:1: rule__AbstractModel__Group__1__Impl : ( ( rule__AbstractModel__TestDrAssignment_1 ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:643:1: ( ( ( rule__AbstractModel__TestDrAssignment_1 ) ) )
            // InternalMappingAssistance.g:644:1: ( ( rule__AbstractModel__TestDrAssignment_1 ) )
            {
            // InternalMappingAssistance.g:644:1: ( ( rule__AbstractModel__TestDrAssignment_1 ) )
            // InternalMappingAssistance.g:645:2: ( rule__AbstractModel__TestDrAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getTestDrAssignment_1()); 
            }
            // InternalMappingAssistance.g:646:2: ( rule__AbstractModel__TestDrAssignment_1 )
            // InternalMappingAssistance.g:646:3: rule__AbstractModel__TestDrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__TestDrAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getTestDrAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__AbstractModel__Group__2"
    // InternalMappingAssistance.g:654:1: rule__AbstractModel__Group__2 : rule__AbstractModel__Group__2__Impl ;
    public final void rule__AbstractModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:658:1: ( rule__AbstractModel__Group__2__Impl )
            // InternalMappingAssistance.g:659:2: rule__AbstractModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__2"


    // $ANTLR start "rule__AbstractModel__Group__2__Impl"
    // InternalMappingAssistance.g:665:1: rule__AbstractModel__Group__2__Impl : ( ( rule__AbstractModel__Alternatives_2 )* ) ;
    public final void rule__AbstractModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:669:1: ( ( ( rule__AbstractModel__Alternatives_2 )* ) )
            // InternalMappingAssistance.g:670:1: ( ( rule__AbstractModel__Alternatives_2 )* )
            {
            // InternalMappingAssistance.g:670:1: ( ( rule__AbstractModel__Alternatives_2 )* )
            // InternalMappingAssistance.g:671:2: ( rule__AbstractModel__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getAlternatives_2()); 
            }
            // InternalMappingAssistance.g:672:2: ( rule__AbstractModel__Alternatives_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||(LA6_0>=28 && LA6_0<=30)||LA6_0==32||LA6_0==34) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMappingAssistance.g:672:3: rule__AbstractModel__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AbstractModel__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMappingAssistance.g:681:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:685:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMappingAssistance.g:686:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:693:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:697:1: ( ( 'import' ) )
            // InternalMappingAssistance.g:698:1: ( 'import' )
            {
            // InternalMappingAssistance.g:698:1: ( 'import' )
            // InternalMappingAssistance.g:699:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:708:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:712:1: ( rule__Import__Group__1__Impl )
            // InternalMappingAssistance.g:713:2: rule__Import__Group__1__Impl
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
    // InternalMappingAssistance.g:719:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:723:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMappingAssistance.g:724:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMappingAssistance.g:724:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMappingAssistance.g:725:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalMappingAssistance.g:726:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMappingAssistance.g:726:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMappingAssistance.g:735:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:739:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMappingAssistance.g:740:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalMappingAssistance.g:747:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:751:1: ( ( ruleQualifiedName ) )
            // InternalMappingAssistance.g:752:1: ( ruleQualifiedName )
            {
            // InternalMappingAssistance.g:752:1: ( ruleQualifiedName )
            // InternalMappingAssistance.g:753:2: ruleQualifiedName
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
    // InternalMappingAssistance.g:762:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:766:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMappingAssistance.g:767:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalMappingAssistance.g:773:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:777:1: ( ( ( '.*' )? ) )
            // InternalMappingAssistance.g:778:1: ( ( '.*' )? )
            {
            // InternalMappingAssistance.g:778:1: ( ( '.*' )? )
            // InternalMappingAssistance.g:779:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalMappingAssistance.g:780:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMappingAssistance.g:780:3: '.*'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalMappingAssistance.g:789:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:793:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMappingAssistance.g:794:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalMappingAssistance.g:801:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:805:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:806:1: ( RULE_ID )
            {
            // InternalMappingAssistance.g:806:1: ( RULE_ID )
            // InternalMappingAssistance.g:807:2: RULE_ID
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
    // InternalMappingAssistance.g:816:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:820:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMappingAssistance.g:821:2: rule__QualifiedName__Group__1__Impl
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
    // InternalMappingAssistance.g:827:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:831:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMappingAssistance.g:832:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMappingAssistance.g:832:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMappingAssistance.g:833:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMappingAssistance.g:834:2: ( rule__QualifiedName__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMappingAssistance.g:834:3: rule__QualifiedName__Group_1__0
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
    // InternalMappingAssistance.g:843:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:847:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMappingAssistance.g:848:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:855:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:859:1: ( ( '.' ) )
            // InternalMappingAssistance.g:860:1: ( '.' )
            {
            // InternalMappingAssistance.g:860:1: ( '.' )
            // InternalMappingAssistance.g:861:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:870:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:874:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMappingAssistance.g:875:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalMappingAssistance.g:881:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:885:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:886:1: ( RULE_ID )
            {
            // InternalMappingAssistance.g:886:1: ( RULE_ID )
            // InternalMappingAssistance.g:887:2: RULE_ID
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


    // $ANTLR start "rule__TestDriver__Group__0"
    // InternalMappingAssistance.g:897:1: rule__TestDriver__Group__0 : rule__TestDriver__Group__0__Impl rule__TestDriver__Group__1 ;
    public final void rule__TestDriver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:901:1: ( rule__TestDriver__Group__0__Impl rule__TestDriver__Group__1 )
            // InternalMappingAssistance.g:902:2: rule__TestDriver__Group__0__Impl rule__TestDriver__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TestDriver__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__0"


    // $ANTLR start "rule__TestDriver__Group__0__Impl"
    // InternalMappingAssistance.g:909:1: rule__TestDriver__Group__0__Impl : ( () ) ;
    public final void rule__TestDriver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:913:1: ( ( () ) )
            // InternalMappingAssistance.g:914:1: ( () )
            {
            // InternalMappingAssistance.g:914:1: ( () )
            // InternalMappingAssistance.g:915:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getTestDriverAction_0()); 
            }
            // InternalMappingAssistance.g:916:2: ()
            // InternalMappingAssistance.g:916:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getTestDriverAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__0__Impl"


    // $ANTLR start "rule__TestDriver__Group__1"
    // InternalMappingAssistance.g:924:1: rule__TestDriver__Group__1 : rule__TestDriver__Group__1__Impl rule__TestDriver__Group__2 ;
    public final void rule__TestDriver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:928:1: ( rule__TestDriver__Group__1__Impl rule__TestDriver__Group__2 )
            // InternalMappingAssistance.g:929:2: rule__TestDriver__Group__1__Impl rule__TestDriver__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__TestDriver__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__1"


    // $ANTLR start "rule__TestDriver__Group__1__Impl"
    // InternalMappingAssistance.g:936:1: rule__TestDriver__Group__1__Impl : ( 'TestDriver' ) ;
    public final void rule__TestDriver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:940:1: ( ( 'TestDriver' ) )
            // InternalMappingAssistance.g:941:1: ( 'TestDriver' )
            {
            // InternalMappingAssistance.g:941:1: ( 'TestDriver' )
            // InternalMappingAssistance.g:942:2: 'TestDriver'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getTestDriverKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getTestDriverKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__1__Impl"


    // $ANTLR start "rule__TestDriver__Group__2"
    // InternalMappingAssistance.g:951:1: rule__TestDriver__Group__2 : rule__TestDriver__Group__2__Impl rule__TestDriver__Group__3 ;
    public final void rule__TestDriver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:955:1: ( rule__TestDriver__Group__2__Impl rule__TestDriver__Group__3 )
            // InternalMappingAssistance.g:956:2: rule__TestDriver__Group__2__Impl rule__TestDriver__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TestDriver__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__2"


    // $ANTLR start "rule__TestDriver__Group__2__Impl"
    // InternalMappingAssistance.g:963:1: rule__TestDriver__Group__2__Impl : ( '{' ) ;
    public final void rule__TestDriver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:967:1: ( ( '{' ) )
            // InternalMappingAssistance.g:968:1: ( '{' )
            {
            // InternalMappingAssistance.g:968:1: ( '{' )
            // InternalMappingAssistance.g:969:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__2__Impl"


    // $ANTLR start "rule__TestDriver__Group__3"
    // InternalMappingAssistance.g:978:1: rule__TestDriver__Group__3 : rule__TestDriver__Group__3__Impl rule__TestDriver__Group__4 ;
    public final void rule__TestDriver__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:982:1: ( rule__TestDriver__Group__3__Impl rule__TestDriver__Group__4 )
            // InternalMappingAssistance.g:983:2: rule__TestDriver__Group__3__Impl rule__TestDriver__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__TestDriver__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__3"


    // $ANTLR start "rule__TestDriver__Group__3__Impl"
    // InternalMappingAssistance.g:990:1: rule__TestDriver__Group__3__Impl : ( ( rule__TestDriver__Group_3__0 )* ) ;
    public final void rule__TestDriver__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:994:1: ( ( ( rule__TestDriver__Group_3__0 )* ) )
            // InternalMappingAssistance.g:995:1: ( ( rule__TestDriver__Group_3__0 )* )
            {
            // InternalMappingAssistance.g:995:1: ( ( rule__TestDriver__Group_3__0 )* )
            // InternalMappingAssistance.g:996:2: ( rule__TestDriver__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getGroup_3()); 
            }
            // InternalMappingAssistance.g:997:2: ( rule__TestDriver__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMappingAssistance.g:997:3: rule__TestDriver__Group_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TestDriver__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__3__Impl"


    // $ANTLR start "rule__TestDriver__Group__4"
    // InternalMappingAssistance.g:1005:1: rule__TestDriver__Group__4 : rule__TestDriver__Group__4__Impl ;
    public final void rule__TestDriver__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1009:1: ( rule__TestDriver__Group__4__Impl )
            // InternalMappingAssistance.g:1010:2: rule__TestDriver__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__4"


    // $ANTLR start "rule__TestDriver__Group__4__Impl"
    // InternalMappingAssistance.g:1016:1: rule__TestDriver__Group__4__Impl : ( '}' ) ;
    public final void rule__TestDriver__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1020:1: ( ( '}' ) )
            // InternalMappingAssistance.g:1021:1: ( '}' )
            {
            // InternalMappingAssistance.g:1021:1: ( '}' )
            // InternalMappingAssistance.g:1022:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group__4__Impl"


    // $ANTLR start "rule__TestDriver__Group_3__0"
    // InternalMappingAssistance.g:1032:1: rule__TestDriver__Group_3__0 : rule__TestDriver__Group_3__0__Impl rule__TestDriver__Group_3__1 ;
    public final void rule__TestDriver__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1036:1: ( rule__TestDriver__Group_3__0__Impl rule__TestDriver__Group_3__1 )
            // InternalMappingAssistance.g:1037:2: rule__TestDriver__Group_3__0__Impl rule__TestDriver__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__TestDriver__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group_3__0"


    // $ANTLR start "rule__TestDriver__Group_3__0__Impl"
    // InternalMappingAssistance.g:1044:1: rule__TestDriver__Group_3__0__Impl : ( ( rule__TestDriver__OutVarAssignment_3_0 ) ) ;
    public final void rule__TestDriver__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1048:1: ( ( ( rule__TestDriver__OutVarAssignment_3_0 ) ) )
            // InternalMappingAssistance.g:1049:1: ( ( rule__TestDriver__OutVarAssignment_3_0 ) )
            {
            // InternalMappingAssistance.g:1049:1: ( ( rule__TestDriver__OutVarAssignment_3_0 ) )
            // InternalMappingAssistance.g:1050:2: ( rule__TestDriver__OutVarAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getOutVarAssignment_3_0()); 
            }
            // InternalMappingAssistance.g:1051:2: ( rule__TestDriver__OutVarAssignment_3_0 )
            // InternalMappingAssistance.g:1051:3: rule__TestDriver__OutVarAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__TestDriver__OutVarAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getOutVarAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group_3__0__Impl"


    // $ANTLR start "rule__TestDriver__Group_3__1"
    // InternalMappingAssistance.g:1059:1: rule__TestDriver__Group_3__1 : rule__TestDriver__Group_3__1__Impl rule__TestDriver__Group_3__2 ;
    public final void rule__TestDriver__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1063:1: ( rule__TestDriver__Group_3__1__Impl rule__TestDriver__Group_3__2 )
            // InternalMappingAssistance.g:1064:2: rule__TestDriver__Group_3__1__Impl rule__TestDriver__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__TestDriver__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group_3__1"


    // $ANTLR start "rule__TestDriver__Group_3__1__Impl"
    // InternalMappingAssistance.g:1071:1: rule__TestDriver__Group_3__1__Impl : ( ':=' ) ;
    public final void rule__TestDriver__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1075:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:1076:1: ( ':=' )
            {
            // InternalMappingAssistance.g:1076:1: ( ':=' )
            // InternalMappingAssistance.g:1077:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getColonEqualsSignKeyword_3_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getColonEqualsSignKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group_3__1__Impl"


    // $ANTLR start "rule__TestDriver__Group_3__2"
    // InternalMappingAssistance.g:1086:1: rule__TestDriver__Group_3__2 : rule__TestDriver__Group_3__2__Impl ;
    public final void rule__TestDriver__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1090:1: ( rule__TestDriver__Group_3__2__Impl )
            // InternalMappingAssistance.g:1091:2: rule__TestDriver__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestDriver__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group_3__2"


    // $ANTLR start "rule__TestDriver__Group_3__2__Impl"
    // InternalMappingAssistance.g:1097:1: rule__TestDriver__Group_3__2__Impl : ( ( rule__TestDriver__TestOpAssignment_3_2 ) ) ;
    public final void rule__TestDriver__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1101:1: ( ( ( rule__TestDriver__TestOpAssignment_3_2 ) ) )
            // InternalMappingAssistance.g:1102:1: ( ( rule__TestDriver__TestOpAssignment_3_2 ) )
            {
            // InternalMappingAssistance.g:1102:1: ( ( rule__TestDriver__TestOpAssignment_3_2 ) )
            // InternalMappingAssistance.g:1103:2: ( rule__TestDriver__TestOpAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getTestOpAssignment_3_2()); 
            }
            // InternalMappingAssistance.g:1104:2: ( rule__TestDriver__TestOpAssignment_3_2 )
            // InternalMappingAssistance.g:1104:3: rule__TestDriver__TestOpAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__TestDriver__TestOpAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getTestOpAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__Group_3__2__Impl"


    // $ANTLR start "rule__Observer__Group__0"
    // InternalMappingAssistance.g:1113:1: rule__Observer__Group__0 : rule__Observer__Group__0__Impl rule__Observer__Group__1 ;
    public final void rule__Observer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1117:1: ( rule__Observer__Group__0__Impl rule__Observer__Group__1 )
            // InternalMappingAssistance.g:1118:2: rule__Observer__Group__0__Impl rule__Observer__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Observer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__0"


    // $ANTLR start "rule__Observer__Group__0__Impl"
    // InternalMappingAssistance.g:1125:1: rule__Observer__Group__0__Impl : ( 'observer:' ) ;
    public final void rule__Observer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1129:1: ( ( 'observer:' ) )
            // InternalMappingAssistance.g:1130:1: ( 'observer:' )
            {
            // InternalMappingAssistance.g:1130:1: ( 'observer:' )
            // InternalMappingAssistance.g:1131:2: 'observer:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getObserverKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getObserverKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__0__Impl"


    // $ANTLR start "rule__Observer__Group__1"
    // InternalMappingAssistance.g:1140:1: rule__Observer__Group__1 : rule__Observer__Group__1__Impl rule__Observer__Group__2 ;
    public final void rule__Observer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1144:1: ( rule__Observer__Group__1__Impl rule__Observer__Group__2 )
            // InternalMappingAssistance.g:1145:2: rule__Observer__Group__1__Impl rule__Observer__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Observer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__1"


    // $ANTLR start "rule__Observer__Group__1__Impl"
    // InternalMappingAssistance.g:1152:1: rule__Observer__Group__1__Impl : ( ( rule__Observer__Service1Assignment_1 ) ) ;
    public final void rule__Observer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1156:1: ( ( ( rule__Observer__Service1Assignment_1 ) ) )
            // InternalMappingAssistance.g:1157:1: ( ( rule__Observer__Service1Assignment_1 ) )
            {
            // InternalMappingAssistance.g:1157:1: ( ( rule__Observer__Service1Assignment_1 ) )
            // InternalMappingAssistance.g:1158:2: ( rule__Observer__Service1Assignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getService1Assignment_1()); 
            }
            // InternalMappingAssistance.g:1159:2: ( rule__Observer__Service1Assignment_1 )
            // InternalMappingAssistance.g:1159:3: rule__Observer__Service1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Service1Assignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getService1Assignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__1__Impl"


    // $ANTLR start "rule__Observer__Group__2"
    // InternalMappingAssistance.g:1167:1: rule__Observer__Group__2 : rule__Observer__Group__2__Impl rule__Observer__Group__3 ;
    public final void rule__Observer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1171:1: ( rule__Observer__Group__2__Impl rule__Observer__Group__3 )
            // InternalMappingAssistance.g:1172:2: rule__Observer__Group__2__Impl rule__Observer__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Observer__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__2"


    // $ANTLR start "rule__Observer__Group__2__Impl"
    // InternalMappingAssistance.g:1179:1: rule__Observer__Group__2__Impl : ( '.' ) ;
    public final void rule__Observer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1183:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1184:1: ( '.' )
            {
            // InternalMappingAssistance.g:1184:1: ( '.' )
            // InternalMappingAssistance.g:1185:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getFullStopKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__2__Impl"


    // $ANTLR start "rule__Observer__Group__3"
    // InternalMappingAssistance.g:1194:1: rule__Observer__Group__3 : rule__Observer__Group__3__Impl rule__Observer__Group__4 ;
    public final void rule__Observer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1198:1: ( rule__Observer__Group__3__Impl rule__Observer__Group__4 )
            // InternalMappingAssistance.g:1199:2: rule__Observer__Group__3__Impl rule__Observer__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Observer__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__3"


    // $ANTLR start "rule__Observer__Group__3__Impl"
    // InternalMappingAssistance.g:1206:1: rule__Observer__Group__3__Impl : ( ( rule__Observer__Member1Assignment_3 ) ) ;
    public final void rule__Observer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1210:1: ( ( ( rule__Observer__Member1Assignment_3 ) ) )
            // InternalMappingAssistance.g:1211:1: ( ( rule__Observer__Member1Assignment_3 ) )
            {
            // InternalMappingAssistance.g:1211:1: ( ( rule__Observer__Member1Assignment_3 ) )
            // InternalMappingAssistance.g:1212:2: ( rule__Observer__Member1Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getMember1Assignment_3()); 
            }
            // InternalMappingAssistance.g:1213:2: ( rule__Observer__Member1Assignment_3 )
            // InternalMappingAssistance.g:1213:3: rule__Observer__Member1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Member1Assignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getMember1Assignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__3__Impl"


    // $ANTLR start "rule__Observer__Group__4"
    // InternalMappingAssistance.g:1221:1: rule__Observer__Group__4 : rule__Observer__Group__4__Impl rule__Observer__Group__5 ;
    public final void rule__Observer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1225:1: ( rule__Observer__Group__4__Impl rule__Observer__Group__5 )
            // InternalMappingAssistance.g:1226:2: rule__Observer__Group__4__Impl rule__Observer__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Observer__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__4"


    // $ANTLR start "rule__Observer__Group__4__Impl"
    // InternalMappingAssistance.g:1233:1: rule__Observer__Group__4__Impl : ( '(' ) ;
    public final void rule__Observer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1237:1: ( ( '(' ) )
            // InternalMappingAssistance.g:1238:1: ( '(' )
            {
            // InternalMappingAssistance.g:1238:1: ( '(' )
            // InternalMappingAssistance.g:1239:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getLeftParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__4__Impl"


    // $ANTLR start "rule__Observer__Group__5"
    // InternalMappingAssistance.g:1248:1: rule__Observer__Group__5 : rule__Observer__Group__5__Impl rule__Observer__Group__6 ;
    public final void rule__Observer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1252:1: ( rule__Observer__Group__5__Impl rule__Observer__Group__6 )
            // InternalMappingAssistance.g:1253:2: rule__Observer__Group__5__Impl rule__Observer__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Observer__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__5"


    // $ANTLR start "rule__Observer__Group__5__Impl"
    // InternalMappingAssistance.g:1260:1: rule__Observer__Group__5__Impl : ( ( rule__Observer__Group_5__0 )* ) ;
    public final void rule__Observer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1264:1: ( ( ( rule__Observer__Group_5__0 )* ) )
            // InternalMappingAssistance.g:1265:1: ( ( rule__Observer__Group_5__0 )* )
            {
            // InternalMappingAssistance.g:1265:1: ( ( rule__Observer__Group_5__0 )* )
            // InternalMappingAssistance.g:1266:2: ( rule__Observer__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getGroup_5()); 
            }
            // InternalMappingAssistance.g:1267:2: ( rule__Observer__Group_5__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMappingAssistance.g:1267:3: rule__Observer__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Observer__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__5__Impl"


    // $ANTLR start "rule__Observer__Group__6"
    // InternalMappingAssistance.g:1275:1: rule__Observer__Group__6 : rule__Observer__Group__6__Impl rule__Observer__Group__7 ;
    public final void rule__Observer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1279:1: ( rule__Observer__Group__6__Impl rule__Observer__Group__7 )
            // InternalMappingAssistance.g:1280:2: rule__Observer__Group__6__Impl rule__Observer__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Observer__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__6"


    // $ANTLR start "rule__Observer__Group__6__Impl"
    // InternalMappingAssistance.g:1287:1: rule__Observer__Group__6__Impl : ( ')' ) ;
    public final void rule__Observer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1291:1: ( ( ')' ) )
            // InternalMappingAssistance.g:1292:1: ( ')' )
            {
            // InternalMappingAssistance.g:1292:1: ( ')' )
            // InternalMappingAssistance.g:1293:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__6__Impl"


    // $ANTLR start "rule__Observer__Group__7"
    // InternalMappingAssistance.g:1302:1: rule__Observer__Group__7 : rule__Observer__Group__7__Impl rule__Observer__Group__8 ;
    public final void rule__Observer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1306:1: ( rule__Observer__Group__7__Impl rule__Observer__Group__8 )
            // InternalMappingAssistance.g:1307:2: rule__Observer__Group__7__Impl rule__Observer__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Observer__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__7"


    // $ANTLR start "rule__Observer__Group__7__Impl"
    // InternalMappingAssistance.g:1314:1: rule__Observer__Group__7__Impl : ( '(' ) ;
    public final void rule__Observer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1318:1: ( ( '(' ) )
            // InternalMappingAssistance.g:1319:1: ( '(' )
            {
            // InternalMappingAssistance.g:1319:1: ( '(' )
            // InternalMappingAssistance.g:1320:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getLeftParenthesisKeyword_7()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getLeftParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__7__Impl"


    // $ANTLR start "rule__Observer__Group__8"
    // InternalMappingAssistance.g:1329:1: rule__Observer__Group__8 : rule__Observer__Group__8__Impl rule__Observer__Group__9 ;
    public final void rule__Observer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1333:1: ( rule__Observer__Group__8__Impl rule__Observer__Group__9 )
            // InternalMappingAssistance.g:1334:2: rule__Observer__Group__8__Impl rule__Observer__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Observer__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__8"


    // $ANTLR start "rule__Observer__Group__8__Impl"
    // InternalMappingAssistance.g:1341:1: rule__Observer__Group__8__Impl : ( ( rule__Observer__Service2Assignment_8 ) ) ;
    public final void rule__Observer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1345:1: ( ( ( rule__Observer__Service2Assignment_8 ) ) )
            // InternalMappingAssistance.g:1346:1: ( ( rule__Observer__Service2Assignment_8 ) )
            {
            // InternalMappingAssistance.g:1346:1: ( ( rule__Observer__Service2Assignment_8 ) )
            // InternalMappingAssistance.g:1347:2: ( rule__Observer__Service2Assignment_8 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getService2Assignment_8()); 
            }
            // InternalMappingAssistance.g:1348:2: ( rule__Observer__Service2Assignment_8 )
            // InternalMappingAssistance.g:1348:3: rule__Observer__Service2Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Service2Assignment_8();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getService2Assignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__8__Impl"


    // $ANTLR start "rule__Observer__Group__9"
    // InternalMappingAssistance.g:1356:1: rule__Observer__Group__9 : rule__Observer__Group__9__Impl rule__Observer__Group__10 ;
    public final void rule__Observer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1360:1: ( rule__Observer__Group__9__Impl rule__Observer__Group__10 )
            // InternalMappingAssistance.g:1361:2: rule__Observer__Group__9__Impl rule__Observer__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__Observer__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__9"


    // $ANTLR start "rule__Observer__Group__9__Impl"
    // InternalMappingAssistance.g:1368:1: rule__Observer__Group__9__Impl : ( '.' ) ;
    public final void rule__Observer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1372:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1373:1: ( '.' )
            {
            // InternalMappingAssistance.g:1373:1: ( '.' )
            // InternalMappingAssistance.g:1374:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getFullStopKeyword_9()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getFullStopKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__9__Impl"


    // $ANTLR start "rule__Observer__Group__10"
    // InternalMappingAssistance.g:1383:1: rule__Observer__Group__10 : rule__Observer__Group__10__Impl rule__Observer__Group__11 ;
    public final void rule__Observer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1387:1: ( rule__Observer__Group__10__Impl rule__Observer__Group__11 )
            // InternalMappingAssistance.g:1388:2: rule__Observer__Group__10__Impl rule__Observer__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Observer__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__10"


    // $ANTLR start "rule__Observer__Group__10__Impl"
    // InternalMappingAssistance.g:1395:1: rule__Observer__Group__10__Impl : ( ( rule__Observer__Member2Assignment_10 ) ) ;
    public final void rule__Observer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1399:1: ( ( ( rule__Observer__Member2Assignment_10 ) ) )
            // InternalMappingAssistance.g:1400:1: ( ( rule__Observer__Member2Assignment_10 ) )
            {
            // InternalMappingAssistance.g:1400:1: ( ( rule__Observer__Member2Assignment_10 ) )
            // InternalMappingAssistance.g:1401:2: ( rule__Observer__Member2Assignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getMember2Assignment_10()); 
            }
            // InternalMappingAssistance.g:1402:2: ( rule__Observer__Member2Assignment_10 )
            // InternalMappingAssistance.g:1402:3: rule__Observer__Member2Assignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Member2Assignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getMember2Assignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__10__Impl"


    // $ANTLR start "rule__Observer__Group__11"
    // InternalMappingAssistance.g:1410:1: rule__Observer__Group__11 : rule__Observer__Group__11__Impl ;
    public final void rule__Observer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1414:1: ( rule__Observer__Group__11__Impl )
            // InternalMappingAssistance.g:1415:2: rule__Observer__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__11"


    // $ANTLR start "rule__Observer__Group__11__Impl"
    // InternalMappingAssistance.g:1421:1: rule__Observer__Group__11__Impl : ( ')' ) ;
    public final void rule__Observer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1425:1: ( ( ')' ) )
            // InternalMappingAssistance.g:1426:1: ( ')' )
            {
            // InternalMappingAssistance.g:1426:1: ( ')' )
            // InternalMappingAssistance.g:1427:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getRightParenthesisKeyword_11()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getRightParenthesisKeyword_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__11__Impl"


    // $ANTLR start "rule__Observer__Group_5__0"
    // InternalMappingAssistance.g:1437:1: rule__Observer__Group_5__0 : rule__Observer__Group_5__0__Impl rule__Observer__Group_5__1 ;
    public final void rule__Observer__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1441:1: ( rule__Observer__Group_5__0__Impl rule__Observer__Group_5__1 )
            // InternalMappingAssistance.g:1442:2: rule__Observer__Group_5__0__Impl rule__Observer__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Observer__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5__0"


    // $ANTLR start "rule__Observer__Group_5__0__Impl"
    // InternalMappingAssistance.g:1449:1: rule__Observer__Group_5__0__Impl : ( ( rule__Observer__Group_5_0__0 )* ) ;
    public final void rule__Observer__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1453:1: ( ( ( rule__Observer__Group_5_0__0 )* ) )
            // InternalMappingAssistance.g:1454:1: ( ( rule__Observer__Group_5_0__0 )* )
            {
            // InternalMappingAssistance.g:1454:1: ( ( rule__Observer__Group_5_0__0 )* )
            // InternalMappingAssistance.g:1455:2: ( rule__Observer__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getGroup_5_0()); 
            }
            // InternalMappingAssistance.g:1456:2: ( rule__Observer__Group_5_0__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==23) ) {
                        int LA11_2 = input.LA(3);

                        if ( (LA11_2==RULE_ID) ) {
                            int LA11_3 = input.LA(4);

                            if ( (LA11_3==27) ) {
                                alt11=1;
                            }


                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalMappingAssistance.g:1456:3: rule__Observer__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Observer__Group_5_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getGroup_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5__0__Impl"


    // $ANTLR start "rule__Observer__Group_5__1"
    // InternalMappingAssistance.g:1464:1: rule__Observer__Group_5__1 : rule__Observer__Group_5__1__Impl ;
    public final void rule__Observer__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1468:1: ( rule__Observer__Group_5__1__Impl )
            // InternalMappingAssistance.g:1469:2: rule__Observer__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5__1"


    // $ANTLR start "rule__Observer__Group_5__1__Impl"
    // InternalMappingAssistance.g:1475:1: rule__Observer__Group_5__1__Impl : ( ( rule__Observer__Group_5_1__0 ) ) ;
    public final void rule__Observer__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1479:1: ( ( ( rule__Observer__Group_5_1__0 ) ) )
            // InternalMappingAssistance.g:1480:1: ( ( rule__Observer__Group_5_1__0 ) )
            {
            // InternalMappingAssistance.g:1480:1: ( ( rule__Observer__Group_5_1__0 ) )
            // InternalMappingAssistance.g:1481:2: ( rule__Observer__Group_5_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getGroup_5_1()); 
            }
            // InternalMappingAssistance.g:1482:2: ( rule__Observer__Group_5_1__0 )
            // InternalMappingAssistance.g:1482:3: rule__Observer__Group_5_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getGroup_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5__1__Impl"


    // $ANTLR start "rule__Observer__Group_5_0__0"
    // InternalMappingAssistance.g:1491:1: rule__Observer__Group_5_0__0 : rule__Observer__Group_5_0__0__Impl rule__Observer__Group_5_0__1 ;
    public final void rule__Observer__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1495:1: ( rule__Observer__Group_5_0__0__Impl rule__Observer__Group_5_0__1 )
            // InternalMappingAssistance.g:1496:2: rule__Observer__Group_5_0__0__Impl rule__Observer__Group_5_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Observer__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__0"


    // $ANTLR start "rule__Observer__Group_5_0__0__Impl"
    // InternalMappingAssistance.g:1503:1: rule__Observer__Group_5_0__0__Impl : ( ( rule__Observer__InstVarAssignment_5_0_0 ) ) ;
    public final void rule__Observer__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1507:1: ( ( ( rule__Observer__InstVarAssignment_5_0_0 ) ) )
            // InternalMappingAssistance.g:1508:1: ( ( rule__Observer__InstVarAssignment_5_0_0 ) )
            {
            // InternalMappingAssistance.g:1508:1: ( ( rule__Observer__InstVarAssignment_5_0_0 ) )
            // InternalMappingAssistance.g:1509:2: ( rule__Observer__InstVarAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getInstVarAssignment_5_0_0()); 
            }
            // InternalMappingAssistance.g:1510:2: ( rule__Observer__InstVarAssignment_5_0_0 )
            // InternalMappingAssistance.g:1510:3: rule__Observer__InstVarAssignment_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Observer__InstVarAssignment_5_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getInstVarAssignment_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__0__Impl"


    // $ANTLR start "rule__Observer__Group_5_0__1"
    // InternalMappingAssistance.g:1518:1: rule__Observer__Group_5_0__1 : rule__Observer__Group_5_0__1__Impl rule__Observer__Group_5_0__2 ;
    public final void rule__Observer__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1522:1: ( rule__Observer__Group_5_0__1__Impl rule__Observer__Group_5_0__2 )
            // InternalMappingAssistance.g:1523:2: rule__Observer__Group_5_0__1__Impl rule__Observer__Group_5_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Observer__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__1"


    // $ANTLR start "rule__Observer__Group_5_0__1__Impl"
    // InternalMappingAssistance.g:1530:1: rule__Observer__Group_5_0__1__Impl : ( ':=' ) ;
    public final void rule__Observer__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1534:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:1535:1: ( ':=' )
            {
            // InternalMappingAssistance.g:1535:1: ( ':=' )
            // InternalMappingAssistance.g:1536:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getColonEqualsSignKeyword_5_0_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getColonEqualsSignKeyword_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__1__Impl"


    // $ANTLR start "rule__Observer__Group_5_0__2"
    // InternalMappingAssistance.g:1545:1: rule__Observer__Group_5_0__2 : rule__Observer__Group_5_0__2__Impl rule__Observer__Group_5_0__3 ;
    public final void rule__Observer__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1549:1: ( rule__Observer__Group_5_0__2__Impl rule__Observer__Group_5_0__3 )
            // InternalMappingAssistance.g:1550:2: rule__Observer__Group_5_0__2__Impl rule__Observer__Group_5_0__3
            {
            pushFollow(FOLLOW_19);
            rule__Observer__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__2"


    // $ANTLR start "rule__Observer__Group_5_0__2__Impl"
    // InternalMappingAssistance.g:1557:1: rule__Observer__Group_5_0__2__Impl : ( ( rule__Observer__VarOpAssignment_5_0_2 ) ) ;
    public final void rule__Observer__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1561:1: ( ( ( rule__Observer__VarOpAssignment_5_0_2 ) ) )
            // InternalMappingAssistance.g:1562:1: ( ( rule__Observer__VarOpAssignment_5_0_2 ) )
            {
            // InternalMappingAssistance.g:1562:1: ( ( rule__Observer__VarOpAssignment_5_0_2 ) )
            // InternalMappingAssistance.g:1563:2: ( rule__Observer__VarOpAssignment_5_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getVarOpAssignment_5_0_2()); 
            }
            // InternalMappingAssistance.g:1564:2: ( rule__Observer__VarOpAssignment_5_0_2 )
            // InternalMappingAssistance.g:1564:3: rule__Observer__VarOpAssignment_5_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Observer__VarOpAssignment_5_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getVarOpAssignment_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__2__Impl"


    // $ANTLR start "rule__Observer__Group_5_0__3"
    // InternalMappingAssistance.g:1572:1: rule__Observer__Group_5_0__3 : rule__Observer__Group_5_0__3__Impl ;
    public final void rule__Observer__Group_5_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1576:1: ( rule__Observer__Group_5_0__3__Impl )
            // InternalMappingAssistance.g:1577:2: rule__Observer__Group_5_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__3"


    // $ANTLR start "rule__Observer__Group_5_0__3__Impl"
    // InternalMappingAssistance.g:1583:1: rule__Observer__Group_5_0__3__Impl : ( ',' ) ;
    public final void rule__Observer__Group_5_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1587:1: ( ( ',' ) )
            // InternalMappingAssistance.g:1588:1: ( ',' )
            {
            // InternalMappingAssistance.g:1588:1: ( ',' )
            // InternalMappingAssistance.g:1589:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getCommaKeyword_5_0_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getCommaKeyword_5_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_0__3__Impl"


    // $ANTLR start "rule__Observer__Group_5_1__0"
    // InternalMappingAssistance.g:1599:1: rule__Observer__Group_5_1__0 : rule__Observer__Group_5_1__0__Impl rule__Observer__Group_5_1__1 ;
    public final void rule__Observer__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1603:1: ( rule__Observer__Group_5_1__0__Impl rule__Observer__Group_5_1__1 )
            // InternalMappingAssistance.g:1604:2: rule__Observer__Group_5_1__0__Impl rule__Observer__Group_5_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Observer__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_1__0"


    // $ANTLR start "rule__Observer__Group_5_1__0__Impl"
    // InternalMappingAssistance.g:1611:1: rule__Observer__Group_5_1__0__Impl : ( ( rule__Observer__InstVarAssignment_5_1_0 ) ) ;
    public final void rule__Observer__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1615:1: ( ( ( rule__Observer__InstVarAssignment_5_1_0 ) ) )
            // InternalMappingAssistance.g:1616:1: ( ( rule__Observer__InstVarAssignment_5_1_0 ) )
            {
            // InternalMappingAssistance.g:1616:1: ( ( rule__Observer__InstVarAssignment_5_1_0 ) )
            // InternalMappingAssistance.g:1617:2: ( rule__Observer__InstVarAssignment_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getInstVarAssignment_5_1_0()); 
            }
            // InternalMappingAssistance.g:1618:2: ( rule__Observer__InstVarAssignment_5_1_0 )
            // InternalMappingAssistance.g:1618:3: rule__Observer__InstVarAssignment_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Observer__InstVarAssignment_5_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getInstVarAssignment_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_1__0__Impl"


    // $ANTLR start "rule__Observer__Group_5_1__1"
    // InternalMappingAssistance.g:1626:1: rule__Observer__Group_5_1__1 : rule__Observer__Group_5_1__1__Impl rule__Observer__Group_5_1__2 ;
    public final void rule__Observer__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1630:1: ( rule__Observer__Group_5_1__1__Impl rule__Observer__Group_5_1__2 )
            // InternalMappingAssistance.g:1631:2: rule__Observer__Group_5_1__1__Impl rule__Observer__Group_5_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Observer__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_1__1"


    // $ANTLR start "rule__Observer__Group_5_1__1__Impl"
    // InternalMappingAssistance.g:1638:1: rule__Observer__Group_5_1__1__Impl : ( ':=' ) ;
    public final void rule__Observer__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1642:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:1643:1: ( ':=' )
            {
            // InternalMappingAssistance.g:1643:1: ( ':=' )
            // InternalMappingAssistance.g:1644:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getColonEqualsSignKeyword_5_1_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getColonEqualsSignKeyword_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_1__1__Impl"


    // $ANTLR start "rule__Observer__Group_5_1__2"
    // InternalMappingAssistance.g:1653:1: rule__Observer__Group_5_1__2 : rule__Observer__Group_5_1__2__Impl ;
    public final void rule__Observer__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1657:1: ( rule__Observer__Group_5_1__2__Impl )
            // InternalMappingAssistance.g:1658:2: rule__Observer__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_1__2"


    // $ANTLR start "rule__Observer__Group_5_1__2__Impl"
    // InternalMappingAssistance.g:1664:1: rule__Observer__Group_5_1__2__Impl : ( ( rule__Observer__VarOpAssignment_5_1_2 ) ) ;
    public final void rule__Observer__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1668:1: ( ( ( rule__Observer__VarOpAssignment_5_1_2 ) ) )
            // InternalMappingAssistance.g:1669:1: ( ( rule__Observer__VarOpAssignment_5_1_2 ) )
            {
            // InternalMappingAssistance.g:1669:1: ( ( rule__Observer__VarOpAssignment_5_1_2 ) )
            // InternalMappingAssistance.g:1670:2: ( rule__Observer__VarOpAssignment_5_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getVarOpAssignment_5_1_2()); 
            }
            // InternalMappingAssistance.g:1671:2: ( rule__Observer__VarOpAssignment_5_1_2 )
            // InternalMappingAssistance.g:1671:3: rule__Observer__VarOpAssignment_5_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Observer__VarOpAssignment_5_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getVarOpAssignment_5_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_5_1__2__Impl"


    // $ANTLR start "rule__Mock__Group__0"
    // InternalMappingAssistance.g:1680:1: rule__Mock__Group__0 : rule__Mock__Group__0__Impl rule__Mock__Group__1 ;
    public final void rule__Mock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1684:1: ( rule__Mock__Group__0__Impl rule__Mock__Group__1 )
            // InternalMappingAssistance.g:1685:2: rule__Mock__Group__0__Impl rule__Mock__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Mock__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mock__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__0"


    // $ANTLR start "rule__Mock__Group__0__Impl"
    // InternalMappingAssistance.g:1692:1: rule__Mock__Group__0__Impl : ( 'mock:' ) ;
    public final void rule__Mock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1696:1: ( ( 'mock:' ) )
            // InternalMappingAssistance.g:1697:1: ( 'mock:' )
            {
            // InternalMappingAssistance.g:1697:1: ( 'mock:' )
            // InternalMappingAssistance.g:1698:2: 'mock:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getMockKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getMockKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__0__Impl"


    // $ANTLR start "rule__Mock__Group__1"
    // InternalMappingAssistance.g:1707:1: rule__Mock__Group__1 : rule__Mock__Group__1__Impl rule__Mock__Group__2 ;
    public final void rule__Mock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1711:1: ( rule__Mock__Group__1__Impl rule__Mock__Group__2 )
            // InternalMappingAssistance.g:1712:2: rule__Mock__Group__1__Impl rule__Mock__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Mock__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mock__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__1"


    // $ANTLR start "rule__Mock__Group__1__Impl"
    // InternalMappingAssistance.g:1719:1: rule__Mock__Group__1__Impl : ( ( rule__Mock__ServiceAssignment_1 ) ) ;
    public final void rule__Mock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1723:1: ( ( ( rule__Mock__ServiceAssignment_1 ) ) )
            // InternalMappingAssistance.g:1724:1: ( ( rule__Mock__ServiceAssignment_1 ) )
            {
            // InternalMappingAssistance.g:1724:1: ( ( rule__Mock__ServiceAssignment_1 ) )
            // InternalMappingAssistance.g:1725:2: ( rule__Mock__ServiceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getServiceAssignment_1()); 
            }
            // InternalMappingAssistance.g:1726:2: ( rule__Mock__ServiceAssignment_1 )
            // InternalMappingAssistance.g:1726:3: rule__Mock__ServiceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mock__ServiceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getServiceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__1__Impl"


    // $ANTLR start "rule__Mock__Group__2"
    // InternalMappingAssistance.g:1734:1: rule__Mock__Group__2 : rule__Mock__Group__2__Impl rule__Mock__Group__3 ;
    public final void rule__Mock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1738:1: ( rule__Mock__Group__2__Impl rule__Mock__Group__3 )
            // InternalMappingAssistance.g:1739:2: rule__Mock__Group__2__Impl rule__Mock__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Mock__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mock__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__2"


    // $ANTLR start "rule__Mock__Group__2__Impl"
    // InternalMappingAssistance.g:1746:1: rule__Mock__Group__2__Impl : ( '.' ) ;
    public final void rule__Mock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1750:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1751:1: ( '.' )
            {
            // InternalMappingAssistance.g:1751:1: ( '.' )
            // InternalMappingAssistance.g:1752:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getFullStopKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__2__Impl"


    // $ANTLR start "rule__Mock__Group__3"
    // InternalMappingAssistance.g:1761:1: rule__Mock__Group__3 : rule__Mock__Group__3__Impl rule__Mock__Group__4 ;
    public final void rule__Mock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1765:1: ( rule__Mock__Group__3__Impl rule__Mock__Group__4 )
            // InternalMappingAssistance.g:1766:2: rule__Mock__Group__3__Impl rule__Mock__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Mock__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mock__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__3"


    // $ANTLR start "rule__Mock__Group__3__Impl"
    // InternalMappingAssistance.g:1773:1: rule__Mock__Group__3__Impl : ( ( rule__Mock__MemberAssignment_3 ) ) ;
    public final void rule__Mock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1777:1: ( ( ( rule__Mock__MemberAssignment_3 ) ) )
            // InternalMappingAssistance.g:1778:1: ( ( rule__Mock__MemberAssignment_3 ) )
            {
            // InternalMappingAssistance.g:1778:1: ( ( rule__Mock__MemberAssignment_3 ) )
            // InternalMappingAssistance.g:1779:2: ( rule__Mock__MemberAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getMemberAssignment_3()); 
            }
            // InternalMappingAssistance.g:1780:2: ( rule__Mock__MemberAssignment_3 )
            // InternalMappingAssistance.g:1780:3: rule__Mock__MemberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mock__MemberAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getMemberAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__3__Impl"


    // $ANTLR start "rule__Mock__Group__4"
    // InternalMappingAssistance.g:1788:1: rule__Mock__Group__4 : rule__Mock__Group__4__Impl rule__Mock__Group__5 ;
    public final void rule__Mock__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1792:1: ( rule__Mock__Group__4__Impl rule__Mock__Group__5 )
            // InternalMappingAssistance.g:1793:2: rule__Mock__Group__4__Impl rule__Mock__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Mock__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Mock__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__4"


    // $ANTLR start "rule__Mock__Group__4__Impl"
    // InternalMappingAssistance.g:1800:1: rule__Mock__Group__4__Impl : ( ':=' ) ;
    public final void rule__Mock__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1804:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:1805:1: ( ':=' )
            {
            // InternalMappingAssistance.g:1805:1: ( ':=' )
            // InternalMappingAssistance.g:1806:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getColonEqualsSignKeyword_4()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getColonEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__4__Impl"


    // $ANTLR start "rule__Mock__Group__5"
    // InternalMappingAssistance.g:1815:1: rule__Mock__Group__5 : rule__Mock__Group__5__Impl ;
    public final void rule__Mock__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1819:1: ( rule__Mock__Group__5__Impl )
            // InternalMappingAssistance.g:1820:2: rule__Mock__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mock__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__5"


    // $ANTLR start "rule__Mock__Group__5__Impl"
    // InternalMappingAssistance.g:1826:1: rule__Mock__Group__5__Impl : ( ( rule__Mock__IntentionVarAssignment_5 ) ) ;
    public final void rule__Mock__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1830:1: ( ( ( rule__Mock__IntentionVarAssignment_5 ) ) )
            // InternalMappingAssistance.g:1831:1: ( ( rule__Mock__IntentionVarAssignment_5 ) )
            {
            // InternalMappingAssistance.g:1831:1: ( ( rule__Mock__IntentionVarAssignment_5 ) )
            // InternalMappingAssistance.g:1832:2: ( rule__Mock__IntentionVarAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getIntentionVarAssignment_5()); 
            }
            // InternalMappingAssistance.g:1833:2: ( rule__Mock__IntentionVarAssignment_5 )
            // InternalMappingAssistance.g:1833:3: rule__Mock__IntentionVarAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mock__IntentionVarAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getIntentionVarAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__Group__5__Impl"


    // $ANTLR start "rule__Conf__Group__0"
    // InternalMappingAssistance.g:1842:1: rule__Conf__Group__0 : rule__Conf__Group__0__Impl rule__Conf__Group__1 ;
    public final void rule__Conf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1846:1: ( rule__Conf__Group__0__Impl rule__Conf__Group__1 )
            // InternalMappingAssistance.g:1847:2: rule__Conf__Group__0__Impl rule__Conf__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Conf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__0"


    // $ANTLR start "rule__Conf__Group__0__Impl"
    // InternalMappingAssistance.g:1854:1: rule__Conf__Group__0__Impl : ( 'replaceConf:' ) ;
    public final void rule__Conf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1858:1: ( ( 'replaceConf:' ) )
            // InternalMappingAssistance.g:1859:1: ( 'replaceConf:' )
            {
            // InternalMappingAssistance.g:1859:1: ( 'replaceConf:' )
            // InternalMappingAssistance.g:1860:2: 'replaceConf:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getReplaceConfKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getReplaceConfKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__0__Impl"


    // $ANTLR start "rule__Conf__Group__1"
    // InternalMappingAssistance.g:1869:1: rule__Conf__Group__1 : rule__Conf__Group__1__Impl rule__Conf__Group__2 ;
    public final void rule__Conf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1873:1: ( rule__Conf__Group__1__Impl rule__Conf__Group__2 )
            // InternalMappingAssistance.g:1874:2: rule__Conf__Group__1__Impl rule__Conf__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Conf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__1"


    // $ANTLR start "rule__Conf__Group__1__Impl"
    // InternalMappingAssistance.g:1881:1: rule__Conf__Group__1__Impl : ( ( rule__Conf__ServiceAssignment_1 ) ) ;
    public final void rule__Conf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1885:1: ( ( ( rule__Conf__ServiceAssignment_1 ) ) )
            // InternalMappingAssistance.g:1886:1: ( ( rule__Conf__ServiceAssignment_1 ) )
            {
            // InternalMappingAssistance.g:1886:1: ( ( rule__Conf__ServiceAssignment_1 ) )
            // InternalMappingAssistance.g:1887:2: ( rule__Conf__ServiceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getServiceAssignment_1()); 
            }
            // InternalMappingAssistance.g:1888:2: ( rule__Conf__ServiceAssignment_1 )
            // InternalMappingAssistance.g:1888:3: rule__Conf__ServiceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Conf__ServiceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getServiceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__1__Impl"


    // $ANTLR start "rule__Conf__Group__2"
    // InternalMappingAssistance.g:1896:1: rule__Conf__Group__2 : rule__Conf__Group__2__Impl rule__Conf__Group__3 ;
    public final void rule__Conf__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1900:1: ( rule__Conf__Group__2__Impl rule__Conf__Group__3 )
            // InternalMappingAssistance.g:1901:2: rule__Conf__Group__2__Impl rule__Conf__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Conf__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__2"


    // $ANTLR start "rule__Conf__Group__2__Impl"
    // InternalMappingAssistance.g:1908:1: rule__Conf__Group__2__Impl : ( '.' ) ;
    public final void rule__Conf__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1912:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1913:1: ( '.' )
            {
            // InternalMappingAssistance.g:1913:1: ( '.' )
            // InternalMappingAssistance.g:1914:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getFullStopKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getFullStopKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__2__Impl"


    // $ANTLR start "rule__Conf__Group__3"
    // InternalMappingAssistance.g:1923:1: rule__Conf__Group__3 : rule__Conf__Group__3__Impl rule__Conf__Group__4 ;
    public final void rule__Conf__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1927:1: ( rule__Conf__Group__3__Impl rule__Conf__Group__4 )
            // InternalMappingAssistance.g:1928:2: rule__Conf__Group__3__Impl rule__Conf__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Conf__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__3"


    // $ANTLR start "rule__Conf__Group__3__Impl"
    // InternalMappingAssistance.g:1935:1: rule__Conf__Group__3__Impl : ( ( rule__Conf__MemberAssignment_3 ) ) ;
    public final void rule__Conf__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1939:1: ( ( ( rule__Conf__MemberAssignment_3 ) ) )
            // InternalMappingAssistance.g:1940:1: ( ( rule__Conf__MemberAssignment_3 ) )
            {
            // InternalMappingAssistance.g:1940:1: ( ( rule__Conf__MemberAssignment_3 ) )
            // InternalMappingAssistance.g:1941:2: ( rule__Conf__MemberAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getMemberAssignment_3()); 
            }
            // InternalMappingAssistance.g:1942:2: ( rule__Conf__MemberAssignment_3 )
            // InternalMappingAssistance.g:1942:3: rule__Conf__MemberAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conf__MemberAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getMemberAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__3__Impl"


    // $ANTLR start "rule__Conf__Group__4"
    // InternalMappingAssistance.g:1950:1: rule__Conf__Group__4 : rule__Conf__Group__4__Impl rule__Conf__Group__5 ;
    public final void rule__Conf__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1954:1: ( rule__Conf__Group__4__Impl rule__Conf__Group__5 )
            // InternalMappingAssistance.g:1955:2: rule__Conf__Group__4__Impl rule__Conf__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Conf__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__4"


    // $ANTLR start "rule__Conf__Group__4__Impl"
    // InternalMappingAssistance.g:1962:1: rule__Conf__Group__4__Impl : ( '(' ) ;
    public final void rule__Conf__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1966:1: ( ( '(' ) )
            // InternalMappingAssistance.g:1967:1: ( '(' )
            {
            // InternalMappingAssistance.g:1967:1: ( '(' )
            // InternalMappingAssistance.g:1968:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getLeftParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__4__Impl"


    // $ANTLR start "rule__Conf__Group__5"
    // InternalMappingAssistance.g:1977:1: rule__Conf__Group__5 : rule__Conf__Group__5__Impl rule__Conf__Group__6 ;
    public final void rule__Conf__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1981:1: ( rule__Conf__Group__5__Impl rule__Conf__Group__6 )
            // InternalMappingAssistance.g:1982:2: rule__Conf__Group__5__Impl rule__Conf__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Conf__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__5"


    // $ANTLR start "rule__Conf__Group__5__Impl"
    // InternalMappingAssistance.g:1989:1: rule__Conf__Group__5__Impl : ( ( rule__Conf__Group_5__0 )* ) ;
    public final void rule__Conf__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1993:1: ( ( ( rule__Conf__Group_5__0 )* ) )
            // InternalMappingAssistance.g:1994:1: ( ( rule__Conf__Group_5__0 )* )
            {
            // InternalMappingAssistance.g:1994:1: ( ( rule__Conf__Group_5__0 )* )
            // InternalMappingAssistance.g:1995:2: ( rule__Conf__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getGroup_5()); 
            }
            // InternalMappingAssistance.g:1996:2: ( rule__Conf__Group_5__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMappingAssistance.g:1996:3: rule__Conf__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conf__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__5__Impl"


    // $ANTLR start "rule__Conf__Group__6"
    // InternalMappingAssistance.g:2004:1: rule__Conf__Group__6 : rule__Conf__Group__6__Impl ;
    public final void rule__Conf__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2008:1: ( rule__Conf__Group__6__Impl )
            // InternalMappingAssistance.g:2009:2: rule__Conf__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conf__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__6"


    // $ANTLR start "rule__Conf__Group__6__Impl"
    // InternalMappingAssistance.g:2015:1: rule__Conf__Group__6__Impl : ( ')' ) ;
    public final void rule__Conf__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2019:1: ( ( ')' ) )
            // InternalMappingAssistance.g:2020:1: ( ')' )
            {
            // InternalMappingAssistance.g:2020:1: ( ')' )
            // InternalMappingAssistance.g:2021:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group__6__Impl"


    // $ANTLR start "rule__Conf__Group_5__0"
    // InternalMappingAssistance.g:2031:1: rule__Conf__Group_5__0 : rule__Conf__Group_5__0__Impl rule__Conf__Group_5__1 ;
    public final void rule__Conf__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2035:1: ( rule__Conf__Group_5__0__Impl rule__Conf__Group_5__1 )
            // InternalMappingAssistance.g:2036:2: rule__Conf__Group_5__0__Impl rule__Conf__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Conf__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5__0"


    // $ANTLR start "rule__Conf__Group_5__0__Impl"
    // InternalMappingAssistance.g:2043:1: rule__Conf__Group_5__0__Impl : ( ( rule__Conf__Group_5_0__0 )* ) ;
    public final void rule__Conf__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2047:1: ( ( ( rule__Conf__Group_5_0__0 )* ) )
            // InternalMappingAssistance.g:2048:1: ( ( rule__Conf__Group_5_0__0 )* )
            {
            // InternalMappingAssistance.g:2048:1: ( ( rule__Conf__Group_5_0__0 )* )
            // InternalMappingAssistance.g:2049:2: ( rule__Conf__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getGroup_5_0()); 
            }
            // InternalMappingAssistance.g:2050:2: ( rule__Conf__Group_5_0__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==23) ) {
                        int LA13_2 = input.LA(3);

                        if ( (LA13_2==RULE_ID) ) {
                            int LA13_3 = input.LA(4);

                            if ( (LA13_3==27) ) {
                                alt13=1;
                            }


                        }


                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalMappingAssistance.g:2050:3: rule__Conf__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Conf__Group_5_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getGroup_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5__0__Impl"


    // $ANTLR start "rule__Conf__Group_5__1"
    // InternalMappingAssistance.g:2058:1: rule__Conf__Group_5__1 : rule__Conf__Group_5__1__Impl ;
    public final void rule__Conf__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2062:1: ( rule__Conf__Group_5__1__Impl )
            // InternalMappingAssistance.g:2063:2: rule__Conf__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5__1"


    // $ANTLR start "rule__Conf__Group_5__1__Impl"
    // InternalMappingAssistance.g:2069:1: rule__Conf__Group_5__1__Impl : ( ( rule__Conf__Group_5_1__0 ) ) ;
    public final void rule__Conf__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2073:1: ( ( ( rule__Conf__Group_5_1__0 ) ) )
            // InternalMappingAssistance.g:2074:1: ( ( rule__Conf__Group_5_1__0 ) )
            {
            // InternalMappingAssistance.g:2074:1: ( ( rule__Conf__Group_5_1__0 ) )
            // InternalMappingAssistance.g:2075:2: ( rule__Conf__Group_5_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getGroup_5_1()); 
            }
            // InternalMappingAssistance.g:2076:2: ( rule__Conf__Group_5_1__0 )
            // InternalMappingAssistance.g:2076:3: rule__Conf__Group_5_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getGroup_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5__1__Impl"


    // $ANTLR start "rule__Conf__Group_5_0__0"
    // InternalMappingAssistance.g:2085:1: rule__Conf__Group_5_0__0 : rule__Conf__Group_5_0__0__Impl rule__Conf__Group_5_0__1 ;
    public final void rule__Conf__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2089:1: ( rule__Conf__Group_5_0__0__Impl rule__Conf__Group_5_0__1 )
            // InternalMappingAssistance.g:2090:2: rule__Conf__Group_5_0__0__Impl rule__Conf__Group_5_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Conf__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__0"


    // $ANTLR start "rule__Conf__Group_5_0__0__Impl"
    // InternalMappingAssistance.g:2097:1: rule__Conf__Group_5_0__0__Impl : ( ( rule__Conf__VarConfAssignment_5_0_0 ) ) ;
    public final void rule__Conf__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2101:1: ( ( ( rule__Conf__VarConfAssignment_5_0_0 ) ) )
            // InternalMappingAssistance.g:2102:1: ( ( rule__Conf__VarConfAssignment_5_0_0 ) )
            {
            // InternalMappingAssistance.g:2102:1: ( ( rule__Conf__VarConfAssignment_5_0_0 ) )
            // InternalMappingAssistance.g:2103:2: ( rule__Conf__VarConfAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getVarConfAssignment_5_0_0()); 
            }
            // InternalMappingAssistance.g:2104:2: ( rule__Conf__VarConfAssignment_5_0_0 )
            // InternalMappingAssistance.g:2104:3: rule__Conf__VarConfAssignment_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Conf__VarConfAssignment_5_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getVarConfAssignment_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__0__Impl"


    // $ANTLR start "rule__Conf__Group_5_0__1"
    // InternalMappingAssistance.g:2112:1: rule__Conf__Group_5_0__1 : rule__Conf__Group_5_0__1__Impl rule__Conf__Group_5_0__2 ;
    public final void rule__Conf__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2116:1: ( rule__Conf__Group_5_0__1__Impl rule__Conf__Group_5_0__2 )
            // InternalMappingAssistance.g:2117:2: rule__Conf__Group_5_0__1__Impl rule__Conf__Group_5_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Conf__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__1"


    // $ANTLR start "rule__Conf__Group_5_0__1__Impl"
    // InternalMappingAssistance.g:2124:1: rule__Conf__Group_5_0__1__Impl : ( ':=' ) ;
    public final void rule__Conf__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2128:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:2129:1: ( ':=' )
            {
            // InternalMappingAssistance.g:2129:1: ( ':=' )
            // InternalMappingAssistance.g:2130:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getColonEqualsSignKeyword_5_0_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getColonEqualsSignKeyword_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__1__Impl"


    // $ANTLR start "rule__Conf__Group_5_0__2"
    // InternalMappingAssistance.g:2139:1: rule__Conf__Group_5_0__2 : rule__Conf__Group_5_0__2__Impl rule__Conf__Group_5_0__3 ;
    public final void rule__Conf__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2143:1: ( rule__Conf__Group_5_0__2__Impl rule__Conf__Group_5_0__3 )
            // InternalMappingAssistance.g:2144:2: rule__Conf__Group_5_0__2__Impl rule__Conf__Group_5_0__3
            {
            pushFollow(FOLLOW_19);
            rule__Conf__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__2"


    // $ANTLR start "rule__Conf__Group_5_0__2__Impl"
    // InternalMappingAssistance.g:2151:1: rule__Conf__Group_5_0__2__Impl : ( ( rule__Conf__InstVarAssignment_5_0_2 ) ) ;
    public final void rule__Conf__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2155:1: ( ( ( rule__Conf__InstVarAssignment_5_0_2 ) ) )
            // InternalMappingAssistance.g:2156:1: ( ( rule__Conf__InstVarAssignment_5_0_2 ) )
            {
            // InternalMappingAssistance.g:2156:1: ( ( rule__Conf__InstVarAssignment_5_0_2 ) )
            // InternalMappingAssistance.g:2157:2: ( rule__Conf__InstVarAssignment_5_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getInstVarAssignment_5_0_2()); 
            }
            // InternalMappingAssistance.g:2158:2: ( rule__Conf__InstVarAssignment_5_0_2 )
            // InternalMappingAssistance.g:2158:3: rule__Conf__InstVarAssignment_5_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Conf__InstVarAssignment_5_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getInstVarAssignment_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__2__Impl"


    // $ANTLR start "rule__Conf__Group_5_0__3"
    // InternalMappingAssistance.g:2166:1: rule__Conf__Group_5_0__3 : rule__Conf__Group_5_0__3__Impl ;
    public final void rule__Conf__Group_5_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2170:1: ( rule__Conf__Group_5_0__3__Impl )
            // InternalMappingAssistance.g:2171:2: rule__Conf__Group_5_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__3"


    // $ANTLR start "rule__Conf__Group_5_0__3__Impl"
    // InternalMappingAssistance.g:2177:1: rule__Conf__Group_5_0__3__Impl : ( ',' ) ;
    public final void rule__Conf__Group_5_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2181:1: ( ( ',' ) )
            // InternalMappingAssistance.g:2182:1: ( ',' )
            {
            // InternalMappingAssistance.g:2182:1: ( ',' )
            // InternalMappingAssistance.g:2183:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getCommaKeyword_5_0_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getCommaKeyword_5_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_0__3__Impl"


    // $ANTLR start "rule__Conf__Group_5_1__0"
    // InternalMappingAssistance.g:2193:1: rule__Conf__Group_5_1__0 : rule__Conf__Group_5_1__0__Impl rule__Conf__Group_5_1__1 ;
    public final void rule__Conf__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2197:1: ( rule__Conf__Group_5_1__0__Impl rule__Conf__Group_5_1__1 )
            // InternalMappingAssistance.g:2198:2: rule__Conf__Group_5_1__0__Impl rule__Conf__Group_5_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Conf__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_1__0"


    // $ANTLR start "rule__Conf__Group_5_1__0__Impl"
    // InternalMappingAssistance.g:2205:1: rule__Conf__Group_5_1__0__Impl : ( ( rule__Conf__VarConfAssignment_5_1_0 ) ) ;
    public final void rule__Conf__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2209:1: ( ( ( rule__Conf__VarConfAssignment_5_1_0 ) ) )
            // InternalMappingAssistance.g:2210:1: ( ( rule__Conf__VarConfAssignment_5_1_0 ) )
            {
            // InternalMappingAssistance.g:2210:1: ( ( rule__Conf__VarConfAssignment_5_1_0 ) )
            // InternalMappingAssistance.g:2211:2: ( rule__Conf__VarConfAssignment_5_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getVarConfAssignment_5_1_0()); 
            }
            // InternalMappingAssistance.g:2212:2: ( rule__Conf__VarConfAssignment_5_1_0 )
            // InternalMappingAssistance.g:2212:3: rule__Conf__VarConfAssignment_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Conf__VarConfAssignment_5_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getVarConfAssignment_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_1__0__Impl"


    // $ANTLR start "rule__Conf__Group_5_1__1"
    // InternalMappingAssistance.g:2220:1: rule__Conf__Group_5_1__1 : rule__Conf__Group_5_1__1__Impl rule__Conf__Group_5_1__2 ;
    public final void rule__Conf__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2224:1: ( rule__Conf__Group_5_1__1__Impl rule__Conf__Group_5_1__2 )
            // InternalMappingAssistance.g:2225:2: rule__Conf__Group_5_1__1__Impl rule__Conf__Group_5_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Conf__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_1__1"


    // $ANTLR start "rule__Conf__Group_5_1__1__Impl"
    // InternalMappingAssistance.g:2232:1: rule__Conf__Group_5_1__1__Impl : ( ':=' ) ;
    public final void rule__Conf__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2236:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:2237:1: ( ':=' )
            {
            // InternalMappingAssistance.g:2237:1: ( ':=' )
            // InternalMappingAssistance.g:2238:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getColonEqualsSignKeyword_5_1_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getColonEqualsSignKeyword_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_1__1__Impl"


    // $ANTLR start "rule__Conf__Group_5_1__2"
    // InternalMappingAssistance.g:2247:1: rule__Conf__Group_5_1__2 : rule__Conf__Group_5_1__2__Impl ;
    public final void rule__Conf__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2251:1: ( rule__Conf__Group_5_1__2__Impl )
            // InternalMappingAssistance.g:2252:2: rule__Conf__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conf__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_1__2"


    // $ANTLR start "rule__Conf__Group_5_1__2__Impl"
    // InternalMappingAssistance.g:2258:1: rule__Conf__Group_5_1__2__Impl : ( ( rule__Conf__InstVarAssignment_5_1_2 ) ) ;
    public final void rule__Conf__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2262:1: ( ( ( rule__Conf__InstVarAssignment_5_1_2 ) ) )
            // InternalMappingAssistance.g:2263:1: ( ( rule__Conf__InstVarAssignment_5_1_2 ) )
            {
            // InternalMappingAssistance.g:2263:1: ( ( rule__Conf__InstVarAssignment_5_1_2 ) )
            // InternalMappingAssistance.g:2264:2: ( rule__Conf__InstVarAssignment_5_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getInstVarAssignment_5_1_2()); 
            }
            // InternalMappingAssistance.g:2265:2: ( rule__Conf__InstVarAssignment_5_1_2 )
            // InternalMappingAssistance.g:2265:3: rule__Conf__InstVarAssignment_5_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Conf__InstVarAssignment_5_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getInstVarAssignment_5_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__Group_5_1__2__Impl"


    // $ANTLR start "rule__Comopnent__Group__0"
    // InternalMappingAssistance.g:2274:1: rule__Comopnent__Group__0 : rule__Comopnent__Group__0__Impl rule__Comopnent__Group__1 ;
    public final void rule__Comopnent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2278:1: ( rule__Comopnent__Group__0__Impl rule__Comopnent__Group__1 )
            // InternalMappingAssistance.g:2279:2: rule__Comopnent__Group__0__Impl rule__Comopnent__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Comopnent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__0"


    // $ANTLR start "rule__Comopnent__Group__0__Impl"
    // InternalMappingAssistance.g:2286:1: rule__Comopnent__Group__0__Impl : ( 'AddComponent:' ) ;
    public final void rule__Comopnent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2290:1: ( ( 'AddComponent:' ) )
            // InternalMappingAssistance.g:2291:1: ( 'AddComponent:' )
            {
            // InternalMappingAssistance.g:2291:1: ( 'AddComponent:' )
            // InternalMappingAssistance.g:2292:2: 'AddComponent:'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getAddComponentKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getAddComponentKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__0__Impl"


    // $ANTLR start "rule__Comopnent__Group__1"
    // InternalMappingAssistance.g:2301:1: rule__Comopnent__Group__1 : rule__Comopnent__Group__1__Impl rule__Comopnent__Group__2 ;
    public final void rule__Comopnent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2305:1: ( rule__Comopnent__Group__1__Impl rule__Comopnent__Group__2 )
            // InternalMappingAssistance.g:2306:2: rule__Comopnent__Group__1__Impl rule__Comopnent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Comopnent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__1"


    // $ANTLR start "rule__Comopnent__Group__1__Impl"
    // InternalMappingAssistance.g:2313:1: rule__Comopnent__Group__1__Impl : ( ( rule__Comopnent__NameAssignment_1 ) ) ;
    public final void rule__Comopnent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2317:1: ( ( ( rule__Comopnent__NameAssignment_1 ) ) )
            // InternalMappingAssistance.g:2318:1: ( ( rule__Comopnent__NameAssignment_1 ) )
            {
            // InternalMappingAssistance.g:2318:1: ( ( rule__Comopnent__NameAssignment_1 ) )
            // InternalMappingAssistance.g:2319:2: ( rule__Comopnent__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getNameAssignment_1()); 
            }
            // InternalMappingAssistance.g:2320:2: ( rule__Comopnent__NameAssignment_1 )
            // InternalMappingAssistance.g:2320:3: rule__Comopnent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__1__Impl"


    // $ANTLR start "rule__Comopnent__Group__2"
    // InternalMappingAssistance.g:2328:1: rule__Comopnent__Group__2 : rule__Comopnent__Group__2__Impl rule__Comopnent__Group__3 ;
    public final void rule__Comopnent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2332:1: ( rule__Comopnent__Group__2__Impl rule__Comopnent__Group__3 )
            // InternalMappingAssistance.g:2333:2: rule__Comopnent__Group__2__Impl rule__Comopnent__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Comopnent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__2"


    // $ANTLR start "rule__Comopnent__Group__2__Impl"
    // InternalMappingAssistance.g:2340:1: rule__Comopnent__Group__2__Impl : ( '{' ) ;
    public final void rule__Comopnent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2344:1: ( ( '{' ) )
            // InternalMappingAssistance.g:2345:1: ( '{' )
            {
            // InternalMappingAssistance.g:2345:1: ( '{' )
            // InternalMappingAssistance.g:2346:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__2__Impl"


    // $ANTLR start "rule__Comopnent__Group__3"
    // InternalMappingAssistance.g:2355:1: rule__Comopnent__Group__3 : rule__Comopnent__Group__3__Impl rule__Comopnent__Group__4 ;
    public final void rule__Comopnent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2359:1: ( rule__Comopnent__Group__3__Impl rule__Comopnent__Group__4 )
            // InternalMappingAssistance.g:2360:2: rule__Comopnent__Group__3__Impl rule__Comopnent__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Comopnent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__3"


    // $ANTLR start "rule__Comopnent__Group__3__Impl"
    // InternalMappingAssistance.g:2367:1: rule__Comopnent__Group__3__Impl : ( 'providedServices' ) ;
    public final void rule__Comopnent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2371:1: ( ( 'providedServices' ) )
            // InternalMappingAssistance.g:2372:1: ( 'providedServices' )
            {
            // InternalMappingAssistance.g:2372:1: ( 'providedServices' )
            // InternalMappingAssistance.g:2373:2: 'providedServices'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getProvidedServicesKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getProvidedServicesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__3__Impl"


    // $ANTLR start "rule__Comopnent__Group__4"
    // InternalMappingAssistance.g:2382:1: rule__Comopnent__Group__4 : rule__Comopnent__Group__4__Impl rule__Comopnent__Group__5 ;
    public final void rule__Comopnent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2386:1: ( rule__Comopnent__Group__4__Impl rule__Comopnent__Group__5 )
            // InternalMappingAssistance.g:2387:2: rule__Comopnent__Group__4__Impl rule__Comopnent__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Comopnent__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__4"


    // $ANTLR start "rule__Comopnent__Group__4__Impl"
    // InternalMappingAssistance.g:2394:1: rule__Comopnent__Group__4__Impl : ( '(' ) ;
    public final void rule__Comopnent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2398:1: ( ( '(' ) )
            // InternalMappingAssistance.g:2399:1: ( '(' )
            {
            // InternalMappingAssistance.g:2399:1: ( '(' )
            // InternalMappingAssistance.g:2400:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getLeftParenthesisKeyword_4()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getLeftParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__4__Impl"


    // $ANTLR start "rule__Comopnent__Group__5"
    // InternalMappingAssistance.g:2409:1: rule__Comopnent__Group__5 : rule__Comopnent__Group__5__Impl rule__Comopnent__Group__6 ;
    public final void rule__Comopnent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2413:1: ( rule__Comopnent__Group__5__Impl rule__Comopnent__Group__6 )
            // InternalMappingAssistance.g:2414:2: rule__Comopnent__Group__5__Impl rule__Comopnent__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Comopnent__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__5"


    // $ANTLR start "rule__Comopnent__Group__5__Impl"
    // InternalMappingAssistance.g:2421:1: rule__Comopnent__Group__5__Impl : ( ( rule__Comopnent__Group_5__0 )* ) ;
    public final void rule__Comopnent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2425:1: ( ( ( rule__Comopnent__Group_5__0 )* ) )
            // InternalMappingAssistance.g:2426:1: ( ( rule__Comopnent__Group_5__0 )* )
            {
            // InternalMappingAssistance.g:2426:1: ( ( rule__Comopnent__Group_5__0 )* )
            // InternalMappingAssistance.g:2427:2: ( rule__Comopnent__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getGroup_5()); 
            }
            // InternalMappingAssistance.g:2428:2: ( rule__Comopnent__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMappingAssistance.g:2428:3: rule__Comopnent__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Comopnent__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__5__Impl"


    // $ANTLR start "rule__Comopnent__Group__6"
    // InternalMappingAssistance.g:2436:1: rule__Comopnent__Group__6 : rule__Comopnent__Group__6__Impl rule__Comopnent__Group__7 ;
    public final void rule__Comopnent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2440:1: ( rule__Comopnent__Group__6__Impl rule__Comopnent__Group__7 )
            // InternalMappingAssistance.g:2441:2: rule__Comopnent__Group__6__Impl rule__Comopnent__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__Comopnent__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__6"


    // $ANTLR start "rule__Comopnent__Group__6__Impl"
    // InternalMappingAssistance.g:2448:1: rule__Comopnent__Group__6__Impl : ( ')' ) ;
    public final void rule__Comopnent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2452:1: ( ( ')' ) )
            // InternalMappingAssistance.g:2453:1: ( ')' )
            {
            // InternalMappingAssistance.g:2453:1: ( ')' )
            // InternalMappingAssistance.g:2454:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__6__Impl"


    // $ANTLR start "rule__Comopnent__Group__7"
    // InternalMappingAssistance.g:2463:1: rule__Comopnent__Group__7 : rule__Comopnent__Group__7__Impl rule__Comopnent__Group__8 ;
    public final void rule__Comopnent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2467:1: ( rule__Comopnent__Group__7__Impl rule__Comopnent__Group__8 )
            // InternalMappingAssistance.g:2468:2: rule__Comopnent__Group__7__Impl rule__Comopnent__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Comopnent__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__7"


    // $ANTLR start "rule__Comopnent__Group__7__Impl"
    // InternalMappingAssistance.g:2475:1: rule__Comopnent__Group__7__Impl : ( ( rule__Comopnent__Group_7__0 )* ) ;
    public final void rule__Comopnent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2479:1: ( ( ( rule__Comopnent__Group_7__0 )* ) )
            // InternalMappingAssistance.g:2480:1: ( ( rule__Comopnent__Group_7__0 )* )
            {
            // InternalMappingAssistance.g:2480:1: ( ( rule__Comopnent__Group_7__0 )* )
            // InternalMappingAssistance.g:2481:2: ( rule__Comopnent__Group_7__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getGroup_7()); 
            }
            // InternalMappingAssistance.g:2482:2: ( rule__Comopnent__Group_7__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMappingAssistance.g:2482:3: rule__Comopnent__Group_7__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Comopnent__Group_7__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__7__Impl"


    // $ANTLR start "rule__Comopnent__Group__8"
    // InternalMappingAssistance.g:2490:1: rule__Comopnent__Group__8 : rule__Comopnent__Group__8__Impl ;
    public final void rule__Comopnent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2494:1: ( rule__Comopnent__Group__8__Impl )
            // InternalMappingAssistance.g:2495:2: rule__Comopnent__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__8"


    // $ANTLR start "rule__Comopnent__Group__8__Impl"
    // InternalMappingAssistance.g:2501:1: rule__Comopnent__Group__8__Impl : ( '}' ) ;
    public final void rule__Comopnent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2505:1: ( ( '}' ) )
            // InternalMappingAssistance.g:2506:1: ( '}' )
            {
            // InternalMappingAssistance.g:2506:1: ( '}' )
            // InternalMappingAssistance.g:2507:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group__8__Impl"


    // $ANTLR start "rule__Comopnent__Group_5__0"
    // InternalMappingAssistance.g:2517:1: rule__Comopnent__Group_5__0 : rule__Comopnent__Group_5__0__Impl rule__Comopnent__Group_5__1 ;
    public final void rule__Comopnent__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2521:1: ( rule__Comopnent__Group_5__0__Impl rule__Comopnent__Group_5__1 )
            // InternalMappingAssistance.g:2522:2: rule__Comopnent__Group_5__0__Impl rule__Comopnent__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__Comopnent__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5__0"


    // $ANTLR start "rule__Comopnent__Group_5__0__Impl"
    // InternalMappingAssistance.g:2529:1: rule__Comopnent__Group_5__0__Impl : ( ( rule__Comopnent__Group_5_0__0 )* ) ;
    public final void rule__Comopnent__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2533:1: ( ( ( rule__Comopnent__Group_5_0__0 )* ) )
            // InternalMappingAssistance.g:2534:1: ( ( rule__Comopnent__Group_5_0__0 )* )
            {
            // InternalMappingAssistance.g:2534:1: ( ( rule__Comopnent__Group_5_0__0 )* )
            // InternalMappingAssistance.g:2535:2: ( rule__Comopnent__Group_5_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getGroup_5_0()); 
            }
            // InternalMappingAssistance.g:2536:2: ( rule__Comopnent__Group_5_0__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==27) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalMappingAssistance.g:2536:3: rule__Comopnent__Group_5_0__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Comopnent__Group_5_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getGroup_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5__0__Impl"


    // $ANTLR start "rule__Comopnent__Group_5__1"
    // InternalMappingAssistance.g:2544:1: rule__Comopnent__Group_5__1 : rule__Comopnent__Group_5__1__Impl ;
    public final void rule__Comopnent__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2548:1: ( rule__Comopnent__Group_5__1__Impl )
            // InternalMappingAssistance.g:2549:2: rule__Comopnent__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5__1"


    // $ANTLR start "rule__Comopnent__Group_5__1__Impl"
    // InternalMappingAssistance.g:2555:1: rule__Comopnent__Group_5__1__Impl : ( ( rule__Comopnent__OpsAssignment_5_1 ) ) ;
    public final void rule__Comopnent__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2559:1: ( ( ( rule__Comopnent__OpsAssignment_5_1 ) ) )
            // InternalMappingAssistance.g:2560:1: ( ( rule__Comopnent__OpsAssignment_5_1 ) )
            {
            // InternalMappingAssistance.g:2560:1: ( ( rule__Comopnent__OpsAssignment_5_1 ) )
            // InternalMappingAssistance.g:2561:2: ( rule__Comopnent__OpsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOpsAssignment_5_1()); 
            }
            // InternalMappingAssistance.g:2562:2: ( rule__Comopnent__OpsAssignment_5_1 )
            // InternalMappingAssistance.g:2562:3: rule__Comopnent__OpsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__OpsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOpsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5__1__Impl"


    // $ANTLR start "rule__Comopnent__Group_5_0__0"
    // InternalMappingAssistance.g:2571:1: rule__Comopnent__Group_5_0__0 : rule__Comopnent__Group_5_0__0__Impl rule__Comopnent__Group_5_0__1 ;
    public final void rule__Comopnent__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2575:1: ( rule__Comopnent__Group_5_0__0__Impl rule__Comopnent__Group_5_0__1 )
            // InternalMappingAssistance.g:2576:2: rule__Comopnent__Group_5_0__0__Impl rule__Comopnent__Group_5_0__1
            {
            pushFollow(FOLLOW_19);
            rule__Comopnent__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5_0__0"


    // $ANTLR start "rule__Comopnent__Group_5_0__0__Impl"
    // InternalMappingAssistance.g:2583:1: rule__Comopnent__Group_5_0__0__Impl : ( ( rule__Comopnent__OpsAssignment_5_0_0 ) ) ;
    public final void rule__Comopnent__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2587:1: ( ( ( rule__Comopnent__OpsAssignment_5_0_0 ) ) )
            // InternalMappingAssistance.g:2588:1: ( ( rule__Comopnent__OpsAssignment_5_0_0 ) )
            {
            // InternalMappingAssistance.g:2588:1: ( ( rule__Comopnent__OpsAssignment_5_0_0 ) )
            // InternalMappingAssistance.g:2589:2: ( rule__Comopnent__OpsAssignment_5_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOpsAssignment_5_0_0()); 
            }
            // InternalMappingAssistance.g:2590:2: ( rule__Comopnent__OpsAssignment_5_0_0 )
            // InternalMappingAssistance.g:2590:3: rule__Comopnent__OpsAssignment_5_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__OpsAssignment_5_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOpsAssignment_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5_0__0__Impl"


    // $ANTLR start "rule__Comopnent__Group_5_0__1"
    // InternalMappingAssistance.g:2598:1: rule__Comopnent__Group_5_0__1 : rule__Comopnent__Group_5_0__1__Impl ;
    public final void rule__Comopnent__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2602:1: ( rule__Comopnent__Group_5_0__1__Impl )
            // InternalMappingAssistance.g:2603:2: rule__Comopnent__Group_5_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5_0__1"


    // $ANTLR start "rule__Comopnent__Group_5_0__1__Impl"
    // InternalMappingAssistance.g:2609:1: rule__Comopnent__Group_5_0__1__Impl : ( ',' ) ;
    public final void rule__Comopnent__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2613:1: ( ( ',' ) )
            // InternalMappingAssistance.g:2614:1: ( ',' )
            {
            // InternalMappingAssistance.g:2614:1: ( ',' )
            // InternalMappingAssistance.g:2615:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getCommaKeyword_5_0_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getCommaKeyword_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_5_0__1__Impl"


    // $ANTLR start "rule__Comopnent__Group_7__0"
    // InternalMappingAssistance.g:2625:1: rule__Comopnent__Group_7__0 : rule__Comopnent__Group_7__0__Impl ;
    public final void rule__Comopnent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2629:1: ( rule__Comopnent__Group_7__0__Impl )
            // InternalMappingAssistance.g:2630:2: rule__Comopnent__Group_7__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_7__0"


    // $ANTLR start "rule__Comopnent__Group_7__0__Impl"
    // InternalMappingAssistance.g:2636:1: rule__Comopnent__Group_7__0__Impl : ( ( rule__Comopnent__OperationsAssignment_7_0 ) ) ;
    public final void rule__Comopnent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2640:1: ( ( ( rule__Comopnent__OperationsAssignment_7_0 ) ) )
            // InternalMappingAssistance.g:2641:1: ( ( rule__Comopnent__OperationsAssignment_7_0 ) )
            {
            // InternalMappingAssistance.g:2641:1: ( ( rule__Comopnent__OperationsAssignment_7_0 ) )
            // InternalMappingAssistance.g:2642:2: ( rule__Comopnent__OperationsAssignment_7_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOperationsAssignment_7_0()); 
            }
            // InternalMappingAssistance.g:2643:2: ( rule__Comopnent__OperationsAssignment_7_0 )
            // InternalMappingAssistance.g:2643:3: rule__Comopnent__OperationsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Comopnent__OperationsAssignment_7_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOperationsAssignment_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__Group_7__0__Impl"


    // $ANTLR start "rule__TestOP__Group__0"
    // InternalMappingAssistance.g:2652:1: rule__TestOP__Group__0 : rule__TestOP__Group__0__Impl rule__TestOP__Group__1 ;
    public final void rule__TestOP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2656:1: ( rule__TestOP__Group__0__Impl rule__TestOP__Group__1 )
            // InternalMappingAssistance.g:2657:2: rule__TestOP__Group__0__Impl rule__TestOP__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TestOP__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__0"


    // $ANTLR start "rule__TestOP__Group__0__Impl"
    // InternalMappingAssistance.g:2664:1: rule__TestOP__Group__0__Impl : ( ( rule__TestOP__ServiceAssignment_0 ) ) ;
    public final void rule__TestOP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2668:1: ( ( ( rule__TestOP__ServiceAssignment_0 ) ) )
            // InternalMappingAssistance.g:2669:1: ( ( rule__TestOP__ServiceAssignment_0 ) )
            {
            // InternalMappingAssistance.g:2669:1: ( ( rule__TestOP__ServiceAssignment_0 ) )
            // InternalMappingAssistance.g:2670:2: ( rule__TestOP__ServiceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getServiceAssignment_0()); 
            }
            // InternalMappingAssistance.g:2671:2: ( rule__TestOP__ServiceAssignment_0 )
            // InternalMappingAssistance.g:2671:3: rule__TestOP__ServiceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__ServiceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getServiceAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__0__Impl"


    // $ANTLR start "rule__TestOP__Group__1"
    // InternalMappingAssistance.g:2679:1: rule__TestOP__Group__1 : rule__TestOP__Group__1__Impl rule__TestOP__Group__2 ;
    public final void rule__TestOP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2683:1: ( rule__TestOP__Group__1__Impl rule__TestOP__Group__2 )
            // InternalMappingAssistance.g:2684:2: rule__TestOP__Group__1__Impl rule__TestOP__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TestOP__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__1"


    // $ANTLR start "rule__TestOP__Group__1__Impl"
    // InternalMappingAssistance.g:2691:1: rule__TestOP__Group__1__Impl : ( '.' ) ;
    public final void rule__TestOP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2695:1: ( ( '.' ) )
            // InternalMappingAssistance.g:2696:1: ( '.' )
            {
            // InternalMappingAssistance.g:2696:1: ( '.' )
            // InternalMappingAssistance.g:2697:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getFullStopKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__1__Impl"


    // $ANTLR start "rule__TestOP__Group__2"
    // InternalMappingAssistance.g:2706:1: rule__TestOP__Group__2 : rule__TestOP__Group__2__Impl rule__TestOP__Group__3 ;
    public final void rule__TestOP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2710:1: ( rule__TestOP__Group__2__Impl rule__TestOP__Group__3 )
            // InternalMappingAssistance.g:2711:2: rule__TestOP__Group__2__Impl rule__TestOP__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TestOP__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__2"


    // $ANTLR start "rule__TestOP__Group__2__Impl"
    // InternalMappingAssistance.g:2718:1: rule__TestOP__Group__2__Impl : ( ( rule__TestOP__NameAssignment_2 ) ) ;
    public final void rule__TestOP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2722:1: ( ( ( rule__TestOP__NameAssignment_2 ) ) )
            // InternalMappingAssistance.g:2723:1: ( ( rule__TestOP__NameAssignment_2 ) )
            {
            // InternalMappingAssistance.g:2723:1: ( ( rule__TestOP__NameAssignment_2 ) )
            // InternalMappingAssistance.g:2724:2: ( rule__TestOP__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getNameAssignment_2()); 
            }
            // InternalMappingAssistance.g:2725:2: ( rule__TestOP__NameAssignment_2 )
            // InternalMappingAssistance.g:2725:3: rule__TestOP__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__2__Impl"


    // $ANTLR start "rule__TestOP__Group__3"
    // InternalMappingAssistance.g:2733:1: rule__TestOP__Group__3 : rule__TestOP__Group__3__Impl rule__TestOP__Group__4 ;
    public final void rule__TestOP__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2737:1: ( rule__TestOP__Group__3__Impl rule__TestOP__Group__4 )
            // InternalMappingAssistance.g:2738:2: rule__TestOP__Group__3__Impl rule__TestOP__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__TestOP__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__3"


    // $ANTLR start "rule__TestOP__Group__3__Impl"
    // InternalMappingAssistance.g:2745:1: rule__TestOP__Group__3__Impl : ( '(' ) ;
    public final void rule__TestOP__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2749:1: ( ( '(' ) )
            // InternalMappingAssistance.g:2750:1: ( '(' )
            {
            // InternalMappingAssistance.g:2750:1: ( '(' )
            // InternalMappingAssistance.g:2751:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__3__Impl"


    // $ANTLR start "rule__TestOP__Group__4"
    // InternalMappingAssistance.g:2760:1: rule__TestOP__Group__4 : rule__TestOP__Group__4__Impl rule__TestOP__Group__5 ;
    public final void rule__TestOP__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2764:1: ( rule__TestOP__Group__4__Impl rule__TestOP__Group__5 )
            // InternalMappingAssistance.g:2765:2: rule__TestOP__Group__4__Impl rule__TestOP__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__TestOP__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__4"


    // $ANTLR start "rule__TestOP__Group__4__Impl"
    // InternalMappingAssistance.g:2772:1: rule__TestOP__Group__4__Impl : ( ( rule__TestOP__Group_4__0 )* ) ;
    public final void rule__TestOP__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2776:1: ( ( ( rule__TestOP__Group_4__0 )* ) )
            // InternalMappingAssistance.g:2777:1: ( ( rule__TestOP__Group_4__0 )* )
            {
            // InternalMappingAssistance.g:2777:1: ( ( rule__TestOP__Group_4__0 )* )
            // InternalMappingAssistance.g:2778:2: ( rule__TestOP__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getGroup_4()); 
            }
            // InternalMappingAssistance.g:2779:2: ( rule__TestOP__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMappingAssistance.g:2779:3: rule__TestOP__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TestOP__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__4__Impl"


    // $ANTLR start "rule__TestOP__Group__5"
    // InternalMappingAssistance.g:2787:1: rule__TestOP__Group__5 : rule__TestOP__Group__5__Impl ;
    public final void rule__TestOP__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2791:1: ( rule__TestOP__Group__5__Impl )
            // InternalMappingAssistance.g:2792:2: rule__TestOP__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__5"


    // $ANTLR start "rule__TestOP__Group__5__Impl"
    // InternalMappingAssistance.g:2798:1: rule__TestOP__Group__5__Impl : ( ')' ) ;
    public final void rule__TestOP__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2802:1: ( ( ')' ) )
            // InternalMappingAssistance.g:2803:1: ( ')' )
            {
            // InternalMappingAssistance.g:2803:1: ( ')' )
            // InternalMappingAssistance.g:2804:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group__5__Impl"


    // $ANTLR start "rule__TestOP__Group_4__0"
    // InternalMappingAssistance.g:2814:1: rule__TestOP__Group_4__0 : rule__TestOP__Group_4__0__Impl rule__TestOP__Group_4__1 ;
    public final void rule__TestOP__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2818:1: ( rule__TestOP__Group_4__0__Impl rule__TestOP__Group_4__1 )
            // InternalMappingAssistance.g:2819:2: rule__TestOP__Group_4__0__Impl rule__TestOP__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__TestOP__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4__0"


    // $ANTLR start "rule__TestOP__Group_4__0__Impl"
    // InternalMappingAssistance.g:2826:1: rule__TestOP__Group_4__0__Impl : ( ( rule__TestOP__Group_4_0__0 )* ) ;
    public final void rule__TestOP__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2830:1: ( ( ( rule__TestOP__Group_4_0__0 )* ) )
            // InternalMappingAssistance.g:2831:1: ( ( rule__TestOP__Group_4_0__0 )* )
            {
            // InternalMappingAssistance.g:2831:1: ( ( rule__TestOP__Group_4_0__0 )* )
            // InternalMappingAssistance.g:2832:2: ( rule__TestOP__Group_4_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getGroup_4_0()); 
            }
            // InternalMappingAssistance.g:2833:2: ( rule__TestOP__Group_4_0__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==23) ) {
                        int LA18_2 = input.LA(3);

                        if ( (LA18_2==RULE_ID) ) {
                            int LA18_3 = input.LA(4);

                            if ( (LA18_3==27) ) {
                                alt18=1;
                            }


                        }


                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalMappingAssistance.g:2833:3: rule__TestOP__Group_4_0__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__TestOP__Group_4_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getGroup_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4__0__Impl"


    // $ANTLR start "rule__TestOP__Group_4__1"
    // InternalMappingAssistance.g:2841:1: rule__TestOP__Group_4__1 : rule__TestOP__Group_4__1__Impl ;
    public final void rule__TestOP__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2845:1: ( rule__TestOP__Group_4__1__Impl )
            // InternalMappingAssistance.g:2846:2: rule__TestOP__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4__1"


    // $ANTLR start "rule__TestOP__Group_4__1__Impl"
    // InternalMappingAssistance.g:2852:1: rule__TestOP__Group_4__1__Impl : ( ( rule__TestOP__Group_4_1__0 ) ) ;
    public final void rule__TestOP__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2856:1: ( ( ( rule__TestOP__Group_4_1__0 ) ) )
            // InternalMappingAssistance.g:2857:1: ( ( rule__TestOP__Group_4_1__0 ) )
            {
            // InternalMappingAssistance.g:2857:1: ( ( rule__TestOP__Group_4_1__0 ) )
            // InternalMappingAssistance.g:2858:2: ( rule__TestOP__Group_4_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getGroup_4_1()); 
            }
            // InternalMappingAssistance.g:2859:2: ( rule__TestOP__Group_4_1__0 )
            // InternalMappingAssistance.g:2859:3: rule__TestOP__Group_4_1__0
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4__1__Impl"


    // $ANTLR start "rule__TestOP__Group_4_0__0"
    // InternalMappingAssistance.g:2868:1: rule__TestOP__Group_4_0__0 : rule__TestOP__Group_4_0__0__Impl rule__TestOP__Group_4_0__1 ;
    public final void rule__TestOP__Group_4_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2872:1: ( rule__TestOP__Group_4_0__0__Impl rule__TestOP__Group_4_0__1 )
            // InternalMappingAssistance.g:2873:2: rule__TestOP__Group_4_0__0__Impl rule__TestOP__Group_4_0__1
            {
            pushFollow(FOLLOW_15);
            rule__TestOP__Group_4_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__0"


    // $ANTLR start "rule__TestOP__Group_4_0__0__Impl"
    // InternalMappingAssistance.g:2880:1: rule__TestOP__Group_4_0__0__Impl : ( ( rule__TestOP__VarConfAssignment_4_0_0 ) ) ;
    public final void rule__TestOP__Group_4_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2884:1: ( ( ( rule__TestOP__VarConfAssignment_4_0_0 ) ) )
            // InternalMappingAssistance.g:2885:1: ( ( rule__TestOP__VarConfAssignment_4_0_0 ) )
            {
            // InternalMappingAssistance.g:2885:1: ( ( rule__TestOP__VarConfAssignment_4_0_0 ) )
            // InternalMappingAssistance.g:2886:2: ( rule__TestOP__VarConfAssignment_4_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getVarConfAssignment_4_0_0()); 
            }
            // InternalMappingAssistance.g:2887:2: ( rule__TestOP__VarConfAssignment_4_0_0 )
            // InternalMappingAssistance.g:2887:3: rule__TestOP__VarConfAssignment_4_0_0
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__VarConfAssignment_4_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getVarConfAssignment_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__0__Impl"


    // $ANTLR start "rule__TestOP__Group_4_0__1"
    // InternalMappingAssistance.g:2895:1: rule__TestOP__Group_4_0__1 : rule__TestOP__Group_4_0__1__Impl rule__TestOP__Group_4_0__2 ;
    public final void rule__TestOP__Group_4_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2899:1: ( rule__TestOP__Group_4_0__1__Impl rule__TestOP__Group_4_0__2 )
            // InternalMappingAssistance.g:2900:2: rule__TestOP__Group_4_0__1__Impl rule__TestOP__Group_4_0__2
            {
            pushFollow(FOLLOW_8);
            rule__TestOP__Group_4_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__1"


    // $ANTLR start "rule__TestOP__Group_4_0__1__Impl"
    // InternalMappingAssistance.g:2907:1: rule__TestOP__Group_4_0__1__Impl : ( ':=' ) ;
    public final void rule__TestOP__Group_4_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2911:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:2912:1: ( ':=' )
            {
            // InternalMappingAssistance.g:2912:1: ( ':=' )
            // InternalMappingAssistance.g:2913:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getColonEqualsSignKeyword_4_0_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getColonEqualsSignKeyword_4_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__1__Impl"


    // $ANTLR start "rule__TestOP__Group_4_0__2"
    // InternalMappingAssistance.g:2922:1: rule__TestOP__Group_4_0__2 : rule__TestOP__Group_4_0__2__Impl rule__TestOP__Group_4_0__3 ;
    public final void rule__TestOP__Group_4_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2926:1: ( rule__TestOP__Group_4_0__2__Impl rule__TestOP__Group_4_0__3 )
            // InternalMappingAssistance.g:2927:2: rule__TestOP__Group_4_0__2__Impl rule__TestOP__Group_4_0__3
            {
            pushFollow(FOLLOW_19);
            rule__TestOP__Group_4_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__2"


    // $ANTLR start "rule__TestOP__Group_4_0__2__Impl"
    // InternalMappingAssistance.g:2934:1: rule__TestOP__Group_4_0__2__Impl : ( ( rule__TestOP__InstVarAssignment_4_0_2 ) ) ;
    public final void rule__TestOP__Group_4_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2938:1: ( ( ( rule__TestOP__InstVarAssignment_4_0_2 ) ) )
            // InternalMappingAssistance.g:2939:1: ( ( rule__TestOP__InstVarAssignment_4_0_2 ) )
            {
            // InternalMappingAssistance.g:2939:1: ( ( rule__TestOP__InstVarAssignment_4_0_2 ) )
            // InternalMappingAssistance.g:2940:2: ( rule__TestOP__InstVarAssignment_4_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getInstVarAssignment_4_0_2()); 
            }
            // InternalMappingAssistance.g:2941:2: ( rule__TestOP__InstVarAssignment_4_0_2 )
            // InternalMappingAssistance.g:2941:3: rule__TestOP__InstVarAssignment_4_0_2
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__InstVarAssignment_4_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getInstVarAssignment_4_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__2__Impl"


    // $ANTLR start "rule__TestOP__Group_4_0__3"
    // InternalMappingAssistance.g:2949:1: rule__TestOP__Group_4_0__3 : rule__TestOP__Group_4_0__3__Impl ;
    public final void rule__TestOP__Group_4_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2953:1: ( rule__TestOP__Group_4_0__3__Impl )
            // InternalMappingAssistance.g:2954:2: rule__TestOP__Group_4_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__3"


    // $ANTLR start "rule__TestOP__Group_4_0__3__Impl"
    // InternalMappingAssistance.g:2960:1: rule__TestOP__Group_4_0__3__Impl : ( ',' ) ;
    public final void rule__TestOP__Group_4_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2964:1: ( ( ',' ) )
            // InternalMappingAssistance.g:2965:1: ( ',' )
            {
            // InternalMappingAssistance.g:2965:1: ( ',' )
            // InternalMappingAssistance.g:2966:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getCommaKeyword_4_0_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getCommaKeyword_4_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_0__3__Impl"


    // $ANTLR start "rule__TestOP__Group_4_1__0"
    // InternalMappingAssistance.g:2976:1: rule__TestOP__Group_4_1__0 : rule__TestOP__Group_4_1__0__Impl rule__TestOP__Group_4_1__1 ;
    public final void rule__TestOP__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2980:1: ( rule__TestOP__Group_4_1__0__Impl rule__TestOP__Group_4_1__1 )
            // InternalMappingAssistance.g:2981:2: rule__TestOP__Group_4_1__0__Impl rule__TestOP__Group_4_1__1
            {
            pushFollow(FOLLOW_15);
            rule__TestOP__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_1__0"


    // $ANTLR start "rule__TestOP__Group_4_1__0__Impl"
    // InternalMappingAssistance.g:2988:1: rule__TestOP__Group_4_1__0__Impl : ( ( rule__TestOP__VarConfAssignment_4_1_0 ) ) ;
    public final void rule__TestOP__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2992:1: ( ( ( rule__TestOP__VarConfAssignment_4_1_0 ) ) )
            // InternalMappingAssistance.g:2993:1: ( ( rule__TestOP__VarConfAssignment_4_1_0 ) )
            {
            // InternalMappingAssistance.g:2993:1: ( ( rule__TestOP__VarConfAssignment_4_1_0 ) )
            // InternalMappingAssistance.g:2994:2: ( rule__TestOP__VarConfAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getVarConfAssignment_4_1_0()); 
            }
            // InternalMappingAssistance.g:2995:2: ( rule__TestOP__VarConfAssignment_4_1_0 )
            // InternalMappingAssistance.g:2995:3: rule__TestOP__VarConfAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__VarConfAssignment_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getVarConfAssignment_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_1__0__Impl"


    // $ANTLR start "rule__TestOP__Group_4_1__1"
    // InternalMappingAssistance.g:3003:1: rule__TestOP__Group_4_1__1 : rule__TestOP__Group_4_1__1__Impl rule__TestOP__Group_4_1__2 ;
    public final void rule__TestOP__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3007:1: ( rule__TestOP__Group_4_1__1__Impl rule__TestOP__Group_4_1__2 )
            // InternalMappingAssistance.g:3008:2: rule__TestOP__Group_4_1__1__Impl rule__TestOP__Group_4_1__2
            {
            pushFollow(FOLLOW_8);
            rule__TestOP__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_1__1"


    // $ANTLR start "rule__TestOP__Group_4_1__1__Impl"
    // InternalMappingAssistance.g:3015:1: rule__TestOP__Group_4_1__1__Impl : ( ':=' ) ;
    public final void rule__TestOP__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3019:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:3020:1: ( ':=' )
            {
            // InternalMappingAssistance.g:3020:1: ( ':=' )
            // InternalMappingAssistance.g:3021:2: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getColonEqualsSignKeyword_4_1_1()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getColonEqualsSignKeyword_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_1__1__Impl"


    // $ANTLR start "rule__TestOP__Group_4_1__2"
    // InternalMappingAssistance.g:3030:1: rule__TestOP__Group_4_1__2 : rule__TestOP__Group_4_1__2__Impl ;
    public final void rule__TestOP__Group_4_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3034:1: ( rule__TestOP__Group_4_1__2__Impl )
            // InternalMappingAssistance.g:3035:2: rule__TestOP__Group_4_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__Group_4_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_1__2"


    // $ANTLR start "rule__TestOP__Group_4_1__2__Impl"
    // InternalMappingAssistance.g:3041:1: rule__TestOP__Group_4_1__2__Impl : ( ( rule__TestOP__InstVarAssignment_4_1_2 ) ) ;
    public final void rule__TestOP__Group_4_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3045:1: ( ( ( rule__TestOP__InstVarAssignment_4_1_2 ) ) )
            // InternalMappingAssistance.g:3046:1: ( ( rule__TestOP__InstVarAssignment_4_1_2 ) )
            {
            // InternalMappingAssistance.g:3046:1: ( ( rule__TestOP__InstVarAssignment_4_1_2 ) )
            // InternalMappingAssistance.g:3047:2: ( rule__TestOP__InstVarAssignment_4_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getInstVarAssignment_4_1_2()); 
            }
            // InternalMappingAssistance.g:3048:2: ( rule__TestOP__InstVarAssignment_4_1_2 )
            // InternalMappingAssistance.g:3048:3: rule__TestOP__InstVarAssignment_4_1_2
            {
            pushFollow(FOLLOW_2);
            rule__TestOP__InstVarAssignment_4_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getInstVarAssignment_4_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__Group_4_1__2__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalMappingAssistance.g:3057:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3061:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalMappingAssistance.g:3062:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:3069:1: rule__Operation__Group__0__Impl : ( 'def' ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3073:1: ( ( 'def' ) )
            // InternalMappingAssistance.g:3074:1: ( 'def' )
            {
            // InternalMappingAssistance.g:3074:1: ( 'def' )
            // InternalMappingAssistance.g:3075:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getDefKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:3084:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3088:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalMappingAssistance.g:3089:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMappingAssistance.g:3096:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__NameAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3100:1: ( ( ( rule__Operation__NameAssignment_1 ) ) )
            // InternalMappingAssistance.g:3101:1: ( ( rule__Operation__NameAssignment_1 ) )
            {
            // InternalMappingAssistance.g:3101:1: ( ( rule__Operation__NameAssignment_1 ) )
            // InternalMappingAssistance.g:3102:2: ( rule__Operation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getNameAssignment_1()); 
            }
            // InternalMappingAssistance.g:3103:2: ( rule__Operation__NameAssignment_1 )
            // InternalMappingAssistance.g:3103:3: rule__Operation__NameAssignment_1
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
    // InternalMappingAssistance.g:3111:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3115:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalMappingAssistance.g:3116:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalMappingAssistance.g:3123:1: rule__Operation__Group__2__Impl : ( '(' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3127:1: ( ( '(' ) )
            // InternalMappingAssistance.g:3128:1: ( '(' )
            {
            // InternalMappingAssistance.g:3128:1: ( '(' )
            // InternalMappingAssistance.g:3129:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:3138:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3142:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalMappingAssistance.g:3143:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMappingAssistance.g:3150:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__Group_3__0 )* ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3154:1: ( ( ( rule__Operation__Group_3__0 )* ) )
            // InternalMappingAssistance.g:3155:1: ( ( rule__Operation__Group_3__0 )* )
            {
            // InternalMappingAssistance.g:3155:1: ( ( rule__Operation__Group_3__0 )* )
            // InternalMappingAssistance.g:3156:2: ( rule__Operation__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3()); 
            }
            // InternalMappingAssistance.g:3157:2: ( rule__Operation__Group_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMappingAssistance.g:3157:3: rule__Operation__Group_3__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Operation__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMappingAssistance.g:3165:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3169:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalMappingAssistance.g:3170:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalMappingAssistance.g:3177:1: rule__Operation__Group__4__Impl : ( ')' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3181:1: ( ( ')' ) )
            // InternalMappingAssistance.g:3182:1: ( ')' )
            {
            // InternalMappingAssistance.g:3182:1: ( ')' )
            // InternalMappingAssistance.g:3183:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:3192:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3196:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalMappingAssistance.g:3197:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalMappingAssistance.g:3204:1: rule__Operation__Group__5__Impl : ( ':' ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3208:1: ( ( ':' ) )
            // InternalMappingAssistance.g:3209:1: ( ':' )
            {
            // InternalMappingAssistance.g:3209:1: ( ':' )
            // InternalMappingAssistance.g:3210:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getColonKeyword_5()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:3219:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3223:1: ( rule__Operation__Group__6__Impl )
            // InternalMappingAssistance.g:3224:2: rule__Operation__Group__6__Impl
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
    // InternalMappingAssistance.g:3230:1: rule__Operation__Group__6__Impl : ( ( rule__Operation__TypeAssignment_6 ) ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3234:1: ( ( ( rule__Operation__TypeAssignment_6 ) ) )
            // InternalMappingAssistance.g:3235:1: ( ( rule__Operation__TypeAssignment_6 ) )
            {
            // InternalMappingAssistance.g:3235:1: ( ( rule__Operation__TypeAssignment_6 ) )
            // InternalMappingAssistance.g:3236:2: ( rule__Operation__TypeAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeAssignment_6()); 
            }
            // InternalMappingAssistance.g:3237:2: ( rule__Operation__TypeAssignment_6 )
            // InternalMappingAssistance.g:3237:3: rule__Operation__TypeAssignment_6
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
    // InternalMappingAssistance.g:3246:1: rule__Operation__Group_3__0 : rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 ;
    public final void rule__Operation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3250:1: ( rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1 )
            // InternalMappingAssistance.g:3251:2: rule__Operation__Group_3__0__Impl rule__Operation__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:3258:1: rule__Operation__Group_3__0__Impl : ( ( rule__Operation__Group_3_0__0 )* ) ;
    public final void rule__Operation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3262:1: ( ( ( rule__Operation__Group_3_0__0 )* ) )
            // InternalMappingAssistance.g:3263:1: ( ( rule__Operation__Group_3_0__0 )* )
            {
            // InternalMappingAssistance.g:3263:1: ( ( rule__Operation__Group_3_0__0 )* )
            // InternalMappingAssistance.g:3264:2: ( rule__Operation__Group_3_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getGroup_3_0()); 
            }
            // InternalMappingAssistance.g:3265:2: ( rule__Operation__Group_3_0__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==33) ) {
                        switch ( input.LA(3) ) {
                        case 13:
                            {
                            int LA20_3 = input.LA(4);

                            if ( (LA20_3==27) ) {
                                alt20=1;
                            }


                            }
                            break;
                        case 14:
                            {
                            int LA20_4 = input.LA(4);

                            if ( (LA20_4==27) ) {
                                alt20=1;
                            }


                            }
                            break;
                        case 15:
                            {
                            int LA20_5 = input.LA(4);

                            if ( (LA20_5==27) ) {
                                alt20=1;
                            }


                            }
                            break;
                        case 16:
                            {
                            int LA20_6 = input.LA(4);

                            if ( (LA20_6==27) ) {
                                alt20=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalMappingAssistance.g:3265:3: rule__Operation__Group_3_0__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Operation__Group_3_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMappingAssistance.g:3273:1: rule__Operation__Group_3__1 : rule__Operation__Group_3__1__Impl ;
    public final void rule__Operation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3277:1: ( rule__Operation__Group_3__1__Impl )
            // InternalMappingAssistance.g:3278:2: rule__Operation__Group_3__1__Impl
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
    // InternalMappingAssistance.g:3284:1: rule__Operation__Group_3__1__Impl : ( ( rule__Operation__ArgAssignment_3_1 ) ) ;
    public final void rule__Operation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3288:1: ( ( ( rule__Operation__ArgAssignment_3_1 ) ) )
            // InternalMappingAssistance.g:3289:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            {
            // InternalMappingAssistance.g:3289:1: ( ( rule__Operation__ArgAssignment_3_1 ) )
            // InternalMappingAssistance.g:3290:2: ( rule__Operation__ArgAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_1()); 
            }
            // InternalMappingAssistance.g:3291:2: ( rule__Operation__ArgAssignment_3_1 )
            // InternalMappingAssistance.g:3291:3: rule__Operation__ArgAssignment_3_1
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
    // InternalMappingAssistance.g:3300:1: rule__Operation__Group_3_0__0 : rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 ;
    public final void rule__Operation__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3304:1: ( rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1 )
            // InternalMappingAssistance.g:3305:2: rule__Operation__Group_3_0__0__Impl rule__Operation__Group_3_0__1
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
    // InternalMappingAssistance.g:3312:1: rule__Operation__Group_3_0__0__Impl : ( ( rule__Operation__ArgAssignment_3_0_0 ) ) ;
    public final void rule__Operation__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3316:1: ( ( ( rule__Operation__ArgAssignment_3_0_0 ) ) )
            // InternalMappingAssistance.g:3317:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            {
            // InternalMappingAssistance.g:3317:1: ( ( rule__Operation__ArgAssignment_3_0_0 ) )
            // InternalMappingAssistance.g:3318:2: ( rule__Operation__ArgAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getArgAssignment_3_0_0()); 
            }
            // InternalMappingAssistance.g:3319:2: ( rule__Operation__ArgAssignment_3_0_0 )
            // InternalMappingAssistance.g:3319:3: rule__Operation__ArgAssignment_3_0_0
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
    // InternalMappingAssistance.g:3327:1: rule__Operation__Group_3_0__1 : rule__Operation__Group_3_0__1__Impl ;
    public final void rule__Operation__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3331:1: ( rule__Operation__Group_3_0__1__Impl )
            // InternalMappingAssistance.g:3332:2: rule__Operation__Group_3_0__1__Impl
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
    // InternalMappingAssistance.g:3338:1: rule__Operation__Group_3_0__1__Impl : ( ',' ) ;
    public final void rule__Operation__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3342:1: ( ( ',' ) )
            // InternalMappingAssistance.g:3343:1: ( ',' )
            {
            // InternalMappingAssistance.g:3343:1: ( ',' )
            // InternalMappingAssistance.g:3344:2: ','
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


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMappingAssistance.g:3354:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3358:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMappingAssistance.g:3359:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMappingAssistance.g:3366:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3370:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalMappingAssistance.g:3371:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalMappingAssistance.g:3371:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalMappingAssistance.g:3372:2: ( rule__Variable__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            }
            // InternalMappingAssistance.g:3373:2: ( rule__Variable__NameAssignment_0 )
            // InternalMappingAssistance.g:3373:3: rule__Variable__NameAssignment_0
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
    // InternalMappingAssistance.g:3381:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3385:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMappingAssistance.g:3386:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMappingAssistance.g:3393:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3397:1: ( ( ':' ) )
            // InternalMappingAssistance.g:3398:1: ( ':' )
            {
            // InternalMappingAssistance.g:3398:1: ( ':' )
            // InternalMappingAssistance.g:3399:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:3408:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3412:1: ( rule__Variable__Group__2__Impl )
            // InternalMappingAssistance.g:3413:2: rule__Variable__Group__2__Impl
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
    // InternalMappingAssistance.g:3419:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3423:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalMappingAssistance.g:3424:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalMappingAssistance.g:3424:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalMappingAssistance.g:3425:2: ( rule__Variable__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            }
            // InternalMappingAssistance.g:3426:2: ( rule__Variable__TypeAssignment_2 )
            // InternalMappingAssistance.g:3426:3: rule__Variable__TypeAssignment_2
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
    // InternalMappingAssistance.g:3435:1: rule__Bindings__Group__0 : rule__Bindings__Group__0__Impl rule__Bindings__Group__1 ;
    public final void rule__Bindings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3439:1: ( rule__Bindings__Group__0__Impl rule__Bindings__Group__1 )
            // InternalMappingAssistance.g:3440:2: rule__Bindings__Group__0__Impl rule__Bindings__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:3447:1: rule__Bindings__Group__0__Impl : ( 'addBind(' ) ;
    public final void rule__Bindings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3451:1: ( ( 'addBind(' ) )
            // InternalMappingAssistance.g:3452:1: ( 'addBind(' )
            {
            // InternalMappingAssistance.g:3452:1: ( 'addBind(' )
            // InternalMappingAssistance.g:3453:2: 'addBind('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getAddBindKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getAddBindKeyword_0()); 
            }

            }


            }

        }
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
    // InternalMappingAssistance.g:3462:1: rule__Bindings__Group__1 : rule__Bindings__Group__1__Impl rule__Bindings__Group__2 ;
    public final void rule__Bindings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3466:1: ( rule__Bindings__Group__1__Impl rule__Bindings__Group__2 )
            // InternalMappingAssistance.g:3467:2: rule__Bindings__Group__1__Impl rule__Bindings__Group__2
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
    // InternalMappingAssistance.g:3474:1: rule__Bindings__Group__1__Impl : ( ( rule__Bindings__NameCompAssignment_1 ) ) ;
    public final void rule__Bindings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3478:1: ( ( ( rule__Bindings__NameCompAssignment_1 ) ) )
            // InternalMappingAssistance.g:3479:1: ( ( rule__Bindings__NameCompAssignment_1 ) )
            {
            // InternalMappingAssistance.g:3479:1: ( ( rule__Bindings__NameCompAssignment_1 ) )
            // InternalMappingAssistance.g:3480:2: ( rule__Bindings__NameCompAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameCompAssignment_1()); 
            }
            // InternalMappingAssistance.g:3481:2: ( rule__Bindings__NameCompAssignment_1 )
            // InternalMappingAssistance.g:3481:3: rule__Bindings__NameCompAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameCompAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameCompAssignment_1()); 
            }

            }


            }

        }
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
    // InternalMappingAssistance.g:3489:1: rule__Bindings__Group__2 : rule__Bindings__Group__2__Impl rule__Bindings__Group__3 ;
    public final void rule__Bindings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3493:1: ( rule__Bindings__Group__2__Impl rule__Bindings__Group__3 )
            // InternalMappingAssistance.g:3494:2: rule__Bindings__Group__2__Impl rule__Bindings__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:3501:1: rule__Bindings__Group__2__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3505:1: ( ( '.' ) )
            // InternalMappingAssistance.g:3506:1: ( '.' )
            {
            // InternalMappingAssistance.g:3506:1: ( '.' )
            // InternalMappingAssistance.g:3507:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getFullStopKeyword_2()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:3516:1: rule__Bindings__Group__3 : rule__Bindings__Group__3__Impl rule__Bindings__Group__4 ;
    public final void rule__Bindings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3520:1: ( rule__Bindings__Group__3__Impl rule__Bindings__Group__4 )
            // InternalMappingAssistance.g:3521:2: rule__Bindings__Group__3__Impl rule__Bindings__Group__4
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
    // InternalMappingAssistance.g:3528:1: rule__Bindings__Group__3__Impl : ( ( rule__Bindings__NameServ1Assignment_3 ) ) ;
    public final void rule__Bindings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3532:1: ( ( ( rule__Bindings__NameServ1Assignment_3 ) ) )
            // InternalMappingAssistance.g:3533:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            {
            // InternalMappingAssistance.g:3533:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            // InternalMappingAssistance.g:3534:2: ( rule__Bindings__NameServ1Assignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1Assignment_3()); 
            }
            // InternalMappingAssistance.g:3535:2: ( rule__Bindings__NameServ1Assignment_3 )
            // InternalMappingAssistance.g:3535:3: rule__Bindings__NameServ1Assignment_3
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
    // InternalMappingAssistance.g:3543:1: rule__Bindings__Group__4 : rule__Bindings__Group__4__Impl rule__Bindings__Group__5 ;
    public final void rule__Bindings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3547:1: ( rule__Bindings__Group__4__Impl rule__Bindings__Group__5 )
            // InternalMappingAssistance.g:3548:2: rule__Bindings__Group__4__Impl rule__Bindings__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:3555:1: rule__Bindings__Group__4__Impl : ( ',' ) ;
    public final void rule__Bindings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3559:1: ( ( ',' ) )
            // InternalMappingAssistance.g:3560:1: ( ',' )
            {
            // InternalMappingAssistance.g:3560:1: ( ',' )
            // InternalMappingAssistance.g:3561:2: ','
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
    // InternalMappingAssistance.g:3570:1: rule__Bindings__Group__5 : rule__Bindings__Group__5__Impl rule__Bindings__Group__6 ;
    public final void rule__Bindings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3574:1: ( rule__Bindings__Group__5__Impl rule__Bindings__Group__6 )
            // InternalMappingAssistance.g:3575:2: rule__Bindings__Group__5__Impl rule__Bindings__Group__6
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
    // InternalMappingAssistance.g:3582:1: rule__Bindings__Group__5__Impl : ( ( rule__Bindings__NameComp1Assignment_5 ) ) ;
    public final void rule__Bindings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3586:1: ( ( ( rule__Bindings__NameComp1Assignment_5 ) ) )
            // InternalMappingAssistance.g:3587:1: ( ( rule__Bindings__NameComp1Assignment_5 ) )
            {
            // InternalMappingAssistance.g:3587:1: ( ( rule__Bindings__NameComp1Assignment_5 ) )
            // InternalMappingAssistance.g:3588:2: ( rule__Bindings__NameComp1Assignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1Assignment_5()); 
            }
            // InternalMappingAssistance.g:3589:2: ( rule__Bindings__NameComp1Assignment_5 )
            // InternalMappingAssistance.g:3589:3: rule__Bindings__NameComp1Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameComp1Assignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp1Assignment_5()); 
            }

            }


            }

        }
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
    // InternalMappingAssistance.g:3597:1: rule__Bindings__Group__6 : rule__Bindings__Group__6__Impl rule__Bindings__Group__7 ;
    public final void rule__Bindings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3601:1: ( rule__Bindings__Group__6__Impl rule__Bindings__Group__7 )
            // InternalMappingAssistance.g:3602:2: rule__Bindings__Group__6__Impl rule__Bindings__Group__7
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:3609:1: rule__Bindings__Group__6__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3613:1: ( ( '.' ) )
            // InternalMappingAssistance.g:3614:1: ( '.' )
            {
            // InternalMappingAssistance.g:3614:1: ( '.' )
            // InternalMappingAssistance.g:3615:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getFullStopKeyword_6()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalMappingAssistance.g:3624:1: rule__Bindings__Group__7 : rule__Bindings__Group__7__Impl rule__Bindings__Group__8 ;
    public final void rule__Bindings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3628:1: ( rule__Bindings__Group__7__Impl rule__Bindings__Group__8 )
            // InternalMappingAssistance.g:3629:2: rule__Bindings__Group__7__Impl rule__Bindings__Group__8
            {
            pushFollow(FOLLOW_18);
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
    // InternalMappingAssistance.g:3636:1: rule__Bindings__Group__7__Impl : ( ( rule__Bindings__NameServ2Assignment_7 ) ) ;
    public final void rule__Bindings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3640:1: ( ( ( rule__Bindings__NameServ2Assignment_7 ) ) )
            // InternalMappingAssistance.g:3641:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            {
            // InternalMappingAssistance.g:3641:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            // InternalMappingAssistance.g:3642:2: ( rule__Bindings__NameServ2Assignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2Assignment_7()); 
            }
            // InternalMappingAssistance.g:3643:2: ( rule__Bindings__NameServ2Assignment_7 )
            // InternalMappingAssistance.g:3643:3: rule__Bindings__NameServ2Assignment_7
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
    // InternalMappingAssistance.g:3651:1: rule__Bindings__Group__8 : rule__Bindings__Group__8__Impl ;
    public final void rule__Bindings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3655:1: ( rule__Bindings__Group__8__Impl )
            // InternalMappingAssistance.g:3656:2: rule__Bindings__Group__8__Impl
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
    // InternalMappingAssistance.g:3662:1: rule__Bindings__Group__8__Impl : ( ')' ) ;
    public final void rule__Bindings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3666:1: ( ( ')' ) )
            // InternalMappingAssistance.g:3667:1: ( ')' )
            {
            // InternalMappingAssistance.g:3667:1: ( ')' )
            // InternalMappingAssistance.g:3668:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__InstanceComp__Group__0"
    // InternalMappingAssistance.g:3678:1: rule__InstanceComp__Group__0 : rule__InstanceComp__Group__0__Impl rule__InstanceComp__Group__1 ;
    public final void rule__InstanceComp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3682:1: ( rule__InstanceComp__Group__0__Impl rule__InstanceComp__Group__1 )
            // InternalMappingAssistance.g:3683:2: rule__InstanceComp__Group__0__Impl rule__InstanceComp__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__InstanceComp__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InstanceComp__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__0"


    // $ANTLR start "rule__InstanceComp__Group__0__Impl"
    // InternalMappingAssistance.g:3690:1: rule__InstanceComp__Group__0__Impl : ( 'def' ) ;
    public final void rule__InstanceComp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3694:1: ( ( 'def' ) )
            // InternalMappingAssistance.g:3695:1: ( 'def' )
            {
            // InternalMappingAssistance.g:3695:1: ( 'def' )
            // InternalMappingAssistance.g:3696:2: 'def'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getDefKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getDefKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__0__Impl"


    // $ANTLR start "rule__InstanceComp__Group__1"
    // InternalMappingAssistance.g:3705:1: rule__InstanceComp__Group__1 : rule__InstanceComp__Group__1__Impl rule__InstanceComp__Group__2 ;
    public final void rule__InstanceComp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3709:1: ( rule__InstanceComp__Group__1__Impl rule__InstanceComp__Group__2 )
            // InternalMappingAssistance.g:3710:2: rule__InstanceComp__Group__1__Impl rule__InstanceComp__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__InstanceComp__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InstanceComp__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__1"


    // $ANTLR start "rule__InstanceComp__Group__1__Impl"
    // InternalMappingAssistance.g:3717:1: rule__InstanceComp__Group__1__Impl : ( ( rule__InstanceComp__NameAssignment_1 ) ) ;
    public final void rule__InstanceComp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3721:1: ( ( ( rule__InstanceComp__NameAssignment_1 ) ) )
            // InternalMappingAssistance.g:3722:1: ( ( rule__InstanceComp__NameAssignment_1 ) )
            {
            // InternalMappingAssistance.g:3722:1: ( ( rule__InstanceComp__NameAssignment_1 ) )
            // InternalMappingAssistance.g:3723:2: ( rule__InstanceComp__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getNameAssignment_1()); 
            }
            // InternalMappingAssistance.g:3724:2: ( rule__InstanceComp__NameAssignment_1 )
            // InternalMappingAssistance.g:3724:3: rule__InstanceComp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InstanceComp__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__1__Impl"


    // $ANTLR start "rule__InstanceComp__Group__2"
    // InternalMappingAssistance.g:3732:1: rule__InstanceComp__Group__2 : rule__InstanceComp__Group__2__Impl rule__InstanceComp__Group__3 ;
    public final void rule__InstanceComp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3736:1: ( rule__InstanceComp__Group__2__Impl rule__InstanceComp__Group__3 )
            // InternalMappingAssistance.g:3737:2: rule__InstanceComp__Group__2__Impl rule__InstanceComp__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__InstanceComp__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__InstanceComp__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__2"


    // $ANTLR start "rule__InstanceComp__Group__2__Impl"
    // InternalMappingAssistance.g:3744:1: rule__InstanceComp__Group__2__Impl : ( ':' ) ;
    public final void rule__InstanceComp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3748:1: ( ( ':' ) )
            // InternalMappingAssistance.g:3749:1: ( ':' )
            {
            // InternalMappingAssistance.g:3749:1: ( ':' )
            // InternalMappingAssistance.g:3750:2: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getColonKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__2__Impl"


    // $ANTLR start "rule__InstanceComp__Group__3"
    // InternalMappingAssistance.g:3759:1: rule__InstanceComp__Group__3 : rule__InstanceComp__Group__3__Impl ;
    public final void rule__InstanceComp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3763:1: ( rule__InstanceComp__Group__3__Impl )
            // InternalMappingAssistance.g:3764:2: rule__InstanceComp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InstanceComp__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__3"


    // $ANTLR start "rule__InstanceComp__Group__3__Impl"
    // InternalMappingAssistance.g:3770:1: rule__InstanceComp__Group__3__Impl : ( ( rule__InstanceComp__TypeAssignment_3 ) ) ;
    public final void rule__InstanceComp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3774:1: ( ( ( rule__InstanceComp__TypeAssignment_3 ) ) )
            // InternalMappingAssistance.g:3775:1: ( ( rule__InstanceComp__TypeAssignment_3 ) )
            {
            // InternalMappingAssistance.g:3775:1: ( ( rule__InstanceComp__TypeAssignment_3 ) )
            // InternalMappingAssistance.g:3776:2: ( rule__InstanceComp__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getTypeAssignment_3()); 
            }
            // InternalMappingAssistance.g:3777:2: ( rule__InstanceComp__TypeAssignment_3 )
            // InternalMappingAssistance.g:3777:3: rule__InstanceComp__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InstanceComp__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__Group__3__Impl"


    // $ANTLR start "rule__Double__Group__0"
    // InternalMappingAssistance.g:3786:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3790:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalMappingAssistance.g:3791:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Double__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalMappingAssistance.g:3798:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3802:1: ( ( RULE_INT ) )
            // InternalMappingAssistance.g:3803:1: ( RULE_INT )
            {
            // InternalMappingAssistance.g:3803:1: ( RULE_INT )
            // InternalMappingAssistance.g:3804:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__0__Impl"


    // $ANTLR start "rule__Double__Group__1"
    // InternalMappingAssistance.g:3813:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3817:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalMappingAssistance.g:3818:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Double__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalMappingAssistance.g:3825:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3829:1: ( ( '.' ) )
            // InternalMappingAssistance.g:3830:1: ( '.' )
            {
            // InternalMappingAssistance.g:3830:1: ( '.' )
            // InternalMappingAssistance.g:3831:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__1__Impl"


    // $ANTLR start "rule__Double__Group__2"
    // InternalMappingAssistance.g:3840:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3844:1: ( rule__Double__Group__2__Impl )
            // InternalMappingAssistance.g:3845:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalMappingAssistance.g:3851:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3855:1: ( ( RULE_INT ) )
            // InternalMappingAssistance.g:3856:1: ( RULE_INT )
            {
            // InternalMappingAssistance.g:3856:1: ( RULE_INT )
            // InternalMappingAssistance.g:3857:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Double__Group__2__Impl"


    // $ANTLR start "rule__Model__FunctionAssignment"
    // InternalMappingAssistance.g:3867:1: rule__Model__FunctionAssignment : ( ruleAbstractModel ) ;
    public final void rule__Model__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3871:1: ( ( ruleAbstractModel ) )
            // InternalMappingAssistance.g:3872:2: ( ruleAbstractModel )
            {
            // InternalMappingAssistance.g:3872:2: ( ruleAbstractModel )
            // InternalMappingAssistance.g:3873:3: ruleAbstractModel
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


    // $ANTLR start "rule__AbstractModel__ImAssignment_0"
    // InternalMappingAssistance.g:3882:1: rule__AbstractModel__ImAssignment_0 : ( ruleImport ) ;
    public final void rule__AbstractModel__ImAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3886:1: ( ( ruleImport ) )
            // InternalMappingAssistance.g:3887:2: ( ruleImport )
            {
            // InternalMappingAssistance.g:3887:2: ( ruleImport )
            // InternalMappingAssistance.g:3888:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getImImportParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getImImportParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__ImAssignment_0"


    // $ANTLR start "rule__AbstractModel__TestDrAssignment_1"
    // InternalMappingAssistance.g:3897:1: rule__AbstractModel__TestDrAssignment_1 : ( ruleTestDriver ) ;
    public final void rule__AbstractModel__TestDrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3901:1: ( ( ruleTestDriver ) )
            // InternalMappingAssistance.g:3902:2: ( ruleTestDriver )
            {
            // InternalMappingAssistance.g:3902:2: ( ruleTestDriver )
            // InternalMappingAssistance.g:3903:3: ruleTestDriver
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getTestDrTestDriverParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTestDriver();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getTestDrTestDriverParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__TestDrAssignment_1"


    // $ANTLR start "rule__AbstractModel__ObsAssignment_2_0"
    // InternalMappingAssistance.g:3912:1: rule__AbstractModel__ObsAssignment_2_0 : ( ruleObserver ) ;
    public final void rule__AbstractModel__ObsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3916:1: ( ( ruleObserver ) )
            // InternalMappingAssistance.g:3917:2: ( ruleObserver )
            {
            // InternalMappingAssistance.g:3917:2: ( ruleObserver )
            // InternalMappingAssistance.g:3918:3: ruleObserver
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getObsObserverParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleObserver();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getObsObserverParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__ObsAssignment_2_0"


    // $ANTLR start "rule__AbstractModel__CompAssignment_2_1"
    // InternalMappingAssistance.g:3927:1: rule__AbstractModel__CompAssignment_2_1 : ( ruleComopnent ) ;
    public final void rule__AbstractModel__CompAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3931:1: ( ( ruleComopnent ) )
            // InternalMappingAssistance.g:3932:2: ( ruleComopnent )
            {
            // InternalMappingAssistance.g:3932:2: ( ruleComopnent )
            // InternalMappingAssistance.g:3933:3: ruleComopnent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getCompComopnentParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComopnent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getCompComopnentParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__CompAssignment_2_1"


    // $ANTLR start "rule__AbstractModel__MockAssignment_2_2"
    // InternalMappingAssistance.g:3942:1: rule__AbstractModel__MockAssignment_2_2 : ( ruleMock ) ;
    public final void rule__AbstractModel__MockAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3946:1: ( ( ruleMock ) )
            // InternalMappingAssistance.g:3947:2: ( ruleMock )
            {
            // InternalMappingAssistance.g:3947:2: ( ruleMock )
            // InternalMappingAssistance.g:3948:3: ruleMock
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getMockMockParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMock();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getMockMockParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__MockAssignment_2_2"


    // $ANTLR start "rule__AbstractModel__ConfAssignment_2_3"
    // InternalMappingAssistance.g:3957:1: rule__AbstractModel__ConfAssignment_2_3 : ( ruleConf ) ;
    public final void rule__AbstractModel__ConfAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3961:1: ( ( ruleConf ) )
            // InternalMappingAssistance.g:3962:2: ( ruleConf )
            {
            // InternalMappingAssistance.g:3962:2: ( ruleConf )
            // InternalMappingAssistance.g:3963:3: ruleConf
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getConfConfParserRuleCall_2_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getConfConfParserRuleCall_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__ConfAssignment_2_3"


    // $ANTLR start "rule__AbstractModel__BindAssignment_2_4"
    // InternalMappingAssistance.g:3972:1: rule__AbstractModel__BindAssignment_2_4 : ( ruleBindings ) ;
    public final void rule__AbstractModel__BindAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3976:1: ( ( ruleBindings ) )
            // InternalMappingAssistance.g:3977:2: ( ruleBindings )
            {
            // InternalMappingAssistance.g:3977:2: ( ruleBindings )
            // InternalMappingAssistance.g:3978:3: ruleBindings
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getBindBindingsParserRuleCall_2_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBindings();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getBindBindingsParserRuleCall_2_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__BindAssignment_2_4"


    // $ANTLR start "rule__AbstractModel__InstAssignment_2_5"
    // InternalMappingAssistance.g:3987:1: rule__AbstractModel__InstAssignment_2_5 : ( ruleInstanceComp ) ;
    public final void rule__AbstractModel__InstAssignment_2_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:3991:1: ( ( ruleInstanceComp ) )
            // InternalMappingAssistance.g:3992:2: ( ruleInstanceComp )
            {
            // InternalMappingAssistance.g:3992:2: ( ruleInstanceComp )
            // InternalMappingAssistance.g:3993:3: ruleInstanceComp
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAbstractModelAccess().getInstInstanceCompParserRuleCall_2_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleInstanceComp();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAbstractModelAccess().getInstInstanceCompParserRuleCall_2_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__InstAssignment_2_5"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMappingAssistance.g:4002:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4006:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMappingAssistance.g:4007:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMappingAssistance.g:4007:2: ( ruleQualifiedNameWithWildcard )
            // InternalMappingAssistance.g:4008:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__TestDriver__OutVarAssignment_3_0"
    // InternalMappingAssistance.g:4017:1: rule__TestDriver__OutVarAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__TestDriver__OutVarAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4021:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4022:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4022:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4023:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getOutVarVariableCrossReference_3_0_0()); 
            }
            // InternalMappingAssistance.g:4024:3: ( RULE_ID )
            // InternalMappingAssistance.g:4025:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getOutVarVariableIDTerminalRuleCall_3_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getOutVarVariableIDTerminalRuleCall_3_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getOutVarVariableCrossReference_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__OutVarAssignment_3_0"


    // $ANTLR start "rule__TestDriver__TestOpAssignment_3_2"
    // InternalMappingAssistance.g:4036:1: rule__TestDriver__TestOpAssignment_3_2 : ( ruleTestOP ) ;
    public final void rule__TestDriver__TestOpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4040:1: ( ( ruleTestOP ) )
            // InternalMappingAssistance.g:4041:2: ( ruleTestOP )
            {
            // InternalMappingAssistance.g:4041:2: ( ruleTestOP )
            // InternalMappingAssistance.g:4042:3: ruleTestOP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestDriverAccess().getTestOpTestOPParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTestOP();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestDriverAccess().getTestOpTestOPParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestDriver__TestOpAssignment_3_2"


    // $ANTLR start "rule__Observer__Service1Assignment_1"
    // InternalMappingAssistance.g:4051:1: rule__Observer__Service1Assignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__Service1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4055:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4056:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4056:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4057:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getService1VariableCrossReference_1_0()); 
            }
            // InternalMappingAssistance.g:4058:3: ( RULE_ID )
            // InternalMappingAssistance.g:4059:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getService1VariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getService1VariableIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getService1VariableCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Service1Assignment_1"


    // $ANTLR start "rule__Observer__Member1Assignment_3"
    // InternalMappingAssistance.g:4070:1: rule__Observer__Member1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__Member1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4074:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4075:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4075:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4076:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getMember1OperationCrossReference_3_0()); 
            }
            // InternalMappingAssistance.g:4077:3: ( RULE_ID )
            // InternalMappingAssistance.g:4078:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getMember1OperationIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getMember1OperationIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getMember1OperationCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Member1Assignment_3"


    // $ANTLR start "rule__Observer__InstVarAssignment_5_0_0"
    // InternalMappingAssistance.g:4089:1: rule__Observer__InstVarAssignment_5_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__InstVarAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4093:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4094:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4094:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4095:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getInstVarVariableCrossReference_5_0_0_0()); 
            }
            // InternalMappingAssistance.g:4096:3: ( RULE_ID )
            // InternalMappingAssistance.g:4097:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getInstVarVariableIDTerminalRuleCall_5_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getInstVarVariableIDTerminalRuleCall_5_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getInstVarVariableCrossReference_5_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__InstVarAssignment_5_0_0"


    // $ANTLR start "rule__Observer__VarOpAssignment_5_0_2"
    // InternalMappingAssistance.g:4108:1: rule__Observer__VarOpAssignment_5_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__VarOpAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4112:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4113:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4113:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4114:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getVarOpVariableCrossReference_5_0_2_0()); 
            }
            // InternalMappingAssistance.g:4115:3: ( RULE_ID )
            // InternalMappingAssistance.g:4116:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getVarOpVariableIDTerminalRuleCall_5_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getVarOpVariableIDTerminalRuleCall_5_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getVarOpVariableCrossReference_5_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__VarOpAssignment_5_0_2"


    // $ANTLR start "rule__Observer__InstVarAssignment_5_1_0"
    // InternalMappingAssistance.g:4127:1: rule__Observer__InstVarAssignment_5_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__InstVarAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4131:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4132:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4132:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4133:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getInstVarVariableCrossReference_5_1_0_0()); 
            }
            // InternalMappingAssistance.g:4134:3: ( RULE_ID )
            // InternalMappingAssistance.g:4135:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getInstVarVariableIDTerminalRuleCall_5_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getInstVarVariableIDTerminalRuleCall_5_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getInstVarVariableCrossReference_5_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__InstVarAssignment_5_1_0"


    // $ANTLR start "rule__Observer__VarOpAssignment_5_1_2"
    // InternalMappingAssistance.g:4146:1: rule__Observer__VarOpAssignment_5_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__VarOpAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4150:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4151:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4151:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4152:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getVarOpVariableCrossReference_5_1_2_0()); 
            }
            // InternalMappingAssistance.g:4153:3: ( RULE_ID )
            // InternalMappingAssistance.g:4154:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getVarOpVariableIDTerminalRuleCall_5_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getVarOpVariableIDTerminalRuleCall_5_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getVarOpVariableCrossReference_5_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__VarOpAssignment_5_1_2"


    // $ANTLR start "rule__Observer__Service2Assignment_8"
    // InternalMappingAssistance.g:4165:1: rule__Observer__Service2Assignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__Service2Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4169:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4170:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4170:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4171:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getService2VariableCrossReference_8_0()); 
            }
            // InternalMappingAssistance.g:4172:3: ( RULE_ID )
            // InternalMappingAssistance.g:4173:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getService2VariableIDTerminalRuleCall_8_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getService2VariableIDTerminalRuleCall_8_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getService2VariableCrossReference_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Service2Assignment_8"


    // $ANTLR start "rule__Observer__Member2Assignment_10"
    // InternalMappingAssistance.g:4184:1: rule__Observer__Member2Assignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Observer__Member2Assignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4188:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4189:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4189:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4190:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getMember2OperationCrossReference_10_0()); 
            }
            // InternalMappingAssistance.g:4191:3: ( RULE_ID )
            // InternalMappingAssistance.g:4192:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getObserverAccess().getMember2OperationIDTerminalRuleCall_10_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getMember2OperationIDTerminalRuleCall_10_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getObserverAccess().getMember2OperationCrossReference_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Member2Assignment_10"


    // $ANTLR start "rule__Mock__ServiceAssignment_1"
    // InternalMappingAssistance.g:4203:1: rule__Mock__ServiceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mock__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4207:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4208:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4208:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4209:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getServiceVariableCrossReference_1_0()); 
            }
            // InternalMappingAssistance.g:4210:3: ( RULE_ID )
            // InternalMappingAssistance.g:4211:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getServiceVariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getServiceVariableIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getServiceVariableCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__ServiceAssignment_1"


    // $ANTLR start "rule__Mock__MemberAssignment_3"
    // InternalMappingAssistance.g:4222:1: rule__Mock__MemberAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Mock__MemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4226:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4227:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4227:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4228:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getMemberOperationCrossReference_3_0()); 
            }
            // InternalMappingAssistance.g:4229:3: ( RULE_ID )
            // InternalMappingAssistance.g:4230:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getMemberOperationIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getMemberOperationIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getMemberOperationCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__MemberAssignment_3"


    // $ANTLR start "rule__Mock__IntentionVarAssignment_5"
    // InternalMappingAssistance.g:4241:1: rule__Mock__IntentionVarAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Mock__IntentionVarAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4245:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4246:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4246:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4247:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getIntentionVarVariableCrossReference_5_0()); 
            }
            // InternalMappingAssistance.g:4248:3: ( RULE_ID )
            // InternalMappingAssistance.g:4249:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMockAccess().getIntentionVarVariableIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getIntentionVarVariableIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMockAccess().getIntentionVarVariableCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mock__IntentionVarAssignment_5"


    // $ANTLR start "rule__Conf__ServiceAssignment_1"
    // InternalMappingAssistance.g:4260:1: rule__Conf__ServiceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Conf__ServiceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4264:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4265:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4265:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4266:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getServiceVariableCrossReference_1_0()); 
            }
            // InternalMappingAssistance.g:4267:3: ( RULE_ID )
            // InternalMappingAssistance.g:4268:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getServiceVariableIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getServiceVariableIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getServiceVariableCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__ServiceAssignment_1"


    // $ANTLR start "rule__Conf__MemberAssignment_3"
    // InternalMappingAssistance.g:4279:1: rule__Conf__MemberAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Conf__MemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4283:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4284:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4284:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4285:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getMemberOperationCrossReference_3_0()); 
            }
            // InternalMappingAssistance.g:4286:3: ( RULE_ID )
            // InternalMappingAssistance.g:4287:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getMemberOperationIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getMemberOperationIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getMemberOperationCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__MemberAssignment_3"


    // $ANTLR start "rule__Conf__VarConfAssignment_5_0_0"
    // InternalMappingAssistance.g:4298:1: rule__Conf__VarConfAssignment_5_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Conf__VarConfAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4302:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4303:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4303:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4304:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getVarConfVariableCrossReference_5_0_0_0()); 
            }
            // InternalMappingAssistance.g:4305:3: ( RULE_ID )
            // InternalMappingAssistance.g:4306:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getVarConfVariableIDTerminalRuleCall_5_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getVarConfVariableIDTerminalRuleCall_5_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getVarConfVariableCrossReference_5_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__VarConfAssignment_5_0_0"


    // $ANTLR start "rule__Conf__InstVarAssignment_5_0_2"
    // InternalMappingAssistance.g:4317:1: rule__Conf__InstVarAssignment_5_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__Conf__InstVarAssignment_5_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4321:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4322:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4322:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4323:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getInstVarVariableCrossReference_5_0_2_0()); 
            }
            // InternalMappingAssistance.g:4324:3: ( RULE_ID )
            // InternalMappingAssistance.g:4325:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getInstVarVariableIDTerminalRuleCall_5_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getInstVarVariableIDTerminalRuleCall_5_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getInstVarVariableCrossReference_5_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__InstVarAssignment_5_0_2"


    // $ANTLR start "rule__Conf__VarConfAssignment_5_1_0"
    // InternalMappingAssistance.g:4336:1: rule__Conf__VarConfAssignment_5_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Conf__VarConfAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4340:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4341:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4341:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4342:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getVarConfVariableCrossReference_5_1_0_0()); 
            }
            // InternalMappingAssistance.g:4343:3: ( RULE_ID )
            // InternalMappingAssistance.g:4344:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getVarConfVariableIDTerminalRuleCall_5_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getVarConfVariableIDTerminalRuleCall_5_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getVarConfVariableCrossReference_5_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__VarConfAssignment_5_1_0"


    // $ANTLR start "rule__Conf__InstVarAssignment_5_1_2"
    // InternalMappingAssistance.g:4355:1: rule__Conf__InstVarAssignment_5_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Conf__InstVarAssignment_5_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4359:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4360:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4360:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4361:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getInstVarVariableCrossReference_5_1_2_0()); 
            }
            // InternalMappingAssistance.g:4362:3: ( RULE_ID )
            // InternalMappingAssistance.g:4363:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConfAccess().getInstVarVariableIDTerminalRuleCall_5_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getInstVarVariableIDTerminalRuleCall_5_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConfAccess().getInstVarVariableCrossReference_5_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conf__InstVarAssignment_5_1_2"


    // $ANTLR start "rule__Comopnent__NameAssignment_1"
    // InternalMappingAssistance.g:4374:1: rule__Comopnent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Comopnent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4378:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4379:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:4379:2: ( RULE_ID )
            // InternalMappingAssistance.g:4380:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__NameAssignment_1"


    // $ANTLR start "rule__Comopnent__OpsAssignment_5_0_0"
    // InternalMappingAssistance.g:4389:1: rule__Comopnent__OpsAssignment_5_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Comopnent__OpsAssignment_5_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4393:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4394:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4394:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4395:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOpsOperationCrossReference_5_0_0_0()); 
            }
            // InternalMappingAssistance.g:4396:3: ( RULE_ID )
            // InternalMappingAssistance.g:4397:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOpsOperationIDTerminalRuleCall_5_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOpsOperationIDTerminalRuleCall_5_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOpsOperationCrossReference_5_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__OpsAssignment_5_0_0"


    // $ANTLR start "rule__Comopnent__OpsAssignment_5_1"
    // InternalMappingAssistance.g:4408:1: rule__Comopnent__OpsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Comopnent__OpsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4412:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4413:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4413:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4414:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOpsOperationCrossReference_5_1_0()); 
            }
            // InternalMappingAssistance.g:4415:3: ( RULE_ID )
            // InternalMappingAssistance.g:4416:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOpsOperationIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOpsOperationIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOpsOperationCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__OpsAssignment_5_1"


    // $ANTLR start "rule__Comopnent__OperationsAssignment_7_0"
    // InternalMappingAssistance.g:4427:1: rule__Comopnent__OperationsAssignment_7_0 : ( ruleOperation ) ;
    public final void rule__Comopnent__OperationsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4431:1: ( ( ruleOperation ) )
            // InternalMappingAssistance.g:4432:2: ( ruleOperation )
            {
            // InternalMappingAssistance.g:4432:2: ( ruleOperation )
            // InternalMappingAssistance.g:4433:3: ruleOperation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComopnentAccess().getOperationsOperationParserRuleCall_7_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComopnentAccess().getOperationsOperationParserRuleCall_7_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comopnent__OperationsAssignment_7_0"


    // $ANTLR start "rule__TestOP__ServiceAssignment_0"
    // InternalMappingAssistance.g:4442:1: rule__TestOP__ServiceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TestOP__ServiceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4446:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4447:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4447:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4448:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getServiceVariableCrossReference_0_0()); 
            }
            // InternalMappingAssistance.g:4449:3: ( RULE_ID )
            // InternalMappingAssistance.g:4450:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getServiceVariableIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getServiceVariableIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getServiceVariableCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__ServiceAssignment_0"


    // $ANTLR start "rule__TestOP__NameAssignment_2"
    // InternalMappingAssistance.g:4461:1: rule__TestOP__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TestOP__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4465:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4466:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4466:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4467:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getNameOperationCrossReference_2_0()); 
            }
            // InternalMappingAssistance.g:4468:3: ( RULE_ID )
            // InternalMappingAssistance.g:4469:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getNameOperationIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getNameOperationIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getNameOperationCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__NameAssignment_2"


    // $ANTLR start "rule__TestOP__VarConfAssignment_4_0_0"
    // InternalMappingAssistance.g:4480:1: rule__TestOP__VarConfAssignment_4_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__TestOP__VarConfAssignment_4_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4484:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4485:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4485:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4486:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getVarConfVariableCrossReference_4_0_0_0()); 
            }
            // InternalMappingAssistance.g:4487:3: ( RULE_ID )
            // InternalMappingAssistance.g:4488:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getVarConfVariableIDTerminalRuleCall_4_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getVarConfVariableIDTerminalRuleCall_4_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getVarConfVariableCrossReference_4_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__VarConfAssignment_4_0_0"


    // $ANTLR start "rule__TestOP__InstVarAssignment_4_0_2"
    // InternalMappingAssistance.g:4499:1: rule__TestOP__InstVarAssignment_4_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__TestOP__InstVarAssignment_4_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4503:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4504:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4504:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4505:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getInstVarVariableCrossReference_4_0_2_0()); 
            }
            // InternalMappingAssistance.g:4506:3: ( RULE_ID )
            // InternalMappingAssistance.g:4507:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getInstVarVariableIDTerminalRuleCall_4_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getInstVarVariableIDTerminalRuleCall_4_0_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getInstVarVariableCrossReference_4_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__InstVarAssignment_4_0_2"


    // $ANTLR start "rule__TestOP__VarConfAssignment_4_1_0"
    // InternalMappingAssistance.g:4518:1: rule__TestOP__VarConfAssignment_4_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__TestOP__VarConfAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4522:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4523:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4523:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4524:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getVarConfVariableCrossReference_4_1_0_0()); 
            }
            // InternalMappingAssistance.g:4525:3: ( RULE_ID )
            // InternalMappingAssistance.g:4526:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getVarConfVariableIDTerminalRuleCall_4_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getVarConfVariableIDTerminalRuleCall_4_1_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getVarConfVariableCrossReference_4_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__VarConfAssignment_4_1_0"


    // $ANTLR start "rule__TestOP__InstVarAssignment_4_1_2"
    // InternalMappingAssistance.g:4537:1: rule__TestOP__InstVarAssignment_4_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__TestOP__InstVarAssignment_4_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4541:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4542:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4542:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4543:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getInstVarVariableCrossReference_4_1_2_0()); 
            }
            // InternalMappingAssistance.g:4544:3: ( RULE_ID )
            // InternalMappingAssistance.g:4545:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTestOPAccess().getInstVarVariableIDTerminalRuleCall_4_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getInstVarVariableIDTerminalRuleCall_4_1_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTestOPAccess().getInstVarVariableCrossReference_4_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestOP__InstVarAssignment_4_1_2"


    // $ANTLR start "rule__Operation__NameAssignment_1"
    // InternalMappingAssistance.g:4556:1: rule__Operation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Operation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4560:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4561:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:4561:2: ( RULE_ID )
            // InternalMappingAssistance.g:4562:3: RULE_ID
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
    // InternalMappingAssistance.g:4571:1: rule__Operation__ArgAssignment_3_0_0 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4575:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:4576:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:4576:2: ( ruleVariable )
            // InternalMappingAssistance.g:4577:3: ruleVariable
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
    // InternalMappingAssistance.g:4586:1: rule__Operation__ArgAssignment_3_1 : ( ruleVariable ) ;
    public final void rule__Operation__ArgAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4590:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:4591:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:4591:2: ( ruleVariable )
            // InternalMappingAssistance.g:4592:3: ruleVariable
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
    // InternalMappingAssistance.g:4601:1: rule__Operation__TypeAssignment_6 : ( ruleType ) ;
    public final void rule__Operation__TypeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4605:1: ( ( ruleType ) )
            // InternalMappingAssistance.g:4606:2: ( ruleType )
            {
            // InternalMappingAssistance.g:4606:2: ( ruleType )
            // InternalMappingAssistance.g:4607:3: ruleType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationAccess().getTypeTypeEnumRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationAccess().getTypeTypeEnumRuleCall_6_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalMappingAssistance.g:4616:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4620:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4621:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:4621:2: ( RULE_ID )
            // InternalMappingAssistance.g:4622:3: RULE_ID
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
    // InternalMappingAssistance.g:4631:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4635:1: ( ( ruleType ) )
            // InternalMappingAssistance.g:4636:2: ( ruleType )
            {
            // InternalMappingAssistance.g:4636:2: ( ruleType )
            // InternalMappingAssistance.g:4637:3: ruleType
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


    // $ANTLR start "rule__Bindings__NameCompAssignment_1"
    // InternalMappingAssistance.g:4646:1: rule__Bindings__NameCompAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameCompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4650:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4651:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4651:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4652:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0()); 
            }
            // InternalMappingAssistance.g:4653:3: ( RULE_ID )
            // InternalMappingAssistance.g:4654:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameCompInstanceCompIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameCompInstanceCompIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bindings__NameCompAssignment_1"


    // $ANTLR start "rule__Bindings__NameServ1Assignment_3"
    // InternalMappingAssistance.g:4665:1: rule__Bindings__NameServ1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4669:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4670:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4670:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4671:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1OperationCrossReference_3_0()); 
            }
            // InternalMappingAssistance.g:4672:3: ( RULE_ID )
            // InternalMappingAssistance.g:4673:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ1OperationIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ1OperationIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ1OperationCrossReference_3_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Bindings__NameComp1Assignment_5"
    // InternalMappingAssistance.g:4684:1: rule__Bindings__NameComp1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameComp1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4688:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4689:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4689:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4690:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1VariableCrossReference_5_0()); 
            }
            // InternalMappingAssistance.g:4691:3: ( RULE_ID )
            // InternalMappingAssistance.g:4692:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameComp1VariableIDTerminalRuleCall_5_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp1VariableIDTerminalRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameComp1VariableCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bindings__NameComp1Assignment_5"


    // $ANTLR start "rule__Bindings__NameServ2Assignment_7"
    // InternalMappingAssistance.g:4703:1: rule__Bindings__NameServ2Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ2Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4707:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4708:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4708:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4709:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2OperationCrossReference_7_0()); 
            }
            // InternalMappingAssistance.g:4710:3: ( RULE_ID )
            // InternalMappingAssistance.g:4711:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBindingsAccess().getNameServ2OperationIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ2OperationIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBindingsAccess().getNameServ2OperationCrossReference_7_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__InstanceComp__NameAssignment_1"
    // InternalMappingAssistance.g:4722:1: rule__InstanceComp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InstanceComp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4726:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4727:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:4727:2: ( RULE_ID )
            // InternalMappingAssistance.g:4728:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__NameAssignment_1"


    // $ANTLR start "rule__InstanceComp__TypeAssignment_3"
    // InternalMappingAssistance.g:4737:1: rule__InstanceComp__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__InstanceComp__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:4741:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:4742:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:4742:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:4743:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getTypeComopnentCrossReference_3_0()); 
            }
            // InternalMappingAssistance.g:4744:3: ( RULE_ID )
            // InternalMappingAssistance.g:4745:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInstanceCompAccess().getTypeComopnentIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getTypeComopnentIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInstanceCompAccess().getTypeComopnentCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InstanceComp__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000571000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000571000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});

}