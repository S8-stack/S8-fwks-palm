package com.s8.fwks.palm.topbar;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.PalmWebSources;
import com.s8.pkgs.ui.carbide.icons.SVG_CarbideIcon;

/**
 * 
 */
public class TopbarIconTextButton extends S8WebObject {

	public static TopbarIconTextButton create(S8WebFront front, SVG_CarbideIcon icon, String text) {
		TopbarIconTextButton button = new TopbarIconTextButton(front);
		button.setIcon(icon);
		button.setText(text);
		return button;
	}
	
	
	/**
	 * 
	 */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/topbar/TopbarIconTextButton";

	
	/**
	 * 
	 * @param front
	 */
	public TopbarIconTextButton(S8WebFront front) {
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
	
	
}
