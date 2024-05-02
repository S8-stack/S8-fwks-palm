package com.s8.fwks.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Size;
import com.s8.fwks.palm.model.space.PalmRepositoryLink;
import com.s8.fwks.palm.view.repository.PalmRepositoryViewer;

/**
 * 
 * @author pierreconvert
 *
 */
public class RepositoryAccessor extends RepositoryHandler {

	
	public @Override String getType() { return "accessor"; }
	
	/**
	 * display id
	 */
	public @Override String getDisplayId() { return repositoryAddress; }


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
	public RepositoryAccessor(PalmWorkspaceViewer workspaceViewer, String repositoryAddress) {
		super();
		link(workspaceViewer);
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
	public void repaint(PalmRepositoryLink repositoryAccess) {
		cardView.setImageURL(repositoryAccess.getImage());
		cardView.setPanelContent("<h1>"+repositoryAccess.getTitle()
		+"</h1><h2>"+repositoryAccess.getType()
		+"</h2><p>"+repositoryAccess.getInfo()+"</p>");
		/* </refresh> */
		
		cardView.setPriority(Math.random());
	}


	public void update(S8WebFront front, PalmRepositoryLink repositoryAccess) {
		initialize(front);
		repaint(repositoryAccess);
	}


	@Override
	public AccessWorkspaceGridCard getView() {
		return cardView;
	}




}
