package com.s8.fwks.palm.components.workspace.grid;

import java.util.ArrayList;
import java.util.List;

import com.s8.api.web.S8WebFront;
import com.s8.api.web.S8WebObject;
import com.s8.api.web.functions.none.VoidNeFunction;
import com.s8.api.web.lambdas.none.VoidLambda;
import com.s8.fwks.palm.components.PalmWebSources;

/**
 * 
 * @author pierreconvert
 *
 */
public class WorkspaceGrid extends S8WebObject {

	
	
	public final static String WEBPATH = PalmWebSources.ROOT_WEBPATH + "/workspace/grid/WorkspaceGrid";
	
	private List<WorkspaceGridCard> cards = new ArrayList<>();

	public WorkspaceGrid(S8WebFront branch) {
		super(branch, WEBPATH);
		onClickLambda(() -> unselectAllCards());
	}







	public void setCards(List<WorkspaceGridCard> cards) {
		this.cards = cards;
		vertex.outbound().setObjectListField("cards", this.cards);
	}


	/**
	 * 
	 * @return
	 */
	public List<WorkspaceGridCard> getCards(){
		return cards;
	}


	public void unselectAllCards() {
		List<WorkspaceGridCard> cards = getCards();
		if(cards != null) {
			cards.forEach(card -> {
				card.clearPopover();
				card.setSelected(false);
			}); 
		}	
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

}
