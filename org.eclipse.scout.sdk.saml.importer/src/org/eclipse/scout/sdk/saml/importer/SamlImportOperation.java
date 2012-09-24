package org.eclipse.scout.sdk.saml.importer;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.scout.saml.SamlStandaloneSetup;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class SamlImportOperation implements IOperation {

  private File m_samlFile;

  @Override
  public String getOperationName() {
    return "SAML Import";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getSamlFile() == null || !getSamlFile().exists()) {
      throw new IllegalArgumentException("SAML file cannot be null.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    Injector injector = new SamlStandaloneSetup().createInjectorAndDoEMFRegistration();
    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);

    Resource resource = resourceSet.getResource(URI.createFileURI(getSamlFile().getAbsolutePath()), true);

    for (EObject content : resource.getContents()) {
      TreeIterator<EObject> it = content.eAllContents();
      while (it.hasNext()) {
        EObject o = it.next();
        System.out.println(o.toString());
      }
    }
  }

  public void setSamlFile(File xmlFile) {
    m_samlFile = xmlFile;
  }

  public File getSamlFile() {
    return m_samlFile;
  }
}
