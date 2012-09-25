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
 * <h3>{@link Act4ImportWizardPage}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.03.2012
 */
public class SamlImportWizardPage extends AbstractWorkspaceWizardPage {

  private final static String PROP_SAML_FILE = "fileProp";

  private FileSelectionField m_fileField;

  public SamlImportWizardPage() {
    super(SamlImportWizardPage.class.getName());
    setTitle("Saml Importer");
    setDescription("Saml Importer");
  }

  @Override
  protected void createContent(Composite parent) {
    m_fileField = new FileSelectionField(parent);
    m_fileField.setLabelText("SAML File");
    m_fileField.setFolderMode(false);
    m_fileField.addProductSelectionListener(new IFileSelectionListener() {
      @Override
      public void fileSelected(File file) {
        String fileName = "";
        if (file != null) {
          fileName = file.getAbsolutePath();
        }
        setSamlFileInternal(fileName);
        pingStateChanging();
      }
    });
    File defaultPath = new File("C:\\BSI\\Projects\\SAML\\runtime-EclipseApplication\\org.eclipse.scout.saml.input\\Rka001.saml");
    setSamlFileInternal(defaultPath.getAbsolutePath());
    m_fileField.setFile(defaultPath);
    pingStateChanging();

    parent.setLayout(new GridLayout(1, true));
    m_fileField.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.FILL_HORIZONTAL));
  }

  public String getSamlFile() {
    return (String) getProperty(PROP_SAML_FILE);
  }

  @Override
  protected void validatePage(MultiStatus multiStatus) {
    multiStatus.add(getSamlFileFileStatus());
  }

  protected IStatus getSamlFileFileStatus() {
    if (!StringUtility.hasText(getSamlFile())) {
      return new Status(IStatus.ERROR, ScoutSdkUi.PLUGIN_ID, "Choose a SAML file");
    }
    return Status.OK_STATUS;
  }

  public void setSamlFile(String f) {
    try {
      setStateChanging(true);
      setSamlFileInternal(f);
      if (isControlCreated()) {
        m_fileField.setFileName(f);
      }
    }
    finally {
      setStateChanging(false);
    }
  }

  private void setSamlFileInternal(String f) {
    if (f != null) {
      f = f.trim();
    }
    setProperty(PROP_SAML_FILE, f);
  }
}
