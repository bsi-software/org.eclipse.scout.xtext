/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation.form;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AbstractAttributeHandlersProvider;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttribute;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttributeHandler;

/**
 * <h3>{@link FormAttributeHandlersProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 01.02.2013
 */
public class FormAttributeHandlersProvider extends AbstractAttributeHandlersProvider {

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__MODAL)})
  public void applyModalAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredModal", "return false;", getSamlContext().getCurrentFormContext().getFormType());
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__TITLE)})
  public void applyTitleAttribute(TranslationElement a) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod("getConfiguredTitle", getNlsReturnClause(a), getSamlContext().getCurrentFormContext().getFormType());
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__SUBTITLE)})
  public void applySubtitleAttribute(TranslationElement a) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod("getConfiguredSubTitle", getNlsReturnClause(a), getSamlContext().getCurrentFormContext().getFormType());
    }
  }
}
