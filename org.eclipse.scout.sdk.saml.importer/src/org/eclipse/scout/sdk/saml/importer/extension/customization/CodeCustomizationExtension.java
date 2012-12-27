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
package org.eclipse.scout.sdk.saml.importer.extension.customization;

import java.util.TreeMap;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.util.log.ScoutStatus;

/**
 * <h3>{@link CodeCustomizationExtension}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 28.11.2012
 */
public class CodeCustomizationExtension {

  public final static String EXTENSION_POINT_ID = "codeCustomization";

  public final static String CONFIGURATOR_ELEMENT_NAME = "projectConfigurator";
  public final static String CONFIGURATOR_ORDER_ATTRIBUTE = "order";
  public final static String CONFIGURATOR_CLASS_ATTRIBUTE = "class";

  public final static String SOURCE_PROVIDER_ELEMENT_NAME = "sourceProvider";
  public final static String SOURCE_PROVIDER_ORDER_ATTRIBUTE = "order";
  public final static String SOURCE_PROVIDER_CLASS_ATTRIBUTE = "class";

  private final static Object confLock = new Object();
  private final static Object providerLock = new Object();

  private static IScoutProjectConfigurator[] projectConfigurators = null;
  private static ISourceProvider[] sourceProviders = null;

  public static IScoutProjectConfigurator[] getScoutProjectConfigurators() throws CoreException {
    if (projectConfigurators == null) {
      synchronized (confLock) {
        if (projectConfigurators == null) {
          final TreeMap<Double, IScoutProjectConfigurator> map = new TreeMap<Double, IScoutProjectConfigurator>();

          IExtensionRegistry reg = Platform.getExtensionRegistry();
          IExtensionPoint xp = reg.getExtensionPoint(SamlImporterActivator.PLUGIN_ID, EXTENSION_POINT_ID);
          IExtension[] extensions = xp.getExtensions();
          for (IExtension extension : extensions) {
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (IConfigurationElement element : elements) {
              if (CONFIGURATOR_ELEMENT_NAME.equals(element.getName())) {
                String order = element.getAttribute(CONFIGURATOR_ORDER_ATTRIBUTE);
                IScoutProjectConfigurator configurator = (IScoutProjectConfigurator) element.createExecutableExtension(CONFIGURATOR_CLASS_ATTRIBUTE);
                map.put(parseDouble(order), configurator);
              }
            }
          }
          projectConfigurators = map.values().toArray(new IScoutProjectConfigurator[map.values().size()]);
        }
      }
    }
    return projectConfigurators;
  }

  private static Double parseDouble(String order) {
    if (StringUtility.hasText(order)) {
      try {
        return new Double(Double.parseDouble(order));
      }
      catch (NumberFormatException e) {
        SamlImporterActivator.logWarning("Invalid numeric extension order: '" + order + "'.", e);
      }
    }
    return new Double(0);
  }

  public static String getSource(SourceProviderInput input) throws CoreException {
    ISourceProvider[] providers = getSourceProviders();
    for (int i = providers.length - 1; i >= 0; i--) {
      String src = providers[i].getSource(input);
      if (StringUtility.hasText(src)) {
        return src;
      }
    }
    throw new CoreException(new ScoutStatus("No source provider contributed any code."));
  }

  private static ISourceProvider[] getSourceProviders() throws CoreException {
    if (sourceProviders == null) {
      synchronized (providerLock) {
        if (sourceProviders == null) {
          TreeMap<Double, ISourceProvider> map = new TreeMap<Double, ISourceProvider>();

          IExtensionRegistry reg = Platform.getExtensionRegistry();
          IExtensionPoint xp = reg.getExtensionPoint(SamlImporterActivator.PLUGIN_ID, EXTENSION_POINT_ID);
          IExtension[] extensions = xp.getExtensions();
          for (IExtension extension : extensions) {
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (IConfigurationElement element : elements) {
              if (SOURCE_PROVIDER_ELEMENT_NAME.equals(element.getName())) {
                String order = element.getAttribute(SOURCE_PROVIDER_ORDER_ATTRIBUTE);
                ISourceProvider provider = (ISourceProvider) element.createExecutableExtension(SOURCE_PROVIDER_CLASS_ATTRIBUTE);
                map.put(parseDouble(order), provider);
              }
            }
          }
          sourceProviders = map.values().toArray(new ISourceProvider[map.values().size()]);
        }
      }
    }
    return sourceProviders;
  }
}
