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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.Signature;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.sdk.RuntimeClasses;
import org.eclipse.scout.sdk.operation.MenuNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link MenuElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public class MenuElementImportOperation extends AbstractSamlElementImportOperation {

  private MenuElement m_menuElement;
  private IType m_container;

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    MenuNewOperation operation = new MenuNewOperation(getContainer(), false);
    operation.setTypeName(getMenuElement().getName() + SdkProperties.SUFFIX_MENU);
    operation.setSuperTypeSignature(Signature.createTypeSignature(RuntimeClasses.AbstractMenu, true));
    operation.validate();
    operation.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    //TODO: attributes
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

  public static void processMenus(List<MenuElement> menus, IType parent, SamlContext context) throws CoreException, IllegalArgumentException {
    for (MenuElement m : menus) {
      MenuElementImportOperation o = new MenuElementImportOperation();
      o.setContainer(parent);
      o.setMenuElement(m);
      o.setSamlContext(context);
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
}
