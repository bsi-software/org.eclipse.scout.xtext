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
package org.eclipse.scout.sdk.saml.importer;

import org.eclipse.core.resources.IProject;
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
import org.eclipse.scout.sdk.jobs.OperationJob;
import org.eclipse.scout.sdk.operation.data.AutoUpdateManager;
import org.eclipse.scout.sdk.saml.importer.internal.SamlImporterActivator;
import org.eclipse.scout.sdk.saml.importer.operation.SamlImportOperation;
import org.eclipse.scout.sdk.util.jdt.JdtUtility;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

/**
 * <h3>{@link SamlImportHelper}</h3> Basic entry point for starting a SAML import.
 * 
 * @author mvi
 * @since 3.9.0 26.10.2012
 */
@SuppressWarnings("restriction")
public class SamlImportHelper {

  /**
   * Starts the SAML import into the current workspace.<br>
   * Important: This method should only be called if there is no workbench running! If a workbench is available, use
   * {@link SamlImportHelper#importSamlSync(IProject, Injector, XtextResourceSet)}!<br>
   * This methods blocks until the import and all post processing tasks have been completed.
   * 
   * @param samlInputProject
   *          All .saml files in this project will be imported.
   * @return The finish status of the import.
   * @throws IllegalArgumentException
   */
  public static IStatus importSamlSync(IProject samlInputProject) throws IllegalArgumentException {
    return importSamlSync(samlInputProject, null, null);
  }

  /**
   * Starts the SAML import into the current workspace.<br>
   * This methods blocks until the import and all post processing tasks have been completed.
   * 
   * @param samlInputProject
   *          All .saml files in this project will be imported.
   * @param injector
   *          The injector to use. Can be retrieved from the SAML UI Activator.
   * @param resourceSet
   *          The resource set that belongs to the given input project. Can be retrieved from a IResourceSetProvider.
   * @return The finish status of the import.
   * @throws IllegalArgumentException
   */
  public static IStatus importSamlSync(IProject samlInputProject, Injector injector, XtextResourceSet resourceSet) throws IllegalArgumentException {
    return doImport(samlInputProject, injector, resourceSet, true);
  }

  /**
   * Starts the SAML import into the current workspace and immediately returns.<br>
   * Important: This method should only be called if there is no workbench running! If a workbench is available, use
   * {@link SamlImportHelper#importSamlAsync(IProject, Injector, XtextResourceSet)}!<br>
   * 
   * @param samlInputProject
   *          All .saml files in this project will be imported.
   * @throws IllegalArgumentException
   */
  public static void importSamlAsync(IProject samlInputProject) throws IllegalArgumentException {
    importSamlAsync(samlInputProject, null, null);
  }

  /**
   * Starts the SAML import into the current workspace and immediately returns.
   * 
   * @param samlInputProject
   *          All .saml files in this project will be imported.
   * @param injector
   *          The injector to use. Can be retrieved from the SAML UI Activator.
   * @param resourceSet
   *          The resource set that belongs to the given input project. Can be retrieved from a IResourceSetProvider.
   * @throws IllegalArgumentException
   */
  public static void importSamlAsync(IProject samlInputProject, Injector injector, XtextResourceSet resourceSet) throws IllegalArgumentException {
    doImport(samlInputProject, injector, resourceSet, false);
  }

  private static IStatus doImport(IProject samlInputProject, Injector injector, XtextResourceSet resourceSet, final boolean sync) throws IllegalArgumentException {
    IStatus result = null;

    final boolean origFormDataAutoUpdate = ScoutSdk.getDefault().isAutoUpdateEnabled();
    try {
      ScoutSdk.getDefault().setAutoUpdateEnabled(true);

      final SamlImportOperation op = new SamlImportOperation();
      op.setSamlInputProject(samlInputProject);
      op.setInjector(injector);
      op.setResourceSet(resourceSet);
      SamlImporterActivator.logInfo("Starting SAML Import.");

      final P_WaitForWorkspaceReadyJob waitJob = new P_WaitForWorkspaceReadyJob();
      if (!sync) {
        waitJob.addJobChangeListener(new JobChangeAdapter() {
          @Override
          public void done(IJobChangeEvent event) {
            ScoutSdk sdkInstance = ScoutSdk.getDefault();
            if (sdkInstance != null) {
              ScoutSdk.getDefault().setAutoUpdateEnabled(origFormDataAutoUpdate);
            }
          }
        });
      }

      OperationJob importJob = new OperationJob(op);
      importJob.addJobChangeListener(new JobChangeAdapter() {
        @Override
        public void done(IJobChangeEvent event) {
          new P_MaxFormDataStartDelayJob(waitJob).schedule(10000);
        }
      });

      importJob.schedule();
      waitJob.schedule();

      if (sync) {
        try {
          SamlImporterActivator.logInfo("Sync SAML import requested. Waiting for SAML Import Job to complete.");
          importJob.join();
          result = importJob.getResult();
        }
        catch (InterruptedException e) {
          SamlImporterActivator.logWarning("Interrupted while waiting for import job.", e);
        }
        try {
          SamlImporterActivator.logInfo("Import Job completed. Waiting until all post-import tasks have been completed.");
          waitJob.join();
        }
        catch (InterruptedException e) {
          SamlImporterActivator.logWarning("Interrupted while waiting for post-import tasks.", e);
        }
        SamlImporterActivator.logInfo("Post-Import tasks completed. Sync import completed.");
      }
    }
    finally {
      if (sync) {
        ScoutSdk.getDefault().setAutoUpdateEnabled(origFormDataAutoUpdate);
      }
    }
    return result;
  }

  /**
   * this job unblocks the waiting job if no formdata update has been started or finished within a given time.
   * 
   * @author mvi
   */
  private static class P_MaxFormDataStartDelayJob extends Job {
    private final P_WaitForWorkspaceReadyJob m_waitingJob;

    private P_MaxFormDataStartDelayJob(P_WaitForWorkspaceReadyJob j) {
      super("notify workspace ready job to stop waiting");
      setSystem(true);
      m_waitingJob = j;
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
      if (!m_waitingJob.m_listener.formDataUpdateStarted && !m_waitingJob.finished) {
        // the formdata job has not yet started or completed -> we assume the saml import has not changed any forms -> no formdata updates will come
        m_waitingJob.stopWaiting();
      }
      return Status.OK_STATUS;
    }
  }

  /**
   * this job waits until it is notified to stop waiting. then the workspace is refreshed.
   * 
   * @author mvi
   */
  private static class P_WaitForWorkspaceReadyJob extends Job {
    private volatile boolean finished = false;
    private final P_FormDataAutoUpdateJobListener m_listener;

    private P_WaitForWorkspaceReadyJob() {
      super("wait until workspace is ready");
      setSystem(true);
      m_listener = new P_FormDataAutoUpdateJobListener(this);
    }

    private synchronized void stopWaiting() {
      finished = true;
      notify();
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
      try {
        Job.getJobManager().addJobChangeListener(m_listener);

        while (!finished) {
          try {
            synchronized (this) {
              wait();
            }
          }
          catch (InterruptedException e) {
          }
        }
      }
      finally {
        Job.getJobManager().removeJobChangeListener(m_listener);
      }

      try {
        ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IResource.DEPTH_INFINITE, monitor);
      }
      catch (CoreException e) {
        SamlImporterActivator.logWarning("Could not refresh workspace.", e);
      }

      JdtUtility.waitForSilentWorkspace();
      JdtUtility.waitForJobFamily(AutoUpdateManager.AUTO_UPDATE_JOB_FAMILY); // may be triggered again after refresh of workspace.

      return Status.OK_STATUS;
    }
  }

  /**
   * this listener monitors the formdata auto update job. it protocols the start of a formdataupdate job and
   * unblocks the waiting job as soon as the formdata job has completed.
   * 
   * @author mvi
   */
  private static class P_FormDataAutoUpdateJobListener extends JobChangeAdapter {
    private final P_WaitForWorkspaceReadyJob m_waitingJob;
    private volatile boolean formDataUpdateStarted = false;

    private P_FormDataAutoUpdateJobListener(P_WaitForWorkspaceReadyJob j) {
      m_waitingJob = j;
    }

    private boolean isFormDataJob(Job j) {
      return j.belongsTo(AutoUpdateManager.AUTO_UPDATE_JOB_FAMILY);
    }

    @Override
    public void scheduled(IJobChangeEvent event) {
      if (isFormDataJob(event.getJob())) {
        formDataUpdateStarted = true;
      }
    }

    @Override
    public void done(IJobChangeEvent event) {
      if (event.getResult().isOK() && isFormDataJob(event.getJob())) {
        m_waitingJob.stopWaiting();
      }
    }
  }
}
