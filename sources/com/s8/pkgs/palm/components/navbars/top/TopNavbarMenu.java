package com.s8.pkgs.palm.components.navbars.top;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.functions.none.VoidNeFunction;
import com.s8.api.web.lambdas.none.VoidLambda;
import com.s8.pkgs.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.icons.SVG_CarbideIcon;


/**
 * 
 * @author pierreconvert
 *
 */
public class TopNavbarMenu extends S8WebObject {

	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/navbars/top/TopNavbarMenu";
	
	
	/**
	 * 
	 * @param branch
	 */
	public TopNavbarMenu(S8WebFront branch) {
		super(branch, WEBPATH);
	}
	
	
	public TopNavbarMenu(S8WebFront branch, SVG_CarbideIcon icon, String name) {
		super(branch, WEBPATH);
		setIcon(icon);
		setName(name);
		onSelected(() -> {
			System.out.println("I'm selected");
		});
	}
	
	
	/**
	 * 
	 * @param menus
	 */
	public void setIcon(SVG_CarbideIcon icon) {
		vertex.outbound().setUInt16Field("icon", icon.code);
	}
	
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		vertex.outbound().setStringUTF8Field("name", name);
	}
	
	
	
	public void onSelected(VoidLambda lambda) {
		vertex.inbound().setVoidMethodLambda("on-selected", lambda);
	}
	
	
	/**
	 * 
	 * @param function
	 */
	public void onSelectedMethod(VoidNeFunction function) {
		vertex.inbound().setVoidMethod("on-selected", function);
	}
	
}
