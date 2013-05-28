package org.eclipse.scout.sdk.saml.importer.application;

import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.sdk.compatibility.TargetPlatformUtility;
import org.eclipse.scout.sdk.jobs.OperationJob;
import org.eclipse.scout.sdk.operation.util.IOrganizeImportService;
import org.eclipse.scout.sdk.saml.importer.SamlImportHelper;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.internal.jdt.imports.SamlOrganizeImportService;
import org.eclipse.scout.sdk.saml.importer.operation.util.ExternalProjectImportOperation;
import org.eclipse.scout.sdk.util.jdt.JdtUtility;
import org.eclipse.scout.sdk.util.log.ScoutStatus;
import org.osgi.framework.ServiceRegistration;

/**
 * Eclipse Application to headlessly run a SAML import. See the 'headless' folder in this plugin for examples.
 * 
 * @author mvi
 */
public class SamlImportApplication implements IApplication {

  public final static String INPUT_PROJECT_NAME = "samlInputProjectName";
  public final static String INPUT_IMPORT_PROJECTS_INTO_WS = "importProjectsIntoWs";
  public final static String INPUT_TARGET_FILE_PATH = "targetPlatformPath";

  public final static String PARAM_PREFIX = "-";
  public final static String INPUT_PARAM_PROJECT_NAME = PARAM_PREFIX + INPUT_PROJECT_NAME;
  public final static String INPUT_PARAM_IMPORT_PROJECTS_INTO_WS = PARAM_PREFIX + INPUT_IMPORT_PROJECTS_INTO_WS;
  public final static String INPUT_PARAM_TARGET_FILE_PATH = PARAM_PREFIX + INPUT_TARGET_FILE_PATH;

  private String m_samlInputProjectName;
  private String m_targetFilePath;
  private boolean m_importProjectsIntoWorkspace;
  private ServiceRegistration m_orgImportSvcReg;

  @Override
  public Object start(IApplicationContext context) throws Exception {
    SamlImporterActivator.logInfo("SAML import application started.");

    initDefaultParams();
    fillParamsFromCommandLine(context);
    validateInputParams();

    SamlImporterActivator.logInfo("Running import with '" + getSamlInputProjectName() + "' as SAML input project.");

    initOrganizeImportService();
    importProjectsIntoWorkspace();
    applyTargetPlatform();
    importSaml();
    saveWorkspace();

    SamlImporterActivator.logInfo("SAML import application finished.");
    return EXIT_OK;
  }

  private void saveWorkspace() {
    try {
      SamlImporterActivator.logInfo("Saving Workspace.");
      ResourcesPlugin.getWorkspace().save(true, null);
      SamlImporterActivator.logInfo("Workspace successfully saved.");
    }
    catch (CoreException e) {
      SamlImporterActivator.logWarning("Unable to save the workspace.", e);
    }
  }

  private void validateInputParams() throws Exception {
    if (!StringUtility.hasText(getSamlInputProjectName())) {
      throw new Exception("the input project name must be specified using the '" + INPUT_PROJECT_NAME + "' property.");
    }
  }

  private void applyTargetPlatform() throws InterruptedException, CoreException {
    if (StringUtility.hasText(getTargetFilePath())) {
      IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(getTargetFilePath()));
      if (targetFile != null && targetFile.exists()) {
        SamlImporterActivator.logInfo("Resetting target platform to '" + targetFile.getFullPath().toOSString() + "'.");
        LoadTargetPlatformJob tpj = new LoadTargetPlatformJob(targetFile);
        tpj.schedule();
        tpj.join();
        JdtUtility.waitForSilentWorkspace();

        if (tpj.getResult().isOK()) {
          SamlImporterActivator.logInfo("Target platform applied successfully.");
        }
        else {
          throw new CoreException(tpj.getResult());
        }
      }
      else {
        if (targetFile == null) {
          throw new CoreException(new ScoutStatus("The given target file could not be found."));
        }
        else {
          throw new CoreException(new ScoutStatus("The target file '" + targetFile.getFullPath().toOSString() + "' could not be found."));
        }
      }
    }
  }

  private void initOrganizeImportService() {
    if (m_orgImportSvcReg == null) {
      m_orgImportSvcReg = SamlImporterActivator.getContext().registerService(IOrganizeImportService.class.getName(), new SamlOrganizeImportService(), null);
    }
  }

  private void stopOrganizeImportService() {
    if (m_orgImportSvcReg != null) {
      m_orgImportSvcReg.unregister();
    }
  }

  private void importSaml() throws Exception {
    IProject inputProject = ResourcesPlugin.getWorkspace().getRoot().getProject(getSamlInputProjectName());

    if (inputProject == null || !inputProject.exists()) {
      throw new Exception("the input project specified by the '" + INPUT_PROJECT_NAME + "' property could not be found in the workspace: '" + getSamlInputProjectName() + "'.");
    }
    if (!inputProject.isOpen()) {
      throw new Exception("the input project specified by the '" + INPUT_PROJECT_NAME + "' is not open: '" + getSamlInputProjectName() + "'.");
    }

    SamlImportHelper.importSamlSync(inputProject);
  }

  private void importProjectsIntoWorkspace() throws InterruptedException {
    if (isImportProjectsIntoWorkspace()) {
      SamlImporterActivator.logInfo("Importing all projects into workspace.");
      ExternalProjectImportOperation impProjOp = new ExternalProjectImportOperation();
      impProjOp.setFolder(ResourcesPlugin.getWorkspace().getRoot().getLocation().toFile());
      OperationJob oj = new OperationJob(impProjOp);
      oj.schedule();
      oj.join();
      JdtUtility.waitForSilentWorkspace();
      SamlImporterActivator.logInfo("Project import finished.");
    }
  }

  private void initDefaultParams() throws CoreException {
    JdtUtility.setWorkspaceAutoBuilding(false);
    setSamlInputProjectName(null);
    setImportProjectsIntoWorkspace(true);
    setTargetFilePath(null);
  }

  private void fillParamsFromCommandLine(IApplicationContext context) {
    Object o = context.getArguments().get(IApplicationContext.APPLICATION_ARGS);
    if (o instanceof String[]) {
      String[] args = (String[]) o;
      LinkedList<String> params = new LinkedList<String>();
      for (String arg : args) {
        params.add(arg);
      }

      Iterator<String> it = params.iterator();
      while (it.hasNext()) {
        String p = consume(it);
        if (INPUT_PARAM_PROJECT_NAME.equals(p)) {
          String c = consume(it);
          if (StringUtility.hasText(c)) {
            setSamlInputProjectName(c.trim());
          }
        }
        else if (INPUT_PARAM_IMPORT_PROJECTS_INTO_WS.equals(p)) {
          String i = consume(it);
          if (StringUtility.hasText(i)) {
            setImportProjectsIntoWorkspace("true".equals(i.trim().toLowerCase()));
          }
        }
        else if (INPUT_PARAM_TARGET_FILE_PATH.equals(p)) {
          String t = consume(it);
          if (StringUtility.hasText(t)) {
            setTargetFilePath(t.trim());
          }
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

  private static class LoadTargetPlatformJob extends Job {
    private IFile m_targetFile;

    private LoadTargetPlatformJob(IFile targetFile) {
      super("set target platform");
      setSystem(true);
      m_targetFile = targetFile;
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
      try {
        IStatus status = TargetPlatformUtility.resolveTargetPlatform(m_targetFile, true, monitor);
        JdtUtility.waitForJobFamily("LoadTargetDefinitionJob"); // refers to LoadTargetDefinitionJob.JOB_FAMILY_ID which is private
        return status;
      }
      catch (CoreException e) {
        return e.getStatus();
      }
    }
  }

  @Override
  public void stop() {
    stopOrganizeImportService();
  }

  public String getSamlInputProjectName() {
    return m_samlInputProjectName;
  }

  public void setSamlInputProjectName(String samlInputProjectName) {
    m_samlInputProjectName = samlInputProjectName;
  }

  public boolean isImportProjectsIntoWorkspace() {
    return m_importProjectsIntoWorkspace;
  }

  public void setImportProjectsIntoWorkspace(boolean importProjectsIntoWorkspace) {
    m_importProjectsIntoWorkspace = importProjectsIntoWorkspace;
  }

  public String getTargetFilePath() {
    return m_targetFilePath;
  }

  public void setTargetFilePath(String targetFilePath) {
    m_targetFilePath = targetFilePath;
  }
}
