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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Component'", "'Mock'", "'Observator'", "'INT'", "'STRING'", "'Boolean'", "'Double'", "'import'", "'.*'", "'.'", "':'", "'ProvidedServices:'", "'conf('", "')'", "'RequiredServices:'", "','", "'('", "'varModel:'", "'ref'", "'varTest:'", "'bind('", "':='", "';'"
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

                if ( (LA1_0==18) ) {
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


    // $ANTLR start "entryRuleComponent"
    // InternalMappingAssistance.g:178:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:179:1: ( ruleComponent EOF )
            // InternalMappingAssistance.g:180:1: ruleComponent EOF
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
    // InternalMappingAssistance.g:187:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:191:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalMappingAssistance.g:192:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalMappingAssistance.g:192:2: ( ( rule__Component__Group__0 ) )
            // InternalMappingAssistance.g:193:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalMappingAssistance.g:194:3: ( rule__Component__Group__0 )
            // InternalMappingAssistance.g:194:4: rule__Component__Group__0
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
    // InternalMappingAssistance.g:203:1: entryRuleInstanceComp : ruleInstanceComp EOF ;
    public final void entryRuleInstanceComp() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:204:1: ( ruleInstanceComp EOF )
            // InternalMappingAssistance.g:205:1: ruleInstanceComp EOF
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
    // InternalMappingAssistance.g:212:1: ruleInstanceComp : ( ( rule__InstanceComp__NameAssignment ) ) ;
    public final void ruleInstanceComp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:216:2: ( ( ( rule__InstanceComp__NameAssignment ) ) )
            // InternalMappingAssistance.g:217:2: ( ( rule__InstanceComp__NameAssignment ) )
            {
            // InternalMappingAssistance.g:217:2: ( ( rule__InstanceComp__NameAssignment ) )
            // InternalMappingAssistance.g:218:3: ( rule__InstanceComp__NameAssignment )
            {
             before(grammarAccess.getInstanceCompAccess().getNameAssignment()); 
            // InternalMappingAssistance.g:219:3: ( rule__InstanceComp__NameAssignment )
            // InternalMappingAssistance.g:219:4: rule__InstanceComp__NameAssignment
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
    // InternalMappingAssistance.g:228:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:229:1: ( ruleVariable EOF )
            // InternalMappingAssistance.g:230:1: ruleVariable EOF
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
    // InternalMappingAssistance.g:237:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:241:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMappingAssistance.g:242:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMappingAssistance.g:242:2: ( ( rule__Variable__Group__0 ) )
            // InternalMappingAssistance.g:243:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMappingAssistance.g:244:3: ( rule__Variable__Group__0 )
            // InternalMappingAssistance.g:244:4: rule__Variable__Group__0
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


    // $ANTLR start "entryRuleMapping"
    // InternalMappingAssistance.g:253:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:254:1: ( ruleMapping EOF )
            // InternalMappingAssistance.g:255:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMappingAssistance.g:262:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:266:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMappingAssistance.g:267:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMappingAssistance.g:267:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMappingAssistance.g:268:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMappingAssistance.g:269:3: ( rule__Mapping__Group__0 )
            // InternalMappingAssistance.g:269:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleBindings"
    // InternalMappingAssistance.g:278:1: entryRuleBindings : ruleBindings EOF ;
    public final void entryRuleBindings() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:279:1: ( ruleBindings EOF )
            // InternalMappingAssistance.g:280:1: ruleBindings EOF
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
    // InternalMappingAssistance.g:287:1: ruleBindings : ( ( rule__Bindings__Group__0 ) ) ;
    public final void ruleBindings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:291:2: ( ( ( rule__Bindings__Group__0 ) ) )
            // InternalMappingAssistance.g:292:2: ( ( rule__Bindings__Group__0 ) )
            {
            // InternalMappingAssistance.g:292:2: ( ( rule__Bindings__Group__0 ) )
            // InternalMappingAssistance.g:293:3: ( rule__Bindings__Group__0 )
            {
             before(grammarAccess.getBindingsAccess().getGroup()); 
            // InternalMappingAssistance.g:294:3: ( rule__Bindings__Group__0 )
            // InternalMappingAssistance.g:294:4: rule__Bindings__Group__0
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
    // InternalMappingAssistance.g:303:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:304:1: ( ruleRequiredService EOF )
            // InternalMappingAssistance.g:305:1: ruleRequiredService EOF
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
    // InternalMappingAssistance.g:312:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:316:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalMappingAssistance.g:317:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalMappingAssistance.g:317:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalMappingAssistance.g:318:3: ( rule__RequiredService__Group__0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            // InternalMappingAssistance.g:319:3: ( rule__RequiredService__Group__0 )
            // InternalMappingAssistance.g:319:4: rule__RequiredService__Group__0
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
    // InternalMappingAssistance.g:328:1: entryRuleServiceName : ruleServiceName EOF ;
    public final void entryRuleServiceName() throws RecognitionException {
        try {
            // InternalMappingAssistance.g:329:1: ( ruleServiceName EOF )
            // InternalMappingAssistance.g:330:1: ruleServiceName EOF
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
    // InternalMappingAssistance.g:337:1: ruleServiceName : ( ( rule__ServiceName__NameAssignment ) ) ;
    public final void ruleServiceName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:341:2: ( ( ( rule__ServiceName__NameAssignment ) ) )
            // InternalMappingAssistance.g:342:2: ( ( rule__ServiceName__NameAssignment ) )
            {
            // InternalMappingAssistance.g:342:2: ( ( rule__ServiceName__NameAssignment ) )
            // InternalMappingAssistance.g:343:3: ( rule__ServiceName__NameAssignment )
            {
             before(grammarAccess.getServiceNameAccess().getNameAssignment()); 
            // InternalMappingAssistance.g:344:3: ( rule__ServiceName__NameAssignment )
            // InternalMappingAssistance.g:344:4: rule__ServiceName__NameAssignment
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
    // InternalMappingAssistance.g:353:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:357:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMappingAssistance.g:358:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMappingAssistance.g:358:2: ( ( rule__Type__Alternatives ) )
            // InternalMappingAssistance.g:359:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMappingAssistance.g:360:3: ( rule__Type__Alternatives )
            // InternalMappingAssistance.g:360:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__Component__Alternatives_0"
    // InternalMappingAssistance.g:368:1: rule__Component__Alternatives_0 : ( ( 'Component' ) | ( 'Mock' ) | ( 'Observator' ) );
    public final void rule__Component__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:372:1: ( ( 'Component' ) | ( 'Mock' ) | ( 'Observator' ) )
            int alt2=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMappingAssistance.g:373:2: ( 'Component' )
                    {
                    // InternalMappingAssistance.g:373:2: ( 'Component' )
                    // InternalMappingAssistance.g:374:3: 'Component'
                    {
                     before(grammarAccess.getComponentAccess().getComponentKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getComponentKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:379:2: ( 'Mock' )
                    {
                    // InternalMappingAssistance.g:379:2: ( 'Mock' )
                    // InternalMappingAssistance.g:380:3: 'Mock'
                    {
                     before(grammarAccess.getComponentAccess().getMockKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getMockKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:385:2: ( 'Observator' )
                    {
                    // InternalMappingAssistance.g:385:2: ( 'Observator' )
                    // InternalMappingAssistance.g:386:3: 'Observator'
                    {
                     before(grammarAccess.getComponentAccess().getObservatorKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComponentAccess().getObservatorKeyword_0_2()); 

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
    // $ANTLR end "rule__Component__Alternatives_0"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMappingAssistance.g:395:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:399:1: ( ( ( 'INT' ) ) | ( ( 'STRING' ) ) | ( ( 'Boolean' ) ) | ( ( 'Double' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMappingAssistance.g:400:2: ( ( 'INT' ) )
                    {
                    // InternalMappingAssistance.g:400:2: ( ( 'INT' ) )
                    // InternalMappingAssistance.g:401:3: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // InternalMappingAssistance.g:402:3: ( 'INT' )
                    // InternalMappingAssistance.g:402:4: 'INT'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMappingAssistance.g:406:2: ( ( 'STRING' ) )
                    {
                    // InternalMappingAssistance.g:406:2: ( ( 'STRING' ) )
                    // InternalMappingAssistance.g:407:3: ( 'STRING' )
                    {
                     before(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 
                    // InternalMappingAssistance.g:408:3: ( 'STRING' )
                    // InternalMappingAssistance.g:408:4: 'STRING'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getSTRINGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMappingAssistance.g:412:2: ( ( 'Boolean' ) )
                    {
                    // InternalMappingAssistance.g:412:2: ( ( 'Boolean' ) )
                    // InternalMappingAssistance.g:413:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMappingAssistance.g:414:3: ( 'Boolean' )
                    // InternalMappingAssistance.g:414:4: 'Boolean'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMappingAssistance.g:418:2: ( ( 'Double' ) )
                    {
                    // InternalMappingAssistance.g:418:2: ( ( 'Double' ) )
                    // InternalMappingAssistance.g:419:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_3()); 
                    // InternalMappingAssistance.g:420:3: ( 'Double' )
                    // InternalMappingAssistance.g:420:4: 'Double'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalMappingAssistance.g:428:1: rule__AbstractModel__Group__0 : rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 ;
    public final void rule__AbstractModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:432:1: ( rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1 )
            // InternalMappingAssistance.g:433:2: rule__AbstractModel__Group__0__Impl rule__AbstractModel__Group__1
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
    // InternalMappingAssistance.g:440:1: rule__AbstractModel__Group__0__Impl : ( ruleImport ) ;
    public final void rule__AbstractModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:444:1: ( ( ruleImport ) )
            // InternalMappingAssistance.g:445:1: ( ruleImport )
            {
            // InternalMappingAssistance.g:445:1: ( ruleImport )
            // InternalMappingAssistance.g:446:2: ruleImport
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
    // InternalMappingAssistance.g:455:1: rule__AbstractModel__Group__1 : rule__AbstractModel__Group__1__Impl ;
    public final void rule__AbstractModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:459:1: ( rule__AbstractModel__Group__1__Impl )
            // InternalMappingAssistance.g:460:2: rule__AbstractModel__Group__1__Impl
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
    // InternalMappingAssistance.g:466:1: rule__AbstractModel__Group__1__Impl : ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) ;
    public final void rule__AbstractModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:470:1: ( ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) ) )
            // InternalMappingAssistance.g:471:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            {
            // InternalMappingAssistance.g:471:1: ( ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* ) )
            // InternalMappingAssistance.g:472:2: ( ( rule__AbstractModel__CompAssignment_1 ) ) ( ( rule__AbstractModel__CompAssignment_1 )* )
            {
            // InternalMappingAssistance.g:472:2: ( ( rule__AbstractModel__CompAssignment_1 ) )
            // InternalMappingAssistance.g:473:3: ( rule__AbstractModel__CompAssignment_1 )
            {
             before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            // InternalMappingAssistance.g:474:3: ( rule__AbstractModel__CompAssignment_1 )
            // InternalMappingAssistance.g:474:4: rule__AbstractModel__CompAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__AbstractModel__CompAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 

            }

            // InternalMappingAssistance.g:477:2: ( ( rule__AbstractModel__CompAssignment_1 )* )
            // InternalMappingAssistance.g:478:3: ( rule__AbstractModel__CompAssignment_1 )*
            {
             before(grammarAccess.getAbstractModelAccess().getCompAssignment_1()); 
            // InternalMappingAssistance.g:479:3: ( rule__AbstractModel__CompAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=13)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMappingAssistance.g:479:4: rule__AbstractModel__CompAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
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
    // InternalMappingAssistance.g:489:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:493:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMappingAssistance.g:494:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:501:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:505:1: ( ( 'import' ) )
            // InternalMappingAssistance.g:506:1: ( 'import' )
            {
            // InternalMappingAssistance.g:506:1: ( 'import' )
            // InternalMappingAssistance.g:507:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMappingAssistance.g:516:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:520:1: ( rule__Import__Group__1__Impl )
            // InternalMappingAssistance.g:521:2: rule__Import__Group__1__Impl
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
    // InternalMappingAssistance.g:527:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:531:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMappingAssistance.g:532:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMappingAssistance.g:532:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMappingAssistance.g:533:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalMappingAssistance.g:534:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMappingAssistance.g:534:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMappingAssistance.g:543:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:547:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMappingAssistance.g:548:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalMappingAssistance.g:555:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:559:1: ( ( ruleQualifiedName ) )
            // InternalMappingAssistance.g:560:1: ( ruleQualifiedName )
            {
            // InternalMappingAssistance.g:560:1: ( ruleQualifiedName )
            // InternalMappingAssistance.g:561:2: ruleQualifiedName
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
    // InternalMappingAssistance.g:570:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:574:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMappingAssistance.g:575:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalMappingAssistance.g:581:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:585:1: ( ( ( '.*' )? ) )
            // InternalMappingAssistance.g:586:1: ( ( '.*' )? )
            {
            // InternalMappingAssistance.g:586:1: ( ( '.*' )? )
            // InternalMappingAssistance.g:587:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalMappingAssistance.g:588:2: ( '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMappingAssistance.g:588:3: '.*'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalMappingAssistance.g:597:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:601:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMappingAssistance.g:602:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalMappingAssistance.g:609:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:613:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:614:1: ( RULE_ID )
            {
            // InternalMappingAssistance.g:614:1: ( RULE_ID )
            // InternalMappingAssistance.g:615:2: RULE_ID
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
    // InternalMappingAssistance.g:624:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:628:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMappingAssistance.g:629:2: rule__QualifiedName__Group__1__Impl
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
    // InternalMappingAssistance.g:635:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:639:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMappingAssistance.g:640:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMappingAssistance.g:640:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMappingAssistance.g:641:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMappingAssistance.g:642:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMappingAssistance.g:642:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
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
    // InternalMappingAssistance.g:651:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:655:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMappingAssistance.g:656:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:663:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:667:1: ( ( '.' ) )
            // InternalMappingAssistance.g:668:1: ( '.' )
            {
            // InternalMappingAssistance.g:668:1: ( '.' )
            // InternalMappingAssistance.g:669:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMappingAssistance.g:678:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:682:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMappingAssistance.g:683:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalMappingAssistance.g:689:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:693:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:694:1: ( RULE_ID )
            {
            // InternalMappingAssistance.g:694:1: ( RULE_ID )
            // InternalMappingAssistance.g:695:2: RULE_ID
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
    // InternalMappingAssistance.g:705:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:709:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalMappingAssistance.g:710:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMappingAssistance.g:717:1: rule__Component__Group__0__Impl : ( ( rule__Component__Alternatives_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:721:1: ( ( ( rule__Component__Alternatives_0 ) ) )
            // InternalMappingAssistance.g:722:1: ( ( rule__Component__Alternatives_0 ) )
            {
            // InternalMappingAssistance.g:722:1: ( ( rule__Component__Alternatives_0 ) )
            // InternalMappingAssistance.g:723:2: ( rule__Component__Alternatives_0 )
            {
             before(grammarAccess.getComponentAccess().getAlternatives_0()); 
            // InternalMappingAssistance.g:724:2: ( rule__Component__Alternatives_0 )
            // InternalMappingAssistance.g:724:3: rule__Component__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:732:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:736:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalMappingAssistance.g:737:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:744:1: rule__Component__Group__1__Impl : ( ':' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:748:1: ( ( ':' ) )
            // InternalMappingAssistance.g:749:1: ( ':' )
            {
            // InternalMappingAssistance.g:749:1: ( ':' )
            // InternalMappingAssistance.g:750:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:759:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:763:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalMappingAssistance.g:764:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalMappingAssistance.g:771:1: rule__Component__Group__2__Impl : ( ( rule__Component__InstAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:775:1: ( ( ( rule__Component__InstAssignment_2 ) ) )
            // InternalMappingAssistance.g:776:1: ( ( rule__Component__InstAssignment_2 ) )
            {
            // InternalMappingAssistance.g:776:1: ( ( rule__Component__InstAssignment_2 ) )
            // InternalMappingAssistance.g:777:2: ( rule__Component__InstAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getInstAssignment_2()); 
            // InternalMappingAssistance.g:778:2: ( rule__Component__InstAssignment_2 )
            // InternalMappingAssistance.g:778:3: rule__Component__InstAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__InstAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getInstAssignment_2()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:786:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:790:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalMappingAssistance.g:791:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:798:1: rule__Component__Group__3__Impl : ( ':' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:802:1: ( ( ':' ) )
            // InternalMappingAssistance.g:803:1: ( ':' )
            {
            // InternalMappingAssistance.g:803:1: ( ':' )
            // InternalMappingAssistance.g:804:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_3()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:813:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:817:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalMappingAssistance.g:818:2: rule__Component__Group__4__Impl rule__Component__Group__5
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
    // InternalMappingAssistance.g:825:1: rule__Component__Group__4__Impl : ( ( rule__Component__NameAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:829:1: ( ( ( rule__Component__NameAssignment_4 ) ) )
            // InternalMappingAssistance.g:830:1: ( ( rule__Component__NameAssignment_4 ) )
            {
            // InternalMappingAssistance.g:830:1: ( ( rule__Component__NameAssignment_4 ) )
            // InternalMappingAssistance.g:831:2: ( rule__Component__NameAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_4()); 
            // InternalMappingAssistance.g:832:2: ( rule__Component__NameAssignment_4 )
            // InternalMappingAssistance.g:832:3: rule__Component__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_4()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:840:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:844:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalMappingAssistance.g:845:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_12);
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
    // InternalMappingAssistance.g:852:1: rule__Component__Group__5__Impl : ( 'ProvidedServices:' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:856:1: ( ( 'ProvidedServices:' ) )
            // InternalMappingAssistance.g:857:1: ( 'ProvidedServices:' )
            {
            // InternalMappingAssistance.g:857:1: ( 'ProvidedServices:' )
            // InternalMappingAssistance.g:858:2: 'ProvidedServices:'
            {
             before(grammarAccess.getComponentAccess().getProvidedServicesKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getProvidedServicesKeyword_5()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:867:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:871:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalMappingAssistance.g:872:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:879:1: rule__Component__Group__6__Impl : ( 'conf(' ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:883:1: ( ( 'conf(' ) )
            // InternalMappingAssistance.g:884:1: ( 'conf(' )
            {
            // InternalMappingAssistance.g:884:1: ( 'conf(' )
            // InternalMappingAssistance.g:885:2: 'conf('
            {
             before(grammarAccess.getComponentAccess().getConfKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getConfKeyword_6()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:894:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:898:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalMappingAssistance.g:899:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:906:1: rule__Component__Group__7__Impl : ( ( rule__Component__Group_7__0 )* ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:910:1: ( ( ( rule__Component__Group_7__0 )* ) )
            // InternalMappingAssistance.g:911:1: ( ( rule__Component__Group_7__0 )* )
            {
            // InternalMappingAssistance.g:911:1: ( ( rule__Component__Group_7__0 )* )
            // InternalMappingAssistance.g:912:2: ( rule__Component__Group_7__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_7()); 
            // InternalMappingAssistance.g:913:2: ( rule__Component__Group_7__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==21) ) {
                        switch ( input.LA(3) ) {
                        case 14:
                            {
                            int LA7_3 = input.LA(4);

                            if ( (LA7_3==26) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 15:
                            {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4==26) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 16:
                            {
                            int LA7_5 = input.LA(4);

                            if ( (LA7_5==26) ) {
                                alt7=1;
                            }


                            }
                            break;
                        case 17:
                            {
                            int LA7_6 = input.LA(4);

                            if ( (LA7_6==26) ) {
                                alt7=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalMappingAssistance.g:913:3: rule__Component__Group_7__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:921:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:925:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalMappingAssistance.g:926:2: rule__Component__Group__8__Impl rule__Component__Group__9
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
    // InternalMappingAssistance.g:933:1: rule__Component__Group__8__Impl : ( ( rule__Component__Arg1Assignment_8 ) ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:937:1: ( ( ( rule__Component__Arg1Assignment_8 ) ) )
            // InternalMappingAssistance.g:938:1: ( ( rule__Component__Arg1Assignment_8 ) )
            {
            // InternalMappingAssistance.g:938:1: ( ( rule__Component__Arg1Assignment_8 ) )
            // InternalMappingAssistance.g:939:2: ( rule__Component__Arg1Assignment_8 )
            {
             before(grammarAccess.getComponentAccess().getArg1Assignment_8()); 
            // InternalMappingAssistance.g:940:2: ( rule__Component__Arg1Assignment_8 )
            // InternalMappingAssistance.g:940:3: rule__Component__Arg1Assignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Component__Arg1Assignment_8();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArg1Assignment_8()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:948:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:952:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalMappingAssistance.g:953:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_15);
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
    // InternalMappingAssistance.g:960:1: rule__Component__Group__9__Impl : ( ')' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:964:1: ( ( ')' ) )
            // InternalMappingAssistance.g:965:1: ( ')' )
            {
            // InternalMappingAssistance.g:965:1: ( ')' )
            // InternalMappingAssistance.g:966:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_9()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:975:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:979:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalMappingAssistance.g:980:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_15);
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
    // InternalMappingAssistance.g:987:1: rule__Component__Group__10__Impl : ( ( rule__Component__Group_10__0 )* ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:991:1: ( ( ( rule__Component__Group_10__0 )* ) )
            // InternalMappingAssistance.g:992:1: ( ( rule__Component__Group_10__0 )* )
            {
            // InternalMappingAssistance.g:992:1: ( ( rule__Component__Group_10__0 )* )
            // InternalMappingAssistance.g:993:2: ( rule__Component__Group_10__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_10()); 
            // InternalMappingAssistance.g:994:2: ( rule__Component__Group_10__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==27) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalMappingAssistance.g:994:3: rule__Component__Group_10__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_10()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:1002:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1006:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalMappingAssistance.g:1007:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_15);
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
    // InternalMappingAssistance.g:1014:1: rule__Component__Group__11__Impl : ( ( 'RequiredServices:' )? ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1018:1: ( ( ( 'RequiredServices:' )? ) )
            // InternalMappingAssistance.g:1019:1: ( ( 'RequiredServices:' )? )
            {
            // InternalMappingAssistance.g:1019:1: ( ( 'RequiredServices:' )? )
            // InternalMappingAssistance.g:1020:2: ( 'RequiredServices:' )?
            {
             before(grammarAccess.getComponentAccess().getRequiredServicesKeyword_11()); 
            // InternalMappingAssistance.g:1021:2: ( 'RequiredServices:' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMappingAssistance.g:1021:3: 'RequiredServices:'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getRequiredServicesKeyword_11()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:1029:1: rule__Component__Group__12 : rule__Component__Group__12__Impl rule__Component__Group__13 ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1033:1: ( rule__Component__Group__12__Impl rule__Component__Group__13 )
            // InternalMappingAssistance.g:1034:2: rule__Component__Group__12__Impl rule__Component__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__13();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:1041:1: rule__Component__Group__12__Impl : ( ( rule__Component__ReqAssignment_12 )* ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1045:1: ( ( ( rule__Component__ReqAssignment_12 )* ) )
            // InternalMappingAssistance.g:1046:1: ( ( rule__Component__ReqAssignment_12 )* )
            {
            // InternalMappingAssistance.g:1046:1: ( ( rule__Component__ReqAssignment_12 )* )
            // InternalMappingAssistance.g:1047:2: ( rule__Component__ReqAssignment_12 )*
            {
             before(grammarAccess.getComponentAccess().getReqAssignment_12()); 
            // InternalMappingAssistance.g:1048:2: ( rule__Component__ReqAssignment_12 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMappingAssistance.g:1048:3: rule__Component__ReqAssignment_12
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__ReqAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getReqAssignment_12()); 

            }


            }

        }
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
    // InternalMappingAssistance.g:1056:1: rule__Component__Group__13 : rule__Component__Group__13__Impl rule__Component__Group__14 ;
    public final void rule__Component__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1060:1: ( rule__Component__Group__13__Impl rule__Component__Group__14 )
            // InternalMappingAssistance.g:1061:2: rule__Component__Group__13__Impl rule__Component__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__14();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:1068:1: rule__Component__Group__13__Impl : ( ( rule__Component__MapAssignment_13 )* ) ;
    public final void rule__Component__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1072:1: ( ( ( rule__Component__MapAssignment_13 )* ) )
            // InternalMappingAssistance.g:1073:1: ( ( rule__Component__MapAssignment_13 )* )
            {
            // InternalMappingAssistance.g:1073:1: ( ( rule__Component__MapAssignment_13 )* )
            // InternalMappingAssistance.g:1074:2: ( rule__Component__MapAssignment_13 )*
            {
             before(grammarAccess.getComponentAccess().getMapAssignment_13()); 
            // InternalMappingAssistance.g:1075:2: ( rule__Component__MapAssignment_13 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMappingAssistance.g:1075:3: rule__Component__MapAssignment_13
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Component__MapAssignment_13();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getMapAssignment_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Component__Group__14"
    // InternalMappingAssistance.g:1083:1: rule__Component__Group__14 : rule__Component__Group__14__Impl ;
    public final void rule__Component__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1087:1: ( rule__Component__Group__14__Impl )
            // InternalMappingAssistance.g:1088:2: rule__Component__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__14"


    // $ANTLR start "rule__Component__Group__14__Impl"
    // InternalMappingAssistance.g:1094:1: rule__Component__Group__14__Impl : ( ( rule__Component__BindAssignment_14 )* ) ;
    public final void rule__Component__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1098:1: ( ( ( rule__Component__BindAssignment_14 )* ) )
            // InternalMappingAssistance.g:1099:1: ( ( rule__Component__BindAssignment_14 )* )
            {
            // InternalMappingAssistance.g:1099:1: ( ( rule__Component__BindAssignment_14 )* )
            // InternalMappingAssistance.g:1100:2: ( rule__Component__BindAssignment_14 )*
            {
             before(grammarAccess.getComponentAccess().getBindAssignment_14()); 
            // InternalMappingAssistance.g:1101:2: ( rule__Component__BindAssignment_14 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMappingAssistance.g:1101:3: rule__Component__BindAssignment_14
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Component__BindAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getBindAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__14__Impl"


    // $ANTLR start "rule__Component__Group_7__0"
    // InternalMappingAssistance.g:1110:1: rule__Component__Group_7__0 : rule__Component__Group_7__0__Impl rule__Component__Group_7__1 ;
    public final void rule__Component__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1114:1: ( rule__Component__Group_7__0__Impl rule__Component__Group_7__1 )
            // InternalMappingAssistance.g:1115:2: rule__Component__Group_7__0__Impl rule__Component__Group_7__1
            {
            pushFollow(FOLLOW_18);
            rule__Component__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1();

            state._fsp--;


            }

        }
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
    // InternalMappingAssistance.g:1122:1: rule__Component__Group_7__0__Impl : ( ( rule__Component__ArgAssignment_7_0 ) ) ;
    public final void rule__Component__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1126:1: ( ( ( rule__Component__ArgAssignment_7_0 ) ) )
            // InternalMappingAssistance.g:1127:1: ( ( rule__Component__ArgAssignment_7_0 ) )
            {
            // InternalMappingAssistance.g:1127:1: ( ( rule__Component__ArgAssignment_7_0 ) )
            // InternalMappingAssistance.g:1128:2: ( rule__Component__ArgAssignment_7_0 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_7_0()); 
            // InternalMappingAssistance.g:1129:2: ( rule__Component__ArgAssignment_7_0 )
            // InternalMappingAssistance.g:1129:3: rule__Component__ArgAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_7_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Component__Group_7__1"
    // InternalMappingAssistance.g:1137:1: rule__Component__Group_7__1 : rule__Component__Group_7__1__Impl ;
    public final void rule__Component__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1141:1: ( rule__Component__Group_7__1__Impl )
            // InternalMappingAssistance.g:1142:2: rule__Component__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__1"


    // $ANTLR start "rule__Component__Group_7__1__Impl"
    // InternalMappingAssistance.g:1148:1: rule__Component__Group_7__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1152:1: ( ( ',' ) )
            // InternalMappingAssistance.g:1153:1: ( ',' )
            {
            // InternalMappingAssistance.g:1153:1: ( ',' )
            // InternalMappingAssistance.g:1154:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_7_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_7__1__Impl"


    // $ANTLR start "rule__Component__Group_10__0"
    // InternalMappingAssistance.g:1164:1: rule__Component__Group_10__0 : rule__Component__Group_10__0__Impl rule__Component__Group_10__1 ;
    public final void rule__Component__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1168:1: ( rule__Component__Group_10__0__Impl rule__Component__Group_10__1 )
            // InternalMappingAssistance.g:1169:2: rule__Component__Group_10__0__Impl rule__Component__Group_10__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__0"


    // $ANTLR start "rule__Component__Group_10__0__Impl"
    // InternalMappingAssistance.g:1176:1: rule__Component__Group_10__0__Impl : ( ( rule__Component__MethodeAssignment_10_0 ) ) ;
    public final void rule__Component__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1180:1: ( ( ( rule__Component__MethodeAssignment_10_0 ) ) )
            // InternalMappingAssistance.g:1181:1: ( ( rule__Component__MethodeAssignment_10_0 ) )
            {
            // InternalMappingAssistance.g:1181:1: ( ( rule__Component__MethodeAssignment_10_0 ) )
            // InternalMappingAssistance.g:1182:2: ( rule__Component__MethodeAssignment_10_0 )
            {
             before(grammarAccess.getComponentAccess().getMethodeAssignment_10_0()); 
            // InternalMappingAssistance.g:1183:2: ( rule__Component__MethodeAssignment_10_0 )
            // InternalMappingAssistance.g:1183:3: rule__Component__MethodeAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__MethodeAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getMethodeAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__0__Impl"


    // $ANTLR start "rule__Component__Group_10__1"
    // InternalMappingAssistance.g:1191:1: rule__Component__Group_10__1 : rule__Component__Group_10__1__Impl rule__Component__Group_10__2 ;
    public final void rule__Component__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1195:1: ( rule__Component__Group_10__1__Impl rule__Component__Group_10__2 )
            // InternalMappingAssistance.g:1196:2: rule__Component__Group_10__1__Impl rule__Component__Group_10__2
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__1"


    // $ANTLR start "rule__Component__Group_10__1__Impl"
    // InternalMappingAssistance.g:1203:1: rule__Component__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Component__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1207:1: ( ( '(' ) )
            // InternalMappingAssistance.g:1208:1: ( '(' )
            {
            // InternalMappingAssistance.g:1208:1: ( '(' )
            // InternalMappingAssistance.g:1209:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__1__Impl"


    // $ANTLR start "rule__Component__Group_10__2"
    // InternalMappingAssistance.g:1218:1: rule__Component__Group_10__2 : rule__Component__Group_10__2__Impl rule__Component__Group_10__3 ;
    public final void rule__Component__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1222:1: ( rule__Component__Group_10__2__Impl rule__Component__Group_10__3 )
            // InternalMappingAssistance.g:1223:2: rule__Component__Group_10__2__Impl rule__Component__Group_10__3
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__2"


    // $ANTLR start "rule__Component__Group_10__2__Impl"
    // InternalMappingAssistance.g:1230:1: rule__Component__Group_10__2__Impl : ( ( rule__Component__Group_10_2__0 )* ) ;
    public final void rule__Component__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1234:1: ( ( ( rule__Component__Group_10_2__0 )* ) )
            // InternalMappingAssistance.g:1235:1: ( ( rule__Component__Group_10_2__0 )* )
            {
            // InternalMappingAssistance.g:1235:1: ( ( rule__Component__Group_10_2__0 )* )
            // InternalMappingAssistance.g:1236:2: ( rule__Component__Group_10_2__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_10_2()); 
            // InternalMappingAssistance.g:1237:2: ( rule__Component__Group_10_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMappingAssistance.g:1237:3: rule__Component__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__2__Impl"


    // $ANTLR start "rule__Component__Group_10__3"
    // InternalMappingAssistance.g:1245:1: rule__Component__Group_10__3 : rule__Component__Group_10__3__Impl rule__Component__Group_10__4 ;
    public final void rule__Component__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1249:1: ( rule__Component__Group_10__3__Impl rule__Component__Group_10__4 )
            // InternalMappingAssistance.g:1250:2: rule__Component__Group_10__3__Impl rule__Component__Group_10__4
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__3"


    // $ANTLR start "rule__Component__Group_10__3__Impl"
    // InternalMappingAssistance.g:1257:1: rule__Component__Group_10__3__Impl : ( ')' ) ;
    public final void rule__Component__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1261:1: ( ( ')' ) )
            // InternalMappingAssistance.g:1262:1: ( ')' )
            {
            // InternalMappingAssistance.g:1262:1: ( ')' )
            // InternalMappingAssistance.g:1263:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_10_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__3__Impl"


    // $ANTLR start "rule__Component__Group_10__4"
    // InternalMappingAssistance.g:1272:1: rule__Component__Group_10__4 : rule__Component__Group_10__4__Impl ;
    public final void rule__Component__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1276:1: ( rule__Component__Group_10__4__Impl )
            // InternalMappingAssistance.g:1277:2: rule__Component__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__4"


    // $ANTLR start "rule__Component__Group_10__4__Impl"
    // InternalMappingAssistance.g:1283:1: rule__Component__Group_10__4__Impl : ( ( rule__Component__Group_10_4__0 )? ) ;
    public final void rule__Component__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1287:1: ( ( ( rule__Component__Group_10_4__0 )? ) )
            // InternalMappingAssistance.g:1288:1: ( ( rule__Component__Group_10_4__0 )? )
            {
            // InternalMappingAssistance.g:1288:1: ( ( rule__Component__Group_10_4__0 )? )
            // InternalMappingAssistance.g:1289:2: ( rule__Component__Group_10_4__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_10_4()); 
            // InternalMappingAssistance.g:1290:2: ( rule__Component__Group_10_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMappingAssistance.g:1290:3: rule__Component__Group_10_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_10_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__4__Impl"


    // $ANTLR start "rule__Component__Group_10_2__0"
    // InternalMappingAssistance.g:1299:1: rule__Component__Group_10_2__0 : rule__Component__Group_10_2__0__Impl rule__Component__Group_10_2__1 ;
    public final void rule__Component__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1303:1: ( rule__Component__Group_10_2__0__Impl rule__Component__Group_10_2__1 )
            // InternalMappingAssistance.g:1304:2: rule__Component__Group_10_2__0__Impl rule__Component__Group_10_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2__0"


    // $ANTLR start "rule__Component__Group_10_2__0__Impl"
    // InternalMappingAssistance.g:1311:1: rule__Component__Group_10_2__0__Impl : ( ( rule__Component__Group_10_2_0__0 )* ) ;
    public final void rule__Component__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1315:1: ( ( ( rule__Component__Group_10_2_0__0 )* ) )
            // InternalMappingAssistance.g:1316:1: ( ( rule__Component__Group_10_2_0__0 )* )
            {
            // InternalMappingAssistance.g:1316:1: ( ( rule__Component__Group_10_2_0__0 )* )
            // InternalMappingAssistance.g:1317:2: ( rule__Component__Group_10_2_0__0 )*
            {
             before(grammarAccess.getComponentAccess().getGroup_10_2_0()); 
            // InternalMappingAssistance.g:1318:2: ( rule__Component__Group_10_2_0__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==21) ) {
                        switch ( input.LA(3) ) {
                        case 14:
                            {
                            int LA15_3 = input.LA(4);

                            if ( (LA15_3==26) ) {
                                alt15=1;
                            }


                            }
                            break;
                        case 15:
                            {
                            int LA15_4 = input.LA(4);

                            if ( (LA15_4==26) ) {
                                alt15=1;
                            }


                            }
                            break;
                        case 16:
                            {
                            int LA15_5 = input.LA(4);

                            if ( (LA15_5==26) ) {
                                alt15=1;
                            }


                            }
                            break;
                        case 17:
                            {
                            int LA15_6 = input.LA(4);

                            if ( (LA15_6==26) ) {
                                alt15=1;
                            }


                            }
                            break;

                        }

                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalMappingAssistance.g:1318:3: rule__Component__Group_10_2_0__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Component__Group_10_2_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getGroup_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2__0__Impl"


    // $ANTLR start "rule__Component__Group_10_2__1"
    // InternalMappingAssistance.g:1326:1: rule__Component__Group_10_2__1 : rule__Component__Group_10_2__1__Impl ;
    public final void rule__Component__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1330:1: ( rule__Component__Group_10_2__1__Impl )
            // InternalMappingAssistance.g:1331:2: rule__Component__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2__1"


    // $ANTLR start "rule__Component__Group_10_2__1__Impl"
    // InternalMappingAssistance.g:1337:1: rule__Component__Group_10_2__1__Impl : ( ( rule__Component__ArgAssignment_10_2_1 ) ) ;
    public final void rule__Component__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1341:1: ( ( ( rule__Component__ArgAssignment_10_2_1 ) ) )
            // InternalMappingAssistance.g:1342:1: ( ( rule__Component__ArgAssignment_10_2_1 ) )
            {
            // InternalMappingAssistance.g:1342:1: ( ( rule__Component__ArgAssignment_10_2_1 ) )
            // InternalMappingAssistance.g:1343:2: ( rule__Component__ArgAssignment_10_2_1 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_10_2_1()); 
            // InternalMappingAssistance.g:1344:2: ( rule__Component__ArgAssignment_10_2_1 )
            // InternalMappingAssistance.g:1344:3: rule__Component__ArgAssignment_10_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2__1__Impl"


    // $ANTLR start "rule__Component__Group_10_2_0__0"
    // InternalMappingAssistance.g:1353:1: rule__Component__Group_10_2_0__0 : rule__Component__Group_10_2_0__0__Impl rule__Component__Group_10_2_0__1 ;
    public final void rule__Component__Group_10_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1357:1: ( rule__Component__Group_10_2_0__0__Impl rule__Component__Group_10_2_0__1 )
            // InternalMappingAssistance.g:1358:2: rule__Component__Group_10_2_0__0__Impl rule__Component__Group_10_2_0__1
            {
            pushFollow(FOLLOW_18);
            rule__Component__Group_10_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2_0__0"


    // $ANTLR start "rule__Component__Group_10_2_0__0__Impl"
    // InternalMappingAssistance.g:1365:1: rule__Component__Group_10_2_0__0__Impl : ( ( rule__Component__ArgAssignment_10_2_0_0 ) ) ;
    public final void rule__Component__Group_10_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1369:1: ( ( ( rule__Component__ArgAssignment_10_2_0_0 ) ) )
            // InternalMappingAssistance.g:1370:1: ( ( rule__Component__ArgAssignment_10_2_0_0 ) )
            {
            // InternalMappingAssistance.g:1370:1: ( ( rule__Component__ArgAssignment_10_2_0_0 ) )
            // InternalMappingAssistance.g:1371:2: ( rule__Component__ArgAssignment_10_2_0_0 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_10_2_0_0()); 
            // InternalMappingAssistance.g:1372:2: ( rule__Component__ArgAssignment_10_2_0_0 )
            // InternalMappingAssistance.g:1372:3: rule__Component__ArgAssignment_10_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_10_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_10_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2_0__0__Impl"


    // $ANTLR start "rule__Component__Group_10_2_0__1"
    // InternalMappingAssistance.g:1380:1: rule__Component__Group_10_2_0__1 : rule__Component__Group_10_2_0__1__Impl ;
    public final void rule__Component__Group_10_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1384:1: ( rule__Component__Group_10_2_0__1__Impl )
            // InternalMappingAssistance.g:1385:2: rule__Component__Group_10_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_10_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2_0__1"


    // $ANTLR start "rule__Component__Group_10_2_0__1__Impl"
    // InternalMappingAssistance.g:1391:1: rule__Component__Group_10_2_0__1__Impl : ( ',' ) ;
    public final void rule__Component__Group_10_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1395:1: ( ( ',' ) )
            // InternalMappingAssistance.g:1396:1: ( ',' )
            {
            // InternalMappingAssistance.g:1396:1: ( ',' )
            // InternalMappingAssistance.g:1397:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_10_2_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_10_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_2_0__1__Impl"


    // $ANTLR start "rule__Component__Group_10_4__0"
    // InternalMappingAssistance.g:1407:1: rule__Component__Group_10_4__0 : rule__Component__Group_10_4__0__Impl rule__Component__Group_10_4__1 ;
    public final void rule__Component__Group_10_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1411:1: ( rule__Component__Group_10_4__0__Impl rule__Component__Group_10_4__1 )
            // InternalMappingAssistance.g:1412:2: rule__Component__Group_10_4__0__Impl rule__Component__Group_10_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group_10_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_4__0"


    // $ANTLR start "rule__Component__Group_10_4__0__Impl"
    // InternalMappingAssistance.g:1419:1: rule__Component__Group_10_4__0__Impl : ( ':' ) ;
    public final void rule__Component__Group_10_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1423:1: ( ( ':' ) )
            // InternalMappingAssistance.g:1424:1: ( ':' )
            {
            // InternalMappingAssistance.g:1424:1: ( ':' )
            // InternalMappingAssistance.g:1425:2: ':'
            {
             before(grammarAccess.getComponentAccess().getColonKeyword_10_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getColonKeyword_10_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_4__0__Impl"


    // $ANTLR start "rule__Component__Group_10_4__1"
    // InternalMappingAssistance.g:1434:1: rule__Component__Group_10_4__1 : rule__Component__Group_10_4__1__Impl ;
    public final void rule__Component__Group_10_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1438:1: ( rule__Component__Group_10_4__1__Impl )
            // InternalMappingAssistance.g:1439:2: rule__Component__Group_10_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_10_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_4__1"


    // $ANTLR start "rule__Component__Group_10_4__1__Impl"
    // InternalMappingAssistance.g:1445:1: rule__Component__Group_10_4__1__Impl : ( ( rule__Component__ArgAssignment_10_4_1 ) ) ;
    public final void rule__Component__Group_10_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1449:1: ( ( ( rule__Component__ArgAssignment_10_4_1 ) ) )
            // InternalMappingAssistance.g:1450:1: ( ( rule__Component__ArgAssignment_10_4_1 ) )
            {
            // InternalMappingAssistance.g:1450:1: ( ( rule__Component__ArgAssignment_10_4_1 ) )
            // InternalMappingAssistance.g:1451:2: ( rule__Component__ArgAssignment_10_4_1 )
            {
             before(grammarAccess.getComponentAccess().getArgAssignment_10_4_1()); 
            // InternalMappingAssistance.g:1452:2: ( rule__Component__ArgAssignment_10_4_1 )
            // InternalMappingAssistance.g:1452:3: rule__Component__ArgAssignment_10_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__ArgAssignment_10_4_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getArgAssignment_10_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10_4__1__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMappingAssistance.g:1461:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1465:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMappingAssistance.g:1466:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMappingAssistance.g:1473:1: rule__Variable__Group__0__Impl : ( ( rule__Variable__NameAssignment_0 ) ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1477:1: ( ( ( rule__Variable__NameAssignment_0 ) ) )
            // InternalMappingAssistance.g:1478:1: ( ( rule__Variable__NameAssignment_0 ) )
            {
            // InternalMappingAssistance.g:1478:1: ( ( rule__Variable__NameAssignment_0 ) )
            // InternalMappingAssistance.g:1479:2: ( rule__Variable__NameAssignment_0 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_0()); 
            // InternalMappingAssistance.g:1480:2: ( rule__Variable__NameAssignment_0 )
            // InternalMappingAssistance.g:1480:3: rule__Variable__NameAssignment_0
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
    // InternalMappingAssistance.g:1488:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1492:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMappingAssistance.g:1493:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalMappingAssistance.g:1500:1: rule__Variable__Group__1__Impl : ( ':' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1504:1: ( ( ':' ) )
            // InternalMappingAssistance.g:1505:1: ( ':' )
            {
            // InternalMappingAssistance.g:1505:1: ( ':' )
            // InternalMappingAssistance.g:1506:2: ':'
            {
             before(grammarAccess.getVariableAccess().getColonKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMappingAssistance.g:1515:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1519:1: ( rule__Variable__Group__2__Impl )
            // InternalMappingAssistance.g:1520:2: rule__Variable__Group__2__Impl
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
    // InternalMappingAssistance.g:1526:1: rule__Variable__Group__2__Impl : ( ( rule__Variable__TypeAssignment_2 ) ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1530:1: ( ( ( rule__Variable__TypeAssignment_2 ) ) )
            // InternalMappingAssistance.g:1531:1: ( ( rule__Variable__TypeAssignment_2 ) )
            {
            // InternalMappingAssistance.g:1531:1: ( ( rule__Variable__TypeAssignment_2 ) )
            // InternalMappingAssistance.g:1532:2: ( rule__Variable__TypeAssignment_2 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_2()); 
            // InternalMappingAssistance.g:1533:2: ( rule__Variable__TypeAssignment_2 )
            // InternalMappingAssistance.g:1533:3: rule__Variable__TypeAssignment_2
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


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalMappingAssistance.g:1542:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1546:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMappingAssistance.g:1547:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalMappingAssistance.g:1554:1: rule__Mapping__Group__0__Impl : ( 'varModel:' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1558:1: ( ( 'varModel:' ) )
            // InternalMappingAssistance.g:1559:1: ( 'varModel:' )
            {
            // InternalMappingAssistance.g:1559:1: ( 'varModel:' )
            // InternalMappingAssistance.g:1560:2: 'varModel:'
            {
             before(grammarAccess.getMappingAccess().getVarModelKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getVarModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalMappingAssistance.g:1569:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1573:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMappingAssistance.g:1574:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalMappingAssistance.g:1581:1: rule__Mapping__Group__1__Impl : ( ( rule__Mapping__NameVarModeAssignment_1 ) ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1585:1: ( ( ( rule__Mapping__NameVarModeAssignment_1 ) ) )
            // InternalMappingAssistance.g:1586:1: ( ( rule__Mapping__NameVarModeAssignment_1 ) )
            {
            // InternalMappingAssistance.g:1586:1: ( ( rule__Mapping__NameVarModeAssignment_1 ) )
            // InternalMappingAssistance.g:1587:2: ( rule__Mapping__NameVarModeAssignment_1 )
            {
             before(grammarAccess.getMappingAccess().getNameVarModeAssignment_1()); 
            // InternalMappingAssistance.g:1588:2: ( rule__Mapping__NameVarModeAssignment_1 )
            // InternalMappingAssistance.g:1588:3: rule__Mapping__NameVarModeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__NameVarModeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameVarModeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalMappingAssistance.g:1596:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1600:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMappingAssistance.g:1601:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalMappingAssistance.g:1608:1: rule__Mapping__Group__2__Impl : ( 'ref' ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1612:1: ( ( 'ref' ) )
            // InternalMappingAssistance.g:1613:1: ( 'ref' )
            {
            // InternalMappingAssistance.g:1613:1: ( 'ref' )
            // InternalMappingAssistance.g:1614:2: 'ref'
            {
             before(grammarAccess.getMappingAccess().getRefKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRefKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // InternalMappingAssistance.g:1623:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1627:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMappingAssistance.g:1628:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // InternalMappingAssistance.g:1635:1: rule__Mapping__Group__3__Impl : ( 'varTest:' ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1639:1: ( ( 'varTest:' ) )
            // InternalMappingAssistance.g:1640:1: ( 'varTest:' )
            {
            // InternalMappingAssistance.g:1640:1: ( 'varTest:' )
            // InternalMappingAssistance.g:1641:2: 'varTest:'
            {
             before(grammarAccess.getMappingAccess().getVarTestKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getVarTestKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // InternalMappingAssistance.g:1650:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1654:1: ( rule__Mapping__Group__4__Impl )
            // InternalMappingAssistance.g:1655:2: rule__Mapping__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // InternalMappingAssistance.g:1661:1: rule__Mapping__Group__4__Impl : ( ( rule__Mapping__NameVarTestAssignment_4 ) ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1665:1: ( ( ( rule__Mapping__NameVarTestAssignment_4 ) ) )
            // InternalMappingAssistance.g:1666:1: ( ( rule__Mapping__NameVarTestAssignment_4 ) )
            {
            // InternalMappingAssistance.g:1666:1: ( ( rule__Mapping__NameVarTestAssignment_4 ) )
            // InternalMappingAssistance.g:1667:2: ( rule__Mapping__NameVarTestAssignment_4 )
            {
             before(grammarAccess.getMappingAccess().getNameVarTestAssignment_4()); 
            // InternalMappingAssistance.g:1668:2: ( rule__Mapping__NameVarTestAssignment_4 )
            // InternalMappingAssistance.g:1668:3: rule__Mapping__NameVarTestAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__NameVarTestAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getNameVarTestAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Bindings__Group__0"
    // InternalMappingAssistance.g:1677:1: rule__Bindings__Group__0 : rule__Bindings__Group__0__Impl rule__Bindings__Group__1 ;
    public final void rule__Bindings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1681:1: ( rule__Bindings__Group__0__Impl rule__Bindings__Group__1 )
            // InternalMappingAssistance.g:1682:2: rule__Bindings__Group__0__Impl rule__Bindings__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:1689:1: rule__Bindings__Group__0__Impl : ( 'bind(' ) ;
    public final void rule__Bindings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1693:1: ( ( 'bind(' ) )
            // InternalMappingAssistance.g:1694:1: ( 'bind(' )
            {
            // InternalMappingAssistance.g:1694:1: ( 'bind(' )
            // InternalMappingAssistance.g:1695:2: 'bind('
            {
             before(grammarAccess.getBindingsAccess().getBindKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMappingAssistance.g:1704:1: rule__Bindings__Group__1 : rule__Bindings__Group__1__Impl rule__Bindings__Group__2 ;
    public final void rule__Bindings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1708:1: ( rule__Bindings__Group__1__Impl rule__Bindings__Group__2 )
            // InternalMappingAssistance.g:1709:2: rule__Bindings__Group__1__Impl rule__Bindings__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:1716:1: rule__Bindings__Group__1__Impl : ( ( rule__Bindings__NameCompAssignment_1 ) ) ;
    public final void rule__Bindings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1720:1: ( ( ( rule__Bindings__NameCompAssignment_1 ) ) )
            // InternalMappingAssistance.g:1721:1: ( ( rule__Bindings__NameCompAssignment_1 ) )
            {
            // InternalMappingAssistance.g:1721:1: ( ( rule__Bindings__NameCompAssignment_1 ) )
            // InternalMappingAssistance.g:1722:2: ( rule__Bindings__NameCompAssignment_1 )
            {
             before(grammarAccess.getBindingsAccess().getNameCompAssignment_1()); 
            // InternalMappingAssistance.g:1723:2: ( rule__Bindings__NameCompAssignment_1 )
            // InternalMappingAssistance.g:1723:3: rule__Bindings__NameCompAssignment_1
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
    // InternalMappingAssistance.g:1731:1: rule__Bindings__Group__2 : rule__Bindings__Group__2__Impl rule__Bindings__Group__3 ;
    public final void rule__Bindings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1735:1: ( rule__Bindings__Group__2__Impl rule__Bindings__Group__3 )
            // InternalMappingAssistance.g:1736:2: rule__Bindings__Group__2__Impl rule__Bindings__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:1743:1: rule__Bindings__Group__2__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1747:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1748:1: ( '.' )
            {
            // InternalMappingAssistance.g:1748:1: ( '.' )
            // InternalMappingAssistance.g:1749:2: '.'
            {
             before(grammarAccess.getBindingsAccess().getFullStopKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMappingAssistance.g:1758:1: rule__Bindings__Group__3 : rule__Bindings__Group__3__Impl rule__Bindings__Group__4 ;
    public final void rule__Bindings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1762:1: ( rule__Bindings__Group__3__Impl rule__Bindings__Group__4 )
            // InternalMappingAssistance.g:1763:2: rule__Bindings__Group__3__Impl rule__Bindings__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalMappingAssistance.g:1770:1: rule__Bindings__Group__3__Impl : ( ( rule__Bindings__NameServ1Assignment_3 ) ) ;
    public final void rule__Bindings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1774:1: ( ( ( rule__Bindings__NameServ1Assignment_3 ) ) )
            // InternalMappingAssistance.g:1775:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            {
            // InternalMappingAssistance.g:1775:1: ( ( rule__Bindings__NameServ1Assignment_3 ) )
            // InternalMappingAssistance.g:1776:2: ( rule__Bindings__NameServ1Assignment_3 )
            {
             before(grammarAccess.getBindingsAccess().getNameServ1Assignment_3()); 
            // InternalMappingAssistance.g:1777:2: ( rule__Bindings__NameServ1Assignment_3 )
            // InternalMappingAssistance.g:1777:3: rule__Bindings__NameServ1Assignment_3
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
    // InternalMappingAssistance.g:1785:1: rule__Bindings__Group__4 : rule__Bindings__Group__4__Impl rule__Bindings__Group__5 ;
    public final void rule__Bindings__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1789:1: ( rule__Bindings__Group__4__Impl rule__Bindings__Group__5 )
            // InternalMappingAssistance.g:1790:2: rule__Bindings__Group__4__Impl rule__Bindings__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:1797:1: rule__Bindings__Group__4__Impl : ( ',' ) ;
    public final void rule__Bindings__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1801:1: ( ( ',' ) )
            // InternalMappingAssistance.g:1802:1: ( ',' )
            {
            // InternalMappingAssistance.g:1802:1: ( ',' )
            // InternalMappingAssistance.g:1803:2: ','
            {
             before(grammarAccess.getBindingsAccess().getCommaKeyword_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMappingAssistance.g:1812:1: rule__Bindings__Group__5 : rule__Bindings__Group__5__Impl rule__Bindings__Group__6 ;
    public final void rule__Bindings__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1816:1: ( rule__Bindings__Group__5__Impl rule__Bindings__Group__6 )
            // InternalMappingAssistance.g:1817:2: rule__Bindings__Group__5__Impl rule__Bindings__Group__6
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:1824:1: rule__Bindings__Group__5__Impl : ( ( rule__Bindings__NameCompAssignment_5 ) ) ;
    public final void rule__Bindings__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1828:1: ( ( ( rule__Bindings__NameCompAssignment_5 ) ) )
            // InternalMappingAssistance.g:1829:1: ( ( rule__Bindings__NameCompAssignment_5 ) )
            {
            // InternalMappingAssistance.g:1829:1: ( ( rule__Bindings__NameCompAssignment_5 ) )
            // InternalMappingAssistance.g:1830:2: ( rule__Bindings__NameCompAssignment_5 )
            {
             before(grammarAccess.getBindingsAccess().getNameCompAssignment_5()); 
            // InternalMappingAssistance.g:1831:2: ( rule__Bindings__NameCompAssignment_5 )
            // InternalMappingAssistance.g:1831:3: rule__Bindings__NameCompAssignment_5
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
    // InternalMappingAssistance.g:1839:1: rule__Bindings__Group__6 : rule__Bindings__Group__6__Impl rule__Bindings__Group__7 ;
    public final void rule__Bindings__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1843:1: ( rule__Bindings__Group__6__Impl rule__Bindings__Group__7 )
            // InternalMappingAssistance.g:1844:2: rule__Bindings__Group__6__Impl rule__Bindings__Group__7
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:1851:1: rule__Bindings__Group__6__Impl : ( '.' ) ;
    public final void rule__Bindings__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1855:1: ( ( '.' ) )
            // InternalMappingAssistance.g:1856:1: ( '.' )
            {
            // InternalMappingAssistance.g:1856:1: ( '.' )
            // InternalMappingAssistance.g:1857:2: '.'
            {
             before(grammarAccess.getBindingsAccess().getFullStopKeyword_6()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMappingAssistance.g:1866:1: rule__Bindings__Group__7 : rule__Bindings__Group__7__Impl rule__Bindings__Group__8 ;
    public final void rule__Bindings__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1870:1: ( rule__Bindings__Group__7__Impl rule__Bindings__Group__8 )
            // InternalMappingAssistance.g:1871:2: rule__Bindings__Group__7__Impl rule__Bindings__Group__8
            {
            pushFollow(FOLLOW_14);
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
    // InternalMappingAssistance.g:1878:1: rule__Bindings__Group__7__Impl : ( ( rule__Bindings__NameServ2Assignment_7 ) ) ;
    public final void rule__Bindings__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1882:1: ( ( ( rule__Bindings__NameServ2Assignment_7 ) ) )
            // InternalMappingAssistance.g:1883:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            {
            // InternalMappingAssistance.g:1883:1: ( ( rule__Bindings__NameServ2Assignment_7 ) )
            // InternalMappingAssistance.g:1884:2: ( rule__Bindings__NameServ2Assignment_7 )
            {
             before(grammarAccess.getBindingsAccess().getNameServ2Assignment_7()); 
            // InternalMappingAssistance.g:1885:2: ( rule__Bindings__NameServ2Assignment_7 )
            // InternalMappingAssistance.g:1885:3: rule__Bindings__NameServ2Assignment_7
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
    // InternalMappingAssistance.g:1893:1: rule__Bindings__Group__8 : rule__Bindings__Group__8__Impl ;
    public final void rule__Bindings__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1897:1: ( rule__Bindings__Group__8__Impl )
            // InternalMappingAssistance.g:1898:2: rule__Bindings__Group__8__Impl
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
    // InternalMappingAssistance.g:1904:1: rule__Bindings__Group__8__Impl : ( ')' ) ;
    public final void rule__Bindings__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1908:1: ( ( ')' ) )
            // InternalMappingAssistance.g:1909:1: ( ')' )
            {
            // InternalMappingAssistance.g:1909:1: ( ')' )
            // InternalMappingAssistance.g:1910:2: ')'
            {
             before(grammarAccess.getBindingsAccess().getRightParenthesisKeyword_8()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMappingAssistance.g:1920:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1924:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalMappingAssistance.g:1925:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMappingAssistance.g:1932:1: rule__RequiredService__Group__0__Impl : ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1936:1: ( ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) ) )
            // InternalMappingAssistance.g:1937:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            {
            // InternalMappingAssistance.g:1937:1: ( ( rule__RequiredService__NameVarMethodeAssignment_0 ) )
            // InternalMappingAssistance.g:1938:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameVarMethodeAssignment_0()); 
            // InternalMappingAssistance.g:1939:2: ( rule__RequiredService__NameVarMethodeAssignment_0 )
            // InternalMappingAssistance.g:1939:3: rule__RequiredService__NameVarMethodeAssignment_0
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
    // InternalMappingAssistance.g:1947:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1951:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalMappingAssistance.g:1952:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:1959:1: rule__RequiredService__Group__1__Impl : ( ':=' ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1963:1: ( ( ':=' ) )
            // InternalMappingAssistance.g:1964:1: ( ':=' )
            {
            // InternalMappingAssistance.g:1964:1: ( ':=' )
            // InternalMappingAssistance.g:1965:2: ':='
            {
             before(grammarAccess.getRequiredServiceAccess().getColonEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMappingAssistance.g:1974:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1978:1: ( rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3 )
            // InternalMappingAssistance.g:1979:2: rule__RequiredService__Group__2__Impl rule__RequiredService__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalMappingAssistance.g:1986:1: rule__RequiredService__Group__2__Impl : ( ( rule__RequiredService__NameCompAssignment_2 ) ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:1990:1: ( ( ( rule__RequiredService__NameCompAssignment_2 ) ) )
            // InternalMappingAssistance.g:1991:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            {
            // InternalMappingAssistance.g:1991:1: ( ( rule__RequiredService__NameCompAssignment_2 ) )
            // InternalMappingAssistance.g:1992:2: ( rule__RequiredService__NameCompAssignment_2 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameCompAssignment_2()); 
            // InternalMappingAssistance.g:1993:2: ( rule__RequiredService__NameCompAssignment_2 )
            // InternalMappingAssistance.g:1993:3: rule__RequiredService__NameCompAssignment_2
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
    // InternalMappingAssistance.g:2001:1: rule__RequiredService__Group__3 : rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 ;
    public final void rule__RequiredService__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2005:1: ( rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4 )
            // InternalMappingAssistance.g:2006:2: rule__RequiredService__Group__3__Impl rule__RequiredService__Group__4
            {
            pushFollow(FOLLOW_6);
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
    // InternalMappingAssistance.g:2013:1: rule__RequiredService__Group__3__Impl : ( '.' ) ;
    public final void rule__RequiredService__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2017:1: ( ( '.' ) )
            // InternalMappingAssistance.g:2018:1: ( '.' )
            {
            // InternalMappingAssistance.g:2018:1: ( '.' )
            // InternalMappingAssistance.g:2019:2: '.'
            {
             before(grammarAccess.getRequiredServiceAccess().getFullStopKeyword_3()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMappingAssistance.g:2028:1: rule__RequiredService__Group__4 : rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 ;
    public final void rule__RequiredService__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2032:1: ( rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5 )
            // InternalMappingAssistance.g:2033:2: rule__RequiredService__Group__4__Impl rule__RequiredService__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalMappingAssistance.g:2040:1: rule__RequiredService__Group__4__Impl : ( ( rule__RequiredService__NameServAssignment_4 ) ) ;
    public final void rule__RequiredService__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2044:1: ( ( ( rule__RequiredService__NameServAssignment_4 ) ) )
            // InternalMappingAssistance.g:2045:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            {
            // InternalMappingAssistance.g:2045:1: ( ( rule__RequiredService__NameServAssignment_4 ) )
            // InternalMappingAssistance.g:2046:2: ( rule__RequiredService__NameServAssignment_4 )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameServAssignment_4()); 
            // InternalMappingAssistance.g:2047:2: ( rule__RequiredService__NameServAssignment_4 )
            // InternalMappingAssistance.g:2047:3: rule__RequiredService__NameServAssignment_4
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
    // InternalMappingAssistance.g:2055:1: rule__RequiredService__Group__5 : rule__RequiredService__Group__5__Impl ;
    public final void rule__RequiredService__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2059:1: ( rule__RequiredService__Group__5__Impl )
            // InternalMappingAssistance.g:2060:2: rule__RequiredService__Group__5__Impl
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
    // InternalMappingAssistance.g:2066:1: rule__RequiredService__Group__5__Impl : ( ';' ) ;
    public final void rule__RequiredService__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2070:1: ( ( ';' ) )
            // InternalMappingAssistance.g:2071:1: ( ';' )
            {
            // InternalMappingAssistance.g:2071:1: ( ';' )
            // InternalMappingAssistance.g:2072:2: ';'
            {
             before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_5()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMappingAssistance.g:2082:1: rule__Model__FunctionAssignment : ( ruleAbstractModel ) ;
    public final void rule__Model__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2086:1: ( ( ruleAbstractModel ) )
            // InternalMappingAssistance.g:2087:2: ( ruleAbstractModel )
            {
            // InternalMappingAssistance.g:2087:2: ( ruleAbstractModel )
            // InternalMappingAssistance.g:2088:3: ruleAbstractModel
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
    // InternalMappingAssistance.g:2097:1: rule__AbstractModel__CompAssignment_1 : ( ruleComponent ) ;
    public final void rule__AbstractModel__CompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2101:1: ( ( ruleComponent ) )
            // InternalMappingAssistance.g:2102:2: ( ruleComponent )
            {
            // InternalMappingAssistance.g:2102:2: ( ruleComponent )
            // InternalMappingAssistance.g:2103:3: ruleComponent
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
    // InternalMappingAssistance.g:2112:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2116:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMappingAssistance.g:2117:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMappingAssistance.g:2117:2: ( ruleQualifiedNameWithWildcard )
            // InternalMappingAssistance.g:2118:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Component__InstAssignment_2"
    // InternalMappingAssistance.g:2127:1: rule__Component__InstAssignment_2 : ( ruleInstanceComp ) ;
    public final void rule__Component__InstAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2131:1: ( ( ruleInstanceComp ) )
            // InternalMappingAssistance.g:2132:2: ( ruleInstanceComp )
            {
            // InternalMappingAssistance.g:2132:2: ( ruleInstanceComp )
            // InternalMappingAssistance.g:2133:3: ruleInstanceComp
            {
             before(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInstanceComp();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getInstInstanceCompParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__InstAssignment_2"


    // $ANTLR start "rule__Component__NameAssignment_4"
    // InternalMappingAssistance.g:2142:1: rule__Component__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2146:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2147:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:2147:2: ( RULE_ID )
            // InternalMappingAssistance.g:2148:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__NameAssignment_4"


    // $ANTLR start "rule__Component__ArgAssignment_7_0"
    // InternalMappingAssistance.g:2157:1: rule__Component__ArgAssignment_7_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2161:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:2162:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:2162:2: ( ruleVariable )
            // InternalMappingAssistance.g:2163:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ArgAssignment_7_0"


    // $ANTLR start "rule__Component__Arg1Assignment_8"
    // InternalMappingAssistance.g:2172:1: rule__Component__Arg1Assignment_8 : ( ruleVariable ) ;
    public final void rule__Component__Arg1Assignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2176:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:2177:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:2177:2: ( ruleVariable )
            // InternalMappingAssistance.g:2178:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArg1VariableParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Arg1Assignment_8"


    // $ANTLR start "rule__Component__MethodeAssignment_10_0"
    // InternalMappingAssistance.g:2187:1: rule__Component__MethodeAssignment_10_0 : ( ruleServiceName ) ;
    public final void rule__Component__MethodeAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2191:1: ( ( ruleServiceName ) )
            // InternalMappingAssistance.g:2192:2: ( ruleServiceName )
            {
            // InternalMappingAssistance.g:2192:2: ( ruleServiceName )
            // InternalMappingAssistance.g:2193:3: ruleServiceName
            {
             before(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceName();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMethodeServiceNameParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__MethodeAssignment_10_0"


    // $ANTLR start "rule__Component__ArgAssignment_10_2_0_0"
    // InternalMappingAssistance.g:2202:1: rule__Component__ArgAssignment_10_2_0_0 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_10_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2206:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:2207:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:2207:2: ( ruleVariable )
            // InternalMappingAssistance.g:2208:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ArgAssignment_10_2_0_0"


    // $ANTLR start "rule__Component__ArgAssignment_10_2_1"
    // InternalMappingAssistance.g:2217:1: rule__Component__ArgAssignment_10_2_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2221:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:2222:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:2222:2: ( ruleVariable )
            // InternalMappingAssistance.g:2223:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ArgAssignment_10_2_1"


    // $ANTLR start "rule__Component__ArgAssignment_10_4_1"
    // InternalMappingAssistance.g:2232:1: rule__Component__ArgAssignment_10_4_1 : ( ruleVariable ) ;
    public final void rule__Component__ArgAssignment_10_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2236:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:2237:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:2237:2: ( ruleVariable )
            // InternalMappingAssistance.g:2238:3: ruleVariable
            {
             before(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getArgVariableParserRuleCall_10_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ArgAssignment_10_4_1"


    // $ANTLR start "rule__Component__ReqAssignment_12"
    // InternalMappingAssistance.g:2247:1: rule__Component__ReqAssignment_12 : ( ruleRequiredService ) ;
    public final void rule__Component__ReqAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2251:1: ( ( ruleRequiredService ) )
            // InternalMappingAssistance.g:2252:2: ( ruleRequiredService )
            {
            // InternalMappingAssistance.g:2252:2: ( ruleRequiredService )
            // InternalMappingAssistance.g:2253:3: ruleRequiredService
            {
             before(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getReqRequiredServiceParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ReqAssignment_12"


    // $ANTLR start "rule__Component__MapAssignment_13"
    // InternalMappingAssistance.g:2262:1: rule__Component__MapAssignment_13 : ( ruleMapping ) ;
    public final void rule__Component__MapAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2266:1: ( ( ruleMapping ) )
            // InternalMappingAssistance.g:2267:2: ( ruleMapping )
            {
            // InternalMappingAssistance.g:2267:2: ( ruleMapping )
            // InternalMappingAssistance.g:2268:3: ruleMapping
            {
             before(grammarAccess.getComponentAccess().getMapMappingParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getMapMappingParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__MapAssignment_13"


    // $ANTLR start "rule__Component__BindAssignment_14"
    // InternalMappingAssistance.g:2277:1: rule__Component__BindAssignment_14 : ( ruleBindings ) ;
    public final void rule__Component__BindAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2281:1: ( ( ruleBindings ) )
            // InternalMappingAssistance.g:2282:2: ( ruleBindings )
            {
            // InternalMappingAssistance.g:2282:2: ( ruleBindings )
            // InternalMappingAssistance.g:2283:3: ruleBindings
            {
             before(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleBindings();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getBindBindingsParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__BindAssignment_14"


    // $ANTLR start "rule__InstanceComp__NameAssignment"
    // InternalMappingAssistance.g:2292:1: rule__InstanceComp__NameAssignment : ( RULE_ID ) ;
    public final void rule__InstanceComp__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2296:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2297:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:2297:2: ( RULE_ID )
            // InternalMappingAssistance.g:2298:3: RULE_ID
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
    // InternalMappingAssistance.g:2307:1: rule__Variable__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2311:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2312:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:2312:2: ( RULE_ID )
            // InternalMappingAssistance.g:2313:3: RULE_ID
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
    // InternalMappingAssistance.g:2322:1: rule__Variable__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__Variable__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2326:1: ( ( ruleType ) )
            // InternalMappingAssistance.g:2327:2: ( ruleType )
            {
            // InternalMappingAssistance.g:2327:2: ( ruleType )
            // InternalMappingAssistance.g:2328:3: ruleType
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


    // $ANTLR start "rule__Mapping__NameVarModeAssignment_1"
    // InternalMappingAssistance.g:2337:1: rule__Mapping__NameVarModeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__NameVarModeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2341:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2342:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2342:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2343:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getNameVarModeVariableCrossReference_1_0()); 
            // InternalMappingAssistance.g:2344:3: ( RULE_ID )
            // InternalMappingAssistance.g:2345:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameVarModeVariableIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getNameVarModeVariableIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getNameVarModeVariableCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__NameVarModeAssignment_1"


    // $ANTLR start "rule__Mapping__NameVarTestAssignment_4"
    // InternalMappingAssistance.g:2356:1: rule__Mapping__NameVarTestAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Mapping__NameVarTestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2360:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2361:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2361:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2362:3: ( RULE_ID )
            {
             before(grammarAccess.getMappingAccess().getNameVarTestVariableCrossReference_4_0()); 
            // InternalMappingAssistance.g:2363:3: ( RULE_ID )
            // InternalMappingAssistance.g:2364:4: RULE_ID
            {
             before(grammarAccess.getMappingAccess().getNameVarTestVariableIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getNameVarTestVariableIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getNameVarTestVariableCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__NameVarTestAssignment_4"


    // $ANTLR start "rule__Bindings__NameCompAssignment_1"
    // InternalMappingAssistance.g:2375:1: rule__Bindings__NameCompAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameCompAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2379:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2380:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2380:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2381:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_1_0()); 
            // InternalMappingAssistance.g:2382:3: ( RULE_ID )
            // InternalMappingAssistance.g:2383:4: RULE_ID
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
    // InternalMappingAssistance.g:2394:1: rule__Bindings__NameServ1Assignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ1Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2398:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2399:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2399:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2400:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameServ1ServiceNameCrossReference_3_0()); 
            // InternalMappingAssistance.g:2401:3: ( RULE_ID )
            // InternalMappingAssistance.g:2402:4: RULE_ID
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
    // InternalMappingAssistance.g:2413:1: rule__Bindings__NameCompAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameCompAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2417:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2418:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2418:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2419:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameCompInstanceCompCrossReference_5_0()); 
            // InternalMappingAssistance.g:2420:3: ( RULE_ID )
            // InternalMappingAssistance.g:2421:4: RULE_ID
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
    // InternalMappingAssistance.g:2432:1: rule__Bindings__NameServ2Assignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Bindings__NameServ2Assignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2436:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2437:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2437:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2438:3: ( RULE_ID )
            {
             before(grammarAccess.getBindingsAccess().getNameServ2ServiceNameCrossReference_7_0()); 
            // InternalMappingAssistance.g:2439:3: ( RULE_ID )
            // InternalMappingAssistance.g:2440:4: RULE_ID
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
    // InternalMappingAssistance.g:2451:1: rule__RequiredService__NameVarMethodeAssignment_0 : ( ruleVariable ) ;
    public final void rule__RequiredService__NameVarMethodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2455:1: ( ( ruleVariable ) )
            // InternalMappingAssistance.g:2456:2: ( ruleVariable )
            {
            // InternalMappingAssistance.g:2456:2: ( ruleVariable )
            // InternalMappingAssistance.g:2457:3: ruleVariable
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
    // InternalMappingAssistance.g:2466:1: rule__RequiredService__NameCompAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameCompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2470:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2471:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2471:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2472:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameCompInstanceCompCrossReference_2_0()); 
            // InternalMappingAssistance.g:2473:3: ( RULE_ID )
            // InternalMappingAssistance.g:2474:4: RULE_ID
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
    // InternalMappingAssistance.g:2485:1: rule__RequiredService__NameServAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__NameServAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2489:1: ( ( ( RULE_ID ) ) )
            // InternalMappingAssistance.g:2490:2: ( ( RULE_ID ) )
            {
            // InternalMappingAssistance.g:2490:2: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2491:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getNameServServiceNameCrossReference_4_0()); 
            // InternalMappingAssistance.g:2492:3: ( RULE_ID )
            // InternalMappingAssistance.g:2493:4: RULE_ID
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
    // InternalMappingAssistance.g:2504:1: rule__ServiceName__NameAssignment : ( RULE_ID ) ;
    public final void rule__ServiceName__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMappingAssistance.g:2508:1: ( ( RULE_ID ) )
            // InternalMappingAssistance.g:2509:2: ( RULE_ID )
            {
            // InternalMappingAssistance.g:2509:2: ( RULE_ID )
            // InternalMappingAssistance.g:2510:3: RULE_ID
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000092000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});

}