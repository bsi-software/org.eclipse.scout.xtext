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
package org.eclipse.scout.sdk.saml.importer.operation.logic;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.ISourceProvider;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.SourceProviderInput;
import org.eclipse.scout.sdk.saml.importer.operation.logic.LogicSnippetInfoFactory.Placement;
import org.eclipse.scout.sdk.saml.importer.operation.logic.fragments.ClientCallLogicFragment;
import org.eclipse.scout.sdk.saml.importer.operation.logic.fragments.ISourceFragment;
import org.eclipse.scout.sdk.saml.importer.operation.logic.fragments.InlineLogicFragment;
import org.eclipse.scout.sdk.saml.importer.operation.logic.fragments.ServerCallLogicFragment;
import org.eclipse.scout.sdk.util.type.TypeUtility;

/**
 * <h3>{@link DefaultSourceProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 28.11.2012
 */
public class DefaultSourceProvider implements ISourceProvider {

  @Override
  public String getSource(SourceProviderInput input) throws CoreException {
    ISourceFragment src = getFragment(input);
    if (src != null) {
      StringBuilder sb = new StringBuilder();
      src.createSource(input, sb);
      return sb.toString();
    }
    return null;
  }

  protected ISourceFragment getFragment(SourceProviderInput input) {
    if (input.getPlacement().equals(Placement.Client)) {
      return getClientCallSourceFragment(input);
    }
    else if (input.getPlacement().equals(Placement.Inline)) {
      return getInlineSourceFragment(input);
    }
    else if (TypeUtility.exists(input.getTargetInterface()) && TypeUtility.exists(input.getFormData())) {
      return getServerCallSourceFragment(input);
    }
    return null;
  }

  protected ISourceFragment getClientCallSourceFragment(SourceProviderInput input) {
    return new ClientCallLogicFragment();
  }

  protected ISourceFragment getServerCallSourceFragment(SourceProviderInput input) {
    return new ServerCallLogicFragment();
  }

  protected ISourceFragment getInlineSourceFragment(SourceProviderInput input) {
    return new InlineLogicFragment();
  }
}
