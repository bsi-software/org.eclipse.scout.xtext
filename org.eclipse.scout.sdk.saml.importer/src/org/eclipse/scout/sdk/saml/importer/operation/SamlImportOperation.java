package org.eclipse.scout.sdk.saml.importer.operation;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.scout.commons.TuningUtility;
import org.eclipse.scout.nls.sdk.model.workspace.project.INlsProject;
import org.eclipse.scout.saml.SamlStandaloneSetup;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.ModuleElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.CodeConfiguratorsExtension;
import org.eclipse.scout.sdk.saml.importer.extension.configurator.IScoutProjectConfigurator;
import org.eclipse.scout.sdk.saml.importer.extension.element.ElementImportersExtension;
import org.eclipse.scout.sdk.saml.importer.extension.preprocess.SamlElementPreProcessorExtension;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;

public class SamlImportOperation implements IOperation {

  private final static boolean TUNING_OUTPUT_ENABLED = true;

  private IProject m_samlInputProject;
  private SamlContext m_context;
  private Injector m_injector;
  private XtextResourceSet m_resourceSet;

  @Override
  public String getOperationName() {
    return "SAML Import";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getSamlInputProject() == null) {
      throw new IllegalArgumentException("The input project cannot be null.");
    }
    if (!getSamlInputProject().exists()) {
      throw new IllegalArgumentException("The input project could not be found.");
    }
    if (!getSamlInputProject().isOpen()) {
      throw new IllegalArgumentException("The input project must be open.");
    }
  }

  public static Set<IFile> getSamlFiles(IProject p) throws CoreException {
    final HashSet<IPath> excludedPaths = new HashSet<IPath>();
    if (p.hasNature(JavaCore.NATURE_ID)) {
      IJavaProject jp = JavaCore.create(p);
      excludedPaths.add(jp.getOutputLocation());
    }

    final Set<IFile> samlFileCollector = new HashSet<IFile>();
    p.accept(new IResourceVisitor() {
      @Override
      public boolean visit(IResource resource) throws CoreException {
        if (!resource.exists()) {
          return false;
        }

        if (resource.getType() == IResource.FILE) {
          if (resource.getName().toLowerCase().endsWith(".saml")) {
            samlFileCollector.add((IFile) resource);
          }
          return false;
        }
        if (resource.getType() == IResource.FOLDER) {
          IFolder f = (IFolder) resource;
          for (IPath pa : excludedPaths) {
            if (pa.equals(f.getFullPath())) {
              return false;
            }
          }
        }

        return true;
      }
    });
    return samlFileCollector;
  }

  private void startTimer() {
    if (TUNING_OUTPUT_ENABLED) {
      TuningUtility.startTimer();
    }
  }

  private void stopTimer(String msg) {
    if (TUNING_OUTPUT_ENABLED) {
      TuningUtility.stopTimer(msg);
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    try {
      startTimer();

      startTimer();
      if (getInjector() == null) {
        setInjector(new SamlStandaloneSetup().createInjectorAndDoEMFRegistration());
      }

      if (getResourceSet() == null) {
        setResourceSet(getInjector().getInstance(XtextResourceSet.class));
      }

      getResourceSet().addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
      getResourceSet().addLoadOption(XtextResource.OPTION_ENCODING, "UTF-8");

      // get all input files in the input project
      Set<IFile> samlFiles = getSamlFiles(getSamlInputProject());

      // create resources from the input files
      ArrayList<Resource> samlResources = new ArrayList<Resource>(samlFiles.size());
      for (IFile file : samlFiles) {
        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        Resource r = getResourceSet().getResource(uri, true);
        samlResources.add(r);
      }

      // checking the resources for errors (do validation)
      IResourceValidator validator = getInjector().getInstance(IResourceValidator.class);
      ArrayList<Issue> parsingIssues = new ArrayList<Issue>();
      for (Resource r : samlResources) {
        parsingIssues.addAll(validator.validate(r, CheckMode.ALL, CancelIndicator.NullImpl));
      }
      stopTimer("Collect and validate resources");

      if (parsingIssues.size() > 0) {
        // errors found: collect messages
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
        // no errors: start import
        startTimer();
        m_context = new SamlContext(monitor, workingCopyManager, getInjector());

        // 1. all configurators
        for (IScoutProjectConfigurator configurator : CodeConfiguratorsExtension.getScoutProjectConfigurators()) {
          configurator.configure(getSamlContext());
        }

        // 2. all pre-processors
        visitRootElements(new PreProcessVisitor());
        if (monitor.isCanceled()) {
          return;
        }
        stopTimer("Preparations (Configurators, PreProcessors)");

        // 3. all translations
        startTimer();
        visitRootElements(new RootElementVisitor(TranslationElement.class));
        for (INlsProject p : getSamlContext().getNlsProjects()) {
          p.flush(getSamlContext().getMonitor());
        }
        stopTimer("Translations");
        if (monitor.isCanceled()) {
          return;
        }

        // 4. all codes
        startTimer();
        visitRootElements(new RootElementVisitor(CodeElement.class));
        stopTimer("Codes");
        if (monitor.isCanceled()) {
          return;
        }

        // 5. all lookups
        startTimer();
        visitRootElements(new RootElementVisitor(LookupElement.class));
        stopTimer("Lookukps");
        if (monitor.isCanceled()) {
          return;
        }

        // 6. all forms
        startTimer();
        visitRootElements(new RootElementVisitor(FormElement.class));
        stopTimer("Forms");
        if (monitor.isCanceled()) {
          return;
        }

        ResourcesPlugin.getWorkspace().checkpoint(false);
        stopTimer("Import Total");
      }
    }
    finally {
      TuningUtility.finishAll();
    }
  }

  private void visitRootElements(IRootElementVisitor visitor) throws IllegalArgumentException, CoreException {
    for (Resource r : getResourceSet().getResources()) {
      EList<EObject> contents = r.getContents();
      for (EObject model : contents) {
        for (EObject root : model.eContents()) {
          if (getSamlContext().getMonitor().isCanceled()) {
            return;
          }
          visitor.visit(root, getSamlContext());
        }
      }
    }
  }

  public SamlContext getSamlContext() {
    return m_context;
  }

  public Injector getInjector() {
    return m_injector;
  }

  public void setInjector(Injector injector) {
    m_injector = injector;
  }

  public IProject getSamlInputProject() {
    return m_samlInputProject;
  }

  public void setSamlInputProject(IProject samlInputProject) {
    m_samlInputProject = samlInputProject;
  }

  public XtextResourceSet getResourceSet() {
    return m_resourceSet;
  }

  public void setResourceSet(XtextResourceSet resourceSet) {
    m_resourceSet = resourceSet;
  }

  private static interface IRootElementVisitor {
    void visit(EObject o, SamlContext context) throws CoreException, IllegalArgumentException;
  }

  private static class PreProcessVisitor implements IRootElementVisitor {
    @Override
    public void visit(EObject o, SamlContext context) throws CoreException, IllegalArgumentException {
      preProcess(o, context);
    }

    private void preProcess(EObject element, SamlContext context) throws CoreException {
      if (element instanceof ModuleElement) {
        // special case so that the preprocessors can access the current module
        importElement(element, context);
      }
      SamlElementPreProcessorExtension.preProcess(element, context);
      for (EObject child : element.eContents()) {
        preProcess(child, context);
      }
    }
  }

  private static class RootElementVisitor implements IRootElementVisitor {
    private Class<? extends EObject> m_elementType;

    private RootElementVisitor(Class<? extends EObject> elementType) {
      m_elementType = elementType;
    }

    @Override
    public void visit(EObject element, SamlContext context) throws CoreException, IllegalArgumentException {
      if (m_elementType.isAssignableFrom(element.getClass()) || element instanceof ModuleElement) {
        importElement(element, context);
      }
    }
  }

  private static void importElement(EObject o, SamlContext context) throws CoreException {
    IOperation rootImporter = ElementImportersExtension.getImporterFor(o, context);
    rootImporter.validate();
    rootImporter.run(context.getMonitor(), context.getWorkingCopyManager());
  }
}
