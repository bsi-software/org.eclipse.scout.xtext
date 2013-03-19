package org.eclipse.scout.sdk.saml.importer.ui.extension;

import org.eclipse.scout.sdk.saml.importer.ui.action.SamlImportAction;
import org.eclipse.scout.sdk.ui.action.IScoutHandler;
import org.eclipse.scout.sdk.ui.extensions.IContextMenuContributor;
import org.eclipse.scout.sdk.ui.view.outline.pages.IPage;

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
