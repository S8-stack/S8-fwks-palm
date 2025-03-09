package com.s8.pkgs.palm.view.workspace;

import com.s8.pkgs.palm.components.workspace.grid.WorkspaceGridCard;


/**
 * 
 */
public abstract class RepositoryHandler {


	public PalmWorkspaceViewer workspaceViewer;


	/**
	 * type
	 * @return
	 */
	public abstract String getType();
	
	
	/**
	 * display id
	 * @return
	 */
	public abstract String getDisplayId();






	public RepositoryHandler() {
		super();
	}
	
	
	
	
	public void link(PalmWorkspaceViewer workspaceViewer) {
		this.workspaceViewer = workspaceViewer; 
	}





	/**
	 * 
	 * @param front
	 * @param gridViewer
	 * @param grid
	 * @return
	 */
	public abstract WorkspaceGridCard getView();


}
