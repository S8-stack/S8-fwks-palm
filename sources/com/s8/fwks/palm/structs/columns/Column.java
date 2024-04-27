package com.s8.fwks.palm.structs.columns;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.PalmWebSources;


/**
 * 
 * @author pierreconvert
 *
 */
public class Column extends S8WebObject {

	
	/**  */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/structs/columns/Column";
	
	
	/**
	 * 
	 * @param branch
	 */
	public Column(S8WebFront branch) {
		super(branch, WEBPATH);
	}
	
	
	
	/**
	 * 
	 * @param name
	 */
	public void setElements(S8WebObject... elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	
	public void setWidth(double width) {
		vertex.outbound().setFloat32Field("width", (float) width);
	}
	
}
