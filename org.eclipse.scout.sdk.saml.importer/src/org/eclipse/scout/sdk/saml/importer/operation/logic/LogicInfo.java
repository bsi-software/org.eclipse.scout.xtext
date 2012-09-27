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

import org.eclipse.jdt.core.IType;
import org.eclipse.scout.sdk.operation.service.ParameterArgument;

/**
 * <h3>{@link LogicInfo}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class LogicInfo {

  private IType m_formType;
  private IType m_formDataType;

  private String m_sourceMethodName;
  private IType m_sourceType;
  private String m_sourceLogic;

  private String m_targetMethodName;
  private IType m_targetType;
  private IType m_targetInterfaceType;
  private String m_targetLogic;

  private boolean m_isClientLogic;
  private boolean m_isClassLevel;

  private ParameterArgument m_returnType;
  private ParameterArgument[] m_parameters;

  public IType getFormType() {
    return m_formType;
  }

  public void setFormType(IType formType) {
    m_formType = formType;
  }

  public IType getFormDataType() {
    return m_formDataType;
  }

  public void setFormDataType(IType formDataType) {
    m_formDataType = formDataType;
  }

  public String getSourceMethodName() {
    return m_sourceMethodName;
  }

  public void setSourceMethodName(String sourceMethodName) {
    m_sourceMethodName = sourceMethodName;
  }

  public IType getSourceType() {
    return m_sourceType;
  }

  public void setSourceType(IType sourceType) {
    m_sourceType = sourceType;
  }

  public String getSourceLogic() {
    return m_sourceLogic;
  }

  public void setSourceLogic(String sourceLogic) {
    m_sourceLogic = sourceLogic;
  }

  public String getTargetMethodName() {
    return m_targetMethodName;
  }

  public void setTargetMethodName(String targetMethodName) {
    m_targetMethodName = targetMethodName;
  }

  public IType getTargetType() {
    return m_targetType;
  }

  public void setTargetType(IType targetType) {
    m_targetType = targetType;
  }

  public IType getTargetInterfaceType() {
    return m_targetInterfaceType;
  }

  public void setTargetInterfaceType(IType targetInterfaceType) {
    m_targetInterfaceType = targetInterfaceType;
  }

  public String getTargetLogic() {
    return m_targetLogic;
  }

  public void setTargetLogic(String targetLogic) {
    m_targetLogic = targetLogic;
  }

  public boolean isClientLogic() {
    return m_isClientLogic;
  }

  public void setClientLogic(boolean isClientLogic) {
    m_isClientLogic = isClientLogic;
  }

  public boolean isClassLevel() {
    return m_isClassLevel;
  }

  public void setClassLevel(boolean isClassLevel) {
    m_isClassLevel = isClassLevel;
  }

  public ParameterArgument getReturnType() {
    return m_returnType;
  }

  public void setReturnType(ParameterArgument returnType) {
    m_returnType = returnType;
  }

  public ParameterArgument[] getParameters() {
    return m_parameters;
  }

  public void setParameters(ParameterArgument[] parameters) {
    m_parameters = parameters;
  }
}
