package org.imogene.acceleo.contrib.helper;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.JavaRuntime;

public class ProjectCreationHelper {

/**
 * Create a new project
 * @return
 */
	public static boolean newProject(String projectName) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
		try {
			project.create(new NullProgressMonitor());
			project.open(null);
			//Set JAVA nature
			IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] {JavaCore.NATURE_ID});
			//Creating java project
			project.setDescription(description, null);
			IJavaProject javaProject = JavaCore.create(project);
			//Set the build path
			IClasspathEntry[] buildPath = {
				JavaCore.newSourceEntry(project.getFullPath().append("src")),
				JavaRuntime.getDefaultJREContainerEntry()};
			javaProject.setRawClasspath(buildPath, project.getFullPath().append("bin"), null);
			//Create and add folder to the project
			IFolder folder = project.getFolder("src");
			folder.create(true, true, null);
			IPackageFragmentRoot srcFolder = javaProject.getPackageFragmentRoot(folder);
			IPackageFragment fragment = srcFolder.createPackageFragment("org.imogene", true, null);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return false;
	}
}