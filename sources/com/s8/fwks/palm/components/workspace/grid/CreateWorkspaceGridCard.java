package com.s8.fwks.palm.components.workspace.grid;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.PalmWebSources;


/**
 * 
 * 
 * 
 * @author pierreconvert
 *
 */
public class CreateWorkspaceGridCard extends WorkspaceGridCard {
	
	public static CreateWorkspaceGridCard create(S8WebFront branch) {
		CreateWorkspaceGridCard card = new CreateWorkspaceGridCard(branch);
		return card;
	}


	
	/**
	 * 
	 */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/workspace/grid/CreateWorkspaceGridCard";
	
	
	
	/**
	 * 
	 * @param branch
	 */
	public CreateWorkspaceGridCard(S8WebFront branch) {
		super(branch, WEBPATH);
	}
	
	
	
}
