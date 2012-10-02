package org.eclipse.scout.sdk.saml.importer.ui.action;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.scout.sdk.saml.importer.ui.wizard.SamlImportWizard;
import org.eclipse.scout.sdk.ui.action.AbstractScoutHandler;
import org.eclipse.scout.sdk.ui.internal.ScoutSdkUi;
import org.eclipse.scout.sdk.ui.view.outline.pages.IPage;
import org.eclipse.scout.sdk.workspace.IScoutProject;
import org.eclipse.swt.widgets.Shell;

public class SamlImportAction extends AbstractScoutHandler {

  private IScoutProject m_project;

  public SamlImportAction() {
    super("Import from SAML...", ScoutSdkUi.getImageDescriptor(ScoutSdkUi.Default), null, false, Category.IMPORT);
  }

  @Override
  public Object execute(Shell shell, IPage[] selection, ExecutionEvent event) throws ExecutionException {
    SamlImportWizard newProjectWizard = new SamlImportWizard();
    newProjectWizard.setProject(getProject());
    WizardDialog dialog = new WizardDialog(shell, newProjectWizard);
    dialog.open();
    return null;
  }

  public void setProject(IScoutProject project) {
    m_project = project;
  }

  public IScoutProject getProject() {
    return m_project;
  }
}
