package com.s8.fwks.palm.components.boxes.b2;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class B2ColumnsStruct extends HTML_S8WebNode {
	
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/boxes/b2/B2ColumnsStruct";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public B2ColumnsStruct(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	


	/**
	 * Columns
	 * @param size
	 */
	public void setColumns(B2Column... columns) {
		vertex.outbound().setObjectListField("columns", columns);
	}
	
	
}
