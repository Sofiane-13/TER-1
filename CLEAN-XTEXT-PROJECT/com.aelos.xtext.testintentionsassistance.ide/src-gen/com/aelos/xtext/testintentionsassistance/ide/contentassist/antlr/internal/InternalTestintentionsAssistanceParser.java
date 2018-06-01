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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'<>'", "'\\u2265'", "'\\u2264'", "'>'", "'<'", "'*'", "'/'", "'true'", "'false'", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'domain'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'('", "')'", "','", "'input:('", "':'", "':='", "'description:'", "'datapredicate:'", "'oracle:'", "'\\u2228'", "'\\u2227'", "'+'", "'-'", "'!'"
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


    // $ANTLR start "entryRuleOutVariable"
    // InternalTestintentionsAssistance.g:253:1: entryRuleOutVariable : ruleOutVariable EOF ;
    public final void entryRuleOutVariable() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:254:1: ( ruleOutVariable EOF )
            // InternalTestintentionsAssistance.g:255:1: ruleOutVariable EOF
            {
             before(grammarAccess.getOutVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleOutVariable();

            state._fsp--;

             after(grammarAccess.getOutVariableRule()); 
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
    // $ANTLR end "entryRuleOutVariable"


    // $ANTLR start "ruleOutVariable"
    // InternalTestintentionsAssistance.g:262:1: ruleOutVariable : ( ( rule__OutVariable__Group__0 ) ) ;
    public final void ruleOutVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:266:2: ( ( ( rule__OutVariable__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:267:2: ( ( rule__OutVariable__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:267:2: ( ( rule__OutVariable__Group__0 ) )
            // InternalTestintentionsAssistance.g:268:3: ( rule__OutVariable__Group__0 )
            {
             before(grammarAccess.getOutVariableAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:269:3: ( rule__OutVariable__Group__0 )
            // InternalTestintentionsAssistance.g:269:4: rule__OutVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutVariable"


    // $ANTLR start "entryRuleInst"
    // InternalTestintentionsAssistance.g:278:1: entryRuleInst : ruleInst EOF ;
    public final void entryRuleInst() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:279:1: ( ruleInst EOF )
            // InternalTestintentionsAssistance.g:280:1: ruleInst EOF
            {
             before(grammarAccess.getInstRule()); 
            pushFollow(FOLLOW_1);
            ruleInst();

            state._fsp--;

             after(grammarAccess.getInstRule()); 
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
    // $ANTLR end "entryRuleInst"


    // $ANTLR start "ruleInst"
    // InternalTestintentionsAssistance.g:287:1: ruleInst : ( ( rule__Inst__Group__0 ) ) ;
    public final void ruleInst() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:291:2: ( ( ( rule__Inst__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:292:2: ( ( rule__Inst__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:292:2: ( ( rule__Inst__Group__0 ) )
            // InternalTestintentionsAssistance.g:293:3: ( rule__Inst__Group__0 )
            {
             before(grammarAccess.getInstAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:294:3: ( rule__Inst__Group__0 )
            // InternalTestintentionsAssistance.g:294:4: rule__Inst__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Inst__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInst"


    // $ANTLR start "entryRuleTestIntention"
    // InternalTestintentionsAssistance.g:303:1: entryRuleTestIntention : ruleTestIntention EOF ;
    public final void entryRuleTestIntention() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:304:1: ( ruleTestIntention EOF )
            // InternalTestintentionsAssistance.g:305:1: ruleTestIntention EOF
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
    // InternalTestintentionsAssistance.g:312:1: ruleTestIntention : ( ( rule__TestIntention__Group__0 ) ) ;
    public final void ruleTestIntention() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:316:2: ( ( ( rule__TestIntention__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:317:2: ( ( rule__TestIntention__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:317:2: ( ( rule__TestIntention__Group__0 ) )
            // InternalTestintentionsAssistance.g:318:3: ( rule__TestIntention__Group__0 )
            {
             before(grammarAccess.getTestIntentionAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:319:3: ( rule__TestIntention__Group__0 )
            // InternalTestintentionsAssistance.g:319:4: rule__TestIntention__Group__0
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
    // InternalTestintentionsAssistance.g:328:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:329:1: ( ruleExpression EOF )
            // InternalTestintentionsAssistance.g:330:1: ruleExpression EOF
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
    // InternalTestintentionsAssistance.g:337:1: ruleExpression : ( ruleOr ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:341:2: ( ( ruleOr ) )
            // InternalTestintentionsAssistance.g:342:2: ( ruleOr )
            {
            // InternalTestintentionsAssistance.g:342:2: ( ruleOr )
            // InternalTestintentionsAssistance.g:343:3: ruleOr
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
    // InternalTestintentionsAssistance.g:353:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:354:1: ( ruleOr EOF )
            // InternalTestintentionsAssistance.g:355:1: ruleOr EOF
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
    // InternalTestintentionsAssistance.g:362:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:366:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:367:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:367:2: ( ( rule__Or__Group__0 ) )
            // InternalTestintentionsAssistance.g:368:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:369:3: ( rule__Or__Group__0 )
            // InternalTestintentionsAssistance.g:369:4: rule__Or__Group__0
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
    // InternalTestintentionsAssistance.g:378:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:379:1: ( ruleAnd EOF )
            // InternalTestintentionsAssistance.g:380:1: ruleAnd EOF
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
    // InternalTestintentionsAssistance.g:387:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:391:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:392:2: ( ( rule__And__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:392:2: ( ( rule__And__Group__0 ) )
            // InternalTestintentionsAssistance.g:393:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:394:3: ( rule__And__Group__0 )
            // InternalTestintentionsAssistance.g:394:4: rule__And__Group__0
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
    // InternalTestintentionsAssistance.g:403:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:404:1: ( ruleEquality EOF )
            // InternalTestintentionsAssistance.g:405:1: ruleEquality EOF
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
    // InternalTestintentionsAssistance.g:412:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:416:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:417:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:417:2: ( ( rule__Equality__Group__0 ) )
            // InternalTestintentionsAssistance.g:418:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:419:3: ( rule__Equality__Group__0 )
            // InternalTestintentionsAssistance.g:419:4: rule__Equality__Group__0
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
    // InternalTestintentionsAssistance.g:428:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:429:1: ( ruleComparison EOF )
            // InternalTestintentionsAssistance.g:430:1: ruleComparison EOF
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
    // InternalTestintentionsAssistance.g:437:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:441:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:442:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:442:2: ( ( rule__Comparison__Group__0 ) )
            // InternalTestintentionsAssistance.g:443:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:444:3: ( rule__Comparison__Group__0 )
            // InternalTestintentionsAssistance.g:444:4: rule__Comparison__Group__0
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
    // InternalTestintentionsAssistance.g:453:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:454:1: ( rulePlusOrMinus EOF )
            // InternalTestintentionsAssistance.g:455:1: rulePlusOrMinus EOF
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
    // InternalTestintentionsAssistance.g:462:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:466:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:467:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:467:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalTestintentionsAssistance.g:468:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:469:3: ( rule__PlusOrMinus__Group__0 )
            // InternalTestintentionsAssistance.g:469:4: rule__PlusOrMinus__Group__0
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
    // InternalTestintentionsAssistance.g:478:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:479:1: ( ruleMulOrDiv EOF )
            // InternalTestintentionsAssistance.g:480:1: ruleMulOrDiv EOF
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
    // InternalTestintentionsAssistance.g:487:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:491:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:492:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:492:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalTestintentionsAssistance.g:493:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:494:3: ( rule__MulOrDiv__Group__0 )
            // InternalTestintentionsAssistance.g:494:4: rule__MulOrDiv__Group__0
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
    // InternalTestintentionsAssistance.g:503:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:504:1: ( ruleVariable EOF )
            // InternalTestintentionsAssistance.g:505:1: ruleVariable EOF
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
    // InternalTestintentionsAssistance.g:512:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:516:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:517:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:517:2: ( ( rule__Variable__Group__0 ) )
            // InternalTestintentionsAssistance.g:518:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:519:3: ( rule__Variable__Group__0 )
            // InternalTestintentionsAssistance.g:519:4: rule__Variable__Group__0
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
    // InternalTestintentionsAssistance.g:528:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:529:1: ( ruleBoolean EOF )
            // InternalTestintentionsAssistance.g:530:1: ruleBoolean EOF
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
    // InternalTestintentionsAssistance.g:537:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:541:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:542:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:542:2: ( ( rule__Boolean__Alternatives ) )
            // InternalTestintentionsAssistance.g:543:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:544:3: ( rule__Boolean__Alternatives )
            // InternalTestintentionsAssistance.g:544:4: rule__Boolean__Alternatives
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
    // InternalTestintentionsAssistance.g:553:1: entryRuleDouble : ruleDouble EOF ;
    public final void entryRuleDouble() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:554:1: ( ruleDouble EOF )
            // InternalTestintentionsAssistance.g:555:1: ruleDouble EOF
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
    // InternalTestintentionsAssistance.g:562:1: ruleDouble : ( ( rule__Double__Group__0 ) ) ;
    public final void ruleDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:566:2: ( ( ( rule__Double__Group__0 ) ) )
            // InternalTestintentionsAssistance.g:567:2: ( ( rule__Double__Group__0 ) )
            {
            // InternalTestintentionsAssistance.g:567:2: ( ( rule__Double__Group__0 ) )
            // InternalTestintentionsAssistance.g:568:3: ( rule__Double__Group__0 )
            {
             before(grammarAccess.getDoubleAccess().getGroup()); 
            // InternalTestintentionsAssistance.g:569:3: ( rule__Double__Group__0 )
            // InternalTestintentionsAssistance.g:569:4: rule__Double__Group__0
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
    // InternalTestintentionsAssistance.g:578:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:579:1: ( rulePrimary EOF )
            // InternalTestintentionsAssistance.g:580:1: rulePrimary EOF
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
    // InternalTestintentionsAssistance.g:587:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:591:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:592:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:592:2: ( ( rule__Primary__Alternatives ) )
            // InternalTestintentionsAssistance.g:593:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:594:3: ( rule__Primary__Alternatives )
            // InternalTestintentionsAssistance.g:594:4: rule__Primary__Alternatives
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
    // InternalTestintentionsAssistance.g:603:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalTestintentionsAssistance.g:604:1: ( ruleAtomic EOF )
            // InternalTestintentionsAssistance.g:605:1: ruleAtomic EOF
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
    // InternalTestintentionsAssistance.g:612:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:616:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:617:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:617:2: ( ( rule__Atomic__Alternatives ) )
            // InternalTestintentionsAssistance.g:618:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:619:3: ( rule__Atomic__Alternatives )
            // InternalTestintentionsAssistance.g:619:4: rule__Atomic__Alternatives
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
    // InternalTestintentionsAssistance.g:628:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:632:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalTestintentionsAssistance.g:633:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalTestintentionsAssistance.g:633:2: ( ( rule__Type__Alternatives ) )
            // InternalTestintentionsAssistance.g:634:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalTestintentionsAssistance.g:635:3: ( rule__Type__Alternatives )
            // InternalTestintentionsAssistance.g:635:4: rule__Type__Alternatives
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
    // InternalTestintentionsAssistance.g:643:1: rule__AbstractElement__Alternatives : ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:647:1: ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) )
            int alt2=5;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalTestintentionsAssistance.g:648:2: ( ruleTestIntention )
                    {
                    // InternalTestintentionsAssistance.g:648:2: ( ruleTestIntention )
                    // InternalTestintentionsAssistance.g:649:3: ruleTestIntention
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
                    // InternalTestintentionsAssistance.g:654:2: ( ruleFunction )
                    {
                    // InternalTestintentionsAssistance.g:654:2: ( ruleFunction )
                    // InternalTestintentionsAssistance.g:655:3: ruleFunction
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
                    // InternalTestintentionsAssistance.g:660:2: ( ruleData )
                    {
                    // InternalTestintentionsAssistance.g:660:2: ( ruleData )
                    // InternalTestintentionsAssistance.g:661:3: ruleData
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
                    // InternalTestintentionsAssistance.g:666:2: ( ruleImport )
                    {
                    // InternalTestintentionsAssistance.g:666:2: ( ruleImport )
                    // InternalTestintentionsAssistance.g:667:3: ruleImport
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
                    // InternalTestintentionsAssistance.g:672:2: ( ruleDomainDeclaration )
                    {
                    // InternalTestintentionsAssistance.g:672:2: ( ruleDomainDeclaration )
                    // InternalTestintentionsAssistance.g:673:3: ruleDomainDeclaration
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
    // InternalTestintentionsAssistance.g:682:1: rule__Data__Alternatives : ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__Group_1__0 ) ) );
    public final void rule__Data__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:686:1: ( ( ( rule__Data__Group_0__0 ) ) | ( ( rule__Data__Group_1__0 ) ) )
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
                    // InternalTestintentionsAssistance.g:687:2: ( ( rule__Data__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:687:2: ( ( rule__Data__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:688:3: ( rule__Data__Group_0__0 )
                    {
                     before(grammarAccess.getDataAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:689:3: ( rule__Data__Group_0__0 )
                    // InternalTestintentionsAssistance.g:689:4: rule__Data__Group_0__0
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
                    // InternalTestintentionsAssistance.g:693:2: ( ( rule__Data__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:693:2: ( ( rule__Data__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:694:3: ( rule__Data__Group_1__0 )
                    {
                     before(grammarAccess.getDataAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:695:3: ( rule__Data__Group_1__0 )
                    // InternalTestintentionsAssistance.g:695:4: rule__Data__Group_1__0
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
    // InternalTestintentionsAssistance.g:703:1: rule__Equality__OpAlternatives_1_1_0 : ( ( '=' ) | ( '<>' ) );
    public final void rule__Equality__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:707:1: ( ( '=' ) | ( '<>' ) )
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
                    // InternalTestintentionsAssistance.g:708:2: ( '=' )
                    {
                    // InternalTestintentionsAssistance.g:708:2: ( '=' )
                    // InternalTestintentionsAssistance.g:709:3: '='
                    {
                     before(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOpEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:714:2: ( '<>' )
                    {
                    // InternalTestintentionsAssistance.g:714:2: ( '<>' )
                    // InternalTestintentionsAssistance.g:715:3: '<>'
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
    // InternalTestintentionsAssistance.g:724:1: rule__Comparison__OpAlternatives_1_1_0 : ( ( '\\u2265' ) | ( '\\u2264' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:728:1: ( ( '\\u2265' ) | ( '\\u2264' ) | ( '>' ) | ( '<' ) )
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
                    // InternalTestintentionsAssistance.g:729:2: ( '\\u2265' )
                    {
                    // InternalTestintentionsAssistance.g:729:2: ( '\\u2265' )
                    // InternalTestintentionsAssistance.g:730:3: '\\u2265'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanOrEqualToKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanOrEqualToKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:735:2: ( '\\u2264' )
                    {
                    // InternalTestintentionsAssistance.g:735:2: ( '\\u2264' )
                    // InternalTestintentionsAssistance.g:736:3: '\\u2264'
                    {
                     before(grammarAccess.getComparisonAccess().getOpLessThanOrEqualToKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpLessThanOrEqualToKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:741:2: ( '>' )
                    {
                    // InternalTestintentionsAssistance.g:741:2: ( '>' )
                    // InternalTestintentionsAssistance.g:742:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:747:2: ( '<' )
                    {
                    // InternalTestintentionsAssistance.g:747:2: ( '<' )
                    // InternalTestintentionsAssistance.g:748:3: '<'
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
    // InternalTestintentionsAssistance.g:757:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:761:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==42) ) {
                alt6=1;
            }
            else if ( (LA6_0==43) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalTestintentionsAssistance.g:762:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:762:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalTestintentionsAssistance.g:763:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalTestintentionsAssistance.g:764:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalTestintentionsAssistance.g:764:4: rule__PlusOrMinus__Group_1_0_0__0
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
                    // InternalTestintentionsAssistance.g:768:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:768:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalTestintentionsAssistance.g:769:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalTestintentionsAssistance.g:770:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalTestintentionsAssistance.g:770:4: rule__PlusOrMinus__Group_1_0_1__0
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
    // InternalTestintentionsAssistance.g:778:1: rule__MulOrDiv__OpAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:782:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalTestintentionsAssistance.g:783:2: ( '*' )
                    {
                    // InternalTestintentionsAssistance.g:783:2: ( '*' )
                    // InternalTestintentionsAssistance.g:784:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:789:2: ( '/' )
                    {
                    // InternalTestintentionsAssistance.g:789:2: ( '/' )
                    // InternalTestintentionsAssistance.g:790:3: '/'
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
    // InternalTestintentionsAssistance.g:799:1: rule__Boolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:803:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalTestintentionsAssistance.g:804:2: ( 'true' )
                    {
                    // InternalTestintentionsAssistance.g:804:2: ( 'true' )
                    // InternalTestintentionsAssistance.g:805:3: 'true'
                    {
                     before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:810:2: ( 'false' )
                    {
                    // InternalTestintentionsAssistance.g:810:2: ( 'false' )
                    // InternalTestintentionsAssistance.g:811:3: 'false'
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
    // InternalTestintentionsAssistance.g:820:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:824:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
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
                    // InternalTestintentionsAssistance.g:825:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:825:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:826:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:827:3: ( rule__Primary__Group_0__0 )
                    // InternalTestintentionsAssistance.g:827:4: rule__Primary__Group_0__0
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
                    // InternalTestintentionsAssistance.g:831:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:831:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:832:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:833:3: ( rule__Primary__Group_1__0 )
                    // InternalTestintentionsAssistance.g:833:4: rule__Primary__Group_1__0
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
                    // InternalTestintentionsAssistance.g:837:2: ( ruleAtomic )
                    {
                    // InternalTestintentionsAssistance.g:837:2: ( ruleAtomic )
                    // InternalTestintentionsAssistance.g:838:3: ruleAtomic
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
    // InternalTestintentionsAssistance.g:847:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:851:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) | ( ( rule__Atomic__Group_2__0 ) ) | ( ( rule__Atomic__Group_3__0 ) ) | ( ( rule__Atomic__Group_4__0 ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==EOF||LA10_1==RULE_ID||(LA10_1>=11 && LA10_1<=18)||LA10_1==25||LA10_1==27||LA10_1==29||(LA10_1>=32 && LA10_1<=34)||LA10_1==37||(LA10_1>=39 && LA10_1<=43)) ) {
                    alt10=1;
                }
                else if ( (LA10_1==28) ) {
                    alt10=4;
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
                    // InternalTestintentionsAssistance.g:852:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:852:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalTestintentionsAssistance.g:853:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalTestintentionsAssistance.g:854:3: ( rule__Atomic__Group_0__0 )
                    // InternalTestintentionsAssistance.g:854:4: rule__Atomic__Group_0__0
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
                    // InternalTestintentionsAssistance.g:858:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:858:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalTestintentionsAssistance.g:859:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalTestintentionsAssistance.g:860:3: ( rule__Atomic__Group_1__0 )
                    // InternalTestintentionsAssistance.g:860:4: rule__Atomic__Group_1__0
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
                    // InternalTestintentionsAssistance.g:864:2: ( ( rule__Atomic__Group_2__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:864:2: ( ( rule__Atomic__Group_2__0 ) )
                    // InternalTestintentionsAssistance.g:865:3: ( rule__Atomic__Group_2__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_2()); 
                    // InternalTestintentionsAssistance.g:866:3: ( rule__Atomic__Group_2__0 )
                    // InternalTestintentionsAssistance.g:866:4: rule__Atomic__Group_2__0
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
                    // InternalTestintentionsAssistance.g:870:2: ( ( rule__Atomic__Group_3__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:870:2: ( ( rule__Atomic__Group_3__0 ) )
                    // InternalTestintentionsAssistance.g:871:3: ( rule__Atomic__Group_3__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_3()); 
                    // InternalTestintentionsAssistance.g:872:3: ( rule__Atomic__Group_3__0 )
                    // InternalTestintentionsAssistance.g:872:4: rule__Atomic__Group_3__0
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
                    // InternalTestintentionsAssistance.g:876:2: ( ( rule__Atomic__Group_4__0 ) )
                    {
                    // InternalTestintentionsAssistance.g:876:2: ( ( rule__Atomic__Group_4__0 ) )
                    // InternalTestintentionsAssistance.g:877:3: ( rule__Atomic__Group_4__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_4()); 
                    // InternalTestintentionsAssistance.g:878:3: ( rule__Atomic__Group_4__0 )
                    // InternalTestintentionsAssistance.g:878:4: rule__Atomic__Group_4__0
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
    // InternalTestintentionsAssistance.g:886:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:890:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
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
                    // InternalTestintentionsAssistance.g:891:2: ( ( 'INT' ) )
                    {
                    // InternalTestintentionsAssistance.g:891:2: ( ( 'INT' ) )
                    // InternalTestintentionsAssistance.g:892:3: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalTestintentionsAssistance.g:893:3: ( 'INT' )
                    // InternalTestintentionsAssistance.g:893:4: 'INT'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTestintentionsAssistance.g:897:2: ( ( 'STRING' ) )
                    {
                    // InternalTestintentionsAssistance.g:897:2: ( ( 'STRING' ) )
                    // InternalTestintentionsAssistance.g:898:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalTestintentionsAssistance.g:899:3: ( 'STRING' )
                    // InternalTestintentionsAssistance.g:899:4: 'STRING'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTestintentionsAssistance.g:903:2: ( ( 'Boolean' ) )
                    {
                    // InternalTestintentionsAssistance.g:903:2: ( ( 'Boolean' ) )
                    // InternalTestintentionsAssistance.g:904:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalTestintentionsAssistance.g:905:3: ( 'Boolean' )
                    // InternalTestintentionsAssistance.g:905:4: 'Boolean'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTestintentionsAssistance.g:909:2: ( ( 'Double' ) )
                    {
                    // InternalTestintentionsAssistance.g:909:2: ( ( 'Double' ) )
                    // InternalTestintentionsAssistance.g:910:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalTestintentionsAssistance.g:911:3: ( 'Double' )
                    // InternalTestintentionsAssistance.g:911:4: 'Double'
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
    // InternalTestintentionsAssistance.g:919:1: rule__DomainDeclaration__Group__0 : rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 ;
    public final void rule__DomainDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:923:1: ( rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1 )
            // InternalTestintentionsAssistance.g:924:2: rule__DomainDeclaration__Group__0__Impl rule__DomainDeclaration__Group__1
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
    // InternalTestintentionsAssistance.g:931:1: rule__DomainDeclaration__Group__0__Impl : ( 'domain' ) ;
    public final void rule__DomainDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:935:1: ( ( 'domain' ) )
            // InternalTestintentionsAssistance.g:936:1: ( 'domain' )
            {
            // InternalTestintentionsAssistance.g:936:1: ( 'domain' )
            // InternalTestintentionsAssistance.g:937:2: 'domain'
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
    // InternalTestintentionsAssistance.g:946:1: rule__DomainDeclaration__Group__1 : rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 ;
    public final void rule__DomainDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:950:1: ( rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2 )
            // InternalTestintentionsAssistance.g:951:2: rule__DomainDeclaration__Group__1__Impl rule__DomainDeclaration__Group__2
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
    // InternalTestintentionsAssistance.g:958:1: rule__DomainDeclaration__Group__1__Impl : ( ( rule__DomainDeclaration__NameAssignment_1 ) ) ;
    public final void rule__DomainDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:962:1: ( ( ( rule__DomainDeclaration__NameAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:963:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:963:1: ( ( rule__DomainDeclaration__NameAssignment_1 ) )
            // InternalTestintentionsAssistance.g:964:2: ( rule__DomainDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getDomainDeclarationAccess().getNameAssignment_1()); 
            // InternalTestintentionsAssistance.g:965:2: ( rule__DomainDeclaration__NameAssignment_1 )
            // InternalTestintentionsAssistance.g:965:3: rule__DomainDeclaration__NameAssignment_1
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
    // InternalTestintentionsAssistance.g:973:1: rule__DomainDeclaration__Group__2 : rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 ;
    public final void rule__DomainDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:977:1: ( rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3 )
            // InternalTestintentionsAssistance.g:978:2: rule__DomainDeclaration__Group__2__Impl rule__DomainDeclaration__Group__3
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
    // InternalTestintentionsAssistance.g:985:1: rule__DomainDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__DomainDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:989:1: ( ( '{' ) )
            // InternalTestintentionsAssistance.g:990:1: ( '{' )
            {
            // InternalTestintentionsAssistance.g:990:1: ( '{' )
            // InternalTestintentionsAssistance.g:991:2: '{'
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
    // InternalTestintentionsAssistance.g:1000:1: rule__DomainDeclaration__Group__3 : rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 ;
    public final void rule__DomainDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1004:1: ( rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4 )
            // InternalTestintentionsAssistance.g:1005:2: rule__DomainDeclaration__Group__3__Impl rule__DomainDeclaration__Group__4
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
    // InternalTestintentionsAssistance.g:1012:1: rule__DomainDeclaration__Group__3__Impl : ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__DomainDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1016:1: ( ( ( rule__DomainDeclaration__ElementsAssignment_3 )* ) )
            // InternalTestintentionsAssistance.g:1017:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            {
            // InternalTestintentionsAssistance.g:1017:1: ( ( rule__DomainDeclaration__ElementsAssignment_3 )* )
            // InternalTestintentionsAssistance.g:1018:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getDomainDeclarationAccess().getElementsAssignment_3()); 
            // InternalTestintentionsAssistance.g:1019:2: ( rule__DomainDeclaration__ElementsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==25||LA12_0==29||LA12_0==34||LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1019:3: rule__DomainDeclaration__ElementsAssignment_3
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
    // InternalTestintentionsAssistance.g:1027:1: rule__DomainDeclaration__Group__4 : rule__DomainDeclaration__Group__4__Impl ;
    public final void rule__DomainDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1031:1: ( rule__DomainDeclaration__Group__4__Impl )
            // InternalTestintentionsAssistance.g:1032:2: rule__DomainDeclaration__Group__4__Impl
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
    // InternalTestintentionsAssistance.g:1038:1: rule__DomainDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__DomainDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1042:1: ( ( '}' ) )
            // InternalTestintentionsAssistance.g:1043:1: ( '}' )
            {
            // InternalTestintentionsAssistance.g:1043:1: ( '}' )
            // InternalTestintentionsAssistance.g:1044:2: '}'
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
    // InternalTestintentionsAssistance.g:1054:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1058:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalTestintentionsAssistance.g:1059:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalTestintentionsAssistance.g:1066:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1070:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:1071:1: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:1071:1: ( RULE_ID )
            // InternalTestintentionsAssistance.g:1072:2: RULE_ID
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
    // InternalTestintentionsAssistance.g:1081:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1085:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1086:2: rule__QualifiedName__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1092:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1096:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:1097:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:1097:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:1098:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:1099:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1099:3: rule__QualifiedName__Group_1__0
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
    // InternalTestintentionsAssistance.g:1108:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1112:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalTestintentionsAssistance.g:1113:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalTestintentionsAssistance.g:1120:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1124:1: ( ( '.' ) )
            // InternalTestintentionsAssistance.g:1125:1: ( '.' )
            {
            // InternalTestintentionsAssistance.g:1125:1: ( '.' )
            // InternalTestintentionsAssistance.g:1126:2: '.'
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
    // InternalTestintentionsAssistance.g:1135:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1139:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:1140:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalTestintentionsAssistance.g:1146:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1150:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:1151:1: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:1151:1: ( RULE_ID )
            // InternalTestintentionsAssistance.g:1152:2: RULE_ID
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
    // InternalTestintentionsAssistance.g:1162:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1166:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTestintentionsAssistance.g:1167:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalTestintentionsAssistance.g:1174:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1178:1: ( ( 'import' ) )
            // InternalTestintentionsAssistance.g:1179:1: ( 'import' )
            {
            // InternalTestintentionsAssistance.g:1179:1: ( 'import' )
            // InternalTestintentionsAssistance.g:1180:2: 'import'
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
    // InternalTestintentionsAssistance.g:1189:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1193:1: ( rule__Import__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1194:2: rule__Import__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1200:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1204:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:1205:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:1205:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalTestintentionsAssistance.g:1206:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalTestintentionsAssistance.g:1207:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalTestintentionsAssistance.g:1207:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalTestintentionsAssistance.g:1216:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1220:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalTestintentionsAssistance.g:1221:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalTestintentionsAssistance.g:1228:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1232:1: ( ( ruleQualifiedName ) )
            // InternalTestintentionsAssistance.g:1233:1: ( ruleQualifiedName )
            {
            // InternalTestintentionsAssistance.g:1233:1: ( ruleQualifiedName )
            // InternalTestintentionsAssistance.g:1234:2: ruleQualifiedName
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
    // InternalTestintentionsAssistance.g:1243:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1247:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalTestintentionsAssistance.g:1248:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:1254:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1258:1: ( ( ( '.*' )? ) )
            // InternalTestintentionsAssistance.g:1259:1: ( ( '.*' )? )
            {
            // InternalTestintentionsAssistance.g:1259:1: ( ( '.*' )? )
            // InternalTestintentionsAssistance.g:1260:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalTestintentionsAssistance.g:1261:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTestintentionsAssistance.g:1261:3: '.*'
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
    // InternalTestintentionsAssistance.g:1270:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1274:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalTestintentionsAssistance.g:1275:2: rule__Function__Group__0__Impl rule__Function__Group__1
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
    // InternalTestintentionsAssistance.g:1282:1: rule__Function__Group__0__Impl : ( ( rule__Function__OutAssignment_0 ) ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1286:1: ( ( ( rule__Function__OutAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:1287:1: ( ( rule__Function__OutAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:1287:1: ( ( rule__Function__OutAssignment_0 ) )
            // InternalTestintentionsAssistance.g:1288:2: ( rule__Function__OutAssignment_0 )
            {
             before(grammarAccess.getFunctionAccess().getOutAssignment_0()); 
            // InternalTestintentionsAssistance.g:1289:2: ( rule__Function__OutAssignment_0 )
            // InternalTestintentionsAssistance.g:1289:3: rule__Function__OutAssignment_0
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
    // InternalTestintentionsAssistance.g:1297:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1301:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalTestintentionsAssistance.g:1302:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalTestintentionsAssistance.g:1309:1: rule__Function__Group__1__Impl : ( ( rule__Function__Group_1__0 )* ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1313:1: ( ( ( rule__Function__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:1314:1: ( ( rule__Function__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:1314:1: ( ( rule__Function__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:1315:2: ( rule__Function__Group_1__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:1316:2: ( rule__Function__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1316:3: rule__Function__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Function__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:1324:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1328:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalTestintentionsAssistance.g:1329:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalTestintentionsAssistance.g:1336:1: rule__Function__Group__2__Impl : ( '=' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1340:1: ( ( '=' ) )
            // InternalTestintentionsAssistance.g:1341:1: ( '=' )
            {
            // InternalTestintentionsAssistance.g:1341:1: ( '=' )
            // InternalTestintentionsAssistance.g:1342:2: '='
            {
             before(grammarAccess.getFunctionAccess().getEqualsSignKeyword_2()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:1351:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1355:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalTestintentionsAssistance.g:1356:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalTestintentionsAssistance.g:1363:1: rule__Function__Group__3__Impl : ( ( rule__Function__MethodeAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1367:1: ( ( ( rule__Function__MethodeAssignment_3 ) ) )
            // InternalTestintentionsAssistance.g:1368:1: ( ( rule__Function__MethodeAssignment_3 ) )
            {
            // InternalTestintentionsAssistance.g:1368:1: ( ( rule__Function__MethodeAssignment_3 ) )
            // InternalTestintentionsAssistance.g:1369:2: ( rule__Function__MethodeAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getMethodeAssignment_3()); 
            // InternalTestintentionsAssistance.g:1370:2: ( rule__Function__MethodeAssignment_3 )
            // InternalTestintentionsAssistance.g:1370:3: rule__Function__MethodeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__MethodeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getMethodeAssignment_3()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:1378:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1382:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalTestintentionsAssistance.g:1383:2: rule__Function__Group__4__Impl rule__Function__Group__5
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
    // InternalTestintentionsAssistance.g:1390:1: rule__Function__Group__4__Impl : ( '(' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1394:1: ( ( '(' ) )
            // InternalTestintentionsAssistance.g:1395:1: ( '(' )
            {
            // InternalTestintentionsAssistance.g:1395:1: ( '(' )
            // InternalTestintentionsAssistance.g:1396:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:1405:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1409:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalTestintentionsAssistance.g:1410:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_4);
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
    // InternalTestintentionsAssistance.g:1417:1: rule__Function__Group__5__Impl : ( ( rule__Function__Group_5__0 )* ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1421:1: ( ( ( rule__Function__Group_5__0 )* ) )
            // InternalTestintentionsAssistance.g:1422:1: ( ( rule__Function__Group_5__0 )* )
            {
            // InternalTestintentionsAssistance.g:1422:1: ( ( rule__Function__Group_5__0 )* )
            // InternalTestintentionsAssistance.g:1423:2: ( rule__Function__Group_5__0 )*
            {
             before(grammarAccess.getFunctionAccess().getGroup_5()); 
            // InternalTestintentionsAssistance.g:1424:2: ( rule__Function__Group_5__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==33) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1424:3: rule__Function__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Function__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:1432:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1436:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // InternalTestintentionsAssistance.g:1437:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__7();

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
    // InternalTestintentionsAssistance.g:1444:1: rule__Function__Group__6__Impl : ( ( rule__Function__Arg1Assignment_6 ) ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1448:1: ( ( ( rule__Function__Arg1Assignment_6 ) ) )
            // InternalTestintentionsAssistance.g:1449:1: ( ( rule__Function__Arg1Assignment_6 ) )
            {
            // InternalTestintentionsAssistance.g:1449:1: ( ( rule__Function__Arg1Assignment_6 ) )
            // InternalTestintentionsAssistance.g:1450:2: ( rule__Function__Arg1Assignment_6 )
            {
             before(grammarAccess.getFunctionAccess().getArg1Assignment_6()); 
            // InternalTestintentionsAssistance.g:1451:2: ( rule__Function__Arg1Assignment_6 )
            // InternalTestintentionsAssistance.g:1451:3: rule__Function__Arg1Assignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Function__Arg1Assignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArg1Assignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__Group__7"
    // InternalTestintentionsAssistance.g:1459:1: rule__Function__Group__7 : rule__Function__Group__7__Impl ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1463:1: ( rule__Function__Group__7__Impl )
            // InternalTestintentionsAssistance.g:1464:2: rule__Function__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__7__Impl();

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
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // InternalTestintentionsAssistance.g:1470:1: rule__Function__Group__7__Impl : ( ')' ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1474:1: ( ( ')' ) )
            // InternalTestintentionsAssistance.g:1475:1: ( ')' )
            {
            // InternalTestintentionsAssistance.g:1475:1: ( ')' )
            // InternalTestintentionsAssistance.g:1476:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_7()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group_1__0"
    // InternalTestintentionsAssistance.g:1486:1: rule__Function__Group_1__0 : rule__Function__Group_1__0__Impl rule__Function__Group_1__1 ;
    public final void rule__Function__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1490:1: ( rule__Function__Group_1__0__Impl rule__Function__Group_1__1 )
            // InternalTestintentionsAssistance.g:1491:2: rule__Function__Group_1__0__Impl rule__Function__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Function__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_1__1();

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
    // $ANTLR end "rule__Function__Group_1__0"


    // $ANTLR start "rule__Function__Group_1__0__Impl"
    // InternalTestintentionsAssistance.g:1498:1: rule__Function__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Function__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1502:1: ( ( ',' ) )
            // InternalTestintentionsAssistance.g:1503:1: ( ',' )
            {
            // InternalTestintentionsAssistance.g:1503:1: ( ',' )
            // InternalTestintentionsAssistance.g:1504:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__0__Impl"


    // $ANTLR start "rule__Function__Group_1__1"
    // InternalTestintentionsAssistance.g:1513:1: rule__Function__Group_1__1 : rule__Function__Group_1__1__Impl ;
    public final void rule__Function__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1517:1: ( rule__Function__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:1518:2: rule__Function__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_1__1__Impl();

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
    // $ANTLR end "rule__Function__Group_1__1"


    // $ANTLR start "rule__Function__Group_1__1__Impl"
    // InternalTestintentionsAssistance.g:1524:1: rule__Function__Group_1__1__Impl : ( ( rule__Function__OutAssignment_1_1 ) ) ;
    public final void rule__Function__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1528:1: ( ( ( rule__Function__OutAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:1529:1: ( ( rule__Function__OutAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:1529:1: ( ( rule__Function__OutAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:1530:2: ( rule__Function__OutAssignment_1_1 )
            {
             before(grammarAccess.getFunctionAccess().getOutAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:1531:2: ( rule__Function__OutAssignment_1_1 )
            // InternalTestintentionsAssistance.g:1531:3: rule__Function__OutAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Function__OutAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getOutAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_1__1__Impl"


    // $ANTLR start "rule__Function__Group_5__0"
    // InternalTestintentionsAssistance.g:1540:1: rule__Function__Group_5__0 : rule__Function__Group_5__0__Impl rule__Function__Group_5__1 ;
    public final void rule__Function__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1544:1: ( rule__Function__Group_5__0__Impl rule__Function__Group_5__1 )
            // InternalTestintentionsAssistance.g:1545:2: rule__Function__Group_5__0__Impl rule__Function__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__Function__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group_5__1();

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
    // $ANTLR end "rule__Function__Group_5__0"


    // $ANTLR start "rule__Function__Group_5__0__Impl"
    // InternalTestintentionsAssistance.g:1552:1: rule__Function__Group_5__0__Impl : ( ( rule__Function__ArgAssignment_5_0 ) ) ;
    public final void rule__Function__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1556:1: ( ( ( rule__Function__ArgAssignment_5_0 ) ) )
            // InternalTestintentionsAssistance.g:1557:1: ( ( rule__Function__ArgAssignment_5_0 ) )
            {
            // InternalTestintentionsAssistance.g:1557:1: ( ( rule__Function__ArgAssignment_5_0 ) )
            // InternalTestintentionsAssistance.g:1558:2: ( rule__Function__ArgAssignment_5_0 )
            {
             before(grammarAccess.getFunctionAccess().getArgAssignment_5_0()); 
            // InternalTestintentionsAssistance.g:1559:2: ( rule__Function__ArgAssignment_5_0 )
            // InternalTestintentionsAssistance.g:1559:3: rule__Function__ArgAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Function__ArgAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getArgAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__0__Impl"


    // $ANTLR start "rule__Function__Group_5__1"
    // InternalTestintentionsAssistance.g:1567:1: rule__Function__Group_5__1 : rule__Function__Group_5__1__Impl ;
    public final void rule__Function__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1571:1: ( rule__Function__Group_5__1__Impl )
            // InternalTestintentionsAssistance.g:1572:2: rule__Function__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group_5__1__Impl();

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
    // $ANTLR end "rule__Function__Group_5__1"


    // $ANTLR start "rule__Function__Group_5__1__Impl"
    // InternalTestintentionsAssistance.g:1578:1: rule__Function__Group_5__1__Impl : ( ',' ) ;
    public final void rule__Function__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1582:1: ( ( ',' ) )
            // InternalTestintentionsAssistance.g:1583:1: ( ',' )
            {
            // InternalTestintentionsAssistance.g:1583:1: ( ',' )
            // InternalTestintentionsAssistance.g:1584:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_5_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group_5__1__Impl"


    // $ANTLR start "rule__Data__Group_0__0"
    // InternalTestintentionsAssistance.g:1594:1: rule__Data__Group_0__0 : rule__Data__Group_0__0__Impl rule__Data__Group_0__1 ;
    public final void rule__Data__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1598:1: ( rule__Data__Group_0__0__Impl rule__Data__Group_0__1 )
            // InternalTestintentionsAssistance.g:1599:2: rule__Data__Group_0__0__Impl rule__Data__Group_0__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalTestintentionsAssistance.g:1606:1: rule__Data__Group_0__0__Impl : ( () ) ;
    public final void rule__Data__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1610:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:1611:1: ( () )
            {
            // InternalTestintentionsAssistance.g:1611:1: ( () )
            // InternalTestintentionsAssistance.g:1612:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0_0()); 
            // InternalTestintentionsAssistance.g:1613:2: ()
            // InternalTestintentionsAssistance.g:1613:3: 
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
    // InternalTestintentionsAssistance.g:1621:1: rule__Data__Group_0__1 : rule__Data__Group_0__1__Impl rule__Data__Group_0__2 ;
    public final void rule__Data__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1625:1: ( rule__Data__Group_0__1__Impl rule__Data__Group_0__2 )
            // InternalTestintentionsAssistance.g:1626:2: rule__Data__Group_0__1__Impl rule__Data__Group_0__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalTestintentionsAssistance.g:1633:1: rule__Data__Group_0__1__Impl : ( 'input:(' ) ;
    public final void rule__Data__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1637:1: ( ( 'input:(' ) )
            // InternalTestintentionsAssistance.g:1638:1: ( 'input:(' )
            {
            // InternalTestintentionsAssistance.g:1638:1: ( 'input:(' )
            // InternalTestintentionsAssistance.g:1639:2: 'input:('
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
    // InternalTestintentionsAssistance.g:1648:1: rule__Data__Group_0__2 : rule__Data__Group_0__2__Impl ;
    public final void rule__Data__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1652:1: ( rule__Data__Group_0__2__Impl )
            // InternalTestintentionsAssistance.g:1653:2: rule__Data__Group_0__2__Impl
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
    // InternalTestintentionsAssistance.g:1659:1: rule__Data__Group_0__2__Impl : ( ( rule__Data__Group_0_2__0 )* ) ;
    public final void rule__Data__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1663:1: ( ( ( rule__Data__Group_0_2__0 )* ) )
            // InternalTestintentionsAssistance.g:1664:1: ( ( rule__Data__Group_0_2__0 )* )
            {
            // InternalTestintentionsAssistance.g:1664:1: ( ( rule__Data__Group_0_2__0 )* )
            // InternalTestintentionsAssistance.g:1665:2: ( rule__Data__Group_0_2__0 )*
            {
             before(grammarAccess.getDataAccess().getGroup_0_2()); 
            // InternalTestintentionsAssistance.g:1666:2: ( rule__Data__Group_0_2__0 )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1666:3: rule__Data__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Data__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalTestintentionsAssistance.g:1675:1: rule__Data__Group_0_2__0 : rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1 ;
    public final void rule__Data__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1679:1: ( rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1 )
            // InternalTestintentionsAssistance.g:1680:2: rule__Data__Group_0_2__0__Impl rule__Data__Group_0_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalTestintentionsAssistance.g:1687:1: rule__Data__Group_0_2__0__Impl : ( ( rule__Data__InstAssignment_0_2_0 ) ) ;
    public final void rule__Data__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1691:1: ( ( ( rule__Data__InstAssignment_0_2_0 ) ) )
            // InternalTestintentionsAssistance.g:1692:1: ( ( rule__Data__InstAssignment_0_2_0 ) )
            {
            // InternalTestintentionsAssistance.g:1692:1: ( ( rule__Data__InstAssignment_0_2_0 ) )
            // InternalTestintentionsAssistance.g:1693:2: ( rule__Data__InstAssignment_0_2_0 )
            {
             before(grammarAccess.getDataAccess().getInstAssignment_0_2_0()); 
            // InternalTestintentionsAssistance.g:1694:2: ( rule__Data__InstAssignment_0_2_0 )
            // InternalTestintentionsAssistance.g:1694:3: rule__Data__InstAssignment_0_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Data__InstAssignment_0_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getInstAssignment_0_2_0()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:1702:1: rule__Data__Group_0_2__1 : rule__Data__Group_0_2__1__Impl ;
    public final void rule__Data__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1706:1: ( rule__Data__Group_0_2__1__Impl )
            // InternalTestintentionsAssistance.g:1707:2: rule__Data__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_0_2__1__Impl();

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
    // InternalTestintentionsAssistance.g:1713:1: rule__Data__Group_0_2__1__Impl : ( ',' ) ;
    public final void rule__Data__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1717:1: ( ( ',' ) )
            // InternalTestintentionsAssistance.g:1718:1: ( ',' )
            {
            // InternalTestintentionsAssistance.g:1718:1: ( ',' )
            // InternalTestintentionsAssistance.g:1719:2: ','
            {
             before(grammarAccess.getDataAccess().getCommaKeyword_0_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getCommaKeyword_0_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Data__Group_1__0"
    // InternalTestintentionsAssistance.g:1729:1: rule__Data__Group_1__0 : rule__Data__Group_1__0__Impl rule__Data__Group_1__1 ;
    public final void rule__Data__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1733:1: ( rule__Data__Group_1__0__Impl rule__Data__Group_1__1 )
            // InternalTestintentionsAssistance.g:1734:2: rule__Data__Group_1__0__Impl rule__Data__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalTestintentionsAssistance.g:1741:1: rule__Data__Group_1__0__Impl : ( ( rule__Data__InstAssignment_1_0 ) ) ;
    public final void rule__Data__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1745:1: ( ( ( rule__Data__InstAssignment_1_0 ) ) )
            // InternalTestintentionsAssistance.g:1746:1: ( ( rule__Data__InstAssignment_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:1746:1: ( ( rule__Data__InstAssignment_1_0 ) )
            // InternalTestintentionsAssistance.g:1747:2: ( rule__Data__InstAssignment_1_0 )
            {
             before(grammarAccess.getDataAccess().getInstAssignment_1_0()); 
            // InternalTestintentionsAssistance.g:1748:2: ( rule__Data__InstAssignment_1_0 )
            // InternalTestintentionsAssistance.g:1748:3: rule__Data__InstAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Data__InstAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getInstAssignment_1_0()); 

            }


            }

        }
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
    // InternalTestintentionsAssistance.g:1756:1: rule__Data__Group_1__1 : rule__Data__Group_1__1__Impl ;
    public final void rule__Data__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1760:1: ( rule__Data__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:1761:2: rule__Data__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_1__1__Impl();

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
    // InternalTestintentionsAssistance.g:1767:1: rule__Data__Group_1__1__Impl : ( ( ')' )* ) ;
    public final void rule__Data__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1771:1: ( ( ( ')' )* ) )
            // InternalTestintentionsAssistance.g:1772:1: ( ( ')' )* )
            {
            // InternalTestintentionsAssistance.g:1772:1: ( ( ')' )* )
            // InternalTestintentionsAssistance.g:1773:2: ( ')' )*
            {
             before(grammarAccess.getDataAccess().getRightParenthesisKeyword_1_1()); 
            // InternalTestintentionsAssistance.g:1774:2: ( ')' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:1774:3: ')'
            	    {
            	    match(input,32,FOLLOW_20); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDataAccess().getRightParenthesisKeyword_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__OutVariable__Group__0"
    // InternalTestintentionsAssistance.g:1783:1: rule__OutVariable__Group__0 : rule__OutVariable__Group__0__Impl rule__OutVariable__Group__1 ;
    public final void rule__OutVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1787:1: ( rule__OutVariable__Group__0__Impl rule__OutVariable__Group__1 )
            // InternalTestintentionsAssistance.g:1788:2: rule__OutVariable__Group__0__Impl rule__OutVariable__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OutVariable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__1();

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
    // $ANTLR end "rule__OutVariable__Group__0"


    // $ANTLR start "rule__OutVariable__Group__0__Impl"
    // InternalTestintentionsAssistance.g:1795:1: rule__OutVariable__Group__0__Impl : ( ( rule__OutVariable__NameAssignment_0 ) ) ;
    public final void rule__OutVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1799:1: ( ( ( rule__OutVariable__NameAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:1800:1: ( ( rule__OutVariable__NameAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:1800:1: ( ( rule__OutVariable__NameAssignment_0 ) )
            // InternalTestintentionsAssistance.g:1801:2: ( rule__OutVariable__NameAssignment_0 )
            {
             before(grammarAccess.getOutVariableAccess().getNameAssignment_0()); 
            // InternalTestintentionsAssistance.g:1802:2: ( rule__OutVariable__NameAssignment_0 )
            // InternalTestintentionsAssistance.g:1802:3: rule__OutVariable__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OutVariable__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOutVariableAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__0__Impl"


    // $ANTLR start "rule__OutVariable__Group__1"
    // InternalTestintentionsAssistance.g:1810:1: rule__OutVariable__Group__1 : rule__OutVariable__Group__1__Impl rule__OutVariable__Group__2 ;
    public final void rule__OutVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1814:1: ( rule__OutVariable__Group__1__Impl rule__OutVariable__Group__2 )
            // InternalTestintentionsAssistance.g:1815:2: rule__OutVariable__Group__1__Impl rule__OutVariable__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__OutVariable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__2();

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
    // $ANTLR end "rule__OutVariable__Group__1"


    // $ANTLR start "rule__OutVariable__Group__1__Impl"
    // InternalTestintentionsAssistance.g:1822:1: rule__OutVariable__Group__1__Impl : ( ':' ) ;
    public final void rule__OutVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1826:1: ( ( ':' ) )
            // InternalTestintentionsAssistance.g:1827:1: ( ':' )
            {
            // InternalTestintentionsAssistance.g:1827:1: ( ':' )
            // InternalTestintentionsAssistance.g:1828:2: ':'
            {
             before(grammarAccess.getOutVariableAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOutVariableAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__1__Impl"


    // $ANTLR start "rule__OutVariable__Group__2"
    // InternalTestintentionsAssistance.g:1837:1: rule__OutVariable__Group__2 : rule__OutVariable__Group__2__Impl ;
    public final void rule__OutVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1841:1: ( rule__OutVariable__Group__2__Impl )
            // InternalTestintentionsAssistance.g:1842:2: rule__OutVariable__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutVariable__Group__2__Impl();

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
    // $ANTLR end "rule__OutVariable__Group__2"


    // $ANTLR start "rule__OutVariable__Group__2__Impl"
    // InternalTestintentionsAssistance.g:1848:1: rule__OutVariable__Group__2__Impl : ( ( rule__OutVariable__TypeAssignment_2 ) ) ;
    public final void rule__OutVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1852:1: ( ( ( rule__OutVariable__TypeAssignment_2 ) ) )
            // InternalTestintentionsAssistance.g:1853:1: ( ( rule__OutVariable__TypeAssignment_2 ) )
            {
            // InternalTestintentionsAssistance.g:1853:1: ( ( rule__OutVariable__TypeAssignment_2 ) )
            // InternalTestintentionsAssistance.g:1854:2: ( rule__OutVariable__TypeAssignment_2 )
            {
             before(grammarAccess.getOutVariableAccess().getTypeAssignment_2()); 
            // InternalTestintentionsAssistance.g:1855:2: ( rule__OutVariable__TypeAssignment_2 )
            // InternalTestintentionsAssistance.g:1855:3: rule__OutVariable__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OutVariable__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutVariableAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__Group__2__Impl"


    // $ANTLR start "rule__Inst__Group__0"
    // InternalTestintentionsAssistance.g:1864:1: rule__Inst__Group__0 : rule__Inst__Group__0__Impl rule__Inst__Group__1 ;
    public final void rule__Inst__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1868:1: ( rule__Inst__Group__0__Impl rule__Inst__Group__1 )
            // InternalTestintentionsAssistance.g:1869:2: rule__Inst__Group__0__Impl rule__Inst__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Inst__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inst__Group__1();

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
    // $ANTLR end "rule__Inst__Group__0"


    // $ANTLR start "rule__Inst__Group__0__Impl"
    // InternalTestintentionsAssistance.g:1876:1: rule__Inst__Group__0__Impl : ( ( rule__Inst__VariableAssignment_0 ) ) ;
    public final void rule__Inst__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1880:1: ( ( ( rule__Inst__VariableAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:1881:1: ( ( rule__Inst__VariableAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:1881:1: ( ( rule__Inst__VariableAssignment_0 ) )
            // InternalTestintentionsAssistance.g:1882:2: ( rule__Inst__VariableAssignment_0 )
            {
             before(grammarAccess.getInstAccess().getVariableAssignment_0()); 
            // InternalTestintentionsAssistance.g:1883:2: ( rule__Inst__VariableAssignment_0 )
            // InternalTestintentionsAssistance.g:1883:3: rule__Inst__VariableAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Inst__VariableAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getInstAccess().getVariableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inst__Group__0__Impl"


    // $ANTLR start "rule__Inst__Group__1"
    // InternalTestintentionsAssistance.g:1891:1: rule__Inst__Group__1 : rule__Inst__Group__1__Impl rule__Inst__Group__2 ;
    public final void rule__Inst__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1895:1: ( rule__Inst__Group__1__Impl rule__Inst__Group__2 )
            // InternalTestintentionsAssistance.g:1896:2: rule__Inst__Group__1__Impl rule__Inst__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Inst__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Inst__Group__2();

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
    // $ANTLR end "rule__Inst__Group__1"


    // $ANTLR start "rule__Inst__Group__1__Impl"
    // InternalTestintentionsAssistance.g:1903:1: rule__Inst__Group__1__Impl : ( ':=' ) ;
    public final void rule__Inst__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1907:1: ( ( ':=' ) )
            // InternalTestintentionsAssistance.g:1908:1: ( ':=' )
            {
            // InternalTestintentionsAssistance.g:1908:1: ( ':=' )
            // InternalTestintentionsAssistance.g:1909:2: ':='
            {
             before(grammarAccess.getInstAccess().getColonEqualsSignKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInstAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inst__Group__1__Impl"


    // $ANTLR start "rule__Inst__Group__2"
    // InternalTestintentionsAssistance.g:1918:1: rule__Inst__Group__2 : rule__Inst__Group__2__Impl ;
    public final void rule__Inst__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1922:1: ( rule__Inst__Group__2__Impl )
            // InternalTestintentionsAssistance.g:1923:2: rule__Inst__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inst__Group__2__Impl();

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
    // $ANTLR end "rule__Inst__Group__2"


    // $ANTLR start "rule__Inst__Group__2__Impl"
    // InternalTestintentionsAssistance.g:1929:1: rule__Inst__Group__2__Impl : ( ( rule__Inst__ValeurAssignment_2 ) ) ;
    public final void rule__Inst__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1933:1: ( ( ( rule__Inst__ValeurAssignment_2 ) ) )
            // InternalTestintentionsAssistance.g:1934:1: ( ( rule__Inst__ValeurAssignment_2 ) )
            {
            // InternalTestintentionsAssistance.g:1934:1: ( ( rule__Inst__ValeurAssignment_2 ) )
            // InternalTestintentionsAssistance.g:1935:2: ( rule__Inst__ValeurAssignment_2 )
            {
             before(grammarAccess.getInstAccess().getValeurAssignment_2()); 
            // InternalTestintentionsAssistance.g:1936:2: ( rule__Inst__ValeurAssignment_2 )
            // InternalTestintentionsAssistance.g:1936:3: rule__Inst__ValeurAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Inst__ValeurAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstAccess().getValeurAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inst__Group__2__Impl"


    // $ANTLR start "rule__TestIntention__Group__0"
    // InternalTestintentionsAssistance.g:1945:1: rule__TestIntention__Group__0 : rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1 ;
    public final void rule__TestIntention__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1949:1: ( rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1 )
            // InternalTestintentionsAssistance.g:1950:2: rule__TestIntention__Group__0__Impl rule__TestIntention__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTestintentionsAssistance.g:1957:1: rule__TestIntention__Group__0__Impl : ( 'description:' ) ;
    public final void rule__TestIntention__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1961:1: ( ( 'description:' ) )
            // InternalTestintentionsAssistance.g:1962:1: ( 'description:' )
            {
            // InternalTestintentionsAssistance.g:1962:1: ( 'description:' )
            // InternalTestintentionsAssistance.g:1963:2: 'description:'
            {
             before(grammarAccess.getTestIntentionAccess().getDescriptionKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:1972:1: rule__TestIntention__Group__1 : rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2 ;
    public final void rule__TestIntention__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1976:1: ( rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2 )
            // InternalTestintentionsAssistance.g:1977:2: rule__TestIntention__Group__1__Impl rule__TestIntention__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalTestintentionsAssistance.g:1984:1: rule__TestIntention__Group__1__Impl : ( ( rule__TestIntention__DescriptionAssignment_1 ) ) ;
    public final void rule__TestIntention__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:1988:1: ( ( ( rule__TestIntention__DescriptionAssignment_1 ) ) )
            // InternalTestintentionsAssistance.g:1989:1: ( ( rule__TestIntention__DescriptionAssignment_1 ) )
            {
            // InternalTestintentionsAssistance.g:1989:1: ( ( rule__TestIntention__DescriptionAssignment_1 ) )
            // InternalTestintentionsAssistance.g:1990:2: ( rule__TestIntention__DescriptionAssignment_1 )
            {
             before(grammarAccess.getTestIntentionAccess().getDescriptionAssignment_1()); 
            // InternalTestintentionsAssistance.g:1991:2: ( rule__TestIntention__DescriptionAssignment_1 )
            // InternalTestintentionsAssistance.g:1991:3: rule__TestIntention__DescriptionAssignment_1
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
    // InternalTestintentionsAssistance.g:1999:1: rule__TestIntention__Group__2 : rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3 ;
    public final void rule__TestIntention__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2003:1: ( rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3 )
            // InternalTestintentionsAssistance.g:2004:2: rule__TestIntention__Group__2__Impl rule__TestIntention__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:2011:1: rule__TestIntention__Group__2__Impl : ( 'datapredicate:' ) ;
    public final void rule__TestIntention__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2015:1: ( ( 'datapredicate:' ) )
            // InternalTestintentionsAssistance.g:2016:1: ( 'datapredicate:' )
            {
            // InternalTestintentionsAssistance.g:2016:1: ( 'datapredicate:' )
            // InternalTestintentionsAssistance.g:2017:2: 'datapredicate:'
            {
             before(grammarAccess.getTestIntentionAccess().getDatapredicateKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:2026:1: rule__TestIntention__Group__3 : rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4 ;
    public final void rule__TestIntention__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2030:1: ( rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4 )
            // InternalTestintentionsAssistance.g:2031:2: rule__TestIntention__Group__3__Impl rule__TestIntention__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalTestintentionsAssistance.g:2038:1: rule__TestIntention__Group__3__Impl : ( ( rule__TestIntention__ExpressionAssignment_3 ) ) ;
    public final void rule__TestIntention__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2042:1: ( ( ( rule__TestIntention__ExpressionAssignment_3 ) ) )
            // InternalTestintentionsAssistance.g:2043:1: ( ( rule__TestIntention__ExpressionAssignment_3 ) )
            {
            // InternalTestintentionsAssistance.g:2043:1: ( ( rule__TestIntention__ExpressionAssignment_3 ) )
            // InternalTestintentionsAssistance.g:2044:2: ( rule__TestIntention__ExpressionAssignment_3 )
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionAssignment_3()); 
            // InternalTestintentionsAssistance.g:2045:2: ( rule__TestIntention__ExpressionAssignment_3 )
            // InternalTestintentionsAssistance.g:2045:3: rule__TestIntention__ExpressionAssignment_3
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
    // InternalTestintentionsAssistance.g:2053:1: rule__TestIntention__Group__4 : rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5 ;
    public final void rule__TestIntention__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2057:1: ( rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5 )
            // InternalTestintentionsAssistance.g:2058:2: rule__TestIntention__Group__4__Impl rule__TestIntention__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalTestintentionsAssistance.g:2065:1: rule__TestIntention__Group__4__Impl : ( 'oracle:' ) ;
    public final void rule__TestIntention__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2069:1: ( ( 'oracle:' ) )
            // InternalTestintentionsAssistance.g:2070:1: ( 'oracle:' )
            {
            // InternalTestintentionsAssistance.g:2070:1: ( 'oracle:' )
            // InternalTestintentionsAssistance.g:2071:2: 'oracle:'
            {
             before(grammarAccess.getTestIntentionAccess().getOracleKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:2080:1: rule__TestIntention__Group__5 : rule__TestIntention__Group__5__Impl rule__TestIntention__Group__6 ;
    public final void rule__TestIntention__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2084:1: ( rule__TestIntention__Group__5__Impl rule__TestIntention__Group__6 )
            // InternalTestintentionsAssistance.g:2085:2: rule__TestIntention__Group__5__Impl rule__TestIntention__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__TestIntention__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__6();

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
    // InternalTestintentionsAssistance.g:2092:1: rule__TestIntention__Group__5__Impl : ( ( rule__TestIntention__OutvarAssignment_5 ) ) ;
    public final void rule__TestIntention__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2096:1: ( ( ( rule__TestIntention__OutvarAssignment_5 ) ) )
            // InternalTestintentionsAssistance.g:2097:1: ( ( rule__TestIntention__OutvarAssignment_5 ) )
            {
            // InternalTestintentionsAssistance.g:2097:1: ( ( rule__TestIntention__OutvarAssignment_5 ) )
            // InternalTestintentionsAssistance.g:2098:2: ( rule__TestIntention__OutvarAssignment_5 )
            {
             before(grammarAccess.getTestIntentionAccess().getOutvarAssignment_5()); 
            // InternalTestintentionsAssistance.g:2099:2: ( rule__TestIntention__OutvarAssignment_5 )
            // InternalTestintentionsAssistance.g:2099:3: rule__TestIntention__OutvarAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__OutvarAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTestIntentionAccess().getOutvarAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__TestIntention__Group__6"
    // InternalTestintentionsAssistance.g:2107:1: rule__TestIntention__Group__6 : rule__TestIntention__Group__6__Impl rule__TestIntention__Group__7 ;
    public final void rule__TestIntention__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2111:1: ( rule__TestIntention__Group__6__Impl rule__TestIntention__Group__7 )
            // InternalTestintentionsAssistance.g:2112:2: rule__TestIntention__Group__6__Impl rule__TestIntention__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__TestIntention__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__7();

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
    // $ANTLR end "rule__TestIntention__Group__6"


    // $ANTLR start "rule__TestIntention__Group__6__Impl"
    // InternalTestintentionsAssistance.g:2119:1: rule__TestIntention__Group__6__Impl : ( '=' ) ;
    public final void rule__TestIntention__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2123:1: ( ( '=' ) )
            // InternalTestintentionsAssistance.g:2124:1: ( '=' )
            {
            // InternalTestintentionsAssistance.g:2124:1: ( '=' )
            // InternalTestintentionsAssistance.g:2125:2: '='
            {
             before(grammarAccess.getTestIntentionAccess().getEqualsSignKeyword_6()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTestIntentionAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__6__Impl"


    // $ANTLR start "rule__TestIntention__Group__7"
    // InternalTestintentionsAssistance.g:2134:1: rule__TestIntention__Group__7 : rule__TestIntention__Group__7__Impl ;
    public final void rule__TestIntention__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2138:1: ( rule__TestIntention__Group__7__Impl )
            // InternalTestintentionsAssistance.g:2139:2: rule__TestIntention__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__Group__7__Impl();

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
    // $ANTLR end "rule__TestIntention__Group__7"


    // $ANTLR start "rule__TestIntention__Group__7__Impl"
    // InternalTestintentionsAssistance.g:2145:1: rule__TestIntention__Group__7__Impl : ( ( rule__TestIntention__ExpressionAssignment_7 ) ) ;
    public final void rule__TestIntention__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2149:1: ( ( ( rule__TestIntention__ExpressionAssignment_7 ) ) )
            // InternalTestintentionsAssistance.g:2150:1: ( ( rule__TestIntention__ExpressionAssignment_7 ) )
            {
            // InternalTestintentionsAssistance.g:2150:1: ( ( rule__TestIntention__ExpressionAssignment_7 ) )
            // InternalTestintentionsAssistance.g:2151:2: ( rule__TestIntention__ExpressionAssignment_7 )
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionAssignment_7()); 
            // InternalTestintentionsAssistance.g:2152:2: ( rule__TestIntention__ExpressionAssignment_7 )
            // InternalTestintentionsAssistance.g:2152:3: rule__TestIntention__ExpressionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__TestIntention__ExpressionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTestIntentionAccess().getExpressionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__Group__7__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // InternalTestintentionsAssistance.g:2161:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2165:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalTestintentionsAssistance.g:2166:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTestintentionsAssistance.g:2173:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2177:1: ( ( ruleAnd ) )
            // InternalTestintentionsAssistance.g:2178:1: ( ruleAnd )
            {
            // InternalTestintentionsAssistance.g:2178:1: ( ruleAnd )
            // InternalTestintentionsAssistance.g:2179:2: ruleAnd
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
    // InternalTestintentionsAssistance.g:2188:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2192:1: ( rule__Or__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2193:2: rule__Or__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2199:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2203:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2204:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2204:1: ( ( rule__Or__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2205:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2206:2: ( rule__Or__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2206:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_31);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTestintentionsAssistance.g:2215:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2219:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalTestintentionsAssistance.g:2220:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalTestintentionsAssistance.g:2227:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2231:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2232:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2232:1: ( () )
            // InternalTestintentionsAssistance.g:2233:2: ()
            {
             before(grammarAccess.getOrAccess().getOrLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2234:2: ()
            // InternalTestintentionsAssistance.g:2234:3: 
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
    // InternalTestintentionsAssistance.g:2242:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2246:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalTestintentionsAssistance.g:2247:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:2254:1: rule__Or__Group_1__1__Impl : ( '\\u2228' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2258:1: ( ( '\\u2228' ) )
            // InternalTestintentionsAssistance.g:2259:1: ( '\\u2228' )
            {
            // InternalTestintentionsAssistance.g:2259:1: ( '\\u2228' )
            // InternalTestintentionsAssistance.g:2260:2: '\\u2228'
            {
             before(grammarAccess.getOrAccess().getLogicalOrKeyword_1_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:2269:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2273:1: ( rule__Or__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2274:2: rule__Or__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2280:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2284:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2285:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2285:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2286:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2287:2: ( rule__Or__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2287:3: rule__Or__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2296:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2300:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalTestintentionsAssistance.g:2301:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalTestintentionsAssistance.g:2308:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2312:1: ( ( ruleEquality ) )
            // InternalTestintentionsAssistance.g:2313:1: ( ruleEquality )
            {
            // InternalTestintentionsAssistance.g:2313:1: ( ruleEquality )
            // InternalTestintentionsAssistance.g:2314:2: ruleEquality
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
    // InternalTestintentionsAssistance.g:2323:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2327:1: ( rule__And__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2328:2: rule__And__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2334:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2338:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2339:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2339:1: ( ( rule__And__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2340:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2341:2: ( rule__And__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2341:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalTestintentionsAssistance.g:2350:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2354:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalTestintentionsAssistance.g:2355:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalTestintentionsAssistance.g:2362:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2366:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2367:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2367:1: ( () )
            // InternalTestintentionsAssistance.g:2368:2: ()
            {
             before(grammarAccess.getAndAccess().getAndLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2369:2: ()
            // InternalTestintentionsAssistance.g:2369:3: 
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
    // InternalTestintentionsAssistance.g:2377:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2381:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalTestintentionsAssistance.g:2382:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:2389:1: rule__And__Group_1__1__Impl : ( '\\u2227' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2393:1: ( ( '\\u2227' ) )
            // InternalTestintentionsAssistance.g:2394:1: ( '\\u2227' )
            {
            // InternalTestintentionsAssistance.g:2394:1: ( '\\u2227' )
            // InternalTestintentionsAssistance.g:2395:2: '\\u2227'
            {
             before(grammarAccess.getAndAccess().getLogicalAndKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:2404:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2408:1: ( rule__And__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2409:2: rule__And__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2415:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2419:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2420:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2420:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2421:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2422:2: ( rule__And__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2422:3: rule__And__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2431:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2435:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalTestintentionsAssistance.g:2436:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalTestintentionsAssistance.g:2443:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2447:1: ( ( ruleComparison ) )
            // InternalTestintentionsAssistance.g:2448:1: ( ruleComparison )
            {
            // InternalTestintentionsAssistance.g:2448:1: ( ruleComparison )
            // InternalTestintentionsAssistance.g:2449:2: ruleComparison
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
    // InternalTestintentionsAssistance.g:2458:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2462:1: ( rule__Equality__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2463:2: rule__Equality__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2469:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2473:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2474:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2474:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2475:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2476:2: ( rule__Equality__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2476:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalTestintentionsAssistance.g:2485:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2489:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalTestintentionsAssistance.g:2490:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalTestintentionsAssistance.g:2497:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2501:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2502:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2502:1: ( () )
            // InternalTestintentionsAssistance.g:2503:2: ()
            {
             before(grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2504:2: ()
            // InternalTestintentionsAssistance.g:2504:3: 
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
    // InternalTestintentionsAssistance.g:2512:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2516:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalTestintentionsAssistance.g:2517:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:2524:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OpAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2528:1: ( ( ( rule__Equality__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2529:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2529:1: ( ( rule__Equality__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2530:2: ( rule__Equality__OpAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2531:2: ( rule__Equality__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2531:3: rule__Equality__OpAssignment_1_1
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
    // InternalTestintentionsAssistance.g:2539:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2543:1: ( rule__Equality__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2544:2: rule__Equality__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2550:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2554:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2555:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2555:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2556:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2557:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2557:3: rule__Equality__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2566:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2570:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalTestintentionsAssistance.g:2571:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTestintentionsAssistance.g:2578:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2582:1: ( ( rulePlusOrMinus ) )
            // InternalTestintentionsAssistance.g:2583:1: ( rulePlusOrMinus )
            {
            // InternalTestintentionsAssistance.g:2583:1: ( rulePlusOrMinus )
            // InternalTestintentionsAssistance.g:2584:2: rulePlusOrMinus
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
    // InternalTestintentionsAssistance.g:2593:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2597:1: ( rule__Comparison__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2598:2: rule__Comparison__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2604:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2608:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2609:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2609:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2610:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2611:2: ( rule__Comparison__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=13 && LA22_0<=16)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2611:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalTestintentionsAssistance.g:2620:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2624:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalTestintentionsAssistance.g:2625:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalTestintentionsAssistance.g:2632:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2636:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2637:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2637:1: ( () )
            // InternalTestintentionsAssistance.g:2638:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2639:2: ()
            // InternalTestintentionsAssistance.g:2639:3: 
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
    // InternalTestintentionsAssistance.g:2647:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2651:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalTestintentionsAssistance.g:2652:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:2659:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OpAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2663:1: ( ( ( rule__Comparison__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2664:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2664:1: ( ( rule__Comparison__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2665:2: ( rule__Comparison__OpAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2666:2: ( rule__Comparison__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2666:3: rule__Comparison__OpAssignment_1_1
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
    // InternalTestintentionsAssistance.g:2674:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2678:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:2679:2: rule__Comparison__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:2685:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2689:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:2690:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:2690:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:2691:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:2692:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:2692:3: rule__Comparison__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:2701:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2705:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalTestintentionsAssistance.g:2706:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalTestintentionsAssistance.g:2713:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2717:1: ( ( ruleMulOrDiv ) )
            // InternalTestintentionsAssistance.g:2718:1: ( ruleMulOrDiv )
            {
            // InternalTestintentionsAssistance.g:2718:1: ( ruleMulOrDiv )
            // InternalTestintentionsAssistance.g:2719:2: ruleMulOrDiv
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
    // InternalTestintentionsAssistance.g:2728:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2732:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2733:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2739:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2743:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2744:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2744:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2745:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2746:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=42 && LA23_0<=43)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2746:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalTestintentionsAssistance.g:2755:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2759:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalTestintentionsAssistance.g:2760:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:2767:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2771:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalTestintentionsAssistance.g:2772:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:2772:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalTestintentionsAssistance.g:2773:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalTestintentionsAssistance.g:2774:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalTestintentionsAssistance.g:2774:3: rule__PlusOrMinus__Alternatives_1_0
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
    // InternalTestintentionsAssistance.g:2782:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2786:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:2787:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalTestintentionsAssistance.g:2793:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2797:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:2798:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:2798:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:2799:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:2800:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalTestintentionsAssistance.g:2800:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalTestintentionsAssistance.g:2809:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2813:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalTestintentionsAssistance.g:2814:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalTestintentionsAssistance.g:2821:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2825:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2826:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2826:1: ( () )
            // InternalTestintentionsAssistance.g:2827:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalTestintentionsAssistance.g:2828:2: ()
            // InternalTestintentionsAssistance.g:2828:3: 
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
    // InternalTestintentionsAssistance.g:2836:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2840:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalTestintentionsAssistance.g:2841:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
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
    // InternalTestintentionsAssistance.g:2847:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2851:1: ( ( '+' ) )
            // InternalTestintentionsAssistance.g:2852:1: ( '+' )
            {
            // InternalTestintentionsAssistance.g:2852:1: ( '+' )
            // InternalTestintentionsAssistance.g:2853:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:2863:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2867:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalTestintentionsAssistance.g:2868:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalTestintentionsAssistance.g:2875:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2879:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2880:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2880:1: ( () )
            // InternalTestintentionsAssistance.g:2881:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalTestintentionsAssistance.g:2882:2: ()
            // InternalTestintentionsAssistance.g:2882:3: 
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
    // InternalTestintentionsAssistance.g:2890:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2894:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalTestintentionsAssistance.g:2895:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
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
    // InternalTestintentionsAssistance.g:2901:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2905:1: ( ( '-' ) )
            // InternalTestintentionsAssistance.g:2906:1: ( '-' )
            {
            // InternalTestintentionsAssistance.g:2906:1: ( '-' )
            // InternalTestintentionsAssistance.g:2907:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:2917:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2921:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalTestintentionsAssistance.g:2922:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalTestintentionsAssistance.g:2929:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2933:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:2934:1: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:2934:1: ( rulePrimary )
            // InternalTestintentionsAssistance.g:2935:2: rulePrimary
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
    // InternalTestintentionsAssistance.g:2944:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2948:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalTestintentionsAssistance.g:2949:2: rule__MulOrDiv__Group__1__Impl
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
    // InternalTestintentionsAssistance.g:2955:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2959:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalTestintentionsAssistance.g:2960:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalTestintentionsAssistance.g:2960:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalTestintentionsAssistance.g:2961:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalTestintentionsAssistance.g:2962:2: ( rule__MulOrDiv__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=17 && LA24_0<=18)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalTestintentionsAssistance.g:2962:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalTestintentionsAssistance.g:2971:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2975:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalTestintentionsAssistance.g:2976:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalTestintentionsAssistance.g:2983:1: rule__MulOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:2987:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:2988:1: ( () )
            {
            // InternalTestintentionsAssistance.g:2988:1: ( () )
            // InternalTestintentionsAssistance.g:2989:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0()); 
            // InternalTestintentionsAssistance.g:2990:2: ()
            // InternalTestintentionsAssistance.g:2990:3: 
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
    // InternalTestintentionsAssistance.g:2998:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3002:1: ( rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2 )
            // InternalTestintentionsAssistance.g:3003:2: rule__MulOrDiv__Group_1__1__Impl rule__MulOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:3010:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3014:1: ( ( ( rule__MulOrDiv__OpAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:3015:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:3015:1: ( ( rule__MulOrDiv__OpAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:3016:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:3017:2: ( rule__MulOrDiv__OpAssignment_1_1 )
            // InternalTestintentionsAssistance.g:3017:3: rule__MulOrDiv__OpAssignment_1_1
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
    // InternalTestintentionsAssistance.g:3025:1: rule__MulOrDiv__Group_1__2 : rule__MulOrDiv__Group_1__2__Impl ;
    public final void rule__MulOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3029:1: ( rule__MulOrDiv__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:3030:2: rule__MulOrDiv__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:3036:1: rule__MulOrDiv__Group_1__2__Impl : ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MulOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3040:1: ( ( ( rule__MulOrDiv__RightAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:3041:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:3041:1: ( ( rule__MulOrDiv__RightAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:3042:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:3043:2: ( rule__MulOrDiv__RightAssignment_1_2 )
            // InternalTestintentionsAssistance.g:3043:3: rule__MulOrDiv__RightAssignment_1_2
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
    // InternalTestintentionsAssistance.g:3052:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3056:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalTestintentionsAssistance.g:3057:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTestintentionsAssistance.g:3064:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3068:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalTestintentionsAssistance.g:3069:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalTestintentionsAssistance.g:3069:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalTestintentionsAssistance.g:3070:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalTestintentionsAssistance.g:3071:2: ( rule__Variable__NameAssignment_0 )
            // InternalTestintentionsAssistance.g:3071:3: rule__Variable__NameAssignment_0
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
    // InternalTestintentionsAssistance.g:3079:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3083:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalTestintentionsAssistance.g:3084:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalTestintentionsAssistance.g:3091:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3095:1: ( ( ':' ) )
            // InternalTestintentionsAssistance.g:3096:1: ( ':' )
            {
            // InternalTestintentionsAssistance.g:3096:1: ( ':' )
            // InternalTestintentionsAssistance.g:3097:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTestintentionsAssistance.g:3106:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3110:1: ( rule__Variable__Group__2__Impl )
            // InternalTestintentionsAssistance.g:3111:2: rule__Variable__Group__2__Impl
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
    // InternalTestintentionsAssistance.g:3117:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3121:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalTestintentionsAssistance.g:3122:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalTestintentionsAssistance.g:3122:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalTestintentionsAssistance.g:3123:2: ( rule__Variable__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // InternalTestintentionsAssistance.g:3124:2: ( rule__Variable__TypeAssignment_2 )
            // InternalTestintentionsAssistance.g:3124:3: rule__Variable__TypeAssignment_2
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
    // InternalTestintentionsAssistance.g:3133:1: rule__Double__Group__0 : rule__Double__Group__0__Impl rule__Double__Group__1 ;
    public final void rule__Double__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3137:1: ( rule__Double__Group__0__Impl rule__Double__Group__1 )
            // InternalTestintentionsAssistance.g:3138:2: rule__Double__Group__0__Impl rule__Double__Group__1
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
    // InternalTestintentionsAssistance.g:3145:1: rule__Double__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3149:1: ( ( RULE_INT ) )
            // InternalTestintentionsAssistance.g:3150:1: ( RULE_INT )
            {
            // InternalTestintentionsAssistance.g:3150:1: ( RULE_INT )
            // InternalTestintentionsAssistance.g:3151:2: RULE_INT
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
    // InternalTestintentionsAssistance.g:3160:1: rule__Double__Group__1 : rule__Double__Group__1__Impl rule__Double__Group__2 ;
    public final void rule__Double__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3164:1: ( rule__Double__Group__1__Impl rule__Double__Group__2 )
            // InternalTestintentionsAssistance.g:3165:2: rule__Double__Group__1__Impl rule__Double__Group__2
            {
            pushFollow(FOLLOW_43);
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
    // InternalTestintentionsAssistance.g:3172:1: rule__Double__Group__1__Impl : ( '.' ) ;
    public final void rule__Double__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3176:1: ( ( '.' ) )
            // InternalTestintentionsAssistance.g:3177:1: ( '.' )
            {
            // InternalTestintentionsAssistance.g:3177:1: ( '.' )
            // InternalTestintentionsAssistance.g:3178:2: '.'
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
    // InternalTestintentionsAssistance.g:3187:1: rule__Double__Group__2 : rule__Double__Group__2__Impl ;
    public final void rule__Double__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3191:1: ( rule__Double__Group__2__Impl )
            // InternalTestintentionsAssistance.g:3192:2: rule__Double__Group__2__Impl
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
    // InternalTestintentionsAssistance.g:3198:1: rule__Double__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Double__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3202:1: ( ( RULE_INT ) )
            // InternalTestintentionsAssistance.g:3203:1: ( RULE_INT )
            {
            // InternalTestintentionsAssistance.g:3203:1: ( RULE_INT )
            // InternalTestintentionsAssistance.g:3204:2: RULE_INT
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
    // InternalTestintentionsAssistance.g:3214:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3218:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalTestintentionsAssistance.g:3219:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:3226:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3230:1: ( ( '(' ) )
            // InternalTestintentionsAssistance.g:3231:1: ( '(' )
            {
            // InternalTestintentionsAssistance.g:3231:1: ( '(' )
            // InternalTestintentionsAssistance.g:3232:2: '('
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
    // InternalTestintentionsAssistance.g:3241:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3245:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalTestintentionsAssistance.g:3246:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalTestintentionsAssistance.g:3253:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3257:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3258:1: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3258:1: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3259:2: ruleExpression
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
    // InternalTestintentionsAssistance.g:3268:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3272:1: ( rule__Primary__Group_0__2__Impl )
            // InternalTestintentionsAssistance.g:3273:2: rule__Primary__Group_0__2__Impl
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
    // InternalTestintentionsAssistance.g:3279:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3283:1: ( ( ')' ) )
            // InternalTestintentionsAssistance.g:3284:1: ( ')' )
            {
            // InternalTestintentionsAssistance.g:3284:1: ( ')' )
            // InternalTestintentionsAssistance.g:3285:2: ')'
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
    // InternalTestintentionsAssistance.g:3295:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3299:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalTestintentionsAssistance.g:3300:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalTestintentionsAssistance.g:3307:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3311:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3312:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3312:1: ( () )
            // InternalTestintentionsAssistance.g:3313:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getNotAction_1_0()); 
            // InternalTestintentionsAssistance.g:3314:2: ()
            // InternalTestintentionsAssistance.g:3314:3: 
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
    // InternalTestintentionsAssistance.g:3322:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3326:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalTestintentionsAssistance.g:3327:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTestintentionsAssistance.g:3334:1: rule__Primary__Group_1__1__Impl : ( '!' ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3338:1: ( ( '!' ) )
            // InternalTestintentionsAssistance.g:3339:1: ( '!' )
            {
            // InternalTestintentionsAssistance.g:3339:1: ( '!' )
            // InternalTestintentionsAssistance.g:3340:2: '!'
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
    // InternalTestintentionsAssistance.g:3349:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3353:1: ( rule__Primary__Group_1__2__Impl )
            // InternalTestintentionsAssistance.g:3354:2: rule__Primary__Group_1__2__Impl
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
    // InternalTestintentionsAssistance.g:3360:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__ExpressionAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3364:1: ( ( ( rule__Primary__ExpressionAssignment_1_2 ) ) )
            // InternalTestintentionsAssistance.g:3365:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            {
            // InternalTestintentionsAssistance.g:3365:1: ( ( rule__Primary__ExpressionAssignment_1_2 ) )
            // InternalTestintentionsAssistance.g:3366:2: ( rule__Primary__ExpressionAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2()); 
            // InternalTestintentionsAssistance.g:3367:2: ( rule__Primary__ExpressionAssignment_1_2 )
            // InternalTestintentionsAssistance.g:3367:3: rule__Primary__ExpressionAssignment_1_2
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
    // InternalTestintentionsAssistance.g:3376:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3380:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalTestintentionsAssistance.g:3381:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalTestintentionsAssistance.g:3388:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3392:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3393:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3393:1: ( () )
            // InternalTestintentionsAssistance.g:3394:2: ()
            {
             before(grammarAccess.getAtomicAccess().getINTAction_0_0()); 
            // InternalTestintentionsAssistance.g:3395:2: ()
            // InternalTestintentionsAssistance.g:3395:3: 
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
    // InternalTestintentionsAssistance.g:3403:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3407:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalTestintentionsAssistance.g:3408:2: rule__Atomic__Group_0__1__Impl
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
    // InternalTestintentionsAssistance.g:3414:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3418:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalTestintentionsAssistance.g:3419:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalTestintentionsAssistance.g:3419:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalTestintentionsAssistance.g:3420:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalTestintentionsAssistance.g:3421:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalTestintentionsAssistance.g:3421:3: rule__Atomic__ValueAssignment_0_1
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
    // InternalTestintentionsAssistance.g:3430:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3434:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalTestintentionsAssistance.g:3435:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTestintentionsAssistance.g:3442:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3446:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3447:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3447:1: ( () )
            // InternalTestintentionsAssistance.g:3448:2: ()
            {
             before(grammarAccess.getAtomicAccess().getSTRINGAction_1_0()); 
            // InternalTestintentionsAssistance.g:3449:2: ()
            // InternalTestintentionsAssistance.g:3449:3: 
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
    // InternalTestintentionsAssistance.g:3457:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3461:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalTestintentionsAssistance.g:3462:2: rule__Atomic__Group_1__1__Impl
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
    // InternalTestintentionsAssistance.g:3468:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__ValueAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3472:1: ( ( ( rule__Atomic__ValueAssignment_1_1 ) ) )
            // InternalTestintentionsAssistance.g:3473:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            {
            // InternalTestintentionsAssistance.g:3473:1: ( ( rule__Atomic__ValueAssignment_1_1 ) )
            // InternalTestintentionsAssistance.g:3474:2: ( rule__Atomic__ValueAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1_1()); 
            // InternalTestintentionsAssistance.g:3475:2: ( rule__Atomic__ValueAssignment_1_1 )
            // InternalTestintentionsAssistance.g:3475:3: rule__Atomic__ValueAssignment_1_1
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
    // InternalTestintentionsAssistance.g:3484:1: rule__Atomic__Group_2__0 : rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 ;
    public final void rule__Atomic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3488:1: ( rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1 )
            // InternalTestintentionsAssistance.g:3489:2: rule__Atomic__Group_2__0__Impl rule__Atomic__Group_2__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalTestintentionsAssistance.g:3496:1: rule__Atomic__Group_2__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3500:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3501:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3501:1: ( () )
            // InternalTestintentionsAssistance.g:3502:2: ()
            {
             before(grammarAccess.getAtomicAccess().getBooleanAction_2_0()); 
            // InternalTestintentionsAssistance.g:3503:2: ()
            // InternalTestintentionsAssistance.g:3503:3: 
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
    // InternalTestintentionsAssistance.g:3511:1: rule__Atomic__Group_2__1 : rule__Atomic__Group_2__1__Impl ;
    public final void rule__Atomic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3515:1: ( rule__Atomic__Group_2__1__Impl )
            // InternalTestintentionsAssistance.g:3516:2: rule__Atomic__Group_2__1__Impl
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
    // InternalTestintentionsAssistance.g:3522:1: rule__Atomic__Group_2__1__Impl : ( ( rule__Atomic__ValueAssignment_2_1 ) ) ;
    public final void rule__Atomic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3526:1: ( ( ( rule__Atomic__ValueAssignment_2_1 ) ) )
            // InternalTestintentionsAssistance.g:3527:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            {
            // InternalTestintentionsAssistance.g:3527:1: ( ( rule__Atomic__ValueAssignment_2_1 ) )
            // InternalTestintentionsAssistance.g:3528:2: ( rule__Atomic__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_2_1()); 
            // InternalTestintentionsAssistance.g:3529:2: ( rule__Atomic__ValueAssignment_2_1 )
            // InternalTestintentionsAssistance.g:3529:3: rule__Atomic__ValueAssignment_2_1
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
    // InternalTestintentionsAssistance.g:3538:1: rule__Atomic__Group_3__0 : rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 ;
    public final void rule__Atomic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3542:1: ( rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1 )
            // InternalTestintentionsAssistance.g:3543:2: rule__Atomic__Group_3__0__Impl rule__Atomic__Group_3__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalTestintentionsAssistance.g:3550:1: rule__Atomic__Group_3__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3554:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3555:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3555:1: ( () )
            // InternalTestintentionsAssistance.g:3556:2: ()
            {
             before(grammarAccess.getAtomicAccess().getDoubleAction_3_0()); 
            // InternalTestintentionsAssistance.g:3557:2: ()
            // InternalTestintentionsAssistance.g:3557:3: 
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
    // InternalTestintentionsAssistance.g:3565:1: rule__Atomic__Group_3__1 : rule__Atomic__Group_3__1__Impl ;
    public final void rule__Atomic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3569:1: ( rule__Atomic__Group_3__1__Impl )
            // InternalTestintentionsAssistance.g:3570:2: rule__Atomic__Group_3__1__Impl
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
    // InternalTestintentionsAssistance.g:3576:1: rule__Atomic__Group_3__1__Impl : ( ( rule__Atomic__ValueAssignment_3_1 ) ) ;
    public final void rule__Atomic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3580:1: ( ( ( rule__Atomic__ValueAssignment_3_1 ) ) )
            // InternalTestintentionsAssistance.g:3581:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            {
            // InternalTestintentionsAssistance.g:3581:1: ( ( rule__Atomic__ValueAssignment_3_1 ) )
            // InternalTestintentionsAssistance.g:3582:2: ( rule__Atomic__ValueAssignment_3_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_3_1()); 
            // InternalTestintentionsAssistance.g:3583:2: ( rule__Atomic__ValueAssignment_3_1 )
            // InternalTestintentionsAssistance.g:3583:3: rule__Atomic__ValueAssignment_3_1
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
    // InternalTestintentionsAssistance.g:3592:1: rule__Atomic__Group_4__0 : rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 ;
    public final void rule__Atomic__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3596:1: ( rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1 )
            // InternalTestintentionsAssistance.g:3597:2: rule__Atomic__Group_4__0__Impl rule__Atomic__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalTestintentionsAssistance.g:3604:1: rule__Atomic__Group_4__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3608:1: ( ( () ) )
            // InternalTestintentionsAssistance.g:3609:1: ( () )
            {
            // InternalTestintentionsAssistance.g:3609:1: ( () )
            // InternalTestintentionsAssistance.g:3610:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableRefAction_4_0()); 
            // InternalTestintentionsAssistance.g:3611:2: ()
            // InternalTestintentionsAssistance.g:3611:3: 
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
    // InternalTestintentionsAssistance.g:3619:1: rule__Atomic__Group_4__1 : rule__Atomic__Group_4__1__Impl ;
    public final void rule__Atomic__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3623:1: ( rule__Atomic__Group_4__1__Impl )
            // InternalTestintentionsAssistance.g:3624:2: rule__Atomic__Group_4__1__Impl
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
    // InternalTestintentionsAssistance.g:3630:1: rule__Atomic__Group_4__1__Impl : ( ( rule__Atomic__VariableAssignment_4_1 ) ) ;
    public final void rule__Atomic__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3634:1: ( ( ( rule__Atomic__VariableAssignment_4_1 ) ) )
            // InternalTestintentionsAssistance.g:3635:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            {
            // InternalTestintentionsAssistance.g:3635:1: ( ( rule__Atomic__VariableAssignment_4_1 ) )
            // InternalTestintentionsAssistance.g:3636:2: ( rule__Atomic__VariableAssignment_4_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableAssignment_4_1()); 
            // InternalTestintentionsAssistance.g:3637:2: ( rule__Atomic__VariableAssignment_4_1 )
            // InternalTestintentionsAssistance.g:3637:3: rule__Atomic__VariableAssignment_4_1
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
    // InternalTestintentionsAssistance.g:3646:1: rule__Model__ElementsAssignment : ( ruleDomainDeclaration ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3650:1: ( ( ruleDomainDeclaration ) )
            // InternalTestintentionsAssistance.g:3651:2: ( ruleDomainDeclaration )
            {
            // InternalTestintentionsAssistance.g:3651:2: ( ruleDomainDeclaration )
            // InternalTestintentionsAssistance.g:3652:3: ruleDomainDeclaration
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
    // InternalTestintentionsAssistance.g:3661:1: rule__DomainDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__DomainDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3665:1: ( ( ruleQualifiedName ) )
            // InternalTestintentionsAssistance.g:3666:2: ( ruleQualifiedName )
            {
            // InternalTestintentionsAssistance.g:3666:2: ( ruleQualifiedName )
            // InternalTestintentionsAssistance.g:3667:3: ruleQualifiedName
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
    // InternalTestintentionsAssistance.g:3676:1: rule__DomainDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__DomainDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3680:1: ( ( ruleAbstractElement ) )
            // InternalTestintentionsAssistance.g:3681:2: ( ruleAbstractElement )
            {
            // InternalTestintentionsAssistance.g:3681:2: ( ruleAbstractElement )
            // InternalTestintentionsAssistance.g:3682:3: ruleAbstractElement
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
    // InternalTestintentionsAssistance.g:3691:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3695:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalTestintentionsAssistance.g:3696:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalTestintentionsAssistance.g:3696:2: ( ruleQualifiedNameWithWildcard )
            // InternalTestintentionsAssistance.g:3697:3: ruleQualifiedNameWithWildcard
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
    // InternalTestintentionsAssistance.g:3706:1: rule__Function__OutAssignment_0 : ( ruleOutVariable ) ;
    public final void rule__Function__OutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3710:1: ( ( ruleOutVariable ) )
            // InternalTestintentionsAssistance.g:3711:2: ( ruleOutVariable )
            {
            // InternalTestintentionsAssistance.g:3711:2: ( ruleOutVariable )
            // InternalTestintentionsAssistance.g:3712:3: ruleOutVariable
            {
             before(grammarAccess.getFunctionAccess().getOutOutVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOutVariable();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOutOutVariableParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Function__OutAssignment_1_1"
    // InternalTestintentionsAssistance.g:3721:1: rule__Function__OutAssignment_1_1 : ( ruleOutVariable ) ;
    public final void rule__Function__OutAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3725:1: ( ( ruleOutVariable ) )
            // InternalTestintentionsAssistance.g:3726:2: ( ruleOutVariable )
            {
            // InternalTestintentionsAssistance.g:3726:2: ( ruleOutVariable )
            // InternalTestintentionsAssistance.g:3727:3: ruleOutVariable
            {
             before(grammarAccess.getFunctionAccess().getOutOutVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutVariable();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOutOutVariableParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__OutAssignment_1_1"


    // $ANTLR start "rule__Function__MethodeAssignment_3"
    // InternalTestintentionsAssistance.g:3736:1: rule__Function__MethodeAssignment_3 : ( RULE_ID ) ;
    public final void rule__Function__MethodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3740:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3741:2: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:3741:2: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3742:3: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getMethodeIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getMethodeIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__MethodeAssignment_3"


    // $ANTLR start "rule__Function__ArgAssignment_5_0"
    // InternalTestintentionsAssistance.g:3751:1: rule__Function__ArgAssignment_5_0 : ( ( RULE_ID ) ) ;
    public final void rule__Function__ArgAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3755:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3756:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3756:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3757:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getArgVariableCrossReference_5_0_0()); 
            // InternalTestintentionsAssistance.g:3758:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3759:4: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getArgVariableIDTerminalRuleCall_5_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getArgVariableIDTerminalRuleCall_5_0_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getArgVariableCrossReference_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__ArgAssignment_5_0"


    // $ANTLR start "rule__Function__Arg1Assignment_6"
    // InternalTestintentionsAssistance.g:3770:1: rule__Function__Arg1Assignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Function__Arg1Assignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3774:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3775:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3775:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3776:3: ( RULE_ID )
            {
             before(grammarAccess.getFunctionAccess().getArg1VariableCrossReference_6_0()); 
            // InternalTestintentionsAssistance.g:3777:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3778:4: RULE_ID
            {
             before(grammarAccess.getFunctionAccess().getArg1VariableIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getArg1VariableIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getFunctionAccess().getArg1VariableCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Arg1Assignment_6"


    // $ANTLR start "rule__Data__InstAssignment_0_2_0"
    // InternalTestintentionsAssistance.g:3789:1: rule__Data__InstAssignment_0_2_0 : ( ruleInst ) ;
    public final void rule__Data__InstAssignment_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3793:1: ( ( ruleInst ) )
            // InternalTestintentionsAssistance.g:3794:2: ( ruleInst )
            {
            // InternalTestintentionsAssistance.g:3794:2: ( ruleInst )
            // InternalTestintentionsAssistance.g:3795:3: ruleInst
            {
             before(grammarAccess.getDataAccess().getInstInstParserRuleCall_0_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInst();

            state._fsp--;

             after(grammarAccess.getDataAccess().getInstInstParserRuleCall_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__InstAssignment_0_2_0"


    // $ANTLR start "rule__Data__InstAssignment_1_0"
    // InternalTestintentionsAssistance.g:3804:1: rule__Data__InstAssignment_1_0 : ( ruleInst ) ;
    public final void rule__Data__InstAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3808:1: ( ( ruleInst ) )
            // InternalTestintentionsAssistance.g:3809:2: ( ruleInst )
            {
            // InternalTestintentionsAssistance.g:3809:2: ( ruleInst )
            // InternalTestintentionsAssistance.g:3810:3: ruleInst
            {
             before(grammarAccess.getDataAccess().getInstInstParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInst();

            state._fsp--;

             after(grammarAccess.getDataAccess().getInstInstParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__InstAssignment_1_0"


    // $ANTLR start "rule__OutVariable__NameAssignment_0"
    // InternalTestintentionsAssistance.g:3819:1: rule__OutVariable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__OutVariable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3823:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3824:2: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:3824:2: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3825:3: RULE_ID
            {
             before(grammarAccess.getOutVariableAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutVariableAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__NameAssignment_0"


    // $ANTLR start "rule__OutVariable__TypeAssignment_2"
    // InternalTestintentionsAssistance.g:3834:1: rule__OutVariable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__OutVariable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3838:1: ( ( ruleType ) )
            // InternalTestintentionsAssistance.g:3839:2: ( ruleType )
            {
            // InternalTestintentionsAssistance.g:3839:2: ( ruleType )
            // InternalTestintentionsAssistance.g:3840:3: ruleType
            {
             before(grammarAccess.getOutVariableAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getOutVariableAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutVariable__TypeAssignment_2"


    // $ANTLR start "rule__Inst__VariableAssignment_0"
    // InternalTestintentionsAssistance.g:3849:1: rule__Inst__VariableAssignment_0 : ( ruleVariable ) ;
    public final void rule__Inst__VariableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3853:1: ( ( ruleVariable ) )
            // InternalTestintentionsAssistance.g:3854:2: ( ruleVariable )
            {
            // InternalTestintentionsAssistance.g:3854:2: ( ruleVariable )
            // InternalTestintentionsAssistance.g:3855:3: ruleVariable
            {
             before(grammarAccess.getInstAccess().getVariableVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getInstAccess().getVariableVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inst__VariableAssignment_0"


    // $ANTLR start "rule__Inst__ValeurAssignment_2"
    // InternalTestintentionsAssistance.g:3864:1: rule__Inst__ValeurAssignment_2 : ( ruleAtomic ) ;
    public final void rule__Inst__ValeurAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3868:1: ( ( ruleAtomic ) )
            // InternalTestintentionsAssistance.g:3869:2: ( ruleAtomic )
            {
            // InternalTestintentionsAssistance.g:3869:2: ( ruleAtomic )
            // InternalTestintentionsAssistance.g:3870:3: ruleAtomic
            {
             before(grammarAccess.getInstAccess().getValeurAtomicParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getInstAccess().getValeurAtomicParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inst__ValeurAssignment_2"


    // $ANTLR start "rule__TestIntention__DescriptionAssignment_1"
    // InternalTestintentionsAssistance.g:3879:1: rule__TestIntention__DescriptionAssignment_1 : ( RULE_STRING ) ;
    public final void rule__TestIntention__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3883:1: ( ( RULE_STRING ) )
            // InternalTestintentionsAssistance.g:3884:2: ( RULE_STRING )
            {
            // InternalTestintentionsAssistance.g:3884:2: ( RULE_STRING )
            // InternalTestintentionsAssistance.g:3885:3: RULE_STRING
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
    // InternalTestintentionsAssistance.g:3894:1: rule__TestIntention__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__TestIntention__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3898:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3899:2: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3899:2: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3900:3: ruleExpression
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


    // $ANTLR start "rule__TestIntention__OutvarAssignment_5"
    // InternalTestintentionsAssistance.g:3909:1: rule__TestIntention__OutvarAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__TestIntention__OutvarAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3913:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:3914:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:3914:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:3915:3: ( RULE_ID )
            {
             before(grammarAccess.getTestIntentionAccess().getOutvarOutVariableCrossReference_5_0()); 
            // InternalTestintentionsAssistance.g:3916:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:3917:4: RULE_ID
            {
             before(grammarAccess.getTestIntentionAccess().getOutvarOutVariableIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestIntentionAccess().getOutvarOutVariableIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTestIntentionAccess().getOutvarOutVariableCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__OutvarAssignment_5"


    // $ANTLR start "rule__TestIntention__ExpressionAssignment_7"
    // InternalTestintentionsAssistance.g:3928:1: rule__TestIntention__ExpressionAssignment_7 : ( ruleExpression ) ;
    public final void rule__TestIntention__ExpressionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3932:1: ( ( ruleExpression ) )
            // InternalTestintentionsAssistance.g:3933:2: ( ruleExpression )
            {
            // InternalTestintentionsAssistance.g:3933:2: ( ruleExpression )
            // InternalTestintentionsAssistance.g:3934:3: ruleExpression
            {
             before(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getTestIntentionAccess().getExpressionExpressionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TestIntention__ExpressionAssignment_7"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalTestintentionsAssistance.g:3943:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3947:1: ( ( ruleAnd ) )
            // InternalTestintentionsAssistance.g:3948:2: ( ruleAnd )
            {
            // InternalTestintentionsAssistance.g:3948:2: ( ruleAnd )
            // InternalTestintentionsAssistance.g:3949:3: ruleAnd
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
    // InternalTestintentionsAssistance.g:3958:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3962:1: ( ( ruleEquality ) )
            // InternalTestintentionsAssistance.g:3963:2: ( ruleEquality )
            {
            // InternalTestintentionsAssistance.g:3963:2: ( ruleEquality )
            // InternalTestintentionsAssistance.g:3964:3: ruleEquality
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
    // InternalTestintentionsAssistance.g:3973:1: rule__Equality__OpAssignment_1_1 : ( ( rule__Equality__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3977:1: ( ( ( rule__Equality__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:3978:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:3978:2: ( ( rule__Equality__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:3979:3: ( rule__Equality__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:3980:3: ( rule__Equality__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:3980:4: rule__Equality__OpAlternatives_1_1_0
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
    // InternalTestintentionsAssistance.g:3988:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:3992:1: ( ( ruleComparison ) )
            // InternalTestintentionsAssistance.g:3993:2: ( ruleComparison )
            {
            // InternalTestintentionsAssistance.g:3993:2: ( ruleComparison )
            // InternalTestintentionsAssistance.g:3994:3: ruleComparison
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
    // InternalTestintentionsAssistance.g:4003:1: rule__Comparison__OpAssignment_1_1 : ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4007:1: ( ( ( rule__Comparison__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:4008:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:4008:2: ( ( rule__Comparison__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:4009:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:4010:3: ( rule__Comparison__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:4010:4: rule__Comparison__OpAlternatives_1_1_0
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
    // InternalTestintentionsAssistance.g:4018:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4022:1: ( ( rulePlusOrMinus ) )
            // InternalTestintentionsAssistance.g:4023:2: ( rulePlusOrMinus )
            {
            // InternalTestintentionsAssistance.g:4023:2: ( rulePlusOrMinus )
            // InternalTestintentionsAssistance.g:4024:3: rulePlusOrMinus
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
    // InternalTestintentionsAssistance.g:4033:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4037:1: ( ( ruleMulOrDiv ) )
            // InternalTestintentionsAssistance.g:4038:2: ( ruleMulOrDiv )
            {
            // InternalTestintentionsAssistance.g:4038:2: ( ruleMulOrDiv )
            // InternalTestintentionsAssistance.g:4039:3: ruleMulOrDiv
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
    // InternalTestintentionsAssistance.g:4048:1: rule__MulOrDiv__OpAssignment_1_1 : ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4052:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) ) )
            // InternalTestintentionsAssistance.g:4053:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            {
            // InternalTestintentionsAssistance.g:4053:2: ( ( rule__MulOrDiv__OpAlternatives_1_1_0 ) )
            // InternalTestintentionsAssistance.g:4054:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0()); 
            // InternalTestintentionsAssistance.g:4055:3: ( rule__MulOrDiv__OpAlternatives_1_1_0 )
            // InternalTestintentionsAssistance.g:4055:4: rule__MulOrDiv__OpAlternatives_1_1_0
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
    // InternalTestintentionsAssistance.g:4063:1: rule__MulOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4067:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:4068:2: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:4068:2: ( rulePrimary )
            // InternalTestintentionsAssistance.g:4069:3: rulePrimary
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
    // InternalTestintentionsAssistance.g:4078:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4082:1: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:4083:2: ( RULE_ID )
            {
            // InternalTestintentionsAssistance.g:4083:2: ( RULE_ID )
            // InternalTestintentionsAssistance.g:4084:3: RULE_ID
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
    // InternalTestintentionsAssistance.g:4093:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4097:1: ( ( ruleType ) )
            // InternalTestintentionsAssistance.g:4098:2: ( ruleType )
            {
            // InternalTestintentionsAssistance.g:4098:2: ( ruleType )
            // InternalTestintentionsAssistance.g:4099:3: ruleType
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
    // InternalTestintentionsAssistance.g:4108:1: rule__Primary__ExpressionAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__ExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4112:1: ( ( rulePrimary ) )
            // InternalTestintentionsAssistance.g:4113:2: ( rulePrimary )
            {
            // InternalTestintentionsAssistance.g:4113:2: ( rulePrimary )
            // InternalTestintentionsAssistance.g:4114:3: rulePrimary
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
    // InternalTestintentionsAssistance.g:4123:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4127:1: ( ( RULE_INT ) )
            // InternalTestintentionsAssistance.g:4128:2: ( RULE_INT )
            {
            // InternalTestintentionsAssistance.g:4128:2: ( RULE_INT )
            // InternalTestintentionsAssistance.g:4129:3: RULE_INT
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
    // InternalTestintentionsAssistance.g:4138:1: rule__Atomic__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Atomic__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4142:1: ( ( RULE_STRING ) )
            // InternalTestintentionsAssistance.g:4143:2: ( RULE_STRING )
            {
            // InternalTestintentionsAssistance.g:4143:2: ( RULE_STRING )
            // InternalTestintentionsAssistance.g:4144:3: RULE_STRING
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
    // InternalTestintentionsAssistance.g:4153:1: rule__Atomic__ValueAssignment_2_1 : ( ruleBoolean ) ;
    public final void rule__Atomic__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4157:1: ( ( ruleBoolean ) )
            // InternalTestintentionsAssistance.g:4158:2: ( ruleBoolean )
            {
            // InternalTestintentionsAssistance.g:4158:2: ( ruleBoolean )
            // InternalTestintentionsAssistance.g:4159:3: ruleBoolean
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
    // InternalTestintentionsAssistance.g:4168:1: rule__Atomic__ValueAssignment_3_1 : ( ruleDouble ) ;
    public final void rule__Atomic__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4172:1: ( ( ruleDouble ) )
            // InternalTestintentionsAssistance.g:4173:2: ( ruleDouble )
            {
            // InternalTestintentionsAssistance.g:4173:2: ( ruleDouble )
            // InternalTestintentionsAssistance.g:4174:3: ruleDouble
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
    // InternalTestintentionsAssistance.g:4183:1: rule__Atomic__VariableAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTestintentionsAssistance.g:4187:1: ( ( ( RULE_ID ) ) )
            // InternalTestintentionsAssistance.g:4188:2: ( ( RULE_ID ) )
            {
            // InternalTestintentionsAssistance.g:4188:2: ( ( RULE_ID ) )
            // InternalTestintentionsAssistance.g:4189:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableVariableCrossReference_4_1_0()); 
            // InternalTestintentionsAssistance.g:4190:3: ( RULE_ID )
            // InternalTestintentionsAssistance.g:4191:4: RULE_ID
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
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\43\3\uffff\1\25\4\13\1\uffff";
    static final String dfa_3s = "\1\45\1\uffff\1\43\3\uffff\1\30\4\44\1\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\5\uffff\1\2";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\24\uffff\1\5\3\uffff\1\4\4\uffff\1\3\2\uffff\1\1",
            "",
            "\1\6",
            "",
            "",
            "",
            "\1\7\1\10\1\11\1\12",
            "\1\13\25\uffff\1\13\2\uffff\1\3",
            "\1\13\25\uffff\1\13\2\uffff\1\3",
            "\1\13\25\uffff\1\13\2\uffff\1\3",
            "\1\13\25\uffff\1\13\2\uffff\1\3",
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
            return "643:1: rule__AbstractElement__Alternatives : ( ( ruleTestIntention ) | ( ruleFunction ) | ( ruleData ) | ( ruleImport ) | ( ruleDomainDeclaration ) );";
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\1\20\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\43\1\25\4\13\6\4\1\uffff\1\5\1\4";
    static final String dfa_10s = "\1\45\1\uffff\1\43\1\30\4\44\1\24\5\45\1\uffff\1\5\1\45";
    static final String dfa_11s = "\1\uffff\1\2\14\uffff\1\1\2\uffff";
    static final String dfa_12s = "\21\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\4\uffff\1\1\2\uffff\1\1",
            "",
            "\1\3",
            "\1\4\1\5\1\6\1\7",
            "\1\1\25\uffff\1\1\2\uffff\1\10",
            "\1\1\25\uffff\1\1\2\uffff\1\10",
            "\1\1\25\uffff\1\1\2\uffff\1\10",
            "\1\1\25\uffff\1\1\2\uffff\1\10",
            "\1\15\1\11\1\12\14\uffff\1\13\1\14",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\17\1\1\2\uffff\1\1\1\16\1\1\2\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\2\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\2\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\2\uffff\1\1",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\2\uffff\1\1",
            "",
            "\1\20",
            "\1\1\24\uffff\1\1\1\uffff\1\1\1\uffff\1\1\2\uffff\1\1\1\16\1\1\2\uffff\1\1"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1666:2: ( rule__Data__Group_0_2__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000242A000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000002422000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000012L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000180070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100080180070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000180000L});

}