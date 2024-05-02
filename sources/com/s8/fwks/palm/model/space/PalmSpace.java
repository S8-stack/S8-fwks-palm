package com.s8.fwks.palm.model.space;

import java.util.List;
import java.util.function.Consumer;

import com.s8.api.annotations.S8Field;
import com.s8.api.annotations.S8ObjectType;
import com.s8.api.exceptions.S8IOException;
import com.s8.api.flow.space.objects.SpaceS8Object;


/**
 * 
 * @author pierreconvert
 *
 */
@S8ObjectType(name = "com.s8.fwks.palm.model.space.PalmSpace")
public class PalmSpace extends SpaceS8Object {
	
	

	@S8Field(name = "user-profile")
	public PalmProfile profile;
	
	
	@S8Field(name = "repositories")
	private List<PalmRepositoryLink> repositoryAccesses;
	
	
	public PalmSpace() {
		super();
	}
	

	/**
	 * 
	 * @param profile
	 * @throws S8IOException
	 */
	public void setProfile(PalmProfile profile) throws S8IOException {
		this.profile = profile;
		reportFieldUpdate("user-profile");
	}
	
	
	
	/**
	 * 
	 * @param repositoryAccesses
	 * @throws S8IOException
	 */
	public void setRepositories(List<PalmRepositoryLink> repositoryAccesses) throws S8IOException {
		this.repositoryAccesses = repositoryAccesses;
		reportFieldUpdate("repositories");
	}
	
	/**
	 * 
	 * @throws S8IOException
	 */
	public void notifyChanges() throws S8IOException {
		reportFieldUpdates("user-profile", "repositories");
	}
	
	
	/**
	 * 
	 * @param consumer
	 */
	public void forEachRepository(Consumer<PalmRepositoryLink> consumer) {
		this.repositoryAccesses.forEach(consumer);
	}

	
	/**
	 * 
	 * @param access
	 * @throws S8IOException
	 */
	public void addRepositoryAccess(PalmRepositoryLink access) throws S8IOException {
		this.repositoryAccesses.add(access);
		reportFieldUpdate("repositories");
	}
	
}
