
import { S8WebFront } from "/S8-pkgs-ui-carbide/S8WebFront.js";
import { S8Object } from "/S8-api/S8Object.js";




/**
 * 
 */
S8WebFront.CSS_import('/S8-fwks-palm/structs/gs/GsStruct.css');


/**
 * 
 */
export class GsHeader extends S8Object {

    /** @type {HTMLDivElement} */
    wrapperNode;

    /** @type {S8Object[]} */
    topbar = null;


    /** @type {S8Object[]} */
    navbar = null;

    
    /**
     * 
     */
    constructor(){
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("palm-gsheader");
    }


    /**
     * 
     * @returns 
     */
    getEnvelope(){
        return this.wrapperNode;
    }


    /** @param {S8Object} element */
    S8_set_topbar(element){
       this.topbar = element;
       this.refresh();
    }

    /** @param {S8Object} element */
    S8_set_navbar(element){
        this.navbar = element;
        this.refresh();
    }

    /**
     * 
     */
    deselectAll(){
        if(this.elements){ this.elements.forEach(element => element.deselect()); }
    }

    refresh(){
        // clear nodes
        //while(this.wrapperNode.lastChild){ this.wrapperNode.remove(this.wrapperNode.lastChild); }
        S8WebFront.removeChildren(this.wrapperNode);
        if(this.topbar){ this.wrapperNode.appendChild(this.topbar.getEnvelope()); }
        if(this.navbar){ this.wrapperNode.appendChild(this.navbar.getEnvelope()); }
    }

    /**
     * 
     */
    S8_render(){
        this.refresh();
    }


    /**
     * 
     */
    S8_dispose(){
    }


}