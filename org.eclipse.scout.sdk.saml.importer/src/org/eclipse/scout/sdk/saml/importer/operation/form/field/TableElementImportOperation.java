/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.operation.form.field;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.sdk.operation.form.field.TableFieldNewOperation;

/**
 * <h3>{@link TableElementImportOperation}</h3> Imports a {@link TableElement}.
 * 
 * @author mvi
 * @since 3.9.0 05.02.2013
 */
public class TableElementImportOperation extends FormFieldElementImportOperation {
  @Override
  protected IType createField() throws CoreException, IllegalArgumentException {
    String typeName = getFormFieldClassName();
    TableFieldNewOperation op = new TableFieldNewOperation(getSamlContext().getCurrentParentType());
    op.setFormatSource(false);
    if (getOrder() != null) {
      op.setOrderNr(getOrder().doubleValue());
    }
    op.setFormType(getSamlContext().getCurrentFormContext().getFormType());
    op.setGetterMethodSibling(getSamlContext().getCurrentFormContext().getSiblingFor("get" + typeName));
    op.setNlsEntry(null);
    op.setSibling(null);
    op.setSuperTypeSignature(getSuperTypeSignature(getDefaultSuperInterfaceFqn(), getElement().getSuperType(),
        getCurrentScoutModule().getClient(), getGenericValueType()));
    op.setTypeName(typeName);
    op.validate();
    op.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    getSamlContext().getCurrentFormContext().addFieldGetterMethod(op.getCreatedFieldGetterMethod());

    return op.getCreatedField();
  }
}
