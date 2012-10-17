package org.eclipse.scout.sdk.saml.importer.operation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.scout.commons.FileUtility;
import org.eclipse.scout.saml.SamlStandaloneSetup;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.ImportElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.TemplateElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.operation.codetype.CodeElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.FormElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.lookup.LookupElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.nls.TranslationElementImportOperation;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.scout.sdk.workspace.IScoutProject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

public class SamlImportOperation implements IOperation {

  private File m_samlRootDirectory;
  private IScoutProject m_scoutRootProject;
  private IScoutProject m_currentModuleProject;
  private SamlContext m_context;
  private Injector m_injector;

  @Override
  public String getOperationName() {
    return "SAML Import";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getScoutRootProject() == null) {
      throw new IllegalArgumentException("Scout project cannot be null.");
    }
    if (getSamlRootDirectory() == null || !getSamlRootDirectory().exists() || !getSamlRootDirectory().isDirectory()) {
      throw new IllegalArgumentException("Invalid saml root directory.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    if (getInjector() == null) {
      setInjector(new SamlStandaloneSetup().createInjectorAndDoEMFRegistration());
    }

    IResourceValidator validator = getInjector().getInstance(IResourceValidator.class);
    XtextResourceSet resourceSet = getInjector().getInstance(XtextResourceSet.class);
    resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
    resourceSet.addLoadOption(XtextResource.OPTION_ENCODING, "UTF-8");

    try {
      File[] filesInFolder = getAllSamlFilesRec();
      for (File f : filesInFolder) {
        resourceSet.getResource(URI.createFileURI(f.getAbsolutePath()), true);
      }

      ArrayList<Issue> parsingIssues = new ArrayList<Issue>();
      for (Resource r : resourceSet.getResources()) {
        parsingIssues.addAll(validator.validate(r, CheckMode.ALL, CancelIndicator.NullImpl));
      }

      if (parsingIssues.size() > 0) {
        StringBuilder sb = new StringBuilder();
        sb.append("SAML files are not valid. ");
        sb.append(parsingIssues.size());
        sb.append(" Error(s) have been found. Please check input files:");
        for (Issue i : parsingIssues) {
          sb.append("\n     ");
          sb.append(i.getMessage());
        }
        throw new IllegalArgumentException(sb.toString());
      }
      else {
        m_context = new SamlContext(monitor, workingCopyManager, getInjector());

        for (Resource r : resourceSet.getResources()) {
          EList<EObject> contents = r.getContents();
          for (EObject content : contents) {
            for (EObject root : content.eContents()) {
              if (monitor.isCanceled()) {
                return;
              }
              dispatchRootElement(monitor, workingCopyManager, root, getSamlContext());
            }
          }
        }
      }
    }
    catch (IOException e) {
      throw new IllegalArgumentException(e);
    }
  }

  private File[] getAllSamlFilesRec() throws IOException {
    List<File> allFiles = FileUtility.listTree(getSamlRootDirectory(), true, false);
    for (Iterator<File> it = allFiles.iterator(); it.hasNext();) {
      File candidate = it.next();
      if (!candidate.exists() || !candidate.getName().toLowerCase().endsWith(".saml")) {
        it.remove();
      }
    }
    return allFiles.toArray(new File[allFiles.size()]);
  }

  private void dispatchRootElement(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, EObject o, SamlContext context) throws CoreException, IllegalArgumentException {
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
      //nop. will then be used by the custom_field which references the template
    }
    else if (o instanceof FormElement) {
      FormElementImportOperation feio = new FormElementImportOperation();
      feio.setFormElement((FormElement) o);
      op = feio;
    }
    else if (o instanceof ImportElement) {
      //nop
    }
    else {
      throw new IllegalArgumentException("Unknown EObject type: " + o);
    }

    if (op != null) {
      context.setCurrentScoutModule(getCurrentModuleProject());
      op.setSamlContext(context);
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

  private IScoutProject getCurrentModuleProject() {
    return m_currentModuleProject;
  }

  private void setCurrentModuleProject(IScoutProject currentModuleProject) {
    m_currentModuleProject = currentModuleProject;
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

  public SamlContext getSamlContext() {
    return m_context;
  }

  public File getSamlRootDirectory() {
    return m_samlRootDirectory;
  }

  public void setSamlRootDirectory(File samlRootDirectory) {
    m_samlRootDirectory = samlRootDirectory;
  }

  public Injector getInjector() {
    return m_injector;
  }

  public void setInjector(Injector injector) {
    m_injector = injector;
  }
}
