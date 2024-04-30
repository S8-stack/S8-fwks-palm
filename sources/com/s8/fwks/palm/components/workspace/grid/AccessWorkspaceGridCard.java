package com.s8.fwks.palm.components.workspace.grid;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.PalmWebSources;


/**
 * 
 * 
 * 
 * @author pierreconvert
 *
 */
public class AccessWorkspaceGridCard extends WorkspaceGridCard {

	
	public static AccessWorkspaceGridCard create(S8WebFront branch, Size size, String imageURL, String panelContent) {
		AccessWorkspaceGridCard card = new AccessWorkspaceGridCard(branch);
		card.setSize(size);
		card.setImageURL(imageURL);
		card.setPanelContent(panelContent);
		return card;
	}
	
	public static AccessWorkspaceGridCard create(S8WebFront branch, Size size, Theme theme, String imageURL, String panelContent) {
		AccessWorkspaceGridCard card = new AccessWorkspaceGridCard(branch);
		card.setSize(size);
		card.setTheme(theme);
		card.setImageURL(imageURL);
		card.setPanelContent(panelContent);
		return card;
	}
	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/workspace/grid/AccessWorkspaceGridCard";
	
	/**
	 * 
	 * @param front
	 */
	public AccessWorkspaceGridCard(S8WebFront front) {
		super(front, WEBPATH);
	}
	
	
	
	/**
	 * 
	 * @param value
	 */
	public void setImageURL(String url) {
		vertex.outbound().setStringUTF8Field("imageURL", url);
	}
	
	
	
	/**
	 * 
	 * @param value
	 */
	public void setPanelContent(String value) {
		vertex.outbound().setStringUTF8Field("panelContent", value);
	}
	
	
}
