package com.s8.fwks.palm.components.pages.simple;

import java.util.List;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.components.PalmWebSources;
import com.s8.pkgs.ui.carbide.modal.box.ModalBox;


/**
 * 
 */
public class SimplePage extends S8WebObject {
	
	
	/**
	 * 
	 */
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/pages/simple/SimplePage";

	
	/**
	 * 
	 * @param front
	 */
	public SimplePage(S8WebFront front) {
		super(front, WEBPATH);
	}

	
	
	/**
	 * 
	 * @param menus
	 */
	public void setElements(List<S8WebObject> elements) {
		vertex.outbound().setObjectListField("elements", elements);
	}
	
	

	/**
	 * 
	 * @param menus
	 */
	public void setModalBox(ModalBox box) {
		vertex.outbound().setObjectField("modalBox", box);
	}
	

	public void publish() {
		vertex.expose(0);
	}
}
