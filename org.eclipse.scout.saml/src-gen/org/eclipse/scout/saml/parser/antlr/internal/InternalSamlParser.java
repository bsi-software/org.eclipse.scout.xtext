package org.eclipse.scout.saml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.scout.saml.services.SamlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSamlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'text='", "'enabled='", "'visible='", "'master='", "'mandatory='", "'module '", "'translation '", "'='", "'java '", "'{'", "'}'", "'runat='", "'code '", "'id='", "'logic '", "'type='", "'exec='", "'lookup '", "'template '", "'class='", "'replaces='", "'form '", "'modal='", "'columns='", "'sequence_box '", "'string '", "'maxlen='", "'double '", "'long '", "'date '", "'smartfield '", "'code='", "'value_type='", "'lookup='", "'zreg_sequence_box '", "'true'", "'false'", "'client'", "'server'", "'global'", "'all'", "'modify_load'", "'modify_store'", "'new_load'", "'new_store'", "'changed'", "'click'", "'master_changed'", "'init'"
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
    public String getGrammarFileName() { return "../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g"; }



     	private SamlGrammarAccess grammarAccess;
     	
        public InternalSamlParser(TokenStream input, SamlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected SamlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:77:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleRootElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:80:28: ( ( (lv_elements_0_0= ruleRootElement ) )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:81:1: ( (lv_elements_0_0= ruleRootElement ) )*
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:81:1: ( (lv_elements_0_0= ruleRootElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=18)||LA1_0==24||(LA1_0>=29 && LA1_0<=30)||LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:82:1: (lv_elements_0_0= ruleRootElement )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:82:1: (lv_elements_0_0= ruleRootElement )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:83:3: lv_elements_0_0= ruleRootElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getElementsRootElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRootElement_in_ruleModel130);
            	    lv_elements_0_0=ruleRootElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"RootElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:107:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:108:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:109:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName167);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName178); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:116:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:119:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:120:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:120:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:120:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName218); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:127:1: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:128:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_11_in_ruleQualifiedName237); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName252); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleRootElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:148:1: entryRuleRootElement returns [EObject current=null] : iv_ruleRootElement= ruleRootElement EOF ;
    public final EObject entryRuleRootElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRootElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:149:2: (iv_ruleRootElement= ruleRootElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:150:2: iv_ruleRootElement= ruleRootElement EOF
            {
             newCompositeNode(grammarAccess.getRootElementRule()); 
            pushFollow(FOLLOW_ruleRootElement_in_entryRuleRootElement299);
            iv_ruleRootElement=ruleRootElement();

            state._fsp--;

             current =iv_ruleRootElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRootElement309); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRootElement"


    // $ANTLR start "ruleRootElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:157:1: ruleRootElement returns [EObject current=null] : (this_ModuleElement_0= ruleModuleElement | this_TranslationElement_1= ruleTranslationElement | this_CodeElement_2= ruleCodeElement | this_LookupElement_3= ruleLookupElement | this_TemplateElement_4= ruleTemplateElement | this_FormElement_5= ruleFormElement ) ;
    public final EObject ruleRootElement() throws RecognitionException {
        EObject current = null;

        EObject this_ModuleElement_0 = null;

        EObject this_TranslationElement_1 = null;

        EObject this_CodeElement_2 = null;

        EObject this_LookupElement_3 = null;

        EObject this_TemplateElement_4 = null;

        EObject this_FormElement_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:160:28: ( (this_ModuleElement_0= ruleModuleElement | this_TranslationElement_1= ruleTranslationElement | this_CodeElement_2= ruleCodeElement | this_LookupElement_3= ruleLookupElement | this_TemplateElement_4= ruleTemplateElement | this_FormElement_5= ruleFormElement ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:161:1: (this_ModuleElement_0= ruleModuleElement | this_TranslationElement_1= ruleTranslationElement | this_CodeElement_2= ruleCodeElement | this_LookupElement_3= ruleLookupElement | this_TemplateElement_4= ruleTemplateElement | this_FormElement_5= ruleFormElement )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:161:1: (this_ModuleElement_0= ruleModuleElement | this_TranslationElement_1= ruleTranslationElement | this_CodeElement_2= ruleCodeElement | this_LookupElement_3= ruleLookupElement | this_TemplateElement_4= ruleTemplateElement | this_FormElement_5= ruleFormElement )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 18:
                {
                alt3=2;
                }
                break;
            case 24:
                {
                alt3=3;
                }
                break;
            case 29:
                {
                alt3=4;
                }
                break;
            case 30:
                {
                alt3=5;
                }
                break;
            case 33:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:162:5: this_ModuleElement_0= ruleModuleElement
                    {
                     
                            newCompositeNode(grammarAccess.getRootElementAccess().getModuleElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleModuleElement_in_ruleRootElement356);
                    this_ModuleElement_0=ruleModuleElement();

                    state._fsp--;

                     
                            current = this_ModuleElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:172:5: this_TranslationElement_1= ruleTranslationElement
                    {
                     
                            newCompositeNode(grammarAccess.getRootElementAccess().getTranslationElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTranslationElement_in_ruleRootElement383);
                    this_TranslationElement_1=ruleTranslationElement();

                    state._fsp--;

                     
                            current = this_TranslationElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:182:5: this_CodeElement_2= ruleCodeElement
                    {
                     
                            newCompositeNode(grammarAccess.getRootElementAccess().getCodeElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCodeElement_in_ruleRootElement410);
                    this_CodeElement_2=ruleCodeElement();

                    state._fsp--;

                     
                            current = this_CodeElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:192:5: this_LookupElement_3= ruleLookupElement
                    {
                     
                            newCompositeNode(grammarAccess.getRootElementAccess().getLookupElementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLookupElement_in_ruleRootElement437);
                    this_LookupElement_3=ruleLookupElement();

                    state._fsp--;

                     
                            current = this_LookupElement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:202:5: this_TemplateElement_4= ruleTemplateElement
                    {
                     
                            newCompositeNode(grammarAccess.getRootElementAccess().getTemplateElementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTemplateElement_in_ruleRootElement464);
                    this_TemplateElement_4=ruleTemplateElement();

                    state._fsp--;

                     
                            current = this_TemplateElement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:212:5: this_FormElement_5= ruleFormElement
                    {
                     
                            newCompositeNode(grammarAccess.getRootElementAccess().getFormElementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFormElement_in_ruleRootElement491);
                    this_FormElement_5=ruleFormElement();

                    state._fsp--;

                     
                            current = this_FormElement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRootElement"


    // $ANTLR start "entryRuleAbstractFieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:230:1: entryRuleAbstractFieldElement returns [EObject current=null] : iv_ruleAbstractFieldElement= ruleAbstractFieldElement EOF ;
    public final EObject entryRuleAbstractFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFieldElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:231:2: (iv_ruleAbstractFieldElement= ruleAbstractFieldElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:232:2: iv_ruleAbstractFieldElement= ruleAbstractFieldElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractFieldElementRule()); 
            pushFollow(FOLLOW_ruleAbstractFieldElement_in_entryRuleAbstractFieldElement528);
            iv_ruleAbstractFieldElement=ruleAbstractFieldElement();

            state._fsp--;

             current =iv_ruleAbstractFieldElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFieldElement538); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractFieldElement"


    // $ANTLR start "ruleAbstractFieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:239:1: ruleAbstractFieldElement returns [EObject current=null] : (this_AbstractValueFieldElement_0= ruleAbstractValueFieldElement | this_AbstractContainerFieldElement_1= ruleAbstractContainerFieldElement ) ;
    public final EObject ruleAbstractFieldElement() throws RecognitionException {
        EObject current = null;

        EObject this_AbstractValueFieldElement_0 = null;

        EObject this_AbstractContainerFieldElement_1 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:242:28: ( (this_AbstractValueFieldElement_0= ruleAbstractValueFieldElement | this_AbstractContainerFieldElement_1= ruleAbstractContainerFieldElement ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:243:1: (this_AbstractValueFieldElement_0= ruleAbstractValueFieldElement | this_AbstractContainerFieldElement_1= ruleAbstractContainerFieldElement )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:243:1: (this_AbstractValueFieldElement_0= ruleAbstractValueFieldElement | this_AbstractContainerFieldElement_1= ruleAbstractContainerFieldElement )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==37||(LA4_0>=39 && LA4_0<=42)||LA4_0==46) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:244:5: this_AbstractValueFieldElement_0= ruleAbstractValueFieldElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFieldElementAccess().getAbstractValueFieldElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleAbstractValueFieldElement_in_ruleAbstractFieldElement585);
                    this_AbstractValueFieldElement_0=ruleAbstractValueFieldElement();

                    state._fsp--;

                     
                            current = this_AbstractValueFieldElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:254:5: this_AbstractContainerFieldElement_1= ruleAbstractContainerFieldElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractFieldElementAccess().getAbstractContainerFieldElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAbstractContainerFieldElement_in_ruleAbstractFieldElement612);
                    this_AbstractContainerFieldElement_1=ruleAbstractContainerFieldElement();

                    state._fsp--;

                     
                            current = this_AbstractContainerFieldElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractFieldElement"


    // $ANTLR start "entryRuleAbstractFieldProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:270:1: entryRuleAbstractFieldProperties returns [EObject current=null] : iv_ruleAbstractFieldProperties= ruleAbstractFieldProperties EOF ;
    public final EObject entryRuleAbstractFieldProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractFieldProperties = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:271:2: (iv_ruleAbstractFieldProperties= ruleAbstractFieldProperties EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:272:2: iv_ruleAbstractFieldProperties= ruleAbstractFieldProperties EOF
            {
             newCompositeNode(grammarAccess.getAbstractFieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleAbstractFieldProperties_in_entryRuleAbstractFieldProperties647);
            iv_ruleAbstractFieldProperties=ruleAbstractFieldProperties();

            state._fsp--;

             current =iv_ruleAbstractFieldProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractFieldProperties657); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractFieldProperties"


    // $ANTLR start "ruleAbstractFieldProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:279:1: ruleAbstractFieldProperties returns [EObject current=null] : ( ( (lv_text_0_0= ruleTextAttribute ) ) | ( (lv_visible_1_0= ruleVisibleAttribue ) ) | ( (lv_master_2_0= ruleMasterAttribute ) ) | ( (lv_enabled_3_0= ruleEnabledAttribue ) ) ) ;
    public final EObject ruleAbstractFieldProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_0 = null;

        EObject lv_visible_1_0 = null;

        EObject lv_master_2_0 = null;

        EObject lv_enabled_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:282:28: ( ( ( (lv_text_0_0= ruleTextAttribute ) ) | ( (lv_visible_1_0= ruleVisibleAttribue ) ) | ( (lv_master_2_0= ruleMasterAttribute ) ) | ( (lv_enabled_3_0= ruleEnabledAttribue ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:283:1: ( ( (lv_text_0_0= ruleTextAttribute ) ) | ( (lv_visible_1_0= ruleVisibleAttribue ) ) | ( (lv_master_2_0= ruleMasterAttribute ) ) | ( (lv_enabled_3_0= ruleEnabledAttribue ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:283:1: ( ( (lv_text_0_0= ruleTextAttribute ) ) | ( (lv_visible_1_0= ruleVisibleAttribue ) ) | ( (lv_master_2_0= ruleMasterAttribute ) ) | ( (lv_enabled_3_0= ruleEnabledAttribue ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 12:
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
            case 13:
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
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:283:2: ( (lv_text_0_0= ruleTextAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:283:2: ( (lv_text_0_0= ruleTextAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:284:1: (lv_text_0_0= ruleTextAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:284:1: (lv_text_0_0= ruleTextAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:285:3: lv_text_0_0= ruleTextAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractFieldPropertiesAccess().getTextTextAttributeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTextAttribute_in_ruleAbstractFieldProperties703);
                    lv_text_0_0=ruleTextAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractFieldPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"text",
                            		lv_text_0_0, 
                            		"TextAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:302:6: ( (lv_visible_1_0= ruleVisibleAttribue ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:302:6: ( (lv_visible_1_0= ruleVisibleAttribue ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:303:1: (lv_visible_1_0= ruleVisibleAttribue )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:303:1: (lv_visible_1_0= ruleVisibleAttribue )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:304:3: lv_visible_1_0= ruleVisibleAttribue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractFieldPropertiesAccess().getVisibleVisibleAttribueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVisibleAttribue_in_ruleAbstractFieldProperties730);
                    lv_visible_1_0=ruleVisibleAttribue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractFieldPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"visible",
                            		lv_visible_1_0, 
                            		"VisibleAttribue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:321:6: ( (lv_master_2_0= ruleMasterAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:321:6: ( (lv_master_2_0= ruleMasterAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:322:1: (lv_master_2_0= ruleMasterAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:322:1: (lv_master_2_0= ruleMasterAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:323:3: lv_master_2_0= ruleMasterAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractFieldPropertiesAccess().getMasterMasterAttributeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMasterAttribute_in_ruleAbstractFieldProperties757);
                    lv_master_2_0=ruleMasterAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractFieldPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"master",
                            		lv_master_2_0, 
                            		"MasterAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:340:6: ( (lv_enabled_3_0= ruleEnabledAttribue ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:340:6: ( (lv_enabled_3_0= ruleEnabledAttribue ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:341:1: (lv_enabled_3_0= ruleEnabledAttribue )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:341:1: (lv_enabled_3_0= ruleEnabledAttribue )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:342:3: lv_enabled_3_0= ruleEnabledAttribue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractFieldPropertiesAccess().getEnabledEnabledAttribueParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEnabledAttribue_in_ruleAbstractFieldProperties784);
                    lv_enabled_3_0=ruleEnabledAttribue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractFieldPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"enabled",
                            		lv_enabled_3_0, 
                            		"EnabledAttribue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractFieldProperties"


    // $ANTLR start "entryRuleTextAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:366:1: entryRuleTextAttribute returns [EObject current=null] : iv_ruleTextAttribute= ruleTextAttribute EOF ;
    public final EObject entryRuleTextAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:367:2: (iv_ruleTextAttribute= ruleTextAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:368:2: iv_ruleTextAttribute= ruleTextAttribute EOF
            {
             newCompositeNode(grammarAccess.getTextAttributeRule()); 
            pushFollow(FOLLOW_ruleTextAttribute_in_entryRuleTextAttribute820);
            iv_ruleTextAttribute=ruleTextAttribute();

            state._fsp--;

             current =iv_ruleTextAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextAttribute830); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextAttribute"


    // $ANTLR start "ruleTextAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:375:1: ruleTextAttribute returns [EObject current=null] : (otherlv_0= 'text=' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTextAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:378:28: ( (otherlv_0= 'text=' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:379:1: (otherlv_0= 'text=' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:379:1: (otherlv_0= 'text=' ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:379:3: otherlv_0= 'text=' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTextAttribute867); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAttributeAccess().getTextKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:383:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:384:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:384:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:385:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTextAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextAttribute887); 

            		newLeafNode(otherlv_1, grammarAccess.getTextAttributeAccess().getValueTranslationElementCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextAttribute"


    // $ANTLR start "entryRuleEnabledAttribue"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:404:1: entryRuleEnabledAttribue returns [EObject current=null] : iv_ruleEnabledAttribue= ruleEnabledAttribue EOF ;
    public final EObject entryRuleEnabledAttribue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnabledAttribue = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:405:2: (iv_ruleEnabledAttribue= ruleEnabledAttribue EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:406:2: iv_ruleEnabledAttribue= ruleEnabledAttribue EOF
            {
             newCompositeNode(grammarAccess.getEnabledAttribueRule()); 
            pushFollow(FOLLOW_ruleEnabledAttribue_in_entryRuleEnabledAttribue923);
            iv_ruleEnabledAttribue=ruleEnabledAttribue();

            state._fsp--;

             current =iv_ruleEnabledAttribue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnabledAttribue933); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnabledAttribue"


    // $ANTLR start "ruleEnabledAttribue"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:413:1: ruleEnabledAttribue returns [EObject current=null] : (otherlv_0= 'enabled=' ( (lv_value_1_0= ruleBooleanType ) ) ) ;
    public final EObject ruleEnabledAttribue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:416:28: ( (otherlv_0= 'enabled=' ( (lv_value_1_0= ruleBooleanType ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:417:1: (otherlv_0= 'enabled=' ( (lv_value_1_0= ruleBooleanType ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:417:1: (otherlv_0= 'enabled=' ( (lv_value_1_0= ruleBooleanType ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:417:3: otherlv_0= 'enabled=' ( (lv_value_1_0= ruleBooleanType ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleEnabledAttribue970); 

                	newLeafNode(otherlv_0, grammarAccess.getEnabledAttribueAccess().getEnabledKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:421:1: ( (lv_value_1_0= ruleBooleanType ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:422:1: (lv_value_1_0= ruleBooleanType )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:422:1: (lv_value_1_0= ruleBooleanType )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:423:3: lv_value_1_0= ruleBooleanType
            {
             
            	        newCompositeNode(grammarAccess.getEnabledAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanType_in_ruleEnabledAttribue991);
            lv_value_1_0=ruleBooleanType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEnabledAttribueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"BooleanType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnabledAttribue"


    // $ANTLR start "entryRuleVisibleAttribue"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:447:1: entryRuleVisibleAttribue returns [EObject current=null] : iv_ruleVisibleAttribue= ruleVisibleAttribue EOF ;
    public final EObject entryRuleVisibleAttribue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisibleAttribue = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:448:2: (iv_ruleVisibleAttribue= ruleVisibleAttribue EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:449:2: iv_ruleVisibleAttribue= ruleVisibleAttribue EOF
            {
             newCompositeNode(grammarAccess.getVisibleAttribueRule()); 
            pushFollow(FOLLOW_ruleVisibleAttribue_in_entryRuleVisibleAttribue1027);
            iv_ruleVisibleAttribue=ruleVisibleAttribue();

            state._fsp--;

             current =iv_ruleVisibleAttribue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibleAttribue1037); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisibleAttribue"


    // $ANTLR start "ruleVisibleAttribue"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:456:1: ruleVisibleAttribue returns [EObject current=null] : (otherlv_0= 'visible=' ( (lv_value_1_0= ruleBooleanType ) ) ) ;
    public final EObject ruleVisibleAttribue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:459:28: ( (otherlv_0= 'visible=' ( (lv_value_1_0= ruleBooleanType ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:460:1: (otherlv_0= 'visible=' ( (lv_value_1_0= ruleBooleanType ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:460:1: (otherlv_0= 'visible=' ( (lv_value_1_0= ruleBooleanType ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:460:3: otherlv_0= 'visible=' ( (lv_value_1_0= ruleBooleanType ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleVisibleAttribue1074); 

                	newLeafNode(otherlv_0, grammarAccess.getVisibleAttribueAccess().getVisibleKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:464:1: ( (lv_value_1_0= ruleBooleanType ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:465:1: (lv_value_1_0= ruleBooleanType )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:465:1: (lv_value_1_0= ruleBooleanType )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:466:3: lv_value_1_0= ruleBooleanType
            {
             
            	        newCompositeNode(grammarAccess.getVisibleAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanType_in_ruleVisibleAttribue1095);
            lv_value_1_0=ruleBooleanType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisibleAttribueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"BooleanType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisibleAttribue"


    // $ANTLR start "entryRuleMasterAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:490:1: entryRuleMasterAttribute returns [EObject current=null] : iv_ruleMasterAttribute= ruleMasterAttribute EOF ;
    public final EObject entryRuleMasterAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMasterAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:491:2: (iv_ruleMasterAttribute= ruleMasterAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:492:2: iv_ruleMasterAttribute= ruleMasterAttribute EOF
            {
             newCompositeNode(grammarAccess.getMasterAttributeRule()); 
            pushFollow(FOLLOW_ruleMasterAttribute_in_entryRuleMasterAttribute1131);
            iv_ruleMasterAttribute=ruleMasterAttribute();

            state._fsp--;

             current =iv_ruleMasterAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMasterAttribute1141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMasterAttribute"


    // $ANTLR start "ruleMasterAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:499:1: ruleMasterAttribute returns [EObject current=null] : (otherlv_0= 'master=' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMasterAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:502:28: ( (otherlv_0= 'master=' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:503:1: (otherlv_0= 'master=' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:503:1: (otherlv_0= 'master=' ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:503:3: otherlv_0= 'master=' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleMasterAttribute1178); 

                	newLeafNode(otherlv_0, grammarAccess.getMasterAttributeAccess().getMasterKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:507:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:508:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:508:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:509:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMasterAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMasterAttribute1198); 

            		newLeafNode(otherlv_1, grammarAccess.getMasterAttributeAccess().getValueAbstractValueFieldElementCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMasterAttribute"


    // $ANTLR start "entryRuleAbstractValueFieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:528:1: entryRuleAbstractValueFieldElement returns [EObject current=null] : iv_ruleAbstractValueFieldElement= ruleAbstractValueFieldElement EOF ;
    public final EObject entryRuleAbstractValueFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValueFieldElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:529:2: (iv_ruleAbstractValueFieldElement= ruleAbstractValueFieldElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:530:2: iv_ruleAbstractValueFieldElement= ruleAbstractValueFieldElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractValueFieldElementRule()); 
            pushFollow(FOLLOW_ruleAbstractValueFieldElement_in_entryRuleAbstractValueFieldElement1234);
            iv_ruleAbstractValueFieldElement=ruleAbstractValueFieldElement();

            state._fsp--;

             current =iv_ruleAbstractValueFieldElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractValueFieldElement1244); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractValueFieldElement"


    // $ANTLR start "ruleAbstractValueFieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:537:1: ruleAbstractValueFieldElement returns [EObject current=null] : (this_StringElement_0= ruleStringElement | this_SmartfieldElement_1= ruleSmartfieldElement | this_LongElement_2= ruleLongElement | this_DoubleElement_3= ruleDoubleElement | this_DateElement_4= ruleDateElement | this_ZregBoxElement_5= ruleZregBoxElement ) ;
    public final EObject ruleAbstractValueFieldElement() throws RecognitionException {
        EObject current = null;

        EObject this_StringElement_0 = null;

        EObject this_SmartfieldElement_1 = null;

        EObject this_LongElement_2 = null;

        EObject this_DoubleElement_3 = null;

        EObject this_DateElement_4 = null;

        EObject this_ZregBoxElement_5 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:540:28: ( (this_StringElement_0= ruleStringElement | this_SmartfieldElement_1= ruleSmartfieldElement | this_LongElement_2= ruleLongElement | this_DoubleElement_3= ruleDoubleElement | this_DateElement_4= ruleDateElement | this_ZregBoxElement_5= ruleZregBoxElement ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:541:1: (this_StringElement_0= ruleStringElement | this_SmartfieldElement_1= ruleSmartfieldElement | this_LongElement_2= ruleLongElement | this_DoubleElement_3= ruleDoubleElement | this_DateElement_4= ruleDateElement | this_ZregBoxElement_5= ruleZregBoxElement )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:541:1: (this_StringElement_0= ruleStringElement | this_SmartfieldElement_1= ruleSmartfieldElement | this_LongElement_2= ruleLongElement | this_DoubleElement_3= ruleDoubleElement | this_DateElement_4= ruleDateElement | this_ZregBoxElement_5= ruleZregBoxElement )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case 40:
                {
                alt6=3;
                }
                break;
            case 39:
                {
                alt6=4;
                }
                break;
            case 41:
                {
                alt6=5;
                }
                break;
            case 46:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:542:5: this_StringElement_0= ruleStringElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractValueFieldElementAccess().getStringElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStringElement_in_ruleAbstractValueFieldElement1291);
                    this_StringElement_0=ruleStringElement();

                    state._fsp--;

                     
                            current = this_StringElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:552:5: this_SmartfieldElement_1= ruleSmartfieldElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractValueFieldElementAccess().getSmartfieldElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleSmartfieldElement_in_ruleAbstractValueFieldElement1318);
                    this_SmartfieldElement_1=ruleSmartfieldElement();

                    state._fsp--;

                     
                            current = this_SmartfieldElement_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:562:5: this_LongElement_2= ruleLongElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractValueFieldElementAccess().getLongElementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLongElement_in_ruleAbstractValueFieldElement1345);
                    this_LongElement_2=ruleLongElement();

                    state._fsp--;

                     
                            current = this_LongElement_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:572:5: this_DoubleElement_3= ruleDoubleElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractValueFieldElementAccess().getDoubleElementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleDoubleElement_in_ruleAbstractValueFieldElement1372);
                    this_DoubleElement_3=ruleDoubleElement();

                    state._fsp--;

                     
                            current = this_DoubleElement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:582:5: this_DateElement_4= ruleDateElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractValueFieldElementAccess().getDateElementParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDateElement_in_ruleAbstractValueFieldElement1399);
                    this_DateElement_4=ruleDateElement();

                    state._fsp--;

                     
                            current = this_DateElement_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:592:5: this_ZregBoxElement_5= ruleZregBoxElement
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractValueFieldElementAccess().getZregBoxElementParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleZregBoxElement_in_ruleAbstractValueFieldElement1426);
                    this_ZregBoxElement_5=ruleZregBoxElement();

                    state._fsp--;

                     
                            current = this_ZregBoxElement_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractValueFieldElement"


    // $ANTLR start "entryRuleAbstractValueFieldProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:608:1: entryRuleAbstractValueFieldProperties returns [EObject current=null] : iv_ruleAbstractValueFieldProperties= ruleAbstractValueFieldProperties EOF ;
    public final EObject entryRuleAbstractValueFieldProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractValueFieldProperties = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:609:2: (iv_ruleAbstractValueFieldProperties= ruleAbstractValueFieldProperties EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:610:2: iv_ruleAbstractValueFieldProperties= ruleAbstractValueFieldProperties EOF
            {
             newCompositeNode(grammarAccess.getAbstractValueFieldPropertiesRule()); 
            pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_entryRuleAbstractValueFieldProperties1461);
            iv_ruleAbstractValueFieldProperties=ruleAbstractValueFieldProperties();

            state._fsp--;

             current =iv_ruleAbstractValueFieldProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractValueFieldProperties1471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractValueFieldProperties"


    // $ANTLR start "ruleAbstractValueFieldProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:617:1: ruleAbstractValueFieldProperties returns [EObject current=null] : ( ( (lv_fieldproperties_0_0= ruleAbstractFieldProperties ) ) | ( (lv_mandatory_1_0= ruleMandatoryAttribue ) ) ) ;
    public final EObject ruleAbstractValueFieldProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_fieldproperties_0_0 = null;

        EObject lv_mandatory_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:620:28: ( ( ( (lv_fieldproperties_0_0= ruleAbstractFieldProperties ) ) | ( (lv_mandatory_1_0= ruleMandatoryAttribue ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:621:1: ( ( (lv_fieldproperties_0_0= ruleAbstractFieldProperties ) ) | ( (lv_mandatory_1_0= ruleMandatoryAttribue ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:621:1: ( ( (lv_fieldproperties_0_0= ruleAbstractFieldProperties ) ) | ( (lv_mandatory_1_0= ruleMandatoryAttribue ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=12 && LA7_0<=15)) ) {
                alt7=1;
            }
            else if ( (LA7_0==16) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:621:2: ( (lv_fieldproperties_0_0= ruleAbstractFieldProperties ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:621:2: ( (lv_fieldproperties_0_0= ruleAbstractFieldProperties ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:622:1: (lv_fieldproperties_0_0= ruleAbstractFieldProperties )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:622:1: (lv_fieldproperties_0_0= ruleAbstractFieldProperties )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:623:3: lv_fieldproperties_0_0= ruleAbstractFieldProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractValueFieldPropertiesAccess().getFieldpropertiesAbstractFieldPropertiesParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractFieldProperties_in_ruleAbstractValueFieldProperties1517);
                    lv_fieldproperties_0_0=ruleAbstractFieldProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractValueFieldPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"fieldproperties",
                            		lv_fieldproperties_0_0, 
                            		"AbstractFieldProperties");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:640:6: ( (lv_mandatory_1_0= ruleMandatoryAttribue ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:640:6: ( (lv_mandatory_1_0= ruleMandatoryAttribue ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:641:1: (lv_mandatory_1_0= ruleMandatoryAttribue )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:641:1: (lv_mandatory_1_0= ruleMandatoryAttribue )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:642:3: lv_mandatory_1_0= ruleMandatoryAttribue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAbstractValueFieldPropertiesAccess().getMandatoryMandatoryAttribueParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMandatoryAttribue_in_ruleAbstractValueFieldProperties1544);
                    lv_mandatory_1_0=ruleMandatoryAttribue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAbstractValueFieldPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"mandatory",
                            		lv_mandatory_1_0, 
                            		"MandatoryAttribue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractValueFieldProperties"


    // $ANTLR start "entryRuleMandatoryAttribue"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:666:1: entryRuleMandatoryAttribue returns [EObject current=null] : iv_ruleMandatoryAttribue= ruleMandatoryAttribue EOF ;
    public final EObject entryRuleMandatoryAttribue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryAttribue = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:667:2: (iv_ruleMandatoryAttribue= ruleMandatoryAttribue EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:668:2: iv_ruleMandatoryAttribue= ruleMandatoryAttribue EOF
            {
             newCompositeNode(grammarAccess.getMandatoryAttribueRule()); 
            pushFollow(FOLLOW_ruleMandatoryAttribue_in_entryRuleMandatoryAttribue1580);
            iv_ruleMandatoryAttribue=ruleMandatoryAttribue();

            state._fsp--;

             current =iv_ruleMandatoryAttribue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryAttribue1590); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatoryAttribue"


    // $ANTLR start "ruleMandatoryAttribue"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:675:1: ruleMandatoryAttribue returns [EObject current=null] : (otherlv_0= 'mandatory=' ( (lv_value_1_0= ruleBooleanType ) ) ) ;
    public final EObject ruleMandatoryAttribue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:678:28: ( (otherlv_0= 'mandatory=' ( (lv_value_1_0= ruleBooleanType ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:679:1: (otherlv_0= 'mandatory=' ( (lv_value_1_0= ruleBooleanType ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:679:1: (otherlv_0= 'mandatory=' ( (lv_value_1_0= ruleBooleanType ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:679:3: otherlv_0= 'mandatory=' ( (lv_value_1_0= ruleBooleanType ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleMandatoryAttribue1627); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryAttribueAccess().getMandatoryKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:683:1: ( (lv_value_1_0= ruleBooleanType ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:684:1: (lv_value_1_0= ruleBooleanType )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:684:1: (lv_value_1_0= ruleBooleanType )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:685:3: lv_value_1_0= ruleBooleanType
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAttribueAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanType_in_ruleMandatoryAttribue1648);
            lv_value_1_0=ruleBooleanType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryAttribueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"BooleanType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatoryAttribue"


    // $ANTLR start "entryRuleAbstractContainerFieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:709:1: entryRuleAbstractContainerFieldElement returns [EObject current=null] : iv_ruleAbstractContainerFieldElement= ruleAbstractContainerFieldElement EOF ;
    public final EObject entryRuleAbstractContainerFieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractContainerFieldElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:710:2: (iv_ruleAbstractContainerFieldElement= ruleAbstractContainerFieldElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:711:2: iv_ruleAbstractContainerFieldElement= ruleAbstractContainerFieldElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractContainerFieldElementRule()); 
            pushFollow(FOLLOW_ruleAbstractContainerFieldElement_in_entryRuleAbstractContainerFieldElement1684);
            iv_ruleAbstractContainerFieldElement=ruleAbstractContainerFieldElement();

            state._fsp--;

             current =iv_ruleAbstractContainerFieldElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractContainerFieldElement1694); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractContainerFieldElement"


    // $ANTLR start "ruleAbstractContainerFieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:718:1: ruleAbstractContainerFieldElement returns [EObject current=null] : this_SequenceBoxElement_0= ruleSequenceBoxElement ;
    public final EObject ruleAbstractContainerFieldElement() throws RecognitionException {
        EObject current = null;

        EObject this_SequenceBoxElement_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:721:28: (this_SequenceBoxElement_0= ruleSequenceBoxElement )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:723:5: this_SequenceBoxElement_0= ruleSequenceBoxElement
            {
             
                    newCompositeNode(grammarAccess.getAbstractContainerFieldElementAccess().getSequenceBoxElementParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleSequenceBoxElement_in_ruleAbstractContainerFieldElement1740);
            this_SequenceBoxElement_0=ruleSequenceBoxElement();

            state._fsp--;

             
                    current = this_SequenceBoxElement_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractContainerFieldElement"


    // $ANTLR start "entryRuleModuleElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:739:1: entryRuleModuleElement returns [EObject current=null] : iv_ruleModuleElement= ruleModuleElement EOF ;
    public final EObject entryRuleModuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:740:2: (iv_ruleModuleElement= ruleModuleElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:741:2: iv_ruleModuleElement= ruleModuleElement EOF
            {
             newCompositeNode(grammarAccess.getModuleElementRule()); 
            pushFollow(FOLLOW_ruleModuleElement_in_entryRuleModuleElement1774);
            iv_ruleModuleElement=ruleModuleElement();

            state._fsp--;

             current =iv_ruleModuleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModuleElement1784); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleElement"


    // $ANTLR start "ruleModuleElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:748:1: ruleModuleElement returns [EObject current=null] : (otherlv_0= 'module ' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleModuleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:751:28: ( (otherlv_0= 'module ' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:752:1: (otherlv_0= 'module ' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:752:1: (otherlv_0= 'module ' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:752:3: otherlv_0= 'module ' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleModuleElement1821); 

                	newLeafNode(otherlv_0, grammarAccess.getModuleElementAccess().getModuleKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:756:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:757:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:757:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:758:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getModuleElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleModuleElement1842);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModuleElementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleElement"


    // $ANTLR start "entryRuleTranslationElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:782:1: entryRuleTranslationElement returns [EObject current=null] : iv_ruleTranslationElement= ruleTranslationElement EOF ;
    public final EObject entryRuleTranslationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranslationElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:783:2: (iv_ruleTranslationElement= ruleTranslationElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:784:2: iv_ruleTranslationElement= ruleTranslationElement EOF
            {
             newCompositeNode(grammarAccess.getTranslationElementRule()); 
            pushFollow(FOLLOW_ruleTranslationElement_in_entryRuleTranslationElement1878);
            iv_ruleTranslationElement=ruleTranslationElement();

            state._fsp--;

             current =iv_ruleTranslationElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTranslationElement1888); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTranslationElement"


    // $ANTLR start "ruleTranslationElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:791:1: ruleTranslationElement returns [EObject current=null] : (otherlv_0= 'translation ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_translations_2_0= ruleTranslationAttribute ) )+ ) ;
    public final EObject ruleTranslationElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_translations_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:794:28: ( (otherlv_0= 'translation ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_translations_2_0= ruleTranslationAttribute ) )+ ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:795:1: (otherlv_0= 'translation ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_translations_2_0= ruleTranslationAttribute ) )+ )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:795:1: (otherlv_0= 'translation ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_translations_2_0= ruleTranslationAttribute ) )+ )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:795:3: otherlv_0= 'translation ' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_translations_2_0= ruleTranslationAttribute ) )+
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTranslationElement1925); 

                	newLeafNode(otherlv_0, grammarAccess.getTranslationElementAccess().getTranslationKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:799:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:800:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:800:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:801:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getTranslationElementAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTranslationElement1946);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTranslationElementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:817:2: ( (lv_translations_2_0= ruleTranslationAttribute ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:818:1: (lv_translations_2_0= ruleTranslationAttribute )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:818:1: (lv_translations_2_0= ruleTranslationAttribute )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:819:3: lv_translations_2_0= ruleTranslationAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTranslationElementAccess().getTranslationsTranslationAttributeParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTranslationAttribute_in_ruleTranslationElement1967);
            	    lv_translations_2_0=ruleTranslationAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTranslationElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"translations",
            	            		lv_translations_2_0, 
            	            		"TranslationAttribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTranslationElement"


    // $ANTLR start "entryRuleTranslationAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:843:1: entryRuleTranslationAttribute returns [EObject current=null] : iv_ruleTranslationAttribute= ruleTranslationAttribute EOF ;
    public final EObject entryRuleTranslationAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTranslationAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:844:2: (iv_ruleTranslationAttribute= ruleTranslationAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:845:2: iv_ruleTranslationAttribute= ruleTranslationAttribute EOF
            {
             newCompositeNode(grammarAccess.getTranslationAttributeRule()); 
            pushFollow(FOLLOW_ruleTranslationAttribute_in_entryRuleTranslationAttribute2004);
            iv_ruleTranslationAttribute=ruleTranslationAttribute();

            state._fsp--;

             current =iv_ruleTranslationAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTranslationAttribute2014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTranslationAttribute"


    // $ANTLR start "ruleTranslationAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:852:1: ruleTranslationAttribute returns [EObject current=null] : ( ( (lv_lang_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleTranslationAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_lang_0_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:855:28: ( ( ( (lv_lang_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:856:1: ( ( (lv_lang_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:856:1: ( ( (lv_lang_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:856:2: ( (lv_lang_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_text_2_0= RULE_STRING ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:856:2: ( (lv_lang_0_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:857:1: (lv_lang_0_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:857:1: (lv_lang_0_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:858:3: lv_lang_0_0= RULE_ID
            {
            lv_lang_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTranslationAttribute2056); 

            			newLeafNode(lv_lang_0_0, grammarAccess.getTranslationAttributeAccess().getLangIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTranslationAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lang",
                    		lv_lang_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTranslationAttribute2073); 

                	newLeafNode(otherlv_1, grammarAccess.getTranslationAttributeAccess().getEqualsSignKeyword_1());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:878:1: ( (lv_text_2_0= RULE_STRING ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:879:1: (lv_text_2_0= RULE_STRING )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:879:1: (lv_text_2_0= RULE_STRING )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:880:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTranslationAttribute2090); 

            			newLeafNode(lv_text_2_0, grammarAccess.getTranslationAttributeAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTranslationAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTranslationAttribute"


    // $ANTLR start "entryRuleJavaElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:904:1: entryRuleJavaElement returns [EObject current=null] : iv_ruleJavaElement= ruleJavaElement EOF ;
    public final EObject entryRuleJavaElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:905:2: (iv_ruleJavaElement= ruleJavaElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:906:2: iv_ruleJavaElement= ruleJavaElement EOF
            {
             newCompositeNode(grammarAccess.getJavaElementRule()); 
            pushFollow(FOLLOW_ruleJavaElement_in_entryRuleJavaElement2131);
            iv_ruleJavaElement=ruleJavaElement();

            state._fsp--;

             current =iv_ruleJavaElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJavaElement2141); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaElement"


    // $ANTLR start "ruleJavaElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:913:1: ruleJavaElement returns [EObject current=null] : (otherlv_0= 'java ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_runat_2_0= ruleRunAtAttribute ) ) otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleJavaElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        EObject lv_runat_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:916:28: ( (otherlv_0= 'java ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_runat_2_0= ruleRunAtAttribute ) ) otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:917:1: (otherlv_0= 'java ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_runat_2_0= ruleRunAtAttribute ) ) otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:917:1: (otherlv_0= 'java ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_runat_2_0= ruleRunAtAttribute ) ) otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:917:3: otherlv_0= 'java ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_runat_2_0= ruleRunAtAttribute ) ) otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleJavaElement2178); 

                	newLeafNode(otherlv_0, grammarAccess.getJavaElementAccess().getJavaKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:921:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:922:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:922:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:923:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJavaElement2195); 

            			newLeafNode(lv_name_1_0, grammarAccess.getJavaElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJavaElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:939:2: ( (lv_runat_2_0= ruleRunAtAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:940:1: (lv_runat_2_0= ruleRunAtAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:940:1: (lv_runat_2_0= ruleRunAtAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:941:3: lv_runat_2_0= ruleRunAtAttribute
            {
             
            	        newCompositeNode(grammarAccess.getJavaElementAccess().getRunatRunAtAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRunAtAttribute_in_ruleJavaElement2221);
            lv_runat_2_0=ruleRunAtAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJavaElementRule());
            	        }
                   		set(
                   			current, 
                   			"runat",
                    		lv_runat_2_0, 
                    		"RunAtAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleJavaElement2233); 

                	newLeafNode(otherlv_3, grammarAccess.getJavaElementAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:961:1: ( (lv_source_4_0= RULE_STRING ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:962:1: (lv_source_4_0= RULE_STRING )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:962:1: (lv_source_4_0= RULE_STRING )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:963:3: lv_source_4_0= RULE_STRING
            {
            lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleJavaElement2250); 

            			newLeafNode(lv_source_4_0, grammarAccess.getJavaElementAccess().getSourceSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJavaElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"source",
                    		lv_source_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleJavaElement2267); 

                	newLeafNode(otherlv_5, grammarAccess.getJavaElementAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaElement"


    // $ANTLR start "entryRuleRunAtAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:991:1: entryRuleRunAtAttribute returns [EObject current=null] : iv_ruleRunAtAttribute= ruleRunAtAttribute EOF ;
    public final EObject entryRuleRunAtAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunAtAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:992:2: (iv_ruleRunAtAttribute= ruleRunAtAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:993:2: iv_ruleRunAtAttribute= ruleRunAtAttribute EOF
            {
             newCompositeNode(grammarAccess.getRunAtAttributeRule()); 
            pushFollow(FOLLOW_ruleRunAtAttribute_in_entryRuleRunAtAttribute2303);
            iv_ruleRunAtAttribute=ruleRunAtAttribute();

            state._fsp--;

             current =iv_ruleRunAtAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRunAtAttribute2313); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunAtAttribute"


    // $ANTLR start "ruleRunAtAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1000:1: ruleRunAtAttribute returns [EObject current=null] : (otherlv_0= 'runat=' ( (lv_value_1_0= ruleJavaRunAtAttributeList ) ) ) ;
    public final EObject ruleRunAtAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1003:28: ( (otherlv_0= 'runat=' ( (lv_value_1_0= ruleJavaRunAtAttributeList ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1004:1: (otherlv_0= 'runat=' ( (lv_value_1_0= ruleJavaRunAtAttributeList ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1004:1: (otherlv_0= 'runat=' ( (lv_value_1_0= ruleJavaRunAtAttributeList ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1004:3: otherlv_0= 'runat=' ( (lv_value_1_0= ruleJavaRunAtAttributeList ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleRunAtAttribute2350); 

                	newLeafNode(otherlv_0, grammarAccess.getRunAtAttributeAccess().getRunatKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1008:1: ( (lv_value_1_0= ruleJavaRunAtAttributeList ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1009:1: (lv_value_1_0= ruleJavaRunAtAttributeList )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1009:1: (lv_value_1_0= ruleJavaRunAtAttributeList )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1010:3: lv_value_1_0= ruleJavaRunAtAttributeList
            {
             
            	        newCompositeNode(grammarAccess.getRunAtAttributeAccess().getValueJavaRunAtAttributeListEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleJavaRunAtAttributeList_in_ruleRunAtAttribute2371);
            lv_value_1_0=ruleJavaRunAtAttributeList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRunAtAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"JavaRunAtAttributeList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunAtAttribute"


    // $ANTLR start "entryRuleCodeElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1034:1: entryRuleCodeElement returns [EObject current=null] : iv_ruleCodeElement= ruleCodeElement EOF ;
    public final EObject entryRuleCodeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1035:2: (iv_ruleCodeElement= ruleCodeElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1036:2: iv_ruleCodeElement= ruleCodeElement EOF
            {
             newCompositeNode(grammarAccess.getCodeElementRule()); 
            pushFollow(FOLLOW_ruleCodeElement_in_entryRuleCodeElement2407);
            iv_ruleCodeElement=ruleCodeElement();

            state._fsp--;

             current =iv_ruleCodeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeElement2417); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeElement"


    // $ANTLR start "ruleCodeElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1043:1: ruleCodeElement returns [EObject current=null] : (otherlv_0= 'code ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= ruleCodeIdAttribute ) ) ) ;
    public final EObject ruleCodeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_id_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1046:28: ( (otherlv_0= 'code ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= ruleCodeIdAttribute ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1047:1: (otherlv_0= 'code ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= ruleCodeIdAttribute ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1047:1: (otherlv_0= 'code ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= ruleCodeIdAttribute ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1047:3: otherlv_0= 'code ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_id_2_0= ruleCodeIdAttribute ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleCodeElement2454); 

                	newLeafNode(otherlv_0, grammarAccess.getCodeElementAccess().getCodeKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1051:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1052:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1052:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1053:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCodeElement2471); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCodeElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCodeElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1069:2: ( (lv_id_2_0= ruleCodeIdAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1070:1: (lv_id_2_0= ruleCodeIdAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1070:1: (lv_id_2_0= ruleCodeIdAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1071:3: lv_id_2_0= ruleCodeIdAttribute
            {
             
            	        newCompositeNode(grammarAccess.getCodeElementAccess().getIdCodeIdAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleCodeIdAttribute_in_ruleCodeElement2497);
            lv_id_2_0=ruleCodeIdAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCodeElementRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"CodeIdAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeElement"


    // $ANTLR start "entryRuleCodeIdAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1095:1: entryRuleCodeIdAttribute returns [EObject current=null] : iv_ruleCodeIdAttribute= ruleCodeIdAttribute EOF ;
    public final EObject entryRuleCodeIdAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCodeIdAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1096:2: (iv_ruleCodeIdAttribute= ruleCodeIdAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1097:2: iv_ruleCodeIdAttribute= ruleCodeIdAttribute EOF
            {
             newCompositeNode(grammarAccess.getCodeIdAttributeRule()); 
            pushFollow(FOLLOW_ruleCodeIdAttribute_in_entryRuleCodeIdAttribute2533);
            iv_ruleCodeIdAttribute=ruleCodeIdAttribute();

            state._fsp--;

             current =iv_ruleCodeIdAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCodeIdAttribute2543); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCodeIdAttribute"


    // $ANTLR start "ruleCodeIdAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1104:1: ruleCodeIdAttribute returns [EObject current=null] : (otherlv_0= 'id=' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCodeIdAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1107:28: ( (otherlv_0= 'id=' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1108:1: (otherlv_0= 'id=' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1108:1: (otherlv_0= 'id=' ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1108:3: otherlv_0= 'id=' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleCodeIdAttribute2580); 

                	newLeafNode(otherlv_0, grammarAccess.getCodeIdAttributeAccess().getIdKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1112:1: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1113:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1113:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1114:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCodeIdAttribute2597); 

            			newLeafNode(lv_value_1_0, grammarAccess.getCodeIdAttributeAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCodeIdAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCodeIdAttribute"


    // $ANTLR start "entryRuleLogicElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1138:1: entryRuleLogicElement returns [EObject current=null] : iv_ruleLogicElement= ruleLogicElement EOF ;
    public final EObject entryRuleLogicElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1139:2: (iv_ruleLogicElement= ruleLogicElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1140:2: iv_ruleLogicElement= ruleLogicElement EOF
            {
             newCompositeNode(grammarAccess.getLogicElementRule()); 
            pushFollow(FOLLOW_ruleLogicElement_in_entryRuleLogicElement2638);
            iv_ruleLogicElement=ruleLogicElement();

            state._fsp--;

             current =iv_ruleLogicElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicElement2648); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicElement"


    // $ANTLR start "ruleLogicElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1147:1: ruleLogicElement returns [EObject current=null] : (otherlv_0= 'logic ' ( (lv_type_1_0= ruleLogicTypeAttribute ) ) ( (lv_properties_2_0= ruleLogicOptionalProperties ) )* (otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleLogicElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_source_4_0=null;
        Token otherlv_5=null;
        EObject lv_type_1_0 = null;

        EObject lv_properties_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1150:28: ( (otherlv_0= 'logic ' ( (lv_type_1_0= ruleLogicTypeAttribute ) ) ( (lv_properties_2_0= ruleLogicOptionalProperties ) )* (otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1151:1: (otherlv_0= 'logic ' ( (lv_type_1_0= ruleLogicTypeAttribute ) ) ( (lv_properties_2_0= ruleLogicOptionalProperties ) )* (otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1151:1: (otherlv_0= 'logic ' ( (lv_type_1_0= ruleLogicTypeAttribute ) ) ( (lv_properties_2_0= ruleLogicOptionalProperties ) )* (otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1151:3: otherlv_0= 'logic ' ( (lv_type_1_0= ruleLogicTypeAttribute ) ) ( (lv_properties_2_0= ruleLogicOptionalProperties ) )* (otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleLogicElement2685); 

                	newLeafNode(otherlv_0, grammarAccess.getLogicElementAccess().getLogicKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1155:1: ( (lv_type_1_0= ruleLogicTypeAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1156:1: (lv_type_1_0= ruleLogicTypeAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1156:1: (lv_type_1_0= ruleLogicTypeAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1157:3: lv_type_1_0= ruleLogicTypeAttribute
            {
             
            	        newCompositeNode(grammarAccess.getLogicElementAccess().getTypeLogicTypeAttributeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicTypeAttribute_in_ruleLogicElement2706);
            lv_type_1_0=ruleLogicTypeAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicElementRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"LogicTypeAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1173:2: ( (lv_properties_2_0= ruleLogicOptionalProperties ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1174:1: (lv_properties_2_0= ruleLogicOptionalProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1174:1: (lv_properties_2_0= ruleLogicOptionalProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1175:3: lv_properties_2_0= ruleLogicOptionalProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLogicElementAccess().getPropertiesLogicOptionalPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLogicOptionalProperties_in_ruleLogicElement2727);
            	    lv_properties_2_0=ruleLogicOptionalProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLogicElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"LogicOptionalProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1191:3: (otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1191:5: otherlv_3= '{' ( (lv_source_4_0= RULE_STRING ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleLogicElement2741); 

                        	newLeafNode(otherlv_3, grammarAccess.getLogicElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1195:1: ( (lv_source_4_0= RULE_STRING ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1196:1: (lv_source_4_0= RULE_STRING )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1196:1: (lv_source_4_0= RULE_STRING )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1197:3: lv_source_4_0= RULE_STRING
                    {
                    lv_source_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLogicElement2758); 

                    			newLeafNode(lv_source_4_0, grammarAccess.getLogicElementAccess().getSourceSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"source",
                            		lv_source_4_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleLogicElement2775); 

                        	newLeafNode(otherlv_5, grammarAccess.getLogicElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicElement"


    // $ANTLR start "entryRuleLogicOptionalProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1225:1: entryRuleLogicOptionalProperties returns [EObject current=null] : iv_ruleLogicOptionalProperties= ruleLogicOptionalProperties EOF ;
    public final EObject entryRuleLogicOptionalProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOptionalProperties = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1226:2: (iv_ruleLogicOptionalProperties= ruleLogicOptionalProperties EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1227:2: iv_ruleLogicOptionalProperties= ruleLogicOptionalProperties EOF
            {
             newCompositeNode(grammarAccess.getLogicOptionalPropertiesRule()); 
            pushFollow(FOLLOW_ruleLogicOptionalProperties_in_entryRuleLogicOptionalProperties2813);
            iv_ruleLogicOptionalProperties=ruleLogicOptionalProperties();

            state._fsp--;

             current =iv_ruleLogicOptionalProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOptionalProperties2823); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOptionalProperties"


    // $ANTLR start "ruleLogicOptionalProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1234:1: ruleLogicOptionalProperties returns [EObject current=null] : ( ( (lv_runat_0_0= ruleRunAtAttribute ) ) | ( (lv_exec_1_0= ruleLogicExecAttribute ) ) ) ;
    public final EObject ruleLogicOptionalProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_runat_0_0 = null;

        EObject lv_exec_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1237:28: ( ( ( (lv_runat_0_0= ruleRunAtAttribute ) ) | ( (lv_exec_1_0= ruleLogicExecAttribute ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1238:1: ( ( (lv_runat_0_0= ruleRunAtAttribute ) ) | ( (lv_exec_1_0= ruleLogicExecAttribute ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1238:1: ( ( (lv_runat_0_0= ruleRunAtAttribute ) ) | ( (lv_exec_1_0= ruleLogicExecAttribute ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==28) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1238:2: ( (lv_runat_0_0= ruleRunAtAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1238:2: ( (lv_runat_0_0= ruleRunAtAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1239:1: (lv_runat_0_0= ruleRunAtAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1239:1: (lv_runat_0_0= ruleRunAtAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1240:3: lv_runat_0_0= ruleRunAtAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogicOptionalPropertiesAccess().getRunatRunAtAttributeParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRunAtAttribute_in_ruleLogicOptionalProperties2869);
                    lv_runat_0_0=ruleRunAtAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogicOptionalPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"runat",
                            		lv_runat_0_0, 
                            		"RunAtAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1257:6: ( (lv_exec_1_0= ruleLogicExecAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1257:6: ( (lv_exec_1_0= ruleLogicExecAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1258:1: (lv_exec_1_0= ruleLogicExecAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1258:1: (lv_exec_1_0= ruleLogicExecAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1259:3: lv_exec_1_0= ruleLogicExecAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getLogicOptionalPropertiesAccess().getExecLogicExecAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLogicExecAttribute_in_ruleLogicOptionalProperties2896);
                    lv_exec_1_0=ruleLogicExecAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLogicOptionalPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"exec",
                            		lv_exec_1_0, 
                            		"LogicExecAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOptionalProperties"


    // $ANTLR start "entryRuleLogicTypeAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1283:1: entryRuleLogicTypeAttribute returns [EObject current=null] : iv_ruleLogicTypeAttribute= ruleLogicTypeAttribute EOF ;
    public final EObject entryRuleLogicTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicTypeAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1284:2: (iv_ruleLogicTypeAttribute= ruleLogicTypeAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1285:2: iv_ruleLogicTypeAttribute= ruleLogicTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getLogicTypeAttributeRule()); 
            pushFollow(FOLLOW_ruleLogicTypeAttribute_in_entryRuleLogicTypeAttribute2932);
            iv_ruleLogicTypeAttribute=ruleLogicTypeAttribute();

            state._fsp--;

             current =iv_ruleLogicTypeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicTypeAttribute2942); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicTypeAttribute"


    // $ANTLR start "ruleLogicTypeAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1292:1: ruleLogicTypeAttribute returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_value_1_0= ruleLogicTypeAttributeList ) ) ) ;
    public final EObject ruleLogicTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1295:28: ( (otherlv_0= 'type=' ( (lv_value_1_0= ruleLogicTypeAttributeList ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1296:1: (otherlv_0= 'type=' ( (lv_value_1_0= ruleLogicTypeAttributeList ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1296:1: (otherlv_0= 'type=' ( (lv_value_1_0= ruleLogicTypeAttributeList ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1296:3: otherlv_0= 'type=' ( (lv_value_1_0= ruleLogicTypeAttributeList ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleLogicTypeAttribute2979); 

                	newLeafNode(otherlv_0, grammarAccess.getLogicTypeAttributeAccess().getTypeKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1300:1: ( (lv_value_1_0= ruleLogicTypeAttributeList ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1301:1: (lv_value_1_0= ruleLogicTypeAttributeList )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1301:1: (lv_value_1_0= ruleLogicTypeAttributeList )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1302:3: lv_value_1_0= ruleLogicTypeAttributeList
            {
             
            	        newCompositeNode(grammarAccess.getLogicTypeAttributeAccess().getValueLogicTypeAttributeListEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLogicTypeAttributeList_in_ruleLogicTypeAttribute3000);
            lv_value_1_0=ruleLogicTypeAttributeList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicTypeAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"LogicTypeAttributeList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicTypeAttribute"


    // $ANTLR start "entryRuleLogicExecAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1326:1: entryRuleLogicExecAttribute returns [EObject current=null] : iv_ruleLogicExecAttribute= ruleLogicExecAttribute EOF ;
    public final EObject entryRuleLogicExecAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExecAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1327:2: (iv_ruleLogicExecAttribute= ruleLogicExecAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1328:2: iv_ruleLogicExecAttribute= ruleLogicExecAttribute EOF
            {
             newCompositeNode(grammarAccess.getLogicExecAttributeRule()); 
            pushFollow(FOLLOW_ruleLogicExecAttribute_in_entryRuleLogicExecAttribute3036);
            iv_ruleLogicExecAttribute=ruleLogicExecAttribute();

            state._fsp--;

             current =iv_ruleLogicExecAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicExecAttribute3046); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicExecAttribute"


    // $ANTLR start "ruleLogicExecAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1335:1: ruleLogicExecAttribute returns [EObject current=null] : (otherlv_0= 'exec=' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleLogicExecAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1338:28: ( (otherlv_0= 'exec=' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1339:1: (otherlv_0= 'exec=' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1339:1: (otherlv_0= 'exec=' ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1339:3: otherlv_0= 'exec=' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleLogicExecAttribute3083); 

                	newLeafNode(otherlv_0, grammarAccess.getLogicExecAttributeAccess().getExecKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1343:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1344:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1344:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1345:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLogicExecAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLogicExecAttribute3103); 

            		newLeafNode(otherlv_1, grammarAccess.getLogicExecAttributeAccess().getValueJavaElementCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicExecAttribute"


    // $ANTLR start "entryRuleLookupElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1364:1: entryRuleLookupElement returns [EObject current=null] : iv_ruleLookupElement= ruleLookupElement EOF ;
    public final EObject entryRuleLookupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLookupElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1365:2: (iv_ruleLookupElement= ruleLookupElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1366:2: iv_ruleLookupElement= ruleLookupElement EOF
            {
             newCompositeNode(grammarAccess.getLookupElementRule()); 
            pushFollow(FOLLOW_ruleLookupElement_in_entryRuleLookupElement3139);
            iv_ruleLookupElement=ruleLookupElement();

            state._fsp--;

             current =iv_ruleLookupElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLookupElement3149); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLookupElement"


    // $ANTLR start "ruleLookupElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1373:1: ruleLookupElement returns [EObject current=null] : (otherlv_0= 'lookup ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) ) )+ otherlv_4= '}' ) ;
    public final EObject ruleLookupElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_servicelogic_3_1 = null;

        EObject lv_servicelogic_3_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1376:28: ( (otherlv_0= 'lookup ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) ) )+ otherlv_4= '}' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1377:1: (otherlv_0= 'lookup ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) ) )+ otherlv_4= '}' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1377:1: (otherlv_0= 'lookup ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) ) )+ otherlv_4= '}' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1377:3: otherlv_0= 'lookup ' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleLookupElement3186); 

                	newLeafNode(otherlv_0, grammarAccess.getLookupElementAccess().getLookupKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1381:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1382:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1382:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1383:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLookupElement3203); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLookupElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLookupElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleLookupElement3220); 

                	newLeafNode(otherlv_2, grammarAccess.getLookupElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1403:1: ( ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20||LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1404:1: ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1404:1: ( (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1405:1: (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1405:1: (lv_servicelogic_3_1= ruleJavaElement | lv_servicelogic_3_2= ruleLogicElement )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==20) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==26) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1406:3: lv_servicelogic_3_1= ruleJavaElement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getLookupElementAccess().getServicelogicJavaElementParserRuleCall_3_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleJavaElement_in_ruleLookupElement3243);
            	            lv_servicelogic_3_1=ruleJavaElement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getLookupElementRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"servicelogic",
            	                    		lv_servicelogic_3_1, 
            	                    		"JavaElement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1421:8: lv_servicelogic_3_2= ruleLogicElement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getLookupElementAccess().getServicelogicLogicElementParserRuleCall_3_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLogicElement_in_ruleLookupElement3262);
            	            lv_servicelogic_3_2=ruleLogicElement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getLookupElementRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"servicelogic",
            	                    		lv_servicelogic_3_2, 
            	                    		"LogicElement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleLookupElement3278); 

                	newLeafNode(otherlv_4, grammarAccess.getLookupElementAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLookupElement"


    // $ANTLR start "entryRuleTemplateElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1451:1: entryRuleTemplateElement returns [EObject current=null] : iv_ruleTemplateElement= ruleTemplateElement EOF ;
    public final EObject entryRuleTemplateElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1452:2: (iv_ruleTemplateElement= ruleTemplateElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1453:2: iv_ruleTemplateElement= ruleTemplateElement EOF
            {
             newCompositeNode(grammarAccess.getTemplateElementRule()); 
            pushFollow(FOLLOW_ruleTemplateElement_in_entryRuleTemplateElement3314);
            iv_ruleTemplateElement=ruleTemplateElement();

            state._fsp--;

             current =iv_ruleTemplateElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateElement3324); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateElement"


    // $ANTLR start "ruleTemplateElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1460:1: ruleTemplateElement returns [EObject current=null] : (otherlv_0= 'template ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleTemplateElementClassAttribute ) ) ( (lv_replaces_3_0= ruleTemplateElementReplacesAttribute ) ) ) ;
    public final EObject ruleTemplateElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_class_2_0 = null;

        EObject lv_replaces_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1463:28: ( (otherlv_0= 'template ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleTemplateElementClassAttribute ) ) ( (lv_replaces_3_0= ruleTemplateElementReplacesAttribute ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1464:1: (otherlv_0= 'template ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleTemplateElementClassAttribute ) ) ( (lv_replaces_3_0= ruleTemplateElementReplacesAttribute ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1464:1: (otherlv_0= 'template ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleTemplateElementClassAttribute ) ) ( (lv_replaces_3_0= ruleTemplateElementReplacesAttribute ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1464:3: otherlv_0= 'template ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_class_2_0= ruleTemplateElementClassAttribute ) ) ( (lv_replaces_3_0= ruleTemplateElementReplacesAttribute ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTemplateElement3361); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateElementAccess().getTemplateKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1468:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1469:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1469:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1470:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateElement3378); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTemplateElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1486:2: ( (lv_class_2_0= ruleTemplateElementClassAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1487:1: (lv_class_2_0= ruleTemplateElementClassAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1487:1: (lv_class_2_0= ruleTemplateElementClassAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1488:3: lv_class_2_0= ruleTemplateElementClassAttribute
            {
             
            	        newCompositeNode(grammarAccess.getTemplateElementAccess().getClassTemplateElementClassAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTemplateElementClassAttribute_in_ruleTemplateElement3404);
            lv_class_2_0=ruleTemplateElementClassAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateElementRule());
            	        }
                   		set(
                   			current, 
                   			"class",
                    		lv_class_2_0, 
                    		"TemplateElementClassAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1504:2: ( (lv_replaces_3_0= ruleTemplateElementReplacesAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1505:1: (lv_replaces_3_0= ruleTemplateElementReplacesAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1505:1: (lv_replaces_3_0= ruleTemplateElementReplacesAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1506:3: lv_replaces_3_0= ruleTemplateElementReplacesAttribute
            {
             
            	        newCompositeNode(grammarAccess.getTemplateElementAccess().getReplacesTemplateElementReplacesAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTemplateElementReplacesAttribute_in_ruleTemplateElement3425);
            lv_replaces_3_0=ruleTemplateElementReplacesAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateElementRule());
            	        }
                   		set(
                   			current, 
                   			"replaces",
                    		lv_replaces_3_0, 
                    		"TemplateElementReplacesAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateElement"


    // $ANTLR start "entryRuleTemplateElementClassAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1530:1: entryRuleTemplateElementClassAttribute returns [EObject current=null] : iv_ruleTemplateElementClassAttribute= ruleTemplateElementClassAttribute EOF ;
    public final EObject entryRuleTemplateElementClassAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateElementClassAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1531:2: (iv_ruleTemplateElementClassAttribute= ruleTemplateElementClassAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1532:2: iv_ruleTemplateElementClassAttribute= ruleTemplateElementClassAttribute EOF
            {
             newCompositeNode(grammarAccess.getTemplateElementClassAttributeRule()); 
            pushFollow(FOLLOW_ruleTemplateElementClassAttribute_in_entryRuleTemplateElementClassAttribute3461);
            iv_ruleTemplateElementClassAttribute=ruleTemplateElementClassAttribute();

            state._fsp--;

             current =iv_ruleTemplateElementClassAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateElementClassAttribute3471); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateElementClassAttribute"


    // $ANTLR start "ruleTemplateElementClassAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1539:1: ruleTemplateElementClassAttribute returns [EObject current=null] : (otherlv_0= 'class=' ( (lv_value_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateElementClassAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1542:28: ( (otherlv_0= 'class=' ( (lv_value_1_0= ruleQualifiedName ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1543:1: (otherlv_0= 'class=' ( (lv_value_1_0= ruleQualifiedName ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1543:1: (otherlv_0= 'class=' ( (lv_value_1_0= ruleQualifiedName ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1543:3: otherlv_0= 'class=' ( (lv_value_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTemplateElementClassAttribute3508); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateElementClassAttributeAccess().getClassKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1547:1: ( (lv_value_1_0= ruleQualifiedName ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1548:1: (lv_value_1_0= ruleQualifiedName )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1548:1: (lv_value_1_0= ruleQualifiedName )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1549:3: lv_value_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getTemplateElementClassAttributeAccess().getValueQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateElementClassAttribute3529);
            lv_value_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTemplateElementClassAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateElementClassAttribute"


    // $ANTLR start "entryRuleTemplateElementReplacesAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1573:1: entryRuleTemplateElementReplacesAttribute returns [EObject current=null] : iv_ruleTemplateElementReplacesAttribute= ruleTemplateElementReplacesAttribute EOF ;
    public final EObject entryRuleTemplateElementReplacesAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateElementReplacesAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1574:2: (iv_ruleTemplateElementReplacesAttribute= ruleTemplateElementReplacesAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1575:2: iv_ruleTemplateElementReplacesAttribute= ruleTemplateElementReplacesAttribute EOF
            {
             newCompositeNode(grammarAccess.getTemplateElementReplacesAttributeRule()); 
            pushFollow(FOLLOW_ruleTemplateElementReplacesAttribute_in_entryRuleTemplateElementReplacesAttribute3565);
            iv_ruleTemplateElementReplacesAttribute=ruleTemplateElementReplacesAttribute();

            state._fsp--;

             current =iv_ruleTemplateElementReplacesAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateElementReplacesAttribute3575); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateElementReplacesAttribute"


    // $ANTLR start "ruleTemplateElementReplacesAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1582:1: ruleTemplateElementReplacesAttribute returns [EObject current=null] : (otherlv_0= 'replaces=' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTemplateElementReplacesAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1585:28: ( (otherlv_0= 'replaces=' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1586:1: (otherlv_0= 'replaces=' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1586:1: (otherlv_0= 'replaces=' ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1586:3: otherlv_0= 'replaces=' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTemplateElementReplacesAttribute3612); 

                	newLeafNode(otherlv_0, grammarAccess.getTemplateElementReplacesAttributeAccess().getReplacesKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1590:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1591:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1591:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1592:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTemplateElementReplacesAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateElementReplacesAttribute3632); 

            		newLeafNode(otherlv_1, grammarAccess.getTemplateElementReplacesAttributeAccess().getValueAbstractScoutTypeCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateElementReplacesAttribute"


    // $ANTLR start "entryRuleFormElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1611:1: entryRuleFormElement returns [EObject current=null] : iv_ruleFormElement= ruleFormElement EOF ;
    public final EObject entryRuleFormElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1612:2: (iv_ruleFormElement= ruleFormElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1613:2: iv_ruleFormElement= ruleFormElement EOF
            {
             newCompositeNode(grammarAccess.getFormElementRule()); 
            pushFollow(FOLLOW_ruleFormElement_in_entryRuleFormElement3668);
            iv_ruleFormElement=ruleFormElement();

            state._fsp--;

             current =iv_ruleFormElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElement3678); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormElement"


    // $ANTLR start "ruleFormElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1620:1: ruleFormElement returns [EObject current=null] : (otherlv_0= 'form ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_modal_2_0= ruleFormElementModalAttribute ) ) ( (lv_text_3_0= ruleTextAttribute ) ) ( (lv_columns_4_0= ruleFormElementColumnsAttribute ) ) otherlv_5= '{' ( ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) ) )* otherlv_7= '}' ) ;
    public final EObject ruleFormElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_modal_2_0 = null;

        EObject lv_text_3_0 = null;

        EObject lv_columns_4_0 = null;

        EObject lv_elements_6_1 = null;

        EObject lv_elements_6_2 = null;

        EObject lv_elements_6_3 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1623:28: ( (otherlv_0= 'form ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_modal_2_0= ruleFormElementModalAttribute ) ) ( (lv_text_3_0= ruleTextAttribute ) ) ( (lv_columns_4_0= ruleFormElementColumnsAttribute ) ) otherlv_5= '{' ( ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) ) )* otherlv_7= '}' ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1624:1: (otherlv_0= 'form ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_modal_2_0= ruleFormElementModalAttribute ) ) ( (lv_text_3_0= ruleTextAttribute ) ) ( (lv_columns_4_0= ruleFormElementColumnsAttribute ) ) otherlv_5= '{' ( ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) ) )* otherlv_7= '}' )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1624:1: (otherlv_0= 'form ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_modal_2_0= ruleFormElementModalAttribute ) ) ( (lv_text_3_0= ruleTextAttribute ) ) ( (lv_columns_4_0= ruleFormElementColumnsAttribute ) ) otherlv_5= '{' ( ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) ) )* otherlv_7= '}' )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1624:3: otherlv_0= 'form ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_modal_2_0= ruleFormElementModalAttribute ) ) ( (lv_text_3_0= ruleTextAttribute ) ) ( (lv_columns_4_0= ruleFormElementColumnsAttribute ) ) otherlv_5= '{' ( ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFormElement3715); 

                	newLeafNode(otherlv_0, grammarAccess.getFormElementAccess().getFormKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1628:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1629:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1629:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1630:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormElement3732); 

            			newLeafNode(lv_name_1_0, grammarAccess.getFormElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1646:2: ( (lv_modal_2_0= ruleFormElementModalAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1647:1: (lv_modal_2_0= ruleFormElementModalAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1647:1: (lv_modal_2_0= ruleFormElementModalAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1648:3: lv_modal_2_0= ruleFormElementModalAttribute
            {
             
            	        newCompositeNode(grammarAccess.getFormElementAccess().getModalFormElementModalAttributeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleFormElementModalAttribute_in_ruleFormElement3758);
            lv_modal_2_0=ruleFormElementModalAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormElementRule());
            	        }
                   		set(
                   			current, 
                   			"modal",
                    		lv_modal_2_0, 
                    		"FormElementModalAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1664:2: ( (lv_text_3_0= ruleTextAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1665:1: (lv_text_3_0= ruleTextAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1665:1: (lv_text_3_0= ruleTextAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1666:3: lv_text_3_0= ruleTextAttribute
            {
             
            	        newCompositeNode(grammarAccess.getFormElementAccess().getTextTextAttributeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTextAttribute_in_ruleFormElement3779);
            lv_text_3_0=ruleTextAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormElementRule());
            	        }
                   		set(
                   			current, 
                   			"text",
                    		lv_text_3_0, 
                    		"TextAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1682:2: ( (lv_columns_4_0= ruleFormElementColumnsAttribute ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1683:1: (lv_columns_4_0= ruleFormElementColumnsAttribute )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1683:1: (lv_columns_4_0= ruleFormElementColumnsAttribute )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1684:3: lv_columns_4_0= ruleFormElementColumnsAttribute
            {
             
            	        newCompositeNode(grammarAccess.getFormElementAccess().getColumnsFormElementColumnsAttributeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleFormElementColumnsAttribute_in_ruleFormElement3800);
            lv_columns_4_0=ruleFormElementColumnsAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormElementRule());
            	        }
                   		set(
                   			current, 
                   			"columns",
                    		lv_columns_4_0, 
                    		"FormElementColumnsAttribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleFormElement3812); 

                	newLeafNode(otherlv_5, grammarAccess.getFormElementAccess().getLeftCurlyBracketKeyword_5());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1704:1: ( ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20||LA15_0==26||(LA15_0>=36 && LA15_0<=37)||(LA15_0>=39 && LA15_0<=42)||LA15_0==46) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1705:1: ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1705:1: ( (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement ) )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1706:1: (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1706:1: (lv_elements_6_1= ruleLogicElement | lv_elements_6_2= ruleJavaElement | lv_elements_6_3= ruleAbstractFieldElement )
            	    int alt14=3;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case 36:
            	    case 37:
            	    case 39:
            	    case 40:
            	    case 41:
            	    case 42:
            	    case 46:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1707:3: lv_elements_6_1= ruleLogicElement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getFormElementAccess().getElementsLogicElementParserRuleCall_6_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLogicElement_in_ruleFormElement3835);
            	            lv_elements_6_1=ruleLogicElement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getFormElementRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"elements",
            	                    		lv_elements_6_1, 
            	                    		"LogicElement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1722:8: lv_elements_6_2= ruleJavaElement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getFormElementAccess().getElementsJavaElementParserRuleCall_6_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleJavaElement_in_ruleFormElement3854);
            	            lv_elements_6_2=ruleJavaElement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getFormElementRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"elements",
            	                    		lv_elements_6_2, 
            	                    		"JavaElement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1737:8: lv_elements_6_3= ruleAbstractFieldElement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getFormElementAccess().getElementsAbstractFieldElementParserRuleCall_6_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAbstractFieldElement_in_ruleFormElement3873);
            	            lv_elements_6_3=ruleAbstractFieldElement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getFormElementRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"elements",
            	                    		lv_elements_6_3, 
            	                    		"AbstractFieldElement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleFormElement3889); 

                	newLeafNode(otherlv_7, grammarAccess.getFormElementAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormElement"


    // $ANTLR start "entryRuleFormElementModalAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1767:1: entryRuleFormElementModalAttribute returns [EObject current=null] : iv_ruleFormElementModalAttribute= ruleFormElementModalAttribute EOF ;
    public final EObject entryRuleFormElementModalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElementModalAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1768:2: (iv_ruleFormElementModalAttribute= ruleFormElementModalAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1769:2: iv_ruleFormElementModalAttribute= ruleFormElementModalAttribute EOF
            {
             newCompositeNode(grammarAccess.getFormElementModalAttributeRule()); 
            pushFollow(FOLLOW_ruleFormElementModalAttribute_in_entryRuleFormElementModalAttribute3925);
            iv_ruleFormElementModalAttribute=ruleFormElementModalAttribute();

            state._fsp--;

             current =iv_ruleFormElementModalAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElementModalAttribute3935); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormElementModalAttribute"


    // $ANTLR start "ruleFormElementModalAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1776:1: ruleFormElementModalAttribute returns [EObject current=null] : (otherlv_0= 'modal=' ( (lv_value_1_0= ruleBooleanType ) ) ) ;
    public final EObject ruleFormElementModalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1779:28: ( (otherlv_0= 'modal=' ( (lv_value_1_0= ruleBooleanType ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1780:1: (otherlv_0= 'modal=' ( (lv_value_1_0= ruleBooleanType ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1780:1: (otherlv_0= 'modal=' ( (lv_value_1_0= ruleBooleanType ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1780:3: otherlv_0= 'modal=' ( (lv_value_1_0= ruleBooleanType ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleFormElementModalAttribute3972); 

                	newLeafNode(otherlv_0, grammarAccess.getFormElementModalAttributeAccess().getModalKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1784:1: ( (lv_value_1_0= ruleBooleanType ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1785:1: (lv_value_1_0= ruleBooleanType )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1785:1: (lv_value_1_0= ruleBooleanType )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1786:3: lv_value_1_0= ruleBooleanType
            {
             
            	        newCompositeNode(grammarAccess.getFormElementModalAttributeAccess().getValueBooleanTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleBooleanType_in_ruleFormElementModalAttribute3993);
            lv_value_1_0=ruleBooleanType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormElementModalAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"BooleanType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormElementModalAttribute"


    // $ANTLR start "entryRuleFormElementColumnsAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1810:1: entryRuleFormElementColumnsAttribute returns [EObject current=null] : iv_ruleFormElementColumnsAttribute= ruleFormElementColumnsAttribute EOF ;
    public final EObject entryRuleFormElementColumnsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormElementColumnsAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1811:2: (iv_ruleFormElementColumnsAttribute= ruleFormElementColumnsAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1812:2: iv_ruleFormElementColumnsAttribute= ruleFormElementColumnsAttribute EOF
            {
             newCompositeNode(grammarAccess.getFormElementColumnsAttributeRule()); 
            pushFollow(FOLLOW_ruleFormElementColumnsAttribute_in_entryRuleFormElementColumnsAttribute4029);
            iv_ruleFormElementColumnsAttribute=ruleFormElementColumnsAttribute();

            state._fsp--;

             current =iv_ruleFormElementColumnsAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormElementColumnsAttribute4039); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormElementColumnsAttribute"


    // $ANTLR start "ruleFormElementColumnsAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1819:1: ruleFormElementColumnsAttribute returns [EObject current=null] : (otherlv_0= 'columns=' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleFormElementColumnsAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1822:28: ( (otherlv_0= 'columns=' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1823:1: (otherlv_0= 'columns=' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1823:1: (otherlv_0= 'columns=' ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1823:3: otherlv_0= 'columns=' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleFormElementColumnsAttribute4076); 

                	newLeafNode(otherlv_0, grammarAccess.getFormElementColumnsAttributeAccess().getColumnsKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1827:1: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1828:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1828:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1829:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFormElementColumnsAttribute4093); 

            			newLeafNode(lv_value_1_0, grammarAccess.getFormElementColumnsAttributeAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFormElementColumnsAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormElementColumnsAttribute"


    // $ANTLR start "entryRuleSequenceBoxElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1853:1: entryRuleSequenceBoxElement returns [EObject current=null] : iv_ruleSequenceBoxElement= ruleSequenceBoxElement EOF ;
    public final EObject entryRuleSequenceBoxElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceBoxElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1854:2: (iv_ruleSequenceBoxElement= ruleSequenceBoxElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1855:2: iv_ruleSequenceBoxElement= ruleSequenceBoxElement EOF
            {
             newCompositeNode(grammarAccess.getSequenceBoxElementRule()); 
            pushFollow(FOLLOW_ruleSequenceBoxElement_in_entryRuleSequenceBoxElement4134);
            iv_ruleSequenceBoxElement=ruleSequenceBoxElement();

            state._fsp--;

             current =iv_ruleSequenceBoxElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequenceBoxElement4144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequenceBoxElement"


    // $ANTLR start "ruleSequenceBoxElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1862:1: ruleSequenceBoxElement returns [EObject current=null] : (otherlv_0= 'sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleSequenceBoxElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_children_4_1 = null;

        EObject lv_children_4_2 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1865:28: ( (otherlv_0= 'sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )* otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1866:1: (otherlv_0= 'sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )* otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1866:1: (otherlv_0= 'sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )* otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1866:3: otherlv_0= 'sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleSequenceBoxElement4181); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceBoxElementAccess().getSequence_boxKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1870:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1871:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1871:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1872:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequenceBoxElement4198); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSequenceBoxElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceBoxElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1888:2: ( (lv_properties_2_0= ruleAbstractFieldProperties ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=12 && LA16_0<=15)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1889:1: (lv_properties_2_0= ruleAbstractFieldProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1889:1: (lv_properties_2_0= ruleAbstractFieldProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1890:3: lv_properties_2_0= ruleAbstractFieldProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceBoxElementAccess().getPropertiesAbstractFieldPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractFieldProperties_in_ruleSequenceBoxElement4224);
            	    lv_properties_2_0=ruleAbstractFieldProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceBoxElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"AbstractFieldProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1906:3: (otherlv_3= '{' ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )* otherlv_5= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1906:5: otherlv_3= '{' ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSequenceBoxElement4238); 

                        	newLeafNode(otherlv_3, grammarAccess.getSequenceBoxElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1910:1: ( ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==26||(LA18_0>=36 && LA18_0<=37)||(LA18_0>=39 && LA18_0<=42)||LA18_0==46) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1911:1: ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1911:1: ( (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement ) )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1912:1: (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1912:1: (lv_children_4_1= ruleLogicElement | lv_children_4_2= ruleAbstractFieldElement )
                    	    int alt17=2;
                    	    int LA17_0 = input.LA(1);

                    	    if ( (LA17_0==26) ) {
                    	        alt17=1;
                    	    }
                    	    else if ( ((LA17_0>=36 && LA17_0<=37)||(LA17_0>=39 && LA17_0<=42)||LA17_0==46) ) {
                    	        alt17=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 17, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt17) {
                    	        case 1 :
                    	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1913:3: lv_children_4_1= ruleLogicElement
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSequenceBoxElementAccess().getChildrenLogicElementParserRuleCall_3_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleLogicElement_in_ruleSequenceBoxElement4261);
                    	            lv_children_4_1=ruleLogicElement();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSequenceBoxElementRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"children",
                    	                    		lv_children_4_1, 
                    	                    		"LogicElement");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1928:8: lv_children_4_2= ruleAbstractFieldElement
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSequenceBoxElementAccess().getChildrenAbstractFieldElementParserRuleCall_3_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAbstractFieldElement_in_ruleSequenceBoxElement4280);
                    	            lv_children_4_2=ruleAbstractFieldElement();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSequenceBoxElementRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"children",
                    	                    		lv_children_4_2, 
                    	                    		"AbstractFieldElement");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSequenceBoxElement4296); 

                        	newLeafNode(otherlv_5, grammarAccess.getSequenceBoxElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequenceBoxElement"


    // $ANTLR start "entryRuleStringElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1958:1: entryRuleStringElement returns [EObject current=null] : iv_ruleStringElement= ruleStringElement EOF ;
    public final EObject entryRuleStringElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1959:2: (iv_ruleStringElement= ruleStringElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1960:2: iv_ruleStringElement= ruleStringElement EOF
            {
             newCompositeNode(grammarAccess.getStringElementRule()); 
            pushFollow(FOLLOW_ruleStringElement_in_entryRuleStringElement4334);
            iv_ruleStringElement=ruleStringElement();

            state._fsp--;

             current =iv_ruleStringElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElement4344); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringElement"


    // $ANTLR start "ruleStringElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1967:1: ruleStringElement returns [EObject current=null] : (otherlv_0= 'string ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleStringElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleStringElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_logic_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1970:28: ( (otherlv_0= 'string ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleStringElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1971:1: (otherlv_0= 'string ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleStringElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1971:1: (otherlv_0= 'string ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleStringElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1971:3: otherlv_0= 'string ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleStringElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleStringElement4381); 

                	newLeafNode(otherlv_0, grammarAccess.getStringElementAccess().getStringKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1975:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1976:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1976:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1977:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStringElement4398); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStringElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1993:2: ( (lv_properties_2_0= ruleStringElementProperties ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=12 && LA20_0<=16)||LA20_0==38) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1994:1: (lv_properties_2_0= ruleStringElementProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1994:1: (lv_properties_2_0= ruleStringElementProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:1995:3: lv_properties_2_0= ruleStringElementProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStringElementAccess().getPropertiesStringElementPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStringElementProperties_in_ruleStringElement4424);
            	    lv_properties_2_0=ruleStringElementProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStringElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"StringElementProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2011:3: (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2011:5: otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleStringElement4438); 

                        	newLeafNode(otherlv_3, grammarAccess.getStringElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2015:1: ( (lv_logic_4_0= ruleLogicElement ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==26) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2016:1: (lv_logic_4_0= ruleLogicElement )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2016:1: (lv_logic_4_0= ruleLogicElement )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2017:3: lv_logic_4_0= ruleLogicElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStringElementAccess().getLogicLogicElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicElement_in_ruleStringElement4459);
                    	    lv_logic_4_0=ruleLogicElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStringElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"logic",
                    	            		lv_logic_4_0, 
                    	            		"LogicElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleStringElement4472); 

                        	newLeafNode(otherlv_5, grammarAccess.getStringElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringElement"


    // $ANTLR start "entryRuleStringElementProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2045:1: entryRuleStringElementProperties returns [EObject current=null] : iv_ruleStringElementProperties= ruleStringElementProperties EOF ;
    public final EObject entryRuleStringElementProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringElementProperties = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2046:2: (iv_ruleStringElementProperties= ruleStringElementProperties EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2047:2: iv_ruleStringElementProperties= ruleStringElementProperties EOF
            {
             newCompositeNode(grammarAccess.getStringElementPropertiesRule()); 
            pushFollow(FOLLOW_ruleStringElementProperties_in_entryRuleStringElementProperties4510);
            iv_ruleStringElementProperties=ruleStringElementProperties();

            state._fsp--;

             current =iv_ruleStringElementProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElementProperties4520); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringElementProperties"


    // $ANTLR start "ruleStringElementProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2054:1: ruleStringElementProperties returns [EObject current=null] : ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_maxlen_1_0= ruleStringElementMaxlenAttribute ) ) ) ;
    public final EObject ruleStringElementProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_valueFieldProperties_0_0 = null;

        EObject lv_maxlen_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2057:28: ( ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_maxlen_1_0= ruleStringElementMaxlenAttribute ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2058:1: ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_maxlen_1_0= ruleStringElementMaxlenAttribute ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2058:1: ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_maxlen_1_0= ruleStringElementMaxlenAttribute ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=12 && LA23_0<=16)) ) {
                alt23=1;
            }
            else if ( (LA23_0==38) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2058:2: ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2058:2: ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2059:1: (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2059:1: (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2060:3: lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringElementPropertiesAccess().getValueFieldPropertiesAbstractValueFieldPropertiesParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_ruleStringElementProperties4566);
                    lv_valueFieldProperties_0_0=ruleAbstractValueFieldProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringElementPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"valueFieldProperties",
                            		lv_valueFieldProperties_0_0, 
                            		"AbstractValueFieldProperties");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2077:6: ( (lv_maxlen_1_0= ruleStringElementMaxlenAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2077:6: ( (lv_maxlen_1_0= ruleStringElementMaxlenAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2078:1: (lv_maxlen_1_0= ruleStringElementMaxlenAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2078:1: (lv_maxlen_1_0= ruleStringElementMaxlenAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2079:3: lv_maxlen_1_0= ruleStringElementMaxlenAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getStringElementPropertiesAccess().getMaxlenStringElementMaxlenAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStringElementMaxlenAttribute_in_ruleStringElementProperties4593);
                    lv_maxlen_1_0=ruleStringElementMaxlenAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStringElementPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"maxlen",
                            		lv_maxlen_1_0, 
                            		"StringElementMaxlenAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringElementProperties"


    // $ANTLR start "entryRuleStringElementMaxlenAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2103:1: entryRuleStringElementMaxlenAttribute returns [EObject current=null] : iv_ruleStringElementMaxlenAttribute= ruleStringElementMaxlenAttribute EOF ;
    public final EObject entryRuleStringElementMaxlenAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringElementMaxlenAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2104:2: (iv_ruleStringElementMaxlenAttribute= ruleStringElementMaxlenAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2105:2: iv_ruleStringElementMaxlenAttribute= ruleStringElementMaxlenAttribute EOF
            {
             newCompositeNode(grammarAccess.getStringElementMaxlenAttributeRule()); 
            pushFollow(FOLLOW_ruleStringElementMaxlenAttribute_in_entryRuleStringElementMaxlenAttribute4629);
            iv_ruleStringElementMaxlenAttribute=ruleStringElementMaxlenAttribute();

            state._fsp--;

             current =iv_ruleStringElementMaxlenAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringElementMaxlenAttribute4639); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringElementMaxlenAttribute"


    // $ANTLR start "ruleStringElementMaxlenAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2112:1: ruleStringElementMaxlenAttribute returns [EObject current=null] : (otherlv_0= 'maxlen=' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleStringElementMaxlenAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2115:28: ( (otherlv_0= 'maxlen=' ( (lv_value_1_0= RULE_INT ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2116:1: (otherlv_0= 'maxlen=' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2116:1: (otherlv_0= 'maxlen=' ( (lv_value_1_0= RULE_INT ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2116:3: otherlv_0= 'maxlen=' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleStringElementMaxlenAttribute4676); 

                	newLeafNode(otherlv_0, grammarAccess.getStringElementMaxlenAttributeAccess().getMaxlenKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2120:1: ( (lv_value_1_0= RULE_INT ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2121:1: (lv_value_1_0= RULE_INT )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2121:1: (lv_value_1_0= RULE_INT )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2122:3: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStringElementMaxlenAttribute4693); 

            			newLeafNode(lv_value_1_0, grammarAccess.getStringElementMaxlenAttributeAccess().getValueINTTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStringElementMaxlenAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"INT");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringElementMaxlenAttribute"


    // $ANTLR start "entryRuleDoubleElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2146:1: entryRuleDoubleElement returns [EObject current=null] : iv_ruleDoubleElement= ruleDoubleElement EOF ;
    public final EObject entryRuleDoubleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2147:2: (iv_ruleDoubleElement= ruleDoubleElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2148:2: iv_ruleDoubleElement= ruleDoubleElement EOF
            {
             newCompositeNode(grammarAccess.getDoubleElementRule()); 
            pushFollow(FOLLOW_ruleDoubleElement_in_entryRuleDoubleElement4734);
            iv_ruleDoubleElement=ruleDoubleElement();

            state._fsp--;

             current =iv_ruleDoubleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoubleElement4744); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoubleElement"


    // $ANTLR start "ruleDoubleElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2155:1: ruleDoubleElement returns [EObject current=null] : (otherlv_0= 'double ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleDoubleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2158:28: ( (otherlv_0= 'double ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2159:1: (otherlv_0= 'double ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2159:1: (otherlv_0= 'double ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2159:3: otherlv_0= 'double ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleDoubleElement4781); 

                	newLeafNode(otherlv_0, grammarAccess.getDoubleElementAccess().getDoubleKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2163:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2164:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2164:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2165:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDoubleElement4798); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDoubleElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDoubleElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2181:2: ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=12 && LA24_0<=16)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2182:1: (lv_properties_2_0= ruleAbstractValueFieldProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2182:1: (lv_properties_2_0= ruleAbstractValueFieldProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2183:3: lv_properties_2_0= ruleAbstractValueFieldProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDoubleElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_ruleDoubleElement4824);
            	    lv_properties_2_0=ruleAbstractValueFieldProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDoubleElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"AbstractValueFieldProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2199:3: (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2199:5: otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDoubleElement4838); 

                        	newLeafNode(otherlv_3, grammarAccess.getDoubleElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2203:1: ( (lv_children_4_0= ruleLogicElement ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==26) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2204:1: (lv_children_4_0= ruleLogicElement )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2204:1: (lv_children_4_0= ruleLogicElement )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2205:3: lv_children_4_0= ruleLogicElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDoubleElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicElement_in_ruleDoubleElement4859);
                    	    lv_children_4_0=ruleLogicElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDoubleElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_4_0, 
                    	            		"LogicElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleDoubleElement4872); 

                        	newLeafNode(otherlv_5, grammarAccess.getDoubleElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoubleElement"


    // $ANTLR start "entryRuleLongElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2233:1: entryRuleLongElement returns [EObject current=null] : iv_ruleLongElement= ruleLongElement EOF ;
    public final EObject entryRuleLongElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLongElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2234:2: (iv_ruleLongElement= ruleLongElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2235:2: iv_ruleLongElement= ruleLongElement EOF
            {
             newCompositeNode(grammarAccess.getLongElementRule()); 
            pushFollow(FOLLOW_ruleLongElement_in_entryRuleLongElement4910);
            iv_ruleLongElement=ruleLongElement();

            state._fsp--;

             current =iv_ruleLongElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLongElement4920); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLongElement"


    // $ANTLR start "ruleLongElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2242:1: ruleLongElement returns [EObject current=null] : (otherlv_0= 'long ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleLongElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2245:28: ( (otherlv_0= 'long ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2246:1: (otherlv_0= 'long ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2246:1: (otherlv_0= 'long ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2246:3: otherlv_0= 'long ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleLongElement4957); 

                	newLeafNode(otherlv_0, grammarAccess.getLongElementAccess().getLongKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2250:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2251:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2251:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2252:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLongElement4974); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLongElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLongElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2268:2: ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=12 && LA27_0<=16)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2269:1: (lv_properties_2_0= ruleAbstractValueFieldProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2269:1: (lv_properties_2_0= ruleAbstractValueFieldProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2270:3: lv_properties_2_0= ruleAbstractValueFieldProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLongElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_ruleLongElement5000);
            	    lv_properties_2_0=ruleAbstractValueFieldProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLongElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"AbstractValueFieldProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2286:3: (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2286:5: otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleLongElement5014); 

                        	newLeafNode(otherlv_3, grammarAccess.getLongElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2290:1: ( (lv_children_4_0= ruleLogicElement ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==26) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2291:1: (lv_children_4_0= ruleLogicElement )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2291:1: (lv_children_4_0= ruleLogicElement )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2292:3: lv_children_4_0= ruleLogicElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLongElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicElement_in_ruleLongElement5035);
                    	    lv_children_4_0=ruleLogicElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLongElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_4_0, 
                    	            		"LogicElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleLongElement5048); 

                        	newLeafNode(otherlv_5, grammarAccess.getLongElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLongElement"


    // $ANTLR start "entryRuleDateElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2320:1: entryRuleDateElement returns [EObject current=null] : iv_ruleDateElement= ruleDateElement EOF ;
    public final EObject entryRuleDateElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2321:2: (iv_ruleDateElement= ruleDateElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2322:2: iv_ruleDateElement= ruleDateElement EOF
            {
             newCompositeNode(grammarAccess.getDateElementRule()); 
            pushFollow(FOLLOW_ruleDateElement_in_entryRuleDateElement5086);
            iv_ruleDateElement=ruleDateElement();

            state._fsp--;

             current =iv_ruleDateElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDateElement5096); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateElement"


    // $ANTLR start "ruleDateElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2329:1: ruleDateElement returns [EObject current=null] : (otherlv_0= 'date ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleDateElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2332:28: ( (otherlv_0= 'date ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2333:1: (otherlv_0= 'date ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2333:1: (otherlv_0= 'date ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2333:3: otherlv_0= 'date ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDateElement5133); 

                	newLeafNode(otherlv_0, grammarAccess.getDateElementAccess().getDateKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2337:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2338:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2338:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2339:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDateElement5150); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDateElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDateElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2355:2: ( (lv_properties_2_0= ruleAbstractValueFieldProperties ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=12 && LA30_0<=16)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2356:1: (lv_properties_2_0= ruleAbstractValueFieldProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2356:1: (lv_properties_2_0= ruleAbstractValueFieldProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2357:3: lv_properties_2_0= ruleAbstractValueFieldProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDateElementAccess().getPropertiesAbstractValueFieldPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_ruleDateElement5176);
            	    lv_properties_2_0=ruleAbstractValueFieldProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDateElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"AbstractValueFieldProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2373:3: (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2373:5: otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleDateElement5190); 

                        	newLeafNode(otherlv_3, grammarAccess.getDateElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2377:1: ( (lv_children_4_0= ruleLogicElement ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==26) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2378:1: (lv_children_4_0= ruleLogicElement )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2378:1: (lv_children_4_0= ruleLogicElement )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2379:3: lv_children_4_0= ruleLogicElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDateElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicElement_in_ruleDateElement5211);
                    	    lv_children_4_0=ruleLogicElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDateElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_4_0, 
                    	            		"LogicElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleDateElement5224); 

                        	newLeafNode(otherlv_5, grammarAccess.getDateElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateElement"


    // $ANTLR start "entryRuleSmartfieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2407:1: entryRuleSmartfieldElement returns [EObject current=null] : iv_ruleSmartfieldElement= ruleSmartfieldElement EOF ;
    public final EObject entryRuleSmartfieldElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartfieldElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2408:2: (iv_ruleSmartfieldElement= ruleSmartfieldElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2409:2: iv_ruleSmartfieldElement= ruleSmartfieldElement EOF
            {
             newCompositeNode(grammarAccess.getSmartfieldElementRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElement_in_entryRuleSmartfieldElement5262);
            iv_ruleSmartfieldElement=ruleSmartfieldElement();

            state._fsp--;

             current =iv_ruleSmartfieldElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElement5272); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartfieldElement"


    // $ANTLR start "ruleSmartfieldElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2416:1: ruleSmartfieldElement returns [EObject current=null] : (otherlv_0= 'smartfield ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleSmartFieldElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? ) ;
    public final EObject ruleSmartfieldElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_logic_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2419:28: ( (otherlv_0= 'smartfield ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleSmartFieldElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2420:1: (otherlv_0= 'smartfield ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleSmartFieldElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2420:1: (otherlv_0= 'smartfield ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleSmartFieldElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2420:3: otherlv_0= 'smartfield ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleSmartFieldElementProperties ) )* (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleSmartfieldElement5309); 

                	newLeafNode(otherlv_0, grammarAccess.getSmartfieldElementAccess().getSmartfieldKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2424:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2425:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2425:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2426:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmartfieldElement5326); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSmartfieldElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmartfieldElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2442:2: ( (lv_properties_2_0= ruleSmartFieldElementProperties ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=12 && LA33_0<=16)||(LA33_0>=43 && LA33_0<=45)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2443:1: (lv_properties_2_0= ruleSmartFieldElementProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2443:1: (lv_properties_2_0= ruleSmartFieldElementProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2444:3: lv_properties_2_0= ruleSmartFieldElementProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSmartfieldElementAccess().getPropertiesSmartFieldElementPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSmartFieldElementProperties_in_ruleSmartfieldElement5352);
            	    lv_properties_2_0=ruleSmartFieldElementProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSmartfieldElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"SmartFieldElementProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2460:3: (otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2460:5: otherlv_3= '{' ( (lv_logic_4_0= ruleLogicElement ) )+ otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSmartfieldElement5366); 

                        	newLeafNode(otherlv_3, grammarAccess.getSmartfieldElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2464:1: ( (lv_logic_4_0= ruleLogicElement ) )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==26) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2465:1: (lv_logic_4_0= ruleLogicElement )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2465:1: (lv_logic_4_0= ruleLogicElement )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2466:3: lv_logic_4_0= ruleLogicElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSmartfieldElementAccess().getLogicLogicElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicElement_in_ruleSmartfieldElement5387);
                    	    lv_logic_4_0=ruleLogicElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSmartfieldElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"logic",
                    	            		lv_logic_4_0, 
                    	            		"LogicElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSmartfieldElement5400); 

                        	newLeafNode(otherlv_5, grammarAccess.getSmartfieldElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartfieldElement"


    // $ANTLR start "entryRuleSmartFieldElementProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2494:1: entryRuleSmartFieldElementProperties returns [EObject current=null] : iv_ruleSmartFieldElementProperties= ruleSmartFieldElementProperties EOF ;
    public final EObject entryRuleSmartFieldElementProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartFieldElementProperties = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2495:2: (iv_ruleSmartFieldElementProperties= ruleSmartFieldElementProperties EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2496:2: iv_ruleSmartFieldElementProperties= ruleSmartFieldElementProperties EOF
            {
             newCompositeNode(grammarAccess.getSmartFieldElementPropertiesRule()); 
            pushFollow(FOLLOW_ruleSmartFieldElementProperties_in_entryRuleSmartFieldElementProperties5438);
            iv_ruleSmartFieldElementProperties=ruleSmartFieldElementProperties();

            state._fsp--;

             current =iv_ruleSmartFieldElementProperties; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartFieldElementProperties5448); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartFieldElementProperties"


    // $ANTLR start "ruleSmartFieldElementProperties"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2503:1: ruleSmartFieldElementProperties returns [EObject current=null] : ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_code_1_0= ruleSmartfieldElementCodeAttribute ) ) | ( (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute ) ) | ( (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute ) ) ) ;
    public final EObject ruleSmartFieldElementProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_valueFieldProperties_0_0 = null;

        EObject lv_code_1_0 = null;

        EObject lv_value_type_2_0 = null;

        EObject lv_lookup_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2506:28: ( ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_code_1_0= ruleSmartfieldElementCodeAttribute ) ) | ( (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute ) ) | ( (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2507:1: ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_code_1_0= ruleSmartfieldElementCodeAttribute ) ) | ( (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute ) ) | ( (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2507:1: ( ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) ) | ( (lv_code_1_0= ruleSmartfieldElementCodeAttribute ) ) | ( (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute ) ) | ( (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute ) ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt36=1;
                }
                break;
            case 43:
                {
                alt36=2;
                }
                break;
            case 44:
                {
                alt36=3;
                }
                break;
            case 45:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2507:2: ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2507:2: ( (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2508:1: (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2508:1: (lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2509:3: lv_valueFieldProperties_0_0= ruleAbstractValueFieldProperties
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmartFieldElementPropertiesAccess().getValueFieldPropertiesAbstractValueFieldPropertiesParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAbstractValueFieldProperties_in_ruleSmartFieldElementProperties5494);
                    lv_valueFieldProperties_0_0=ruleAbstractValueFieldProperties();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmartFieldElementPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"valueFieldProperties",
                            		lv_valueFieldProperties_0_0, 
                            		"AbstractValueFieldProperties");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2526:6: ( (lv_code_1_0= ruleSmartfieldElementCodeAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2526:6: ( (lv_code_1_0= ruleSmartfieldElementCodeAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2527:1: (lv_code_1_0= ruleSmartfieldElementCodeAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2527:1: (lv_code_1_0= ruleSmartfieldElementCodeAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2528:3: lv_code_1_0= ruleSmartfieldElementCodeAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmartFieldElementPropertiesAccess().getCodeSmartfieldElementCodeAttributeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSmartfieldElementCodeAttribute_in_ruleSmartFieldElementProperties5521);
                    lv_code_1_0=ruleSmartfieldElementCodeAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmartFieldElementPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"code",
                            		lv_code_1_0, 
                            		"SmartfieldElementCodeAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2545:6: ( (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2545:6: ( (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2546:1: (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2546:1: (lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2547:3: lv_value_type_2_0= ruleSmartfieldElementValueTypeAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmartFieldElementPropertiesAccess().getValue_typeSmartfieldElementValueTypeAttributeParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_ruleSmartFieldElementProperties5548);
                    lv_value_type_2_0=ruleSmartfieldElementValueTypeAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmartFieldElementPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"value_type",
                            		lv_value_type_2_0, 
                            		"SmartfieldElementValueTypeAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2564:6: ( (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute ) )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2564:6: ( (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute ) )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2565:1: (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2565:1: (lv_lookup_3_0= ruleSmartfieldElementLookupAttribute )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2566:3: lv_lookup_3_0= ruleSmartfieldElementLookupAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getSmartFieldElementPropertiesAccess().getLookupSmartfieldElementLookupAttributeParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSmartfieldElementLookupAttribute_in_ruleSmartFieldElementProperties5575);
                    lv_lookup_3_0=ruleSmartfieldElementLookupAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSmartFieldElementPropertiesRule());
                    	        }
                           		set(
                           			current, 
                           			"lookup",
                            		lv_lookup_3_0, 
                            		"SmartfieldElementLookupAttribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartFieldElementProperties"


    // $ANTLR start "entryRuleSmartfieldElementCodeAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2590:1: entryRuleSmartfieldElementCodeAttribute returns [EObject current=null] : iv_ruleSmartfieldElementCodeAttribute= ruleSmartfieldElementCodeAttribute EOF ;
    public final EObject entryRuleSmartfieldElementCodeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartfieldElementCodeAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2591:2: (iv_ruleSmartfieldElementCodeAttribute= ruleSmartfieldElementCodeAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2592:2: iv_ruleSmartfieldElementCodeAttribute= ruleSmartfieldElementCodeAttribute EOF
            {
             newCompositeNode(grammarAccess.getSmartfieldElementCodeAttributeRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElementCodeAttribute_in_entryRuleSmartfieldElementCodeAttribute5611);
            iv_ruleSmartfieldElementCodeAttribute=ruleSmartfieldElementCodeAttribute();

            state._fsp--;

             current =iv_ruleSmartfieldElementCodeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElementCodeAttribute5621); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartfieldElementCodeAttribute"


    // $ANTLR start "ruleSmartfieldElementCodeAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2599:1: ruleSmartfieldElementCodeAttribute returns [EObject current=null] : (otherlv_0= 'code=' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSmartfieldElementCodeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2602:28: ( (otherlv_0= 'code=' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2603:1: (otherlv_0= 'code=' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2603:1: (otherlv_0= 'code=' ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2603:3: otherlv_0= 'code=' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleSmartfieldElementCodeAttribute5658); 

                	newLeafNode(otherlv_0, grammarAccess.getSmartfieldElementCodeAttributeAccess().getCodeKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2607:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2608:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2608:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2609:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmartfieldElementCodeAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmartfieldElementCodeAttribute5678); 

            		newLeafNode(otherlv_1, grammarAccess.getSmartfieldElementCodeAttributeAccess().getValueCodeElementCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartfieldElementCodeAttribute"


    // $ANTLR start "entryRuleSmartfieldElementValueTypeAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2628:1: entryRuleSmartfieldElementValueTypeAttribute returns [EObject current=null] : iv_ruleSmartfieldElementValueTypeAttribute= ruleSmartfieldElementValueTypeAttribute EOF ;
    public final EObject entryRuleSmartfieldElementValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartfieldElementValueTypeAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2629:2: (iv_ruleSmartfieldElementValueTypeAttribute= ruleSmartfieldElementValueTypeAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2630:2: iv_ruleSmartfieldElementValueTypeAttribute= ruleSmartfieldElementValueTypeAttribute EOF
            {
             newCompositeNode(grammarAccess.getSmartfieldElementValueTypeAttributeRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_entryRuleSmartfieldElementValueTypeAttribute5714);
            iv_ruleSmartfieldElementValueTypeAttribute=ruleSmartfieldElementValueTypeAttribute();

            state._fsp--;

             current =iv_ruleSmartfieldElementValueTypeAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElementValueTypeAttribute5724); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartfieldElementValueTypeAttribute"


    // $ANTLR start "ruleSmartfieldElementValueTypeAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2637:1: ruleSmartfieldElementValueTypeAttribute returns [EObject current=null] : (otherlv_0= 'value_type=' ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleSmartfieldElementValueTypeAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2640:28: ( (otherlv_0= 'value_type=' ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2641:1: (otherlv_0= 'value_type=' ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2641:1: (otherlv_0= 'value_type=' ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2641:3: otherlv_0= 'value_type=' ( (lv_value_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleSmartfieldElementValueTypeAttribute5761); 

                	newLeafNode(otherlv_0, grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValue_typeKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2645:1: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2646:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2646:1: (lv_value_1_0= RULE_STRING )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2647:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSmartfieldElementValueTypeAttribute5778); 

            			newLeafNode(lv_value_1_0, grammarAccess.getSmartfieldElementValueTypeAttributeAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmartfieldElementValueTypeAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartfieldElementValueTypeAttribute"


    // $ANTLR start "entryRuleSmartfieldElementLookupAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2671:1: entryRuleSmartfieldElementLookupAttribute returns [EObject current=null] : iv_ruleSmartfieldElementLookupAttribute= ruleSmartfieldElementLookupAttribute EOF ;
    public final EObject entryRuleSmartfieldElementLookupAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmartfieldElementLookupAttribute = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2672:2: (iv_ruleSmartfieldElementLookupAttribute= ruleSmartfieldElementLookupAttribute EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2673:2: iv_ruleSmartfieldElementLookupAttribute= ruleSmartfieldElementLookupAttribute EOF
            {
             newCompositeNode(grammarAccess.getSmartfieldElementLookupAttributeRule()); 
            pushFollow(FOLLOW_ruleSmartfieldElementLookupAttribute_in_entryRuleSmartfieldElementLookupAttribute5819);
            iv_ruleSmartfieldElementLookupAttribute=ruleSmartfieldElementLookupAttribute();

            state._fsp--;

             current =iv_ruleSmartfieldElementLookupAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmartfieldElementLookupAttribute5829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmartfieldElementLookupAttribute"


    // $ANTLR start "ruleSmartfieldElementLookupAttribute"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2680:1: ruleSmartfieldElementLookupAttribute returns [EObject current=null] : (otherlv_0= 'lookup=' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSmartfieldElementLookupAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2683:28: ( (otherlv_0= 'lookup=' ( (otherlv_1= RULE_ID ) ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2684:1: (otherlv_0= 'lookup=' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2684:1: (otherlv_0= 'lookup=' ( (otherlv_1= RULE_ID ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2684:3: otherlv_0= 'lookup=' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleSmartfieldElementLookupAttribute5866); 

                	newLeafNode(otherlv_0, grammarAccess.getSmartfieldElementLookupAttributeAccess().getLookupKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2688:1: ( (otherlv_1= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2689:1: (otherlv_1= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2689:1: (otherlv_1= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2690:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSmartfieldElementLookupAttributeRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmartfieldElementLookupAttribute5886); 

            		newLeafNode(otherlv_1, grammarAccess.getSmartfieldElementLookupAttributeAccess().getValueLookupElementCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmartfieldElementLookupAttribute"


    // $ANTLR start "entryRuleZregBoxElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2709:1: entryRuleZregBoxElement returns [EObject current=null] : iv_ruleZregBoxElement= ruleZregBoxElement EOF ;
    public final EObject entryRuleZregBoxElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZregBoxElement = null;


        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2710:2: (iv_ruleZregBoxElement= ruleZregBoxElement EOF )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2711:2: iv_ruleZregBoxElement= ruleZregBoxElement EOF
            {
             newCompositeNode(grammarAccess.getZregBoxElementRule()); 
            pushFollow(FOLLOW_ruleZregBoxElement_in_entryRuleZregBoxElement5922);
            iv_ruleZregBoxElement=ruleZregBoxElement();

            state._fsp--;

             current =iv_ruleZregBoxElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleZregBoxElement5932); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleZregBoxElement"


    // $ANTLR start "ruleZregBoxElement"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2718:1: ruleZregBoxElement returns [EObject current=null] : (otherlv_0= 'zreg_sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleZregBoxElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2721:28: ( (otherlv_0= 'zreg_sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2722:1: (otherlv_0= 'zreg_sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2722:1: (otherlv_0= 'zreg_sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )? )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2722:3: otherlv_0= 'zreg_sequence_box ' ( (lv_name_1_0= RULE_ID ) ) ( (lv_properties_2_0= ruleAbstractFieldProperties ) )* (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleZregBoxElement5969); 

                	newLeafNode(otherlv_0, grammarAccess.getZregBoxElementAccess().getZreg_sequence_boxKeyword_0());
                
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2726:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2727:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2727:1: (lv_name_1_0= RULE_ID )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2728:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleZregBoxElement5986); 

            			newLeafNode(lv_name_1_0, grammarAccess.getZregBoxElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getZregBoxElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2744:2: ( (lv_properties_2_0= ruleAbstractFieldProperties ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=12 && LA37_0<=15)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2745:1: (lv_properties_2_0= ruleAbstractFieldProperties )
            	    {
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2745:1: (lv_properties_2_0= ruleAbstractFieldProperties )
            	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2746:3: lv_properties_2_0= ruleAbstractFieldProperties
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getZregBoxElementAccess().getPropertiesAbstractFieldPropertiesParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractFieldProperties_in_ruleZregBoxElement6012);
            	    lv_properties_2_0=ruleAbstractFieldProperties();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getZregBoxElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"properties",
            	            		lv_properties_2_0, 
            	            		"AbstractFieldProperties");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2762:3: (otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==21) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2762:5: otherlv_3= '{' ( (lv_children_4_0= ruleLogicElement ) )* otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleZregBoxElement6026); 

                        	newLeafNode(otherlv_3, grammarAccess.getZregBoxElementAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2766:1: ( (lv_children_4_0= ruleLogicElement ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==26) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2767:1: (lv_children_4_0= ruleLogicElement )
                    	    {
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2767:1: (lv_children_4_0= ruleLogicElement )
                    	    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2768:3: lv_children_4_0= ruleLogicElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getZregBoxElementAccess().getChildrenLogicElementParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLogicElement_in_ruleZregBoxElement6047);
                    	    lv_children_4_0=ruleLogicElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getZregBoxElementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"children",
                    	            		lv_children_4_0, 
                    	            		"LogicElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleZregBoxElement6060); 

                        	newLeafNode(otherlv_5, grammarAccess.getZregBoxElementAccess().getRightCurlyBracketKeyword_3_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleZregBoxElement"


    // $ANTLR start "ruleBooleanType"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2796:1: ruleBooleanType returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBooleanType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2798:28: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2799:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2799:1: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            else if ( (LA40_0==48) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2799:2: (enumLiteral_0= 'true' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2799:2: (enumLiteral_0= 'true' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2799:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleBooleanType6112); 

                            current = grammarAccess.getBooleanTypeAccess().getTrueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanTypeAccess().getTrueEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2805:6: (enumLiteral_1= 'false' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2805:6: (enumLiteral_1= 'false' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2805:8: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleBooleanType6129); 

                            current = grammarAccess.getBooleanTypeAccess().getFalseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanTypeAccess().getFalseEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "ruleJavaRunAtAttributeList"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2815:1: ruleJavaRunAtAttributeList returns [Enumerator current=null] : ( (enumLiteral_0= 'client' ) | (enumLiteral_1= 'server' ) ) ;
    public final Enumerator ruleJavaRunAtAttributeList() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2817:28: ( ( (enumLiteral_0= 'client' ) | (enumLiteral_1= 'server' ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2818:1: ( (enumLiteral_0= 'client' ) | (enumLiteral_1= 'server' ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2818:1: ( (enumLiteral_0= 'client' ) | (enumLiteral_1= 'server' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==49) ) {
                alt41=1;
            }
            else if ( (LA41_0==50) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2818:2: (enumLiteral_0= 'client' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2818:2: (enumLiteral_0= 'client' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2818:4: enumLiteral_0= 'client'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_49_in_ruleJavaRunAtAttributeList6174); 

                            current = grammarAccess.getJavaRunAtAttributeListAccess().getClientEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getJavaRunAtAttributeListAccess().getClientEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2824:6: (enumLiteral_1= 'server' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2824:6: (enumLiteral_1= 'server' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2824:8: enumLiteral_1= 'server'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_50_in_ruleJavaRunAtAttributeList6191); 

                            current = grammarAccess.getJavaRunAtAttributeListAccess().getServerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getJavaRunAtAttributeListAccess().getServerEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaRunAtAttributeList"


    // $ANTLR start "ruleLogicTypeAttributeList"
    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2834:1: ruleLogicTypeAttributeList returns [Enumerator current=null] : ( (enumLiteral_0= 'global' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'modify_load' ) | (enumLiteral_3= 'modify_store' ) | (enumLiteral_4= 'new_load' ) | (enumLiteral_5= 'new_store' ) | (enumLiteral_6= 'changed' ) | (enumLiteral_7= 'click' ) | (enumLiteral_8= 'master_changed' ) | (enumLiteral_9= 'init' ) ) ;
    public final Enumerator ruleLogicTypeAttributeList() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;

         enterRule(); 
        try {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2836:28: ( ( (enumLiteral_0= 'global' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'modify_load' ) | (enumLiteral_3= 'modify_store' ) | (enumLiteral_4= 'new_load' ) | (enumLiteral_5= 'new_store' ) | (enumLiteral_6= 'changed' ) | (enumLiteral_7= 'click' ) | (enumLiteral_8= 'master_changed' ) | (enumLiteral_9= 'init' ) ) )
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2837:1: ( (enumLiteral_0= 'global' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'modify_load' ) | (enumLiteral_3= 'modify_store' ) | (enumLiteral_4= 'new_load' ) | (enumLiteral_5= 'new_store' ) | (enumLiteral_6= 'changed' ) | (enumLiteral_7= 'click' ) | (enumLiteral_8= 'master_changed' ) | (enumLiteral_9= 'init' ) )
            {
            // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2837:1: ( (enumLiteral_0= 'global' ) | (enumLiteral_1= 'all' ) | (enumLiteral_2= 'modify_load' ) | (enumLiteral_3= 'modify_store' ) | (enumLiteral_4= 'new_load' ) | (enumLiteral_5= 'new_store' ) | (enumLiteral_6= 'changed' ) | (enumLiteral_7= 'click' ) | (enumLiteral_8= 'master_changed' ) | (enumLiteral_9= 'init' ) )
            int alt42=10;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt42=1;
                }
                break;
            case 52:
                {
                alt42=2;
                }
                break;
            case 53:
                {
                alt42=3;
                }
                break;
            case 54:
                {
                alt42=4;
                }
                break;
            case 55:
                {
                alt42=5;
                }
                break;
            case 56:
                {
                alt42=6;
                }
                break;
            case 57:
                {
                alt42=7;
                }
                break;
            case 58:
                {
                alt42=8;
                }
                break;
            case 59:
                {
                alt42=9;
                }
                break;
            case 60:
                {
                alt42=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2837:2: (enumLiteral_0= 'global' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2837:2: (enumLiteral_0= 'global' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2837:4: enumLiteral_0= 'global'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleLogicTypeAttributeList6236); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getGlobalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getLogicTypeAttributeListAccess().getGlobalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2843:6: (enumLiteral_1= 'all' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2843:6: (enumLiteral_1= 'all' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2843:8: enumLiteral_1= 'all'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleLogicTypeAttributeList6253); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getAllEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getLogicTypeAttributeListAccess().getAllEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2849:6: (enumLiteral_2= 'modify_load' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2849:6: (enumLiteral_2= 'modify_load' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2849:8: enumLiteral_2= 'modify_load'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleLogicTypeAttributeList6270); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getModify_loadEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getLogicTypeAttributeListAccess().getModify_loadEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2855:6: (enumLiteral_3= 'modify_store' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2855:6: (enumLiteral_3= 'modify_store' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2855:8: enumLiteral_3= 'modify_store'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleLogicTypeAttributeList6287); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getModify_storeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getLogicTypeAttributeListAccess().getModify_storeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2861:6: (enumLiteral_4= 'new_load' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2861:6: (enumLiteral_4= 'new_load' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2861:8: enumLiteral_4= 'new_load'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_55_in_ruleLogicTypeAttributeList6304); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getNew_loadEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getLogicTypeAttributeListAccess().getNew_loadEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2867:6: (enumLiteral_5= 'new_store' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2867:6: (enumLiteral_5= 'new_store' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2867:8: enumLiteral_5= 'new_store'
                    {
                    enumLiteral_5=(Token)match(input,56,FOLLOW_56_in_ruleLogicTypeAttributeList6321); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getNew_storeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getLogicTypeAttributeListAccess().getNew_storeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2873:6: (enumLiteral_6= 'changed' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2873:6: (enumLiteral_6= 'changed' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2873:8: enumLiteral_6= 'changed'
                    {
                    enumLiteral_6=(Token)match(input,57,FOLLOW_57_in_ruleLogicTypeAttributeList6338); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getChangedEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getLogicTypeAttributeListAccess().getChangedEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2879:6: (enumLiteral_7= 'click' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2879:6: (enumLiteral_7= 'click' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2879:8: enumLiteral_7= 'click'
                    {
                    enumLiteral_7=(Token)match(input,58,FOLLOW_58_in_ruleLogicTypeAttributeList6355); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getClickEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getLogicTypeAttributeListAccess().getClickEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2885:6: (enumLiteral_8= 'master_changed' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2885:6: (enumLiteral_8= 'master_changed' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2885:8: enumLiteral_8= 'master_changed'
                    {
                    enumLiteral_8=(Token)match(input,59,FOLLOW_59_in_ruleLogicTypeAttributeList6372); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getMaster_changedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getLogicTypeAttributeListAccess().getMaster_changedEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2891:6: (enumLiteral_9= 'init' )
                    {
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2891:6: (enumLiteral_9= 'init' )
                    // ../org.eclipse.scout.saml/src-gen/org/eclipse/scout/saml/parser/antlr/internal/InternalSaml.g:2891:8: enumLiteral_9= 'init'
                    {
                    enumLiteral_9=(Token)match(input,60,FOLLOW_60_in_ruleLogicTypeAttributeList6389); 

                            current = grammarAccess.getLogicTypeAttributeListAccess().getInitEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getLogicTypeAttributeListAccess().getInitEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicTypeAttributeList"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRootElement_in_ruleModel130 = new BitSet(new long[]{0x0000000261060002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName218 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_11_in_ruleQualifiedName237 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName252 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleRootElement_in_entryRuleRootElement299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRootElement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleElement_in_ruleRootElement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTranslationElement_in_ruleRootElement383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_ruleRootElement410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookupElement_in_ruleRootElement437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElement_in_ruleRootElement464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_ruleRootElement491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldElement_in_entryRuleAbstractFieldElement528 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFieldElement538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldElement_in_ruleAbstractFieldElement585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractContainerFieldElement_in_ruleAbstractFieldElement612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_entryRuleAbstractFieldProperties647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractFieldProperties657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAttribute_in_ruleAbstractFieldProperties703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibleAttribue_in_ruleAbstractFieldProperties730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterAttribute_in_ruleAbstractFieldProperties757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnabledAttribue_in_ruleAbstractFieldProperties784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextAttribute_in_entryRuleTextAttribute820 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextAttribute830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTextAttribute867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextAttribute887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnabledAttribue_in_entryRuleEnabledAttribue923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnabledAttribue933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleEnabledAttribue970 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleEnabledAttribue991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibleAttribue_in_entryRuleVisibleAttribue1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibleAttribue1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleVisibleAttribue1074 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleVisibleAttribue1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMasterAttribute_in_entryRuleMasterAttribute1131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMasterAttribute1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleMasterAttribute1178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMasterAttribute1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldElement_in_entryRuleAbstractValueFieldElement1234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractValueFieldElement1244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_ruleAbstractValueFieldElement1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElement_in_ruleAbstractValueFieldElement1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongElement_in_ruleAbstractValueFieldElement1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleElement_in_ruleAbstractValueFieldElement1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateElement_in_ruleAbstractValueFieldElement1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZregBoxElement_in_ruleAbstractValueFieldElement1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_entryRuleAbstractValueFieldProperties1461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractValueFieldProperties1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_ruleAbstractValueFieldProperties1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryAttribue_in_ruleAbstractValueFieldProperties1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryAttribue_in_entryRuleMandatoryAttribue1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryAttribue1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleMandatoryAttribue1627 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleMandatoryAttribue1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractContainerFieldElement_in_entryRuleAbstractContainerFieldElement1684 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractContainerFieldElement1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceBoxElement_in_ruleAbstractContainerFieldElement1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModuleElement_in_entryRuleModuleElement1774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModuleElement1784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleModuleElement1821 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleModuleElement1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTranslationElement_in_entryRuleTranslationElement1878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTranslationElement1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTranslationElement1925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTranslationElement1946 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTranslationAttribute_in_ruleTranslationElement1967 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTranslationAttribute_in_entryRuleTranslationAttribute2004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTranslationAttribute2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTranslationAttribute2056 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTranslationAttribute2073 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTranslationAttribute2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJavaElement_in_entryRuleJavaElement2131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJavaElement2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleJavaElement2178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJavaElement2195 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleRunAtAttribute_in_ruleJavaElement2221 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleJavaElement2233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleJavaElement2250 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleJavaElement2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunAtAttribute_in_entryRuleRunAtAttribute2303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRunAtAttribute2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRunAtAttribute2350 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_ruleJavaRunAtAttributeList_in_ruleRunAtAttribute2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeElement_in_entryRuleCodeElement2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeElement2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleCodeElement2454 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCodeElement2471 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleCodeIdAttribute_in_ruleCodeElement2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCodeIdAttribute_in_entryRuleCodeIdAttribute2533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCodeIdAttribute2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCodeIdAttribute2580 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCodeIdAttribute2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicElement_in_entryRuleLogicElement2638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicElement2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLogicElement2685 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleLogicTypeAttribute_in_ruleLogicElement2706 = new BitSet(new long[]{0x0000000010A00002L});
    public static final BitSet FOLLOW_ruleLogicOptionalProperties_in_ruleLogicElement2727 = new BitSet(new long[]{0x0000000010A00002L});
    public static final BitSet FOLLOW_21_in_ruleLogicElement2741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLogicElement2758 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleLogicElement2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOptionalProperties_in_entryRuleLogicOptionalProperties2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOptionalProperties2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRunAtAttribute_in_ruleLogicOptionalProperties2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExecAttribute_in_ruleLogicOptionalProperties2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicTypeAttribute_in_entryRuleLogicTypeAttribute2932 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicTypeAttribute2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLogicTypeAttribute2979 = new BitSet(new long[]{0x1FF8000000000000L});
    public static final BitSet FOLLOW_ruleLogicTypeAttributeList_in_ruleLogicTypeAttribute3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicExecAttribute_in_entryRuleLogicExecAttribute3036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicExecAttribute3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLogicExecAttribute3083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLogicExecAttribute3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLookupElement_in_entryRuleLookupElement3139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLookupElement3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLookupElement3186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLookupElement3203 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLookupElement3220 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_ruleJavaElement_in_ruleLookupElement3243 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleLookupElement3262 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_22_in_ruleLookupElement3278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElement_in_entryRuleTemplateElement3314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateElement3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTemplateElement3361 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateElement3378 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleTemplateElementClassAttribute_in_ruleTemplateElement3404 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleTemplateElementReplacesAttribute_in_ruleTemplateElement3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElementClassAttribute_in_entryRuleTemplateElementClassAttribute3461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateElementClassAttribute3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTemplateElementClassAttribute3508 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateElementClassAttribute3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateElementReplacesAttribute_in_entryRuleTemplateElementReplacesAttribute3565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateElementReplacesAttribute3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTemplateElementReplacesAttribute3612 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateElementReplacesAttribute3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElement_in_entryRuleFormElement3668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElement3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormElement3715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormElement3732 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleFormElementModalAttribute_in_ruleFormElement3758 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_ruleTextAttribute_in_ruleFormElement3779 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ruleFormElementColumnsAttribute_in_ruleFormElement3800 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleFormElement3812 = new BitSet(new long[]{0x000047B004500000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleFormElement3835 = new BitSet(new long[]{0x000047B004500000L});
    public static final BitSet FOLLOW_ruleJavaElement_in_ruleFormElement3854 = new BitSet(new long[]{0x000047B004500000L});
    public static final BitSet FOLLOW_ruleAbstractFieldElement_in_ruleFormElement3873 = new BitSet(new long[]{0x000047B004500000L});
    public static final BitSet FOLLOW_22_in_ruleFormElement3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElementModalAttribute_in_entryRuleFormElementModalAttribute3925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElementModalAttribute3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFormElementModalAttribute3972 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_ruleBooleanType_in_ruleFormElementModalAttribute3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormElementColumnsAttribute_in_entryRuleFormElementColumnsAttribute4029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormElementColumnsAttribute4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFormElementColumnsAttribute4076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFormElementColumnsAttribute4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequenceBoxElement_in_entryRuleSequenceBoxElement4134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequenceBoxElement4144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleSequenceBoxElement4181 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequenceBoxElement4198 = new BitSet(new long[]{0x000000000020F002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_ruleSequenceBoxElement4224 = new BitSet(new long[]{0x000000000020F002L});
    public static final BitSet FOLLOW_21_in_ruleSequenceBoxElement4238 = new BitSet(new long[]{0x000047B004500000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleSequenceBoxElement4261 = new BitSet(new long[]{0x000047B004500000L});
    public static final BitSet FOLLOW_ruleAbstractFieldElement_in_ruleSequenceBoxElement4280 = new BitSet(new long[]{0x000047B004500000L});
    public static final BitSet FOLLOW_22_in_ruleSequenceBoxElement4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElement_in_entryRuleStringElement4334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElement4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStringElement4381 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStringElement4398 = new BitSet(new long[]{0x000000400021F002L});
    public static final BitSet FOLLOW_ruleStringElementProperties_in_ruleStringElement4424 = new BitSet(new long[]{0x000000400021F002L});
    public static final BitSet FOLLOW_21_in_ruleStringElement4438 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleStringElement4459 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_22_in_ruleStringElement4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElementProperties_in_entryRuleStringElementProperties4510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElementProperties4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_ruleStringElementProperties4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElementMaxlenAttribute_in_ruleStringElementProperties4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringElementMaxlenAttribute_in_entryRuleStringElementMaxlenAttribute4629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringElementMaxlenAttribute4639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStringElementMaxlenAttribute4676 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStringElementMaxlenAttribute4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoubleElement_in_entryRuleDoubleElement4734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoubleElement4744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleDoubleElement4781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDoubleElement4798 = new BitSet(new long[]{0x000000000021F002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_ruleDoubleElement4824 = new BitSet(new long[]{0x000000000021F002L});
    public static final BitSet FOLLOW_21_in_ruleDoubleElement4838 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleDoubleElement4859 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_22_in_ruleDoubleElement4872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLongElement_in_entryRuleLongElement4910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLongElement4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLongElement4957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLongElement4974 = new BitSet(new long[]{0x000000000021F002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_ruleLongElement5000 = new BitSet(new long[]{0x000000000021F002L});
    public static final BitSet FOLLOW_21_in_ruleLongElement5014 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleLongElement5035 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_22_in_ruleLongElement5048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDateElement_in_entryRuleDateElement5086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDateElement5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDateElement5133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDateElement5150 = new BitSet(new long[]{0x000000000021F002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_ruleDateElement5176 = new BitSet(new long[]{0x000000000021F002L});
    public static final BitSet FOLLOW_21_in_ruleDateElement5190 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleDateElement5211 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_22_in_ruleDateElement5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElement_in_entryRuleSmartfieldElement5262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElement5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSmartfieldElement5309 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmartfieldElement5326 = new BitSet(new long[]{0x000038000021F002L});
    public static final BitSet FOLLOW_ruleSmartFieldElementProperties_in_ruleSmartfieldElement5352 = new BitSet(new long[]{0x000038000021F002L});
    public static final BitSet FOLLOW_21_in_ruleSmartfieldElement5366 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleSmartfieldElement5387 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_22_in_ruleSmartfieldElement5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartFieldElementProperties_in_entryRuleSmartFieldElementProperties5438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartFieldElementProperties5448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractValueFieldProperties_in_ruleSmartFieldElementProperties5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementCodeAttribute_in_ruleSmartFieldElementProperties5521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_ruleSmartFieldElementProperties5548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementLookupAttribute_in_ruleSmartFieldElementProperties5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementCodeAttribute_in_entryRuleSmartfieldElementCodeAttribute5611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElementCodeAttribute5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleSmartfieldElementCodeAttribute5658 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmartfieldElementCodeAttribute5678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementValueTypeAttribute_in_entryRuleSmartfieldElementValueTypeAttribute5714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElementValueTypeAttribute5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSmartfieldElementValueTypeAttribute5761 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSmartfieldElementValueTypeAttribute5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSmartfieldElementLookupAttribute_in_entryRuleSmartfieldElementLookupAttribute5819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmartfieldElementLookupAttribute5829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleSmartfieldElementLookupAttribute5866 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmartfieldElementLookupAttribute5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleZregBoxElement_in_entryRuleZregBoxElement5922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleZregBoxElement5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleZregBoxElement5969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleZregBoxElement5986 = new BitSet(new long[]{0x000000000020F002L});
    public static final BitSet FOLLOW_ruleAbstractFieldProperties_in_ruleZregBoxElement6012 = new BitSet(new long[]{0x000000000020F002L});
    public static final BitSet FOLLOW_21_in_ruleZregBoxElement6026 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_ruleLogicElement_in_ruleZregBoxElement6047 = new BitSet(new long[]{0x0000000004500000L});
    public static final BitSet FOLLOW_22_in_ruleZregBoxElement6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleBooleanType6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleBooleanType6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleJavaRunAtAttributeList6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleJavaRunAtAttributeList6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleLogicTypeAttributeList6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLogicTypeAttributeList6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLogicTypeAttributeList6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleLogicTypeAttributeList6287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleLogicTypeAttributeList6304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLogicTypeAttributeList6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLogicTypeAttributeList6338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleLogicTypeAttributeList6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleLogicTypeAttributeList6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleLogicTypeAttributeList6389 = new BitSet(new long[]{0x0000000000000002L});

}