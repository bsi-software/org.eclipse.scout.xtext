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
package org.eclipse.scout.sdk.saml.importer.operation.code;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.CodeNewOperation;
import org.eclipse.scout.sdk.operation.CodeTypeNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link CodeElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class CodeElementImportOperation extends AbstractSamlElementImportOperation {

  private IType m_createdType;

  public final static int EVENT_OBJECT_TYPE_CODE = 1;
  public final static int EVENT_OBJECT_TYPE_CODE_TYPE = 2;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("CodeElement cannot be null.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {
    String valueType = getElement().getValueType();
    if (valueType == null) {
      valueType = Object.class.getName();
    }

    boolean isCreateCodeType = !getSamlContext().isParentTypeSet();
    if (isCreateCodeType) {
      m_createdType = createCodeType(valueType);
    }
    else {
      m_createdType = createCode(valueType);
    }

    processChildren(m_createdType, createFormContext());

    fireTypeCreated(m_createdType, isCreateCodeType ? EVENT_OBJECT_TYPE_CODE_TYPE : EVENT_OBJECT_TYPE_CODE);

    if (isCreateCodeType) {
      postProcessType(m_createdType);
    }
  }

  private SamlFormContext createFormContext() {
    SamlFormContext formContext = new SamlFormContext();
    formContext.setClientType(m_createdType);
    return formContext;
  }

  private IType createCode(String valueType) throws CoreException {
    String name = getElement().getName() + SdkProperties.SUFFIX_CODE;
    String superTypeSig = getSuperTypeSignature(RuntimeClasses.ICode, getElement().getSuperType(), valueType);

    CodeNewOperation cno = new CodeNewOperation(getSamlContext().getCurrentParentType(), false);
    cno.setGenericTypeSignature(SignatureCache.createTypeSignature(valueType));
    cno.setNextCodeId(getElement().getId());
    cno.setSuperTypeSignature(superTypeSig);
    cno.setTypeName(name);
    cno.validate();
    cno.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    return cno.getCreatedCode();
  }

  private IType createCodeType(String valueType) throws IllegalArgumentException, CoreException {
    String name = getElement().getName() + SdkProperties.SUFFIX_CODE_TYPE;
    String superTypeSig = getSuperTypeSignature(RuntimeClasses.ICodeType, getElement().getSuperType(), valueType);

    IScoutBundle sharedBundle = getCurrentScoutModule().getSharedBundle();
    String targetPackage = sharedBundle.getDefaultPackage(IScoutBundle.SHARED_SERVICES_CODE);
    deleteClass(sharedBundle, targetPackage, name);

    CodeTypeNewOperation ctno = new CodeTypeNewOperation();
    ctno.setFormatSource(false);
    ctno.setNextCodeId(getElement().getId());
    ctno.setSharedBundle(sharedBundle);
    ctno.setSuperTypeSignature(superTypeSig);
    ctno.setPackageName(targetPackage);
    ctno.setGenericTypeSignature(SignatureCache.createTypeSignature(valueType));
    ctno.setTypeName(name);
    ctno.validate();
    ctno.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    return ctno.getCreatedType();
  }

  @Override
  protected CodeElement getElement() {
    return (CodeElement) super.getElement();
  }
}
