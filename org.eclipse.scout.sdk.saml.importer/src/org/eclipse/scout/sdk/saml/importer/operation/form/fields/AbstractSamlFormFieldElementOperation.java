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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.scout.saml.saml.AbstractFieldElement;
import org.eclipse.scout.saml.saml.DateElement;
import org.eclipse.scout.saml.saml.DoubleElement;
import org.eclipse.scout.saml.saml.LongElement;
import org.eclipse.scout.saml.saml.SequenceBoxElement;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.StringElement;
import org.eclipse.scout.saml.saml.ZregBoxElement;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.container.SamlSequenceBoxElementImportOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link AbstractSamlFormFieldElementOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public abstract class AbstractSamlFormFieldElementOperation extends AbstractSamlElementImportOperation {

  private SamlFormContext m_samlContext;
  private AbstractFieldElement m_fieldElement;

  public SamlFormContext getSamlFormContext() {
    return m_samlContext;
  }

  public static void dispatchFieldElements(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, AbstractFieldElement field, SamlContext context, SamlFormContext formContext) throws CoreException {
    AbstractSamlFormFieldElementOperation op = null;
    if (field instanceof SequenceBoxElement) {
      SamlSequenceBoxElementImportOperation ssbeio = new SamlSequenceBoxElementImportOperation();
      ssbeio.setSequenceBoxElement((SequenceBoxElement) field);
      op = ssbeio;
    }
    else if (field instanceof StringElement) {
      SamlStringElementImportOperation fieldOp = new SamlStringElementImportOperation();
      fieldOp.setStringElement((StringElement) field);
      op = fieldOp;
    }
    else if (field instanceof DoubleElement) {
      SamlDoubleElementImportOperation fieldOp = new SamlDoubleElementImportOperation();
      fieldOp.setDoubleElement((DoubleElement) field);
      op = fieldOp;
    }
    else if (field instanceof LongElement) {
      SamlLongElementImportOperation fieldOp = new SamlLongElementImportOperation();
      fieldOp.setLongElement((LongElement) field);
      op = fieldOp;
    }
    else if (field instanceof DateElement) {
      SamlDateElementImportOperation fieldOp = new SamlDateElementImportOperation();
      fieldOp.setDateElement((DateElement) field);
      op = fieldOp;
    }
    else if (field instanceof SmartfieldElement) {
      SamlSmartfieldElementImportOperation fieldOp = new SamlSmartfieldElementImportOperation();
      fieldOp.setSmartfieldElement((SmartfieldElement) field);
      op = fieldOp;
    }
    else if (field instanceof ZregBoxElement) {
      SamlZregBoxElementImportOperation fieldOp = new SamlZregBoxElementImportOperation();
      fieldOp.setZregBoxElement((ZregBoxElement) field);
      op = fieldOp;
    }
    else {
      throw new IllegalArgumentException("Unknown EObject field type: " + field);
    }

    if (op != null) {
      op.setSamlContext(context);
      op.setSamlFormContext(formContext);
      op.setFieldElement(field);
      op.validate();
      op.run(monitor, workingCopyManager);
    }
  }

  public void setSamlFormContext(SamlFormContext samlContext) {
    m_samlContext = samlContext;
  }

  public AbstractFieldElement getFieldElement() {
    return m_fieldElement;
  }

  public void setFieldElement(AbstractFieldElement fieldElement) {
    m_fieldElement = fieldElement;
  }
}
