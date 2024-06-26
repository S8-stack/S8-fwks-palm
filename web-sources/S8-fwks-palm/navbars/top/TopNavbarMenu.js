
import { S8 } from "/S8-api/S8Context.js";
import { S8Object } from "/S8-api/S8Object.js";

import { S8WebFront } from "/S8-pkgs-ui-carbide/S8WebFront.js";
import { TopNavbar } from "./TopNavbar.js";


/**
 * 
 */
S8WebFront.CSS_import('/S8-fwks-palm/navbars/top/TopNavbar.css');


/**
 * 
 */
export class TopNavbarMenu extends S8Object {



    /**
     * @type{TopNavbar}
     */
    navbar;
    

    /**
     * @type{number}
     */
    index;



    constructor(){
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("palm-topnavbar-menu");

        this.labelNode = document.createElement("div");
        this.labelNode.classList.add("palm-topnavbar-menu-label");
        this.wrapperNode.appendChild(this.labelNode);

        this.iconNode = document.createElement("div");
        this.iconNode.classList.add("palm-topnavbar-menu-icon");
        this.labelNode.appendChild(this.iconNode);

        this.nameNode = document.createElement("div");
        this.nameNode.classList.add("palm-topnavbar-menu-name");
        this.labelNode.appendChild(this.nameNode);
        
        this.wrapperNode.setAttribute("selected", "true");

        const _this = this;
        this.wrapperNode.addEventListener("click", function (event) {
            S8.page.loseFocus();
            _this.navbar.select(_this.index);
            _this.S8_vertex.runVoid("on-selected");
            event.stopPropagation();
        }, false);
    }




    /**
     * 
     * @param {boolean} isSelected 
     */
    setSelected(isSelected){
        this.wrapperNode.setAttribute("selected", isSelected ? "true" : "false");
    }

    
    /**
     * 
     * @returns 
     */
    getEnvelope(){
        return this.wrapperNode;
    }


    /**
     * icon
     * @param {*} code 
     */
    S8_set_icon(code){
        S8WebFront.SVG_insertByCode(this.iconNode, code, 16, 16);
    }


    /**
     * name
     * @param {*} name 
     */
    S8_set_name(name){
       this.nameNode.innerHTML = name;
    }

    
    /**
     * 
     */
    S8_render(){
    }


    S8_unfocus(){ /* lose focus by other means */ }

    /**
     * 
     */
    S8_dispose(){
    }


}