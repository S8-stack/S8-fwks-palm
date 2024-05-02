package com.s8.fwks.palm.components.workspace.grid;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.functions.none.VoidNeFunction;
import com.s8.api.web.lambdas.none.VoidLambda;
import com.s8.pkgs.ui.carbide.popover.Popover;


/**
 * 
 * @author pierreconvert
 *
 */
public class WorkspaceGridCard extends S8WebObject {
	
	public enum Size {
		STANDARD(0), LARGE_HORIZONTAL(1), LARGE_VERTICAL(2), LARGE_SQUARE(3);
		public int code;
		private Size(int code) { this.code = code; }
	}
	
	public enum Theme {
		LIGHT(2), DARK(4);
		public int code;
		private Theme(int code) { this.code = code; }
	}

	
	
	public double priority;
	
	
	/**
	 * 
	 * @param branch
	 * @param typeName
	 */
	public WorkspaceGridCard(S8WebFront branch, String typeName) {
		super(branch, typeName);
	}

	
	/**
	 * 
	 * @param size
	 */
	public void setSize(Size size) {
		vertex.outbound().setUInt8Field("size", size.code);
	}
	
	
	/**
	 * 
	 * @param size
	 */
	public void setTheme(Theme theme) {
		vertex.outbound().setUInt8Field("theme", theme.code);
	}
	

	/**
	 * 
	 * @param name
	 */
	public void setSelected(boolean isSelected) {
		vertex.outbound().setBool8Field("isSelected", isSelected);
	}
	
	
	public void clearPopover() {
		vertex.outbound().setObjectField("popover", null);
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setPopover(Popover popover) {
		vertex.outbound().setObjectField("popover", popover);
	}
	

	
	
	/**
	 * 
	 * @param func
	 */
	public void onClick(VoidNeFunction func) {
		vertex.inbound().setVoidMethod("on-click", func);
	}
	
	

	/**
	 * 
	 * @param func
	 */
	public void onClickLambda(VoidLambda lambda) {
		vertex.inbound().setVoidMethodLambda("on-click", lambda);
	}
	
	
	/**
	 * 
	 * @param size
	 */
	public void setPriority(double priority) {
		vertex.outbound().setFloat32Field("priority", (float) priority);
	}
	
	
}
