package com.s8.pkgs.palm.components.boxes.b2;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class B2BoxHeader extends HTML_S8WebNode {
	
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/boxes/b2/B2BoxHeader";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public B2BoxHeader(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	


	/**
	 * 
	 * @param size
	 */
	public void setTitle(String title) {
		vertex.outbound().setStringUTF8Field("title", title);
	}
	
	
	/**
	 * 
	 * @param items
	 */
	public void setElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	
	
}
