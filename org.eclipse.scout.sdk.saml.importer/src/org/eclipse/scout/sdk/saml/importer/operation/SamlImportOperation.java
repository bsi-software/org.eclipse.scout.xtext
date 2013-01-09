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
import org.eclipse.scout.saml.SamlStandaloneSetup;
import org.eclipse.scout.saml.saml.CodeElement;
import org.eclipse.scout.saml.saml.FormElement;
import org.eclipse.scout.saml.saml.LookupElement;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.extension.customization.CodeCustomizationExtension;
import org.eclipse.scout.sdk.saml.importer.extension.customization.IScoutProjectConfigurator;
import org.eclipse.scout.sdk.saml.importer.operation.codetype.CodeElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.form.FormElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.lookup.LookupElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.operation.nls.TranslationElementImportOperation;
import org.eclipse.scout.sdk.saml.importer.preprocess.SamlElementPreProcessorExtension;
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

  private IProject m_samlInputProject;
  private IScoutProject m_scoutRootProject;

  private SamlContext m_context;

  private Injector m_injector;
  private XtextResourceSet m_resourceSet;

  @Override
  public String getOperationName() {
    return "SAML Import";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getScoutRootProject() == null) {
      throw new IllegalArgumentException("Scout project cannot be null.");
    }
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

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
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

      m_context = new SamlContext(monitor, workingCopyManager, getInjector(), getScoutRootProject());

      // 0. allow all configurators & pre-processors to do their tasks
      for (IScoutProjectConfigurator configurator : CodeCustomizationExtension.getScoutProjectConfigurators()) {
        configurator.configure(getSamlContext());
      }
      visitRootElements(new PreProcessVisitor());
      if (monitor.isCanceled()) {
        return;
      }

      // 1. all translations over all files
      visitRootElements(new TranslationElementVisitor());
      if (monitor.isCanceled()) {
        return;
      }

      // 2. all codes over all files
      visitRootElements(new CodeElementVisitor());
      if (monitor.isCanceled()) {
        return;
      }

      // 3. all lookups over all files
      visitRootElements(new LookupElementVisitor());
      if (monitor.isCanceled()) {
        return;
      }

      // 4. all forms over all files
      visitRootElements(new FormElementVisitor());
      if (monitor.isCanceled()) {
        return;
      }

      ResourcesPlugin.getWorkspace().checkpoint(false);
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

  public IScoutProject getScoutRootProject() {
    return m_scoutRootProject;
  }

  public void setScoutRootProject(IScoutProject scoutRootProject) {
    m_scoutRootProject = scoutRootProject;
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

  private static class PreProcessVisitor implements IRootElementVisitor {
    @Override
    public void visit(EObject o, SamlContext context) throws CoreException, IllegalArgumentException {
      preProcess(o, context);
    }

    private void preProcess(EObject element, SamlContext context) throws CoreException {
      SamlElementPreProcessorExtension.preProcess(element, context);
      for (EObject child : element.eContents()) {
        preProcess(child, context);
      }
    }
  }

  private static class TranslationElementVisitor extends AbstractRootElementVisitor<TranslationElement> {
    private TranslationElementVisitor() {
      super(TranslationElement.class);
    }

    @Override
    protected ISamlElementImportOperation prepareOperation(TranslationElement element) {
      TranslationElementImportOperation teio = new TranslationElementImportOperation();
      teio.setTranslationElement(element);
      return teio;
    }
  }

  private static class CodeElementVisitor extends AbstractRootElementVisitor<CodeElement> {
    private CodeElementVisitor() {
      super(CodeElement.class);
    }

    @Override
    protected ISamlElementImportOperation prepareOperation(CodeElement element) {
      CodeElementImportOperation ceio = new CodeElementImportOperation();
      ceio.setCodeElement(element);
      return ceio;
    }
  }

  private static class LookupElementVisitor extends AbstractRootElementVisitor<LookupElement> {
    private LookupElementVisitor() {
      super(LookupElement.class);
    }

    @Override
    protected ISamlElementImportOperation prepareOperation(LookupElement element) {
      LookupElementImportOperation leio = new LookupElementImportOperation();
      leio.setLookupElement(element);
      return leio;
    }
  }

  private static class FormElementVisitor extends AbstractRootElementVisitor<FormElement> {
    private FormElementVisitor() {
      super(FormElement.class);
    }

    @Override
    protected ISamlElementImportOperation prepareOperation(FormElement element) {
      FormElementImportOperation feio = new FormElementImportOperation();
      feio.setFormElement(element);
      return feio;
    }
  }
}
