package com.s8.fwks.palm.view.workspace;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.flow.repository.objects.S8RepositoryMetadata;
import com.s8.api.flow.repository.requests.GetRepositoryMetadataS8Request;
import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.fwks.palm.view.repository.RepositoryViewer;
import com.s8.pkgs.ui.carbide.collections.grids.r2.AccessR2GridCard;
import com.s8.pkgs.ui.carbide.collections.grids.r2.R2Grid;

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
	public void refresh(S8WebFront front, S8AsyncFlow flow) {

		/* <refresh> */
		flow.getRepository(new GetRepositoryMetadataS8Request(repositoryAddress) {

			@Override
			public void onSucceed(Status status, S8RepositoryMetadata metadata) {
				if(status == Status.OK) {

					/* refreshing */
					cardView.setSelected(false);
					cardView.setTitle(metadata.getName());
					cardView.setInfo(metadata.getInfo());
				}
			}

			@Override
			public void onFailed(Exception exception) {
				exception.printStackTrace();
			}
		});

		/* </refresh> */
	}

	public AccessR2GridCard getView(S8WebFront branch, S8AsyncFlow flow, R2Grid grid) {

		initialize(branch, flow, grid);

		refresh(branch, flow);

		return cardView;
	}


}
