package com.s8.fwks.palm.components.structs.gs;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.components.PalmWebSources;

/**
 * Github-style header
 */
public class GsBody extends S8WebObject {
	
	
	/**
	 * header
	 */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/structs/gs/GsBody";

	
	/**
	 * 
	 * @param front
	 */
	public GsBody(S8WebFront front) {
		super(front, WEBPATH);
	}

	
	
	/**
	 * 
	 * @param menus
	 */
	public void setElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	

}
