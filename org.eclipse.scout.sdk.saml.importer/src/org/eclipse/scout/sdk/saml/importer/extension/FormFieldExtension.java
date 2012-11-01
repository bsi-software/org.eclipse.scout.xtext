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
package org.eclipse.scout.sdk.saml.importer.extension;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.scout.saml.saml.FormFieldElement;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.form.fields.IFormFieldElementOperation;
import org.eclipse.scout.sdk.util.log.ScoutStatus;

/**
 * <h3>{@link FormFieldExtension}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 11.10.2012
 */
public class FormFieldExtension {

  public final static String EXTENSION_POINT_ID = "formFieldOperation";
  public final static String ELEMENT_NAME = "operation";

  public final static String SAML_ELEMENT_ATTRIBUTE = "samlFormElement";
  public final static String OPERATION_ATTRIBUTE = "importOperation";

  private final static Object formFieldElementOperationLock = new Object();
  private static Map<String, Class> formFieldElementMap;

  public static IFormFieldElementOperation getOperationFor(FormFieldElement field) throws CoreException {
    Class clazz = field.getClass();
    Class operationClass = null;

    // only direct interfaces supported atm
    for (Class inf : clazz.getInterfaces()) {
      operationClass = getFormFieldOperationMap().get(inf.getName());
      if (operationClass != null) {
        break;
      }
    }

    if (operationClass == null) {
      throw new CoreException(new ScoutStatus("unable to find operation mapping for form field element: " + clazz));
    }
    try {
      return (IFormFieldElementOperation) operationClass.newInstance();
    }
    catch (Exception e) {
      throw new CoreException(new ScoutStatus(e));
    }
  }

  private static Map<String, Class> getFormFieldOperationMap() throws CoreException {
    if (formFieldElementMap == null) {
      synchronized (formFieldElementOperationLock) {
        if (formFieldElementMap == null) {
          final HashMap<String, Class> map = new HashMap<String, Class>();

          IExtensionRegistry reg = Platform.getExtensionRegistry();
          IExtensionPoint xp = reg.getExtensionPoint(SamlImporterActivator.PLUGIN_ID, EXTENSION_POINT_ID);
          IExtension[] extensions = xp.getExtensions();
          for (IExtension extension : extensions) {
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (IConfigurationElement element : elements) {
              if (ELEMENT_NAME.equals(element.getName())) {
                String samlElementClassName = element.getAttribute(SAML_ELEMENT_ATTRIBUTE);
                IFormFieldElementOperation formFieldOperation = (IFormFieldElementOperation) element.createExecutableExtension(OPERATION_ATTRIBUTE);
                map.put(samlElementClassName, formFieldOperation.getClass());
              }
            }
          }

          formFieldElementMap = map;
        }
      }
    }
    return formFieldElementMap;
  }
}
