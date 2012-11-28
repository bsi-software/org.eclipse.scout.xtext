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
import org.eclipse.scout.sdk.saml.importer.extension.customization.SourceProviderInput;

/**
 * <h3>{@link ClientSyncJobDecorator}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 28.11.2012
 */
public class ClientSyncJobDecorator implements ISourceFragment {

  private ISourceFragment m_content;

  public ClientSyncJobDecorator(ISourceFragment content) {
    m_content = content;
  }

  @Override
  public void createSource(SourceProviderInput input, StringBuilder src) throws CoreException {
    //TODO [mvi]: change to new formDataImport using formfield filter?
    src.append("new ClientSyncJob(\"import formdata\", ClientSession.get(), true) { @Override protected void runVoid(IProgressMonitor monitor) throws Throwable {");
    if (m_content != null) {
      m_content.createSource(input, src);
    }
    src.append("} }.schedule();");
  }

}
