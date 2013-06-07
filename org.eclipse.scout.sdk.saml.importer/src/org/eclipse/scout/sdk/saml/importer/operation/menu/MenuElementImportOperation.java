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
package org.eclipse.scout.sdk.saml.importer.operation.menu;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IType;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.SamlFactory;
import org.eclipse.scout.sdk.extensions.runtime.classes.RuntimeClasses;
import org.eclipse.scout.sdk.operation.MenuNewOperation;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;
import org.eclipse.scout.sdk.util.SdkProperties;

/**
 * <h3>{@link MenuElementImportOperation}</h3> Imports a {@link MenuElement}.
 * 
 * @author mvi
 * @since 3.9.0 11.10.2012
 */
public class MenuElementImportOperation extends AbstractSamlElementImportOperation {

  public final static int EVENT_OBJECT_TYPE_MENU = 16;

  private IType m_createdMenu;

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("menu element cannot be null");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {

    createMenu();

    addTypeExitLogic(getElement().getLogic(), getElement().getType(), m_createdMenu);

    processChildren(m_createdMenu, getSamlContext().getCurrentFormContext());

    fireTypeCreated(m_createdMenu, EVENT_OBJECT_TYPE_MENU);
  }

  private void createMenu() throws CoreException {
    MenuNewOperation o = new MenuNewOperation(getSamlContext().getCurrentParentType(), false);
    o.setTypeName(getElement().getName() + SdkProperties.SUFFIX_MENU);
    o.setSuperTypeSignature(getSuperTypeSignature(RuntimeClasses.IMenu, getElement().getSuperType(), getCurrentScoutModule().getClient()));
    o.validate();
    o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());

    m_createdMenu = o.getCreatedMenu();
  }

  protected void addTypeExitLogic(List<LogicElement> logicList, String type, IType menu) throws CoreException, IllegalArgumentException {
    if (type != null && type.equals(getSamlContext().getGrammarAccess().getMenuElementAccess().getTypeCancelKeyword_2_5_2_0_2().getValue())) {
      SamlFactory factory = SamlFactory.eINSTANCE;
      LogicElement exitLogic = factory.createLogicElement();
      exitLogic.setEvent(getSamlContext().getGrammarAccess().getLogicEventTypeAccess().getClickKeyword_8().getValue());
      exitLogic.setPlacement(getSamlContext().getGrammarAccess().getLogicElementAccess().getPlacementInlineKeyword_3_1_2_0_2().getValue());
      exitLogic.setSource("doCancel();");
      logicList.add(exitLogic);
    }
  }

  @Override
  protected MenuElement getElement() {
    return (MenuElement) super.getElement();
  }
}
