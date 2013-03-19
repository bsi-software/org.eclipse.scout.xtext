package org.eclipse.scout.sdk.saml.importer.ui.action;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.scout.sdk.saml.importer.ui.wizard.SamlImportWizard;
import org.eclipse.scout.sdk.ui.action.AbstractScoutHandler;
import org.eclipse.scout.sdk.ui.internal.ScoutSdkUi;
import org.eclipse.scout.sdk.ui.view.outline.pages.IPage;
import org.eclipse.swt.widgets.Shell;

public class SamlImportAction extends AbstractScoutHandler {

  public SamlImportAction() {
    super("Import from SAML...", ScoutSdkUi.getImageDescriptor(ScoutSdkUi.Default), null, false, Category.IMPORT);
  }

  @Override
  public Object execute(Shell shell, IPage[] selection, ExecutionEvent event) throws ExecutionException {
    SamlImportWizard newProjectWizard = new SamlImportWizard();
    WizardDialog dialog = new WizardDialog(shell, newProjectWizard);
    dialog.open();
    return null;
  }
}
