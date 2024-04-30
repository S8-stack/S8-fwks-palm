package com.s8.fwks.palm.model.user;

import com.s8.api.annotations.S8ObjectType;
import com.s8.core.web.xenon.XeUser;

@S8ObjectType(name = "com.s8.fwks.palm.model.user.PalmUser")
public class PalmUser extends XeUser {

	
	public final static String USERS_TABLE_ID = "USERS";
	
	public PalmUser(String id) {
		super(id);
	}

}
