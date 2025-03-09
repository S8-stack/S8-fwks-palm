package com.s8.fwks.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.pkgs.palm.components.workspace.grid.CreateWorkspaceGridCard;
import com.s8.pkgs.ui.carbide.collections.grids.r2.CreateR2GridCard;
import com.s8.pkgs.ui.carbide.collections.grids.r2.R2Grid;

/*
 * 
 */
public class CreateRepoCardViewer {
	
	
	
	
	
	/**
	 * form viewer
	 */
	private CreateWorkspaceGridCard formViewer;
	
	
	/**
	 * 
	 */
	public CreateRepoCardViewer(SpaceViewer gridViewer) {
		super();
		this.gridViewer = gridViewer;
	}
	
	
	/**
	 * 
	 * @param front
	 * @param gridViewer
	 * @param grid
	 * @return
	 */
	public CreateR2GridCard getView(S8WebFront front, R2Grid grid) {
	
		
		// nothing to refresh
		
		return cardView;
	}
	
}
