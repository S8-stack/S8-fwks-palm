package com.s8.pkgs.palm.components.topbar;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.palm.components.PalmWebSources;

/**
 * 
 */
public class TopbarImageButton extends S8WebObject {

	
	/**
	 * 
	 */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/topbar/TopbarImageButton";

	
	/**
	 * 
	 * @param front
	 */
	public TopbarImageButton(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	public void setImageURL(String url) {
		vertex.outbound().setStringUTF8Field("imageURL", url);
	}
	
}
