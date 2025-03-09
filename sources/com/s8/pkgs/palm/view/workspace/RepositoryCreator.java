package com.s8.pkgs.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.pkgs.palm.components.workspace.grid.AccessWorkspaceGridCard;
import com.s8.pkgs.palm.components.workspace.grid.WorkspaceGridCard;
import com.s8.pkgs.palm.model.space.PalmRepositoryTemplate;

/**
 * 
 */
public class RepositoryCreator extends RepositoryHandler {

	
	public static RepositoryCreator create(String modelId, PalmRepositoryTemplate template,
			WorkspaceGridCard.Size size, WorkspaceGridCard.Theme theme, String imageURL,
			String title, String type, String info) {
		
		
		RepositoryCreator creator = new RepositoryCreator(modelId, template);
		creator.size = size;
		creator.theme = theme;
		creator.imageURL = imageURL;
		creator.title = title;
		creator.type = type;
		creator.info = info;
		return creator;
	}
	
	public static RepositoryCreator create(String modelId,
			WorkspaceGridCard.Size size, WorkspaceGridCard.Theme theme, String imageURL,
			String title, String type, String info) {
		return create(modelId, () -> null, size, theme, imageURL, title, type, info);
	}
	
	
	public @Override String getType() { return "creator"; }
	

	public @Override String getDisplayId() { return modelId; }



	/**
	 * card viewer
	 */
	private AccessWorkspaceGridCard cardView;
	

	/**
	 * 
	 */
	public final String modelId;
	
	public final PalmRepositoryTemplate template;
	
	public WorkspaceGridCard.Size size;
	
	
	public WorkspaceGridCard.Theme theme;
	
	
	
	/**
	 * 
	 */
	public String imageURL;

	
	/**
	 * title
	 */
	public String title;
	
	
	/**
	 * type
	 */
	public String type;
	

	/**
	 * info
	 */
	public String info;

	
	public RepositoryCreator(String modelId, PalmRepositoryTemplate template) {
		super();
		this.modelId = modelId;
		this.template = template;
	}


	private void build(S8WebFront front) {
		/* <initialize> */
		if(cardView == null) {

			cardView = new AccessWorkspaceGridCard(front);
			
			repaint();

			cardView.onClickLambda(() -> {
				System.out.println("[RepositoryCreator] click -> To be implemented");
			});
		}
		/* </initialize> */

	}
	
	
	/**
	 * 
	 * @param front
	 * @param flow
	 */
	private void repaint() {
		cardView.setSize(size);
		cardView.setTheme(theme);
		cardView.setImageURL(imageURL);
		
		
		/* <panel> */
		StringBuilder builder = new StringBuilder();
		if(title != null) { builder.append("<h1>" + title + "</h1>"); }
		if(type != null) { builder.append("<h2>" + type + "</h2>"); }
		if(title != null) { builder.append("<p>" + info + "</p>"); }
		cardView.setPanelContent(builder.toString());
		/* </panel> */
		
		cardView.setPriority(Math.random());
		
	}
	
	public void update(S8WebFront front) {
		build(front);
	}


	@Override
	public WorkspaceGridCard getView() {
		return cardView;
	}



}
