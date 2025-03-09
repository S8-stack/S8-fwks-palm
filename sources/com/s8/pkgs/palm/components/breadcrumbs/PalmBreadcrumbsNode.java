package com.s8.pkgs.palm.components.breadcrumbs;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.functions.none.VoidNeFunction;
import com.s8.pkgs.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.icons.SVG_CarbideIcon;


/**
 * 
 * @author pierreconvert
 *
 */
public class PalmBreadcrumbsNode extends S8WebObject {
	
	
	public static PalmBreadcrumbsNode create(S8WebFront front, SVG_CarbideIcon icon, String text) {
		PalmBreadcrumbsNode node = new PalmBreadcrumbsNode(front);
		node.setIcon(icon);
		node.setText(text);
		return node;
	}
	
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/breadcrumbs/BreadcrumbsNode";
	
	/**
	 * 
	 * @param front
	 */
	public PalmBreadcrumbsNode(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	
	
	
	
	/**
	 * 
	 * @param items
	 */
	public void setIcon(SVG_CarbideIcon icon) {
		vertex.outbound().setUInt16Field("icon", icon.code);
	}
	
	
	/**
	 * 
	 * @param items
	 */
	public void setText(String text) {
		vertex.outbound().setStringUTF8Field("text", text);
	}


	/**
	 * 
	 * @param function
	 */
	public void onClick(VoidNeFunction function) {
		vertex.inbound().setVoidMethod("on-click", function);
	}
	
	
	
}
