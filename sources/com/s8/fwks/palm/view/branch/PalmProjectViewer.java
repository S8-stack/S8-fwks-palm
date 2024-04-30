package com.s8.fwks.palm.view.branch;

import com.s8.api.flow.repository.objects.S8BranchMetadata;
import com.s8.api.flow.repository.objects.S8RepositoryMetadata;
import com.s8.api.web.S8WebFront;

/**
 * 
 */
public abstract class PalmProjectViewer {

	public final S8WebFront front;
	
	public final S8RepositoryMetadata repositoryMetadata;
	
	public final S8BranchMetadata branchMetadata;
	
	

	/**
	 * 
	 * @param front
	 * @param repositoryMetadata
	 * @param branchMetadata
	 */
	public PalmProjectViewer(S8WebFront front, S8RepositoryMetadata repositoryMetadata, S8BranchMetadata branchMetadata) {
		super();
		this.front = front;
		this.repositoryMetadata = repositoryMetadata;
		this.branchMetadata = branchMetadata;
	}



	/**
	 * Issue page for the project
	 */
	public abstract void view();
	
}
