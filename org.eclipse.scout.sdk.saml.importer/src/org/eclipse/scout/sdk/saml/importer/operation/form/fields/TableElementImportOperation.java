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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.form.field.TableFieldNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.column.ColumnElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.menu.MenuElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link TableElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class TableElementImportOperation extends AbstractFormFieldElementOperation {

  private TableElement m_tableElement;

  @Override
  public String getOperationName() {
    return "Create table field";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getTableFieldElement() == null) {
      throw new IllegalArgumentException("table element cannot be null");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    String configuredSuperTypeSig = getSuperTypeSigValidated(RuntimeClasses.getSuperTypeName(RuntimeClasses.ITableField, getSamlContext().getRootProject()));

    TableFieldNewOperation o = new TableFieldNewOperation(getSamlFormContext().getCurrentParentBox());
    o.setFormatSource(false);
    o.setSuperTypeSignature(configuredSuperTypeSig);
    o.setTypeName(getTableFieldElement().getName() + getFieldSuffix());
    o.setSibling(getDefaultSibling());
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();
    IType table = o.getCreatedTable();

    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());
    applyFormFieldProperties(createdField, h);
    fillLogic(createdField);

    MenuElementImportOperation.processMenus(getTableFieldElement().getMenus(), createdField, getSamlFormContext());
    ColumnElementImportOperation.processColumns(getTableFieldElement().getColumns(), table, getSamlFormContext());
  }

  public TableElement getTableFieldElement() {
    return m_tableElement;
  }

  @Override
  public void setFieldElement(FormFieldElement fieldElement) {
    m_tableElement = (TableElement) fieldElement;
  }

  @Override
  public FormFieldElement getFieldElement() {
    return m_tableElement;
  }

  @Override
  public String getFieldSuffix() {
    return SdkProperties.SUFFIX_FORM_FIELD;
  }
}
