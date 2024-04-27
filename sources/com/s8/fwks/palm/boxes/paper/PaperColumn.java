package com.s8.fwks.palm.boxes.paper;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.PalmWebSources;


/**
 * 
 * @author pierreconvert
 *
 */
public class PaperColumn extends S8WebObject {

	
	/**
	 * 
	 * @param branch
	 */
	public PaperColumn(S8WebFront branch) {
		super(branch, PalmWebSources.ROOT_WEBPATH + "/boxes/paper/PaperColumn");
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
