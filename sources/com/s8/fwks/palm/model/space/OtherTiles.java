package com.s8.fwks.palm.model.space;

import static com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Size.LARGE_HORIZONTAL;
import static com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Size.LARGE_SQUARE;
import static com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Size.STANDARD;
import static com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard.Theme.DARK;

import java.util.List;

import com.s8.api.web.S8WebFront;
import com.s8.fwks.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.fwks.palm.components.workspace.grid.CreateWorkspaceGridCard;
import com.s8.fwks.palm.components.workspace.grid.WorkspaceGridCard;

public class OtherTiles {


	public static void build0(S8WebFront front, List<WorkspaceGridCard> cards) {

		String pic0 = "/S8-pkgs-ui-carbide/collections/grids/pics/turbine-pic.png";
		String pic1 = "alpha-hygoose/assets/cards/casing01.png";
		String pic2 = "alpha-hygoose/assets/cards/nano172kg.png";
		String pic3 = "alpha-hygoose/assets/cards/HyGoose-power.png";


		cards.add(CreateWorkspaceGridCard.create(front));

		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0,
				"<h1>Wissous-project</h1><h2>HPLT-geo</h2><p>Wissous-project</p>"));

		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic1,
				"<h1>Project-SuperRevolve65</h1><p>project-SuperRevolve65</p>"));
		cards.add(AccessWorkspaceGridCard.create(front, LARGE_HORIZONTAL, DARK, pic3,
				"<h1>Urban Shuttle project#1</h1><h2>HyGoose ONE</h2><p>project-</p>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic2,
				"<h1>Project-SuperRevolve65"));

		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic2, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, LARGE_SQUARE, pic0,  "<h1>SUper big project!</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic1, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, LARGE_HORIZONTAL, pic2, "<h1>Project-SuperRevolve65</h1>"));

		cards.add(AccessWorkspaceGridCard.create(front, LARGE_SQUARE, pic0, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0, "<h1>Project-SuperRevolve65</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0, "<h1>Project-SuperRevolve65</h1>"));

		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0, "<h1>Project-SuperRevolve65</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic2, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0, "<h1>Project-SuperRevolve65</h1>"));

		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic1, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic0, "<h1>Project-SuperRevolve65</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic1, "<h1>Project-aloftr</h1>"));
		cards.add(AccessWorkspaceGridCard.create(front, STANDARD, pic2, "<h1>Project-SuperRevolve65</h1>"));


	}





}
