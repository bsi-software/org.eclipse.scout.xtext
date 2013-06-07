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
package org.eclipse.scout.sdk.saml.importer.extension.attribute;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.scout.commons.CompareUtility;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.log.ScoutStatus;

public class AttributeHandlersProvidersExtension {

  public final static String[] EXCLUDED_ATTRIBUTES = new String[]{"name", "superType", "valueType", "svcSuperType"};

  public final static String EXTENSION_POINT_ID = "attributeHandlersProviders";
  public final static String PROVIDER_ELEMENT_NAME = "attributeHandlersProvider";
  public final static String PROVIDER_CLASS_ATTRIBUTE = "class";

  private final static Object lock = new Object();
  private static Map<Class<?> /*element*/, Map<Integer/*feature id*/, Map<Method, IAttributeHandlersProvider>>> allHandlers = null;

  private static IAttributeHandlersProvider[] getAttributeHandlers() {
    IExtensionRegistry reg = Platform.getExtensionRegistry();
    IExtensionPoint xp = reg.getExtensionPoint(SamlImporterActivator.PLUGIN_ID, EXTENSION_POINT_ID);
    IExtension[] extensions = xp.getExtensions();
    ArrayList<IAttributeHandlersProvider> providers = new ArrayList<IAttributeHandlersProvider>();
    for (IExtension extension : extensions) {
      IConfigurationElement[] elements = extension.getConfigurationElements();
      for (IConfigurationElement element : elements) {
        if (PROVIDER_ELEMENT_NAME.equals(element.getName())) {
          try {
            IAttributeHandlersProvider provider = (IAttributeHandlersProvider) element.createExecutableExtension(PROVIDER_CLASS_ATTRIBUTE);
            providers.add(provider);
          }
          catch (CoreException e) {
            SamlImporterActivator.logError("Error creating attribute handlers provider '" + element.getAttribute(PROVIDER_CLASS_ATTRIBUTE) + "'.", e);
          }
        }
      }
    }
    return providers.toArray(new IAttributeHandlersProvider[providers.size()]);
  }

  private static Map<Class<?>, Map<Integer, Map<Method, IAttributeHandlersProvider>>> getAllHandlers() {
    if (allHandlers == null) {
      synchronized (lock) {
        if (allHandlers == null) {
          Map<Class<?>, Map<Integer, Map<Method, IAttributeHandlersProvider>>> tmp = new HashMap<Class<?>, Map<Integer, Map<Method, IAttributeHandlersProvider>>>();
          for (IAttributeHandlersProvider handlerProvider : getAttributeHandlers()) {
            for (Method m : handlerProvider.getClass().getDeclaredMethods()) {
              if (Modifier.isPublic(m.getModifiers())) {
                Class<?>[] paramTypes = m.getParameterTypes();
                if (paramTypes.length == 1) {
                  SamlAttributeHandler handler = m.getAnnotation(SamlAttributeHandler.class);
                  if (handler != null) {
                    SamlAttribute[] possibleAttributes = handler.handles();
                    if (possibleAttributes != null && possibleAttributes.length > 0) {
                      for (SamlAttribute possibleHandling : possibleAttributes) {
                        Class<? extends EObject> elementType = possibleHandling.elementType();
                        if (!elementType.equals(EObject.class)) {
                          int i = possibleHandling.featureId();
                          if (i >= 0) {
                            Integer id = Integer.valueOf(i);
                            Map<Integer, Map<Method, IAttributeHandlersProvider>> handlersForElementType = tmp.get(elementType);
                            if (handlersForElementType == null) {
                              handlersForElementType = new HashMap<Integer, Map<Method, IAttributeHandlersProvider>>();
                              tmp.put(elementType, handlersForElementType);
                            }
                            Map<Method, IAttributeHandlersProvider> methods = handlersForElementType.get(id);
                            if (methods == null) {
                              methods = new HashMap<Method, IAttributeHandlersProvider>();
                              handlersForElementType.put(id, methods);
                            }
                            methods.put(m, handlerProvider);
                          }
                          else {
                            SamlImporterActivator.logError("No featureId specified for attribute-handler '" + m.getName() + "' in provider '" + handlerProvider.getClass().getName() + "'.");
                          }
                        }
                        else {
                          SamlImporterActivator.logError("No specific elementType specified for attribute-handler '" + m.getName() + "' in provider '" + handlerProvider.getClass().getName() + "'.");
                        }
                      }
                    }
                    else {
                      SamlImporterActivator.logWarning("Attribute-handler '" + m.getName() + "' in provider '" + handlerProvider.getClass().getName() + "' handles no attributes.");
                    }
                  }
                }
              }
            }
          }
          allHandlers = tmp;
        }
      }
    }
    return allHandlers;
  }

  private static Map<Method, IAttributeHandlersProvider> getMostSpecificHandlersFor(int featureId, Class<?> type) {
    Map<Class<?>, Map<Integer, Map<Method, IAttributeHandlersProvider>>> handlers = getAllHandlers();
    Integer id = Integer.valueOf(featureId);
    return getMostSpecificHandlers(type, handlers, id);
  }

  private static Map<Method, IAttributeHandlersProvider> getMostSpecificHandlers(Class<?> child, Map<Class<?>, Map<Integer, Map<Method, IAttributeHandlersProvider>>> handlers, Integer id) {
    Map<Method, IAttributeHandlersProvider> ret = null;
    Class<?> keyOfRet = null;
    for (Entry<Class<?>, Map<Integer, Map<Method, IAttributeHandlersProvider>>> candidate : handlers.entrySet()) {
      Map<Method, IAttributeHandlersProvider> methods = candidate.getValue().get(id);
      if (methods != null && candidate.getKey().isAssignableFrom(child)) {
        if (ret == null || !candidate.getKey().isAssignableFrom(keyOfRet)) {
          ret = methods;
          keyOfRet = candidate.getKey();
        }
      }
    }
    return ret;
  }

  private static <T> boolean containsAny(T[] list, T searchFor) {
    if (list != null && list.length > 0) {
      for (T t : list) {
        if (CompareUtility.equals(t, searchFor)) {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * Goes through all attributes that are set in the given element and calls the corresponding attribute handlers (if
   * existing).
   * 
   * @param element
   *          The element for which the attributes should be imported.
   * @param context
   *          The saml context.
   * @throws CoreException
   */
  public static void applyAttributes(EObject element, SamlContext context) throws CoreException {
    EList<EStructuralFeature> eAllStructuralFeatures = element.eClass().getEAllStructuralFeatures();
    if (eAllStructuralFeatures.size() > 0) {
      for (EStructuralFeature feature : eAllStructuralFeatures) {
        if (element.eIsSet(feature)) {
          int id = feature.getFeatureID();
          Class<?> type = element.getClass();
          Map<Method, IAttributeHandlersProvider> handlers = getMostSpecificHandlersFor(id, type);
          if (handlers != null && handlers.size() > 0) {
            Object value = element.eGet(feature);
            for (Entry<Method, IAttributeHandlersProvider> handler : handlers.entrySet()) {
              IAttributeHandlersProvider provider = handler.getValue();
              provider.setSamlContext(context);

              Method toExecute = handler.getKey();
              try {
                toExecute.invoke(provider, value);
              }
              catch (Exception e1) {
                throw new CoreException(new ScoutStatus("Error invoking attribute handler '" + toExecute.getName() + "' on handler-provider '" + provider.getClass().getName() + "'.", e1));
              }
            }
          }
          else if (!containsAny(EXCLUDED_ATTRIBUTES, feature.getName())) {
            SamlImporterActivator.logWarning("No attribute handler found for feature '" + feature.getName() + "' on type '" + element.getClass().getName() + "'.");
          }
        }
      }
    }
  }
}
