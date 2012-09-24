package org.eclipse.scout.saml.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.scout.saml.services.SamlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSamlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'client'", "'server'", "'global'", "'all'", "'modify_load'", "'modify_store'", "'new_load'", "'new_store'", "'changed'", "'click'", "'master_changed'", "'init'", "'.'", "'text='", "'enabled='", "'visible='", "'master='", "'mandatory='", "'module '", "'translation '", "'='", "'java '", "'{'", "'}'", "'runat='", "'code '", "'id='", "'logic '", "'type='", "'exec='", "'lookup '", "'template '", "'class='", "'replaces='", "'form '", "'modal='", "'columns='", "'sequence_box '", "'string '", "'maxlen='", "'double '", "'long '", "'date '", "'smartfield '", "'code='", "'value_type='", "'lookup='", "'zreg_sequence_box '"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSamlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSamlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSamlParser.tokenNames; }
    public String getGrammarFileName() { return "../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g"; }


     
     	private SamlGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SamlGrammarAccess grammarAccess) {
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:61:1: ( ruleModel EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:69:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:73:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:74:1: ( ( rule__Model__ElementsAssignment )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:75:1: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:76:1: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=31 && LA1_0<=32)||LA1_0==38||(LA1_0>=43 && LA1_0<=44)||LA1_0==47) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:76:2: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94);
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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:88:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:89:1: ( ruleQualifiedName EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:90:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName122);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName129); 

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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:97:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:101:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:102:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:103:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:104:1: ( rule__QualifiedName__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:104:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName155);
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


    // $ANTLR start "entryRuleRootElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:116:1: entryRuleRootElement : ruleRootElement EOF ;
    public final void entryRuleRootElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:117:1: ( ruleRootElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:118:1: ruleRootElement EOF
            {
             before(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_ruleRootElement_in_entryRuleRootElement182);
            ruleRootElement();

            state._fsp--;

             after(grammarAccess.getRootElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootElement189); 

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
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:125:1: ruleRootElement : ( ( rule__RootElement__Alternatives ) ) ;
    public final void ruleRootElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:129:2: ( ( ( rule__RootElement__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:130:1: ( ( rule__RootElement__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:130:1: ( ( rule__RootElement__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:131:1: ( rule__RootElement__Alternatives )
            {
             before(grammarAccess.getRootElementAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:132:1: ( rule__RootElement__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:132:2: rule__RootElement__Alternatives
            {
            pushFollow(FOLLOW_rule__RootElement__Alternatives_in_ruleRootElement215);
            rule__RootElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRootElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleAbstractFieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:146:1: entryRuleAbstractFieldElement : ruleAbstractFieldElement EOF ;
    public final void entryRuleAbstractFieldElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:147:1: ( ruleAbstractFieldElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:148:1: ruleAbstractFieldElement EOF
            {
             before(grammarAccess.getAbstractFieldElementRule()); 
            pushFollow(FOLLOW_ruleAbstractFieldElement_in_entryRuleAbstractFieldElement244);
            ruleAbstractFieldElement();

            state._fsp--;

             after(grammarAccess.getAbstractFieldElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFieldElement251); 

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
    // $ANTLR end "entryRuleAbstractFieldElement"


    // $ANTLR start "ruleAbstractFieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:155:1: ruleAbstractFieldElement : ( ( rule__AbstractFieldElement__Alternatives ) ) ;
    public final void ruleAbstractFieldElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:159:2: ( ( ( rule__AbstractFieldElement__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:160:1: ( ( rule__AbstractFieldElement__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:160:1: ( ( rule__AbstractFieldElement__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:161:1: ( rule__AbstractFieldElement__Alternatives )
            {
             before(grammarAccess.getAbstractFieldElementAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:162:1: ( rule__AbstractFieldElement__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:162:2: rule__AbstractFieldElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractFieldElement__Alternatives_in_ruleAbstractFieldElement277);
            rule__AbstractFieldElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractFieldElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractFieldElement"


    // $ANTLR start "entryRuleAbstractFieldProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:174:1: entryRuleAbstractFieldProperties : ruleAbstractFieldProperties EOF ;
    public final void entryRuleAbstractFieldProperties() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:175:1: ( ruleAbstractFieldProperties EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:176:1: ruleAbstractFieldProperties EOF
            {
             before(grammarAccess.getAbstractFieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleAbstractFieldProperties_in_entryRuleAbstractFieldProperties304);
            ruleAbstractFieldProperties();

            state._fsp--;

             after(grammarAccess.getAbstractFieldPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFieldProperties311); 

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
    // $ANTLR end "entryRuleAbstractFieldProperties"


    // $ANTLR start "ruleAbstractFieldProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:183:1: ruleAbstractFieldProperties : ( ( rule__AbstractFieldProperties__Alternatives ) ) ;
    public final void ruleAbstractFieldProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:187:2: ( ( ( rule__AbstractFieldProperties__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:188:1: ( ( rule__AbstractFieldProperties__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:188:1: ( ( rule__AbstractFieldProperties__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:189:1: ( rule__AbstractFieldProperties__Alternatives )
            {
             before(grammarAccess.getAbstractFieldPropertiesAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:190:1: ( rule__AbstractFieldProperties__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:190:2: rule__AbstractFieldProperties__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractFieldProperties__Alternatives_in_ruleAbstractFieldProperties337);
            rule__AbstractFieldProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractFieldPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractFieldProperties"


    // $ANTLR start "entryRuleTextAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:202:1: entryRuleTextAttribute : ruleTextAttribute EOF ;
    public final void entryRuleTextAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:203:1: ( ruleTextAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:204:1: ruleTextAttribute EOF
            {
             before(grammarAccess.getTextAttributeRule()); 
            pushFollow(FOLLOW_ruleTextAttribute_in_entryRuleTextAttribute364);
            ruleTextAttribute();

            state._fsp--;

             after(grammarAccess.getTextAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextAttribute371); 

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
    // $ANTLR end "entryRuleTextAttribute"


    // $ANTLR start "ruleTextAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:211:1: ruleTextAttribute : ( ( rule__TextAttribute__Group__0 ) ) ;
    public final void ruleTextAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:215:2: ( ( ( rule__TextAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:216:1: ( ( rule__TextAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:216:1: ( ( rule__TextAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:217:1: ( rule__TextAttribute__Group__0 )
            {
             before(grammarAccess.getTextAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:218:1: ( rule__TextAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:218:2: rule__TextAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TextAttribute__Group__0_in_ruleTextAttribute397);
            rule__TextAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextAttribute"


    // $ANTLR start "entryRuleEnabledAttribue"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:230:1: entryRuleEnabledAttribue : ruleEnabledAttribue EOF ;
    public final void entryRuleEnabledAttribue() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:231:1: ( ruleEnabledAttribue EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:232:1: ruleEnabledAttribue EOF
            {
             before(grammarAccess.getEnabledAttribueRule()); 
            pushFollow(FOLLOW_ruleEnabledAttribue_in_entryRuleEnabledAttribue424);
            ruleEnabledAttribue();

            state._fsp--;

             after(grammarAccess.getEnabledAttribueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnabledAttribue431); 

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
    // $ANTLR end "entryRuleEnabledAttribue"


    // $ANTLR start "ruleEnabledAttribue"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:239:1: ruleEnabledAttribue : ( ( rule__EnabledAttribue__Group__0 ) ) ;
    public final void ruleEnabledAttribue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:243:2: ( ( ( rule__EnabledAttribue__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:244:1: ( ( rule__EnabledAttribue__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:244:1: ( ( rule__EnabledAttribue__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:245:1: ( rule__EnabledAttribue__Group__0 )
            {
             before(grammarAccess.getEnabledAttribueAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:246:1: ( rule__EnabledAttribue__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:246:2: rule__EnabledAttribue__Group__0
            {
            pushFollow(FOLLOW_rule__EnabledAttribue__Group__0_in_ruleEnabledAttribue457);
            rule__EnabledAttribue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnabledAttribueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnabledAttribue"


    // $ANTLR start "entryRuleVisibleAttribue"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:258:1: entryRuleVisibleAttribue : ruleVisibleAttribue EOF ;
    public final void entryRuleVisibleAttribue() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:259:1: ( ruleVisibleAttribue EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:260:1: ruleVisibleAttribue EOF
            {
             before(grammarAccess.getVisibleAttribueRule()); 
            pushFollow(FOLLOW_ruleVisibleAttribue_in_entryRuleVisibleAttribue484);
            ruleVisibleAttribue();

            state._fsp--;

             after(grammarAccess.getVisibleAttribueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibleAttribue491); 

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
    // $ANTLR end "entryRuleVisibleAttribue"


    // $ANTLR start "ruleVisibleAttribue"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:267:1: ruleVisibleAttribue : ( ( rule__VisibleAttribue__Group__0 ) ) ;
    public final void ruleVisibleAttribue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:271:2: ( ( ( rule__VisibleAttribue__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:272:1: ( ( rule__VisibleAttribue__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:272:1: ( ( rule__VisibleAttribue__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:273:1: ( rule__VisibleAttribue__Group__0 )
            {
             before(grammarAccess.getVisibleAttribueAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:274:1: ( rule__VisibleAttribue__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:274:2: rule__VisibleAttribue__Group__0
            {
            pushFollow(FOLLOW_rule__VisibleAttribue__Group__0_in_ruleVisibleAttribue517);
            rule__VisibleAttribue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisibleAttribueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibleAttribue"


    // $ANTLR start "entryRuleMasterAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:286:1: entryRuleMasterAttribute : ruleMasterAttribute EOF ;
    public final void entryRuleMasterAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:287:1: ( ruleMasterAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:288:1: ruleMasterAttribute EOF
            {
             before(grammarAccess.getMasterAttributeRule()); 
            pushFollow(FOLLOW_ruleMasterAttribute_in_entryRuleMasterAttribute544);
            ruleMasterAttribute();

            state._fsp--;

             after(grammarAccess.getMasterAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterAttribute551); 

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
    // $ANTLR end "entryRuleMasterAttribute"


    // $ANTLR start "ruleMasterAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:295:1: ruleMasterAttribute : ( ( rule__MasterAttribute__Group__0 ) ) ;
    public final void ruleMasterAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:299:2: ( ( ( rule__MasterAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:300:1: ( ( rule__MasterAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:300:1: ( ( rule__MasterAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:301:1: ( rule__MasterAttribute__Group__0 )
            {
             before(grammarAccess.getMasterAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:302:1: ( rule__MasterAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:302:2: rule__MasterAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__MasterAttribute__Group__0_in_ruleMasterAttribute577);
            rule__MasterAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMasterAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMasterAttribute"


    // $ANTLR start "entryRuleAbstractValueFieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:314:1: entryRuleAbstractValueFieldElement : ruleAbstractValueFieldElement EOF ;
    public final void entryRuleAbstractValueFieldElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:315:1: ( ruleAbstractValueFieldElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:316:1: ruleAbstractValueFieldElement EOF
            {
             before(grammarAccess.getAbstractValueFieldElementRule()); 
            pushFollow(FOLLOW_ruleAbstractValueFieldElement_in_entryRuleAbstractValueFieldElement604);
            ruleAbstractValueFieldElement();

            state._fsp--;

             after(grammarAccess.getAbstractValueFieldElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractValueFieldElement611); 

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
    // $ANTLR end "entryRuleAbstractValueFieldElement"


    // $ANTLR start "ruleAbstractValueFieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:323:1: ruleAbstractValueFieldElement : ( ( rule__AbstractValueFieldElement__Alternatives ) ) ;
    public final void ruleAbstractValueFieldElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:327:2: ( ( ( rule__AbstractValueFieldElement__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:328:1: ( ( rule__AbstractValueFieldElement__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:328:1: ( ( rule__AbstractValueFieldElement__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:329:1: ( rule__AbstractValueFieldElement__Alternatives )
            {
             before(grammarAccess.getAbstractValueFieldElementAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:330:1: ( rule__AbstractValueFieldElement__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:330:2: rule__AbstractValueFieldElement__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractValueFieldElement__Alternatives_in_ruleAbstractValueFieldElement637);
            rule__AbstractValueFieldElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractValueFieldElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractValueFieldElement"


    // $ANTLR start "entryRuleAbstractValueFieldProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:342:1: entryRuleAbstractValueFieldProperties : ruleAbstractValueFieldProperties EOF ;
    public final void entryRuleAbstractValueFieldProperties() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:343:1: ( ruleAbstractValueFieldProperties EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:344:1: ruleAbstractValueFieldProperties EOF
            {
             before(grammarAccess.getAbstractValueFieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_entryRuleAbstractValueFieldProperties664);
            ruleAbstractValueFieldProperties();

            state._fsp--;

             after(grammarAccess.getAbstractValueFieldPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractValueFieldProperties671); 

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
    // $ANTLR end "entryRuleAbstractValueFieldProperties"


    // $ANTLR start "ruleAbstractValueFieldProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:351:1: ruleAbstractValueFieldProperties : ( ( rule__AbstractValueFieldProperties__Alternatives ) ) ;
    public final void ruleAbstractValueFieldProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:355:2: ( ( ( rule__AbstractValueFieldProperties__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:356:1: ( ( rule__AbstractValueFieldProperties__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:356:1: ( ( rule__AbstractValueFieldProperties__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:357:1: ( rule__AbstractValueFieldProperties__Alternatives )
            {
             before(grammarAccess.getAbstractValueFieldPropertiesAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:358:1: ( rule__AbstractValueFieldProperties__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:358:2: rule__AbstractValueFieldProperties__Alternatives
            {
            pushFollow(FOLLOW_rule__AbstractValueFieldProperties__Alternatives_in_ruleAbstractValueFieldProperties697);
            rule__AbstractValueFieldProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractValueFieldPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractValueFieldProperties"


    // $ANTLR start "entryRuleMandatoryAttribue"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:370:1: entryRuleMandatoryAttribue : ruleMandatoryAttribue EOF ;
    public final void entryRuleMandatoryAttribue() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:371:1: ( ruleMandatoryAttribue EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:372:1: ruleMandatoryAttribue EOF
            {
             before(grammarAccess.getMandatoryAttribueRule()); 
            pushFollow(FOLLOW_ruleMandatoryAttribue_in_entryRuleMandatoryAttribue724);
            ruleMandatoryAttribue();

            state._fsp--;

             after(grammarAccess.getMandatoryAttribueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryAttribue731); 

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
    // $ANTLR end "entryRuleMandatoryAttribue"


    // $ANTLR start "ruleMandatoryAttribue"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:379:1: ruleMandatoryAttribue : ( ( rule__MandatoryAttribue__Group__0 ) ) ;
    public final void ruleMandatoryAttribue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:383:2: ( ( ( rule__MandatoryAttribue__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:384:1: ( ( rule__MandatoryAttribue__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:384:1: ( ( rule__MandatoryAttribue__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:385:1: ( rule__MandatoryAttribue__Group__0 )
            {
             before(grammarAccess.getMandatoryAttribueAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:386:1: ( rule__MandatoryAttribue__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:386:2: rule__MandatoryAttribue__Group__0
            {
            pushFollow(FOLLOW_rule__MandatoryAttribue__Group__0_in_ruleMandatoryAttribue757);
            rule__MandatoryAttribue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAttribueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryAttribue"


    // $ANTLR start "entryRuleAbstractContainerFieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:398:1: entryRuleAbstractContainerFieldElement : ruleAbstractContainerFieldElement EOF ;
    public final void entryRuleAbstractContainerFieldElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:399:1: ( ruleAbstractContainerFieldElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:400:1: ruleAbstractContainerFieldElement EOF
            {
             before(grammarAccess.getAbstractContainerFieldElementRule()); 
            pushFollow(FOLLOW_ruleAbstractContainerFieldElement_in_entryRuleAbstractContainerFieldElement784);
            ruleAbstractContainerFieldElement();

            state._fsp--;

             after(grammarAccess.getAbstractContainerFieldElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractContainerFieldElement791); 

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
    // $ANTLR end "entryRuleAbstractContainerFieldElement"


    // $ANTLR start "ruleAbstractContainerFieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:407:1: ruleAbstractContainerFieldElement : ( ruleSequenceBoxElement ) ;
    public final void ruleAbstractContainerFieldElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:411:2: ( ( ruleSequenceBoxElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:412:1: ( ruleSequenceBoxElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:412:1: ( ruleSequenceBoxElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:413:1: ruleSequenceBoxElement
            {
             before(grammarAccess.getAbstractContainerFieldElementAccess().getSequenceBoxElementParserRuleCall()); 
            pushFollow(FOLLOW_ruleSequenceBoxElement_in_ruleAbstractContainerFieldElement817);
            ruleSequenceBoxElement();

            state._fsp--;

             after(grammarAccess.getAbstractContainerFieldElementAccess().getSequenceBoxElementParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractContainerFieldElement"


    // $ANTLR start "entryRuleModuleElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:426:1: entryRuleModuleElement : ruleModuleElement EOF ;
    public final void entryRuleModuleElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:427:1: ( ruleModuleElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:428:1: ruleModuleElement EOF
            {
             before(grammarAccess.getModuleElementRule()); 
            pushFollow(FOLLOW_ruleModuleElement_in_entryRuleModuleElement843);
            ruleModuleElement();

            state._fsp--;

             after(grammarAccess.getModuleElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleElement850); 

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
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:435:1: ruleModuleElement : ( ( rule__ModuleElement__Group__0 ) ) ;
    public final void ruleModuleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:439:2: ( ( ( rule__ModuleElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:440:1: ( ( rule__ModuleElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:440:1: ( ( rule__ModuleElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:441:1: ( rule__ModuleElement__Group__0 )
            {
             before(grammarAccess.getModuleElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:442:1: ( rule__ModuleElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:442:2: rule__ModuleElement__Group__0
            {
            pushFollow(FOLLOW_rule__ModuleElement__Group__0_in_ruleModuleElement876);
            rule__ModuleElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleTranslationElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:454:1: entryRuleTranslationElement : ruleTranslationElement EOF ;
    public final void entryRuleTranslationElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:455:1: ( ruleTranslationElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:456:1: ruleTranslationElement EOF
            {
             before(grammarAccess.getTranslationElementRule()); 
            pushFollow(FOLLOW_ruleTranslationElement_in_entryRuleTranslationElement903);
            ruleTranslationElement();

            state._fsp--;

             after(grammarAccess.getTranslationElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTranslationElement910); 

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
    // $ANTLR end "entryRuleTranslationElement"


    // $ANTLR start "ruleTranslationElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:463:1: ruleTranslationElement : ( ( rule__TranslationElement__Group__0 ) ) ;
    public final void ruleTranslationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:467:2: ( ( ( rule__TranslationElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:468:1: ( ( rule__TranslationElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:468:1: ( ( rule__TranslationElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:469:1: ( rule__TranslationElement__Group__0 )
            {
             before(grammarAccess.getTranslationElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:470:1: ( rule__TranslationElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:470:2: rule__TranslationElement__Group__0
            {
            pushFollow(FOLLOW_rule__TranslationElement__Group__0_in_ruleTranslationElement936);
            rule__TranslationElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTranslationElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTranslationElement"


    // $ANTLR start "entryRuleTranslationAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:482:1: entryRuleTranslationAttribute : ruleTranslationAttribute EOF ;
    public final void entryRuleTranslationAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:483:1: ( ruleTranslationAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:484:1: ruleTranslationAttribute EOF
            {
             before(grammarAccess.getTranslationAttributeRule()); 
            pushFollow(FOLLOW_ruleTranslationAttribute_in_entryRuleTranslationAttribute963);
            ruleTranslationAttribute();

            state._fsp--;

             after(grammarAccess.getTranslationAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTranslationAttribute970); 

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
    // $ANTLR end "entryRuleTranslationAttribute"


    // $ANTLR start "ruleTranslationAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:491:1: ruleTranslationAttribute : ( ( rule__TranslationAttribute__Group__0 ) ) ;
    public final void ruleTranslationAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:495:2: ( ( ( rule__TranslationAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:496:1: ( ( rule__TranslationAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:496:1: ( ( rule__TranslationAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:497:1: ( rule__TranslationAttribute__Group__0 )
            {
             before(grammarAccess.getTranslationAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:498:1: ( rule__TranslationAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:498:2: rule__TranslationAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TranslationAttribute__Group__0_in_ruleTranslationAttribute996);
            rule__TranslationAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTranslationAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTranslationAttribute"


    // $ANTLR start "entryRuleJavaElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:510:1: entryRuleJavaElement : ruleJavaElement EOF ;
    public final void entryRuleJavaElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:511:1: ( ruleJavaElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:512:1: ruleJavaElement EOF
            {
             before(grammarAccess.getJavaElementRule()); 
            pushFollow(FOLLOW_ruleJavaElement_in_entryRuleJavaElement1023);
            ruleJavaElement();

            state._fsp--;

             after(grammarAccess.getJavaElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaElement1030); 

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
    // $ANTLR end "entryRuleJavaElement"


    // $ANTLR start "ruleJavaElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:519:1: ruleJavaElement : ( ( rule__JavaElement__Group__0 ) ) ;
    public final void ruleJavaElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:523:2: ( ( ( rule__JavaElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:524:1: ( ( rule__JavaElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:524:1: ( ( rule__JavaElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:525:1: ( rule__JavaElement__Group__0 )
            {
             before(grammarAccess.getJavaElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:526:1: ( rule__JavaElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:526:2: rule__JavaElement__Group__0
            {
            pushFollow(FOLLOW_rule__JavaElement__Group__0_in_ruleJavaElement1056);
            rule__JavaElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaElement"


    // $ANTLR start "entryRuleRunAtAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:538:1: entryRuleRunAtAttribute : ruleRunAtAttribute EOF ;
    public final void entryRuleRunAtAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:539:1: ( ruleRunAtAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:540:1: ruleRunAtAttribute EOF
            {
             before(grammarAccess.getRunAtAttributeRule()); 
            pushFollow(FOLLOW_ruleRunAtAttribute_in_entryRuleRunAtAttribute1083);
            ruleRunAtAttribute();

            state._fsp--;

             after(grammarAccess.getRunAtAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunAtAttribute1090); 

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
    // $ANTLR end "entryRuleRunAtAttribute"


    // $ANTLR start "ruleRunAtAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:547:1: ruleRunAtAttribute : ( ( rule__RunAtAttribute__Group__0 ) ) ;
    public final void ruleRunAtAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:551:2: ( ( ( rule__RunAtAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:552:1: ( ( rule__RunAtAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:552:1: ( ( rule__RunAtAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:553:1: ( rule__RunAtAttribute__Group__0 )
            {
             before(grammarAccess.getRunAtAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:554:1: ( rule__RunAtAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:554:2: rule__RunAtAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__RunAtAttribute__Group__0_in_ruleRunAtAttribute1116);
            rule__RunAtAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRunAtAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRunAtAttribute"


    // $ANTLR start "entryRuleCodeElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:566:1: entryRuleCodeElement : ruleCodeElement EOF ;
    public final void entryRuleCodeElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:567:1: ( ruleCodeElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:568:1: ruleCodeElement EOF
            {
             before(grammarAccess.getCodeElementRule()); 
            pushFollow(FOLLOW_ruleCodeElement_in_entryRuleCodeElement1143);
            ruleCodeElement();

            state._fsp--;

             after(grammarAccess.getCodeElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeElement1150); 

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
    // $ANTLR end "entryRuleCodeElement"


    // $ANTLR start "ruleCodeElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:575:1: ruleCodeElement : ( ( rule__CodeElement__Group__0 ) ) ;
    public final void ruleCodeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:579:2: ( ( ( rule__CodeElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:580:1: ( ( rule__CodeElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:580:1: ( ( rule__CodeElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:581:1: ( rule__CodeElement__Group__0 )
            {
             before(grammarAccess.getCodeElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:582:1: ( rule__CodeElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:582:2: rule__CodeElement__Group__0
            {
            pushFollow(FOLLOW_rule__CodeElement__Group__0_in_ruleCodeElement1176);
            rule__CodeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeElement"


    // $ANTLR start "entryRuleCodeIdAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:594:1: entryRuleCodeIdAttribute : ruleCodeIdAttribute EOF ;
    public final void entryRuleCodeIdAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:595:1: ( ruleCodeIdAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:596:1: ruleCodeIdAttribute EOF
            {
             before(grammarAccess.getCodeIdAttributeRule()); 
            pushFollow(FOLLOW_ruleCodeIdAttribute_in_entryRuleCodeIdAttribute1203);
            ruleCodeIdAttribute();

            state._fsp--;

             after(grammarAccess.getCodeIdAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeIdAttribute1210); 

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
    // $ANTLR end "entryRuleCodeIdAttribute"


    // $ANTLR start "ruleCodeIdAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:603:1: ruleCodeIdAttribute : ( ( rule__CodeIdAttribute__Group__0 ) ) ;
    public final void ruleCodeIdAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:607:2: ( ( ( rule__CodeIdAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:608:1: ( ( rule__CodeIdAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:608:1: ( ( rule__CodeIdAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:609:1: ( rule__CodeIdAttribute__Group__0 )
            {
             before(grammarAccess.getCodeIdAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:610:1: ( rule__CodeIdAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:610:2: rule__CodeIdAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__CodeIdAttribute__Group__0_in_ruleCodeIdAttribute1236);
            rule__CodeIdAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCodeIdAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCodeIdAttribute"


    // $ANTLR start "entryRuleLogicElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:622:1: entryRuleLogicElement : ruleLogicElement EOF ;
    public final void entryRuleLogicElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:623:1: ( ruleLogicElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:624:1: ruleLogicElement EOF
            {
             before(grammarAccess.getLogicElementRule()); 
            pushFollow(FOLLOW_ruleLogicElement_in_entryRuleLogicElement1263);
            ruleLogicElement();

            state._fsp--;

             after(grammarAccess.getLogicElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicElement1270); 

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
    // $ANTLR end "entryRuleLogicElement"


    // $ANTLR start "ruleLogicElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:631:1: ruleLogicElement : ( ( rule__LogicElement__Group__0 ) ) ;
    public final void ruleLogicElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:635:2: ( ( ( rule__LogicElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:636:1: ( ( rule__LogicElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:636:1: ( ( rule__LogicElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:637:1: ( rule__LogicElement__Group__0 )
            {
             before(grammarAccess.getLogicElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:638:1: ( rule__LogicElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:638:2: rule__LogicElement__Group__0
            {
            pushFollow(FOLLOW_rule__LogicElement__Group__0_in_ruleLogicElement1296);
            rule__LogicElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicElement"


    // $ANTLR start "entryRuleLogicOptionalProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:650:1: entryRuleLogicOptionalProperties : ruleLogicOptionalProperties EOF ;
    public final void entryRuleLogicOptionalProperties() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:651:1: ( ruleLogicOptionalProperties EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:652:1: ruleLogicOptionalProperties EOF
            {
             before(grammarAccess.getLogicOptionalPropertiesRule()); 
            pushFollow(FOLLOW_ruleLogicOptionalProperties_in_entryRuleLogicOptionalProperties1323);
            ruleLogicOptionalProperties();

            state._fsp--;

             after(grammarAccess.getLogicOptionalPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOptionalProperties1330); 

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
    // $ANTLR end "entryRuleLogicOptionalProperties"


    // $ANTLR start "ruleLogicOptionalProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:659:1: ruleLogicOptionalProperties : ( ( rule__LogicOptionalProperties__Alternatives ) ) ;
    public final void ruleLogicOptionalProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:663:2: ( ( ( rule__LogicOptionalProperties__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:664:1: ( ( rule__LogicOptionalProperties__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:664:1: ( ( rule__LogicOptionalProperties__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:665:1: ( rule__LogicOptionalProperties__Alternatives )
            {
             before(grammarAccess.getLogicOptionalPropertiesAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:666:1: ( rule__LogicOptionalProperties__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:666:2: rule__LogicOptionalProperties__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicOptionalProperties__Alternatives_in_ruleLogicOptionalProperties1356);
            rule__LogicOptionalProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicOptionalPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOptionalProperties"


    // $ANTLR start "entryRuleLogicTypeAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:678:1: entryRuleLogicTypeAttribute : ruleLogicTypeAttribute EOF ;
    public final void entryRuleLogicTypeAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:679:1: ( ruleLogicTypeAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:680:1: ruleLogicTypeAttribute EOF
            {
             before(grammarAccess.getLogicTypeAttributeRule()); 
            pushFollow(FOLLOW_ruleLogicTypeAttribute_in_entryRuleLogicTypeAttribute1383);
            ruleLogicTypeAttribute();

            state._fsp--;

             after(grammarAccess.getLogicTypeAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicTypeAttribute1390); 

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
    // $ANTLR end "entryRuleLogicTypeAttribute"


    // $ANTLR start "ruleLogicTypeAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:687:1: ruleLogicTypeAttribute : ( ( rule__LogicTypeAttribute__Group__0 ) ) ;
    public final void ruleLogicTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:691:2: ( ( ( rule__LogicTypeAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:692:1: ( ( rule__LogicTypeAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:692:1: ( ( rule__LogicTypeAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:693:1: ( rule__LogicTypeAttribute__Group__0 )
            {
             before(grammarAccess.getLogicTypeAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:694:1: ( rule__LogicTypeAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:694:2: rule__LogicTypeAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__LogicTypeAttribute__Group__0_in_ruleLogicTypeAttribute1416);
            rule__LogicTypeAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicTypeAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicTypeAttribute"


    // $ANTLR start "entryRuleLogicExecAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:706:1: entryRuleLogicExecAttribute : ruleLogicExecAttribute EOF ;
    public final void entryRuleLogicExecAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:707:1: ( ruleLogicExecAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:708:1: ruleLogicExecAttribute EOF
            {
             before(grammarAccess.getLogicExecAttributeRule()); 
            pushFollow(FOLLOW_ruleLogicExecAttribute_in_entryRuleLogicExecAttribute1443);
            ruleLogicExecAttribute();

            state._fsp--;

             after(grammarAccess.getLogicExecAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExecAttribute1450); 

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
    // $ANTLR end "entryRuleLogicExecAttribute"


    // $ANTLR start "ruleLogicExecAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:715:1: ruleLogicExecAttribute : ( ( rule__LogicExecAttribute__Group__0 ) ) ;
    public final void ruleLogicExecAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:719:2: ( ( ( rule__LogicExecAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:720:1: ( ( rule__LogicExecAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:720:1: ( ( rule__LogicExecAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:721:1: ( rule__LogicExecAttribute__Group__0 )
            {
             before(grammarAccess.getLogicExecAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:722:1: ( rule__LogicExecAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:722:2: rule__LogicExecAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__LogicExecAttribute__Group__0_in_ruleLogicExecAttribute1476);
            rule__LogicExecAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicExecAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicExecAttribute"


    // $ANTLR start "entryRuleLookupElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:734:1: entryRuleLookupElement : ruleLookupElement EOF ;
    public final void entryRuleLookupElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:735:1: ( ruleLookupElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:736:1: ruleLookupElement EOF
            {
             before(grammarAccess.getLookupElementRule()); 
            pushFollow(FOLLOW_ruleLookupElement_in_entryRuleLookupElement1503);
            ruleLookupElement();

            state._fsp--;

             after(grammarAccess.getLookupElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLookupElement1510); 

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
    // $ANTLR end "entryRuleLookupElement"


    // $ANTLR start "ruleLookupElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:743:1: ruleLookupElement : ( ( rule__LookupElement__Group__0 ) ) ;
    public final void ruleLookupElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:747:2: ( ( ( rule__LookupElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:748:1: ( ( rule__LookupElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:748:1: ( ( rule__LookupElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:749:1: ( rule__LookupElement__Group__0 )
            {
             before(grammarAccess.getLookupElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:750:1: ( rule__LookupElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:750:2: rule__LookupElement__Group__0
            {
            pushFollow(FOLLOW_rule__LookupElement__Group__0_in_ruleLookupElement1536);
            rule__LookupElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLookupElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLookupElement"


    // $ANTLR start "entryRuleTemplateElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:762:1: entryRuleTemplateElement : ruleTemplateElement EOF ;
    public final void entryRuleTemplateElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:763:1: ( ruleTemplateElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:764:1: ruleTemplateElement EOF
            {
             before(grammarAccess.getTemplateElementRule()); 
            pushFollow(FOLLOW_ruleTemplateElement_in_entryRuleTemplateElement1563);
            ruleTemplateElement();

            state._fsp--;

             after(grammarAccess.getTemplateElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateElement1570); 

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
    // $ANTLR end "entryRuleTemplateElement"


    // $ANTLR start "ruleTemplateElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:771:1: ruleTemplateElement : ( ( rule__TemplateElement__Group__0 ) ) ;
    public final void ruleTemplateElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:775:2: ( ( ( rule__TemplateElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:776:1: ( ( rule__TemplateElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:776:1: ( ( rule__TemplateElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:777:1: ( rule__TemplateElement__Group__0 )
            {
             before(grammarAccess.getTemplateElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:778:1: ( rule__TemplateElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:778:2: rule__TemplateElement__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateElement__Group__0_in_ruleTemplateElement1596);
            rule__TemplateElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateElement"


    // $ANTLR start "entryRuleTemplateElementClassAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:790:1: entryRuleTemplateElementClassAttribute : ruleTemplateElementClassAttribute EOF ;
    public final void entryRuleTemplateElementClassAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:791:1: ( ruleTemplateElementClassAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:792:1: ruleTemplateElementClassAttribute EOF
            {
             before(grammarAccess.getTemplateElementClassAttributeRule()); 
            pushFollow(FOLLOW_ruleTemplateElementClassAttribute_in_entryRuleTemplateElementClassAttribute1623);
            ruleTemplateElementClassAttribute();

            state._fsp--;

             after(grammarAccess.getTemplateElementClassAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateElementClassAttribute1630); 

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
    // $ANTLR end "entryRuleTemplateElementClassAttribute"


    // $ANTLR start "ruleTemplateElementClassAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:799:1: ruleTemplateElementClassAttribute : ( ( rule__TemplateElementClassAttribute__Group__0 ) ) ;
    public final void ruleTemplateElementClassAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:803:2: ( ( ( rule__TemplateElementClassAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:804:1: ( ( rule__TemplateElementClassAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:804:1: ( ( rule__TemplateElementClassAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:805:1: ( rule__TemplateElementClassAttribute__Group__0 )
            {
             before(grammarAccess.getTemplateElementClassAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:806:1: ( rule__TemplateElementClassAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:806:2: rule__TemplateElementClassAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateElementClassAttribute__Group__0_in_ruleTemplateElementClassAttribute1656);
            rule__TemplateElementClassAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementClassAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateElementClassAttribute"


    // $ANTLR start "entryRuleTemplateElementReplacesAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:818:1: entryRuleTemplateElementReplacesAttribute : ruleTemplateElementReplacesAttribute EOF ;
    public final void entryRuleTemplateElementReplacesAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:819:1: ( ruleTemplateElementReplacesAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:820:1: ruleTemplateElementReplacesAttribute EOF
            {
             before(grammarAccess.getTemplateElementReplacesAttributeRule()); 
            pushFollow(FOLLOW_ruleTemplateElementReplacesAttribute_in_entryRuleTemplateElementReplacesAttribute1683);
            ruleTemplateElementReplacesAttribute();

            state._fsp--;

             after(grammarAccess.getTemplateElementReplacesAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateElementReplacesAttribute1690); 

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
    // $ANTLR end "entryRuleTemplateElementReplacesAttribute"


    // $ANTLR start "ruleTemplateElementReplacesAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:827:1: ruleTemplateElementReplacesAttribute : ( ( rule__TemplateElementReplacesAttribute__Group__0 ) ) ;
    public final void ruleTemplateElementReplacesAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:831:2: ( ( ( rule__TemplateElementReplacesAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:832:1: ( ( rule__TemplateElementReplacesAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:832:1: ( ( rule__TemplateElementReplacesAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:833:1: ( rule__TemplateElementReplacesAttribute__Group__0 )
            {
             before(grammarAccess.getTemplateElementReplacesAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:834:1: ( rule__TemplateElementReplacesAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:834:2: rule__TemplateElementReplacesAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__TemplateElementReplacesAttribute__Group__0_in_ruleTemplateElementReplacesAttribute1716);
            rule__TemplateElementReplacesAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementReplacesAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplateElementReplacesAttribute"


    // $ANTLR start "entryRuleFormElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:846:1: entryRuleFormElement : ruleFormElement EOF ;
    public final void entryRuleFormElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:847:1: ( ruleFormElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:848:1: ruleFormElement EOF
            {
             before(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement1743);
            ruleFormElement();

            state._fsp--;

             after(grammarAccess.getFormElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement1750); 

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
    // $ANTLR end "entryRuleFormElement"


    // $ANTLR start "ruleFormElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:855:1: ruleFormElement : ( ( rule__FormElement__Group__0 ) ) ;
    public final void ruleFormElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:859:2: ( ( ( rule__FormElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:860:1: ( ( rule__FormElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:860:1: ( ( rule__FormElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:861:1: ( rule__FormElement__Group__0 )
            {
             before(grammarAccess.getFormElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:862:1: ( rule__FormElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:862:2: rule__FormElement__Group__0
            {
            pushFollow(FOLLOW_rule__FormElement__Group__0_in_ruleFormElement1776);
            rule__FormElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormElement"


    // $ANTLR start "entryRuleFormElementModalAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:874:1: entryRuleFormElementModalAttribute : ruleFormElementModalAttribute EOF ;
    public final void entryRuleFormElementModalAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:875:1: ( ruleFormElementModalAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:876:1: ruleFormElementModalAttribute EOF
            {
             before(grammarAccess.getFormElementModalAttributeRule()); 
            pushFollow(FOLLOW_ruleFormElementModalAttribute_in_entryRuleFormElementModalAttribute1803);
            ruleFormElementModalAttribute();

            state._fsp--;

             after(grammarAccess.getFormElementModalAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElementModalAttribute1810); 

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
    // $ANTLR end "entryRuleFormElementModalAttribute"


    // $ANTLR start "ruleFormElementModalAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:883:1: ruleFormElementModalAttribute : ( ( rule__FormElementModalAttribute__Group__0 ) ) ;
    public final void ruleFormElementModalAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:887:2: ( ( ( rule__FormElementModalAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:888:1: ( ( rule__FormElementModalAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:888:1: ( ( rule__FormElementModalAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:889:1: ( rule__FormElementModalAttribute__Group__0 )
            {
             before(grammarAccess.getFormElementModalAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:890:1: ( rule__FormElementModalAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:890:2: rule__FormElementModalAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__FormElementModalAttribute__Group__0_in_ruleFormElementModalAttribute1836);
            rule__FormElementModalAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormElementModalAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormElementModalAttribute"


    // $ANTLR start "entryRuleFormElementColumnsAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:902:1: entryRuleFormElementColumnsAttribute : ruleFormElementColumnsAttribute EOF ;
    public final void entryRuleFormElementColumnsAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:903:1: ( ruleFormElementColumnsAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:904:1: ruleFormElementColumnsAttribute EOF
            {
             before(grammarAccess.getFormElementColumnsAttributeRule()); 
            pushFollow(FOLLOW_ruleFormElementColumnsAttribute_in_entryRuleFormElementColumnsAttribute1863);
            ruleFormElementColumnsAttribute();

            state._fsp--;

             after(grammarAccess.getFormElementColumnsAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElementColumnsAttribute1870); 

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
    // $ANTLR end "entryRuleFormElementColumnsAttribute"


    // $ANTLR start "ruleFormElementColumnsAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:911:1: ruleFormElementColumnsAttribute : ( ( rule__FormElementColumnsAttribute__Group__0 ) ) ;
    public final void ruleFormElementColumnsAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:915:2: ( ( ( rule__FormElementColumnsAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:916:1: ( ( rule__FormElementColumnsAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:916:1: ( ( rule__FormElementColumnsAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:917:1: ( rule__FormElementColumnsAttribute__Group__0 )
            {
             before(grammarAccess.getFormElementColumnsAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:918:1: ( rule__FormElementColumnsAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:918:2: rule__FormElementColumnsAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__FormElementColumnsAttribute__Group__0_in_ruleFormElementColumnsAttribute1896);
            rule__FormElementColumnsAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormElementColumnsAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormElementColumnsAttribute"


    // $ANTLR start "entryRuleSequenceBoxElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:930:1: entryRuleSequenceBoxElement : ruleSequenceBoxElement EOF ;
    public final void entryRuleSequenceBoxElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:931:1: ( ruleSequenceBoxElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:932:1: ruleSequenceBoxElement EOF
            {
             before(grammarAccess.getSequenceBoxElementRule()); 
            pushFollow(FOLLOW_ruleSequenceBoxElement_in_entryRuleSequenceBoxElement1923);
            ruleSequenceBoxElement();

            state._fsp--;

             after(grammarAccess.getSequenceBoxElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceBoxElement1930); 

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
    // $ANTLR end "entryRuleSequenceBoxElement"


    // $ANTLR start "ruleSequenceBoxElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:939:1: ruleSequenceBoxElement : ( ( rule__SequenceBoxElement__Group__0 ) ) ;
    public final void ruleSequenceBoxElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:943:2: ( ( ( rule__SequenceBoxElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:944:1: ( ( rule__SequenceBoxElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:944:1: ( ( rule__SequenceBoxElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:945:1: ( rule__SequenceBoxElement__Group__0 )
            {
             before(grammarAccess.getSequenceBoxElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:946:1: ( rule__SequenceBoxElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:946:2: rule__SequenceBoxElement__Group__0
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__0_in_ruleSequenceBoxElement1956);
            rule__SequenceBoxElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceBoxElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceBoxElement"


    // $ANTLR start "entryRuleStringElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:958:1: entryRuleStringElement : ruleStringElement EOF ;
    public final void entryRuleStringElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:959:1: ( ruleStringElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:960:1: ruleStringElement EOF
            {
             before(grammarAccess.getStringElementRule()); 
            pushFollow(FOLLOW_ruleStringElement_in_entryRuleStringElement1983);
            ruleStringElement();

            state._fsp--;

             after(grammarAccess.getStringElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElement1990); 

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
    // $ANTLR end "entryRuleStringElement"


    // $ANTLR start "ruleStringElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:967:1: ruleStringElement : ( ( rule__StringElement__Group__0 ) ) ;
    public final void ruleStringElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:971:2: ( ( ( rule__StringElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:972:1: ( ( rule__StringElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:972:1: ( ( rule__StringElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:973:1: ( rule__StringElement__Group__0 )
            {
             before(grammarAccess.getStringElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:974:1: ( rule__StringElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:974:2: rule__StringElement__Group__0
            {
            pushFollow(FOLLOW_rule__StringElement__Group__0_in_ruleStringElement2016);
            rule__StringElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringElement"


    // $ANTLR start "entryRuleStringElementProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:986:1: entryRuleStringElementProperties : ruleStringElementProperties EOF ;
    public final void entryRuleStringElementProperties() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:987:1: ( ruleStringElementProperties EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:988:1: ruleStringElementProperties EOF
            {
             before(grammarAccess.getStringElementPropertiesRule()); 
            pushFollow(FOLLOW_ruleStringElementProperties_in_entryRuleStringElementProperties2043);
            ruleStringElementProperties();

            state._fsp--;

             after(grammarAccess.getStringElementPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElementProperties2050); 

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
    // $ANTLR end "entryRuleStringElementProperties"


    // $ANTLR start "ruleStringElementProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:995:1: ruleStringElementProperties : ( ( rule__StringElementProperties__Alternatives ) ) ;
    public final void ruleStringElementProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:999:2: ( ( ( rule__StringElementProperties__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1000:1: ( ( rule__StringElementProperties__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1000:1: ( ( rule__StringElementProperties__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1001:1: ( rule__StringElementProperties__Alternatives )
            {
             before(grammarAccess.getStringElementPropertiesAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1002:1: ( rule__StringElementProperties__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1002:2: rule__StringElementProperties__Alternatives
            {
            pushFollow(FOLLOW_rule__StringElementProperties__Alternatives_in_ruleStringElementProperties2076);
            rule__StringElementProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringElementPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringElementProperties"


    // $ANTLR start "entryRuleStringElementMaxlenAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1014:1: entryRuleStringElementMaxlenAttribute : ruleStringElementMaxlenAttribute EOF ;
    public final void entryRuleStringElementMaxlenAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1015:1: ( ruleStringElementMaxlenAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1016:1: ruleStringElementMaxlenAttribute EOF
            {
             before(grammarAccess.getStringElementMaxlenAttributeRule()); 
            pushFollow(FOLLOW_ruleStringElementMaxlenAttribute_in_entryRuleStringElementMaxlenAttribute2103);
            ruleStringElementMaxlenAttribute();

            state._fsp--;

             after(grammarAccess.getStringElementMaxlenAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElementMaxlenAttribute2110); 

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
    // $ANTLR end "entryRuleStringElementMaxlenAttribute"


    // $ANTLR start "ruleStringElementMaxlenAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1023:1: ruleStringElementMaxlenAttribute : ( ( rule__StringElementMaxlenAttribute__Group__0 ) ) ;
    public final void ruleStringElementMaxlenAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1027:2: ( ( ( rule__StringElementMaxlenAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1028:1: ( ( rule__StringElementMaxlenAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1028:1: ( ( rule__StringElementMaxlenAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1029:1: ( rule__StringElementMaxlenAttribute__Group__0 )
            {
             before(grammarAccess.getStringElementMaxlenAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1030:1: ( rule__StringElementMaxlenAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1030:2: rule__StringElementMaxlenAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__StringElementMaxlenAttribute__Group__0_in_ruleStringElementMaxlenAttribute2136);
            rule__StringElementMaxlenAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringElementMaxlenAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringElementMaxlenAttribute"


    // $ANTLR start "entryRuleDoubleElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1042:1: entryRuleDoubleElement : ruleDoubleElement EOF ;
    public final void entryRuleDoubleElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1043:1: ( ruleDoubleElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1044:1: ruleDoubleElement EOF
            {
             before(grammarAccess.getDoubleElementRule()); 
            pushFollow(FOLLOW_ruleDoubleElement_in_entryRuleDoubleElement2163);
            ruleDoubleElement();

            state._fsp--;

             after(grammarAccess.getDoubleElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleElement2170); 

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
    // $ANTLR end "entryRuleDoubleElement"


    // $ANTLR start "ruleDoubleElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1051:1: ruleDoubleElement : ( ( rule__DoubleElement__Group__0 ) ) ;
    public final void ruleDoubleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1055:2: ( ( ( rule__DoubleElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1056:1: ( ( rule__DoubleElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1056:1: ( ( rule__DoubleElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1057:1: ( rule__DoubleElement__Group__0 )
            {
             before(grammarAccess.getDoubleElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1058:1: ( rule__DoubleElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1058:2: rule__DoubleElement__Group__0
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group__0_in_ruleDoubleElement2196);
            rule__DoubleElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleElement"


    // $ANTLR start "entryRuleLongElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1070:1: entryRuleLongElement : ruleLongElement EOF ;
    public final void entryRuleLongElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1071:1: ( ruleLongElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1072:1: ruleLongElement EOF
            {
             before(grammarAccess.getLongElementRule()); 
            pushFollow(FOLLOW_ruleLongElement_in_entryRuleLongElement2223);
            ruleLongElement();

            state._fsp--;

             after(grammarAccess.getLongElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongElement2230); 

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
    // $ANTLR end "entryRuleLongElement"


    // $ANTLR start "ruleLongElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1079:1: ruleLongElement : ( ( rule__LongElement__Group__0 ) ) ;
    public final void ruleLongElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1083:2: ( ( ( rule__LongElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1084:1: ( ( rule__LongElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1084:1: ( ( rule__LongElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1085:1: ( rule__LongElement__Group__0 )
            {
             before(grammarAccess.getLongElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1086:1: ( rule__LongElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1086:2: rule__LongElement__Group__0
            {
            pushFollow(FOLLOW_rule__LongElement__Group__0_in_ruleLongElement2256);
            rule__LongElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLongElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLongElement"


    // $ANTLR start "entryRuleDateElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1098:1: entryRuleDateElement : ruleDateElement EOF ;
    public final void entryRuleDateElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1099:1: ( ruleDateElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1100:1: ruleDateElement EOF
            {
             before(grammarAccess.getDateElementRule()); 
            pushFollow(FOLLOW_ruleDateElement_in_entryRuleDateElement2283);
            ruleDateElement();

            state._fsp--;

             after(grammarAccess.getDateElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateElement2290); 

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
    // $ANTLR end "entryRuleDateElement"


    // $ANTLR start "ruleDateElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1107:1: ruleDateElement : ( ( rule__DateElement__Group__0 ) ) ;
    public final void ruleDateElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1111:2: ( ( ( rule__DateElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1112:1: ( ( rule__DateElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1112:1: ( ( rule__DateElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1113:1: ( rule__DateElement__Group__0 )
            {
             before(grammarAccess.getDateElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1114:1: ( rule__DateElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1114:2: rule__DateElement__Group__0
            {
            pushFollow(FOLLOW_rule__DateElement__Group__0_in_ruleDateElement2316);
            rule__DateElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDateElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateElement"


    // $ANTLR start "entryRuleSmartfieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1126:1: entryRuleSmartfieldElement : ruleSmartfieldElement EOF ;
    public final void entryRuleSmartfieldElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1127:1: ( ruleSmartfieldElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1128:1: ruleSmartfieldElement EOF
            {
             before(grammarAccess.getSmartfieldElementRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElement_in_entryRuleSmartfieldElement2343);
            ruleSmartfieldElement();

            state._fsp--;

             after(grammarAccess.getSmartfieldElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElement2350); 

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
    // $ANTLR end "entryRuleSmartfieldElement"


    // $ANTLR start "ruleSmartfieldElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1135:1: ruleSmartfieldElement : ( ( rule__SmartfieldElement__Group__0 ) ) ;
    public final void ruleSmartfieldElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1139:2: ( ( ( rule__SmartfieldElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1140:1: ( ( rule__SmartfieldElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1140:1: ( ( rule__SmartfieldElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1141:1: ( rule__SmartfieldElement__Group__0 )
            {
             before(grammarAccess.getSmartfieldElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1142:1: ( rule__SmartfieldElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1142:2: rule__SmartfieldElement__Group__0
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group__0_in_ruleSmartfieldElement2376);
            rule__SmartfieldElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartfieldElement"


    // $ANTLR start "entryRuleSmartFieldElementProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1154:1: entryRuleSmartFieldElementProperties : ruleSmartFieldElementProperties EOF ;
    public final void entryRuleSmartFieldElementProperties() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1155:1: ( ruleSmartFieldElementProperties EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1156:1: ruleSmartFieldElementProperties EOF
            {
             before(grammarAccess.getSmartFieldElementPropertiesRule()); 
            pushFollow(FOLLOW_ruleSmartFieldElementProperties_in_entryRuleSmartFieldElementProperties2403);
            ruleSmartFieldElementProperties();

            state._fsp--;

             after(grammarAccess.getSmartFieldElementPropertiesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartFieldElementProperties2410); 

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
    // $ANTLR end "entryRuleSmartFieldElementProperties"


    // $ANTLR start "ruleSmartFieldElementProperties"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1163:1: ruleSmartFieldElementProperties : ( ( rule__SmartFieldElementProperties__Alternatives ) ) ;
    public final void ruleSmartFieldElementProperties() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1167:2: ( ( ( rule__SmartFieldElementProperties__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1168:1: ( ( rule__SmartFieldElementProperties__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1168:1: ( ( rule__SmartFieldElementProperties__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1169:1: ( rule__SmartFieldElementProperties__Alternatives )
            {
             before(grammarAccess.getSmartFieldElementPropertiesAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1170:1: ( rule__SmartFieldElementProperties__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1170:2: rule__SmartFieldElementProperties__Alternatives
            {
            pushFollow(FOLLOW_rule__SmartFieldElementProperties__Alternatives_in_ruleSmartFieldElementProperties2436);
            rule__SmartFieldElementProperties__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSmartFieldElementPropertiesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartFieldElementProperties"


    // $ANTLR start "entryRuleSmartfieldElementCodeAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1182:1: entryRuleSmartfieldElementCodeAttribute : ruleSmartfieldElementCodeAttribute EOF ;
    public final void entryRuleSmartfieldElementCodeAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1183:1: ( ruleSmartfieldElementCodeAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1184:1: ruleSmartfieldElementCodeAttribute EOF
            {
             before(grammarAccess.getSmartfieldElementCodeAttributeRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElementCodeAttribute_in_entryRuleSmartfieldElementCodeAttribute2463);
            ruleSmartfieldElementCodeAttribute();

            state._fsp--;

             after(grammarAccess.getSmartfieldElementCodeAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElementCodeAttribute2470); 

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
    // $ANTLR end "entryRuleSmartfieldElementCodeAttribute"


    // $ANTLR start "ruleSmartfieldElementCodeAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1191:1: ruleSmartfieldElementCodeAttribute : ( ( rule__SmartfieldElementCodeAttribute__Group__0 ) ) ;
    public final void ruleSmartfieldElementCodeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1195:2: ( ( ( rule__SmartfieldElementCodeAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1196:1: ( ( rule__SmartfieldElementCodeAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1196:1: ( ( rule__SmartfieldElementCodeAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1197:1: ( rule__SmartfieldElementCodeAttribute__Group__0 )
            {
             before(grammarAccess.getSmartfieldElementCodeAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1198:1: ( rule__SmartfieldElementCodeAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1198:2: rule__SmartfieldElementCodeAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__SmartfieldElementCodeAttribute__Group__0_in_ruleSmartfieldElementCodeAttribute2496);
            rule__SmartfieldElementCodeAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementCodeAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartfieldElementCodeAttribute"


    // $ANTLR start "entryRuleSmartfieldElementValueTypeAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1210:1: entryRuleSmartfieldElementValueTypeAttribute : ruleSmartfieldElementValueTypeAttribute EOF ;
    public final void entryRuleSmartfieldElementValueTypeAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1211:1: ( ruleSmartfieldElementValueTypeAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1212:1: ruleSmartfieldElementValueTypeAttribute EOF
            {
             before(grammarAccess.getSmartfieldElementValueTypeAttributeRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_entryRuleSmartfieldElementValueTypeAttribute2523);
            ruleSmartfieldElementValueTypeAttribute();

            state._fsp--;

             after(grammarAccess.getSmartfieldElementValueTypeAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElementValueTypeAttribute2530); 

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
    // $ANTLR end "entryRuleSmartfieldElementValueTypeAttribute"


    // $ANTLR start "ruleSmartfieldElementValueTypeAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1219:1: ruleSmartfieldElementValueTypeAttribute : ( ( rule__SmartfieldElementValueTypeAttribute__Group__0 ) ) ;
    public final void ruleSmartfieldElementValueTypeAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1223:2: ( ( ( rule__SmartfieldElementValueTypeAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1224:1: ( ( rule__SmartfieldElementValueTypeAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1224:1: ( ( rule__SmartfieldElementValueTypeAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1225:1: ( rule__SmartfieldElementValueTypeAttribute__Group__0 )
            {
             before(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1226:1: ( rule__SmartfieldElementValueTypeAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1226:2: rule__SmartfieldElementValueTypeAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__0_in_ruleSmartfieldElementValueTypeAttribute2556);
            rule__SmartfieldElementValueTypeAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartfieldElementValueTypeAttribute"


    // $ANTLR start "entryRuleSmartfieldElementLookupAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1238:1: entryRuleSmartfieldElementLookupAttribute : ruleSmartfieldElementLookupAttribute EOF ;
    public final void entryRuleSmartfieldElementLookupAttribute() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1239:1: ( ruleSmartfieldElementLookupAttribute EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1240:1: ruleSmartfieldElementLookupAttribute EOF
            {
             before(grammarAccess.getSmartfieldElementLookupAttributeRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElementLookupAttribute_in_entryRuleSmartfieldElementLookupAttribute2583);
            ruleSmartfieldElementLookupAttribute();

            state._fsp--;

             after(grammarAccess.getSmartfieldElementLookupAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElementLookupAttribute2590); 

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
    // $ANTLR end "entryRuleSmartfieldElementLookupAttribute"


    // $ANTLR start "ruleSmartfieldElementLookupAttribute"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1247:1: ruleSmartfieldElementLookupAttribute : ( ( rule__SmartfieldElementLookupAttribute__Group__0 ) ) ;
    public final void ruleSmartfieldElementLookupAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1251:2: ( ( ( rule__SmartfieldElementLookupAttribute__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1252:1: ( ( rule__SmartfieldElementLookupAttribute__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1252:1: ( ( rule__SmartfieldElementLookupAttribute__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1253:1: ( rule__SmartfieldElementLookupAttribute__Group__0 )
            {
             before(grammarAccess.getSmartfieldElementLookupAttributeAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1254:1: ( rule__SmartfieldElementLookupAttribute__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1254:2: rule__SmartfieldElementLookupAttribute__Group__0
            {
            pushFollow(FOLLOW_rule__SmartfieldElementLookupAttribute__Group__0_in_ruleSmartfieldElementLookupAttribute2616);
            rule__SmartfieldElementLookupAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementLookupAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSmartfieldElementLookupAttribute"


    // $ANTLR start "entryRuleZregBoxElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1266:1: entryRuleZregBoxElement : ruleZregBoxElement EOF ;
    public final void entryRuleZregBoxElement() throws RecognitionException {
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1267:1: ( ruleZregBoxElement EOF )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1268:1: ruleZregBoxElement EOF
            {
             before(grammarAccess.getZregBoxElementRule()); 
            pushFollow(FOLLOW_ruleZregBoxElement_in_entryRuleZregBoxElement2643);
            ruleZregBoxElement();

            state._fsp--;

             after(grammarAccess.getZregBoxElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZregBoxElement2650); 

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
    // $ANTLR end "entryRuleZregBoxElement"


    // $ANTLR start "ruleZregBoxElement"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1275:1: ruleZregBoxElement : ( ( rule__ZregBoxElement__Group__0 ) ) ;
    public final void ruleZregBoxElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1279:2: ( ( ( rule__ZregBoxElement__Group__0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1280:1: ( ( rule__ZregBoxElement__Group__0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1280:1: ( ( rule__ZregBoxElement__Group__0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1281:1: ( rule__ZregBoxElement__Group__0 )
            {
             before(grammarAccess.getZregBoxElementAccess().getGroup()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1282:1: ( rule__ZregBoxElement__Group__0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1282:2: rule__ZregBoxElement__Group__0
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group__0_in_ruleZregBoxElement2676);
            rule__ZregBoxElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZregBoxElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZregBoxElement"


    // $ANTLR start "ruleBooleanType"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1295:1: ruleBooleanType : ( ( rule__BooleanType__Alternatives ) ) ;
    public final void ruleBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1299:1: ( ( ( rule__BooleanType__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1300:1: ( ( rule__BooleanType__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1300:1: ( ( rule__BooleanType__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1301:1: ( rule__BooleanType__Alternatives )
            {
             before(grammarAccess.getBooleanTypeAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1302:1: ( rule__BooleanType__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1302:2: rule__BooleanType__Alternatives
            {
            pushFollow(FOLLOW_rule__BooleanType__Alternatives_in_ruleBooleanType2713);
            rule__BooleanType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "ruleJavaRunAtAttributeList"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1314:1: ruleJavaRunAtAttributeList : ( ( rule__JavaRunAtAttributeList__Alternatives ) ) ;
    public final void ruleJavaRunAtAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1318:1: ( ( ( rule__JavaRunAtAttributeList__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1319:1: ( ( rule__JavaRunAtAttributeList__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1319:1: ( ( rule__JavaRunAtAttributeList__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1320:1: ( rule__JavaRunAtAttributeList__Alternatives )
            {
             before(grammarAccess.getJavaRunAtAttributeListAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1321:1: ( rule__JavaRunAtAttributeList__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1321:2: rule__JavaRunAtAttributeList__Alternatives
            {
            pushFollow(FOLLOW_rule__JavaRunAtAttributeList__Alternatives_in_ruleJavaRunAtAttributeList2749);
            rule__JavaRunAtAttributeList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJavaRunAtAttributeListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJavaRunAtAttributeList"


    // $ANTLR start "ruleLogicTypeAttributeList"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1333:1: ruleLogicTypeAttributeList : ( ( rule__LogicTypeAttributeList__Alternatives ) ) ;
    public final void ruleLogicTypeAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1337:1: ( ( ( rule__LogicTypeAttributeList__Alternatives ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1338:1: ( ( rule__LogicTypeAttributeList__Alternatives ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1338:1: ( ( rule__LogicTypeAttributeList__Alternatives ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1339:1: ( rule__LogicTypeAttributeList__Alternatives )
            {
             before(grammarAccess.getLogicTypeAttributeListAccess().getAlternatives()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1340:1: ( rule__LogicTypeAttributeList__Alternatives )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1340:2: rule__LogicTypeAttributeList__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicTypeAttributeList__Alternatives_in_ruleLogicTypeAttributeList2785);
            rule__LogicTypeAttributeList__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicTypeAttributeListAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicTypeAttributeList"


    // $ANTLR start "rule__RootElement__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1351:1: rule__RootElement__Alternatives : ( ( ruleModuleElement ) | ( ruleTranslationElement ) | ( ruleCodeElement ) | ( ruleLookupElement ) | ( ruleTemplateElement ) | ( ruleFormElement ) );
    public final void rule__RootElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1355:1: ( ( ruleModuleElement ) | ( ruleTranslationElement ) | ( ruleCodeElement ) | ( ruleLookupElement ) | ( ruleTemplateElement ) | ( ruleFormElement ) )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 32:
                {
                alt2=2;
                }
                break;
            case 38:
                {
                alt2=3;
                }
                break;
            case 43:
                {
                alt2=4;
                }
                break;
            case 44:
                {
                alt2=5;
                }
                break;
            case 47:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1356:1: ( ruleModuleElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1356:1: ( ruleModuleElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1357:1: ruleModuleElement
                    {
                     before(grammarAccess.getRootElementAccess().getModuleElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleModuleElement_in_rule__RootElement__Alternatives2820);
                    ruleModuleElement();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getModuleElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1362:6: ( ruleTranslationElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1362:6: ( ruleTranslationElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1363:1: ruleTranslationElement
                    {
                     before(grammarAccess.getRootElementAccess().getTranslationElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTranslationElement_in_rule__RootElement__Alternatives2837);
                    ruleTranslationElement();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getTranslationElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1368:6: ( ruleCodeElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1368:6: ( ruleCodeElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1369:1: ruleCodeElement
                    {
                     before(grammarAccess.getRootElementAccess().getCodeElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleCodeElement_in_rule__RootElement__Alternatives2854);
                    ruleCodeElement();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getCodeElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1374:6: ( ruleLookupElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1374:6: ( ruleLookupElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1375:1: ruleLookupElement
                    {
                     before(grammarAccess.getRootElementAccess().getLookupElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleLookupElement_in_rule__RootElement__Alternatives2871);
                    ruleLookupElement();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getLookupElementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1380:6: ( ruleTemplateElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1380:6: ( ruleTemplateElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1381:1: ruleTemplateElement
                    {
                     before(grammarAccess.getRootElementAccess().getTemplateElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTemplateElement_in_rule__RootElement__Alternatives2888);
                    ruleTemplateElement();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getTemplateElementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1386:6: ( ruleFormElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1386:6: ( ruleFormElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1387:1: ruleFormElement
                    {
                     before(grammarAccess.getRootElementAccess().getFormElementParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleFormElement_in_rule__RootElement__Alternatives2905);
                    ruleFormElement();

                    state._fsp--;

                     after(grammarAccess.getRootElementAccess().getFormElementParserRuleCall_5()); 

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
    // $ANTLR end "rule__RootElement__Alternatives"


    // $ANTLR start "rule__AbstractFieldElement__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1398:1: rule__AbstractFieldElement__Alternatives : ( ( ruleAbstractValueFieldElement ) | ( ruleAbstractContainerFieldElement ) );
    public final void rule__AbstractFieldElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1402:1: ( ( ruleAbstractValueFieldElement ) | ( ruleAbstractContainerFieldElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==51||(LA3_0>=53 && LA3_0<=56)||LA3_0==60) ) {
                alt3=1;
            }
            else if ( (LA3_0==50) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1403:1: ( ruleAbstractValueFieldElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1403:1: ( ruleAbstractValueFieldElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1404:1: ruleAbstractValueFieldElement
                    {
                     before(grammarAccess.getAbstractFieldElementAccess().getAbstractValueFieldElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbstractValueFieldElement_in_rule__AbstractFieldElement__Alternatives2938);
                    ruleAbstractValueFieldElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractFieldElementAccess().getAbstractValueFieldElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1409:6: ( ruleAbstractContainerFieldElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1409:6: ( ruleAbstractContainerFieldElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1410:1: ruleAbstractContainerFieldElement
                    {
                     before(grammarAccess.getAbstractFieldElementAccess().getAbstractContainerFieldElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractContainerFieldElement_in_rule__AbstractFieldElement__Alternatives2955);
                    ruleAbstractContainerFieldElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractFieldElementAccess().getAbstractContainerFieldElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractFieldElement__Alternatives"


    // $ANTLR start "rule__AbstractFieldProperties__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1420:1: rule__AbstractFieldProperties__Alternatives : ( ( ( rule__AbstractFieldProperties__TextAssignment_0 ) ) | ( ( rule__AbstractFieldProperties__VisibleAssignment_1 ) ) | ( ( rule__AbstractFieldProperties__MasterAssignment_2 ) ) | ( ( rule__AbstractFieldProperties__EnabledAssignment_3 ) ) );
    public final void rule__AbstractFieldProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1424:1: ( ( ( rule__AbstractFieldProperties__TextAssignment_0 ) ) | ( ( rule__AbstractFieldProperties__VisibleAssignment_1 ) ) | ( ( rule__AbstractFieldProperties__MasterAssignment_2 ) ) | ( ( rule__AbstractFieldProperties__EnabledAssignment_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 28:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            case 27:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1425:1: ( ( rule__AbstractFieldProperties__TextAssignment_0 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1425:1: ( ( rule__AbstractFieldProperties__TextAssignment_0 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1426:1: ( rule__AbstractFieldProperties__TextAssignment_0 )
                    {
                     before(grammarAccess.getAbstractFieldPropertiesAccess().getTextAssignment_0()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1427:1: ( rule__AbstractFieldProperties__TextAssignment_0 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1427:2: rule__AbstractFieldProperties__TextAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AbstractFieldProperties__TextAssignment_0_in_rule__AbstractFieldProperties__Alternatives2987);
                    rule__AbstractFieldProperties__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractFieldPropertiesAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1431:6: ( ( rule__AbstractFieldProperties__VisibleAssignment_1 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1431:6: ( ( rule__AbstractFieldProperties__VisibleAssignment_1 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1432:1: ( rule__AbstractFieldProperties__VisibleAssignment_1 )
                    {
                     before(grammarAccess.getAbstractFieldPropertiesAccess().getVisibleAssignment_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1433:1: ( rule__AbstractFieldProperties__VisibleAssignment_1 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1433:2: rule__AbstractFieldProperties__VisibleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AbstractFieldProperties__VisibleAssignment_1_in_rule__AbstractFieldProperties__Alternatives3005);
                    rule__AbstractFieldProperties__VisibleAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractFieldPropertiesAccess().getVisibleAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1437:6: ( ( rule__AbstractFieldProperties__MasterAssignment_2 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1437:6: ( ( rule__AbstractFieldProperties__MasterAssignment_2 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1438:1: ( rule__AbstractFieldProperties__MasterAssignment_2 )
                    {
                     before(grammarAccess.getAbstractFieldPropertiesAccess().getMasterAssignment_2()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1439:1: ( rule__AbstractFieldProperties__MasterAssignment_2 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1439:2: rule__AbstractFieldProperties__MasterAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AbstractFieldProperties__MasterAssignment_2_in_rule__AbstractFieldProperties__Alternatives3023);
                    rule__AbstractFieldProperties__MasterAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractFieldPropertiesAccess().getMasterAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1443:6: ( ( rule__AbstractFieldProperties__EnabledAssignment_3 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1443:6: ( ( rule__AbstractFieldProperties__EnabledAssignment_3 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1444:1: ( rule__AbstractFieldProperties__EnabledAssignment_3 )
                    {
                     before(grammarAccess.getAbstractFieldPropertiesAccess().getEnabledAssignment_3()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1445:1: ( rule__AbstractFieldProperties__EnabledAssignment_3 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1445:2: rule__AbstractFieldProperties__EnabledAssignment_3
                    {
                    pushFollow(FOLLOW_rule__AbstractFieldProperties__EnabledAssignment_3_in_rule__AbstractFieldProperties__Alternatives3041);
                    rule__AbstractFieldProperties__EnabledAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractFieldPropertiesAccess().getEnabledAssignment_3()); 

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
    // $ANTLR end "rule__AbstractFieldProperties__Alternatives"


    // $ANTLR start "rule__AbstractValueFieldElement__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1454:1: rule__AbstractValueFieldElement__Alternatives : ( ( ruleStringElement ) | ( ruleSmartfieldElement ) | ( ruleLongElement ) | ( ruleDoubleElement ) | ( ruleDateElement ) | ( ruleZregBoxElement ) );
    public final void rule__AbstractValueFieldElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1458:1: ( ( ruleStringElement ) | ( ruleSmartfieldElement ) | ( ruleLongElement ) | ( ruleDoubleElement ) | ( ruleDateElement ) | ( ruleZregBoxElement ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt5=1;
                }
                break;
            case 56:
                {
                alt5=2;
                }
                break;
            case 54:
                {
                alt5=3;
                }
                break;
            case 53:
                {
                alt5=4;
                }
                break;
            case 55:
                {
                alt5=5;
                }
                break;
            case 60:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1459:1: ( ruleStringElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1459:1: ( ruleStringElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1460:1: ruleStringElement
                    {
                     before(grammarAccess.getAbstractValueFieldElementAccess().getStringElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStringElement_in_rule__AbstractValueFieldElement__Alternatives3074);
                    ruleStringElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueFieldElementAccess().getStringElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1465:6: ( ruleSmartfieldElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1465:6: ( ruleSmartfieldElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1466:1: ruleSmartfieldElement
                    {
                     before(grammarAccess.getAbstractValueFieldElementAccess().getSmartfieldElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSmartfieldElement_in_rule__AbstractValueFieldElement__Alternatives3091);
                    ruleSmartfieldElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueFieldElementAccess().getSmartfieldElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1471:6: ( ruleLongElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1471:6: ( ruleLongElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1472:1: ruleLongElement
                    {
                     before(grammarAccess.getAbstractValueFieldElementAccess().getLongElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleLongElement_in_rule__AbstractValueFieldElement__Alternatives3108);
                    ruleLongElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueFieldElementAccess().getLongElementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1477:6: ( ruleDoubleElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1477:6: ( ruleDoubleElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1478:1: ruleDoubleElement
                    {
                     before(grammarAccess.getAbstractValueFieldElementAccess().getDoubleElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDoubleElement_in_rule__AbstractValueFieldElement__Alternatives3125);
                    ruleDoubleElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueFieldElementAccess().getDoubleElementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1483:6: ( ruleDateElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1483:6: ( ruleDateElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1484:1: ruleDateElement
                    {
                     before(grammarAccess.getAbstractValueFieldElementAccess().getDateElementParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDateElement_in_rule__AbstractValueFieldElement__Alternatives3142);
                    ruleDateElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueFieldElementAccess().getDateElementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1489:6: ( ruleZregBoxElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1489:6: ( ruleZregBoxElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1490:1: ruleZregBoxElement
                    {
                     before(grammarAccess.getAbstractValueFieldElementAccess().getZregBoxElementParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleZregBoxElement_in_rule__AbstractValueFieldElement__Alternatives3159);
                    ruleZregBoxElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueFieldElementAccess().getZregBoxElementParserRuleCall_5()); 

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
    // $ANTLR end "rule__AbstractValueFieldElement__Alternatives"


    // $ANTLR start "rule__AbstractValueFieldProperties__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1500:1: rule__AbstractValueFieldProperties__Alternatives : ( ( ruleAbstractFieldProperties ) | ( ( rule__AbstractValueFieldProperties__MandatoryAssignment_1 ) ) );
    public final void rule__AbstractValueFieldProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1504:1: ( ( ruleAbstractFieldProperties ) | ( ( rule__AbstractValueFieldProperties__MandatoryAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=26 && LA6_0<=29)) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1505:1: ( ruleAbstractFieldProperties )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1505:1: ( ruleAbstractFieldProperties )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1506:1: ruleAbstractFieldProperties
                    {
                     before(grammarAccess.getAbstractValueFieldPropertiesAccess().getAbstractFieldPropertiesParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbstractFieldProperties_in_rule__AbstractValueFieldProperties__Alternatives3191);
                    ruleAbstractFieldProperties();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueFieldPropertiesAccess().getAbstractFieldPropertiesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1511:6: ( ( rule__AbstractValueFieldProperties__MandatoryAssignment_1 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1511:6: ( ( rule__AbstractValueFieldProperties__MandatoryAssignment_1 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1512:1: ( rule__AbstractValueFieldProperties__MandatoryAssignment_1 )
                    {
                     before(grammarAccess.getAbstractValueFieldPropertiesAccess().getMandatoryAssignment_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1513:1: ( rule__AbstractValueFieldProperties__MandatoryAssignment_1 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1513:2: rule__AbstractValueFieldProperties__MandatoryAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AbstractValueFieldProperties__MandatoryAssignment_1_in_rule__AbstractValueFieldProperties__Alternatives3208);
                    rule__AbstractValueFieldProperties__MandatoryAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAbstractValueFieldPropertiesAccess().getMandatoryAssignment_1()); 

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
    // $ANTLR end "rule__AbstractValueFieldProperties__Alternatives"


    // $ANTLR start "rule__LogicOptionalProperties__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1522:1: rule__LogicOptionalProperties__Alternatives : ( ( ( rule__LogicOptionalProperties__RunatAssignment_0 ) ) | ( ( rule__LogicOptionalProperties__ExecAssignment_1 ) ) );
    public final void rule__LogicOptionalProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1526:1: ( ( ( rule__LogicOptionalProperties__RunatAssignment_0 ) ) | ( ( rule__LogicOptionalProperties__ExecAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            else if ( (LA7_0==42) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1527:1: ( ( rule__LogicOptionalProperties__RunatAssignment_0 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1527:1: ( ( rule__LogicOptionalProperties__RunatAssignment_0 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1528:1: ( rule__LogicOptionalProperties__RunatAssignment_0 )
                    {
                     before(grammarAccess.getLogicOptionalPropertiesAccess().getRunatAssignment_0()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1529:1: ( rule__LogicOptionalProperties__RunatAssignment_0 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1529:2: rule__LogicOptionalProperties__RunatAssignment_0
                    {
                    pushFollow(FOLLOW_rule__LogicOptionalProperties__RunatAssignment_0_in_rule__LogicOptionalProperties__Alternatives3241);
                    rule__LogicOptionalProperties__RunatAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicOptionalPropertiesAccess().getRunatAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1533:6: ( ( rule__LogicOptionalProperties__ExecAssignment_1 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1533:6: ( ( rule__LogicOptionalProperties__ExecAssignment_1 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1534:1: ( rule__LogicOptionalProperties__ExecAssignment_1 )
                    {
                     before(grammarAccess.getLogicOptionalPropertiesAccess().getExecAssignment_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1535:1: ( rule__LogicOptionalProperties__ExecAssignment_1 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1535:2: rule__LogicOptionalProperties__ExecAssignment_1
                    {
                    pushFollow(FOLLOW_rule__LogicOptionalProperties__ExecAssignment_1_in_rule__LogicOptionalProperties__Alternatives3259);
                    rule__LogicOptionalProperties__ExecAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicOptionalPropertiesAccess().getExecAssignment_1()); 

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
    // $ANTLR end "rule__LogicOptionalProperties__Alternatives"


    // $ANTLR start "rule__LookupElement__ServicelogicAlternatives_3_0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1544:1: rule__LookupElement__ServicelogicAlternatives_3_0 : ( ( ruleJavaElement ) | ( ruleLogicElement ) );
    public final void rule__LookupElement__ServicelogicAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1548:1: ( ( ruleJavaElement ) | ( ruleLogicElement ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1549:1: ( ruleJavaElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1549:1: ( ruleJavaElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1550:1: ruleJavaElement
                    {
                     before(grammarAccess.getLookupElementAccess().getServicelogicJavaElementParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleJavaElement_in_rule__LookupElement__ServicelogicAlternatives_3_03292);
                    ruleJavaElement();

                    state._fsp--;

                     after(grammarAccess.getLookupElementAccess().getServicelogicJavaElementParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1555:6: ( ruleLogicElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1555:6: ( ruleLogicElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1556:1: ruleLogicElement
                    {
                     before(grammarAccess.getLookupElementAccess().getServicelogicLogicElementParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleLogicElement_in_rule__LookupElement__ServicelogicAlternatives_3_03309);
                    ruleLogicElement();

                    state._fsp--;

                     after(grammarAccess.getLookupElementAccess().getServicelogicLogicElementParserRuleCall_3_0_1()); 

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
    // $ANTLR end "rule__LookupElement__ServicelogicAlternatives_3_0"


    // $ANTLR start "rule__FormElement__ElementsAlternatives_6_0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1566:1: rule__FormElement__ElementsAlternatives_6_0 : ( ( ruleLogicElement ) | ( ruleJavaElement ) | ( ruleAbstractFieldElement ) );
    public final void rule__FormElement__ElementsAlternatives_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1570:1: ( ( ruleLogicElement ) | ( ruleJavaElement ) | ( ruleAbstractFieldElement ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 34:
                {
                alt9=2;
                }
                break;
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 60:
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
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1571:1: ( ruleLogicElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1571:1: ( ruleLogicElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1572:1: ruleLogicElement
                    {
                     before(grammarAccess.getFormElementAccess().getElementsLogicElementParserRuleCall_6_0_0()); 
                    pushFollow(FOLLOW_ruleLogicElement_in_rule__FormElement__ElementsAlternatives_6_03341);
                    ruleLogicElement();

                    state._fsp--;

                     after(grammarAccess.getFormElementAccess().getElementsLogicElementParserRuleCall_6_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1577:6: ( ruleJavaElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1577:6: ( ruleJavaElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1578:1: ruleJavaElement
                    {
                     before(grammarAccess.getFormElementAccess().getElementsJavaElementParserRuleCall_6_0_1()); 
                    pushFollow(FOLLOW_ruleJavaElement_in_rule__FormElement__ElementsAlternatives_6_03358);
                    ruleJavaElement();

                    state._fsp--;

                     after(grammarAccess.getFormElementAccess().getElementsJavaElementParserRuleCall_6_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1583:6: ( ruleAbstractFieldElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1583:6: ( ruleAbstractFieldElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1584:1: ruleAbstractFieldElement
                    {
                     before(grammarAccess.getFormElementAccess().getElementsAbstractFieldElementParserRuleCall_6_0_2()); 
                    pushFollow(FOLLOW_ruleAbstractFieldElement_in_rule__FormElement__ElementsAlternatives_6_03375);
                    ruleAbstractFieldElement();

                    state._fsp--;

                     after(grammarAccess.getFormElementAccess().getElementsAbstractFieldElementParserRuleCall_6_0_2()); 

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
    // $ANTLR end "rule__FormElement__ElementsAlternatives_6_0"


    // $ANTLR start "rule__SequenceBoxElement__ChildrenAlternatives_3_1_0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1594:1: rule__SequenceBoxElement__ChildrenAlternatives_3_1_0 : ( ( ruleLogicElement ) | ( ruleAbstractFieldElement ) );
    public final void rule__SequenceBoxElement__ChildrenAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1598:1: ( ( ruleLogicElement ) | ( ruleAbstractFieldElement ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==40) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=50 && LA10_0<=51)||(LA10_0>=53 && LA10_0<=56)||LA10_0==60) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1599:1: ( ruleLogicElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1599:1: ( ruleLogicElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1600:1: ruleLogicElement
                    {
                     before(grammarAccess.getSequenceBoxElementAccess().getChildrenLogicElementParserRuleCall_3_1_0_0()); 
                    pushFollow(FOLLOW_ruleLogicElement_in_rule__SequenceBoxElement__ChildrenAlternatives_3_1_03407);
                    ruleLogicElement();

                    state._fsp--;

                     after(grammarAccess.getSequenceBoxElementAccess().getChildrenLogicElementParserRuleCall_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1605:6: ( ruleAbstractFieldElement )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1605:6: ( ruleAbstractFieldElement )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1606:1: ruleAbstractFieldElement
                    {
                     before(grammarAccess.getSequenceBoxElementAccess().getChildrenAbstractFieldElementParserRuleCall_3_1_0_1()); 
                    pushFollow(FOLLOW_ruleAbstractFieldElement_in_rule__SequenceBoxElement__ChildrenAlternatives_3_1_03424);
                    ruleAbstractFieldElement();

                    state._fsp--;

                     after(grammarAccess.getSequenceBoxElementAccess().getChildrenAbstractFieldElementParserRuleCall_3_1_0_1()); 

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
    // $ANTLR end "rule__SequenceBoxElement__ChildrenAlternatives_3_1_0"


    // $ANTLR start "rule__StringElementProperties__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1616:1: rule__StringElementProperties__Alternatives : ( ( ruleAbstractValueFieldProperties ) | ( ( rule__StringElementProperties__MaxlenAssignment_1 ) ) );
    public final void rule__StringElementProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1620:1: ( ( ruleAbstractValueFieldProperties ) | ( ( rule__StringElementProperties__MaxlenAssignment_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=26 && LA11_0<=30)) ) {
                alt11=1;
            }
            else if ( (LA11_0==52) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1621:1: ( ruleAbstractValueFieldProperties )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1621:1: ( ruleAbstractValueFieldProperties )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1622:1: ruleAbstractValueFieldProperties
                    {
                     before(grammarAccess.getStringElementPropertiesAccess().getAbstractValueFieldPropertiesParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_rule__StringElementProperties__Alternatives3456);
                    ruleAbstractValueFieldProperties();

                    state._fsp--;

                     after(grammarAccess.getStringElementPropertiesAccess().getAbstractValueFieldPropertiesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1627:6: ( ( rule__StringElementProperties__MaxlenAssignment_1 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1627:6: ( ( rule__StringElementProperties__MaxlenAssignment_1 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1628:1: ( rule__StringElementProperties__MaxlenAssignment_1 )
                    {
                     before(grammarAccess.getStringElementPropertiesAccess().getMaxlenAssignment_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1629:1: ( rule__StringElementProperties__MaxlenAssignment_1 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1629:2: rule__StringElementProperties__MaxlenAssignment_1
                    {
                    pushFollow(FOLLOW_rule__StringElementProperties__MaxlenAssignment_1_in_rule__StringElementProperties__Alternatives3473);
                    rule__StringElementProperties__MaxlenAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringElementPropertiesAccess().getMaxlenAssignment_1()); 

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
    // $ANTLR end "rule__StringElementProperties__Alternatives"


    // $ANTLR start "rule__SmartFieldElementProperties__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1638:1: rule__SmartFieldElementProperties__Alternatives : ( ( ruleAbstractValueFieldProperties ) | ( ( rule__SmartFieldElementProperties__CodeAssignment_1 ) ) | ( ( rule__SmartFieldElementProperties__Value_typeAssignment_2 ) ) | ( ( rule__SmartFieldElementProperties__LookupAssignment_3 ) ) );
    public final void rule__SmartFieldElementProperties__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1642:1: ( ( ruleAbstractValueFieldProperties ) | ( ( rule__SmartFieldElementProperties__CodeAssignment_1 ) ) | ( ( rule__SmartFieldElementProperties__Value_typeAssignment_2 ) ) | ( ( rule__SmartFieldElementProperties__LookupAssignment_3 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt12=1;
                }
                break;
            case 57:
                {
                alt12=2;
                }
                break;
            case 58:
                {
                alt12=3;
                }
                break;
            case 59:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1643:1: ( ruleAbstractValueFieldProperties )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1643:1: ( ruleAbstractValueFieldProperties )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1644:1: ruleAbstractValueFieldProperties
                    {
                     before(grammarAccess.getSmartFieldElementPropertiesAccess().getAbstractValueFieldPropertiesParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_rule__SmartFieldElementProperties__Alternatives3506);
                    ruleAbstractValueFieldProperties();

                    state._fsp--;

                     after(grammarAccess.getSmartFieldElementPropertiesAccess().getAbstractValueFieldPropertiesParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1649:6: ( ( rule__SmartFieldElementProperties__CodeAssignment_1 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1649:6: ( ( rule__SmartFieldElementProperties__CodeAssignment_1 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1650:1: ( rule__SmartFieldElementProperties__CodeAssignment_1 )
                    {
                     before(grammarAccess.getSmartFieldElementPropertiesAccess().getCodeAssignment_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1651:1: ( rule__SmartFieldElementProperties__CodeAssignment_1 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1651:2: rule__SmartFieldElementProperties__CodeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SmartFieldElementProperties__CodeAssignment_1_in_rule__SmartFieldElementProperties__Alternatives3523);
                    rule__SmartFieldElementProperties__CodeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSmartFieldElementPropertiesAccess().getCodeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1655:6: ( ( rule__SmartFieldElementProperties__Value_typeAssignment_2 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1655:6: ( ( rule__SmartFieldElementProperties__Value_typeAssignment_2 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1656:1: ( rule__SmartFieldElementProperties__Value_typeAssignment_2 )
                    {
                     before(grammarAccess.getSmartFieldElementPropertiesAccess().getValue_typeAssignment_2()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1657:1: ( rule__SmartFieldElementProperties__Value_typeAssignment_2 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1657:2: rule__SmartFieldElementProperties__Value_typeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SmartFieldElementProperties__Value_typeAssignment_2_in_rule__SmartFieldElementProperties__Alternatives3541);
                    rule__SmartFieldElementProperties__Value_typeAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSmartFieldElementPropertiesAccess().getValue_typeAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1661:6: ( ( rule__SmartFieldElementProperties__LookupAssignment_3 ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1661:6: ( ( rule__SmartFieldElementProperties__LookupAssignment_3 ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1662:1: ( rule__SmartFieldElementProperties__LookupAssignment_3 )
                    {
                     before(grammarAccess.getSmartFieldElementPropertiesAccess().getLookupAssignment_3()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1663:1: ( rule__SmartFieldElementProperties__LookupAssignment_3 )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1663:2: rule__SmartFieldElementProperties__LookupAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SmartFieldElementProperties__LookupAssignment_3_in_rule__SmartFieldElementProperties__Alternatives3559);
                    rule__SmartFieldElementProperties__LookupAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSmartFieldElementPropertiesAccess().getLookupAssignment_3()); 

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
    // $ANTLR end "rule__SmartFieldElementProperties__Alternatives"


    // $ANTLR start "rule__BooleanType__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1672:1: rule__BooleanType__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__BooleanType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1676:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==11) ) {
                alt13=1;
            }
            else if ( (LA13_0==12) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1677:1: ( ( 'true' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1677:1: ( ( 'true' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1678:1: ( 'true' )
                    {
                     before(grammarAccess.getBooleanTypeAccess().getTrueEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1679:1: ( 'true' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1679:3: 'true'
                    {
                    match(input,11,FOLLOW_11_in_rule__BooleanType__Alternatives3593); 

                    }

                     after(grammarAccess.getBooleanTypeAccess().getTrueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1684:6: ( ( 'false' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1684:6: ( ( 'false' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1685:1: ( 'false' )
                    {
                     before(grammarAccess.getBooleanTypeAccess().getFalseEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1686:1: ( 'false' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1686:3: 'false'
                    {
                    match(input,12,FOLLOW_12_in_rule__BooleanType__Alternatives3614); 

                    }

                     after(grammarAccess.getBooleanTypeAccess().getFalseEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanType__Alternatives"


    // $ANTLR start "rule__JavaRunAtAttributeList__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1696:1: rule__JavaRunAtAttributeList__Alternatives : ( ( ( 'client' ) ) | ( ( 'server' ) ) );
    public final void rule__JavaRunAtAttributeList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1700:1: ( ( ( 'client' ) ) | ( ( 'server' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1701:1: ( ( 'client' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1701:1: ( ( 'client' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1702:1: ( 'client' )
                    {
                     before(grammarAccess.getJavaRunAtAttributeListAccess().getClientEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1703:1: ( 'client' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1703:3: 'client'
                    {
                    match(input,13,FOLLOW_13_in_rule__JavaRunAtAttributeList__Alternatives3650); 

                    }

                     after(grammarAccess.getJavaRunAtAttributeListAccess().getClientEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1708:6: ( ( 'server' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1708:6: ( ( 'server' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1709:1: ( 'server' )
                    {
                     before(grammarAccess.getJavaRunAtAttributeListAccess().getServerEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1710:1: ( 'server' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1710:3: 'server'
                    {
                    match(input,14,FOLLOW_14_in_rule__JavaRunAtAttributeList__Alternatives3671); 

                    }

                     after(grammarAccess.getJavaRunAtAttributeListAccess().getServerEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__JavaRunAtAttributeList__Alternatives"


    // $ANTLR start "rule__LogicTypeAttributeList__Alternatives"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1720:1: rule__LogicTypeAttributeList__Alternatives : ( ( ( 'global' ) ) | ( ( 'all' ) ) | ( ( 'modify_load' ) ) | ( ( 'modify_store' ) ) | ( ( 'new_load' ) ) | ( ( 'new_store' ) ) | ( ( 'changed' ) ) | ( ( 'click' ) ) | ( ( 'master_changed' ) ) | ( ( 'init' ) ) );
    public final void rule__LogicTypeAttributeList__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1724:1: ( ( ( 'global' ) ) | ( ( 'all' ) ) | ( ( 'modify_load' ) ) | ( ( 'modify_store' ) ) | ( ( 'new_load' ) ) | ( ( 'new_store' ) ) | ( ( 'changed' ) ) | ( ( 'click' ) ) | ( ( 'master_changed' ) ) | ( ( 'init' ) ) )
            int alt15=10;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt15=1;
                }
                break;
            case 16:
                {
                alt15=2;
                }
                break;
            case 17:
                {
                alt15=3;
                }
                break;
            case 18:
                {
                alt15=4;
                }
                break;
            case 19:
                {
                alt15=5;
                }
                break;
            case 20:
                {
                alt15=6;
                }
                break;
            case 21:
                {
                alt15=7;
                }
                break;
            case 22:
                {
                alt15=8;
                }
                break;
            case 23:
                {
                alt15=9;
                }
                break;
            case 24:
                {
                alt15=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1725:1: ( ( 'global' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1725:1: ( ( 'global' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1726:1: ( 'global' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getGlobalEnumLiteralDeclaration_0()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1727:1: ( 'global' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1727:3: 'global'
                    {
                    match(input,15,FOLLOW_15_in_rule__LogicTypeAttributeList__Alternatives3707); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getGlobalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1732:6: ( ( 'all' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1732:6: ( ( 'all' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1733:1: ( 'all' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getAllEnumLiteralDeclaration_1()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1734:1: ( 'all' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1734:3: 'all'
                    {
                    match(input,16,FOLLOW_16_in_rule__LogicTypeAttributeList__Alternatives3728); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getAllEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1739:6: ( ( 'modify_load' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1739:6: ( ( 'modify_load' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1740:1: ( 'modify_load' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getModify_loadEnumLiteralDeclaration_2()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1741:1: ( 'modify_load' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1741:3: 'modify_load'
                    {
                    match(input,17,FOLLOW_17_in_rule__LogicTypeAttributeList__Alternatives3749); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getModify_loadEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1746:6: ( ( 'modify_store' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1746:6: ( ( 'modify_store' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1747:1: ( 'modify_store' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getModify_storeEnumLiteralDeclaration_3()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1748:1: ( 'modify_store' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1748:3: 'modify_store'
                    {
                    match(input,18,FOLLOW_18_in_rule__LogicTypeAttributeList__Alternatives3770); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getModify_storeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1753:6: ( ( 'new_load' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1753:6: ( ( 'new_load' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1754:1: ( 'new_load' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getNew_loadEnumLiteralDeclaration_4()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1755:1: ( 'new_load' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1755:3: 'new_load'
                    {
                    match(input,19,FOLLOW_19_in_rule__LogicTypeAttributeList__Alternatives3791); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getNew_loadEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1760:6: ( ( 'new_store' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1760:6: ( ( 'new_store' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1761:1: ( 'new_store' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getNew_storeEnumLiteralDeclaration_5()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1762:1: ( 'new_store' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1762:3: 'new_store'
                    {
                    match(input,20,FOLLOW_20_in_rule__LogicTypeAttributeList__Alternatives3812); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getNew_storeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1767:6: ( ( 'changed' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1767:6: ( ( 'changed' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1768:1: ( 'changed' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getChangedEnumLiteralDeclaration_6()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1769:1: ( 'changed' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1769:3: 'changed'
                    {
                    match(input,21,FOLLOW_21_in_rule__LogicTypeAttributeList__Alternatives3833); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getChangedEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1774:6: ( ( 'click' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1774:6: ( ( 'click' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1775:1: ( 'click' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getClickEnumLiteralDeclaration_7()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1776:1: ( 'click' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1776:3: 'click'
                    {
                    match(input,22,FOLLOW_22_in_rule__LogicTypeAttributeList__Alternatives3854); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getClickEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1781:6: ( ( 'master_changed' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1781:6: ( ( 'master_changed' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1782:1: ( 'master_changed' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getMaster_changedEnumLiteralDeclaration_8()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1783:1: ( 'master_changed' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1783:3: 'master_changed'
                    {
                    match(input,23,FOLLOW_23_in_rule__LogicTypeAttributeList__Alternatives3875); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getMaster_changedEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1788:6: ( ( 'init' ) )
                    {
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1788:6: ( ( 'init' ) )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1789:1: ( 'init' )
                    {
                     before(grammarAccess.getLogicTypeAttributeListAccess().getInitEnumLiteralDeclaration_9()); 
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1790:1: ( 'init' )
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1790:3: 'init'
                    {
                    match(input,24,FOLLOW_24_in_rule__LogicTypeAttributeList__Alternatives3896); 

                    }

                     after(grammarAccess.getLogicTypeAttributeListAccess().getInitEnumLiteralDeclaration_9()); 

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
    // $ANTLR end "rule__LogicTypeAttributeList__Alternatives"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1802:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1806:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1807:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03929);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03932);
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1814:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1818:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1819:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1819:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1820:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3959); 
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1831:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1835:1: ( rule__QualifiedName__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1836:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13988);
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1842:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1846:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1847:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1847:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1848:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1849:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1849:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4015);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1863:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1867:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1868:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04050);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04053);
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1875:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1879:1: ( ( '.' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1880:1: ( '.' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1880:1: ( '.' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1881:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl4081); 
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1894:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1898:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1899:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14112);
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
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1905:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1909:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1910:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1910:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1911:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4139); 
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


    // $ANTLR start "rule__TextAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1926:1: rule__TextAttribute__Group__0 : rule__TextAttribute__Group__0__Impl rule__TextAttribute__Group__1 ;
    public final void rule__TextAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1930:1: ( rule__TextAttribute__Group__0__Impl rule__TextAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1931:2: rule__TextAttribute__Group__0__Impl rule__TextAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TextAttribute__Group__0__Impl_in_rule__TextAttribute__Group__04172);
            rule__TextAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextAttribute__Group__1_in_rule__TextAttribute__Group__04175);
            rule__TextAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAttribute__Group__0"


    // $ANTLR start "rule__TextAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1938:1: rule__TextAttribute__Group__0__Impl : ( 'text=' ) ;
    public final void rule__TextAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1942:1: ( ( 'text=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1943:1: ( 'text=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1943:1: ( 'text=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1944:1: 'text='
            {
             before(grammarAccess.getTextAttributeAccess().getTextKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__TextAttribute__Group__0__Impl4203); 
             after(grammarAccess.getTextAttributeAccess().getTextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAttribute__Group__0__Impl"


    // $ANTLR start "rule__TextAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1957:1: rule__TextAttribute__Group__1 : rule__TextAttribute__Group__1__Impl ;
    public final void rule__TextAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1961:1: ( rule__TextAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1962:2: rule__TextAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextAttribute__Group__1__Impl_in_rule__TextAttribute__Group__14234);
            rule__TextAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAttribute__Group__1"


    // $ANTLR start "rule__TextAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1968:1: rule__TextAttribute__Group__1__Impl : ( ( rule__TextAttribute__ValueAssignment_1 ) ) ;
    public final void rule__TextAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1972:1: ( ( ( rule__TextAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1973:1: ( ( rule__TextAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1973:1: ( ( rule__TextAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1974:1: ( rule__TextAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getTextAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1975:1: ( rule__TextAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1975:2: rule__TextAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__TextAttribute__ValueAssignment_1_in_rule__TextAttribute__Group__1__Impl4261);
            rule__TextAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAttribute__Group__1__Impl"


    // $ANTLR start "rule__EnabledAttribue__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1989:1: rule__EnabledAttribue__Group__0 : rule__EnabledAttribue__Group__0__Impl rule__EnabledAttribue__Group__1 ;
    public final void rule__EnabledAttribue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1993:1: ( rule__EnabledAttribue__Group__0__Impl rule__EnabledAttribue__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:1994:2: rule__EnabledAttribue__Group__0__Impl rule__EnabledAttribue__Group__1
            {
            pushFollow(FOLLOW_rule__EnabledAttribue__Group__0__Impl_in_rule__EnabledAttribue__Group__04295);
            rule__EnabledAttribue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EnabledAttribue__Group__1_in_rule__EnabledAttribue__Group__04298);
            rule__EnabledAttribue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnabledAttribue__Group__0"


    // $ANTLR start "rule__EnabledAttribue__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2001:1: rule__EnabledAttribue__Group__0__Impl : ( 'enabled=' ) ;
    public final void rule__EnabledAttribue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2005:1: ( ( 'enabled=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2006:1: ( 'enabled=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2006:1: ( 'enabled=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2007:1: 'enabled='
            {
             before(grammarAccess.getEnabledAttribueAccess().getEnabledKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__EnabledAttribue__Group__0__Impl4326); 
             after(grammarAccess.getEnabledAttribueAccess().getEnabledKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnabledAttribue__Group__0__Impl"


    // $ANTLR start "rule__EnabledAttribue__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2020:1: rule__EnabledAttribue__Group__1 : rule__EnabledAttribue__Group__1__Impl ;
    public final void rule__EnabledAttribue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2024:1: ( rule__EnabledAttribue__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2025:2: rule__EnabledAttribue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EnabledAttribue__Group__1__Impl_in_rule__EnabledAttribue__Group__14357);
            rule__EnabledAttribue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnabledAttribue__Group__1"


    // $ANTLR start "rule__EnabledAttribue__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2031:1: rule__EnabledAttribue__Group__1__Impl : ( ( rule__EnabledAttribue__ValueAssignment_1 ) ) ;
    public final void rule__EnabledAttribue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2035:1: ( ( ( rule__EnabledAttribue__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2036:1: ( ( rule__EnabledAttribue__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2036:1: ( ( rule__EnabledAttribue__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2037:1: ( rule__EnabledAttribue__ValueAssignment_1 )
            {
             before(grammarAccess.getEnabledAttribueAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2038:1: ( rule__EnabledAttribue__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2038:2: rule__EnabledAttribue__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__EnabledAttribue__ValueAssignment_1_in_rule__EnabledAttribue__Group__1__Impl4384);
            rule__EnabledAttribue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnabledAttribueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnabledAttribue__Group__1__Impl"


    // $ANTLR start "rule__VisibleAttribue__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2052:1: rule__VisibleAttribue__Group__0 : rule__VisibleAttribue__Group__0__Impl rule__VisibleAttribue__Group__1 ;
    public final void rule__VisibleAttribue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2056:1: ( rule__VisibleAttribue__Group__0__Impl rule__VisibleAttribue__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2057:2: rule__VisibleAttribue__Group__0__Impl rule__VisibleAttribue__Group__1
            {
            pushFollow(FOLLOW_rule__VisibleAttribue__Group__0__Impl_in_rule__VisibleAttribue__Group__04418);
            rule__VisibleAttribue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VisibleAttribue__Group__1_in_rule__VisibleAttribue__Group__04421);
            rule__VisibleAttribue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibleAttribue__Group__0"


    // $ANTLR start "rule__VisibleAttribue__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2064:1: rule__VisibleAttribue__Group__0__Impl : ( 'visible=' ) ;
    public final void rule__VisibleAttribue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2068:1: ( ( 'visible=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2069:1: ( 'visible=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2069:1: ( 'visible=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2070:1: 'visible='
            {
             before(grammarAccess.getVisibleAttribueAccess().getVisibleKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__VisibleAttribue__Group__0__Impl4449); 
             after(grammarAccess.getVisibleAttribueAccess().getVisibleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibleAttribue__Group__0__Impl"


    // $ANTLR start "rule__VisibleAttribue__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2083:1: rule__VisibleAttribue__Group__1 : rule__VisibleAttribue__Group__1__Impl ;
    public final void rule__VisibleAttribue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2087:1: ( rule__VisibleAttribue__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2088:2: rule__VisibleAttribue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__VisibleAttribue__Group__1__Impl_in_rule__VisibleAttribue__Group__14480);
            rule__VisibleAttribue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibleAttribue__Group__1"


    // $ANTLR start "rule__VisibleAttribue__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2094:1: rule__VisibleAttribue__Group__1__Impl : ( ( rule__VisibleAttribue__ValueAssignment_1 ) ) ;
    public final void rule__VisibleAttribue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2098:1: ( ( ( rule__VisibleAttribue__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2099:1: ( ( rule__VisibleAttribue__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2099:1: ( ( rule__VisibleAttribue__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2100:1: ( rule__VisibleAttribue__ValueAssignment_1 )
            {
             before(grammarAccess.getVisibleAttribueAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2101:1: ( rule__VisibleAttribue__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2101:2: rule__VisibleAttribue__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__VisibleAttribue__ValueAssignment_1_in_rule__VisibleAttribue__Group__1__Impl4507);
            rule__VisibleAttribue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVisibleAttribueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibleAttribue__Group__1__Impl"


    // $ANTLR start "rule__MasterAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2115:1: rule__MasterAttribute__Group__0 : rule__MasterAttribute__Group__0__Impl rule__MasterAttribute__Group__1 ;
    public final void rule__MasterAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2119:1: ( rule__MasterAttribute__Group__0__Impl rule__MasterAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2120:2: rule__MasterAttribute__Group__0__Impl rule__MasterAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__MasterAttribute__Group__0__Impl_in_rule__MasterAttribute__Group__04541);
            rule__MasterAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MasterAttribute__Group__1_in_rule__MasterAttribute__Group__04544);
            rule__MasterAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MasterAttribute__Group__0"


    // $ANTLR start "rule__MasterAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2127:1: rule__MasterAttribute__Group__0__Impl : ( 'master=' ) ;
    public final void rule__MasterAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2131:1: ( ( 'master=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2132:1: ( 'master=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2132:1: ( 'master=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2133:1: 'master='
            {
             before(grammarAccess.getMasterAttributeAccess().getMasterKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__MasterAttribute__Group__0__Impl4572); 
             after(grammarAccess.getMasterAttributeAccess().getMasterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MasterAttribute__Group__0__Impl"


    // $ANTLR start "rule__MasterAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2146:1: rule__MasterAttribute__Group__1 : rule__MasterAttribute__Group__1__Impl ;
    public final void rule__MasterAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2150:1: ( rule__MasterAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2151:2: rule__MasterAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MasterAttribute__Group__1__Impl_in_rule__MasterAttribute__Group__14603);
            rule__MasterAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MasterAttribute__Group__1"


    // $ANTLR start "rule__MasterAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2157:1: rule__MasterAttribute__Group__1__Impl : ( ( rule__MasterAttribute__ValueAssignment_1 ) ) ;
    public final void rule__MasterAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2161:1: ( ( ( rule__MasterAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2162:1: ( ( rule__MasterAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2162:1: ( ( rule__MasterAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2163:1: ( rule__MasterAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getMasterAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2164:1: ( rule__MasterAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2164:2: rule__MasterAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__MasterAttribute__ValueAssignment_1_in_rule__MasterAttribute__Group__1__Impl4630);
            rule__MasterAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMasterAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MasterAttribute__Group__1__Impl"


    // $ANTLR start "rule__MandatoryAttribue__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2178:1: rule__MandatoryAttribue__Group__0 : rule__MandatoryAttribue__Group__0__Impl rule__MandatoryAttribue__Group__1 ;
    public final void rule__MandatoryAttribue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2182:1: ( rule__MandatoryAttribue__Group__0__Impl rule__MandatoryAttribue__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2183:2: rule__MandatoryAttribue__Group__0__Impl rule__MandatoryAttribue__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryAttribue__Group__0__Impl_in_rule__MandatoryAttribue__Group__04664);
            rule__MandatoryAttribue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryAttribue__Group__1_in_rule__MandatoryAttribue__Group__04667);
            rule__MandatoryAttribue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryAttribue__Group__0"


    // $ANTLR start "rule__MandatoryAttribue__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2190:1: rule__MandatoryAttribue__Group__0__Impl : ( 'mandatory=' ) ;
    public final void rule__MandatoryAttribue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2194:1: ( ( 'mandatory=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2195:1: ( 'mandatory=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2195:1: ( 'mandatory=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2196:1: 'mandatory='
            {
             before(grammarAccess.getMandatoryAttribueAccess().getMandatoryKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__MandatoryAttribue__Group__0__Impl4695); 
             after(grammarAccess.getMandatoryAttribueAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryAttribue__Group__0__Impl"


    // $ANTLR start "rule__MandatoryAttribue__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2209:1: rule__MandatoryAttribue__Group__1 : rule__MandatoryAttribue__Group__1__Impl ;
    public final void rule__MandatoryAttribue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2213:1: ( rule__MandatoryAttribue__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2214:2: rule__MandatoryAttribue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryAttribue__Group__1__Impl_in_rule__MandatoryAttribue__Group__14726);
            rule__MandatoryAttribue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryAttribue__Group__1"


    // $ANTLR start "rule__MandatoryAttribue__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2220:1: rule__MandatoryAttribue__Group__1__Impl : ( ( rule__MandatoryAttribue__ValueAssignment_1 ) ) ;
    public final void rule__MandatoryAttribue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2224:1: ( ( ( rule__MandatoryAttribue__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2225:1: ( ( rule__MandatoryAttribue__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2225:1: ( ( rule__MandatoryAttribue__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2226:1: ( rule__MandatoryAttribue__ValueAssignment_1 )
            {
             before(grammarAccess.getMandatoryAttribueAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2227:1: ( rule__MandatoryAttribue__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2227:2: rule__MandatoryAttribue__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryAttribue__ValueAssignment_1_in_rule__MandatoryAttribue__Group__1__Impl4753);
            rule__MandatoryAttribue__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAttribueAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryAttribue__Group__1__Impl"


    // $ANTLR start "rule__ModuleElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2241:1: rule__ModuleElement__Group__0 : rule__ModuleElement__Group__0__Impl rule__ModuleElement__Group__1 ;
    public final void rule__ModuleElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2245:1: ( rule__ModuleElement__Group__0__Impl rule__ModuleElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2246:2: rule__ModuleElement__Group__0__Impl rule__ModuleElement__Group__1
            {
            pushFollow(FOLLOW_rule__ModuleElement__Group__0__Impl_in_rule__ModuleElement__Group__04787);
            rule__ModuleElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModuleElement__Group__1_in_rule__ModuleElement__Group__04790);
            rule__ModuleElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__0"


    // $ANTLR start "rule__ModuleElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2253:1: rule__ModuleElement__Group__0__Impl : ( 'module ' ) ;
    public final void rule__ModuleElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2257:1: ( ( 'module ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2258:1: ( 'module ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2258:1: ( 'module ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2259:1: 'module '
            {
             before(grammarAccess.getModuleElementAccess().getModuleKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__ModuleElement__Group__0__Impl4818); 
             after(grammarAccess.getModuleElementAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__0__Impl"


    // $ANTLR start "rule__ModuleElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2272:1: rule__ModuleElement__Group__1 : rule__ModuleElement__Group__1__Impl ;
    public final void rule__ModuleElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2276:1: ( rule__ModuleElement__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2277:2: rule__ModuleElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ModuleElement__Group__1__Impl_in_rule__ModuleElement__Group__14849);
            rule__ModuleElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__1"


    // $ANTLR start "rule__ModuleElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2283:1: rule__ModuleElement__Group__1__Impl : ( ( rule__ModuleElement__NameAssignment_1 ) ) ;
    public final void rule__ModuleElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2287:1: ( ( ( rule__ModuleElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2288:1: ( ( rule__ModuleElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2288:1: ( ( rule__ModuleElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2289:1: ( rule__ModuleElement__NameAssignment_1 )
            {
             before(grammarAccess.getModuleElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2290:1: ( rule__ModuleElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2290:2: rule__ModuleElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ModuleElement__NameAssignment_1_in_rule__ModuleElement__Group__1__Impl4876);
            rule__ModuleElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__Group__1__Impl"


    // $ANTLR start "rule__TranslationElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2304:1: rule__TranslationElement__Group__0 : rule__TranslationElement__Group__0__Impl rule__TranslationElement__Group__1 ;
    public final void rule__TranslationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2308:1: ( rule__TranslationElement__Group__0__Impl rule__TranslationElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2309:2: rule__TranslationElement__Group__0__Impl rule__TranslationElement__Group__1
            {
            pushFollow(FOLLOW_rule__TranslationElement__Group__0__Impl_in_rule__TranslationElement__Group__04910);
            rule__TranslationElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TranslationElement__Group__1_in_rule__TranslationElement__Group__04913);
            rule__TranslationElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__Group__0"


    // $ANTLR start "rule__TranslationElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2316:1: rule__TranslationElement__Group__0__Impl : ( 'translation ' ) ;
    public final void rule__TranslationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2320:1: ( ( 'translation ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2321:1: ( 'translation ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2321:1: ( 'translation ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2322:1: 'translation '
            {
             before(grammarAccess.getTranslationElementAccess().getTranslationKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__TranslationElement__Group__0__Impl4941); 
             after(grammarAccess.getTranslationElementAccess().getTranslationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__Group__0__Impl"


    // $ANTLR start "rule__TranslationElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2335:1: rule__TranslationElement__Group__1 : rule__TranslationElement__Group__1__Impl rule__TranslationElement__Group__2 ;
    public final void rule__TranslationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2339:1: ( rule__TranslationElement__Group__1__Impl rule__TranslationElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2340:2: rule__TranslationElement__Group__1__Impl rule__TranslationElement__Group__2
            {
            pushFollow(FOLLOW_rule__TranslationElement__Group__1__Impl_in_rule__TranslationElement__Group__14972);
            rule__TranslationElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TranslationElement__Group__2_in_rule__TranslationElement__Group__14975);
            rule__TranslationElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__Group__1"


    // $ANTLR start "rule__TranslationElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2347:1: rule__TranslationElement__Group__1__Impl : ( ( rule__TranslationElement__NameAssignment_1 ) ) ;
    public final void rule__TranslationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2351:1: ( ( ( rule__TranslationElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2352:1: ( ( rule__TranslationElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2352:1: ( ( rule__TranslationElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2353:1: ( rule__TranslationElement__NameAssignment_1 )
            {
             before(grammarAccess.getTranslationElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2354:1: ( rule__TranslationElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2354:2: rule__TranslationElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TranslationElement__NameAssignment_1_in_rule__TranslationElement__Group__1__Impl5002);
            rule__TranslationElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTranslationElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__Group__1__Impl"


    // $ANTLR start "rule__TranslationElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2364:1: rule__TranslationElement__Group__2 : rule__TranslationElement__Group__2__Impl ;
    public final void rule__TranslationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2368:1: ( rule__TranslationElement__Group__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2369:2: rule__TranslationElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TranslationElement__Group__2__Impl_in_rule__TranslationElement__Group__25032);
            rule__TranslationElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__Group__2"


    // $ANTLR start "rule__TranslationElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2375:1: rule__TranslationElement__Group__2__Impl : ( ( ( rule__TranslationElement__TranslationsAssignment_2 ) ) ( ( rule__TranslationElement__TranslationsAssignment_2 )* ) ) ;
    public final void rule__TranslationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2379:1: ( ( ( ( rule__TranslationElement__TranslationsAssignment_2 ) ) ( ( rule__TranslationElement__TranslationsAssignment_2 )* ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2380:1: ( ( ( rule__TranslationElement__TranslationsAssignment_2 ) ) ( ( rule__TranslationElement__TranslationsAssignment_2 )* ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2380:1: ( ( ( rule__TranslationElement__TranslationsAssignment_2 ) ) ( ( rule__TranslationElement__TranslationsAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2381:1: ( ( rule__TranslationElement__TranslationsAssignment_2 ) ) ( ( rule__TranslationElement__TranslationsAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2381:1: ( ( rule__TranslationElement__TranslationsAssignment_2 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2382:1: ( rule__TranslationElement__TranslationsAssignment_2 )
            {
             before(grammarAccess.getTranslationElementAccess().getTranslationsAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2383:1: ( rule__TranslationElement__TranslationsAssignment_2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2383:2: rule__TranslationElement__TranslationsAssignment_2
            {
            pushFollow(FOLLOW_rule__TranslationElement__TranslationsAssignment_2_in_rule__TranslationElement__Group__2__Impl5061);
            rule__TranslationElement__TranslationsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTranslationElementAccess().getTranslationsAssignment_2()); 

            }

            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2386:1: ( ( rule__TranslationElement__TranslationsAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2387:1: ( rule__TranslationElement__TranslationsAssignment_2 )*
            {
             before(grammarAccess.getTranslationElementAccess().getTranslationsAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2388:1: ( rule__TranslationElement__TranslationsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2388:2: rule__TranslationElement__TranslationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TranslationElement__TranslationsAssignment_2_in_rule__TranslationElement__Group__2__Impl5073);
            	    rule__TranslationElement__TranslationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTranslationElementAccess().getTranslationsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__Group__2__Impl"


    // $ANTLR start "rule__TranslationAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2405:1: rule__TranslationAttribute__Group__0 : rule__TranslationAttribute__Group__0__Impl rule__TranslationAttribute__Group__1 ;
    public final void rule__TranslationAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2409:1: ( rule__TranslationAttribute__Group__0__Impl rule__TranslationAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2410:2: rule__TranslationAttribute__Group__0__Impl rule__TranslationAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TranslationAttribute__Group__0__Impl_in_rule__TranslationAttribute__Group__05112);
            rule__TranslationAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TranslationAttribute__Group__1_in_rule__TranslationAttribute__Group__05115);
            rule__TranslationAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__Group__0"


    // $ANTLR start "rule__TranslationAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2417:1: rule__TranslationAttribute__Group__0__Impl : ( ( rule__TranslationAttribute__LangAssignment_0 ) ) ;
    public final void rule__TranslationAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2421:1: ( ( ( rule__TranslationAttribute__LangAssignment_0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2422:1: ( ( rule__TranslationAttribute__LangAssignment_0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2422:1: ( ( rule__TranslationAttribute__LangAssignment_0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2423:1: ( rule__TranslationAttribute__LangAssignment_0 )
            {
             before(grammarAccess.getTranslationAttributeAccess().getLangAssignment_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2424:1: ( rule__TranslationAttribute__LangAssignment_0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2424:2: rule__TranslationAttribute__LangAssignment_0
            {
            pushFollow(FOLLOW_rule__TranslationAttribute__LangAssignment_0_in_rule__TranslationAttribute__Group__0__Impl5142);
            rule__TranslationAttribute__LangAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTranslationAttributeAccess().getLangAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__Group__0__Impl"


    // $ANTLR start "rule__TranslationAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2434:1: rule__TranslationAttribute__Group__1 : rule__TranslationAttribute__Group__1__Impl rule__TranslationAttribute__Group__2 ;
    public final void rule__TranslationAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2438:1: ( rule__TranslationAttribute__Group__1__Impl rule__TranslationAttribute__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2439:2: rule__TranslationAttribute__Group__1__Impl rule__TranslationAttribute__Group__2
            {
            pushFollow(FOLLOW_rule__TranslationAttribute__Group__1__Impl_in_rule__TranslationAttribute__Group__15172);
            rule__TranslationAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TranslationAttribute__Group__2_in_rule__TranslationAttribute__Group__15175);
            rule__TranslationAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__Group__1"


    // $ANTLR start "rule__TranslationAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2446:1: rule__TranslationAttribute__Group__1__Impl : ( '=' ) ;
    public final void rule__TranslationAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2450:1: ( ( '=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2451:1: ( '=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2451:1: ( '=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2452:1: '='
            {
             before(grammarAccess.getTranslationAttributeAccess().getEqualsSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__TranslationAttribute__Group__1__Impl5203); 
             after(grammarAccess.getTranslationAttributeAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__Group__1__Impl"


    // $ANTLR start "rule__TranslationAttribute__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2465:1: rule__TranslationAttribute__Group__2 : rule__TranslationAttribute__Group__2__Impl ;
    public final void rule__TranslationAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2469:1: ( rule__TranslationAttribute__Group__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2470:2: rule__TranslationAttribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TranslationAttribute__Group__2__Impl_in_rule__TranslationAttribute__Group__25234);
            rule__TranslationAttribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__Group__2"


    // $ANTLR start "rule__TranslationAttribute__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2476:1: rule__TranslationAttribute__Group__2__Impl : ( ( rule__TranslationAttribute__TypeAssignment_2 ) ) ;
    public final void rule__TranslationAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2480:1: ( ( ( rule__TranslationAttribute__TypeAssignment_2 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2481:1: ( ( rule__TranslationAttribute__TypeAssignment_2 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2481:1: ( ( rule__TranslationAttribute__TypeAssignment_2 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2482:1: ( rule__TranslationAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getTranslationAttributeAccess().getTypeAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2483:1: ( rule__TranslationAttribute__TypeAssignment_2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2483:2: rule__TranslationAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__TranslationAttribute__TypeAssignment_2_in_rule__TranslationAttribute__Group__2__Impl5261);
            rule__TranslationAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTranslationAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__Group__2__Impl"


    // $ANTLR start "rule__JavaElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2499:1: rule__JavaElement__Group__0 : rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1 ;
    public final void rule__JavaElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2503:1: ( rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2504:2: rule__JavaElement__Group__0__Impl rule__JavaElement__Group__1
            {
            pushFollow(FOLLOW_rule__JavaElement__Group__0__Impl_in_rule__JavaElement__Group__05297);
            rule__JavaElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaElement__Group__1_in_rule__JavaElement__Group__05300);
            rule__JavaElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__0"


    // $ANTLR start "rule__JavaElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2511:1: rule__JavaElement__Group__0__Impl : ( 'java ' ) ;
    public final void rule__JavaElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2515:1: ( ( 'java ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2516:1: ( 'java ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2516:1: ( 'java ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2517:1: 'java '
            {
             before(grammarAccess.getJavaElementAccess().getJavaKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__JavaElement__Group__0__Impl5328); 
             after(grammarAccess.getJavaElementAccess().getJavaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__0__Impl"


    // $ANTLR start "rule__JavaElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2530:1: rule__JavaElement__Group__1 : rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2 ;
    public final void rule__JavaElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2534:1: ( rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2535:2: rule__JavaElement__Group__1__Impl rule__JavaElement__Group__2
            {
            pushFollow(FOLLOW_rule__JavaElement__Group__1__Impl_in_rule__JavaElement__Group__15359);
            rule__JavaElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaElement__Group__2_in_rule__JavaElement__Group__15362);
            rule__JavaElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__1"


    // $ANTLR start "rule__JavaElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2542:1: rule__JavaElement__Group__1__Impl : ( ( rule__JavaElement__NameAssignment_1 ) ) ;
    public final void rule__JavaElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2546:1: ( ( ( rule__JavaElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2547:1: ( ( rule__JavaElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2547:1: ( ( rule__JavaElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2548:1: ( rule__JavaElement__NameAssignment_1 )
            {
             before(grammarAccess.getJavaElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2549:1: ( rule__JavaElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2549:2: rule__JavaElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__JavaElement__NameAssignment_1_in_rule__JavaElement__Group__1__Impl5389);
            rule__JavaElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__1__Impl"


    // $ANTLR start "rule__JavaElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2559:1: rule__JavaElement__Group__2 : rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3 ;
    public final void rule__JavaElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2563:1: ( rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2564:2: rule__JavaElement__Group__2__Impl rule__JavaElement__Group__3
            {
            pushFollow(FOLLOW_rule__JavaElement__Group__2__Impl_in_rule__JavaElement__Group__25419);
            rule__JavaElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaElement__Group__3_in_rule__JavaElement__Group__25422);
            rule__JavaElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__2"


    // $ANTLR start "rule__JavaElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2571:1: rule__JavaElement__Group__2__Impl : ( ( rule__JavaElement__RunatAssignment_2 ) ) ;
    public final void rule__JavaElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2575:1: ( ( ( rule__JavaElement__RunatAssignment_2 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2576:1: ( ( rule__JavaElement__RunatAssignment_2 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2576:1: ( ( rule__JavaElement__RunatAssignment_2 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2577:1: ( rule__JavaElement__RunatAssignment_2 )
            {
             before(grammarAccess.getJavaElementAccess().getRunatAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2578:1: ( rule__JavaElement__RunatAssignment_2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2578:2: rule__JavaElement__RunatAssignment_2
            {
            pushFollow(FOLLOW_rule__JavaElement__RunatAssignment_2_in_rule__JavaElement__Group__2__Impl5449);
            rule__JavaElement__RunatAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getRunatAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__2__Impl"


    // $ANTLR start "rule__JavaElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2588:1: rule__JavaElement__Group__3 : rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4 ;
    public final void rule__JavaElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2592:1: ( rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2593:2: rule__JavaElement__Group__3__Impl rule__JavaElement__Group__4
            {
            pushFollow(FOLLOW_rule__JavaElement__Group__3__Impl_in_rule__JavaElement__Group__35479);
            rule__JavaElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaElement__Group__4_in_rule__JavaElement__Group__35482);
            rule__JavaElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__3"


    // $ANTLR start "rule__JavaElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2600:1: rule__JavaElement__Group__3__Impl : ( '{' ) ;
    public final void rule__JavaElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2604:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2605:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2605:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2606:1: '{'
            {
             before(grammarAccess.getJavaElementAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__JavaElement__Group__3__Impl5510); 
             after(grammarAccess.getJavaElementAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__3__Impl"


    // $ANTLR start "rule__JavaElement__Group__4"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2619:1: rule__JavaElement__Group__4 : rule__JavaElement__Group__4__Impl rule__JavaElement__Group__5 ;
    public final void rule__JavaElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2623:1: ( rule__JavaElement__Group__4__Impl rule__JavaElement__Group__5 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2624:2: rule__JavaElement__Group__4__Impl rule__JavaElement__Group__5
            {
            pushFollow(FOLLOW_rule__JavaElement__Group__4__Impl_in_rule__JavaElement__Group__45541);
            rule__JavaElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JavaElement__Group__5_in_rule__JavaElement__Group__45544);
            rule__JavaElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__4"


    // $ANTLR start "rule__JavaElement__Group__4__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2631:1: rule__JavaElement__Group__4__Impl : ( ( rule__JavaElement__SourceAssignment_4 ) ) ;
    public final void rule__JavaElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2635:1: ( ( ( rule__JavaElement__SourceAssignment_4 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2636:1: ( ( rule__JavaElement__SourceAssignment_4 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2636:1: ( ( rule__JavaElement__SourceAssignment_4 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2637:1: ( rule__JavaElement__SourceAssignment_4 )
            {
             before(grammarAccess.getJavaElementAccess().getSourceAssignment_4()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2638:1: ( rule__JavaElement__SourceAssignment_4 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2638:2: rule__JavaElement__SourceAssignment_4
            {
            pushFollow(FOLLOW_rule__JavaElement__SourceAssignment_4_in_rule__JavaElement__Group__4__Impl5571);
            rule__JavaElement__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJavaElementAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__4__Impl"


    // $ANTLR start "rule__JavaElement__Group__5"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2648:1: rule__JavaElement__Group__5 : rule__JavaElement__Group__5__Impl ;
    public final void rule__JavaElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2652:1: ( rule__JavaElement__Group__5__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2653:2: rule__JavaElement__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__JavaElement__Group__5__Impl_in_rule__JavaElement__Group__55601);
            rule__JavaElement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__5"


    // $ANTLR start "rule__JavaElement__Group__5__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2659:1: rule__JavaElement__Group__5__Impl : ( '}' ) ;
    public final void rule__JavaElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2663:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2664:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2664:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2665:1: '}'
            {
             before(grammarAccess.getJavaElementAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_36_in_rule__JavaElement__Group__5__Impl5629); 
             after(grammarAccess.getJavaElementAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__Group__5__Impl"


    // $ANTLR start "rule__RunAtAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2690:1: rule__RunAtAttribute__Group__0 : rule__RunAtAttribute__Group__0__Impl rule__RunAtAttribute__Group__1 ;
    public final void rule__RunAtAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2694:1: ( rule__RunAtAttribute__Group__0__Impl rule__RunAtAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2695:2: rule__RunAtAttribute__Group__0__Impl rule__RunAtAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__RunAtAttribute__Group__0__Impl_in_rule__RunAtAttribute__Group__05672);
            rule__RunAtAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RunAtAttribute__Group__1_in_rule__RunAtAttribute__Group__05675);
            rule__RunAtAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunAtAttribute__Group__0"


    // $ANTLR start "rule__RunAtAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2702:1: rule__RunAtAttribute__Group__0__Impl : ( 'runat=' ) ;
    public final void rule__RunAtAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2706:1: ( ( 'runat=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2707:1: ( 'runat=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2707:1: ( 'runat=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2708:1: 'runat='
            {
             before(grammarAccess.getRunAtAttributeAccess().getRunatKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__RunAtAttribute__Group__0__Impl5703); 
             after(grammarAccess.getRunAtAttributeAccess().getRunatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunAtAttribute__Group__0__Impl"


    // $ANTLR start "rule__RunAtAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2721:1: rule__RunAtAttribute__Group__1 : rule__RunAtAttribute__Group__1__Impl ;
    public final void rule__RunAtAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2725:1: ( rule__RunAtAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2726:2: rule__RunAtAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RunAtAttribute__Group__1__Impl_in_rule__RunAtAttribute__Group__15734);
            rule__RunAtAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunAtAttribute__Group__1"


    // $ANTLR start "rule__RunAtAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2732:1: rule__RunAtAttribute__Group__1__Impl : ( ( rule__RunAtAttribute__ValueAssignment_1 ) ) ;
    public final void rule__RunAtAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2736:1: ( ( ( rule__RunAtAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2737:1: ( ( rule__RunAtAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2737:1: ( ( rule__RunAtAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2738:1: ( rule__RunAtAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getRunAtAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2739:1: ( rule__RunAtAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2739:2: rule__RunAtAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__RunAtAttribute__ValueAssignment_1_in_rule__RunAtAttribute__Group__1__Impl5761);
            rule__RunAtAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRunAtAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunAtAttribute__Group__1__Impl"


    // $ANTLR start "rule__CodeElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2753:1: rule__CodeElement__Group__0 : rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1 ;
    public final void rule__CodeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2757:1: ( rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2758:2: rule__CodeElement__Group__0__Impl rule__CodeElement__Group__1
            {
            pushFollow(FOLLOW_rule__CodeElement__Group__0__Impl_in_rule__CodeElement__Group__05795);
            rule__CodeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CodeElement__Group__1_in_rule__CodeElement__Group__05798);
            rule__CodeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__0"


    // $ANTLR start "rule__CodeElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2765:1: rule__CodeElement__Group__0__Impl : ( 'code ' ) ;
    public final void rule__CodeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2769:1: ( ( 'code ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2770:1: ( 'code ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2770:1: ( 'code ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2771:1: 'code '
            {
             before(grammarAccess.getCodeElementAccess().getCodeKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__CodeElement__Group__0__Impl5826); 
             after(grammarAccess.getCodeElementAccess().getCodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__0__Impl"


    // $ANTLR start "rule__CodeElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2784:1: rule__CodeElement__Group__1 : rule__CodeElement__Group__1__Impl rule__CodeElement__Group__2 ;
    public final void rule__CodeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2788:1: ( rule__CodeElement__Group__1__Impl rule__CodeElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2789:2: rule__CodeElement__Group__1__Impl rule__CodeElement__Group__2
            {
            pushFollow(FOLLOW_rule__CodeElement__Group__1__Impl_in_rule__CodeElement__Group__15857);
            rule__CodeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CodeElement__Group__2_in_rule__CodeElement__Group__15860);
            rule__CodeElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__1"


    // $ANTLR start "rule__CodeElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2796:1: rule__CodeElement__Group__1__Impl : ( ( rule__CodeElement__NameAssignment_1 ) ) ;
    public final void rule__CodeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2800:1: ( ( ( rule__CodeElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2801:1: ( ( rule__CodeElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2801:1: ( ( rule__CodeElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2802:1: ( rule__CodeElement__NameAssignment_1 )
            {
             before(grammarAccess.getCodeElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2803:1: ( rule__CodeElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2803:2: rule__CodeElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__CodeElement__NameAssignment_1_in_rule__CodeElement__Group__1__Impl5887);
            rule__CodeElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCodeElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__1__Impl"


    // $ANTLR start "rule__CodeElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2813:1: rule__CodeElement__Group__2 : rule__CodeElement__Group__2__Impl ;
    public final void rule__CodeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2817:1: ( rule__CodeElement__Group__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2818:2: rule__CodeElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__CodeElement__Group__2__Impl_in_rule__CodeElement__Group__25917);
            rule__CodeElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__2"


    // $ANTLR start "rule__CodeElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2824:1: rule__CodeElement__Group__2__Impl : ( ( rule__CodeElement__IdAssignment_2 ) ) ;
    public final void rule__CodeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2828:1: ( ( ( rule__CodeElement__IdAssignment_2 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2829:1: ( ( rule__CodeElement__IdAssignment_2 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2829:1: ( ( rule__CodeElement__IdAssignment_2 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2830:1: ( rule__CodeElement__IdAssignment_2 )
            {
             before(grammarAccess.getCodeElementAccess().getIdAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2831:1: ( rule__CodeElement__IdAssignment_2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2831:2: rule__CodeElement__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__CodeElement__IdAssignment_2_in_rule__CodeElement__Group__2__Impl5944);
            rule__CodeElement__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCodeElementAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__Group__2__Impl"


    // $ANTLR start "rule__CodeIdAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2847:1: rule__CodeIdAttribute__Group__0 : rule__CodeIdAttribute__Group__0__Impl rule__CodeIdAttribute__Group__1 ;
    public final void rule__CodeIdAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2851:1: ( rule__CodeIdAttribute__Group__0__Impl rule__CodeIdAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2852:2: rule__CodeIdAttribute__Group__0__Impl rule__CodeIdAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__CodeIdAttribute__Group__0__Impl_in_rule__CodeIdAttribute__Group__05980);
            rule__CodeIdAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CodeIdAttribute__Group__1_in_rule__CodeIdAttribute__Group__05983);
            rule__CodeIdAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeIdAttribute__Group__0"


    // $ANTLR start "rule__CodeIdAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2859:1: rule__CodeIdAttribute__Group__0__Impl : ( 'id=' ) ;
    public final void rule__CodeIdAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2863:1: ( ( 'id=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2864:1: ( 'id=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2864:1: ( 'id=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2865:1: 'id='
            {
             before(grammarAccess.getCodeIdAttributeAccess().getIdKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__CodeIdAttribute__Group__0__Impl6011); 
             after(grammarAccess.getCodeIdAttributeAccess().getIdKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeIdAttribute__Group__0__Impl"


    // $ANTLR start "rule__CodeIdAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2878:1: rule__CodeIdAttribute__Group__1 : rule__CodeIdAttribute__Group__1__Impl ;
    public final void rule__CodeIdAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2882:1: ( rule__CodeIdAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2883:2: rule__CodeIdAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CodeIdAttribute__Group__1__Impl_in_rule__CodeIdAttribute__Group__16042);
            rule__CodeIdAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeIdAttribute__Group__1"


    // $ANTLR start "rule__CodeIdAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2889:1: rule__CodeIdAttribute__Group__1__Impl : ( ( rule__CodeIdAttribute__ValueAssignment_1 ) ) ;
    public final void rule__CodeIdAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2893:1: ( ( ( rule__CodeIdAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2894:1: ( ( rule__CodeIdAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2894:1: ( ( rule__CodeIdAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2895:1: ( rule__CodeIdAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getCodeIdAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2896:1: ( rule__CodeIdAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2896:2: rule__CodeIdAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__CodeIdAttribute__ValueAssignment_1_in_rule__CodeIdAttribute__Group__1__Impl6069);
            rule__CodeIdAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCodeIdAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeIdAttribute__Group__1__Impl"


    // $ANTLR start "rule__LogicElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2910:1: rule__LogicElement__Group__0 : rule__LogicElement__Group__0__Impl rule__LogicElement__Group__1 ;
    public final void rule__LogicElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2914:1: ( rule__LogicElement__Group__0__Impl rule__LogicElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2915:2: rule__LogicElement__Group__0__Impl rule__LogicElement__Group__1
            {
            pushFollow(FOLLOW_rule__LogicElement__Group__0__Impl_in_rule__LogicElement__Group__06103);
            rule__LogicElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicElement__Group__1_in_rule__LogicElement__Group__06106);
            rule__LogicElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__0"


    // $ANTLR start "rule__LogicElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2922:1: rule__LogicElement__Group__0__Impl : ( 'logic ' ) ;
    public final void rule__LogicElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2926:1: ( ( 'logic ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2927:1: ( 'logic ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2927:1: ( 'logic ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2928:1: 'logic '
            {
             before(grammarAccess.getLogicElementAccess().getLogicKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__LogicElement__Group__0__Impl6134); 
             after(grammarAccess.getLogicElementAccess().getLogicKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__0__Impl"


    // $ANTLR start "rule__LogicElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2941:1: rule__LogicElement__Group__1 : rule__LogicElement__Group__1__Impl rule__LogicElement__Group__2 ;
    public final void rule__LogicElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2945:1: ( rule__LogicElement__Group__1__Impl rule__LogicElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2946:2: rule__LogicElement__Group__1__Impl rule__LogicElement__Group__2
            {
            pushFollow(FOLLOW_rule__LogicElement__Group__1__Impl_in_rule__LogicElement__Group__16165);
            rule__LogicElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicElement__Group__2_in_rule__LogicElement__Group__16168);
            rule__LogicElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__1"


    // $ANTLR start "rule__LogicElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2953:1: rule__LogicElement__Group__1__Impl : ( ( rule__LogicElement__TypeAssignment_1 ) ) ;
    public final void rule__LogicElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2957:1: ( ( ( rule__LogicElement__TypeAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2958:1: ( ( rule__LogicElement__TypeAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2958:1: ( ( rule__LogicElement__TypeAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2959:1: ( rule__LogicElement__TypeAssignment_1 )
            {
             before(grammarAccess.getLogicElementAccess().getTypeAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2960:1: ( rule__LogicElement__TypeAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2960:2: rule__LogicElement__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__LogicElement__TypeAssignment_1_in_rule__LogicElement__Group__1__Impl6195);
            rule__LogicElement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicElementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__1__Impl"


    // $ANTLR start "rule__LogicElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2970:1: rule__LogicElement__Group__2 : rule__LogicElement__Group__2__Impl rule__LogicElement__Group__3 ;
    public final void rule__LogicElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2974:1: ( rule__LogicElement__Group__2__Impl rule__LogicElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2975:2: rule__LogicElement__Group__2__Impl rule__LogicElement__Group__3
            {
            pushFollow(FOLLOW_rule__LogicElement__Group__2__Impl_in_rule__LogicElement__Group__26225);
            rule__LogicElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicElement__Group__3_in_rule__LogicElement__Group__26228);
            rule__LogicElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__2"


    // $ANTLR start "rule__LogicElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2982:1: rule__LogicElement__Group__2__Impl : ( ( rule__LogicElement__PropertiesAssignment_2 )* ) ;
    public final void rule__LogicElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2986:1: ( ( ( rule__LogicElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2987:1: ( ( rule__LogicElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2987:1: ( ( rule__LogicElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2988:1: ( rule__LogicElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getLogicElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2989:1: ( rule__LogicElement__PropertiesAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==37||LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2989:2: rule__LogicElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__LogicElement__PropertiesAssignment_2_in_rule__LogicElement__Group__2__Impl6255);
            	    rule__LogicElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getLogicElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__2__Impl"


    // $ANTLR start "rule__LogicElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:2999:1: rule__LogicElement__Group__3 : rule__LogicElement__Group__3__Impl ;
    public final void rule__LogicElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3003:1: ( rule__LogicElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3004:2: rule__LogicElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LogicElement__Group__3__Impl_in_rule__LogicElement__Group__36286);
            rule__LogicElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__3"


    // $ANTLR start "rule__LogicElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3010:1: rule__LogicElement__Group__3__Impl : ( ( rule__LogicElement__Group_3__0 )? ) ;
    public final void rule__LogicElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3014:1: ( ( ( rule__LogicElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3015:1: ( ( rule__LogicElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3015:1: ( ( rule__LogicElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3016:1: ( rule__LogicElement__Group_3__0 )?
            {
             before(grammarAccess.getLogicElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3017:1: ( rule__LogicElement__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3017:2: rule__LogicElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LogicElement__Group_3__0_in_rule__LogicElement__Group__3__Impl6313);
                    rule__LogicElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLogicElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group__3__Impl"


    // $ANTLR start "rule__LogicElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3035:1: rule__LogicElement__Group_3__0 : rule__LogicElement__Group_3__0__Impl rule__LogicElement__Group_3__1 ;
    public final void rule__LogicElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3039:1: ( rule__LogicElement__Group_3__0__Impl rule__LogicElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3040:2: rule__LogicElement__Group_3__0__Impl rule__LogicElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__LogicElement__Group_3__0__Impl_in_rule__LogicElement__Group_3__06352);
            rule__LogicElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicElement__Group_3__1_in_rule__LogicElement__Group_3__06355);
            rule__LogicElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group_3__0"


    // $ANTLR start "rule__LogicElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3047:1: rule__LogicElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__LogicElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3051:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3052:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3052:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3053:1: '{'
            {
             before(grammarAccess.getLogicElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__LogicElement__Group_3__0__Impl6383); 
             after(grammarAccess.getLogicElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group_3__0__Impl"


    // $ANTLR start "rule__LogicElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3066:1: rule__LogicElement__Group_3__1 : rule__LogicElement__Group_3__1__Impl rule__LogicElement__Group_3__2 ;
    public final void rule__LogicElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3070:1: ( rule__LogicElement__Group_3__1__Impl rule__LogicElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3071:2: rule__LogicElement__Group_3__1__Impl rule__LogicElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__LogicElement__Group_3__1__Impl_in_rule__LogicElement__Group_3__16414);
            rule__LogicElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicElement__Group_3__2_in_rule__LogicElement__Group_3__16417);
            rule__LogicElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group_3__1"


    // $ANTLR start "rule__LogicElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3078:1: rule__LogicElement__Group_3__1__Impl : ( ( rule__LogicElement__SourceAssignment_3_1 ) ) ;
    public final void rule__LogicElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3082:1: ( ( ( rule__LogicElement__SourceAssignment_3_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3083:1: ( ( rule__LogicElement__SourceAssignment_3_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3083:1: ( ( rule__LogicElement__SourceAssignment_3_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3084:1: ( rule__LogicElement__SourceAssignment_3_1 )
            {
             before(grammarAccess.getLogicElementAccess().getSourceAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3085:1: ( rule__LogicElement__SourceAssignment_3_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3085:2: rule__LogicElement__SourceAssignment_3_1
            {
            pushFollow(FOLLOW_rule__LogicElement__SourceAssignment_3_1_in_rule__LogicElement__Group_3__1__Impl6444);
            rule__LogicElement__SourceAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicElementAccess().getSourceAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group_3__1__Impl"


    // $ANTLR start "rule__LogicElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3095:1: rule__LogicElement__Group_3__2 : rule__LogicElement__Group_3__2__Impl ;
    public final void rule__LogicElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3099:1: ( rule__LogicElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3100:2: rule__LogicElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__LogicElement__Group_3__2__Impl_in_rule__LogicElement__Group_3__26474);
            rule__LogicElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group_3__2"


    // $ANTLR start "rule__LogicElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3106:1: rule__LogicElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__LogicElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3110:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3111:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3111:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3112:1: '}'
            {
             before(grammarAccess.getLogicElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__LogicElement__Group_3__2__Impl6502); 
             after(grammarAccess.getLogicElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__Group_3__2__Impl"


    // $ANTLR start "rule__LogicTypeAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3131:1: rule__LogicTypeAttribute__Group__0 : rule__LogicTypeAttribute__Group__0__Impl rule__LogicTypeAttribute__Group__1 ;
    public final void rule__LogicTypeAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3135:1: ( rule__LogicTypeAttribute__Group__0__Impl rule__LogicTypeAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3136:2: rule__LogicTypeAttribute__Group__0__Impl rule__LogicTypeAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__LogicTypeAttribute__Group__0__Impl_in_rule__LogicTypeAttribute__Group__06539);
            rule__LogicTypeAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicTypeAttribute__Group__1_in_rule__LogicTypeAttribute__Group__06542);
            rule__LogicTypeAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicTypeAttribute__Group__0"


    // $ANTLR start "rule__LogicTypeAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3143:1: rule__LogicTypeAttribute__Group__0__Impl : ( 'type=' ) ;
    public final void rule__LogicTypeAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3147:1: ( ( 'type=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3148:1: ( 'type=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3148:1: ( 'type=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3149:1: 'type='
            {
             before(grammarAccess.getLogicTypeAttributeAccess().getTypeKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__LogicTypeAttribute__Group__0__Impl6570); 
             after(grammarAccess.getLogicTypeAttributeAccess().getTypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicTypeAttribute__Group__0__Impl"


    // $ANTLR start "rule__LogicTypeAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3162:1: rule__LogicTypeAttribute__Group__1 : rule__LogicTypeAttribute__Group__1__Impl ;
    public final void rule__LogicTypeAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3166:1: ( rule__LogicTypeAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3167:2: rule__LogicTypeAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LogicTypeAttribute__Group__1__Impl_in_rule__LogicTypeAttribute__Group__16601);
            rule__LogicTypeAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicTypeAttribute__Group__1"


    // $ANTLR start "rule__LogicTypeAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3173:1: rule__LogicTypeAttribute__Group__1__Impl : ( ( rule__LogicTypeAttribute__ValueAssignment_1 ) ) ;
    public final void rule__LogicTypeAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3177:1: ( ( ( rule__LogicTypeAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3178:1: ( ( rule__LogicTypeAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3178:1: ( ( rule__LogicTypeAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3179:1: ( rule__LogicTypeAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getLogicTypeAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3180:1: ( rule__LogicTypeAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3180:2: rule__LogicTypeAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__LogicTypeAttribute__ValueAssignment_1_in_rule__LogicTypeAttribute__Group__1__Impl6628);
            rule__LogicTypeAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicTypeAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicTypeAttribute__Group__1__Impl"


    // $ANTLR start "rule__LogicExecAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3194:1: rule__LogicExecAttribute__Group__0 : rule__LogicExecAttribute__Group__0__Impl rule__LogicExecAttribute__Group__1 ;
    public final void rule__LogicExecAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3198:1: ( rule__LogicExecAttribute__Group__0__Impl rule__LogicExecAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3199:2: rule__LogicExecAttribute__Group__0__Impl rule__LogicExecAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__LogicExecAttribute__Group__0__Impl_in_rule__LogicExecAttribute__Group__06662);
            rule__LogicExecAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LogicExecAttribute__Group__1_in_rule__LogicExecAttribute__Group__06665);
            rule__LogicExecAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExecAttribute__Group__0"


    // $ANTLR start "rule__LogicExecAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3206:1: rule__LogicExecAttribute__Group__0__Impl : ( 'exec=' ) ;
    public final void rule__LogicExecAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3210:1: ( ( 'exec=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3211:1: ( 'exec=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3211:1: ( 'exec=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3212:1: 'exec='
            {
             before(grammarAccess.getLogicExecAttributeAccess().getExecKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__LogicExecAttribute__Group__0__Impl6693); 
             after(grammarAccess.getLogicExecAttributeAccess().getExecKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExecAttribute__Group__0__Impl"


    // $ANTLR start "rule__LogicExecAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3225:1: rule__LogicExecAttribute__Group__1 : rule__LogicExecAttribute__Group__1__Impl ;
    public final void rule__LogicExecAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3229:1: ( rule__LogicExecAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3230:2: rule__LogicExecAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LogicExecAttribute__Group__1__Impl_in_rule__LogicExecAttribute__Group__16724);
            rule__LogicExecAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExecAttribute__Group__1"


    // $ANTLR start "rule__LogicExecAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3236:1: rule__LogicExecAttribute__Group__1__Impl : ( ( rule__LogicExecAttribute__ValueAssignment_1 ) ) ;
    public final void rule__LogicExecAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3240:1: ( ( ( rule__LogicExecAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3241:1: ( ( rule__LogicExecAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3241:1: ( ( rule__LogicExecAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3242:1: ( rule__LogicExecAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getLogicExecAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3243:1: ( rule__LogicExecAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3243:2: rule__LogicExecAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__LogicExecAttribute__ValueAssignment_1_in_rule__LogicExecAttribute__Group__1__Impl6751);
            rule__LogicExecAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicExecAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExecAttribute__Group__1__Impl"


    // $ANTLR start "rule__LookupElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3257:1: rule__LookupElement__Group__0 : rule__LookupElement__Group__0__Impl rule__LookupElement__Group__1 ;
    public final void rule__LookupElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3261:1: ( rule__LookupElement__Group__0__Impl rule__LookupElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3262:2: rule__LookupElement__Group__0__Impl rule__LookupElement__Group__1
            {
            pushFollow(FOLLOW_rule__LookupElement__Group__0__Impl_in_rule__LookupElement__Group__06785);
            rule__LookupElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LookupElement__Group__1_in_rule__LookupElement__Group__06788);
            rule__LookupElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__0"


    // $ANTLR start "rule__LookupElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3269:1: rule__LookupElement__Group__0__Impl : ( 'lookup ' ) ;
    public final void rule__LookupElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3273:1: ( ( 'lookup ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3274:1: ( 'lookup ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3274:1: ( 'lookup ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3275:1: 'lookup '
            {
             before(grammarAccess.getLookupElementAccess().getLookupKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__LookupElement__Group__0__Impl6816); 
             after(grammarAccess.getLookupElementAccess().getLookupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__0__Impl"


    // $ANTLR start "rule__LookupElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3288:1: rule__LookupElement__Group__1 : rule__LookupElement__Group__1__Impl rule__LookupElement__Group__2 ;
    public final void rule__LookupElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3292:1: ( rule__LookupElement__Group__1__Impl rule__LookupElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3293:2: rule__LookupElement__Group__1__Impl rule__LookupElement__Group__2
            {
            pushFollow(FOLLOW_rule__LookupElement__Group__1__Impl_in_rule__LookupElement__Group__16847);
            rule__LookupElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LookupElement__Group__2_in_rule__LookupElement__Group__16850);
            rule__LookupElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__1"


    // $ANTLR start "rule__LookupElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3300:1: rule__LookupElement__Group__1__Impl : ( ( rule__LookupElement__NameAssignment_1 ) ) ;
    public final void rule__LookupElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3304:1: ( ( ( rule__LookupElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3305:1: ( ( rule__LookupElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3305:1: ( ( rule__LookupElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3306:1: ( rule__LookupElement__NameAssignment_1 )
            {
             before(grammarAccess.getLookupElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3307:1: ( rule__LookupElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3307:2: rule__LookupElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LookupElement__NameAssignment_1_in_rule__LookupElement__Group__1__Impl6877);
            rule__LookupElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLookupElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__1__Impl"


    // $ANTLR start "rule__LookupElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3317:1: rule__LookupElement__Group__2 : rule__LookupElement__Group__2__Impl rule__LookupElement__Group__3 ;
    public final void rule__LookupElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3321:1: ( rule__LookupElement__Group__2__Impl rule__LookupElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3322:2: rule__LookupElement__Group__2__Impl rule__LookupElement__Group__3
            {
            pushFollow(FOLLOW_rule__LookupElement__Group__2__Impl_in_rule__LookupElement__Group__26907);
            rule__LookupElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LookupElement__Group__3_in_rule__LookupElement__Group__26910);
            rule__LookupElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__2"


    // $ANTLR start "rule__LookupElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3329:1: rule__LookupElement__Group__2__Impl : ( '{' ) ;
    public final void rule__LookupElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3333:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3334:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3334:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3335:1: '{'
            {
             before(grammarAccess.getLookupElementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_35_in_rule__LookupElement__Group__2__Impl6938); 
             after(grammarAccess.getLookupElementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__2__Impl"


    // $ANTLR start "rule__LookupElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3348:1: rule__LookupElement__Group__3 : rule__LookupElement__Group__3__Impl rule__LookupElement__Group__4 ;
    public final void rule__LookupElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3352:1: ( rule__LookupElement__Group__3__Impl rule__LookupElement__Group__4 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3353:2: rule__LookupElement__Group__3__Impl rule__LookupElement__Group__4
            {
            pushFollow(FOLLOW_rule__LookupElement__Group__3__Impl_in_rule__LookupElement__Group__36969);
            rule__LookupElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LookupElement__Group__4_in_rule__LookupElement__Group__36972);
            rule__LookupElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__3"


    // $ANTLR start "rule__LookupElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3360:1: rule__LookupElement__Group__3__Impl : ( ( ( rule__LookupElement__ServicelogicAssignment_3 ) ) ( ( rule__LookupElement__ServicelogicAssignment_3 )* ) ) ;
    public final void rule__LookupElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3364:1: ( ( ( ( rule__LookupElement__ServicelogicAssignment_3 ) ) ( ( rule__LookupElement__ServicelogicAssignment_3 )* ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3365:1: ( ( ( rule__LookupElement__ServicelogicAssignment_3 ) ) ( ( rule__LookupElement__ServicelogicAssignment_3 )* ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3365:1: ( ( ( rule__LookupElement__ServicelogicAssignment_3 ) ) ( ( rule__LookupElement__ServicelogicAssignment_3 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3366:1: ( ( rule__LookupElement__ServicelogicAssignment_3 ) ) ( ( rule__LookupElement__ServicelogicAssignment_3 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3366:1: ( ( rule__LookupElement__ServicelogicAssignment_3 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3367:1: ( rule__LookupElement__ServicelogicAssignment_3 )
            {
             before(grammarAccess.getLookupElementAccess().getServicelogicAssignment_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3368:1: ( rule__LookupElement__ServicelogicAssignment_3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3368:2: rule__LookupElement__ServicelogicAssignment_3
            {
            pushFollow(FOLLOW_rule__LookupElement__ServicelogicAssignment_3_in_rule__LookupElement__Group__3__Impl7001);
            rule__LookupElement__ServicelogicAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLookupElementAccess().getServicelogicAssignment_3()); 

            }

            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3371:1: ( ( rule__LookupElement__ServicelogicAssignment_3 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3372:1: ( rule__LookupElement__ServicelogicAssignment_3 )*
            {
             before(grammarAccess.getLookupElementAccess().getServicelogicAssignment_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3373:1: ( rule__LookupElement__ServicelogicAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34||LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3373:2: rule__LookupElement__ServicelogicAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__LookupElement__ServicelogicAssignment_3_in_rule__LookupElement__Group__3__Impl7013);
            	    rule__LookupElement__ServicelogicAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getLookupElementAccess().getServicelogicAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__3__Impl"


    // $ANTLR start "rule__LookupElement__Group__4"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3384:1: rule__LookupElement__Group__4 : rule__LookupElement__Group__4__Impl ;
    public final void rule__LookupElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3388:1: ( rule__LookupElement__Group__4__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3389:2: rule__LookupElement__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__LookupElement__Group__4__Impl_in_rule__LookupElement__Group__47046);
            rule__LookupElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__4"


    // $ANTLR start "rule__LookupElement__Group__4__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3395:1: rule__LookupElement__Group__4__Impl : ( '}' ) ;
    public final void rule__LookupElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3399:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3400:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3400:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3401:1: '}'
            {
             before(grammarAccess.getLookupElementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_36_in_rule__LookupElement__Group__4__Impl7074); 
             after(grammarAccess.getLookupElementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__Group__4__Impl"


    // $ANTLR start "rule__TemplateElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3424:1: rule__TemplateElement__Group__0 : rule__TemplateElement__Group__0__Impl rule__TemplateElement__Group__1 ;
    public final void rule__TemplateElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3428:1: ( rule__TemplateElement__Group__0__Impl rule__TemplateElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3429:2: rule__TemplateElement__Group__0__Impl rule__TemplateElement__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateElement__Group__0__Impl_in_rule__TemplateElement__Group__07115);
            rule__TemplateElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateElement__Group__1_in_rule__TemplateElement__Group__07118);
            rule__TemplateElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__0"


    // $ANTLR start "rule__TemplateElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3436:1: rule__TemplateElement__Group__0__Impl : ( 'template ' ) ;
    public final void rule__TemplateElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3440:1: ( ( 'template ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3441:1: ( 'template ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3441:1: ( 'template ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3442:1: 'template '
            {
             before(grammarAccess.getTemplateElementAccess().getTemplateKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__TemplateElement__Group__0__Impl7146); 
             after(grammarAccess.getTemplateElementAccess().getTemplateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__0__Impl"


    // $ANTLR start "rule__TemplateElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3455:1: rule__TemplateElement__Group__1 : rule__TemplateElement__Group__1__Impl rule__TemplateElement__Group__2 ;
    public final void rule__TemplateElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3459:1: ( rule__TemplateElement__Group__1__Impl rule__TemplateElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3460:2: rule__TemplateElement__Group__1__Impl rule__TemplateElement__Group__2
            {
            pushFollow(FOLLOW_rule__TemplateElement__Group__1__Impl_in_rule__TemplateElement__Group__17177);
            rule__TemplateElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateElement__Group__2_in_rule__TemplateElement__Group__17180);
            rule__TemplateElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__1"


    // $ANTLR start "rule__TemplateElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3467:1: rule__TemplateElement__Group__1__Impl : ( ( rule__TemplateElement__NameAssignment_1 ) ) ;
    public final void rule__TemplateElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3471:1: ( ( ( rule__TemplateElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3472:1: ( ( rule__TemplateElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3472:1: ( ( rule__TemplateElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3473:1: ( rule__TemplateElement__NameAssignment_1 )
            {
             before(grammarAccess.getTemplateElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3474:1: ( rule__TemplateElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3474:2: rule__TemplateElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TemplateElement__NameAssignment_1_in_rule__TemplateElement__Group__1__Impl7207);
            rule__TemplateElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__1__Impl"


    // $ANTLR start "rule__TemplateElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3484:1: rule__TemplateElement__Group__2 : rule__TemplateElement__Group__2__Impl rule__TemplateElement__Group__3 ;
    public final void rule__TemplateElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3488:1: ( rule__TemplateElement__Group__2__Impl rule__TemplateElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3489:2: rule__TemplateElement__Group__2__Impl rule__TemplateElement__Group__3
            {
            pushFollow(FOLLOW_rule__TemplateElement__Group__2__Impl_in_rule__TemplateElement__Group__27237);
            rule__TemplateElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateElement__Group__3_in_rule__TemplateElement__Group__27240);
            rule__TemplateElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__2"


    // $ANTLR start "rule__TemplateElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3496:1: rule__TemplateElement__Group__2__Impl : ( ( rule__TemplateElement__ClassAssignment_2 ) ) ;
    public final void rule__TemplateElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3500:1: ( ( ( rule__TemplateElement__ClassAssignment_2 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3501:1: ( ( rule__TemplateElement__ClassAssignment_2 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3501:1: ( ( rule__TemplateElement__ClassAssignment_2 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3502:1: ( rule__TemplateElement__ClassAssignment_2 )
            {
             before(grammarAccess.getTemplateElementAccess().getClassAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3503:1: ( rule__TemplateElement__ClassAssignment_2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3503:2: rule__TemplateElement__ClassAssignment_2
            {
            pushFollow(FOLLOW_rule__TemplateElement__ClassAssignment_2_in_rule__TemplateElement__Group__2__Impl7267);
            rule__TemplateElement__ClassAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementAccess().getClassAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__2__Impl"


    // $ANTLR start "rule__TemplateElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3513:1: rule__TemplateElement__Group__3 : rule__TemplateElement__Group__3__Impl ;
    public final void rule__TemplateElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3517:1: ( rule__TemplateElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3518:2: rule__TemplateElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__TemplateElement__Group__3__Impl_in_rule__TemplateElement__Group__37297);
            rule__TemplateElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__3"


    // $ANTLR start "rule__TemplateElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3524:1: rule__TemplateElement__Group__3__Impl : ( ( rule__TemplateElement__ReplacesAssignment_3 ) ) ;
    public final void rule__TemplateElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3528:1: ( ( ( rule__TemplateElement__ReplacesAssignment_3 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3529:1: ( ( rule__TemplateElement__ReplacesAssignment_3 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3529:1: ( ( rule__TemplateElement__ReplacesAssignment_3 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3530:1: ( rule__TemplateElement__ReplacesAssignment_3 )
            {
             before(grammarAccess.getTemplateElementAccess().getReplacesAssignment_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3531:1: ( rule__TemplateElement__ReplacesAssignment_3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3531:2: rule__TemplateElement__ReplacesAssignment_3
            {
            pushFollow(FOLLOW_rule__TemplateElement__ReplacesAssignment_3_in_rule__TemplateElement__Group__3__Impl7324);
            rule__TemplateElement__ReplacesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementAccess().getReplacesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__Group__3__Impl"


    // $ANTLR start "rule__TemplateElementClassAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3549:1: rule__TemplateElementClassAttribute__Group__0 : rule__TemplateElementClassAttribute__Group__0__Impl rule__TemplateElementClassAttribute__Group__1 ;
    public final void rule__TemplateElementClassAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3553:1: ( rule__TemplateElementClassAttribute__Group__0__Impl rule__TemplateElementClassAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3554:2: rule__TemplateElementClassAttribute__Group__0__Impl rule__TemplateElementClassAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateElementClassAttribute__Group__0__Impl_in_rule__TemplateElementClassAttribute__Group__07362);
            rule__TemplateElementClassAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateElementClassAttribute__Group__1_in_rule__TemplateElementClassAttribute__Group__07365);
            rule__TemplateElementClassAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementClassAttribute__Group__0"


    // $ANTLR start "rule__TemplateElementClassAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3561:1: rule__TemplateElementClassAttribute__Group__0__Impl : ( 'class=' ) ;
    public final void rule__TemplateElementClassAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3565:1: ( ( 'class=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3566:1: ( 'class=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3566:1: ( 'class=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3567:1: 'class='
            {
             before(grammarAccess.getTemplateElementClassAttributeAccess().getClassKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__TemplateElementClassAttribute__Group__0__Impl7393); 
             after(grammarAccess.getTemplateElementClassAttributeAccess().getClassKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementClassAttribute__Group__0__Impl"


    // $ANTLR start "rule__TemplateElementClassAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3580:1: rule__TemplateElementClassAttribute__Group__1 : rule__TemplateElementClassAttribute__Group__1__Impl ;
    public final void rule__TemplateElementClassAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3584:1: ( rule__TemplateElementClassAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3585:2: rule__TemplateElementClassAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateElementClassAttribute__Group__1__Impl_in_rule__TemplateElementClassAttribute__Group__17424);
            rule__TemplateElementClassAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementClassAttribute__Group__1"


    // $ANTLR start "rule__TemplateElementClassAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3591:1: rule__TemplateElementClassAttribute__Group__1__Impl : ( ( rule__TemplateElementClassAttribute__ValueAssignment_1 ) ) ;
    public final void rule__TemplateElementClassAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3595:1: ( ( ( rule__TemplateElementClassAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3596:1: ( ( rule__TemplateElementClassAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3596:1: ( ( rule__TemplateElementClassAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3597:1: ( rule__TemplateElementClassAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getTemplateElementClassAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3598:1: ( rule__TemplateElementClassAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3598:2: rule__TemplateElementClassAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__TemplateElementClassAttribute__ValueAssignment_1_in_rule__TemplateElementClassAttribute__Group__1__Impl7451);
            rule__TemplateElementClassAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementClassAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementClassAttribute__Group__1__Impl"


    // $ANTLR start "rule__TemplateElementReplacesAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3612:1: rule__TemplateElementReplacesAttribute__Group__0 : rule__TemplateElementReplacesAttribute__Group__0__Impl rule__TemplateElementReplacesAttribute__Group__1 ;
    public final void rule__TemplateElementReplacesAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3616:1: ( rule__TemplateElementReplacesAttribute__Group__0__Impl rule__TemplateElementReplacesAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3617:2: rule__TemplateElementReplacesAttribute__Group__0__Impl rule__TemplateElementReplacesAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__TemplateElementReplacesAttribute__Group__0__Impl_in_rule__TemplateElementReplacesAttribute__Group__07485);
            rule__TemplateElementReplacesAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TemplateElementReplacesAttribute__Group__1_in_rule__TemplateElementReplacesAttribute__Group__07488);
            rule__TemplateElementReplacesAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementReplacesAttribute__Group__0"


    // $ANTLR start "rule__TemplateElementReplacesAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3624:1: rule__TemplateElementReplacesAttribute__Group__0__Impl : ( 'replaces=' ) ;
    public final void rule__TemplateElementReplacesAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3628:1: ( ( 'replaces=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3629:1: ( 'replaces=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3629:1: ( 'replaces=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3630:1: 'replaces='
            {
             before(grammarAccess.getTemplateElementReplacesAttributeAccess().getReplacesKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__TemplateElementReplacesAttribute__Group__0__Impl7516); 
             after(grammarAccess.getTemplateElementReplacesAttributeAccess().getReplacesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementReplacesAttribute__Group__0__Impl"


    // $ANTLR start "rule__TemplateElementReplacesAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3643:1: rule__TemplateElementReplacesAttribute__Group__1 : rule__TemplateElementReplacesAttribute__Group__1__Impl ;
    public final void rule__TemplateElementReplacesAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3647:1: ( rule__TemplateElementReplacesAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3648:2: rule__TemplateElementReplacesAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TemplateElementReplacesAttribute__Group__1__Impl_in_rule__TemplateElementReplacesAttribute__Group__17547);
            rule__TemplateElementReplacesAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementReplacesAttribute__Group__1"


    // $ANTLR start "rule__TemplateElementReplacesAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3654:1: rule__TemplateElementReplacesAttribute__Group__1__Impl : ( ( rule__TemplateElementReplacesAttribute__ValueAssignment_1 ) ) ;
    public final void rule__TemplateElementReplacesAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3658:1: ( ( ( rule__TemplateElementReplacesAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3659:1: ( ( rule__TemplateElementReplacesAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3659:1: ( ( rule__TemplateElementReplacesAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3660:1: ( rule__TemplateElementReplacesAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3661:1: ( rule__TemplateElementReplacesAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3661:2: rule__TemplateElementReplacesAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__TemplateElementReplacesAttribute__ValueAssignment_1_in_rule__TemplateElementReplacesAttribute__Group__1__Impl7574);
            rule__TemplateElementReplacesAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementReplacesAttribute__Group__1__Impl"


    // $ANTLR start "rule__FormElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3675:1: rule__FormElement__Group__0 : rule__FormElement__Group__0__Impl rule__FormElement__Group__1 ;
    public final void rule__FormElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3679:1: ( rule__FormElement__Group__0__Impl rule__FormElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3680:2: rule__FormElement__Group__0__Impl rule__FormElement__Group__1
            {
            pushFollow(FOLLOW_rule__FormElement__Group__0__Impl_in_rule__FormElement__Group__07608);
            rule__FormElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__07611);
            rule__FormElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__0"


    // $ANTLR start "rule__FormElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3687:1: rule__FormElement__Group__0__Impl : ( 'form ' ) ;
    public final void rule__FormElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3691:1: ( ( 'form ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3692:1: ( 'form ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3692:1: ( 'form ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3693:1: 'form '
            {
             before(grammarAccess.getFormElementAccess().getFormKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__FormElement__Group__0__Impl7639); 
             after(grammarAccess.getFormElementAccess().getFormKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__0__Impl"


    // $ANTLR start "rule__FormElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3706:1: rule__FormElement__Group__1 : rule__FormElement__Group__1__Impl rule__FormElement__Group__2 ;
    public final void rule__FormElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3710:1: ( rule__FormElement__Group__1__Impl rule__FormElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3711:2: rule__FormElement__Group__1__Impl rule__FormElement__Group__2
            {
            pushFollow(FOLLOW_rule__FormElement__Group__1__Impl_in_rule__FormElement__Group__17670);
            rule__FormElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__17673);
            rule__FormElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__1"


    // $ANTLR start "rule__FormElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3718:1: rule__FormElement__Group__1__Impl : ( ( rule__FormElement__NameAssignment_1 ) ) ;
    public final void rule__FormElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3722:1: ( ( ( rule__FormElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3723:1: ( ( rule__FormElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3723:1: ( ( rule__FormElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3724:1: ( rule__FormElement__NameAssignment_1 )
            {
             before(grammarAccess.getFormElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3725:1: ( rule__FormElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3725:2: rule__FormElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FormElement__NameAssignment_1_in_rule__FormElement__Group__1__Impl7700);
            rule__FormElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__1__Impl"


    // $ANTLR start "rule__FormElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3735:1: rule__FormElement__Group__2 : rule__FormElement__Group__2__Impl rule__FormElement__Group__3 ;
    public final void rule__FormElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3739:1: ( rule__FormElement__Group__2__Impl rule__FormElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3740:2: rule__FormElement__Group__2__Impl rule__FormElement__Group__3
            {
            pushFollow(FOLLOW_rule__FormElement__Group__2__Impl_in_rule__FormElement__Group__27730);
            rule__FormElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__27733);
            rule__FormElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__2"


    // $ANTLR start "rule__FormElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3747:1: rule__FormElement__Group__2__Impl : ( ( rule__FormElement__ModalAssignment_2 ) ) ;
    public final void rule__FormElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3751:1: ( ( ( rule__FormElement__ModalAssignment_2 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3752:1: ( ( rule__FormElement__ModalAssignment_2 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3752:1: ( ( rule__FormElement__ModalAssignment_2 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3753:1: ( rule__FormElement__ModalAssignment_2 )
            {
             before(grammarAccess.getFormElementAccess().getModalAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3754:1: ( rule__FormElement__ModalAssignment_2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3754:2: rule__FormElement__ModalAssignment_2
            {
            pushFollow(FOLLOW_rule__FormElement__ModalAssignment_2_in_rule__FormElement__Group__2__Impl7760);
            rule__FormElement__ModalAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFormElementAccess().getModalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__2__Impl"


    // $ANTLR start "rule__FormElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3764:1: rule__FormElement__Group__3 : rule__FormElement__Group__3__Impl rule__FormElement__Group__4 ;
    public final void rule__FormElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3768:1: ( rule__FormElement__Group__3__Impl rule__FormElement__Group__4 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3769:2: rule__FormElement__Group__3__Impl rule__FormElement__Group__4
            {
            pushFollow(FOLLOW_rule__FormElement__Group__3__Impl_in_rule__FormElement__Group__37790);
            rule__FormElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__37793);
            rule__FormElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__3"


    // $ANTLR start "rule__FormElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3776:1: rule__FormElement__Group__3__Impl : ( ( rule__FormElement__TextAssignment_3 ) ) ;
    public final void rule__FormElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3780:1: ( ( ( rule__FormElement__TextAssignment_3 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3781:1: ( ( rule__FormElement__TextAssignment_3 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3781:1: ( ( rule__FormElement__TextAssignment_3 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3782:1: ( rule__FormElement__TextAssignment_3 )
            {
             before(grammarAccess.getFormElementAccess().getTextAssignment_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3783:1: ( rule__FormElement__TextAssignment_3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3783:2: rule__FormElement__TextAssignment_3
            {
            pushFollow(FOLLOW_rule__FormElement__TextAssignment_3_in_rule__FormElement__Group__3__Impl7820);
            rule__FormElement__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFormElementAccess().getTextAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__3__Impl"


    // $ANTLR start "rule__FormElement__Group__4"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3793:1: rule__FormElement__Group__4 : rule__FormElement__Group__4__Impl rule__FormElement__Group__5 ;
    public final void rule__FormElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3797:1: ( rule__FormElement__Group__4__Impl rule__FormElement__Group__5 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3798:2: rule__FormElement__Group__4__Impl rule__FormElement__Group__5
            {
            pushFollow(FOLLOW_rule__FormElement__Group__4__Impl_in_rule__FormElement__Group__47850);
            rule__FormElement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__47853);
            rule__FormElement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__4"


    // $ANTLR start "rule__FormElement__Group__4__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3805:1: rule__FormElement__Group__4__Impl : ( ( rule__FormElement__ColumnsAssignment_4 ) ) ;
    public final void rule__FormElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3809:1: ( ( ( rule__FormElement__ColumnsAssignment_4 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3810:1: ( ( rule__FormElement__ColumnsAssignment_4 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3810:1: ( ( rule__FormElement__ColumnsAssignment_4 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3811:1: ( rule__FormElement__ColumnsAssignment_4 )
            {
             before(grammarAccess.getFormElementAccess().getColumnsAssignment_4()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3812:1: ( rule__FormElement__ColumnsAssignment_4 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3812:2: rule__FormElement__ColumnsAssignment_4
            {
            pushFollow(FOLLOW_rule__FormElement__ColumnsAssignment_4_in_rule__FormElement__Group__4__Impl7880);
            rule__FormElement__ColumnsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFormElementAccess().getColumnsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__4__Impl"


    // $ANTLR start "rule__FormElement__Group__5"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3822:1: rule__FormElement__Group__5 : rule__FormElement__Group__5__Impl rule__FormElement__Group__6 ;
    public final void rule__FormElement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3826:1: ( rule__FormElement__Group__5__Impl rule__FormElement__Group__6 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3827:2: rule__FormElement__Group__5__Impl rule__FormElement__Group__6
            {
            pushFollow(FOLLOW_rule__FormElement__Group__5__Impl_in_rule__FormElement__Group__57910);
            rule__FormElement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElement__Group__6_in_rule__FormElement__Group__57913);
            rule__FormElement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__5"


    // $ANTLR start "rule__FormElement__Group__5__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3834:1: rule__FormElement__Group__5__Impl : ( '{' ) ;
    public final void rule__FormElement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3838:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3839:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3839:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3840:1: '{'
            {
             before(grammarAccess.getFormElementAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,35,FOLLOW_35_in_rule__FormElement__Group__5__Impl7941); 
             after(grammarAccess.getFormElementAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__5__Impl"


    // $ANTLR start "rule__FormElement__Group__6"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3853:1: rule__FormElement__Group__6 : rule__FormElement__Group__6__Impl rule__FormElement__Group__7 ;
    public final void rule__FormElement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3857:1: ( rule__FormElement__Group__6__Impl rule__FormElement__Group__7 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3858:2: rule__FormElement__Group__6__Impl rule__FormElement__Group__7
            {
            pushFollow(FOLLOW_rule__FormElement__Group__6__Impl_in_rule__FormElement__Group__67972);
            rule__FormElement__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElement__Group__7_in_rule__FormElement__Group__67975);
            rule__FormElement__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__6"


    // $ANTLR start "rule__FormElement__Group__6__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3865:1: rule__FormElement__Group__6__Impl : ( ( rule__FormElement__ElementsAssignment_6 )* ) ;
    public final void rule__FormElement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3869:1: ( ( ( rule__FormElement__ElementsAssignment_6 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3870:1: ( ( rule__FormElement__ElementsAssignment_6 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3870:1: ( ( rule__FormElement__ElementsAssignment_6 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3871:1: ( rule__FormElement__ElementsAssignment_6 )*
            {
             before(grammarAccess.getFormElementAccess().getElementsAssignment_6()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3872:1: ( rule__FormElement__ElementsAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34||LA21_0==40||(LA21_0>=50 && LA21_0<=51)||(LA21_0>=53 && LA21_0<=56)||LA21_0==60) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3872:2: rule__FormElement__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_rule__FormElement__ElementsAssignment_6_in_rule__FormElement__Group__6__Impl8002);
            	    rule__FormElement__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFormElementAccess().getElementsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__6__Impl"


    // $ANTLR start "rule__FormElement__Group__7"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3882:1: rule__FormElement__Group__7 : rule__FormElement__Group__7__Impl ;
    public final void rule__FormElement__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3886:1: ( rule__FormElement__Group__7__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3887:2: rule__FormElement__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__FormElement__Group__7__Impl_in_rule__FormElement__Group__78033);
            rule__FormElement__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__7"


    // $ANTLR start "rule__FormElement__Group__7__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3893:1: rule__FormElement__Group__7__Impl : ( '}' ) ;
    public final void rule__FormElement__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3897:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3898:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3898:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3899:1: '}'
            {
             before(grammarAccess.getFormElementAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_36_in_rule__FormElement__Group__7__Impl8061); 
             after(grammarAccess.getFormElementAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__Group__7__Impl"


    // $ANTLR start "rule__FormElementModalAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3928:1: rule__FormElementModalAttribute__Group__0 : rule__FormElementModalAttribute__Group__0__Impl rule__FormElementModalAttribute__Group__1 ;
    public final void rule__FormElementModalAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3932:1: ( rule__FormElementModalAttribute__Group__0__Impl rule__FormElementModalAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3933:2: rule__FormElementModalAttribute__Group__0__Impl rule__FormElementModalAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__FormElementModalAttribute__Group__0__Impl_in_rule__FormElementModalAttribute__Group__08108);
            rule__FormElementModalAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElementModalAttribute__Group__1_in_rule__FormElementModalAttribute__Group__08111);
            rule__FormElementModalAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementModalAttribute__Group__0"


    // $ANTLR start "rule__FormElementModalAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3940:1: rule__FormElementModalAttribute__Group__0__Impl : ( 'modal=' ) ;
    public final void rule__FormElementModalAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3944:1: ( ( 'modal=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3945:1: ( 'modal=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3945:1: ( 'modal=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3946:1: 'modal='
            {
             before(grammarAccess.getFormElementModalAttributeAccess().getModalKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__FormElementModalAttribute__Group__0__Impl8139); 
             after(grammarAccess.getFormElementModalAttributeAccess().getModalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementModalAttribute__Group__0__Impl"


    // $ANTLR start "rule__FormElementModalAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3959:1: rule__FormElementModalAttribute__Group__1 : rule__FormElementModalAttribute__Group__1__Impl ;
    public final void rule__FormElementModalAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3963:1: ( rule__FormElementModalAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3964:2: rule__FormElementModalAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FormElementModalAttribute__Group__1__Impl_in_rule__FormElementModalAttribute__Group__18170);
            rule__FormElementModalAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementModalAttribute__Group__1"


    // $ANTLR start "rule__FormElementModalAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3970:1: rule__FormElementModalAttribute__Group__1__Impl : ( ( rule__FormElementModalAttribute__ValueAssignment_1 ) ) ;
    public final void rule__FormElementModalAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3974:1: ( ( ( rule__FormElementModalAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3975:1: ( ( rule__FormElementModalAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3975:1: ( ( rule__FormElementModalAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3976:1: ( rule__FormElementModalAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getFormElementModalAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3977:1: ( rule__FormElementModalAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3977:2: rule__FormElementModalAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FormElementModalAttribute__ValueAssignment_1_in_rule__FormElementModalAttribute__Group__1__Impl8197);
            rule__FormElementModalAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormElementModalAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementModalAttribute__Group__1__Impl"


    // $ANTLR start "rule__FormElementColumnsAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3991:1: rule__FormElementColumnsAttribute__Group__0 : rule__FormElementColumnsAttribute__Group__0__Impl rule__FormElementColumnsAttribute__Group__1 ;
    public final void rule__FormElementColumnsAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3995:1: ( rule__FormElementColumnsAttribute__Group__0__Impl rule__FormElementColumnsAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:3996:2: rule__FormElementColumnsAttribute__Group__0__Impl rule__FormElementColumnsAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__FormElementColumnsAttribute__Group__0__Impl_in_rule__FormElementColumnsAttribute__Group__08231);
            rule__FormElementColumnsAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormElementColumnsAttribute__Group__1_in_rule__FormElementColumnsAttribute__Group__08234);
            rule__FormElementColumnsAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementColumnsAttribute__Group__0"


    // $ANTLR start "rule__FormElementColumnsAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4003:1: rule__FormElementColumnsAttribute__Group__0__Impl : ( 'columns=' ) ;
    public final void rule__FormElementColumnsAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4007:1: ( ( 'columns=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4008:1: ( 'columns=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4008:1: ( 'columns=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4009:1: 'columns='
            {
             before(grammarAccess.getFormElementColumnsAttributeAccess().getColumnsKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__FormElementColumnsAttribute__Group__0__Impl8262); 
             after(grammarAccess.getFormElementColumnsAttributeAccess().getColumnsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementColumnsAttribute__Group__0__Impl"


    // $ANTLR start "rule__FormElementColumnsAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4022:1: rule__FormElementColumnsAttribute__Group__1 : rule__FormElementColumnsAttribute__Group__1__Impl ;
    public final void rule__FormElementColumnsAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4026:1: ( rule__FormElementColumnsAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4027:2: rule__FormElementColumnsAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FormElementColumnsAttribute__Group__1__Impl_in_rule__FormElementColumnsAttribute__Group__18293);
            rule__FormElementColumnsAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementColumnsAttribute__Group__1"


    // $ANTLR start "rule__FormElementColumnsAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4033:1: rule__FormElementColumnsAttribute__Group__1__Impl : ( ( rule__FormElementColumnsAttribute__ValueAssignment_1 ) ) ;
    public final void rule__FormElementColumnsAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4037:1: ( ( ( rule__FormElementColumnsAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4038:1: ( ( rule__FormElementColumnsAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4038:1: ( ( rule__FormElementColumnsAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4039:1: ( rule__FormElementColumnsAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getFormElementColumnsAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4040:1: ( rule__FormElementColumnsAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4040:2: rule__FormElementColumnsAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__FormElementColumnsAttribute__ValueAssignment_1_in_rule__FormElementColumnsAttribute__Group__1__Impl8320);
            rule__FormElementColumnsAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormElementColumnsAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementColumnsAttribute__Group__1__Impl"


    // $ANTLR start "rule__SequenceBoxElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4054:1: rule__SequenceBoxElement__Group__0 : rule__SequenceBoxElement__Group__0__Impl rule__SequenceBoxElement__Group__1 ;
    public final void rule__SequenceBoxElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4058:1: ( rule__SequenceBoxElement__Group__0__Impl rule__SequenceBoxElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4059:2: rule__SequenceBoxElement__Group__0__Impl rule__SequenceBoxElement__Group__1
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__0__Impl_in_rule__SequenceBoxElement__Group__08354);
            rule__SequenceBoxElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__1_in_rule__SequenceBoxElement__Group__08357);
            rule__SequenceBoxElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__0"


    // $ANTLR start "rule__SequenceBoxElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4066:1: rule__SequenceBoxElement__Group__0__Impl : ( 'sequence_box ' ) ;
    public final void rule__SequenceBoxElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4070:1: ( ( 'sequence_box ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4071:1: ( 'sequence_box ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4071:1: ( 'sequence_box ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4072:1: 'sequence_box '
            {
             before(grammarAccess.getSequenceBoxElementAccess().getSequence_boxKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__SequenceBoxElement__Group__0__Impl8385); 
             after(grammarAccess.getSequenceBoxElementAccess().getSequence_boxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__0__Impl"


    // $ANTLR start "rule__SequenceBoxElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4085:1: rule__SequenceBoxElement__Group__1 : rule__SequenceBoxElement__Group__1__Impl rule__SequenceBoxElement__Group__2 ;
    public final void rule__SequenceBoxElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4089:1: ( rule__SequenceBoxElement__Group__1__Impl rule__SequenceBoxElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4090:2: rule__SequenceBoxElement__Group__1__Impl rule__SequenceBoxElement__Group__2
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__1__Impl_in_rule__SequenceBoxElement__Group__18416);
            rule__SequenceBoxElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__2_in_rule__SequenceBoxElement__Group__18419);
            rule__SequenceBoxElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__1"


    // $ANTLR start "rule__SequenceBoxElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4097:1: rule__SequenceBoxElement__Group__1__Impl : ( ( rule__SequenceBoxElement__NameAssignment_1 ) ) ;
    public final void rule__SequenceBoxElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4101:1: ( ( ( rule__SequenceBoxElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4102:1: ( ( rule__SequenceBoxElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4102:1: ( ( rule__SequenceBoxElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4103:1: ( rule__SequenceBoxElement__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceBoxElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4104:1: ( rule__SequenceBoxElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4104:2: rule__SequenceBoxElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__NameAssignment_1_in_rule__SequenceBoxElement__Group__1__Impl8446);
            rule__SequenceBoxElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceBoxElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__1__Impl"


    // $ANTLR start "rule__SequenceBoxElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4114:1: rule__SequenceBoxElement__Group__2 : rule__SequenceBoxElement__Group__2__Impl rule__SequenceBoxElement__Group__3 ;
    public final void rule__SequenceBoxElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4118:1: ( rule__SequenceBoxElement__Group__2__Impl rule__SequenceBoxElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4119:2: rule__SequenceBoxElement__Group__2__Impl rule__SequenceBoxElement__Group__3
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__2__Impl_in_rule__SequenceBoxElement__Group__28476);
            rule__SequenceBoxElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__3_in_rule__SequenceBoxElement__Group__28479);
            rule__SequenceBoxElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__2"


    // $ANTLR start "rule__SequenceBoxElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4126:1: rule__SequenceBoxElement__Group__2__Impl : ( ( rule__SequenceBoxElement__PropertiesAssignment_2 )* ) ;
    public final void rule__SequenceBoxElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4130:1: ( ( ( rule__SequenceBoxElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4131:1: ( ( rule__SequenceBoxElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4131:1: ( ( rule__SequenceBoxElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4132:1: ( rule__SequenceBoxElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getSequenceBoxElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4133:1: ( rule__SequenceBoxElement__PropertiesAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=26 && LA22_0<=29)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4133:2: rule__SequenceBoxElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SequenceBoxElement__PropertiesAssignment_2_in_rule__SequenceBoxElement__Group__2__Impl8506);
            	    rule__SequenceBoxElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSequenceBoxElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__2__Impl"


    // $ANTLR start "rule__SequenceBoxElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4143:1: rule__SequenceBoxElement__Group__3 : rule__SequenceBoxElement__Group__3__Impl ;
    public final void rule__SequenceBoxElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4147:1: ( rule__SequenceBoxElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4148:2: rule__SequenceBoxElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group__3__Impl_in_rule__SequenceBoxElement__Group__38537);
            rule__SequenceBoxElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__3"


    // $ANTLR start "rule__SequenceBoxElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4154:1: rule__SequenceBoxElement__Group__3__Impl : ( ( rule__SequenceBoxElement__Group_3__0 )? ) ;
    public final void rule__SequenceBoxElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4158:1: ( ( ( rule__SequenceBoxElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4159:1: ( ( rule__SequenceBoxElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4159:1: ( ( rule__SequenceBoxElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4160:1: ( rule__SequenceBoxElement__Group_3__0 )?
            {
             before(grammarAccess.getSequenceBoxElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4161:1: ( rule__SequenceBoxElement__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4161:2: rule__SequenceBoxElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SequenceBoxElement__Group_3__0_in_rule__SequenceBoxElement__Group__3__Impl8564);
                    rule__SequenceBoxElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceBoxElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group__3__Impl"


    // $ANTLR start "rule__SequenceBoxElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4179:1: rule__SequenceBoxElement__Group_3__0 : rule__SequenceBoxElement__Group_3__0__Impl rule__SequenceBoxElement__Group_3__1 ;
    public final void rule__SequenceBoxElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4183:1: ( rule__SequenceBoxElement__Group_3__0__Impl rule__SequenceBoxElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4184:2: rule__SequenceBoxElement__Group_3__0__Impl rule__SequenceBoxElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group_3__0__Impl_in_rule__SequenceBoxElement__Group_3__08603);
            rule__SequenceBoxElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceBoxElement__Group_3__1_in_rule__SequenceBoxElement__Group_3__08606);
            rule__SequenceBoxElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group_3__0"


    // $ANTLR start "rule__SequenceBoxElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4191:1: rule__SequenceBoxElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__SequenceBoxElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4195:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4196:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4196:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4197:1: '{'
            {
             before(grammarAccess.getSequenceBoxElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__SequenceBoxElement__Group_3__0__Impl8634); 
             after(grammarAccess.getSequenceBoxElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group_3__0__Impl"


    // $ANTLR start "rule__SequenceBoxElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4210:1: rule__SequenceBoxElement__Group_3__1 : rule__SequenceBoxElement__Group_3__1__Impl rule__SequenceBoxElement__Group_3__2 ;
    public final void rule__SequenceBoxElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4214:1: ( rule__SequenceBoxElement__Group_3__1__Impl rule__SequenceBoxElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4215:2: rule__SequenceBoxElement__Group_3__1__Impl rule__SequenceBoxElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group_3__1__Impl_in_rule__SequenceBoxElement__Group_3__18665);
            rule__SequenceBoxElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SequenceBoxElement__Group_3__2_in_rule__SequenceBoxElement__Group_3__18668);
            rule__SequenceBoxElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group_3__1"


    // $ANTLR start "rule__SequenceBoxElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4222:1: rule__SequenceBoxElement__Group_3__1__Impl : ( ( rule__SequenceBoxElement__ChildrenAssignment_3_1 )* ) ;
    public final void rule__SequenceBoxElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4226:1: ( ( ( rule__SequenceBoxElement__ChildrenAssignment_3_1 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4227:1: ( ( rule__SequenceBoxElement__ChildrenAssignment_3_1 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4227:1: ( ( rule__SequenceBoxElement__ChildrenAssignment_3_1 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4228:1: ( rule__SequenceBoxElement__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getSequenceBoxElementAccess().getChildrenAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4229:1: ( rule__SequenceBoxElement__ChildrenAssignment_3_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==40||(LA24_0>=50 && LA24_0<=51)||(LA24_0>=53 && LA24_0<=56)||LA24_0==60) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4229:2: rule__SequenceBoxElement__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__SequenceBoxElement__ChildrenAssignment_3_1_in_rule__SequenceBoxElement__Group_3__1__Impl8695);
            	    rule__SequenceBoxElement__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSequenceBoxElementAccess().getChildrenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group_3__1__Impl"


    // $ANTLR start "rule__SequenceBoxElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4239:1: rule__SequenceBoxElement__Group_3__2 : rule__SequenceBoxElement__Group_3__2__Impl ;
    public final void rule__SequenceBoxElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4243:1: ( rule__SequenceBoxElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4244:2: rule__SequenceBoxElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__Group_3__2__Impl_in_rule__SequenceBoxElement__Group_3__28726);
            rule__SequenceBoxElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group_3__2"


    // $ANTLR start "rule__SequenceBoxElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4250:1: rule__SequenceBoxElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__SequenceBoxElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4254:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4255:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4255:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4256:1: '}'
            {
             before(grammarAccess.getSequenceBoxElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__SequenceBoxElement__Group_3__2__Impl8754); 
             after(grammarAccess.getSequenceBoxElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__Group_3__2__Impl"


    // $ANTLR start "rule__StringElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4275:1: rule__StringElement__Group__0 : rule__StringElement__Group__0__Impl rule__StringElement__Group__1 ;
    public final void rule__StringElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4279:1: ( rule__StringElement__Group__0__Impl rule__StringElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4280:2: rule__StringElement__Group__0__Impl rule__StringElement__Group__1
            {
            pushFollow(FOLLOW_rule__StringElement__Group__0__Impl_in_rule__StringElement__Group__08791);
            rule__StringElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringElement__Group__1_in_rule__StringElement__Group__08794);
            rule__StringElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__0"


    // $ANTLR start "rule__StringElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4287:1: rule__StringElement__Group__0__Impl : ( 'string ' ) ;
    public final void rule__StringElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4291:1: ( ( 'string ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4292:1: ( 'string ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4292:1: ( 'string ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4293:1: 'string '
            {
             before(grammarAccess.getStringElementAccess().getStringKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__StringElement__Group__0__Impl8822); 
             after(grammarAccess.getStringElementAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__0__Impl"


    // $ANTLR start "rule__StringElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4306:1: rule__StringElement__Group__1 : rule__StringElement__Group__1__Impl rule__StringElement__Group__2 ;
    public final void rule__StringElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4310:1: ( rule__StringElement__Group__1__Impl rule__StringElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4311:2: rule__StringElement__Group__1__Impl rule__StringElement__Group__2
            {
            pushFollow(FOLLOW_rule__StringElement__Group__1__Impl_in_rule__StringElement__Group__18853);
            rule__StringElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringElement__Group__2_in_rule__StringElement__Group__18856);
            rule__StringElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__1"


    // $ANTLR start "rule__StringElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4318:1: rule__StringElement__Group__1__Impl : ( ( rule__StringElement__NameAssignment_1 ) ) ;
    public final void rule__StringElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4322:1: ( ( ( rule__StringElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4323:1: ( ( rule__StringElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4323:1: ( ( rule__StringElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4324:1: ( rule__StringElement__NameAssignment_1 )
            {
             before(grammarAccess.getStringElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4325:1: ( rule__StringElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4325:2: rule__StringElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StringElement__NameAssignment_1_in_rule__StringElement__Group__1__Impl8883);
            rule__StringElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__1__Impl"


    // $ANTLR start "rule__StringElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4335:1: rule__StringElement__Group__2 : rule__StringElement__Group__2__Impl rule__StringElement__Group__3 ;
    public final void rule__StringElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4339:1: ( rule__StringElement__Group__2__Impl rule__StringElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4340:2: rule__StringElement__Group__2__Impl rule__StringElement__Group__3
            {
            pushFollow(FOLLOW_rule__StringElement__Group__2__Impl_in_rule__StringElement__Group__28913);
            rule__StringElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringElement__Group__3_in_rule__StringElement__Group__28916);
            rule__StringElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__2"


    // $ANTLR start "rule__StringElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4347:1: rule__StringElement__Group__2__Impl : ( ( rule__StringElement__PropertiesAssignment_2 )* ) ;
    public final void rule__StringElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4351:1: ( ( ( rule__StringElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4352:1: ( ( rule__StringElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4352:1: ( ( rule__StringElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4353:1: ( rule__StringElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getStringElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4354:1: ( rule__StringElement__PropertiesAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=26 && LA25_0<=30)||LA25_0==52) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4354:2: rule__StringElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__StringElement__PropertiesAssignment_2_in_rule__StringElement__Group__2__Impl8943);
            	    rule__StringElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getStringElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__2__Impl"


    // $ANTLR start "rule__StringElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4364:1: rule__StringElement__Group__3 : rule__StringElement__Group__3__Impl ;
    public final void rule__StringElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4368:1: ( rule__StringElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4369:2: rule__StringElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StringElement__Group__3__Impl_in_rule__StringElement__Group__38974);
            rule__StringElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__3"


    // $ANTLR start "rule__StringElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4375:1: rule__StringElement__Group__3__Impl : ( ( rule__StringElement__Group_3__0 )? ) ;
    public final void rule__StringElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4379:1: ( ( ( rule__StringElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4380:1: ( ( rule__StringElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4380:1: ( ( rule__StringElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4381:1: ( rule__StringElement__Group_3__0 )?
            {
             before(grammarAccess.getStringElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4382:1: ( rule__StringElement__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4382:2: rule__StringElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StringElement__Group_3__0_in_rule__StringElement__Group__3__Impl9001);
                    rule__StringElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group__3__Impl"


    // $ANTLR start "rule__StringElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4400:1: rule__StringElement__Group_3__0 : rule__StringElement__Group_3__0__Impl rule__StringElement__Group_3__1 ;
    public final void rule__StringElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4404:1: ( rule__StringElement__Group_3__0__Impl rule__StringElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4405:2: rule__StringElement__Group_3__0__Impl rule__StringElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__StringElement__Group_3__0__Impl_in_rule__StringElement__Group_3__09040);
            rule__StringElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringElement__Group_3__1_in_rule__StringElement__Group_3__09043);
            rule__StringElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group_3__0"


    // $ANTLR start "rule__StringElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4412:1: rule__StringElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__StringElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4416:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4417:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4417:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4418:1: '{'
            {
             before(grammarAccess.getStringElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__StringElement__Group_3__0__Impl9071); 
             after(grammarAccess.getStringElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group_3__0__Impl"


    // $ANTLR start "rule__StringElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4431:1: rule__StringElement__Group_3__1 : rule__StringElement__Group_3__1__Impl rule__StringElement__Group_3__2 ;
    public final void rule__StringElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4435:1: ( rule__StringElement__Group_3__1__Impl rule__StringElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4436:2: rule__StringElement__Group_3__1__Impl rule__StringElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__StringElement__Group_3__1__Impl_in_rule__StringElement__Group_3__19102);
            rule__StringElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringElement__Group_3__2_in_rule__StringElement__Group_3__19105);
            rule__StringElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group_3__1"


    // $ANTLR start "rule__StringElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4443:1: rule__StringElement__Group_3__1__Impl : ( ( ( rule__StringElement__LogicAssignment_3_1 ) ) ( ( rule__StringElement__LogicAssignment_3_1 )* ) ) ;
    public final void rule__StringElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4447:1: ( ( ( ( rule__StringElement__LogicAssignment_3_1 ) ) ( ( rule__StringElement__LogicAssignment_3_1 )* ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4448:1: ( ( ( rule__StringElement__LogicAssignment_3_1 ) ) ( ( rule__StringElement__LogicAssignment_3_1 )* ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4448:1: ( ( ( rule__StringElement__LogicAssignment_3_1 ) ) ( ( rule__StringElement__LogicAssignment_3_1 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4449:1: ( ( rule__StringElement__LogicAssignment_3_1 ) ) ( ( rule__StringElement__LogicAssignment_3_1 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4449:1: ( ( rule__StringElement__LogicAssignment_3_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4450:1: ( rule__StringElement__LogicAssignment_3_1 )
            {
             before(grammarAccess.getStringElementAccess().getLogicAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4451:1: ( rule__StringElement__LogicAssignment_3_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4451:2: rule__StringElement__LogicAssignment_3_1
            {
            pushFollow(FOLLOW_rule__StringElement__LogicAssignment_3_1_in_rule__StringElement__Group_3__1__Impl9134);
            rule__StringElement__LogicAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStringElementAccess().getLogicAssignment_3_1()); 

            }

            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4454:1: ( ( rule__StringElement__LogicAssignment_3_1 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4455:1: ( rule__StringElement__LogicAssignment_3_1 )*
            {
             before(grammarAccess.getStringElementAccess().getLogicAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4456:1: ( rule__StringElement__LogicAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4456:2: rule__StringElement__LogicAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__StringElement__LogicAssignment_3_1_in_rule__StringElement__Group_3__1__Impl9146);
            	    rule__StringElement__LogicAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getStringElementAccess().getLogicAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group_3__1__Impl"


    // $ANTLR start "rule__StringElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4467:1: rule__StringElement__Group_3__2 : rule__StringElement__Group_3__2__Impl ;
    public final void rule__StringElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4471:1: ( rule__StringElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4472:2: rule__StringElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__StringElement__Group_3__2__Impl_in_rule__StringElement__Group_3__29179);
            rule__StringElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group_3__2"


    // $ANTLR start "rule__StringElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4478:1: rule__StringElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__StringElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4482:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4483:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4483:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4484:1: '}'
            {
             before(grammarAccess.getStringElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__StringElement__Group_3__2__Impl9207); 
             after(grammarAccess.getStringElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__Group_3__2__Impl"


    // $ANTLR start "rule__StringElementMaxlenAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4503:1: rule__StringElementMaxlenAttribute__Group__0 : rule__StringElementMaxlenAttribute__Group__0__Impl rule__StringElementMaxlenAttribute__Group__1 ;
    public final void rule__StringElementMaxlenAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4507:1: ( rule__StringElementMaxlenAttribute__Group__0__Impl rule__StringElementMaxlenAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4508:2: rule__StringElementMaxlenAttribute__Group__0__Impl rule__StringElementMaxlenAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__StringElementMaxlenAttribute__Group__0__Impl_in_rule__StringElementMaxlenAttribute__Group__09244);
            rule__StringElementMaxlenAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StringElementMaxlenAttribute__Group__1_in_rule__StringElementMaxlenAttribute__Group__09247);
            rule__StringElementMaxlenAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElementMaxlenAttribute__Group__0"


    // $ANTLR start "rule__StringElementMaxlenAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4515:1: rule__StringElementMaxlenAttribute__Group__0__Impl : ( 'maxlen=' ) ;
    public final void rule__StringElementMaxlenAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4519:1: ( ( 'maxlen=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4520:1: ( 'maxlen=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4520:1: ( 'maxlen=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4521:1: 'maxlen='
            {
             before(grammarAccess.getStringElementMaxlenAttributeAccess().getMaxlenKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__StringElementMaxlenAttribute__Group__0__Impl9275); 
             after(grammarAccess.getStringElementMaxlenAttributeAccess().getMaxlenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElementMaxlenAttribute__Group__0__Impl"


    // $ANTLR start "rule__StringElementMaxlenAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4534:1: rule__StringElementMaxlenAttribute__Group__1 : rule__StringElementMaxlenAttribute__Group__1__Impl ;
    public final void rule__StringElementMaxlenAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4538:1: ( rule__StringElementMaxlenAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4539:2: rule__StringElementMaxlenAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StringElementMaxlenAttribute__Group__1__Impl_in_rule__StringElementMaxlenAttribute__Group__19306);
            rule__StringElementMaxlenAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElementMaxlenAttribute__Group__1"


    // $ANTLR start "rule__StringElementMaxlenAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4545:1: rule__StringElementMaxlenAttribute__Group__1__Impl : ( ( rule__StringElementMaxlenAttribute__ValueAssignment_1 ) ) ;
    public final void rule__StringElementMaxlenAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4549:1: ( ( ( rule__StringElementMaxlenAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4550:1: ( ( rule__StringElementMaxlenAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4550:1: ( ( rule__StringElementMaxlenAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4551:1: ( rule__StringElementMaxlenAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getStringElementMaxlenAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4552:1: ( rule__StringElementMaxlenAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4552:2: rule__StringElementMaxlenAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__StringElementMaxlenAttribute__ValueAssignment_1_in_rule__StringElementMaxlenAttribute__Group__1__Impl9333);
            rule__StringElementMaxlenAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringElementMaxlenAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElementMaxlenAttribute__Group__1__Impl"


    // $ANTLR start "rule__DoubleElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4566:1: rule__DoubleElement__Group__0 : rule__DoubleElement__Group__0__Impl rule__DoubleElement__Group__1 ;
    public final void rule__DoubleElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4570:1: ( rule__DoubleElement__Group__0__Impl rule__DoubleElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4571:2: rule__DoubleElement__Group__0__Impl rule__DoubleElement__Group__1
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group__0__Impl_in_rule__DoubleElement__Group__09367);
            rule__DoubleElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleElement__Group__1_in_rule__DoubleElement__Group__09370);
            rule__DoubleElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__0"


    // $ANTLR start "rule__DoubleElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4578:1: rule__DoubleElement__Group__0__Impl : ( 'double ' ) ;
    public final void rule__DoubleElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4582:1: ( ( 'double ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4583:1: ( 'double ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4583:1: ( 'double ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4584:1: 'double '
            {
             before(grammarAccess.getDoubleElementAccess().getDoubleKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__DoubleElement__Group__0__Impl9398); 
             after(grammarAccess.getDoubleElementAccess().getDoubleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__0__Impl"


    // $ANTLR start "rule__DoubleElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4597:1: rule__DoubleElement__Group__1 : rule__DoubleElement__Group__1__Impl rule__DoubleElement__Group__2 ;
    public final void rule__DoubleElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4601:1: ( rule__DoubleElement__Group__1__Impl rule__DoubleElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4602:2: rule__DoubleElement__Group__1__Impl rule__DoubleElement__Group__2
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group__1__Impl_in_rule__DoubleElement__Group__19429);
            rule__DoubleElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleElement__Group__2_in_rule__DoubleElement__Group__19432);
            rule__DoubleElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__1"


    // $ANTLR start "rule__DoubleElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4609:1: rule__DoubleElement__Group__1__Impl : ( ( rule__DoubleElement__NameAssignment_1 ) ) ;
    public final void rule__DoubleElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4613:1: ( ( ( rule__DoubleElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4614:1: ( ( rule__DoubleElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4614:1: ( ( rule__DoubleElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4615:1: ( rule__DoubleElement__NameAssignment_1 )
            {
             before(grammarAccess.getDoubleElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4616:1: ( rule__DoubleElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4616:2: rule__DoubleElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DoubleElement__NameAssignment_1_in_rule__DoubleElement__Group__1__Impl9459);
            rule__DoubleElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__1__Impl"


    // $ANTLR start "rule__DoubleElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4626:1: rule__DoubleElement__Group__2 : rule__DoubleElement__Group__2__Impl rule__DoubleElement__Group__3 ;
    public final void rule__DoubleElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4630:1: ( rule__DoubleElement__Group__2__Impl rule__DoubleElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4631:2: rule__DoubleElement__Group__2__Impl rule__DoubleElement__Group__3
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group__2__Impl_in_rule__DoubleElement__Group__29489);
            rule__DoubleElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleElement__Group__3_in_rule__DoubleElement__Group__29492);
            rule__DoubleElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__2"


    // $ANTLR start "rule__DoubleElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4638:1: rule__DoubleElement__Group__2__Impl : ( ( rule__DoubleElement__PropertiesAssignment_2 )* ) ;
    public final void rule__DoubleElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4642:1: ( ( ( rule__DoubleElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4643:1: ( ( rule__DoubleElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4643:1: ( ( rule__DoubleElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4644:1: ( rule__DoubleElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getDoubleElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4645:1: ( rule__DoubleElement__PropertiesAssignment_2 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=26 && LA28_0<=30)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4645:2: rule__DoubleElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__DoubleElement__PropertiesAssignment_2_in_rule__DoubleElement__Group__2__Impl9519);
            	    rule__DoubleElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDoubleElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__2__Impl"


    // $ANTLR start "rule__DoubleElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4655:1: rule__DoubleElement__Group__3 : rule__DoubleElement__Group__3__Impl ;
    public final void rule__DoubleElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4659:1: ( rule__DoubleElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4660:2: rule__DoubleElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group__3__Impl_in_rule__DoubleElement__Group__39550);
            rule__DoubleElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__3"


    // $ANTLR start "rule__DoubleElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4666:1: rule__DoubleElement__Group__3__Impl : ( ( rule__DoubleElement__Group_3__0 )? ) ;
    public final void rule__DoubleElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4670:1: ( ( ( rule__DoubleElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4671:1: ( ( rule__DoubleElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4671:1: ( ( rule__DoubleElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4672:1: ( rule__DoubleElement__Group_3__0 )?
            {
             before(grammarAccess.getDoubleElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4673:1: ( rule__DoubleElement__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4673:2: rule__DoubleElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DoubleElement__Group_3__0_in_rule__DoubleElement__Group__3__Impl9577);
                    rule__DoubleElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group__3__Impl"


    // $ANTLR start "rule__DoubleElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4691:1: rule__DoubleElement__Group_3__0 : rule__DoubleElement__Group_3__0__Impl rule__DoubleElement__Group_3__1 ;
    public final void rule__DoubleElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4695:1: ( rule__DoubleElement__Group_3__0__Impl rule__DoubleElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4696:2: rule__DoubleElement__Group_3__0__Impl rule__DoubleElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group_3__0__Impl_in_rule__DoubleElement__Group_3__09616);
            rule__DoubleElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleElement__Group_3__1_in_rule__DoubleElement__Group_3__09619);
            rule__DoubleElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group_3__0"


    // $ANTLR start "rule__DoubleElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4703:1: rule__DoubleElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DoubleElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4707:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4708:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4708:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4709:1: '{'
            {
             before(grammarAccess.getDoubleElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__DoubleElement__Group_3__0__Impl9647); 
             after(grammarAccess.getDoubleElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group_3__0__Impl"


    // $ANTLR start "rule__DoubleElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4722:1: rule__DoubleElement__Group_3__1 : rule__DoubleElement__Group_3__1__Impl rule__DoubleElement__Group_3__2 ;
    public final void rule__DoubleElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4726:1: ( rule__DoubleElement__Group_3__1__Impl rule__DoubleElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4727:2: rule__DoubleElement__Group_3__1__Impl rule__DoubleElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group_3__1__Impl_in_rule__DoubleElement__Group_3__19678);
            rule__DoubleElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DoubleElement__Group_3__2_in_rule__DoubleElement__Group_3__19681);
            rule__DoubleElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group_3__1"


    // $ANTLR start "rule__DoubleElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4734:1: rule__DoubleElement__Group_3__1__Impl : ( ( rule__DoubleElement__ChildrenAssignment_3_1 )* ) ;
    public final void rule__DoubleElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4738:1: ( ( ( rule__DoubleElement__ChildrenAssignment_3_1 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4739:1: ( ( rule__DoubleElement__ChildrenAssignment_3_1 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4739:1: ( ( rule__DoubleElement__ChildrenAssignment_3_1 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4740:1: ( rule__DoubleElement__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getDoubleElementAccess().getChildrenAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4741:1: ( rule__DoubleElement__ChildrenAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4741:2: rule__DoubleElement__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__DoubleElement__ChildrenAssignment_3_1_in_rule__DoubleElement__Group_3__1__Impl9708);
            	    rule__DoubleElement__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDoubleElementAccess().getChildrenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group_3__1__Impl"


    // $ANTLR start "rule__DoubleElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4751:1: rule__DoubleElement__Group_3__2 : rule__DoubleElement__Group_3__2__Impl ;
    public final void rule__DoubleElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4755:1: ( rule__DoubleElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4756:2: rule__DoubleElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DoubleElement__Group_3__2__Impl_in_rule__DoubleElement__Group_3__29739);
            rule__DoubleElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group_3__2"


    // $ANTLR start "rule__DoubleElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4762:1: rule__DoubleElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DoubleElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4766:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4767:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4767:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4768:1: '}'
            {
             before(grammarAccess.getDoubleElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__DoubleElement__Group_3__2__Impl9767); 
             after(grammarAccess.getDoubleElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__Group_3__2__Impl"


    // $ANTLR start "rule__LongElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4787:1: rule__LongElement__Group__0 : rule__LongElement__Group__0__Impl rule__LongElement__Group__1 ;
    public final void rule__LongElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4791:1: ( rule__LongElement__Group__0__Impl rule__LongElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4792:2: rule__LongElement__Group__0__Impl rule__LongElement__Group__1
            {
            pushFollow(FOLLOW_rule__LongElement__Group__0__Impl_in_rule__LongElement__Group__09804);
            rule__LongElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongElement__Group__1_in_rule__LongElement__Group__09807);
            rule__LongElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__0"


    // $ANTLR start "rule__LongElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4799:1: rule__LongElement__Group__0__Impl : ( 'long ' ) ;
    public final void rule__LongElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4803:1: ( ( 'long ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4804:1: ( 'long ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4804:1: ( 'long ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4805:1: 'long '
            {
             before(grammarAccess.getLongElementAccess().getLongKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__LongElement__Group__0__Impl9835); 
             after(grammarAccess.getLongElementAccess().getLongKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__0__Impl"


    // $ANTLR start "rule__LongElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4818:1: rule__LongElement__Group__1 : rule__LongElement__Group__1__Impl rule__LongElement__Group__2 ;
    public final void rule__LongElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4822:1: ( rule__LongElement__Group__1__Impl rule__LongElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4823:2: rule__LongElement__Group__1__Impl rule__LongElement__Group__2
            {
            pushFollow(FOLLOW_rule__LongElement__Group__1__Impl_in_rule__LongElement__Group__19866);
            rule__LongElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongElement__Group__2_in_rule__LongElement__Group__19869);
            rule__LongElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__1"


    // $ANTLR start "rule__LongElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4830:1: rule__LongElement__Group__1__Impl : ( ( rule__LongElement__NameAssignment_1 ) ) ;
    public final void rule__LongElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4834:1: ( ( ( rule__LongElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4835:1: ( ( rule__LongElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4835:1: ( ( rule__LongElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4836:1: ( rule__LongElement__NameAssignment_1 )
            {
             before(grammarAccess.getLongElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4837:1: ( rule__LongElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4837:2: rule__LongElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__LongElement__NameAssignment_1_in_rule__LongElement__Group__1__Impl9896);
            rule__LongElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLongElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__1__Impl"


    // $ANTLR start "rule__LongElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4847:1: rule__LongElement__Group__2 : rule__LongElement__Group__2__Impl rule__LongElement__Group__3 ;
    public final void rule__LongElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4851:1: ( rule__LongElement__Group__2__Impl rule__LongElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4852:2: rule__LongElement__Group__2__Impl rule__LongElement__Group__3
            {
            pushFollow(FOLLOW_rule__LongElement__Group__2__Impl_in_rule__LongElement__Group__29926);
            rule__LongElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongElement__Group__3_in_rule__LongElement__Group__29929);
            rule__LongElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__2"


    // $ANTLR start "rule__LongElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4859:1: rule__LongElement__Group__2__Impl : ( ( rule__LongElement__PropertiesAssignment_2 )* ) ;
    public final void rule__LongElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4863:1: ( ( ( rule__LongElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4864:1: ( ( rule__LongElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4864:1: ( ( rule__LongElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4865:1: ( rule__LongElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getLongElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4866:1: ( rule__LongElement__PropertiesAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=26 && LA31_0<=30)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4866:2: rule__LongElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__LongElement__PropertiesAssignment_2_in_rule__LongElement__Group__2__Impl9956);
            	    rule__LongElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getLongElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__2__Impl"


    // $ANTLR start "rule__LongElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4876:1: rule__LongElement__Group__3 : rule__LongElement__Group__3__Impl ;
    public final void rule__LongElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4880:1: ( rule__LongElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4881:2: rule__LongElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LongElement__Group__3__Impl_in_rule__LongElement__Group__39987);
            rule__LongElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__3"


    // $ANTLR start "rule__LongElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4887:1: rule__LongElement__Group__3__Impl : ( ( rule__LongElement__Group_3__0 )? ) ;
    public final void rule__LongElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4891:1: ( ( ( rule__LongElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4892:1: ( ( rule__LongElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4892:1: ( ( rule__LongElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4893:1: ( rule__LongElement__Group_3__0 )?
            {
             before(grammarAccess.getLongElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4894:1: ( rule__LongElement__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4894:2: rule__LongElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__LongElement__Group_3__0_in_rule__LongElement__Group__3__Impl10014);
                    rule__LongElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLongElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group__3__Impl"


    // $ANTLR start "rule__LongElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4912:1: rule__LongElement__Group_3__0 : rule__LongElement__Group_3__0__Impl rule__LongElement__Group_3__1 ;
    public final void rule__LongElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4916:1: ( rule__LongElement__Group_3__0__Impl rule__LongElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4917:2: rule__LongElement__Group_3__0__Impl rule__LongElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__LongElement__Group_3__0__Impl_in_rule__LongElement__Group_3__010053);
            rule__LongElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongElement__Group_3__1_in_rule__LongElement__Group_3__010056);
            rule__LongElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group_3__0"


    // $ANTLR start "rule__LongElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4924:1: rule__LongElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__LongElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4928:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4929:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4929:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4930:1: '{'
            {
             before(grammarAccess.getLongElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__LongElement__Group_3__0__Impl10084); 
             after(grammarAccess.getLongElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group_3__0__Impl"


    // $ANTLR start "rule__LongElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4943:1: rule__LongElement__Group_3__1 : rule__LongElement__Group_3__1__Impl rule__LongElement__Group_3__2 ;
    public final void rule__LongElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4947:1: ( rule__LongElement__Group_3__1__Impl rule__LongElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4948:2: rule__LongElement__Group_3__1__Impl rule__LongElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__LongElement__Group_3__1__Impl_in_rule__LongElement__Group_3__110115);
            rule__LongElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LongElement__Group_3__2_in_rule__LongElement__Group_3__110118);
            rule__LongElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group_3__1"


    // $ANTLR start "rule__LongElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4955:1: rule__LongElement__Group_3__1__Impl : ( ( rule__LongElement__ChildrenAssignment_3_1 )* ) ;
    public final void rule__LongElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4959:1: ( ( ( rule__LongElement__ChildrenAssignment_3_1 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4960:1: ( ( rule__LongElement__ChildrenAssignment_3_1 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4960:1: ( ( rule__LongElement__ChildrenAssignment_3_1 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4961:1: ( rule__LongElement__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getLongElementAccess().getChildrenAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4962:1: ( rule__LongElement__ChildrenAssignment_3_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==40) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4962:2: rule__LongElement__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__LongElement__ChildrenAssignment_3_1_in_rule__LongElement__Group_3__1__Impl10145);
            	    rule__LongElement__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getLongElementAccess().getChildrenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group_3__1__Impl"


    // $ANTLR start "rule__LongElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4972:1: rule__LongElement__Group_3__2 : rule__LongElement__Group_3__2__Impl ;
    public final void rule__LongElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4976:1: ( rule__LongElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4977:2: rule__LongElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__LongElement__Group_3__2__Impl_in_rule__LongElement__Group_3__210176);
            rule__LongElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group_3__2"


    // $ANTLR start "rule__LongElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4983:1: rule__LongElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__LongElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4987:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4988:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4988:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:4989:1: '}'
            {
             before(grammarAccess.getLongElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__LongElement__Group_3__2__Impl10204); 
             after(grammarAccess.getLongElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__Group_3__2__Impl"


    // $ANTLR start "rule__DateElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5008:1: rule__DateElement__Group__0 : rule__DateElement__Group__0__Impl rule__DateElement__Group__1 ;
    public final void rule__DateElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5012:1: ( rule__DateElement__Group__0__Impl rule__DateElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5013:2: rule__DateElement__Group__0__Impl rule__DateElement__Group__1
            {
            pushFollow(FOLLOW_rule__DateElement__Group__0__Impl_in_rule__DateElement__Group__010241);
            rule__DateElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateElement__Group__1_in_rule__DateElement__Group__010244);
            rule__DateElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__0"


    // $ANTLR start "rule__DateElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5020:1: rule__DateElement__Group__0__Impl : ( 'date ' ) ;
    public final void rule__DateElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5024:1: ( ( 'date ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5025:1: ( 'date ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5025:1: ( 'date ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5026:1: 'date '
            {
             before(grammarAccess.getDateElementAccess().getDateKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__DateElement__Group__0__Impl10272); 
             after(grammarAccess.getDateElementAccess().getDateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__0__Impl"


    // $ANTLR start "rule__DateElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5039:1: rule__DateElement__Group__1 : rule__DateElement__Group__1__Impl rule__DateElement__Group__2 ;
    public final void rule__DateElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5043:1: ( rule__DateElement__Group__1__Impl rule__DateElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5044:2: rule__DateElement__Group__1__Impl rule__DateElement__Group__2
            {
            pushFollow(FOLLOW_rule__DateElement__Group__1__Impl_in_rule__DateElement__Group__110303);
            rule__DateElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateElement__Group__2_in_rule__DateElement__Group__110306);
            rule__DateElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__1"


    // $ANTLR start "rule__DateElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5051:1: rule__DateElement__Group__1__Impl : ( ( rule__DateElement__NameAssignment_1 ) ) ;
    public final void rule__DateElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5055:1: ( ( ( rule__DateElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5056:1: ( ( rule__DateElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5056:1: ( ( rule__DateElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5057:1: ( rule__DateElement__NameAssignment_1 )
            {
             before(grammarAccess.getDateElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5058:1: ( rule__DateElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5058:2: rule__DateElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DateElement__NameAssignment_1_in_rule__DateElement__Group__1__Impl10333);
            rule__DateElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDateElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__1__Impl"


    // $ANTLR start "rule__DateElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5068:1: rule__DateElement__Group__2 : rule__DateElement__Group__2__Impl rule__DateElement__Group__3 ;
    public final void rule__DateElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5072:1: ( rule__DateElement__Group__2__Impl rule__DateElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5073:2: rule__DateElement__Group__2__Impl rule__DateElement__Group__3
            {
            pushFollow(FOLLOW_rule__DateElement__Group__2__Impl_in_rule__DateElement__Group__210363);
            rule__DateElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateElement__Group__3_in_rule__DateElement__Group__210366);
            rule__DateElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__2"


    // $ANTLR start "rule__DateElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5080:1: rule__DateElement__Group__2__Impl : ( ( rule__DateElement__PropertiesAssignment_2 )* ) ;
    public final void rule__DateElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5084:1: ( ( ( rule__DateElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5085:1: ( ( rule__DateElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5085:1: ( ( rule__DateElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5086:1: ( rule__DateElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getDateElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5087:1: ( rule__DateElement__PropertiesAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=26 && LA34_0<=30)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5087:2: rule__DateElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__DateElement__PropertiesAssignment_2_in_rule__DateElement__Group__2__Impl10393);
            	    rule__DateElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getDateElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__2__Impl"


    // $ANTLR start "rule__DateElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5097:1: rule__DateElement__Group__3 : rule__DateElement__Group__3__Impl ;
    public final void rule__DateElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5101:1: ( rule__DateElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5102:2: rule__DateElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DateElement__Group__3__Impl_in_rule__DateElement__Group__310424);
            rule__DateElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__3"


    // $ANTLR start "rule__DateElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5108:1: rule__DateElement__Group__3__Impl : ( ( rule__DateElement__Group_3__0 )? ) ;
    public final void rule__DateElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5112:1: ( ( ( rule__DateElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5113:1: ( ( rule__DateElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5113:1: ( ( rule__DateElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5114:1: ( rule__DateElement__Group_3__0 )?
            {
             before(grammarAccess.getDateElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5115:1: ( rule__DateElement__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5115:2: rule__DateElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DateElement__Group_3__0_in_rule__DateElement__Group__3__Impl10451);
                    rule__DateElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDateElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group__3__Impl"


    // $ANTLR start "rule__DateElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5133:1: rule__DateElement__Group_3__0 : rule__DateElement__Group_3__0__Impl rule__DateElement__Group_3__1 ;
    public final void rule__DateElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5137:1: ( rule__DateElement__Group_3__0__Impl rule__DateElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5138:2: rule__DateElement__Group_3__0__Impl rule__DateElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__DateElement__Group_3__0__Impl_in_rule__DateElement__Group_3__010490);
            rule__DateElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateElement__Group_3__1_in_rule__DateElement__Group_3__010493);
            rule__DateElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group_3__0"


    // $ANTLR start "rule__DateElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5145:1: rule__DateElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__DateElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5149:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5150:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5150:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5151:1: '{'
            {
             before(grammarAccess.getDateElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__DateElement__Group_3__0__Impl10521); 
             after(grammarAccess.getDateElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group_3__0__Impl"


    // $ANTLR start "rule__DateElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5164:1: rule__DateElement__Group_3__1 : rule__DateElement__Group_3__1__Impl rule__DateElement__Group_3__2 ;
    public final void rule__DateElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5168:1: ( rule__DateElement__Group_3__1__Impl rule__DateElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5169:2: rule__DateElement__Group_3__1__Impl rule__DateElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__DateElement__Group_3__1__Impl_in_rule__DateElement__Group_3__110552);
            rule__DateElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DateElement__Group_3__2_in_rule__DateElement__Group_3__110555);
            rule__DateElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group_3__1"


    // $ANTLR start "rule__DateElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5176:1: rule__DateElement__Group_3__1__Impl : ( ( rule__DateElement__ChildrenAssignment_3_1 )* ) ;
    public final void rule__DateElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5180:1: ( ( ( rule__DateElement__ChildrenAssignment_3_1 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5181:1: ( ( rule__DateElement__ChildrenAssignment_3_1 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5181:1: ( ( rule__DateElement__ChildrenAssignment_3_1 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5182:1: ( rule__DateElement__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getDateElementAccess().getChildrenAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5183:1: ( rule__DateElement__ChildrenAssignment_3_1 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==40) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5183:2: rule__DateElement__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__DateElement__ChildrenAssignment_3_1_in_rule__DateElement__Group_3__1__Impl10582);
            	    rule__DateElement__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getDateElementAccess().getChildrenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group_3__1__Impl"


    // $ANTLR start "rule__DateElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5193:1: rule__DateElement__Group_3__2 : rule__DateElement__Group_3__2__Impl ;
    public final void rule__DateElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5197:1: ( rule__DateElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5198:2: rule__DateElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__DateElement__Group_3__2__Impl_in_rule__DateElement__Group_3__210613);
            rule__DateElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group_3__2"


    // $ANTLR start "rule__DateElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5204:1: rule__DateElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__DateElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5208:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5209:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5209:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5210:1: '}'
            {
             before(grammarAccess.getDateElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__DateElement__Group_3__2__Impl10641); 
             after(grammarAccess.getDateElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__Group_3__2__Impl"


    // $ANTLR start "rule__SmartfieldElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5229:1: rule__SmartfieldElement__Group__0 : rule__SmartfieldElement__Group__0__Impl rule__SmartfieldElement__Group__1 ;
    public final void rule__SmartfieldElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5233:1: ( rule__SmartfieldElement__Group__0__Impl rule__SmartfieldElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5234:2: rule__SmartfieldElement__Group__0__Impl rule__SmartfieldElement__Group__1
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group__0__Impl_in_rule__SmartfieldElement__Group__010678);
            rule__SmartfieldElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElement__Group__1_in_rule__SmartfieldElement__Group__010681);
            rule__SmartfieldElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__0"


    // $ANTLR start "rule__SmartfieldElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5241:1: rule__SmartfieldElement__Group__0__Impl : ( 'smartfield ' ) ;
    public final void rule__SmartfieldElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5245:1: ( ( 'smartfield ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5246:1: ( 'smartfield ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5246:1: ( 'smartfield ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5247:1: 'smartfield '
            {
             before(grammarAccess.getSmartfieldElementAccess().getSmartfieldKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__SmartfieldElement__Group__0__Impl10709); 
             after(grammarAccess.getSmartfieldElementAccess().getSmartfieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__0__Impl"


    // $ANTLR start "rule__SmartfieldElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5260:1: rule__SmartfieldElement__Group__1 : rule__SmartfieldElement__Group__1__Impl rule__SmartfieldElement__Group__2 ;
    public final void rule__SmartfieldElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5264:1: ( rule__SmartfieldElement__Group__1__Impl rule__SmartfieldElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5265:2: rule__SmartfieldElement__Group__1__Impl rule__SmartfieldElement__Group__2
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group__1__Impl_in_rule__SmartfieldElement__Group__110740);
            rule__SmartfieldElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElement__Group__2_in_rule__SmartfieldElement__Group__110743);
            rule__SmartfieldElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__1"


    // $ANTLR start "rule__SmartfieldElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5272:1: rule__SmartfieldElement__Group__1__Impl : ( ( rule__SmartfieldElement__NameAssignment_1 ) ) ;
    public final void rule__SmartfieldElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5276:1: ( ( ( rule__SmartfieldElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5277:1: ( ( rule__SmartfieldElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5277:1: ( ( rule__SmartfieldElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5278:1: ( rule__SmartfieldElement__NameAssignment_1 )
            {
             before(grammarAccess.getSmartfieldElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5279:1: ( rule__SmartfieldElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5279:2: rule__SmartfieldElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__NameAssignment_1_in_rule__SmartfieldElement__Group__1__Impl10770);
            rule__SmartfieldElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__1__Impl"


    // $ANTLR start "rule__SmartfieldElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5289:1: rule__SmartfieldElement__Group__2 : rule__SmartfieldElement__Group__2__Impl rule__SmartfieldElement__Group__3 ;
    public final void rule__SmartfieldElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5293:1: ( rule__SmartfieldElement__Group__2__Impl rule__SmartfieldElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5294:2: rule__SmartfieldElement__Group__2__Impl rule__SmartfieldElement__Group__3
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group__2__Impl_in_rule__SmartfieldElement__Group__210800);
            rule__SmartfieldElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElement__Group__3_in_rule__SmartfieldElement__Group__210803);
            rule__SmartfieldElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__2"


    // $ANTLR start "rule__SmartfieldElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5301:1: rule__SmartfieldElement__Group__2__Impl : ( ( rule__SmartfieldElement__PropertiesAssignment_2 )* ) ;
    public final void rule__SmartfieldElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5305:1: ( ( ( rule__SmartfieldElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5306:1: ( ( rule__SmartfieldElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5306:1: ( ( rule__SmartfieldElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5307:1: ( rule__SmartfieldElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getSmartfieldElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5308:1: ( rule__SmartfieldElement__PropertiesAssignment_2 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=26 && LA37_0<=30)||(LA37_0>=57 && LA37_0<=59)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5308:2: rule__SmartfieldElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SmartfieldElement__PropertiesAssignment_2_in_rule__SmartfieldElement__Group__2__Impl10830);
            	    rule__SmartfieldElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getSmartfieldElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__2__Impl"


    // $ANTLR start "rule__SmartfieldElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5318:1: rule__SmartfieldElement__Group__3 : rule__SmartfieldElement__Group__3__Impl ;
    public final void rule__SmartfieldElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5322:1: ( rule__SmartfieldElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5323:2: rule__SmartfieldElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group__3__Impl_in_rule__SmartfieldElement__Group__310861);
            rule__SmartfieldElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__3"


    // $ANTLR start "rule__SmartfieldElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5329:1: rule__SmartfieldElement__Group__3__Impl : ( ( rule__SmartfieldElement__Group_3__0 )? ) ;
    public final void rule__SmartfieldElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5333:1: ( ( ( rule__SmartfieldElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5334:1: ( ( rule__SmartfieldElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5334:1: ( ( rule__SmartfieldElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5335:1: ( rule__SmartfieldElement__Group_3__0 )?
            {
             before(grammarAccess.getSmartfieldElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5336:1: ( rule__SmartfieldElement__Group_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==35) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5336:2: rule__SmartfieldElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__SmartfieldElement__Group_3__0_in_rule__SmartfieldElement__Group__3__Impl10888);
                    rule__SmartfieldElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmartfieldElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group__3__Impl"


    // $ANTLR start "rule__SmartfieldElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5354:1: rule__SmartfieldElement__Group_3__0 : rule__SmartfieldElement__Group_3__0__Impl rule__SmartfieldElement__Group_3__1 ;
    public final void rule__SmartfieldElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5358:1: ( rule__SmartfieldElement__Group_3__0__Impl rule__SmartfieldElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5359:2: rule__SmartfieldElement__Group_3__0__Impl rule__SmartfieldElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group_3__0__Impl_in_rule__SmartfieldElement__Group_3__010927);
            rule__SmartfieldElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElement__Group_3__1_in_rule__SmartfieldElement__Group_3__010930);
            rule__SmartfieldElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group_3__0"


    // $ANTLR start "rule__SmartfieldElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5366:1: rule__SmartfieldElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__SmartfieldElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5370:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5371:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5371:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5372:1: '{'
            {
             before(grammarAccess.getSmartfieldElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__SmartfieldElement__Group_3__0__Impl10958); 
             after(grammarAccess.getSmartfieldElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group_3__0__Impl"


    // $ANTLR start "rule__SmartfieldElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5385:1: rule__SmartfieldElement__Group_3__1 : rule__SmartfieldElement__Group_3__1__Impl rule__SmartfieldElement__Group_3__2 ;
    public final void rule__SmartfieldElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5389:1: ( rule__SmartfieldElement__Group_3__1__Impl rule__SmartfieldElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5390:2: rule__SmartfieldElement__Group_3__1__Impl rule__SmartfieldElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group_3__1__Impl_in_rule__SmartfieldElement__Group_3__110989);
            rule__SmartfieldElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElement__Group_3__2_in_rule__SmartfieldElement__Group_3__110992);
            rule__SmartfieldElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group_3__1"


    // $ANTLR start "rule__SmartfieldElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5397:1: rule__SmartfieldElement__Group_3__1__Impl : ( ( ( rule__SmartfieldElement__LogicAssignment_3_1 ) ) ( ( rule__SmartfieldElement__LogicAssignment_3_1 )* ) ) ;
    public final void rule__SmartfieldElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5401:1: ( ( ( ( rule__SmartfieldElement__LogicAssignment_3_1 ) ) ( ( rule__SmartfieldElement__LogicAssignment_3_1 )* ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5402:1: ( ( ( rule__SmartfieldElement__LogicAssignment_3_1 ) ) ( ( rule__SmartfieldElement__LogicAssignment_3_1 )* ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5402:1: ( ( ( rule__SmartfieldElement__LogicAssignment_3_1 ) ) ( ( rule__SmartfieldElement__LogicAssignment_3_1 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5403:1: ( ( rule__SmartfieldElement__LogicAssignment_3_1 ) ) ( ( rule__SmartfieldElement__LogicAssignment_3_1 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5403:1: ( ( rule__SmartfieldElement__LogicAssignment_3_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5404:1: ( rule__SmartfieldElement__LogicAssignment_3_1 )
            {
             before(grammarAccess.getSmartfieldElementAccess().getLogicAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5405:1: ( rule__SmartfieldElement__LogicAssignment_3_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5405:2: rule__SmartfieldElement__LogicAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__LogicAssignment_3_1_in_rule__SmartfieldElement__Group_3__1__Impl11021);
            rule__SmartfieldElement__LogicAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementAccess().getLogicAssignment_3_1()); 

            }

            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5408:1: ( ( rule__SmartfieldElement__LogicAssignment_3_1 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5409:1: ( rule__SmartfieldElement__LogicAssignment_3_1 )*
            {
             before(grammarAccess.getSmartfieldElementAccess().getLogicAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5410:1: ( rule__SmartfieldElement__LogicAssignment_3_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==40) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5410:2: rule__SmartfieldElement__LogicAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__SmartfieldElement__LogicAssignment_3_1_in_rule__SmartfieldElement__Group_3__1__Impl11033);
            	    rule__SmartfieldElement__LogicAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getSmartfieldElementAccess().getLogicAssignment_3_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group_3__1__Impl"


    // $ANTLR start "rule__SmartfieldElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5421:1: rule__SmartfieldElement__Group_3__2 : rule__SmartfieldElement__Group_3__2__Impl ;
    public final void rule__SmartfieldElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5425:1: ( rule__SmartfieldElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5426:2: rule__SmartfieldElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__SmartfieldElement__Group_3__2__Impl_in_rule__SmartfieldElement__Group_3__211066);
            rule__SmartfieldElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group_3__2"


    // $ANTLR start "rule__SmartfieldElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5432:1: rule__SmartfieldElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__SmartfieldElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5436:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5437:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5437:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5438:1: '}'
            {
             before(grammarAccess.getSmartfieldElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__SmartfieldElement__Group_3__2__Impl11094); 
             after(grammarAccess.getSmartfieldElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__Group_3__2__Impl"


    // $ANTLR start "rule__SmartfieldElementCodeAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5457:1: rule__SmartfieldElementCodeAttribute__Group__0 : rule__SmartfieldElementCodeAttribute__Group__0__Impl rule__SmartfieldElementCodeAttribute__Group__1 ;
    public final void rule__SmartfieldElementCodeAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5461:1: ( rule__SmartfieldElementCodeAttribute__Group__0__Impl rule__SmartfieldElementCodeAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5462:2: rule__SmartfieldElementCodeAttribute__Group__0__Impl rule__SmartfieldElementCodeAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__SmartfieldElementCodeAttribute__Group__0__Impl_in_rule__SmartfieldElementCodeAttribute__Group__011131);
            rule__SmartfieldElementCodeAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElementCodeAttribute__Group__1_in_rule__SmartfieldElementCodeAttribute__Group__011134);
            rule__SmartfieldElementCodeAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementCodeAttribute__Group__0"


    // $ANTLR start "rule__SmartfieldElementCodeAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5469:1: rule__SmartfieldElementCodeAttribute__Group__0__Impl : ( 'code=' ) ;
    public final void rule__SmartfieldElementCodeAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5473:1: ( ( 'code=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5474:1: ( 'code=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5474:1: ( 'code=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5475:1: 'code='
            {
             before(grammarAccess.getSmartfieldElementCodeAttributeAccess().getCodeKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__SmartfieldElementCodeAttribute__Group__0__Impl11162); 
             after(grammarAccess.getSmartfieldElementCodeAttributeAccess().getCodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementCodeAttribute__Group__0__Impl"


    // $ANTLR start "rule__SmartfieldElementCodeAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5488:1: rule__SmartfieldElementCodeAttribute__Group__1 : rule__SmartfieldElementCodeAttribute__Group__1__Impl ;
    public final void rule__SmartfieldElementCodeAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5492:1: ( rule__SmartfieldElementCodeAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5493:2: rule__SmartfieldElementCodeAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SmartfieldElementCodeAttribute__Group__1__Impl_in_rule__SmartfieldElementCodeAttribute__Group__111193);
            rule__SmartfieldElementCodeAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementCodeAttribute__Group__1"


    // $ANTLR start "rule__SmartfieldElementCodeAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5499:1: rule__SmartfieldElementCodeAttribute__Group__1__Impl : ( ( rule__SmartfieldElementCodeAttribute__ValueAssignment_1 ) ) ;
    public final void rule__SmartfieldElementCodeAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5503:1: ( ( ( rule__SmartfieldElementCodeAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5504:1: ( ( rule__SmartfieldElementCodeAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5504:1: ( ( rule__SmartfieldElementCodeAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5505:1: ( rule__SmartfieldElementCodeAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5506:1: ( rule__SmartfieldElementCodeAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5506:2: rule__SmartfieldElementCodeAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SmartfieldElementCodeAttribute__ValueAssignment_1_in_rule__SmartfieldElementCodeAttribute__Group__1__Impl11220);
            rule__SmartfieldElementCodeAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementCodeAttribute__Group__1__Impl"


    // $ANTLR start "rule__SmartfieldElementValueTypeAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5520:1: rule__SmartfieldElementValueTypeAttribute__Group__0 : rule__SmartfieldElementValueTypeAttribute__Group__0__Impl rule__SmartfieldElementValueTypeAttribute__Group__1 ;
    public final void rule__SmartfieldElementValueTypeAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5524:1: ( rule__SmartfieldElementValueTypeAttribute__Group__0__Impl rule__SmartfieldElementValueTypeAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5525:2: rule__SmartfieldElementValueTypeAttribute__Group__0__Impl rule__SmartfieldElementValueTypeAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__0__Impl_in_rule__SmartfieldElementValueTypeAttribute__Group__011254);
            rule__SmartfieldElementValueTypeAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__1_in_rule__SmartfieldElementValueTypeAttribute__Group__011257);
            rule__SmartfieldElementValueTypeAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementValueTypeAttribute__Group__0"


    // $ANTLR start "rule__SmartfieldElementValueTypeAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5532:1: rule__SmartfieldElementValueTypeAttribute__Group__0__Impl : ( 'value_type=' ) ;
    public final void rule__SmartfieldElementValueTypeAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5536:1: ( ( 'value_type=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5537:1: ( 'value_type=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5537:1: ( 'value_type=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5538:1: 'value_type='
            {
             before(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValue_typeKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__SmartfieldElementValueTypeAttribute__Group__0__Impl11285); 
             after(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValue_typeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementValueTypeAttribute__Group__0__Impl"


    // $ANTLR start "rule__SmartfieldElementValueTypeAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5551:1: rule__SmartfieldElementValueTypeAttribute__Group__1 : rule__SmartfieldElementValueTypeAttribute__Group__1__Impl ;
    public final void rule__SmartfieldElementValueTypeAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5555:1: ( rule__SmartfieldElementValueTypeAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5556:2: rule__SmartfieldElementValueTypeAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__1__Impl_in_rule__SmartfieldElementValueTypeAttribute__Group__111316);
            rule__SmartfieldElementValueTypeAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementValueTypeAttribute__Group__1"


    // $ANTLR start "rule__SmartfieldElementValueTypeAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5562:1: rule__SmartfieldElementValueTypeAttribute__Group__1__Impl : ( ( rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1 ) ) ;
    public final void rule__SmartfieldElementValueTypeAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5566:1: ( ( ( rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5567:1: ( ( rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5567:1: ( ( rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5568:1: ( rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5569:1: ( rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5569:2: rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1_in_rule__SmartfieldElementValueTypeAttribute__Group__1__Impl11343);
            rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementValueTypeAttribute__Group__1__Impl"


    // $ANTLR start "rule__SmartfieldElementLookupAttribute__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5583:1: rule__SmartfieldElementLookupAttribute__Group__0 : rule__SmartfieldElementLookupAttribute__Group__0__Impl rule__SmartfieldElementLookupAttribute__Group__1 ;
    public final void rule__SmartfieldElementLookupAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5587:1: ( rule__SmartfieldElementLookupAttribute__Group__0__Impl rule__SmartfieldElementLookupAttribute__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5588:2: rule__SmartfieldElementLookupAttribute__Group__0__Impl rule__SmartfieldElementLookupAttribute__Group__1
            {
            pushFollow(FOLLOW_rule__SmartfieldElementLookupAttribute__Group__0__Impl_in_rule__SmartfieldElementLookupAttribute__Group__011377);
            rule__SmartfieldElementLookupAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SmartfieldElementLookupAttribute__Group__1_in_rule__SmartfieldElementLookupAttribute__Group__011380);
            rule__SmartfieldElementLookupAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementLookupAttribute__Group__0"


    // $ANTLR start "rule__SmartfieldElementLookupAttribute__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5595:1: rule__SmartfieldElementLookupAttribute__Group__0__Impl : ( 'lookup=' ) ;
    public final void rule__SmartfieldElementLookupAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5599:1: ( ( 'lookup=' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5600:1: ( 'lookup=' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5600:1: ( 'lookup=' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5601:1: 'lookup='
            {
             before(grammarAccess.getSmartfieldElementLookupAttributeAccess().getLookupKeyword_0()); 
            match(input,59,FOLLOW_59_in_rule__SmartfieldElementLookupAttribute__Group__0__Impl11408); 
             after(grammarAccess.getSmartfieldElementLookupAttributeAccess().getLookupKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementLookupAttribute__Group__0__Impl"


    // $ANTLR start "rule__SmartfieldElementLookupAttribute__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5614:1: rule__SmartfieldElementLookupAttribute__Group__1 : rule__SmartfieldElementLookupAttribute__Group__1__Impl ;
    public final void rule__SmartfieldElementLookupAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5618:1: ( rule__SmartfieldElementLookupAttribute__Group__1__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5619:2: rule__SmartfieldElementLookupAttribute__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SmartfieldElementLookupAttribute__Group__1__Impl_in_rule__SmartfieldElementLookupAttribute__Group__111439);
            rule__SmartfieldElementLookupAttribute__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementLookupAttribute__Group__1"


    // $ANTLR start "rule__SmartfieldElementLookupAttribute__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5625:1: rule__SmartfieldElementLookupAttribute__Group__1__Impl : ( ( rule__SmartfieldElementLookupAttribute__ValueAssignment_1 ) ) ;
    public final void rule__SmartfieldElementLookupAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5629:1: ( ( ( rule__SmartfieldElementLookupAttribute__ValueAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5630:1: ( ( rule__SmartfieldElementLookupAttribute__ValueAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5630:1: ( ( rule__SmartfieldElementLookupAttribute__ValueAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5631:1: ( rule__SmartfieldElementLookupAttribute__ValueAssignment_1 )
            {
             before(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5632:1: ( rule__SmartfieldElementLookupAttribute__ValueAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5632:2: rule__SmartfieldElementLookupAttribute__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SmartfieldElementLookupAttribute__ValueAssignment_1_in_rule__SmartfieldElementLookupAttribute__Group__1__Impl11466);
            rule__SmartfieldElementLookupAttribute__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementLookupAttribute__Group__1__Impl"


    // $ANTLR start "rule__ZregBoxElement__Group__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5646:1: rule__ZregBoxElement__Group__0 : rule__ZregBoxElement__Group__0__Impl rule__ZregBoxElement__Group__1 ;
    public final void rule__ZregBoxElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5650:1: ( rule__ZregBoxElement__Group__0__Impl rule__ZregBoxElement__Group__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5651:2: rule__ZregBoxElement__Group__0__Impl rule__ZregBoxElement__Group__1
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group__0__Impl_in_rule__ZregBoxElement__Group__011500);
            rule__ZregBoxElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ZregBoxElement__Group__1_in_rule__ZregBoxElement__Group__011503);
            rule__ZregBoxElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__0"


    // $ANTLR start "rule__ZregBoxElement__Group__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5658:1: rule__ZregBoxElement__Group__0__Impl : ( 'zreg_sequence_box ' ) ;
    public final void rule__ZregBoxElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5662:1: ( ( 'zreg_sequence_box ' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5663:1: ( 'zreg_sequence_box ' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5663:1: ( 'zreg_sequence_box ' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5664:1: 'zreg_sequence_box '
            {
             before(grammarAccess.getZregBoxElementAccess().getZreg_sequence_boxKeyword_0()); 
            match(input,60,FOLLOW_60_in_rule__ZregBoxElement__Group__0__Impl11531); 
             after(grammarAccess.getZregBoxElementAccess().getZreg_sequence_boxKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__0__Impl"


    // $ANTLR start "rule__ZregBoxElement__Group__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5677:1: rule__ZregBoxElement__Group__1 : rule__ZregBoxElement__Group__1__Impl rule__ZregBoxElement__Group__2 ;
    public final void rule__ZregBoxElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5681:1: ( rule__ZregBoxElement__Group__1__Impl rule__ZregBoxElement__Group__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5682:2: rule__ZregBoxElement__Group__1__Impl rule__ZregBoxElement__Group__2
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group__1__Impl_in_rule__ZregBoxElement__Group__111562);
            rule__ZregBoxElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ZregBoxElement__Group__2_in_rule__ZregBoxElement__Group__111565);
            rule__ZregBoxElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__1"


    // $ANTLR start "rule__ZregBoxElement__Group__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5689:1: rule__ZregBoxElement__Group__1__Impl : ( ( rule__ZregBoxElement__NameAssignment_1 ) ) ;
    public final void rule__ZregBoxElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5693:1: ( ( ( rule__ZregBoxElement__NameAssignment_1 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5694:1: ( ( rule__ZregBoxElement__NameAssignment_1 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5694:1: ( ( rule__ZregBoxElement__NameAssignment_1 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5695:1: ( rule__ZregBoxElement__NameAssignment_1 )
            {
             before(grammarAccess.getZregBoxElementAccess().getNameAssignment_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5696:1: ( rule__ZregBoxElement__NameAssignment_1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5696:2: rule__ZregBoxElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__NameAssignment_1_in_rule__ZregBoxElement__Group__1__Impl11592);
            rule__ZregBoxElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getZregBoxElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__1__Impl"


    // $ANTLR start "rule__ZregBoxElement__Group__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5706:1: rule__ZregBoxElement__Group__2 : rule__ZregBoxElement__Group__2__Impl rule__ZregBoxElement__Group__3 ;
    public final void rule__ZregBoxElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5710:1: ( rule__ZregBoxElement__Group__2__Impl rule__ZregBoxElement__Group__3 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5711:2: rule__ZregBoxElement__Group__2__Impl rule__ZregBoxElement__Group__3
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group__2__Impl_in_rule__ZregBoxElement__Group__211622);
            rule__ZregBoxElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ZregBoxElement__Group__3_in_rule__ZregBoxElement__Group__211625);
            rule__ZregBoxElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__2"


    // $ANTLR start "rule__ZregBoxElement__Group__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5718:1: rule__ZregBoxElement__Group__2__Impl : ( ( rule__ZregBoxElement__PropertiesAssignment_2 )* ) ;
    public final void rule__ZregBoxElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5722:1: ( ( ( rule__ZregBoxElement__PropertiesAssignment_2 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5723:1: ( ( rule__ZregBoxElement__PropertiesAssignment_2 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5723:1: ( ( rule__ZregBoxElement__PropertiesAssignment_2 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5724:1: ( rule__ZregBoxElement__PropertiesAssignment_2 )*
            {
             before(grammarAccess.getZregBoxElementAccess().getPropertiesAssignment_2()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5725:1: ( rule__ZregBoxElement__PropertiesAssignment_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=26 && LA40_0<=29)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5725:2: rule__ZregBoxElement__PropertiesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ZregBoxElement__PropertiesAssignment_2_in_rule__ZregBoxElement__Group__2__Impl11652);
            	    rule__ZregBoxElement__PropertiesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getZregBoxElementAccess().getPropertiesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__2__Impl"


    // $ANTLR start "rule__ZregBoxElement__Group__3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5735:1: rule__ZregBoxElement__Group__3 : rule__ZregBoxElement__Group__3__Impl ;
    public final void rule__ZregBoxElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5739:1: ( rule__ZregBoxElement__Group__3__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5740:2: rule__ZregBoxElement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group__3__Impl_in_rule__ZregBoxElement__Group__311683);
            rule__ZregBoxElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__3"


    // $ANTLR start "rule__ZregBoxElement__Group__3__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5746:1: rule__ZregBoxElement__Group__3__Impl : ( ( rule__ZregBoxElement__Group_3__0 )? ) ;
    public final void rule__ZregBoxElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5750:1: ( ( ( rule__ZregBoxElement__Group_3__0 )? ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5751:1: ( ( rule__ZregBoxElement__Group_3__0 )? )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5751:1: ( ( rule__ZregBoxElement__Group_3__0 )? )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5752:1: ( rule__ZregBoxElement__Group_3__0 )?
            {
             before(grammarAccess.getZregBoxElementAccess().getGroup_3()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5753:1: ( rule__ZregBoxElement__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==35) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5753:2: rule__ZregBoxElement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ZregBoxElement__Group_3__0_in_rule__ZregBoxElement__Group__3__Impl11710);
                    rule__ZregBoxElement__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZregBoxElementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group__3__Impl"


    // $ANTLR start "rule__ZregBoxElement__Group_3__0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5771:1: rule__ZregBoxElement__Group_3__0 : rule__ZregBoxElement__Group_3__0__Impl rule__ZregBoxElement__Group_3__1 ;
    public final void rule__ZregBoxElement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5775:1: ( rule__ZregBoxElement__Group_3__0__Impl rule__ZregBoxElement__Group_3__1 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5776:2: rule__ZregBoxElement__Group_3__0__Impl rule__ZregBoxElement__Group_3__1
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group_3__0__Impl_in_rule__ZregBoxElement__Group_3__011749);
            rule__ZregBoxElement__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ZregBoxElement__Group_3__1_in_rule__ZregBoxElement__Group_3__011752);
            rule__ZregBoxElement__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group_3__0"


    // $ANTLR start "rule__ZregBoxElement__Group_3__0__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5783:1: rule__ZregBoxElement__Group_3__0__Impl : ( '{' ) ;
    public final void rule__ZregBoxElement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5787:1: ( ( '{' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5788:1: ( '{' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5788:1: ( '{' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5789:1: '{'
            {
             before(grammarAccess.getZregBoxElementAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__ZregBoxElement__Group_3__0__Impl11780); 
             after(grammarAccess.getZregBoxElementAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group_3__0__Impl"


    // $ANTLR start "rule__ZregBoxElement__Group_3__1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5802:1: rule__ZregBoxElement__Group_3__1 : rule__ZregBoxElement__Group_3__1__Impl rule__ZregBoxElement__Group_3__2 ;
    public final void rule__ZregBoxElement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5806:1: ( rule__ZregBoxElement__Group_3__1__Impl rule__ZregBoxElement__Group_3__2 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5807:2: rule__ZregBoxElement__Group_3__1__Impl rule__ZregBoxElement__Group_3__2
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group_3__1__Impl_in_rule__ZregBoxElement__Group_3__111811);
            rule__ZregBoxElement__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ZregBoxElement__Group_3__2_in_rule__ZregBoxElement__Group_3__111814);
            rule__ZregBoxElement__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group_3__1"


    // $ANTLR start "rule__ZregBoxElement__Group_3__1__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5814:1: rule__ZregBoxElement__Group_3__1__Impl : ( ( rule__ZregBoxElement__ChildrenAssignment_3_1 )* ) ;
    public final void rule__ZregBoxElement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5818:1: ( ( ( rule__ZregBoxElement__ChildrenAssignment_3_1 )* ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5819:1: ( ( rule__ZregBoxElement__ChildrenAssignment_3_1 )* )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5819:1: ( ( rule__ZregBoxElement__ChildrenAssignment_3_1 )* )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5820:1: ( rule__ZregBoxElement__ChildrenAssignment_3_1 )*
            {
             before(grammarAccess.getZregBoxElementAccess().getChildrenAssignment_3_1()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5821:1: ( rule__ZregBoxElement__ChildrenAssignment_3_1 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==40) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5821:2: rule__ZregBoxElement__ChildrenAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__ZregBoxElement__ChildrenAssignment_3_1_in_rule__ZregBoxElement__Group_3__1__Impl11841);
            	    rule__ZregBoxElement__ChildrenAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getZregBoxElementAccess().getChildrenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group_3__1__Impl"


    // $ANTLR start "rule__ZregBoxElement__Group_3__2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5831:1: rule__ZregBoxElement__Group_3__2 : rule__ZregBoxElement__Group_3__2__Impl ;
    public final void rule__ZregBoxElement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5835:1: ( rule__ZregBoxElement__Group_3__2__Impl )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5836:2: rule__ZregBoxElement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__ZregBoxElement__Group_3__2__Impl_in_rule__ZregBoxElement__Group_3__211872);
            rule__ZregBoxElement__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group_3__2"


    // $ANTLR start "rule__ZregBoxElement__Group_3__2__Impl"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5842:1: rule__ZregBoxElement__Group_3__2__Impl : ( '}' ) ;
    public final void rule__ZregBoxElement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5846:1: ( ( '}' ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5847:1: ( '}' )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5847:1: ( '}' )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5848:1: '}'
            {
             before(grammarAccess.getZregBoxElementAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__ZregBoxElement__Group_3__2__Impl11900); 
             after(grammarAccess.getZregBoxElementAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__Group_3__2__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5868:1: rule__Model__ElementsAssignment : ( ruleRootElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5872:1: ( ( ruleRootElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5873:1: ( ruleRootElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5873:1: ( ruleRootElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5874:1: ruleRootElement
            {
             before(grammarAccess.getModelAccess().getElementsRootElementParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRootElement_in_rule__Model__ElementsAssignment11942);
            ruleRootElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsRootElementParserRuleCall_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__AbstractFieldProperties__TextAssignment_0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5883:1: rule__AbstractFieldProperties__TextAssignment_0 : ( ruleTextAttribute ) ;
    public final void rule__AbstractFieldProperties__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5887:1: ( ( ruleTextAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5888:1: ( ruleTextAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5888:1: ( ruleTextAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5889:1: ruleTextAttribute
            {
             before(grammarAccess.getAbstractFieldPropertiesAccess().getTextTextAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTextAttribute_in_rule__AbstractFieldProperties__TextAssignment_011973);
            ruleTextAttribute();

            state._fsp--;

             after(grammarAccess.getAbstractFieldPropertiesAccess().getTextTextAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFieldProperties__TextAssignment_0"


    // $ANTLR start "rule__AbstractFieldProperties__VisibleAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5898:1: rule__AbstractFieldProperties__VisibleAssignment_1 : ( ruleVisibleAttribue ) ;
    public final void rule__AbstractFieldProperties__VisibleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5902:1: ( ( ruleVisibleAttribue ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5903:1: ( ruleVisibleAttribue )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5903:1: ( ruleVisibleAttribue )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5904:1: ruleVisibleAttribue
            {
             before(grammarAccess.getAbstractFieldPropertiesAccess().getVisibleVisibleAttribueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleVisibleAttribue_in_rule__AbstractFieldProperties__VisibleAssignment_112004);
            ruleVisibleAttribue();

            state._fsp--;

             after(grammarAccess.getAbstractFieldPropertiesAccess().getVisibleVisibleAttribueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFieldProperties__VisibleAssignment_1"


    // $ANTLR start "rule__AbstractFieldProperties__MasterAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5913:1: rule__AbstractFieldProperties__MasterAssignment_2 : ( ruleMasterAttribute ) ;
    public final void rule__AbstractFieldProperties__MasterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5917:1: ( ( ruleMasterAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5918:1: ( ruleMasterAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5918:1: ( ruleMasterAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5919:1: ruleMasterAttribute
            {
             before(grammarAccess.getAbstractFieldPropertiesAccess().getMasterMasterAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleMasterAttribute_in_rule__AbstractFieldProperties__MasterAssignment_212035);
            ruleMasterAttribute();

            state._fsp--;

             after(grammarAccess.getAbstractFieldPropertiesAccess().getMasterMasterAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFieldProperties__MasterAssignment_2"


    // $ANTLR start "rule__AbstractFieldProperties__EnabledAssignment_3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5928:1: rule__AbstractFieldProperties__EnabledAssignment_3 : ( ruleEnabledAttribue ) ;
    public final void rule__AbstractFieldProperties__EnabledAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5932:1: ( ( ruleEnabledAttribue ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5933:1: ( ruleEnabledAttribue )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5933:1: ( ruleEnabledAttribue )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5934:1: ruleEnabledAttribue
            {
             before(grammarAccess.getAbstractFieldPropertiesAccess().getEnabledEnabledAttribueParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEnabledAttribue_in_rule__AbstractFieldProperties__EnabledAssignment_312066);
            ruleEnabledAttribue();

            state._fsp--;

             after(grammarAccess.getAbstractFieldPropertiesAccess().getEnabledEnabledAttribueParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractFieldProperties__EnabledAssignment_3"


    // $ANTLR start "rule__TextAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5943:1: rule__TextAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TextAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5947:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5948:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5948:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5949:1: ( RULE_ID )
            {
             before(grammarAccess.getTextAttributeAccess().getValueTranslationElementCrossReference_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5950:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5951:1: RULE_ID
            {
             before(grammarAccess.getTextAttributeAccess().getValueTranslationElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TextAttribute__ValueAssignment_112101); 
             after(grammarAccess.getTextAttributeAccess().getValueTranslationElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTextAttributeAccess().getValueTranslationElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextAttribute__ValueAssignment_1"


    // $ANTLR start "rule__EnabledAttribue__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5962:1: rule__EnabledAttribue__ValueAssignment_1 : ( ruleBooleanType ) ;
    public final void rule__EnabledAttribue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5966:1: ( ( ruleBooleanType ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5967:1: ( ruleBooleanType )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5967:1: ( ruleBooleanType )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5968:1: ruleBooleanType
            {
             before(grammarAccess.getEnabledAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanType_in_rule__EnabledAttribue__ValueAssignment_112136);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getEnabledAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnabledAttribue__ValueAssignment_1"


    // $ANTLR start "rule__VisibleAttribue__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5977:1: rule__VisibleAttribue__ValueAssignment_1 : ( ruleBooleanType ) ;
    public final void rule__VisibleAttribue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5981:1: ( ( ruleBooleanType ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5982:1: ( ruleBooleanType )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5982:1: ( ruleBooleanType )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5983:1: ruleBooleanType
            {
             before(grammarAccess.getVisibleAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanType_in_rule__VisibleAttribue__ValueAssignment_112167);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getVisibleAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VisibleAttribue__ValueAssignment_1"


    // $ANTLR start "rule__MasterAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5992:1: rule__MasterAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MasterAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5996:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5997:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5997:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5998:1: ( RULE_ID )
            {
             before(grammarAccess.getMasterAttributeAccess().getValueAbstractFieldElementCrossReference_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:5999:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6000:1: RULE_ID
            {
             before(grammarAccess.getMasterAttributeAccess().getValueAbstractFieldElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MasterAttribute__ValueAssignment_112202); 
             after(grammarAccess.getMasterAttributeAccess().getValueAbstractFieldElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMasterAttributeAccess().getValueAbstractFieldElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MasterAttribute__ValueAssignment_1"


    // $ANTLR start "rule__AbstractValueFieldProperties__MandatoryAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6011:1: rule__AbstractValueFieldProperties__MandatoryAssignment_1 : ( ruleMandatoryAttribue ) ;
    public final void rule__AbstractValueFieldProperties__MandatoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6015:1: ( ( ruleMandatoryAttribue ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6016:1: ( ruleMandatoryAttribue )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6016:1: ( ruleMandatoryAttribue )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6017:1: ruleMandatoryAttribue
            {
             before(grammarAccess.getAbstractValueFieldPropertiesAccess().getMandatoryMandatoryAttribueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMandatoryAttribue_in_rule__AbstractValueFieldProperties__MandatoryAssignment_112237);
            ruleMandatoryAttribue();

            state._fsp--;

             after(grammarAccess.getAbstractValueFieldPropertiesAccess().getMandatoryMandatoryAttribueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractValueFieldProperties__MandatoryAssignment_1"


    // $ANTLR start "rule__MandatoryAttribue__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6026:1: rule__MandatoryAttribue__ValueAssignment_1 : ( ruleBooleanType ) ;
    public final void rule__MandatoryAttribue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6030:1: ( ( ruleBooleanType ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6031:1: ( ruleBooleanType )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6031:1: ( ruleBooleanType )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6032:1: ruleBooleanType
            {
             before(grammarAccess.getMandatoryAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanType_in_rule__MandatoryAttribue__ValueAssignment_112268);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getMandatoryAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryAttribue__ValueAssignment_1"


    // $ANTLR start "rule__ModuleElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6041:1: rule__ModuleElement__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__ModuleElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6045:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6046:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6046:1: ( ruleQualifiedName )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6047:1: ruleQualifiedName
            {
             before(grammarAccess.getModuleElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__ModuleElement__NameAssignment_112299);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModuleElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModuleElement__NameAssignment_1"


    // $ANTLR start "rule__TranslationElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6056:1: rule__TranslationElement__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TranslationElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6060:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6061:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6061:1: ( ruleQualifiedName )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6062:1: ruleQualifiedName
            {
             before(grammarAccess.getTranslationElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TranslationElement__NameAssignment_112330);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTranslationElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__NameAssignment_1"


    // $ANTLR start "rule__TranslationElement__TranslationsAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6071:1: rule__TranslationElement__TranslationsAssignment_2 : ( ruleTranslationAttribute ) ;
    public final void rule__TranslationElement__TranslationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6075:1: ( ( ruleTranslationAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6076:1: ( ruleTranslationAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6076:1: ( ruleTranslationAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6077:1: ruleTranslationAttribute
            {
             before(grammarAccess.getTranslationElementAccess().getTranslationsTranslationAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTranslationAttribute_in_rule__TranslationElement__TranslationsAssignment_212361);
            ruleTranslationAttribute();

            state._fsp--;

             after(grammarAccess.getTranslationElementAccess().getTranslationsTranslationAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationElement__TranslationsAssignment_2"


    // $ANTLR start "rule__TranslationAttribute__LangAssignment_0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6086:1: rule__TranslationAttribute__LangAssignment_0 : ( RULE_ID ) ;
    public final void rule__TranslationAttribute__LangAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6090:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6091:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6091:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6092:1: RULE_ID
            {
             before(grammarAccess.getTranslationAttributeAccess().getLangIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TranslationAttribute__LangAssignment_012392); 
             after(grammarAccess.getTranslationAttributeAccess().getLangIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__LangAssignment_0"


    // $ANTLR start "rule__TranslationAttribute__TypeAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6101:1: rule__TranslationAttribute__TypeAssignment_2 : ( RULE_STRING ) ;
    public final void rule__TranslationAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6105:1: ( ( RULE_STRING ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6106:1: ( RULE_STRING )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6106:1: ( RULE_STRING )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6107:1: RULE_STRING
            {
             before(grammarAccess.getTranslationAttributeAccess().getTypeSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TranslationAttribute__TypeAssignment_212423); 
             after(grammarAccess.getTranslationAttributeAccess().getTypeSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TranslationAttribute__TypeAssignment_2"


    // $ANTLR start "rule__JavaElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6116:1: rule__JavaElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JavaElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6120:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6121:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6121:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6122:1: RULE_ID
            {
             before(grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__JavaElement__NameAssignment_112454); 
             after(grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__NameAssignment_1"


    // $ANTLR start "rule__JavaElement__RunatAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6131:1: rule__JavaElement__RunatAssignment_2 : ( ruleRunAtAttribute ) ;
    public final void rule__JavaElement__RunatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6135:1: ( ( ruleRunAtAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6136:1: ( ruleRunAtAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6136:1: ( ruleRunAtAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6137:1: ruleRunAtAttribute
            {
             before(grammarAccess.getJavaElementAccess().getRunatRunAtAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRunAtAttribute_in_rule__JavaElement__RunatAssignment_212485);
            ruleRunAtAttribute();

            state._fsp--;

             after(grammarAccess.getJavaElementAccess().getRunatRunAtAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__RunatAssignment_2"


    // $ANTLR start "rule__JavaElement__SourceAssignment_4"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6146:1: rule__JavaElement__SourceAssignment_4 : ( RULE_STRING ) ;
    public final void rule__JavaElement__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6150:1: ( ( RULE_STRING ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6151:1: ( RULE_STRING )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6151:1: ( RULE_STRING )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6152:1: RULE_STRING
            {
             before(grammarAccess.getJavaElementAccess().getSourceSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__JavaElement__SourceAssignment_412516); 
             after(grammarAccess.getJavaElementAccess().getSourceSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JavaElement__SourceAssignment_4"


    // $ANTLR start "rule__RunAtAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6161:1: rule__RunAtAttribute__ValueAssignment_1 : ( ruleJavaRunAtAttributeList ) ;
    public final void rule__RunAtAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6165:1: ( ( ruleJavaRunAtAttributeList ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6166:1: ( ruleJavaRunAtAttributeList )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6166:1: ( ruleJavaRunAtAttributeList )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6167:1: ruleJavaRunAtAttributeList
            {
             before(grammarAccess.getRunAtAttributeAccess().getValueJavaRunAtAttributeListEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleJavaRunAtAttributeList_in_rule__RunAtAttribute__ValueAssignment_112547);
            ruleJavaRunAtAttributeList();

            state._fsp--;

             after(grammarAccess.getRunAtAttributeAccess().getValueJavaRunAtAttributeListEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RunAtAttribute__ValueAssignment_1"


    // $ANTLR start "rule__CodeElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6176:1: rule__CodeElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CodeElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6180:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6181:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6181:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6182:1: RULE_ID
            {
             before(grammarAccess.getCodeElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__CodeElement__NameAssignment_112578); 
             after(grammarAccess.getCodeElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__NameAssignment_1"


    // $ANTLR start "rule__CodeElement__IdAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6191:1: rule__CodeElement__IdAssignment_2 : ( ruleCodeIdAttribute ) ;
    public final void rule__CodeElement__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6195:1: ( ( ruleCodeIdAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6196:1: ( ruleCodeIdAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6196:1: ( ruleCodeIdAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6197:1: ruleCodeIdAttribute
            {
             before(grammarAccess.getCodeElementAccess().getIdCodeIdAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleCodeIdAttribute_in_rule__CodeElement__IdAssignment_212609);
            ruleCodeIdAttribute();

            state._fsp--;

             after(grammarAccess.getCodeElementAccess().getIdCodeIdAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeElement__IdAssignment_2"


    // $ANTLR start "rule__CodeIdAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6206:1: rule__CodeIdAttribute__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__CodeIdAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6210:1: ( ( RULE_INT ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6211:1: ( RULE_INT )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6211:1: ( RULE_INT )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6212:1: RULE_INT
            {
             before(grammarAccess.getCodeIdAttributeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__CodeIdAttribute__ValueAssignment_112640); 
             after(grammarAccess.getCodeIdAttributeAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CodeIdAttribute__ValueAssignment_1"


    // $ANTLR start "rule__LogicElement__TypeAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6221:1: rule__LogicElement__TypeAssignment_1 : ( ruleLogicTypeAttribute ) ;
    public final void rule__LogicElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6225:1: ( ( ruleLogicTypeAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6226:1: ( ruleLogicTypeAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6226:1: ( ruleLogicTypeAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6227:1: ruleLogicTypeAttribute
            {
             before(grammarAccess.getLogicElementAccess().getTypeLogicTypeAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLogicTypeAttribute_in_rule__LogicElement__TypeAssignment_112671);
            ruleLogicTypeAttribute();

            state._fsp--;

             after(grammarAccess.getLogicElementAccess().getTypeLogicTypeAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__TypeAssignment_1"


    // $ANTLR start "rule__LogicElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6236:1: rule__LogicElement__PropertiesAssignment_2 : ( ruleLogicOptionalProperties ) ;
    public final void rule__LogicElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6240:1: ( ( ruleLogicOptionalProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6241:1: ( ruleLogicOptionalProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6241:1: ( ruleLogicOptionalProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6242:1: ruleLogicOptionalProperties
            {
             before(grammarAccess.getLogicElementAccess().getPropertiesLogicOptionalPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLogicOptionalProperties_in_rule__LogicElement__PropertiesAssignment_212702);
            ruleLogicOptionalProperties();

            state._fsp--;

             after(grammarAccess.getLogicElementAccess().getPropertiesLogicOptionalPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__PropertiesAssignment_2"


    // $ANTLR start "rule__LogicElement__SourceAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6251:1: rule__LogicElement__SourceAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__LogicElement__SourceAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6255:1: ( ( RULE_STRING ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6256:1: ( RULE_STRING )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6256:1: ( RULE_STRING )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6257:1: RULE_STRING
            {
             before(grammarAccess.getLogicElementAccess().getSourceSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__LogicElement__SourceAssignment_3_112733); 
             after(grammarAccess.getLogicElementAccess().getSourceSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicElement__SourceAssignment_3_1"


    // $ANTLR start "rule__LogicOptionalProperties__RunatAssignment_0"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6266:1: rule__LogicOptionalProperties__RunatAssignment_0 : ( ruleRunAtAttribute ) ;
    public final void rule__LogicOptionalProperties__RunatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6270:1: ( ( ruleRunAtAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6271:1: ( ruleRunAtAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6271:1: ( ruleRunAtAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6272:1: ruleRunAtAttribute
            {
             before(grammarAccess.getLogicOptionalPropertiesAccess().getRunatRunAtAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRunAtAttribute_in_rule__LogicOptionalProperties__RunatAssignment_012764);
            ruleRunAtAttribute();

            state._fsp--;

             after(grammarAccess.getLogicOptionalPropertiesAccess().getRunatRunAtAttributeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOptionalProperties__RunatAssignment_0"


    // $ANTLR start "rule__LogicOptionalProperties__ExecAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6281:1: rule__LogicOptionalProperties__ExecAssignment_1 : ( ruleLogicExecAttribute ) ;
    public final void rule__LogicOptionalProperties__ExecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6285:1: ( ( ruleLogicExecAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6286:1: ( ruleLogicExecAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6286:1: ( ruleLogicExecAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6287:1: ruleLogicExecAttribute
            {
             before(grammarAccess.getLogicOptionalPropertiesAccess().getExecLogicExecAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLogicExecAttribute_in_rule__LogicOptionalProperties__ExecAssignment_112795);
            ruleLogicExecAttribute();

            state._fsp--;

             after(grammarAccess.getLogicOptionalPropertiesAccess().getExecLogicExecAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicOptionalProperties__ExecAssignment_1"


    // $ANTLR start "rule__LogicTypeAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6296:1: rule__LogicTypeAttribute__ValueAssignment_1 : ( ruleLogicTypeAttributeList ) ;
    public final void rule__LogicTypeAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6300:1: ( ( ruleLogicTypeAttributeList ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6301:1: ( ruleLogicTypeAttributeList )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6301:1: ( ruleLogicTypeAttributeList )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6302:1: ruleLogicTypeAttributeList
            {
             before(grammarAccess.getLogicTypeAttributeAccess().getValueLogicTypeAttributeListEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLogicTypeAttributeList_in_rule__LogicTypeAttribute__ValueAssignment_112826);
            ruleLogicTypeAttributeList();

            state._fsp--;

             after(grammarAccess.getLogicTypeAttributeAccess().getValueLogicTypeAttributeListEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicTypeAttribute__ValueAssignment_1"


    // $ANTLR start "rule__LogicExecAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6311:1: rule__LogicExecAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__LogicExecAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6315:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6316:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6316:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6317:1: ( RULE_ID )
            {
             before(grammarAccess.getLogicExecAttributeAccess().getValueJavaElementCrossReference_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6318:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6319:1: RULE_ID
            {
             before(grammarAccess.getLogicExecAttributeAccess().getValueJavaElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LogicExecAttribute__ValueAssignment_112861); 
             after(grammarAccess.getLogicExecAttributeAccess().getValueJavaElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLogicExecAttributeAccess().getValueJavaElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicExecAttribute__ValueAssignment_1"


    // $ANTLR start "rule__LookupElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6330:1: rule__LookupElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LookupElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6334:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6335:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6335:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6336:1: RULE_ID
            {
             before(grammarAccess.getLookupElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LookupElement__NameAssignment_112896); 
             after(grammarAccess.getLookupElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__NameAssignment_1"


    // $ANTLR start "rule__LookupElement__ServicelogicAssignment_3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6345:1: rule__LookupElement__ServicelogicAssignment_3 : ( ( rule__LookupElement__ServicelogicAlternatives_3_0 ) ) ;
    public final void rule__LookupElement__ServicelogicAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6349:1: ( ( ( rule__LookupElement__ServicelogicAlternatives_3_0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6350:1: ( ( rule__LookupElement__ServicelogicAlternatives_3_0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6350:1: ( ( rule__LookupElement__ServicelogicAlternatives_3_0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6351:1: ( rule__LookupElement__ServicelogicAlternatives_3_0 )
            {
             before(grammarAccess.getLookupElementAccess().getServicelogicAlternatives_3_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6352:1: ( rule__LookupElement__ServicelogicAlternatives_3_0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6352:2: rule__LookupElement__ServicelogicAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__LookupElement__ServicelogicAlternatives_3_0_in_rule__LookupElement__ServicelogicAssignment_312927);
            rule__LookupElement__ServicelogicAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getLookupElementAccess().getServicelogicAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LookupElement__ServicelogicAssignment_3"


    // $ANTLR start "rule__TemplateElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6361:1: rule__TemplateElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TemplateElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6365:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6366:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6366:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6367:1: RULE_ID
            {
             before(grammarAccess.getTemplateElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TemplateElement__NameAssignment_112960); 
             after(grammarAccess.getTemplateElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__NameAssignment_1"


    // $ANTLR start "rule__TemplateElement__ClassAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6376:1: rule__TemplateElement__ClassAssignment_2 : ( ruleTemplateElementClassAttribute ) ;
    public final void rule__TemplateElement__ClassAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6380:1: ( ( ruleTemplateElementClassAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6381:1: ( ruleTemplateElementClassAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6381:1: ( ruleTemplateElementClassAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6382:1: ruleTemplateElementClassAttribute
            {
             before(grammarAccess.getTemplateElementAccess().getClassTemplateElementClassAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTemplateElementClassAttribute_in_rule__TemplateElement__ClassAssignment_212991);
            ruleTemplateElementClassAttribute();

            state._fsp--;

             after(grammarAccess.getTemplateElementAccess().getClassTemplateElementClassAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__ClassAssignment_2"


    // $ANTLR start "rule__TemplateElement__ReplacesAssignment_3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6391:1: rule__TemplateElement__ReplacesAssignment_3 : ( ruleTemplateElementReplacesAttribute ) ;
    public final void rule__TemplateElement__ReplacesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6395:1: ( ( ruleTemplateElementReplacesAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6396:1: ( ruleTemplateElementReplacesAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6396:1: ( ruleTemplateElementReplacesAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6397:1: ruleTemplateElementReplacesAttribute
            {
             before(grammarAccess.getTemplateElementAccess().getReplacesTemplateElementReplacesAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTemplateElementReplacesAttribute_in_rule__TemplateElement__ReplacesAssignment_313022);
            ruleTemplateElementReplacesAttribute();

            state._fsp--;

             after(grammarAccess.getTemplateElementAccess().getReplacesTemplateElementReplacesAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElement__ReplacesAssignment_3"


    // $ANTLR start "rule__TemplateElementClassAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6406:1: rule__TemplateElementClassAttribute__ValueAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__TemplateElementClassAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6410:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6411:1: ( ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6411:1: ( ruleQualifiedName )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6412:1: ruleQualifiedName
            {
             before(grammarAccess.getTemplateElementClassAttributeAccess().getValueQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__TemplateElementClassAttribute__ValueAssignment_113053);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getTemplateElementClassAttributeAccess().getValueQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementClassAttribute__ValueAssignment_1"


    // $ANTLR start "rule__TemplateElementReplacesAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6421:1: rule__TemplateElementReplacesAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__TemplateElementReplacesAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6425:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6426:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6426:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6427:1: ( RULE_ID )
            {
             before(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAbstractScoutTypeCrossReference_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6428:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6429:1: RULE_ID
            {
             before(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAbstractScoutTypeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TemplateElementReplacesAttribute__ValueAssignment_113088); 
             after(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAbstractScoutTypeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAbstractScoutTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemplateElementReplacesAttribute__ValueAssignment_1"


    // $ANTLR start "rule__FormElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6440:1: rule__FormElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FormElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6444:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6445:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6445:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6446:1: RULE_ID
            {
             before(grammarAccess.getFormElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FormElement__NameAssignment_113123); 
             after(grammarAccess.getFormElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__NameAssignment_1"


    // $ANTLR start "rule__FormElement__ModalAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6455:1: rule__FormElement__ModalAssignment_2 : ( ruleFormElementModalAttribute ) ;
    public final void rule__FormElement__ModalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6459:1: ( ( ruleFormElementModalAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6460:1: ( ruleFormElementModalAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6460:1: ( ruleFormElementModalAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6461:1: ruleFormElementModalAttribute
            {
             before(grammarAccess.getFormElementAccess().getModalFormElementModalAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleFormElementModalAttribute_in_rule__FormElement__ModalAssignment_213154);
            ruleFormElementModalAttribute();

            state._fsp--;

             after(grammarAccess.getFormElementAccess().getModalFormElementModalAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__ModalAssignment_2"


    // $ANTLR start "rule__FormElement__TextAssignment_3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6470:1: rule__FormElement__TextAssignment_3 : ( ruleTextAttribute ) ;
    public final void rule__FormElement__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6474:1: ( ( ruleTextAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6475:1: ( ruleTextAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6475:1: ( ruleTextAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6476:1: ruleTextAttribute
            {
             before(grammarAccess.getFormElementAccess().getTextTextAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleTextAttribute_in_rule__FormElement__TextAssignment_313185);
            ruleTextAttribute();

            state._fsp--;

             after(grammarAccess.getFormElementAccess().getTextTextAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__TextAssignment_3"


    // $ANTLR start "rule__FormElement__ColumnsAssignment_4"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6485:1: rule__FormElement__ColumnsAssignment_4 : ( ruleFormElementColumnsAttribute ) ;
    public final void rule__FormElement__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6489:1: ( ( ruleFormElementColumnsAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6490:1: ( ruleFormElementColumnsAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6490:1: ( ruleFormElementColumnsAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6491:1: ruleFormElementColumnsAttribute
            {
             before(grammarAccess.getFormElementAccess().getColumnsFormElementColumnsAttributeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleFormElementColumnsAttribute_in_rule__FormElement__ColumnsAssignment_413216);
            ruleFormElementColumnsAttribute();

            state._fsp--;

             after(grammarAccess.getFormElementAccess().getColumnsFormElementColumnsAttributeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__ColumnsAssignment_4"


    // $ANTLR start "rule__FormElement__ElementsAssignment_6"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6500:1: rule__FormElement__ElementsAssignment_6 : ( ( rule__FormElement__ElementsAlternatives_6_0 ) ) ;
    public final void rule__FormElement__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6504:1: ( ( ( rule__FormElement__ElementsAlternatives_6_0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6505:1: ( ( rule__FormElement__ElementsAlternatives_6_0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6505:1: ( ( rule__FormElement__ElementsAlternatives_6_0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6506:1: ( rule__FormElement__ElementsAlternatives_6_0 )
            {
             before(grammarAccess.getFormElementAccess().getElementsAlternatives_6_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6507:1: ( rule__FormElement__ElementsAlternatives_6_0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6507:2: rule__FormElement__ElementsAlternatives_6_0
            {
            pushFollow(FOLLOW_rule__FormElement__ElementsAlternatives_6_0_in_rule__FormElement__ElementsAssignment_613247);
            rule__FormElement__ElementsAlternatives_6_0();

            state._fsp--;


            }

             after(grammarAccess.getFormElementAccess().getElementsAlternatives_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElement__ElementsAssignment_6"


    // $ANTLR start "rule__FormElementModalAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6516:1: rule__FormElementModalAttribute__ValueAssignment_1 : ( ruleBooleanType ) ;
    public final void rule__FormElementModalAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6520:1: ( ( ruleBooleanType ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6521:1: ( ruleBooleanType )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6521:1: ( ruleBooleanType )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6522:1: ruleBooleanType
            {
             before(grammarAccess.getFormElementModalAttributeAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBooleanType_in_rule__FormElementModalAttribute__ValueAssignment_113280);
            ruleBooleanType();

            state._fsp--;

             after(grammarAccess.getFormElementModalAttributeAccess().getValueBooleanTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementModalAttribute__ValueAssignment_1"


    // $ANTLR start "rule__FormElementColumnsAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6531:1: rule__FormElementColumnsAttribute__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__FormElementColumnsAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6535:1: ( ( RULE_INT ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6536:1: ( RULE_INT )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6536:1: ( RULE_INT )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6537:1: RULE_INT
            {
             before(grammarAccess.getFormElementColumnsAttributeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FormElementColumnsAttribute__ValueAssignment_113311); 
             after(grammarAccess.getFormElementColumnsAttributeAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormElementColumnsAttribute__ValueAssignment_1"


    // $ANTLR start "rule__SequenceBoxElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6546:1: rule__SequenceBoxElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SequenceBoxElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6550:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6551:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6551:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6552:1: RULE_ID
            {
             before(grammarAccess.getSequenceBoxElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SequenceBoxElement__NameAssignment_113342); 
             after(grammarAccess.getSequenceBoxElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__NameAssignment_1"


    // $ANTLR start "rule__SequenceBoxElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6561:1: rule__SequenceBoxElement__PropertiesAssignment_2 : ( ruleAbstractFieldProperties ) ;
    public final void rule__SequenceBoxElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6565:1: ( ( ruleAbstractFieldProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6566:1: ( ruleAbstractFieldProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6566:1: ( ruleAbstractFieldProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6567:1: ruleAbstractFieldProperties
            {
             before(grammarAccess.getSequenceBoxElementAccess().getPropertiesAbstractFieldPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractFieldProperties_in_rule__SequenceBoxElement__PropertiesAssignment_213373);
            ruleAbstractFieldProperties();

            state._fsp--;

             after(grammarAccess.getSequenceBoxElementAccess().getPropertiesAbstractFieldPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__PropertiesAssignment_2"


    // $ANTLR start "rule__SequenceBoxElement__ChildrenAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6576:1: rule__SequenceBoxElement__ChildrenAssignment_3_1 : ( ( rule__SequenceBoxElement__ChildrenAlternatives_3_1_0 ) ) ;
    public final void rule__SequenceBoxElement__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6580:1: ( ( ( rule__SequenceBoxElement__ChildrenAlternatives_3_1_0 ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6581:1: ( ( rule__SequenceBoxElement__ChildrenAlternatives_3_1_0 ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6581:1: ( ( rule__SequenceBoxElement__ChildrenAlternatives_3_1_0 ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6582:1: ( rule__SequenceBoxElement__ChildrenAlternatives_3_1_0 )
            {
             before(grammarAccess.getSequenceBoxElementAccess().getChildrenAlternatives_3_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6583:1: ( rule__SequenceBoxElement__ChildrenAlternatives_3_1_0 )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6583:2: rule__SequenceBoxElement__ChildrenAlternatives_3_1_0
            {
            pushFollow(FOLLOW_rule__SequenceBoxElement__ChildrenAlternatives_3_1_0_in_rule__SequenceBoxElement__ChildrenAssignment_3_113404);
            rule__SequenceBoxElement__ChildrenAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceBoxElementAccess().getChildrenAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceBoxElement__ChildrenAssignment_3_1"


    // $ANTLR start "rule__StringElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6592:1: rule__StringElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6596:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6597:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6597:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6598:1: RULE_ID
            {
             before(grammarAccess.getStringElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StringElement__NameAssignment_113437); 
             after(grammarAccess.getStringElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__NameAssignment_1"


    // $ANTLR start "rule__StringElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6607:1: rule__StringElement__PropertiesAssignment_2 : ( ruleStringElementProperties ) ;
    public final void rule__StringElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6611:1: ( ( ruleStringElementProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6612:1: ( ruleStringElementProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6612:1: ( ruleStringElementProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6613:1: ruleStringElementProperties
            {
             before(grammarAccess.getStringElementAccess().getPropertiesStringElementPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStringElementProperties_in_rule__StringElement__PropertiesAssignment_213468);
            ruleStringElementProperties();

            state._fsp--;

             after(grammarAccess.getStringElementAccess().getPropertiesStringElementPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__PropertiesAssignment_2"


    // $ANTLR start "rule__StringElement__LogicAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6622:1: rule__StringElement__LogicAssignment_3_1 : ( ruleLogicElement ) ;
    public final void rule__StringElement__LogicAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6626:1: ( ( ruleLogicElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6627:1: ( ruleLogicElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6627:1: ( ruleLogicElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6628:1: ruleLogicElement
            {
             before(grammarAccess.getStringElementAccess().getLogicLogicElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLogicElement_in_rule__StringElement__LogicAssignment_3_113499);
            ruleLogicElement();

            state._fsp--;

             after(grammarAccess.getStringElementAccess().getLogicLogicElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElement__LogicAssignment_3_1"


    // $ANTLR start "rule__StringElementProperties__MaxlenAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6637:1: rule__StringElementProperties__MaxlenAssignment_1 : ( ruleStringElementMaxlenAttribute ) ;
    public final void rule__StringElementProperties__MaxlenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6641:1: ( ( ruleStringElementMaxlenAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6642:1: ( ruleStringElementMaxlenAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6642:1: ( ruleStringElementMaxlenAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6643:1: ruleStringElementMaxlenAttribute
            {
             before(grammarAccess.getStringElementPropertiesAccess().getMaxlenStringElementMaxlenAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleStringElementMaxlenAttribute_in_rule__StringElementProperties__MaxlenAssignment_113530);
            ruleStringElementMaxlenAttribute();

            state._fsp--;

             after(grammarAccess.getStringElementPropertiesAccess().getMaxlenStringElementMaxlenAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElementProperties__MaxlenAssignment_1"


    // $ANTLR start "rule__StringElementMaxlenAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6652:1: rule__StringElementMaxlenAttribute__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__StringElementMaxlenAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6656:1: ( ( RULE_INT ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6657:1: ( RULE_INT )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6657:1: ( RULE_INT )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6658:1: RULE_INT
            {
             before(grammarAccess.getStringElementMaxlenAttributeAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__StringElementMaxlenAttribute__ValueAssignment_113561); 
             after(grammarAccess.getStringElementMaxlenAttributeAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringElementMaxlenAttribute__ValueAssignment_1"


    // $ANTLR start "rule__DoubleElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6667:1: rule__DoubleElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DoubleElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6671:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6672:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6672:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6673:1: RULE_ID
            {
             before(grammarAccess.getDoubleElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DoubleElement__NameAssignment_113592); 
             after(grammarAccess.getDoubleElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__NameAssignment_1"


    // $ANTLR start "rule__DoubleElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6682:1: rule__DoubleElement__PropertiesAssignment_2 : ( ruleAbstractValueFieldProperties ) ;
    public final void rule__DoubleElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6686:1: ( ( ruleAbstractValueFieldProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6687:1: ( ruleAbstractValueFieldProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6687:1: ( ruleAbstractValueFieldProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6688:1: ruleAbstractValueFieldProperties
            {
             before(grammarAccess.getDoubleElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_rule__DoubleElement__PropertiesAssignment_213623);
            ruleAbstractValueFieldProperties();

            state._fsp--;

             after(grammarAccess.getDoubleElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__PropertiesAssignment_2"


    // $ANTLR start "rule__DoubleElement__ChildrenAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6697:1: rule__DoubleElement__ChildrenAssignment_3_1 : ( ruleLogicElement ) ;
    public final void rule__DoubleElement__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6701:1: ( ( ruleLogicElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6702:1: ( ruleLogicElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6702:1: ( ruleLogicElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6703:1: ruleLogicElement
            {
             before(grammarAccess.getDoubleElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLogicElement_in_rule__DoubleElement__ChildrenAssignment_3_113654);
            ruleLogicElement();

            state._fsp--;

             after(grammarAccess.getDoubleElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleElement__ChildrenAssignment_3_1"


    // $ANTLR start "rule__LongElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6712:1: rule__LongElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LongElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6716:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6717:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6717:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6718:1: RULE_ID
            {
             before(grammarAccess.getLongElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__LongElement__NameAssignment_113685); 
             after(grammarAccess.getLongElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__NameAssignment_1"


    // $ANTLR start "rule__LongElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6727:1: rule__LongElement__PropertiesAssignment_2 : ( ruleAbstractValueFieldProperties ) ;
    public final void rule__LongElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6731:1: ( ( ruleAbstractValueFieldProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6732:1: ( ruleAbstractValueFieldProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6732:1: ( ruleAbstractValueFieldProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6733:1: ruleAbstractValueFieldProperties
            {
             before(grammarAccess.getLongElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_rule__LongElement__PropertiesAssignment_213716);
            ruleAbstractValueFieldProperties();

            state._fsp--;

             after(grammarAccess.getLongElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__PropertiesAssignment_2"


    // $ANTLR start "rule__LongElement__ChildrenAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6742:1: rule__LongElement__ChildrenAssignment_3_1 : ( ruleLogicElement ) ;
    public final void rule__LongElement__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6746:1: ( ( ruleLogicElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6747:1: ( ruleLogicElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6747:1: ( ruleLogicElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6748:1: ruleLogicElement
            {
             before(grammarAccess.getLongElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLogicElement_in_rule__LongElement__ChildrenAssignment_3_113747);
            ruleLogicElement();

            state._fsp--;

             after(grammarAccess.getLongElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LongElement__ChildrenAssignment_3_1"


    // $ANTLR start "rule__DateElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6757:1: rule__DateElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DateElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6761:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6762:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6762:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6763:1: RULE_ID
            {
             before(grammarAccess.getDateElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DateElement__NameAssignment_113778); 
             after(grammarAccess.getDateElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__NameAssignment_1"


    // $ANTLR start "rule__DateElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6772:1: rule__DateElement__PropertiesAssignment_2 : ( ruleAbstractValueFieldProperties ) ;
    public final void rule__DateElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6776:1: ( ( ruleAbstractValueFieldProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6777:1: ( ruleAbstractValueFieldProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6777:1: ( ruleAbstractValueFieldProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6778:1: ruleAbstractValueFieldProperties
            {
             before(grammarAccess.getDateElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_rule__DateElement__PropertiesAssignment_213809);
            ruleAbstractValueFieldProperties();

            state._fsp--;

             after(grammarAccess.getDateElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__PropertiesAssignment_2"


    // $ANTLR start "rule__DateElement__ChildrenAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6787:1: rule__DateElement__ChildrenAssignment_3_1 : ( ruleLogicElement ) ;
    public final void rule__DateElement__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6791:1: ( ( ruleLogicElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6792:1: ( ruleLogicElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6792:1: ( ruleLogicElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6793:1: ruleLogicElement
            {
             before(grammarAccess.getDateElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLogicElement_in_rule__DateElement__ChildrenAssignment_3_113840);
            ruleLogicElement();

            state._fsp--;

             after(grammarAccess.getDateElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateElement__ChildrenAssignment_3_1"


    // $ANTLR start "rule__SmartfieldElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6802:1: rule__SmartfieldElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SmartfieldElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6806:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6807:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6807:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6808:1: RULE_ID
            {
             before(grammarAccess.getSmartfieldElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmartfieldElement__NameAssignment_113871); 
             after(grammarAccess.getSmartfieldElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__NameAssignment_1"


    // $ANTLR start "rule__SmartfieldElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6817:1: rule__SmartfieldElement__PropertiesAssignment_2 : ( ruleSmartFieldElementProperties ) ;
    public final void rule__SmartfieldElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6821:1: ( ( ruleSmartFieldElementProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6822:1: ( ruleSmartFieldElementProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6822:1: ( ruleSmartFieldElementProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6823:1: ruleSmartFieldElementProperties
            {
             before(grammarAccess.getSmartfieldElementAccess().getPropertiesSmartFieldElementPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSmartFieldElementProperties_in_rule__SmartfieldElement__PropertiesAssignment_213902);
            ruleSmartFieldElementProperties();

            state._fsp--;

             after(grammarAccess.getSmartfieldElementAccess().getPropertiesSmartFieldElementPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__PropertiesAssignment_2"


    // $ANTLR start "rule__SmartfieldElement__LogicAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6832:1: rule__SmartfieldElement__LogicAssignment_3_1 : ( ruleLogicElement ) ;
    public final void rule__SmartfieldElement__LogicAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6836:1: ( ( ruleLogicElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6837:1: ( ruleLogicElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6837:1: ( ruleLogicElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6838:1: ruleLogicElement
            {
             before(grammarAccess.getSmartfieldElementAccess().getLogicLogicElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLogicElement_in_rule__SmartfieldElement__LogicAssignment_3_113933);
            ruleLogicElement();

            state._fsp--;

             after(grammarAccess.getSmartfieldElementAccess().getLogicLogicElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElement__LogicAssignment_3_1"


    // $ANTLR start "rule__SmartFieldElementProperties__CodeAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6847:1: rule__SmartFieldElementProperties__CodeAssignment_1 : ( ruleSmartfieldElementCodeAttribute ) ;
    public final void rule__SmartFieldElementProperties__CodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6851:1: ( ( ruleSmartfieldElementCodeAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6852:1: ( ruleSmartfieldElementCodeAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6852:1: ( ruleSmartfieldElementCodeAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6853:1: ruleSmartfieldElementCodeAttribute
            {
             before(grammarAccess.getSmartFieldElementPropertiesAccess().getCodeSmartfieldElementCodeAttributeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSmartfieldElementCodeAttribute_in_rule__SmartFieldElementProperties__CodeAssignment_113964);
            ruleSmartfieldElementCodeAttribute();

            state._fsp--;

             after(grammarAccess.getSmartFieldElementPropertiesAccess().getCodeSmartfieldElementCodeAttributeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartFieldElementProperties__CodeAssignment_1"


    // $ANTLR start "rule__SmartFieldElementProperties__Value_typeAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6862:1: rule__SmartFieldElementProperties__Value_typeAssignment_2 : ( ruleSmartfieldElementValueTypeAttribute ) ;
    public final void rule__SmartFieldElementProperties__Value_typeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6866:1: ( ( ruleSmartfieldElementValueTypeAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6867:1: ( ruleSmartfieldElementValueTypeAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6867:1: ( ruleSmartfieldElementValueTypeAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6868:1: ruleSmartfieldElementValueTypeAttribute
            {
             before(grammarAccess.getSmartFieldElementPropertiesAccess().getValue_typeSmartfieldElementValueTypeAttributeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_rule__SmartFieldElementProperties__Value_typeAssignment_213995);
            ruleSmartfieldElementValueTypeAttribute();

            state._fsp--;

             after(grammarAccess.getSmartFieldElementPropertiesAccess().getValue_typeSmartfieldElementValueTypeAttributeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartFieldElementProperties__Value_typeAssignment_2"


    // $ANTLR start "rule__SmartFieldElementProperties__LookupAssignment_3"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6877:1: rule__SmartFieldElementProperties__LookupAssignment_3 : ( ruleSmartfieldElementLookupAttribute ) ;
    public final void rule__SmartFieldElementProperties__LookupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6881:1: ( ( ruleSmartfieldElementLookupAttribute ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6882:1: ( ruleSmartfieldElementLookupAttribute )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6882:1: ( ruleSmartfieldElementLookupAttribute )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6883:1: ruleSmartfieldElementLookupAttribute
            {
             before(grammarAccess.getSmartFieldElementPropertiesAccess().getLookupSmartfieldElementLookupAttributeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSmartfieldElementLookupAttribute_in_rule__SmartFieldElementProperties__LookupAssignment_314026);
            ruleSmartfieldElementLookupAttribute();

            state._fsp--;

             after(grammarAccess.getSmartFieldElementPropertiesAccess().getLookupSmartfieldElementLookupAttributeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartFieldElementProperties__LookupAssignment_3"


    // $ANTLR start "rule__SmartfieldElementCodeAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6892:1: rule__SmartfieldElementCodeAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmartfieldElementCodeAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6896:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6897:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6897:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6898:1: ( RULE_ID )
            {
             before(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueCodeElementCrossReference_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6899:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6900:1: RULE_ID
            {
             before(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueCodeElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmartfieldElementCodeAttribute__ValueAssignment_114061); 
             after(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueCodeElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueCodeElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementCodeAttribute__ValueAssignment_1"


    // $ANTLR start "rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6911:1: rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6915:1: ( ( ( ruleQualifiedName ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6916:1: ( ( ruleQualifiedName ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6916:1: ( ( ruleQualifiedName ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6917:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueJvmTypeCrossReference_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6918:1: ( ruleQualifiedName )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6919:1: ruleQualifiedName
            {
             before(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueJvmTypeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__SmartfieldElementValueTypeAttribute__ValueAssignment_114100);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueJvmTypeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueJvmTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1"


    // $ANTLR start "rule__SmartfieldElementLookupAttribute__ValueAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6930:1: rule__SmartfieldElementLookupAttribute__ValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SmartfieldElementLookupAttribute__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6934:1: ( ( ( RULE_ID ) ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6935:1: ( ( RULE_ID ) )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6935:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6936:1: ( RULE_ID )
            {
             before(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueLookupElementCrossReference_1_0()); 
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6937:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6938:1: RULE_ID
            {
             before(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueLookupElementIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SmartfieldElementLookupAttribute__ValueAssignment_114139); 
             after(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueLookupElementIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueLookupElementCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SmartfieldElementLookupAttribute__ValueAssignment_1"


    // $ANTLR start "rule__ZregBoxElement__NameAssignment_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6949:1: rule__ZregBoxElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ZregBoxElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6953:1: ( ( RULE_ID ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6954:1: ( RULE_ID )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6954:1: ( RULE_ID )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6955:1: RULE_ID
            {
             before(grammarAccess.getZregBoxElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ZregBoxElement__NameAssignment_114174); 
             after(grammarAccess.getZregBoxElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__NameAssignment_1"


    // $ANTLR start "rule__ZregBoxElement__PropertiesAssignment_2"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6964:1: rule__ZregBoxElement__PropertiesAssignment_2 : ( ruleAbstractFieldProperties ) ;
    public final void rule__ZregBoxElement__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6968:1: ( ( ruleAbstractFieldProperties ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6969:1: ( ruleAbstractFieldProperties )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6969:1: ( ruleAbstractFieldProperties )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6970:1: ruleAbstractFieldProperties
            {
             before(grammarAccess.getZregBoxElementAccess().getPropertiesAbstractFieldPropertiesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAbstractFieldProperties_in_rule__ZregBoxElement__PropertiesAssignment_214205);
            ruleAbstractFieldProperties();

            state._fsp--;

             after(grammarAccess.getZregBoxElementAccess().getPropertiesAbstractFieldPropertiesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__PropertiesAssignment_2"


    // $ANTLR start "rule__ZregBoxElement__ChildrenAssignment_3_1"
    // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6979:1: rule__ZregBoxElement__ChildrenAssignment_3_1 : ( ruleLogicElement ) ;
    public final void rule__ZregBoxElement__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6983:1: ( ( ruleLogicElement ) )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6984:1: ( ruleLogicElement )
            {
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6984:1: ( ruleLogicElement )
            // ../org.eclipse.scout.saml.ui/src-gen/org/eclipse/scout/saml/ui/contentassist/antlr/internal/InternalSaml.g:6985:1: ruleLogicElement
            {
             before(grammarAccess.getZregBoxElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLogicElement_in_rule__ZregBoxElement__ChildrenAssignment_3_114236);
            ruleLogicElement();

            state._fsp--;

             after(grammarAccess.getZregBoxElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ZregBoxElement__ChildrenAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ElementsAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000984180000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootElement_in_entryRuleRootElement182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootElement189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RootElement__Alternatives_in_ruleRootElement215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldElement_in_entryRuleAbstractFieldElement244 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFieldElement251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFieldElement__Alternatives_in_ruleAbstractFieldElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_entryRuleAbstractFieldProperties304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFieldProperties311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFieldProperties__Alternatives_in_ruleAbstractFieldProperties337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAttribute_in_entryRuleTextAttribute364 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextAttribute371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextAttribute__Group__0_in_ruleTextAttribute397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnabledAttribue_in_entryRuleEnabledAttribue424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnabledAttribue431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnabledAttribue__Group__0_in_ruleEnabledAttribue457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibleAttribue_in_entryRuleVisibleAttribue484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibleAttribue491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibleAttribue__Group__0_in_ruleVisibleAttribue517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterAttribute_in_entryRuleMasterAttribute544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterAttribute551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterAttribute__Group__0_in_ruleMasterAttribute577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldElement_in_entryRuleAbstractValueFieldElement604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractValueFieldElement611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractValueFieldElement__Alternatives_in_ruleAbstractValueFieldElement637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_entryRuleAbstractValueFieldProperties664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractValueFieldProperties671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractValueFieldProperties__Alternatives_in_ruleAbstractValueFieldProperties697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryAttribue_in_entryRuleMandatoryAttribue724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryAttribue731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryAttribue__Group__0_in_ruleMandatoryAttribue757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractContainerFieldElement_in_entryRuleAbstractContainerFieldElement784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractContainerFieldElement791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceBoxElement_in_ruleAbstractContainerFieldElement817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleElement_in_entryRuleModuleElement843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleElement850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleElement__Group__0_in_ruleModuleElement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTranslationElement_in_entryRuleTranslationElement903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTranslationElement910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationElement__Group__0_in_ruleTranslationElement936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTranslationAttribute_in_entryRuleTranslationAttribute963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTranslationAttribute970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__Group__0_in_ruleTranslationAttribute996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_entryRuleJavaElement1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaElement1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__0_in_ruleJavaElement1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunAtAttribute_in_entryRuleRunAtAttribute1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunAtAttribute1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RunAtAttribute__Group__0_in_ruleRunAtAttribute1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_entryRuleCodeElement1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeElement1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__0_in_ruleCodeElement1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeIdAttribute_in_entryRuleCodeIdAttribute1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeIdAttribute1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeIdAttribute__Group__0_in_ruleCodeIdAttribute1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_entryRuleLogicElement1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicElement1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__0_in_ruleLogicElement1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOptionalProperties_in_entryRuleLogicOptionalProperties1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOptionalProperties1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOptionalProperties__Alternatives_in_ruleLogicOptionalProperties1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicTypeAttribute_in_entryRuleLogicTypeAttribute1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicTypeAttribute1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicTypeAttribute__Group__0_in_ruleLogicTypeAttribute1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExecAttribute_in_entryRuleLogicExecAttribute1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExecAttribute1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExecAttribute__Group__0_in_ruleLogicExecAttribute1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookupElement_in_entryRuleLookupElement1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLookupElement1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__0_in_ruleLookupElement1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElement_in_entryRuleTemplateElement1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateElement1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__0_in_ruleTemplateElement1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElementClassAttribute_in_entryRuleTemplateElementClassAttribute1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateElementClassAttribute1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementClassAttribute__Group__0_in_ruleTemplateElementClassAttribute1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElementReplacesAttribute_in_entryRuleTemplateElementReplacesAttribute1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateElementReplacesAttribute1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementReplacesAttribute__Group__0_in_ruleTemplateElementReplacesAttribute1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__0_in_ruleFormElement1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElementModalAttribute_in_entryRuleFormElementModalAttribute1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElementModalAttribute1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementModalAttribute__Group__0_in_ruleFormElementModalAttribute1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElementColumnsAttribute_in_entryRuleFormElementColumnsAttribute1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElementColumnsAttribute1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementColumnsAttribute__Group__0_in_ruleFormElementColumnsAttribute1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceBoxElement_in_entryRuleSequenceBoxElement1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceBoxElement1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__0_in_ruleSequenceBoxElement1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_entryRuleStringElement1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElement1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group__0_in_ruleStringElement2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElementProperties_in_entryRuleStringElementProperties2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElementProperties2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElementProperties__Alternatives_in_ruleStringElementProperties2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElementMaxlenAttribute_in_entryRuleStringElementMaxlenAttribute2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElementMaxlenAttribute2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElementMaxlenAttribute__Group__0_in_ruleStringElementMaxlenAttribute2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleElement_in_entryRuleDoubleElement2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleElement2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__0_in_ruleDoubleElement2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongElement_in_entryRuleLongElement2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongElement2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group__0_in_ruleLongElement2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateElement_in_entryRuleDateElement2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateElement2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group__0_in_ruleDateElement2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElement_in_entryRuleSmartfieldElement2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElement2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__0_in_ruleSmartfieldElement2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartFieldElementProperties_in_entryRuleSmartFieldElementProperties2403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartFieldElementProperties2410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartFieldElementProperties__Alternatives_in_ruleSmartFieldElementProperties2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementCodeAttribute_in_entryRuleSmartfieldElementCodeAttribute2463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElementCodeAttribute2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementCodeAttribute__Group__0_in_ruleSmartfieldElementCodeAttribute2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_entryRuleSmartfieldElementValueTypeAttribute2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElementValueTypeAttribute2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__0_in_ruleSmartfieldElementValueTypeAttribute2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementLookupAttribute_in_entryRuleSmartfieldElementLookupAttribute2583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElementLookupAttribute2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementLookupAttribute__Group__0_in_ruleSmartfieldElementLookupAttribute2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZregBoxElement_in_entryRuleZregBoxElement2643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZregBoxElement2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__0_in_ruleZregBoxElement2676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanType__Alternatives_in_ruleBooleanType2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaRunAtAttributeList__Alternatives_in_ruleJavaRunAtAttributeList2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicTypeAttributeList__Alternatives_in_ruleLogicTypeAttributeList2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleElement_in_rule__RootElement__Alternatives2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTranslationElement_in_rule__RootElement__Alternatives2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_rule__RootElement__Alternatives2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookupElement_in_rule__RootElement__Alternatives2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElement_in_rule__RootElement__Alternatives2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_rule__RootElement__Alternatives2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldElement_in_rule__AbstractFieldElement__Alternatives2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractContainerFieldElement_in_rule__AbstractFieldElement__Alternatives2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFieldProperties__TextAssignment_0_in_rule__AbstractFieldProperties__Alternatives2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFieldProperties__VisibleAssignment_1_in_rule__AbstractFieldProperties__Alternatives3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFieldProperties__MasterAssignment_2_in_rule__AbstractFieldProperties__Alternatives3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractFieldProperties__EnabledAssignment_3_in_rule__AbstractFieldProperties__Alternatives3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_rule__AbstractValueFieldElement__Alternatives3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElement_in_rule__AbstractValueFieldElement__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongElement_in_rule__AbstractValueFieldElement__Alternatives3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleElement_in_rule__AbstractValueFieldElement__Alternatives3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateElement_in_rule__AbstractValueFieldElement__Alternatives3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZregBoxElement_in_rule__AbstractValueFieldElement__Alternatives3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_rule__AbstractValueFieldProperties__Alternatives3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractValueFieldProperties__MandatoryAssignment_1_in_rule__AbstractValueFieldProperties__Alternatives3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOptionalProperties__RunatAssignment_0_in_rule__LogicOptionalProperties__Alternatives3241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicOptionalProperties__ExecAssignment_1_in_rule__LogicOptionalProperties__Alternatives3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_rule__LookupElement__ServicelogicAlternatives_3_03292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__LookupElement__ServicelogicAlternatives_3_03309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__FormElement__ElementsAlternatives_6_03341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_rule__FormElement__ElementsAlternatives_6_03358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldElement_in_rule__FormElement__ElementsAlternatives_6_03375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__SequenceBoxElement__ChildrenAlternatives_3_1_03407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldElement_in_rule__SequenceBoxElement__ChildrenAlternatives_3_1_03424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_rule__StringElementProperties__Alternatives3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElementProperties__MaxlenAssignment_1_in_rule__StringElementProperties__Alternatives3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_rule__SmartFieldElementProperties__Alternatives3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartFieldElementProperties__CodeAssignment_1_in_rule__SmartFieldElementProperties__Alternatives3523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartFieldElementProperties__Value_typeAssignment_2_in_rule__SmartFieldElementProperties__Alternatives3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartFieldElementProperties__LookupAssignment_3_in_rule__SmartFieldElementProperties__Alternatives3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__BooleanType__Alternatives3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BooleanType__Alternatives3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__JavaRunAtAttributeList__Alternatives3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JavaRunAtAttributeList__Alternatives3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LogicTypeAttributeList__Alternatives3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LogicTypeAttributeList__Alternatives3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__LogicTypeAttributeList__Alternatives3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__LogicTypeAttributeList__Alternatives3770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__LogicTypeAttributeList__Alternatives3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LogicTypeAttributeList__Alternatives3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LogicTypeAttributeList__Alternatives3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LogicTypeAttributeList__Alternatives3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__LogicTypeAttributeList__Alternatives3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__LogicTypeAttributeList__Alternatives3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03929 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4015 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04050 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__QualifiedName__Group_1__0__Impl4081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextAttribute__Group__0__Impl_in_rule__TextAttribute__Group__04172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TextAttribute__Group__1_in_rule__TextAttribute__Group__04175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__TextAttribute__Group__0__Impl4203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextAttribute__Group__1__Impl_in_rule__TextAttribute__Group__14234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextAttribute__ValueAssignment_1_in_rule__TextAttribute__Group__1__Impl4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnabledAttribue__Group__0__Impl_in_rule__EnabledAttribue__Group__04295 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__EnabledAttribue__Group__1_in_rule__EnabledAttribue__Group__04298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EnabledAttribue__Group__0__Impl4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnabledAttribue__Group__1__Impl_in_rule__EnabledAttribue__Group__14357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EnabledAttribue__ValueAssignment_1_in_rule__EnabledAttribue__Group__1__Impl4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibleAttribue__Group__0__Impl_in_rule__VisibleAttribue__Group__04418 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__VisibleAttribue__Group__1_in_rule__VisibleAttribue__Group__04421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VisibleAttribue__Group__0__Impl4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibleAttribue__Group__1__Impl_in_rule__VisibleAttribue__Group__14480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VisibleAttribue__ValueAssignment_1_in_rule__VisibleAttribue__Group__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterAttribute__Group__0__Impl_in_rule__MasterAttribute__Group__04541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MasterAttribute__Group__1_in_rule__MasterAttribute__Group__04544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MasterAttribute__Group__0__Impl4572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterAttribute__Group__1__Impl_in_rule__MasterAttribute__Group__14603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MasterAttribute__ValueAssignment_1_in_rule__MasterAttribute__Group__1__Impl4630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryAttribue__Group__0__Impl_in_rule__MandatoryAttribue__Group__04664 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__MandatoryAttribue__Group__1_in_rule__MandatoryAttribue__Group__04667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MandatoryAttribue__Group__0__Impl4695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryAttribue__Group__1__Impl_in_rule__MandatoryAttribue__Group__14726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryAttribue__ValueAssignment_1_in_rule__MandatoryAttribue__Group__1__Impl4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleElement__Group__0__Impl_in_rule__ModuleElement__Group__04787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ModuleElement__Group__1_in_rule__ModuleElement__Group__04790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModuleElement__Group__0__Impl4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleElement__Group__1__Impl_in_rule__ModuleElement__Group__14849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModuleElement__NameAssignment_1_in_rule__ModuleElement__Group__1__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationElement__Group__0__Impl_in_rule__TranslationElement__Group__04910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TranslationElement__Group__1_in_rule__TranslationElement__Group__04913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TranslationElement__Group__0__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationElement__Group__1__Impl_in_rule__TranslationElement__Group__14972 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TranslationElement__Group__2_in_rule__TranslationElement__Group__14975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationElement__NameAssignment_1_in_rule__TranslationElement__Group__1__Impl5002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationElement__Group__2__Impl_in_rule__TranslationElement__Group__25032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationElement__TranslationsAssignment_2_in_rule__TranslationElement__Group__2__Impl5061 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TranslationElement__TranslationsAssignment_2_in_rule__TranslationElement__Group__2__Impl5073 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__Group__0__Impl_in_rule__TranslationAttribute__Group__05112 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__Group__1_in_rule__TranslationAttribute__Group__05115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__LangAssignment_0_in_rule__TranslationAttribute__Group__0__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__Group__1__Impl_in_rule__TranslationAttribute__Group__15172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__Group__2_in_rule__TranslationAttribute__Group__15175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__TranslationAttribute__Group__1__Impl5203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__Group__2__Impl_in_rule__TranslationAttribute__Group__25234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TranslationAttribute__TypeAssignment_2_in_rule__TranslationAttribute__Group__2__Impl5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__0__Impl_in_rule__JavaElement__Group__05297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__1_in_rule__JavaElement__Group__05300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__JavaElement__Group__0__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__1__Impl_in_rule__JavaElement__Group__15359 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__2_in_rule__JavaElement__Group__15362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__NameAssignment_1_in_rule__JavaElement__Group__1__Impl5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__2__Impl_in_rule__JavaElement__Group__25419 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__3_in_rule__JavaElement__Group__25422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__RunatAssignment_2_in_rule__JavaElement__Group__2__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__3__Impl_in_rule__JavaElement__Group__35479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__4_in_rule__JavaElement__Group__35482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__JavaElement__Group__3__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__4__Impl_in_rule__JavaElement__Group__45541 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__5_in_rule__JavaElement__Group__45544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__SourceAssignment_4_in_rule__JavaElement__Group__4__Impl5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JavaElement__Group__5__Impl_in_rule__JavaElement__Group__55601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__JavaElement__Group__5__Impl5629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RunAtAttribute__Group__0__Impl_in_rule__RunAtAttribute__Group__05672 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__RunAtAttribute__Group__1_in_rule__RunAtAttribute__Group__05675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RunAtAttribute__Group__0__Impl5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RunAtAttribute__Group__1__Impl_in_rule__RunAtAttribute__Group__15734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RunAtAttribute__ValueAssignment_1_in_rule__RunAtAttribute__Group__1__Impl5761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__0__Impl_in_rule__CodeElement__Group__05795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__1_in_rule__CodeElement__Group__05798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__CodeElement__Group__0__Impl5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__1__Impl_in_rule__CodeElement__Group__15857 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__2_in_rule__CodeElement__Group__15860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__NameAssignment_1_in_rule__CodeElement__Group__1__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__Group__2__Impl_in_rule__CodeElement__Group__25917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeElement__IdAssignment_2_in_rule__CodeElement__Group__2__Impl5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeIdAttribute__Group__0__Impl_in_rule__CodeIdAttribute__Group__05980 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__CodeIdAttribute__Group__1_in_rule__CodeIdAttribute__Group__05983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__CodeIdAttribute__Group__0__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeIdAttribute__Group__1__Impl_in_rule__CodeIdAttribute__Group__16042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CodeIdAttribute__ValueAssignment_1_in_rule__CodeIdAttribute__Group__1__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__0__Impl_in_rule__LogicElement__Group__06103 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__1_in_rule__LogicElement__Group__06106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__LogicElement__Group__0__Impl6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__1__Impl_in_rule__LogicElement__Group__16165 = new BitSet(new long[]{0x0000042800000000L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__2_in_rule__LogicElement__Group__16168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__TypeAssignment_1_in_rule__LogicElement__Group__1__Impl6195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__2__Impl_in_rule__LogicElement__Group__26225 = new BitSet(new long[]{0x0000042800000000L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__3_in_rule__LogicElement__Group__26228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__PropertiesAssignment_2_in_rule__LogicElement__Group__2__Impl6255 = new BitSet(new long[]{0x0000042000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group__3__Impl_in_rule__LogicElement__Group__36286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group_3__0_in_rule__LogicElement__Group__3__Impl6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group_3__0__Impl_in_rule__LogicElement__Group_3__06352 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__LogicElement__Group_3__1_in_rule__LogicElement__Group_3__06355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LogicElement__Group_3__0__Impl6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group_3__1__Impl_in_rule__LogicElement__Group_3__16414 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__LogicElement__Group_3__2_in_rule__LogicElement__Group_3__16417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__SourceAssignment_3_1_in_rule__LogicElement__Group_3__1__Impl6444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicElement__Group_3__2__Impl_in_rule__LogicElement__Group_3__26474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LogicElement__Group_3__2__Impl6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicTypeAttribute__Group__0__Impl_in_rule__LogicTypeAttribute__Group__06539 = new BitSet(new long[]{0x0000000001FF8000L});
    public static final BitSet FOLLOW_rule__LogicTypeAttribute__Group__1_in_rule__LogicTypeAttribute__Group__06542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__LogicTypeAttribute__Group__0__Impl6570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicTypeAttribute__Group__1__Impl_in_rule__LogicTypeAttribute__Group__16601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicTypeAttribute__ValueAssignment_1_in_rule__LogicTypeAttribute__Group__1__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExecAttribute__Group__0__Impl_in_rule__LogicExecAttribute__Group__06662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LogicExecAttribute__Group__1_in_rule__LogicExecAttribute__Group__06665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__LogicExecAttribute__Group__0__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExecAttribute__Group__1__Impl_in_rule__LogicExecAttribute__Group__16724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicExecAttribute__ValueAssignment_1_in_rule__LogicExecAttribute__Group__1__Impl6751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__0__Impl_in_rule__LookupElement__Group__06785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__1_in_rule__LookupElement__Group__06788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__LookupElement__Group__0__Impl6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__1__Impl_in_rule__LookupElement__Group__16847 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__2_in_rule__LookupElement__Group__16850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__NameAssignment_1_in_rule__LookupElement__Group__1__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__2__Impl_in_rule__LookupElement__Group__26907 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__3_in_rule__LookupElement__Group__26910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LookupElement__Group__2__Impl6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__3__Impl_in_rule__LookupElement__Group__36969 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__4_in_rule__LookupElement__Group__36972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__ServicelogicAssignment_3_in_rule__LookupElement__Group__3__Impl7001 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__LookupElement__ServicelogicAssignment_3_in_rule__LookupElement__Group__3__Impl7013 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__LookupElement__Group__4__Impl_in_rule__LookupElement__Group__47046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LookupElement__Group__4__Impl7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__0__Impl_in_rule__TemplateElement__Group__07115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__1_in_rule__TemplateElement__Group__07118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TemplateElement__Group__0__Impl7146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__1__Impl_in_rule__TemplateElement__Group__17177 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__2_in_rule__TemplateElement__Group__17180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__NameAssignment_1_in_rule__TemplateElement__Group__1__Impl7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__2__Impl_in_rule__TemplateElement__Group__27237 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__3_in_rule__TemplateElement__Group__27240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__ClassAssignment_2_in_rule__TemplateElement__Group__2__Impl7267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__Group__3__Impl_in_rule__TemplateElement__Group__37297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElement__ReplacesAssignment_3_in_rule__TemplateElement__Group__3__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementClassAttribute__Group__0__Impl_in_rule__TemplateElementClassAttribute__Group__07362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateElementClassAttribute__Group__1_in_rule__TemplateElementClassAttribute__Group__07365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__TemplateElementClassAttribute__Group__0__Impl7393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementClassAttribute__Group__1__Impl_in_rule__TemplateElementClassAttribute__Group__17424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementClassAttribute__ValueAssignment_1_in_rule__TemplateElementClassAttribute__Group__1__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementReplacesAttribute__Group__0__Impl_in_rule__TemplateElementReplacesAttribute__Group__07485 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TemplateElementReplacesAttribute__Group__1_in_rule__TemplateElementReplacesAttribute__Group__07488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__TemplateElementReplacesAttribute__Group__0__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementReplacesAttribute__Group__1__Impl_in_rule__TemplateElementReplacesAttribute__Group__17547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemplateElementReplacesAttribute__ValueAssignment_1_in_rule__TemplateElementReplacesAttribute__Group__1__Impl7574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__0__Impl_in_rule__FormElement__Group__07608 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1_in_rule__FormElement__Group__07611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__FormElement__Group__0__Impl7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__1__Impl_in_rule__FormElement__Group__17670 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2_in_rule__FormElement__Group__17673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__NameAssignment_1_in_rule__FormElement__Group__1__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__2__Impl_in_rule__FormElement__Group__27730 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3_in_rule__FormElement__Group__27733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ModalAssignment_2_in_rule__FormElement__Group__2__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__3__Impl_in_rule__FormElement__Group__37790 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4_in_rule__FormElement__Group__37793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__TextAssignment_3_in_rule__FormElement__Group__3__Impl7820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__4__Impl_in_rule__FormElement__Group__47850 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__5_in_rule__FormElement__Group__47853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ColumnsAssignment_4_in_rule__FormElement__Group__4__Impl7880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__5__Impl_in_rule__FormElement__Group__57910 = new BitSet(new long[]{0x11EC011400000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__6_in_rule__FormElement__Group__57913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FormElement__Group__5__Impl7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__6__Impl_in_rule__FormElement__Group__67972 = new BitSet(new long[]{0x11EC011400000000L});
    public static final BitSet FOLLOW_rule__FormElement__Group__7_in_rule__FormElement__Group__67975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ElementsAssignment_6_in_rule__FormElement__Group__6__Impl8002 = new BitSet(new long[]{0x11EC010400000002L});
    public static final BitSet FOLLOW_rule__FormElement__Group__7__Impl_in_rule__FormElement__Group__78033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FormElement__Group__7__Impl8061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementModalAttribute__Group__0__Impl_in_rule__FormElementModalAttribute__Group__08108 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__FormElementModalAttribute__Group__1_in_rule__FormElementModalAttribute__Group__08111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FormElementModalAttribute__Group__0__Impl8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementModalAttribute__Group__1__Impl_in_rule__FormElementModalAttribute__Group__18170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementModalAttribute__ValueAssignment_1_in_rule__FormElementModalAttribute__Group__1__Impl8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementColumnsAttribute__Group__0__Impl_in_rule__FormElementColumnsAttribute__Group__08231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FormElementColumnsAttribute__Group__1_in_rule__FormElementColumnsAttribute__Group__08234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__FormElementColumnsAttribute__Group__0__Impl8262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementColumnsAttribute__Group__1__Impl_in_rule__FormElementColumnsAttribute__Group__18293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElementColumnsAttribute__ValueAssignment_1_in_rule__FormElementColumnsAttribute__Group__1__Impl8320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__0__Impl_in_rule__SequenceBoxElement__Group__08354 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__1_in_rule__SequenceBoxElement__Group__08357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__SequenceBoxElement__Group__0__Impl8385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__1__Impl_in_rule__SequenceBoxElement__Group__18416 = new BitSet(new long[]{0x000000083C000000L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__2_in_rule__SequenceBoxElement__Group__18419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__NameAssignment_1_in_rule__SequenceBoxElement__Group__1__Impl8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__2__Impl_in_rule__SequenceBoxElement__Group__28476 = new BitSet(new long[]{0x000000083C000000L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__3_in_rule__SequenceBoxElement__Group__28479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__PropertiesAssignment_2_in_rule__SequenceBoxElement__Group__2__Impl8506 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group__3__Impl_in_rule__SequenceBoxElement__Group__38537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group_3__0_in_rule__SequenceBoxElement__Group__3__Impl8564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group_3__0__Impl_in_rule__SequenceBoxElement__Group_3__08603 = new BitSet(new long[]{0x11EC011400000000L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group_3__1_in_rule__SequenceBoxElement__Group_3__08606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SequenceBoxElement__Group_3__0__Impl8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group_3__1__Impl_in_rule__SequenceBoxElement__Group_3__18665 = new BitSet(new long[]{0x11EC011400000000L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group_3__2_in_rule__SequenceBoxElement__Group_3__18668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__ChildrenAssignment_3_1_in_rule__SequenceBoxElement__Group_3__1__Impl8695 = new BitSet(new long[]{0x11EC010400000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__Group_3__2__Impl_in_rule__SequenceBoxElement__Group_3__28726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SequenceBoxElement__Group_3__2__Impl8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group__0__Impl_in_rule__StringElement__Group__08791 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__StringElement__Group__1_in_rule__StringElement__Group__08794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__StringElement__Group__0__Impl8822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group__1__Impl_in_rule__StringElement__Group__18853 = new BitSet(new long[]{0x001000087C000000L});
    public static final BitSet FOLLOW_rule__StringElement__Group__2_in_rule__StringElement__Group__18856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__NameAssignment_1_in_rule__StringElement__Group__1__Impl8883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group__2__Impl_in_rule__StringElement__Group__28913 = new BitSet(new long[]{0x001000087C000000L});
    public static final BitSet FOLLOW_rule__StringElement__Group__3_in_rule__StringElement__Group__28916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__PropertiesAssignment_2_in_rule__StringElement__Group__2__Impl8943 = new BitSet(new long[]{0x001000007C000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group__3__Impl_in_rule__StringElement__Group__38974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group_3__0_in_rule__StringElement__Group__3__Impl9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group_3__0__Impl_in_rule__StringElement__Group_3__09040 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_rule__StringElement__Group_3__1_in_rule__StringElement__Group_3__09043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StringElement__Group_3__0__Impl9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group_3__1__Impl_in_rule__StringElement__Group_3__19102 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__StringElement__Group_3__2_in_rule__StringElement__Group_3__19105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElement__LogicAssignment_3_1_in_rule__StringElement__Group_3__1__Impl9134 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__StringElement__LogicAssignment_3_1_in_rule__StringElement__Group_3__1__Impl9146 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__StringElement__Group_3__2__Impl_in_rule__StringElement__Group_3__29179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__StringElement__Group_3__2__Impl9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElementMaxlenAttribute__Group__0__Impl_in_rule__StringElementMaxlenAttribute__Group__09244 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__StringElementMaxlenAttribute__Group__1_in_rule__StringElementMaxlenAttribute__Group__09247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__StringElementMaxlenAttribute__Group__0__Impl9275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElementMaxlenAttribute__Group__1__Impl_in_rule__StringElementMaxlenAttribute__Group__19306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringElementMaxlenAttribute__ValueAssignment_1_in_rule__StringElementMaxlenAttribute__Group__1__Impl9333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__0__Impl_in_rule__DoubleElement__Group__09367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__1_in_rule__DoubleElement__Group__09370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DoubleElement__Group__0__Impl9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__1__Impl_in_rule__DoubleElement__Group__19429 = new BitSet(new long[]{0x000000087C000000L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__2_in_rule__DoubleElement__Group__19432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__NameAssignment_1_in_rule__DoubleElement__Group__1__Impl9459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__2__Impl_in_rule__DoubleElement__Group__29489 = new BitSet(new long[]{0x000000087C000000L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__3_in_rule__DoubleElement__Group__29492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__PropertiesAssignment_2_in_rule__DoubleElement__Group__2__Impl9519 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group__3__Impl_in_rule__DoubleElement__Group__39550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group_3__0_in_rule__DoubleElement__Group__3__Impl9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group_3__0__Impl_in_rule__DoubleElement__Group_3__09616 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group_3__1_in_rule__DoubleElement__Group_3__09619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DoubleElement__Group_3__0__Impl9647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group_3__1__Impl_in_rule__DoubleElement__Group_3__19678 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group_3__2_in_rule__DoubleElement__Group_3__19681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__ChildrenAssignment_3_1_in_rule__DoubleElement__Group_3__1__Impl9708 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__DoubleElement__Group_3__2__Impl_in_rule__DoubleElement__Group_3__29739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DoubleElement__Group_3__2__Impl9767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group__0__Impl_in_rule__LongElement__Group__09804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LongElement__Group__1_in_rule__LongElement__Group__09807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__LongElement__Group__0__Impl9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group__1__Impl_in_rule__LongElement__Group__19866 = new BitSet(new long[]{0x000000087C000000L});
    public static final BitSet FOLLOW_rule__LongElement__Group__2_in_rule__LongElement__Group__19869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__NameAssignment_1_in_rule__LongElement__Group__1__Impl9896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group__2__Impl_in_rule__LongElement__Group__29926 = new BitSet(new long[]{0x000000087C000000L});
    public static final BitSet FOLLOW_rule__LongElement__Group__3_in_rule__LongElement__Group__29929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__PropertiesAssignment_2_in_rule__LongElement__Group__2__Impl9956 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group__3__Impl_in_rule__LongElement__Group__39987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group_3__0_in_rule__LongElement__Group__3__Impl10014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group_3__0__Impl_in_rule__LongElement__Group_3__010053 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__LongElement__Group_3__1_in_rule__LongElement__Group_3__010056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__LongElement__Group_3__0__Impl10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group_3__1__Impl_in_rule__LongElement__Group_3__110115 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__LongElement__Group_3__2_in_rule__LongElement__Group_3__110118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LongElement__ChildrenAssignment_3_1_in_rule__LongElement__Group_3__1__Impl10145 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__LongElement__Group_3__2__Impl_in_rule__LongElement__Group_3__210176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__LongElement__Group_3__2__Impl10204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group__0__Impl_in_rule__DateElement__Group__010241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DateElement__Group__1_in_rule__DateElement__Group__010244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__DateElement__Group__0__Impl10272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group__1__Impl_in_rule__DateElement__Group__110303 = new BitSet(new long[]{0x000000087C000000L});
    public static final BitSet FOLLOW_rule__DateElement__Group__2_in_rule__DateElement__Group__110306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__NameAssignment_1_in_rule__DateElement__Group__1__Impl10333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group__2__Impl_in_rule__DateElement__Group__210363 = new BitSet(new long[]{0x000000087C000000L});
    public static final BitSet FOLLOW_rule__DateElement__Group__3_in_rule__DateElement__Group__210366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__PropertiesAssignment_2_in_rule__DateElement__Group__2__Impl10393 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group__3__Impl_in_rule__DateElement__Group__310424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group_3__0_in_rule__DateElement__Group__3__Impl10451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group_3__0__Impl_in_rule__DateElement__Group_3__010490 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__DateElement__Group_3__1_in_rule__DateElement__Group_3__010493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__DateElement__Group_3__0__Impl10521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group_3__1__Impl_in_rule__DateElement__Group_3__110552 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__DateElement__Group_3__2_in_rule__DateElement__Group_3__110555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DateElement__ChildrenAssignment_3_1_in_rule__DateElement__Group_3__1__Impl10582 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__DateElement__Group_3__2__Impl_in_rule__DateElement__Group_3__210613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__DateElement__Group_3__2__Impl10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__0__Impl_in_rule__SmartfieldElement__Group__010678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__1_in_rule__SmartfieldElement__Group__010681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__SmartfieldElement__Group__0__Impl10709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__1__Impl_in_rule__SmartfieldElement__Group__110740 = new BitSet(new long[]{0x0E0000087C000000L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__2_in_rule__SmartfieldElement__Group__110743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__NameAssignment_1_in_rule__SmartfieldElement__Group__1__Impl10770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__2__Impl_in_rule__SmartfieldElement__Group__210800 = new BitSet(new long[]{0x0E0000087C000000L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__3_in_rule__SmartfieldElement__Group__210803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__PropertiesAssignment_2_in_rule__SmartfieldElement__Group__2__Impl10830 = new BitSet(new long[]{0x0E0000007C000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group__3__Impl_in_rule__SmartfieldElement__Group__310861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group_3__0_in_rule__SmartfieldElement__Group__3__Impl10888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group_3__0__Impl_in_rule__SmartfieldElement__Group_3__010927 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group_3__1_in_rule__SmartfieldElement__Group_3__010930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__SmartfieldElement__Group_3__0__Impl10958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group_3__1__Impl_in_rule__SmartfieldElement__Group_3__110989 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group_3__2_in_rule__SmartfieldElement__Group_3__110992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__LogicAssignment_3_1_in_rule__SmartfieldElement__Group_3__1__Impl11021 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__LogicAssignment_3_1_in_rule__SmartfieldElement__Group_3__1__Impl11033 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElement__Group_3__2__Impl_in_rule__SmartfieldElement__Group_3__211066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__SmartfieldElement__Group_3__2__Impl11094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementCodeAttribute__Group__0__Impl_in_rule__SmartfieldElementCodeAttribute__Group__011131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmartfieldElementCodeAttribute__Group__1_in_rule__SmartfieldElementCodeAttribute__Group__011134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__SmartfieldElementCodeAttribute__Group__0__Impl11162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementCodeAttribute__Group__1__Impl_in_rule__SmartfieldElementCodeAttribute__Group__111193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementCodeAttribute__ValueAssignment_1_in_rule__SmartfieldElementCodeAttribute__Group__1__Impl11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__0__Impl_in_rule__SmartfieldElementValueTypeAttribute__Group__011254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__1_in_rule__SmartfieldElementValueTypeAttribute__Group__011257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__SmartfieldElementValueTypeAttribute__Group__0__Impl11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementValueTypeAttribute__Group__1__Impl_in_rule__SmartfieldElementValueTypeAttribute__Group__111316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementValueTypeAttribute__ValueAssignment_1_in_rule__SmartfieldElementValueTypeAttribute__Group__1__Impl11343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementLookupAttribute__Group__0__Impl_in_rule__SmartfieldElementLookupAttribute__Group__011377 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SmartfieldElementLookupAttribute__Group__1_in_rule__SmartfieldElementLookupAttribute__Group__011380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__SmartfieldElementLookupAttribute__Group__0__Impl11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementLookupAttribute__Group__1__Impl_in_rule__SmartfieldElementLookupAttribute__Group__111439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SmartfieldElementLookupAttribute__ValueAssignment_1_in_rule__SmartfieldElementLookupAttribute__Group__1__Impl11466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__0__Impl_in_rule__ZregBoxElement__Group__011500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__1_in_rule__ZregBoxElement__Group__011503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__ZregBoxElement__Group__0__Impl11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__1__Impl_in_rule__ZregBoxElement__Group__111562 = new BitSet(new long[]{0x000000083C000000L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__2_in_rule__ZregBoxElement__Group__111565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__NameAssignment_1_in_rule__ZregBoxElement__Group__1__Impl11592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__2__Impl_in_rule__ZregBoxElement__Group__211622 = new BitSet(new long[]{0x000000083C000000L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__3_in_rule__ZregBoxElement__Group__211625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__PropertiesAssignment_2_in_rule__ZregBoxElement__Group__2__Impl11652 = new BitSet(new long[]{0x000000003C000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group__3__Impl_in_rule__ZregBoxElement__Group__311683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group_3__0_in_rule__ZregBoxElement__Group__3__Impl11710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group_3__0__Impl_in_rule__ZregBoxElement__Group_3__011749 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group_3__1_in_rule__ZregBoxElement__Group_3__011752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ZregBoxElement__Group_3__0__Impl11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group_3__1__Impl_in_rule__ZregBoxElement__Group_3__111811 = new BitSet(new long[]{0x0000011400000000L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group_3__2_in_rule__ZregBoxElement__Group_3__111814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__ChildrenAssignment_3_1_in_rule__ZregBoxElement__Group_3__1__Impl11841 = new BitSet(new long[]{0x0000010400000002L});
    public static final BitSet FOLLOW_rule__ZregBoxElement__Group_3__2__Impl_in_rule__ZregBoxElement__Group_3__211872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ZregBoxElement__Group_3__2__Impl11900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootElement_in_rule__Model__ElementsAssignment11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAttribute_in_rule__AbstractFieldProperties__TextAssignment_011973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibleAttribue_in_rule__AbstractFieldProperties__VisibleAssignment_112004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterAttribute_in_rule__AbstractFieldProperties__MasterAssignment_212035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnabledAttribue_in_rule__AbstractFieldProperties__EnabledAssignment_312066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TextAttribute__ValueAssignment_112101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__EnabledAttribue__ValueAssignment_112136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__VisibleAttribue__ValueAssignment_112167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MasterAttribute__ValueAssignment_112202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryAttribue_in_rule__AbstractValueFieldProperties__MandatoryAssignment_112237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__MandatoryAttribue__ValueAssignment_112268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__ModuleElement__NameAssignment_112299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TranslationElement__NameAssignment_112330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTranslationAttribute_in_rule__TranslationElement__TranslationsAssignment_212361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TranslationAttribute__LangAssignment_012392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TranslationAttribute__TypeAssignment_212423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__JavaElement__NameAssignment_112454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunAtAttribute_in_rule__JavaElement__RunatAssignment_212485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__JavaElement__SourceAssignment_412516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaRunAtAttributeList_in_rule__RunAtAttribute__ValueAssignment_112547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__CodeElement__NameAssignment_112578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeIdAttribute_in_rule__CodeElement__IdAssignment_212609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__CodeIdAttribute__ValueAssignment_112640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicTypeAttribute_in_rule__LogicElement__TypeAssignment_112671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOptionalProperties_in_rule__LogicElement__PropertiesAssignment_212702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__LogicElement__SourceAssignment_3_112733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunAtAttribute_in_rule__LogicOptionalProperties__RunatAssignment_012764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExecAttribute_in_rule__LogicOptionalProperties__ExecAssignment_112795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicTypeAttributeList_in_rule__LogicTypeAttribute__ValueAssignment_112826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LogicExecAttribute__ValueAssignment_112861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LookupElement__NameAssignment_112896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LookupElement__ServicelogicAlternatives_3_0_in_rule__LookupElement__ServicelogicAssignment_312927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TemplateElement__NameAssignment_112960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElementClassAttribute_in_rule__TemplateElement__ClassAssignment_212991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElementReplacesAttribute_in_rule__TemplateElement__ReplacesAssignment_313022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TemplateElementClassAttribute__ValueAssignment_113053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TemplateElementReplacesAttribute__ValueAssignment_113088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FormElement__NameAssignment_113123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElementModalAttribute_in_rule__FormElement__ModalAssignment_213154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAttribute_in_rule__FormElement__TextAssignment_313185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElementColumnsAttribute_in_rule__FormElement__ColumnsAssignment_413216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormElement__ElementsAlternatives_6_0_in_rule__FormElement__ElementsAssignment_613247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanType_in_rule__FormElementModalAttribute__ValueAssignment_113280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FormElementColumnsAttribute__ValueAssignment_113311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SequenceBoxElement__NameAssignment_113342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_rule__SequenceBoxElement__PropertiesAssignment_213373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SequenceBoxElement__ChildrenAlternatives_3_1_0_in_rule__SequenceBoxElement__ChildrenAssignment_3_113404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StringElement__NameAssignment_113437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElementProperties_in_rule__StringElement__PropertiesAssignment_213468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__StringElement__LogicAssignment_3_113499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElementMaxlenAttribute_in_rule__StringElementProperties__MaxlenAssignment_113530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__StringElementMaxlenAttribute__ValueAssignment_113561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DoubleElement__NameAssignment_113592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_rule__DoubleElement__PropertiesAssignment_213623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__DoubleElement__ChildrenAssignment_3_113654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__LongElement__NameAssignment_113685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_rule__LongElement__PropertiesAssignment_213716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__LongElement__ChildrenAssignment_3_113747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DateElement__NameAssignment_113778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_rule__DateElement__PropertiesAssignment_213809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__DateElement__ChildrenAssignment_3_113840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmartfieldElement__NameAssignment_113871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartFieldElementProperties_in_rule__SmartfieldElement__PropertiesAssignment_213902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__SmartfieldElement__LogicAssignment_3_113933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementCodeAttribute_in_rule__SmartFieldElementProperties__CodeAssignment_113964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_rule__SmartFieldElementProperties__Value_typeAssignment_213995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementLookupAttribute_in_rule__SmartFieldElementProperties__LookupAssignment_314026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmartfieldElementCodeAttribute__ValueAssignment_114061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SmartfieldElementValueTypeAttribute__ValueAssignment_114100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SmartfieldElementLookupAttribute__ValueAssignment_114139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ZregBoxElement__NameAssignment_114174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_rule__ZregBoxElement__PropertiesAssignment_214205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_rule__ZregBoxElement__ChildrenAssignment_3_114236 = new BitSet(new long[]{0x0000000000000002L});

}