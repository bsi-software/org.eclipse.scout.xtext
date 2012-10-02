package org.eclipse.scout.sdk.saml.importer.ui.wizard;

import java.io.File;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.scout.sdk.jobs.OperationJob;
import org.eclipse.scout.sdk.saml.importer.operation.SamlImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.SamlImportPostProcessOperation;
import org.eclipse.scout.sdk.ui.wizard.AbstractWizard;
import org.eclipse.scout.sdk.workspace.IScoutProject;

public class SamlImportWizard extends AbstractWizard {

  private SamlImportWizardPage m_page1;
  private IScoutProject m_project;

  public SamlImportWizard() {
    setWindowTitle("SAML Importer");
    m_page1 = new SamlImportWizardPage();
    addPage(m_page1);
  }

  @Override
  public boolean performFinish() {
    final SamlImportOperation op = new SamlImportOperation();
    File f = new File(m_page1.getSamlFile());
    op.setSamlFile(f);
    op.setScoutRootProject(getRootProject(getProject()));

    OperationJob j = new OperationJob(op);
    j.addJobChangeListener(new JobChangeAdapter() {
      @Override
      public void done(IJobChangeEvent event) {
        ResourcesPlugin.getWorkspace().checkpoint(false);
        SamlImportPostProcessOperation pp = new SamlImportPostProcessOperation();
        pp.setSamlContext(op.getSamlContext());
        OperationJob postprocessJob = new OperationJob(pp);
        postprocessJob.schedule();
      }
    });
    j.schedule();
    return true;
  }

  private IScoutProject getRootProject(IScoutProject p) {
    IScoutProject ret = p;
    while (ret.getParentProject() != null) {
      ret = ret.getParentProject();
    }
    return ret;
  }

  public void setProject(IScoutProject project) {
    m_project = project;
  }

  public IScoutProject getProject() {
    return m_project;
  }
}
