package com.s8.fwks.palm.view.repository;

import com.s8.api.flow.repository.objects.S8BranchMetadata;
import com.s8.api.flow.repository.objects.S8RepositoryMetadata;
import com.s8.api.flow.repository.requests.CloneBranchS8Request;
import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.list.AccessStdListRow;
import com.s8.fwks.palm.model.branch.PalmProjectModel;
import com.s8.fwks.palm.view.branch.PalmProjectViewer;

/**
 * 
 */
public class BranchAccessor {

	public final PalmRepositoryViewer repositoryViewer;

	public final String repositoryAddress;

	public final String branchId;

	public PalmProjectViewer projectViewer;


	private AccessStdListRow row;


	public BranchAccessor(PalmRepositoryViewer repositoryViewer, String branchId) {
		super();
		this.repositoryViewer = repositoryViewer;
		this.repositoryAddress = repositoryViewer.repositoryAddress;
		this.branchId = branchId;
	}





	/**
	 * Build, Refresh and view
	 * 
	 * @param front
	 * @param branchMetadata
	 * @return
	 */
	public AccessStdListRow view(S8WebFront front, S8BranchMetadata branchMetadata) {
		if(row == null) {
			row = AccessStdListRow.create(front, branchMetadata.getName(), branchMetadata.getInfo());
			row.onClick(flow -> {
				S8RepositoryMetadata repositoryMetadata = repositoryViewer.repositoryMetadata;

				if(projectViewer != null) {

					projectViewer.view();
					flow.send();
				}
				else {

					/**
					 * 
					 */
					flow.cloneBranch(new CloneBranchS8Request(repositoryAddress, branchId) {

						@Override
						public void onResponse(Status status, Object[] objects) {
							if(status == Status.OK) {

								// offload db
								flow.runBlock(0, () -> {

									/*
									 * retrieve model
									 */
									PalmProjectModel model = (PalmProjectModel) objects[0];

									/*
									 * Create view
									 */
									model.view(front, flow, BranchAccessor.this, repositoryMetadata, branchMetadata);

								});
							}
						}

						@Override
						public void onError(Exception exception) {
							exception.printStackTrace();
						}
					});
					
					flow.send();
				}
			});	
		}

		return row;
	}





}
