package com.aelos.xtext.testintentionsassistance.ide.contentassist.antlr.internal;

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
import com.aelos.xtext.testintentionsassistance.services.TestintentionsAssistanceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestintentionsAssistanceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<>'", "'\\u2265'", "'\\u2264'", "'>'", "'<'", "'*'", "'/'", "'true'", "'false'", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'('", "')'", "','", "'input:('", "':='", "'description:'", "'datapredicate:'", "'oracle:'", "'\\u2228'", "'\\u2227'", "'+'", "'-'", "':'", "'!'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTestintentionsAssistanceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTestintentionsAssistanceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTestintentionsAssistanceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTestintentionsAssistance.g"; }


    	private TestintentionsAssistanceGrammarAccess grammarAccess;

    	public void setGrammarAccess(TestintentionsAssistanceGrammarAccess grammarAccess) {
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
    // InternalTestintentionsAssistance.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:54:1: ( ruleModel EOF )
            // InternalTestintentionsAssistance.g:55:1: ruleModel EOF
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
    // InternalTestintentionsAssistance.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalTestintentionsAssistance.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalTestintentionsAssistance.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalTestintentionsAssistance.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalTestintentionsAssistance.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:78:1: entryRuleDomainDeclaration : ruleDomainDeclaration EOF ;
    public final void entryRuleDomainDeclaration() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:79:1: ( ruleDomainDeclaration EOF )
            // InternalTestintentionsAssistance.g:80:1: ruleDomainDeclaration EOF
            {
             before(grammarAccess.getDomainDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainDeclaration();

            state._fsp--;

             after(grammarAccess.getDomainDeclarationRule()); 
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
    // $ANTLR end "entryRuleDomainDeclaration"


    // $ANTLR start "ruleDomainDeclaration"
    // InternalTestintentionsAssistance.g:87:1: ruleDomainDeclaration : ( ( rule__DomainDeclaration__Group__0 ) ) ;
    public final void ruleDomainDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:91:2: ( ( ( rule__DomainDeclaration__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:92:2: ( ( rule__DomainDeclaration__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:92:2: ( ( rule__DomainDeclaration__Group__0 ) )
            // InternalTestintentionsAssistance.g:93:3: ( rule__DomainDeclaration__Group__0 )
            {
             before(grammarAccess.getDomainDeclarationAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:94:3: ( rule__DomainDeclaration__Group__0 )
            // InternalTestintentionsAssistance.g:94:4: rule__DomainDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainDeclarationAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTestintentionsAssistance.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:104:1: ( ruleQualifiedName EOF )
            // InternalTestintentionsAssistance.g:105:1: ruleQualifiedName EOF
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
    // InternalTestintentionsAssistance.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalTestintentionsAssistance.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalTestintentionsAssistance.g:119:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleImport"
    // InternalTestintentionsAssistance.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:129:1: ( ruleImport EOF )
            // InternalTestintentionsAssistance.g:130:1: ruleImport EOF
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
    // InternalTestintentionsAssistance.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalTestintentionsAssistance.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:144:3: ( rule__Import__Group__0 )
            // InternalTestintentionsAssistance.g:144:4: rule__Import__Group__0
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
    // InternalTestintentionsAssistance.g:153:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:154:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalTestintentionsAssistance.g:155:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalTestintentionsAssistance.g:162:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:166:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:167:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalTestintentionsAssistance.g:168:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:169:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalTestintentionsAssistance.g:169:4: rule__QualifiedNameWithWildcard__Group__0
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


    // $ANTLR start "entryRuleAbstractElement"
    // InternalTestintentionsAssistance.g:178:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:179:1: ( ruleAbstractElement EOF )
            // InternalTestintentionsAssistance.g:180:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalTestintentionsAssistance.g:187:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:191:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:192:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:192:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalTestintentionsAssistance.g:193:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:194:3: ( rule__AbstractElement__Alternatives )
            // InternalTestintentionsAssistance.g:194:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleFunction"
    // InternalTestintentionsAssistance.g:203:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:204:1: ( ruleFunction EOF )
            // InternalTestintentionsAssistance.g:205:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalTestintentionsAssistance.g:212:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:216:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:217:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:217:2: ( ( rule__Function__Group__0 ) )
            // InternalTestintentionsAssistance.g:218:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:219:3: ( rule__Function__Group__0 )
            // InternalTestintentionsAssistance.g:219:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleData"
    // InternalTestintentionsAssistance.g:228:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:229:1: ( ruleData EOF )
            // InternalTestintentionsAssistance.g:230:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalTestintentionsAssistance.g:237:1: ruleData : ( ( rule__Data__Alternatives ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:241:2: ( ( ( rule__Data__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:242:2: ( ( rule__Data__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:242:2: ( ( rule__Data__Alternatives ) )
            // InternalTestintentionsAssistance.g:243:3: ( rule__Data__Alternatives )
            {
             before(grammarAccess.getDataAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:244:3: ( rule__Data__Alternatives )
            // InternalTestintentionsAssistance.g:244:4: rule__Data__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Data__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleTestIntention"
    // InternalTestintentionsAssistance.g:253:1: entryRuleTestIntention : ruleTestIntention EOF ;
    public final void entryRuleTestIntention() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:254:1: ( ruleTestIntention EOF )
            // InternalTestintentionsAssistance.g:255:1: ruleTestIntention EOF
            {
             before(grammarAccess.getTestIntentionRule()); 
            pushFollow(FOLLOW_1);
            ruleTestIntention();

            state._fsp--;

             after(grammarAccess.getTestIntentionRule()); 
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
    // $ANTLR end "entryRuleTestIntention"


    // $ANTLR start "ruleTestIntention"
    // InternalTestintentionsAssistance.g:262:1: ruleTestIntention : ( ( rule__TestIntention__Group__0 ) ) ;
    public final void ruleTestIntention() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:266:2: ( ( ( rule__TestIntention__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:267:2: ( ( rule__TestIntention__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:267:2: ( ( rule__TestIntention__Group__0 ) )
            // InternalTestintentionsAssistance.g:268:3: ( rule__TestIntention__Group__0 )
            {
             before(grammarAccess.getTestIntentionAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:269:3: ( rule__TestIntention__Group__0 )
            // InternalTestintentionsAssistance.g:269:4: rule__TestIntention__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestIntentionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTestIntention"


    // $ANTLR start "entryRuleExpression"
    // InternalTestintentionsAssistance.g:278:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:279:1: ( ruleExpression EOF )
            // InternalTestintentionsAssistance.g:280:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTestintentionsAssistance.g:287:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:291:2: ( ( ruleOr ) )
            // InternalTestintentionsAssistance.g:292:2: ( ruleOr )
            {
            // InternalTestintentionsAssistance.g:292:2: ( ruleOr )
            // InternalTestintentionsAssistance.g:293:3: ruleOr
            {
             before(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalTestintentionsAssistance.g:303:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:304:1: ( ruleOr EOF )
            // InternalTestintentionsAssistance.g:305:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalTestintentionsAssistance.g:312:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:316:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:317:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:317:2: ( ( rule__Or__Group__0 ) )
            // InternalTestintentionsAssistance.g:318:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:319:3: ( rule__Or__Group__0 )
            // InternalTestintentionsAssistance.g:319:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalTestintentionsAssistance.g:328:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:329:1: ( ruleAnd EOF )
            // InternalTestintentionsAssistance.g:330:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalTestintentionsAssistance.g:337:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:341:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:342:2: ( ( rule__And__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:342:2: ( ( rule__And__Group__0 ) )
            // InternalTestintentionsAssistance.g:343:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:344:3: ( rule__And__Group__0 )
            // InternalTestintentionsAssistance.g:344:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalTestintentionsAssistance.g:353:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:354:1: ( ruleEquality EOF )
            // InternalTestintentionsAssistance.g:355:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalTestintentionsAssistance.g:362:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:366:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:367:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:367:2: ( ( rule__Equality__Group__0 ) )
            // InternalTestintentionsAssistance.g:368:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:369:3: ( rule__Equality__Group__0 )
            // InternalTestintentionsAssistance.g:369:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalTestintentionsAssistance.g:378:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:379:1: ( ruleComparison EOF )
            // InternalTestintentionsAssistance.g:380:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalTestintentionsAssistance.g:387:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:391:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:392:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:392:2: ( ( rule__Comparison__Group__0 ) )
            // InternalTestintentionsAssistance.g:393:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:394:3: ( rule__Comparison__Group__0 )
            // InternalTestintentionsAssistance.g:394:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalTestintentionsAssistance.g:403:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:404:1: ( rulePlusOrMinus EOF )
            // InternalTestintentionsAssistance.g:405:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalTestintentionsAssistance.g:412:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:416:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:417:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:417:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalTestintentionsAssistance.g:418:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:419:3: ( rule__PlusOrMinus__Group__0 )
            // InternalTestintentionsAssistance.g:419:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalTestintentionsAssistance.g:428:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:429:1: ( ruleMulOrDiv EOF )
            // InternalTestintentionsAssistance.g:430:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalTestintentionsAssistance.g:437:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:441:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:442:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:442:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalTestintentionsAssistance.g:443:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:444:3: ( rule__MulOrDiv__Group__0 )
            // InternalTestintentionsAssistance.g:444:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleVariable"
    // InternalTestintentionsAssistance.g:453:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:454:1: ( ruleVariable EOF )
            // InternalTestintentionsAssistance.g:455:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalTestintentionsAssistance.g:462:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:466:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:467:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:467:2: ( ( rule__Variable__Group__0 ) )
            // InternalTestintentionsAssistance.g:468:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:469:3: ( rule__Variable__Group__0 )
            // InternalTestintentionsAssistance.g:469:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePrimary"
    // InternalTestintentionsAssistance.g:478:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:479:1: ( rulePrimary EOF )
            // InternalTestintentionsAssistance.g:480:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalTestintentionsAssistance.g:487:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:491:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:492:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:492:2: ( ( rule__Primary__Alternatives ) )
            // InternalTestintentionsAssistance.g:493:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:494:3: ( rule__Primary__Alternatives )
            // InternalTestintentionsAssistance.g:494:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalTestintentionsAssistance.g:503:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:504:1: ( ruleAtomic EOF )
            // InternalTestintentionsAssistance.g:505:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalTestintentionsAssistance.g:512:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:516:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:517:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:517:2: ( ( rule__Atomic__Alternatives ) )
            // InternalTestintentionsAssistance.g:518:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:519:3: ( rule__Atomic__Alternatives )
            // InternalTestintentionsAssistance.g:519:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "ruleType"
    // InternalTestintentionsAssistance.g:528:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:532:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:533:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:533:2: ( ( rule__Type__Alternatives ) )
            // InternalTestintentionsAssistance.g:534:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:535:3: ( rule__Type__Alternatives )
            // InternalTestintentionsAssistance.g:535:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalTestintentionsAssistance.g:543:1: rule__AbstractElement__Alternatives : ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:547:1: ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalTestintentionsAssistance.g:548:2: ( ruleTestIntention )
                    {
                    // InternalTestintentionsAssistance.g:548:2: ( ruleTestIntention )
                    // InternalTestintentionsAssistance.g:549:3: ruleTestIntention
                    {
                     before(grammarAccess.getAbstractElementAccess().getTestIntentionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTestIntention();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTestIntentionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:554:2: ( ruleFunction )
                    {
                    // InternalTestintentionsAssistance.g:554:2: ( ruleFunction )
                    // InternalTestintentionsAssistance.g:555:3: ruleFunction
                    {
                     before(grammarAccess.getAbstractElementAccess().getFunctionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFunction();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getFunctionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:560:2: ( ruleData )
                    {
                    // InternalTestintentionsAssistance.g:560:2: ( ruleData )
                    // InternalTestintentionsAssistance.g:561:3: ruleData
                    {
                     before(grammarAccess.getAbstractElementAccess().getDataParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleData();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDataParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:566:2: ( ruleImport )
                    {
                    // InternalTestintentionsAssistance.g:566:2: ( ruleImport )
                    // InternalTestintentionsAssistance.g:567:3: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTestintentionsAssistance.g:572:2: ( ruleDomainDeclaration )
                    {
                    // InternalTestintentionsAssistance.g:572:2: ( ruleDomainDeclaration )
                    // InternalTestintentionsAssistance.g:573:3: ruleDomainDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getDomainDeclarationParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDomainDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getDomainDeclarationParserRuleCall_4()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Data__Alternatives"
    // InternalTestintentionsAssistance.g:582:1: rule__Data__Alternatives : ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__Group_1__0 ) ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:586:1: ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTestintentionsAssistance.g:587:2: ( ( rule__Data__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:587:2: ( ( rule__Data__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:588:3: ( rule__Data__Group_0__0 )
                    {
                     before(grammarAccess.getDataAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:589:3: ( rule__Data__Group_0__0 )
                    // InternalTestintentionsAssistance.g:589:4: rule__Data__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:593:2: ( ( rule__Data__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:593:2: ( ( rule__Data__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:594:3: ( rule__Data__Group_1__0 )
                    {
                     before(grammarAccess.getDataAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:595:3: ( rule__Data__Group_1__0 )
                    // InternalTestintentionsAssistance.g:595:4: rule__Data__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Data__Alternatives"


    // $ANTLR start "rule__Equality__OpAlternatives_1_1_0"
    // InternalTestintentionsAssistance.g:603:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:607:1: ( ( '=' ) | ( '<>' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalTestintentionsAssistance.g:608:2: ( '=' )
                    {
                    // InternalTestintentionsAssistance.g:608:2: ( '=' )
                    // InternalTestintentionsAssistance.g:609:3: '='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:614:2: ( '<>' )
                    {
                    // InternalTestintentionsAssistance.g:614:2: ( '<>' )
                    // InternalTestintentionsAssistance.g:615:3: '<>'
                    {
                     before(grammarAccess.getEqualityAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpLessThanSignGreaterThanSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OpAlternatives_1_1_0"
    // InternalTestintentionsAssistance.g:624:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '\\u2265' ) | ( '\\u2264' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:628:1: ( ( '\\u2265' ) | ( '\\u2264' ) | ( '>' ) | ( '<' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTestintentionsAssistance.g:629:2: ( '\\u2265' )
                    {
                    // InternalTestintentionsAssistance.g:629:2: ( '\\u2265' )
                    // InternalTestintentionsAssistance.g:630:3: '\\u2265'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanOrEqualToKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanOrEqualToKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:635:2: ( '\\u2264' )
                    {
                    // InternalTestintentionsAssistance.g:635:2: ( '\\u2264' )
                    // InternalTestintentionsAssistance.g:636:3: '\\u2264'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanOrEqualToKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanOrEqualToKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:641:2: ( '>' )
                    {
                    // InternalTestintentionsAssistance.g:641:2: ( '>' )
                    // InternalTestintentionsAssistance.g:642:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:647:2: ( '<' )
                    {
                    // InternalTestintentionsAssistance.g:647:2: ( '<' )
                    // InternalTestintentionsAssistance.g:648:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Comparison__OpAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalTestintentionsAssistance.g:657:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:661:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==41) ) {
                alt6=1;
            }
            else if ( (LA6_0==42) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTestintentionsAssistance.g:662:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:662:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalTestintentionsAssistance.g:663:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalTestintentionsAssistance.g:664:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalTestintentionsAssistance.g:664:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:668:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:668:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalTestintentionsAssistance.g:669:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalTestintentionsAssistance.g:670:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalTestintentionsAssistance.g:670:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_1_0"
    // InternalTestintentionsAssistance.g:678:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:682:1: ( ( '*' ) | ( '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( (LA7_0==18) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTestintentionsAssistance.g:683:2: ( '*' )
                    {
                    // InternalTestintentionsAssistance.g:683:2: ( '*' )
                    // InternalTestintentionsAssistance.g:684:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:689:2: ( '/' )
                    {
                    // InternalTestintentionsAssistance.g:689:2: ( '/' )
                    // InternalTestintentionsAssistance.g:690:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalTestintentionsAssistance.g:699:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:703:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt8=1;
                }
                break;
            case 44:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 19:
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalTestintentionsAssistance.g:704:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:704:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:705:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:706:3: ( rule__Primary__Group_0__0 )
                    // InternalTestintentionsAssistance.g:706:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:710:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:710:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:711:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:712:3: ( rule__Primary__Group_1__0 )
                    // InternalTestintentionsAssistance.g:712:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:716:2: ( ruleAtomic )
                    {
                    // InternalTestintentionsAssistance.g:716:2: ( ruleAtomic )
                    // InternalTestintentionsAssistance.g:717:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalTestintentionsAssistance.g:726:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:730:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt9=1;
                }
                break;
            case RULE_STRING:
                {
                alt9=2;
                }
                break;
            case 19:
            case 20:
                {
                alt9=3;
                }
                break;
            case RULE_ID:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTestintentionsAssistance.g:731:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:731:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:732:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:733:3: ( rule__Atomic__Group_0__0 )
                    // InternalTestintentionsAssistance.g:733:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:737:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:737:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:738:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:739:3: ( rule__Atomic__Group_1__0 )
                    // InternalTestintentionsAssistance.g:739:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:743:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:743:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalTestintentionsAssistance.g:744:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalTestintentionsAssistance.g:745:3: ( rule__Atomic__Group_2__0 )
                    // InternalTestintentionsAssistance.g:745:4: rule__Atomic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:749:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:749:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalTestintentionsAssistance.g:750:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalTestintentionsAssistance.g:751:3: ( rule__Atomic__Group_3__0 )
                    // InternalTestintentionsAssistance.g:751:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Atomic__ValueAlternatives_2_1_0"
    // InternalTestintentionsAssistance.g:759:1: rule__Atomic__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Atomic__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:763:1: ( ( 'true' ) | ( 'false' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalTestintentionsAssistance.g:764:2: ( 'true' )
                    {
                    // InternalTestintentionsAssistance.g:764:2: ( 'true' )
                    // InternalTestintentionsAssistance.g:765:3: 'true'
                    {
                     before(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:770:2: ( 'false' )
                    {
                    // InternalTestintentionsAssistance.g:770:2: ( 'false' )
                    // InternalTestintentionsAssistance.g:771:3: 'false'
                    {
                     before(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalTestintentionsAssistance.g:780:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:784:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 22:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalTestintentionsAssistance.g:785:2: ( ( 'INT' ) )
                    {
                    // InternalTestintentionsAssistance.g:785:2: ( ( 'INT' ) )
                    // InternalTestintentionsAssistance.g:786:3: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalTestintentionsAssistance.g:787:3: ( 'INT' )
                    // InternalTestintentionsAssistance.g:787:4: 'INT'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:791:2: ( ( 'STRING' ) )
                    {
                    // InternalTestintentionsAssistance.g:791:2: ( ( 'STRING' ) )
                    // InternalTestintentionsAssistance.g:792:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalTestintentionsAssistance.g:793:3: ( 'STRING' )
                    // InternalTestintentionsAssistance.g:793:4: 'STRING'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:797:2: ( ( 'Boolean' ) )
                    {
                    // InternalTestintentionsAssistance.g:797:2: ( ( 'Boolean' ) )
                    // InternalTestintentionsAssistance.g:798:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalTestintentionsAssistance.g:799:3: ( 'Boolean' )
                    // InternalTestintentionsAssistance.g:799:4: 'Boolean'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:803:2: ( ( 'Double' ) )
                    {
                    // InternalTestintentionsAssistance.g:803:2: ( ( 'Double' ) )
                    // InternalTestintentionsAssistance.g:804:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalTestintentionsAssistance.g:805:3: ( 'Double' )
                    // InternalTestintentionsAssistance.g:805:4: 'Double'
                    {
                    match(input,24,FOLLOW_2); 

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


    // $ANTLR start "rule__DomainDeclaration__Group__0"
    // InternalTestintentionsAssistance.g:813:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:817:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalTestintentionsAssistance.g:818:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DomainDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__1();

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
    // $ANTLR end "rule__DomainDeclaration__Group__0"


    // $ANTLR start "rule__DomainDeclaration__Group__0__Impl"
    // InternalTestintentionsAssistance.g:825:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:829:1: ( ( 'domain' ) )
            // InternalTestintentionsAssistance.g:830:1: ( 'domain' )
            {
            // InternalTestintentionsAssistance.g:830:1: ( 'domain' )
            // InternalTestintentionsAssistance.g:831:2: 'domain'
            {
             before(grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDomainDeclarationAccess().getDomainKeyword_0()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:840:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:844:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalTestintentionsAssistance.g:845:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DomainDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__2();

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
    // $ANTLR end "rule__DomainDeclaration__Group__1"


    // $ANTLR start "rule__DomainDeclaration__Group__1__Impl"
    // InternalTestintentionsAssistance.g:852:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:856:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:857:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:857:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalTestintentionsAssistance.g:858:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            // InternalTestintentionsAssistance.g:859:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalTestintentionsAssistance.g:859:3: rule__DomainDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:867:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:871:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalTestintentionsAssistance.g:872:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__DomainDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__3();

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
    // $ANTLR end "rule__DomainDeclaration__Group__2"


    // $ANTLR start "rule__DomainDeclaration__Group__2__Impl"
    // InternalTestintentionsAssistance.g:879:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:883:1: ( ( '{' ) )
            // InternalTestintentionsAssistance.g:884:1: ( '{' )
            {
            // InternalTestintentionsAssistance.g:884:1: ( '{' )
            // InternalTestintentionsAssistance.g:885:2: '{'
            {
             before(grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDomainDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:894:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:898:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalTestintentionsAssistance.g:899:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DomainDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__4();

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
    // $ANTLR end "rule__DomainDeclaration__Group__3"


    // $ANTLR start "rule__DomainDeclaration__Group__3__Impl"
    // InternalTestintentionsAssistance.g:906:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:910:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalTestintentionsAssistance.g:911:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalTestintentionsAssistance.g:911:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalTestintentionsAssistance.g:912:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            // InternalTestintentionsAssistance.g:913:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==25||LA12_0==29||LA12_0==34||LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:913:3: rule__DomainDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DomainDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:921:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:925:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalTestintentionsAssistance.g:926:2: rule__DomainDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__DomainDeclaration__Group__4"


    // $ANTLR start "rule__DomainDeclaration__Group__4__Impl"
    // InternalTestintentionsAssistance.g:932:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:936:1: ( ( '}' ) )
            // InternalTestintentionsAssistance.g:937:1: ( '}' )
            {
            // InternalTestintentionsAssistance.g:937:1: ( '}' )
            // InternalTestintentionsAssistance.g:938:2: '}'
            {
             before(grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getDomainDeclarationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalTestintentionsAssistance.g:948:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:952:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTestintentionsAssistance.g:953:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalTestintentionsAssistance.g:960:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:964:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:965:1: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:965:1: ( RULE_ID )
            // InternalTestintentionsAssistance.g:966:2: RULE_ID
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
    // InternalTestintentionsAssistance.g:975:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:979:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTestintentionsAssistance.g:980:2: rule__QualifiedName__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:986:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:990:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:991:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:991:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:992:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:993:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:993:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalTestintentionsAssistance.g:1002:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1006:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTestintentionsAssistance.g:1007:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTestintentionsAssistance.g:1014:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1018:1: ( ( '.' ) )
            // InternalTestintentionsAssistance.g:1019:1: ( '.' )
            {
            // InternalTestintentionsAssistance.g:1019:1: ( '.' )
            // InternalTestintentionsAssistance.g:1020:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:1029:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1033:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:1034:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalTestintentionsAssistance.g:1040:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1044:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:1045:1: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:1045:1: ( RULE_ID )
            // InternalTestintentionsAssistance.g:1046:2: RULE_ID
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalTestintentionsAssistance.g:1056:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1060:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTestintentionsAssistance.g:1061:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalTestintentionsAssistance.g:1068:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1072:1: ( ( 'import' ) )
            // InternalTestintentionsAssistance.g:1073:1: ( 'import' )
            {
            // InternalTestintentionsAssistance.g:1073:1: ( 'import' )
            // InternalTestintentionsAssistance.g:1074:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:1083:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1087:1: ( rule__Import__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1088:2: rule__Import__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1094:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1098:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:1099:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:1099:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalTestintentionsAssistance.g:1100:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalTestintentionsAssistance.g:1101:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalTestintentionsAssistance.g:1101:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalTestintentionsAssistance.g:1110:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1114:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalTestintentionsAssistance.g:1115:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalTestintentionsAssistance.g:1122:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1126:1: ( ( ruleQualifiedName ) )
            // InternalTestintentionsAssistance.g:1127:1: ( ruleQualifiedName )
            {
            // InternalTestintentionsAssistance.g:1127:1: ( ruleQualifiedName )
            // InternalTestintentionsAssistance.g:1128:2: ruleQualifiedName
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
    // InternalTestintentionsAssistance.g:1137:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1141:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1142:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1148:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1152:1: ( ( ( '.*' )? ) )
            // InternalTestintentionsAssistance.g:1153:1: ( ( '.*' )? )
            {
            // InternalTestintentionsAssistance.g:1153:1: ( ( '.*' )? )
            // InternalTestintentionsAssistance.g:1154:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalTestintentionsAssistance.g:1155:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTestintentionsAssistance.g:1155:3: '.*'
                    {
                    match(input,30,FOLLOW_2); 

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


    // $ANTLR start "rule__Function__Group__0"
    // InternalTestintentionsAssistance.g:1164:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1168:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalTestintentionsAssistance.g:1169:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

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
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalTestintentionsAssistance.g:1176:1: rule__Function__Group__0__Impl : ( ( rule__Function__OutAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1180:1: ( ( ( rule__Function__OutAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:1181:1: ( ( rule__Function__OutAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:1181:1: ( ( rule__Function__OutAssignment_0 ) )
            // InternalTestintentionsAssistance.g:1182:2: ( rule__Function__OutAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getOutAssignment_0()); 
            // InternalTestintentionsAssistance.g:1183:2: ( rule__Function__OutAssignment_0 )
            // InternalTestintentionsAssistance.g:1183:3: rule__Function__OutAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__OutAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOutAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalTestintentionsAssistance.g:1191:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1195:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalTestintentionsAssistance.g:1196:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

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
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalTestintentionsAssistance.g:1203:1: rule__Function__Group__1__Impl : ( '=' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1207:1: ( ( '=' ) )
            // InternalTestintentionsAssistance.g:1208:1: ( '=' )
            {
            // InternalTestintentionsAssistance.g:1208:1: ( '=' )
            // InternalTestintentionsAssistance.g:1209:2: '='
            {
             before(grammarAccess.getFunctionAccess().getEqualsSignKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalTestintentionsAssistance.g:1218:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1222:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalTestintentionsAssistance.g:1223:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

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
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalTestintentionsAssistance.g:1230:1: rule__Function__Group__2__Impl : ( ( rule__Function__MethodeAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1234:1: ( ( ( rule__Function__MethodeAssignment_2 ) ) )
            // InternalTestintentionsAssistance.g:1235:1: ( ( rule__Function__MethodeAssignment_2 ) )
            {
            // InternalTestintentionsAssistance.g:1235:1: ( ( rule__Function__MethodeAssignment_2 ) )
            // InternalTestintentionsAssistance.g:1236:2: ( rule__Function__MethodeAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getMethodeAssignment_2()); 
            // InternalTestintentionsAssistance.g:1237:2: ( rule__Function__MethodeAssignment_2 )
            // InternalTestintentionsAssistance.g:1237:3: rule__Function__MethodeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Function__MethodeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getMethodeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalTestintentionsAssistance.g:1245:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1249:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalTestintentionsAssistance.g:1250:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

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
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalTestintentionsAssistance.g:1257:1: rule__Function__Group__3__Impl : ( '(' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1261:1: ( ( '(' ) )
            // InternalTestintentionsAssistance.g:1262:1: ( '(' )
            {
            // InternalTestintentionsAssistance.g:1262:1: ( '(' )
            // InternalTestintentionsAssistance.g:1263:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalTestintentionsAssistance.g:1272:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1276:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalTestintentionsAssistance.g:1277:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

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
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalTestintentionsAssistance.g:1284:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )* ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1288:1: ( ( ( rule__Function__Group_4__0 )* ) )
            // InternalTestintentionsAssistance.g:1289:1: ( ( rule__Function__Group_4__0 )* )
            {
            // InternalTestintentionsAssistance.g:1289:1: ( ( rule__Function__Group_4__0 )* )
            // InternalTestintentionsAssistance.g:1290:2: ( rule__Function__Group_4__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // InternalTestintentionsAssistance.g:1291:2: ( rule__Function__Group_4__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==33) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1291:3: rule__Function__Group_4__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Function__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalTestintentionsAssistance.g:1299:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1303:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalTestintentionsAssistance.g:1304:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

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
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalTestintentionsAssistance.g:1311:1: rule__Function__Group__5__Impl : ( ( rule__Function__Arg1Assignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1315:1: ( ( ( rule__Function__Arg1Assignment_5 ) ) )
            // InternalTestintentionsAssistance.g:1316:1: ( ( rule__Function__Arg1Assignment_5 ) )
            {
            // InternalTestintentionsAssistance.g:1316:1: ( ( rule__Function__Arg1Assignment_5 ) )
            // InternalTestintentionsAssistance.g:1317:2: ( rule__Function__Arg1Assignment_5 )
            {
             before(grammarAccess.getFunctionAccess().getArg1Assignment_5()); 
            // InternalTestintentionsAssistance.g:1318:2: ( rule__Function__Arg1Assignment_5 )
            // InternalTestintentionsAssistance.g:1318:3: rule__Function__Arg1Assignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Function__Arg1Assignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArg1Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalTestintentionsAssistance.g:1326:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1330:1: ( rule__Function__Group__6__Impl )
            // InternalTestintentionsAssistance.g:1331:2: rule__Function__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__6__Impl();

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
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalTestintentionsAssistance.g:1337:1: rule__Function__Group__6__Impl : ( ')' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1341:1: ( ( ')' ) )
            // InternalTestintentionsAssistance.g:1342:1: ( ')' )
            {
            // InternalTestintentionsAssistance.g:1342:1: ( ')' )
            // InternalTestintentionsAssistance.g:1343:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group_4__0"
    // InternalTestintentionsAssistance.g:1353:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1357:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // InternalTestintentionsAssistance.g:1358:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Function__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_4__1();

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
    // $ANTLR end "rule__Function__Group_4__0"


    // $ANTLR start "rule__Function__Group_4__0__Impl"
    // InternalTestintentionsAssistance.g:1365:1: rule__Function__Group_4__0__Impl : ( ( rule__Function__ArgAssignment_4_0 ) ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1369:1: ( ( ( rule__Function__ArgAssignment_4_0 ) ) )
            // InternalTestintentionsAssistance.g:1370:1: ( ( rule__Function__ArgAssignment_4_0 ) )
            {
            // InternalTestintentionsAssistance.g:1370:1: ( ( rule__Function__ArgAssignment_4_0 ) )
            // InternalTestintentionsAssistance.g:1371:2: ( rule__Function__ArgAssignment_4_0 )
            {
             before(grammarAccess.getFunctionAccess().getArgAssignment_4_0()); 
            // InternalTestintentionsAssistance.g:1372:2: ( rule__Function__ArgAssignment_4_0 )
            // InternalTestintentionsAssistance.g:1372:3: rule__Function__ArgAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__ArgAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArgAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__0__Impl"


    // $ANTLR start "rule__Function__Group_4__1"
    // InternalTestintentionsAssistance.g:1380:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1384:1: ( rule__Function__Group_4__1__Impl )
            // InternalTestintentionsAssistance.g:1385:2: rule__Function__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_4__1__Impl();

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
    // $ANTLR end "rule__Function__Group_4__1"


    // $ANTLR start "rule__Function__Group_4__1__Impl"
    // InternalTestintentionsAssistance.g:1391:1: rule__Function__Group_4__1__Impl : ( ',' ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1395:1: ( ( ',' ) )
            // InternalTestintentionsAssistance.g:1396:1: ( ',' )
            {
            // InternalTestintentionsAssistance.g:1396:1: ( ',' )
            // InternalTestintentionsAssistance.g:1397:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_4_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_4__1__Impl"


    // $ANTLR start "rule__Data__Group_0__0"
    // InternalTestintentionsAssistance.g:1407:1: rule__Data__Group_0__0 : rule__Data__Group_0__0__Impl rule__Data__Group_0__1 ;
    public final void rule__Data__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1411:1: ( rule__Data__Group_0__0__Impl rule__Data__Group_0__1 )
            // InternalTestintentionsAssistance.g:1412:2: rule__Data__Group_0__0__Impl rule__Data__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Data__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0__1();

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
    // $ANTLR end "rule__Data__Group_0__0"


    // $ANTLR start "rule__Data__Group_0__0__Impl"
    // InternalTestintentionsAssistance.g:1419:1: rule__Data__Group_0__0__Impl : ( () ) ;
    public final void rule__Data__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1423:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:1424:1: ( () )
            {
            // InternalTestintentionsAssistance.g:1424:1: ( () )
            // InternalTestintentionsAssistance.g:1425:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0_0()); 
            // InternalTestintentionsAssistance.g:1426:2: ()
            // InternalTestintentionsAssistance.g:1426:3: 
            {
            }

             after(grammarAccess.getDataAccess().getDataAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_0__0__Impl"


    // $ANTLR start "rule__Data__Group_0__1"
    // InternalTestintentionsAssistance.g:1434:1: rule__Data__Group_0__1 : rule__Data__Group_0__1__Impl rule__Data__Group_0__2 ;
    public final void rule__Data__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1438:1: ( rule__Data__Group_0__1__Impl rule__Data__Group_0__2 )
            // InternalTestintentionsAssistance.g:1439:2: rule__Data__Group_0__1__Impl rule__Data__Group_0__2
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0__2();

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
    // $ANTLR end "rule__Data__Group_0__1"


    // $ANTLR start "rule__Data__Group_0__1__Impl"
    // InternalTestintentionsAssistance.g:1446:1: rule__Data__Group_0__1__Impl : ( 'input:(' ) ;
    public final void rule__Data__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1450:1: ( ( 'input:(' ) )
            // InternalTestintentionsAssistance.g:1451:1: ( 'input:(' )
            {
            // InternalTestintentionsAssistance.g:1451:1: ( 'input:(' )
            // InternalTestintentionsAssistance.g:1452:2: 'input:('
            {
             before(grammarAccess.getDataAccess().getInputKeyword_0_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getInputKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_0__1__Impl"


    // $ANTLR start "rule__Data__Group_0__2"
    // InternalTestintentionsAssistance.g:1461:1: rule__Data__Group_0__2 : rule__Data__Group_0__2__Impl ;
    public final void rule__Data__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1465:1: ( rule__Data__Group_0__2__Impl )
            // InternalTestintentionsAssistance.g:1466:2: rule__Data__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_0__2__Impl();

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
    // $ANTLR end "rule__Data__Group_0__2"


    // $ANTLR start "rule__Data__Group_0__2__Impl"
    // InternalTestintentionsAssistance.g:1472:1: rule__Data__Group_0__2__Impl : ( ( rule__Data__Group_0_2__0 )* ) ;
    public final void rule__Data__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1476:1: ( ( ( rule__Data__Group_0_2__0 )* ) )
            // InternalTestintentionsAssistance.g:1477:1: ( ( rule__Data__Group_0_2__0 )* )
            {
            // InternalTestintentionsAssistance.g:1477:1: ( ( rule__Data__Group_0_2__0 )* )
            // InternalTestintentionsAssistance.g:1478:2: ( rule__Data__Group_0_2__0 )*
            {
             before(grammarAccess.getDataAccess().getGroup_0_2()); 
            // InternalTestintentionsAssistance.g:1479:2: ( rule__Data__Group_0_2__0 )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1479:3: rule__Data__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Data__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_0__2__Impl"


    // $ANTLR start "rule__Data__Group_0_2__0"
    // InternalTestintentionsAssistance.g:1488:1: rule__Data__Group_0_2__0 : rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1 ;
    public final void rule__Data__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1492:1: ( rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1 )
            // InternalTestintentionsAssistance.g:1493:2: rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0_2__1();

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
    // $ANTLR end "rule__Data__Group_0_2__0"


    // $ANTLR start "rule__Data__Group_0_2__0__Impl"
    // InternalTestintentionsAssistance.g:1500:1: rule__Data__Group_0_2__0__Impl : ( ( rule__Data__VariableAssignment_0_2_0 ) ) ;
    public final void rule__Data__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1504:1: ( ( ( rule__Data__VariableAssignment_0_2_0 ) ) )
            // InternalTestintentionsAssistance.g:1505:1: ( ( rule__Data__VariableAssignment_0_2_0 ) )
            {
            // InternalTestintentionsAssistance.g:1505:1: ( ( rule__Data__VariableAssignment_0_2_0 ) )
            // InternalTestintentionsAssistance.g:1506:2: ( rule__Data__VariableAssignment_0_2_0 )
            {
             before(grammarAccess.getDataAccess().getVariableAssignment_0_2_0()); 
            // InternalTestintentionsAssistance.g:1507:2: ( rule__Data__VariableAssignment_0_2_0 )
            // InternalTestintentionsAssistance.g:1507:3: rule__Data__VariableAssignment_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Data__VariableAssignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getVariableAssignment_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_0_2__0__Impl"


    // $ANTLR start "rule__Data__Group_0_2__1"
    // InternalTestintentionsAssistance.g:1515:1: rule__Data__Group_0_2__1 : rule__Data__Group_0_2__1__Impl rule__Data__Group_0_2__2 ;
    public final void rule__Data__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1519:1: ( rule__Data__Group_0_2__1__Impl rule__Data__Group_0_2__2 )
            // InternalTestintentionsAssistance.g:1520:2: rule__Data__Group_0_2__1__Impl rule__Data__Group_0_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Data__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0_2__2();

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
    // $ANTLR end "rule__Data__Group_0_2__1"


    // $ANTLR start "rule__Data__Group_0_2__1__Impl"
    // InternalTestintentionsAssistance.g:1527:1: rule__Data__Group_0_2__1__Impl : ( ':=' ) ;
    public final void rule__Data__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1531:1: ( ( ':=' ) )
            // InternalTestintentionsAssistance.g:1532:1: ( ':=' )
            {
            // InternalTestintentionsAssistance.g:1532:1: ( ':=' )
            // InternalTestintentionsAssistance.g:1533:2: ':='
            {
             before(grammarAccess.getDataAccess().getColonEqualsSignKeyword_0_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getColonEqualsSignKeyword_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_0_2__1__Impl"


    // $ANTLR start "rule__Data__Group_0_2__2"
    // InternalTestintentionsAssistance.g:1542:1: rule__Data__Group_0_2__2 : rule__Data__Group_0_2__2__Impl rule__Data__Group_0_2__3 ;
    public final void rule__Data__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1546:1: ( rule__Data__Group_0_2__2__Impl rule__Data__Group_0_2__3 )
            // InternalTestintentionsAssistance.g:1547:2: rule__Data__Group_0_2__2__Impl rule__Data__Group_0_2__3
            {
            pushFollow(FOLLOW_15);
            rule__Data__Group_0_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_0_2__3();

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
    // $ANTLR end "rule__Data__Group_0_2__2"


    // $ANTLR start "rule__Data__Group_0_2__2__Impl"
    // InternalTestintentionsAssistance.g:1554:1: rule__Data__Group_0_2__2__Impl : ( ( rule__Data__ValAssignment_0_2_2 ) ) ;
    public final void rule__Data__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1558:1: ( ( ( rule__Data__ValAssignment_0_2_2 ) ) )
            // InternalTestintentionsAssistance.g:1559:1: ( ( rule__Data__ValAssignment_0_2_2 ) )
            {
            // InternalTestintentionsAssistance.g:1559:1: ( ( rule__Data__ValAssignment_0_2_2 ) )
            // InternalTestintentionsAssistance.g:1560:2: ( rule__Data__ValAssignment_0_2_2 )
            {
             before(grammarAccess.getDataAccess().getValAssignment_0_2_2()); 
            // InternalTestintentionsAssistance.g:1561:2: ( rule__Data__ValAssignment_0_2_2 )
            // InternalTestintentionsAssistance.g:1561:3: rule__Data__ValAssignment_0_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__ValAssignment_0_2_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getValAssignment_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_0_2__2__Impl"


    // $ANTLR start "rule__Data__Group_0_2__3"
    // InternalTestintentionsAssistance.g:1569:1: rule__Data__Group_0_2__3 : rule__Data__Group_0_2__3__Impl ;
    public final void rule__Data__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1573:1: ( rule__Data__Group_0_2__3__Impl )
            // InternalTestintentionsAssistance.g:1574:2: rule__Data__Group_0_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_0_2__3__Impl();

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
    // $ANTLR end "rule__Data__Group_0_2__3"


    // $ANTLR start "rule__Data__Group_0_2__3__Impl"
    // InternalTestintentionsAssistance.g:1580:1: rule__Data__Group_0_2__3__Impl : ( ',' ) ;
    public final void rule__Data__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1584:1: ( ( ',' ) )
            // InternalTestintentionsAssistance.g:1585:1: ( ',' )
            {
            // InternalTestintentionsAssistance.g:1585:1: ( ',' )
            // InternalTestintentionsAssistance.g:1586:2: ','
            {
             before(grammarAccess.getDataAccess().getCommaKeyword_0_2_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getCommaKeyword_0_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_0_2__3__Impl"


    // $ANTLR start "rule__Data__Group_1__0"
    // InternalTestintentionsAssistance.g:1596:1: rule__Data__Group_1__0 : rule__Data__Group_1__0__Impl rule__Data__Group_1__1 ;
    public final void rule__Data__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1600:1: ( rule__Data__Group_1__0__Impl rule__Data__Group_1__1 )
            // InternalTestintentionsAssistance.g:1601:2: rule__Data__Group_1__0__Impl rule__Data__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_1__1();

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
    // $ANTLR end "rule__Data__Group_1__0"


    // $ANTLR start "rule__Data__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:1608:1: rule__Data__Group_1__0__Impl : ( ( rule__Data__VariableAssignment_1_0 ) ) ;
    public final void rule__Data__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1612:1: ( ( ( rule__Data__VariableAssignment_1_0 ) ) )
            // InternalTestintentionsAssistance.g:1613:1: ( ( rule__Data__VariableAssignment_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:1613:1: ( ( rule__Data__VariableAssignment_1_0 ) )
            // InternalTestintentionsAssistance.g:1614:2: ( rule__Data__VariableAssignment_1_0 )
            {
             before(grammarAccess.getDataAccess().getVariableAssignment_1_0()); 
            // InternalTestintentionsAssistance.g:1615:2: ( rule__Data__VariableAssignment_1_0 )
            // InternalTestintentionsAssistance.g:1615:3: rule__Data__VariableAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Data__VariableAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getVariableAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_1__0__Impl"


    // $ANTLR start "rule__Data__Group_1__1"
    // InternalTestintentionsAssistance.g:1623:1: rule__Data__Group_1__1 : rule__Data__Group_1__1__Impl rule__Data__Group_1__2 ;
    public final void rule__Data__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1627:1: ( rule__Data__Group_1__1__Impl rule__Data__Group_1__2 )
            // InternalTestintentionsAssistance.g:1628:2: rule__Data__Group_1__1__Impl rule__Data__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__Data__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_1__2();

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
    // $ANTLR end "rule__Data__Group_1__1"


    // $ANTLR start "rule__Data__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:1635:1: rule__Data__Group_1__1__Impl : ( ':=' ) ;
    public final void rule__Data__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1639:1: ( ( ':=' ) )
            // InternalTestintentionsAssistance.g:1640:1: ( ':=' )
            {
            // InternalTestintentionsAssistance.g:1640:1: ( ':=' )
            // InternalTestintentionsAssistance.g:1641:2: ':='
            {
             before(grammarAccess.getDataAccess().getColonEqualsSignKeyword_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getColonEqualsSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_1__1__Impl"


    // $ANTLR start "rule__Data__Group_1__2"
    // InternalTestintentionsAssistance.g:1650:1: rule__Data__Group_1__2 : rule__Data__Group_1__2__Impl rule__Data__Group_1__3 ;
    public final void rule__Data__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1654:1: ( rule__Data__Group_1__2__Impl rule__Data__Group_1__3 )
            // InternalTestintentionsAssistance.g:1655:2: rule__Data__Group_1__2__Impl rule__Data__Group_1__3
            {
            pushFollow(FOLLOW_14);
            rule__Data__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_1__3();

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
    // $ANTLR end "rule__Data__Group_1__2"


    // $ANTLR start "rule__Data__Group_1__2__Impl"
    // InternalTestintentionsAssistance.g:1662:1: rule__Data__Group_1__2__Impl : ( ( rule__Data__ValAssignment_1_2 ) ) ;
    public final void rule__Data__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1666:1: ( ( ( rule__Data__ValAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:1667:1: ( ( rule__Data__ValAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:1667:1: ( ( rule__Data__ValAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:1668:2: ( rule__Data__ValAssignment_1_2 )
            {
             before(grammarAccess.getDataAccess().getValAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:1669:2: ( rule__Data__ValAssignment_1_2 )
            // InternalTestintentionsAssistance.g:1669:3: rule__Data__ValAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__ValAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getValAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_1__2__Impl"


    // $ANTLR start "rule__Data__Group_1__3"
    // InternalTestintentionsAssistance.g:1677:1: rule__Data__Group_1__3 : rule__Data__Group_1__3__Impl ;
    public final void rule__Data__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1681:1: ( rule__Data__Group_1__3__Impl )
            // InternalTestintentionsAssistance.g:1682:2: rule__Data__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_1__3__Impl();

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
    // $ANTLR end "rule__Data__Group_1__3"


    // $ANTLR start "rule__Data__Group_1__3__Impl"
    // InternalTestintentionsAssistance.g:1688:1: rule__Data__Group_1__3__Impl : ( ( ')' )* ) ;
    public final void rule__Data__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1692:1: ( ( ( ')' )* ) )
            // InternalTestintentionsAssistance.g:1693:1: ( ( ')' )* )
            {
            // InternalTestintentionsAssistance.g:1693:1: ( ( ')' )* )
            // InternalTestintentionsAssistance.g:1694:2: ( ')' )*
            {
             before(grammarAccess.getDataAccess().getRightParenthesisKeyword_1_3()); 
            // InternalTestintentionsAssistance.g:1695:2: ( ')' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1695:3: ')'
            	    {
            	    match(input,32,FOLLOW_19); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_1__3__Impl"


    // $ANTLR start "rule__TestIntention__Group__0"
    // InternalTestintentionsAssistance.g:1704:1: rule__TestIntention__Group__0 : rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1 ;
    public final void rule__TestIntention__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1708:1: ( rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1 )
            // InternalTestintentionsAssistance.g:1709:2: rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__TestIntention__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__1();

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
    // $ANTLR end "rule__TestIntention__Group__0"


    // $ANTLR start "rule__TestIntention__Group__0__Impl"
    // InternalTestintentionsAssistance.g:1716:1: rule__TestIntention__Group__0__Impl : ( 'description:' ) ;
    public final void rule__TestIntention__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1720:1: ( ( 'description:' ) )
            // InternalTestintentionsAssistance.g:1721:1: ( 'description:' )
            {
            // InternalTestintentionsAssistance.g:1721:1: ( 'description:' )
            // InternalTestintentionsAssistance.g:1722:2: 'description:'
            {
             before(grammarAccess.getTestIntentionAccess().getDescriptionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTestIntentionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__0__Impl"


    // $ANTLR start "rule__TestIntention__Group__1"
    // InternalTestintentionsAssistance.g:1731:1: rule__TestIntention__Group__1 : rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2 ;
    public final void rule__TestIntention__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1735:1: ( rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2 )
            // InternalTestintentionsAssistance.g:1736:2: rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__TestIntention__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__2();

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
    // $ANTLR end "rule__TestIntention__Group__1"


    // $ANTLR start "rule__TestIntention__Group__1__Impl"
    // InternalTestintentionsAssistance.g:1743:1: rule__TestIntention__Group__1__Impl : ( ( rule__TestIntention__DescriptionAssignment_1 ) ) ;
    public final void rule__TestIntention__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1747:1: ( ( ( rule__TestIntention__DescriptionAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:1748:1: ( ( rule__TestIntention__DescriptionAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:1748:1: ( ( rule__TestIntention__DescriptionAssignment_1 ) )
            // InternalTestintentionsAssistance.g:1749:2: ( rule__TestIntention__DescriptionAssignment_1 )
            {
             before(grammarAccess.getTestIntentionAccess().getDescriptionAssignment_1()); 
            // InternalTestintentionsAssistance.g:1750:2: ( rule__TestIntention__DescriptionAssignment_1 )
            // InternalTestintentionsAssistance.g:1750:3: rule__TestIntention__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTestIntentionAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__1__Impl"


    // $ANTLR start "rule__TestIntention__Group__2"
    // InternalTestintentionsAssistance.g:1758:1: rule__TestIntention__Group__2 : rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3 ;
    public final void rule__TestIntention__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1762:1: ( rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3 )
            // InternalTestintentionsAssistance.g:1763:2: rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__TestIntention__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__3();

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
    // $ANTLR end "rule__TestIntention__Group__2"


    // $ANTLR start "rule__TestIntention__Group__2__Impl"
    // InternalTestintentionsAssistance.g:1770:1: rule__TestIntention__Group__2__Impl : ( 'datapredicate:' ) ;
    public final void rule__TestIntention__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1774:1: ( ( 'datapredicate:' ) )
            // InternalTestintentionsAssistance.g:1775:1: ( 'datapredicate:' )
            {
            // InternalTestintentionsAssistance.g:1775:1: ( 'datapredicate:' )
            // InternalTestintentionsAssistance.g:1776:2: 'datapredicate:'
            {
             before(grammarAccess.getTestIntentionAccess().getDatapredicateKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTestIntentionAccess().getDatapredicateKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__2__Impl"


    // $ANTLR start "rule__TestIntention__Group__3"
    // InternalTestintentionsAssistance.g:1785:1: rule__TestIntention__Group__3 : rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4 ;
    public final void rule__TestIntention__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1789:1: ( rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4 )
            // InternalTestintentionsAssistance.g:1790:2: rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__TestIntention__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__4();

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
    // $ANTLR end "rule__TestIntention__Group__3"


    // $ANTLR start "rule__TestIntention__Group__3__Impl"
    // InternalTestintentionsAssistance.g:1797:1: rule__TestIntention__Group__3__Impl : ( ( rule__TestIntention__ExpressionAssignment_3 ) ) ;
    public final void rule__TestIntention__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1801:1: ( ( ( rule__TestIntention__ExpressionAssignment_3 ) ) )
            // InternalTestintentionsAssistance.g:1802:1: ( ( rule__TestIntention__ExpressionAssignment_3 ) )
            {
            // InternalTestintentionsAssistance.g:1802:1: ( ( rule__TestIntention__ExpressionAssignment_3 ) )
            // InternalTestintentionsAssistance.g:1803:2: ( rule__TestIntention__ExpressionAssignment_3 )
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionAssignment_3()); 
            // InternalTestintentionsAssistance.g:1804:2: ( rule__TestIntention__ExpressionAssignment_3 )
            // InternalTestintentionsAssistance.g:1804:3: rule__TestIntention__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTestIntentionAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__3__Impl"


    // $ANTLR start "rule__TestIntention__Group__4"
    // InternalTestintentionsAssistance.g:1812:1: rule__TestIntention__Group__4 : rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5 ;
    public final void rule__TestIntention__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1816:1: ( rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5 )
            // InternalTestintentionsAssistance.g:1817:2: rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__TestIntention__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__5();

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
    // $ANTLR end "rule__TestIntention__Group__4"


    // $ANTLR start "rule__TestIntention__Group__4__Impl"
    // InternalTestintentionsAssistance.g:1824:1: rule__TestIntention__Group__4__Impl : ( 'oracle:' ) ;
    public final void rule__TestIntention__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1828:1: ( ( 'oracle:' ) )
            // InternalTestintentionsAssistance.g:1829:1: ( 'oracle:' )
            {
            // InternalTestintentionsAssistance.g:1829:1: ( 'oracle:' )
            // InternalTestintentionsAssistance.g:1830:2: 'oracle:'
            {
             before(grammarAccess.getTestIntentionAccess().getOracleKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTestIntentionAccess().getOracleKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__4__Impl"


    // $ANTLR start "rule__TestIntention__Group__5"
    // InternalTestintentionsAssistance.g:1839:1: rule__TestIntention__Group__5 : rule__TestIntention__Group__5__Impl ;
    public final void rule__TestIntention__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1843:1: ( rule__TestIntention__Group__5__Impl )
            // InternalTestintentionsAssistance.g:1844:2: rule__TestIntention__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__5__Impl();

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
    // $ANTLR end "rule__TestIntention__Group__5"


    // $ANTLR start "rule__TestIntention__Group__5__Impl"
    // InternalTestintentionsAssistance.g:1850:1: rule__TestIntention__Group__5__Impl : ( ( rule__TestIntention__ExpressionAssignment_5 ) ) ;
    public final void rule__TestIntention__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1854:1: ( ( ( rule__TestIntention__ExpressionAssignment_5 ) ) )
            // InternalTestintentionsAssistance.g:1855:1: ( ( rule__TestIntention__ExpressionAssignment_5 ) )
            {
            // InternalTestintentionsAssistance.g:1855:1: ( ( rule__TestIntention__ExpressionAssignment_5 ) )
            // InternalTestintentionsAssistance.g:1856:2: ( rule__TestIntention__ExpressionAssignment_5 )
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionAssignment_5()); 
            // InternalTestintentionsAssistance.g:1857:2: ( rule__TestIntention__ExpressionAssignment_5 )
            // InternalTestintentionsAssistance.g:1857:3: rule__TestIntention__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTestIntentionAccess().getExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__5__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalTestintentionsAssistance.g:1866:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1870:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalTestintentionsAssistance.g:1871:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalTestintentionsAssistance.g:1878:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1882:1: ( ( ruleAnd ) )
            // InternalTestintentionsAssistance.g:1883:1: ( ruleAnd )
            {
            // InternalTestintentionsAssistance.g:1883:1: ( ruleAnd )
            // InternalTestintentionsAssistance.g:1884:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalTestintentionsAssistance.g:1893:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1897:1: ( rule__Or__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1898:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalTestintentionsAssistance.g:1904:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1908:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:1909:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:1909:1: ( ( rule__Or__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:1910:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:1911:2: ( rule__Or__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1911:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalTestintentionsAssistance.g:1920:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1924:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalTestintentionsAssistance.g:1925:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:1932:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1936:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:1937:1: ( () )
            {
            // InternalTestintentionsAssistance.g:1937:1: ( () )
            // InternalTestintentionsAssistance.g:1938:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:1939:2: ()
            // InternalTestintentionsAssistance.g:1939:3: 
            {
            }

             after(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalTestintentionsAssistance.g:1947:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1951:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalTestintentionsAssistance.g:1952:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:1959:1: rule__Or__Group_1__1__Impl : ( '\\u2228' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1963:1: ( ( '\\u2228' ) )
            // InternalTestintentionsAssistance.g:1964:1: ( '\\u2228' )
            {
            // InternalTestintentionsAssistance.g:1964:1: ( '\\u2228' )
            // InternalTestintentionsAssistance.g:1965:2: '\\u2228'
            {
             before(grammarAccess.getOrAccess().getLogicalOrKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getLogicalOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalTestintentionsAssistance.g:1974:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1978:1: ( rule__Or__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:1979:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalTestintentionsAssistance.g:1985:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1989:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:1990:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:1990:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:1991:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:1992:2: ( rule__Or__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:1992:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalTestintentionsAssistance.g:2001:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2005:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalTestintentionsAssistance.g:2006:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalTestintentionsAssistance.g:2013:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2017:1: ( ( ruleEquality ) )
            // InternalTestintentionsAssistance.g:2018:1: ( ruleEquality )
            {
            // InternalTestintentionsAssistance.g:2018:1: ( ruleEquality )
            // InternalTestintentionsAssistance.g:2019:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalTestintentionsAssistance.g:2028:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2032:1: ( rule__And__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2033:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalTestintentionsAssistance.g:2039:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2043:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2044:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2044:1: ( ( rule__And__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2045:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2046:2: ( rule__And__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2046:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalTestintentionsAssistance.g:2055:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2059:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalTestintentionsAssistance.g:2060:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:2067:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2071:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2072:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2072:1: ( () )
            // InternalTestintentionsAssistance.g:2073:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2074:2: ()
            // InternalTestintentionsAssistance.g:2074:3: 
            {
            }

             after(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalTestintentionsAssistance.g:2082:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2086:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalTestintentionsAssistance.g:2087:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:2094:1: rule__And__Group_1__1__Impl : ( '\\u2227' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2098:1: ( ( '\\u2227' ) )
            // InternalTestintentionsAssistance.g:2099:1: ( '\\u2227' )
            {
            // InternalTestintentionsAssistance.g:2099:1: ( '\\u2227' )
            // InternalTestintentionsAssistance.g:2100:2: '\\u2227'
            {
             before(grammarAccess.getAndAccess().getLogicalAndKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getLogicalAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalTestintentionsAssistance.g:2109:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2113:1: ( rule__And__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2114:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalTestintentionsAssistance.g:2120:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2124:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2125:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2125:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2126:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2127:2: ( rule__And__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2127:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalTestintentionsAssistance.g:2136:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2140:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalTestintentionsAssistance.g:2141:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalTestintentionsAssistance.g:2148:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2152:1: ( ( ruleComparison ) )
            // InternalTestintentionsAssistance.g:2153:1: ( ruleComparison )
            {
            // InternalTestintentionsAssistance.g:2153:1: ( ruleComparison )
            // InternalTestintentionsAssistance.g:2154:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalTestintentionsAssistance.g:2163:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2167:1: ( rule__Equality__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2168:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalTestintentionsAssistance.g:2174:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2178:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2179:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2179:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2180:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2181:2: ( rule__Equality__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2181:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalTestintentionsAssistance.g:2190:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2194:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalTestintentionsAssistance.g:2195:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:2202:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2206:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2207:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2207:1: ( () )
            // InternalTestintentionsAssistance.g:2208:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2209:2: ()
            // InternalTestintentionsAssistance.g:2209:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalTestintentionsAssistance.g:2217:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2221:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalTestintentionsAssistance.g:2222:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:2229:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2233:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2234:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2234:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2235:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2236:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2236:3: rule__Equality__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalTestintentionsAssistance.g:2244:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2248:1: ( rule__Equality__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2249:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalTestintentionsAssistance.g:2255:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2259:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2260:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2260:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2261:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2262:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2262:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalTestintentionsAssistance.g:2271:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2275:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalTestintentionsAssistance.g:2276:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalTestintentionsAssistance.g:2283:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2287:1: ( ( rulePlusOrMinus ) )
            // InternalTestintentionsAssistance.g:2288:1: ( rulePlusOrMinus )
            {
            // InternalTestintentionsAssistance.g:2288:1: ( rulePlusOrMinus )
            // InternalTestintentionsAssistance.g:2289:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalTestintentionsAssistance.g:2298:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2302:1: ( rule__Comparison__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2303:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalTestintentionsAssistance.g:2309:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2313:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2314:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2314:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2315:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2316:2: ( rule__Comparison__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=13 && LA21_0<=16)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2316:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalTestintentionsAssistance.g:2325:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2329:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalTestintentionsAssistance.g:2330:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:2337:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2341:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2342:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2342:1: ( () )
            // InternalTestintentionsAssistance.g:2343:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2344:2: ()
            // InternalTestintentionsAssistance.g:2344:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalTestintentionsAssistance.g:2352:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2356:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalTestintentionsAssistance.g:2357:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:2364:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2368:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2369:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2369:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2370:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2371:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2371:3: rule__Comparison__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalTestintentionsAssistance.g:2379:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2383:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2384:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalTestintentionsAssistance.g:2390:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2394:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2395:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2395:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2396:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2397:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2397:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalTestintentionsAssistance.g:2406:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2410:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalTestintentionsAssistance.g:2411:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalTestintentionsAssistance.g:2418:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2422:1: ( ( ruleMulOrDiv ) )
            // InternalTestintentionsAssistance.g:2423:1: ( ruleMulOrDiv )
            {
            // InternalTestintentionsAssistance.g:2423:1: ( ruleMulOrDiv )
            // InternalTestintentionsAssistance.g:2424:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalTestintentionsAssistance.g:2433:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2437:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2438:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalTestintentionsAssistance.g:2444:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2448:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2449:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2449:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2450:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2451:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2451:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalTestintentionsAssistance.g:2460:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2464:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalTestintentionsAssistance.g:2465:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:2472:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2476:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalTestintentionsAssistance.g:2477:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:2477:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalTestintentionsAssistance.g:2478:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalTestintentionsAssistance.g:2479:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalTestintentionsAssistance.g:2479:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalTestintentionsAssistance.g:2487:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2491:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:2492:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:2498:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2502:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2503:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2503:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2504:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2505:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2505:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalTestintentionsAssistance.g:2514:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2518:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalTestintentionsAssistance.g:2519:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_34);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalTestintentionsAssistance.g:2526:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2530:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2531:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2531:1: ( () )
            // InternalTestintentionsAssistance.g:2532:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalTestintentionsAssistance.g:2533:2: ()
            // InternalTestintentionsAssistance.g:2533:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalTestintentionsAssistance.g:2541:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2545:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalTestintentionsAssistance.g:2546:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalTestintentionsAssistance.g:2552:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2556:1: ( ( '+' ) )
            // InternalTestintentionsAssistance.g:2557:1: ( '+' )
            {
            // InternalTestintentionsAssistance.g:2557:1: ( '+' )
            // InternalTestintentionsAssistance.g:2558:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalTestintentionsAssistance.g:2568:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2572:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalTestintentionsAssistance.g:2573:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_32);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalTestintentionsAssistance.g:2580:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2584:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2585:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2585:1: ( () )
            // InternalTestintentionsAssistance.g:2586:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalTestintentionsAssistance.g:2587:2: ()
            // InternalTestintentionsAssistance.g:2587:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalTestintentionsAssistance.g:2595:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2599:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalTestintentionsAssistance.g:2600:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalTestintentionsAssistance.g:2606:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2610:1: ( ( '-' ) )
            // InternalTestintentionsAssistance.g:2611:1: ( '-' )
            {
            // InternalTestintentionsAssistance.g:2611:1: ( '-' )
            // InternalTestintentionsAssistance.g:2612:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalTestintentionsAssistance.g:2622:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2626:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalTestintentionsAssistance.g:2627:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalTestintentionsAssistance.g:2634:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2638:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:2639:1: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:2639:1: ( rulePrimary )
            // InternalTestintentionsAssistance.g:2640:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalTestintentionsAssistance.g:2649:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2653:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2654:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalTestintentionsAssistance.g:2660:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2664:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2665:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2665:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2666:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2667:2: ( rule__MulOrDiv__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2667:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalTestintentionsAssistance.g:2676:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2680:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalTestintentionsAssistance.g:2681:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:2688:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2692:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2693:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2693:1: ( () )
            // InternalTestintentionsAssistance.g:2694:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2695:2: ()
            // InternalTestintentionsAssistance.g:2695:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalTestintentionsAssistance.g:2703:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2707:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalTestintentionsAssistance.g:2708:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__MulOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:2715:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2719:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2720:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2720:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2721:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2722:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2722:3: rule__MulOrDiv__OpAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__2"
    // InternalTestintentionsAssistance.g:2730:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2734:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2735:2: rule__MulOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__2__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__2"


    // $ANTLR start "rule__MulOrDiv__Group_1__2__Impl"
    // InternalTestintentionsAssistance.g:2741:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2745:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2746:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2746:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2747:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2748:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2748:3: rule__MulOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalTestintentionsAssistance.g:2757:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2761:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTestintentionsAssistance.g:2762:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalTestintentionsAssistance.g:2769:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2773:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:2774:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:2774:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalTestintentionsAssistance.g:2775:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalTestintentionsAssistance.g:2776:2: ( rule__Variable__NameAssignment_0 )
            // InternalTestintentionsAssistance.g:2776:3: rule__Variable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:2784:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2788:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTestintentionsAssistance.g:2789:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalTestintentionsAssistance.g:2796:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2800:1: ( ( ':' ) )
            // InternalTestintentionsAssistance.g:2801:1: ( ':' )
            {
            // InternalTestintentionsAssistance.g:2801:1: ( ':' )
            // InternalTestintentionsAssistance.g:2802:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:2811:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2815:1: ( rule__Variable__Group__2__Impl )
            // InternalTestintentionsAssistance.g:2816:2: rule__Variable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__2__Impl();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalTestintentionsAssistance.g:2822:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2826:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalTestintentionsAssistance.g:2827:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalTestintentionsAssistance.g:2827:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalTestintentionsAssistance.g:2828:2: ( rule__Variable__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // InternalTestintentionsAssistance.g:2829:2: ( rule__Variable__TypeAssignment_2 )
            // InternalTestintentionsAssistance.g:2829:3: rule__Variable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalTestintentionsAssistance.g:2838:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2842:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalTestintentionsAssistance.g:2843:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

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
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalTestintentionsAssistance.g:2850:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2854:1: ( ( '(' ) )
            // InternalTestintentionsAssistance.g:2855:1: ( '(' )
            {
            // InternalTestintentionsAssistance.g:2855:1: ( '(' )
            // InternalTestintentionsAssistance.g:2856:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalTestintentionsAssistance.g:2865:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2869:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalTestintentionsAssistance.g:2870:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

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
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalTestintentionsAssistance.g:2877:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2881:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:2882:1: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:2882:1: ( ruleExpression )
            // InternalTestintentionsAssistance.g:2883:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalTestintentionsAssistance.g:2892:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2896:1: ( rule__Primary__Group_0__2__Impl )
            // InternalTestintentionsAssistance.g:2897:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalTestintentionsAssistance.g:2903:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2907:1: ( ( ')' ) )
            // InternalTestintentionsAssistance.g:2908:1: ( ')' )
            {
            // InternalTestintentionsAssistance.g:2908:1: ( ')' )
            // InternalTestintentionsAssistance.g:2909:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalTestintentionsAssistance.g:2919:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2923:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalTestintentionsAssistance.g:2924:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:2931:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2935:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2936:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2936:1: ( () )
            // InternalTestintentionsAssistance.g:2937:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalTestintentionsAssistance.g:2938:2: ()
            // InternalTestintentionsAssistance.g:2938:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalTestintentionsAssistance.g:2946:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2950:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalTestintentionsAssistance.g:2951:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_22);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:2958:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2962:1: ( ( '!' ) )
            // InternalTestintentionsAssistance.g:2963:1: ( '!' )
            {
            // InternalTestintentionsAssistance.g:2963:1: ( '!' )
            // InternalTestintentionsAssistance.g:2964:2: '!'
            {
             before(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalTestintentionsAssistance.g:2973:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2977:1: ( rule__Primary__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2978:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalTestintentionsAssistance.g:2984:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2988:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2989:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2989:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2990:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2991:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2991:3: rule__Primary__ExpressionAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__ExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalTestintentionsAssistance.g:3000:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3004:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalTestintentionsAssistance.g:3005:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_40);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalTestintentionsAssistance.g:3012:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3016:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3017:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3017:1: ( () )
            // InternalTestintentionsAssistance.g:3018:2: ()
            {
             before(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 
            // InternalTestintentionsAssistance.g:3019:2: ()
            // InternalTestintentionsAssistance.g:3019:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getIntConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalTestintentionsAssistance.g:3027:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3031:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalTestintentionsAssistance.g:3032:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalTestintentionsAssistance.g:3038:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3042:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalTestintentionsAssistance.g:3043:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalTestintentionsAssistance.g:3043:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalTestintentionsAssistance.g:3044:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalTestintentionsAssistance.g:3045:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalTestintentionsAssistance.g:3045:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalTestintentionsAssistance.g:3054:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3058:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalTestintentionsAssistance.g:3059:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:3066:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3070:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3071:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3071:1: ( () )
            // InternalTestintentionsAssistance.g:3072:2: ()
            {
             before(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 
            // InternalTestintentionsAssistance.g:3073:2: ()
            // InternalTestintentionsAssistance.g:3073:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getStringConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalTestintentionsAssistance.g:3081:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3085:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:3086:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:3092:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3096:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:3097:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:3097:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:3098:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:3099:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalTestintentionsAssistance.g:3099:3: rule__Atomic__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__Atomic__Group_2__0"
    // InternalTestintentionsAssistance.g:3108:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3112:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalTestintentionsAssistance.g:3113:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_41);
            rule__Atomic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1();

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
    // $ANTLR end "rule__Atomic__Group_2__0"


    // $ANTLR start "rule__Atomic__Group_2__0__Impl"
    // InternalTestintentionsAssistance.g:3120:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3124:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3125:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3125:1: ( () )
            // InternalTestintentionsAssistance.g:3126:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 
            // InternalTestintentionsAssistance.g:3127:2: ()
            // InternalTestintentionsAssistance.g:3127:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__0__Impl"


    // $ANTLR start "rule__Atomic__Group_2__1"
    // InternalTestintentionsAssistance.g:3135:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3139:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalTestintentionsAssistance.g:3140:2: rule__Atomic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_2__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_2__1"


    // $ANTLR start "rule__Atomic__Group_2__1__Impl"
    // InternalTestintentionsAssistance.g:3146:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3150:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalTestintentionsAssistance.g:3151:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalTestintentionsAssistance.g:3151:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalTestintentionsAssistance.g:3152:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalTestintentionsAssistance.g:3153:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalTestintentionsAssistance.g:3153:3: rule__Atomic__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_2__1__Impl"


    // $ANTLR start "rule__Atomic__Group_3__0"
    // InternalTestintentionsAssistance.g:3162:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3166:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalTestintentionsAssistance.g:3167:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Atomic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1();

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
    // $ANTLR end "rule__Atomic__Group_3__0"


    // $ANTLR start "rule__Atomic__Group_3__0__Impl"
    // InternalTestintentionsAssistance.g:3174:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3178:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3179:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3179:1: ( () )
            // InternalTestintentionsAssistance.g:3180:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 
            // InternalTestintentionsAssistance.g:3181:2: ()
            // InternalTestintentionsAssistance.g:3181:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__0__Impl"


    // $ANTLR start "rule__Atomic__Group_3__1"
    // InternalTestintentionsAssistance.g:3189:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3193:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalTestintentionsAssistance.g:3194:2: rule__Atomic__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_3__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_3__1"


    // $ANTLR start "rule__Atomic__Group_3__1__Impl"
    // InternalTestintentionsAssistance.g:3200:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__VariableAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3204:1: ( ( ( rule__Atomic__VariableAssignment_3_1 ) ) )
            // InternalTestintentionsAssistance.g:3205:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            {
            // InternalTestintentionsAssistance.g:3205:1: ( ( rule__Atomic__VariableAssignment_3_1 ) )
            // InternalTestintentionsAssistance.g:3206:2: ( rule__Atomic__VariableAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 
            // InternalTestintentionsAssistance.g:3207:2: ( rule__Atomic__VariableAssignment_3_1 )
            // InternalTestintentionsAssistance.g:3207:3: rule__Atomic__VariableAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__VariableAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_3__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalTestintentionsAssistance.g:3216:1: rule__Model__ElementsAssignment : ( ruleDomainDeclaration ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3220:1: ( ( ruleDomainDeclaration ) )
            // InternalTestintentionsAssistance.g:3221:2: ( ruleDomainDeclaration )
            {
            // InternalTestintentionsAssistance.g:3221:2: ( ruleDomainDeclaration )
            // InternalTestintentionsAssistance.g:3222:3: ruleDomainDeclaration
            {
             before(grammarAccess.getModelAccess().getElementsDomainDeclarationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDomainDeclaration();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsDomainDeclarationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__DomainDeclaration__NameAssignment_1"
    // InternalTestintentionsAssistance.g:3231:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3235:1: ( ( ruleQualifiedName ) )
            // InternalTestintentionsAssistance.g:3236:2: ( ruleQualifiedName )
            {
            // InternalTestintentionsAssistance.g:3236:2: ( ruleQualifiedName )
            // InternalTestintentionsAssistance.g:3237:3: ruleQualifiedName
            {
             before(grammarAccess.getDomainDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDomainDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:3246:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3250:1: ( ( ruleAbstractElement ) )
            // InternalTestintentionsAssistance.g:3251:2: ( ruleAbstractElement )
            {
            // InternalTestintentionsAssistance.g:3251:2: ( ruleAbstractElement )
            // InternalTestintentionsAssistance.g:3252:3: ruleAbstractElement
            {
             before(grammarAccess.getDomainDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalTestintentionsAssistance.g:3261:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3265:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalTestintentionsAssistance.g:3266:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalTestintentionsAssistance.g:3266:2: ( ruleQualifiedNameWithWildcard )
            // InternalTestintentionsAssistance.g:3267:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Function__OutAssignment_0"
    // InternalTestintentionsAssistance.g:3276:1: rule__Function__OutAssignment_0 : ( ruleVariable ) ;
    public final void rule__Function__OutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3280:1: ( ( ruleVariable ) )
            // InternalTestintentionsAssistance.g:3281:2: ( ruleVariable )
            {
            // InternalTestintentionsAssistance.g:3281:2: ( ruleVariable )
            // InternalTestintentionsAssistance.g:3282:3: ruleVariable
            {
             before(grammarAccess.getFunctionAccess().getOutVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOutVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__OutAssignment_0"


    // $ANTLR start "rule__Function__MethodeAssignment_2"
    // InternalTestintentionsAssistance.g:3291:1: rule__Function__MethodeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__MethodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3295:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3296:2: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:3296:2: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3297:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getMethodeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getMethodeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__MethodeAssignment_2"


    // $ANTLR start "rule__Function__ArgAssignment_4_0"
    // InternalTestintentionsAssistance.g:3306:1: rule__Function__ArgAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Function__ArgAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3310:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3311:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3311:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3312:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getArgVariableCrossReference_4_0_0()); 
            // InternalTestintentionsAssistance.g:3313:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3314:4: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getArgVariableIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getArgVariableIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getArgVariableCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ArgAssignment_4_0"


    // $ANTLR start "rule__Function__Arg1Assignment_5"
    // InternalTestintentionsAssistance.g:3325:1: rule__Function__Arg1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Function__Arg1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3329:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3330:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3330:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3331:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getArg1VariableCrossReference_5_0()); 
            // InternalTestintentionsAssistance.g:3332:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3333:4: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getArg1VariableIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getArg1VariableIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getArg1VariableCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Arg1Assignment_5"


    // $ANTLR start "rule__Data__VariableAssignment_0_2_0"
    // InternalTestintentionsAssistance.g:3344:1: rule__Data__VariableAssignment_0_2_0 : ( ruleVariable ) ;
    public final void rule__Data__VariableAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3348:1: ( ( ruleVariable ) )
            // InternalTestintentionsAssistance.g:3349:2: ( ruleVariable )
            {
            // InternalTestintentionsAssistance.g:3349:2: ( ruleVariable )
            // InternalTestintentionsAssistance.g:3350:3: ruleVariable
            {
             before(grammarAccess.getDataAccess().getVariableVariableParserRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDataAccess().getVariableVariableParserRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__VariableAssignment_0_2_0"


    // $ANTLR start "rule__Data__ValAssignment_0_2_2"
    // InternalTestintentionsAssistance.g:3359:1: rule__Data__ValAssignment_0_2_2 : ( ruleAtomic ) ;
    public final void rule__Data__ValAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3363:1: ( ( ruleAtomic ) )
            // InternalTestintentionsAssistance.g:3364:2: ( ruleAtomic )
            {
            // InternalTestintentionsAssistance.g:3364:2: ( ruleAtomic )
            // InternalTestintentionsAssistance.g:3365:3: ruleAtomic
            {
             before(grammarAccess.getDataAccess().getValAtomicParserRuleCall_0_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getDataAccess().getValAtomicParserRuleCall_0_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__ValAssignment_0_2_2"


    // $ANTLR start "rule__Data__VariableAssignment_1_0"
    // InternalTestintentionsAssistance.g:3374:1: rule__Data__VariableAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__Data__VariableAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3378:1: ( ( ruleVariable ) )
            // InternalTestintentionsAssistance.g:3379:2: ( ruleVariable )
            {
            // InternalTestintentionsAssistance.g:3379:2: ( ruleVariable )
            // InternalTestintentionsAssistance.g:3380:3: ruleVariable
            {
             before(grammarAccess.getDataAccess().getVariableVariableParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getDataAccess().getVariableVariableParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__VariableAssignment_1_0"


    // $ANTLR start "rule__Data__ValAssignment_1_2"
    // InternalTestintentionsAssistance.g:3389:1: rule__Data__ValAssignment_1_2 : ( ruleAtomic ) ;
    public final void rule__Data__ValAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3393:1: ( ( ruleAtomic ) )
            // InternalTestintentionsAssistance.g:3394:2: ( ruleAtomic )
            {
            // InternalTestintentionsAssistance.g:3394:2: ( ruleAtomic )
            // InternalTestintentionsAssistance.g:3395:3: ruleAtomic
            {
             before(grammarAccess.getDataAccess().getValAtomicParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getDataAccess().getValAtomicParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__ValAssignment_1_2"


    // $ANTLR start "rule__TestIntention__DescriptionAssignment_1"
    // InternalTestintentionsAssistance.g:3404:1: rule__TestIntention__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TestIntention__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3408:1: ( ( RULE_STRING ) )
            // InternalTestintentionsAssistance.g:3409:2: ( RULE_STRING )
            {
            // InternalTestintentionsAssistance.g:3409:2: ( RULE_STRING )
            // InternalTestintentionsAssistance.g:3410:3: RULE_STRING
            {
             before(grammarAccess.getTestIntentionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTestIntentionAccess().getDescriptionSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__DescriptionAssignment_1"


    // $ANTLR start "rule__TestIntention__ExpressionAssignment_3"
    // InternalTestintentionsAssistance.g:3419:1: rule__TestIntention__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__TestIntention__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3423:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3424:2: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3424:2: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3425:3: ruleExpression
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__ExpressionAssignment_3"


    // $ANTLR start "rule__TestIntention__ExpressionAssignment_5"
    // InternalTestintentionsAssistance.g:3434:1: rule__TestIntention__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__TestIntention__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3438:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3439:2: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3439:2: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3440:3: ruleExpression
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__ExpressionAssignment_5"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalTestintentionsAssistance.g:3449:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3453:1: ( ( ruleAnd ) )
            // InternalTestintentionsAssistance.g:3454:2: ( ruleAnd )
            {
            // InternalTestintentionsAssistance.g:3454:2: ( ruleAnd )
            // InternalTestintentionsAssistance.g:3455:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalTestintentionsAssistance.g:3464:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3468:1: ( ( ruleEquality ) )
            // InternalTestintentionsAssistance.g:3469:2: ( ruleEquality )
            {
            // InternalTestintentionsAssistance.g:3469:2: ( ruleEquality )
            // InternalTestintentionsAssistance.g:3470:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OpAssignment_1_1"
    // InternalTestintentionsAssistance.g:3479:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3483:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3484:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3484:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:3485:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:3486:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:3486:4: rule__Equality__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OpAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalTestintentionsAssistance.g:3494:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3498:1: ( ( ruleComparison ) )
            // InternalTestintentionsAssistance.g:3499:2: ( ruleComparison )
            {
            // InternalTestintentionsAssistance.g:3499:2: ( ruleComparison )
            // InternalTestintentionsAssistance.g:3500:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OpAssignment_1_1"
    // InternalTestintentionsAssistance.g:3509:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3513:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3514:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3514:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:3515:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:3516:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:3516:4: rule__Comparison__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OpAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalTestintentionsAssistance.g:3524:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3528:1: ( ( rulePlusOrMinus ) )
            // InternalTestintentionsAssistance.g:3529:2: ( rulePlusOrMinus )
            {
            // InternalTestintentionsAssistance.g:3529:2: ( rulePlusOrMinus )
            // InternalTestintentionsAssistance.g:3530:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalTestintentionsAssistance.g:3539:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3543:1: ( ( ruleMulOrDiv ) )
            // InternalTestintentionsAssistance.g:3544:2: ( ruleMulOrDiv )
            {
            // InternalTestintentionsAssistance.g:3544:2: ( ruleMulOrDiv )
            // InternalTestintentionsAssistance.g:3545:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_1"
    // InternalTestintentionsAssistance.g:3554:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3558:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3559:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3559:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:3560:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:3561:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:3561:4: rule__MulOrDiv__OpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_2"
    // InternalTestintentionsAssistance.g:3569:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3573:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:3574:2: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:3574:2: ( rulePrimary )
            // InternalTestintentionsAssistance.g:3575:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Variable__NameAssignment_0"
    // InternalTestintentionsAssistance.g:3584:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3588:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3589:2: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:3589:2: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3590:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:3599:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3603:1: ( ( ruleType ) )
            // InternalTestintentionsAssistance.g:3604:2: ( ruleType )
            {
            // InternalTestintentionsAssistance.g:3604:2: ( ruleType )
            // InternalTestintentionsAssistance.g:3605:3: ruleType
            {
             before(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Primary__ExpressionAssignment_1_2"
    // InternalTestintentionsAssistance.g:3614:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3618:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:3619:2: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:3619:2: ( rulePrimary )
            // InternalTestintentionsAssistance.g:3620:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__ExpressionAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalTestintentionsAssistance.g:3629:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3633:1: ( ( RULE_INT ) )
            // InternalTestintentionsAssistance.g:3634:2: ( RULE_INT )
            {
            // InternalTestintentionsAssistance.g:3634:2: ( RULE_INT )
            // InternalTestintentionsAssistance.g:3635:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_1"
    // InternalTestintentionsAssistance.g:3644:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3648:1: ( ( RULE_STRING ) )
            // InternalTestintentionsAssistance.g:3649:2: ( RULE_STRING )
            {
            // InternalTestintentionsAssistance.g:3649:2: ( RULE_STRING )
            // InternalTestintentionsAssistance.g:3650:3: RULE_STRING
            {
             before(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_2_1"
    // InternalTestintentionsAssistance.g:3659:1: rule__Atomic__ValueAssignment_2_1 : ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3663:1: ( ( ( rule__Atomic__ValueAlternatives_2_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3664:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3664:2: ( ( rule__Atomic__ValueAlternatives_2_1_0 ) )
            // InternalTestintentionsAssistance.g:3665:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 
            // InternalTestintentionsAssistance.g:3666:3: ( rule__Atomic__ValueAlternatives_2_1_0 )
            // InternalTestintentionsAssistance.g:3666:4: rule__Atomic__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_2_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_3_1"
    // InternalTestintentionsAssistance.g:3674:1: rule__Atomic__VariableAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3678:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3679:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3679:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3680:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
            // InternalTestintentionsAssistance.g:3681:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3682:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_3_1"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\53\3\uffff\1\25\4\13\1\uffff";
    static final String dfa_3s = "\1\44\1\uffff\1\53\3\uffff\1\30\4\43\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\5\uffff\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\24\uffff\1\5\3\uffff\1\4\4\uffff\1\3\1\uffff\1\1",
            "",
            "\1\6",
            "",
            "",
            "",
            "\1\7\1\10\1\11\1\12",
            "\1\13\27\uffff\1\3",
            "\1\13\27\uffff\1\3",
            "\1\13\27\uffff\1\3",
            "\1\13\27\uffff\1\3",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "543:1: rule__AbstractElement__Alternatives : ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) );";
        }
    }
    static final String dfa_7s = "\17\uffff";
    static final String dfa_8s = "\1\1\16\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\53\1\25\4\13\6\4\1\uffff";
    static final String dfa_10s = "\1\44\1\uffff\1\53\1\30\4\43\1\24\5\44\1\uffff";
    static final String dfa_11s = "\1\uffff\1\2\14\uffff\1\1";
    static final String dfa_12s = "\17\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\1\1\1\uffff\1\1",
            "",
            "\1\3",
            "\1\4\1\5\1\6\1\7",
            "\1\1\27\uffff\1\10",
            "\1\1\27\uffff\1\10",
            "\1\1\27\uffff\1\10",
            "\1\1\27\uffff\1\10",
            "\1\15\1\12\1\11\14\uffff\1\13\1\14",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\1\uffff\1\1",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1479:2: ( rule__Data__Group_0_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000142A000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001422000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100080180070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000180000L});

}