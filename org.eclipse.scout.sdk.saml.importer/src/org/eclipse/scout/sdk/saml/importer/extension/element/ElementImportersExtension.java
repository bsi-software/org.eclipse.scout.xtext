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
package org.eclipse.scout.sdk.saml.importer.extension.element;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.commons.beans.FastBeanUtility;
import org.eclipse.scout.commons.beans.FastPropertyDescriptor;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.SamlContext;
import org.eclipse.scout.sdk.util.log.ScoutStatus;

/**
 * <h3>{@link ElementImportersExtension}</h3>
 * 
 * @author mvi
 * @since 3.9.0 03.02.2013
 */
public final class ElementImportersExtension {

  private final static Object lock = new Object();
  private static Map<Class<?> /*element*/, P_ElementOperation> allOperationDefs = null;

  public final static String EXTENSION_POINT_ID = "elementImporters";
  public final static String IMPORTER_ELEMENT_NAME = "importer";
  public final static String IMPORTER_ELEMENT_ATTRIBUTE = "element";
  public final static String IMPORTER_OPERATION_ATTRIBUTE = "operation";
  public final static String IMPORTER_PROPERTY_NAME = "property";
  public final static String IMPORTER_PROPERTY_NAME_ATTRIBUTE = "name";
  public final static String IMPORTER_PROPERTY_VALUE_ATTRIBUTE = "value";

  private ElementImportersExtension() {
  }

  private static Map<Class<?>, P_ElementOperation> getOperationDefinitions() throws CoreException {
    if (allOperationDefs == null) {
      synchronized (lock) {
        if (allOperationDefs == null) {
          IExtensionRegistry reg = Platform.getExtensionRegistry();
          IExtensionPoint xp = reg.getExtensionPoint(SamlImporterActivator.PLUGIN_ID, EXTENSION_POINT_ID);
          IExtension[] extensions = xp.getExtensions();
          Map<Class<?>, P_ElementOperation> tmp = new HashMap<Class<?>, ElementImportersExtension.P_ElementOperation>();
          for (IExtension extension : extensions) {
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (IConfigurationElement element : elements) {
              if (IMPORTER_ELEMENT_NAME.equals(element.getName())) {
                try {
                  Class<?> elementClass = Class.forName(element.getAttribute(IMPORTER_ELEMENT_ATTRIBUTE));
                  IOperation importer = (IOperation) element.createExecutableExtension(IMPORTER_OPERATION_ATTRIBUTE);
                  P_ElementOperation imDef = new P_ElementOperation(importer.getClass());
                  tmp.put(elementClass, imDef);

                  for (IConfigurationElement property : element.getChildren(IMPORTER_PROPERTY_NAME)) {
                    String name = property.getAttribute(IMPORTER_PROPERTY_NAME_ATTRIBUTE);
                    if (StringUtility.hasText(name)) {
                      String value = property.getAttribute(IMPORTER_PROPERTY_VALUE_ATTRIBUTE);
                      if (!StringUtility.hasText(value)) {
                        value = null;
                      }
                      imDef.addPredefinedProperty(name.trim(), value);
                    }
                    else {
                      throw new CoreException(new ScoutStatus("Empty property name not allowed."));
                    }
                  }
                }
                catch (Exception e) {
                  throw new CoreException(new ScoutStatus(e));
                }
              }
            }
          }
          allOperationDefs = tmp;
        }
      }
    }
    return allOperationDefs;
  }

  /**
   * Gets the importer operation for the given input object.
   * 
   * @param input
   *          Usually a SAML element ({@link EObject}. But can be any object for which an operation is registered.
   * @param context
   *          The current SAML import context.
   * @param props
   *          Optional properties that should be injected into the created operation. There must be a single (!) setter
   *          for that datatype in the operation.
   * @return
   * @throws CoreException
   *           When there is no operation for the given input.
   */
  public final static IOperation getImporterFor(Object input, SamlContext context, Object... props) throws CoreException {
    if (input == null) {
      throw new CoreException(new ScoutStatus("Null element not allowed for operation retrieval."));
    }

    P_ElementOperation opDef = getOperationDefinitions().get(input.getClass());
    if (opDef == null) {
      for (Class<?> interfaceName : input.getClass().getInterfaces()) {
        opDef = getOperationDefinitions().get(interfaceName);
        if (opDef != null) {
          break;
        }
      }
    }

    if (opDef != null) {
      IOperation newOp = opDef.createNew();
      applySetter(newOp, opDef, context);
      applySetter(newOp, opDef, input);
      if (props != null && props.length > 0) {
        for (Object o : props) {
          if (o != null) {
            applySetter(newOp, opDef, o);
          }
        }
      }
      return newOp;
    }
    else {
      throw new CoreException(new ScoutStatus("No import operation found for class '" + input.getClass() + "'."));
    }
  }

  private final static void applySetter(Object instance, P_ElementOperation opDef, Object val) throws CoreException {
    Method setter = opDef.getSetterForInput(val.getClass());
    if (setter != null) {
      try {
        setter.invoke(instance, val);
      }
      catch (Exception e) {
        throw new CoreException(new ScoutStatus("Unable to invoke setter.", e));
      }
    }
  }

  private static class P_ElementOperation {
    private final Class<? extends IOperation> m_class;
    private final Map<String /* prop name */, FastPropertyDescriptor> m_propsByName;
    private final Map<Class<?> /* setter type class */, Set<Method>> m_propsByInputType;
    private final Map<String, String> m_preDefinedPropertiesByName;

    private P_ElementOperation(Class<? extends IOperation> clazz) {
      m_class = clazz;
      m_propsByName = new HashMap<String, FastPropertyDescriptor>();
      m_propsByInputType = new HashMap<Class<?>, Set<Method>>();
      m_preDefinedPropertiesByName = new HashMap<String, String>();

      for (Entry<String, FastPropertyDescriptor> prop : FastBeanUtility.createPropertyDescriptorMap(clazz, null).entrySet()) {
        if (prop.getValue().getWriteMethod() != null && prop.getValue().getWriteMethod().getParameterTypes().length == 1) {
          m_propsByName.put(prop.getKey(), prop.getValue());
          Class<?> inputType = prop.getValue().getWriteMethod().getParameterTypes()[0];
          Set<Method> setters = m_propsByInputType.get(inputType);
          if (setters == null) {
            setters = new HashSet<Method>();
            m_propsByInputType.put(inputType, setters);
          }
          setters.add(prop.getValue().getWriteMethod());
        }
      }
    }

    private IOperation createNew() throws CoreException {
      try {
        IOperation newOp = m_class.newInstance();
        for (Entry<String, String> preDefProp : m_preDefinedPropertiesByName.entrySet()) {
          m_propsByName.get(preDefProp.getKey()).getWriteMethod().invoke(newOp, preDefProp.getValue());
        }
        return newOp;
      }
      catch (Exception e) {
        throw new CoreException(new ScoutStatus("Unable to prepare import operation for class '" + m_class.getName() + "'.", e));
      }
    }

    private Method getSetterForInput(Class<?> inputType) throws CoreException {
      Set<Method> set = m_propsByInputType.get(inputType); // first check for direct match
      if (set == null) {
        for (Entry<Class<?>, Set<Method>> entry : m_propsByInputType.entrySet()) {
          if (entry.getKey().isAssignableFrom(inputType)) {
            set = entry.getValue();
            break;
          }
        }
      }
      if (set == null) {
        return null;
      }
      if (set.size() == 1) {
        return set.iterator().next();
      }
      else {
        throw new CoreException(new ScoutStatus("Duplicate setters for type '" + inputType.getName() + "' found in class '" + m_class.getName() + "'."));
      }
    }

    private void addPredefinedProperty(String name, String value) throws CoreException {
      if (m_propsByName.containsKey(name)) {
        m_preDefinedPropertiesByName.put(name, value);
      }
      else {
        throw new CoreException(new ScoutStatus("No setter found for property '" + name + "' in importer '" + m_class.getName() + "'."));
      }
    }
  }
}
