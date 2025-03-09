/**
 * 
 */
/**
 * 
 */
open module com.s8.pkgs.palm {
	
	

	/* <model> */
	exports com.s8.pkgs.palm.model.branch;
	exports com.s8.pkgs.palm.model.space;
	exports com.s8.pkgs.palm.model.user;
	/* </model> */
	

	/* <view> */
	exports com.s8.pkgs.palm.view.branch;
	exports com.s8.pkgs.palm.view.repository;
	exports com.s8.pkgs.palm.view.workspace;
	/* </view> */
	
	
	
	/* <components> */
	exports com.s8.pkgs.palm.components.boxes.b2;
	exports com.s8.pkgs.palm.components.boxes.paper;
	
	
	exports com.s8.pkgs.palm.components.breadcrumbs;
	exports com.s8.pkgs.palm.components.navbars.top;
	exports com.s8.pkgs.palm.components.topbar;
	
	exports com.s8.pkgs.palm.components.structs.columns;
	exports com.s8.pkgs.palm.components.structs.gs;
	
	exports com.s8.pkgs.palm.components.list;
	
	exports com.s8.pkgs.palm.components.pages.simple;
	
	exports com.s8.pkgs.palm.components.workspace.grid;

	/* </components> */
	
	
	requires transitive com.s8.api;
	requires transitive com.s8.pkgs.ui.carbide;
	requires transitive com.s8.pkgs.people;
	requires transitive com.s8.core.web.xenon;
	
	
}