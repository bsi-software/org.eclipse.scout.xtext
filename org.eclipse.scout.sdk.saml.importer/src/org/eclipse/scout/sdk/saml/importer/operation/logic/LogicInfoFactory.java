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
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.services.SamlGrammarAccess;
import org.eclipse.scout.saml.services.SamlGrammarAccess.LogicEventTypeElements;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.service.ParameterArgument;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.util.resources.ResourceUtility;
import org.eclipse.scout.sdk.util.type.TypeComparators;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

/**
 * <h3>{@link LogicInfoFactory}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
@SuppressWarnings("restriction")
public class LogicInfoFactory {

  private static final String FORM_HANDLER_MODIFY = "modify";
  private static final String FORM_HANDLER_NEW = "new";

  public static LogicInfo create(LogicElement element, IType sourceType, SamlFormContext context) {
    LogicInfo ret = new LogicInfo();

    boolean isClientCall = isClientCall(element, context);
    boolean isClassLevel = isClassLevelLogic(element);
    String targetMethodName = null;
    if (!isClassLevel) {
      targetMethodName = getTargetMethodName(element.getEvent(), sourceType, context);
    }

    IType targetType = null;
    IType targetInterfaceType = null;
    if (isClientCall) {
      targetType = context.getClientType();
      targetInterfaceType = context.getClientInterface();
    }
    else {
      targetType = context.getServerType();
      targetInterfaceType = context.getServerInterface();
    }

    ret.setClassLevel(isClassLevel);
    ret.setClientLogic(isClientCall);
    ret.setFormDataType(context.getFormDataType());
    ret.setFormType(context.getFormType());
    if (!isClassLevel) {
      if (isClientCall && TypeUtility.exists(context.getFormType())) {
        ret.setParameters(new ParameterArgument[]{new ParameterArgument("form", context.getFormType().getElementName())});
      }
      else if (TypeUtility.exists(context.getFormDataType())) {
        ret.setParameters(new ParameterArgument[]{new ParameterArgument("formData", context.getFormDataType().getElementName())});
      }
      if (isClientCall) {
        ret.setReturnType(new ParameterArgument("ret", "void"));
      }
      else if (TypeUtility.exists(context.getFormDataType())) {
        ret.setReturnType(new ParameterArgument("ret", context.getFormDataType().getElementName()));
      }
      ret.setSourceLogic(getSourceLogic(isClientCall, targetInterfaceType, context.getFormDataType(), context.getFormType(), targetMethodName));
      ret.setSourceMethodName(getSourceMethodName(element.getEvent(), context));
    }

    LogicEventTypeElements eventElements = context.getSamlContext().getInjector().getInstance(SamlGrammarAccess.class).getLogicEventTypeAccess();
    ret.setSourceType(sourceType);
    if (element.getEvent() != null) {
      if (element.getEvent().equals(eventElements.getModify_loadKeyword_1().getValue()) ||
          element.getEvent().equals(eventElements.getModify_storeKeyword_2().getValue())) {
        ret.setSourceType(getHandler(context.getFormType(), FORM_HANDLER_MODIFY));
      }
      else if (element.getEvent().equals(eventElements.getNew_loadKeyword_3().getValue()) ||
          element.getEvent().equals(eventElements.getNew_storeKeyword_4().getValue())) {
        ret.setSourceType(getHandler(context.getFormType(), FORM_HANDLER_NEW));
      }
    }
    ret.setTargetInterfaceType(targetInterfaceType);
    ret.setTargetLogic(getTargetLogic(element, context));
    ret.setTargetMethodName(targetMethodName);
    ret.setTargetType(targetType);

    return ret;
  }

  private static String getSourceMethodName(String event, SamlFormContext context) {
    LogicEventTypeElements elements = context.getSamlContext().getInjector().getInstance(SamlGrammarAccess.class).getLogicEventTypeAccess();
    if (event.equals(elements.getAllKeyword_0().getValue())) {
      return null;
    }
    else if (event.equals(elements.getModify_loadKeyword_1().getValue())) {
      return "execLoad";
    }
    else if (event.equals(elements.getModify_storeKeyword_2().getValue())) {
      return "execStore";
    }
    else if (event.equals(elements.getNew_loadKeyword_3().getValue())) {
      return "execLoad";
    }
    else if (event.equals(elements.getNew_storeKeyword_4().getValue())) {
      return "execStore";
    }
    else if (event.equals(elements.getChangedKeyword_5().getValue())) {
      return "execChangedValue";
    }
    else if (event.equals(elements.getClickKeyword_6().getValue())) {
      return "execAction";
    }
    else if (event.equals(elements.getMaster_changedKeyword_7().getValue())) {
      return "execChangedMasterValue";
    }
    else if (event.equals(elements.getInitKeyword_8().getValue())) {
      return "execInitField";
    }
    else {
      throw new IllegalArgumentException("Unknown logic type: " + event);
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
    return logicElement.getEvent() == null && logicElement.getName() == null;
  }

  private static String getJavaSourceFromXbaseExpression(XExpression x, SamlFormContext context) {
    XbaseCompiler compiler = context.getSamlContext().getInjector().getInstance(XbaseCompiler.class);
    ImportManager importManager = new ImportManager(true);
    ITreeAppendable appendable = new FakeTreeAppendable(importManager);
    compiler.toJavaStatement(x, appendable, false);
    return appendable.toString();
  }

  private static String getTargetLogic(LogicElement logicElement, SamlFormContext context) throws IllegalArgumentException {
    if (logicElement.getSource() != null) {
      return logicElement.getSource();
    }
    else {
      // referenced logic
      LogicElement exec = logicElement.getExec();
      if (exec == null) {
        throw new IllegalArgumentException("Linked java element for source code could not be found. ");
      }
      return exec.getSource();
    }
  }

  private static boolean isClientCall(LogicElement logicElement, SamlFormContext context) {
    String runat = logicElement.getRunat();
    if (runat == null) {
      // not defined on logic element. may also be defined on java element
      LogicElement exec = logicElement.getExec();
      if (exec == null) {
        throw new IllegalArgumentException("Linked java element for source code could not be found. ");
      }
      runat = exec.getRunat();
    }
    String clientKeyWord = context.getSamlContext().getInjector().getInstance(SamlGrammarAccess.class).getLogicElementAccess().getRunatClientKeyword_3_1_2_0_0().getValue();
    return runat.equals(clientKeyWord);
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

  private static String getTargetMethodName(String event, IType sourceType, SamlFormContext context) {
    LogicEventTypeElements elements = context.getSamlContext().getInjector().getInstance(SamlGrammarAccess.class).getLogicEventTypeAccess();
    if (event.equals(elements.getAllKeyword_0().getValue())) {
      return "getDataByAll";
    }
    else if (event.equals(elements.getModify_loadKeyword_1().getValue())) {
      return "load";
    }
    else if (event.equals(elements.getModify_storeKeyword_2().getValue())) {
      return "store";
    }
    else if (event.equals(elements.getNew_loadKeyword_3().getValue())) {
      return "prepareCreate";
    }
    else if (event.equals(elements.getNew_storeKeyword_4().getValue())) {
      return "create";
    }
    else if (event.equals(elements.getChangedKeyword_5().getValue())) {
      return getSourceElementPrefix(sourceType) + "Changed";
    }
    else if (event.equals(elements.getClickKeyword_6().getValue())) {
      return getSourceElementPrefix(sourceType) + "Clicked";
    }
    else if (event.equals(elements.getMaster_changedKeyword_7().getValue())) {
      return getSourceElementPrefix(sourceType) + "MasterChanged";
    }
    else if (event.equals(elements.getInitKeyword_8().getValue())) {
      return getSourceElementPrefix(sourceType) + "Init";
    }
    else {
      throw new IllegalArgumentException("Unknown logic type: " + event);
    }
  }

  private static String getSourceElementPrefix(IType sourceType) {
    String sourceName = sourceType.getElementName();
    return Character.toLowerCase(sourceName.charAt(0)) + sourceName.substring(1);
  }
}
