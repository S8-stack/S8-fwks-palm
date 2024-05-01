package com.s8.fwks.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Size;
import com.s8.fwks.palm.model.space.PalmRepositoryAccess;
import com.s8.fwks.palm.view.repository.PalmRepositoryViewer;

/**
 * 
 * @author pierreconvert
 *
 */
public class RepoCardAccessor extends RepoCard {

	
	public final PalmWorkspaceViewer workspaceViewer;

	/**
	 * 
	 */
	public final String repositoryAddress;


	/**
	 * 
	 */
	private AccessWorkspaceGridCard cardView;

	
	private PalmRepositoryViewer repositoryViewer;



	/**
	 * 
	 * @param repositoryAddress
	 * @param cardView
	 */
	public RepoCardAccessor(PalmWorkspaceViewer workspaceViewer, String repositoryAddress) {
		super();
		this.workspaceViewer = workspaceViewer;
		this.repositoryAddress = repositoryAddress;
	}


	private void initialize(S8WebFront front) {
		/* <initialize> */
		if(cardView == null) {
			
			cardView = new AccessWorkspaceGridCard(front);
			cardView.setSize(Size.STANDARD);

			// on click
			cardView.onClick(flow -> {
				
				if(repositoryViewer == null) {
					repositoryViewer = new PalmRepositoryViewer(front, workspaceViewer, repositoryAddress);
				}
				
				repositoryViewer.view(flow);
			});
		}
		/* </initialize> */

	}


	/**
	 * 
	 * @param front
	 * @param flow
	 */
	public void refresh(PalmRepositoryAccess repositoryAccess) {
		cardView.setImageURL(repositoryAccess.imageURL);
		cardView.setPanelContent("<h1>"+repositoryAccess.title+"</h1><h2>"+repositoryAccess.type+"</h2><p>"+repositoryAccess.info+"</p>");
		/* </refresh> */
	}
	
	
	public void update(S8WebFront front, PalmRepositoryAccess repositoryAccess) {
		initialize(front);
		refresh(repositoryAccess);
	}

	
	@Override
	public AccessWorkspaceGridCard getView() {
		return cardView;
	}
	
	
}
