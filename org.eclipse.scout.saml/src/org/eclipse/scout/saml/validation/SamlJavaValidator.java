package org.eclipse.scout.saml.validation;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.scout.commons.CompareUtility;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.module.SamlModule;
import org.eclipse.scout.saml.saml.BigDecimalElement;
import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FileChooserElement;
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
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.TabBoxElement;
import org.eclipse.scout.saml.saml.TabElement;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;
import org.eclipse.scout.sdk.workspace.type.ScoutTypeUtility;
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

    // code elements can only contain inline logic
    if (logicElement.eContainer() instanceof CodeElement) {
      if (logicElement.getPlacement() != null && !logicElement.getPlacement().equals(grammar.getLogicElementAccess().getPlacementInlineKeyword_3_1_2_0_2().getValue())) {
        error(MSG_PLACEMENT_INLINE_ONLY_FOR_CODE, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__PLACEMENT, PLACEMENT_INLINE_ONLY_FOR_CODE);
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
      if (helper.hasGlobalDuplicate(logicElement.getName(), logicElement)) {
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

    // format_value event does not allow server logic
    if (grammar.getLogicEventTypeAccess().getFormat_valueKeyword_11().getValue().equals(logicElement.getEvent()) &&
        !grammar.getLogicElementAccess().getPlacementInlineKeyword_3_1_2_0_2().getValue().equals(logicElement.getPlacement())) {
      error(MSG_EVENT_ONLY_INLINE, logicElement, SamlPackage.Literals.LOGIC_ELEMENT__PLACEMENT, INVALID_LOGIC_ELEMENT);
    }
  }

  private Set<String> getPossibleLogicEventsFor(EObject container) {
    if (container instanceof FormElement) {
      return newSet(
          grammar.getLogicEventTypeAccess().getModify_loadKeyword_1().getValue(),
          grammar.getLogicEventTypeAccess().getModify_storeKeyword_2().getValue(),
          grammar.getLogicEventTypeAccess().getModify_discardKeyword_3().getValue(),
          grammar.getLogicEventTypeAccess().getNew_loadKeyword_4().getValue(),
          grammar.getLogicEventTypeAccess().getNew_storeKeyword_5().getValue(),
          grammar.getLogicEventTypeAccess().getNew_discardKeyword_6().getValue());
    }
    else if (container instanceof CodeElement) {
      return newSet(grammar.getLogicEventTypeAccess().getLoadKeyword_13().getValue());
    }
    else if (container instanceof ButtonElement || container instanceof MenuElement) {
      return newSet(grammar.getLogicEventTypeAccess().getClickKeyword_8().getValue());
    }
    else if (container instanceof LookupElement) {
      return newSet(grammar.getLogicEventTypeAccess().getAllKeyword_0().getValue());
    }
    else if (container instanceof ValueFieldElement) {
      return newSet(grammar.getLogicEventTypeAccess().getChangedKeyword_7().getValue(),
          grammar.getLogicEventTypeAccess().getFormat_valueKeyword_11().getValue(),
          grammar.getLogicEventTypeAccess().getMaster_changedKeyword_9().getValue(),
          grammar.getLogicEventTypeAccess().getInitKeyword_10().getValue(),
          grammar.getLogicEventTypeAccess().getValidate_valueKeyword_14().getValue());
    }
    else if (container instanceof FormFieldElement) {
      return newSet(grammar.getLogicEventTypeAccess().getInitKeyword_10().getValue());
    }
    else if (container instanceof TableElement) {
      return newSet(grammar.getLogicEventTypeAccess().getInitKeyword_10().getValue());
    }
    else if (container instanceof KeyElement) {
      return newSet(grammar.getLogicEventTypeAccess().getActivatedKeyword_12().getValue());
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
  public void checkMenuNameUniqueness(FormElement formElement) {
    if (helper.hasDuplicate(helper.allMenusOfForm(formElement))) {
      error(MSG_DUPLICATE_MENU, formElement, SamlPackage.Literals.FORM_ELEMENT__FIELDS, DUPLICATE);
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

    // check language pattern
    for (String lang : attribNames) {
      if (!DEFAULT_LANG_NAME.equals(lang)) {
        if (!NLS_KEY_PATTERN.matcher(lang).matches()) {
          error(MSG_INVALID_LANG, e, SamlPackage.Literals.TRANSLATION_ELEMENT__TRANSLATIONS, INVALID_LANG);
          return;
        }
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

    SamlModule m = new SamlModule(module);

    // check if all plugins can be found
    if (!checkPlugin(module, m.getClient(), m.getClientName())) {
      return;
    }
    if (!checkPlugin(module, m.getShared(), m.getSharedName())) {
      return;
    }
    if (!checkPlugin(module, m.getServer(), m.getServerName())) {
      return;
    }

    // check if client & server can see the shared
    if (!ScoutTypeUtility.isOnClasspath(m.getShared(), m.getClient())) {
      error(String.format(CANNOT_ACCESS_SHARED, m.getSharedName(), m.getClientName()), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
      return;
    }
    if (!ScoutTypeUtility.isOnClasspath(m.getShared(), m.getServer())) {
      error(String.format(CANNOT_ACCESS_SHARED, m.getSharedName(), m.getServerName()), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
      return;
    }

    // check if the types match
    if (!IScoutBundle.TYPE_CLIENT.equals(m.getClient().getType())) {
      error(String.format(BUNDLE_TYPES_DO_NOT_MATCH, m.getClientName(), IScoutBundle.TYPE_CLIENT, m.getClient().getType()), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
    }
    if (!IScoutBundle.TYPE_SHARED.equals(m.getShared().getType())) {
      error(String.format(BUNDLE_TYPES_DO_NOT_MATCH, m.getSharedName(), IScoutBundle.TYPE_SHARED, m.getShared().getType()), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
    }
    if (!IScoutBundle.TYPE_SERVER.equals(m.getServer().getType())) {
      error(String.format(BUNDLE_TYPES_DO_NOT_MATCH, m.getServerName(), IScoutBundle.TYPE_SERVER, m.getServer().getType()), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
    }
  }

  private boolean checkPlugin(ModuleElement module, IScoutBundle bundle, String bundleName) {
    if (bundle == null) {
      // check if the project is in the workspace (for better error message)
      IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(bundleName);
      if (ResourceUtility.exists(project)) {
        // there is a project in the workspace but there is no scout bundle in the graph
        error(String.format(BUNDLE_NOT_A_SCOUT_BUNDLE, bundleName), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
        return false;
      }

      error(String.format(BUNDLE_NOT_FOUND, bundleName), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
      return false;
    }

    // check for binary projects
    if (bundle.isBinary()) {
      error(String.format(BINARY_BUNDLE_NOT_ALLOWED, bundleName), module, SamlPackage.Literals.MODULE_ELEMENT__NAME, INVALID_MODULE, module.getName());
      return false;
    }

    return true;
  }

  @Check
  public void checkTab(TabElement tab) {
    if (!(tab.eContainer() instanceof TabBoxElement)) {
      error(MSG_TAB_ONLY_IN_TABBOX, tab, SamlPackage.Literals.NAMED_TYPE_ELEMENT__NAME, TAB_ONLY_IN_TABBOX);
    }
  }

  @Check
  public void checkFileChooserConfig(FileChooserElement fce) {
    if (fce.getMode().equals(grammar.getFileChooserElementAccess().getModeDirectoryKeyword_2_9_2_0_0().getValue())) {
      // extensions and filenames make only sense when we are in file mode.
      if ("true".equals(fce.getShowFileName())) {
        error(MSG_ONLY_FOR_MODE_FILE, fce, SamlPackage.Literals.FILE_CHOOSER_ELEMENT__SHOW_FILE_NAME, ONLY_FOR_MODE_FILE);
      }
      if ("true".equals(fce.getShowFileExtension())) {
        error(MSG_ONLY_FOR_MODE_FILE, fce, SamlPackage.Literals.FILE_CHOOSER_ELEMENT__SHOW_FILE_EXTENSION, ONLY_FOR_MODE_FILE);
      }
      if (StringUtility.hasText(fce.getExtensions())) {
        error(MSG_ONLY_FOR_MODE_FILE, fce, SamlPackage.Literals.FILE_CHOOSER_ELEMENT__EXTENSIONS, ONLY_FOR_MODE_FILE);
      }
    }
  }

  @Check
  public void checkNoTranslationDuplicates(TranslationElement element) {
    if (helper.hasGlobalDuplicate(element.getName(), element, true)) {
      error(MSG_DUPLICATE, element, SamlPackage.eINSTANCE.getTranslationElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoFormDuplicates(FormElement element) {
    if (helper.hasGlobalDuplicate(element)) {
      error(MSG_DUPLICATE, element, SamlPackage.eINSTANCE.getNamedTypeElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoLookupDuplicates(LookupElement element) {
    if (helper.hasGlobalDuplicate(element.getName(), element)) {
      error(MSG_DUPLICATE, element, SamlPackage.eINSTANCE.getLookupElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoCodeDuplicates(CodeElement element) {
    if (helper.hasGlobalDuplicate(element)) {
      error(MSG_DUPLICATE, element, SamlPackage.eINSTANCE.getNamedTypeElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkNoTemplateDuplicates(TemplateElement element) {
    if (helper.hasGlobalDuplicate(element.getName(), element)) {
      error(MSG_DUPLICATE, element, SamlPackage.eINSTANCE.getTemplateElement_Name(), DUPLICATE);
    }
  }

  @Check
  public void checkBigDecimalFormatAttributes(BigDecimalElement element) {
    if (element.getFormat() != null) {
      if (element.getFractionDigits() != 0) {
        error(MSG_FORMAT_CONFLICTING, element, SamlPackage.eINSTANCE.getBigDecimalElement_FractionDigits(), FORMAT_CONFLICTING);
      }

      String falseKeyWord = grammar.getBooleanTypeAccess().getFalseKeyword_1().getValue();
      if (CompareUtility.equals(falseKeyWord, element.getGrouping())) {
        error(MSG_FORMAT_CONFLICTING, element, SamlPackage.eINSTANCE.getBigDecimalElement_Grouping(), FORMAT_CONFLICTING);
      }
    }
  }

  @Check
  public void checkValidStringFieldRegexValidation(StringElement element) {
    if (element.getRegexValidation() != null) {
      // check if the given regex can be compiled
      try {
        Pattern.compile(element.getRegexValidation());
      }
      catch (PatternSyntaxException e) {
        error(String.format(MSG_INVALID_REGEX, element.getRegexValidation()), element, SamlPackage.eINSTANCE.getStringElement_RegexValidation(), INVALID_REGEX);
      }
    }
  }

}
