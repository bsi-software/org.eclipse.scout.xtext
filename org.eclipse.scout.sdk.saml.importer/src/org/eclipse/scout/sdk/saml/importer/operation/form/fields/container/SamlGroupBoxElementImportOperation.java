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
package org.eclipse.scout.sdk.saml.importer.operation.form.fields.container;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.sdk.operation.form.field.GroupBoxNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link SamlGroupBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class SamlGroupBoxElementImportOperation extends AbstractBoxElementImportOperation {

  private GroupBoxElement m_groupBoxElement;

  @Override
  public String getOperationName() {
    return "Create group box";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getGroupBoxElement() == null) {
      throw new IllegalArgumentException("group box element cannot be null.");
    }
  }

  @Override
  public IType createBox() throws CoreException, IllegalArgumentException {
    GroupBoxNewOperation o = new GroupBoxNewOperation(getSamlFormContext().getCurrentParentBox(), false);
    o.setTypeName(getGroupBoxElement().getName() + getFieldSuffix());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();

    applyColumnsAttribute(getGroupBoxElement().getColumns(), createdField);

    return createdField;
  }

  protected void applyColumnsAttribute(int columns, IType mainBox) throws IllegalArgumentException, CoreException {
    applyColumnsAttribute(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager(), columns, mainBox);
  }

  public static void applyColumnsAttribute(IProgressMonitor monitor, IWorkingCopyManager workingcopyManager, int columns, IType mainBox) throws IllegalArgumentException, CoreException {
    if (columns != 2) {
      overrideMethod(monitor, workingcopyManager, mainBox, null, "getConfiguredGridColumnCount", "return " + columns + ";");
    }
  }

  public GroupBoxElement getGroupBoxElement() {
    return m_groupBoxElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_groupBoxElement = (GroupBoxElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_groupBoxElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_BOX;
  }
}
