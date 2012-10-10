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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.scout.nls.sdk.model.util.Language;
import org.eclipse.scout.nls.sdk.model.workspace.NlsEntry;
import org.eclipse.scout.nls.sdk.model.workspace.project.INlsProject;
import org.eclipse.scout.saml.saml.LanguageAttribute;
import org.eclipse.scout.saml.saml.TranslationElement;
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

    NlsEntry entry = new NlsEntry(key, nlsProject);
    for (LanguageAttribute lang : getTranslationElement().getTranslations()) {
      Language language = new Language(new Locale(lang.getLang()));
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
