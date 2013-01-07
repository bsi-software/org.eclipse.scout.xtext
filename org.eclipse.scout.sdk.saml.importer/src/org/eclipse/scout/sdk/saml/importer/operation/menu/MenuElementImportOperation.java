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
package org.eclipse.scout.sdk.saml.importer.operation.menu;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.SamlFactory;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.MenuNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.AbstractUiElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.SamlFormContext;
import org.eclipse.scout.sdk.saml.importer.operation.logic.SamlLogicFillOperation;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.internal.sigcache.SignatureCache;

/**
 * <h3>{@link MenuElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public class MenuElementImportOperation extends AbstractUiElementImportOperation {

  private MenuElement m_menuElement;
  private IType m_container;
  private SamlFormContext m_samlContext;

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    MenuNewOperation o = new MenuNewOperation(getContainer(), false);
    o.setTypeName(getMenuElement().getName() + SdkProperties.SUFFIX_MENU);

    String superType = RuntimeClasses.getSuperTypeName(RuntimeClasses.IMenu, getSamlContext().getRootProject());
    if (getMenuElement().getSuperType() != null) {
      superType = getMenuElement().getSuperType().getDefinition();
    }
    o.setSuperTypeSignature(SignatureCache.createTypeSignature(superType));

    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
    IType menu = o.getCreatedMenu();
    ITypeHierarchy h = menu.newSupertypeHierarchy(getSamlContext().getMonitor());

    applyEnabledAttribute(getMenuElement().getEnabled(), menu, h);
    applyTextAttribute(getMenuElement().getText(), menu, h);
    applyVisibleAttribute(getMenuElement().getVisible(), menu, h);
    applySingleSelectionAction(getMenuElement().getSingleSelect(), menu, h);
    applyMultiSelectionAction(getMenuElement().getMultiSelect(), menu, h);
    applyEmptySpaceAction(getMenuElement().getEmptySelect(), menu, h);
    applyTypeSeparatorAttribute(getMenuElement().getType(), menu, h);

    SamlLogicFillOperation.fillAllLogic(getMenuElement().getLogic(), getSamlFormContext(), menu);
    applyTypeExitLogic(getMenuElement().getType(), menu);

    processMenus(getMenuElement().getMenus(), menu, getSamlFormContext());
  }

  protected void applyTypeExitLogic(String a, IType field) throws CoreException, IllegalArgumentException {
    if (a != null && a.equals(getSamlContext().getGrammarAccess().getMenuElementAccess().getTypeCancelKeyword_2_5_2_0_2().getValue())) {
      SamlFactory factory = SamlFactory.eINSTANCE;
      LogicElement exitLogic = factory.createLogicElement();
      exitLogic.setEvent(getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getClickKeyword_8().getValue());
      exitLogic.setPlacement(getSamlContext().getGrammarAccess().getLogicElementAccess().getPlacementInlineKeyword_3_1_2_0_2().getValue());
      exitLogic.setSource("doCancel();");

      ArrayList<LogicElement> logicList = new ArrayList<LogicElement>(1);
      logicList.add(exitLogic);
      SamlLogicFillOperation.fillAllLogic(logicList, getSamlFormContext(), field);
    }
  }

  protected void applyTypeSeparatorAttribute(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if (a != null && a.equals(getSamlContext().getGrammarAccess().getMenuElementAccess().getTypeSeparatorKeyword_2_5_2_0_1().getValue())) {
      overrideMethod(field, h, "getConfiguredSeparator", "return true;");
    }
  }

  protected void applySingleSelectionAction(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("false".equals(a)) {
      overrideMethod(field, h, "getConfiguredSingleSelectionAction", "return false;");
    }
  }

  protected void applyMultiSelectionAction(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("true".equals(a)) {
      overrideMethod(field, h, "getConfiguredMultiSelectionAction", "return true;");
    }
  }

  protected void applyEmptySpaceAction(String a, IType field, ITypeHierarchy h) throws CoreException, IllegalArgumentException {
    if ("true".equals(a)) {
      overrideMethod(field, h, "getConfiguredEmptySpaceAction", "return true;");
    }
  }

  @Override
  public String getOperationName() {
    return "create menu";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getMenuElement() == null) {
      throw new IllegalArgumentException("menu element cannot be null");
    }
    if (getContainer() == null) {
      throw new IllegalArgumentException("menu container cannot be null");
    }
  }

  public static void processMenus(List<MenuElement> menus, IType parent, SamlFormContext context) throws CoreException, IllegalArgumentException {
    for (MenuElement m : menus) {
      MenuElementImportOperation o = new MenuElementImportOperation();
      o.setContainer(parent);
      o.setMenuElement(m);
      o.setSamlFormContext(context);
      o.setSamlContext(context.getSamlContext());
      o.validate();
      o.run();
    }
  }

  public MenuElement getMenuElement() {
    return m_menuElement;
  }

  public void setMenuElement(MenuElement menuElement) {
    m_menuElement = menuElement;
  }

  public IType getContainer() {
    return m_container;
  }

  public void setContainer(IType container) {
    m_container = container;
  }

  public SamlFormContext getSamlFormContext() {
    return m_samlContext;
  }

  public void setSamlFormContext(SamlFormContext samlContext) {
    m_samlContext = samlContext;
  }
}
