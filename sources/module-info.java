/**
 * 
 */
/**
 * 
 */
module com.s8.fwks.palm {
	
	
	
	exports com.s8.fwks.palm.model.branch;
	exports com.s8.fwks.palm.model.space;
	
	exports com.s8.fwks.palm.view;
	exports com.s8.fwks.palm.view.branch;
	exports com.s8.fwks.palm.view.repository;
	exports com.s8.fwks.palm.view.workspace;
	
	
	
	/* <components> */
	exports com.s8.fwks.palm.components.boxes.b2;
	exports com.s8.fwks.palm.components.boxes.paper;
	
	
	exports com.s8.fwks.palm.components.breadcrumbs;
	exports com.s8.fwks.palm.components.navbars.top;
	exports com.s8.fwks.palm.components.topbar;
	
	exports com.s8.fwks.palm.components.structs.columns;
	exports com.s8.fwks.palm.components.structs.gs;
	
	exports com.s8.fwks.palm.components.pages.simple;
	
	exports com.s8.fwks.palm.components.workspace.grid;

	/* </components> */
	
	
	requires transitive com.s8.api;
	requires transitive com.s8.pkgs.ui.carbide;
	requires com.s8.pkgs.people;
	
	
}