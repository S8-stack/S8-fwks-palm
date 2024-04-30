package com.s8.fwks.palm.model.space;

import com.s8.api.annotations.S8Field;
import com.s8.api.annotations.S8ObjectType;
import com.s8.api.exceptions.S8IOException;
import com.s8.api.flow.space.objects.SpaceS8Object;
import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Size;

/**
 * 
 * @author pierreconvert
 *
 */
@S8ObjectType(name = "com.s8.fwks.palm.model.space.PalmRepositoryAccess")
public class PalmRepositoryAccess extends SpaceS8Object {
	
	
	/**
	 * 
	 * @param repositoryAddress
	 * @param title
	 * @param type
	 * @param info
	 * @return
	 * @throws S8IOException
	 */
	public static PalmRepositoryAccess create(
			String repositoryAddress, 
			String image, 
			String title, 
			String type, 
			String info) throws S8IOException {
		PalmRepositoryAccess repository = new PalmRepositoryAccess();
		repository.setRepositoryAddress(repositoryAddress);
		repository.setImage(image);
		repository.setTitle(title);
		repository.setType(type);
		repository.setInfo(info);
		return repository;
	}


	/**
	 * 
	 */
	public @S8Field(name = "repository-address") String repositoryAddress;
	
	
	/**
	 * 
	 */
	public @S8Field(name = "image") String image;

	
	/**
	 * title
	 */
	public @S8Field(name = "title") String title;
	
	
	/**
	 * type
	 */
	public @S8Field(name = "type") String type;
	

	/**
	 * info
	 */
	public @S8Field(name = "info") String info;

	


	
	/**
	 * S8 constructor
	 */
	public PalmRepositoryAccess() {
		super();
	}
	
	

	
	/**
	 * 
	 * @param address
	 * @throws S8IOException
	 */
	public void setRepositoryAddress(String address) throws S8IOException {
		this.repositoryAddress = address;
		reportFieldUpdate("repository-address");
	}
	
	
	/**
	 * 
	 * @param address
	 * @throws S8IOException
	 */
	public void setImage(String image) throws S8IOException {
		this.image = image;
		reportFieldUpdate("image");
	}
	
	
	/**
	 * 
	 * @param title
	 * @throws S8IOException
	 */
	public void setTitle(String title) throws S8IOException {
		this.title = title;
		reportFieldUpdate("title");
	}
	
	
	/**
	 * 
	 * @param type
	 * @throws S8IOException
	 */
	public void setType(String type) throws S8IOException {
		this.type = type;
		reportFieldUpdate("type");
	}
	
	
	/**
	 * 
	 * @param type
	 * @throws S8IOException
	 */
	public void setInfo(String info) throws S8IOException {
		this.info = info;
		reportFieldUpdate("info");
	}

	
	
	/**
	 * 
	 * @param front
	 * @return
	 */
	public AccessWorkspaceGridCard view(S8WebFront front) {
		return AccessWorkspaceGridCard.create(front, Size.STANDARD, image,
				"<h1>"+title+"</h1><h2>"+type+"</h2><p>"+info+"</p>");
		
		
	}
	
	

	
	
}
