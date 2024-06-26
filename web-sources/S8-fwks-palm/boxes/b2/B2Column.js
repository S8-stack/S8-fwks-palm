


import { forSubComponents } from "/S8-pkgs-ui-carbide/carbide.js";
import { S8 } from "/S8-api/S8Context.js";
import { S8Object } from "/S8-api/S8Object.js";

import { S8WebFront } from "/S8-pkgs-ui-carbide/S8WebFront.js";



S8.page.CSS_import('/S8-fwks-palm/boxes/b2/B2Box.css');


/**
 * 
 */
export class B2Column extends S8Object {

    /** @type {HTMLDivElement} */
    wrapperNode;

    /**
     * 
     */
    constructor() {
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("b2struct-column");

        /*
        this.extensionNode = document.createElement("div");
        this.wrapperNode.appendChild(this.extensionNode);
        */

        this.contentNode = document.createElement("div");
        this.contentNode.classList.add("b2struct-column-content");
        this.wrapperNode.appendChild(this.contentNode);
        

        const _this = this;
        this.wrapperNode.addEventListener("scroll", function(event){  
            forSubComponents(_this, function(object){
                if(object.onScroll){ object.onScroll(event); }
            });
        }, false);
    }


    /**
     * 
     * @returns 
     */
    getEnvelope() {
        return this.wrapperNode;
    }



    /** @returns{S8Object[]} */
    getComponents() {
        return this.elements;
    }


    /** @param {S8Object[]} elements */
    S8_set_elements(elements) {
        this.elements = elements;
        S8WebFront.setS8Elements(this.contentNode, elements);
    }


    /**
     * 
     * @param {string} width 
     */
    S8_set_width(width) {
        if (width == "clear") { /* clear width */
            this.wrapperNode.style.removeProperty("width");
        }
        else {
            this.wrapperNode.style.width = width;
        }
    }


    /** render */
    S8_render() { }


    /** dispose */
    S8_dispose() { }

}