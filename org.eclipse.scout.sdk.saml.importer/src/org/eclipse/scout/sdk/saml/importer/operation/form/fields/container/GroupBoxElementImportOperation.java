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
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.GroupBoxElement;
import org.eclipse.scout.sdk.operation.form.field.GroupBoxNewOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link GroupBoxElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class GroupBoxElementImportOperation extends AbstractBoxElementImportOperation {

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
    o.setSibling(getDefaultSibling());
    if (getGroupBoxElement().getSuperType() != null) {
      o.setSuperTypeSignature(SignatureCache.createTypeSignature(getGroupBoxElement().getSuperType().getDefinition()));
    }
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType createdField = o.getCreatedField();
    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyColumnsAttribute(getGroupBoxElement().getColumns(), createdField, h);
    applyBorderVisibleAttribute(getGroupBoxElement().getBorderVisible(), createdField, h);
    applyBorderDecorationAttribute(getGroupBoxElement().getBorderDecoration(), createdField, h);

    return createdField;
  }

  protected void applyColumnsAttribute(int columns, IType mainBox, ITypeHierarchy h) throws IllegalArgumentException, CoreException {
    applyColumnsAttribute(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager(), columns, mainBox, h);
  }

  public static void applyColumnsAttribute(IProgressMonitor monitor, IWorkingCopyManager workingcopyManager, int columns, IType mainBox, ITypeHierarchy h) throws IllegalArgumentException, CoreException {
    if (columns != 2 && columns > 0) {
      overrideMethod(monitor, workingcopyManager, mainBox, h, "getConfiguredGridColumnCount", "return " + columns + ";");
    }
  }

  protected void applyBorderVisibleAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredBorderVisible", "return false;");
    }
  }

  protected void applyBorderDecorationAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (StringUtility.hasText(a)) {
      overrideMethod(field, h, "getConfiguredBorderDecoration", "return " + getBorderConstant(a) + ";");
    }
  }

  private String getBorderConstant(String val) throws IllegalArgumentException {
    if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationEmptyKeyword_2_6_0_2_0_0().getValue())) {
      return "BORDER_DECORATION_EMPTY";
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationAutoKeyword_2_6_0_2_0_3().getValue())) {
      return "BORDER_DECORATION_AUTO";
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationLineKeyword_2_6_0_2_0_1().getValue())) {
      return "BORDER_DECORATION_LINE";
    }
    else if (val.equals(getSamlContext().getGrammarAccess().getGroupBoxElementAccess().getBorderDecorationSectionKeyword_2_6_0_2_0_2().getValue())) {
      return "BORDER_DECORATION_SECTION";
    }
    else {
      throw new IllegalArgumentException("unknown border_decoration: " + val);
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
