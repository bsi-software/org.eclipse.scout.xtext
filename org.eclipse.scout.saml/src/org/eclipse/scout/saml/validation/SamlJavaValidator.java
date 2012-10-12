package org.eclipse.scout.saml.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

public class SamlJavaValidator extends AbstractSamlJavaValidator {

  public static final String PLACEMENT_MANDATORY = "PlacementMandatory";
  public static final String PLACEMENT_SERVER_ONLY_FOR_LOOKUP = "ServerOnly4Lookup";

  public static final String DUPLICATE = "DuplicateElement";

  @Inject
  SamlJavaValidatorHelper helper;

  @Inject
  SamlGrammarAccess grammar;

  @Check
  public void checkLogicElement(LogicElement logicElement) {
    if (logicElement.getSource() != null && logicElement.getPlacement() == null) {
      error("'" + grammar.getLogicElementAccess().getPlacementKeyword_3_1_0().getValue() + "' is mandatory when providing the source",
          SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, PLACEMENT_MANDATORY);
    }

    if (logicElement.eContainer() instanceof LookupElement) {
      if (logicElement.getPlacement() != null && !logicElement.getPlacement().equals(grammar.getLogicElementAccess().getPlacementServerKeyword_3_1_2_0_1().getValue())) {
        error("a logic element inside a lookup element only supports 'server' as placement", SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, PLACEMENT_SERVER_ONLY_FOR_LOOKUP);
      }
    }
  }

  @Check
  public void checkNameUniqueness(EObject eObject) {
    if (helper.hasDuplicates(eObject) != null) error("Duplicate element",
        null, DUPLICATE);
  }

  @Check
  public void checkNoDuplicateTranslation(Model element) {
    if (helper.hasDuplicateTranslations(element)) error("Duplicate translation",
        null, DUPLICATE);
  }

}
