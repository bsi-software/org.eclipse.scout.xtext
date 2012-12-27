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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.saml.importer.extension.FormFieldExtension;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.AbstractUiElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.type.ScoutTypeUtility;

/**
 * <h3>{@link AbstractFormFieldElementOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractFormFieldElementOperation extends AbstractUiElementImportOperation implements IFormFieldElementOperation {

  private SamlFormContext m_samlContext;

  protected void fillLogic(IType createdField) throws CoreException, IllegalArgumentException {
    SamlLogicFillOperation.fillAllLogic(getFieldElement().getLogic(), getSamlFormContext(), createdField);
  }

  protected IType getDefaultSibling() {
    return ScoutTypeUtility.getFistProcessButton(getSamlFormContext().getCurrentParentBox(), getSamlFormContext().getCurrentParentBoxLocalTypeHierarchy());
  }

  protected String getSuperTypeSigValidated() throws IllegalArgumentException {
    return getSuperTypeSigValidated(null);
  }

  protected String getSuperTypeSigValidated(String defaultFqn) throws IllegalArgumentException {
    if (getFieldElement().getSuperType() != null) {
      String specificSuperType = getFieldElement().getSuperType().getDefinition();
      if (!TypeUtility.exists(TypeUtility.getType(specificSuperType))) {
        throw new IllegalArgumentException("Specified super type '" + specificSuperType + "' could not be found. ");
      }
      return SignatureCache.createTypeSignature(specificSuperType);
    }
    if (defaultFqn == null) {
      return null;
    }
    return SignatureCache.createTypeSignature(defaultFqn);
  }

  protected void applyFormFieldProperties(IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    applyEnabledAttribute(getFieldElement().getEnabled(), field, h);
    applyVisibleAttribute(getFieldElement().getVisible(), field, h);
  }

  protected void applyWidthInPixelsAttribute(int widthInPixels, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (widthInPixels > 0) {
      overrideMethod(field, h, "getConfiguredWidthInPixel", "return " + widthInPixels + ";");
    }
  }

  protected void applyLabelAttribute(TranslationElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod(field, h, "getConfiguredLabel", getNlsReturnClause(a));
    }
  }

  protected void applyLabelVisibleAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredLabelVisible", "return false;");
    }
  }

  protected void applyGridHeightAttribute(int height, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (height > 1) {
      overrideMethod(field, h, "getConfiguredGridH", "return " + height + ";");
    }
  }

  protected void applyGridWidthAttribute(int width, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (width > 0) {
      overrideMethod(field, h, "getConfiguredGridW", "return " + width + ";");
    }
  }

  protected void applyMandatoryAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("true".equals(a)) {
      overrideMethod(field, h, "getConfiguredMandatory", "return true;");
    }
  }

  public static void dispatchFieldElements(List<FormFieldElement> fields, SamlContext context, SamlFormContext formContext) throws CoreException {
    for (FormFieldElement field : fields) {
      IFormFieldElementOperation op = FormFieldExtension.getOperationFor(field);
      op.setSamlContext(context);
      op.setSamlFormContext(formContext);
      op.setFieldElement(field);
      op.validate();
      op.run();
    }
  }

  @Override
  public SamlFormContext getSamlFormContext() {
    return m_samlContext;
  }

  @Override
  public void setSamlFormContext(SamlFormContext samlContext) {
    m_samlContext = samlContext;
  }
}
