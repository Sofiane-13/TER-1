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

@SuppressWarnings("all")
public class InternalMappingAssistanceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'import'", "'.*'", "'.'", "'addMock('", "','", "')'", "'addObserveur('"
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
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
    // InternalMappingAssistance.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:54:1: ( ruleModel EOF )
            // InternalMappingAssistance.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:62:1: ruleModel : ( ( rule__Model__FunctionAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:66:2: ( ( ( rule__Model__FunctionAssignment )* ) )
            // InternalMappingAssistance.g:67:2: ( ( rule__Model__FunctionAssignment )* )
            {
            // InternalMappingAssistance.g:67:2: ( ( rule__Model__FunctionAssignment )* )
            // InternalMappingAssistance.g:68:3: ( rule__Model__FunctionAssignment )*
            {
             before(grammarAccess.getModelAccess().getFunctionAssignment()); 
            // InternalMappingAssistance.g:69:3: ( rule__Model__FunctionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMappingAssistance.g:69:4: rule__Model__FunctionAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__FunctionAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getFunctionAssignment()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:78:1: entryRuleAbstractModel : ruleAbstractModel EOF ;
    public final void entryRuleAbstractModel() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:79:1: ( ruleAbstractModel EOF )
            // InternalMappingAssistance.g:80:1: ruleAbstractModel EOF
            {
             before(grammarAccess.getAbstractModelRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractModel();

            state._fsp--;

             after(grammarAccess.getAbstractModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:87:1: ruleAbstractModel : ( ( rule__AbstractModel__Group__0 ) ) ;
    public final void ruleAbstractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:91:2: ( ( ( rule__AbstractModel__Group__0 ) ) )
            // InternalMappingAssistance.g:92:2: ( ( rule__AbstractModel__Group__0 ) )
            {
            // InternalMappingAssistance.g:92:2: ( ( rule__AbstractModel__Group__0 ) )
            // InternalMappingAssistance.g:93:3: ( rule__AbstractModel__Group__0 )
            {
             before(grammarAccess.getAbstractModelAccess().getGroup()); 
            // InternalMappingAssistance.g:94:3: ( rule__AbstractModel__Group__0 )
            // InternalMappingAssistance.g:94:4: rule__AbstractModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbstractModelAccess().getGroup()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:104:1: ( ruleImport EOF )
            // InternalMappingAssistance.g:105:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMappingAssistance.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMappingAssistance.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalMappingAssistance.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalMappingAssistance.g:119:3: ( rule__Import__Group__0 )
            // InternalMappingAssistance.g:119:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMappingAssistance.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMappingAssistance.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMappingAssistance.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMappingAssistance.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalMappingAssistance.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMappingAssistance.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:154:1: ( ruleQualifiedName EOF )
            // InternalMappingAssistance.g:155:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMappingAssistance.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMappingAssistance.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMappingAssistance.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMappingAssistance.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMappingAssistance.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalMappingAssistance.g:169:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleTestedcomposant"
    // InternalMappingAssistance.g:178:1: entryRuleTestedcomposant : ruleTestedcomposant EOF ;
    public final void entryRuleTestedcomposant() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:179:1: ( ruleTestedcomposant EOF )
            // InternalMappingAssistance.g:180:1: ruleTestedcomposant EOF
            {
             before(grammarAccess.getTestedcomposantRule()); 
            pushFollow(FOLLOW_1);
            ruleTestedcomposant();

            state._fsp--;

             after(grammarAccess.getTestedcomposantRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestedcomposant"


    // $ANTLR start "ruleTestedcomposant"
    // InternalMappingAssistance.g:187:1: ruleTestedcomposant : ( ( rule__Testedcomposant__NameCompAssignment ) ) ;
    public final void ruleTestedcomposant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:191:2: ( ( ( rule__Testedcomposant__NameCompAssignment ) ) )
            // InternalMappingAssistance.g:192:2: ( ( rule__Testedcomposant__NameCompAssignment ) )
            {
            // InternalMappingAssistance.g:192:2: ( ( rule__Testedcomposant__NameCompAssignment ) )
            // InternalMappingAssistance.g:193:3: ( rule__Testedcomposant__NameCompAssignment )
            {
             before(grammarAccess.getTestedcomposantAccess().getNameCompAssignment()); 
            // InternalMappingAssistance.g:194:3: ( rule__Testedcomposant__NameCompAssignment )
            // InternalMappingAssistance.g:194:4: rule__Testedcomposant__NameCompAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Testedcomposant__NameCompAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTestedcomposantAccess().getNameCompAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestedcomposant"


    // $ANTLR start "entryRuleTestedservice"
    // InternalMappingAssistance.g:203:1: entryRuleTestedservice : ruleTestedservice EOF ;
    public final void entryRuleTestedservice() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:204:1: ( ruleTestedservice EOF )
            // InternalMappingAssistance.g:205:1: ruleTestedservice EOF
            {
             before(grammarAccess.getTestedserviceRule()); 
            pushFollow(FOLLOW_1);
            ruleTestedservice();

            state._fsp--;

             after(grammarAccess.getTestedserviceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTestedservice"


    // $ANTLR start "ruleTestedservice"
    // InternalMappingAssistance.g:212:1: ruleTestedservice : ( ( rule__Testedservice__Group__0 ) ) ;
    public final void ruleTestedservice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:216:2: ( ( ( rule__Testedservice__Group__0 ) ) )
            // InternalMappingAssistance.g:217:2: ( ( rule__Testedservice__Group__0 ) )
            {
            // InternalMappingAssistance.g:217:2: ( ( rule__Testedservice__Group__0 ) )
            // InternalMappingAssistance.g:218:3: ( rule__Testedservice__Group__0 )
            {
             before(grammarAccess.getTestedserviceAccess().getGroup()); 
            // InternalMappingAssistance.g:219:3: ( rule__Testedservice__Group__0 )
            // InternalMappingAssistance.g:219:4: rule__Testedservice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Testedservice__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestedserviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestedservice"


    // $ANTLR start "entryRuleMocks"
    // InternalMappingAssistance.g:228:1: entryRuleMocks : ruleMocks EOF ;
    public final void entryRuleMocks() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:229:1: ( ruleMocks EOF )
            // InternalMappingAssistance.g:230:1: ruleMocks EOF
            {
             before(grammarAccess.getMocksRule()); 
            pushFollow(FOLLOW_1);
            ruleMocks();

            state._fsp--;

             after(grammarAccess.getMocksRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMocks"


    // $ANTLR start "ruleMocks"
    // InternalMappingAssistance.g:237:1: ruleMocks : ( ( rule__Mocks__Group__0 ) ) ;
    public final void ruleMocks() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:241:2: ( ( ( rule__Mocks__Group__0 ) ) )
            // InternalMappingAssistance.g:242:2: ( ( rule__Mocks__Group__0 ) )
            {
            // InternalMappingAssistance.g:242:2: ( ( rule__Mocks__Group__0 ) )
            // InternalMappingAssistance.g:243:3: ( rule__Mocks__Group__0 )
            {
             before(grammarAccess.getMocksAccess().getGroup()); 
            // InternalMappingAssistance.g:244:3: ( rule__Mocks__Group__0 )
            // InternalMappingAssistance.g:244:4: rule__Mocks__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mocks__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMocksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMocks"


    // $ANTLR start "entryRuleObserveurs"
    // InternalMappingAssistance.g:253:1: entryRuleObserveurs : ruleObserveurs EOF ;
    public final void entryRuleObserveurs() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:254:1: ( ruleObserveurs EOF )
            // InternalMappingAssistance.g:255:1: ruleObserveurs EOF
            {
             before(grammarAccess.getObserveursRule()); 
            pushFollow(FOLLOW_1);
            ruleObserveurs();

            state._fsp--;

             after(grammarAccess.getObserveursRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleObserveurs"


    // $ANTLR start "ruleObserveurs"
    // InternalMappingAssistance.g:262:1: ruleObserveurs : ( ( rule__Observeurs__Group__0 ) ) ;
    public final void ruleObserveurs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:266:2: ( ( ( rule__Observeurs__Group__0 ) ) )
            // InternalMappingAssistance.g:267:2: ( ( rule__Observeurs__Group__0 ) )
            {
            // InternalMappingAssistance.g:267:2: ( ( rule__Observeurs__Group__0 ) )
            // InternalMappingAssistance.g:268:3: ( rule__Observeurs__Group__0 )
            {
             before(grammarAccess.getObserveursAccess().getGroup()); 
            // InternalMappingAssistance.g:269:3: ( rule__Observeurs__Group__0 )
            // InternalMappingAssistance.g:269:4: rule__Observeurs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObserveursAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObserveurs"


    // $ANTLR start "ruleType"
    // InternalMappingAssistance.g:278:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:282:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMappingAssistance.g:283:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMappingAssistance.g:283:2: ( ( rule__Type__Alternatives ) )
            // InternalMappingAssistance.g:284:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMappingAssistance.g:285:3: ( rule__Type__Alternatives )
            // InternalMappingAssistance.g:285:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:293:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:297:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMappingAssistance.g:298:2: ( ( 'INT' ) )
                    {
                    // InternalMappingAssistance.g:298:2: ( ( 'INT' ) )
                    // InternalMappingAssistance.g:299:3: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalMappingAssistance.g:300:3: ( 'INT' )
                    // InternalMappingAssistance.g:300:4: 'INT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:304:2: ( ( 'STRING' ) )
                    {
                    // InternalMappingAssistance.g:304:2: ( ( 'STRING' ) )
                    // InternalMappingAssistance.g:305:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalMappingAssistance.g:306:3: ( 'STRING' )
                    // InternalMappingAssistance.g:306:4: 'STRING'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:310:2: ( ( 'Boolean' ) )
                    {
                    // InternalMappingAssistance.g:310:2: ( ( 'Boolean' ) )
                    // InternalMappingAssistance.g:311:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMappingAssistance.g:312:3: ( 'Boolean' )
                    // InternalMappingAssistance.g:312:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:316:2: ( ( 'Double' ) )
                    {
                    // InternalMappingAssistance.g:316:2: ( ( 'Double' ) )
                    // InternalMappingAssistance.g:317:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalMappingAssistance.g:318:3: ( 'Double' )
                    // InternalMappingAssistance.g:318:4: 'Double'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 

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
    // InternalMappingAssistance.g:326:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:330:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalMappingAssistance.g:331:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__AbstractModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:338:1: rule__AbstractModel__Group__0__Impl : ( ruleImport ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:342:1: ( ( ruleImport ) )
            // InternalMappingAssistance.g:343:1: ( ruleImport )
            {
            // InternalMappingAssistance.g:343:1: ( ruleImport )
            // InternalMappingAssistance.g:344:2: ruleImport
            {
             before(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:353:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl rule__AbstractModel__Group__2 ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:357:1: ( rule__AbstractModel__Group__1__Impl rule__AbstractModel__Group__2 )
            // InternalMappingAssistance.g:358:2: rule__AbstractModel__Group__1__Impl rule__AbstractModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AbstractModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__2();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:365:1: rule__AbstractModel__Group__1__Impl : ( ( rule__AbstractModel__ObsAssignment_1 )* ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:369:1: ( ( ( rule__AbstractModel__ObsAssignment_1 )* ) )
            // InternalMappingAssistance.g:370:1: ( ( rule__AbstractModel__ObsAssignment_1 )* )
            {
            // InternalMappingAssistance.g:370:1: ( ( rule__AbstractModel__ObsAssignment_1 )* )
            // InternalMappingAssistance.g:371:2: ( rule__AbstractModel__ObsAssignment_1 )*
            {
             before(grammarAccess.getAbstractModelAccess().getObsAssignment_1()); 
            // InternalMappingAssistance.g:372:2: ( rule__AbstractModel__ObsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMappingAssistance.g:372:3: rule__AbstractModel__ObsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AbstractModel__ObsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getAbstractModelAccess().getObsAssignment_1()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:380:1: rule__AbstractModel__Group__2 : rule__AbstractModel__Group__2__Impl rule__AbstractModel__Group__3 ;
    public final void rule__AbstractModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:384:1: ( rule__AbstractModel__Group__2__Impl rule__AbstractModel__Group__3 )
            // InternalMappingAssistance.g:385:2: rule__AbstractModel__Group__2__Impl rule__AbstractModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AbstractModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__3();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:392:1: rule__AbstractModel__Group__2__Impl : ( ( rule__AbstractModel__MockAssignment_2 )* ) ;
    public final void rule__AbstractModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:396:1: ( ( ( rule__AbstractModel__MockAssignment_2 )* ) )
            // InternalMappingAssistance.g:397:1: ( ( rule__AbstractModel__MockAssignment_2 )* )
            {
            // InternalMappingAssistance.g:397:1: ( ( rule__AbstractModel__MockAssignment_2 )* )
            // InternalMappingAssistance.g:398:2: ( rule__AbstractModel__MockAssignment_2 )*
            {
             before(grammarAccess.getAbstractModelAccess().getMockAssignment_2()); 
            // InternalMappingAssistance.g:399:2: ( rule__AbstractModel__MockAssignment_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMappingAssistance.g:399:3: rule__AbstractModel__MockAssignment_2
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AbstractModel__MockAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAbstractModelAccess().getMockAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__AbstractModel__Group__3"
    // InternalMappingAssistance.g:407:1: rule__AbstractModel__Group__3 : rule__AbstractModel__Group__3__Impl rule__AbstractModel__Group__4 ;
    public final void rule__AbstractModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:411:1: ( rule__AbstractModel__Group__3__Impl rule__AbstractModel__Group__4 )
            // InternalMappingAssistance.g:412:2: rule__AbstractModel__Group__3__Impl rule__AbstractModel__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__AbstractModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__3"


    // $ANTLR start "rule__AbstractModel__Group__3__Impl"
    // InternalMappingAssistance.g:419:1: rule__AbstractModel__Group__3__Impl : ( ( ( rule__AbstractModel__TestedservAssignment_3 ) ) ( ( rule__AbstractModel__TestedservAssignment_3 )* ) ) ;
    public final void rule__AbstractModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:423:1: ( ( ( ( rule__AbstractModel__TestedservAssignment_3 ) ) ( ( rule__AbstractModel__TestedservAssignment_3 )* ) ) )
            // InternalMappingAssistance.g:424:1: ( ( ( rule__AbstractModel__TestedservAssignment_3 ) ) ( ( rule__AbstractModel__TestedservAssignment_3 )* ) )
            {
            // InternalMappingAssistance.g:424:1: ( ( ( rule__AbstractModel__TestedservAssignment_3 ) ) ( ( rule__AbstractModel__TestedservAssignment_3 )* ) )
            // InternalMappingAssistance.g:425:2: ( ( rule__AbstractModel__TestedservAssignment_3 ) ) ( ( rule__AbstractModel__TestedservAssignment_3 )* )
            {
            // InternalMappingAssistance.g:425:2: ( ( rule__AbstractModel__TestedservAssignment_3 ) )
            // InternalMappingAssistance.g:426:3: ( rule__AbstractModel__TestedservAssignment_3 )
            {
             before(grammarAccess.getAbstractModelAccess().getTestedservAssignment_3()); 
            // InternalMappingAssistance.g:427:3: ( rule__AbstractModel__TestedservAssignment_3 )
            // InternalMappingAssistance.g:427:4: rule__AbstractModel__TestedservAssignment_3
            {
            pushFollow(FOLLOW_8);
            rule__AbstractModel__TestedservAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAbstractModelAccess().getTestedservAssignment_3()); 

            }

            // InternalMappingAssistance.g:430:2: ( ( rule__AbstractModel__TestedservAssignment_3 )* )
            // InternalMappingAssistance.g:431:3: ( rule__AbstractModel__TestedservAssignment_3 )*
            {
             before(grammarAccess.getAbstractModelAccess().getTestedservAssignment_3()); 
            // InternalMappingAssistance.g:432:3: ( rule__AbstractModel__TestedservAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==17) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalMappingAssistance.g:432:4: rule__AbstractModel__TestedservAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__AbstractModel__TestedservAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAbstractModelAccess().getTestedservAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__3__Impl"


    // $ANTLR start "rule__AbstractModel__Group__4"
    // InternalMappingAssistance.g:441:1: rule__AbstractModel__Group__4 : rule__AbstractModel__Group__4__Impl ;
    public final void rule__AbstractModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:445:1: ( rule__AbstractModel__Group__4__Impl )
            // InternalMappingAssistance.g:446:2: rule__AbstractModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__4"


    // $ANTLR start "rule__AbstractModel__Group__4__Impl"
    // InternalMappingAssistance.g:452:1: rule__AbstractModel__Group__4__Impl : ( ( rule__AbstractModel__TestedcompAssignment_4 ) ) ;
    public final void rule__AbstractModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:456:1: ( ( ( rule__AbstractModel__TestedcompAssignment_4 ) ) )
            // InternalMappingAssistance.g:457:1: ( ( rule__AbstractModel__TestedcompAssignment_4 ) )
            {
            // InternalMappingAssistance.g:457:1: ( ( rule__AbstractModel__TestedcompAssignment_4 ) )
            // InternalMappingAssistance.g:458:2: ( rule__AbstractModel__TestedcompAssignment_4 )
            {
             before(grammarAccess.getAbstractModelAccess().getTestedcompAssignment_4()); 
            // InternalMappingAssistance.g:459:2: ( rule__AbstractModel__TestedcompAssignment_4 )
            // InternalMappingAssistance.g:459:3: rule__AbstractModel__TestedcompAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__TestedcompAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAbstractModelAccess().getTestedcompAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMappingAssistance.g:468:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:472:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMappingAssistance.g:473:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:480:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:484:1: ( ( 'import' ) )
            // InternalMappingAssistance.g:485:1: ( 'import' )
            {
            // InternalMappingAssistance.g:485:1: ( 'import' )
            // InternalMappingAssistance.g:486:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:495:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:499:1: ( rule__Import__Group__1__Impl )
            // InternalMappingAssistance.g:500:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:506:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:510:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMappingAssistance.g:511:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMappingAssistance.g:511:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMappingAssistance.g:512:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMappingAssistance.g:513:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMappingAssistance.g:513:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:522:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:526:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMappingAssistance.g:527:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:534:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:538:1: ( ( ruleQualifiedName ) )
            // InternalMappingAssistance.g:539:1: ( ruleQualifiedName )
            {
            // InternalMappingAssistance.g:539:1: ( ruleQualifiedName )
            // InternalMappingAssistance.g:540:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:549:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:553:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMappingAssistance.g:554:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:560:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:564:1: ( ( ( '.*' )? ) )
            // InternalMappingAssistance.g:565:1: ( ( '.*' )? )
            {
            // InternalMappingAssistance.g:565:1: ( ( '.*' )? )
            // InternalMappingAssistance.g:566:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalMappingAssistance.g:567:2: ( '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMappingAssistance.g:567:3: '.*'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:576:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:580:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMappingAssistance.g:581:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:588:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:592:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:593:1: ( RULE_ID )
            {
            // InternalMappingAssistance.g:593:1: ( RULE_ID )
            // InternalMappingAssistance.g:594:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:603:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:607:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMappingAssistance.g:608:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:614:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:618:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMappingAssistance.g:619:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMappingAssistance.g:619:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMappingAssistance.g:620:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMappingAssistance.g:621:2: ( rule__QualifiedName__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMappingAssistance.g:621:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:630:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:634:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMappingAssistance.g:635:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:642:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:646:1: ( ( '.' ) )
            // InternalMappingAssistance.g:647:1: ( '.' )
            {
            // InternalMappingAssistance.g:647:1: ( '.' )
            // InternalMappingAssistance.g:648:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:657:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:661:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMappingAssistance.g:662:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:668:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:672:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:673:1: ( RULE_ID )
            {
            // InternalMappingAssistance.g:673:1: ( RULE_ID )
            // InternalMappingAssistance.g:674:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Testedservice__Group__0"
    // InternalMappingAssistance.g:684:1: rule__Testedservice__Group__0 : rule__Testedservice__Group__0__Impl rule__Testedservice__Group__1 ;
    public final void rule__Testedservice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:688:1: ( rule__Testedservice__Group__0__Impl rule__Testedservice__Group__1 )
            // InternalMappingAssistance.g:689:2: rule__Testedservice__Group__0__Impl rule__Testedservice__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Testedservice__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Testedservice__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__Group__0"


    // $ANTLR start "rule__Testedservice__Group__0__Impl"
    // InternalMappingAssistance.g:696:1: rule__Testedservice__Group__0__Impl : ( ( rule__Testedservice__NameCompAssignment_0 ) ) ;
    public final void rule__Testedservice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:700:1: ( ( ( rule__Testedservice__NameCompAssignment_0 ) ) )
            // InternalMappingAssistance.g:701:1: ( ( rule__Testedservice__NameCompAssignment_0 ) )
            {
            // InternalMappingAssistance.g:701:1: ( ( rule__Testedservice__NameCompAssignment_0 ) )
            // InternalMappingAssistance.g:702:2: ( rule__Testedservice__NameCompAssignment_0 )
            {
             before(grammarAccess.getTestedserviceAccess().getNameCompAssignment_0()); 
            // InternalMappingAssistance.g:703:2: ( rule__Testedservice__NameCompAssignment_0 )
            // InternalMappingAssistance.g:703:3: rule__Testedservice__NameCompAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Testedservice__NameCompAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTestedserviceAccess().getNameCompAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__Group__0__Impl"


    // $ANTLR start "rule__Testedservice__Group__1"
    // InternalMappingAssistance.g:711:1: rule__Testedservice__Group__1 : rule__Testedservice__Group__1__Impl rule__Testedservice__Group__2 ;
    public final void rule__Testedservice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:715:1: ( rule__Testedservice__Group__1__Impl rule__Testedservice__Group__2 )
            // InternalMappingAssistance.g:716:2: rule__Testedservice__Group__1__Impl rule__Testedservice__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Testedservice__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Testedservice__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__Group__1"


    // $ANTLR start "rule__Testedservice__Group__1__Impl"
    // InternalMappingAssistance.g:723:1: rule__Testedservice__Group__1__Impl : ( '.' ) ;
    public final void rule__Testedservice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:727:1: ( ( '.' ) )
            // InternalMappingAssistance.g:728:1: ( '.' )
            {
            // InternalMappingAssistance.g:728:1: ( '.' )
            // InternalMappingAssistance.g:729:2: '.'
            {
             before(grammarAccess.getTestedserviceAccess().getFullStopKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTestedserviceAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__Group__1__Impl"


    // $ANTLR start "rule__Testedservice__Group__2"
    // InternalMappingAssistance.g:738:1: rule__Testedservice__Group__2 : rule__Testedservice__Group__2__Impl ;
    public final void rule__Testedservice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:742:1: ( rule__Testedservice__Group__2__Impl )
            // InternalMappingAssistance.g:743:2: rule__Testedservice__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Testedservice__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__Group__2"


    // $ANTLR start "rule__Testedservice__Group__2__Impl"
    // InternalMappingAssistance.g:749:1: rule__Testedservice__Group__2__Impl : ( ( rule__Testedservice__NameServ1Assignment_2 ) ) ;
    public final void rule__Testedservice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:753:1: ( ( ( rule__Testedservice__NameServ1Assignment_2 ) ) )
            // InternalMappingAssistance.g:754:1: ( ( rule__Testedservice__NameServ1Assignment_2 ) )
            {
            // InternalMappingAssistance.g:754:1: ( ( rule__Testedservice__NameServ1Assignment_2 ) )
            // InternalMappingAssistance.g:755:2: ( rule__Testedservice__NameServ1Assignment_2 )
            {
             before(grammarAccess.getTestedserviceAccess().getNameServ1Assignment_2()); 
            // InternalMappingAssistance.g:756:2: ( rule__Testedservice__NameServ1Assignment_2 )
            // InternalMappingAssistance.g:756:3: rule__Testedservice__NameServ1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Testedservice__NameServ1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTestedserviceAccess().getNameServ1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__Group__2__Impl"


    // $ANTLR start "rule__Mocks__Group__0"
    // InternalMappingAssistance.g:765:1: rule__Mocks__Group__0 : rule__Mocks__Group__0__Impl rule__Mocks__Group__1 ;
    public final void rule__Mocks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:769:1: ( rule__Mocks__Group__0__Impl rule__Mocks__Group__1 )
            // InternalMappingAssistance.g:770:2: rule__Mocks__Group__0__Impl rule__Mocks__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Mocks__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mocks__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__0"


    // $ANTLR start "rule__Mocks__Group__0__Impl"
    // InternalMappingAssistance.g:777:1: rule__Mocks__Group__0__Impl : ( 'addMock(' ) ;
    public final void rule__Mocks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:781:1: ( ( 'addMock(' ) )
            // InternalMappingAssistance.g:782:1: ( 'addMock(' )
            {
            // InternalMappingAssistance.g:782:1: ( 'addMock(' )
            // InternalMappingAssistance.g:783:2: 'addMock('
            {
             before(grammarAccess.getMocksAccess().getAddMockKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMocksAccess().getAddMockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__0__Impl"


    // $ANTLR start "rule__Mocks__Group__1"
    // InternalMappingAssistance.g:792:1: rule__Mocks__Group__1 : rule__Mocks__Group__1__Impl rule__Mocks__Group__2 ;
    public final void rule__Mocks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:796:1: ( rule__Mocks__Group__1__Impl rule__Mocks__Group__2 )
            // InternalMappingAssistance.g:797:2: rule__Mocks__Group__1__Impl rule__Mocks__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Mocks__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mocks__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__1"


    // $ANTLR start "rule__Mocks__Group__1__Impl"
    // InternalMappingAssistance.g:804:1: rule__Mocks__Group__1__Impl : ( ( rule__Mocks__MocknameAssignment_1 ) ) ;
    public final void rule__Mocks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:808:1: ( ( ( rule__Mocks__MocknameAssignment_1 ) ) )
            // InternalMappingAssistance.g:809:1: ( ( rule__Mocks__MocknameAssignment_1 ) )
            {
            // InternalMappingAssistance.g:809:1: ( ( rule__Mocks__MocknameAssignment_1 ) )
            // InternalMappingAssistance.g:810:2: ( rule__Mocks__MocknameAssignment_1 )
            {
             before(grammarAccess.getMocksAccess().getMocknameAssignment_1()); 
            // InternalMappingAssistance.g:811:2: ( rule__Mocks__MocknameAssignment_1 )
            // InternalMappingAssistance.g:811:3: rule__Mocks__MocknameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mocks__MocknameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMocksAccess().getMocknameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__1__Impl"


    // $ANTLR start "rule__Mocks__Group__2"
    // InternalMappingAssistance.g:819:1: rule__Mocks__Group__2 : rule__Mocks__Group__2__Impl rule__Mocks__Group__3 ;
    public final void rule__Mocks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:823:1: ( rule__Mocks__Group__2__Impl rule__Mocks__Group__3 )
            // InternalMappingAssistance.g:824:2: rule__Mocks__Group__2__Impl rule__Mocks__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Mocks__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mocks__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__2"


    // $ANTLR start "rule__Mocks__Group__2__Impl"
    // InternalMappingAssistance.g:831:1: rule__Mocks__Group__2__Impl : ( ',' ) ;
    public final void rule__Mocks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:835:1: ( ( ',' ) )
            // InternalMappingAssistance.g:836:1: ( ',' )
            {
            // InternalMappingAssistance.g:836:1: ( ',' )
            // InternalMappingAssistance.g:837:2: ','
            {
             before(grammarAccess.getMocksAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMocksAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__2__Impl"


    // $ANTLR start "rule__Mocks__Group__3"
    // InternalMappingAssistance.g:846:1: rule__Mocks__Group__3 : rule__Mocks__Group__3__Impl rule__Mocks__Group__4 ;
    public final void rule__Mocks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:850:1: ( rule__Mocks__Group__3__Impl rule__Mocks__Group__4 )
            // InternalMappingAssistance.g:851:2: rule__Mocks__Group__3__Impl rule__Mocks__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Mocks__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mocks__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__3"


    // $ANTLR start "rule__Mocks__Group__3__Impl"
    // InternalMappingAssistance.g:858:1: rule__Mocks__Group__3__Impl : ( ( rule__Mocks__NameCompAssignment_3 ) ) ;
    public final void rule__Mocks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:862:1: ( ( ( rule__Mocks__NameCompAssignment_3 ) ) )
            // InternalMappingAssistance.g:863:1: ( ( rule__Mocks__NameCompAssignment_3 ) )
            {
            // InternalMappingAssistance.g:863:1: ( ( rule__Mocks__NameCompAssignment_3 ) )
            // InternalMappingAssistance.g:864:2: ( rule__Mocks__NameCompAssignment_3 )
            {
             before(grammarAccess.getMocksAccess().getNameCompAssignment_3()); 
            // InternalMappingAssistance.g:865:2: ( rule__Mocks__NameCompAssignment_3 )
            // InternalMappingAssistance.g:865:3: rule__Mocks__NameCompAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Mocks__NameCompAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMocksAccess().getNameCompAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__3__Impl"


    // $ANTLR start "rule__Mocks__Group__4"
    // InternalMappingAssistance.g:873:1: rule__Mocks__Group__4 : rule__Mocks__Group__4__Impl rule__Mocks__Group__5 ;
    public final void rule__Mocks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:877:1: ( rule__Mocks__Group__4__Impl rule__Mocks__Group__5 )
            // InternalMappingAssistance.g:878:2: rule__Mocks__Group__4__Impl rule__Mocks__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Mocks__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mocks__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__4"


    // $ANTLR start "rule__Mocks__Group__4__Impl"
    // InternalMappingAssistance.g:885:1: rule__Mocks__Group__4__Impl : ( '.' ) ;
    public final void rule__Mocks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:889:1: ( ( '.' ) )
            // InternalMappingAssistance.g:890:1: ( '.' )
            {
            // InternalMappingAssistance.g:890:1: ( '.' )
            // InternalMappingAssistance.g:891:2: '.'
            {
             before(grammarAccess.getMocksAccess().getFullStopKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMocksAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__4__Impl"


    // $ANTLR start "rule__Mocks__Group__5"
    // InternalMappingAssistance.g:900:1: rule__Mocks__Group__5 : rule__Mocks__Group__5__Impl rule__Mocks__Group__6 ;
    public final void rule__Mocks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:904:1: ( rule__Mocks__Group__5__Impl rule__Mocks__Group__6 )
            // InternalMappingAssistance.g:905:2: rule__Mocks__Group__5__Impl rule__Mocks__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Mocks__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mocks__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__5"


    // $ANTLR start "rule__Mocks__Group__5__Impl"
    // InternalMappingAssistance.g:912:1: rule__Mocks__Group__5__Impl : ( ( rule__Mocks__NameServ1Assignment_5 ) ) ;
    public final void rule__Mocks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:916:1: ( ( ( rule__Mocks__NameServ1Assignment_5 ) ) )
            // InternalMappingAssistance.g:917:1: ( ( rule__Mocks__NameServ1Assignment_5 ) )
            {
            // InternalMappingAssistance.g:917:1: ( ( rule__Mocks__NameServ1Assignment_5 ) )
            // InternalMappingAssistance.g:918:2: ( rule__Mocks__NameServ1Assignment_5 )
            {
             before(grammarAccess.getMocksAccess().getNameServ1Assignment_5()); 
            // InternalMappingAssistance.g:919:2: ( rule__Mocks__NameServ1Assignment_5 )
            // InternalMappingAssistance.g:919:3: rule__Mocks__NameServ1Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Mocks__NameServ1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMocksAccess().getNameServ1Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__5__Impl"


    // $ANTLR start "rule__Mocks__Group__6"
    // InternalMappingAssistance.g:927:1: rule__Mocks__Group__6 : rule__Mocks__Group__6__Impl ;
    public final void rule__Mocks__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:931:1: ( rule__Mocks__Group__6__Impl )
            // InternalMappingAssistance.g:932:2: rule__Mocks__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mocks__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__6"


    // $ANTLR start "rule__Mocks__Group__6__Impl"
    // InternalMappingAssistance.g:938:1: rule__Mocks__Group__6__Impl : ( ')' ) ;
    public final void rule__Mocks__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:942:1: ( ( ')' ) )
            // InternalMappingAssistance.g:943:1: ( ')' )
            {
            // InternalMappingAssistance.g:943:1: ( ')' )
            // InternalMappingAssistance.g:944:2: ')'
            {
             before(grammarAccess.getMocksAccess().getRightParenthesisKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMocksAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__Group__6__Impl"


    // $ANTLR start "rule__Observeurs__Group__0"
    // InternalMappingAssistance.g:954:1: rule__Observeurs__Group__0 : rule__Observeurs__Group__0__Impl rule__Observeurs__Group__1 ;
    public final void rule__Observeurs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:958:1: ( rule__Observeurs__Group__0__Impl rule__Observeurs__Group__1 )
            // InternalMappingAssistance.g:959:2: rule__Observeurs__Group__0__Impl rule__Observeurs__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Observeurs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__0"


    // $ANTLR start "rule__Observeurs__Group__0__Impl"
    // InternalMappingAssistance.g:966:1: rule__Observeurs__Group__0__Impl : ( 'addObserveur(' ) ;
    public final void rule__Observeurs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:970:1: ( ( 'addObserveur(' ) )
            // InternalMappingAssistance.g:971:1: ( 'addObserveur(' )
            {
            // InternalMappingAssistance.g:971:1: ( 'addObserveur(' )
            // InternalMappingAssistance.g:972:2: 'addObserveur('
            {
             before(grammarAccess.getObserveursAccess().getAddObserveurKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getAddObserveurKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__0__Impl"


    // $ANTLR start "rule__Observeurs__Group__1"
    // InternalMappingAssistance.g:981:1: rule__Observeurs__Group__1 : rule__Observeurs__Group__1__Impl rule__Observeurs__Group__2 ;
    public final void rule__Observeurs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:985:1: ( rule__Observeurs__Group__1__Impl rule__Observeurs__Group__2 )
            // InternalMappingAssistance.g:986:2: rule__Observeurs__Group__1__Impl rule__Observeurs__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Observeurs__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__1"


    // $ANTLR start "rule__Observeurs__Group__1__Impl"
    // InternalMappingAssistance.g:993:1: rule__Observeurs__Group__1__Impl : ( ( rule__Observeurs__ObsnameAssignment_1 ) ) ;
    public final void rule__Observeurs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:997:1: ( ( ( rule__Observeurs__ObsnameAssignment_1 ) ) )
            // InternalMappingAssistance.g:998:1: ( ( rule__Observeurs__ObsnameAssignment_1 ) )
            {
            // InternalMappingAssistance.g:998:1: ( ( rule__Observeurs__ObsnameAssignment_1 ) )
            // InternalMappingAssistance.g:999:2: ( rule__Observeurs__ObsnameAssignment_1 )
            {
             before(grammarAccess.getObserveursAccess().getObsnameAssignment_1()); 
            // InternalMappingAssistance.g:1000:2: ( rule__Observeurs__ObsnameAssignment_1 )
            // InternalMappingAssistance.g:1000:3: rule__Observeurs__ObsnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Observeurs__ObsnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObserveursAccess().getObsnameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__1__Impl"


    // $ANTLR start "rule__Observeurs__Group__2"
    // InternalMappingAssistance.g:1008:1: rule__Observeurs__Group__2 : rule__Observeurs__Group__2__Impl rule__Observeurs__Group__3 ;
    public final void rule__Observeurs__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1012:1: ( rule__Observeurs__Group__2__Impl rule__Observeurs__Group__3 )
            // InternalMappingAssistance.g:1013:2: rule__Observeurs__Group__2__Impl rule__Observeurs__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Observeurs__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__2"


    // $ANTLR start "rule__Observeurs__Group__2__Impl"
    // InternalMappingAssistance.g:1020:1: rule__Observeurs__Group__2__Impl : ( ',' ) ;
    public final void rule__Observeurs__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1024:1: ( ( ',' ) )
            // InternalMappingAssistance.g:1025:1: ( ',' )
            {
            // InternalMappingAssistance.g:1025:1: ( ',' )
            // InternalMappingAssistance.g:1026:2: ','
            {
             before(grammarAccess.getObserveursAccess().getCommaKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__2__Impl"


    // $ANTLR start "rule__Observeurs__Group__3"
    // InternalMappingAssistance.g:1035:1: rule__Observeurs__Group__3 : rule__Observeurs__Group__3__Impl rule__Observeurs__Group__4 ;
    public final void rule__Observeurs__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1039:1: ( rule__Observeurs__Group__3__Impl rule__Observeurs__Group__4 )
            // InternalMappingAssistance.g:1040:2: rule__Observeurs__Group__3__Impl rule__Observeurs__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Observeurs__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__3"


    // $ANTLR start "rule__Observeurs__Group__3__Impl"
    // InternalMappingAssistance.g:1047:1: rule__Observeurs__Group__3__Impl : ( ( rule__Observeurs__NameCompAssignment_3 ) ) ;
    public final void rule__Observeurs__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1051:1: ( ( ( rule__Observeurs__NameCompAssignment_3 ) ) )
            // InternalMappingAssistance.g:1052:1: ( ( rule__Observeurs__NameCompAssignment_3 ) )
            {
            // InternalMappingAssistance.g:1052:1: ( ( rule__Observeurs__NameCompAssignment_3 ) )
            // InternalMappingAssistance.g:1053:2: ( rule__Observeurs__NameCompAssignment_3 )
            {
             before(grammarAccess.getObserveursAccess().getNameCompAssignment_3()); 
            // InternalMappingAssistance.g:1054:2: ( rule__Observeurs__NameCompAssignment_3 )
            // InternalMappingAssistance.g:1054:3: rule__Observeurs__NameCompAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Observeurs__NameCompAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObserveursAccess().getNameCompAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__3__Impl"


    // $ANTLR start "rule__Observeurs__Group__4"
    // InternalMappingAssistance.g:1062:1: rule__Observeurs__Group__4 : rule__Observeurs__Group__4__Impl rule__Observeurs__Group__5 ;
    public final void rule__Observeurs__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1066:1: ( rule__Observeurs__Group__4__Impl rule__Observeurs__Group__5 )
            // InternalMappingAssistance.g:1067:2: rule__Observeurs__Group__4__Impl rule__Observeurs__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Observeurs__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__4"


    // $ANTLR start "rule__Observeurs__Group__4__Impl"
    // InternalMappingAssistance.g:1074:1: rule__Observeurs__Group__4__Impl : ( '.' ) ;
    public final void rule__Observeurs__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1078:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1079:1: ( '.' )
            {
            // InternalMappingAssistance.g:1079:1: ( '.' )
            // InternalMappingAssistance.g:1080:2: '.'
            {
             before(grammarAccess.getObserveursAccess().getFullStopKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getFullStopKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__4__Impl"


    // $ANTLR start "rule__Observeurs__Group__5"
    // InternalMappingAssistance.g:1089:1: rule__Observeurs__Group__5 : rule__Observeurs__Group__5__Impl rule__Observeurs__Group__6 ;
    public final void rule__Observeurs__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1093:1: ( rule__Observeurs__Group__5__Impl rule__Observeurs__Group__6 )
            // InternalMappingAssistance.g:1094:2: rule__Observeurs__Group__5__Impl rule__Observeurs__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Observeurs__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__5"


    // $ANTLR start "rule__Observeurs__Group__5__Impl"
    // InternalMappingAssistance.g:1101:1: rule__Observeurs__Group__5__Impl : ( ( rule__Observeurs__NameServ1Assignment_5 ) ) ;
    public final void rule__Observeurs__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1105:1: ( ( ( rule__Observeurs__NameServ1Assignment_5 ) ) )
            // InternalMappingAssistance.g:1106:1: ( ( rule__Observeurs__NameServ1Assignment_5 ) )
            {
            // InternalMappingAssistance.g:1106:1: ( ( rule__Observeurs__NameServ1Assignment_5 ) )
            // InternalMappingAssistance.g:1107:2: ( rule__Observeurs__NameServ1Assignment_5 )
            {
             before(grammarAccess.getObserveursAccess().getNameServ1Assignment_5()); 
            // InternalMappingAssistance.g:1108:2: ( rule__Observeurs__NameServ1Assignment_5 )
            // InternalMappingAssistance.g:1108:3: rule__Observeurs__NameServ1Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Observeurs__NameServ1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getObserveursAccess().getNameServ1Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__5__Impl"


    // $ANTLR start "rule__Observeurs__Group__6"
    // InternalMappingAssistance.g:1116:1: rule__Observeurs__Group__6 : rule__Observeurs__Group__6__Impl rule__Observeurs__Group__7 ;
    public final void rule__Observeurs__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1120:1: ( rule__Observeurs__Group__6__Impl rule__Observeurs__Group__7 )
            // InternalMappingAssistance.g:1121:2: rule__Observeurs__Group__6__Impl rule__Observeurs__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Observeurs__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__6"


    // $ANTLR start "rule__Observeurs__Group__6__Impl"
    // InternalMappingAssistance.g:1128:1: rule__Observeurs__Group__6__Impl : ( ',' ) ;
    public final void rule__Observeurs__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1132:1: ( ( ',' ) )
            // InternalMappingAssistance.g:1133:1: ( ',' )
            {
            // InternalMappingAssistance.g:1133:1: ( ',' )
            // InternalMappingAssistance.g:1134:2: ','
            {
             before(grammarAccess.getObserveursAccess().getCommaKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__6__Impl"


    // $ANTLR start "rule__Observeurs__Group__7"
    // InternalMappingAssistance.g:1143:1: rule__Observeurs__Group__7 : rule__Observeurs__Group__7__Impl rule__Observeurs__Group__8 ;
    public final void rule__Observeurs__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1147:1: ( rule__Observeurs__Group__7__Impl rule__Observeurs__Group__8 )
            // InternalMappingAssistance.g:1148:2: rule__Observeurs__Group__7__Impl rule__Observeurs__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Observeurs__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__7"


    // $ANTLR start "rule__Observeurs__Group__7__Impl"
    // InternalMappingAssistance.g:1155:1: rule__Observeurs__Group__7__Impl : ( ( rule__Observeurs__NameCompAssignment_7 ) ) ;
    public final void rule__Observeurs__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1159:1: ( ( ( rule__Observeurs__NameCompAssignment_7 ) ) )
            // InternalMappingAssistance.g:1160:1: ( ( rule__Observeurs__NameCompAssignment_7 ) )
            {
            // InternalMappingAssistance.g:1160:1: ( ( rule__Observeurs__NameCompAssignment_7 ) )
            // InternalMappingAssistance.g:1161:2: ( rule__Observeurs__NameCompAssignment_7 )
            {
             before(grammarAccess.getObserveursAccess().getNameCompAssignment_7()); 
            // InternalMappingAssistance.g:1162:2: ( rule__Observeurs__NameCompAssignment_7 )
            // InternalMappingAssistance.g:1162:3: rule__Observeurs__NameCompAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Observeurs__NameCompAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getObserveursAccess().getNameCompAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__7__Impl"


    // $ANTLR start "rule__Observeurs__Group__8"
    // InternalMappingAssistance.g:1170:1: rule__Observeurs__Group__8 : rule__Observeurs__Group__8__Impl rule__Observeurs__Group__9 ;
    public final void rule__Observeurs__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1174:1: ( rule__Observeurs__Group__8__Impl rule__Observeurs__Group__9 )
            // InternalMappingAssistance.g:1175:2: rule__Observeurs__Group__8__Impl rule__Observeurs__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Observeurs__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__8"


    // $ANTLR start "rule__Observeurs__Group__8__Impl"
    // InternalMappingAssistance.g:1182:1: rule__Observeurs__Group__8__Impl : ( '.' ) ;
    public final void rule__Observeurs__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1186:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1187:1: ( '.' )
            {
            // InternalMappingAssistance.g:1187:1: ( '.' )
            // InternalMappingAssistance.g:1188:2: '.'
            {
             before(grammarAccess.getObserveursAccess().getFullStopKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getFullStopKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__8__Impl"


    // $ANTLR start "rule__Observeurs__Group__9"
    // InternalMappingAssistance.g:1197:1: rule__Observeurs__Group__9 : rule__Observeurs__Group__9__Impl rule__Observeurs__Group__10 ;
    public final void rule__Observeurs__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1201:1: ( rule__Observeurs__Group__9__Impl rule__Observeurs__Group__10 )
            // InternalMappingAssistance.g:1202:2: rule__Observeurs__Group__9__Impl rule__Observeurs__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Observeurs__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__9"


    // $ANTLR start "rule__Observeurs__Group__9__Impl"
    // InternalMappingAssistance.g:1209:1: rule__Observeurs__Group__9__Impl : ( ( rule__Observeurs__NameServ2Assignment_9 ) ) ;
    public final void rule__Observeurs__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1213:1: ( ( ( rule__Observeurs__NameServ2Assignment_9 ) ) )
            // InternalMappingAssistance.g:1214:1: ( ( rule__Observeurs__NameServ2Assignment_9 ) )
            {
            // InternalMappingAssistance.g:1214:1: ( ( rule__Observeurs__NameServ2Assignment_9 ) )
            // InternalMappingAssistance.g:1215:2: ( rule__Observeurs__NameServ2Assignment_9 )
            {
             before(grammarAccess.getObserveursAccess().getNameServ2Assignment_9()); 
            // InternalMappingAssistance.g:1216:2: ( rule__Observeurs__NameServ2Assignment_9 )
            // InternalMappingAssistance.g:1216:3: rule__Observeurs__NameServ2Assignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Observeurs__NameServ2Assignment_9();

            state._fsp--;


            }

             after(grammarAccess.getObserveursAccess().getNameServ2Assignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__9__Impl"


    // $ANTLR start "rule__Observeurs__Group__10"
    // InternalMappingAssistance.g:1224:1: rule__Observeurs__Group__10 : rule__Observeurs__Group__10__Impl ;
    public final void rule__Observeurs__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1228:1: ( rule__Observeurs__Group__10__Impl )
            // InternalMappingAssistance.g:1229:2: rule__Observeurs__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observeurs__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__10"


    // $ANTLR start "rule__Observeurs__Group__10__Impl"
    // InternalMappingAssistance.g:1235:1: rule__Observeurs__Group__10__Impl : ( ')' ) ;
    public final void rule__Observeurs__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1239:1: ( ( ')' ) )
            // InternalMappingAssistance.g:1240:1: ( ')' )
            {
            // InternalMappingAssistance.g:1240:1: ( ')' )
            // InternalMappingAssistance.g:1241:2: ')'
            {
             before(grammarAccess.getObserveursAccess().getRightParenthesisKeyword_10()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getRightParenthesisKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__Group__10__Impl"


    // $ANTLR start "rule__Model__FunctionAssignment"
    // InternalMappingAssistance.g:1251:1: rule__Model__FunctionAssignment : ( ruleAbstractModel ) ;
    public final void rule__Model__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1255:1: ( ( ruleAbstractModel ) )
            // InternalMappingAssistance.g:1256:2: ( ruleAbstractModel )
            {
            // InternalMappingAssistance.g:1256:2: ( ruleAbstractModel )
            // InternalMappingAssistance.g:1257:3: ruleAbstractModel
            {
             before(grammarAccess.getModelAccess().getFunctionAbstractModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFunctionAbstractModelParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AbstractModel__ObsAssignment_1"
    // InternalMappingAssistance.g:1266:1: rule__AbstractModel__ObsAssignment_1 : ( ruleObserveurs ) ;
    public final void rule__AbstractModel__ObsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1270:1: ( ( ruleObserveurs ) )
            // InternalMappingAssistance.g:1271:2: ( ruleObserveurs )
            {
            // InternalMappingAssistance.g:1271:2: ( ruleObserveurs )
            // InternalMappingAssistance.g:1272:3: ruleObserveurs
            {
             before(grammarAccess.getAbstractModelAccess().getObsObserveursParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObserveurs();

            state._fsp--;

             after(grammarAccess.getAbstractModelAccess().getObsObserveursParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__ObsAssignment_1"


    // $ANTLR start "rule__AbstractModel__MockAssignment_2"
    // InternalMappingAssistance.g:1281:1: rule__AbstractModel__MockAssignment_2 : ( ruleMocks ) ;
    public final void rule__AbstractModel__MockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1285:1: ( ( ruleMocks ) )
            // InternalMappingAssistance.g:1286:2: ( ruleMocks )
            {
            // InternalMappingAssistance.g:1286:2: ( ruleMocks )
            // InternalMappingAssistance.g:1287:3: ruleMocks
            {
             before(grammarAccess.getAbstractModelAccess().getMockMocksParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMocks();

            state._fsp--;

             after(grammarAccess.getAbstractModelAccess().getMockMocksParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__MockAssignment_2"


    // $ANTLR start "rule__AbstractModel__TestedservAssignment_3"
    // InternalMappingAssistance.g:1296:1: rule__AbstractModel__TestedservAssignment_3 : ( ruleTestedservice ) ;
    public final void rule__AbstractModel__TestedservAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1300:1: ( ( ruleTestedservice ) )
            // InternalMappingAssistance.g:1301:2: ( ruleTestedservice )
            {
            // InternalMappingAssistance.g:1301:2: ( ruleTestedservice )
            // InternalMappingAssistance.g:1302:3: ruleTestedservice
            {
             before(grammarAccess.getAbstractModelAccess().getTestedservTestedserviceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTestedservice();

            state._fsp--;

             after(grammarAccess.getAbstractModelAccess().getTestedservTestedserviceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__TestedservAssignment_3"


    // $ANTLR start "rule__AbstractModel__TestedcompAssignment_4"
    // InternalMappingAssistance.g:1311:1: rule__AbstractModel__TestedcompAssignment_4 : ( ruleTestedcomposant ) ;
    public final void rule__AbstractModel__TestedcompAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1315:1: ( ( ruleTestedcomposant ) )
            // InternalMappingAssistance.g:1316:2: ( ruleTestedcomposant )
            {
            // InternalMappingAssistance.g:1316:2: ( ruleTestedcomposant )
            // InternalMappingAssistance.g:1317:3: ruleTestedcomposant
            {
             before(grammarAccess.getAbstractModelAccess().getTestedcompTestedcomposantParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTestedcomposant();

            state._fsp--;

             after(grammarAccess.getAbstractModelAccess().getTestedcompTestedcomposantParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractModel__TestedcompAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMappingAssistance.g:1326:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1330:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMappingAssistance.g:1331:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMappingAssistance.g:1331:2: ( ruleQualifiedNameWithWildcard )
            // InternalMappingAssistance.g:1332:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Testedcomposant__NameCompAssignment"
    // InternalMappingAssistance.g:1341:1: rule__Testedcomposant__NameCompAssignment : ( ( RULE_ID ) ) ;
    public final void rule__Testedcomposant__NameCompAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1345:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1346:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1346:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1347:3: ( RULE_ID )
            {
             before(grammarAccess.getTestedcomposantAccess().getNameCompInstanceCompCrossReference_0()); 
            // InternalMappingAssistance.g:1348:3: ( RULE_ID )
            // InternalMappingAssistance.g:1349:4: RULE_ID
            {
             before(grammarAccess.getTestedcomposantAccess().getNameCompInstanceCompIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestedcomposantAccess().getNameCompInstanceCompIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTestedcomposantAccess().getNameCompInstanceCompCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedcomposant__NameCompAssignment"


    // $ANTLR start "rule__Testedservice__NameCompAssignment_0"
    // InternalMappingAssistance.g:1360:1: rule__Testedservice__NameCompAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Testedservice__NameCompAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1364:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1365:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1365:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1366:3: ( RULE_ID )
            {
             before(grammarAccess.getTestedserviceAccess().getNameCompInstanceCompCrossReference_0_0()); 
            // InternalMappingAssistance.g:1367:3: ( RULE_ID )
            // InternalMappingAssistance.g:1368:4: RULE_ID
            {
             before(grammarAccess.getTestedserviceAccess().getNameCompInstanceCompIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestedserviceAccess().getNameCompInstanceCompIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTestedserviceAccess().getNameCompInstanceCompCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__NameCompAssignment_0"


    // $ANTLR start "rule__Testedservice__NameServ1Assignment_2"
    // InternalMappingAssistance.g:1379:1: rule__Testedservice__NameServ1Assignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Testedservice__NameServ1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1383:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1384:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1384:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1385:3: ( RULE_ID )
            {
             before(grammarAccess.getTestedserviceAccess().getNameServ1ServiceNameCrossReference_2_0()); 
            // InternalMappingAssistance.g:1386:3: ( RULE_ID )
            // InternalMappingAssistance.g:1387:4: RULE_ID
            {
             before(grammarAccess.getTestedserviceAccess().getNameServ1ServiceNameIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestedserviceAccess().getNameServ1ServiceNameIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTestedserviceAccess().getNameServ1ServiceNameCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Testedservice__NameServ1Assignment_2"


    // $ANTLR start "rule__Mocks__MocknameAssignment_1"
    // InternalMappingAssistance.g:1398:1: rule__Mocks__MocknameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mocks__MocknameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1402:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1403:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1403:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1404:3: ( RULE_ID )
            {
             before(grammarAccess.getMocksAccess().getMocknameMockNameCrossReference_1_0()); 
            // InternalMappingAssistance.g:1405:3: ( RULE_ID )
            // InternalMappingAssistance.g:1406:4: RULE_ID
            {
             before(grammarAccess.getMocksAccess().getMocknameMockNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMocksAccess().getMocknameMockNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMocksAccess().getMocknameMockNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__MocknameAssignment_1"


    // $ANTLR start "rule__Mocks__NameCompAssignment_3"
    // InternalMappingAssistance.g:1417:1: rule__Mocks__NameCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Mocks__NameCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1421:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1422:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1422:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1423:3: ( RULE_ID )
            {
             before(grammarAccess.getMocksAccess().getNameCompInstanceCompCrossReference_3_0()); 
            // InternalMappingAssistance.g:1424:3: ( RULE_ID )
            // InternalMappingAssistance.g:1425:4: RULE_ID
            {
             before(grammarAccess.getMocksAccess().getNameCompInstanceCompIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMocksAccess().getNameCompInstanceCompIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getMocksAccess().getNameCompInstanceCompCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__NameCompAssignment_3"


    // $ANTLR start "rule__Mocks__NameServ1Assignment_5"
    // InternalMappingAssistance.g:1436:1: rule__Mocks__NameServ1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Mocks__NameServ1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1440:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1441:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1441:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1442:3: ( RULE_ID )
            {
             before(grammarAccess.getMocksAccess().getNameServ1ServiceNameCrossReference_5_0()); 
            // InternalMappingAssistance.g:1443:3: ( RULE_ID )
            // InternalMappingAssistance.g:1444:4: RULE_ID
            {
             before(grammarAccess.getMocksAccess().getNameServ1ServiceNameIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMocksAccess().getNameServ1ServiceNameIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getMocksAccess().getNameServ1ServiceNameCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mocks__NameServ1Assignment_5"


    // $ANTLR start "rule__Observeurs__ObsnameAssignment_1"
    // InternalMappingAssistance.g:1455:1: rule__Observeurs__ObsnameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Observeurs__ObsnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1459:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1460:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1460:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1461:3: ( RULE_ID )
            {
             before(grammarAccess.getObserveursAccess().getObsnameObserveurNameCrossReference_1_0()); 
            // InternalMappingAssistance.g:1462:3: ( RULE_ID )
            // InternalMappingAssistance.g:1463:4: RULE_ID
            {
             before(grammarAccess.getObserveursAccess().getObsnameObserveurNameIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getObsnameObserveurNameIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getObserveursAccess().getObsnameObserveurNameCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__ObsnameAssignment_1"


    // $ANTLR start "rule__Observeurs__NameCompAssignment_3"
    // InternalMappingAssistance.g:1474:1: rule__Observeurs__NameCompAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Observeurs__NameCompAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1478:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1479:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1479:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1480:3: ( RULE_ID )
            {
             before(grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_3_0()); 
            // InternalMappingAssistance.g:1481:3: ( RULE_ID )
            // InternalMappingAssistance.g:1482:4: RULE_ID
            {
             before(grammarAccess.getObserveursAccess().getNameCompInstanceCompIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getNameCompInstanceCompIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__NameCompAssignment_3"


    // $ANTLR start "rule__Observeurs__NameServ1Assignment_5"
    // InternalMappingAssistance.g:1493:1: rule__Observeurs__NameServ1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Observeurs__NameServ1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1497:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1498:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1498:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1499:3: ( RULE_ID )
            {
             before(grammarAccess.getObserveursAccess().getNameServ1ServiceNameCrossReference_5_0()); 
            // InternalMappingAssistance.g:1500:3: ( RULE_ID )
            // InternalMappingAssistance.g:1501:4: RULE_ID
            {
             before(grammarAccess.getObserveursAccess().getNameServ1ServiceNameIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getNameServ1ServiceNameIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getObserveursAccess().getNameServ1ServiceNameCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__NameServ1Assignment_5"


    // $ANTLR start "rule__Observeurs__NameCompAssignment_7"
    // InternalMappingAssistance.g:1512:1: rule__Observeurs__NameCompAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Observeurs__NameCompAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1516:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1517:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1517:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1518:3: ( RULE_ID )
            {
             before(grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_7_0()); 
            // InternalMappingAssistance.g:1519:3: ( RULE_ID )
            // InternalMappingAssistance.g:1520:4: RULE_ID
            {
             before(grammarAccess.getObserveursAccess().getNameCompInstanceCompIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getNameCompInstanceCompIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getObserveursAccess().getNameCompInstanceCompCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__NameCompAssignment_7"


    // $ANTLR start "rule__Observeurs__NameServ2Assignment_9"
    // InternalMappingAssistance.g:1531:1: rule__Observeurs__NameServ2Assignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__Observeurs__NameServ2Assignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1535:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:1536:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:1536:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:1537:3: ( RULE_ID )
            {
             before(grammarAccess.getObserveursAccess().getNameServ2ServiceNameCrossReference_9_0()); 
            // InternalMappingAssistance.g:1538:3: ( RULE_ID )
            // InternalMappingAssistance.g:1539:4: RULE_ID
            {
             before(grammarAccess.getObserveursAccess().getNameServ2ServiceNameIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObserveursAccess().getNameServ2ServiceNameIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getObserveursAccess().getNameServ2ServiceNameCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observeurs__NameServ2Assignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000240010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000240012L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}