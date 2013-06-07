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
package org.eclipse.scout.sdk.saml.importer.operation.logic.fragments;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.SourceProviderInput;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;

/**
 * <h3>{@link ServerCallLogicFragment}</h3>
 * 
 * @author mvi
 * @since 3.9.0 28.11.2012
 */
public class ServerCallLogicFragment implements ISourceFragment {

  @Override
  public void createSource(SourceProviderInput input, StringBuilder src) throws CoreException {
    String nl = ResourceUtility.getLineSeparator(input.getTargetInterface().getCompilationUnit());

    src.append(input.getFormData().getElementName());
    src.append(" formData = new ");
    src.append(input.getFormData().getElementName());
    src.append("();");
    src.append(nl);
    src.append("exportFormData(formData);");
    src.append(nl);
    src.append("formData = SERVICES.getService(");
    src.append(input.getTargetInterface().getElementName());
    src.append(".class).");
    src.append(input.getTargetMethodName());
    src.append("(formData);");
    src.append(nl);
    src.append("importFormData(formData);");
  }

}
