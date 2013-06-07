/*******************************************************************************
 * Copyright (c) 2012, 2013 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.ui.wizard;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.scout.commons.ListUtility;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.sdk.saml.importer.operation.SamlImportOperation;
import org.eclipse.scout.sdk.ui.internal.ScoutSdkUi;
import org.eclipse.scout.sdk.ui.wizard.AbstractWorkspaceWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.xtext.ui.XtextProjectHelper;

/**
 * @author mvi
 * @since 3.9.0 26.03.2012
 */
public class SamlImportWizardPage extends AbstractWorkspaceWizardPage {

  private final static String PROP_SAML_INPUT_PROJECT = "samlInputProject";
  private final static String SETTING_SAML_INPUT_PROJECT = "samlInputProject";

  private Combo m_projectCombo;

  public SamlImportWizardPage() {
    super(SamlImportWizardPage.class.getName());
    setTitle("Saml Importer");
    setDescription("Saml Importer");
  }

  @Override
  protected void createContent(Composite parent) {
    IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
    ArrayList<String> names = new ArrayList<String>(projects.length);
    for (IProject p : projects) {
      if (XtextProjectHelper.hasNature(p) && p.exists() && p.isOpen()) {
        names.add(p.getName());
      }
    }

    Label l = new Label(parent, SWT.NONE);
    l.setText("SAML Input Project");

    m_projectCombo = new Combo(parent, SWT.READ_ONLY | SWT.DROP_DOWN);
    m_projectCombo.setItems(names.toArray(new String[names.size()]));
    m_projectCombo.setEnabled(names.size() > 1);
    m_projectCombo.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(SelectionEvent e) {
        setSamlInputProjectInternal(getWorkspaceProject(m_projectCombo.getItem(m_projectCombo.getSelectionIndex())));
        pingStateChanging();
      }
    });

    String defaultProject = getDialogSettings().get(SETTING_SAML_INPUT_PROJECT);
    if (StringUtility.hasText(defaultProject) && ListUtility.containsAny(names, defaultProject)) {
      setSamlInputProject(getWorkspaceProject(defaultProject));
    }
    else if (names.size() == 1) {
      setSamlInputProject(getWorkspaceProject(names.get(0)));
    }
    else {
      setSamlInputProject(null);
    }

    parent.setLayout(new GridLayout(2, false));
    m_projectCombo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_HORIZONTAL));
  }

  private IProject getWorkspaceProject(String name) {
    IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
    if (p != null && p.exists()) {
      return p;
    }
    return null;
  }

  @Override
  protected void validatePage(MultiStatus multiStatus) {
    multiStatus.add(getSamlInputProjectStatus());
  }

  protected IStatus getSamlInputProjectStatus() {
    if (m_projectCombo.getItemCount() < 1) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "No input project with the Xtext nature could be found in the workspace.");
    }
    if (getSamlInputProject() == null) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "Please choose the input project.");
    }
    if (!getSamlInputProject().exists()) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "The given input project could not be found.");
    }
    if (!getSamlInputProject().isOpen()) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "The given input project is not open.");
    }

    try {
      if (SamlImportOperation.getSamlFiles(getSamlInputProject()).size() < 1) {
        return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "The given project does not contain any SAML input files.");
      }
    }
    catch (CoreException e) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "Error checking the given project: " + e.getMessage());
    }

    return Status.OK_STATUS;
  }

  public IProject getSamlInputProject() {
    return (IProject) getProperty(PROP_SAML_INPUT_PROJECT);
  }

  public void setSamlInputProject(IProject p) {
    try {
      setStateChanging(true);
      setSamlInputProjectInternal(p);
      if (!m_projectCombo.isDisposed()) {
        String[] items = m_projectCombo.getItems();
        int selIndex = -1;
        if (p != null) {
          for (int i = 0; i < items.length; i++) {
            if (p.getName().equals(items[i])) {
              selIndex = i;
              break;
            }
          }
        }
        m_projectCombo.select(selIndex);
      }
    }
    finally {
      setStateChanging(false);
    }
  }

  private void setSamlInputProjectInternal(IProject p) {
    getDialogSettings().put(SETTING_SAML_INPUT_PROJECT, p == null ? null : p.getName());
    setProperty(PROP_SAML_INPUT_PROJECT, p);
  }
}
