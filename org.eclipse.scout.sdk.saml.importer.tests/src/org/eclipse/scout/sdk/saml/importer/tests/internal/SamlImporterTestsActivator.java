package org.eclipse.scout.sdk.saml.importer.tests.internal;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SamlImporterTestsActivator implements BundleActivator {

  public final static String PLUGIN_ID = "org.eclipse.scout.sdk.saml.importer.tests";

  private static BundleContext context;

  static BundleContext getContext() {
    return context;
  }

  @Override
  public void start(BundleContext bundleContext) throws Exception {
    SamlImporterTestsActivator.context = bundleContext;
  }

  @Override
  public void stop(BundleContext bundleContext) throws Exception {
    SamlImporterTestsActivator.context = null;
  }
}
