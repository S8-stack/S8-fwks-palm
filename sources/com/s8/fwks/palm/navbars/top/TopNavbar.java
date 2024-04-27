package com.s8.fwks.palm.navbars.top;

import java.util.List;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.PalmWebSources;
import com.s8.pkgs.ui.carbide.CarbideSize;
import com.s8.pkgs.ui.carbide.CarbideWebSources;
import com.s8.pkgs.ui.carbide.HTML_S8WebNode;


/**
 * 
 * @author pierreconvert
 *
 */
public class TopNavbar extends HTML_S8WebNode {
	
	
	
	public final static String JS_TYPENAME = "/navbars/top/TopNavbar";
	
	

	
	/**
	 * 
	 * @param front
	 */
	
	public TopNavbar(S8WebFront front) {
		super(front, PalmWebSources.ROOT_WEBPATH + JS_TYPENAME);
	}
	
	
	/**
	 * 
	 * @param front
	 */
	public TopNavbar(S8WebFront front, CarbideSize size) {
		super(front, CarbideWebSources.ROOT_WEBPATH + JS_TYPENAME);
		setSize(size);
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
	 * @param menus
	 */
	public void setSelectedIndex(int index) {
		vertex.outbound().setUInt8Field("selectedIndex", index);
	}
	
	
	/**
	 * 
	 * @param menus
	 */
	public void setMenus(List<TopNavbarMenu> menus) {
		vertex.outbound().setObjectListField("menus", menus);
	}
	
	/**
	 * 
	 * @param menus
	 */
	public void setMenus(TopNavbarMenu... menus) {
		vertex.outbound().setObjectListField("menus", menus);
	}
	
	
	
}
