package org.eclipse.scout.saml.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.Model;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.xtext.validation.Check;

import com.google.inject.Inject;

public class SamlJavaValidator extends AbstractSamlJavaValidator {

  public static final String RUNAT_MANDATORY = "RunatMandatory";

  public static final String DUPLICATE = "DuplicateElement";

  @Inject
  SamlJavaValidatorHelper helper;

  @Check
  public void checkLogicElement(LogicElement logicElement) {
    if (logicElement.getSource() != null && logicElement.getRunat() == null) error("'runat' is mandatory when providing the source",
        SamlPackage.Literals.LOGIC_ELEMENT__SOURCE, RUNAT_MANDATORY);
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
