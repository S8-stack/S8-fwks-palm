
import { S8WebFront } from "/S8-pkgs-ui-carbide/S8WebFront.js";
import { S8Object } from "/S8-api/S8Object.js";
import { BreadcrumbsNode } from "./BreadcrumbsNode.js";




/**
 * 
 */
S8WebFront.CSS_import('/S8-fwks-palm/breadcrumbs/Breadcrumbs.css');


/**
 * 
 */
export class Breadcrumbs extends S8Object {

    /** @type {HTMLDivElement} */
    wrapperNode;
    
    /**
     * 
     */
    constructor(){
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("palm-breadcrumbs");
    }


    /**
     * 
     * @returns 
     */
    getEnvelope(){
        return this.wrapperNode;
    }


    /** @param {BreadcrumbsNode[]} items */
    S8_set_items(items){
       S8WebFront.setS8Elements(this.wrapperNode, items);
    }


    /** render */
    S8_render(){}


    /** dispose */
    S8_dispose(){}

}