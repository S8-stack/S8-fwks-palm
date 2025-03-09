package com.s8.pkgs.palm.components.topbar;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.palm.components.PalmWebSources;

/**
 * Github-style header
 */
public class Topbar extends S8WebObject {
	
	
	/**
	 * 
	 */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/topbar/Topbar";

	
	/**
	 * 
	 * @param front
	 */
	public Topbar(S8WebFront front) {
		super(front, WEBPATH);
	}

	
	
	/**
	 * 
	 * @param menus
	 */
	public void setLeftElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("leftElements", elements);
	}
	
	/**
	 * 
	 * @param menus
	 */
	public void setRightElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("rightElements", elements);
	}
	

}
