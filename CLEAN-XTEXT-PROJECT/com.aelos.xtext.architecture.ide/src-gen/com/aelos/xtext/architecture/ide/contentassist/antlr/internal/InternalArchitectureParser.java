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
    // InternalArchitecture.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalArchitecture.g:54:1: ( ruleModel EOF )
            // InternalArchitecture.g:55:1: ruleModel EOF
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
    // InternalArchitecture.g:62:1: ruleModel : ( ( rule__Model__FunctionAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:66:2: ( ( ( rule__Model__FunctionAssignment )* ) )
            // InternalArchitecture.g:67:2: ( ( rule__Model__FunctionAssignment )* )
            {
            // InternalArchitecture.g:67:2: ( ( rule__Model__FunctionAssignment )* )
            // InternalArchitecture.g:68:3: ( rule__Model__FunctionAssignment )*
            {
             before(grammarAccess.getModelAccess().getFunctionAssignment()); 
            // InternalArchitecture.g:69:3: ( rule__Model__FunctionAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArchitecture.g:69:4: rule__Model__FunctionAssignment
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
    // InternalArchitecture.g:78:1: entryRuleAbstractModel : ruleAbstractModel EOF ;
    public final void entryRuleAbstractModel() throws RecognitionException {
        try {
            // InternalArchitecture.g:79:1: ( ruleAbstractModel EOF )
            // InternalArchitecture.g:80:1: ruleAbstractModel EOF
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
    // InternalArchitecture.g:87:1: ruleAbstractModel : ( ( rule__AbstractModel__Group__0 ) ) ;
    public final void ruleAbstractModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:91:2: ( ( ( rule__AbstractModel__Group__0 ) ) )
            // InternalArchitecture.g:92:2: ( ( rule__AbstractModel__Group__0 ) )
            {
            // InternalArchitecture.g:92:2: ( ( rule__AbstractModel__Group__0 ) )
            // InternalArchitecture.g:93:3: ( rule__AbstractModel__Group__0 )
            {
             before(grammarAccess.getAbstractModelAccess().getGroup()); 
            // InternalArchitecture.g:94:3: ( rule__AbstractModel__Group__0 )
            // InternalArchitecture.g:94:4: rule__AbstractModel__Group__0
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
    // InternalArchitecture.g:103:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalArchitecture.g:104:1: ( ruleImport EOF )
            // InternalArchitecture.g:105:1: ruleImport EOF
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
    // InternalArchitecture.g:112:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:116:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalArchitecture.g:117:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalArchitecture.g:117:2: ( ( rule__Import__Group__0 ) )
            // InternalArchitecture.g:118:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalArchitecture.g:119:3: ( rule__Import__Group__0 )
            // InternalArchitecture.g:119:4: rule__Import__Group__0
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
    // InternalArchitecture.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalArchitecture.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalArchitecture.g:130:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalArchitecture.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalArchitecture.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalArchitecture.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalArchitecture.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalArchitecture.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalArchitecture.g:144:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalArchitecture.g:153:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalArchitecture.g:154:1: ( ruleQualifiedName EOF )
            // InternalArchitecture.g:155:1: ruleQualifiedName EOF
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
    // InternalArchitecture.g:162:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:166:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalArchitecture.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalArchitecture.g:167:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalArchitecture.g:168:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalArchitecture.g:169:3: ( rule__QualifiedName__Group__0 )
            // InternalArchitecture.g:169:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleComponent"
    // InternalArchitecture.g:178:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalArchitecture.g:179:1: ( ruleComponent EOF )
            // InternalArchitecture.g:180:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalArchitecture.g:187:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:191:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalArchitecture.g:192:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalArchitecture.g:192:2: ( ( rule__Component__Group__0 ) )
            // InternalArchitecture.g:193:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalArchitecture.g:194:3: ( rule__Component__Group__0 )
            // InternalArchitecture.g:194:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
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
    // InternalArchitecture.g:203:1: entryRuleInstanceComp : ruleInstanceComp EOF ;
    public final void entryRuleInstanceComp() throws RecognitionException {
        try {
            // InternalArchitecture.g:204:1: ( ruleInstanceComp EOF )
            // InternalArchitecture.g:205:1: ruleInstanceComp EOF
            {
             before(grammarAccess.getInstanceCompRule()); 
            pushFollow(FOLLOW_1);
            ruleInstanceComp();

            state._fsp--;

             after(grammarAccess.getInstanceCompRule()); 
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
    // $ANTLR end "entryRuleInstanceComp"


    // $ANTLR start "ruleInstanceComp"
    // InternalArchitecture.g:212:1: ruleInstanceComp : ( ( rule__InstanceComp__NameAssignment ) ) ;
    public final void ruleInstanceComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:216:2: ( ( ( rule__InstanceComp__NameAssignment ) ) )
            // InternalArchitecture.g:217:2: ( ( rule__InstanceComp__NameAssignment ) )
            {
            // InternalArchitecture.g:217:2: ( ( rule__InstanceComp__NameAssignment ) )
            // InternalArchitecture.g:218:3: ( rule__InstanceComp__NameAssignment )
            {
             before(grammarAccess.getInstanceCompAccess().getNameAssignment()); 
            // InternalArchitecture.g:219:3: ( rule__InstanceComp__NameAssignment )
            // InternalArchitecture.g:219:4: rule__InstanceComp__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__InstanceComp__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInstanceCompAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalArchitecture.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalArchitecture.g:229:1: ( ruleVariable EOF )
            // InternalArchitecture.g:230:1: ruleVariable EOF
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
    // InternalArchitecture.g:237:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:241:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalArchitecture.g:242:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalArchitecture.g:242:2: ( ( rule__Variable__Group__0 ) )
            // InternalArchitecture.g:243:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalArchitecture.g:244:3: ( rule__Variable__Group__0 )
            // InternalArchitecture.g:244:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleBindings"
    // InternalArchitecture.g:253:1: entryRuleBindings : ruleBindings EOF ;
    public final void entryRuleBindings() throws RecognitionException {
        try {
            // InternalArchitecture.g:254:1: ( ruleBindings EOF )
            // InternalArchitecture.g:255:1: ruleBindings EOF
            {
             before(grammarAccess.getBindingsRule()); 
            pushFollow(FOLLOW_1);
            ruleBindings();

            state._fsp--;

             after(grammarAccess.getBindingsRule()); 
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
    // $ANTLR end "entryRuleBindings"


    // $ANTLR start "ruleBindings"
    // InternalArchitecture.g:262:1: ruleBindings : ( ( rule__Bindings__Group__0 ) ) ;
    public final void ruleBindings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:266:2: ( ( ( rule__Bindings__Group__0 ) ) )
            // InternalArchitecture.g:267:2: ( ( rule__Bindings__Group__0 ) )
            {
            // InternalArchitecture.g:267:2: ( ( rule__Bindings__Group__0 ) )
            // InternalArchitecture.g:268:3: ( rule__Bindings__Group__0 )
            {
             before(grammarAccess.getBindingsAccess().getGroup()); 
            // InternalArchitecture.g:269:3: ( rule__Bindings__Group__0 )
            // InternalArchitecture.g:269:4: rule__Bindings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBindingsAccess().getGroup()); 

            }


            }

        }
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
    // InternalArchitecture.g:278:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalArchitecture.g:279:1: ( ruleRequiredService EOF )
            // InternalArchitecture.g:280:1: ruleRequiredService EOF
            {
             before(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getRequiredServiceRule()); 
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
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalArchitecture.g:287:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:291:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalArchitecture.g:292:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalArchitecture.g:292:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalArchitecture.g:293:3: ( rule__RequiredService__Group__0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            // InternalArchitecture.g:294:3: ( rule__RequiredService__Group__0 )
            // InternalArchitecture.g:294:4: rule__RequiredService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getGroup()); 

            }


            }

        }
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
    // InternalArchitecture.g:303:1: entryRuleServiceName : ruleServiceName EOF ;
    public final void entryRuleServiceName() throws RecognitionException {
        try {
            // InternalArchitecture.g:304:1: ( ruleServiceName EOF )
            // InternalArchitecture.g:305:1: ruleServiceName EOF
            {
             before(grammarAccess.getServiceNameRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceName();

            state._fsp--;

             after(grammarAccess.getServiceNameRule()); 
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
    // $ANTLR end "entryRuleServiceName"


    // $ANTLR start "ruleServiceName"
    // InternalArchitecture.g:312:1: ruleServiceName : ( ( rule__ServiceName__NameAssignment ) ) ;
    public final void ruleServiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:316:2: ( ( ( rule__ServiceName__NameAssignment ) ) )
            // InternalArchitecture.g:317:2: ( ( rule__ServiceName__NameAssignment ) )
            {
            // InternalArchitecture.g:317:2: ( ( rule__ServiceName__NameAssignment ) )
            // InternalArchitecture.g:318:3: ( rule__ServiceName__NameAssignment )
            {
             before(grammarAccess.getServiceNameAccess().getNameAssignment()); 
            // InternalArchitecture.g:319:3: ( rule__ServiceName__NameAssignment )
            // InternalArchitecture.g:319:4: rule__ServiceName__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ServiceName__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getServiceNameAccess().getNameAssignment()); 

            }


            }

        }
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
    // InternalArchitecture.g:328:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:332:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalArchitecture.g:333:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalArchitecture.g:333:2: ( ( rule__Type__Alternatives ) )
            // InternalArchitecture.g:334:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalArchitecture.g:335:3: ( rule__Type__Alternatives )
            // InternalArchitecture.g:335:4: rule__Type__Alternatives
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
    // InternalArchitecture.g:343:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:347:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
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
                    // InternalArchitecture.g:348:2: ( ( 'INT' ) )
                    {
                    // InternalArchitecture.g:348:2: ( ( 'INT' ) )
                    // InternalArchitecture.g:349:3: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalArchitecture.g:350:3: ( 'INT' )
                    // InternalArchitecture.g:350:4: 'INT'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArchitecture.g:354:2: ( ( 'STRING' ) )
                    {
                    // InternalArchitecture.g:354:2: ( ( 'STRING' ) )
                    // InternalArchitecture.g:355:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalArchitecture.g:356:3: ( 'STRING' )
                    // InternalArchitecture.g:356:4: 'STRING'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArchitecture.g:360:2: ( ( 'Boolean' ) )
                    {
                    // InternalArchitecture.g:360:2: ( ( 'Boolean' ) )
                    // InternalArchitecture.g:361:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalArchitecture.g:362:3: ( 'Boolean' )
                    // InternalArchitecture.g:362:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArchitecture.g:366:2: ( ( 'Double' ) )
                    {
                    // InternalArchitecture.g:366:2: ( ( 'Double' ) )
                    // InternalArchitecture.g:367:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalArchitecture.g:368:3: ( 'Double' )
                    // InternalArchitecture.g:368:4: 'Double'
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
    // InternalArchitecture.g:376:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:380:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalArchitecture.g:381:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
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
    // InternalArchitecture.g:388:1: rule__AbstractModel__Group__0__Impl : ( ( ruleImport )? ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:392:1: ( ( ( ruleImport )? ) )
            // InternalArchitecture.g:393:1: ( ( ruleImport )? )
            {
            // InternalArchitecture.g:393:1: ( ( ruleImport )? )
            // InternalArchitecture.g:394:2: ( ruleImport )?
            {
             before(grammarAccess.getAbstractModelAccess().getImportParserRuleCall_0()); 
            // InternalArchitecture.g:395:2: ( ruleImport )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalArchitecture.g:395:3: ruleImport
                    {
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalArchitecture.g:403:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:407:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalArchitecture.g:408:2: rule__AbstractModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractModel__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:414:1: rule__AbstractModel__Group__1__Impl : ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:418:1: ( ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) )
            // InternalArchitecture.g:419:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            {
            // InternalArchitecture.g:419:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            // InternalArchitecture.g:420:2: ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* )
            {
            // InternalArchitecture.g:420:2: ( ( rule__AbstractModel__CompAssignment_1 ) )
            // InternalArchitecture.g:421:3: ( rule__AbstractModel__CompAssignment_1 )
            {
             before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            // InternalArchitecture.g:422:3: ( rule__AbstractModel__CompAssignment_1 )
            // InternalArchitecture.g:422:4: rule__AbstractModel__CompAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__AbstractModel__CompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 

            }

            // InternalArchitecture.g:425:2: ( ( rule__AbstractModel__CompAssignment_1 )* )
            // InternalArchitecture.g:426:3: ( rule__AbstractModel__CompAssignment_1 )*
            {
             before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            // InternalArchitecture.g:427:3: ( rule__AbstractModel__CompAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // InternalArchitecture.g:427:4: rule__AbstractModel__CompAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__AbstractModel__CompAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 

            }


            }


            }

        }
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
    // InternalArchitecture.g:437:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:441:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalArchitecture.g:442:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:449:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:453:1: ( ( 'import' ) )
            // InternalArchitecture.g:454:1: ( 'import' )
            {
            // InternalArchitecture.g:454:1: ( 'import' )
            // InternalArchitecture.g:455:2: 'import'
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
    // InternalArchitecture.g:464:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:468:1: ( rule__Import__Group__1__Impl )
            // InternalArchitecture.g:469:2: rule__Import__Group__1__Impl
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
    // InternalArchitecture.g:475:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:479:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalArchitecture.g:480:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalArchitecture.g:480:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalArchitecture.g:481:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalArchitecture.g:482:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalArchitecture.g:482:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalArchitecture.g:491:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:495:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalArchitecture.g:496:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalArchitecture.g:503:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:507:1: ( ( ruleQualifiedName ) )
            // InternalArchitecture.g:508:1: ( ruleQualifiedName )
            {
            // InternalArchitecture.g:508:1: ( ruleQualifiedName )
            // InternalArchitecture.g:509:2: ruleQualifiedName
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
    // InternalArchitecture.g:518:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:522:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalArchitecture.g:523:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalArchitecture.g:529:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:533:1: ( ( ( '.*' )? ) )
            // InternalArchitecture.g:534:1: ( ( '.*' )? )
            {
            // InternalArchitecture.g:534:1: ( ( '.*' )? )
            // InternalArchitecture.g:535:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalArchitecture.g:536:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArchitecture.g:536:3: '.*'
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
    // InternalArchitecture.g:545:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:549:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalArchitecture.g:550:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalArchitecture.g:557:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:561:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:562:1: ( RULE_ID )
            {
            // InternalArchitecture.g:562:1: ( RULE_ID )
            // InternalArchitecture.g:563:2: RULE_ID
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
    // InternalArchitecture.g:572:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:576:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalArchitecture.g:577:2: rule__QualifiedName__Group__1__Impl
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
    // InternalArchitecture.g:583:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:587:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalArchitecture.g:588:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalArchitecture.g:588:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalArchitecture.g:589:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalArchitecture.g:590:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArchitecture.g:590:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalArchitecture.g:599:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:603:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalArchitecture.g:604:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalArchitecture.g:611:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:615:1: ( ( '.' ) )
            // InternalArchitecture.g:616:1: ( '.' )
            {
            // InternalArchitecture.g:616:1: ( '.' )
            // InternalArchitecture.g:617:2: '.'
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
    // InternalArchitecture.g:626:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:630:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalArchitecture.g:631:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalArchitecture.g:637:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:641:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:642:1: ( RULE_ID )
            {
            // InternalArchitecture.g:642:1: ( RULE_ID )
            // InternalArchitecture.g:643:2: RULE_ID
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


    // $ANTLR start "rule__Component__Group__0"
    // InternalArchitecture.g:653:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:657:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArchitecture.g:658:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:665:1: rule__Component__Group__0__Impl : ( 'Component:' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:669:1: ( ( 'Component:' ) )
            // InternalArchitecture.g:670:1: ( 'Component:' )
            {
            // InternalArchitecture.g:670:1: ( 'Component:' )
            // InternalArchitecture.g:671:2: 'Component:'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:680:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:684:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalArchitecture.g:685:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:692:1: rule__Component__Group__1__Impl : ( ( rule__Component__InstAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:696:1: ( ( ( rule__Component__InstAssignment_1 ) ) )
            // InternalArchitecture.g:697:1: ( ( rule__Component__InstAssignment_1 ) )
            {
            // InternalArchitecture.g:697:1: ( ( rule__Component__InstAssignment_1 ) )
            // InternalArchitecture.g:698:2: ( rule__Component__InstAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getInstAssignment_1()); 
            // InternalArchitecture.g:699:2: ( rule__Component__InstAssignment_1 )
            // InternalArchitecture.g:699:3: rule__Component__InstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__InstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getInstAssignment_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:707:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:711:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalArchitecture.g:712:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:719:1: rule__Component__Group__2__Impl : ( ':' ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:723:1: ( ( ':' ) )
            // InternalArchitecture.g:724:1: ( ':' )
            {
            // InternalArchitecture.g:724:1: ( ':' )
            // InternalArchitecture.g:725:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalArchitecture.g:734:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:738:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalArchitecture.g:739:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:746:1: rule__Component__Group__3__Impl : ( ( rule__Component__NameAssignment_3 ) ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:750:1: ( ( ( rule__Component__NameAssignment_3 ) ) )
            // InternalArchitecture.g:751:1: ( ( rule__Component__NameAssignment_3 ) )
            {
            // InternalArchitecture.g:751:1: ( ( rule__Component__NameAssignment_3 ) )
            // InternalArchitecture.g:752:2: ( rule__Component__NameAssignment_3 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_3()); 
            // InternalArchitecture.g:753:2: ( rule__Component__NameAssignment_3 )
            // InternalArchitecture.g:753:3: rule__Component__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalArchitecture.g:761:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:765:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalArchitecture.g:766:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:773:1: rule__Component__Group__4__Impl : ( 'ProvidedServices:' ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:777:1: ( ( 'ProvidedServices:' ) )
            // InternalArchitecture.g:778:1: ( 'ProvidedServices:' )
            {
            // InternalArchitecture.g:778:1: ( 'ProvidedServices:' )
            // InternalArchitecture.g:779:2: 'ProvidedServices:'
            {
             before(grammarAccess.getComponentAccess().getProvidedServicesKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getProvidedServicesKeyword_4()); 

            }


            }

        }
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
    // InternalArchitecture.g:788:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:792:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalArchitecture.g:793:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:800:1: rule__Component__Group__5__Impl : ( 'conf(' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:804:1: ( ( 'conf(' ) )
            // InternalArchitecture.g:805:1: ( 'conf(' )
            {
            // InternalArchitecture.g:805:1: ( 'conf(' )
            // InternalArchitecture.g:806:2: 'conf('
            {
             before(grammarAccess.getComponentAccess().getConfKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getConfKeyword_5()); 

            }


            }

        }
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
    // InternalArchitecture.g:815:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:819:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalArchitecture.g:820:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:827:1: rule__Component__Group__6__Impl : ( ( rule__Component__Group_6__0 )* ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:831:1: ( ( ( rule__Component__Group_6__0 )* ) )
            // InternalArchitecture.g:832:1: ( ( rule__Component__Group_6__0 )* )
            {
            // InternalArchitecture.g:832:1: ( ( rule__Component__Group_6__0 )* )
            // InternalArchitecture.g:833:2: ( rule__Component__Group_6__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_6()); 
            // InternalArchitecture.g:834:2: ( rule__Component__Group_6__0 )*
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
            	    // InternalArchitecture.g:834:3: rule__Component__Group_6__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_6()); 

            }


            }

        }
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
    // InternalArchitecture.g:842:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:846:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalArchitecture.g:847:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:854:1: rule__Component__Group__7__Impl : ( ( rule__Component__Arg1Assignment_7 ) ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:858:1: ( ( ( rule__Component__Arg1Assignment_7 ) ) )
            // InternalArchitecture.g:859:1: ( ( rule__Component__Arg1Assignment_7 ) )
            {
            // InternalArchitecture.g:859:1: ( ( rule__Component__Arg1Assignment_7 ) )
            // InternalArchitecture.g:860:2: ( rule__Component__Arg1Assignment_7 )
            {
             before(grammarAccess.getComponentAccess().getArg1Assignment_7()); 
            // InternalArchitecture.g:861:2: ( rule__Component__Arg1Assignment_7 )
            // InternalArchitecture.g:861:3: rule__Component__Arg1Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Component__Arg1Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArg1Assignment_7()); 

            }


            }

        }
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
    // InternalArchitecture.g:869:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:873:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalArchitecture.g:874:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:881:1: rule__Component__Group__8__Impl : ( ')' ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:885:1: ( ( ')' ) )
            // InternalArchitecture.g:886:1: ( ')' )
            {
            // InternalArchitecture.g:886:1: ( ')' )
            // InternalArchitecture.g:887:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
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
    // InternalArchitecture.g:896:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:900:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalArchitecture.g:901:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__10();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:908:1: rule__Component__Group__9__Impl : ( ( rule__Component__Group_9__0 )* ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:912:1: ( ( ( rule__Component__Group_9__0 )* ) )
            // InternalArchitecture.g:913:1: ( ( rule__Component__Group_9__0 )* )
            {
            // InternalArchitecture.g:913:1: ( ( rule__Component__Group_9__0 )* )
            // InternalArchitecture.g:914:2: ( rule__Component__Group_9__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_9()); 
            // InternalArchitecture.g:915:2: ( rule__Component__Group_9__0 )*
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
            	    // InternalArchitecture.g:915:3: rule__Component__Group_9__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_9()); 

            }


            }

        }
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
    // InternalArchitecture.g:923:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:927:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalArchitecture.g:928:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__11();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:935:1: rule__Component__Group__10__Impl : ( ( 'RequiredServices:' )? ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:939:1: ( ( ( 'RequiredServices:' )? ) )
            // InternalArchitecture.g:940:1: ( ( 'RequiredServices:' )? )
            {
            // InternalArchitecture.g:940:1: ( ( 'RequiredServices:' )? )
            // InternalArchitecture.g:941:2: ( 'RequiredServices:' )?
            {
             before(grammarAccess.getComponentAccess().getRequiredServicesKeyword_10()); 
            // InternalArchitecture.g:942:2: ( 'RequiredServices:' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalArchitecture.g:942:3: 'RequiredServices:'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getRequiredServicesKeyword_10()); 

            }


            }

        }
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
    // InternalArchitecture.g:950:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:954:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalArchitecture.g:955:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_14);
            rule__Component__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__12();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:962:1: rule__Component__Group__11__Impl : ( ( rule__Component__ReqAssignment_11 )* ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:966:1: ( ( ( rule__Component__ReqAssignment_11 )* ) )
            // InternalArchitecture.g:967:1: ( ( rule__Component__ReqAssignment_11 )* )
            {
            // InternalArchitecture.g:967:1: ( ( rule__Component__ReqAssignment_11 )* )
            // InternalArchitecture.g:968:2: ( rule__Component__ReqAssignment_11 )*
            {
             before(grammarAccess.getComponentAccess().getReqAssignment_11()); 
            // InternalArchitecture.g:969:2: ( rule__Component__ReqAssignment_11 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArchitecture.g:969:3: rule__Component__ReqAssignment_11
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__ReqAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getReqAssignment_11()); 

            }


            }

        }
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
    // InternalArchitecture.g:977:1: rule__Component__Group__12 : rule__Component__Group__12__Impl ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:981:1: ( rule__Component__Group__12__Impl )
            // InternalArchitecture.g:982:2: rule__Component__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__12__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:988:1: rule__Component__Group__12__Impl : ( ( rule__Component__BindAssignment_12 )* ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:992:1: ( ( ( rule__Component__BindAssignment_12 )* ) )
            // InternalArchitecture.g:993:1: ( ( rule__Component__BindAssignment_12 )* )
            {
            // InternalArchitecture.g:993:1: ( ( rule__Component__BindAssignment_12 )* )
            // InternalArchitecture.g:994:2: ( rule__Component__BindAssignment_12 )*
            {
             before(grammarAccess.getComponentAccess().getBindAssignment_12()); 
            // InternalArchitecture.g:995:2: ( rule__Component__BindAssignment_12 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArchitecture.g:995:3: rule__Component__BindAssignment_12
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Component__BindAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getBindAssignment_12()); 

            }


            }

        }
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
    // InternalArchitecture.g:1004:1: rule__Component__Group_6__0 : rule__Component__Group_6__0__Impl rule__Component__Group_6__1 ;
    public final void rule__Component__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1008:1: ( rule__Component__Group_6__0__Impl rule__Component__Group_6__1 )
            // InternalArchitecture.g:1009:2: rule__Component__Group_6__0__Impl rule__Component__Group_6__1
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_6__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1016:1: rule__Component__Group_6__0__Impl : ( ( rule__Component__ArgAssignment_6_0 ) ) ;
    public final void rule__Component__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1020:1: ( ( ( rule__Component__ArgAssignment_6_0 ) ) )
            // InternalArchitecture.g:1021:1: ( ( rule__Component__ArgAssignment_6_0 ) )
            {
            // InternalArchitecture.g:1021:1: ( ( rule__Component__ArgAssignment_6_0 ) )
            // InternalArchitecture.g:1022:2: ( rule__Component__ArgAssignment_6_0 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_6_0()); 
            // InternalArchitecture.g:1023:2: ( rule__Component__ArgAssignment_6_0 )
            // InternalArchitecture.g:1023:3: rule__Component__ArgAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_6_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1031:1: rule__Component__Group_6__1 : rule__Component__Group_6__1__Impl ;
    public final void rule__Component__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1035:1: ( rule__Component__Group_6__1__Impl )
            // InternalArchitecture.g:1036:2: rule__Component__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1042:1: rule__Component__Group_6__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1046:1: ( ( ',' ) )
            // InternalArchitecture.g:1047:1: ( ',' )
            {
            // InternalArchitecture.g:1047:1: ( ',' )
            // InternalArchitecture.g:1048:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_6_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_6_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:1058:1: rule__Component__Group_9__0 : rule__Component__Group_9__0__Impl rule__Component__Group_9__1 ;
    public final void rule__Component__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1062:1: ( rule__Component__Group_9__0__Impl rule__Component__Group_9__1 )
            // InternalArchitecture.g:1063:2: rule__Component__Group_9__0__Impl rule__Component__Group_9__1
            {
            pushFollow(FOLLOW_17);
            rule__Component__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1070:1: rule__Component__Group_9__0__Impl : ( ( rule__Component__MethodeAssignment_9_0 ) ) ;
    public final void rule__Component__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1074:1: ( ( ( rule__Component__MethodeAssignment_9_0 ) ) )
            // InternalArchitecture.g:1075:1: ( ( rule__Component__MethodeAssignment_9_0 ) )
            {
            // InternalArchitecture.g:1075:1: ( ( rule__Component__MethodeAssignment_9_0 ) )
            // InternalArchitecture.g:1076:2: ( rule__Component__MethodeAssignment_9_0 )
            {
             before(grammarAccess.getComponentAccess().getMethodeAssignment_9_0()); 
            // InternalArchitecture.g:1077:2: ( rule__Component__MethodeAssignment_9_0 )
            // InternalArchitecture.g:1077:3: rule__Component__MethodeAssignment_9_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__MethodeAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMethodeAssignment_9_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1085:1: rule__Component__Group_9__1 : rule__Component__Group_9__1__Impl rule__Component__Group_9__2 ;
    public final void rule__Component__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1089:1: ( rule__Component__Group_9__1__Impl rule__Component__Group_9__2 )
            // InternalArchitecture.g:1090:2: rule__Component__Group_9__1__Impl rule__Component__Group_9__2
            {
            pushFollow(FOLLOW_18);
            rule__Component__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9__2();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1097:1: rule__Component__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1101:1: ( ( '(' ) )
            // InternalArchitecture.g:1102:1: ( '(' )
            {
            // InternalArchitecture.g:1102:1: ( '(' )
            // InternalArchitecture.g:1103:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_9_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:1112:1: rule__Component__Group_9__2 : rule__Component__Group_9__2__Impl rule__Component__Group_9__3 ;
    public final void rule__Component__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1116:1: ( rule__Component__Group_9__2__Impl rule__Component__Group_9__3 )
            // InternalArchitecture.g:1117:2: rule__Component__Group_9__2__Impl rule__Component__Group_9__3
            {
            pushFollow(FOLLOW_18);
            rule__Component__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9__3();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1124:1: rule__Component__Group_9__2__Impl : ( ( rule__Component__Group_9_2__0 )* ) ;
    public final void rule__Component__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1128:1: ( ( ( rule__Component__Group_9_2__0 )* ) )
            // InternalArchitecture.g:1129:1: ( ( rule__Component__Group_9_2__0 )* )
            {
            // InternalArchitecture.g:1129:1: ( ( rule__Component__Group_9_2__0 )* )
            // InternalArchitecture.g:1130:2: ( rule__Component__Group_9_2__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_9_2()); 
            // InternalArchitecture.g:1131:2: ( rule__Component__Group_9_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArchitecture.g:1131:3: rule__Component__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_9_2()); 

            }


            }

        }
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
    // InternalArchitecture.g:1139:1: rule__Component__Group_9__3 : rule__Component__Group_9__3__Impl rule__Component__Group_9__4 ;
    public final void rule__Component__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1143:1: ( rule__Component__Group_9__3__Impl rule__Component__Group_9__4 )
            // InternalArchitecture.g:1144:2: rule__Component__Group_9__3__Impl rule__Component__Group_9__4
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9__4();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1151:1: rule__Component__Group_9__3__Impl : ( ')' ) ;
    public final void rule__Component__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1155:1: ( ( ')' ) )
            // InternalArchitecture.g:1156:1: ( ')' )
            {
            // InternalArchitecture.g:1156:1: ( ')' )
            // InternalArchitecture.g:1157:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_9_3()); 

            }


            }

        }
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
    // InternalArchitecture.g:1166:1: rule__Component__Group_9__4 : rule__Component__Group_9__4__Impl ;
    public final void rule__Component__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1170:1: ( rule__Component__Group_9__4__Impl )
            // InternalArchitecture.g:1171:2: rule__Component__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1177:1: rule__Component__Group_9__4__Impl : ( ( rule__Component__Group_9_4__0 )? ) ;
    public final void rule__Component__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1181:1: ( ( ( rule__Component__Group_9_4__0 )? ) )
            // InternalArchitecture.g:1182:1: ( ( rule__Component__Group_9_4__0 )? )
            {
            // InternalArchitecture.g:1182:1: ( ( rule__Component__Group_9_4__0 )? )
            // InternalArchitecture.g:1183:2: ( rule__Component__Group_9_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_9_4()); 
            // InternalArchitecture.g:1184:2: ( rule__Component__Group_9_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArchitecture.g:1184:3: rule__Component__Group_9_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_9_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_9_4()); 

            }


            }

        }
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
    // InternalArchitecture.g:1193:1: rule__Component__Group_9_2__0 : rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1 ;
    public final void rule__Component__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1197:1: ( rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1 )
            // InternalArchitecture.g:1198:2: rule__Component__Group_9_2__0__Impl rule__Component__Group_9_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1205:1: rule__Component__Group_9_2__0__Impl : ( ( rule__Component__Group_9_2_0__0 )* ) ;
    public final void rule__Component__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1209:1: ( ( ( rule__Component__Group_9_2_0__0 )* ) )
            // InternalArchitecture.g:1210:1: ( ( rule__Component__Group_9_2_0__0 )* )
            {
            // InternalArchitecture.g:1210:1: ( ( rule__Component__Group_9_2_0__0 )* )
            // InternalArchitecture.g:1211:2: ( rule__Component__Group_9_2_0__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_9_2_0()); 
            // InternalArchitecture.g:1212:2: ( rule__Component__Group_9_2_0__0 )*
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
            	    // InternalArchitecture.g:1212:3: rule__Component__Group_9_2_0__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Component__Group_9_2_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_9_2_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1220:1: rule__Component__Group_9_2__1 : rule__Component__Group_9_2__1__Impl ;
    public final void rule__Component__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1224:1: ( rule__Component__Group_9_2__1__Impl )
            // InternalArchitecture.g:1225:2: rule__Component__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1231:1: rule__Component__Group_9_2__1__Impl : ( ( rule__Component__ArgAssignment_9_2_1 ) ) ;
    public final void rule__Component__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1235:1: ( ( ( rule__Component__ArgAssignment_9_2_1 ) ) )
            // InternalArchitecture.g:1236:1: ( ( rule__Component__ArgAssignment_9_2_1 ) )
            {
            // InternalArchitecture.g:1236:1: ( ( rule__Component__ArgAssignment_9_2_1 ) )
            // InternalArchitecture.g:1237:2: ( rule__Component__ArgAssignment_9_2_1 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_9_2_1()); 
            // InternalArchitecture.g:1238:2: ( rule__Component__ArgAssignment_9_2_1 )
            // InternalArchitecture.g:1238:3: rule__Component__ArgAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_9_2_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:1247:1: rule__Component__Group_9_2_0__0 : rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1 ;
    public final void rule__Component__Group_9_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1251:1: ( rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1 )
            // InternalArchitecture.g:1252:2: rule__Component__Group_9_2_0__0__Impl rule__Component__Group_9_2_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group_9_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2_0__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1259:1: rule__Component__Group_9_2_0__0__Impl : ( ( rule__Component__ArgAssignment_9_2_0_0 ) ) ;
    public final void rule__Component__Group_9_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1263:1: ( ( ( rule__Component__ArgAssignment_9_2_0_0 ) ) )
            // InternalArchitecture.g:1264:1: ( ( rule__Component__ArgAssignment_9_2_0_0 ) )
            {
            // InternalArchitecture.g:1264:1: ( ( rule__Component__ArgAssignment_9_2_0_0 ) )
            // InternalArchitecture.g:1265:2: ( rule__Component__ArgAssignment_9_2_0_0 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_9_2_0_0()); 
            // InternalArchitecture.g:1266:2: ( rule__Component__ArgAssignment_9_2_0_0 )
            // InternalArchitecture.g:1266:3: rule__Component__ArgAssignment_9_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_9_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_9_2_0_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1274:1: rule__Component__Group_9_2_0__1 : rule__Component__Group_9_2_0__1__Impl ;
    public final void rule__Component__Group_9_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1278:1: ( rule__Component__Group_9_2_0__1__Impl )
            // InternalArchitecture.g:1279:2: rule__Component__Group_9_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_2_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1285:1: rule__Component__Group_9_2_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_9_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1289:1: ( ( ',' ) )
            // InternalArchitecture.g:1290:1: ( ',' )
            {
            // InternalArchitecture.g:1290:1: ( ',' )
            // InternalArchitecture.g:1291:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_9_2_0_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:1301:1: rule__Component__Group_9_4__0 : rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1 ;
    public final void rule__Component__Group_9_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1305:1: ( rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1 )
            // InternalArchitecture.g:1306:2: rule__Component__Group_9_4__0__Impl rule__Component__Group_9_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group_9_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_9_4__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1313:1: rule__Component__Group_9_4__0__Impl : ( ':' ) ;
    public final void rule__Component__Group_9_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1317:1: ( ( ':' ) )
            // InternalArchitecture.g:1318:1: ( ':' )
            {
            // InternalArchitecture.g:1318:1: ( ':' )
            // InternalArchitecture.g:1319:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_9_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_9_4_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1328:1: rule__Component__Group_9_4__1 : rule__Component__Group_9_4__1__Impl ;
    public final void rule__Component__Group_9_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1332:1: ( rule__Component__Group_9_4__1__Impl )
            // InternalArchitecture.g:1333:2: rule__Component__Group_9_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_9_4__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1339:1: rule__Component__Group_9_4__1__Impl : ( ( rule__Component__ArgAssignment_9_4_1 ) ) ;
    public final void rule__Component__Group_9_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1343:1: ( ( ( rule__Component__ArgAssignment_9_4_1 ) ) )
            // InternalArchitecture.g:1344:1: ( ( rule__Component__ArgAssignment_9_4_1 ) )
            {
            // InternalArchitecture.g:1344:1: ( ( rule__Component__ArgAssignment_9_4_1 ) )
            // InternalArchitecture.g:1345:2: ( rule__Component__ArgAssignment_9_4_1 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_9_4_1()); 
            // InternalArchitecture.g:1346:2: ( rule__Component__ArgAssignment_9_4_1 )
            // InternalArchitecture.g:1346:3: rule__Component__ArgAssignment_9_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_9_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_9_4_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:1355:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1359:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalArchitecture.g:1360:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalArchitecture.g:1367:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1371:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalArchitecture.g:1372:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalArchitecture.g:1372:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalArchitecture.g:1373:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalArchitecture.g:1374:2: ( rule__Variable__NameAssignment_0 )
            // InternalArchitecture.g:1374:3: rule__Variable__NameAssignment_0
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
    // InternalArchitecture.g:1382:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1386:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalArchitecture.g:1387:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalArchitecture.g:1394:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1398:1: ( ( ':' ) )
            // InternalArchitecture.g:1399:1: ( ':' )
            {
            // InternalArchitecture.g:1399:1: ( ':' )
            // InternalArchitecture.g:1400:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalArchitecture.g:1409:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1413:1: ( rule__Variable__Group__2__Impl )
            // InternalArchitecture.g:1414:2: rule__Variable__Group__2__Impl
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
    // InternalArchitecture.g:1420:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1424:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalArchitecture.g:1425:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalArchitecture.g:1425:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalArchitecture.g:1426:2: ( rule__Variable__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // InternalArchitecture.g:1427:2: ( rule__Variable__TypeAssignment_2 )
            // InternalArchitecture.g:1427:3: rule__Variable__TypeAssignment_2
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


    // $ANTLR start "rule__Bindings__Group__0"
    // InternalArchitecture.g:1436:1: rule__Bindings__Group__0 : rule__Bindings__Group__0__Impl rule__Bindings__Group__1 ;
    public final void rule__Bindings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1440:1: ( rule__Bindings__Group__0__Impl rule__Bindings__Group__1 )
            // InternalArchitecture.g:1441:2: rule__Bindings__Group__0__Impl rule__Bindings__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Bindings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1448:1: rule__Bindings__Group__0__Impl : ( 'bind(' ) ;
    public final void rule__Bindings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1452:1: ( ( 'bind(' ) )
            // InternalArchitecture.g:1453:1: ( 'bind(' )
            {
            // InternalArchitecture.g:1453:1: ( 'bind(' )
            // InternalArchitecture.g:1454:2: 'bind('
            {
             before(grammarAccess.getBindingsAccess().getBindKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getBindKeyword_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1463:1: rule__Bindings__Group__1 : rule__Bindings__Group__1__Impl rule__Bindings__Group__2 ;
    public final void rule__Bindings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1467:1: ( rule__Bindings__Group__1__Impl rule__Bindings__Group__2 )
            // InternalArchitecture.g:1468:2: rule__Bindings__Group__1__Impl rule__Bindings__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Bindings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__2();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1475:1: rule__Bindings__Group__1__Impl : ( ( rule__Bindings__NameCompAssignment_1 ) ) ;
    public final void rule__Bindings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1479:1: ( ( ( rule__Bindings__NameCompAssignment_1 ) ) )
            // InternalArchitecture.g:1480:1: ( ( rule__Bindings__NameCompAssignment_1 ) )
            {
            // InternalArchitecture.g:1480:1: ( ( rule__Bindings__NameCompAssignment_1 ) )
            // InternalArchitecture.g:1481:2: ( rule__Bindings__NameCompAssignment_1 )
            {
             before(grammarAccess.getBindingsAccess().getNameCompAssignment_1()); 
            // InternalArchitecture.g:1482:2: ( rule__Bindings__NameCompAssignment_1 )
            // InternalArchitecture.g:1482:3: rule__Bindings__NameCompAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameCompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBindingsAccess().getNameCompAssignment_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:1490:1: rule__Bindings__Group__2 : rule__Bindings__Group__2__Impl rule__Bindings__Group__3 ;
    public final void rule__Bindings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1494:1: ( rule__Bindings__Group__2__Impl rule__Bindings__Group__3 )
            // InternalArchitecture.g:1495:2: rule__Bindings__Group__2__Impl rule__Bindings__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Bindings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__3();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1502:1: rule__Bindings__Group__2__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1506:1: ( ( '.' ) )
            // InternalArchitecture.g:1507:1: ( '.' )
            {
            // InternalArchitecture.g:1507:1: ( '.' )
            // InternalArchitecture.g:1508:2: '.'
            {
             before(grammarAccess.getBindingsAccess().getFullStopKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getFullStopKeyword_2()); 

            }


            }

        }
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
    // InternalArchitecture.g:1517:1: rule__Bindings__Group__3 : rule__Bindings__Group__3__Impl rule__Bindings__Group__4 ;
    public final void rule__Bindings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1521:1: ( rule__Bindings__Group__3__Impl rule__Bindings__Group__4 )
            // InternalArchitecture.g:1522:2: rule__Bindings__Group__3__Impl rule__Bindings__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Bindings__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__4();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1529:1: rule__Bindings__Group__3__Impl : ( ( rule__Bindings__NameServ1Assignment_3 ) ) ;
    public final void rule__Bindings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1533:1: ( ( ( rule__Bindings__NameServ1Assignment_3 ) ) )
            // InternalArchitecture.g:1534:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            {
            // InternalArchitecture.g:1534:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            // InternalArchitecture.g:1535:2: ( rule__Bindings__NameServ1Assignment_3 )
            {
             before(grammarAccess.getBindingsAccess().getNameServ1Assignment_3()); 
            // InternalArchitecture.g:1536:2: ( rule__Bindings__NameServ1Assignment_3 )
            // InternalArchitecture.g:1536:3: rule__Bindings__NameServ1Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameServ1Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBindingsAccess().getNameServ1Assignment_3()); 

            }


            }

        }
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
    // InternalArchitecture.g:1544:1: rule__Bindings__Group__4 : rule__Bindings__Group__4__Impl rule__Bindings__Group__5 ;
    public final void rule__Bindings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1548:1: ( rule__Bindings__Group__4__Impl rule__Bindings__Group__5 )
            // InternalArchitecture.g:1549:2: rule__Bindings__Group__4__Impl rule__Bindings__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Bindings__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__5();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1556:1: rule__Bindings__Group__4__Impl : ( ',' ) ;
    public final void rule__Bindings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1560:1: ( ( ',' ) )
            // InternalArchitecture.g:1561:1: ( ',' )
            {
            // InternalArchitecture.g:1561:1: ( ',' )
            // InternalArchitecture.g:1562:2: ','
            {
             before(grammarAccess.getBindingsAccess().getCommaKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getCommaKeyword_4()); 

            }


            }

        }
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
    // InternalArchitecture.g:1571:1: rule__Bindings__Group__5 : rule__Bindings__Group__5__Impl rule__Bindings__Group__6 ;
    public final void rule__Bindings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1575:1: ( rule__Bindings__Group__5__Impl rule__Bindings__Group__6 )
            // InternalArchitecture.g:1576:2: rule__Bindings__Group__5__Impl rule__Bindings__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Bindings__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__6();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1583:1: rule__Bindings__Group__5__Impl : ( ( rule__Bindings__NameCompAssignment_5 ) ) ;
    public final void rule__Bindings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1587:1: ( ( ( rule__Bindings__NameCompAssignment_5 ) ) )
            // InternalArchitecture.g:1588:1: ( ( rule__Bindings__NameCompAssignment_5 ) )
            {
            // InternalArchitecture.g:1588:1: ( ( rule__Bindings__NameCompAssignment_5 ) )
            // InternalArchitecture.g:1589:2: ( rule__Bindings__NameCompAssignment_5 )
            {
             before(grammarAccess.getBindingsAccess().getNameCompAssignment_5()); 
            // InternalArchitecture.g:1590:2: ( rule__Bindings__NameCompAssignment_5 )
            // InternalArchitecture.g:1590:3: rule__Bindings__NameCompAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameCompAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBindingsAccess().getNameCompAssignment_5()); 

            }


            }

        }
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
    // InternalArchitecture.g:1598:1: rule__Bindings__Group__6 : rule__Bindings__Group__6__Impl rule__Bindings__Group__7 ;
    public final void rule__Bindings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1602:1: ( rule__Bindings__Group__6__Impl rule__Bindings__Group__7 )
            // InternalArchitecture.g:1603:2: rule__Bindings__Group__6__Impl rule__Bindings__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Bindings__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__7();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1610:1: rule__Bindings__Group__6__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1614:1: ( ( '.' ) )
            // InternalArchitecture.g:1615:1: ( '.' )
            {
            // InternalArchitecture.g:1615:1: ( '.' )
            // InternalArchitecture.g:1616:2: '.'
            {
             before(grammarAccess.getBindingsAccess().getFullStopKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getFullStopKeyword_6()); 

            }


            }

        }
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
    // InternalArchitecture.g:1625:1: rule__Bindings__Group__7 : rule__Bindings__Group__7__Impl rule__Bindings__Group__8 ;
    public final void rule__Bindings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1629:1: ( rule__Bindings__Group__7__Impl rule__Bindings__Group__8 )
            // InternalArchitecture.g:1630:2: rule__Bindings__Group__7__Impl rule__Bindings__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__Bindings__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bindings__Group__8();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1637:1: rule__Bindings__Group__7__Impl : ( ( rule__Bindings__NameServ2Assignment_7 ) ) ;
    public final void rule__Bindings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1641:1: ( ( ( rule__Bindings__NameServ2Assignment_7 ) ) )
            // InternalArchitecture.g:1642:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            {
            // InternalArchitecture.g:1642:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            // InternalArchitecture.g:1643:2: ( rule__Bindings__NameServ2Assignment_7 )
            {
             before(grammarAccess.getBindingsAccess().getNameServ2Assignment_7()); 
            // InternalArchitecture.g:1644:2: ( rule__Bindings__NameServ2Assignment_7 )
            // InternalArchitecture.g:1644:3: rule__Bindings__NameServ2Assignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__NameServ2Assignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBindingsAccess().getNameServ2Assignment_7()); 

            }


            }

        }
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
    // InternalArchitecture.g:1652:1: rule__Bindings__Group__8 : rule__Bindings__Group__8__Impl ;
    public final void rule__Bindings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1656:1: ( rule__Bindings__Group__8__Impl )
            // InternalArchitecture.g:1657:2: rule__Bindings__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bindings__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1663:1: rule__Bindings__Group__8__Impl : ( ')' ) ;
    public final void rule__Bindings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1667:1: ( ( ')' ) )
            // InternalArchitecture.g:1668:1: ( ')' )
            {
            // InternalArchitecture.g:1668:1: ( ')' )
            // InternalArchitecture.g:1669:2: ')'
            {
             before(grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
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
    // InternalArchitecture.g:1679:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1683:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalArchitecture.g:1684:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__RequiredService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__1();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1691:1: rule__RequiredService__Group__0__Impl : ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1695:1: ( ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) )
            // InternalArchitecture.g:1696:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            {
            // InternalArchitecture.g:1696:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            // InternalArchitecture.g:1697:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameVarMethodeAssignment_0()); 
            // InternalArchitecture.g:1698:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            // InternalArchitecture.g:1698:3: rule__RequiredService__NameVarMethodeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameVarMethodeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getNameVarMethodeAssignment_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1706:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1710:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalArchitecture.g:1711:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RequiredService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__2();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1718:1: rule__RequiredService__Group__1__Impl : ( ':=' ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1722:1: ( ( ':=' ) )
            // InternalArchitecture.g:1723:1: ( ':=' )
            {
            // InternalArchitecture.g:1723:1: ( ':=' )
            // InternalArchitecture.g:1724:2: ':='
            {
             before(grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalArchitecture.g:1733:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1737:1: ( rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 )
            // InternalArchitecture.g:1738:2: rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__RequiredService__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__3();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1745:1: rule__RequiredService__Group__2__Impl : ( ( rule__RequiredService__NameCompAssignment_2 ) ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1749:1: ( ( ( rule__RequiredService__NameCompAssignment_2 ) ) )
            // InternalArchitecture.g:1750:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            {
            // InternalArchitecture.g:1750:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            // InternalArchitecture.g:1751:2: ( rule__RequiredService__NameCompAssignment_2 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameCompAssignment_2()); 
            // InternalArchitecture.g:1752:2: ( rule__RequiredService__NameCompAssignment_2 )
            // InternalArchitecture.g:1752:3: rule__RequiredService__NameCompAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameCompAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getNameCompAssignment_2()); 

            }


            }

        }
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
    // InternalArchitecture.g:1760:1: rule__RequiredService__Group__3 : rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 ;
    public final void rule__RequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1764:1: ( rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 )
            // InternalArchitecture.g:1765:2: rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RequiredService__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__4();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1772:1: rule__RequiredService__Group__3__Impl : ( '.' ) ;
    public final void rule__RequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1776:1: ( ( '.' ) )
            // InternalArchitecture.g:1777:1: ( '.' )
            {
            // InternalArchitecture.g:1777:1: ( '.' )
            // InternalArchitecture.g:1778:2: '.'
            {
             before(grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3()); 

            }


            }

        }
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
    // InternalArchitecture.g:1787:1: rule__RequiredService__Group__4 : rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 ;
    public final void rule__RequiredService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1791:1: ( rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 )
            // InternalArchitecture.g:1792:2: rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RequiredService__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__5();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1799:1: rule__RequiredService__Group__4__Impl : ( ( rule__RequiredService__NameServAssignment_4 ) ) ;
    public final void rule__RequiredService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1803:1: ( ( ( rule__RequiredService__NameServAssignment_4 ) ) )
            // InternalArchitecture.g:1804:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            {
            // InternalArchitecture.g:1804:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            // InternalArchitecture.g:1805:2: ( rule__RequiredService__NameServAssignment_4 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameServAssignment_4()); 
            // InternalArchitecture.g:1806:2: ( rule__RequiredService__NameServAssignment_4 )
            // InternalArchitecture.g:1806:3: rule__RequiredService__NameServAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__NameServAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getNameServAssignment_4()); 

            }


            }

        }
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
    // InternalArchitecture.g:1814:1: rule__RequiredService__Group__5 : rule__RequiredService__Group__5__Impl ;
    public final void rule__RequiredService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1818:1: ( rule__RequiredService__Group__5__Impl )
            // InternalArchitecture.g:1819:2: rule__RequiredService__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalArchitecture.g:1825:1: rule__RequiredService__Group__5__Impl : ( ';' ) ;
    public final void rule__RequiredService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1829:1: ( ( ';' ) )
            // InternalArchitecture.g:1830:1: ( ';' )
            {
            // InternalArchitecture.g:1830:1: ( ';' )
            // InternalArchitecture.g:1831:2: ';'
            {
             before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5()); 

            }


            }

        }
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
    // InternalArchitecture.g:1841:1: rule__Model__FunctionAssignment : ( ruleAbstractModel ) ;
    public final void rule__Model__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1845:1: ( ( ruleAbstractModel ) )
            // InternalArchitecture.g:1846:2: ( ruleAbstractModel )
            {
            // InternalArchitecture.g:1846:2: ( ruleAbstractModel )
            // InternalArchitecture.g:1847:3: ruleAbstractModel
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


    // $ANTLR start "rule__AbstractModel__CompAssignment_1"
    // InternalArchitecture.g:1856:1: rule__AbstractModel__CompAssignment_1 : ( ruleComponent ) ;
    public final void rule__AbstractModel__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1860:1: ( ( ruleComponent ) )
            // InternalArchitecture.g:1861:2: ( ruleComponent )
            {
            // InternalArchitecture.g:1861:2: ( ruleComponent )
            // InternalArchitecture.g:1862:3: ruleComponent
            {
             before(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getAbstractModelAccess().getCompComponentParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1871:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1875:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalArchitecture.g:1876:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalArchitecture.g:1876:2: ( ruleQualifiedNameWithWildcard )
            // InternalArchitecture.g:1877:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Component__InstAssignment_1"
    // InternalArchitecture.g:1886:1: rule__Component__InstAssignment_1 : ( ruleInstanceComp ) ;
    public final void rule__Component__InstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1890:1: ( ( ruleInstanceComp ) )
            // InternalArchitecture.g:1891:2: ( ruleInstanceComp )
            {
            // InternalArchitecture.g:1891:2: ( ruleInstanceComp )
            // InternalArchitecture.g:1892:3: ruleInstanceComp
            {
             before(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceComp();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1901:1: rule__Component__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1905:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:1906:2: ( RULE_ID )
            {
            // InternalArchitecture.g:1906:2: ( RULE_ID )
            // InternalArchitecture.g:1907:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1916:1: rule__Component__ArgAssignment_6_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1920:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1921:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1921:2: ( ruleVariable )
            // InternalArchitecture.g:1922:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_6_0_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1931:1: rule__Component__Arg1Assignment_7 : ( ruleVariable ) ;
    public final void rule__Component__Arg1Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1935:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1936:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1936:2: ( ruleVariable )
            // InternalArchitecture.g:1937:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_7_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1946:1: rule__Component__MethodeAssignment_9_0 : ( ruleServiceName ) ;
    public final void rule__Component__MethodeAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1950:1: ( ( ruleServiceName ) )
            // InternalArchitecture.g:1951:2: ( ruleServiceName )
            {
            // InternalArchitecture.g:1951:2: ( ruleServiceName )
            // InternalArchitecture.g:1952:3: ruleServiceName
            {
             before(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_9_0_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1961:1: rule__Component__ArgAssignment_9_2_0_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1965:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1966:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1966:2: ( ruleVariable )
            // InternalArchitecture.g:1967:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_0_0_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1976:1: rule__Component__ArgAssignment_9_2_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1980:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1981:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1981:2: ( ruleVariable )
            // InternalArchitecture.g:1982:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_2_1_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:1991:1: rule__Component__ArgAssignment_9_4_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_9_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:1995:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:1996:2: ( ruleVariable )
            {
            // InternalArchitecture.g:1996:2: ( ruleVariable )
            // InternalArchitecture.g:1997:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_9_4_1_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2006:1: rule__Component__ReqAssignment_11 : ( ruleRequiredService ) ;
    public final void rule__Component__ReqAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2010:1: ( ( ruleRequiredService ) )
            // InternalArchitecture.g:2011:2: ( ruleRequiredService )
            {
            // InternalArchitecture.g:2011:2: ( ruleRequiredService )
            // InternalArchitecture.g:2012:3: ruleRequiredService
            {
             before(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_11_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2021:1: rule__Component__BindAssignment_12 : ( ruleBindings ) ;
    public final void rule__Component__BindAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2025:1: ( ( ruleBindings ) )
            // InternalArchitecture.g:2026:2: ( ruleBindings )
            {
            // InternalArchitecture.g:2026:2: ( ruleBindings )
            // InternalArchitecture.g:2027:3: ruleBindings
            {
             before(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleBindings();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_12_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2036:1: rule__InstanceComp__NameAssignment : ( RULE_ID ) ;
    public final void rule__InstanceComp__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2040:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2041:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2041:2: ( RULE_ID )
            // InternalArchitecture.g:2042:3: RULE_ID
            {
             before(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstanceCompAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2051:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2055:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2056:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2056:2: ( RULE_ID )
            // InternalArchitecture.g:2057:3: RULE_ID
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
    // InternalArchitecture.g:2066:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2070:1: ( ( ruleType ) )
            // InternalArchitecture.g:2071:2: ( ruleType )
            {
            // InternalArchitecture.g:2071:2: ( ruleType )
            // InternalArchitecture.g:2072:3: ruleType
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


    // $ANTLR start "rule__Bindings__NameCompAssignment_1"
    // InternalArchitecture.g:2081:1: rule__Bindings__NameCompAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameCompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2085:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2086:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2086:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2087:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0()); 
            // InternalArchitecture.g:2088:3: ( RULE_ID )
            // InternalArchitecture.g:2089:4: RULE_ID
            {
             before(grammarAccess.getBindingsAccess().getNameCompInstanceCompIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getNameCompInstanceCompIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2100:1: rule__Bindings__NameServ1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2104:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2105:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2105:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2106:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0()); 
            // InternalArchitecture.g:2107:3: ( RULE_ID )
            // InternalArchitecture.g:2108:4: RULE_ID
            {
             before(grammarAccess.getBindingsAccess().getNameServ1ServiceNameIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getNameServ1ServiceNameIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Bindings__NameCompAssignment_5"
    // InternalArchitecture.g:2119:1: rule__Bindings__NameCompAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameCompAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2123:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2124:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2124:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2125:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_5_0()); 
            // InternalArchitecture.g:2126:3: ( RULE_ID )
            // InternalArchitecture.g:2127:4: RULE_ID
            {
             before(grammarAccess.getBindingsAccess().getNameCompInstanceCompIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getNameCompInstanceCompIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bindings__NameCompAssignment_5"


    // $ANTLR start "rule__Bindings__NameServ2Assignment_7"
    // InternalArchitecture.g:2138:1: rule__Bindings__NameServ2Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ2Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2142:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2143:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2143:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2144:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0()); 
            // InternalArchitecture.g:2145:3: ( RULE_ID )
            // InternalArchitecture.g:2146:4: RULE_ID
            {
             before(grammarAccess.getBindingsAccess().getNameServ2ServiceNameIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBindingsAccess().getNameServ2ServiceNameIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2157:1: rule__RequiredService__NameVarMethodeAssignment_0 : ( ruleVariable ) ;
    public final void rule__RequiredService__NameVarMethodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2161:1: ( ( ruleVariable ) )
            // InternalArchitecture.g:2162:2: ( ruleVariable )
            {
            // InternalArchitecture.g:2162:2: ( ruleVariable )
            // InternalArchitecture.g:2163:3: ruleVariable
            {
             before(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getRequiredServiceAccess().getNameVarMethodeVariableParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2172:1: rule__RequiredService__NameCompAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2176:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2177:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2177:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2178:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0()); 
            // InternalArchitecture.g:2179:3: ( RULE_ID )
            // InternalArchitecture.g:2180:4: RULE_ID
            {
             before(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2191:1: rule__RequiredService__NameServAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameServAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2195:1: ( ( ( RULE_ID ) ) )
            // InternalArchitecture.g:2196:2: ( ( RULE_ID ) )
            {
            // InternalArchitecture.g:2196:2: ( ( RULE_ID ) )
            // InternalArchitecture.g:2197:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0()); 
            // InternalArchitecture.g:2198:3: ( RULE_ID )
            // InternalArchitecture.g:2199:4: RULE_ID
            {
             before(grammarAccess.getRequiredServiceAccess().getNameServServiceNameIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getNameServServiceNameIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0()); 

            }


            }

        }
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
    // InternalArchitecture.g:2210:1: rule__ServiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ServiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArchitecture.g:2214:1: ( ( RULE_ID ) )
            // InternalArchitecture.g:2215:2: ( RULE_ID )
            {
            // InternalArchitecture.g:2215:2: ( RULE_ID )
            // InternalArchitecture.g:2216:3: RULE_ID
            {
             before(grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceNameAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\1\17\uffff";
    static final String dfa_3s = "\1\17\1\uffff\1\4\1\23\1\4\1\24\1\25\1\4\1\23\1\13\4\26\1\uffff\1\4";
    static final String dfa_4s = "\1\22\1\uffff\1\4\1\23\1\4\1\24\1\25\1\4\1\23\1\16\4\30\1\uffff\1\4";
    static final String dfa_5s = "\1\uffff\1\2\14\uffff\1\1\1\uffff";
    static final String dfa_6s = "\20\uffff}>";
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
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "\1\16\1\uffff\1\17",
            "",
            "\1\10"
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
            return "()* loopback of 427:3: ( rule__AbstractModel__CompAssignment_1 )*";
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