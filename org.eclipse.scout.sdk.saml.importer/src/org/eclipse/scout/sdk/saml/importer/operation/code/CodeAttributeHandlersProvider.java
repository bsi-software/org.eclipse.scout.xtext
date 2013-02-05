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
package org.eclipse.scout.sdk.saml.importer.operation.code;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AbstractAttributeHandlersProvider;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttribute;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttributeHandler;
import org.eclipse.scout.sdk.saml.importer.extension.element.ElementImportersExtension;

/**
 * <h3>{@link CodeAttributeHandlersProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 01.02.2013
 */
public class CodeAttributeHandlersProvider extends AbstractAttributeHandlersProvider {

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = CodeElement.class, featureId = SamlPackage.CODE_ELEMENT__CODES)})
  public void applyLookupLogics(List<CodeElement> codes) throws IllegalArgumentException, CoreException {
    for (CodeElement ce : codes) {
      IOperation ceio = ElementImportersExtension.getImporterFor(ce, getSamlContext());
      ceio.validate();
      ceio.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = CodeElement.class, featureId = SamlPackage.CODE_ELEMENT__TEXT)})
  public void applyCodeTextAttribute(TranslationElement a) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod("getConfiguredText", getNlsReturnClause(a));
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = CodeElement.class, featureId = SamlPackage.CODE_ELEMENT__ID)})
  public void applyIdAttribute(String id) throws IllegalArgumentException, CoreException {
    // nothing to do. already handled in the element creation operation
  }
}
