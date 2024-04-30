package com.s8.fwks.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Size;
import com.s8.fwks.palm.model.space.PalmRepositoryAccess;
import com.s8.fwks.palm.view.repository.RepositoryViewer;

/**
 * 
 * @author pierreconvert
 *
 */
public class AccessRepoCardViewer extends RepoCardViewer {

	

	/**
	 * 
	 */
	public final String repositoryAddress;


	/**
	 * 
	 */
	private AccessWorkspaceGridCard cardView;

	
	private RepositoryViewer repositoryViewer;



	/**
	 * 
	 * @param repositoryAddress
	 * @param cardView
	 */
	public AccessRepoCardViewer(String repositoryAddress) {
		super();
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
					repositoryViewer = new RepositoryViewer(front, repositoryAddress);
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
