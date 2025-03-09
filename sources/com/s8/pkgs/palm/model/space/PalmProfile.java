package com.s8.pkgs.palm.model.space;

import com.s8.api.annotations.S8Field;
import com.s8.api.annotations.S8ObjectType;
import com.s8.api.exceptions.S8IOException;
import com.s8.api.flow.space.objects.SpaceS8Object;


@S8ObjectType(name = "com.s8.fwks.palm.model.space.PalmProfile")
public class PalmProfile extends SpaceS8Object {


	
	@S8Field(name = "name")
	private String name;
	
	
	/**
	 * 
	 * @param name
	 * @throws S8IOException
	 */
	public void setName(String name) throws S8IOException {
		this.name = name;
		reportFieldUpdate("name");
	}
	
	
}
