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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.ColumnElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AbstractAttributeHandlersProvider;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttribute;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttributeHandler;
import org.eclipse.scout.sdk.saml.importer.extension.element.ElementImportersExtension;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.eclipse.scout.sdk.util.type.TypeUtility;

/**
 * <h3>{@link ColumnAttributeHandlersProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 03.02.2013
 */
public class ColumnAttributeHandlersProvider extends AbstractAttributeHandlersProvider {

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = TableElement.class, featureId = SamlPackage.TABLE_ELEMENT__COLUMNS)})
  public void dispatchColumns(List<ColumnElement> columns) throws CoreException {
    IType tableType = getSamlContext().getCurrentParentType().getType(SdkProperties.TYPE_NAME_TABLEFIELD_TABLE);
    if (!TypeUtility.exists(tableType)) {
      throw new CoreException(new ScoutStatus("No table could be found to create a column in table-field '" + getSamlContext().getCurrentParentType() + "'."));
    }

    try {
      getSamlContext().pushParentType(tableType);
      for (ColumnElement col : columns) {
        IOperation op = ElementImportersExtension.getImporterFor(col, getSamlContext());
        op.validate();
        op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
      }
    }
    finally {
      getSamlContext().popParentType();
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ColumnElement.class, featureId = SamlPackage.COLUMN_ELEMENT__TYPE)})
  public void applyTypeAttribute(String type) throws CoreException, IllegalArgumentException {
    // nop
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ColumnElement.class, featureId = SamlPackage.COLUMN_ELEMENT__VISIBLE)})
  public void applyVisibleAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredVisible", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ColumnElement.class, featureId = SamlPackage.COLUMN_ELEMENT__TEXT)})
  public void applyHeaderTextAttribute(TranslationElement a) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod("getConfiguredHeaderText", getNlsReturnClause(a));
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ColumnElement.class, featureId = SamlPackage.COLUMN_ELEMENT__DISPLAYABLE)})
  public void applyDisplayableAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredDisplayable", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = ColumnElement.class, featureId = SamlPackage.COLUMN_ELEMENT__WIDTH)})
  public void applyWidthAttribute(int a) throws CoreException, IllegalArgumentException {
    if (a > 0) {
      overrideMethod("getConfiguredWidth", "return " + a + ";");
    }
  }
}
