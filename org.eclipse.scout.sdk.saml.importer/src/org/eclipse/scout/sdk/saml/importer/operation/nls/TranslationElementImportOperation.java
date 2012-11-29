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
package org.eclipse.scout.sdk.saml.importer.operation.nls;

import java.util.Locale;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.nls.sdk.internal.jdt.INlsFolder;
import org.eclipse.scout.nls.sdk.internal.jdt.NlsFolder;
import org.eclipse.scout.nls.sdk.model.util.Language;
import org.eclipse.scout.nls.sdk.model.workspace.NlsEntry;
import org.eclipse.scout.nls.sdk.model.workspace.project.INlsProject;
import org.eclipse.scout.nls.sdk.simple.model.ws.INlsType;
import org.eclipse.scout.nls.sdk.simple.model.ws.project.SimpleNlsProject;
import org.eclipse.scout.nls.sdk.simple.ui.dialog.language.TranslationFileNewModel;
import org.eclipse.scout.nls.sdk.ui.action.INewLanguageContext;
import org.eclipse.scout.saml.saml.LanguageAttribute;
import org.eclipse.scout.saml.saml.TranslationElement;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;

/**
 * <h3>{@link TranslationElementImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 25.09.2012
 */
public class TranslationElementImportOperation extends AbstractSamlElementImportOperation {

  private TranslationElement m_translationElement;

  @Override
  public String getOperationName() {
    return "Create translation";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getTranslationElement() == null) {
      throw new IllegalArgumentException("TranslationElement cannot be null.");
    }
  }

  @Override
  public void run() throws CoreException, IllegalArgumentException {
    String key = getTranslationElement().getName();

    INlsProject nlsProject = getCurrentScoutModule().getNlsProject();
    if (nlsProject == null) {
      throw new IllegalArgumentException("No NLS project could be found in module '" + getCurrentScoutModule().getProjectName() +
          "'. Ensure a TextProviderService exists for this module.");
    }

    INlsType txtProvSvc = null;
    IFolder fld = null;
    if (nlsProject instanceof SimpleNlsProject) {
      txtProvSvc = ((SimpleNlsProject) nlsProject).getNlsType();
      fld = txtProvSvc.getType().getJavaProject().getProject().getFolder(txtProvSvc.getTranslationsFolderName());
    }
    else {
      SamlImporterActivator.logWarning("The NLS Project of the current module is no Scout NLS Project. Missing Languages will not be created automatically.");
    }

    NlsEntry entry = new NlsEntry(key, nlsProject);
    for (LanguageAttribute lang : getTranslationElement().getTranslations()) {
      Language language = new Language(new Locale(lang.getLang()));
      if (txtProvSvc != null && fld != null && !nlsProject.containsLanguage(language)) {
        INewLanguageContext translationCreationContext = nlsProject.getTranslationCreationContext();
        TranslationFileNewModel model = (TranslationFileNewModel) translationCreationContext.getModel();
        model.setLanguageIso(lang.getLang());
        model.setFolder(new NlsFolder(fld, INlsFolder.TYPE_SIMPLE_FOLDER));
        translationCreationContext.execute(getSamlContext().getMonitor());
      }
      entry.addTranslation(language, lang.getText());
    }
    nlsProject.updateRow(entry, getSamlContext().getMonitor());
  }

  public TranslationElement getTranslationElement() {
    return m_translationElement;
  }

  public void setTranslationElement(TranslationElement translationElement) {
    m_translationElement = translationElement;
  }

}
