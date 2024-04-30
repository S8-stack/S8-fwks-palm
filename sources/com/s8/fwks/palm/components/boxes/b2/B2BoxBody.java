package com.s8.fwks.palm.components.boxes.b2;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class B2BoxBody extends HTML_S8WebNode {
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/boxes/b2/B2BoxBody";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public B2BoxBody(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	
	
	/**
	 * 
	 * @param items
	 */
	public void setElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	
	
}
