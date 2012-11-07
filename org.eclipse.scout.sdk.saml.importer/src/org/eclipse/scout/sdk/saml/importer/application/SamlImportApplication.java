package org.eclipse.scout.sdk.saml.importer.application;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jdt.core.WorkingCopyOwner;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.scout.sdk.saml.importer.SamlImportHelper;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;

/**
 * @author mvi
 */
@SuppressWarnings("restriction")
public class SamlImportApplication implements IApplication {

  public final static String INPUT_ROOT_DIR = "samlInputRootDirectory";
  public final static String PARAM_PREFIX = "-";
  public final static String INPUT_PARAM_ROOT_DIR = PARAM_PREFIX + INPUT_ROOT_DIR;

  private File m_samlInputRootDirectory;

  @Override
  public Object start(IApplicationContext context) throws Exception {
    SamlImporterActivator.logInfo("SAML import application started.");

    Object o = context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
    if (o instanceof String[]) {
      fillParamsFromCommandLine((String[]) o);
    }

    if (getSamlInputRootDirectory() == null) {
      throw new Exception("the input directory must be specified using the '" + INPUT_PARAM_ROOT_DIR + "' property.");
    }
    if (!getSamlInputRootDirectory().exists()) {
      throw new Exception("the input directory specified by the '" + INPUT_PARAM_ROOT_DIR + "' property could not be found: '" + getSamlInputRootDirectory().getAbsolutePath() + "'.");
    }
    if (!getSamlInputRootDirectory().isDirectory()) {
      throw new Exception("the path specified by the '" + INPUT_PARAM_ROOT_DIR + "' property is not a directory: '" + getSamlInputRootDirectory().getAbsolutePath() + "'.");
    }

    SamlImporterActivator.logInfo("Running import with '" + getSamlInputRootDirectory().getAbsolutePath() + "' as SAML input directory.");

    SamlImporterActivator.logInfo("Waiting for JDT...");
    InitJdtUiJob j = new InitJdtUiJob();
    j.schedule();
    j.join();
    SamlImporterActivator.logInfo("JDT plugin ready.");

    SamlImportHelper.importSamlSync(getSamlInputRootDirectory());

    SamlImporterActivator.logInfo("SAML import application finished.");
    return EXIT_OK;
  }

  private void fillParamsFromCommandLine(String[] args) {
    LinkedList<String> params = new LinkedList<String>();
    for (String arg : args) {
      params.add(arg);
    }

    Iterator<String> it = params.iterator();
    while (it.hasNext()) {
      String p = consume(it);
      if (INPUT_PARAM_ROOT_DIR.equals(p)) {
        String c = consume(it);
        if (c != null) {
          setSamlInputRootDirectory(new File(c));
        }
      }
    }
  }

  private String consume(Iterator<String> it) {
    String ret = null;
    if (it.hasNext()) {
      ret = it.next();
      it.remove();
    }
    return ret;
  }

  /**
   * ensures the org.eclipse.jdt.ui plugin is started. the job waits until the plugin is started AND
   * the corresponding bundleChanged event is fired. after the plugin is started some cleanup tasks are performed
   * to ensure no UI primary buffer provider is registered because no Display thread is actually running! <h3>
   * {@link InitJdtUiJob}</h3> ...
   * 
   * @author mvi
   * @since 3.8.0 01.11.2012
   */
  private static class InitJdtUiJob extends Job {

    private final static String JDT_UI_PLUGIN_ID = "org.eclipse.jdt.ui";

    private InitJdtUiJob() {
      super("init jdt ui plugin");
      setSystem(true);
    }

    private boolean isJdtUiActive() {
      Bundle b = Platform.getBundle(JDT_UI_PLUGIN_ID);
      return b != null && b.getState() == Bundle.ACTIVE;
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
      BundleListener disableUiJavaPluginListener = new BundleListener() {
        @Override
        public void bundleChanged(BundleEvent event) {
          if (event.getType() == BundleEvent.STARTED && JDT_UI_PLUGIN_ID.equals(event.getBundle().getSymbolicName())) {
            synchronized (InitJdtUiJob.this) {
              InitJdtUiJob.this.notify();
            }
          }
        }
      };

      try {
        synchronized (this) {
          SamlImporterActivator.getContext().addBundleListener(disableUiJavaPluginListener);
          boolean jdtNotStarted = !isJdtUiActive();
          while (jdtNotStarted) {
            try {
              JavaPlugin.getDefault(); // trigger jdt.ui activation
              wait(); // wait until the activated event is fired.
              jdtNotStarted = false;
            }
            catch (InterruptedException e) {
            }
          }
          WorkingCopyOwner.setPrimaryBufferProvider(null); // remove the buffer provider added by jdt.ui again because we are running headlessly but require some ui plugins (organize imports)
        }
      }
      finally {
        SamlImporterActivator.getContext().removeBundleListener(disableUiJavaPluginListener);
      }

      return Status.OK_STATUS;
    }
  }

  @Override
  public void stop() {
  }

  public File getSamlInputRootDirectory() {
    return m_samlInputRootDirectory;
  }

  public void setSamlInputRootDirectory(File samlInputRootDirectory) {
    m_samlInputRootDirectory = samlInputRootDirectory;
  }
}
