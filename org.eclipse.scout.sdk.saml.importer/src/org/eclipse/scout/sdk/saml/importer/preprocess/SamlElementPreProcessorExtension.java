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
package org.eclipse.scout.sdk.saml.importer.preprocess;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.log.ScoutStatus;

/**
 * <h3>{@link SamlElementPreProcessorExtension}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 09.01.2013
 */
public final class SamlElementPreProcessorExtension {

  public final static String EXTENSION_POINT_ID = "elementPreProcessors";
  public final static String CONFIGURATOR_ELEMENT_NAME = "preProcessor";
  public final static String PROCESSOR_CLASS_ATTRIBUTE = "class";

  private final static Object lock = new Object();
  private static Object[] preProcessors = null;

  private SamlElementPreProcessorExtension() {
  }

  private static Object[] getPreProcessors() throws CoreException {
    if (preProcessors == null) {
      synchronized (lock) {
        if (preProcessors == null) {
          ArrayList<Object> tmp = new ArrayList<Object>();

          IExtensionRegistry reg = Platform.getExtensionRegistry();
          IExtensionPoint xp = reg.getExtensionPoint(SamlImporterActivator.PLUGIN_ID, EXTENSION_POINT_ID);
          IExtension[] extensions = xp.getExtensions();
          for (IExtension extension : extensions) {
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (IConfigurationElement element : elements) {
              if (CONFIGURATOR_ELEMENT_NAME.equals(element.getName())) {
                Object processor = element.createExecutableExtension(PROCESSOR_CLASS_ATTRIBUTE);
                tmp.add(processor);
              }
            }
          }
          preProcessors = tmp.toArray(new Object[tmp.size()]);
        }
      }
    }
    return preProcessors;
  }

  public static void preProcess(EObject e, SamlContext context) throws CoreException {
    for (Object proc : getPreProcessors()) {
      for (Method m : proc.getClass().getDeclaredMethods()) {
        if (m.isAnnotationPresent(SamlPreProcess.class)) {
          if (Modifier.isPublic(m.getModifiers())) {
            Class<?>[] paramTypes = m.getParameterTypes();
            try {
              if (paramTypes.length == 1 && paramTypes[0].isAssignableFrom(e.getClass())) {
                m.invoke(proc, e);
              }
              else if (paramTypes.length == 2 && paramTypes[0].isAssignableFrom(e.getClass()) && paramTypes[1].isAssignableFrom(SamlContext.class)) {
                m.invoke(proc, e, context);
              }
            }
            catch (Exception e1) {
              throw new CoreException(new ScoutStatus("Error invoking post-process-method '" + m.getName() + "' on post-processor '" + proc.getClass().getName() + "'.", e1));
            }
          }
        }
      }
    }
  }
}
