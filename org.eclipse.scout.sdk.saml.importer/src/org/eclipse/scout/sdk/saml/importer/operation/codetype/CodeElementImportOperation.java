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
package org.eclipse.scout.sdk.saml.importer.operation.codetype;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.CodeTypeNewOperation;
import org.eclipse.scout.sdk.operation.util.TypeDeleteOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link CodeElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class CodeElementImportOperation extends AbstractSamlElementImportOperation {

  private CodeElement m_codeElement;

  @Override
  public String getOperationName() {
    return "Create CodeType";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getCodeElement() == null) {
      throw new IllegalArgumentException("CodeElement cannot be null.");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    String superSignature = Signature.createTypeSignature(RuntimeClasses.AbstractCodeType + "<" + Integer.class.getName() + ">", true);
    IScoutBundle sharedBundle = getCurrentScoutModule().getSharedBundle();
    String name = getCodeElement().getName() + SdkProperties.SUFFIX_CODE_TYPE;

    deleteExisting(sharedBundle, name);

    CodeTypeNewOperation ctno = new CodeTypeNewOperation();
    ctno.setFormatSource(false);
    ctno.setNextCodeId("" + getCodeElement().getId());
    ctno.setSharedBundle(sharedBundle);
    ctno.setSuperTypeSignature(superSignature);
    ctno.setGenericTypeSignature(Signature.createTypeSignature(Integer.class.getName(), true));
    ctno.setTypeName(name);
    ctno.validate();
    ctno.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    postProcessType(ctno.getCreatedType());
  }

  private void deleteExisting(IScoutBundle shared, String codeTypeName) throws CoreException, IllegalArgumentException {
    IType old = TypeUtility.getType(shared.getPackageName(IScoutBundle.SHARED_PACKAGE_APPENDIX_SERVICES_CODE) + "." + codeTypeName);
    if (TypeUtility.exists(old)) {
      TypeDeleteOperation delete = new TypeDeleteOperation(old);
      delete.validate();
      delete.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    }
  }

  public CodeElement getCodeElement() {
    return m_codeElement;
  }

  public void setCodeElement(CodeElement codeElement) {
    m_codeElement = codeElement;
  }
}
