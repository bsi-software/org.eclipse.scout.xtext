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
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.services.SamlGrammarAccess.LogicEventTypeElements;
import org.eclipse.scout.sdk.operation.service.ParameterArgument;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.CodeConfiguratorsExtension;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.SourceProviderInput;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.util.SamlImportUtility;
import org.eclipse.scout.sdk.util.NamingUtility;
import org.eclipse.scout.sdk.util.signature.SignatureUtility;
import org.eclipse.scout.sdk.util.type.TypeUtility;
import org.eclipse.scout.sdk.workspace.type.ScoutTypeUtility;
import org.eclipse.scout.sdk.workspace.type.config.ConfigurationMethod;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.compiler.ImportManager;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.compiler.output.FakeTreeAppendable;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;

/**
 * <h3>{@link LogicSnippetInfoFactory}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.09.2012
 */
@SuppressWarnings("restriction")
public class LogicSnippetInfoFactory {

  public static enum Placement {
    Client,
    Server,
    Inline
  }

  public static LogicSnippetInfo[] create(EventLogicsInfo eventLogic, SamlContext context) throws CoreException {
    LogicSnippetInfo[] logicInfos = new LogicSnippetInfo[eventLogic.getEventLogics().size()];
    for (int i = 0; i < logicInfos.length; i++) {
      logicInfos[i] = create(eventLogic.getEventLogics().get(i), context);
    }
    return logicInfos;
  }

  private static LogicSnippetInfo create(LogicElement element, SamlContext context) throws CoreException {
    LogicSnippetInfo ret = new LogicSnippetInfo();

    SamlFormContext formContext = context.getCurrentFormContext();
    Placement placement = getLogicPlacement(element, context);
    boolean isClassLevel = isClassLevelLogic(element);
    String targetLogic = getTargetLogic(element);
    String targetMethodName = null;
    IType sourceType = context.getCurrentParentType();

    if (!isClassLevel) {
      targetMethodName = getTargetMethodName(element, sourceType, context);
    }

    LogicEventTypeElements eventElements = context.getGrammarAccess().getLogicEventTypeAccess();
    ret.setSourceType(sourceType);
    if (element.getEvent() != null) {
      if (element.getEvent().equals(eventElements.getModify_loadKeyword_1().getValue()) ||
          element.getEvent().equals(eventElements.getModify_storeKeyword_2().getValue()) ||
          element.getEvent().equals(eventElements.getModify_discardKeyword_3().getValue())) {
        ret.setSourceType(getHandler(formContext.getFormType(), SamlImportUtility.FORM_HANDLER_MODIFY));
      }
      else if (element.getEvent().equals(eventElements.getNew_loadKeyword_4().getValue()) ||
          element.getEvent().equals(eventElements.getNew_storeKeyword_5().getValue()) ||
          element.getEvent().equals(eventElements.getNew_discardKeyword_6().getValue())) {
        ret.setSourceType(getHandler(formContext.getFormType(), SamlImportUtility.FORM_HANDLER_NEW));
      }
    }

    IType targetType = null;
    IType targetInterfaceType = null;
    switch (placement) {
      case Client: {
        targetType = formContext.getClientType();
        targetInterfaceType = formContext.getClientInterface();
        break;
      }
      case Server: {
        targetType = formContext.getServerType();
        targetInterfaceType = formContext.getServerInterface();
        break;
      }
      case Inline: {
        targetType = ret.getSourceType();
        break;
      }
    }

    ret.setClassLevel(isClassLevel);
    ret.setFormDataType(formContext.getFormDataType());
    ret.setFormType(formContext.getFormType());
    if (!isClassLevel) {
      boolean isClientCall = placement.equals(Placement.Client) | placement.equals(Placement.Inline);
      String sourceMethodName = getSourceMethodName(element.getEvent(), context);
      if (TypeUtility.exists(ret.getSourceType())) {
        ret.setSourceMethod(ScoutTypeUtility.getConfigurationMethod(ret.getSourceType(), sourceMethodName));
      }

      if (isClientCall && TypeUtility.exists(formContext.getFormType())) {
        ret.setParameters(getClientParameterTypes(sourceMethodName, ret.getSourceType(), formContext));
      }
      else if (TypeUtility.exists(formContext.getFormDataType())) {
        ret.setParameters(new ParameterArgument[]{new ParameterArgument("formData", formContext.getFormDataType().getElementName())});
      }

      if (isClientCall) {
        ret.setReturnType(getClientReturnType(ret.getSourceMethod()));
      }
      else if (TypeUtility.exists(formContext.getFormDataType())) {
        ret.setReturnType(new ParameterArgument("ret", formContext.getFormDataType().getElementName()));
      }

      if (!placement.equals(Placement.Server) || (TypeUtility.exists(targetInterfaceType) && TypeUtility.exists(formContext.getFormDataType()))) {
        SourceProviderInput input = new SourceProviderInput(placement, targetInterfaceType, targetMethodName,
            ret.getSourceMethod(), ret.getReturnType(), formContext.getFormDataType(), formContext.getFormType(), targetLogic);
        ret.setSourceLogic(CodeConfiguratorsExtension.getSource(input));
      }
    }

    ret.setTargetInterfaceType(targetInterfaceType);
    ret.setTargetLogic(targetLogic);
    ret.setTargetMethodName(targetMethodName);
    ret.setTargetType(targetType);

    return ret;
  }

  private static ParameterArgument[] getClientParameterTypes(String sourceMethodName, IType sourceType, SamlFormContext context) throws CoreException {
    //TODO [mvi]: parse parametes of operation method and also pass them to the client service?
    return new ParameterArgument[]{new ParameterArgument("form", context.getFormType().getElementName())};
  }

  private static ParameterArgument getClientReturnType(ConfigurationMethod cm) throws CoreException {
    String retTypeSig = SignatureUtility.getReturnTypeSignatureResolved(cm.getDefaultMethod(), cm.getType());
    String retTypeName = Signature.getSignatureSimpleName(retTypeSig);
    return new ParameterArgument("ret", retTypeName);
  }

  private static String getSourceMethodName(String event, SamlContext context) {
    LogicEventTypeElements elements = context.getGrammarAccess().getLogicEventTypeAccess();
    if (event.equals(elements.getAllKeyword_0().getValue())) {
      return null;
    }
    else if (event.equals(elements.getModify_loadKeyword_1().getValue())) {
      return "execLoad";
    }
    else if (event.equals(elements.getModify_storeKeyword_2().getValue())) {
      return "execStore";
    }
    else if (event.equals(elements.getModify_discardKeyword_3().getValue())) {
      return "execDiscard";
    }
    else if (event.equals(elements.getNew_loadKeyword_4().getValue())) {
      return "execLoad";
    }
    else if (event.equals(elements.getNew_storeKeyword_5().getValue())) {
      return "execStore";
    }
    else if (event.equals(elements.getNew_discardKeyword_6().getValue())) {
      return "execDiscard";
    }
    else if (event.equals(elements.getChangedKeyword_7().getValue())) {
      return "execChangedValue";
    }
    else if (event.equals(elements.getClickKeyword_8().getValue())) {
      return "execAction";
    }
    else if (event.equals(elements.getMaster_changedKeyword_9().getValue())) {
      return "execChangedMasterValue";
    }
    else if (event.equals(elements.getInitKeyword_10().getValue())) {
      return "execInitField";
    }
    else if (event.equals(elements.getFormat_valueKeyword_11().getValue())) {
      return "execFormatValue";
    }
    else if (event.equals(elements.getActivatedKeyword_12().getValue())) {
      return "execAction";
    }
    else if (event.equals(elements.getLoadKeyword_13().getValue())) {
      return "execLoadCodes";
    }
    else {
      throw new IllegalArgumentException("Unknown logic type: " + event);
    }
  }

  private static IType getHandler(IType formType, String handlerType) {
    IType result = SamlImportUtility.getFormHandler(formType, handlerType);
    if (!TypeUtility.exists(result)) {
      throw new IllegalArgumentException("handler could not be found.");
    }
    return result;
  }

  private static boolean isClassLevelLogic(LogicElement logicElement) {
    return logicElement.getEvent() == null && logicElement.getName() == null;
  }

  private static String getJavaSourceFromXbaseExpression(XExpression x, SamlContext context) {
    XbaseCompiler compiler = context.getInjector().getInstance(XbaseCompiler.class);
    ImportManager importManager = new ImportManager(true);
    ITreeAppendable appendable = new FakeTreeAppendable(importManager);
    compiler.toJavaStatement(x, appendable, false);
    return appendable.toString();
  }

  private static String getTargetLogic(LogicElement logicElement) throws IllegalArgumentException {
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

  private static Placement getLogicPlacement(LogicElement logicElement, SamlContext context) throws IllegalArgumentException {
    String placement = logicElement.getPlacement();
    if (placement == null) {
      // not defined on logic element itself. may be defined on linked logic element
      LogicElement exec = logicElement.getExec();
      if (exec == null) {
        throw new IllegalArgumentException("Linked java element for source code could not be found. ");
      }
      placement = exec.getPlacement();
    }
    if (placement.equals(context.getGrammarAccess().getLogicElementAccess().getPlacementClientKeyword_3_1_2_0_0().getValue())) {
      return Placement.Client;
    }
    else if (placement.equals(context.getGrammarAccess().getLogicElementAccess().getPlacementServerKeyword_3_1_2_0_1().getValue())) {
      return Placement.Server;
    }
    else if (placement.equals(context.getGrammarAccess().getLogicElementAccess().getPlacementInlineKeyword_3_1_2_0_2().getValue())) {
      return Placement.Inline;
    }
    else {
      throw new IllegalArgumentException("unknown logic placement: " + placement);
    }
  }

  private static String getTargetMethodName(LogicElement element, IType sourceType, SamlContext context) {
    LogicEventTypeElements elements = context.getGrammarAccess().getLogicEventTypeAccess();
    String event = element.getEvent();
    if (event.equals(elements.getAllKeyword_0().getValue())) {
      return "getDataByAll";
    }
    else if (event.equals(elements.getModify_loadKeyword_1().getValue())) {
      return "load";
    }
    else if (event.equals(elements.getModify_storeKeyword_2().getValue())) {
      return "store";
    }
    else if (event.equals(elements.getModify_discardKeyword_3().getValue())) {
      return "close";
    }
    else if (event.equals(elements.getNew_loadKeyword_4().getValue())) {
      return "prepareCreate";
    }
    else if (event.equals(elements.getNew_storeKeyword_5().getValue())) {
      return "create";
    }
    else if (event.equals(elements.getNew_discardKeyword_6().getValue())) {
      return "discard";
    }
    else if (event.equals(elements.getChangedKeyword_7().getValue())) {
      return getSourceElementPrefix(sourceType) + "Changed";
    }
    else if (event.equals(elements.getClickKeyword_8().getValue())) {
      return getSourceElementPrefix(sourceType) + "Clicked";
    }
    else if (event.equals(elements.getMaster_changedKeyword_9().getValue())) {
      return getSourceElementPrefix(sourceType) + "MasterChanged";
    }
    else if (event.equals(elements.getInitKeyword_10().getValue())) {
      return getSourceElementPrefix(sourceType) + "Init";
    }
    else if (event.equals(elements.getFormat_valueKeyword_11().getValue())) {
      return getSourceElementPrefix(sourceType) + "FormatValue";
    }
    else if (event.equals(elements.getActivatedKeyword_12().getValue())) {
      // 'activated' is only used by key strokes
      KeyElement container = (KeyElement) element.eContainer();
      return NamingUtility.toJavaCamelCase(container.getStroke()) + "Pressed";
    }
    else if (event.equals(elements.getLoadKeyword_13().getValue())) {
      return getSourceElementPrefix(sourceType) + "Loaded";
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
