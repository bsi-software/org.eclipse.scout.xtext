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
package org.eclipse.scout.sdk.saml.importer.operation.column;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.ColumnElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.TableColumnNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.AbstractUiElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link ColumnElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 12.10.2012
 */
public class ColumnElementImportOperation extends AbstractUiElementImportOperation {

  private ColumnElement m_columnElement;
  private IType m_table;

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    TableColumnNewOperation op = new TableColumnNewOperation(getTable(), false);

    op.setSuperTypeSignature(getColumnTypeSignature());
    op.setTypeName(getColumnElement().getName() + SdkProperties.SUFFIX_COLUMN);

    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    IType createdColumn = op.getCreatedColumn();
    ITypeHierarchy h = createdColumn.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyVisibleAttribute(getColumnElement().getVisible(), createdColumn, h);
    applyTextAttribute(getColumnElement().getText(), createdColumn, h);
    applyWidthAttribute(getColumnElement().getWidth(), createdColumn, h);
    applyDisplayableAttribute(getColumnElement().getDisplayable(), createdColumn, h);
  }

  protected void applyTextAttribute(TranslationElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod(field, h, "getConfiguredHeaderText", getNlsReturnClause(a));
    }
  }

  protected void applyDisplayableAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredDisplayable", "return false;");
    }
  }

  protected void applyWidthAttribute(int a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a > 0) {
      overrideMethod(field, h, "getConfiguredWidth", "return " + a + ";");
    }
  }

  private String getColumnTypeSignature() throws IllegalArgumentException {
    String type = getColumnElement().getType();
    if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeDateKeyword_2_0_2_0_0().getValue())) {
      return Signature.createTypeSignature(RuntimeClasses.AbstractDateColumn, true);
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeDoubleKeyword_2_0_2_0_3().getValue())) {
      return Signature.createTypeSignature(RuntimeClasses.AbstractDoubleColumn, true);
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeIntKeyword_2_0_2_0_2().getValue())) {
      return Signature.createTypeSignature(RuntimeClasses.AbstractIntegerColumn, true);
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeStringKeyword_2_0_2_0_1().getValue())) {
      return Signature.createTypeSignature(RuntimeClasses.AbstractStringColumn, true);
    }
    else {
      throw new IllegalArgumentException("unknown column type: " + type);
    }
  }

  @Override
  public String getOperationName() {
    return "create table column";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getColumnElement() == null) {
      throw new IllegalArgumentException("column element cannot be null");
    }
    if (getTable() == null) {
      throw new IllegalArgumentException("table cannot be null");
    }
  }

  public static void processColumns(List<ColumnElement> columns, IType table, SamlFormContext context) throws CoreException, IllegalArgumentException {
    for (ColumnElement col : columns) {
      ColumnElementImportOperation op = new ColumnElementImportOperation();
      op.setColumnElement(col);
      op.setSamlContext(context.getSamlContext());
      op.setTable(table);
      op.validate();
      op.run();
    }
  }

  public ColumnElement getColumnElement() {
    return m_columnElement;
  }

  public void setColumnElement(ColumnElement columnElement) {
    m_columnElement = columnElement;
  }

  public IType getTable() {
    return m_table;
  }

  public void setTable(IType table) {
    m_table = table;
  }
}
