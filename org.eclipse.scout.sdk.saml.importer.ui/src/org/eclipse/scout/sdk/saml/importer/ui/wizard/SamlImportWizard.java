package org.eclipse.scout.sdk.saml.importer.ui.wizard;

import java.io.File;

import org.eclipse.scout.saml.ui.internal.SamlActivator;
import org.eclipse.scout.sdk.saml.importer.SamlImportHelper;
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
    File d = new File(m_page1.getSamlRoot());
    SamlImportHelper.importSamlAsync(d, SamlActivator.getInstance().getInjector(SamlActivator.ORG_ECLIPSE_SCOUT_SAML_SAML));
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
