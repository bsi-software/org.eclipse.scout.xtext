/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.preprocess;

import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.SamlFactory;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.scout.sdk.saml.importer.extension.preprocess.SamlPreProcessor;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;

/**
 * <h3>{@link SamlStringElementPreProcessor}</h3>
 * 
 * @author kle
 * @since 3.10.0 18.06.2013
 */
public class SamlStringElementPreProcessor {

  private final static SamlFactory factory = SamlFactory.eINSTANCE;

  /**
   * If the regex validation attribute is set, a logic element containing the
   * regular expression validation logic is added as a child to the StringElement.
   * 
   * @param e
   *          the preprocessed StringElement
   * @param context
   *          the SamlContext
   */
  @SamlPreProcessor
  public void generateRegexValidation(StringElement e, SamlContext context) {
    if (e.getRegexValidation() == null) {
      return;
    }

    SamlGrammarAccess grammar = context.getGrammarAccess();
    LogicElement regexValidationLogicElement = factory.createLogicElement();
    regexValidationLogicElement.setPlacement(grammar.getLogicElementAccess().getPlacementInlineKeyword_3_1_2_0_2().getValue());
    regexValidationLogicElement.setEvent(grammar.getLogicEventTypeAccess().getValidate_valueKeyword_14().getValue());
    regexValidationLogicElement.setSource(generateScoutRegexValidationCode(context));
    e.getLogic().add(regexValidationLogicElement);
  }

  /**
   * Generates the Scout regular expression validation code for a StringField.
   * If the String value is not null and does not match the regular expression a VetoException
   * is thrown. Otherwise, the String value is returned.
   * 
   * @param context
   *          the SamlContext
   * @return generated Scout regular expression validation code
   */
  private String generateScoutRegexValidationCode(SamlContext context) {
    final String newline = ResourceUtility.getLineSeparator(context.getCurrentScoutModule().getClient().getProject());
    StringBuilder code = new StringBuilder();
    code.append("if (rawValue != null && !rawValue.matches(getRegexValidation())) {");
    code.append(newline);
    code.append("throw new VetoException(ScoutTexts.get(\"InvalidValueMessageX\", rawValue));");
    code.append(newline);
    code.append("}");
    code.append(newline);
    code.append("return rawValue;");
    return code.toString();
  }
}
