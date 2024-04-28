
import { WorkspaceGridCard } from "./WorkspaceGridCard.js";




export class CreateWorkspaceGridCard extends WorkspaceGridCard {

    constructor(){
        super();

        this.containerNode.setAttribute("type", "create");

        this.headerNode = document.createElement("div");
        this.headerNode.classList.add("workspace-grid-card-create-header");
        this.headerNode.innerHTML = "+";
        this.containerNode.appendChild(this.headerNode);

        this.bodyNode = document.createElement("div");
        this.bodyNode.classList.add("workspace-grid-card-create-body");
        this.bodyNode.innerHTML = "Create a new project...";
        this.containerNode.appendChild(this.bodyNode);
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