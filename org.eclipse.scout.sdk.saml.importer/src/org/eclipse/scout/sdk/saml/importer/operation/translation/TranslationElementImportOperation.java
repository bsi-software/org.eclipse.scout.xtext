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
package org.eclipse.scout.sdk.saml.importer.operation.translation;

import java.util.Locale;
import java.util.regex.Matcher;

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
import org.eclipse.scout.saml.validation.ISamlValidatorConstants;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.AbstractSamlElementImportOperation;

/**
 * <h3>{@link TranslationElementImportOperation}</h3> Imports a {@link TranslationElement}.
 * 
 * @author mvi
 * @since 3.9.0 25.09.2012
 */
public class TranslationElementImportOperation extends AbstractSamlElementImportOperation {

  @Override
  public void validate() throws IllegalArgumentException {
    if (getElement() == null) {
      throw new IllegalArgumentException("TranslationElement cannot be null.");
    }
  }

  @Override
  protected void run() throws CoreException, IllegalArgumentException {
    INlsProject nlsProject = getSamlContext().getCurrentModuleNlsProject();
    if (nlsProject == null) {
      throw new IllegalArgumentException("No NLS project could be found in module '" + getSamlContext().getCurrentScoutModule().getBaseName() + "'.");
    }
    if (nlsProject.getTranslationResource(Language.LANGUAGE_DEFAULT).isReadOnly()) {
      throw new IllegalArgumentException("NLS project found for module '" + getSamlContext().getCurrentScoutModule().getBaseName() + "' is readonly.");
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

    String key = getElement().getName();
    NlsEntry entry = new NlsEntry(key, nlsProject);
    for (LanguageAttribute lang : getElement().getTranslations()) {
      Language language = parseLanguage(lang);

      if (txtProvSvc != null && fld != null && !nlsProject.containsLanguage(language)) {
        INewLanguageContext translationCreationContext = nlsProject.getTranslationCreationContext();
        TranslationFileNewModel model = (TranslationFileNewModel) translationCreationContext.getModel();
        model.setLanguageIso(lang.getLang());
        model.setFolder(new NlsFolder(fld, INlsFolder.TYPE_SIMPLE_FOLDER));
        translationCreationContext.execute(getSamlContext().getMonitor());
      }
      entry.addTranslation(language, lang.getText());
    }
    nlsProject.updateRow(entry, false, getSamlContext().getMonitor());
  }

  @Override
  protected TranslationElement getElement() {
    return (TranslationElement) super.getElement();
  }

  private static Language parseLanguage(LanguageAttribute lang) {
    if (ISamlValidatorConstants.DEFAULT_LANG_NAME.equals(lang.getLang().toLowerCase())) {
      return Language.LANGUAGE_DEFAULT;
    }

    Matcher m = ISamlValidatorConstants.NLS_KEY_PATTERN.matcher(lang.getLang());
    if (m.matches()) {
      String l = m.group(2);
      String c = m.group(4);
      if (c != null) {
        return new Language(new Locale(l, c));
      }
      else if (l != null) {
        return new Language(new Locale(l));
      }
    }

    throw new IllegalArgumentException("Invalid language iso code: '" + lang.getLang() + "'.");
  }
}
