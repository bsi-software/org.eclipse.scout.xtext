package org.eclipse.scout.sdk.saml.importer.operation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.scout.saml.saml.LookupElement;
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
        m_context = new SamlContext(monitor, workingCopyManager, getInjector(), getScoutRootProject());

        // 1. all translations over all files
        visitRootElements(monitor, workingCopyManager, resourceSet, new TranslationElementVisitor());
        if (monitor.isCanceled()) {
          return;
        }

        // 2. all codes over all files
        visitRootElements(monitor, workingCopyManager, resourceSet, new CodeElementVisitor());
        if (monitor.isCanceled()) {
          return;
        }

        // 3. all lookups over all files
        visitRootElements(monitor, workingCopyManager, resourceSet, new LookupElementVisitor());
        if (monitor.isCanceled()) {
          return;
        }

        // 4. all forms over all files
        visitRootElements(monitor, workingCopyManager, resourceSet, new FormElementVisitor());
        if (monitor.isCanceled()) {
          return;
        }

        ResourcesPlugin.getWorkspace().checkpoint(false);
      }
    }
    catch (IOException e) {
      throw new IllegalArgumentException(e);
    }
  }

  private void visitRootElements(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager, XtextResourceSet resourcesToVisit, IRootElementVisitor visitor) throws IllegalArgumentException, CoreException {
    for (Resource r : resourcesToVisit.getResources()) {
      EList<EObject> contents = r.getContents();
      for (EObject model : contents) {
        for (EObject root : model.eContents()) {
          if (monitor.isCanceled()) {
            return;
          }
          visitor.visit(monitor, workingCopyManager, root, getSamlContext());
        }
      }
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

  public IScoutProject getScoutRootProject() {
    return m_scoutRootProject;
  }

  public void setScoutRootProject(IScoutProject scoutRootProject) {
    m_scoutRootProject = scoutRootProject;
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
