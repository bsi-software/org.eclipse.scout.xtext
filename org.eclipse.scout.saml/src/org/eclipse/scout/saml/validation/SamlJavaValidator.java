package org.eclipse.scout.saml.validation;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.saml.saml.LanguageAttribute;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.scout.sdk.internal.workspace.ScoutWorkspace;
import org.eclipse.scout.sdk.workspace.IScoutProject;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
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

    if (logicElement.eContainer() instanceof Model) {
      // top level logic elements must define a name (references only)
      if (logicElement.getName() == null) {
        error(MSG_ONLY_NAMED_LOGIC_ON_TOP_LEVEL, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__NAME, INVALID_LOGIC_ELEMENT);
      }
    }

    if (logicElement.getName() != null) {
      // named logic elements must have source 
      if (logicElement.getSource() == null) {
        error(MSG_NAMED_LOGIC_ELEMENTS_NEEDS_SOURCE, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, INVALID_LOGIC_ELEMENT);
      }
      // named logic elements must not specify the event
      if (logicElement.getEvent() != null) {
        error(MSG_NAMED_LOGIC_ELEMENTS_NO_EVENT, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__EVENT, INVALID_LOGIC_ELEMENT);
      }
      // named logic elements must not specify an exec property
      if (logicElement.getExec() != null) {
        error(MSG_NAMED_LOGIC_NO_EXEC, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__EXEC, INVALID_LOGIC_ELEMENT);
      }

      // named logic elements must have unique name
      if (helper.hasGlobalDuplicate(logicElement, SamlPackage.eINSTANCE.getLogicElement())) {
        error(MSG_DUPLICATE, SamlPackage.Literals.LOGIC_ELEMENT__NAME, DUPLICATE);
      }
    }
    else {
      if (logicElement.getEvent() != null) {
        // check if the event is valid for the container of the logic element
        Set<String> possibilities = getPossibleLogicEventsFor(logicElement.eContainer());
        if (!possibilities.contains(logicElement.getEvent())) {
          error(MSG_WRONG_LOGIC_EVENT, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__EVENT, INVALID_LOGIC_ELEMENT);
        }
      }
    }

    // logic element must specify an exec or have source. exact one option must be present.
    if (logicElement.getExec() == null && logicElement.getSource() == null) {
      error(MSG_SOURCE_LINKED_OR_GIVEN, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, INVALID_LOGIC_ELEMENT);
    }
    else if (logicElement.getExec() != null && logicElement.getSource() != null) {
      error(MSG_SOURCE_LINKED_OR_GIVEN, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, INVALID_LOGIC_ELEMENT);
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
    else if (container instanceof KeyElement) {
      return newSet(grammar.getLogicEventTypeAccess().getActivatedKeyword_10().getValue());
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
    // check for duplicate languages
    HashSet<String> attribNames = new HashSet<String>(e.getTranslations().size());
    for (LanguageAttribute l : e.getTranslations()) {
      if (!attribNames.add(l.getLang())) {
        error(MSG_DUPLICATE_LANG, e, SamlPackage.Literals.TRANSLATION_ELEMENT__TRANSLATIONS, DUPLICATE);
        return;
      }
    }

    // check if a default language is specified
    if (!attribNames.contains(DEFAULT_LANG_NAME)) {
      warning(MSG_DEFAULT_LANG_MISSING, e, SamlPackage.Literals.TRANSLATION_ELEMENT__TRANSLATIONS, DEFAULT_LANG_MISSING);
    }
  }

  @Check
  public void checkModule(ModuleElement module) {
    if (PDECore.getDefault() == null) {
      // we are running as JUnit test: don't check module
      return;
    }
    IScoutProject[] roots = ScoutWorkspace.getInstance().getRootProjects();
    LinkedList<IScoutProject> collector = new LinkedList<IScoutProject>();
    if (roots != null && roots.length > 0) {
      for (IScoutProject p : roots) {
        collectProjectsRec(p, collector);
      }
    }
    for (IScoutProject p : collector) {
      if (StringUtility.hasText(module.getName()) && module.getName().equals(p.getProjectName())) {
        return;
      }
    }
    warning(INVALID_MODULE_NOT_FOUND, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE);
  }

  private void collectProjectsRec(IScoutProject p, List<IScoutProject> collector) {
    if (p != null) {
      collector.add(p);
      for (IScoutProject child : p.getSubProjects()) {
        collectProjectsRec(child, collector);
      }
    }
  }

  @Check
  public void checkNoTranslationDuplicates(TranslationElement element) {
    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getTranslationElement())) {
      error(MSG_DUPLICATE, SamlPackage.eINSTANCE.getTranslationElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoLogicDuplicates(LogicElement element) {
    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getLogicElement())) {
      error(MSG_DUPLICATE, SamlPackage.eINSTANCE.getLogicElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoFormDuplicates(FormElement element) {
    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getFormElement())) {
      error(MSG_DUPLICATE, SamlPackage.eINSTANCE.getFormElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoLookupDuplicates(LookupElement element) {
    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getLookupElement())) {
      error(MSG_DUPLICATE, SamlPackage.eINSTANCE.getLookupElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoCodeDuplicates(CodeElement element) {
    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getCodeElement())) {
      error(MSG_DUPLICATE, SamlPackage.eINSTANCE.getCodeElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoTemplateDuplicates(TemplateElement element) {
    if (helper.hasGlobalDuplicate(element, SamlPackage.eINSTANCE.getTemplateElement())) {
      error(MSG_DUPLICATE, SamlPackage.eINSTANCE.getTemplateElement_Name(), DUPLICATE);
    }
  }
}
