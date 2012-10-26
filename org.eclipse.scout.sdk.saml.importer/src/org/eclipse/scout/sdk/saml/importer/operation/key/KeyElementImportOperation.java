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
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.sdk.operation.KeyStrokeNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.AbstractUiElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.workspace.type.IStructuredType;
import org.eclipse.scout.sdk.workspace.type.ScoutTypeUtility;

/**
 * <h3>{@link KeyElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public class KeyElementImportOperation extends AbstractUiElementImportOperation {

  private KeyElement m_keyElement;
  private IType m_container;
  private SamlFormContext m_samlContext;

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    IStructuredType structuredType = ScoutTypeUtility.createStructuredForm(getContainer());
    String name = getKeyElement().getName() + SdkProperties.SUFFIX_KEY_STROKE;

    KeyStrokeNewOperation ksno = new KeyStrokeNewOperation(getContainer(), false);
    ksno.setTypeName(name);
    ksno.setKeyStroke(getKeyElement().getStroke());
    ksno.setSibling(structuredType.getSiblingTypeKeyStroke(name));
    ksno.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    IType createdStroke = ksno.getCreatedKeyStroke();
    SamlLogicFillOperation.fillAllLogic(getKeyElement().getLogic(), getSamlFormContext(), createdStroke);
  }

  @Override
  public String getOperationName() {
    return "create key stroke";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getKeyElement() == null) {
      throw new IllegalArgumentException("key element cannot be null");
    }
    if (getContainer() == null) {
      throw new IllegalArgumentException("key container cannot be null");
    }
  }

  public static void processKeyStrokes(List<KeyElement> keys, IType parent, SamlFormContext context) throws CoreException, IllegalArgumentException {
    for (KeyElement m : keys) {
      KeyElementImportOperation o = new KeyElementImportOperation();
      o.setContainer(parent);
      o.setKeyElement(m);
      o.setSamlFormContext(context);
      o.setSamlContext(context.getSamlContext());
      o.validate();
      o.run();
    }
  }

  public IType getContainer() {
    return m_container;
  }

  public void setContainer(IType container) {
    m_container = container;
  }

  public SamlFormContext getSamlFormContext() {
    return m_samlContext;
  }

  public void setSamlFormContext(SamlFormContext samlContext) {
    m_samlContext = samlContext;
  }

  public KeyElement getKeyElement() {
    return m_keyElement;
  }

  public void setKeyElement(KeyElement keyElement) {
    m_keyElement = keyElement;
  }
}
