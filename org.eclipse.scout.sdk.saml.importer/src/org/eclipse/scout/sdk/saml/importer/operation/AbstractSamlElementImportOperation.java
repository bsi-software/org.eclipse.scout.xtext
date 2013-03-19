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
package org.eclipse.scout.sdk.saml.importer.operation;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.module.SamlModule;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.sdk.extensions.runtime.classes.RuntimeClasses;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.operation.util.JavaElementFormatOperation;
import org.eclipse.scout.sdk.saml.importer.event.ImportEventEmitter;
import org.eclipse.scout.sdk.saml.importer.event.SamlImportEvent;
import org.eclipse.scout.sdk.saml.importer.event.SamlImportEvent.SamlImportEventType;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AttributeHandlersProvidersExtension;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.scout.sdk.workspace.IScoutBundle;

/**
 * <h3>{@link AbstractSamlElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public abstract class AbstractSamlElementImportOperation implements IOperation {

  public final static int EVENT_OBJECT_KIND_ITYPE = 1;

  private SamlContext m_samlContext;
  private EObject m_element;

  protected AbstractSamlElementImportOperation() {
  }

  @Override
  public final void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    run();
  }

  protected abstract void run() throws CoreException, IllegalArgumentException;

  private void applyAttributes() throws CoreException {
    AttributeHandlersProvidersExtension.applyAttributes(getElement(), getSamlContext());
  }

  protected void processChildren(IType parent, SamlFormContext formContext) throws CoreException {
    final boolean formContextSet = getSamlContext().getCurrentFormContext() != null;
    try {
      if (!formContextSet) {
        getSamlContext().setCurrentFormContext(formContext);
      }
      getSamlContext().pushParentType(parent);

      applyAttributes();
    }
    finally {
      getSamlContext().popParentType();
      if (!formContextSet) {
        getSamlContext().resetCurrentFormContext();
      }
    }
  }

  public final void setElement(EObject element) {
    m_element = element;
  }

  protected EObject getElement() {
    return m_element;
  }

  @Override
  public final String getOperationName() {
    return "SAML Import";
  }

  protected SamlModule getCurrentScoutModule() {
    return getSamlContext().getCurrentScoutModule();
  }

  protected final SamlContext getSamlContext() {
    return m_samlContext;
  }

  public final void setSamlContext(SamlContext samlContext) {
    m_samlContext = samlContext;
  }

  protected void postProcessType(IType t) throws CoreException, IllegalArgumentException {
    ICompilationUnit compilationUnit = t.getCompilationUnit();
    JavaElementFormatOperation formatOp = new JavaElementFormatOperation(compilationUnit, true);
    formatOp.validate();
    formatOp.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
  }

  protected String getSuperTypeSignature(String defaultSuperInterfaceFqn, TemplateElement superTypeElement, IScoutBundle context) {
    return getSuperTypeSignature(defaultSuperInterfaceFqn, superTypeElement, context, null);
  }

  protected String getSuperTypeSignature(String defaultSuperInterfaceFqn, TemplateElement superTypeElement, IScoutBundle context, String valueType) {
    IType superType = null;
    if (superTypeElement == null) {
      // no explicit super type is defined: use default
      superType = RuntimeClasses.getSuperType(defaultSuperInterfaceFqn, context);
    }
    else {
      // explicit type is used: get and validate that it exists
      superType = TypeUtility.getType(superTypeElement.getDefinition());
      if (!TypeUtility.exists(superType)) {
        throw new IllegalArgumentException("Specified super type '" + superTypeElement.getDefinition() + "' could not be found. ");
      }
    }

    StringBuilder superTypeFqn = new StringBuilder(superType.getFullyQualifiedName());
    if (TypeUtility.isGenericType(superType) && valueType != null) {
      superTypeFqn.append('<');
      superTypeFqn.append(valueType);
      superTypeFqn.append('>');
    }

    return SignatureCache.createTypeSignature(superTypeFqn.toString());
  }

  protected void fireTypeCreated(IType createdType, int type) throws IllegalArgumentException, CoreException {
    ImportEventEmitter.get().fireEventSync(new SamlImportEvent(SamlImportEventType.ADDED, EVENT_OBJECT_KIND_ITYPE, type, createdType, this, getSamlContext()));
  }

  protected void deleteClass(IScoutBundle bundle, String pckName, String className) throws CoreException {
    String fileName = className + ".java";
    for (IPackageFragmentRoot r : bundle.getJavaProject().getPackageFragmentRoots()) {
      if (!r.isArchive() && !r.isReadOnly() && !r.isExternal()) {
        IFolder fld = (IFolder) r.getResource();
        if (fld.exists()) {
          IFolder packageFolder = fld.getFolder(new Path(pckName.replace('.', '/')));
          if (packageFolder.exists()) {
            IFile javaFile = packageFolder.getFile(fileName);
            if (javaFile.exists()) {
              javaFile.delete(true, false, getSamlContext().getMonitor());
              break;
            }
          }
        }
      }
    }
  }
}
