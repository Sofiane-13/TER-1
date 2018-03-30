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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<>'", "'\\u2265'", "'\\u2264'", "'>'", "'<'", "'*'", "'/'", "'true'", "'false'", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'('", "')'", "','", "'input:('", "':='", "'description:'", "'datapredicate:'", "'oracle:'", "'\\u2228'", "'\\u2227'", "'+'", "'-'", "':'", "'!'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleBoolean"
    // InternalTestintentionsAssistance.g:478:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:479:1: ( ruleBoolean EOF )
            // InternalTestintentionsAssistance.g:480:1: ruleBoolean EOF
            {
             before(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanRule()); 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalTestintentionsAssistance.g:487:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:491:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:492:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:492:2: ( ( rule__Boolean__Alternatives ) )
            // InternalTestintentionsAssistance.g:493:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:494:3: ( rule__Boolean__Alternatives )
            // InternalTestintentionsAssistance.g:494:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:503:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:504:1: ( ruleDouble EOF )
            // InternalTestintentionsAssistance.g:505:1: ruleDouble EOF
            {
             before(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getDoubleRule()); 
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
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalTestintentionsAssistance.g:512:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:516:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:517:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:517:2: ( ( rule__Double__Group__0 ) )
            // InternalTestintentionsAssistance.g:518:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:519:3: ( rule__Double__Group__0 )
            // InternalTestintentionsAssistance.g:519:4: rule__Double__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePrimary"
    // InternalTestintentionsAssistance.g:528:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:529:1: ( rulePrimary EOF )
            // InternalTestintentionsAssistance.g:530:1: rulePrimary EOF
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
    // InternalTestintentionsAssistance.g:537:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:541:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:542:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:542:2: ( ( rule__Primary__Alternatives ) )
            // InternalTestintentionsAssistance.g:543:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:544:3: ( rule__Primary__Alternatives )
            // InternalTestintentionsAssistance.g:544:4: rule__Primary__Alternatives
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
    // InternalTestintentionsAssistance.g:553:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:554:1: ( ruleAtomic EOF )
            // InternalTestintentionsAssistance.g:555:1: ruleAtomic EOF
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
    // InternalTestintentionsAssistance.g:562:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:566:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:567:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:567:2: ( ( rule__Atomic__Alternatives ) )
            // InternalTestintentionsAssistance.g:568:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:569:3: ( rule__Atomic__Alternatives )
            // InternalTestintentionsAssistance.g:569:4: rule__Atomic__Alternatives
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
    // InternalTestintentionsAssistance.g:578:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:582:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:583:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:583:2: ( ( rule__Type__Alternatives ) )
            // InternalTestintentionsAssistance.g:584:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:585:3: ( rule__Type__Alternatives )
            // InternalTestintentionsAssistance.g:585:4: rule__Type__Alternatives
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
    // InternalTestintentionsAssistance.g:593:1: rule__AbstractElement__Alternatives : ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:597:1: ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalTestintentionsAssistance.g:598:2: ( ruleTestIntention )
                    {
                    // InternalTestintentionsAssistance.g:598:2: ( ruleTestIntention )
                    // InternalTestintentionsAssistance.g:599:3: ruleTestIntention
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
                    // InternalTestintentionsAssistance.g:604:2: ( ruleFunction )
                    {
                    // InternalTestintentionsAssistance.g:604:2: ( ruleFunction )
                    // InternalTestintentionsAssistance.g:605:3: ruleFunction
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
                    // InternalTestintentionsAssistance.g:610:2: ( ruleData )
                    {
                    // InternalTestintentionsAssistance.g:610:2: ( ruleData )
                    // InternalTestintentionsAssistance.g:611:3: ruleData
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
                    // InternalTestintentionsAssistance.g:616:2: ( ruleImport )
                    {
                    // InternalTestintentionsAssistance.g:616:2: ( ruleImport )
                    // InternalTestintentionsAssistance.g:617:3: ruleImport
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
                    // InternalTestintentionsAssistance.g:622:2: ( ruleDomainDeclaration )
                    {
                    // InternalTestintentionsAssistance.g:622:2: ( ruleDomainDeclaration )
                    // InternalTestintentionsAssistance.g:623:3: ruleDomainDeclaration
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
    // InternalTestintentionsAssistance.g:632:1: rule__Data__Alternatives : ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__Group_1__0 ) ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:636:1: ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__Group_1__0 ) ) )
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
                    // InternalTestintentionsAssistance.g:637:2: ( ( rule__Data__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:637:2: ( ( rule__Data__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:638:3: ( rule__Data__Group_0__0 )
                    {
                     before(grammarAccess.getDataAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:639:3: ( rule__Data__Group_0__0 )
                    // InternalTestintentionsAssistance.g:639:4: rule__Data__Group_0__0
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
                    // InternalTestintentionsAssistance.g:643:2: ( ( rule__Data__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:643:2: ( ( rule__Data__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:644:3: ( rule__Data__Group_1__0 )
                    {
                     before(grammarAccess.getDataAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:645:3: ( rule__Data__Group_1__0 )
                    // InternalTestintentionsAssistance.g:645:4: rule__Data__Group_1__0
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
    // InternalTestintentionsAssistance.g:653:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:657:1: ( ( '=' ) | ( '<>' ) )
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
                    // InternalTestintentionsAssistance.g:658:2: ( '=' )
                    {
                    // InternalTestintentionsAssistance.g:658:2: ( '=' )
                    // InternalTestintentionsAssistance.g:659:3: '='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:664:2: ( '<>' )
                    {
                    // InternalTestintentionsAssistance.g:664:2: ( '<>' )
                    // InternalTestintentionsAssistance.g:665:3: '<>'
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
    // InternalTestintentionsAssistance.g:674:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '\\u2265' ) | ( '\\u2264' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:678:1: ( ( '\\u2265' ) | ( '\\u2264' ) | ( '>' ) | ( '<' ) )
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
                    // InternalTestintentionsAssistance.g:679:2: ( '\\u2265' )
                    {
                    // InternalTestintentionsAssistance.g:679:2: ( '\\u2265' )
                    // InternalTestintentionsAssistance.g:680:3: '\\u2265'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanOrEqualToKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanOrEqualToKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:685:2: ( '\\u2264' )
                    {
                    // InternalTestintentionsAssistance.g:685:2: ( '\\u2264' )
                    // InternalTestintentionsAssistance.g:686:3: '\\u2264'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanOrEqualToKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanOrEqualToKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:691:2: ( '>' )
                    {
                    // InternalTestintentionsAssistance.g:691:2: ( '>' )
                    // InternalTestintentionsAssistance.g:692:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:697:2: ( '<' )
                    {
                    // InternalTestintentionsAssistance.g:697:2: ( '<' )
                    // InternalTestintentionsAssistance.g:698:3: '<'
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
    // InternalTestintentionsAssistance.g:707:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:711:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
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
                    // InternalTestintentionsAssistance.g:712:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:712:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalTestintentionsAssistance.g:713:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalTestintentionsAssistance.g:714:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalTestintentionsAssistance.g:714:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalTestintentionsAssistance.g:718:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:718:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalTestintentionsAssistance.g:719:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalTestintentionsAssistance.g:720:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalTestintentionsAssistance.g:720:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalTestintentionsAssistance.g:728:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:732:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalTestintentionsAssistance.g:733:2: ( '*' )
                    {
                    // InternalTestintentionsAssistance.g:733:2: ( '*' )
                    // InternalTestintentionsAssistance.g:734:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:739:2: ( '/' )
                    {
                    // InternalTestintentionsAssistance.g:739:2: ( '/' )
                    // InternalTestintentionsAssistance.g:740:3: '/'
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


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalTestintentionsAssistance.g:749:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:753:1: ( ( 'true' ) | ( 'false' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTestintentionsAssistance.g:754:2: ( 'true' )
                    {
                    // InternalTestintentionsAssistance.g:754:2: ( 'true' )
                    // InternalTestintentionsAssistance.g:755:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:760:2: ( 'false' )
                    {
                    // InternalTestintentionsAssistance.g:760:2: ( 'false' )
                    // InternalTestintentionsAssistance.g:761:3: 'false'
                    {
                     before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 

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


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalTestintentionsAssistance.g:770:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:774:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 44:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 19:
            case 20:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalTestintentionsAssistance.g:775:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:775:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:776:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:777:3: ( rule__Primary__Group_0__0 )
                    // InternalTestintentionsAssistance.g:777:4: rule__Primary__Group_0__0
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
                    // InternalTestintentionsAssistance.g:781:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:781:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:782:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:783:3: ( rule__Primary__Group_1__0 )
                    // InternalTestintentionsAssistance.g:783:4: rule__Primary__Group_1__0
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
                    // InternalTestintentionsAssistance.g:787:2: ( ruleAtomic )
                    {
                    // InternalTestintentionsAssistance.g:787:2: ( ruleAtomic )
                    // InternalTestintentionsAssistance.g:788:3: ruleAtomic
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
    // InternalTestintentionsAssistance.g:797:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:801:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==28) ) {
                    alt10=4;
                }
                else if ( (LA10_1==EOF||LA10_1==RULE_ID||(LA10_1>=11 && LA10_1<=18)||LA10_1==25||LA10_1==27||LA10_1==29||(LA10_1>=32 && LA10_1<=34)||LA10_1==36||(LA10_1>=38 && LA10_1<=42)) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt10=2;
                }
                break;
            case 19:
            case 20:
                {
                alt10=3;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalTestintentionsAssistance.g:802:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:802:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:803:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:804:3: ( rule__Atomic__Group_0__0 )
                    // InternalTestintentionsAssistance.g:804:4: rule__Atomic__Group_0__0
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
                    // InternalTestintentionsAssistance.g:808:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:808:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:809:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:810:3: ( rule__Atomic__Group_1__0 )
                    // InternalTestintentionsAssistance.g:810:4: rule__Atomic__Group_1__0
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
                    // InternalTestintentionsAssistance.g:814:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:814:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalTestintentionsAssistance.g:815:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalTestintentionsAssistance.g:816:3: ( rule__Atomic__Group_2__0 )
                    // InternalTestintentionsAssistance.g:816:4: rule__Atomic__Group_2__0
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
                    // InternalTestintentionsAssistance.g:820:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:820:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalTestintentionsAssistance.g:821:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalTestintentionsAssistance.g:822:3: ( rule__Atomic__Group_3__0 )
                    // InternalTestintentionsAssistance.g:822:4: rule__Atomic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTestintentionsAssistance.g:826:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:826:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalTestintentionsAssistance.g:827:3: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // InternalTestintentionsAssistance.g:828:3: ( rule__Atomic__Group_4__0 )
                    // InternalTestintentionsAssistance.g:828:4: rule__Atomic__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalTestintentionsAssistance.g:836:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:840:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
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
                    // InternalTestintentionsAssistance.g:841:2: ( ( 'INT' ) )
                    {
                    // InternalTestintentionsAssistance.g:841:2: ( ( 'INT' ) )
                    // InternalTestintentionsAssistance.g:842:3: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalTestintentionsAssistance.g:843:3: ( 'INT' )
                    // InternalTestintentionsAssistance.g:843:4: 'INT'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:847:2: ( ( 'STRING' ) )
                    {
                    // InternalTestintentionsAssistance.g:847:2: ( ( 'STRING' ) )
                    // InternalTestintentionsAssistance.g:848:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalTestintentionsAssistance.g:849:3: ( 'STRING' )
                    // InternalTestintentionsAssistance.g:849:4: 'STRING'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:853:2: ( ( 'Boolean' ) )
                    {
                    // InternalTestintentionsAssistance.g:853:2: ( ( 'Boolean' ) )
                    // InternalTestintentionsAssistance.g:854:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalTestintentionsAssistance.g:855:3: ( 'Boolean' )
                    // InternalTestintentionsAssistance.g:855:4: 'Boolean'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:859:2: ( ( 'Double' ) )
                    {
                    // InternalTestintentionsAssistance.g:859:2: ( ( 'Double' ) )
                    // InternalTestintentionsAssistance.g:860:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalTestintentionsAssistance.g:861:3: ( 'Double' )
                    // InternalTestintentionsAssistance.g:861:4: 'Double'
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
    // InternalTestintentionsAssistance.g:869:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:873:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalTestintentionsAssistance.g:874:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
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
    // InternalTestintentionsAssistance.g:881:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:885:1: ( ( 'domain' ) )
            // InternalTestintentionsAssistance.g:886:1: ( 'domain' )
            {
            // InternalTestintentionsAssistance.g:886:1: ( 'domain' )
            // InternalTestintentionsAssistance.g:887:2: 'domain'
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
    // InternalTestintentionsAssistance.g:896:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:900:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalTestintentionsAssistance.g:901:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
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
    // InternalTestintentionsAssistance.g:908:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:912:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:913:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:913:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalTestintentionsAssistance.g:914:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            // InternalTestintentionsAssistance.g:915:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalTestintentionsAssistance.g:915:3: rule__DomainDeclaration__NameAssignment_1
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
    // InternalTestintentionsAssistance.g:923:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:927:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalTestintentionsAssistance.g:928:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
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
    // InternalTestintentionsAssistance.g:935:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:939:1: ( ( '{' ) )
            // InternalTestintentionsAssistance.g:940:1: ( '{' )
            {
            // InternalTestintentionsAssistance.g:940:1: ( '{' )
            // InternalTestintentionsAssistance.g:941:2: '{'
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
    // InternalTestintentionsAssistance.g:950:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:954:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalTestintentionsAssistance.g:955:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
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
    // InternalTestintentionsAssistance.g:962:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:966:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalTestintentionsAssistance.g:967:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalTestintentionsAssistance.g:967:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalTestintentionsAssistance.g:968:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            // InternalTestintentionsAssistance.g:969:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==25||LA12_0==29||LA12_0==34||LA12_0==36) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:969:3: rule__DomainDeclaration__ElementsAssignment_3
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
    // InternalTestintentionsAssistance.g:977:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:981:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalTestintentionsAssistance.g:982:2: rule__DomainDeclaration__Group__4__Impl
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
    // InternalTestintentionsAssistance.g:988:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:992:1: ( ( '}' ) )
            // InternalTestintentionsAssistance.g:993:1: ( '}' )
            {
            // InternalTestintentionsAssistance.g:993:1: ( '}' )
            // InternalTestintentionsAssistance.g:994:2: '}'
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
    // InternalTestintentionsAssistance.g:1004:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1008:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTestintentionsAssistance.g:1009:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalTestintentionsAssistance.g:1016:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1020:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:1021:1: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:1021:1: ( RULE_ID )
            // InternalTestintentionsAssistance.g:1022:2: RULE_ID
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
    // InternalTestintentionsAssistance.g:1031:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1035:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1036:2: rule__QualifiedName__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1042:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1046:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:1047:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:1047:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:1048:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:1049:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1049:3: rule__QualifiedName__Group_1__0
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
    // InternalTestintentionsAssistance.g:1058:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1062:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTestintentionsAssistance.g:1063:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalTestintentionsAssistance.g:1070:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1074:1: ( ( '.' ) )
            // InternalTestintentionsAssistance.g:1075:1: ( '.' )
            {
            // InternalTestintentionsAssistance.g:1075:1: ( '.' )
            // InternalTestintentionsAssistance.g:1076:2: '.'
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
    // InternalTestintentionsAssistance.g:1085:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1089:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:1090:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalTestintentionsAssistance.g:1096:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1100:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:1101:1: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:1101:1: ( RULE_ID )
            // InternalTestintentionsAssistance.g:1102:2: RULE_ID
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
    // InternalTestintentionsAssistance.g:1112:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1116:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTestintentionsAssistance.g:1117:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalTestintentionsAssistance.g:1124:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1128:1: ( ( 'import' ) )
            // InternalTestintentionsAssistance.g:1129:1: ( 'import' )
            {
            // InternalTestintentionsAssistance.g:1129:1: ( 'import' )
            // InternalTestintentionsAssistance.g:1130:2: 'import'
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
    // InternalTestintentionsAssistance.g:1139:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1143:1: ( rule__Import__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1144:2: rule__Import__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1150:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1154:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:1155:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:1155:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalTestintentionsAssistance.g:1156:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalTestintentionsAssistance.g:1157:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalTestintentionsAssistance.g:1157:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalTestintentionsAssistance.g:1166:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1170:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalTestintentionsAssistance.g:1171:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalTestintentionsAssistance.g:1178:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1182:1: ( ( ruleQualifiedName ) )
            // InternalTestintentionsAssistance.g:1183:1: ( ruleQualifiedName )
            {
            // InternalTestintentionsAssistance.g:1183:1: ( ruleQualifiedName )
            // InternalTestintentionsAssistance.g:1184:2: ruleQualifiedName
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
    // InternalTestintentionsAssistance.g:1193:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1197:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1198:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1204:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1208:1: ( ( ( '.*' )? ) )
            // InternalTestintentionsAssistance.g:1209:1: ( ( '.*' )? )
            {
            // InternalTestintentionsAssistance.g:1209:1: ( ( '.*' )? )
            // InternalTestintentionsAssistance.g:1210:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalTestintentionsAssistance.g:1211:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTestintentionsAssistance.g:1211:3: '.*'
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
    // InternalTestintentionsAssistance.g:1220:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1224:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalTestintentionsAssistance.g:1225:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalTestintentionsAssistance.g:1232:1: rule__Function__Group__0__Impl : ( ( rule__Function__OutAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1236:1: ( ( ( rule__Function__OutAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:1237:1: ( ( rule__Function__OutAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:1237:1: ( ( rule__Function__OutAssignment_0 ) )
            // InternalTestintentionsAssistance.g:1238:2: ( rule__Function__OutAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getOutAssignment_0()); 
            // InternalTestintentionsAssistance.g:1239:2: ( rule__Function__OutAssignment_0 )
            // InternalTestintentionsAssistance.g:1239:3: rule__Function__OutAssignment_0
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
    // InternalTestintentionsAssistance.g:1247:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1251:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalTestintentionsAssistance.g:1252:2: rule__Function__Group__1__Impl rule__Function__Group__2
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
    // InternalTestintentionsAssistance.g:1259:1: rule__Function__Group__1__Impl : ( '=' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1263:1: ( ( '=' ) )
            // InternalTestintentionsAssistance.g:1264:1: ( '=' )
            {
            // InternalTestintentionsAssistance.g:1264:1: ( '=' )
            // InternalTestintentionsAssistance.g:1265:2: '='
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
    // InternalTestintentionsAssistance.g:1274:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1278:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalTestintentionsAssistance.g:1279:2: rule__Function__Group__2__Impl rule__Function__Group__3
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
    // InternalTestintentionsAssistance.g:1286:1: rule__Function__Group__2__Impl : ( ( rule__Function__MethodeAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1290:1: ( ( ( rule__Function__MethodeAssignment_2 ) ) )
            // InternalTestintentionsAssistance.g:1291:1: ( ( rule__Function__MethodeAssignment_2 ) )
            {
            // InternalTestintentionsAssistance.g:1291:1: ( ( rule__Function__MethodeAssignment_2 ) )
            // InternalTestintentionsAssistance.g:1292:2: ( rule__Function__MethodeAssignment_2 )
            {
             before(grammarAccess.getFunctionAccess().getMethodeAssignment_2()); 
            // InternalTestintentionsAssistance.g:1293:2: ( rule__Function__MethodeAssignment_2 )
            // InternalTestintentionsAssistance.g:1293:3: rule__Function__MethodeAssignment_2
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
    // InternalTestintentionsAssistance.g:1301:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1305:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalTestintentionsAssistance.g:1306:2: rule__Function__Group__3__Impl rule__Function__Group__4
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
    // InternalTestintentionsAssistance.g:1313:1: rule__Function__Group__3__Impl : ( '(' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1317:1: ( ( '(' ) )
            // InternalTestintentionsAssistance.g:1318:1: ( '(' )
            {
            // InternalTestintentionsAssistance.g:1318:1: ( '(' )
            // InternalTestintentionsAssistance.g:1319:2: '('
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
    // InternalTestintentionsAssistance.g:1328:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1332:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalTestintentionsAssistance.g:1333:2: rule__Function__Group__4__Impl rule__Function__Group__5
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
    // InternalTestintentionsAssistance.g:1340:1: rule__Function__Group__4__Impl : ( ( rule__Function__Group_4__0 )* ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1344:1: ( ( ( rule__Function__Group_4__0 )* ) )
            // InternalTestintentionsAssistance.g:1345:1: ( ( rule__Function__Group_4__0 )* )
            {
            // InternalTestintentionsAssistance.g:1345:1: ( ( rule__Function__Group_4__0 )* )
            // InternalTestintentionsAssistance.g:1346:2: ( rule__Function__Group_4__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_4()); 
            // InternalTestintentionsAssistance.g:1347:2: ( rule__Function__Group_4__0 )*
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
            	    // InternalTestintentionsAssistance.g:1347:3: rule__Function__Group_4__0
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
    // InternalTestintentionsAssistance.g:1355:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1359:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalTestintentionsAssistance.g:1360:2: rule__Function__Group__5__Impl rule__Function__Group__6
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
    // InternalTestintentionsAssistance.g:1367:1: rule__Function__Group__5__Impl : ( ( rule__Function__Arg1Assignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1371:1: ( ( ( rule__Function__Arg1Assignment_5 ) ) )
            // InternalTestintentionsAssistance.g:1372:1: ( ( rule__Function__Arg1Assignment_5 ) )
            {
            // InternalTestintentionsAssistance.g:1372:1: ( ( rule__Function__Arg1Assignment_5 ) )
            // InternalTestintentionsAssistance.g:1373:2: ( rule__Function__Arg1Assignment_5 )
            {
             before(grammarAccess.getFunctionAccess().getArg1Assignment_5()); 
            // InternalTestintentionsAssistance.g:1374:2: ( rule__Function__Arg1Assignment_5 )
            // InternalTestintentionsAssistance.g:1374:3: rule__Function__Arg1Assignment_5
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
    // InternalTestintentionsAssistance.g:1382:1: rule__Function__Group__6 : rule__Function__Group__6__Impl ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1386:1: ( rule__Function__Group__6__Impl )
            // InternalTestintentionsAssistance.g:1387:2: rule__Function__Group__6__Impl
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
    // InternalTestintentionsAssistance.g:1393:1: rule__Function__Group__6__Impl : ( ')' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1397:1: ( ( ')' ) )
            // InternalTestintentionsAssistance.g:1398:1: ( ')' )
            {
            // InternalTestintentionsAssistance.g:1398:1: ( ')' )
            // InternalTestintentionsAssistance.g:1399:2: ')'
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
    // InternalTestintentionsAssistance.g:1409:1: rule__Function__Group_4__0 : rule__Function__Group_4__0__Impl rule__Function__Group_4__1 ;
    public final void rule__Function__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1413:1: ( rule__Function__Group_4__0__Impl rule__Function__Group_4__1 )
            // InternalTestintentionsAssistance.g:1414:2: rule__Function__Group_4__0__Impl rule__Function__Group_4__1
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
    // InternalTestintentionsAssistance.g:1421:1: rule__Function__Group_4__0__Impl : ( ( rule__Function__ArgAssignment_4_0 ) ) ;
    public final void rule__Function__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1425:1: ( ( ( rule__Function__ArgAssignment_4_0 ) ) )
            // InternalTestintentionsAssistance.g:1426:1: ( ( rule__Function__ArgAssignment_4_0 ) )
            {
            // InternalTestintentionsAssistance.g:1426:1: ( ( rule__Function__ArgAssignment_4_0 ) )
            // InternalTestintentionsAssistance.g:1427:2: ( rule__Function__ArgAssignment_4_0 )
            {
             before(grammarAccess.getFunctionAccess().getArgAssignment_4_0()); 
            // InternalTestintentionsAssistance.g:1428:2: ( rule__Function__ArgAssignment_4_0 )
            // InternalTestintentionsAssistance.g:1428:3: rule__Function__ArgAssignment_4_0
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
    // InternalTestintentionsAssistance.g:1436:1: rule__Function__Group_4__1 : rule__Function__Group_4__1__Impl ;
    public final void rule__Function__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1440:1: ( rule__Function__Group_4__1__Impl )
            // InternalTestintentionsAssistance.g:1441:2: rule__Function__Group_4__1__Impl
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
    // InternalTestintentionsAssistance.g:1447:1: rule__Function__Group_4__1__Impl : ( ',' ) ;
    public final void rule__Function__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1451:1: ( ( ',' ) )
            // InternalTestintentionsAssistance.g:1452:1: ( ',' )
            {
            // InternalTestintentionsAssistance.g:1452:1: ( ',' )
            // InternalTestintentionsAssistance.g:1453:2: ','
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
    // InternalTestintentionsAssistance.g:1463:1: rule__Data__Group_0__0 : rule__Data__Group_0__0__Impl rule__Data__Group_0__1 ;
    public final void rule__Data__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1467:1: ( rule__Data__Group_0__0__Impl rule__Data__Group_0__1 )
            // InternalTestintentionsAssistance.g:1468:2: rule__Data__Group_0__0__Impl rule__Data__Group_0__1
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
    // InternalTestintentionsAssistance.g:1475:1: rule__Data__Group_0__0__Impl : ( () ) ;
    public final void rule__Data__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1479:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:1480:1: ( () )
            {
            // InternalTestintentionsAssistance.g:1480:1: ( () )
            // InternalTestintentionsAssistance.g:1481:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0_0()); 
            // InternalTestintentionsAssistance.g:1482:2: ()
            // InternalTestintentionsAssistance.g:1482:3: 
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
    // InternalTestintentionsAssistance.g:1490:1: rule__Data__Group_0__1 : rule__Data__Group_0__1__Impl rule__Data__Group_0__2 ;
    public final void rule__Data__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1494:1: ( rule__Data__Group_0__1__Impl rule__Data__Group_0__2 )
            // InternalTestintentionsAssistance.g:1495:2: rule__Data__Group_0__1__Impl rule__Data__Group_0__2
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
    // InternalTestintentionsAssistance.g:1502:1: rule__Data__Group_0__1__Impl : ( 'input:(' ) ;
    public final void rule__Data__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1506:1: ( ( 'input:(' ) )
            // InternalTestintentionsAssistance.g:1507:1: ( 'input:(' )
            {
            // InternalTestintentionsAssistance.g:1507:1: ( 'input:(' )
            // InternalTestintentionsAssistance.g:1508:2: 'input:('
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
    // InternalTestintentionsAssistance.g:1517:1: rule__Data__Group_0__2 : rule__Data__Group_0__2__Impl ;
    public final void rule__Data__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1521:1: ( rule__Data__Group_0__2__Impl )
            // InternalTestintentionsAssistance.g:1522:2: rule__Data__Group_0__2__Impl
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
    // InternalTestintentionsAssistance.g:1528:1: rule__Data__Group_0__2__Impl : ( ( rule__Data__Group_0_2__0 )* ) ;
    public final void rule__Data__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1532:1: ( ( ( rule__Data__Group_0_2__0 )* ) )
            // InternalTestintentionsAssistance.g:1533:1: ( ( rule__Data__Group_0_2__0 )* )
            {
            // InternalTestintentionsAssistance.g:1533:1: ( ( rule__Data__Group_0_2__0 )* )
            // InternalTestintentionsAssistance.g:1534:2: ( rule__Data__Group_0_2__0 )*
            {
             before(grammarAccess.getDataAccess().getGroup_0_2()); 
            // InternalTestintentionsAssistance.g:1535:2: ( rule__Data__Group_0_2__0 )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1535:3: rule__Data__Group_0_2__0
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
    // InternalTestintentionsAssistance.g:1544:1: rule__Data__Group_0_2__0 : rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1 ;
    public final void rule__Data__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1548:1: ( rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1 )
            // InternalTestintentionsAssistance.g:1549:2: rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1
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
    // InternalTestintentionsAssistance.g:1556:1: rule__Data__Group_0_2__0__Impl : ( ( rule__Data__VariableAssignment_0_2_0 ) ) ;
    public final void rule__Data__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1560:1: ( ( ( rule__Data__VariableAssignment_0_2_0 ) ) )
            // InternalTestintentionsAssistance.g:1561:1: ( ( rule__Data__VariableAssignment_0_2_0 ) )
            {
            // InternalTestintentionsAssistance.g:1561:1: ( ( rule__Data__VariableAssignment_0_2_0 ) )
            // InternalTestintentionsAssistance.g:1562:2: ( rule__Data__VariableAssignment_0_2_0 )
            {
             before(grammarAccess.getDataAccess().getVariableAssignment_0_2_0()); 
            // InternalTestintentionsAssistance.g:1563:2: ( rule__Data__VariableAssignment_0_2_0 )
            // InternalTestintentionsAssistance.g:1563:3: rule__Data__VariableAssignment_0_2_0
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
    // InternalTestintentionsAssistance.g:1571:1: rule__Data__Group_0_2__1 : rule__Data__Group_0_2__1__Impl rule__Data__Group_0_2__2 ;
    public final void rule__Data__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1575:1: ( rule__Data__Group_0_2__1__Impl rule__Data__Group_0_2__2 )
            // InternalTestintentionsAssistance.g:1576:2: rule__Data__Group_0_2__1__Impl rule__Data__Group_0_2__2
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
    // InternalTestintentionsAssistance.g:1583:1: rule__Data__Group_0_2__1__Impl : ( ':=' ) ;
    public final void rule__Data__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1587:1: ( ( ':=' ) )
            // InternalTestintentionsAssistance.g:1588:1: ( ':=' )
            {
            // InternalTestintentionsAssistance.g:1588:1: ( ':=' )
            // InternalTestintentionsAssistance.g:1589:2: ':='
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
    // InternalTestintentionsAssistance.g:1598:1: rule__Data__Group_0_2__2 : rule__Data__Group_0_2__2__Impl rule__Data__Group_0_2__3 ;
    public final void rule__Data__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1602:1: ( rule__Data__Group_0_2__2__Impl rule__Data__Group_0_2__3 )
            // InternalTestintentionsAssistance.g:1603:2: rule__Data__Group_0_2__2__Impl rule__Data__Group_0_2__3
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
    // InternalTestintentionsAssistance.g:1610:1: rule__Data__Group_0_2__2__Impl : ( ( rule__Data__ValAssignment_0_2_2 ) ) ;
    public final void rule__Data__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1614:1: ( ( ( rule__Data__ValAssignment_0_2_2 ) ) )
            // InternalTestintentionsAssistance.g:1615:1: ( ( rule__Data__ValAssignment_0_2_2 ) )
            {
            // InternalTestintentionsAssistance.g:1615:1: ( ( rule__Data__ValAssignment_0_2_2 ) )
            // InternalTestintentionsAssistance.g:1616:2: ( rule__Data__ValAssignment_0_2_2 )
            {
             before(grammarAccess.getDataAccess().getValAssignment_0_2_2()); 
            // InternalTestintentionsAssistance.g:1617:2: ( rule__Data__ValAssignment_0_2_2 )
            // InternalTestintentionsAssistance.g:1617:3: rule__Data__ValAssignment_0_2_2
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
    // InternalTestintentionsAssistance.g:1625:1: rule__Data__Group_0_2__3 : rule__Data__Group_0_2__3__Impl ;
    public final void rule__Data__Group_0_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1629:1: ( rule__Data__Group_0_2__3__Impl )
            // InternalTestintentionsAssistance.g:1630:2: rule__Data__Group_0_2__3__Impl
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
    // InternalTestintentionsAssistance.g:1636:1: rule__Data__Group_0_2__3__Impl : ( ',' ) ;
    public final void rule__Data__Group_0_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1640:1: ( ( ',' ) )
            // InternalTestintentionsAssistance.g:1641:1: ( ',' )
            {
            // InternalTestintentionsAssistance.g:1641:1: ( ',' )
            // InternalTestintentionsAssistance.g:1642:2: ','
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
    // InternalTestintentionsAssistance.g:1652:1: rule__Data__Group_1__0 : rule__Data__Group_1__0__Impl rule__Data__Group_1__1 ;
    public final void rule__Data__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1656:1: ( rule__Data__Group_1__0__Impl rule__Data__Group_1__1 )
            // InternalTestintentionsAssistance.g:1657:2: rule__Data__Group_1__0__Impl rule__Data__Group_1__1
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
    // InternalTestintentionsAssistance.g:1664:1: rule__Data__Group_1__0__Impl : ( ( rule__Data__VariableAssignment_1_0 ) ) ;
    public final void rule__Data__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1668:1: ( ( ( rule__Data__VariableAssignment_1_0 ) ) )
            // InternalTestintentionsAssistance.g:1669:1: ( ( rule__Data__VariableAssignment_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:1669:1: ( ( rule__Data__VariableAssignment_1_0 ) )
            // InternalTestintentionsAssistance.g:1670:2: ( rule__Data__VariableAssignment_1_0 )
            {
             before(grammarAccess.getDataAccess().getVariableAssignment_1_0()); 
            // InternalTestintentionsAssistance.g:1671:2: ( rule__Data__VariableAssignment_1_0 )
            // InternalTestintentionsAssistance.g:1671:3: rule__Data__VariableAssignment_1_0
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
    // InternalTestintentionsAssistance.g:1679:1: rule__Data__Group_1__1 : rule__Data__Group_1__1__Impl rule__Data__Group_1__2 ;
    public final void rule__Data__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1683:1: ( rule__Data__Group_1__1__Impl rule__Data__Group_1__2 )
            // InternalTestintentionsAssistance.g:1684:2: rule__Data__Group_1__1__Impl rule__Data__Group_1__2
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
    // InternalTestintentionsAssistance.g:1691:1: rule__Data__Group_1__1__Impl : ( ':=' ) ;
    public final void rule__Data__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1695:1: ( ( ':=' ) )
            // InternalTestintentionsAssistance.g:1696:1: ( ':=' )
            {
            // InternalTestintentionsAssistance.g:1696:1: ( ':=' )
            // InternalTestintentionsAssistance.g:1697:2: ':='
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
    // InternalTestintentionsAssistance.g:1706:1: rule__Data__Group_1__2 : rule__Data__Group_1__2__Impl rule__Data__Group_1__3 ;
    public final void rule__Data__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1710:1: ( rule__Data__Group_1__2__Impl rule__Data__Group_1__3 )
            // InternalTestintentionsAssistance.g:1711:2: rule__Data__Group_1__2__Impl rule__Data__Group_1__3
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
    // InternalTestintentionsAssistance.g:1718:1: rule__Data__Group_1__2__Impl : ( ( rule__Data__ValAssignment_1_2 ) ) ;
    public final void rule__Data__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1722:1: ( ( ( rule__Data__ValAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:1723:1: ( ( rule__Data__ValAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:1723:1: ( ( rule__Data__ValAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:1724:2: ( rule__Data__ValAssignment_1_2 )
            {
             before(grammarAccess.getDataAccess().getValAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:1725:2: ( rule__Data__ValAssignment_1_2 )
            // InternalTestintentionsAssistance.g:1725:3: rule__Data__ValAssignment_1_2
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
    // InternalTestintentionsAssistance.g:1733:1: rule__Data__Group_1__3 : rule__Data__Group_1__3__Impl ;
    public final void rule__Data__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1737:1: ( rule__Data__Group_1__3__Impl )
            // InternalTestintentionsAssistance.g:1738:2: rule__Data__Group_1__3__Impl
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
    // InternalTestintentionsAssistance.g:1744:1: rule__Data__Group_1__3__Impl : ( ( ')' )* ) ;
    public final void rule__Data__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1748:1: ( ( ( ')' )* ) )
            // InternalTestintentionsAssistance.g:1749:1: ( ( ')' )* )
            {
            // InternalTestintentionsAssistance.g:1749:1: ( ( ')' )* )
            // InternalTestintentionsAssistance.g:1750:2: ( ')' )*
            {
             before(grammarAccess.getDataAccess().getRightParenthesisKeyword_1_3()); 
            // InternalTestintentionsAssistance.g:1751:2: ( ')' )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1751:3: ')'
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
    // InternalTestintentionsAssistance.g:1760:1: rule__TestIntention__Group__0 : rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1 ;
    public final void rule__TestIntention__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1764:1: ( rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1 )
            // InternalTestintentionsAssistance.g:1765:2: rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1
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
    // InternalTestintentionsAssistance.g:1772:1: rule__TestIntention__Group__0__Impl : ( 'description:' ) ;
    public final void rule__TestIntention__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1776:1: ( ( 'description:' ) )
            // InternalTestintentionsAssistance.g:1777:1: ( 'description:' )
            {
            // InternalTestintentionsAssistance.g:1777:1: ( 'description:' )
            // InternalTestintentionsAssistance.g:1778:2: 'description:'
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
    // InternalTestintentionsAssistance.g:1787:1: rule__TestIntention__Group__1 : rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2 ;
    public final void rule__TestIntention__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1791:1: ( rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2 )
            // InternalTestintentionsAssistance.g:1792:2: rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2
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
    // InternalTestintentionsAssistance.g:1799:1: rule__TestIntention__Group__1__Impl : ( ( rule__TestIntention__DescriptionAssignment_1 ) ) ;
    public final void rule__TestIntention__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1803:1: ( ( ( rule__TestIntention__DescriptionAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:1804:1: ( ( rule__TestIntention__DescriptionAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:1804:1: ( ( rule__TestIntention__DescriptionAssignment_1 ) )
            // InternalTestintentionsAssistance.g:1805:2: ( rule__TestIntention__DescriptionAssignment_1 )
            {
             before(grammarAccess.getTestIntentionAccess().getDescriptionAssignment_1()); 
            // InternalTestintentionsAssistance.g:1806:2: ( rule__TestIntention__DescriptionAssignment_1 )
            // InternalTestintentionsAssistance.g:1806:3: rule__TestIntention__DescriptionAssignment_1
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
    // InternalTestintentionsAssistance.g:1814:1: rule__TestIntention__Group__2 : rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3 ;
    public final void rule__TestIntention__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1818:1: ( rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3 )
            // InternalTestintentionsAssistance.g:1819:2: rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3
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
    // InternalTestintentionsAssistance.g:1826:1: rule__TestIntention__Group__2__Impl : ( 'datapredicate:' ) ;
    public final void rule__TestIntention__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1830:1: ( ( 'datapredicate:' ) )
            // InternalTestintentionsAssistance.g:1831:1: ( 'datapredicate:' )
            {
            // InternalTestintentionsAssistance.g:1831:1: ( 'datapredicate:' )
            // InternalTestintentionsAssistance.g:1832:2: 'datapredicate:'
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
    // InternalTestintentionsAssistance.g:1841:1: rule__TestIntention__Group__3 : rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4 ;
    public final void rule__TestIntention__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1845:1: ( rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4 )
            // InternalTestintentionsAssistance.g:1846:2: rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4
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
    // InternalTestintentionsAssistance.g:1853:1: rule__TestIntention__Group__3__Impl : ( ( rule__TestIntention__ExpressionAssignment_3 ) ) ;
    public final void rule__TestIntention__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1857:1: ( ( ( rule__TestIntention__ExpressionAssignment_3 ) ) )
            // InternalTestintentionsAssistance.g:1858:1: ( ( rule__TestIntention__ExpressionAssignment_3 ) )
            {
            // InternalTestintentionsAssistance.g:1858:1: ( ( rule__TestIntention__ExpressionAssignment_3 ) )
            // InternalTestintentionsAssistance.g:1859:2: ( rule__TestIntention__ExpressionAssignment_3 )
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionAssignment_3()); 
            // InternalTestintentionsAssistance.g:1860:2: ( rule__TestIntention__ExpressionAssignment_3 )
            // InternalTestintentionsAssistance.g:1860:3: rule__TestIntention__ExpressionAssignment_3
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
    // InternalTestintentionsAssistance.g:1868:1: rule__TestIntention__Group__4 : rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5 ;
    public final void rule__TestIntention__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1872:1: ( rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5 )
            // InternalTestintentionsAssistance.g:1873:2: rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5
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
    // InternalTestintentionsAssistance.g:1880:1: rule__TestIntention__Group__4__Impl : ( 'oracle:' ) ;
    public final void rule__TestIntention__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1884:1: ( ( 'oracle:' ) )
            // InternalTestintentionsAssistance.g:1885:1: ( 'oracle:' )
            {
            // InternalTestintentionsAssistance.g:1885:1: ( 'oracle:' )
            // InternalTestintentionsAssistance.g:1886:2: 'oracle:'
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
    // InternalTestintentionsAssistance.g:1895:1: rule__TestIntention__Group__5 : rule__TestIntention__Group__5__Impl ;
    public final void rule__TestIntention__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1899:1: ( rule__TestIntention__Group__5__Impl )
            // InternalTestintentionsAssistance.g:1900:2: rule__TestIntention__Group__5__Impl
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
    // InternalTestintentionsAssistance.g:1906:1: rule__TestIntention__Group__5__Impl : ( ( rule__TestIntention__ExpressionAssignment_5 ) ) ;
    public final void rule__TestIntention__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1910:1: ( ( ( rule__TestIntention__ExpressionAssignment_5 ) ) )
            // InternalTestintentionsAssistance.g:1911:1: ( ( rule__TestIntention__ExpressionAssignment_5 ) )
            {
            // InternalTestintentionsAssistance.g:1911:1: ( ( rule__TestIntention__ExpressionAssignment_5 ) )
            // InternalTestintentionsAssistance.g:1912:2: ( rule__TestIntention__ExpressionAssignment_5 )
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionAssignment_5()); 
            // InternalTestintentionsAssistance.g:1913:2: ( rule__TestIntention__ExpressionAssignment_5 )
            // InternalTestintentionsAssistance.g:1913:3: rule__TestIntention__ExpressionAssignment_5
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
    // InternalTestintentionsAssistance.g:1922:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1926:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalTestintentionsAssistance.g:1927:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalTestintentionsAssistance.g:1934:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1938:1: ( ( ruleAnd ) )
            // InternalTestintentionsAssistance.g:1939:1: ( ruleAnd )
            {
            // InternalTestintentionsAssistance.g:1939:1: ( ruleAnd )
            // InternalTestintentionsAssistance.g:1940:2: ruleAnd
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
    // InternalTestintentionsAssistance.g:1949:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1953:1: ( rule__Or__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1954:2: rule__Or__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1960:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1964:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:1965:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:1965:1: ( ( rule__Or__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:1966:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:1967:2: ( rule__Or__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1967:3: rule__Or__Group_1__0
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
    // InternalTestintentionsAssistance.g:1976:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1980:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalTestintentionsAssistance.g:1981:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalTestintentionsAssistance.g:1988:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1992:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:1993:1: ( () )
            {
            // InternalTestintentionsAssistance.g:1993:1: ( () )
            // InternalTestintentionsAssistance.g:1994:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:1995:2: ()
            // InternalTestintentionsAssistance.g:1995:3: 
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
    // InternalTestintentionsAssistance.g:2003:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2007:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalTestintentionsAssistance.g:2008:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalTestintentionsAssistance.g:2015:1: rule__Or__Group_1__1__Impl : ( '\\u2228' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2019:1: ( ( '\\u2228' ) )
            // InternalTestintentionsAssistance.g:2020:1: ( '\\u2228' )
            {
            // InternalTestintentionsAssistance.g:2020:1: ( '\\u2228' )
            // InternalTestintentionsAssistance.g:2021:2: '\\u2228'
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
    // InternalTestintentionsAssistance.g:2030:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2034:1: ( rule__Or__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2035:2: rule__Or__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2041:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2045:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2046:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2046:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2047:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2048:2: ( rule__Or__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2048:3: rule__Or__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2057:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2061:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalTestintentionsAssistance.g:2062:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalTestintentionsAssistance.g:2069:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2073:1: ( ( ruleEquality ) )
            // InternalTestintentionsAssistance.g:2074:1: ( ruleEquality )
            {
            // InternalTestintentionsAssistance.g:2074:1: ( ruleEquality )
            // InternalTestintentionsAssistance.g:2075:2: ruleEquality
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
    // InternalTestintentionsAssistance.g:2084:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2088:1: ( rule__And__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2089:2: rule__And__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2095:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2099:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2100:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2100:1: ( ( rule__And__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2101:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2102:2: ( rule__And__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2102:3: rule__And__Group_1__0
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
    // InternalTestintentionsAssistance.g:2111:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2115:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalTestintentionsAssistance.g:2116:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalTestintentionsAssistance.g:2123:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2127:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2128:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2128:1: ( () )
            // InternalTestintentionsAssistance.g:2129:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2130:2: ()
            // InternalTestintentionsAssistance.g:2130:3: 
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
    // InternalTestintentionsAssistance.g:2138:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2142:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalTestintentionsAssistance.g:2143:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalTestintentionsAssistance.g:2150:1: rule__And__Group_1__1__Impl : ( '\\u2227' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2154:1: ( ( '\\u2227' ) )
            // InternalTestintentionsAssistance.g:2155:1: ( '\\u2227' )
            {
            // InternalTestintentionsAssistance.g:2155:1: ( '\\u2227' )
            // InternalTestintentionsAssistance.g:2156:2: '\\u2227'
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
    // InternalTestintentionsAssistance.g:2165:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2169:1: ( rule__And__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2170:2: rule__And__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2176:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2180:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2181:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2181:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2182:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2183:2: ( rule__And__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2183:3: rule__And__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2192:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2196:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalTestintentionsAssistance.g:2197:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
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
    // InternalTestintentionsAssistance.g:2204:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2208:1: ( ( ruleComparison ) )
            // InternalTestintentionsAssistance.g:2209:1: ( ruleComparison )
            {
            // InternalTestintentionsAssistance.g:2209:1: ( ruleComparison )
            // InternalTestintentionsAssistance.g:2210:2: ruleComparison
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
    // InternalTestintentionsAssistance.g:2219:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2223:1: ( rule__Equality__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2224:2: rule__Equality__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2230:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2234:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2235:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2235:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2236:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2237:2: ( rule__Equality__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=11 && LA20_0<=12)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2237:3: rule__Equality__Group_1__0
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
    // InternalTestintentionsAssistance.g:2246:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2250:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalTestintentionsAssistance.g:2251:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalTestintentionsAssistance.g:2258:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2262:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2263:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2263:1: ( () )
            // InternalTestintentionsAssistance.g:2264:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2265:2: ()
            // InternalTestintentionsAssistance.g:2265:3: 
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
    // InternalTestintentionsAssistance.g:2273:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2277:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalTestintentionsAssistance.g:2278:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
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
    // InternalTestintentionsAssistance.g:2285:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2289:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2290:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2290:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2291:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2292:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2292:3: rule__Equality__OpAssignment_1_1
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
    // InternalTestintentionsAssistance.g:2300:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2304:1: ( rule__Equality__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2305:2: rule__Equality__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2311:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2315:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2316:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2316:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2317:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2318:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2318:3: rule__Equality__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2327:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2331:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalTestintentionsAssistance.g:2332:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalTestintentionsAssistance.g:2339:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2343:1: ( ( rulePlusOrMinus ) )
            // InternalTestintentionsAssistance.g:2344:1: ( rulePlusOrMinus )
            {
            // InternalTestintentionsAssistance.g:2344:1: ( rulePlusOrMinus )
            // InternalTestintentionsAssistance.g:2345:2: rulePlusOrMinus
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
    // InternalTestintentionsAssistance.g:2354:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2358:1: ( rule__Comparison__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2359:2: rule__Comparison__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2365:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2369:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2370:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2370:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2371:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2372:2: ( rule__Comparison__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=13 && LA21_0<=16)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2372:3: rule__Comparison__Group_1__0
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
    // InternalTestintentionsAssistance.g:2381:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2385:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalTestintentionsAssistance.g:2386:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalTestintentionsAssistance.g:2393:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2397:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2398:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2398:1: ( () )
            // InternalTestintentionsAssistance.g:2399:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2400:2: ()
            // InternalTestintentionsAssistance.g:2400:3: 
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
    // InternalTestintentionsAssistance.g:2408:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2412:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalTestintentionsAssistance.g:2413:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
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
    // InternalTestintentionsAssistance.g:2420:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2424:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2425:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2425:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2426:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2427:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2427:3: rule__Comparison__OpAssignment_1_1
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
    // InternalTestintentionsAssistance.g:2435:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2439:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2440:2: rule__Comparison__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2446:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2450:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2451:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2451:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2452:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2453:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2453:3: rule__Comparison__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2462:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2466:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalTestintentionsAssistance.g:2467:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
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
    // InternalTestintentionsAssistance.g:2474:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2478:1: ( ( ruleMulOrDiv ) )
            // InternalTestintentionsAssistance.g:2479:1: ( ruleMulOrDiv )
            {
            // InternalTestintentionsAssistance.g:2479:1: ( ruleMulOrDiv )
            // InternalTestintentionsAssistance.g:2480:2: ruleMulOrDiv
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
    // InternalTestintentionsAssistance.g:2489:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2493:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2494:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2500:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2504:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2505:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2505:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2506:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2507:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2507:3: rule__PlusOrMinus__Group_1__0
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
    // InternalTestintentionsAssistance.g:2516:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2520:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalTestintentionsAssistance.g:2521:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalTestintentionsAssistance.g:2528:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2532:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalTestintentionsAssistance.g:2533:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:2533:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalTestintentionsAssistance.g:2534:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalTestintentionsAssistance.g:2535:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalTestintentionsAssistance.g:2535:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalTestintentionsAssistance.g:2543:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2547:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:2548:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalTestintentionsAssistance.g:2554:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2558:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2559:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2559:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2560:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2561:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2561:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalTestintentionsAssistance.g:2570:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2574:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalTestintentionsAssistance.g:2575:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
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
    // InternalTestintentionsAssistance.g:2582:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2586:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2587:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2587:1: ( () )
            // InternalTestintentionsAssistance.g:2588:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalTestintentionsAssistance.g:2589:2: ()
            // InternalTestintentionsAssistance.g:2589:3: 
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
    // InternalTestintentionsAssistance.g:2597:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2601:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalTestintentionsAssistance.g:2602:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalTestintentionsAssistance.g:2608:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2612:1: ( ( '+' ) )
            // InternalTestintentionsAssistance.g:2613:1: ( '+' )
            {
            // InternalTestintentionsAssistance.g:2613:1: ( '+' )
            // InternalTestintentionsAssistance.g:2614:2: '+'
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
    // InternalTestintentionsAssistance.g:2624:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2628:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalTestintentionsAssistance.g:2629:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
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
    // InternalTestintentionsAssistance.g:2636:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2640:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2641:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2641:1: ( () )
            // InternalTestintentionsAssistance.g:2642:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalTestintentionsAssistance.g:2643:2: ()
            // InternalTestintentionsAssistance.g:2643:3: 
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
    // InternalTestintentionsAssistance.g:2651:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2655:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalTestintentionsAssistance.g:2656:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalTestintentionsAssistance.g:2662:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2666:1: ( ( '-' ) )
            // InternalTestintentionsAssistance.g:2667:1: ( '-' )
            {
            // InternalTestintentionsAssistance.g:2667:1: ( '-' )
            // InternalTestintentionsAssistance.g:2668:2: '-'
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
    // InternalTestintentionsAssistance.g:2678:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2682:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalTestintentionsAssistance.g:2683:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
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
    // InternalTestintentionsAssistance.g:2690:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2694:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:2695:1: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:2695:1: ( rulePrimary )
            // InternalTestintentionsAssistance.g:2696:2: rulePrimary
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
    // InternalTestintentionsAssistance.g:2705:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2709:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2710:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2716:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2720:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2721:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2721:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2722:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2723:2: ( rule__MulOrDiv__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2723:3: rule__MulOrDiv__Group_1__0
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
    // InternalTestintentionsAssistance.g:2732:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2736:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalTestintentionsAssistance.g:2737:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
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
    // InternalTestintentionsAssistance.g:2744:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2748:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2749:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2749:1: ( () )
            // InternalTestintentionsAssistance.g:2750:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2751:2: ()
            // InternalTestintentionsAssistance.g:2751:3: 
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
    // InternalTestintentionsAssistance.g:2759:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2763:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalTestintentionsAssistance.g:2764:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
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
    // InternalTestintentionsAssistance.g:2771:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2775:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2776:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2776:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2777:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2778:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2778:3: rule__MulOrDiv__OpAssignment_1_1
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
    // InternalTestintentionsAssistance.g:2786:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2790:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2791:2: rule__MulOrDiv__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2797:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2801:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2802:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2802:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2803:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2804:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2804:3: rule__MulOrDiv__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2813:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2817:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTestintentionsAssistance.g:2818:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
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
    // InternalTestintentionsAssistance.g:2825:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2829:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:2830:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:2830:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalTestintentionsAssistance.g:2831:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalTestintentionsAssistance.g:2832:2: ( rule__Variable__NameAssignment_0 )
            // InternalTestintentionsAssistance.g:2832:3: rule__Variable__NameAssignment_0
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
    // InternalTestintentionsAssistance.g:2840:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2844:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTestintentionsAssistance.g:2845:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
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
    // InternalTestintentionsAssistance.g:2852:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2856:1: ( ( ':' ) )
            // InternalTestintentionsAssistance.g:2857:1: ( ':' )
            {
            // InternalTestintentionsAssistance.g:2857:1: ( ':' )
            // InternalTestintentionsAssistance.g:2858:2: ':'
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
    // InternalTestintentionsAssistance.g:2867:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2871:1: ( rule__Variable__Group__2__Impl )
            // InternalTestintentionsAssistance.g:2872:2: rule__Variable__Group__2__Impl
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
    // InternalTestintentionsAssistance.g:2878:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2882:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalTestintentionsAssistance.g:2883:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalTestintentionsAssistance.g:2883:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalTestintentionsAssistance.g:2884:2: ( rule__Variable__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // InternalTestintentionsAssistance.g:2885:2: ( rule__Variable__TypeAssignment_2 )
            // InternalTestintentionsAssistance.g:2885:3: rule__Variable__TypeAssignment_2
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


    // $ANTLR start "rule__Double__Group__0"
    // InternalTestintentionsAssistance.g:2894:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2898:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalTestintentionsAssistance.g:2899:2: rule__Double__Group__0__Impl rule__Double__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Double__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__1();

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
    // $ANTLR end "rule__Double__Group__0"


    // $ANTLR start "rule__Double__Group__0__Impl"
    // InternalTestintentionsAssistance.g:2906:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2910:1: ( ( RULE_INT ) )
            // InternalTestintentionsAssistance.g:2911:1: ( RULE_INT )
            {
            // InternalTestintentionsAssistance.g:2911:1: ( RULE_INT )
            // InternalTestintentionsAssistance.g:2912:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:2921:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2925:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalTestintentionsAssistance.g:2926:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_39);
            rule__Double__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Double__Group__2();

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
    // $ANTLR end "rule__Double__Group__1"


    // $ANTLR start "rule__Double__Group__1__Impl"
    // InternalTestintentionsAssistance.g:2933:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2937:1: ( ( '.' ) )
            // InternalTestintentionsAssistance.g:2938:1: ( '.' )
            {
            // InternalTestintentionsAssistance.g:2938:1: ( '.' )
            // InternalTestintentionsAssistance.g:2939:2: '.'
            {
             before(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getFullStopKeyword_1()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:2948:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2952:1: ( rule__Double__Group__2__Impl )
            // InternalTestintentionsAssistance.g:2953:2: rule__Double__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Double__Group__2__Impl();

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
    // $ANTLR end "rule__Double__Group__2"


    // $ANTLR start "rule__Double__Group__2__Impl"
    // InternalTestintentionsAssistance.g:2959:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2963:1: ( ( RULE_INT ) )
            // InternalTestintentionsAssistance.g:2964:1: ( RULE_INT )
            {
            // InternalTestintentionsAssistance.g:2964:1: ( RULE_INT )
            // InternalTestintentionsAssistance.g:2965:2: RULE_INT
            {
             before(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDoubleAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalTestintentionsAssistance.g:2975:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2979:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalTestintentionsAssistance.g:2980:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalTestintentionsAssistance.g:2987:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2991:1: ( ( '(' ) )
            // InternalTestintentionsAssistance.g:2992:1: ( '(' )
            {
            // InternalTestintentionsAssistance.g:2992:1: ( '(' )
            // InternalTestintentionsAssistance.g:2993:2: '('
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
    // InternalTestintentionsAssistance.g:3002:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3006:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalTestintentionsAssistance.g:3007:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalTestintentionsAssistance.g:3014:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3018:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3019:1: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3019:1: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3020:2: ruleExpression
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
    // InternalTestintentionsAssistance.g:3029:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3033:1: ( rule__Primary__Group_0__2__Impl )
            // InternalTestintentionsAssistance.g:3034:2: rule__Primary__Group_0__2__Impl
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
    // InternalTestintentionsAssistance.g:3040:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3044:1: ( ( ')' ) )
            // InternalTestintentionsAssistance.g:3045:1: ( ')' )
            {
            // InternalTestintentionsAssistance.g:3045:1: ( ')' )
            // InternalTestintentionsAssistance.g:3046:2: ')'
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
    // InternalTestintentionsAssistance.g:3056:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3060:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalTestintentionsAssistance.g:3061:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalTestintentionsAssistance.g:3068:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3072:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3073:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3073:1: ( () )
            // InternalTestintentionsAssistance.g:3074:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalTestintentionsAssistance.g:3075:2: ()
            // InternalTestintentionsAssistance.g:3075:3: 
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
    // InternalTestintentionsAssistance.g:3083:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3087:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalTestintentionsAssistance.g:3088:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalTestintentionsAssistance.g:3095:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3099:1: ( ( '!' ) )
            // InternalTestintentionsAssistance.g:3100:1: ( '!' )
            {
            // InternalTestintentionsAssistance.g:3100:1: ( '!' )
            // InternalTestintentionsAssistance.g:3101:2: '!'
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
    // InternalTestintentionsAssistance.g:3110:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3114:1: ( rule__Primary__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:3115:2: rule__Primary__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:3121:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3125:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:3126:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:3126:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:3127:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:3128:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalTestintentionsAssistance.g:3128:3: rule__Primary__ExpressionAssignment_1_2
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
    // InternalTestintentionsAssistance.g:3137:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3141:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalTestintentionsAssistance.g:3142:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalTestintentionsAssistance.g:3149:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3153:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3154:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3154:1: ( () )
            // InternalTestintentionsAssistance.g:3155:2: ()
            {
             before(grammarAccess.getAtomicAccess().getINTAction_0_0()); 
            // InternalTestintentionsAssistance.g:3156:2: ()
            // InternalTestintentionsAssistance.g:3156:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getINTAction_0_0()); 

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
    // InternalTestintentionsAssistance.g:3164:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3168:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalTestintentionsAssistance.g:3169:2: rule__Atomic__Group_0__1__Impl
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
    // InternalTestintentionsAssistance.g:3175:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3179:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalTestintentionsAssistance.g:3180:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalTestintentionsAssistance.g:3180:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalTestintentionsAssistance.g:3181:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalTestintentionsAssistance.g:3182:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalTestintentionsAssistance.g:3182:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalTestintentionsAssistance.g:3191:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3195:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalTestintentionsAssistance.g:3196:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
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
    // InternalTestintentionsAssistance.g:3203:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3207:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3208:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3208:1: ( () )
            // InternalTestintentionsAssistance.g:3209:2: ()
            {
             before(grammarAccess.getAtomicAccess().getSTRINGAction_1_0()); 
            // InternalTestintentionsAssistance.g:3210:2: ()
            // InternalTestintentionsAssistance.g:3210:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getSTRINGAction_1_0()); 

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
    // InternalTestintentionsAssistance.g:3218:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3222:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:3223:2: rule__Atomic__Group_1__1__Impl
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
    // InternalTestintentionsAssistance.g:3229:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3233:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:3234:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:3234:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:3235:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:3236:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalTestintentionsAssistance.g:3236:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalTestintentionsAssistance.g:3245:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3249:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalTestintentionsAssistance.g:3250:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
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
    // InternalTestintentionsAssistance.g:3257:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3261:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3262:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3262:1: ( () )
            // InternalTestintentionsAssistance.g:3263:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBooleanAction_2_0()); 
            // InternalTestintentionsAssistance.g:3264:2: ()
            // InternalTestintentionsAssistance.g:3264:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getBooleanAction_2_0()); 

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
    // InternalTestintentionsAssistance.g:3272:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3276:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalTestintentionsAssistance.g:3277:2: rule__Atomic__Group_2__1__Impl
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
    // InternalTestintentionsAssistance.g:3283:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3287:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalTestintentionsAssistance.g:3288:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalTestintentionsAssistance.g:3288:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalTestintentionsAssistance.g:3289:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalTestintentionsAssistance.g:3290:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalTestintentionsAssistance.g:3290:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalTestintentionsAssistance.g:3299:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3303:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalTestintentionsAssistance.g:3304:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalTestintentionsAssistance.g:3311:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3315:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3316:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3316:1: ( () )
            // InternalTestintentionsAssistance.g:3317:2: ()
            {
             before(grammarAccess.getAtomicAccess().getDoubleAction_3_0()); 
            // InternalTestintentionsAssistance.g:3318:2: ()
            // InternalTestintentionsAssistance.g:3318:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getDoubleAction_3_0()); 

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
    // InternalTestintentionsAssistance.g:3326:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3330:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalTestintentionsAssistance.g:3331:2: rule__Atomic__Group_3__1__Impl
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
    // InternalTestintentionsAssistance.g:3337:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3341:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalTestintentionsAssistance.g:3342:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalTestintentionsAssistance.g:3342:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalTestintentionsAssistance.g:3343:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            // InternalTestintentionsAssistance.g:3344:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalTestintentionsAssistance.g:3344:3: rule__Atomic__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atomic__Group_4__0"
    // InternalTestintentionsAssistance.g:3353:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3357:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalTestintentionsAssistance.g:3358:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Atomic__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1();

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
    // $ANTLR end "rule__Atomic__Group_4__0"


    // $ANTLR start "rule__Atomic__Group_4__0__Impl"
    // InternalTestintentionsAssistance.g:3365:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3369:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3370:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3370:1: ( () )
            // InternalTestintentionsAssistance.g:3371:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 
            // InternalTestintentionsAssistance.g:3372:2: ()
            // InternalTestintentionsAssistance.g:3372:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__0__Impl"


    // $ANTLR start "rule__Atomic__Group_4__1"
    // InternalTestintentionsAssistance.g:3380:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3384:1: ( rule__Atomic__Group_4__1__Impl )
            // InternalTestintentionsAssistance.g:3385:2: rule__Atomic__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_4__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_4__1"


    // $ANTLR start "rule__Atomic__Group_4__1__Impl"
    // InternalTestintentionsAssistance.g:3391:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__VariableAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3395:1: ( ( ( rule__Atomic__VariableAssignment_4_1 ) ) )
            // InternalTestintentionsAssistance.g:3396:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            {
            // InternalTestintentionsAssistance.g:3396:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            // InternalTestintentionsAssistance.g:3397:2: ( rule__Atomic__VariableAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 
            // InternalTestintentionsAssistance.g:3398:2: ( rule__Atomic__VariableAssignment_4_1 )
            // InternalTestintentionsAssistance.g:3398:3: rule__Atomic__VariableAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__VariableAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_4__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalTestintentionsAssistance.g:3407:1: rule__Model__ElementsAssignment : ( ruleDomainDeclaration ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3411:1: ( ( ruleDomainDeclaration ) )
            // InternalTestintentionsAssistance.g:3412:2: ( ruleDomainDeclaration )
            {
            // InternalTestintentionsAssistance.g:3412:2: ( ruleDomainDeclaration )
            // InternalTestintentionsAssistance.g:3413:3: ruleDomainDeclaration
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
    // InternalTestintentionsAssistance.g:3422:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3426:1: ( ( ruleQualifiedName ) )
            // InternalTestintentionsAssistance.g:3427:2: ( ruleQualifiedName )
            {
            // InternalTestintentionsAssistance.g:3427:2: ( ruleQualifiedName )
            // InternalTestintentionsAssistance.g:3428:3: ruleQualifiedName
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
    // InternalTestintentionsAssistance.g:3437:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3441:1: ( ( ruleAbstractElement ) )
            // InternalTestintentionsAssistance.g:3442:2: ( ruleAbstractElement )
            {
            // InternalTestintentionsAssistance.g:3442:2: ( ruleAbstractElement )
            // InternalTestintentionsAssistance.g:3443:3: ruleAbstractElement
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
    // InternalTestintentionsAssistance.g:3452:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3456:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalTestintentionsAssistance.g:3457:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalTestintentionsAssistance.g:3457:2: ( ruleQualifiedNameWithWildcard )
            // InternalTestintentionsAssistance.g:3458:3: ruleQualifiedNameWithWildcard
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
    // InternalTestintentionsAssistance.g:3467:1: rule__Function__OutAssignment_0 : ( ruleVariable ) ;
    public final void rule__Function__OutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3471:1: ( ( ruleVariable ) )
            // InternalTestintentionsAssistance.g:3472:2: ( ruleVariable )
            {
            // InternalTestintentionsAssistance.g:3472:2: ( ruleVariable )
            // InternalTestintentionsAssistance.g:3473:3: ruleVariable
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
    // InternalTestintentionsAssistance.g:3482:1: rule__Function__MethodeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Function__MethodeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3486:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3487:2: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:3487:2: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3488:3: RULE_ID
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
    // InternalTestintentionsAssistance.g:3497:1: rule__Function__ArgAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Function__ArgAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3501:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3502:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3502:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3503:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getArgVariableCrossReference_4_0_0()); 
            // InternalTestintentionsAssistance.g:3504:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3505:4: RULE_ID
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
    // InternalTestintentionsAssistance.g:3516:1: rule__Function__Arg1Assignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Function__Arg1Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3520:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3521:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3521:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3522:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getArg1VariableCrossReference_5_0()); 
            // InternalTestintentionsAssistance.g:3523:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3524:4: RULE_ID
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
    // InternalTestintentionsAssistance.g:3535:1: rule__Data__VariableAssignment_0_2_0 : ( ruleVariable ) ;
    public final void rule__Data__VariableAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3539:1: ( ( ruleVariable ) )
            // InternalTestintentionsAssistance.g:3540:2: ( ruleVariable )
            {
            // InternalTestintentionsAssistance.g:3540:2: ( ruleVariable )
            // InternalTestintentionsAssistance.g:3541:3: ruleVariable
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
    // InternalTestintentionsAssistance.g:3550:1: rule__Data__ValAssignment_0_2_2 : ( ruleAtomic ) ;
    public final void rule__Data__ValAssignment_0_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3554:1: ( ( ruleAtomic ) )
            // InternalTestintentionsAssistance.g:3555:2: ( ruleAtomic )
            {
            // InternalTestintentionsAssistance.g:3555:2: ( ruleAtomic )
            // InternalTestintentionsAssistance.g:3556:3: ruleAtomic
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
    // InternalTestintentionsAssistance.g:3565:1: rule__Data__VariableAssignment_1_0 : ( ruleVariable ) ;
    public final void rule__Data__VariableAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3569:1: ( ( ruleVariable ) )
            // InternalTestintentionsAssistance.g:3570:2: ( ruleVariable )
            {
            // InternalTestintentionsAssistance.g:3570:2: ( ruleVariable )
            // InternalTestintentionsAssistance.g:3571:3: ruleVariable
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
    // InternalTestintentionsAssistance.g:3580:1: rule__Data__ValAssignment_1_2 : ( ruleAtomic ) ;
    public final void rule__Data__ValAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3584:1: ( ( ruleAtomic ) )
            // InternalTestintentionsAssistance.g:3585:2: ( ruleAtomic )
            {
            // InternalTestintentionsAssistance.g:3585:2: ( ruleAtomic )
            // InternalTestintentionsAssistance.g:3586:3: ruleAtomic
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
    // InternalTestintentionsAssistance.g:3595:1: rule__TestIntention__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TestIntention__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3599:1: ( ( RULE_STRING ) )
            // InternalTestintentionsAssistance.g:3600:2: ( RULE_STRING )
            {
            // InternalTestintentionsAssistance.g:3600:2: ( RULE_STRING )
            // InternalTestintentionsAssistance.g:3601:3: RULE_STRING
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
    // InternalTestintentionsAssistance.g:3610:1: rule__TestIntention__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__TestIntention__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3614:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3615:2: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3615:2: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3616:3: ruleExpression
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
    // InternalTestintentionsAssistance.g:3625:1: rule__TestIntention__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__TestIntention__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3629:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3630:2: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3630:2: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3631:3: ruleExpression
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
    // InternalTestintentionsAssistance.g:3640:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3644:1: ( ( ruleAnd ) )
            // InternalTestintentionsAssistance.g:3645:2: ( ruleAnd )
            {
            // InternalTestintentionsAssistance.g:3645:2: ( ruleAnd )
            // InternalTestintentionsAssistance.g:3646:3: ruleAnd
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
    // InternalTestintentionsAssistance.g:3655:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3659:1: ( ( ruleEquality ) )
            // InternalTestintentionsAssistance.g:3660:2: ( ruleEquality )
            {
            // InternalTestintentionsAssistance.g:3660:2: ( ruleEquality )
            // InternalTestintentionsAssistance.g:3661:3: ruleEquality
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
    // InternalTestintentionsAssistance.g:3670:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3674:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3675:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3675:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:3676:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:3677:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:3677:4: rule__Equality__OpAlternatives_1_1_0
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
    // InternalTestintentionsAssistance.g:3685:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3689:1: ( ( ruleComparison ) )
            // InternalTestintentionsAssistance.g:3690:2: ( ruleComparison )
            {
            // InternalTestintentionsAssistance.g:3690:2: ( ruleComparison )
            // InternalTestintentionsAssistance.g:3691:3: ruleComparison
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
    // InternalTestintentionsAssistance.g:3700:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3704:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3705:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3705:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:3706:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:3707:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:3707:4: rule__Comparison__OpAlternatives_1_1_0
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
    // InternalTestintentionsAssistance.g:3715:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3719:1: ( ( rulePlusOrMinus ) )
            // InternalTestintentionsAssistance.g:3720:2: ( rulePlusOrMinus )
            {
            // InternalTestintentionsAssistance.g:3720:2: ( rulePlusOrMinus )
            // InternalTestintentionsAssistance.g:3721:3: rulePlusOrMinus
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
    // InternalTestintentionsAssistance.g:3730:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3734:1: ( ( ruleMulOrDiv ) )
            // InternalTestintentionsAssistance.g:3735:2: ( ruleMulOrDiv )
            {
            // InternalTestintentionsAssistance.g:3735:2: ( ruleMulOrDiv )
            // InternalTestintentionsAssistance.g:3736:3: ruleMulOrDiv
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
    // InternalTestintentionsAssistance.g:3745:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3749:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3750:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3750:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:3751:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:3752:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:3752:4: rule__MulOrDiv__OpAlternatives_1_1_0
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
    // InternalTestintentionsAssistance.g:3760:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3764:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:3765:2: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:3765:2: ( rulePrimary )
            // InternalTestintentionsAssistance.g:3766:3: rulePrimary
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
    // InternalTestintentionsAssistance.g:3775:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3779:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3780:2: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:3780:2: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3781:3: RULE_ID
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
    // InternalTestintentionsAssistance.g:3790:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3794:1: ( ( ruleType ) )
            // InternalTestintentionsAssistance.g:3795:2: ( ruleType )
            {
            // InternalTestintentionsAssistance.g:3795:2: ( ruleType )
            // InternalTestintentionsAssistance.g:3796:3: ruleType
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
    // InternalTestintentionsAssistance.g:3805:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3809:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:3810:2: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:3810:2: ( rulePrimary )
            // InternalTestintentionsAssistance.g:3811:3: rulePrimary
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
    // InternalTestintentionsAssistance.g:3820:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3824:1: ( ( RULE_INT ) )
            // InternalTestintentionsAssistance.g:3825:2: ( RULE_INT )
            {
            // InternalTestintentionsAssistance.g:3825:2: ( RULE_INT )
            // InternalTestintentionsAssistance.g:3826:3: RULE_INT
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
    // InternalTestintentionsAssistance.g:3835:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3839:1: ( ( RULE_STRING ) )
            // InternalTestintentionsAssistance.g:3840:2: ( RULE_STRING )
            {
            // InternalTestintentionsAssistance.g:3840:2: ( RULE_STRING )
            // InternalTestintentionsAssistance.g:3841:3: RULE_STRING
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
    // InternalTestintentionsAssistance.g:3850:1: rule__Atomic__ValueAssignment_2_1 : ( ruleBoolean ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3854:1: ( ( ruleBoolean ) )
            // InternalTestintentionsAssistance.g:3855:2: ( ruleBoolean )
            {
            // InternalTestintentionsAssistance.g:3855:2: ( ruleBoolean )
            // InternalTestintentionsAssistance.g:3856:3: ruleBoolean
            {
             before(grammarAccess.getAtomicAccess().getValueBooleanParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getValueBooleanParserRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atomic__ValueAssignment_3_1"
    // InternalTestintentionsAssistance.g:3865:1: rule__Atomic__ValueAssignment_3_1 : ( ruleDouble ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3869:1: ( ( ruleDouble ) )
            // InternalTestintentionsAssistance.g:3870:2: ( ruleDouble )
            {
            // InternalTestintentionsAssistance.g:3870:2: ( ruleDouble )
            // InternalTestintentionsAssistance.g:3871:3: ruleDouble
            {
             before(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDouble();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getValueDoubleParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_3_1"


    // $ANTLR start "rule__Atomic__VariableAssignment_4_1"
    // InternalTestintentionsAssistance.g:3880:1: rule__Atomic__VariableAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3884:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3885:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3885:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3886:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 
            // InternalTestintentionsAssistance.g:3887:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3888:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getVariableVariableIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__VariableAssignment_4_1"

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
            return "593:1: rule__AbstractElement__Alternatives : ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) );";
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\1\20\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\53\1\25\4\13\6\4\1\5\1\uffff\1\4";
    static final String dfa_10s = "\1\44\1\uffff\1\53\1\30\4\43\1\24\5\44\1\5\1\uffff\1\44";
    static final String dfa_11s = "\1\uffff\1\2\15\uffff\1\1\1\uffff";
    static final String dfa_12s = "\21\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\1\1\1\uffff\1\1",
            "",
            "\1\3",
            "\1\4\1\5\1\6\1\7",
            "\1\1\27\uffff\1\10",
            "\1\1\27\uffff\1\10",
            "\1\1\27\uffff\1\10",
            "\1\1\27\uffff\1\10",
            "\1\15\1\11\1\12\14\uffff\1\13\1\14",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\16\1\1\2\uffff\1\1\1\17\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\17\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\17\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\17\1\1\1\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\17\1\1\1\uffff\1\1",
            "\1\20",
            "",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\17\1\1\1\uffff\1\1"
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
            return "()* loopback of 1535:2: ( rule__Data__Group_0_2__0 )*";
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
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
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
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000180000L});

}