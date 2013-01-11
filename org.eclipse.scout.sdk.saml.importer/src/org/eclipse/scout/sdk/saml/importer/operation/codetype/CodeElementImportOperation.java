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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.CodeNewOperation;
import org.eclipse.scout.sdk.operation.CodeTypeNewOperation;
import org.eclipse.scout.sdk.operation.util.TypeDeleteOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
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
  private IType m_parentCode;

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

  public static void processCodes(List<CodeElement> codes, IType codeType, SamlContext context) throws CoreException, IllegalArgumentException {
    for (CodeElement ce : codes) {
      CodeElementImportOperation ceio = new CodeElementImportOperation();
      ceio.setCodeElement(ce);
      ceio.setParentCode(codeType);
      ceio.setSamlContext(context);
      ceio.validate();
      ceio.run();
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    String valueType = getCodeElement().getValueType();
    if (valueType == null) {
      valueType = Object.class.getName();
    }

    IType createdType = null;
    boolean isCreateCodeType = !TypeUtility.exists(getParentCode());
    if (isCreateCodeType) {
      createdType = createCodeType(valueType);
    }
    else {
      createdType = createCode(valueType);
    }

    applyTextAttribute(getCodeElement().getText(), createdType, null);

    SamlFormContext formContext = new SamlFormContext();
    formContext.setClientType(createdType);
    formContext.setSamlContext(getSamlContext());
    SamlLogicFillOperation.fillAllLogic(getCodeElement().getLogic(), formContext, createdType);

    CodeElementImportOperation.processCodes(getCodeElement().getCodes(), createdType, getSamlContext());

    if (isCreateCodeType) {
      postProcessType(createdType);
    }
  }

  private IType createCode(String valueType) throws CoreException {
    String name = getCodeElement().getName() + SdkProperties.SUFFIX_CODE;
    String superTypeSig = getSuperTypeSignature(RuntimeClasses.ICode, getCodeElement().getSuperType(), valueType);

    CodeNewOperation cno = new CodeNewOperation(getParentCode(), false);
    cno.setGenericTypeSignature(SignatureCache.createTypeSignature(valueType));
    cno.setNextCodeId(getCodeElement().getId());
    cno.setSuperTypeSignature(superTypeSig);
    cno.setTypeName(name);
    cno.validate();
    cno.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    return cno.getCreatedCode();
  }

  private IType createCodeType(String valueType) throws IllegalArgumentException, CoreException {
    String name = getCodeElement().getName() + SdkProperties.SUFFIX_CODE_TYPE;
    String superTypeSig = getSuperTypeSignature(RuntimeClasses.ICodeType, getCodeElement().getSuperType(), valueType);

    IScoutBundle sharedBundle = getCurrentScoutModule().getSharedBundle();
    deleteExisting(sharedBundle, name);

    CodeTypeNewOperation ctno = new CodeTypeNewOperation();
    ctno.setFormatSource(false);
    ctno.setNextCodeId(getCodeElement().getId());
    ctno.setSharedBundle(sharedBundle);
    ctno.setSuperTypeSignature(superTypeSig);
    ctno.setPackageName(sharedBundle.getDefaultPackage(IScoutBundle.SHARED_SERVICES_CODE));
    ctno.setGenericTypeSignature(SignatureCache.createTypeSignature(valueType));
    ctno.setTypeName(name);
    ctno.validate();
    ctno.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    return ctno.getCreatedType();
  }

  private void deleteExisting(IScoutBundle shared, String codeTypeName) throws CoreException, IllegalArgumentException {
    IType old = TypeUtility.getType(shared.getDefaultPackage(IScoutBundle.SHARED_SERVICES_CODE) + "." + codeTypeName);
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

  public IType getParentCode() {
    return m_parentCode;
  }

  public void setParentCode(IType parentCode) {
    m_parentCode = parentCode;
  }
}
