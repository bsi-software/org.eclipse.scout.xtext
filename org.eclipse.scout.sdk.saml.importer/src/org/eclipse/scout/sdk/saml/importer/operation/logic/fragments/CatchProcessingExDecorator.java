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
package org.eclipse.scout.sdk.saml.importer.operation.logic.fragments;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.saml.importer.extension.customization.SourceProviderInput;
import org.eclipse.scout.sdk.saml.importer.operation.logic.LogicInfoFactory.Placement;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;
import org.eclipse.scout.sdk.workspace.type.config.ConfigurationMethod;

/**
 * <h3>{@link CatchProcessingExDecorator}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 28.11.2012
 */
public class CatchProcessingExDecorator implements ISourceFragment {

  private static String[] PROCESSING_EXCEPTION_SIGS = new String[]{
      Signature.createTypeSignature(RuntimeClasses.ProcessingException.substring(RuntimeClasses.ProcessingException.lastIndexOf('.') + 1), false),
      SignatureCache.createTypeSignature(RuntimeClasses.ProcessingException.substring(RuntimeClasses.ProcessingException.lastIndexOf('.') + 1)),
      SignatureCache.createTypeSignature(RuntimeClasses.ProcessingException),
      Signature.createTypeSignature(RuntimeClasses.ProcessingException, false)
  };

  private ISourceFragment m_content;

  public CatchProcessingExDecorator(ISourceFragment content) {
    m_content = content;
  }

  @Override
  public void createSource(SourceProviderInput input, StringBuilder src) throws CoreException {
    boolean methodThrowsProcEx = isThrowsProcessingExceptionPresent(input.getSourceMethod());
    if (!methodThrowsProcEx) {
      src.append("try {");
    }
    if (m_content != null) {
      m_content.createSource(input, src);
    }
    if (!methodThrowsProcEx) {
      src.append("} catch (ProcessingException e) { /* TODO */ e.printStackTrace(); ");
      if (input.getPlacement().equals(Placement.Client) && input.isSourceMethodReturningValue()) {
        src.append("return null; ");
      }
      src.append("}");
    }
  }

  private static boolean isThrowsProcessingExceptionPresent(ConfigurationMethod cm) throws CoreException {
    if (cm == null) {
      return true;
    }
    String[] exs = cm.getDefaultMethod().getExceptionTypes();
    for (String ex : exs) {
      for (String sig : PROCESSING_EXCEPTION_SIGS) {
        if (sig.equals(ex)) {
          return true;
        }
      }
    }
    return false;
  }
}
