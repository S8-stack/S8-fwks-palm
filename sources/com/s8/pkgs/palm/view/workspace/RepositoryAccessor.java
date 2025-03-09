package com.s8.pkgs.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.pkgs.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.pkgs.palm.components.workspace.grid.WorkspaceGridCard.Size;
import com.s8.pkgs.palm.model.space.PalmRepositoryAccess;
import com.s8.pkgs.palm.view.repository.PalmRepositoryViewer;

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
	public void repaint(PalmRepositoryAccess repositoryAccess) {
		cardView.setImageURL(repositoryAccess.getImage());
		cardView.setTheme(repositoryAccess.getTheme());
		cardView.setSize(repositoryAccess.getSize());
		cardView.setPanelContent("<h1>"+repositoryAccess.getTitle()
		+"</h1><h2>"+repositoryAccess.getType()
		+"</h2><p>"+repositoryAccess.getInfo()+"</p>");
		/* </refresh> */
		
		cardView.setPriority(Math.random());
	}


	public void update(S8WebFront front, PalmRepositoryAccess repositoryAccess) {
		initialize(front);
		repaint(repositoryAccess);
	}


	@Override
	public AccessWorkspaceGridCard getView() {
		return cardView;
	}




}
