package org.eclipse.scout.sdk.saml.importer.ui.wizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.scout.saml.ui.internal.SamlActivator;
import org.eclipse.scout.sdk.saml.importer.SamlImportHelper;
import org.eclipse.scout.sdk.ui.wizard.AbstractWizard;
import org.eclipse.scout.sdk.workspace.IScoutProject;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Injector;

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
    Injector injector = SamlActivator.getInstance().getInjector(SamlActivator.ORG_ECLIPSE_SCOUT_SAML_SAML);

    IProject inputProject = m_page1.getSamlInputProject();

    IResourceSetProvider resSetProvider = injector.getInstance(IResourceSetProvider.class);
    XtextResourceSet resourceSet = (XtextResourceSet) resSetProvider.get(inputProject);

    SamlImportHelper.importSamlAsync(inputProject, injector, resourceSet);

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
