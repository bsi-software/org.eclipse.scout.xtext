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
package org.eclipse.scout.sdk.saml.importer.operation.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.scout.sdk.operation.IOperation;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.util.typecache.IWorkingCopyManager;

/**
 * <h3>{@link ExternalProjectImportOperation}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 21.11.2012
 */
public class ExternalProjectImportOperation implements IOperation {

  private File m_folder;

  @Override
  public String getOperationName() {
    return "Import existing projects into workspace";
  }

  @Override
  public void validate() throws IllegalArgumentException {
    if (getFolder() == null) {
      throw new IllegalArgumentException("A root folder must be specified.");
    }
    if (!getFolder().exists()) {
      throw new IllegalArgumentException("The specified root folder does not exist: '" + getFolder().getAbsolutePath() + "'.");
    }
    if (!getFolder().isDirectory()) {
      throw new IllegalArgumentException("The specified root folder points to a file instead a directory: '" + getFolder().getAbsolutePath() + "'.");
    }
  }

  @Override
  public void run(IProgressMonitor monitor, IWorkingCopyManager workingCopyManager) throws CoreException, IllegalArgumentException {
    IWorkspace ws = ResourcesPlugin.getWorkspace();

    for (File projectDescFile : getAllProjectFiles()) {
      InputStream is = null;
      try {
        is = new BufferedInputStream(new FileInputStream(projectDescFile));
        IProjectDescription pd = ws.loadProjectDescription(is);
        IProject project = ws.getRoot().getProject(pd.getName());
        if (!project.exists()) { // if the project already is in the workspace: leave it and do not import
          project.create(pd, monitor);
          project.open(monitor);
        }
      }
      catch (IOException e) {
        SamlImporterActivator.logError("Unable to import project from file '" + projectDescFile.getAbsolutePath() + "'.", e);
      }
      finally {
        if (is != null) {
          try {
            is.close();
          }
          catch (Throwable t) {
          }
        }
      }
    }
    ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
    ResourcesPlugin.getWorkspace().checkpoint(false);
  }

  private File[] getAllProjectFiles() {
    ArrayList<File> projects = new ArrayList<File>();
    for (File projectFolder : getFolder().listFiles(new FileFilter() {
      @Override
      public boolean accept(File pathname) {
        return pathname.isDirectory() && pathname.exists() && !pathname.getName().startsWith(".");
      }
    })) {
      File[] projectFiles = projectFolder.listFiles(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
          return name.equals(IProjectDescription.DESCRIPTION_FILE_NAME);
        }
      });
      if (projectFiles != null && projectFiles.length > 0) {
        for (File projectFile : projectFiles) {
          projects.add(projectFile);
        }
      }
    }
    return projects.toArray(new File[projects.size()]);
  }

  public File getFolder() {
    return m_folder;
  }

  public void setFolder(File folder) {
    m_folder = folder;
  }
}
