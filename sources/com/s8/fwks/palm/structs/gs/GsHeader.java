package com.s8.fwks.palm.structs.gs;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.PalmWebSources;

/**
 * Github-style header
 */
public class GsHeader extends S8WebObject {
	
	
	/**
	 * header
	 */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/structs/gs/GsHeader";

	
	/**
	 * 
	 * @param front
	 */
	public GsHeader(S8WebFront front) {
		super(front, WEBPATH);
	}

	
	
	/**
	 * 
	 * @param menus
	 */
	public void setTopbar(S8WebObject element) {
		vertex.outbound().setObjectField("topbar", element);
	}
	
	/**
	 * 
	 * @param menus
	 */
	public void setNavbar(S8WebObject element) {
		vertex.outbound().setObjectField("navbar", element);
	}
	

}
