package com.s8.fwks.palm.view.repository;

import java.util.ArrayList;
import java.util.List;

import com.s8.api.flow.S8AsyncFlow;
import com.s8.api.flow.repository.objects.S8BranchMetadata;
import com.s8.api.flow.repository.objects.S8RepositoryMetadata;
import com.s8.api.flow.repository.requests.CloneBranchS8Request;
import com.s8.api.flow.repository.requests.GetRepositoryMetadataS8Request;
import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.fwks.palm.components.list.AccessStdListRow;
import com.s8.fwks.palm.components.list.StdList;
import com.s8.fwks.palm.components.list.StdListRow;
import com.s8.fwks.palm.components.pages.simple.SimplePage;
import com.s8.fwks.palm.components.structs.gs.GsBody;
import com.s8.fwks.palm.components.structs.gs.GsHeader;
import com.s8.fwks.palm.model.branch.PalmProjectModel;
import com.s8.fwks.palm.view.branch.PalmProjectViewer;
import com.s8.pkgs.ui.carbide.CarbideSize;
import com.s8.pkgs.ui.carbide.breadcrumbs.Breadcrumbs;
import com.s8.pkgs.ui.carbide.breadcrumbs.BreadcrumbsNode;
import com.s8.pkgs.ui.carbide.icons.SVG_CarbideIcon;
import com.s8.pkgs.ui.carbide.navbars.under.UnderlinedNavbar;
import com.s8.pkgs.ui.carbide.navbars.under.UnderlinedNavbarMenu;
import com.s8.pkgs.ui.carbide.topbar.Topbar;
import com.s8.pkgs.ui.carbide.topbar.TopbarIconTextButton;
import com.s8.pkgs.ui.carbide.topbar.TopbarImageButton;

public class RepositoryViewer {


	public final S8WebFront front;

	public final String repositoryAddress;



	private SimplePage page;

	private BreadcrumbsNode nameBreadcrumbsNode2;

	private StdList list;

	/**
	 * 
	 * @param repositoryAddress
	 */
	public RepositoryViewer(S8WebFront front, String repositoryAddress) {
		super();
		this.front = front;
		this.repositoryAddress = repositoryAddress;
	}



	/**
	 * 
	 */
	private void build() {
		if(page == null) {

			page = new SimplePage(front);

			/* <header> */
			GsHeader header = new GsHeader(front);

			/* <topbar> */
			Topbar topbar = new Topbar(front);
			TopbarImageButton imageButton = new TopbarImageButton(front);
			imageButton.setImageURL("/logos/alphaventor-logo.png");




			Breadcrumbs breadcrumbs = new Breadcrumbs(front);
			breadcrumbs.setItems(new BreadcrumbsNode[] {
					BreadcrumbsNode.create(front, SVG_CarbideIcon.home, "Home"),
					nameBreadcrumbsNode2 = BreadcrumbsNode.create(front, SVG_CarbideIcon.repo, "${repository-name}")
			});
			TopbarIconTextButton button1 = TopbarIconTextButton.create(front, SVG_CarbideIcon.sync, "Sync");
			TopbarIconTextButton button2 = TopbarIconTextButton.create(front, SVG_CarbideIcon.save, "Save");


			topbar.setLeftElements(imageButton, breadcrumbs, button1, button2);
			header.setTopbar(topbar);
			/* </topbar> */

			/* <navbar> */
			UnderlinedNavbar navbar = new UnderlinedNavbar(front, CarbideSize.LARGE);

			UnderlinedNavbarMenu repoMenu = new UnderlinedNavbarMenu(front, SVG_CarbideIcon.repo, "Repository");
			UnderlinedNavbarMenu branchesMenu = new UnderlinedNavbarMenu(front, SVG_CarbideIcon.fork, "Branches");
			UnderlinedNavbarMenu collaboratorsMenu = new UnderlinedNavbarMenu(front, SVG_CarbideIcon.person, "Collaborators");
			UnderlinedNavbarMenu actionsMenu = new UnderlinedNavbarMenu(front, SVG_CarbideIcon.play, "Actions");
			UnderlinedNavbarMenu settingsMenu = new UnderlinedNavbarMenu(front, SVG_CarbideIcon.gear, "Settings");

			List<UnderlinedNavbarMenu> navbarMenus = new ArrayList<>();
			navbarMenus.add(repoMenu);
			navbarMenus.add(branchesMenu);
			navbarMenus.add(collaboratorsMenu);
			navbarMenus.add(actionsMenu);
			navbarMenus.add(settingsMenu);
			navbar.setMenus(navbarMenus);
			navbar.setSelectedIndex(1);
			/* </navbar> */

			header.setNavbar(navbar);

			/* </header> */


			GsBody body = new GsBody(front);


			list = new StdList(front);

			List<StdListRow> rows = new ArrayList<>();
			rows.add(AccessStdListRow.create(front, "main", "Modified 3 days ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "dev", "Modified 1h ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "fix#18972", "Modified 3 years ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "feature#12", "Modified 3 days ago | still active | OWNER | LOCKED"));

			rows.add(AccessStdListRow.create(front, "dev2", "Modified 1h ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "fix#18972", "Modified 3 years ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "feature#12", "Modified 3 days ago | still active | OWNER | LOCKED"));

			rows.add(AccessStdListRow.create(front, "dev-CC2", "Modified 1h ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "fix#1897ojoi", "Modified 3 years ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "feature#12", "Modified 3 days ago | still active | OWNER | LOCKED"));

			rows.add(AccessStdListRow.create(front, "dev", "Modified 1h ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "fix#18972", "Modified 3 years ago | still active | OWNER | LOCKED"));
			rows.add(AccessStdListRow.create(front, "feature#12", "Modified 3 days ago | still active | OWNER | LOCKED"));
			list.setRows(rows);

			body.setElements(list);

			List<S8WebObject> pageObjects = new ArrayList<>();
			pageObjects.add(header);
			pageObjects.add(body);
			page.setElements(pageObjects);
		}
	}


	private void refresh(S8RepositoryMetadata repositoryMetadata) {

		nameBreadcrumbsNode2.setText(repositoryMetadata.getName());

		List<StdListRow> rows = new ArrayList<>();

		repositoryMetadata.crawlBranches((branchId, branchMetadata) -> {
			AccessStdListRow row = AccessStdListRow.create(front, branchMetadata.getName(), branchMetadata.getInfo());
			row.onClick(flow2 -> {
				openBranch(flow2, repositoryMetadata, branchId, branchMetadata);
			});
			rows.add(row);
		});
		list.setRows(rows);
	}



	/**
	 * 
	 * @param flow
	 */
	public void view(S8AsyncFlow flow) {

		flow.runBlock(0, () ->{
			build();
		});
		flow.getRepository(new GetRepositoryMetadataS8Request(repositoryAddress) {

			@Override
			public void onSucceed(Status status, S8RepositoryMetadata repositoryMetadata) {

				if(status == Status.OK) {
					refresh(repositoryMetadata);
					page.publish();
				}
				else {
					System.out.println("[Palm/S8RepositoryViewer] failed to display, status: "+status);
				}

			}

			@Override
			public void onFailed(Exception exception) {
				exception.printStackTrace();
			}
		});
		flow.send();
	}





	private void openBranch(S8AsyncFlow flow,
			S8RepositoryMetadata repositoryMetadata,
			String branchId, S8BranchMetadata branchMetadata) {
		/**
		 * 
		 */
		flow.cloneBranch(new CloneBranchS8Request(repositoryAddress, branchId) {

			@Override
			public void onResponse(Status status, Object[] objects) {
				if(status == Status.OK) {

					// offload db
					flow.runBlock(0, () -> {

						/*
						 * retrieve model
						 */
						PalmProjectModel model = (PalmProjectModel) objects[0];

						/*
						 * Create view
						 */
						PalmProjectViewer viewer = model.getViewer(front, repositoryMetadata, branchMetadata);


						/*
						 * issue page
						 */
						viewer.view();

					});
				}
			}

			@Override
			public void onError(Exception exception) {
				exception.printStackTrace();
			}
		});
		
		flow.send();

	}
}
