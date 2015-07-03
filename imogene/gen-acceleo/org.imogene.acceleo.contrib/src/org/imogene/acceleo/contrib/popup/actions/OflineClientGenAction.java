package org.imogene.acceleo.contrib.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.imogene.acceleo.contrib.helper.ProjectCreationHelper;

public class OflineClientGenAction implements IObjectActionDelegate {
	

	Shell shell;
	private static final String PROJECT_NAME = "org.imogene.oflineApp";

	public OflineClientGenAction() {
		// TODO Auto-generated constructor stub
	}

	public void run(IAction action) {
		ProjectCreationHelper.newProject(PROJECT_NAME);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

}
