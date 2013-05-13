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
import org.eclipse.scout.saml.saml.ButtonElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.saml.saml.SmartfieldElement;
import org.eclipse.scout.saml.saml.TableElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.extensions.runtime.classes.RuntimeClasses;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AbstractAttributeHandlersProvider;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttribute;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttributeHandler;
import org.eclipse.scout.sdk.saml.importer.extension.element.ElementImportersExtension;
import org.eclipse.scout.sdk.util.SdkProperties;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.eclipse.scout.sdk.util.type.TypeUtility;

/**
 * <h3>{@link MenuAttributeHandlersProvider}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 03.02.2013
 */
public class MenuAttributeHandlersProvider extends AbstractAttributeHandlersProvider {

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = ButtonElement.class, featureId = SamlPackage.BUTTON_ELEMENT__MENUS),
      @SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__MENUS),
      @SamlAttribute(elementType = TableElement.class, featureId = SamlPackage.TABLE_ELEMENT__MENUS),
      @SamlAttribute(elementType = SmartfieldElement.class, featureId = SamlPackage.SMARTFIELD_ELEMENT__MENUS)
  })
  public void dispatchMenuElements(List<MenuElement> menus) throws CoreException {
    boolean isTableFieldMenu = getSamlContext().getSuperTypeHierarchy(getSamlContext().getCurrentParentType())
        .contains(TypeUtility.getType(RuntimeClasses.ITableField));

    IType tableType = null;
    if (isTableFieldMenu) {
      tableType = getSamlContext().getCurrentParentType().getType(SdkProperties.TYPE_NAME_TABLEFIELD_TABLE);
      if (!TypeUtility.exists(tableType)) {
        throw new CoreException(new ScoutStatus("No table could be found to create a menu in table-field '" + getSamlContext().getCurrentParentType() + "'."));
      }
    }

    try {
      if (isTableFieldMenu) {
        getSamlContext().pushParentType(tableType);
      }
      for (MenuElement m : menus) {
        IOperation o = ElementImportersExtension.getImporterFor(m, getSamlContext());
        o.validate();
        o.run(getSamlContext().getMonitor(), getSamlContext().getWorkingCopyManager());
      }
    }
    finally {
      if (isTableFieldMenu) {
        getSamlContext().popParentType();
      }
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__TYPE)})
  public void applyTypeSeparatorAttribute(String a) throws CoreException, IllegalArgumentException {
    if (a != null && a.equals(getSamlContext().getGrammarAccess().getMenuElementAccess().getTypeSeparatorKeyword_2_5_2_0_1().getValue())) {
      overrideMethod("getConfiguredSeparator", "return true;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__SINGLE_SELECT)})
  public void applySingleSelectionAction(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredSingleSelectionAction", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__MULTI_SELECT)})
  public void applyMultiSelectionAction(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getTrueKeyword_0().getValue().equals(a)) {
      overrideMethod("getConfiguredMultiSelectionAction", "return true;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__EMPTY_SELECT)})
  public void applyEmptySpaceAction(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getTrueKeyword_0().getValue().equals(a)) {
      overrideMethod("getConfiguredEmptySpaceAction", "return true;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__ENABLED)})
  public void applyEnabledAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredEnabled", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__VISIBLE)})
  public void applyVisibleAttribute(String a) throws CoreException, IllegalArgumentException {
    if (getSamlContext().getGrammarAccess().getBooleanTypeAccess().getFalseKeyword_1().getValue().equals(a)) {
      overrideMethod("getConfiguredVisible", "return false;");
    }
  }

  @SamlAttributeHandler(handles = {@SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__TEXT)})
  public void applyTextAttribute(TranslationElement a) throws CoreException, IllegalArgumentException {
    if (a != null) {
      overrideMethod("getConfiguredText", getNlsReturnClause(a));
    }
  }
}
