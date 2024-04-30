package com.s8.fwks.palm.view.workspace;

import com.s8.api.web.S8WebFront;
import com.s8.pkgs.ui.carbide.collections.grids.r2.CreateR2GridCard;
import com.s8.pkgs.ui.carbide.collections.grids.r2.R2Grid;

/*
 * 
 */
public class CreateRepoCardViewer {
	
	
	public final SpaceViewer gridViewer;

	/**
	 * card viewer
	 */
	private CreateR2GridCard cardView;
	
	
	/**
	 * form viewer
	 */
	private CreateRepoFormViewer formViewer = new CreateRepoFormViewer(this);
	
	
	/**
	 * 
	 */
	public CreateRepoCardViewer(SpaceViewer gridViewer) {
		super();
		this.gridViewer = gridViewer;
	}
	
	
	/**
	 * 
	 * @param front
	 * @param gridViewer
	 * @param grid
	 * @return
	 */
	public CreateR2GridCard getView(S8WebFront front, R2Grid grid) {
		if(cardView == null) {
			
			cardView = new CreateR2GridCard(front);
			
			cardView.onClickLambda(() -> {
				
				// unselect other cards
				grid.unselectAllCards();

				// select this one
				cardView.setSelected(true);
				
				// set popover form
				cardView.setPopover(formViewer.getFormView(front, cardView));
			});
		}
		
		// nothing to refresh
		
		return cardView;
	}
	
}
