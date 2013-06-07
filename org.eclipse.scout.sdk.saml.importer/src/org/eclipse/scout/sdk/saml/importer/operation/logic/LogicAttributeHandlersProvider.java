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
package org.eclipse.scout.sdk.saml.importer.operation.logic;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.saml.saml.KeyElement;
import org.eclipse.scout.saml.saml.LogicElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.MenuElement;
import org.eclipse.scout.saml.saml.SamlPackage;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.AbstractAttributeHandlersProvider;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttribute;
import org.eclipse.scout.sdk.saml.importer.extension.attribute.SamlAttributeHandler;
import org.eclipse.scout.sdk.saml.importer.extension.element.ElementImportersExtension;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;

/**
 * <h3>{@link LogicAttributeHandlersProvider}</h3> Handles attributes of a {@link LogicElement}.
 * 
 * @author mvi
 * @since 3.9.0 01.02.2013
 */
public class LogicAttributeHandlersProvider extends AbstractAttributeHandlersProvider {

  @SamlAttributeHandler(handles = {
      @SamlAttribute(elementType = LookupElement.class, featureId = SamlPackage.LOOKUP_ELEMENT__LOGIC),
      @SamlAttribute(elementType = CodeElement.class, featureId = SamlPackage.CODE_ELEMENT__LOGIC),
      @SamlAttribute(elementType = FormElement.class, featureId = SamlPackage.FORM_ELEMENT__LOGIC),
      @SamlAttribute(elementType = FormFieldElement.class, featureId = SamlPackage.FORM_FIELD_ELEMENT__LOGIC),
      @SamlAttribute(elementType = MenuElement.class, featureId = SamlPackage.MENU_ELEMENT__LOGIC),
      @SamlAttribute(elementType = KeyElement.class, featureId = SamlPackage.KEY_ELEMENT__LOGIC)
  })
  public void applyLogics(List<LogicElement> logics) throws IllegalArgumentException, CoreException {
    Collection<EventLogicsInfo> eventLogics = EventLogicsInfoFactory.create(logics);
    EventLogicsInfo classLevelInfo = null;

    // first all event logics
    for (EventLogicsInfo eli : eventLogics) {
      if (eli.isClassLevel()) {
        classLevelInfo = eli;
      }
      else {
        runLogicOperation(eli, getSamlContext());
      }
    }

    // then all class-level logics
    if (classLevelInfo != null) {
      runLogicOperation(classLevelInfo, getSamlContext());
    }
  }

  private static void runLogicOperation(EventLogicsInfo logics, SamlContext context) throws CoreException, IllegalArgumentException {
    IOperation slfo = ElementImportersExtension.getImporterFor(logics, context);
    slfo.validate();
    slfo.run(context.getMonitor(), context.getWorkingCopyManager());
  }
}
