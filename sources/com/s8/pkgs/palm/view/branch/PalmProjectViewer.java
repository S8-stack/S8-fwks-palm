package com.s8.pkgs.palm.view.branch;

import com.s8.api.flow.repository.objects.S8BranchMetadata;
import com.s8.api.flow.repository.objects.S8RepositoryMetadata;
import com.s8.api.web.S8WebFront;
import com.s8.pkgs.palm.view.repository.PalmRepositoryViewer;

/**
 * 
 */
public abstract class PalmProjectViewer {

	public final S8WebFront front;
	
	/**
	 * Parent viewer
	 */
	public final PalmRepositoryViewer repositoryViewer;
	
	public final S8RepositoryMetadata repositoryMetadata;
	
	public final S8BranchMetadata branchMetadata;
	
	

	/**
	 * 
	 * @param front
	 * @param repositoryMetadata
	 * @param branchMetadata
	 */
	public PalmProjectViewer(S8WebFront front, 
			PalmRepositoryViewer repositoryViewer,
			S8RepositoryMetadata repositoryMetadata, 
			S8BranchMetadata branchMetadata) {
		super();
		this.front = front;
		this.repositoryViewer = repositoryViewer;
		this.repositoryMetadata = repositoryMetadata;
		this.branchMetadata = branchMetadata;
	}



	/**
	 * Issue page for the project
	 */
	public abstract void view();
	
}
