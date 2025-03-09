package com.s8.pkgs.palm.view.workspace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.flow.space.requests.AccessSpaceS8Request;
import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.pkgs.palm.components.breadcrumbs.PalmBreadcrumbs;
import com.s8.pkgs.palm.components.breadcrumbs.PalmBreadcrumbsNode;
import com.s8.pkgs.palm.components.navbars.top.TopNavbar;
import com.s8.pkgs.palm.components.navbars.top.TopNavbarMenu;
import com.s8.pkgs.palm.components.pages.simple.SimplePage;
import com.s8.pkgs.palm.components.structs.gs.GsBody;
import com.s8.pkgs.palm.components.structs.gs.GsHeader;
import com.s8.pkgs.palm.components.topbar.Topbar;
import com.s8.pkgs.palm.components.topbar.TopbarIconTextButton;
import com.s8.pkgs.palm.components.topbar.TopbarImageButton;
import com.s8.pkgs.palm.components.workspace.grid.WorkspaceGrid;
import com.s8.pkgs.palm.components.workspace.grid.WorkspaceGridCard;
import com.s8.pkgs.palm.model.space.PalmSpace;
import com.s8.pkgs.people.menu.P8MenuIcon;
import com.s8.pkgs.ui.carbide.CarbideSize;
import com.s8.pkgs.ui.carbide.icons.SVG_CarbideIcon;

/**
 * 
 */
public class PalmWorkspaceViewer {
	
	public final NewProductsFeed feed;
	
	public final S8WebFront front;
	
	
	

	private final Map<String, RepositoryAccessor> accessors = new HashMap<>();

	private boolean isInitialized = false;
	
	private SimplePage page;
	
	private Topbar topbar;
	
	private WorkspaceGrid grid;

	/**
	 * 
	 * @param alphaView
	 */
	public PalmWorkspaceViewer(NewProductsFeed feed, S8WebFront front) {
		super();
		this.feed = feed;
		this.front = front;
	}



	private void initialize() {
		if(!isInitialized) { 
			
			/* <page> */
			page = new SimplePage(front);

			List<S8WebObject> pageObjects = new ArrayList<>();
			
			
			/* <header> */
			GsHeader header = new GsHeader(front);
			
			/* <topbar> */
			topbar = new Topbar(front);
			TopbarImageButton imageButton = new TopbarImageButton(front);
			imageButton.setImageURL("/logos/alphaventor-logo.png");
			
			PalmBreadcrumbs breadcrumbs = new PalmBreadcrumbs(front);
			breadcrumbs.setItems(new PalmBreadcrumbsNode[] {
					PalmBreadcrumbsNode.create(front, SVG_CarbideIcon.home, "Workspace")
			});

			TopbarIconTextButton button1 = TopbarIconTextButton.create(front, SVG_CarbideIcon.sync, "Sync");
			TopbarIconTextButton button2 = TopbarIconTextButton.create(front, SVG_CarbideIcon.save, "Save");

			topbar.setLeftElements(imageButton, breadcrumbs, button1, button2);

			P8MenuIcon p8Menu = P8MenuIcon.create(front);
			topbar.setRightElements(p8Menu);
			
			header.setTopbar(topbar);
			/* </topbar> */
			
			/* <navbar> */

			TopNavbar navbar = new TopNavbar(front, CarbideSize.LARGE);

			TopNavbarMenu branchesMenu = new TopNavbarMenu(front, SVG_CarbideIcon.fork, "Home");
			TopNavbarMenu collaboratorsMenu = new TopNavbarMenu(front, SVG_CarbideIcon.repo, "Repositories");
			TopNavbarMenu actionsMenu = new TopNavbarMenu(front, SVG_CarbideIcon.person, "Team");
			TopNavbarMenu settingsMenu = new TopNavbarMenu(front, SVG_CarbideIcon.gear, "Settings");

			List<TopNavbarMenu> navbarMenus = new ArrayList<>();
			navbarMenus.add(branchesMenu);
			navbarMenus.add(collaboratorsMenu);
			navbarMenus.add(actionsMenu);
			navbarMenus.add(settingsMenu);
			navbar.setMenus(navbarMenus);
			navbar.setSelectedIndex(1);
			
			header.setNavbar(navbar);
			/* </navbar> */
			
			pageObjects.add(header);
			/* </header> */
			
			
			/* <body> */
			GsBody body = new GsBody(front);
			grid = new WorkspaceGrid(front);
			
			body.setElements(grid);
			pageObjects.add(body);
			/* </body> */
			
			page.setElements(pageObjects);
			isInitialized = true;
		}	
	}
	
	
	private void refresh(PalmSpace space) {
		// refresh
		List<WorkspaceGridCard> cardViews = new ArrayList<>();


		/*
		 * Create repo card
		 */
		//cardViews.add(createRepoCardViewer.getView(front, gridView));


		/**
		 * Already existing repositories
		 */
		space.forEachRepository(access -> {
			String repoAddress = access.getRepositoryAddress();
			RepositoryAccessor accessor = accessors.computeIfAbsent(repoAddress, address -> new RepositoryAccessor(this, address));
			accessor.update(front, access);
			cardViews.add(accessor.getView());
		});
		
		
		feed.pull().forEach(creator -> {
			creator.update(front);
			cardViews.add(creator.getView());
		});
		

		grid.setCards(cardViews);	
	}
	
	


	public void view(S8AsyncFlow flow) {
		
		flow.runBlock(0, () -> {
			initialize();
		});

		/* <refresh> */
		flow.accessSpace(new AccessSpaceS8Request(flow.getMySpaceId(), false) {

			@Override
			public void onFailed(Exception exception) {
				exception.printStackTrace();
			}

			@Override
			public void onAccessed(Status status, Object[] objects) {
				if(status == Status.OK) {
					
					/* retrive space */
					PalmSpace space = (PalmSpace) objects[0];
					
					/* refresh space */
					refresh(space);
					
					/* publish */
					page.publish();
				}
				else {
					System.out.println("[WorkspaceViewer] error due to: "+status);
				}
			}
		});
		
		flow.send();
	}
}
