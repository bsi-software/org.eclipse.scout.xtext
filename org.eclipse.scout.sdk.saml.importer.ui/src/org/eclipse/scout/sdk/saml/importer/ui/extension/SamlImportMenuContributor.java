package org.eclipse.scout.sdk.saml.importer.ui.extension;

import org.eclipse.scout.sdk.saml.importer.ui.action.SamlImportAction;
import org.eclipse.scout.sdk.ui.action.IScoutHandler;
import org.eclipse.scout.sdk.ui.extensions.IContextMenuContributor;
import org.eclipse.scout.sdk.ui.view.outline.pages.IPage;

/**
 * <h3>{@link SamlImportMenuContributor}</h3>The contributor that adds the SAML import menu into the scout explorer
 * tree.
 * 
 * @author mvi
 * @since 3.10.0 07.06.2013
 */
public class SamlImportMenuContributor implements IContextMenuContributor {

  @SuppressWarnings("unchecked")
  @Override
  public Class<? extends IScoutHandler>[] getSupportedMenuActionsFor(IPage page) {
    return new Class[]{SamlImportAction.class};
  }

  @Override
  public void prepareMenuAction(IPage page, IScoutHandler menu) {
  }
}
