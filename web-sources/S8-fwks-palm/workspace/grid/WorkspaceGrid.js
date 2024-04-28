


import { S8WebFront } from '/S8-pkgs-ui-carbide/S8WebFront.js';

import { WorkspaceGridCard } from './WorkspaceGridCard.js';
import { S8Object } from '/S8-api/S8Object.js';



/**
 * 
 */
S8WebFront.CSS_import('/S8-fwks-palm/workspace/grid/WorkspaceGrid.css');

export class WorkspaceGrid extends S8Object {


    constructor(){
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("workspace-grid-wrapper");

        this.coreNode = document.createElement("div");
        this.coreNode.classList.add("workspace-grid-core");
        this.wrapperNode.appendChild(this.coreNode);

        let _this = this;
        this.wrapperNode.addEventListener("click", function (event) {
            _this.S8_vertex.runVoid("on-click");
            event.stopPropagation();
        }, false);
    }

    S8_render(){ /* continuous rendering approach... */ }

    getEnvelope(){
        return this.wrapperNode;
    }
    

    /**
     * 
     * @param {WorkspaceGridCard[]} cards 
     */
    S8_set_cards(cards){

        /* clear wrapper node content */
       while(this.coreNode.hasChildNodes()){ this.coreNode.removeChild(this.coreNode.lastChild); }
       
       /* append cards */
       cards.forEach(card => this.coreNode.appendChild(card.getEnvelope()));
    }

    S8_dispose(){ /* continuous rendering approach... */ }
}