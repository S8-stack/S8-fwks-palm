package com.s8.fwks.palm.components.boxes.paper;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class PaperColumnsStruct extends HTML_S8WebNode {
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/boxes/paper/PaperColumnsStruct";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public PaperColumnsStruct(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	


	/**
	 * Columns
	 * @param size
	 */
	public void setColumns(PaperColumn... columns) {
		vertex.outbound().setObjectListField("columns", columns);
	}
	
	
}
