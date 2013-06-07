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
package org.eclipse.scout.sdk.saml.importer.extension.configurator;

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.operation.service.ParameterArgument;
import org.eclipse.scout.sdk.saml.importer.operation.logic.LogicSnippetInfoFactory.Placement;
import org.eclipse.scout.sdk.workspace.type.config.ConfigurationMethod;

/**
 * <h3>{@link SourceProviderInput}</h3>
 * 
 * @author mvi
 * @since 3.9.0 28.11.2012
 */
public class SourceProviderInput {

  private Placement m_placement;

  private IType m_targetInterface;
  private String m_targetMethodName;

  private ConfigurationMethod m_sourceMethod;
  private ParameterArgument m_sourceMethodReturnParam;

  private IType m_formData;
  private IType m_form;

  private String m_logic;

  public SourceProviderInput(Placement placement, IType targetInterface, String targetMethodName,
      ConfigurationMethod sourceMethod, ParameterArgument sourceMethodReturnParam, IType formData,
      IType form, String logic) {
    m_placement = placement;
    m_targetInterface = targetInterface;
    m_targetMethodName = targetMethodName;
    m_sourceMethod = sourceMethod;
    m_sourceMethodReturnParam = sourceMethodReturnParam;
    m_formData = formData;
    m_form = form;
    m_logic = logic;
  }

  public Placement getPlacement() {
    return m_placement;
  }

  public void setPlacement(Placement placement) {
    m_placement = placement;
  }

  public IType getTargetInterface() {
    return m_targetInterface;
  }

  public void setTargetInterface(IType targetInterface) {
    m_targetInterface = targetInterface;
  }

  public String getTargetMethodName() {
    return m_targetMethodName;
  }

  public void setTargetMethodName(String targetMethodName) {
    m_targetMethodName = targetMethodName;
  }

  public ConfigurationMethod getSourceMethod() {
    return m_sourceMethod;
  }

  public void setSourceMethod(ConfigurationMethod sourceMethod) {
    m_sourceMethod = sourceMethod;
  }

  public ParameterArgument getSourceMethodReturnParam() {
    return m_sourceMethodReturnParam;
  }

  public void setSourceMethodReturnParam(ParameterArgument sourceMethodReturnParam) {
    m_sourceMethodReturnParam = sourceMethodReturnParam;
  }

  public IType getFormData() {
    return m_formData;
  }

  public void setFormData(IType formData) {
    m_formData = formData;
  }

  public IType getForm() {
    return m_form;
  }

  public void setForm(IType form) {
    m_form = form;
  }

  public String getLogic() {
    return m_logic;
  }

  public void setLogic(String logic) {
    m_logic = logic;
  }

  public boolean isSourceMethodReturningValue() {
    return getSourceMethodReturnParam() != null && !"void".equals(getSourceMethodReturnParam().getType());
  }
}
