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
import org.eclipse.scout.saml.saml.JavaRunAtAttributeList;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LogicExecAttribute;
import org.eclipse.scout.saml.saml.LogicOptionalProperties;
import org.eclipse.scout.saml.saml.LogicTypeAttribute;
import org.eclipse.scout.saml.saml.LogicTypeAttributeList;
import org.eclipse.scout.saml.saml.RunAtAttribute;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.service.ParameterArgument;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;
import org.eclipse.scout.sdk.util.type.TypeComparators;
import org.eclipse.scout.sdk.util.type.TypeUtility;

/**
 * <h3>{@link LogicInfoFactory}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
public class LogicInfoFactory {

  private static final String FORM_HANDLER_MODIFY = "modify";
  private static final String FORM_HANDLER_NEW = "new";

  public static LogicInfo create(LogicElement element, IType formDataType, IType formType, IType sourceType, IType serverType, IType serverInterfaceType, IType clientType, IType clientInterfaceType) {
    LogicInfo ret = new LogicInfo();

    boolean isClientCall = isClientCall(element);
    boolean isClassLevel = isClassLevelLogic(element);
    String targetMethodName = null;
    if (!isClassLevel) {
      targetMethodName = getTargetMethodName(element.getType(), sourceType);
    }

    IType targetType = null;
    IType targetInterfaceType = null;
    if (isClientCall) {
      targetType = clientType;
      targetInterfaceType = clientInterfaceType;
    }
    else {
      targetType = serverType;
      targetInterfaceType = serverInterfaceType;
    }

    ret.setClassLevel(isClassLevel);
    ret.setClientLogic(isClientCall);
    ret.setFormDataType(formDataType);
    ret.setFormType(formType);
    if (!isClassLevel) {
      if (isClientCall && TypeUtility.exists(formType)) {
        ret.setParameters(new ParameterArgument[]{new ParameterArgument("form", formType.getElementName())});
      }
      else if (TypeUtility.exists(formDataType)) {
        ret.setParameters(new ParameterArgument[]{new ParameterArgument("formData", formDataType.getElementName())});
      }
      if (isClientCall) {
        ret.setReturnType(new ParameterArgument("ret", "void"));
      }
      else if (TypeUtility.exists(formDataType)) {
        ret.setReturnType(new ParameterArgument("ret", formDataType.getElementName()));
      }
      ret.setSourceLogic(getSourceLogic(isClientCall, targetInterfaceType, formDataType, formType, targetMethodName));
      ret.setSourceMethodName(getSourceMethodName(element.getType()));
    }
    if (element.getType().getValue().equals(LogicTypeAttributeList.MODIFY_LOAD) || element.getType().getValue().equals(LogicTypeAttributeList.MODIFY_STORE)) {
      ret.setSourceType(getHandler(formType, FORM_HANDLER_MODIFY));
    }
    else if (element.getType().getValue().equals(LogicTypeAttributeList.NEW_LOAD) || element.getType().getValue().equals(LogicTypeAttributeList.NEW_STORE)) {
      ret.setSourceType(getHandler(formType, FORM_HANDLER_NEW));
    }
    else {
      ret.setSourceType(sourceType);
    }
    ret.setTargetInterfaceType(targetInterfaceType);
    ret.setTargetLogic(getTargetLogic(element));
    ret.setTargetMethodName(targetMethodName);
    ret.setTargetType(targetType);

    return ret;
  }

  private static String getSourceMethodName(LogicTypeAttribute eventType) {
    switch (eventType.getValue()) {
      case ALL: {
        return null;
      }
      case MODIFY_LOAD: {
        return "execLoad";
      }
      case MODIFY_STORE: {
        return "execStore";
      }
      case NEW_LOAD: {
        return "execLoad";
      }
      case NEW_STORE: {
        return "execStore";
      }
      case CHANGED: {
        return "execChangedValue";
      }
      case CLICK: {
        return "execAction";
      }
      case MASTER_CHANGED: {
        return "execChangedMasterValue";
      }
      case INIT: {
        return "execInitField";
      }
      default: {
        throw new IllegalArgumentException("Unknown logic type: " + eventType.getValue());
      }
    }
  }

  private static IType getHandler(IType formType, String handlerType) {
    if (!TypeUtility.exists(formType)) {
      throw new IllegalArgumentException("form could not be found.");
    }
    IType result = null;
    IType[] handlers = TypeUtility.getInnerTypesOrdered(formType, TypeUtility.getType(RuntimeClasses.IFormHandler), TypeComparators.getTypeNameComparator());
    for (IType handler : handlers) {
      if (handler.getElementName().toLowerCase().startsWith(handlerType.toLowerCase())) {
        result = handler;
        break;
      }
    }

    if (!TypeUtility.exists(result)) {
      throw new IllegalArgumentException("handler could not be found.");
    }
    return result;
  }

  private static boolean isClassLevelLogic(LogicElement logicElement) {
    return logicElement.getType().getValue().equals(LogicTypeAttributeList.GLOBAL);
  }

  private static RunAtAttribute getRunAtAttribute(LogicElement logicElement) {
    for (LogicOptionalProperties prop : logicElement.getProperties()) {
      if (prop.getRunat() != null) {
        return prop.getRunat();
      }
    }
    return null;
  }

  private static String getTargetLogic(LogicElement logicElement) throws IllegalArgumentException {
    if (logicElement.getSource() != null) {
      return logicElement.getSource();
    }
    else {
      // referenced logic
      LogicExecAttribute exec = getExecAttribute(logicElement);
      if (exec == null) {
        throw new IllegalArgumentException("Linked java element for source code could not be found. ");
      }
      return exec.getValue().getSource();
    }
  }

  private static LogicExecAttribute getExecAttribute(LogicElement logicElement) {
    for (LogicOptionalProperties prop : logicElement.getProperties()) {
      if (prop.getExec() != null) {
        return prop.getExec();
      }
    }
    return null;
  }

  private static boolean isClientCall(LogicElement logicElement) {
    RunAtAttribute runat = getRunAtAttribute(logicElement);
    if (runat == null) {
      // not defined on logic element. may also be defined on java element
      LogicExecAttribute exec = getExecAttribute(logicElement);
      if (exec == null) {
        throw new IllegalArgumentException("Linked java element for source code could not be found. ");
      }
      runat = exec.getValue().getRunat();
    }
    return runat.getValue().equals(JavaRunAtAttributeList.CLIENT);
  }

  private static String getSourceLogic(boolean isClientLogic, IType targetInterfaceType, IType formDataType, IType formType, String targetMethodName) {
    StringBuilder sb = new StringBuilder();
    if (isClientLogic) {
      sb.append("SERVICES.getService(");
      sb.append(targetInterfaceType.getElementName());
      sb.append(".class).");
      sb.append(targetMethodName);
      sb.append("(");
      sb.append(formType.getElementName());
      sb.append(".this);");
    }
    else if (TypeUtility.exists(targetInterfaceType) && TypeUtility.exists(formDataType)) {
      String nl = ResourceUtility.getLineSeparator(targetInterfaceType.getCompilationUnit());
      sb.append(formDataType.getElementName());
      sb.append(" formData = new ");
      sb.append(formDataType.getElementName());
      sb.append("();");
      sb.append(nl);
      sb.append("exportFormData(formData);");
      sb.append(nl);
      sb.append("formData = SERVICES.getService(");
      sb.append(targetInterfaceType.getElementName());
      sb.append(".class).");
      sb.append(targetMethodName);
      sb.append("(formData);");
      sb.append(nl);
      sb.append("importFormData(formData);");
    }
    return sb.toString();
  }

  private static String getTargetMethodName(LogicTypeAttribute eventType, IType sourceType) {

    switch (eventType.getValue()) {
      case ALL: {
        return "getDataByAll";
      }
      case MODIFY_LOAD: {
        return "load";
      }
      case MODIFY_STORE: {
        return "store";
      }
      case NEW_LOAD: {
        return "prepareCreate";
      }
      case NEW_STORE: {
        return "create";
      }
      case CHANGED: {
        return getSourceElementPrefix(sourceType) + "Changed";
      }
      case CLICK: {
        return getSourceElementPrefix(sourceType) + "Clicked";
      }
      case MASTER_CHANGED: {
        return getSourceElementPrefix(sourceType) + "MasterChanged";
      }
      case INIT: {
        return getSourceElementPrefix(sourceType) + "Init";
      }
      default: {
        throw new IllegalArgumentException("Unknown logic type: " + eventType.getValue());
      }
    }
  }

  private static String getSourceElementPrefix(IType sourceType) {
    String sourceName = sourceType.getElementName();
    return Character.toLowerCase(sourceName.charAt(0)) + sourceName.substring(1);
  }
}
