package com.s8.pkgs.palm.components.structs.columns;

import com.s8.api.web.S8WebFront;
import com.s8.pkgs.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class ColumnsStruct extends HTML_S8WebNode {
	
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/structs/columns/ColumnsStruct";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public ColumnsStruct(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	


	/**
	 * Columns
	 * @param size
	 */
	public void setColumns(Column... columns) {
		vertex.outbound().setObjectListField("columns", columns);
	}
	
	
}
