/*******************************************************************************
 * Copyright (c) 2010 BSI Business Systems Integration AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     BSI Business Systems Integration AG - initial API and implementation
 ******************************************************************************/
package org.eclipse.scout.sdk.saml.importer.ui.wizard;

import java.io.File;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.scout.commons.StringUtility;
import org.eclipse.scout.sdk.ui.fields.FileSelectionField;
import org.eclipse.scout.sdk.ui.fields.IFileSelectionListener;
import org.eclipse.scout.sdk.ui.internal.ScoutSdkUi;
import org.eclipse.scout.sdk.ui.wizard.AbstractWorkspaceWizardPage;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

/**
 * @author mvi
 * @since 3.8.0 26.03.2012
 */
public class SamlImportWizardPage extends AbstractWorkspaceWizardPage {

  private final static String PROP_SAML_ROOT_DIRECTORY = "samlRootDir";
  private final static String SETTING_SAML_ROOT_DIRECTORY = "samlRootDirSetting";

  private FileSelectionField m_fileField;

  public SamlImportWizardPage() {
    super(SamlImportWizardPage.class.getName());
    setTitle("Saml Importer");
    setDescription("Saml Importer");
  }

  @Override
  protected void createContent(Composite parent) {
    m_fileField = new FileSelectionField(parent);
    m_fileField.setLabelText("SAML Root Directory");
    m_fileField.setFolderMode(true);
    m_fileField.addProductSelectionListener(new IFileSelectionListener() {
      @Override
      public void fileSelected(File file) {
        String fileName = "";
        if (file != null) {
          fileName = file.getAbsolutePath();
        }
        setSamlRootInternal(fileName);
        pingStateChanging();
      }
    });
    String defaultPath = getDialogSettings().get(SETTING_SAML_ROOT_DIRECTORY);
    if (StringUtility.hasText(defaultPath)) {
      File f = new File(defaultPath);
      m_fileField.setFile(f);
      setSamlRootInternal(f.getAbsolutePath());
      pingStateChanging();
    }
    else {
      m_fileField.setFile(null);
      setSamlRootInternal(null);
    }

    parent.setLayout(new GridLayout(1, true));
    m_fileField.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_HORIZONTAL));
  }

  public String getSamlRoot() {
    return (String) getProperty(PROP_SAML_ROOT_DIRECTORY);
  }

  @Override
  protected void validatePage(MultiStatus multiStatus) {
    multiStatus.add(getSamlRootStatus());
  }

  protected IStatus getSamlRootStatus() {
    if (!StringUtility.hasText(getSamlRoot())) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "Please specify a SAML root directory");
    }
    File f = new File(getSamlRoot());
    if (!f.exists()) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "The given SAML root directory could not be found");
    }
    return Status.OK_STATUS;
  }

  public void setSamlRoot(String f) {
    try {
      setStateChanging(true);
      setSamlRootInternal(f);
      if (isControlCreated()) {
        m_fileField.setFileName(f);
      }
    }
    finally {
      setStateChanging(false);
    }
  }

  private void setSamlRootInternal(String f) {
    if (f != null) {
      f = f.trim();
    }
    getDialogSettings().put(SETTING_SAML_ROOT_DIRECTORY, f);
    setProperty(PROP_SAML_ROOT_DIRECTORY, f);
  }
}
