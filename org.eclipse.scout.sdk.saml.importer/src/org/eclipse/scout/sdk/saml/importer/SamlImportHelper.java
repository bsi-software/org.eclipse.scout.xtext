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
package org.eclipse.scout.sdk.saml.importer;

import java.io.File;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.scout.sdk.internal.ScoutSdk;
import org.eclipse.scout.sdk.internal.workspace.ScoutProject;
import org.eclipse.scout.sdk.internal.workspace.ScoutWorkspace;
import org.eclipse.scout.sdk.jobs.OperationJob;
import org.eclipse.scout.sdk.operation.form.formdata.FormDataAutoUpdater;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.SamlImportOperation;
import org.eclipse.scout.sdk.util.jdt.JdtUtility;

/**
 * <h3>{@link SamlImportHelper}</h3> ...
 * 
 * @author mvi
 * @since 3.8.0 26.10.2012
 */
@SuppressWarnings("restriction")
public class SamlImportHelper {

  public static void importSamlSync(File samlInputDirectory) throws IllegalArgumentException {
    doImport(samlInputDirectory, true);
  }

  public static void importSamlAsync(File samlInputDirectory) throws IllegalArgumentException {
    doImport(samlInputDirectory, false);
  }

  private static void doImport(File samlInputDirectory, final boolean sync) throws IllegalArgumentException {
    ScoutProject[] roots = ScoutWorkspace.getInstance().getRootProjects();
    if (roots == null || roots.length != 1) {
      throw new IllegalArgumentException("the running workspace must contain exactly one scout project");
    }

    final boolean origFormDataAutoUpdate = ScoutSdk.getDefault().isFormDataAutoUpdate();
    try {
      ScoutSdk.getDefault().setFormDataAutoUpdate(true);

      final SamlImportOperation op = new SamlImportOperation();
      op.setSamlRootDirectory(samlInputDirectory);
      op.setScoutRootProject(roots[0]);
      SamlImporterActivator.logInfo("Starting import into Scout project '" + roots[0].getProjectName() + "'.");

      P_WaitForWorkspaceReadyJob wait = new P_WaitForWorkspaceReadyJob();
      OperationJob j = new OperationJob(op);
      if (!sync) {
        wait.addJobChangeListener(new JobChangeAdapter() {
          @Override
          public void done(IJobChangeEvent event) {
            ScoutSdk.getDefault().setFormDataAutoUpdate(origFormDataAutoUpdate);
          }
        });
      }

      j.schedule();
      wait.schedule();

      if (sync) {
        try {
          SamlImporterActivator.logInfo("Sync import requested. Waiting for Import Job to complete.");
          j.join();
        }
        catch (InterruptedException e) {
          SamlImporterActivator.logWarning("Interrupted while waiting for import job.", e);
        }
        try {
          SamlImporterActivator.logInfo("Import Job completed. Waiting until all post-import tasks have been completed.");
          wait.join();
        }
        catch (InterruptedException e) {
          SamlImporterActivator.logWarning("Interrupted while waiting for post-import tasks.", e);
        }
        SamlImporterActivator.logInfo("Sync import completed.");
      }
    }
    finally {
      if (sync) {
        ScoutSdk.getDefault().setFormDataAutoUpdate(origFormDataAutoUpdate);
      }
    }
  }

  private static class P_WaitForWorkspaceReadyJob extends Job {
    private boolean started = false;

    private P_WaitForWorkspaceReadyJob() {
      super("wait until workspace is ready");
      setSystem(true);
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
      P_ChangeListener listener = new P_ChangeListener(this);
      try {
        Job.getJobManager().addJobChangeListener(listener);

        while (!started) {
          try {
            synchronized (this) {
              this.wait();
            }
          }
          catch (InterruptedException e) {
          }
        }
      }
      finally {
        Job.getJobManager().removeJobChangeListener(listener);
      }

      try {
        ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
      }
      catch (CoreException e) {
        SamlImporterActivator.logWarning("Could not refresh workspace.", e);
      }

      JdtUtility.waitForSilentWorkspace();

      return Status.OK_STATUS;
    }
  }

  private static class P_ChangeListener extends JobChangeAdapter {
    private final P_WaitForWorkspaceReadyJob m_job;

    private P_ChangeListener(P_WaitForWorkspaceReadyJob j) {
      m_job = j;
    }

    @Override
    public void running(IJobChangeEvent event) {
      if (event.getJob().belongsTo(FormDataAutoUpdater.AUTO_UPDATE_JOB_FAMILY)) {
        synchronized (m_job) {
          m_job.started = true;
          m_job.notify();
        }
      }
    }
  }
}
