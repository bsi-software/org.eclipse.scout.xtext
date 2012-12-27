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
import org.eclipse.scout.saml.saml.ValueFieldElement;
import org.eclipse.scout.sdk.saml.importer.extension.FormFieldExtension;

/**
 * <h3>{@link AbstractValueFieldElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public abstract class AbstractValueFieldElementImportOperation extends AbstractFormFieldElementOperation {

  protected final static int HORIZONTAL_ALIGN_LEFT = -1;
  protected final static int HORIZONTAL_ALIGN_CENTER = 0;
  protected final static int HORIZONTAL_ALIGN_RIGHT = 1;

  @Override
  public final void run() throws CoreException, IllegalArgumentException {
    IType createdField = createField();

    ITypeHierarchy h = createdField.newSupertypeHierarchy(getSamlContext().getMonitor());
    ValueFieldElement element = (ValueFieldElement) getFieldElement();

    applyFormFieldProperties(createdField, h);
    applyMasterAttribute(element.getMaster(), createdField, h);
    applyMandatoryAttribute(element.getMandatory(), createdField, h);
    applyLabelAttribute(element.getText(), createdField, h);
    applyLabelVisibleAttribute(element.getLabelVisible(), createdField, h);
    applyGridWidthAttribute(element.getGridWidth(), createdField, h);
    applyWidthInPixelsAttribute(element.getWidthInPixels(), createdField, h);

    fillLogic(createdField);
  }

  protected void applyMasterAttribute(FormFieldElement a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.getName() != null) {
      String fieldNameSuffix = getFieldNameSuffix(a);
      if (fieldNameSuffix != null) {
        String masterFieldName = a.getName() + fieldNameSuffix;
        overrideMethod(field, h, "getConfiguredMasterField", "return " + masterFieldName + ".class;");
        overrideMethod(field, h, "getConfiguredMasterRequired", "return true;");
      }
    }
  }

  private String getFieldNameSuffix(FormFieldElement field) throws CoreException {
    IFormFieldElementOperation op = FormFieldExtension.getOperationFor(field);
    if (op == null) {
      throw new IllegalArgumentException("Unknown EObject field type: " + field.getClass());
    }
    return op.getFieldSuffix();
  }

  protected void applyHorizontalAlignAttribute(String align, int defaultVal, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (align != null) {
      int alignValue = getHorizontalAlignValue(align);
      if (alignValue != defaultVal) {
        overrideMethod(field, h, "getConfiguredHorizontalAlignment", "return " + alignValue + ";");
      }
    }
  }

  private int getHorizontalAlignValue(String align) {
    if (align.equals(getSamlContext().getGrammarAccess().getHorizontalAlignmentTypeAccess().getLeftKeyword_0().getValue())) {
      return HORIZONTAL_ALIGN_LEFT;
    }
    else if (align.equals(getSamlContext().getGrammarAccess().getHorizontalAlignmentTypeAccess().getCenterKeyword_1().getValue())) {
      return HORIZONTAL_ALIGN_CENTER;
    }
    else if (align.equals(getSamlContext().getGrammarAccess().getHorizontalAlignmentTypeAccess().getRightKeyword_2().getValue())) {
      return HORIZONTAL_ALIGN_RIGHT;
    }
    else {
      throw new IllegalArgumentException("unknown border_decoration: " + align);
    }
  }

  protected abstract IType createField() throws CoreException, IllegalArgumentException;
}
