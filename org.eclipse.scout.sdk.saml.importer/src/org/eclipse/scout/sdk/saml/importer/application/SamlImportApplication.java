package org.eclipse.scout.sdk.saml.importer.application;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.jdt.core.WorkingCopyOwner;
import org.eclipse.jdt.internal.core.DefaultWorkingCopyOwner;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.sdk.jobs.OperationJob;
import org.eclipse.scout.sdk.saml.importer.SamlImportHelper;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.util.ExternalProjectImportOperation;
import org.eclipse.scout.sdk.util.jdt.JdtUtility;

/**
 * @author mvi
 */
@SuppressWarnings("restriction")
public class SamlImportApplication implements IApplication {

  public final static String INPUT_PROJECT_NAME = "samlInputProjectName";
  public final static String PARAM_PREFIX = "-";
  public final static String INPUT_PARAM_PROJECT_NAME = PARAM_PREFIX + INPUT_PROJECT_NAME;

  private String m_samlInputProjectName;

  @Override
  public Object start(IApplicationContext context) throws Exception {
    SamlImporterActivator.logInfo("SAML import application started.");

    Object o = context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
    if (o instanceof String[]) {
      fillParamsFromCommandLine((String[]) o);
    }

    if (!StringUtility.hasText(getSamlInputProjectName())) {
      throw new Exception("the input project name must be specified using the '" + INPUT_PROJECT_NAME + "' property.");
    }

    IProject inputProject = ResourcesPlugin.getWorkspace().getRoot().getProject(getSamlInputProjectName());

    if (inputProject == null || !inputProject.exists()) {
      throw new Exception("the input project specified by the '" + INPUT_PROJECT_NAME + "' property could not be found in the workspace: '" + getSamlInputProjectName() + "'.");
    }
    if (!inputProject.isOpen()) {
      throw new Exception("the input project specified by the '" + INPUT_PROJECT_NAME + "' is not open: '" + getSamlInputProjectName() + "'.");
    }

    SamlImporterActivator.logInfo("Running import with '" + getSamlInputProjectName() + "' as SAML input project.");

    SamlImporterActivator.logInfo("Waiting for JDT...");
    InitJdtUiJob j = new InitJdtUiJob();
    j.schedule();
    j.join();
    SamlImporterActivator.logInfo("JDT plugin ready.");

    // disable workspace build
    boolean isAutobuilding = JdtUtility.isWorkspaceAutoBuilding();
    JdtUtility.setWorkspaceAutoBuilding(false);

    SamlImporterActivator.logInfo("Importing all projects into workspace.");
    ExternalProjectImportOperation impProjOp = new ExternalProjectImportOperation();
    impProjOp.setFolder(ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile());
    OperationJob oj = new OperationJob(impProjOp);
    oj.schedule();
    oj.join();
    JdtUtility.waitForSilentWorkspace();
    SamlImporterActivator.logInfo("Project import finished.");

    SamlImportHelper.importSamlSync(inputProject);

    JdtUtility.setWorkspaceAutoBuilding(isAutobuilding); // reset
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
      if (INPUT_PARAM_PROJECT_NAME.equals(p)) {
        String c = consume(it);
        if (c != null) {
          setSamlInputProjectName(c.trim());
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
   * ensures the org.eclipse.jdt.ui plugin is started. the job waits until the plugin is started.
   * after the plugin is started some cleanup tasks are performed to ensure no UI primary buffer
   * provider is registered because no Display thread is actually running! <h3>
   * {@link InitJdtUiJob}</h3> ...
   * 
   * @author mvi
   * @since 3.8.0 01.11.2012
   */
  private static class InitJdtUiJob extends Job {
    private InitJdtUiJob() {
      super("init jdt ui plugin");
      setSystem(true);
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
      JavaPlugin.getDefault(); // trigger jdt.ui activation. bundle is started in this thread (sync).

      if (DefaultWorkingCopyOwner.PRIMARY.primaryBufferProvider != null) {
        // remove the buffer provider added by jdt.ui again because we are running headlessly but require some ui plugins (organize imports)
        WorkingCopyOwner.setPrimaryBufferProvider(null);
      }
      else {
        SamlImporterActivator.logWarning("No primary buffer provider was found. Ensure JDT is initialized. This may cause blocking issues later on.");
      }

      return Status.OK_STATUS;
    }
  }

  @Override
  public void stop() {
  }

  public String getSamlInputProjectName() {
    return m_samlInputProjectName;
  }

  public void setSamlInputProjectName(String samlInputProjectName) {
    m_samlInputProjectName = samlInputProjectName;
  }
}
