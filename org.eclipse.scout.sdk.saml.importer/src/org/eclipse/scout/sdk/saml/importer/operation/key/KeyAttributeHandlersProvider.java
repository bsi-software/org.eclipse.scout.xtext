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
package org.eclipse.scout.sdk.saml.importer.operation.key;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AbstractAttributeHandlersProvider;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttribute;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttributeHandler;
import org.eclipse.scout.sdk.saml.importer.extension.element.ElementImportersExtension;

/**
 * <h3>{@link KeyAttributeHandlersProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 04.02.2013
 */
public class KeyAttributeHandlersProvider extends AbstractAttributeHandlersProvider {

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__KEY_STROKES)})
  public void applyKeyStrokes(List<KeyElement> keyStrokes) throws IllegalArgumentException, CoreException {
    for (KeyElement m : keyStrokes) {
      IOperation o = ElementImportersExtension.getImporterFor(m, getSamlContext());
      o.validate();
      o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = KeyElement.class, featureId = SamlPackage.KEY_ELEMENT__STROKE)})
  public void applyStrokeAttribute(String stroke) throws IllegalArgumentException, CoreException {
    //nop
  }
}
