package com.s8.fwks.palm.model.space;

import com.s8.api.annotations.S8Field;
import com.s8.api.annotations.S8ObjectType;
import com.s8.api.exceptions.S8IOException;
import com.s8.api.flow.space.objects.SpaceS8Object;

/**
 * 
 * @author pierreconvert
 *
 */
@S8ObjectType(name = "com.s8.fwks.palm.model.space.PalmRepositoryAccess")
public class PalmRepositoryLink extends SpaceS8Object {


	/**
	 * 
	 * @param repositoryAddress
	 * @param title
	 * @param type
	 * @param info
	 * @return
	 * @throws S8IOException
	 */
	public static PalmRepositoryLink create(
			String repositoryAddress, 
			String image, 
			String title, 
			String type, 
			String info) throws S8IOException {
		PalmRepositoryLink repository = new PalmRepositoryLink();
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
	private @S8Field(name = "repository-address") String repositoryAddress;


	/**
	 * 
	 */
	private @S8Field(name = "image") String imageURL;


	/**
	 * title
	 */
	private @S8Field(name = "title") String title;


	/**
	 * type
	 */
	private @S8Field(name = "type") String type;


	/**
	 * info
	 */
	private @S8Field(name = "info") String info;





	/**
	 * S8 constructor
	 */
	public PalmRepositoryLink() {
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
	 * @return
	 */
	public String getRepositoryAddress() {
		return repositoryAddress;
	}




	/**
	 * 
	 * @param address
	 * @throws S8IOException
	 */
	public void setImage(String image) throws S8IOException {
		this.imageURL = image;
		reportFieldUpdate("image");
	}


	/**
	 * 
	 * @return
	 */
	public String getImage() {
		return imageURL;
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
	 * @return
	 */
	public String getTitle() {
		return title;
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
	 * @param type
	 */
	public String getType() {
		return type;
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
	 * @param type
	 */
	public String getInfo() {
		return info;
	}





}
