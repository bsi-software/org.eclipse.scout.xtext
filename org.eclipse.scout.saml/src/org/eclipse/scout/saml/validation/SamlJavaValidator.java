package org.eclipse.scout.saml.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.LanguageAttribute;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

public class SamlJavaValidator extends AbstractSamlJavaValidator implements ISamlValidatorConstants {

  @Inject
  SamlJavaValidatorHelper helper;

  @Inject
  SamlGrammarAccess grammar;

  @Check
  public void checkLogicElement(LogicElement logicElement) {
    // is code defined also the placement must be defined
    if (logicElement.getSource() != null && logicElement.getPlacement() == null) {
      error(MSG_PLACEMENT_MANDATORY, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, PLACEMENT_MANDATORY);
    }

    // lookup services can only contain server logic
    if (logicElement.eContainer() instanceof LookupElement) {
      if (logicElement.getPlacement() != null && !logicElement.getPlacement().equals(grammar.getLogicElementAccess().getPlacementServerKeyword_3_1_2_0_1().getValue())) {
        error(MSG_PLACEMENT_SERVER_ONLY_FOR_LOOKUP, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__PLACEMENT, PLACEMENT_SERVER_ONLY_FOR_LOOKUP);
      }
    }

    if (logicElement.getName() != null) {
      // named logic elements 
      if (logicElement.getSource() == null) {
        error(MSG_NAMED_LOGIC_ELEMENTS_NEEDS_SOURCE, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, INVALID_LOGIC_ELEMENT);
      }
      if (logicElement.getEvent() != null) {
        error(MSG_NAMED_LOGIC_ELEMENTS_NO_EVENT, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__EVENT, INVALID_LOGIC_ELEMENT);
      }
      if (logicElement.getExec() != null) {
        error(MSG_NAMED_LOGIC_NO_EXEC, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__EXEC, INVALID_LOGIC_ELEMENT);
      }
    }
    else {
      if (logicElement.getEvent() != null) {
        Set<String> possibilities = getPossibleLogicEventsFor(logicElement.eContainer());
        if (!possibilities.contains(logicElement.getEvent())) {
          error(MSG_WRONG_LOGIC_EVENT, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__EVENT, INVALID_LOGIC_ELEMENT);
        }
      }
    }

    if (logicElement.getExec() == null && logicElement.getSource() == null) {
      error(MSG_SOURCE_LINKED_OR_GIVEN, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, INVALID_LOGIC_ELEMENT);
    }
    else if (logicElement.getExec() != null && logicElement.getSource() != null) {
      error(MSG_SOURCE_LINKED_OR_GIVEN, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, INVALID_LOGIC_ELEMENT);
    }

    if (helper.hasGlobalDuplicate(logicElement, SamlPackage.eINSTANCE.getLogicElement())) {
      error(MSG_DUPLICATE, SamlPackage.Literals.LOGIC_ELEMENT__NAME, DUPLICATE);
    }
  }

  private Set<String> getPossibleLogicEventsFor(EObject container) {
    if (container instanceof FormElement) {
      return newSet(grammar.getLogicEventTypeAccess().getModify_loadKeyword_1().getValue(),
          grammar.getLogicEventTypeAccess().getModify_storeKeyword_2().getValue(),
          grammar.getLogicEventTypeAccess().getNew_loadKeyword_3().getValue(),
          grammar.getLogicEventTypeAccess().getNew_storeKeyword_4().getValue());
    }
    else if (container instanceof ButtonElement || container instanceof MenuElement) {
      return newSet(grammar.getLogicEventTypeAccess().getClickKeyword_6().getValue());
    }
    else if (container instanceof LookupElement) {
      return newSet(grammar.getLogicEventTypeAccess().getAllKeyword_0().getValue());
    }
    else if (container instanceof ValueFieldElement) {
      return newSet(grammar.getLogicEventTypeAccess().getChangedKeyword_5().getValue(),
          grammar.getLogicEventTypeAccess().getFormat_valueKeyword_9().getValue(),
          grammar.getLogicEventTypeAccess().getMaster_changedKeyword_7().getValue(),
          grammar.getLogicEventTypeAccess().getInitKeyword_8().getValue());
    }
    else if (container instanceof FormFieldElement) {
      return newSet(grammar.getLogicEventTypeAccess().getMaster_changedKeyword_7().getValue(),
          grammar.getLogicEventTypeAccess().getInitKeyword_8().getValue());
    }
    else if (container instanceof TableElement) {
      return newSet(grammar.getLogicEventTypeAccess().getInitKeyword_8().getValue());
    }

    return newSet();
  }

  private static <T> Set<T> newSet(T... ts) {
    HashSet<T> ret = new HashSet<T>(ts.length);
    for (T t : ts) {
      ret.add(t);
    }
    return ret;
  }

  @Check
  public void checkFormFieldNameUniqueness(FormElement formElement) {
    if (helper.hasDuplicate(helper.allFieldsOfForm(formElement))) {
      error(MSG_DUPLICATE_FIELD, formElement, SamlPackage.Literals.FORM_ELEMENT__FIELDS, DUPLICATE);
    }
  }

  @Check
  public void checkTranslationAttributes(TranslationElement e) {
    HashSet<String> attribNames = new HashSet<String>(e.getTranslations().size());
    for (LanguageAttribute l : e.getTranslations()) {
      if (!attribNames.add(l.getLang())) {
        error(MSG_DUPLICATE_LANG, e, SamlPackage.Literals.TRANSLATION_ELEMENT__TRANSLATIONS, DUPLICATE);
        return;
      }
    }
  }

  @Check
  public void checkNoGlobalTopLevelDuplicates(Model element) {
    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getTranslationElement())) {
      error(MSG_DUPLICATE, null, DUPLICATE);
    }

    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getFormElement())) {
      error(MSG_DUPLICATE, null, DUPLICATE);
    }

    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getLookupElement())) {
      error(MSG_DUPLICATE, null, DUPLICATE);
    }

    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getCodeElement())) {
      error(MSG_DUPLICATE, null, DUPLICATE);
    }

    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getTemplateElement())) {
      error(MSG_DUPLICATE, null, DUPLICATE);
    }
  }
}
