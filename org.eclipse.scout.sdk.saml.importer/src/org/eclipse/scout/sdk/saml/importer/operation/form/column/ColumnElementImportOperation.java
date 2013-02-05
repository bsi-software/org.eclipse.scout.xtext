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
package org.eclipse.scout.sdk.saml.importer.operation.form.column;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.ColumnElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.TableColumnNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link ColumnElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 12.10.2012
 */
public class ColumnElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_COLUMN = 11;

  private IType m_createdColumn;

  @Override
  public void run() throws CoreException, IllegalArgumentException {

    createColumn();

    processChildren(m_createdColumn, getSamlContext().getCurrentFormContext());

    fireTypeCreated(m_createdColumn, EVENT_OBJECT_TYPE_COLUMN);
  }

  private void createColumn() throws CoreException {
    TableColumnNewOperation op = new TableColumnNewOperation(getSamlContext().getCurrentParentType(), false);

    op.setSuperTypeSignature(getColumnTypeSignature());
    op.setTypeName(getElement().getName() + SdkProperties.SUFFIX_COLUMN);

    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    m_createdColumn = op.getCreatedColumn();
  }

  private String getColumnTypeSignature() throws IllegalArgumentException {
    String type = getElement().getType();
    if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeDateKeyword_2_0_2_0_0().getValue())) {
      return RuntimeClasses.getSuperTypeSignature(RuntimeClasses.IDateColumn, getSamlContext().getRootProject());
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeBigdecimalKeyword_2_0_2_0_3().getValue())) {
      return RuntimeClasses.getSuperTypeSignature(RuntimeClasses.IBigDecimalColumn, getSamlContext().getRootProject());
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeIntKeyword_2_0_2_0_2().getValue())) {
      return RuntimeClasses.getSuperTypeSignature(RuntimeClasses.IIntegerColumn, getSamlContext().getRootProject());
    }
    else if (type.equals(getSamlContext().getGrammarAccess().getColumnElementAccess().getTypeStringKeyword_2_0_2_0_1().getValue())) {
      return RuntimeClasses.getSuperTypeSignature(RuntimeClasses.IStringColumn, getSamlContext().getRootProject());
    }
    else {
      throw new IllegalArgumentException("unknown column type: " + type);
    }
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("column element cannot be null");
    }
  }

  @Override
  protected ColumnElement getElement() {
    return (ColumnElement) super.getElement();
  }
}
