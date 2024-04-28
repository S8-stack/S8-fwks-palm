

import { WorkspaceGridCard } from './WorkspaceGridCard.js';



export class AccessWorkspaceGridCard extends WorkspaceGridCard {

    constructor() {
        super();

        this.containerNode.setAttribute("type", "access");
     
        /*
        this.picNode = document.createElement("div");
        this.picNode.classList.add("workspace-grid-card-access-image");
        this.containerNode.appendChild(this.picNode);
        */

        this.panelNode = document.createElement("div");
        this.panelNode.classList.add("workspace-grid-card-access-panel");
        this.containerNode.appendChild(this.panelNode);

    }

   
    S8_set_imageURL(path){
        //background-image: url("/S8-pkgs-ui-carbide/collections/grids/pics/turbine-pic.png");
        this.containerNode.style.backgroundImage = `url("${path}")`;
    }
   

    /**
     * 
     * @param {string} value 
     */
    S8_set_panelContent(value) {
        this.panelNode.innerHTML = value;
    }

    /**
     * 
     * @param {string} cards
     */
    S8_set_isSelected(isSelected) {
        if (isSelected) {
            this.containerNode.setAttribute("selected", '');
        }
        else {
            this.containerNode.removeAttribute("selected");
        }
    }

    S8_render() { /* continuous rendering approach... */ }

    S8_dispose() { /* continuous rendering approach... */ }
    
}