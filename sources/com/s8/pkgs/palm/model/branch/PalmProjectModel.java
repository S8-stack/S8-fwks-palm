package com.s8.pkgs.palm.model.branch;

import com.s8.api.annotations.S8ObjectType;
import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.flow.repository.objects.RepoS8Object;
import com.s8.api.flow.repository.objects.S8BranchMetadata;
import com.s8.api.flow.repository.objects.S8RepositoryMetadata;
import com.s8.api.web.S8WebFront;
import com.s8.pkgs.palm.view.repository.BranchAccessor;

/**
 * 
 */
@S8ObjectType(name = "com.s8.fwks.palm.model.PalmProjectModel")
public abstract class PalmProjectModel extends RepoS8Object {
	
	
	/**
	 * 
	 * @return
	 */
	public abstract void view(S8WebFront front, S8AsyncFlow flow,
			BranchAccessor accessor,
			S8RepositoryMetadata repositoryMetadata, S8BranchMetadata branchMetadata);

}
