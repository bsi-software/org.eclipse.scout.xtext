package org.eclipse.scout.sdk.saml.importer.operation;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.scout.saml.SamlStandaloneSetup;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.operation.codetype.CodeElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.lookup.LookupElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.nls.TranslationElementImportOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.scout.sdk.workspace.IScoutProject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

public class SamlImportOperation implements IOperation {

  private File m_samlFile;
  private IScoutProject m_scoutRootProject;
  private IScoutProject m_currentModuleProject;

  @Override
  public String getOperationName() {
    return "SAML Import";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getScoutRootProject() == null) {
      throw new IllegalArgumentException("Scout project cannot be null.");
    }
    if (getSamlFile() == null || !getSamlFile().exists()) {
      throw new IllegalArgumentException("SAML file cannot be null.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    Injector injector = new SamlStandaloneSetup().createInjectorAndDoEMFRegistration();
    XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    resourceSet.addLoadOption(XtextResource.OPTION_ENCODING, "UTF-8");

    Resource resource = resourceSet.getResource(URI.createFileURI(getSamlFile().getAbsolutePath()), true);
    int numErrors = 0;//TODO [mvi]: resource.getErrors().size();

    if (numErrors > 0) {
      throw new IllegalArgumentException("SAML file is not valid. " + numErrors + " Error(s) have been found. Please check input file. ");
    }
    else {
      EList<EObject> contents = resource.getContents();

      int totalWork = 0;
      for (EObject content : contents) {
        totalWork += content.eContents().size();
      }
      monitor.beginTask("Importing SAML File", totalWork);

      for (EObject content : contents) {
        for (EObject root : content.eContents()) {
          if (monitor.isCanceled()) {
            return;
          }
          dispatchRootElement(monitor, workingCopyManager, root);
          monitor.worked(1);
        }
      }
    }
  }

  private void dispatchRootElement(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, EObject o) throws CoreException, IllegalArgumentException {
    AbstractSamlElementImportOperation op = null;
    if (o instanceof ModuleElement) {
      ModuleElement mod = (ModuleElement) o;
      String moduleName = mod.getName();
      IScoutProject curModule = findScoutProjectRec(getScoutRootProject(), moduleName);
      if (curModule == null) {
        throw new IllegalArgumentException("module '" + moduleName + "' could not be found.");
      }
      else {
        setCurrentModuleProject(curModule);
      }
    }
    else if (o instanceof TranslationElement) {
      TranslationElementImportOperation teio = new TranslationElementImportOperation();
      teio.setTranslationElement((TranslationElement) o);
      op = teio;
    }
    else if (o instanceof CodeElement) {
      CodeElementImportOperation ceio = new CodeElementImportOperation();
      ceio.setCodeElement((CodeElement) o);
      op = ceio;
    }
    else if (o instanceof LookupElement) {
      LookupElementImportOperation leio = new LookupElementImportOperation();
      leio.setLookupElement((LookupElement) o);
      op = leio;
    }
    else if (o instanceof TemplateElement) {
      //TODO
    }
    else if (o instanceof FormElement) {
      //TODO
    }
    else {
      throw new IllegalArgumentException("Unknown EObject type: " + o);
    }

    if (op != null) {
      op.setCurrentScoutModule(getCurrentModuleProject());
      op.validate();
      op.run(monitor, workingCopyManager);
    }
  }

  private IScoutProject findScoutProjectRec(IScoutProject parent, String searchName) {
    if (parent.getProjectName().equals(searchName)) {
      return parent;
    }
    for (IScoutProject child : parent.getSubProjects()) {
      IScoutProject result = findScoutProjectRec(child, searchName);
      if (result != null) {
        return result;
      }
    }
    return null;
  }

  public void setSamlFile(File xmlFile) {
    m_samlFile = xmlFile;
  }

  public File getSamlFile() {
    return m_samlFile;
  }

  public IScoutProject getScoutRootProject() {
    return m_scoutRootProject;
  }

  public void setScoutRootProject(IScoutProject scoutRootProject) {
    m_scoutRootProject = scoutRootProject;
    if (getCurrentModuleProject() == null) {
      // if there is no module set: initially set it to the root project. 
      setCurrentModuleProject(scoutRootProject);
    }
  }

  public IScoutProject getCurrentModuleProject() {
    return m_currentModuleProject;
  }

  public void setCurrentModuleProject(IScoutProject currentModuleProject) {
    m_currentModuleProject = currentModuleProject;
  }
}
