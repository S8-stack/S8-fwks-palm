package com.s8.fwks.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard;


/**
 * 
 */
public abstract class RepoCardViewer {
	
	
	
	/**
	 * 
	 * @param front
	 * @param gridViewer
	 * @param grid
	 * @return
	 */
	public abstract WorkspaceGridCard getView(S8WebFront front);

}
