package com.s8.fwks.palm.components.breadcrumbs;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.CarbideSize;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class PalmBreadcrumbs extends HTML_S8WebNode {
	
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/breadcrumbs/Breadcrumbs";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public PalmBreadcrumbs(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	


	/**
	 * 
	 * @param size
	 */
	public void setSize(CarbideSize size) {
		vertex.outbound().setUInt8Field("size", size.code);
	}
	
	
	/**
	 * 
	 * @param items
	 */
	public void setItems(PalmBreadcrumbsNode[] items) {
		vertex.outbound().setObjectListField("items", items);
	}
	
	
	
}
