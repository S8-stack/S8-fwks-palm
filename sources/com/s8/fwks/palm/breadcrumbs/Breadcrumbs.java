package com.s8.fwks.palm.breadcrumbs;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.PalmWebSources;
import com.s8.pkgs.ui.carbide.CarbideSize;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class Breadcrumbs extends HTML_S8WebNode {
	
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/breadcrumbs/Breadcrumbs";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public Breadcrumbs(S8WebFront front) {
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
	public void setItems(BreadcrumbsNode[] items) {
		vertex.outbound().setObjectListField("items", items);
	}
	
	
	
}
