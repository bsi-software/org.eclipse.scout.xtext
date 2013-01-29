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
package org.eclipse.scout.sdk.saml.importer.operation.form.fields;

import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.saml.importer.operation.ISamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;

/**
 * <h3>{@link IFormFieldElementOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public interface IFormFieldElementOperation extends ISamlElementImportOperation {
  void setSamlFormContext(SamlFormContext samlContext);

  SamlFormContext getSamlFormContext();

  void setFieldElement(FormFieldElement fieldElement);

  void setOrder(double order);

  double getOrder();

  FormFieldElement getFieldElement();

  String getFieldSuffix();
}
