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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.sdk.operation.KeyStrokeNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.workspace.type.IStructuredType;
import org.eclipse.scout.sdk.workspace.type.ScoutTypeUtility;

/**
 * <h3>{@link KeyElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public class KeyElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_KEY_STROKE = 10;

  private IType m_createdKeyStroke;

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    IStructuredType structuredType = ScoutTypeUtility.createStructuredForm(getSamlContext().getCurrentParentType());
    String name = getElement().getName() + SdkProperties.SUFFIX_KEY_STROKE;

    KeyStrokeNewOperation ksno = new KeyStrokeNewOperation(getSamlContext().getCurrentParentType(), false);
    ksno.setTypeName(name);
    ksno.setKeyStroke(getElement().getStroke());
    ksno.setSibling(structuredType.getSiblingTypeKeyStroke(name));
    ksno.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    m_createdKeyStroke = ksno.getCreatedKeyStroke();

    processChildren(m_createdKeyStroke, getSamlContext().getCurrentFormContext());

    fireTypeCreated(m_createdKeyStroke, EVENT_OBJECT_TYPE_KEY_STROKE);
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("key element cannot be null");
    }
  }

  @Override
  protected KeyElement getElement() {
    return (KeyElement) super.getElement();
  }
}
